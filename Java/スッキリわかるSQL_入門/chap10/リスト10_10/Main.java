package chap10.リスト10_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"CREATE TABLE 家計簿 ("												+
						"	日付	DATE			NOT NULL,"								+ 
						"	費目ID	INTEGER			REFERENCES 費目(ID),"					+ 
						"	メモ	VARCHAR(100)	DEFAULT '不明'	NOT NULL,"				+
						"	入金額	INTEGER			DEFAULT 0		CHECK(入金額 >= 0),"	+ 
						"	出金額	INTEGER			DEFAULT 0		CHECK(出金額 >= 0)"		+ 
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
