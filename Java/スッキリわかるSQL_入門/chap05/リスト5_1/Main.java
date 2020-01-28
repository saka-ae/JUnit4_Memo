package chap05.リスト5_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		=	"SELECT	出金額,"		+
							" 		出金額 + 100,"	+
							"		'SQL'"			+
							" FROM 家計簿";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int 出金額		= rs.getInt("出金額");
				int formula	= rs.getInt("出金額 + 100");
				String str		= rs.getString("'SQL'");

				System.out.printf("%d %d %s\n", 出金額, formula, str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
