package chap8_Abstract_Fatctory.sample;

import java.util.Arrays;
import java.util.List;

import chap8_Abstract_Fatctory.sample.factory.Factory;
import chap8_Abstract_Fatctory.sample.factory.Item;
import chap8_Abstract_Fatctory.sample.factory.Text;
import chap8_Abstract_Fatctory.sample.list_factory.ListFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new ListFactory();

		Item item1 = factory.createItem("Good Morning");
		Item item2 = factory.createItem("Good Afternoon");
		Item item3 = factory.createItem("Good evening");

		Text text = factory.createText("Greeting");


		List<Item> items = Arrays.asList(item1, item2, item3);
		for (Item item : items)
			text.add(item);

		text.output();
	}

}
