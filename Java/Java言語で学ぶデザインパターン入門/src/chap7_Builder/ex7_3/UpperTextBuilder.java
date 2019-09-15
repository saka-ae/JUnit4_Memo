package chap7_Builder.ex7_3;

import java.util.List;

import chap7_Builder.ex7_2.Builder;

public class UpperTextBuilder extends Builder {
	private String			_title;
	private String			_str;
	private List<String>	_items;

	private StringBuilder _sb = new StringBuilder();


	public UpperTextBuilder(String title, String str, List<String> items) {
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
		_sb.append(_title.toUpperCase());
		_sb.append(']');

		_sb.append(System.lineSeparator());
	}

	@Override
	public void buildString() {
		_sb.append(_str.toUpperCase());

		_sb.append(System.lineSeparator());
	}

	@Override
	public void buildItems() {
		for (String item : _items) {
			_sb.append('・');
			_sb.append(item.toUpperCase());

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
