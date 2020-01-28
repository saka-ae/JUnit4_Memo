package chap03.ex3_1_11_2;

import static chap03.ex3_1_01.Table.*;

import chap03.ex3_1_01.Table;

public class Main {

	public static void main(String[] args) {
		String sql =	"SELECT * " + NEW_LINE +
				"FROM " + TABLE + NEW_LINE +
				"WHERE " +	列5 + " >= 60 AND" + NEW_LINE +
							列5 + " <= 79";
		Table.executeQuery(sql);
	}

}
