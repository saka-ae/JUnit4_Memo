package chap9.ex9_2.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chap7.ex7_2.bean.Fruit;

@WebServlet("/ShowFruitChap9_2")
public class ShowFruitChap9_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = "strawberry";
		int price = 700;
		Fruit fruit = new Fruit(name, price);

		ServletContext application = this.getServletContext();
		application.setAttribute("fruit", fruit);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/show_ex9_2.jsp");
		dispatcher.forward(request, response);
	}

}
