package chap5.リスト5_03_mainメソッド以外からメソッドを呼び出す;

public class Main {

	public static void main(String[] args) {
		hello();
	}


	public static void hello() {
		System.out.print("Hello ");
		
		world();
	}

	public static void world() {
		System.out.println("world!");
	}

}
