package practice.subjectC.Level3.ex26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT 名称, HP, 状態コード"	+
							" FROM パーティー"			+
							" ORDER BY 状態コード, HP DESC";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String name		= rs.getString("名称");
				int hp			= rs.getInt("HP");
				String state	= rs.getString("状態コード");

				System.out.printf("%s %d %s\n", name, hp, state);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
