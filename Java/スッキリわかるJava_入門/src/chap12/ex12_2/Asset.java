package chap12.ex12_2;

public abstract class Asset {
	private String	_name;
	private int	_price;


	public Asset(String name, int price) {
		_name	= name;
		_price	= price;
	}


	public String getName() {
		return _name;
	}

	public int getPrice() {
		return _price;
	}

}