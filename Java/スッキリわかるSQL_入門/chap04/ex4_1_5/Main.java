package chap04.ex4_1_5;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT 日付, 商品名, 単価, 数量, 注文金額"	+
							" FROM 注文履歴"							+
							" WHERE 分類 = '3' AND 数量 >= 2"							+
							" ORDER BY 日付, 数量 DESC";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				Date date			= rs.getDate("日付");
				String item			= rs.getString("商品名");
				int unitPrice		= rs.getInt("単価");
				int num			= rs.getInt("数量");
				int totalPrice	= rs.getInt("注文金額");

				System.out.printf("%s %s %d %d %d\n",
									date, item, unitPrice, num, totalPrice);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
