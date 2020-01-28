package chap10.ex10_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"CREATE TABLE 学部 ("										+
						"	ID		CHAR(1)			PRIMARY KEY,"					+
						"	名前	VARCHAR(20)		UNIQUE				NOT NULL,"	+
						"	備考	VARCHAR(100)	DEFAULT '特になし'	NOT NULL"	+
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
