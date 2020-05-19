package chap14.test;

import java.util.Objects;

import chap14.dao.AccountDAO;
import chap14.model.Account;
import chap14.model.Login;

public class AccountDAOTest {

	public static void main(String[] args) {
		testFindByLogin_UserIsFound();
		testFindByLogin_WrongPassword();
	}


	public static void testFindByLogin_UserIsFound() {
		Login login = new Login("minato", "1234");
		AccountDAO dao = new AccountDAO();
		Account result = dao.findByLogin(login);

		if (Objects.isNull(result)) {
			System.out.println("testFindByLogin1: 失敗しました");

			return;
		}

		if (	result.getUserId().equals("minato") &&
				result.getPassword().equals("1234") &&
				result.getMail().equals("minato@sukkiri.com") &&
				result.getName().equals("湊 雄輔") &&
				result.getAge() == 23
		) {
			System.out.println("testFindByLogin_UserIsFound: 成功しました");
		} else
			System.out.println("testFindByLogin_UserIsFound: 失敗しました");
	}

	public static void testFindByLogin_WrongPassword() {
		Login login = new Login("minato", "12345");
		AccountDAO dao = new AccountDAO();
		Account result = dao.findByLogin(login);

		if (Objects.isNull(result))
			System.out.println("testFindByLogin_WrongPassword: 成功しました");
		else
			System.out.println("testFindByLogin_WrongPassword: 失敗しました");
	}

}
