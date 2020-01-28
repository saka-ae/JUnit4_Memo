package chap11.リスト11_7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql	=	"CREATE VIEW 家計簿4月 AS"				+
						"	SELECT * FROM 家計簿"				+
						"		WHERE	日付 >= '2013-04-01'"	+
						"		AND		日付 <= '2013-04-30'";

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
