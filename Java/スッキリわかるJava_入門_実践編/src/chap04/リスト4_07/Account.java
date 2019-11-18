package chap04.リスト4_07;

public class Account implements Comparable<Account> {

	private int number;

	public int getNumber() {
		return number;
	}

	@Override
	public int compareTo(Account obj) {
		int num		= obj.getNumber();
		int thisNum	= this.getNumber();

		if (num == thisNum)
			return 0;

		return (num < thisNum) ? -1 : 1;
	}

}
