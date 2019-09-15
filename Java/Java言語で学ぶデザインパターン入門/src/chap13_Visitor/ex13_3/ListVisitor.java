package chap13_Visitor.ex13_3;

import java.util.Iterator;

import chap13_Visitor.ex13_2.Directory;
import chap13_Visitor.ex13_2.Entry;
import chap13_Visitor.ex13_2.File;
import chap13_Visitor.ex13_2.Visitor;

public class ListVisitor implements Visitor {
	private String _currentDirectory = "";


	@Override
	public void visit(File file) {
		System.out.println(_currentDirectory + "/" + file);
	}

	@Override
	public void visit(Directory directory) {
		System.out.println(_currentDirectory + "/" + directory);

		String parentDirectory = _currentDirectory;
		_currentDirectory += "/" + directory.getName();

		for (Iterator<Entry> it = directory.iterator(); it.hasNext(); ) {
			Entry entry = it.next();
			entry.accept(this);
		}

		_currentDirectory = parentDirectory;
	}

}
