package chap7.sample7_01_03_1;

import java.util.ArrayList;
import java.util.List;

public class Sheep implements Cloneable {

	List<String> strs = new ArrayList<>();

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return null;
	}

}
