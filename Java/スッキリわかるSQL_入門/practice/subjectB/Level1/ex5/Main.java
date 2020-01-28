package practice.subjectB.Level1.ex5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql1		= 	"INSERT INTO 商品"	+
							"(			商品コード,	商品名,					単価,	商品区分)"					+
							" VALUES(	'W0461',	'冬のあったかコート',	12800,	'1')";
		String sql2		= 	"INSERT INTO 商品"	+
							"(			商品コード,	商品名,					単価,	商品区分)"					+
							" VALUES(	'S0331',	'春のさわやかコート',	6800,	'1')";
		String sql3		= 	"INSERT INTO 商品"	+
							"(			商品コード,	商品名,					単価,	商品区分)"					+
							" VALUES(	'A0582',	'秋のシックなコート',	9800,	'1')";
		String[] sqls = { sql1, sql2, sql3 };

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				Statement pstmt = conn.createStatement();
		) {
			for (String sql : sqls)
				pstmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
