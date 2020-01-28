package chap03.ex3_1_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;


public class Table {

	public static final String NEW_LINE = System.lineSeparator();

	public static final String TABLE	= "気象観測";
	public static final String 列1	= "月";
	public static final String 列2	= "降水量";
	public static final String 列3	= "最高気温";
	public static final String 列4	= "最低気温";
	public static final String 列5	= "湿度";

	public static void executeQuery(String sql) {
        String jdbcUrl = "jdbc:derby:memory:sample;create=true";

        ResultSet rs = null;

        try (
        		Connection	conn = DriverManager.getConnection(jdbcUrl);
        		Statement	stmt = conn.createStatement();
        ) {
        	initDb(stmt);

        	rs = stmt.executeQuery(sql);

        	printDB(rs);
        } catch (SQLException e) {
        	e.printStackTrace();
		} finally {
			if (Objects.nonNull(rs))
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
    }


	private static void initDb(Statement stmt) throws SQLException {
		createTable(stmt);
		inputDatas(stmt);
	}

	private static void createTable(Statement stmt) throws SQLException {
		String sql =	"CREATE TABLE " + TABLE + NEW_LINE +
						"(" + NEW_LINE +
							列1 + " INTEGER,"	+ NEW_LINE +
							列2 + " INTEGER,"	+ NEW_LINE +
							列3 + " INTEGER,"	+ NEW_LINE +
							列4 + " INTEGER,"	+ NEW_LINE +
							列5 + " INTEGER"	+ NEW_LINE +
						")";

		stmt.executeUpdate(sql);
	}

	private static void inputDatas(Statement stmt) throws SQLException {
		String sql1 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES(1, 100,		10, 1, 1)";
		String sql2 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES(2, 200,		20, 2, 2)";
		String sql3 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES(3, 300,		30, 3, 3)";
		String sql4 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES(4, 400,		40, 4, 4)";
		String sql5 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES(5, 500,		50, 5, 5)";
		String sql6 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES(6, 600,		60, 6, 6)";
		String sql7 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES(7, 700,		70, 7, 7)";
		String sql8 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES(8, 800,		80, 8, 8)";
		String sql9 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES(9, 900,		90, 9, 9)";
		String sql10 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES(10, 1000,	100, 10, 10)";
		String sql11 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES(11, 1100,	110, 11, 11)";
		String sql12 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES(12, 1200,	120, 12, 12)";

		String[] sqlArray = { sql1, sql2, sql3, sql4, sql5, sql6, sql7, sql8, sql9, sql10, sql11, sql12 };
		for (String sql : sqlArray)
			stmt.executeUpdate(sql);
	}

	private static void printDB(Statement stmt, ResultSet rs) throws SQLException {
    	String sql =	"SELECT * " + NEW_LINE +
    					"FROM " + TABLE;
    	rs = stmt.executeQuery(sql);

		while (rs.next()) {
			int month	= rs.getInt(列1);
			int rain	= rs.getInt(列2);
			int max	= rs.getInt(列3);
			int min	= rs.getInt(列4);
			int wet	= rs.getInt(列5);

			System.out.printf("%d月 %dmm %d度 %d度 %d%%\n", month, rain, max, min, wet);
		}
	}

	private static void printDB(ResultSet rs) throws SQLException {
		while (rs.next()) {
			int month	= rs.getInt(列1);
			int rain	= rs.getInt(列2);
			int max	= rs.getInt(列3);
			int min	= rs.getInt(列4);
			int wet	= rs.getInt(列5);

			System.out.printf("%d月 %dmm %d度 %d度 %d%%\n", month, rain, max, min, wet);
		}
	}

}
