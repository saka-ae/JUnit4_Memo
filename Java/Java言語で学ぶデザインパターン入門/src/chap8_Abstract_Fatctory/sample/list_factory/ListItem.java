package chap8_Abstract_Fatctory.sample.list_factory;

import chap8_Abstract_Fatctory.sample.factory.Item;

public class ListItem implements Item {
	private String _item;


	public ListItem(String item) {
		_item = item;
	}


	@Override
	public String makeItem() {
		return "・" + _item;
	}

}
