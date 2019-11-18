package chap12.リスト12_06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/rpgdb";
		String sql		= "INSERT INTO MONSTERS VALUES(?, ?, ?, ?)";

		Connection con			= null;
		PreparedStatement pstmt	= null;

		try {
			con = DriverManager.getConnection(jdbcUrl);
			con.setAutoCommit(false);

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, "A");
			pstmt.setInt(2, 10);
			pstmt.setInt(3, 10);
			pstmt.setInt(4, 10);
			pstmt.executeUpdate();

			pstmt.setString(1, "B");
			pstmt.setInt(2, 20);
			pstmt.setInt(3, 20);
			pstmt.setInt(4, 20);
			pstmt.executeUpdate();

			con.commit();
		} catch (SQLException e1) {
			e1.printStackTrace();

			try {
				con.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		} finally {
			if (Objects.nonNull(con)) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (Objects.nonNull(pstmt)) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
