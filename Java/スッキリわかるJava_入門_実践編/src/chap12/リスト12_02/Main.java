package chap12.リスト12_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/rpgdb";
		String sql		= "DELETE FROM MONSTERS WHERE HP <= ? OR NAME = ?";
		int result = 0;
		
		try (
				Connection con = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = con.prepareStatement(sql)
		) {
			pstmt.setInt(1, 10);
			pstmt.setString(2, "ゾンビ");

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (result != 0)
			System.out.println(result + "件のモンスターを削除");
		else
			System.out.println("該当モンスターなし");
	}

}
