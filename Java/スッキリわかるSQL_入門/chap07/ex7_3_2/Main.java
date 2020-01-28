package chap07.ex7_3_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql = 	"SELECT	飼育県 AS 都道府県名, 個体識別番号,"			+
						"		CASE 雄雌コード	WHEN '1' THEN '雄'"				+
						"						WHEN '2' THEN '雌'"				+
						"		END AS 雄雌"									+
						" FROM 個体識別"										+
						" WHERE 飼育県 IN	( SELECT 飼育県 FROM 頭数集計"		+
						"						ORDER BY 頭数 DESC LIMIT 3"		+
						"					)";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String prefecture	= rs.getString(1);
				String id			= rs.getString(2);
				String gender		= rs.getString(3);

				System.out.printf("%s %s %s\n", prefecture, id, gender);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
