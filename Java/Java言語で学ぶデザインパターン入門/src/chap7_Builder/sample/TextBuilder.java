package chap7_Builder.sample;

import java.util.List;

public class TextBuilder implements Builder {
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
	public void makeTitle() {
		_sb.append('[');
		_sb.append(_title);
		_sb.append(']');

		_sb.append(System.lineSeparator());
	}

	@Override
	public void makeString() {
		_sb.append(_str);

		_sb.append(System.lineSeparator());
	}

	@Override
	public void makeItems() {
		for (String item : _items) {
			_sb.append('・');
			_sb.append(item);

			_sb.append(System.lineSeparator());
		}
	}

	@Override
	public void complete() {
		deleteLastLineSeparator();
	}
	private void deleteLastLineSeparator() {
		int lastIndex = _sb.length() - 1;
		_sb.deleteCharAt(lastIndex);
	}

}
