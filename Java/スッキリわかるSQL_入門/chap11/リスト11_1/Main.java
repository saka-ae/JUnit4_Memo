package chap11.リスト11_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql1		= "CREATE INDEX 費目IDインデックス	ON 家計簿(費目ID)";
		String sql2		= "CREATE INDEX メモインデックス	ON 家計簿(メモ)";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				Statement stmt = conn.createStatement();
		) {
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);

			stmt.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
