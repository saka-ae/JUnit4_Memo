package chap07.ex7_2_3_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql = 	"SELECT SUM(SUB.日数) AS 合計日数, COUNT(SUB.車種コード) AS 車種数"	+
						" FROM	(	SELECT	車種コード, SUM(レンタル日数) AS 日数"			+
						"			FROM レンタル"											+
						"			GROUP BY 車種コード"									+
						"		) AS SUB";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int days				= rs.getInt(1);
				int numberOfModels	= rs.getInt(2);

				System.out.printf("%d %d\n", days, numberOfModels);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
