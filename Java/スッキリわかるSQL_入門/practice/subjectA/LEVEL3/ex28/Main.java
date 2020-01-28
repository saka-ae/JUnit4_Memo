package practice.subjectA.LEVEL3.ex28;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT 更新日, 残高"			+
							" FROM 口座"					+
							" WHERE 残高 > 0"				+
							" AND 更新日 IS NOT NULL"		+
							" ORDER BY 残高, 更新日 DESC"	+
							" LIMIT 10"						+
							" OFFSET 10";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int balance	= rs.getInt("残高");
				Date date		= rs.getDate("更新日");

				System.out.printf("%d %s\n", balance, date);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
