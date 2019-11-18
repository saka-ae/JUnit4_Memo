package chap14.リスト14_02;

import chap14.リスト14_01.Account;

public class AccountTest {

	public static void main(String[] args) {
		testInstantiate();
		testTransfer();
	}

	private static void testInstantiate() {
		System.out.println("Instantiate テスト開始");

		String name = "A";
		int num = 100;
		Account account = new Account(name, num);


		String owner = account.getOwner();
		if (!owner.equals(name)) {
			String msg = String.format("failure: expected %s but %s", name, owner);

			System.err.println(msg);
		}

		int balance = account.getBalance();
		if (balance != num) {
			String msg = String.format("failure: expected %d but %d", num, balance);

			System.err.println(msg);
		}

		System.out.println("Instantiate テスト終了");
	}

	private static void testTransfer() {
		System.out.println("Transfer テスト開始");

		String nameA = "A";
		int numA = 100;
		Account accountA = new Account(nameA, numA);

		String nameB = "B";
		int numB = 0;
		Account accountB = new Account(nameB, numB);

		int transferMoney		= 99;
		int expectedA			= accountA.getBalance() - transferMoney;
		int expectedB			= accountB.getBalance() + transferMoney;

		accountA.transfer(accountB, transferMoney);

		int balanceA = accountA.getBalance();
		if (balanceA != expectedA) {
			String msg = String.format("failure: expected %d but %d", expectedA, balanceA);

			System.err.println(msg);
		}

		int balanceB = accountB.getBalance();
		if (balanceB != expectedB) {
			String msg = String.format("failure: expected %d but %d", expectedB, balanceB);

			System.err.println(msg);
		}

		System.out.println("Transfer テスト終了");
	}

}
