import java.util.ArrayList;
import java.util.Scanner;

public class EditingEmployee {
	private static String holdplace;
	private static int editcase;
	
	public void EditingEmployee(ArrayList<Employee> employeeList) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		Employee temp = null; //Setting temp to no value because it errors out if this isn
		//Prompt user for EmployeeID
		//Search list for employeeID
		System.out.println("Input for EmployeeID" );
		holdplace = reader.nextLine();
		for(int i = 0;i < employeeList.size(); i++) {
			if (holdplace.equals(employeeList.get(i).getEmployeeId())) {
				temp = employeeList.get(i);
				//System.out.print("Found");
				break;
			}
		}
		if(temp == null) {
		System.out.println("Employee not found.");
		return;
		}
		
		System.out.println("What would you like to edit? "
				+ "\n1 - First Name: "
				+ "\n2 - Last Name:"
				+ "\n3 - Class1"
				+ "\n4 - Class2"
				+ "\n5 - Class3"
				+ "\n6 - Class4"
				+ "\n7 - Class5"
				+ "\n8 - Class6"
				+ "\n9 - Class7"
				+ "\n10 - Class8"
				+ "\n11 - Class9"
				+ "\n12 - Class10"
				+ "\n13 - Class11"
				+ "\n14 - Class12"
				+ "\n15 - Class13"
				+ "\n16 - Class14"
				+ "\n17 - Class15");
		editcase = reader.nextInt();
		
		if (editcase < 18 && editcase > 2) {
			System.out.println("***Please type ALL dates in yyyy-MM-dd format!***\n");
		}
		
		switch (editcase) {
		
		case 1: //Allows you to change the first name.
			System.out.println("What is the desired first name?  ");
			holdplace = reader.next();
			
			temp.setFName(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setFName(temp.getFName());
				}
			}
			break;
		case 2:
			//Allows you to change the last name.
			System.out.println("What is the desired last name?  ");
			holdplace = reader.next();
			
			temp.setLName(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setLName(temp.getLName());
				}
			}
			break;
		case 3:
			//Allows you to change Class #1.
			System.out.println("What is the new expiration date for Class1? ");
			holdplace = reader.next();
			
			temp.setClass1(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setClass1(temp.getClass1());
				}
			}
			break;
		case 4:
			//Allows you to change Class #2.
			System.out.println("What is the new expiration date for Class2? ");
			holdplace = reader.next();
			
			temp.setClass2(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setClass2(temp.getClass2());
				}
			}
			break;
		case 5:
			//Allows you to change Class #3.
			System.out.println("What is the new expiration date for Class3? ");
			holdplace = reader.next();
			
			temp.setClass3(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setClass3(temp.getClass3());
				}
			}
			break;
		case 6:
			//Allows you to change Class #4.
			System.out.println("What is the new expiration date for Class4? ");
			holdplace = reader.next();
			
			temp.setClass4(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setClass4(temp.getClass4());
				}
			}
			break;
		case 7:
			//Allows you to change Class #5.
			System.out.println("What is the new expiration date for Class5? ");
			holdplace = reader.next();
			
			temp.setClass5(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setClass5(temp.getClass5());
				}
			}
			break;
		case 8:
			//Allows you to change Class #6.
			System.out.println("What is the new expiration date for Class6? ");
			holdplace = reader.next();
			
			temp.setClass6(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setClass6(temp.getClass6());
				}
			}
			break;
		case 9:
			//Allows you to change Class #7.
			System.out.println("What is the new expiration date for Class7? ");
			holdplace = reader.next();
			
			temp.setClass7(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setClass7(temp.getClass7());
				}
			}
			break;
		case 10:
			//Allows you to change Class #8.
			System.out.println("What is the new expiration date for Class8? ");
			holdplace = reader.next();
			
			temp.setClass8(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setClass8(temp.getClass8());
				}
			}
			break;
		case 11:
			//Allows you to change Class #9.
			System.out.println("What is the new expiration date for Class9? ");
			holdplace = reader.next();
			
			temp.setClass9(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setClass9(temp.getClass9());
				}
			}
			break;
		case 12:
			//Allows you to change Class #10.
			System.out.println("What is the new expiration date for Class10? ");
			holdplace = reader.next();
			
			temp.setClass10(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setClass10(temp.getClass10());
				}
			}
			break;
		case 13:
			//Allows you to change Class #11.
			System.out.println("What is the new expiration date for Class11? ");
			holdplace = reader.next();
			
			temp.setClass11(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setClass11(temp.getClass11());
				}
			}
			break;
		case 14:
			//Allows you to change Class #12.
			System.out.println("What is the new expiration date for Class12? ");
			holdplace = reader.next();
			
			temp.setClass12(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setClass12(temp.getClass12());
				}
			}
			break;
		case 15:
			//Allows you to change Class #13.
			System.out.println("What is the new expiration date for Class13? ");
			holdplace = reader.next();
			
			temp.setClass13(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setClass13(temp.getClass13());
				}
			}
			break;
		case 16:
			//Allows you to change Class #14.
			System.out.println("What is the new expiration date for Class14? ");
			holdplace = reader.next();
			
			temp.setClass14(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setClass14(temp.getClass14());
				}
			}
			break;
		case 17:
			//Allows you to change Class #15.
			System.out.println("What is the new expiration date for Class15? ");
			holdplace = reader.next();
			
			temp.setClass15(holdplace);
			for(int i = 0; i <employeeList.size();i++) {
				if(temp.getEmployeeId().equals(employeeList.get(i).getEmployeeId())) {
					employeeList.get(i).setClass15(temp.getClass15());
				}
			}
			break;
		default:
			//If none of the numbers are specified are chosen then will stop the code from running.
			//The program completley stops here as of this moment it doesn't cycle.
			//System.out.println(
			break;
		}
	}
}
