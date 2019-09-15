package chap6_Prototype.sample.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
	private Map<String, Product> showcase = new HashMap<>();


	public void register(String name, Product prototype) {
		showcase.put(name, prototype);
	}


	public Product create(String name) {
		Product product = showcase.get(name);

		return product.createClone();
	}
}
