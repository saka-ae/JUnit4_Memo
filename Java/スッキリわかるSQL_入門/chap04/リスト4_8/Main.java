package chap04.リスト4_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	private static final String 費目		= "費目";
	private static final String 出金額	= "出金額";

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT " + 費目 + ", " + 出金額 +
							" FROM 家計簿" +
							" ORDER BY 出金額 DESC" +
							" LIMIT 3";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String item		= rs.getString(費目);
				int outcome	= rs.getInt(出金額);

				System.out.printf("%s %d\n", item, outcome);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
