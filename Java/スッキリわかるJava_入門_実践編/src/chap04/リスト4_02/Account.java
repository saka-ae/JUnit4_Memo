package chap04.リスト4_02;

import java.util.Objects;

public class Account {

	private String accountNo;

	public String getAccountNo() {
		return accountNo.trim();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;

		if (Objects.isNull(obj))
			return false;

		if (!(obj instanceof Account))
			return false;

		Account account = (Account) obj;
		String accountNo		= account.getAccountNo();
		String thisAccountNo	= this.getAccountNo();

		return accountNo.equals(thisAccountNo);
	}

}
