package chap07.リスト7_10;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql = 	"SELECT	* FROM 家計簿アーカイブ" +
						" WHERE 費目 IN ( SELECT COALESCE(費目, '不明') FROM 家計簿 )";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				Date date		= rs.getDate(1);
				String item		= rs.getString(2);
				String memo		= rs.getString(3);
				int income		= rs.getInt(4);
				int cost		= rs.getInt(5);

				System.out.printf("%s %s %s %d %d\n", date, item, memo, income, cost);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
