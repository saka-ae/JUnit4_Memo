package chap14.sample14_15_4;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class RequestDefaultsFilter implements Filter {

	private FilterConfig filterConfig;


	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}


	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		WrappedRequest wrappedRequest = new WrappedRequest( (HttpServletRequest) req);

		chain.doFilter(wrappedRequest, res);
	}


	@Override
	public void destroy() { }


	class WrappedRequest extends HttpServletRequestWrapper {

		public WrappedRequest(HttpServletRequest request) {
			super(request);
		}


		@Override
		public String getParameter(String name) {
			String value = super.getParameter(name);

			if (Objects.isNull(value))
				return filterConfig.getInitParameter(name);
			else
				return value;
		}

	}

}
