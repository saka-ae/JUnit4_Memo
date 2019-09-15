package chap11_Composite.ex11_2;

public abstract class Entry {
	protected Entry _parent;


	@Override
	public String toString() {
		return getName();
	}


	public void printList() {
		printList("");
	}


	public abstract String getName();
	public abstract void printList(String prefix);


	public Entry getParent() {
		return _parent;
	}

	public abstract void setParent(Entry parent);


	public String getFullPath() {
		Entry parent = getParent();

		if (parent == null)
			return "/" + this;


		String path			= parent.getFullPath();
		String fullPath	= path + "/" + this;

		return fullPath;
	}

}
