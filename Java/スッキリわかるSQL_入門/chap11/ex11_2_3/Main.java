package chap11.ex11_2_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql1		=	"CREATE SEQUENCE ISTD";
		String sql2		=	"INSERT INTO 学生"	+
							" VALUES ('B1101022', '古島 進', '1993-02-12', 'A', 'K', ( SELECT NEXT VALUE FOR ISTD ))";

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
