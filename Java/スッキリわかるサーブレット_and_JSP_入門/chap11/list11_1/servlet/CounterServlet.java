package chap11.list11_1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CounterServlet")
public class CounterServlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		Integer count = 0;

		ServletContext application = config.getServletContext();
		application.setAttribute("count", count);

		System.out.println("init()が実行されました");
	}

	public void destroy() {
		System.out.println("destroy()が実行されました");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = this.getServletContext();
		Integer count = (Integer) application.getAttribute("count");

		count++;

		application.setAttribute("count", count);

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>訪問回数を表示</title>");
		out.println("</head>");

		out.println("<body>");
		out.println("<p>訪問回数: ");
		out.println(count);
		out.println("</p>");
		out.println("<a href=\"CounterServlet\">更新</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
