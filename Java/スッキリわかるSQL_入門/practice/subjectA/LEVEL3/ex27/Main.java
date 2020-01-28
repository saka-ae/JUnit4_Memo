package practice.subjectA.LEVEL3.ex27;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT 更新日"				+
							" FROM 口座"				+
							" WHERE 更新日 IS NOT NULL"	+
							" ORDER BY 更新日"			+
							" LIMIT 10";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				Date date		= rs.getDate("更新日");

				System.out.println(date);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
