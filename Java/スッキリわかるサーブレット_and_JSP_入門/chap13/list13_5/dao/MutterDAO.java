package chap13.list13_5.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import chap13.list13_5.model.Mutter;

public class MutterDAO {

	private static final String JDBC_URL = "jdbc:h2:~/docoTsubu";


	public List<Mutter> findAll() {
		final String sql = "SELECT * FROM MUTTER ORDER BY ID DESC";
		List<Mutter> mutterList = new ArrayList<>();

		try (
				Connection conn = DriverManager.getConnection(JDBC_URL);
				PreparedStatement pStmt = conn.prepareStatement(sql);
				ResultSet rs = pStmt.executeQuery();
		) {
			while (rs.next()) {
				int id			= rs.getInt("ID");
				String userName = rs.getString("NAME");
				String text		= rs.getString("TEXT");

				Mutter mutter = new Mutter(id, userName, text);
				mutterList.add(mutter);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mutterList;
	}

	public boolean create(Mutter mutter) {
		final String sql = "INSERT INTO MUTTER(NAME, TEXT) VALUES(?, ?)";

		try (
				Connection conn = DriverManager.getConnection(JDBC_URL);
				PreparedStatement pStmt = conn.prepareStatement(sql);
		) {
			pStmt.setString(1, mutter.getUserName());
			pStmt.setString(2, mutter.getText());

			int result = pStmt.executeUpdate();
			if (result != 1)
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return true;
	}

}
