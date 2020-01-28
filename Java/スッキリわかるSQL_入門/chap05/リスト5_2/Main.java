package chap05.リスト5_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		=	"SELECT	出金額,"							+
							" 		出金額 + 100 AS 百円増しの出金額"	+
							" FROM 家計簿";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int 出金額		= rs.getInt("出金額");
				int formula	= rs.getInt("百円増しの出金額");

				System.out.printf("%d %d\n", 出金額, formula);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
