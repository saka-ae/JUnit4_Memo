package chap14.sample14_9_1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowSession extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		boolean clear = request.getParameter("clear") != null;
		if (clear)
			session.invalidate();
		else {
			String name		= request.getParameter("Name");
			String value	= request.getParameter("Value");

			if (name != null && value != null)
				session.setAttribute(name, value);
		}

		response.setContentType("text/html");

		String html = createHtml(request, session, clear);

		PrintWriter pw = response.getWriter();
		pw.println(html);

		pw.close();
	}


	private String createHtml(HttpServletRequest request, HttpSession session, boolean clear) throws IOException {
		StringBuilder sb = new StringBuilder();

		sb.append("<html>");

		sb.append("<head>");
		sb.append("<title>Show Session</title>");
		sb.append("</head>");

		sb.append("<body>");

		if (clear)
			sb.append("<h1>Session Cleared:</h1>");
		else {
			sb.append("<h1>In this session:</h1>");

			sb.append("<ul>");
			for (Enumeration<String> names = session.getAttributeNames(); names.hasMoreElements(); ) {
				String name = names.nextElement();

				sb.append("<li>");
				sb.append(name);
				sb.append(" = ");
				sb.append(session.getAttribute(name));
				sb.append("</li>");
			}
			sb.append("</ul>");
		}

		sb.append("<p>");
		sb.append("<hr>h1>Add String</h1>");
		sb.append("<form method=\"POST\" action=\"");
		sb.append(request.getRequestURI());
		sb.append("\">");
		sb.append("Name <input name=\"Name\" size=20><br>");
		sb.append("Value <input name=\"Value\" size=20><br>");
		sb.append("<br>");
		sb.append("<input type=\"submit\" value=\"Submit\">");
		sb.append("<input type=\"submit\" name=\"clear\" value=\"Clear\">");
		sb.append("</form");
		sb.append("</p>")
		;
		sb.append("</body>");

		sb.append("</html>");

		return sb.toString();
	}

}
