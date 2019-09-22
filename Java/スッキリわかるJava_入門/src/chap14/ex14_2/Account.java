package chap14.ex14_2;

public class Account {
	private String	_accountNumber;
	private int	_balance;


	public String getAccountNumber() {
		return _accountNumber;
	}


	@Override
	public String toString() {
		return String.format("\\%d（口座番号 = %s)", _balance, _accountNumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (!(obj instanceof Account))
			return false;

		Account account = (Account) obj;

		String thisAccountNumber	= _accountNumber.trim();
		String accountNumber		= account.getAccountNumber().trim();

		return thisAccountNumber.equals(accountNumber);
	}

	@Override
	public int hashCode() {
		String thisAccountNumber = _accountNumber.trim();

		return thisAccountNumber.length();
	}

}
