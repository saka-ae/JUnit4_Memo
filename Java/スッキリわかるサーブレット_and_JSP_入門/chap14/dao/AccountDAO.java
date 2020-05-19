package chap14.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

import chap14.model.Account;
import chap14.model.Login;

public class AccountDAO {

	private final String JDBC_URL = "jdbc:h2:~/sukkiriShop";


	public Account findByLogin(Login login) {
		String sql = "SELECT * FROM ACCOUNT WHERE USER_ID = ? AND PASS = ?";

		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		ResultSet rs = null;
		try (
				Connection conn = DriverManager.getConnection(JDBC_URL);
				PreparedStatement pStmt = conn.prepareStatement(sql);
		) {
			pStmt.setString(1, login.getUserId());
			pStmt.setString(2, login.getPassword());

			rs = pStmt.executeQuery();
			if (rs.next()) {
				String userId	= rs.getString("USER_ID");
				String password	= rs.getString("PASS");
				String mail		= rs.getString("MAIL");
				String name		= rs.getString("NAME");
				int age			= rs.getInt("AGE");

				return new Account(userId, password, mail, name, age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(rs))
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

		return null;
	}

}
