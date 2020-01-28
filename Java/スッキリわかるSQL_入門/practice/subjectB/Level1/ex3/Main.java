package practice.subjectB.Level1.ex3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT *"	+
							" FROM 注文";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				Date date				= rs.getDate("注文日");
				String orderNumber		= rs.getString("注文番号");
				int branchNumber		= rs.getInt("注文枝番");
				String code				= rs.getString("商品コード");
				int num				= rs.getInt("数量");
				int discount			= rs.getInt("クーポン割引料");

				System.out.printf("%s %s-%d %s %d %d\n", date, orderNumber, branchNumber, code, num, discount);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
