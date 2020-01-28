package chap09.リスト9_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql1	=	"INSERT INTO 家計簿アーカイブ"	+
						" SELECT * FROM 家計簿 WHERE 日付 > '2013-01-31'";
		String sql2	=	"DELETE FROM 家計簿 WHERE 日付 > '2013-01-31'";

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DriverManager.getConnection(jdbcUrl);
			stmt = conn.createStatement();

			conn.setAutoCommit(false);

			stmt.executeUpdate(sql1);
			stmt.executeUpdate(sql2);

			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();

			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (Objects.nonNull(conn))
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			if (Objects.nonNull(stmt))
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

}
