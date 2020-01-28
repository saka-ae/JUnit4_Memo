package chap03.リスト3_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;


public class Main {

	private static final String NEW_LINE = System.lineSeparator();

	private static final String TABLE	= "社員テーブル";
	private static final String 列1		= "社員番号";
	private static final String 列2		= "年齢";
	private static final String 列3		= "性別";
	private static final String 列4		= "名前";

	public static void main(String[] args) {
        String jdbcUrl = "jdbc:derby:memory:sample;create=true";

        ResultSet rs = null;

        try (
        		Connection	conn = DriverManager.getConnection(jdbcUrl);
        		Statement	stmt = conn.createStatement();
        ) {
        	initDb(stmt);

        	String sql =	"DELETE FROM "+ TABLE + NEW_LINE +
        					"WHERE " + 列1 + " = '2003031'";
        	stmt.executeUpdate(sql);

        	printDB(stmt, rs);
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
							列1 + " CHAR(7)," + NEW_LINE +
							列2 + " INTEGER," + NEW_LINE +
							列3 + " INTEGER," + NEW_LINE +
							列4 + " VARCHAR(20)" + NEW_LINE +
						")";

		stmt.executeUpdate(sql);
	}

	private static void inputDatas(Statement stmt) throws SQLException {
		String sql1 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES('2003031', 45, 1, 'ヨシダ シゲル')";
		String sql2 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES('2003032', 45, 1, 'ヨシダ シゲル')";
		String sql3 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES('2005011', 31, 1, 'スガワラ タクマ')";
		String sql4 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES('2012001', 22, 1, 'ミナト ユウスケ')";
		String sql5 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES('2012002', 24, 2, 'アサカ アユミ')";

		String[] sqlArray = { sql1, sql2, sql3, sql4, sql5 };
		for (String sql : sqlArray)
			stmt.executeUpdate(sql);
	}

	private static void printDB(Statement stmt, ResultSet rs) throws SQLException {
    	String sql =	"SELECT * " + NEW_LINE +
    					"FROM " + TABLE;
    	rs = stmt.executeQuery(sql);

		while (rs.next()) {
			String id		= rs.getString(列1);
			int age		= rs.getInt(列2);
			int gender		= rs.getInt(列3);
			String name		= rs.getString(列4);

			System.out.printf("%s %d %d %s\n", id, age, gender, name);
		}
	}

	private static void printDB(ResultSet rs) throws SQLException {
		while (rs.next()) {
			String id		= rs.getString(列1);
			int age		= rs.getInt(列2);
			int gender		= rs.getInt(列3);
			String name		= rs.getString(列4);

			System.out.printf("%s %d %d %s\n", id, age, gender, name);
		}
	}

}
