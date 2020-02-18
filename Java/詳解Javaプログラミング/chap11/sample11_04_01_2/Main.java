package chap11.sample11_04_01_2;

public class Main {

	public static void main(String[] args) {
		String fileName = "text.txt";

		Zip zip = new Zip();
		zip.compress(fileName);
	}

}
