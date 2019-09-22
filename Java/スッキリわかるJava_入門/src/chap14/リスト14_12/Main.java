package chap14.リスト14_12;

public class Main {

	public static void main(String[] args) {
		int i1 = 1;
		Integer intObj = Integer.valueOf(i1);

		int i2 = intObj.intValue();
		System.out.println(i2);
	}

}
