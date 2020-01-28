package practice.subjectA.LEVEL1.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT 口座番号, 残高"	+
							" FROM 口座";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String number	= rs.getString("口座番号");
				int balance	= rs.getInt("残高");

				System.out.printf("%s %d\n", number, balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
