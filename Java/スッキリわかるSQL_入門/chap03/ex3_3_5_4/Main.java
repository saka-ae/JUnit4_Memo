package chap03.ex3_3_5_4;

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
						" SET " +	総合成績 + " = 'A'" +
						" WHERE " + 法学		+ " >= 80 AND " +
									経済学		+ " >= 80 AND " +
									哲学		+ " >= 80 AND " +
									情報理論	+ " >= 80 AND " +
									外国語		+ " >= 80";

		String sql5 =	"UPDATE " + TABLE +
						" SET "	+	総合成績 + " = 'B'"			+
						" WHERE	" +
									総合成績	+ " IS NULL"	+
						" AND	("								+
									法学		+ " >= 80 OR "	+
									外国語		+ " >= 80"		+
								")"								+
						" AND	("								+
									経済学		+ " >= 80 OR "	+
									哲学		+ " >= 80" 		+
								")";

		String sql6 =	"UPDATE " + TABLE +
				" SET "	+	総合成績 + " = 'D'"			+
				" WHERE	" +
							総合成績	+ " IS NULL"	+
				" AND " +	法学		+ " < 50 AND "	+
							経済学		+ " < 50 AND "	+
							哲学		+ " < 50 AND "	+
							情報理論	+ " < 50 AND "	+
							外国語		+ " < 50 ";

		String sql7 =	"UPDATE " + TABLE +
				" SET "	+	総合成績 + " = 'C'"			+
				" WHERE	" +	総合成績	+ " IS NULL";

		String[] sqlArray = new String[] { sql1, sql2, sql3, sql4, sql5, sql6, sql7 };
		Table.executeUpdates(sqlArray);
	}

}
