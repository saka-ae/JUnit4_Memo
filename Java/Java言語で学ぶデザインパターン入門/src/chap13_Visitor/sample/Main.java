package chap13_Visitor.sample;

public class Main {

	public static void main(String[] args) {
		ListVisitor visitor = new ListVisitor();

		StringList strList = new StringList();
		strList.add("abc");
		strList.add("def");

		strList.accept(visitor);
	}

}
