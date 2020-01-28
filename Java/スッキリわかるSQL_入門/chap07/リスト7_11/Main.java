package chap07.リスト7_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql = 	"SELECT	SUM(SUB.出金額) AS 出金額合計"				+
						" FROM ( SELECT 日付, 費目, 出金額 FROM 家計簿"		+
						" UNION"											+
						" SELECT 日付, 費目, 出金額 FROM 家計簿アーカイブ"	+
						" WHERE 日付 >= '2013-01-01' AND 日付 <= '2013-01-31') AS SUB";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int totalCost = rs.getInt(1);

				System.out.printf("%d\n", totalCost);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
