package chap05.ex5_1_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT 受験者ID AS 合格者ID"	+
						" FROM 試験結果"	+
						" WHERE	午前 >= 60"	+
						" AND	午後1 + 午後2 >= 120"	+
						" AND	論述 >= (午前 + 午後1 + 午後2 + 論述) * 0.3";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String id = rs.getString("合格者ID");

				System.out.println(id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
