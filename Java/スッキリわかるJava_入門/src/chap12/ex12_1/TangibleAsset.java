package chap12.ex12_1;

public abstract class TangibleAsset {
	private String	_name;
	private int	_price;
	private String	_color;


	public TangibleAsset(String name, int price, String color) {
		_name	= name;
		_price	= price;
		_color	= color;
	}


	public String getName() {
		return _name;
	}

	public int getPrice() {
		return _price;
	}

	public String getColor() {
		return _color;
	}

}