package practice.subjectC.Level3.ex25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT 名称, 職業コード"	+
							" FROM パーティー"			+
							" ORDER BY 名称 DESC";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String name		= rs.getString("名称");
				String job		= rs.getString("職業コード");

				System.out.printf("%s %s\n", name, job);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
