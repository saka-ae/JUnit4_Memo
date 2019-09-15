package chap4_Factory_Method.sample.idcard;

import chap4_Factory_Method.sample.framework.Product;

public class IDCard extends Product {
	private String _owner;


	IDCard(String owner) {
		_owner = owner;
	}


	@Override
	public void use() {
		System.out.println(_owner + "のカードを使います。");
	}

}
