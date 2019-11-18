package chap12.ex12_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/rpgdb";
		String sql		= "SELECT * FROM ITEMS";

		try (
				Connection con = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
			while (rs.next()) {
				Item item = new Item(rs);

				System.out.println(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
