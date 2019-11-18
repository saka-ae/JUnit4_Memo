package chap01.リスト1_04;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i < 10; i++)
			sb.append(i);
		
		String str = sb.toString();
		System.out.println(str);
	}

}
