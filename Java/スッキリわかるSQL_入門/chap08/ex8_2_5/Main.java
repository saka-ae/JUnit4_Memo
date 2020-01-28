package chap08.ex8_2_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT	社員.社員番号, 社員.名前, 支店.名前 AS 本人勤務地, 上司支店.名前 AS 上司勤務地"	+
						" FROM 社員"																			+
						" JOIN 支店	ON 社員.勤務地ID = 支店.支店ID"												+
						" JOIN 社員 AS 上司		ON 社員.上司ID = 上司.社員番号"									+
						" JOIN 支店 AS 上司支店	ON 上司.勤務地ID = 上司支店.支店ID"								+
						" WHERE 社員.勤務地ID <> 上司.勤務地ID";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String number		= rs.getString(1);
				String name			= rs.getString(2);
				String office		= rs.getString(3);
				String bossOffice	= rs.getString(4);

				System.out.printf("%s %s %s %s\n", number, name, office, bossOffice);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
