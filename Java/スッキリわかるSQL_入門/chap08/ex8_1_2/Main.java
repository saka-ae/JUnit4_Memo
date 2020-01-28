package chap08.ex8_1_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT	A1, A2, B1, B2"	+
						" FROM B"				+
						" JOIN A"				+
						" ON B.B2 = A.A1";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int a1	= rs.getInt(1);
				int a2	= rs.getInt(2);
				int b1	= rs.getInt(3);
				int b2	= rs.getInt(4);

				System.out.printf("%d %d %d %d\n", a1, a2, b1, b2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
