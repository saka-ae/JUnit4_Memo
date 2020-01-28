package chap06.リスト6_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql		= 	"SELECT	費目, SUM(出金額) AS 費目別の出金額合計"	+
							" FROM 家計簿"										+
							" GROUP BY 費目"									+
							" HAVING SUM(出金額)";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String item		= rs.getString("費目");
				int sum		= rs.getInt("費目別の出金額合計");

				System.out.printf("%s %d\n", item, sum);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
