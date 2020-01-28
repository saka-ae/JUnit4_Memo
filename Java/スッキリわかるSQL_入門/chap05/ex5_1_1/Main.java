package chap05.ex5_1_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql1		=	"UPDATE 試験結果"	+
							" SET 午後1 = 平均点 * 4 - 午前 - 午後2 - 論述"	+
							" WHERE 受験者ID = 'SW1046'";
		String sql2		=	"UPDATE 試験結果"	+
							" SET 論述 = 平均点 * 4 - 午前 - 午後1 - 午後2"	+
							" WHERE 受験者ID = 'SW1350'";
		String sql3		=	"UPDATE 試験結果"	+
							" SET 午前 = 平均点 * 4 - 午後1 - 午後2 - 論述"	+
							" WHERE 受験者ID = 'SW1877'";
		String[] sqls = { sql1, sql2, sql3 };

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				Statement stmt = conn.createStatement();
		) {
			for (String sql : sqls)
				stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
