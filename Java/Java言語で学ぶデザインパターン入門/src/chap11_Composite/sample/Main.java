package chap11_Composite.sample;

public class Main {

	public static void main(String[] args) {
		Directory rootDirectory = new Directory("root");
		File rootFile = new File("rootFile");

		rootDirectory.add(rootFile);


		Directory subDirectory = new Directory("sub");
		File subFile = new File("subFile");

		subDirectory.add(subFile);


		rootDirectory.add(subDirectory);

		rootDirectory.printList();
	}

}
