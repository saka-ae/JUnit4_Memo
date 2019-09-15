package chap8_Abstract_Fatctory.ex8_2.factory;

import chap8_Abstract_Fatctory.sample.factory.Item;
import chap8_Abstract_Fatctory.sample.factory.Text;

public abstract class Factory {

	public abstract Item createItem(String item);
	public abstract Text createText(String title);


	public Text createHelloWorld() {
		Text text = createText("Only hello world");
		Item item = createItem("Hello world!");

		text.add(item);

		return text;
	}

}
