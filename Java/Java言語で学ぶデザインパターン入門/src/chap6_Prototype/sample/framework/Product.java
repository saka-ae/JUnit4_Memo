package chap6_Prototype.sample.framework;

public abstract class Product implements Cloneable {

	public abstract void use(String str);


	public Product createClone() {
		Product clone = null;

		try {
			clone = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}

}
