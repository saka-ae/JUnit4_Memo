package practice.subjectB.Level1.ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT 注文番号, 注文枝番, 商品コード"	+
							" FROM 注文";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String orderNumber		= rs.getString("注文番号");
				int branchNumber		= rs.getInt("注文枝番");
				String code				= rs.getString("商品コード");

				System.out.printf("%s-%d %s\n", orderNumber, branchNumber, code);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
