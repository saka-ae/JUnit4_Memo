package practice.subjectC.Level1.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT 名称 AS 名前,	HP AS 現在のHP,	MP AS 現在のMP"	+
							" FROM パーティー";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String name		= rs.getString("名称");
				int hp			= rs.getInt("HP");
				int mp			= rs.getInt("MP");

				System.out.printf("%s %d %d\n", name, hp, mp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
