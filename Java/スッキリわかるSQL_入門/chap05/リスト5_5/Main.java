package chap05.リスト5_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		=	"SELECT	費目, 出金額,"							+
							" CASE 費目	WHEN '居住費' THEN '固定費'"		+
							"			WHEN '水道光熱費' THEN '固定費'"	+
							"			ELSE '変動費'"						+
							" END AS 出費の分類"							+
							" FROM 家計簿"									+
							" WHERE 出金額 > 0";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String 費目		= rs.getString("費目");
				int 出金額		= rs.getInt("出金額");
				String type		= rs.getString("出費の分類");

				System.out.printf("%s %d %s\n", 費目, 出金額, type);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
