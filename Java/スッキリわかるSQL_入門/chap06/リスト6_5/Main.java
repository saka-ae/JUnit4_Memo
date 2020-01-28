package chap06.リスト6_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql		= 	"SELECT	AVG(COALESCE(出金額, 0)) AS 出金額の平均" +
							" FROM 家計簿";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int average = rs.getInt("出金額の平均");

				System.out.println(average);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
