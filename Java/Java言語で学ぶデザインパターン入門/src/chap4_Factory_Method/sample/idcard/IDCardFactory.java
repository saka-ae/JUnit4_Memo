package chap4_Factory_Method.sample.idcard;

import java.util.ArrayList;
import java.util.List;

import chap4_Factory_Method.sample.framework.Factory;
import chap4_Factory_Method.sample.framework.Product;

public class IDCardFactory extends Factory {
	private List<Product> _products = new ArrayList<>();


	public List<Product> getProducts() {
		return _products;
	}


	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		_products.add(product);
	}

}
