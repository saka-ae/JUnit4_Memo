package chap11.sample11_01_06;

public class Main {
	
	public static void main(String[] args) {
		Rot13InputStream rot13 = new Rot13InputStream(System.in);
		
		char ch = (char) rot13.read();
		System.out.println(ch);
	}

}
