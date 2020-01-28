package practice.subjectB.Level3.ex27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT DISTINCT 商品コード"	+
							" FROM 注文"					+
							" ORDER BY 商品コード";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String code = rs.getString("商品コード");

				System.out.println(code);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
