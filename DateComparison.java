import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateComparison {

	public void DateComparison(ArrayList<Employee> employeeList) throws ParseException {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String LocalInformation = myDateObj.format(myFormatObj);
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
				first = (employeeList.get(i).getFName());
				last = (employeeList.get(i).getLName());
				id = (employeeList.get(i).getEmployeeId());
				full = (first + " " + last + "'s (" + id + ") ");

				for (String classDate : employeeList.get(i).getClasses()) {
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
							String newstring = employeeList.get(i).newDate(dates.get(j));
							System.out.println("\n**" + full + CourseNames.COURSES.get(j) + " expires on " + newstring
									+ " (" + days + " days) from now.**");
						}
					} else {
						long difference = (date1.getTime() - dates.get(j).getTime()) / 86400000;
						int days = (int) Math.abs(difference);
						String newstring = employeeList.get(i).newDate(dates.get(j));
						System.out.println("\n***" + full + CourseNames.COURSES.get(j) + " has been expired since "
								+ newstring + " (" + days + " days) ago.***");
					}

				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		// System.out.println("date1 : " + sdf.format(date1));
		// System.out.println("date2 : " + sdf.format(date2));
	}

}
