package chap4_Factory_Method.ex4_2;

import java.util.Map;

import chap4_Factory_Method.ex4_2.framework.Factory;
import chap4_Factory_Method.ex4_2.framework.Product;
import chap4_Factory_Method.ex4_2.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();

		Product cardA = factory.create("A");
		cardA.use();

		factory.create("B");
		factory.create("C");

		IDCardFactory idCardFactory = (IDCardFactory) factory;
		Map<Integer, Product> idCardsMap = idCardFactory.getProducts();

		for (int cardNumber : idCardsMap.keySet()) {
			Product card = idCardsMap.get(cardNumber);

			card.use();
		}
	}

}
