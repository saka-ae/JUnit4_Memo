package practice.subjectC.Level3.ex30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT CASE  WHEN 職業コード LIKE '1_' THEN 'S'"	+
										" WHEN 職業コード LIKE '2_' THEN 'M'"	+
										" ELSE 'A'"								+
							"		END AS 職業区分, 職業コード, ID, 名称"		+
							" FROM パーティー"									+
							" ORDER BY 職業コード";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String jobType	= rs.getString("職業区分");
				String jobCode	= rs.getString("職業コード");
				String id		= rs.getString("ID");
				String name		= rs.getString("名称");

				System.out.printf("%s %s %s %s\n", jobType, jobCode, id, name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
