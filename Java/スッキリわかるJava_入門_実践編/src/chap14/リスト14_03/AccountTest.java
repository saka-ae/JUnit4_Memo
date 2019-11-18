package chap14.リスト14_03;

import static org.junit.Assert.*;

import org.junit.Test;

import chap14.リスト14_01.Account;

public class AccountTest {

	@Test
	public void instantiate() {
		String name = "A";
		int num = 100;
		Account sut = new Account(name, num);

		assertEquals(name, sut.getOwner());
		assertEquals(num, sut.getBalance());
	}

	@Test
	public void testTransfer() {
		String nameA = "A";
		int numA = 100;
		Account sutA = new Account(nameA, numA);

		String nameB = "B";
		int numB = 0;
		Account sutB = new Account(nameB, numB);

		int transferMoney		= 99;
		int expectedA			= sutA.getBalance() - transferMoney;
		int expectedB			= sutB.getBalance() + transferMoney;

		sutA.transfer(sutB, transferMoney);

		int actualA = sutA.getBalance();
		assertEquals(expectedA, actualA);

		int actualB = sutB.getBalance();
		assertEquals(expectedB, actualB);
	}

}
