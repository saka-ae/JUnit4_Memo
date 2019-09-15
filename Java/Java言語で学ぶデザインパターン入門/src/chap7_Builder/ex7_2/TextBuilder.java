package chap7_Builder.ex7_2;

import java.util.List;

public class TextBuilder extends Builder {
	private String			_title;
	private String			_str;
	private List<String>	_items;

	private StringBuilder _sb = new StringBuilder();


	public TextBuilder(String title, String str, List<String> items) {
		_title	= title;
		_str	= str;
		_items	= items;
	}


	@Override
	public String toString() {
		return _sb.toString();
	}


	@Override
	public void buildTitle() {
		_sb.append('[');
		_sb.append(_title);
		_sb.append(']');

		_sb.append(System.lineSeparator());
	}

	@Override
	public void buildString() {
		_sb.append(_str);

		_sb.append(System.lineSeparator());
	}

	@Override
	public void buildItems() {
		for (String item : _items) {
			_sb.append('・');
			_sb.append(item);

			_sb.append(System.lineSeparator());
		}
	}

	@Override
	public void buildComplete() {
		deleteLastLineSeparator();
	}
	private void deleteLastLineSeparator() {
		int lastIndex = _sb.length() - 1;
		_sb.deleteCharAt(lastIndex);
	}

}
