package accounts;

import db.DbConnection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SalaryCalulator {

	/**
	 * @author Jahidul Islam
	 * This class should have all the method necessary to calculate salary of 10 employees
	 * Create employees table in MySQL Database and store employees information in that table
	 * Use db package to get helper methods to connect to db and read employees information
	 * Create methods to calculate monthly and yearly salary after tax where 35% tax has to be deducted from actual salary
	 * This class consists only helper methods, you should not declare any main method here.
	 * Main method is being declared in App class
	 */

	public SalaryCalulator() {

		try {
			DbConnection.createTableFromStringToPsql("employees", "id", "first_name", "last_name", "hourlyrate");
			updateDb();
		} catch (SQLException sqlException) {
			System.out.println(sqlException.getMessage());
		} catch (IOException ioException) {
			System.out.println(ioException.getMessage());
		}
	}

	//public void yearCalculator(String tableName, String column1, String column2, String columnName3, float hourlyrate) throws SQLException, IOException, ClassNotFoundException {

	//	List<String> employeeHourly = DbConnection.readDatabase(tableName, column1, column2, columnName3);

	//}

	public void findEmployee() {

	}


	public static void updateDb() throws IOException, SQLException {

		List<String> employeesAvail = readInEmployees();
		DbConnection.insertDataFromArrayListToPsql(employeesAvail, "employees", "id", "first_name", "last_name", "hourlyrate");
	}

	public static List<String> readInEmployees() throws IOException {

		List<String> employeesList = new ArrayList<>();
		// Read the text input stream one line at a time and display each line.
		BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/modul_02_java_test_b2001/module_02_test/src/main/resources/employees.txt"));
		String line = null;
		while ((line = br.readLine()) != null) {
			employeesList.add(line);
		}
		return employeesList;

	}
}


