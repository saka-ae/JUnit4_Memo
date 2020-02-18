package chap14.sample14_15_1;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class ConLimitFilter implements Filter {

	private int limit;
	private int count;


	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String str = filterConfig.getInitParameter("limit");
		if (Objects.isNull(str))
			throw new ServletException("Missing init parameter: " + limit);

		limit = Integer.parseInt(str);
	}


	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		if (count > limit) {
			HttpServletResponse httpRes = (HttpServletResponse) res;
			httpRes.sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Too Busy.");
		} else {
			++count;
			chain.doFilter(req, res);
			--count;
		}
	}


	@Override
	public void destroy() { }

}
