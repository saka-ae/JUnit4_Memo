package chap03.ex3_1_10;

import static chap03.ex3_1_01.Table.*;

import chap03.ex3_1_01.Table;

public class Main {

	public static void main(String[] args) {
		String sql =	"SELECT * " + NEW_LINE +
						"FROM " + TABLE + NEW_LINE +
						"WHERE " +	列4 + " < 5 OR " + NEW_LINE +
									列3 + " > 35";
		Table.executeQuery(sql);
	}

}
