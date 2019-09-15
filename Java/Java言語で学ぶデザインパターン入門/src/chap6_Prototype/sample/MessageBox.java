package chap6_Prototype.sample;

import chap6_Prototype.sample.framework.Product;

public class MessageBox extends Product {
	private char _decorateCharacter;


	public MessageBox(char decorateCharacter) {
		_decorateCharacter = decorateCharacter;
	}


	@Override
	public void use(String str) {
		String prefix	= _decorateCharacter + " ";
		String suffix	= " " + _decorateCharacter;

		int length = (prefix + str + suffix).length();

		printDecoratorLine(length);

		System.out.println(prefix + str + suffix);

		printDecoratorLine(length);
	}
	private void printDecoratorLine(int length) {
		for (int i=0; i < length; i++)
			System.out.print(_decorateCharacter);
		System.out.println();
	}

}
