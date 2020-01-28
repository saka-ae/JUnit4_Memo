package chap03.リスト3_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class Main {

	private static final String NEW_LINE = System.lineSeparator();

	private static final String TABLE	= "買い物リスト";
	private static final String 列1		= "カテゴリ";
	private static final String 列2		= "名称";
	private static final String 列3		= "販売店";
	private static final String 列4		= "価格";

	public static void main(String[] args) {
        String jdbcUrl = "jdbc:derby:memory:sample;create=true";

        ResultSet rs = null;

        try (
        		Connection	conn = DriverManager.getConnection(jdbcUrl);
        		Statement	stmt = conn.createStatement();
        ) {
        	initDb(stmt);

        	String sql =	"UPDATE " + TABLE + NEW_LINE +
        					"SET " + 列4 + " = 6200" + NEW_LINE +
        					"WHERE "	+ 列2 + " = 'スッキリ勇者クエスト'" + NEW_LINE +
        					"AND "		+ 列3 + " = 'B'";
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
							列1 + " VARCHAR(20)," + NEW_LINE +
							列2 + " VARCHAR(20)," + NEW_LINE +
							列3 + " VARCHAR(20)," + NEW_LINE +
							列4 + " INTEGER" + NEW_LINE +
						")";

		stmt.executeUpdate(sql);
	}

	private static void inputDatas(Statement stmt) throws SQLException {
		String sql1 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES('ゲーム',	'スッキリ勇者クエスト',			'B', 7140)";
		String sql2 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES('ゲーム',	'スッキリ勇者クエスト',			'Y', 6850)";
		String sql3 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES('書籍',	'魔王征伐日記',						'A', 1200)";
		String sql4 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES('DVD',	'スッキリわかるマンモスの倒し方',	'A', 5250)";
		String sql5 =	"INSERT INTO " + TABLE + NEW_LINE +
						"VALUES('DVD',	'スッキリわかるマンモスの倒し方',	'B', 7140)";

		String[] sqlArray = { sql1, sql2, sql3, sql4, sql5 };
		for (String sql : sqlArray)
			stmt.executeUpdate(sql);
	}

	private static void printDB(Statement stmt, ResultSet rs) throws SQLException {
    	String sql =	"SELECT * " + NEW_LINE +
    					"FROM " + TABLE;
    	rs = stmt.executeQuery(sql);

		while (rs.next()) {
			String category	= rs.getString(列1);
			String name			= rs.getString(列2);
			String shop			= rs.getString(列3);
			int price			= rs.getInt(列4);

			System.out.printf("%s %s %s %d\n", category, name, shop, price);
		}
	}

}
