package chap5.リスト5_04_引数の例_渡す値が1つの場合;

public class Main {

	public static void main(String[] args) {
		hello("Kernighan");
	}


	public static void hello(String name) {
		System.out.println("Hello " + name);
	}

}
