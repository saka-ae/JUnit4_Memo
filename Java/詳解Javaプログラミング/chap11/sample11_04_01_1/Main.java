package chap11.sample11_04_01_1;

public class Main {
	
	public static void main(String[] args) {
		String fileName = "text.txt";
		
		GZip gzip = new GZip();
		gzip.compress(fileName);
	}

}
