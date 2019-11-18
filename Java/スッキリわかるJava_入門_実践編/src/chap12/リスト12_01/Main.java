package chap12.リスト12_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String className = "org.h2.Driver";

		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}


		String jdbcUrl = "jdbc:h2:~/rpgdb";

		try (Connection con = DriverManager.getConnection(jdbcUrl)) {
			;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
