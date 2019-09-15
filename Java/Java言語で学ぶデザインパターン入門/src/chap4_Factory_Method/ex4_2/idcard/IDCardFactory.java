package chap4_Factory_Method.ex4_2.idcard;

import java.util.HashMap;
import java.util.Map;

import chap4_Factory_Method.ex4_2.framework.Factory;
import chap4_Factory_Method.ex4_2.framework.Product;

public class IDCardFactory extends Factory {
	private Map<Integer, Product> _products = new HashMap<>();
	private int _count = 0;


	public Map<Integer, Product> getProducts() {
		return _products;
	}


	@Override
	protected Product createProduct(String owner) {
		_count++;

		return new IDCard(owner, _count);
	}

	@Override
	protected void registerProduct(Product product) {
		int cardNumber = getCardNumber(product);

		_products.put(cardNumber, product);
	}
	private int getCardNumber(Product product) {
		IDCard idCard = (IDCard) product;
		int number = idCard.getNumber();

		return number;
	}

}
