package chap13_Visitor.ex13_2;

public abstract class Entry implements Acceptor {

	public abstract String getName();
	public abstract int getSize();


	@Override
	public String toString() {
		String str = String.format("%s (%d)", getName(), getSize());

		return str;
	}

}
