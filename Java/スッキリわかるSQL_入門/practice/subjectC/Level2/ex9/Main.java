package practice.subjectC.Level2.ex9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT ID, 名称, MP"	+
							" FROM パーティー"		+
							" WHERE MP >= 100";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String id		= rs.getString("ID");
				String name		= rs.getString("名称");
				int mp			= rs.getInt("MP");

				System.out.printf("%s %s %d\n", id, name, mp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
