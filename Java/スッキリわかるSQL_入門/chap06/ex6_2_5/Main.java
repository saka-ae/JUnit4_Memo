package chap06.ex6_2_5;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT	日付, COUNT(社員名) AS 障害対応人数"	+
						" FROM 入退室管理"								+
						" WHERE 事由区分 = '3'"							+
						" GROUP BY 日付";

		try (
				Connection conn				= DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt		= conn.prepareStatement(sql);
				ResultSet rs				= pstmt.executeQuery();
		) {
			while (rs.next()) {
				Date date		= rs.getDate(1);
				String name	= rs.getString(2);

				System.out.printf("%s %d\n", date, name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
