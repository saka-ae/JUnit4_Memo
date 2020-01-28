package chap04.ex4_2_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT * FROM 整数"	+

							" EXCEPT "				+

							"SELECT * FROM 偶数";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int num = rs.getInt("値");

				System.out.println(num);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
