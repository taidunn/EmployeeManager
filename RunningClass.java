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


	public static void main(String[] args) throws Exception {
//		LatencyHelp progress = new LatencyHelp();
//		progress.bar();
		
		//This will run set up the discalimer to run.
		Disclaimer disclaimer1 = new Disclaimer();
		//Here the disclaimer will actually run when the License() class is ran.
		disclaimer1.License();
		
		//This will run the date at after the disclaimer runs.
		Date date1 = new Date();
		
		System.out.println("***Please type ALL dates in yyyy-MM-dd format!***\n");
		
		Input askForInput = new Input();
		EditingEmployee editEmployee = new EditingEmployee();
		DeleteEmployee deleteEmployee = new DeleteEmployee();
		
     

	//	BufferedReader  bufReader = new BufferedReader(new FileReader("output.txt"));
		ArrayList<Employee> employeeList = new ArrayList<>();
		
		try {
       	 
            FileInputStream fileIn = new FileInputStream("src/output.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
 
            employeeList = (ArrayList<Employee>) objectIn.readObject();
 
            //System.out.println("The Object has been read from the file");
            objectIn.close();
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		do {
			System.out.println("\nWhat would you like to do?"
					+ "\n1 - Make a new employee. "
					+ "\n2 - Edit an Employee. "
					+ "\n3 - Print the Table "
					+ "\n4 - Delete/Hide an Employee "
					+ "\n5 - Will check for expiring or expired classes"
					+ "\n6 - Write to the file.. If you don't do this your progress will be lost!"
					+ "\n7 - Write to the spreadsheet"
					+ "\n8 - Close the program"
					+ "\nAnything else will shut the program down.");
		num = askForInput.promptForInput();
		//promptForInput();
		//mainInfo = askForInput.promptForString();
		
	
		switch (num) {
		case 1:
			//Make a new employee
			//Run the class for this
			mainInfo = askForInput.promptForString(employeeList);
			//System.out.println(mainInfo);
			break;
		case 2:
			//Edit Employee
			editEmployee.EditingEmployee(employeeList);
			//System.out.println(mainInfo);
			break;
		case 3:
			//Print Table
			//promptForInput();
			//System.out.println("EmployeeID || ");
			System.out.print("EmployeeID || First Name || Last Name || Class1 ||  || Class2 ||  || Class3 ||  || Class4 ||  || Class5 ||  || Class6 ||  || Class7 ||  || Class8 ||  || Class9 ||  || Class10 ||  || Class11 ||  || Class12 ||  || Class13 ||  || Class14 ||  || Class15 ||");
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
			break;
		case 6:
			//Saves to the file "output.txt".
			try {
				FileOutputStream fileOut = new FileOutputStream("src/output.txt");
				ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	            objectOut.writeObject(employeeList);
	            objectOut.close();
	            System.out.println("The Object  was succesfully written to a file");
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
			break;
		case 7:
			WriteExcelMain excel = new WriteExcelMain();
			excel.writeFileUsingPOI(employeeList);
			break;
		case 8:
			System.exit(4);
		default:
			throw new Exception("You entered " + num + " which is an invalid character");
			}
		}while(num < 9 && num > 0);

	}
}
