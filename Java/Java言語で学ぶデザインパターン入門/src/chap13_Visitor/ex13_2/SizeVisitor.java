package chap13_Visitor.ex13_2;

import java.util.Iterator;

public class SizeVisitor implements Visitor {
	private int _size = 0;


	public int getSize() {
		return _size;
	}


	@Override
	public void visit(File file) {
		_size += file.getSize();
	}

	@Override
	public void visit(Directory directory) {
		int _size = 0;

		for (Iterator<Entry> it = directory.iterator(); it.hasNext(); ) {
			Entry entry = it.next();
			entry.accept(this);
		}
	}

}
