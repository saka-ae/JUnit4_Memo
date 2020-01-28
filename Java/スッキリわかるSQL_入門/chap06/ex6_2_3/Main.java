package chap06.ex6_2_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT	CASE 事由区分	WHEN '1' THEN 'メンテナンス'"	+
						"						WHEN '2' THEN 'リリース作業'"	+
						"						WHEN '3' THEN '障害対応'"		+
						"						WHEN '9' THEN 'その他'"			+
						"		END AS 事由区分, COUNT(事由区分) AS 入室回数"	+
						" FROM 入退室管理"										+
						" GROUP BY 事由区分";

		try (
				Connection conn				= DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt		= conn.prepareStatement(sql);
				ResultSet rs				= pstmt.executeQuery();
		) {
			while (rs.next()) {
				String 事由区分	= rs.getString(1);
				int 入室回数	= rs.getInt(2);

				System.out.printf("%s %d\n", 事由区分, 入室回数);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
