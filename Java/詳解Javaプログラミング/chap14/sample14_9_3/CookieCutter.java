package chap14.sample14_9_3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieCutter extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		String html = createHtml(request, response);

		PrintWriter pw = response.getWriter();
		pw.println(html);

		pw.close();
	}


	private String createHtml(HttpServletRequest request, HttpServletResponse response) throws IOException {
		StringBuilder sb = new StringBuilder();

		sb.append("<html>");
		sb.append("<body>");

		if (request.getParameter("setcookie") != null) {
			Cookie cookie = new Cookie("LearningJava", "Cookies!");
			cookie.setMaxAge(3600);

			response.addCookie(cookie);

			sb.append("<h1>Cookie Set...</h1>");
		} else {
			Cookie[] cookies = request.getCookies();

			if (cookies == null)
				sb.append("<h1>No cookies found...</h1>");
			else
				for (int i=0; i < cookies.length; i++) {
					sb.append("<h1>");
					sb.append("Name: ");
					sb.append(cookies[i].getName());
					sb.append("<br>");
					sb.append("Value: ");
					sb.append(cookies[i].getValue());
					sb.append("</h1>");
				}

			sb.append("<p>");
			sb.append("<a href=\"");
			sb.append(request.getRequestURI());
			sb.append("?setcookie=true\">");
			sb.append("Reset the Learning Java cookie.");
			sb.append("</a>");
			sb.append("</p>");
		}

		sb.append("</body>");
		sb.append("</html>");

		return sb.toString();
	}

}
