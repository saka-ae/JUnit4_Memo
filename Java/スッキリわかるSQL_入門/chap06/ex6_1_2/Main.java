package chap06.ex6_1_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT	SUM(降水量)		AS 年間降水量,"			+
						"		AVG(最高気温)	AS 年間平均最高気温,"	+
						"		AVG(最低気温)	AS 年間平均最低気温"	+
						" FROM 都市別気象観測"							+
						" WHERE 都市名 = '東京'";

		try (
				Connection conn				= DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt		= conn.prepareStatement(sql);
				ResultSet rs				= pstmt.executeQuery();
		) {
			while (rs.next()) {
				int 年間降水量 		= rs.getInt(1);
				int 年間平均最高気温	= rs.getInt(2);
				int 年間平均最低気温	= rs.getInt(3);

				System.out.printf("%d %d %d\n", 年間降水量, 年間平均最高気温, 年間平均最低気温);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
