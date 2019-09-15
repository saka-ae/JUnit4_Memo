package chap13_Visitor.ex13_2;

public class Main {

	public static void main(String[] args) {
		File file1 = new File("file1", 1);
		File file2 = new File("file2", 2);
		File file3 = new File("file3", 3);

		Directory root = new Directory("root");
		root.add(file1);
		root.add(file2);
		root.add(file3);

		int size = root.getSize();
		System.out.println(size);
	}

}
