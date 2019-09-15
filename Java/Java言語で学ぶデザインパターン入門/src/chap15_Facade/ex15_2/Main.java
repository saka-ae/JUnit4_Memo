package chap15_Facade.ex15_2;


public class Main {

	public static void main(String[] args) {
		Database database = new Database();

		TextMaker.makeTitleList(database);
	}

}
