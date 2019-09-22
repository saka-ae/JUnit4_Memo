package chap16.リスト16_07;

import java.io.IOException;
import java.io.Writer;
import java.util.Date;

import javax.servlet.http.*;


@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Date date = new Date();

		Writer w = res.getWriter();
		w.write("<html><body>");
		w.write("Today is " + date.toString());
		w.write("</body></html>");
	}

}
