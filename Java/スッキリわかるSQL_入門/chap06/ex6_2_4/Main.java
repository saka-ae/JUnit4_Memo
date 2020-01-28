package chap06.ex6_2_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT	社員名, COUNT(社員名) AS 入室回数"	+
						" FROM 入退室管理"							+
						" GROUP BY 社員名"							+
						" HAVING COUNT(社員名) > 10";

		try (
				Connection conn				= DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt		= conn.prepareStatement(sql);
				ResultSet rs				= pstmt.executeQuery();
		) {
			while (rs.next()) {
				String name		= rs.getString(1);
				int 入室回数	= rs.getInt(2);

				System.out.printf("%s %d\n", name, 入室回数);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
