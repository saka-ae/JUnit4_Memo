package chap05.リスト5_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		=	"SELECT	メモ, LENGTH (メモ) AS メモの長さ"	+
							" FROM 家計簿"								+
							" WHERE LENGTH (メモ) <= 10";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String メモ		= rs.getString("メモ");
				int length		= rs.getInt("メモの長さ");

				System.out.printf("%s %d\n", メモ, length);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
