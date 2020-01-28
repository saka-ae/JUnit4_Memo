package chap04.ex4_1_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT DISTINCT 商品名"			+
							" FROM 注文履歴"		+
							" WHERE 日付 >= '2013-01-01' AND 日付 < '2013-02-01'" +
							" ORDER BY 商品名";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String item = rs.getString("商品名");

				System.out.println(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
