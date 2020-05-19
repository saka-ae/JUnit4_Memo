package chap8.list8_3.servlet;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import chap8.list8_3.model.RegisterUserLogic;
import chap8.list8_3.model.User;

@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {

	private static final String ACTION = "action";
	private static final String ID		= "id";
	private static final String NAME	= "name";
	private static final String PASS	= "pass";

	private static final String DONE_ACTION	= "done";
	private static final String REGISTER_USER = "registerUser";
	private static final String REGISTER_FORM_JSP	 	= "/WEB-INF/jsp/registerForm.jsp";
	private static final String REGISTER_CONFRIM_JSP	= "/WEB-INF/jsp/registerConfirm.jsp";
	private static final String REGISTER_DONE_JSP	 	= "/WEB-INF/jsp/registerDone.jsp";


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath = null;

		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter(ACTION);

		if (Objects.isNull(action)) {
			forwardPath = REGISTER_FORM_JSP;
		} else if (action.equals(DONE_ACTION)) {
			HttpSession session = request.getSession();
			User registerUser = (User) session.getAttribute(REGISTER_USER);

			RegisterUserLogic logic = new RegisterUserLogic();
			logic.execute(registerUser);

			session.removeAttribute(REGISTER_USER);

			forwardPath = REGISTER_DONE_JSP;
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id	= request.getParameter(ID);
		String name	= request.getParameter(NAME);
		String pass	= request.getParameter(PASS);
		User registerUser = new User(id, name, pass);

		HttpSession session = request.getSession();
		session.setAttribute(REGISTER_USER, registerUser);

		RequestDispatcher dispatcher = request.getRequestDispatcher(REGISTER_CONFRIM_JSP);
		dispatcher.forward(request, response);
	}

}
