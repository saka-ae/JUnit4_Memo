package chap12.リスト12_04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/rpgdb";
		String sql		= "SELECT * FROM MONSTERS WHERE HP >= ?";
		ResultSet rs = null;

		try (
				Connection con = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = con.prepareStatement(sql)
		) {
			pstmt.setInt(1, 10);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("NAME");

				System.out.println(name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(rs)) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
