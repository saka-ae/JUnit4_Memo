package chap8_Abstract_Fatctory.sample.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Text {
	private String _title;
	protected List<Item> _items = new ArrayList<>();


	public Text(String title) {
		_title = title;
	}


	public void add(Item item) {
		_items.add(item);
	}


	public void output() {
		StringBuilder sb = new StringBuilder();

		sb.append("【" + _title + "】");
		sb.append(System.lineSeparator());

		sb.append(buildItem());

		System.out.println(sb.toString());
	}


	public abstract String buildItem();

}
