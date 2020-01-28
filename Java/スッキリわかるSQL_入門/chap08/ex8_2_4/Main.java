package chap08.ex8_2_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT	支店ID AS 支店コード, 支店.名前 AS 支店名, 社員.名前 AS 支店長名, 社員数.社員数"	+
						" FROM 支店"																				+
						" LEFT JOIN 社員 ON 支店.支店長ID = 社員.社員番号"											+
						" LEFT JOIN ( SELECT 勤務地ID, COUNT(*) AS 社員数 FROM 社員 GROUP BY 勤務地ID ) AS 社員数"	+
						"	ON 支店.支店ID = 社員数.勤務地ID";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int id				= rs.getInt(1);
				String name			= rs.getString(2);
				String 支店長Name	= rs.getString(3);
				int num			= rs.getInt(4);

				System.out.printf("%d %s %s %d\n", id, name, 支店長Name, num);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
