package practice.subjectB.Level2.ex16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT 商品コード, 商品区分"	+
							" FROM 商品"					+
							" WHERE 商品区分 IN ('2', '3', '9')";
							//" WHERE 商品区分 <> '1'";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String code		= rs.getString("商品コード");
				String type		= rs.getString("商品区分");

				System.out.printf("%s %s\n", code, type);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
