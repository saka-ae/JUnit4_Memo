package chap05.ex5_2;

public class StrongBox<T> {

	private T item;
	private KeyType keyType;
	private int count施行回数;

	public StrongBox(KeyType keyType) {
		this.keyType = keyType;
	}

	public T get() {
		count施行回数++;
		if (count施行回数 < keyType.get必要施行回数())
			return null;

		count施行回数 = 0;

		return item;
	}

	public void put(T obj) {
		this.item = obj;
	}

}
