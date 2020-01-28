package chap07.ex7_2_1_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql = 	"SELECT 価格 *	(	SELECT	SUM(レンタル日数) FROM レンタル"	+
						"					WHERE 車種コード = 'E01'"					+
						"				) AS 金額 "										+
						" FROM 料金 WHERE 車種コード = 'E01'";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int totalPrice = rs.getInt(1);

				System.out.println(totalPrice);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
