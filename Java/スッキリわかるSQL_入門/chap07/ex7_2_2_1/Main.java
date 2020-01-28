package chap07.ex7_2_2_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql = 	"SELECT	車種コード FROM レンタル" +
						" WHERE レンタル日数 > 1";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String carModelCode = rs.getString(1);

				System.out.println(carModelCode);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
