package chap8_Abstract_Fatctory.sample.list_factory;

import chap8_Abstract_Fatctory.sample.factory.Factory;
import chap8_Abstract_Fatctory.sample.factory.Item;
import chap8_Abstract_Fatctory.sample.factory.Text;

public class ListFactory implements Factory {

	@Override
	public Item createItem(String item) {
		return new ListItem(item);
	}

	@Override
	public Text createText(String title) {
		return new ListText(title);
	}

}
