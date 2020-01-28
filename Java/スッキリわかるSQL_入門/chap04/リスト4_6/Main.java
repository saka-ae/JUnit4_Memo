package chap04.リスト4_6;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= "SELECT * FROM 家計簿 ORDER BY 4 DESC, 5 DESC";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				Date date		= rs.getDate("日付");
				String item		= rs.getString("費目");
				String memo		= rs.getString("メモ");
				int income		= rs.getInt("入金額");
				int outcome	= rs.getInt("出金額");

				System.out.printf("%s %s %s %d %d\n", date, item, memo, income, outcome);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
