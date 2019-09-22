package chap12.ex12_1;

public class Computer extends TangibleAsset {
	private String _makerName;


	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);

		_makerName	= makerName;
	}


	public String getMakerName() {
		return _makerName;
	}

}
