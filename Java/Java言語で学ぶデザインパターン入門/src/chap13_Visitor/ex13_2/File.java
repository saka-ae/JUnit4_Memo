package chap13_Visitor.ex13_2;

public class File extends Entry {
	private String	_name;
	private int	_size;


	public File(String name, int size) {
		_name = name;
		_size = size;
	}


	@Override
	public String getName() {
		return _name;
	}

	@Override
	public int getSize() {
		return _size;
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
