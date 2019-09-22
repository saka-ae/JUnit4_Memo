package chap12.ex12_2;

public abstract class TangibleAsset extends Asset {
	private String	_color;


	public TangibleAsset(String name, int price, String color) {
		super(name, price);

		_color	= color;
	}


	public String getColor() {
		return _color;
	}

}