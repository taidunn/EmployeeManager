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
	private static int allorspec;
	private static String mainInfo;


	public static void main(String[] args) throws Exception {
//		LatencyHelp progress = new LatencyHelp();
//		progress.bar();
		
		Banner banner = new Banner();
		
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
		SpecificComparison specComp = new SpecificComparison();
		
     

	//	BufferedReader  bufReader = new BufferedReader(new FileReader("output.txt"));
		ArrayList<Employee> employeeList = new ArrayList<>();
//		ArrayList<String> header = createHeaders();
		
		try {
       	 
            FileInputStream fileIn = new FileInputStream("src/output.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
 
            employeeList = (ArrayList<Employee>) objectIn.readObject();
 
            //System.out.println("The Object has been read from the file");
            objectIn.close();
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		System.out.println("=============================================================================================");
		System.out.println("                      **** The Following Classes Are Expired/Expring ****                    "); 
		DateComparison compdate = new DateComparison();
		compdate.DateComparison(employeeList);
		System.out.println("=============================================================================================\n");

		
		System.out.println("***Please type ALL dates in yyyy-MM-dd format!***\n");
		
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
	        printf st = new printf();
	        st.setShowVerticalLines(true);//if false (default) then no vertical lines are shown
	        st.setHeaders("EmployeeID", "First Name", "Last Name", "Class1", "Class2", "Class3", "Class4", "Class5", "Class6", "Class7", "Class8", "Class9", "Class10", "Class11", "Class12", "Class13", "Class14", "Class15");
	        for(Employee employee : employeeList ) {
		        st.addRow(employee.getEmployeeId(), 
		        		employee.getFName(), 
		        		employee.getLName(), 
		        		employee.getClass1(), 
		        		employee.getClass2(), 
		        		employee.getClass3(), 
		        		employee.getClass4(), 
		        		employee.getClass5(), 
		        		employee.getClass6(), 
		        		employee.getClass7(), 
		        		employee.getClass8(), 
		        		employee.getClass9(), 
		        		employee.getClass10(), 
		        		employee.getClass11(), 
		        		employee.getClass12(),
		        		employee.getClass13(), 
		        		employee.getClass14(), 
		        		employee.getClass15());	
	        }
	        st.print();
			break;
		case 4:
			//Delete/Hide User 
			//promptForInput();
			deleteEmployee.DeleteEmployee(employeeList);
			break;
		case 5:
			//INCOMPLETE
			//This will check for expiring classes
			System.out.println("\nWould you like to run a check on all or a specific employee?"
					+ "\n1 - Run on all employees. "
					+ "\n2 - Run on a specific employee. "
					+ "\nAnything else will shut the program down.");
			allorspec = askForInput.promptForInput();
			switch (allorspec) {
			case 1: 
				System.out.println("=============================================================================================");
				System.out.println("                      **** The Following Classes Are Expired/Expring ****                    "); 
				compdate.DateComparison(employeeList);
				System.out.println("=============================================================================================");
				break;
			case 2:
				specComp.SpecificComparison(employeeList);
				break;
			default: 
				break;
			}
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
			System.out.println("\nWould you like to generate a normal or advanced spreadsheet?"
					+ "\n1 - Create normal spreadsheet. "
					+ "\n2 - Create advanced spreadsheet. "
					+ "\nAnything else will shut the program down.");
			allorspec = askForInput.promptForInput();
			switch (allorspec) {
			case 1: 
				WriteExcelMain excel = new WriteExcelMain();
				excel.writeFileUsingPOI(employeeList);
				break;
			case 2:
				System.out.println("=============================================================================================");
				System.out.println("                             **** TEST FUNCTION NOT FOR USE ****                             "); 
				System.out.println("=============================================================================================");
				WriteExcelMain2 excel2 = new WriteExcelMain2();
				excel2.writeFileUsingPOI(employeeList);
				System.out.println("=============================================================================================");
				break;
			default: 
				break;
			}
			break;
		case 8:
			System.exit(4);
		default:
			throw new Exception("You entered " + num + " which is an invalid character");
			}
		}while(num < 9 && num > 0);

	}


	private static ArrayList<String> createHeaders() {
		ArrayList<String> headers = new ArrayList();
		headers.add("EmployeeID");
		headers.add("First Name");
		headers.add("Last Name");
		headers.add("Class1");
		headers.add("Class2");
		headers.add("Class3");
		headers.add("Class4");
		headers.add("Class5");
		headers.add("Class6");
		headers.add("Class7");
		headers.add("Class8");
		headers.add("Class9");
		headers.add("Class10");
		headers.add("Class11");
		headers.add("Class12");
		headers.add("Class13");
		headers.add("Class14");
		headers.add("Class15");
		
		
		return headers;
	}
}
