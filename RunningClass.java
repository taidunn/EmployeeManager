import java.util.ArrayList;
import java.util.Scanner;




public class RunningClass {
	
	private static int num;
	private static String mainInfo;
	

	public static void main(String[] args) {
		Date date1 = new Date();
		Input askForInput = new Input();
		num = askForInput.promptForInput();
		//promptForInput();
		//mainInfo = askForInput.promptForString();

	
		switch (num) {
		case 1:
			//Make a new employee
			//Run the class for this
			//promptForInput();
			mainInfo = askForInput.promptForString();
			System.out.println(mainInfo);
			/*enter Employee iD
			Enter
			System.out.println(1);
			Employee Tai = new Employee("1234", "Tai");
			*/
			break;
		case 2:
			//Edit Employee
			System.out.println("test");
			askForInput.promptForInput();
			break;
		case 3:
			//Print Table
			//promptForInput();
			System.out.println(3);
			break;
		case 4:
			//Delete/Hide User
			//promptForInput();
			System.out.println(4);
			break;
		default:
			break;
			}
		}
	}
