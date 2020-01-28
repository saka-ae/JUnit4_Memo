package chap10.リスト10_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql1 =	"CREATE TABLE 家計簿 ("										+
						"	日付	DATE	NOT NULL,"								+
						"	費目ID	INTEGER,"										+
						"	メモ	VARCHAR(100)	DEFAULT '不明' NOT NULL,"		+
						"	入金額	INTEGER			DEFAULT 0 CHECK(入金額 >= 0),"	+
						"	出金額	INTEGER			DEFAULT 0 CHECK(出金額 >= 0)"	+
						")";

		String sql2 = 	"CREATE TABLE 費目 ("			+
						"	ID		INTEGER,"			+
						"	名前	VARCHAR(40) UNIQUE"	+
						")";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				Statement stmt = conn.createStatement();
		) {
			conn.setAutoCommit(false);
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);

			stmt.executeBatch();
			
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
