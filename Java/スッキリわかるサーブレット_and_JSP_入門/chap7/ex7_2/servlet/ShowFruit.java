package chap7.ex7_2.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chap7.ex7_2.bean.Fruit;

@WebServlet("/ShowFruit")
public class ShowFruit extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = "strawberry";
		int price = 700;
		Fruit fruit = new Fruit(name, price);

		request.setAttribute("fruit", fruit);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/show.jsp");
		dispatcher.forward(request, response);
	}

}
