package chap03.ex3_1_01;

import static chap03.ex3_1_01.Table.*;

public class Main {

	public static void main(String[] args) {
		String sql =	"SELECT * " + NEW_LINE +
						"FROM " + TABLE + NEW_LINE +
						"WHERE " + 列1 + " = 6";

		Table.executeQuery(sql);
	}

}
