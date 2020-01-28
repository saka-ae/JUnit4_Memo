package chap08.リスト8_10;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT	A.日付, A.メモ, A.関連日付, B.メモ"	+
						" FROM 家計簿 AS A"							+
						" LEFT JOIN 家計簿 AS B"					+
						" ON A.関連日付 = B.日付";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				Date date		= rs.getDate(1);
				String memoA	= rs.getString(2);
				Date date関連	= rs.getDate(3);
				String memoB	= rs.getString(4);

				System.out.printf("%s %s %s %s\n", date, memoA, date関連, memoB);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
