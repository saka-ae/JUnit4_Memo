package chap10.sample10_08;

public class Main {

	public static void main(String[] args) {
		MessageBoard board = new MessageBoard();

		Student a = new Student();
		Student b = new Student();

		board.addObserver(a);
		board.addObserver(b);

		board.changeMessage("More Homework!");
	}

}
