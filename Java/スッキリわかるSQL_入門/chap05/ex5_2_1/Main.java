package chap05.ex5_2_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql		=	"UPDATE 回答者"	+
							" SET 国名 =	CASE SUBSTRING(TRIM(メールアドレス), LENGTH(TRIM(メールアドレス)) - 1, 2)"	+
							"					WHEN 'jp' THEN '日本'"		+
							" 					WHEN 'uk' THEN 'イギリス'"	+
							" 					WHEN 'cn' THEN '中国'"		+
							" 					WHEN 'fr' THEN 'フランス'"	+
							" 					WHEN 'vn' THEN 'ベトナム'"	+
							" 				END";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
