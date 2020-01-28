package chap07.リスト7_4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql = 	"SELECT	日付, メモ, 出金額,"												+
						"		(SELECT 合計 FROM 家計簿集計 WHERE 費目 = '食費') AS 過去の合計額"	+
						" FROM 家計簿アーカイブ"													+
						" WHERE 費目 = '食費'";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				Date date		= rs.getDate(1);
				String item		= rs.getString(2);
				int cost		= rs.getInt(3);
				int total		= rs.getInt(4);

				System.out.printf("%s %s %d %d\n", date, item, cost, total);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
