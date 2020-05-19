package chap13.list13_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEmployeeSample {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/example";
		String sql		= "SELECT * FROM EMPLOYEE";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pStmt = conn.prepareStatement(sql);
				ResultSet rs = pStmt.executeQuery();
		) {
			while (rs.next()) {
				String id	= rs.getString("ID");
				String name	= rs.getString("NAME");
				int age		= rs.getInt("AGE");

				System.out.println("ID: " + id);
				System.out.println("NAME: " + name);
				System.out.println("AGE: " + age);
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
