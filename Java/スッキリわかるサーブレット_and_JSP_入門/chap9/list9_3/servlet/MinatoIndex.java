package chap9.list9_3.servlet;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chap9.list9_3.model.SiteEV;
import chap9.list9_3.model.SiteEVLogic;

@WebServlet("/MinatoIndex")
public class MinatoIndex extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = this.getServletContext();
		SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");

		if (Objects.isNull(siteEV))
			siteEV = new SiteEV();


		SiteEVLogic siteEVLogic = new SiteEVLogic();

		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		if (Objects.isNull(action))
			;
		else if (action.equals("like"))
			siteEVLogic.like(siteEV);
		else if (action.equals("dislike"))
			siteEVLogic.dislike(siteEV);

		application.setAttribute("siteEV", siteEV);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/minatoIndex.jsp");
		dispatcher.forward(request, response);
	}

}
