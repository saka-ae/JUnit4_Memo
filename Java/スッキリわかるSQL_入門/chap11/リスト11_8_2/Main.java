package chap11.リスト11_8_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql	=	"SELECT DISTINCT 費目ID FROM 家計簿4月";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
		) {
			while (rs.next()) {
				int id = rs.getInt(1);

				System.out.println(id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
