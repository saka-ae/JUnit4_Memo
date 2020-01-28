package practice.subjectC.Level2.ex10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT イベント番号, イベント名称, タイプ"	+
							" FROM イベント"							+
							" WHERE タイプ <> '3'";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int eventNo	= rs.getInt("イベント番号");
				String name		= rs.getString("イベント名称");
				String type		= rs.getString("タイプ");

				System.out.printf("%d %s %s\n", eventNo, name, type);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
