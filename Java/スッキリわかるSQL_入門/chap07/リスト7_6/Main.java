package chap07.リスト7_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql = 	"SELECT	* FROM 家計簿集計"	+
						" WHERE 費目 IN (SELECT DISTINCT 費目 FROM 家計簿)";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String item		= rs.getString(1);
				int total		= rs.getInt(2);
				int ave		= rs.getInt(3);
				int max		= rs.getInt(4);
				int min		= rs.getInt(5);
				int times		= rs.getInt(6);

				System.out.printf("%s %d %d %d %d %d\n", item, total, ave, max, min, times);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
