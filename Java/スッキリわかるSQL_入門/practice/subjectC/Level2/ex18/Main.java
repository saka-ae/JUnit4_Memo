package practice.subjectC.Level2.ex18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT 名称, 状態コード"	+
							" FROM パーティー"		+
							" WHERE 状態コード NOT IN ('00', '09')";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String name		= rs.getString("名称");
				String state	= rs.getString("状態コード");

				System.out.printf("%s %s\n", name, state);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
