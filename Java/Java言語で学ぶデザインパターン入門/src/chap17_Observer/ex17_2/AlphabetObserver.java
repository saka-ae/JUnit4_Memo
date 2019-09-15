package chap17_Observer.ex17_2;

import chap17_Observer.sample.NumberGenerator;
import chap17_Observer.sample.Observer;

public class AlphabetObserver implements Observer {
	private static final char	FIRST_CHARACTER		= 'a';
	private static final int		NUMBER_OF_ALPHABETS	= 26;


	@Override
	public String toString() {
		Class	obj			= AlphabetObserver.class;
		String	className	= obj.getName();

		return className;
	}


	@Override
	public void update(NumberGenerator generator) {
		int num = generator.getNumber();

		int		index	= num % NUMBER_OF_ALPHABETS;
		char	ch		= (char) (FIRST_CHARACTER + index);

		System.out.format("%s: %c\n", this, ch);
	}

}
