package chap14.リスト14_04;

public class Account {

	private String owner;
	private int balance;

	public Account(String owner, int balance) {
		this.owner		= owner;
		this.balance	= balance;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public void transfer(Account dest, int amount) {
		dest.balance	+= amount;
		balance 		-= amount;

		assert this.balance >= 0;
	}

}
