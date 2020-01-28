package practice.subjectC.Level2.ex14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT イベント番号, イベント名称, 後続イベント番号"	+
							" FROM イベント"					+
							" WHERE 後続イベント番号 IS NOT NULL";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int eventNo		= rs.getInt("イベント番号");
				String name			= rs.getString("イベント名称");
				int nextEventNo	= rs.getInt("後続イベント番号");

				System.out.printf("%d %s %d\n", eventNo, name, nextEventNo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
