package chap1_Iterator.sample;

public interface Iterator<T> {

	boolean hasNext();

	T getElement();
	void next();

}
