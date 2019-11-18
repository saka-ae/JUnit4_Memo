package chap05.ex5_1;

public class StrongBox<T> {

	private T item;

	public T get() {
		return item;
	}

	public void put(T obj) {
		this.item = obj;
	}

}
