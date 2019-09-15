package chap13_Visitor.ex13_3;

import chap13_Visitor.ex13_2.Directory;
import chap13_Visitor.ex13_2.File;
import chap13_Visitor.ex13_2.Visitor;

public class Main {

	public static void main(String[] args) {
		File rootFile	= new File("rootFile", 1);
		File file		= new File("file", 2);

		Directory root = new Directory("root");
		root.add(rootFile);

		ListAccepter list = new ListAccepter();
		list.add(root);
		list.add(file);

		Visitor visitor = new ListVisitor();
		list.accept(visitor);
	}

}
