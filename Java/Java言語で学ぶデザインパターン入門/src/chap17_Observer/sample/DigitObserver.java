package chap17_Observer.sample;

public class DigitObserver implements Observer {

	@Override
	public String toString() {
		Class	obj			= DigitObserver.class;
		String	className	= obj.getName();

		return className;
	}


	@Override
	public void update(NumberGenerator generator) {
		int num = generator.getNumber();

		System.out.format("%s: %d\n", this, num);
	}

}
