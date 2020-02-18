package chap14.sample14_9_2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingCart extends HttpServlet {

	private String[] items = new String[] { "itme1", "item2", "item3", "item4" };


	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		int[] purchases = (int []) session.getAttribute("purchases");
		if (purchases == null) {
			purchases = new int[items.length];

			session.setAttribute("purchases", purchases);
		}

		response.setContentType("text/html");

		String html = createHtml(request, session, purchases);

		PrintWriter pw = response.getWriter();
		pw.println(html);

		pw.close();
	}


	private String createHtml(HttpServletRequest request, HttpSession session, int[] purchases) throws IOException {
		StringBuilder sb = new StringBuilder();

		sb.append("<html>");

		sb.append("<head>");
		sb.append("<title>Shopping Cart</title>");
		sb.append("</head>");

		sb.append("<body>");
		if (request.getParameter("checkout") != null)
			sb.append("<h1>Thanks for ordering!</h1>");
		else {
			if (request.getParameter("add") != null) {
				addPurchases(request, purchases);

				sb.append("<h1>Purchase added. Please continue</h1>");
			} else {
				if (request.getParameter("clear") != null)
					for (int i=0; i < purchases.length; i++)
						purchases[i] = 0;

				sb.append("<h1>Please Select Your Items!</h1>");
			}

			doForm(sb, request.getRequestURI());
		}
		showPurchases(sb, purchases);

		return sb.toString();
	}


	private void addPurchases(HttpServletRequest request, int[] purchases) {
		for (int i=0; i < items.length; i++) {
			String added = request.getParameter(items[i]);
			if (added != null && !added.equals(""))
				purchases[i] += Integer.parseInt(added);
		}
	}

	private void doForm(StringBuilder sb, String requestURI) {
		sb.append("<form method=\"POST\" action=\"");
		sb.append(requestURI);
		sb.append("\">");

		for (int i=0; i < items.length; i++) {
			sb.append("Quantity <input name=\"");
			sb.append(items[i]);
			sb.append("\" value=0 size=3> of: ");
			sb.append(items[i]);
			sb.append("<br>");
		}

		sb.append("<p>");
		sb.append("<input type=submit name=add value=\"Add To Cart\">");
		sb.append("<input type=submit name=checkout value=\"Check Out\">");
		sb.append("<input type=submit name=clear value=\"Clear Cart\">");
		sb.append("</form");
		sb.append("</p>");
	}

	private void showPurchases(StringBuilder sb, int[] purchases) {
		sb.append("<hr>");
		sb.append("<h2>Your Shopping Basket</h2>");

		for (int i=0; i < items.length; i++)
			if (purchases[i] != 0) {
				sb.append("<p>");
				sb.append(purchases[i] + " " + items[i]);
				sb.append("</p>");
			}
	}

}
