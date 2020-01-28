package chap10.ex10_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"CREATE TABLE 学生 ("	+
						"	学籍番号	CHAR(8)			PRIMARY KEY,"												+
						"	名前		VARCHAR(30)		NOT NULL,"													+
						"	生年月日	DATE			NOT NULL,"													+
						"	血液型		CHAR(2)			CHECK(血液型 IN ('A', 'B', 'O', 'AB') OR 血液型 IS NULL),"	+
						"	学部ID		CHAR(1)			REFERENCES 学部(ID)"										+
						")";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				Statement stmt = conn.createStatement();
		) {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
