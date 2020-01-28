package chap11.リスト11_8_1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql	=	"SELECT * FROM 家計簿4月";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
		) {
			while (rs.next()) {
				Date date		= rs.getDate(1);
				int id			= rs.getInt(2);
				String memo		= rs.getString(3);
				int income		= rs.getInt(4);
				int outgo		= rs.getInt(5);

				System.out.printf("%s %d %s %d %d\n", date, id, memo, income, outgo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
