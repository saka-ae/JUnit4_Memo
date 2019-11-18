package chap13.リスト13_03;

import chap13.リスト13_02.Account;
import chap13.リスト13_02.Bank;

@SuppressWarnings("serial")
public class NewAccount extends Account {

	@Override
	public int transfer(Bank bank, Account dest, int amount) {
		return 0;
	}

	@Deprecated
	public void transfer(Account dest, int amount) {
		;
	}

}
