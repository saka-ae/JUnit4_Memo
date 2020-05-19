package chap10.list10_1.model;

public class LoginLogic {

	public boolean execute(User user) {
		if (user.getPass().equals("1234"))
			return true;
		else
			return false;
	}

}
