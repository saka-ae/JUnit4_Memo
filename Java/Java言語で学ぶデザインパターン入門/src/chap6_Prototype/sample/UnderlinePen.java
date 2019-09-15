package chap6_Prototype.sample;

import chap6_Prototype.sample.framework.Product;

public class UnderlinePen extends Product {
	private char _underLineCharacter;


	public UnderlinePen(char underLineCharacter) {
		_underLineCharacter = underLineCharacter;
	}


	@Override
	public void use(String str) {
		System.out.println(str);

		for (int i=0; i < str.length(); i++)
			System.out.print(_underLineCharacter);

		System.out.println();
	}

}
