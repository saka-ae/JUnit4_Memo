package practice.subjectC.Level1.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT ID,	名称,	職業コード,	HP,	MP,	状態コード"	+
							" FROM パーティー";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String id		= rs.getString("ID");
				String name		= rs.getString("名称");
				String job		= rs.getString("職業コード");
				int hp			= rs.getInt("HP");
				int mp			= rs.getInt("MP");
				String state	= rs.getString("状態コード");

				System.out.printf("%s %s %s %d %d %s\n", id, name, job, hp, mp, state);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
