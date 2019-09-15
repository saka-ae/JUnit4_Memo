package chap8_Abstract_Fatctory.ex8_2;

import chap8_Abstract_Fatctory.ex8_2.factory.Factory;
import chap8_Abstract_Fatctory.ex8_2.list_factory.ListFactory;
import chap8_Abstract_Fatctory.sample.factory.Text;

public class Main {

	public static void main(String[] args) {
		Factory factory = new ListFactory();

		Text text = factory.createHelloWorld();

		text.output();
	}

}
