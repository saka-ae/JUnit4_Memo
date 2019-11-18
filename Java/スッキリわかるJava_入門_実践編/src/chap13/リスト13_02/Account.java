package chap13.リスト13_02;

import java.io.Serializable;

import chap13.リスト13_03.NewAccount;

/**
 * 口座クラス。
 * @author 作者名
 * @deprecated 代わりにNewAccountクラスを利用すべき
 * @see NewAccount
 */
public class Account implements Serializable {

	/**
	 * 送金を行うメソッド。
	 * @param bank		送金先銀行
	 * @param dest		送金先口座
	 * @param amount	金額
	 * @return			送金手数料
	 * @exception		java.lang.IllegalArgumentException
	 * 					残高不足のとき
	 */
	public int transfer(Bank bank, Account dest, int amount) {
		return 100;
	}

	/**
	 * 送金を行うメソッド。
	 * このメソッドを呼び出すと、<b>他の</b>口座に送金する。
	 */
	public void transfer(Account dest, int amount) {
		;
	}

}
