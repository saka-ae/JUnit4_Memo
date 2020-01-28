package chap06.ex6_1_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT	都市名,"							+
						"		AVG(降水量)		AS 年間平均降水量,"	+
						"		MIN(最高気温)	AS MIN最高気温,"	+
						"		MAX(最低気温)	AS MAX最低気温"		+
						" FROM 都市別気象観測"						+
						" GROUP BY 都市名";

		try (
				Connection conn				= DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt		= conn.prepareStatement(sql);
				ResultSet rs				= pstmt.executeQuery();
		) {
			while (rs.next()) {
				String name				= rs.getString(1);
				int 年間平均降水量		= rs.getInt(2);
				int MIN最高気温		= rs.getInt(3);
				int MAX最低気温		= rs.getInt(4);

				System.out.printf("%s %d %d %d\n", name, 年間平均降水量, MIN最高気温, MAX最低気温);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
