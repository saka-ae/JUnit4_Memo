package chap8_Abstract_Fatctory.sample.join_factory;

import chap8_Abstract_Fatctory.sample.factory.Item;

public class JoinItem implements Item {
	private String _item;


	public JoinItem(String item) {
		_item = item;
	}


	@Override
	public String makeItem() {
		return _item;
	}

}
