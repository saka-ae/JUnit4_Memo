package chap11.ex11_2_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql1		= "CREATE INDEX 学籍番号インデックス	ON 学生(学籍番号)";
		String sql2		= "CREATE INDEX 学生名インデックス		ON 学生(名前)";
		String sql3		= "CREATE INDEX 学部IDインデックス		ON 学生(学部ID)";

		String sql4		= "CREATE INDEX 学部名インデックス		ON 学部(名前)";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				Statement stmt = conn.createStatement();
		) {
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			stmt.addBatch(sql4);

			stmt.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
