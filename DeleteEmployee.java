import java.util.ArrayList;
import java.util.Scanner;

public class DeleteEmployee {
	private static String holdplace;
	private static int editcase;
	private static String yorn;
	
	
	public void DeleteEmployee(ArrayList<Employee> employeeList) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		Employee temp = null; //Setting temp to no value because it errors out if this isn
		//Prompt user for EmployeeID
		//Search list for employeeID
		System.out.println("Input for EmployeeID" );
		holdplace = reader.nextLine();
		for(int i = 0;i < employeeList.size(); i++) {
			if (holdplace.equals(employeeList.get(i).getEmployeeId())) {
				temp = employeeList.get(i);
				System.out.print("Found");
				break;
			}
		}
		if(temp == null) {
		System.out.println("Employee not found.");
		return;
		}
		
		System.out.println("Are you sure you'd like to delete this employee Yes or No");
		yorn = reader.nextLine();
		
		if (yorn.equals("Y")) {
			employeeList.remove(temp);
		}
	}
}
