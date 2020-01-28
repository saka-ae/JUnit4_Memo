package chap11.リスト11_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"INSERT INTO 費目 (ID, 名前)"						+
						"	VALUES ("										+
						"		( SELECT NEXT VALUE FOR 費目シーケンス ),"	+
						"		'接待交際費'"								+
						"	)";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				Statement stmt = conn.createStatement();
		) {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
