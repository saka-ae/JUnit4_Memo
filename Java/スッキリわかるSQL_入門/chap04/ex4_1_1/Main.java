package chap04.ex4_1_1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT *"			+
							" FROM 注文履歴"	+
							" ORDER BY 注文番号, 注文枝番";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				Date date			= rs.getDate("日付");
				int orderId		= rs.getInt("注文番号");
				int orderBranchId	= rs.getInt("注文枝番");
				String item			= rs.getString("商品名");
				String type			= rs.getString("分類");
				String size			= rs.getString("サイズ");
				int unitPrice		= rs.getInt("単価");
				int num			= rs.getInt("数量");
				int totalPrice	= rs.getInt("注文金額");

				System.out.printf("%s %d %d %s %s %s %d %d %d\n",
						date, orderId, orderBranchId,
						item, type, size,
						unitPrice, num, totalPrice);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
