package chap07.リスト7_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql = 	"INSERT INTO 家計簿集計 (費目, 合計, 平均, 回数)"		+
						" SELECT 費目, SUM(出金額), AVG(出金額), 0 FROM 家計簿"	+
						"	WHERE 出金額 > 0 GROUP BY 費目";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
