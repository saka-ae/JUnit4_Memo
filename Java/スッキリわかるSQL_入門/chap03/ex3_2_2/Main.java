package chap03.ex3_2_2;

import static chap03.ex3_2_1.Table.*;

import chap03.ex3_2_1.Table;

public class Main {

	public static void main(String[] args) {
		String sql =	"SELECT * " +
						"FROM " + TABLE +
						" WHERE " + 都道府県名 + " LIKE '%島%'";
		Table.executeQuery(sql);
	}

}
