package chap05.ex5_3_2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql		=	"SELECT 受注日, 受注ID, 文字数,"		+
							" CASE COALESCE(書体コード, '1')"		+
							"	WHEN '1' THEN 'ブロック体'"			+
							"	WHEN '2' THEN '筆記体'"				+
							"	WHEN '3' THEN '草書体'"				+
							" END AS 書体名,"						+
							" CASE COALESCE(書体コード, '1')"		+
							"	WHEN '1' THEN 100"					+
							"	WHEN '2' THEN 150"					+
							"	WHEN '3' THEN 200"					+
							" END AS 単価,"							+
							" CASE	WHEN 文字数 > 10	THEN 500"	+
							"		ELSE 0"							+
							" END AS 特別加工料"					+
							" FROM 受注"							+
							" ORDER BY 受注日, 受注ID";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				Date date			= rs.getDate("受注日");
				String id			= rs.getString("受注ID");
				int length			= rs.getInt("文字数");
				String type			= rs.getString("書体名");
				int unit			= rs.getInt("単価");
				int specialFee	= rs.getInt("特別加工料");

				System.out.printf("%s %s %d %s %d %d\n", date, id, length, type, unit, specialFee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
