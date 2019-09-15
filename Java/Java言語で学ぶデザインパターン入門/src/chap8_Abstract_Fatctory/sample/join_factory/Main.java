package chap8_Abstract_Fatctory.sample.join_factory;

import java.util.Arrays;
import java.util.List;

import chap8_Abstract_Fatctory.sample.factory.Factory;
import chap8_Abstract_Fatctory.sample.factory.Item;
import chap8_Abstract_Fatctory.sample.factory.Text;

public class Main {

	public static void main(String[] args) {
		Factory factory = new JoinFactory();

		Item item1 = factory.createItem("Hello ");
		Item item2 = factory.createItem("world");
		Item item3 = factory.createItem("!");

		Text text = factory.createText("Greeting");


		List<Item> items = Arrays.asList(item1, item2, item3);
		for (Item item : items)
			text.add(item);

		text.output();
	}

}
