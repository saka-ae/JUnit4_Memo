package chap14.リスト14_05;

public class Main {

	public static void main(String[] args) {
		System.out.println("アサーションエラーを起こす");

		assert 1 == 0;

		System.out.println("正常終了");
	}

}
