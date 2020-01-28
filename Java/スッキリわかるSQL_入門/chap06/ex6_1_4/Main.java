package chap06.ex6_1_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT	月,"								+
						"		AVG(降水量)		AS 平均降水量,"		+
						"		AVG(最高気温)	AS 平均最高気温,"	+
						"		AVG(最低気温)	AS 平均最低気温"	+
						" FROM 都市別気象観測"						+
						" GROUP BY 月";

		try (
				Connection conn				= DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt		= conn.prepareStatement(sql);
				ResultSet rs				= pstmt.executeQuery();
		) {
			while (rs.next()) {
				int month			= rs.getInt(1);
				int 平均降水量		= rs.getInt(2);
				int 平均最高気温	= rs.getInt(3);
				int 平均最低気温	= rs.getInt(4);

				System.out.printf("%d %d %d %d\n", month, 平均降水量, 平均最高気温, 平均最低気温);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
