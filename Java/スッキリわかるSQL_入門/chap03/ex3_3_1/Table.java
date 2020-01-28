package chap03.ex3_3_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class Table {

	public static final String NEW_LINE = System.lineSeparator();

	public static final String TABLE		= "成績表";

	public static final String 学籍番号	= "学籍番号";
	public static final String 学生名	= "学生名";
	public static final String 法学		= "法学";
	public static final String 経済学	= "経済学";
	public static final String 哲学		= "哲学";
	public static final String 情報理論	= "情報理論";
	public static final String 外国語	= "外国語";
	public static final String 総合成績	= "総合成績";

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

	public static void executeUpdates(String[] sqlArray) {
        String jdbcUrl = "jdbc:derby:memory:sample;create=true";

        ResultSet rs = null;

        try (
        		Connection	conn = DriverManager.getConnection(jdbcUrl);
        		Statement	stmt = conn.createStatement();
        ) {
        	initDb(stmt);

        	for (String sql : sqlArray)
        		stmt.executeUpdate(sql);

        	printDbAll(stmt, rs);
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
		    		学籍番号	+ "	CHAR(4)," +
		    		学生名		+ "	VARCHAR(20)," +
		    		法学		+ "	Integer," +
		    		経済学		+ "	Integer," +
		    		哲学		+ "	Integer," +
		    		情報理論	+ "	Integer," +
		    		外国語		+ "	Integer," +
		    		総合成績	+ "	Char(1)"  +
				")";

		stmt.executeUpdate(sql);
	}

	private static void inputDatas(Statement stmt) throws SQLException {
		String sql1 = "INSERT INTO " + TABLE +
						" VALUES('Z000', 'abc',	100, 100, 100, 100, 100, null)";

		String[] sqlArray = { sql1 };
		for (String sql : sqlArray)
			stmt.executeUpdate(sql);
	}

	private static void printDb(ResultSet rs) throws SQLException {
		while (rs.next()) {
			String code	= rs.getString(学籍番号);
			String name	= rs.getString(学生名);
			int score1	= rs.getInt(法学);
			int score2	= rs.getInt(経済学);
			int score3	= rs.getInt(哲学);
			int score4	= rs.getInt(情報理論);
			int score5	= rs.getInt(外国語);
			String lank	= rs.getString(総合成績);

			System.out.printf("%s %s %d %d %d %d %d %s\n", code, name, score1, score2, score3, score4, score5, lank);
		}
	}

	private static void printDbAll(Statement stmt, ResultSet rs) throws SQLException {
		String sql = "SELECT * FROM " + TABLE;
		rs = stmt.executeQuery(sql);

		printDb(rs);
	}

}
