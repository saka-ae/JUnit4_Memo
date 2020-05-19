package chap13.list13_2;

import java.util.List;

import chap13.list13_2.dao.EmployeeDAO;
import chap13.list13_2.model.Employee;

public class SelectEmployeeSample {

	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<Employee> employeeList = employeeDAO.findAll();

		for (Employee employee : employeeList) {
			System.out.println("ID: " + employee.getId());
			System.out.println("NAME: " + employee.getName());
			System.out.println("AGE: " + employee.getAge());
			System.out.println();
		}

	}

}
