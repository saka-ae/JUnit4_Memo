package chap4_Factory_Method.sample;

import chap4_Factory_Method.sample.framework.Factory;
import chap4_Factory_Method.sample.framework.Product;
import chap4_Factory_Method.sample.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();

		Product cardA = factory.create("A");
		cardA.use();

		factory.create("B");
		factory.create("C");

		IDCardFactory idCardFactory = (IDCardFactory) factory;
		for (Product card : idCardFactory.getProducts())
			card.use();
	}

}
