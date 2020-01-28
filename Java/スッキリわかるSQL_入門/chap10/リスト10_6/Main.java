package chap10.リスト10_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql1 =	"INSERT INTO 家計簿 (日付,			費目ID,	メモ,	入金額,	出金額)" +
						"	VALUES (		'2013-04-04',	2,		'家賃',	0,		60000);";

		String sql2 = 	"INSERT INTO 家計簿 (日付,			費目ID,	入金額,	出金額)" +
						"	VALUES (		'2013-04-05',	3,		0,		1350);";

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
