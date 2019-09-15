package chap13_Visitor.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringList implements Acceptor {
	private List<String> _list = new ArrayList<>();


	public void add(String str) {
		_list.add(str);
	}

	public Iterator<String> iterator() {
		return _list.iterator();
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
