package chap14.test;

import chap14.model.Login;
import chap14.model.LoginLogic;

public class LoginLogicTest {

	public static void main(String[] args) {
		testExecute_CorrectLoginInformation();
		testExecute_WrongLoginInformation();
	}


	public static void testExecute_CorrectLoginInformation() {
		Login login = new Login("minato", "1234");
		LoginLogic bo = new LoginLogic();

		boolean result = bo.execute(login);
		if (result)
			System.out.println("testExecute_CorrectLoginInformation: 成功しました");
		else
			System.out.println("testExecute_CorrectLoginInformation: 失敗しました");
	}

	public static void testExecute_WrongLoginInformation() {
		Login login = new Login("minato", "12345");
		LoginLogic bo = new LoginLogic();

		boolean result = bo.execute(login);
		if (result)
			System.out.println("testExecute_WrongLoginInformation: 失敗しました");
		else
			System.out.println("testExecute_WrongLoginInformation: 成功しました");
	}

}
