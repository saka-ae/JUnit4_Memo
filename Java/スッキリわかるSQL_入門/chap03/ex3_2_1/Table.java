package chap03.ex3_2_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class Table {

	public static final String NEW_LINE = System.lineSeparator();

	public static final String TABLE	= 		"都道府県";
	public static final String コード		= "コード";
	public static final String 地域			= "地域";
	public static final String 都道府県名	= "都道府県名";
	public static final String 県庁所在地	= "県庁所在地";
	public static final String 面積			= "面積";

	public static void executeQuery(String sql) {
        String jdbcUrl = "jdbc:derby:memory:sample;create=true";

        ResultSet rs = null;

        try (
        		Connection	conn = DriverManager.getConnection(jdbcUrl);
        		Statement	stmt = conn.createStatement();
        ) {
        	initDb(stmt);

    		rs = stmt.executeQuery(sql);
    		printDb(rs);
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
		String sql = "CREATE TABLE " + TABLE +
				"(" +
		    		コード		+ "	CHAR(2)," +
		    		地域		+ "	VARCHAR(10)," +
		    		都道府県名	+ "	VARCHAR(10)," +
		    		県庁所在地	+ "	VARCHAR(20)," +
		    		面積		+ "	INTEGER" +
				")";

		stmt.executeUpdate(sql);
	}

	private static void inputDatas(Statement stmt) throws SQLException {
		String sql1 = "INSERT INTO " + TABLE +
						" VALUES('01', '関東',	'千葉',	'千葉',	100)";
		String sql2 = "INSERT INTO " + TABLE +
						" VALUES('02', '関東',	'東京',	'東京',	200)";

		String[] sqlArray = { sql1, sql2 };
		for (String sql : sqlArray)
			stmt.executeUpdate(sql);
	}

	private static void printDb(ResultSet rs) throws SQLException {
		while (rs.next()) {
			String code			= rs.getString(コード);
			String district	= rs.getString(地域);
			String prefecture	= rs.getString(都道府県名);
			String city			= rs.getString(県庁所在地);
			int area			= rs.getInt(面積);

			System.out.printf("%s %s %s %s %d\n", code, district, prefecture, city, area);
		}
	}

}
