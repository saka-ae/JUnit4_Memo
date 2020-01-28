package practice.subjectB.Level2.ex15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT 商品コード, 商品名, 単価"	+
							" FROM 商品"						+
							" WHERE 商品名 LIKE '%コート%'";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String code				= rs.getString("商品コード");
				String name				= rs.getString("商品名");
				int price				= rs.getInt("単価");

				System.out.printf("%s %s %d\n", code, name, price);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
