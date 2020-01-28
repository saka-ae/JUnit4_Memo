package chap07.リスト7_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql = 	"UPDATE 家計簿集計"											+
						" SET 平均 = (	SELECT AVG(出金額) FROM 家計簿アーカイブ"	+
						"				 WHERE 出金額 > 0 AND 費目 = '食費')"	+
						" WHERE 費目 = '食費'";

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
