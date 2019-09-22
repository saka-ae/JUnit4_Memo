package chap2.リスト2_07_強制的な型変換;

public class Main {

	public static void main(String[] args) {
		double pi = 3.14;
		System.out.println("pi: " + pi);

		int num = (int) pi;
		System.out.println("(int) pi: " + num);
	}

}
