package chap04.ex4_1_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT 商品名, 単価"	+
							" FROM 注文履歴"		+
							" WHERE 分類 = '1'"		+
							" ORDER BY 単価"		+
							" LIMIT 3";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String item			= rs.getString("商品名");
				int unitPrice		= rs.getInt("単価");

				System.out.printf("%s %d\n", item, unitPrice);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
