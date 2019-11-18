package chap12.ex12_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import chap12.ex12_1.Item;

public class ItemsDAO {

	private static final String TABLE	= "ITEMS";
	private static final String COLUMN	= "PRICE";

	public static List<Item> findByMinimumPrice(int lower) {
		List<Item> items = new ArrayList<>();

		String jdbcUrl	= "jdbc:h2:~/rpgdb";
		String sql		= "SELECT * FROM " + TABLE + " WHERE " + COLUMN + " >= ?";

		ResultSet rs = null;

		try (
				Connection con = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = con.prepareStatement(sql);
		){
			pstmt.setInt(1, lower);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				int price = rs.getInt(COLUMN);

				Item item = new Item(rs);
				items.add(item);
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

		return items;
	}

}
