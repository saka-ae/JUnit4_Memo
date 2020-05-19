package chap7.list7_4.model;

import java.io.Serializable;

public class Health implements Serializable {

	private double height;
	private double weight;
	private String bodyType;


	public Health() { }

	public Health(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}


	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}

	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public double getBmi() {
		double h = height / 100;

		return weight / (h * h);
	}

}
