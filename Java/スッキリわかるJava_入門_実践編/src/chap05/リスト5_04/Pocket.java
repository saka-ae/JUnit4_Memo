package chap05.リスト5_04;

public class Pocket<E> {

	private E data;

	public E get() {
		return data;
	}

	public void put(E data) {
		this.data = data;
	}

}
