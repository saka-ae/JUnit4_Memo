package chap8_Abstract_Fatctory.sample.join_factory;

import chap8_Abstract_Fatctory.sample.factory.Item;
import chap8_Abstract_Fatctory.sample.factory.Text;

public class JoinText extends Text {

	public JoinText(String title) {
		super(title);
	}


	@Override
	public String buildItem() {
		StringBuilder sb = new StringBuilder();

		for (Item item : _items)
			sb.append(item.makeItem());

		return sb.toString();
	}

}
