package chap11_Composite.ex11_2;

public class Main {

	public static void main(String[] args) {
		Directory rootDirectory = new Directory("root");
		File rootFile = new File("rootFile");

		rootDirectory.add(rootFile);


		Directory subDirectory = new Directory("sub");
		File subFile = new File("subFile");

		subDirectory.add(subFile);


		rootDirectory.add(subDirectory);

		String fullPath = subFile.getFullPath();
		System.out.println(fullPath);
	}

}
