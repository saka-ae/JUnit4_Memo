package chap05.リスト5_11;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		=	"SELECT	* FROM 家計簿" +
							" WHERE SUBSTRING(費目, 1, 3) LIKE '%費'";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				Date date		= rs.getDate("日付");
				String 費目		= rs.getString("費目");
				String メモ		= rs.getString("メモ");
				int 入金額		= rs.getInt("入金額");
				int 出金額		= rs.getInt("出金額");

				System.out.printf("%s %s %s %d %d\n", date, 費目, メモ, 入金額, 出金額);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
