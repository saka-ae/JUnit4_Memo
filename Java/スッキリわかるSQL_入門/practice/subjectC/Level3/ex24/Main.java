package practice.subjectC.Level3.ex24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT ID, 名称"	+
							" FROM パーティー"	+
							" ORDER BY ID";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String id		= rs.getString("ID");
				String name		= rs.getString("名称");

				System.out.printf("%s %s\n", id, name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
