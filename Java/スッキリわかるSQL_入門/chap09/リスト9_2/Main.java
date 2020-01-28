package chap09.リスト9_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		try (Connection conn = DriverManager.getConnection(jdbcUrl)) {
			conn.setAutoCommit(false);

			conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
