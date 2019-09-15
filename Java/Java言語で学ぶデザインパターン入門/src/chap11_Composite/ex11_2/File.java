package chap11_Composite.ex11_2;

public class File extends Entry {
	private String _name;


	public File(String name) {
		_name = name;
	}


	@Override
	public String getName() {
		return _name;
	}


	@Override
	public void printList(String prefix) {
		String fileName = prefix + "/" + this;

		System.out.println(fileName);
	}


	public void setParent(Entry parent) {
		super._parent = parent;
	}

}
