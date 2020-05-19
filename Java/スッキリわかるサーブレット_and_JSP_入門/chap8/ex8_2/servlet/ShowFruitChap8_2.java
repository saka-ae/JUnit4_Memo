package chap8.ex8_2.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import chap7.ex7_2.bean.Fruit;

@WebServlet("/ShowFruitChap8_2")
public class ShowFruitChap8_2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = "strawberry";
		int price = 700;
		Fruit fruit = new Fruit(name, price);

		HttpSession session = request.getSession();
		session.setAttribute("fruit", fruit);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/show_ex8_2.jsp");
		dispatcher.forward(request, response);
	}

}
