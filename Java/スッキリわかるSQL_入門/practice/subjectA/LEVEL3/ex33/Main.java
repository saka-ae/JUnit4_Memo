package practice.subjectA.LEVEL3.ex33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT 口座番号, 名義, '〇' AS 口座区分"	+
							" FROM 口座"								+

							" UNION"									+

							" SELECT 口座番号, 名義, '×' AS 口座区分"	+
							" FROM 廃止口座"							+

							" ORDER BY 名義";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String number	= rs.getString("口座番号");
				String name		= rs.getString("名義");
				String type		= rs.getString("口座区分");

				System.out.printf("%s %s %s\n", number, name, type);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
