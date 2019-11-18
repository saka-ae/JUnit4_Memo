package chap12.リスト12_05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/rpgdb";
		String sql		= "SELECT * FROM MONSTERS WHERE NAME = ?";
		String name		= "ゴブリン";
		ResultSet rs = null;

		try (
				Connection con = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = con.prepareStatement(sql)
		) {
			pstmt.setString(1, name);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				int hp = rs.getInt("HP");

				System.out.printf("%sのHPは%d", name, hp);
			} else
				System.out.println(name + "は存在しない");
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
