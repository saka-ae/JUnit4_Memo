package chap12.ex12_4;

import chap12.ex12_2.Asset;
import chap12.ex12_3.Thing;

public abstract class TangibleAsset extends Asset implements Thing {
	private String		_color;
	private double	_weight;


	public TangibleAsset(String name, int price, String color) {
		super(name, price);

		_color	= color;
	}


	public String getColor() {
		return _color;
	}


	// Thing
	@Override
	public double getWeight() {
		return _weight;
	}

	@Override
	public void setWeight(double weight) {
		_weight = weight;
	}

}