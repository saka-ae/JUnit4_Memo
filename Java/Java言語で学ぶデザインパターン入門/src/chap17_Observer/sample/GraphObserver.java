package chap17_Observer.sample;

public class GraphObserver implements Observer {
	private static final char GRAPH_CHARACTER = '*';

	@Override
	public String toString() {
		Class	obj			= DigitObserver.class;
		String	className	= obj.getName();

		return className;
	}

	@Override
	public void update(NumberGenerator generator) {
		int count = generator.getNumber();

		System.out.print(this + ": ");

		for (int i=0; i < count; i++)
			System.out.print(GRAPH_CHARACTER);

		System.out.println();
	}

}
