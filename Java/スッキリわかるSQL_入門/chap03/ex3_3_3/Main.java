package chap03.ex3_3_3;

import static chap03.ex3_3_1.Table.*;

import chap03.ex3_3_1.Table;

public class Main {

	public static void main(String[] args) {
		String sql1 =	"INSERT INTO " + TABLE +
						" VALUES ('S001', '織田 信長', 77, 55, 80, 75, 93, null)";
		String sql2 =	"INSERT INTO " + TABLE +
						" VALUES ('A002', '豊臣 秀吉', 64, 69, 70, 0, 59, null)";
		String sql3 =	"INSERT INTO " + TABLE +
						" VALUES ('E003', '徳川 家康', 80, 83, 85, 90, 79, null)";

		String sql4 =	"UPDATE " + TABLE +
						" SET " +	法学 + " = 85, " +
									哲学 + " = 67" +
						" WHERE " + 学籍番号 + " = 'S001'";

		String[] sqlArray = new String[] { sql1, sql2, sql3, sql4 };
		Table.executeUpdates(sqlArray);
	}

}
