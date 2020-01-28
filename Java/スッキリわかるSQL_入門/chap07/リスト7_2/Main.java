package chap07.リスト7_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql = 	"SELECT 費目, 出金額 FROM 家計簿"	+
						" WHERE 出金額 = (SELECT MAX(出金額) FROM 家計簿)";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String item		= rs.getString(1);
				int cost		= rs.getInt(2);

				System.out.printf("%s %d\n", item, cost);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
