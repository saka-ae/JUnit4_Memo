package chap08.ex8_2_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT	社員.社員番号, 社員.名前 AS 名前, 上司.名前 AS 上司名"	+
						" FROM 社員"													+
						" LEFT JOIN 社員 AS 上司"										+
						" ON 社員.上司ID = 上司.社員番号";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String number		= rs.getString(1);
				String name			= rs.getString(2);
				String 上司Name	= rs.getString(3);

				System.out.printf("%s %s %s\n", number, name, 上司Name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
