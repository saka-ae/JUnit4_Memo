package chap8_Abstract_Fatctory.ex8_2.list_factory;

import chap8_Abstract_Fatctory.ex8_2.factory.Factory;
import chap8_Abstract_Fatctory.sample.factory.Item;
import chap8_Abstract_Fatctory.sample.factory.Text;
import chap8_Abstract_Fatctory.sample.list_factory.ListItem;
import chap8_Abstract_Fatctory.sample.list_factory.ListText;

public class ListFactory extends Factory {

	@Override
	public Item createItem(String item) {
		return new ListItem(item);
	}

	@Override
	public Text createText(String title) {
		return new ListText(title);
	}

}
