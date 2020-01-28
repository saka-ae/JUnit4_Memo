package practice.subjectC.Level1.ex5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql1		= 	"INSERT INTO パーティー"				+
							" VALUES('A01',	'スガワラ',	'21',	131,	232,	'00')";
		String sql2		= 	"INSERT INTO パーティー"				+
							" VALUES('A02',	'オーエ',	'10',	156,	84,		'00')";
		String sql3		= 	"INSERT INTO パーティー"				+
							" VALUES('A03',	'イズミ',	'20',	84,		190,	'00')";

		String[] sqls = { sql1, sql2, sql3 };


		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				Statement stmt = conn.createStatement();
		) {
			for (String sql : sqls)
				stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
