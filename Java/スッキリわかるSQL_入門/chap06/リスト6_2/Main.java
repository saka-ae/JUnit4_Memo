package chap06.リスト6_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		
		String sql		= 	"SELECT	SUM(出金額) AS 合計出金額,"			+
							"		AVG(出金額) AS 平均出金額,"			+
							"		MAX(出金額) AS 最も大きな散財,"		+
							"		MIN(出金額) AS 最も少額の支払い"	+
							" FROM 家計簿";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				int sum	= rs.getInt("合計出金額");
				int ave	= rs.getInt("平均出金額");
				int max	= rs.getInt("最も大きな散財");
				int min	= rs.getInt("最も少額の支払い");
				
				System.out.printf("%d %d %d %d\n", sum, ave, max, min);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
