package chap02.ex2_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
        String jdbcUrl = "jdbc:derby:memory:sample;create=true";

        try (
        		Connection	conn = DriverManager.getConnection(jdbcUrl);
        		Statement	stmt = conn.createStatement();
        ) {
        	initDb(stmt);
        	insertDatas(stmt);
        	updateDatas(stmt);

        	String newLine = System.lineSeparator();
        	String sql =	"DELETE FROM 都道府県" + newLine +
    						"WHERE コード = '26'";
    		stmt.executeUpdate(sql);

        	printDb(stmt);
        } catch (SQLException e) {
        	e.printStackTrace();
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

	private static void insertDatas(Statement stmt) throws SQLException {
		String newLine = System.lineSeparator();
    	String sql1		=	"INSERT INTO 都道府県" + newLine +
							"(コード, 地域, 都道府県名, 面積)" + newLine +
							"VALUES ('26', '近畿', '京都', 4613)";
    	String sql2		=	"INSERT INTO 都道府県" + newLine +
							"VALUES ('37', '四国', '香川', '高松', 1876)";
    	String sql3		=	"INSERT INTO 都道府県" + newLine +
    						"(コード, 都道府県名, 県庁所在地)" + newLine +
    						"VALUES ('40', '福岡', '福岡')";

    	String[] sqlArray = { sql1, sql2, sql3 };

    	for (String sql : sqlArray)
			stmt.executeUpdate(sql);
	}

	private static void updateDatas(Statement stmt) throws SQLException {
		String newLine = System.lineSeparator();
    	String sql1 =	"UPDATE 都道府県" + newLine +
						"SET 県庁所在地 = '京都'" + newLine +
						"WHERE コード = '26'";
		String sql2 =	"UPDATE 都道府県" + newLine +
						"SET 地域 = '九州', 面積 = 4976" + newLine +
						"WHERE コード = '40'";

		String[] sqlArray = { sql1, sql2 };

		for (String sql : sqlArray)
			stmt.executeUpdate(sql);
	}

	private static void printDb(Statement stmt) throws SQLException {
		String sql = "SELECT * FROM 都道府県";

		try (ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				String code			= rs.getString("コード");
				String district	= rs.getString("地域");
				String prefecture	= rs.getString("都道府県名");
				String city			= rs.getString("県庁所在地");
				int area			= rs.getInt("面積");

				System.out.printf("%s %s %s %s %d\n", code, district, prefecture, city, area);
			}
		}
	}

}
