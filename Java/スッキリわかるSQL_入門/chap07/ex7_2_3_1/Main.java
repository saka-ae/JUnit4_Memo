package chap07.ex7_2_3_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql = 	"SELECT	車種コード, SUM(レンタル日数) AS 日数"	+
						" FROM レンタル"								+
						" GROUP BY 車種コード";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String carModelCode	= rs.getString(1);
				int days				= rs.getInt(2);

				System.out.printf("%s %d\n", carModelCode, days);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
