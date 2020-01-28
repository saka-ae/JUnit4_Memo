package practice.subjectC.Level3.ex32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT イベント番号"		+
							" FROM イベント"			+
							" WHERE タイプ = '2'"		+

							" INTERSECT"				+

							" SELECT イベント番号"		+
							" FROM 経験イベント"		+
							" WHERE クリア区分 = '1'";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int eventNo		= rs.getInt("イベント番号");

				System.out.println(eventNo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
