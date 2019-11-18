package chap17.リスト17_3;

public class Account {

	private int balance;

	public void setBalance(int balance) {
		if (balance < 0)
			throw new IllegalArgumentException("負の値を残高に設定した");

		this.balance = balance;
	}

}
