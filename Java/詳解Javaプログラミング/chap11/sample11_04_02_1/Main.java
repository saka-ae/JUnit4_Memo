package chap11.sample11_04_02_1;

public class Main {
	
	public static void main(String[] args) {
		String fileName = "text.txt.gz";
		
		GUnZip gunzip = new GUnZip();
		gunzip.unzip(fileName);
	}

}
