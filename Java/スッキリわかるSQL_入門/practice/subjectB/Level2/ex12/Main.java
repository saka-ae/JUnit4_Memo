package practice.subjectB.Level2.ex12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT *"		+
							" FROM 商品"	+
							" WHERE 商品区分 <> '1'";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String code				= rs.getString("商品コード");
				String name				= rs.getString("商品名");
				int price				= rs.getInt("単価");
				String type				= rs.getString("商品区分");
				String relatedCode		= rs.getString("関連商品コード");

				System.out.printf("%s %s %d %s %s\n", code, name, price, type, relatedCode);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
