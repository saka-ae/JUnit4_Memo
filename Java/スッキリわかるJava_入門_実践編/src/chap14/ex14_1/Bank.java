package chap14.ex14_1;

import java.util.Objects;

public class Bank {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		if (Objects.isNull(newName))
			throw new NullPointerException();

		if (newName.length() < 3)
			throw new IllegalArgumentException("名前が不正");

		this.name = newName;
	}

}
