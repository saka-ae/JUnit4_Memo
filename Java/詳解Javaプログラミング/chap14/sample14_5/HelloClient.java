package chap14.sample14_5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloClient extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		String str = createHtml();

		PrintWriter pw = response.getWriter();
		pw.println(str);

		pw.close();
	}

	private String createHtml() {
		StringBuilder sb = new StringBuilder();

		sb.append("<html>");

		sb.append("<head>");
		sb.append("<title>Hello Client</title>");
		sb.append("</head>");

		sb.append("<body>");
		sb.append("<h1>Hello Client</h1>");
		sb.append("</body>");

		sb.append("</html>");

		return sb.toString();
	}
}
