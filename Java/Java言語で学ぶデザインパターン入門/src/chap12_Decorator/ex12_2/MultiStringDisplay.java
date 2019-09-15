package chap12_Decorator.ex12_2;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends MultiDisplay {
	private List<String>	_textLIst;
	private int			_length;


	public MultiStringDisplay(String str) {
		_textLIst = new ArrayList<>();
		_textLIst.add(str);

		_length = str.length();
	}


	@Override
	public String getRowText(int row) {
		return _textLIst.get(row);
	}

	@Override
	public int getColumns() {
		return _length;
	}

	@Override
	public int getRows() {
		return _textLIst.size();
	}

	public void add(String str) {
		int length = str.length();
		if (length > _length)
			_length = length;

		_textLIst.add(str);
	}

}
