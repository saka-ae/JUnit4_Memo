package chap04.リスト4_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	private static final String 費目		= "費目";

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT " + 費目	+
							" FROM 家計簿"		+
							" EXCEPT"			+
							" SELECT " + 費目	+
							" FROM 家計簿アーカイブ";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				String item		= rs.getString(費目);

				System.out.printf("%s\n", item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
