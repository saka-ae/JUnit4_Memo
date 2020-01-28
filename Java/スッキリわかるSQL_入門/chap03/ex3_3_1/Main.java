package chap03.ex3_3_1;

import static chap03.ex3_3_1.Table.*;

public class Main {

	public static void main(String[] args) {
		String sql =	"SELECT * " +
						"FROM " + TABLE;
		Table.executeQuery(sql);
	}

}
