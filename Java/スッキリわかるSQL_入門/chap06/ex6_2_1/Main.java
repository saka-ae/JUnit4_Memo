package chap06.ex6_2_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT	COUNT(*) AS 入室中"	+
						" FROM 入退室管理"			+
						" WHERE 退室 IS NULL";

		try (
				Connection conn				= DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt		= conn.prepareStatement(sql);
				ResultSet rs				= pstmt.executeQuery();
		) {
			while (rs.next()) {
				int 入室中 = rs.getInt(1);

				System.out.println(入室中);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
