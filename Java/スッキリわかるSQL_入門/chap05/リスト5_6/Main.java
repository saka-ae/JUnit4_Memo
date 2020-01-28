package chap05.リスト5_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		=	"SELECT	費目, 入金額,"								+
							" CASE	WHEN 入金額 < 5000		THEN 'お小遣い'"	+
							"		WHEN 入金額 < 100000	THEN '一時収入'"	+
							"		WHEN 入金額 < 300000	THEN '給料'"		+
							"		ELSE '想定外の収入'"						+
							" END AS 収入の分類"								+
							" FROM 家計簿"										+
							" WHERE 入金額 > 0";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String 費目		= rs.getString("費目");
				int 入金額		= rs.getInt("入金額");
				String type		= rs.getString("収入の分類");

				System.out.printf("%s %d %s\n", 費目, 入金額, type);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
