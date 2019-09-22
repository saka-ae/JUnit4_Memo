package chap10.ex10_3;

import java.util.Objects;

public class Wand {
	private String		_name;
	private double	_power;


	public String getName() {
		return _name;
	}

	public void setName(String name) {
		if (Objects.isNull(name))
			throw new IllegalArgumentException("名前がnull");

		final int lower = 3;
		if (name.length() < lower)
			throw new IllegalArgumentException("名前が短すぎる");

		_name = name;
	}


	public double getPower() {
		return _power;
	}

	public void setPower(double power) {
		final double lower = 0.5;
		if (power < lower)
			throw new IllegalArgumentException("powerが小さすぎる");

		final double upper = 100;
		if (power > upper)
			throw new IllegalArgumentException("powerが大きすぎる");

		_power = power;
	}

}
