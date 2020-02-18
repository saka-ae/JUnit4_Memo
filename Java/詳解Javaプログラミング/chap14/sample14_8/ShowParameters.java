package chap14.sample14_8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowParameters extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		showRequestParameters(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


	private void showRequestParameters(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");

		String html = createHtml(request);

		PrintWriter pw = response.getWriter();
		pw.println(html);

		pw.close();
	}

	private String createHtml(HttpServletRequest request) throws IOException {
		StringBuilder sb = new StringBuilder();

		sb.append("<html>");

		sb.append("<head>");
		sb.append("<title>Show Parameters</title>");
		sb.append("</head>");

		sb.append("<body>");
		sb.append("<h1>Parameters</h1>");

		sb.append("<ul>");

		for (Enumeration<String> e = request.getParameterNames(); e.hasMoreElements(); ) {
			String name		= e.nextElement();
			String value	= request.getParameter(name);

			if (!value.equals("")) {
				sb.append("<li>");
				sb.append(name + " = " + value);
				sb.append("</li>");
			}
		}

		sb.append("</ul>");

		sb.append("<p>");
		sb.append("<form method=\"POST\" action=\"");
		sb.append(request.getRequestURI());
		sb.append("\">");
		sb.append("Field1 <input name=\"Field1\" size=20><br>");
		sb.append("Field2 <input name=\"Field2\" size=20><br>");
		sb.append("<br>");
		sb.append("<input type=\"submit\" value=\"Submit\">");
		sb.append("</form");
		sb.append("</p>")
		;
		sb.append("</body>");

		sb.append("</html>");

		return sb.toString();
	}

}
