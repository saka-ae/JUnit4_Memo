package chap03.ex3_1_12;

import static chap03.ex3_1_01.Table.*;

import chap03.ex3_1_01.Table;

public class Main {

	public static void main(String[] args) {
		String sql =	"SELECT * " + NEW_LINE +
						"FROM " + TABLE + NEW_LINE +
						"WHERE " +	列1 + " IS NULL OR" + NEW_LINE +
									列2 + " IS NULL OR" + NEW_LINE +
									列3 + " IS NULL OR" + NEW_LINE +
									列4 + " IS NULL OR" + NEW_LINE +
									列5 + " IS NULL";
		Table.executeQuery(sql);

	}

}
