package chap01.ex1_1;

public class Main {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 100; i++)
			sb.append(i).append(',');
		
		String str = sb.toString();
		
		String[] strArray = str.split(",");
		
		for (String s : strArray)
			System.out.println(s);
	}

}
