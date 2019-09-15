package chap8_Abstract_Fatctory.sample.list_factory;

import chap8_Abstract_Fatctory.sample.factory.Item;
import chap8_Abstract_Fatctory.sample.factory.Text;

public class ListText extends Text {

	public ListText(String title) {
		super(title);
	}


	@Override
	public String buildItem() {
		StringBuilder sb = new StringBuilder();

		for (Item item : _items) {
			sb.append(item.makeItem());
			sb.append(System.lineSeparator());
		}

		return sb.toString().trim();
	}

}
