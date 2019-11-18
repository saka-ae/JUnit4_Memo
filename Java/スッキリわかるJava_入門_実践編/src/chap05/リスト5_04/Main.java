package chap05.リスト5_04;

public class Main {

	public static void main(String[] args) {
		Pocket<String> pocket = new Pocket<>();

		pocket.put("abc");
		String str = pocket.get();

		System.out.println(str);
	}

}
