package chap13.list13_2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import chap13.list13_2.model.Employee;

public class EmployeeDAO {

	private static final String JDBC_URL = "jdbc:h2:~/example";


	public List<Employee> findAll() {
		String sql = "SELECT ID, NAME, AGE FROM EMPLOYEE";

		List<Employee> employeeList = new ArrayList<>();

		try (
				Connection conn = DriverManager.getConnection(JDBC_URL);
				PreparedStatement pStmt = conn.prepareStatement(sql);
				ResultSet rs = pStmt.executeQuery();
		) {
			while (rs.next()) {
				String id	= rs.getString("ID");
				String name	= rs.getString("NAME");
				int age		= rs.getInt("AGE");

				Employee employee = new Employee(id, name, age);
				employeeList.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employeeList;
	}

}
