package practice.subjectC.Level3.ex23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT DISTINCT 状態コード" +
							" FROM パーティー";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String state	= rs.getString("状態コード");

				System.out.println(state);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
