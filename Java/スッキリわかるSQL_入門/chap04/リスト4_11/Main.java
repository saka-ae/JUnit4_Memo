package chap04.リスト4_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	private static final String 費目		= "費目";
	private static final String 入金額	= "入金額";
	private static final String 出金額	= "出金額";

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT " + 費目 + ", " + 入金額 + ", "+ 出金額	+
							" FROM 家計簿"										+
							" UNION"											+
							" SELECT " + 費目 + ", " + 入金額 + ", "+ 出金額	+
							" FROM 家計簿アーカイブ"							+
							" ORDER BY 2, 3, 1";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String item		= rs.getString(費目);
				int income		= rs.getInt(入金額);
				int outcome	= rs.getInt(出金額);

				System.out.printf("%s %d %d\n", item, income, outcome);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
