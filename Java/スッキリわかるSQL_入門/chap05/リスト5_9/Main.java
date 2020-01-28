package chap05.リスト5_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		=	"SELECT	メモ, TRIM (メモ) AS 空白除去したメモ" +
							" FROM 家計簿";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String メモ		= rs.getString("メモ");
				String trimmed	= rs.getString("空白除去したメモ");

				System.out.printf("%s %s\n", メモ, trimmed);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
