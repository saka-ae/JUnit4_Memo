package chap11_Composite.sample;

public abstract class Entry {

	@Override
	public String toString() {
		return getName();
	}


	public void printList() {
		printList("");
	}


	public abstract String getName();

	public abstract void printList(String prefix);

}
