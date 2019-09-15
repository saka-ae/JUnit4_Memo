package chap13_Visitor.ex13_1;

import java.util.Iterator;

import chap13_Visitor.sample.StringList;

public class Main {

	public static void main(String[] args) {
		FileFindVisitor visitor = new FileFindVisitor(".txt");

		StringList strList = new StringList();
		strList.add("abc");
		strList.add("123.txt");

		strList.accept(visitor);

		for (Iterator<String> it = visitor.getFoundFiles(); it.hasNext(); ) {
			String file = it.next();
			System.out.println(file);
		}
	}

}
