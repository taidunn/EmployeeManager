import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SpecificComparison {
	private static String holdplace;
	private static int editcase;
	private static String yorn;
	private Employee hold = null;
	
	public void SpecificComparison(ArrayList<Employee> employeeList) throws ParseException {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		Employee temp = null; //Setting temp to no value because it errors out if this isn
		//Prompt user for EmployeeID
		//Search list for employeeID
		System.out.println("Input for EmployeeID" );
		holdplace = reader.nextLine();
		for(int i = 0;i < employeeList.size(); i++) {
			if (holdplace.equals(employeeList.get(i).getEmployeeId())) {
				temp = employeeList.get(i);
				hold = employeeList.get(i);
				break;
			}
		}
		if(temp == null) {
		System.out.println("Employee not found.");
		return;
		}
		
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String LocalInformation = myDateObj.format(myFormatObj);
        // Everything is being set to null because the compiler has an issue if it is not.
        Date date2 = null;
        Date date3 = null;
        Date date4 = null;
        Date date5 = null;
        Date date6 = null;
        Date date7 = null;
        Date date8 = null;
        Date date9 = null;
        Date date10 = null;
        Date date11 = null;
        Date date12 = null;
        Date date13 = null;
        Date date14 = null;
        Date date15 = null;
        Date date16 = null;
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
                date2 = sdf.parse(hold.getClass1());
                date3 = sdf.parse(hold.getClass2());
                date4 = sdf.parse(hold.getClass3());
                date5 = sdf.parse(hold.getClass4());
                date6 = sdf.parse(hold.getClass5());
                date7 = sdf.parse(hold.getClass6());
                date8 = sdf.parse(hold.getClass7());
                date9 = sdf.parse(hold.getClass8());
                date10 = sdf.parse(hold.getClass9());
                date11 = sdf.parse(hold.getClass10());
                date12 = sdf.parse(hold.getClass11());
                date13 = sdf.parse(hold.getClass12());
                date14 = sdf.parse(hold.getClass13());
                date15 = sdf.parse(hold.getClass14());
                date16 = sdf.parse(hold.getClass15());
            }
            
			System.out.println("=============================================================================================");
			System.out.println("                      **** The Following Classes Are Expired/Expring ****                    "); 
			 //Class1
            if (date1.compareTo(date2) < 0) {
                long difference = (date1.getTime() - date2.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                if (days <= daystoexpire) {
                	String newstring = hold.newDate(date2);
                    System.out.println("\n**" + full + "Class1 expires on " + newstring + " (" + days + " days) from now.**" );
                }
            }
            else {
                long difference = (date1.getTime() - date2.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                String newstring = hold.newDate(date2);
            	System.out.println("\n***" + full + "Class1 has been expired since " + newstring + " (" + days + " days) ago.***");
            }
            //Class2
            if (date1.compareTo(date3) < 0) {
                long difference = (date1.getTime() - date3.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                if (days <= daystoexpire) {
                	String newstring = hold.newDate(date3);
                    System.out.println("\n**" + full + "Class2 expires on " + newstring + " (" + days + " days) from now.**" );
                }
            }
            else {
                long difference = (date1.getTime() - date3.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                String newstring = hold.newDate(date3);
            	System.out.println("\n***" + full + "Class2 has been expired since " + newstring + " (" + days + " days) ago.***");
            }
            //Class3
            if (date1.compareTo(date4) < 0) {
                long difference = (date1.getTime() - date4.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                if (days <= daystoexpire) {
                	String newstring = hold.newDate(date4);
                    System.out.println("\n**" + full + "Class3 expires on " + newstring + " (" + days + " days) from now.**" );
                }
            }
            else {
                long difference = (date1.getTime() - date4.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                String newstring = hold.newDate(date4);
            	System.out.println("\n***" + full + "Class3 has been expired since " + newstring + " (" + days + " days) ago.***");
            }
            //Class4
            if (date1.compareTo(date5) < 0) {
                long difference = (date1.getTime() - date5.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                if (days <= daystoexpire) {
                	String newstring = hold.newDate(date5);
                    System.out.println("\n**" + full + "Class4 expires on " + newstring + " (" + days + " days) from now.**" );
                }
            }
            else {
                long difference = (date1.getTime() - date5.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                String newstring = hold.newDate(date5);
            	System.out.println("\n***" + full + "Class4 has been expired since " + newstring + " (" + days + " days) ago.***");
            }
            //Class5
            if (date1.compareTo(date6) < 0) {
                long difference = (date1.getTime() - date6.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                if (days <= daystoexpire) {
                	String newstring = hold.newDate(date6);
                    System.out.println("\n**" + full + "Class5 expires on " + newstring + " (" + days + " days) from now.**" );
                }
            }
            else {
                long difference = (date1.getTime() - date6.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                String newstring = hold.newDate(date6);
            	System.out.println("\n***" + full + "Class5 has been expired since " + newstring + " (" + days + " days) ago.***");
            }
            //Class6
            if (date1.compareTo(date7) < 0) {
                long difference = (date1.getTime() - date7.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                if (days <= daystoexpire) {
                	String newstring = hold.newDate(date7);
                    System.out.println("\n**" + full + "Class6 expires on " + newstring + " (" + days + " days) from now.**" );
                }
            }
            else {
                long difference = (date1.getTime() - date7.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                String newstring = hold.newDate(date7);
            	System.out.println("\n***" + full + "Class6 has been expired since " + newstring + " (" + days + " days) ago.***");
            }
            //Class7
            if (date1.compareTo(date8) < 0) {
                long difference = (date1.getTime() - date8.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                if (days <= daystoexpire) {
                	String newstring = hold.newDate(date8);
                    System.out.println("\n**" + full + "Class7 expires on " + newstring + " (" + days + " days) from now.**" );
                }
            }
            else {
                long difference = (date1.getTime() - date8.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                String newstring = hold.newDate(date8);
            	System.out.println("\n***" + full + "Class7 has been expired since " + newstring + " (" + days + " days) ago.***");
            }
            //Class8
            if (date1.compareTo(date9) < 0) {
                long difference = (date1.getTime() - date9.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                if (days <= daystoexpire) {
                	String newstring = hold.newDate(date9);
                    System.out.println("\n**" + full + "Class8 expires on " + newstring + " (" + days + " days) from now.**" );
                }
            }
            else {
                long difference = (date1.getTime() - date9.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                String newstring = hold.newDate(date9);
            	System.out.println("\n***" + full + "Class8 has been expired since " + newstring + " (" + days + " days) ago.***");
            }
            //Class9
            if (date1.compareTo(date10) < 0) {
                long difference = (date1.getTime() - date10.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                if (days <= daystoexpire) {
                	String newstring = hold.newDate(date10);
                    System.out.println("\n**" + full + "Class9 expires on " + newstring + " (" + days + " days) from now.**" );
                }
            }
            else {
                long difference = (date1.getTime() - date10.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                String newstring = hold.newDate(date10);
            	System.out.println("\n***" + full + "Class9 has been expired since " + newstring + " (" + days + " days) ago.***");
            }
            //Class10
            if (date1.compareTo(date11) < 0) {
                long difference = (date1.getTime() - date11.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                if (days <= daystoexpire) {
                	String newstring = hold.newDate(date11);
                    System.out.println("\n**" + full + "Class10 expires on " + newstring + " (" + days + " days) from now.**" );
                }
            }
            else {
                long difference = (date1.getTime() - date11.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                String newstring = hold.newDate(date11);
            	System.out.println("\n***" + full + "Class10 has been expired since " + newstring + " (" + days + " days) ago.***");
            }
            //Class11
            if (date1.compareTo(date12) < 0) {
                long difference = (date1.getTime() - date12.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                if (days <= daystoexpire) {
                	String newstring = hold.newDate(date12);
                    System.out.println("\n**" + full + "Class11 expires on " + newstring + " (" + days + " days) from now.**" );
                }
            }
            else {
                long difference = (date1.getTime() - date12.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                String newstring = hold.newDate(date12);
            	System.out.println("\n***" + full + "Class11 has been expired since " + newstring + " (" + days + " days) ago.***");
            }
            //Class12
            if (date1.compareTo(date13) < 0) {
                long difference = (date1.getTime() - date13.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                if (days <= daystoexpire) {
                	String newstring = hold.newDate(date13);
                    System.out.println("\n**" + full + "Class12 expires on " + newstring + " (" + days + " days) from now.**" );
                }
            }
            else {
                long difference = (date1.getTime() - date13.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                String newstring = hold.newDate(date13);
            	System.out.println("\n***" + full + "Class12 has been expired since " + newstring + " (" + days + " days) ago.***");
            }
            //Class13
            if (date1.compareTo(date14) < 0) {
                long difference = (date1.getTime() - date14.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                if (days <= daystoexpire) {
                	String newstring = hold.newDate(date14);
                    System.out.println("\n**" + full + "Class13 expires on " + newstring + " (" + days + " days) from now.**" );
                }
            }
            else {
                long difference = (date1.getTime() - date14.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                String newstring = hold.newDate(date14);
            	System.out.println("\n***" + full + "Class13 has been expired since " + newstring + " (" + days + " days) ago.***");
            }
            //Class14
            if (date1.compareTo(date15) < 0) {
                long difference = (date1.getTime() - date15.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                if (days <= daystoexpire) {
                	String newstring = hold.newDate(date15);
                    System.out.println("\n**" + full + "Class14 expires on " + newstring + " (" + days + " days) from now.**" );
                }
            }
            else {
                long difference = (date1.getTime() - date15.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                String newstring = hold.newDate(date15);
            	System.out.println("\n***" + full + "Class14 has been expired since " + newstring + " (" + days + " days) ago.***");
            }
            //Class15
            if (date1.compareTo(date16) < 0) {
                long difference = (date1.getTime() - date16.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                if (days <= daystoexpire) {
                	String newstring = hold.newDate(date16);
                    System.out.println("\n**" + full + "Class15 expires on " + newstring + " (" + days + " days) from now.**" );
                }
            }
            else {
                long difference = (date1.getTime() - date16.getTime()) / 86400000;
                int days = (int) Math.abs(difference);
                String newstring = hold.newDate(date16);
            	System.out.println("\n***" + full + "Class15 has been expired since " + newstring + " (" + days + " days) ago.***");
            }
            System.out.println("=============================================================================================");   
            
        } catch (Exception e) {
            System.out.println(e);
        }
	}
}
