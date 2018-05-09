import java.util.ArrayList;
import java.util.Scanner;

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name;
		String age;
		String food;

		ArrayList<Employee> employeeList;

		String dir = "resources";
		String fileName = "EmployeeList.txt";

		FileMethod.createDirectory(dir);
		FileMethod.createFile(dir, fileName);

		// name = Validator.getString(scan, "Enter Name:");
		// age = Validator.getString(scan, "Enter Age:");
		// food = Validator.getString(scan, "Enter favorite food:");

		// Employee emp = new Employee(name, age, food);

		// FileMethod.writeToFile(emp, dir, fileName);

		employeeList = FileMethod.readFromFile();
		System.out.println(employeeList);
		scan.close();
	}

}
