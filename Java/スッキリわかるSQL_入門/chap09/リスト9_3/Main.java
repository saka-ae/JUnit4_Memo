package chap09.リスト9_3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT * FROM 家計簿"			+
						" WHERE 日付 >= '2013-02-01'"	+
						" FOR UPDATE";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			conn.setAutoCommit(false);

			while (rs.next()) {
				Date 日付		= rs.getDate(1);
				String 費目ID	= rs.getString(2);
				String メモ		= rs.getString(3);
				int 入金額		= rs.getInt(4);
				int 出金額		= rs.getInt(5);

				System.out.printf("%s %s %s %d %d\n", 日付, 費目ID, メモ, 入金額, 出金額);
			}

			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
