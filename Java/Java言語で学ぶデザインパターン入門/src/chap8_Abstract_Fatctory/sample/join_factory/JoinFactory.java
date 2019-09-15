package chap8_Abstract_Fatctory.sample.join_factory;

import chap8_Abstract_Fatctory.sample.factory.Factory;
import chap8_Abstract_Fatctory.sample.factory.Item;
import chap8_Abstract_Fatctory.sample.factory.Text;

public class JoinFactory implements Factory {

	@Override
	public Item createItem(String item) {
		return new JoinItem(item);
	}

	@Override
	public Text createText(String title) {
		return new JoinText(title);
	}

}
