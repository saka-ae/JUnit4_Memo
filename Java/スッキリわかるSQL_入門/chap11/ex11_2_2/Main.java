package chap11.ex11_2_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql	=	"CREATE VIEW 学生情報 AS"												+
						"	SELECT 学籍番号, 学生.名前, 生年月日, 学部.名前 AS 学部名, 血液型"	+
						"		FROM 学生"														+
						"	JOIN 学部"															+
						"		ON 学部ID = ID";

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
