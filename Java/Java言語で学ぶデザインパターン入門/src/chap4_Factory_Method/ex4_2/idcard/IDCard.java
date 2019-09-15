package chap4_Factory_Method.ex4_2.idcard;

import chap4_Factory_Method.ex4_2.framework.Product;

public class IDCard extends Product {
	private String _owner;
	private int _number;


	IDCard(String owner, int number) {
		_owner	= owner;
		_number	= number;
	}


	public int getNumber() {
		return _number;
	}


	@Override
	public void use() {
		System.out.format("%d: %sのカードを使います。\n", _number, _owner);
	}

}
