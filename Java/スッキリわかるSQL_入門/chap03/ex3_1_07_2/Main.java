package chap03.ex3_1_07_2;

import static chap03.ex3_1_01.Table.*;

import chap03.ex3_1_01.Table;

public class Main {

	public static void main(String[] args) {
		String sql =	"SELECT * " + NEW_LINE +
						"FROM " + TABLE + NEW_LINE +
						"WHERE " +	列1 + " = 3 OR " + NEW_LINE +
									列1 + " = 5 OR " + NEW_LINE +
									列1 + " = 7";
		Table.executeQuery(sql);
	}

}
