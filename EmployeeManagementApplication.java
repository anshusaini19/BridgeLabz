package com.example.EmployeeManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;
import java.util.Scanner;

@SpringBootApplication
public class EmployeeManagementApplication {

	static final String URL = "jdbc:mysql://localhost:3306/employee_db";
	static final String USER = "root";
	static final String PASSWORD = "root@987";

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		SpringApplication.run(EmployeeManagementApplication.class, args);

		while (true) {

			System.out.println("\n========== Employee Management ==========");
			System.out.println("1. Insert Employee");
			System.out.println("2. Search Employee");
			System.out.println("3. Update Salary");
			System.out.println("4. Delete Employee");
			System.out.println("5. Display All Employees");
			System.out.println("6. Employees Salary > 50000");
			System.out.println("7. Highest Salary Department Wise");
			System.out.println("8. Employees Without Manager");
			System.out.println("9. Second Highest Salary");
			System.out.println("10. Exit");

			System.out.print("Enter Choice : ");
			int choice = sc.nextInt();

			switch (choice) {

				case 1:
					insertEmployee();
					break;

				case 2:
					searchEmployee();
					break;

				case 3:
					updateSalary();
					break;

				case 4:
					deleteEmployee();
					break;

				case 5:
					displayEmployees();
					break;

				case 6:
					employeesMoreThan50000();
					break;

				case 7:
					highestSalaryDepartmentWise();
					break;

				case 8:
					employeesWithoutManager();
					break;

				case 9:
					secondHighestSalary();
					break;

				case 10:
					System.out.println("Thank You");
					System.exit(0);

				default:
					System.out.println("Invalid Choice");
			}
		}
	}

	public static Connection getConnection() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			return DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	}

	// INSERT EMPLOYEE

	public static void insertEmployee() {

		try {

			Connection con = getConnection();

			String sql = "INSERT INTO Employee VALUES(?,?,?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			System.out.print("Enter Employee ID : ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter Employee Name : ");
			String name = sc.nextLine();

			System.out.print("Enter Email : ");
			String email = sc.nextLine();

			System.out.print("Enter Salary : ");
			double salary = sc.nextDouble();
			sc.nextLine();

			System.out.print("Enter Joining Date (yyyy-mm-dd) : ");
			String date = sc.nextLine();

			System.out.print("Enter Department ID : ");
			int deptId = sc.nextInt();

			System.out.print("Enter Manager ID (0 if none) : ");
			int manager = sc.nextInt();

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setDouble(4, salary);
			ps.setDate(5, Date.valueOf(date));
			ps.setInt(6, deptId);

			if (manager == 0)
				ps.setNull(7, Types.INTEGER);
			else
				ps.setInt(7, manager);

			int rows = ps.executeUpdate();

			if (rows > 0)
				System.out.println("Employee Inserted Successfully");

			con.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	// SEARCH EMPLOYEE

	public static void searchEmployee() {

		try {

			Connection con = getConnection();

			String sql = "SELECT * FROM Employee WHERE employee_id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			System.out.print("Enter Employee ID : ");
			int id = sc.nextInt();

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				System.out.println("\nEmployee Found");
				System.out.println("ID : " + rs.getInt("employee_id"));
				System.out.println("Name : " + rs.getString("employee_name"));
				System.out.println("Email : " + rs.getString("email"));
				System.out.println("Salary : " + rs.getDouble("salary"));
				System.out.println("Joining Date : " + rs.getDate("joining_date"));
				System.out.println("Department ID : " + rs.getInt("department_id"));
				System.out.println("Manager ID : " + rs.getInt("manager_id"));

			} else {

				System.out.println("Employee Not Found");

			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// UPDATE SALARY

	public static void updateSalary() {

		try {

			Connection con = getConnection();

			String sql = "UPDATE Employee SET salary=? WHERE employee_id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			System.out.print("Enter Employee ID : ");
			int id = sc.nextInt();

			System.out.print("Enter New Salary : ");
			double salary = sc.nextDouble();

			ps.setDouble(1, salary);
			ps.setInt(2, id);

			int rows = ps.executeUpdate();

			if (rows > 0)
				System.out.println("Salary Updated Successfully");
			else
				System.out.println("Employee Not Found");

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// DELETE EMPLOYEE

	public static void deleteEmployee() {

		try {

			Connection con = getConnection();

			String sql = "DELETE FROM Employee WHERE employee_id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			System.out.print("Enter Employee ID : ");
			int id = sc.nextInt();

			ps.setInt(1, id);

			int rows = ps.executeUpdate();

			if (rows > 0)
				System.out.println("Employee Deleted Successfully");
			else
				System.out.println("Employee Not Found");

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// DISPLAY ALL EMPLOYEES

	public static void displayEmployees() {

		try {

			Connection con = getConnection();

			String sql = "SELECT * FROM Employee";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			System.out.println("\n==============================");

			while (rs.next()) {

				System.out.println("Employee ID : " + rs.getInt("employee_id"));
				System.out.println("Name : " + rs.getString("employee_name"));
				System.out.println("Email : " + rs.getString("email"));
				System.out.println("Salary : " + rs.getDouble("salary"));
				System.out.println("Joining Date : " + rs.getDate("joining_date"));
				System.out.println("Department ID : " + rs.getInt("department_id"));
				System.out.println("Manager ID : " + rs.getInt("manager_id"));

				System.out.println("----------------------------");
			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// EMPLOYEES EARNING MORE THAN 50000

	public static void employeesMoreThan50000() {

		try {

			Connection con = getConnection();

			String sql = "SELECT * FROM Employee WHERE salary > 50000";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getInt("employee_id") + "  "
						+ rs.getString("employee_name") + "  "
						+ rs.getDouble("salary"));

			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// HIGHEST SALARY DEPARTMENT WISE

	public static void highestSalaryDepartmentWise() {

		try {

			Connection con = getConnection();

			String sql = "SELECT department_id, MAX(salary) AS HighestSalary FROM Employee GROUP BY department_id";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				System.out.println("Department : "
						+ rs.getInt("department_id")
						+ " Highest Salary : "
						+ rs.getDouble("HighestSalary"));

			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// EMPLOYEES WITHOUT MANAGER

	public static void employeesWithoutManager() {

		try {

			Connection con = getConnection();

			String sql = "SELECT * FROM Employee WHERE manager_id IS NULL";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getInt("employee_id") + "  "
						+ rs.getString("employee_name"));

			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// SECOND HIGHEST SALARY

	public static void secondHighestSalary() {

		try {

			Connection con = getConnection();

			String sql = "SELECT MAX(salary) FROM Employee WHERE salary < (SELECT MAX(salary) FROM Employee)";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				System.out.println("Second Highest Salary : " + rs.getDouble(1));

			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
