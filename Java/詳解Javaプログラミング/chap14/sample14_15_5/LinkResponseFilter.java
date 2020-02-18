package chap14.sample14_15_5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Objects;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class LinkResponseFilter implements Filter {

	private FilterConfig filterConfig;


	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}


	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		WrappedResponse wrappedResponse = new WrappedResponse( (HttpServletResponse) res);

		chain.doFilter(req, wrappedResponse);

		wrappedResponse.close();
	}


	@Override
	public void destroy() { }


	class WrappedResponse extends HttpServletResponseWrapper {

		private boolean linkText;
		private PrintWriter client;


		public WrappedResponse(HttpServletResponse response) {
			super(response);
		}


		@Override
		public void setContentType(String mime) {
			super.setContentType(mime);

			if (mime.startsWith("text/html") )
				linkText = true;
		}

		@Override
		public PrintWriter getWriter() throws IOException {
			if (Objects.nonNull(client) )
				return client;

			if (linkText)
				return new LinkWriter(super.getWriter(), new ByteArrayOutputStream());
			else
				return super.getWriter();

		}


		void close() {
			if (Objects.nonNull(client))
				client.close();
		}

	}


	class LinkWriter extends PrintWriter {

		private ByteArrayOutputStream buffer;
		private Writer client;


		LinkWriter(Writer client, ByteArrayOutputStream buffer) {
			super(buffer);

			this.buffer	= buffer;
			this.client	= client;
		}


		@Override
		public void close() {
			try {
				flush();
				client.write(linkText(buffer.toString() ) );
				client.close();
			} catch (IOException e) {
				setError();
			}
		}


		private String linkText(String text) {
			String linkText = text;

			for (Enumeration<String> en = filterConfig.getInitParameterNames(); en.hasMoreElements(); ) {
				String pattern = en.nextElement();
				String value = filterConfig.getInitParameter(pattern);

				String replaced = "<a href=" + value + ">$0</a>";
				linkText = linkText.replaceAll(pattern, replaced);
			}

			return linkText;
		}

	}

}
