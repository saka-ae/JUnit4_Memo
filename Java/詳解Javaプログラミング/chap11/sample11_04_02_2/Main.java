package chap11.sample11_04_02_2;

public class Main {

	public static void main(String[] args) {
		String fileName = "text.txt.zip";

		UnZip unzip = new UnZip();
		unzip.unzip(fileName);
	}

}
