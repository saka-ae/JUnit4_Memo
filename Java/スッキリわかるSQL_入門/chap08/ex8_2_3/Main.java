package chap08.ex8_2_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT	社員番号, 社員.名前 AS 名前, 部署.名前 AS 部署名, 支店.名前 AS 勤務地"	+
						" FROM 社員"																	+
						" JOIN 部署	ON 社員.部署ID = 部署.部署ID"										+
						" JOIN 支店	ON 勤務地ID = 支店.支店ID";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String number		= rs.getString(1);
				String name			= rs.getString(2);
				String 部署Name	= rs.getString(3);
				String 勤務地Name	= rs.getString(4);

				System.out.printf("%s %s %s %s\n", number, name, 部署Name, 勤務地Name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
