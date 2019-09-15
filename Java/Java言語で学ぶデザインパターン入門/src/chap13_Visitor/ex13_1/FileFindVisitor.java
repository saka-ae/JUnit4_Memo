package chap13_Visitor.ex13_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import chap13_Visitor.sample.StringList;
import chap13_Visitor.sample.Visitor;

public class FileFindVisitor implements Visitor {
	private String			_suffix;
	private List<String>	_files = new ArrayList<>();


	public FileFindVisitor(String suffix) {
		_suffix = suffix;
	}


	@Override
	public void visit(StringList acceptor) {
		for (Iterator<String> it = acceptor.iterator(); it.hasNext(); ) {
			String str = it.next();

			if (str.endsWith(_suffix))
				_files.add(str);
		}
	}


	public Iterator<String> getFoundFiles() {
		return _files.iterator();
	}

}
