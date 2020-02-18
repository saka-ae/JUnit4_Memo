package chap14.sample14_15_2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WaitServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String wait = request.getParameter("time");

		if (Objects.isNull(wait))
			throw new ServletException("Missing parameter: time");

		int waitSec = Integer.parseInt(wait);

		try {
			Thread.sleep(waitSec * 1000);
		} catch (InterruptedException e) {
			throw new ServletException(e);
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>WaitServlet Response</h1></body></html>");

		out.close();
	}


}
