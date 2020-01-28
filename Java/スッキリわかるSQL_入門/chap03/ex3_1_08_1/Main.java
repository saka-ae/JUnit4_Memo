package chap03.ex3_1_08_1;

import static chap03.ex3_1_01.Table.*;

import chap03.ex3_1_01.Table;

public class Main {

	public static void main(String[] args) {
		String sql =	"SELECT * " + NEW_LINE +
						"FROM " + TABLE + NEW_LINE +
						"WHERE " + 列1 + " NOT IN (3, 5, 7)";
		Table.executeQuery(sql);
	}

}
