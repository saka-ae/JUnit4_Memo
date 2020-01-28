package chap05.リスト5_15;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		=	"SELECT	日付, 費目, COALESCE (メモ, 'メモはNULL') AS メモ, 入金額, 出金額" +
							" FROM 家計簿";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				Date date	= rs.getDate("日付");
				String item	= rs.getString("費目");
				String memo	= rs.getString("メモ");
				int 入金額				= rs.getInt("入金額");
				int 出金額				= rs.getInt("出金額");

				System.out.printf("%s %s %s %d %d\n", date, item, memo, 入金額, 出金額);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
