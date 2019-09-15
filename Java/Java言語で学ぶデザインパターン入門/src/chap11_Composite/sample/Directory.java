package chap11_Composite.sample;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
	private String _name;
	private List<Entry> _directory = new ArrayList<>();


	public Directory(String name) {
		_name = name;
	}


	@Override
	public String getName() {
		return _name;
	}

	public void add(Entry entry) {
		_directory.add(entry);
	}


	@Override
	public void printList(String prefix) {
		String directoryName = prefix + "/" + this;

		System.out.println(directoryName);

		for (Entry entry : _directory)
			entry.printList(directoryName);
	}

}
