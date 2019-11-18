package chap17.リスト17_2;

import org.junit.Test;

import chap17.リスト17_3.Account;

public class AccountTest {

	@Test(expected = IllegalArgumentException.class)
	public void testDeniesNegativeBalanceSet() {
		Account sut = new Account();

		sut.setBalance(-100);
	}

}
