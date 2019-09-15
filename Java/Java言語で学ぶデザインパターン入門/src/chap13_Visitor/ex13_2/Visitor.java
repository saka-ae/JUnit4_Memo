package chap13_Visitor.ex13_2;

public interface Visitor {

	void visit(File file);
	void visit(Directory directory);

}
