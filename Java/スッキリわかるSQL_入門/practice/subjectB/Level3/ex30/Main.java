package practice.subjectB.Level3.ex30;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT *"												+
							" FROM 廃番商品"										+
							" WHERE	廃番日 BETWEEN '2011-12-01' AND '2011-12-31'"	+
							" OR	売上個数 > 100"									+
							" ORDER BY 売上個数 DESC";
		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String code		= rs.getString("商品コード");
				String name		= rs.getString("商品名");
				int price		= rs.getInt("単価");
				String type		= rs.getString("商品区分");
				Date date		= rs.getDate("廃番日");
				int num		= rs.getInt("売上個数");

				System.out.printf("%s %s %d %s %s %d\n", code, name, price, type, date, num);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
