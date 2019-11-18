package chap05.リスト5_13;

import chap05.リスト5_04.Pocket;

public class Main {

	public static void main(String[] args) {
		Pocket<Object> pocket = new Pocket<>();

		pocket.put(new Object() {

			private String innerField = "inner";

			@Override
			public String toString() {
				return innerField;
			}

		});

		Object obj = pocket.get();
		System.out.println(obj);
	}

}
