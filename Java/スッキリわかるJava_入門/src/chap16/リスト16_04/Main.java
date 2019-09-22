package chap16.リスト16_04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// JDK 1.6～ 不要
		/*try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/

		// Derby
		String dbUrl	= "jdbc:derby:memory:sample;create=true";
		String sql		= "CREATE TABLE sampleTable(ID INTEGER)";

		try (
				Connection	conn = DriverManager.getConnection(dbUrl);
				Statement	stmt = conn.createStatement()
		) {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
