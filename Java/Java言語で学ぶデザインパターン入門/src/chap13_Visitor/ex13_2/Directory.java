package chap13_Visitor.ex13_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {
	private String 		_name;
	private List<Entry>	_directory = new ArrayList<>();


	public Directory(String name) {
		_name = name;
	}


	@Override
	public String getName() {
		return _name;
	}

	@Override
	public int getSize() {
		SizeVisitor visitor = new SizeVisitor();
		this.accept(visitor);

		return visitor.getSize();
	}

	public void add(Entry entry) {
		_directory.add(entry);
	}


	public Iterator<Entry> iterator() {
		return _directory.iterator();
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
