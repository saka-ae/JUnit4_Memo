package chap11.リスト11_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
		) {
			String sql1		=	"CREATE SEQUENCE 費目シーケンス";
			createSequence(sql1, conn);

			System.out.print("Next Sequence: ");
			String sql2		=	"SELECT NEXT VALUE FOR 費目シーケンス";
			select(sql2, conn);

			System.out.print("Current Sequence: ");
			String sql3		=	"SELECT CURRVAL('費目シーケンス')";
			select(sql3, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	private static void createSequence(String sql, Connection conn) throws SQLException {
		try (Statement stmt = conn.createStatement() ) {
			stmt.executeUpdate(sql);
		}
	}


	public static void select(String sql, Connection conn) throws SQLException {
		try (
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
		) {
			while (rs.next()) {
				int sequence = rs.getInt(1);

				System.out.println(sequence);
			}
		}
	}

}
