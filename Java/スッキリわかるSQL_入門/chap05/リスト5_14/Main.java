package chap05.リスト5_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		=	"SELECT	COALESCE('A',	'B',	'C')	AS 列1," +
							"		COALESCE(NULL,	'B',	'C')	AS 列2," +
							"		COALESCE(NULL,	'B',	NULL)	AS 列3," +
							"		COALESCE(NULL,	NULL,	'C')	AS 列4," +
							"		COALESCE(NULL,	NULL,	NULL)	AS 列5," +
							"		COALESCE(1, 0) AS 列6";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String 列1	= rs.getString(1);
				String 列2	= rs.getString(2);
				String 列3	= rs.getString(3);
				String 列4	= rs.getString(4);
				String 列5	= rs.getString(5);
				int 列6		= rs.getInt(6);

				System.out.printf("%s %s %s %s %s %d\n", 列1, 列2, 列3, 列4, 列5, 列6);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
