package practice.subjectA.LEVEL2.ex14;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT *"		+
							" FROM 口座"	+
							" WHERE 種別 <> '1'";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String number	= rs.getString("口座番号");
				String name		= rs.getString("名義");
				String type		= rs.getString("種別");
				int balance	= rs.getInt("残高");
				Date date		= rs.getDate("更新日");

				System.out.printf("%s %s %s %d %s\n", number, name, type, balance, date);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
