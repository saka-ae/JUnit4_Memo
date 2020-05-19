package chap14.model;

import java.util.Objects;

import chap14.dao.AccountDAO;

public class LoginLogic {

	public boolean execute(Login login) {
		AccountDAO dao = new AccountDAO();
		Account account = dao.findByLogin(login);

		return Objects.nonNull(account);
	}

}
