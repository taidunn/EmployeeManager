import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SpecificComparison {
	private static String holdplace;
	private static int editcase;
	private static String yorn;
	private Employee hold = null;

	public void SpecificComparison(ArrayList<Employee> employeeList) throws ParseException {
		Scanner reader = new Scanner(System.in); // Reading from System.in
		Employee temp = null; // Setting temp to no value because it errors out if this isn
		// Prompt user for EmployeeID
		// Search list for employeeID
		System.out.println("Input for EmployeeID");
		holdplace = reader.nextLine();
		for (int i = 0; i < employeeList.size(); i++) {
			if (holdplace.equals(employeeList.get(i).getEmployeeId())) {
				temp = employeeList.get(i);
				hold = employeeList.get(i);
				break;
			}
		}
		if (temp == null) {
			System.out.println("Employee not found.");
			return;
		}

		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String LocalInformation = myDateObj.format(myFormatObj);
		// Everything is being set to null because the compiler has an issue if it is
		// not.
		List<Date> dates = new ArrayList<Date>();
		String first = null;
		String last = null;
		String id = null;
		String full = null;
		int daystoexpire = 60;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse(LocalInformation);
		try {
			for (int i = 0; i < employeeList.size(); i++) {
				first = (hold.getFName());
				last = (hold.getLName());
				id = (hold.getEmployeeId());
				full = (first + " " + last + "'s (" + id + ") ");
			}

			System.out.println(
					"=============================================================================================");
			System.out.println(
					"                      **** The Following Classes Are Expired/Expring ****                    ");
			for (String classDate : hold.getClasses()) {
				Date date = null;
				try {
					date = sdf.parse(classDate);
				} catch (Exception e) {
					
				}
				dates.add(date);
			}
			
			for (int j = 0; j < CourseNames.COURSES.size(); j++) {
				if (dates.get(j) == null) {
					continue;
				}
				
				if (date1.compareTo(dates.get(j)) < 0) {
					long difference = (date1.getTime() - dates.get(j).getTime()) / 86400000;
					int days = (int) Math.abs(difference);
					if (days <= daystoexpire) {
						String newstring = hold.newDate(dates.get(j));
						System.out.println(
								"\n**" + full + CourseNames.COURSES.get(j) + " expires on " + newstring + " (" + days + " days) from now.**");
					}
				} else {
					long difference = (date1.getTime() - dates.get(j).getTime()) / 86400000;
					int days = (int) Math.abs(difference);
					String newstring = hold.newDate(dates.get(j));
					System.out.println("\n***" + full + CourseNames.COURSES.get(j) + "  has been expired since " + newstring + " (" + days
							+ " days) ago.***");
				}

			}
			System.out.println(
					"=============================================================================================");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
