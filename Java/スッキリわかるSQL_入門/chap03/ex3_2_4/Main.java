package chap03.ex3_2_4;

import static chap03.ex3_2_1.Table.*;

import chap03.ex3_2_1.Table;

public class Main {

	public static void main(String[] args) {
		String sql =	"SELECT * " +
						"FROM " + TABLE +
						" WHERE " + 都道府県名 + " = " + 県庁所在地;
		Table.executeQuery(sql);
	}

}
