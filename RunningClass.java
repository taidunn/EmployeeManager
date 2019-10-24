import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.FileReader;


public class RunningClass {
	
	private static int num;
	private static String mainInfo;


	public static void main(String[] args) {
		LatencyHelp progress = new LatencyHelp();
		progress.bar();
		Disclaimer disclaimer1 = new Disclaimer();
		disclaimer1.unknown();
		Date date1 = new Date();
		Input askForInput = new Input();
		EditingEmployee editEmployee = new EditingEmployee();
		DeleteEmployee deleteEmployee = new DeleteEmployee();
		
		
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		do {
			System.out.println("\n1 - Make a new employee. \n2 - Edit an Employee. \n3 - Print the Table \n4 - Delete/Hide an Employee");
		num = askForInput.promptForInput();
		//promptForInput();
		//mainInfo = askForInput.promptForString();
		
	
		switch (num) {
		case 1:
			//Make a new employee
			//Run the class for this
			mainInfo = askForInput.promptForString(employeeList);
			System.out.println(mainInfo);
			break;
		case 2:
			//Edit Employee
			editEmployee.EditingEmployee(employeeList);
			System.out.println(mainInfo);
		case 3:
			//Print Table
			//promptForInput();
			System.out.println(3);
			System.out.println("EmployeeID || ");
			System.out.println(employeeList);
			break;
		case 4:
			//Delete/Hide User 
			//promptForInput();
			deleteEmployee.DeleteEmployee(employeeList);
			System.out.println(4);
			
			break;
		default:
			break;
			}
		}while(num < 5 && num > 0);
	}
}
