package chap07.リスト7_01;

public class Main {
	
	public static void main(String[] args) {
		boolean error = true;
		
		if (error) {
			System.out.println("エラーのため異常終了");
			
			System.exit(1);
		}
		
		System.out.println("正常終了");
	}

}
