package chap10.リスト10_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql = 	"CREATE TABLE 家計簿 ("							+
						"	日付 	DATE,"								+
						"	費目ID	INTEGER,"							+
						"	メモ	VARCHAR(100)	DEFAULT '不明',"	+
						"	入金額	INTEGER			DEFAULT 0,"			+
						"	出金額	INTEGER			DEFAULT 0"			+
						" )";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
