import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Input {
	
	private static int num;
	private static String infoID;
	private static String infoFN;
	private static String infoLN;
	private static String info1;
	private static String info2;
	private static String info3;
	private static String info4;
	private static String info5;
	private static String info6;
	private static String info7;
	private static String info8;
	private static String info9;
	private static String info10;
	private static String info11;
	private static String info12;
	private static String info13;
	private static String info14;
	private static String info15;
	private final String class1 = "Class One";


	
	public int promptForInput() {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: \n");
		num = reader.nextInt();
		return num;
	}
	public String promptForString(ArrayList<Employee> employeeList) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Input for EmployeeID: ");
		infoID = reader.nextLine();
		for(int i = 0;i < employeeList.size();i++) {
			if(infoID.compareTo(employeeList.get(i).getEmployeeId())== 0 ) {
				System.out.print("EmployeeID " + infoID + " already exists.\n");
				return infoID;
			}
		}
		System.out.println("Input for First Name: ");
		infoFN = reader.nextLine();
		System.out.println("Input for Last Name: ");
		infoLN = reader.nextLine();
		/*=============================================================================*/
		/*Below is just a friendly reminder before entering all the class info to enter
		details in year-MONTH-date (yyyy-MM-dd) format.*/
		System.out.println("***Please type ALL dates in yyyy-MM-dd format!***\n");
		/*=============================================================================*/
		System.out.println("Input expiring date for Class One: ");
		info1 = reader.nextLine();
		System.out.println("Input for Class Two: ");
		info2 = reader.nextLine();
		System.out.println("Input for Class Three: ");
		info3 = reader.nextLine();
		System.out.println("Input for Class Four: ");
		info4 = reader.nextLine();
		System.out.println("Input for Class Five: ");
		info5 = reader.nextLine();
		System.out.println("Input for Class Six: ");
		info6 = reader.nextLine();
		System.out.println("Input for Class Seven: ");
		info7 = reader.nextLine();
		System.out.println("Input for Class Eight: ");
		info8 = reader.nextLine();
		System.out.println("Input for Class Nine: ");
		info9 = reader.nextLine();
		System.out.println("Input for Class Ten: ");
		info10 = reader.nextLine();
		System.out.println("Input for Class Eleven: ");
		info11 = reader.nextLine();
		System.out.println("Input for Class Twelve: ");
		info12 = reader.nextLine();
		System.out.println("Input for Class Thirteen: ");
		info13 = reader.nextLine();
		System.out.println("Input for Class Fourteen: ");
		info14 = reader.nextLine();
		System.out.println("Input for Class Fiveteen: ");
		info15 = reader.nextLine();
		
		//Placeholder Class1 = new Placeholder(info1, info2);
		Employee newEmployee = new Employee(infoID, infoFN, infoLN, info1, info2, info3, info4, info5, info6, info7, info8, info9, info10, info11, info12, info13, info14, info15);
		//newEmployee.print();
		
		employeeList.add(newEmployee);
		
		for(int i = 0;i < employeeList.size();i++) {
		employeeList.get(i).print();
		}
		
//		try {
//			FileWriter fw = new FileWriter("output.txt");
//			Writer output = new BufferedWriter(fw);
//			int sz = employeeList.size();
//			for (int i = 0; i < sz; i++) {
//				output.write(employeeList.get(i).getEmployeeId() + "\n");
//			}
//			output.close();
//		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, "I can not create that file");
//		}
		

		
		
		
		
		//Employee newEmployee = new Employee(info)
		return info1;
	}
}
