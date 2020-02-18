package chap7.sample7_01_03_2;

import java.util.ArrayList;

public class DeepSheep implements Cloneable {

	private ArrayList<String> strs = new ArrayList<>();

	@Override
	public DeepSheep clone() {
		DeepSheep copy;

		try {
			copy = (DeepSheep) super.clone();
			copy.strs = (ArrayList<String>) strs.clone();
		} catch (CloneNotSupportedException e) {
			throw new Error("error");
		}

		return (DeepSheep) copy;
	}

}
