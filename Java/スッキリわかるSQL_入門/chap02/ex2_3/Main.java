package chap02.ex2_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class Main {

	public static void main(String[] args) {
        String jdbcUrl = "jdbc:derby:memory:sample;create=true";

        ResultSet rs = null;

        try (
        		Connection	conn = DriverManager.getConnection(jdbcUrl);
        		Statement	stmt = conn.createStatement();
        ) {
        	initDb(stmt);

        	String newLine = System.lineSeparator();

        	String sql1 =	"SELECT コード, 地域, 都道府県名, 県庁所在地, 面積" + newLine +
    						"FROM 都道府県";
    		rs = stmt.executeQuery(sql1);
    		printDbAll(rs);
    		System.out.println();

    		String sql2 =	"SELECT *" + newLine +
							"FROM 都道府県";
    		rs = stmt.executeQuery(sql2);
    		printDbAll(rs);
    		System.out.println();

    		String sql3 =	"SELECT 地域 AS area, 都道府県名 AS pref" + newLine +
							"FROM 都道府県";
    		rs = stmt.executeQuery(sql3);
    		printDbAreaPref(rs);
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
		String sql = "CREATE TABLE 都道府県"
				+ "("
		    		+ "コード		CHAR(2),"
		    		+ "地域			VARCHAR(10),"
		    		+ "都道府県名	VARCHAR(10),"
		    		+ "県庁所在地	VARCHAR(20),"
		    		+ "面積			INTEGER"
				+ ")";

		stmt.executeUpdate(sql);
	}

	private static void inputDatas(Statement stmt) throws SQLException {
		String sql1 = "INSERT INTO 都道府県 VALUES('01', '関東',	'千葉',	'千葉',	100)";
		String sql2 = "INSERT INTO 都道府県 VALUES('02', '関東',	'東京',	'東京',	200)";

		String[] sqlArray = { sql1, sql2 };
		for (String sql : sqlArray)
			stmt.executeUpdate(sql);
	}

	private static void printDbAll(ResultSet rs) throws SQLException {
		while (rs.next()) {
			String code			= rs.getString("コード");
			String district	= rs.getString("地域");
			String prefecture	= rs.getString("都道府県名");
			String city			= rs.getString("県庁所在地");
			int area			= rs.getInt("面積");

			System.out.printf("%s %s %s %s %d\n", code, district, prefecture, city, area);
		}
	}

	private static void printDbAreaPref(ResultSet rs) throws SQLException {
		while (rs.next()) {
			String area	= rs.getString("area");
			String pref	= rs.getString("pref");

			System.out.printf("%s %s\n", area, pref);
		}
	}

}
