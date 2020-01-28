package practice.subjectC.Level2.ex16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT ID, 名称, HP"	+
							" FROM パーティー"		+
							" WHERE HP BETWEEN 120 AND 160";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String id		= rs.getString("ID");
				String name		= rs.getString("名称");
				int hp			= rs.getInt("HP");

				System.out.printf("%s %s %d\n", id, name, hp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
