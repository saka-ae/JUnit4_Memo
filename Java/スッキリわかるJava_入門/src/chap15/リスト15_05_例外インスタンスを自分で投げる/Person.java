package chap15.リスト15_05_例外インスタンスを自分で投げる;

public class Person {
	private int _age;


	public void setAge(int age) {
		if (age < 0)
			throw new IllegalArgumentException("年齢は正数を指定すべき。指定値 = " + age);

		this._age = age;
	}

}
