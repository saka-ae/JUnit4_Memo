package practice.subjectC.Level1.ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT イベント番号 AS 番号, イベント名称 AS 場面"	+
							" FROM イベント";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int eventNo	= rs.getInt("イベント番号");
				String name		= rs.getString("イベント名称");

				System.out.printf("%d %s\n", eventNo, name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
