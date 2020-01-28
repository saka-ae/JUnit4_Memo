package chap10.リスト10_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql1 = 	"ALTER TABLE 家計簿 ADD		関連日 DATE";
		String sql2 = 	"ALTER TABLE 家計簿 DROP	関連日";

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
