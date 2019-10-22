import java.util.Scanner;

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


	
	public int promptForInput() {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		num = reader.nextInt();
		return num;
	}
	public String promptForString() {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Input for EmployeeID" );
		infoID = reader.nextLine();
		System.out.println("Input for FName" );
		infoFN = reader.nextLine();
		System.out.println("Input for LName" );
		infoLN = reader.nextLine();
		System.out.println("Input for Class1" );
		info1 = reader.nextLine();
		System.out.println("Input for Class2" );
		info2 = reader.nextLine();
		System.out.println("Input for Class3" );
		info3 = reader.nextLine();
		System.out.println("Input for Class4" );
		info4 = reader.nextLine();
		System.out.println("Input for Class5" );
		info5 = reader.nextLine();
		System.out.println("Input for Class6" );
		info6 = reader.nextLine();
		System.out.println("Input for Class7" );
		info7 = reader.nextLine();
		System.out.println("Input for Class8" );
		info8 = reader.nextLine();
		System.out.println("Input for Class9" );
		info9 = reader.nextLine();
		System.out.println("Input for Class10" );
		info10 = reader.nextLine();
		System.out.println("Input for Class11" );
		info11 = reader.nextLine();
		System.out.println("Input for Class12" );
		info12 = reader.nextLine();
		System.out.println("Input for Class13" );
		info13 = reader.nextLine();
		System.out.println("Input for Class14" );
		info14 = reader.nextLine();
		System.out.println("Input for Class15" );
		info15 = reader.nextLine();

		
		
		
		
		//Employee newEmployee = new Employee(info)
		//return info;
	}
}
