package chap05.ex5_2_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql		=	"SELECT TRIM(メールアドレス) AS メールアドレス,"	+
							" CASE	WHEN 年齢 BETWEEN 20 AND 29	THEN '20代:'"	+
							" 		WHEN 年齢 BETWEEN 30 AND 39	THEN '30代:'"	+
							" 		WHEN 年齢 BETWEEN 40 AND 49	THEN '40代:'"	+
							" 		WHEN 年齢 BETWEEN 50 AND 59	THEN '50代:'"	+
							" END"												+
							" || "												+
							" CASE	WHEN 性別 = 'M'	THEN '男性'"				+
							" 		WHEN 性別 = 'F'	THEN '女性'"				+
							" END AS 属性"										+
							" FROM 回答者";
		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String mailAddress		= rs.getString("メールアドレス");
				String attribute		= rs.getString("属性");

				System.out.printf("%s %s\n", mailAddress, attribute);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
