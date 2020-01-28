package practice.subjectA.LEVEL1.ex7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql1		=	"INSERT INTO 口座"														+
							" VALUES("																+
								" '0642191', 'アオキ ハルカ',		'1', 3640551,	'2013-03-13'"	+
							")";
		String sql2		=	"INSERT INTO 口座"														+
							" VALUES("																+
								" '1039410', 'キノシタ リュウジ',	'1', 259017,	'2012-011-30'"	+
							")";

		String sql3		=	"INSERT INTO 口座"														+
							"(口座番号, 名義, 種別, 残高)"											+
							" VALUES("																+
								" '1239855', 'タカシナ ミツル',		'2', 6509773"					+
							")";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt1 = conn.prepareStatement(sql1);
				PreparedStatement pstmt2 = conn.prepareStatement(sql2);
				PreparedStatement pstmt3 = conn.prepareStatement(sql3);
		) {
			pstmt1.executeUpdate();
			pstmt2.executeUpdate();
			pstmt3.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
