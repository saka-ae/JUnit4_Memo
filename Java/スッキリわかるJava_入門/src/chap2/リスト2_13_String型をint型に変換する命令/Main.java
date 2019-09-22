package chap2.リスト2_13_String型をint型に変換する命令;

public class Main {

	public static void main(String[] args) {
		String strNum = "100";

		int num1 = Integer.parseInt(strNum);

		int num2 = num1 + 1;

		System.out.println(num2);
	}
}
