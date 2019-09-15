package chap15_Facade.sample;

import chap15_Facade.sample.text_maker.Database;
import chap15_Facade.sample.text_maker.TextMaker;

public class Main {

	public static void main(String[] args) {
		Database database = new Database();

		TextMaker.makeText("Java言語で学ぶデザインパターン入門", database);
	}

}
