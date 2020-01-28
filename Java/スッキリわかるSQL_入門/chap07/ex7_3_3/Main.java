package chap07.ex7_3_3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql = 	"SELECT	個体識別番号,"			+
						"	CASE 品種コード	WHEN '01' THEN '乳用種'"	+
						"					WHEN '02' THEN '肉用種'"	+
						"					WHEN '03' THEN '交雑種'"	+
						"	END AS 品種,"								+
						" 出生日, 母牛番号"								+
						" FROM 個体識別"								+
						" WHERE 母牛番号 IN	("							+
						"	SELECT 個体識別番号 FROM 個体識別"			+
						"	 WHERE 品種コード = '01'"					+
						" )";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String id			= rs.getString(1);
				String type			= rs.getString(2);
				Date date			= rs.getDate(3);
				String motherId	= rs.getString(4);

				System.out.printf("%s %s %s %s\n", id, type, date, motherId);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
