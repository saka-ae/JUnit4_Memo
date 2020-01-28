package chap06.リスト6_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql		= 	"SELECT	COUNT(*) AS 食費の行数"	+
							" FROM 家計簿"					+
							" WHERE 費目 = '食費'";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int num	= rs.getInt("食費の行数");

				System.out.println(num);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
