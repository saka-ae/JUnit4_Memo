package practice.subjectC.Level1.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT *"	+
							" FROM イベント";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int eventNo		= rs.getInt("イベント番号");
				String name			= rs.getString("イベント名称");
				String type			= rs.getString("タイプ");
				int prevEventNo	= rs.getInt("前提イベント番号");
				int nextEventNo	= rs.getInt("後続イベント番号");

				System.out.printf("%d %s %s %d %d\n", eventNo, name, type, prevEventNo, nextEventNo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
