package chap2_Adapter.ex2_2;

public class Main {

	public static void main(String[] args) {
		FileIO fio = new FileIOProperties();

		fio.readFromFile("file.txt");
		System.out.println(fio.getValue("year"));

		fio.setValue("year", "2000");
		System.out.println(fio.getValue("year"));

		fio.writeToFile("newFile.txt");
	}

}
