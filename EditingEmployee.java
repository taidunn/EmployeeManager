import java.util.ArrayList;
import java.util.Scanner;

public class EditingEmployee {
	private static String holdplace;
	private static int editcase;
	
	public void EditingEmployee(ArrayList<Employee> EmployeeList) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		Employee temp = null; //Setting temp to no value because it errors out if this isn
		//Prompt user for EmployeeID
		//Search list for employeeID
		System.out.println("Input for EmployeeID" );
		holdplace = reader.nextLine();
		for(int i = 0;i < EmployeeList.size(); i++) {
			if (holdplace.equals(EmployeeList.get(i).getEmployeeId())) {
				temp = EmployeeList.get(i);
				System.out.print("Found");
				break;
			}
		}
		if(temp == null) {
		System.out.println("Employee not found.");
		return;
		}
		
		System.out.println("What would you like to edit \n1 - First Name: \n2 - Last Name:");
		editcase = reader.nextInt();
		
		switch (editcase) {
		case 1:
			System.out.println("What would you like to change first name to");
			holdplace = reader.next();
			
			temp.setFName(holdplace);
			for(int i = 0; i <EmployeeList.size();i++) {
				if(temp.getEmployeeId().equals(EmployeeList.get(i).getEmployeeId())) {
					EmployeeList.get(i).setFName(temp.getFName());
				}
			}
			break;
		case 2:
			System.out.println("What would you like to change first name to");
			holdplace = reader.next();
			
			temp.setLName(holdplace);
			for(int i = 0; i <EmployeeList.size();i++) {
				if(temp.getEmployeeId().equals(EmployeeList.get(i).getEmployeeId())) {
					EmployeeList.get(i).setLName(temp.getLName());
				}
			}
		default:
			break;
		}
	}
}
