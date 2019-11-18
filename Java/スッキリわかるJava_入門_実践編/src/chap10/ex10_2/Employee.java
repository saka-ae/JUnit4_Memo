package chap10.ex10_2;

import java.io.Serializable;

public class Employee implements Serializable {

	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name	= name;
		this.age	= age;
	}

}
