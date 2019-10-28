import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.*;
import java.text.ParseException;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;


public class RunningClass {
	
	private static int num;
	private static String mainInfo;


	public static void main(String[] args) throws IOException, ParseException {
//		LatencyHelp progress = new LatencyHelp();
//		progress.bar();
		Disclaimer disclaimer1 = new Disclaimer();
		disclaimer1.unknown();
		
		
		Date date1 = new Date();
		Input askForInput = new Input();
		EditingEmployee editEmployee = new EditingEmployee();
		DeleteEmployee deleteEmployee = new DeleteEmployee();
		
     

	//	BufferedReader  bufReader = new BufferedReader(new FileReader("output.txt"));
		ArrayList<Employee> employeeList = new ArrayList<>();
		
		try {
       	 
            FileInputStream fileIn = new FileInputStream("output.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
 
            employeeList = (ArrayList<Employee>) objectIn.readObject();
 
            System.out.println("The Object has been read from the file");
            objectIn.close();
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		do {
			System.out.println("What would you like to do?"
					+ "\n1 - Make a new employee. "
					+ "\n2 - Edit an Employee. "
					+ "\n3 - Print the Table "
					+ "\n4 - Delete/Hide an Employee "
					+ "\n5 - Will check for expiring or expired classes"
					+ "\n6 - Write to the file.. If you don't do this your progress will be lost!");
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
			//System.out.println("EmployeeID || ");
			for(int i = 0;i < employeeList.size();i++) {
				employeeList.get(i).print();
			}
			//System.out.println(employeeList);
			break;
		case 4:
			//Delete/Hide User 
			//promptForInput();
			deleteEmployee.DeleteEmployee(employeeList);
			break;
		case 5:
			//INCOMPLETE
			//This will check for expiring classes
			DateComparison compdate = new DateComparison();
			compdate.DateComparison(employeeList);
		case 6:
			try {
				FileOutputStream fileOut = new FileOutputStream("output.txt");
				ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	            objectOut.writeObject(employeeList);
	            objectOut.close();
	            System.out.println("The Object  was succesfully written to a file");
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
		default:
			break;
			}
		}while(num < 5 && num > 0);

	}
}
