package practice.subjectC.Level3.ex27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT タイプ, イベント番号, イベント名称, 前提イベント番号, 後続イベント番号"	+
							" FROM イベント"																+
							" ORDER BY 1, 2";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String type			= rs.getString("タイプ");
				int eventNo		= rs.getInt("イベント番号");
				String name			= rs.getString("イベント名称");
				int prevEventNo	= rs.getInt("前提イベント番号");
				int nextEventNo	= rs.getInt("後続イベント番号");

				System.out.printf("%s %d %s %d %d\n", type, eventNo, name, prevEventNo, nextEventNo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
