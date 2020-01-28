package chap05.リスト5_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		=	"SELECT	出金額, ROUND(出金額, -2) AS 百円単位の出金額" +
							" FROM 家計簿";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int 出金額				= rs.getInt("出金額");
				int 百円単位の出金額	= rs.getInt("百円単位の出金額");

				System.out.printf("%d %d\n", 出金額, 百円単位の出金額);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
