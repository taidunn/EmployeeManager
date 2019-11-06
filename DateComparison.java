import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class DateComparison {

    public void DateComparison(ArrayList < Employee > employeeList) throws ParseException {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String LocalInformation = myDateObj.format(myFormatObj);
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
                //employeeList.get(i).print();
            	first = (employeeList.get(i).getFName());
            	last = (employeeList.get(i).getLName());
            	id = (employeeList.get(i).getEmployeeId());
            	full = (first + " " + last + "'s (" + id + ") ");
                date2 = sdf.parse(employeeList.get(i).getClass1());
                date3 = sdf.parse(employeeList.get(i).getClass2());
                date4 = sdf.parse(employeeList.get(i).getClass3());
                date5 = sdf.parse(employeeList.get(i).getClass4());
                date6 = sdf.parse(employeeList.get(i).getClass5());
                date7 = sdf.parse(employeeList.get(i).getClass6());
                date8 = sdf.parse(employeeList.get(i).getClass7());
                date9 = sdf.parse(employeeList.get(i).getClass8());
                date10 = sdf.parse(employeeList.get(i).getClass9());
                date11 = sdf.parse(employeeList.get(i).getClass10());
                date12 = sdf.parse(employeeList.get(i).getClass11());
                date13 = sdf.parse(employeeList.get(i).getClass12());
                date14 = sdf.parse(employeeList.get(i).getClass13());
                date15 = sdf.parse(employeeList.get(i).getClass14());
                date16 = sdf.parse(employeeList.get(i).getClass15());

                
                //Class1
                if (date1.compareTo(date2) < 0) {
                    long difference = (date1.getTime() - date2.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= daystoexpire) {
                    	String newstring = employeeList.get(i).newDate(date2);
                        System.out.println("\n**" + full + "Class1 expires on " + newstring + " (" + days + " days) from now.**" );
                    }
                }
                else {
                    long difference = (date1.getTime() - date2.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    String newstring = employeeList.get(i).newDate(date2);
                	System.out.println("\n***" + full + "Class1 has been expired since " + newstring + " (" + days + " days) ago.***");
                }
                //Class2
                if (date1.compareTo(date3) < 0) {
                    long difference = (date1.getTime() - date3.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= daystoexpire) {
                    	String newstring = employeeList.get(i).newDate(date3);
                        System.out.println("\n**" + full + "Class2 expires on " + newstring + " (" + days + " days) from now.**" );
                    }
                }
                else {
                    long difference = (date1.getTime() - date3.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    String newstring = employeeList.get(i).newDate(date3);
                	System.out.println("\n***" + full + "Class2 has been expired since " + newstring + " (" + days + " days) ago.***");
                }
                //Class3
                if (date1.compareTo(date4) < 0) {
                    long difference = (date1.getTime() - date4.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= daystoexpire) {
                    	String newstring = employeeList.get(i).newDate(date4);
                        System.out.println("\n**" + full + "Class3 expires on " + newstring + " (" + days + " days) from now.**" );
                    }
                }
                else {
                    long difference = (date1.getTime() - date4.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    String newstring = employeeList.get(i).newDate(date4);
                	System.out.println("\n***" + full + "Class3 has been expired since " + newstring + " (" + days + " days) ago.***");
                }
                //Class4
                if (date1.compareTo(date5) < 0) {
                    long difference = (date1.getTime() - date5.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= daystoexpire) {
                    	String newstring = employeeList.get(i).newDate(date5);
                        System.out.println("\n**" + full + "Class4 expires on " + newstring + " (" + days + " days) from now.**" );
                    }
                }
                else {
                    long difference = (date1.getTime() - date5.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    String newstring = employeeList.get(i).newDate(date5);
                	System.out.println("\n***" + full + "Class4 has been expired since " + newstring + " (" + days + " days) ago.***");
                }
                //Class5
                if (date1.compareTo(date6) < 0) {
                    long difference = (date1.getTime() - date6.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= daystoexpire) {
                    	String newstring = employeeList.get(i).newDate(date6);
                        System.out.println("\n**" + full + "Class5 expires on " + newstring + " (" + days + " days) from now.**" );
                    }
                }
                else {
                    long difference = (date1.getTime() - date6.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    String newstring = employeeList.get(i).newDate(date6);
                	System.out.println("\n***" + full + "Class5 has been expired since " + newstring + " (" + days + " days) ago.***");
                }
                //Class6
                if (date1.compareTo(date7) < 0) {
                    long difference = (date1.getTime() - date7.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= daystoexpire) {
                    	String newstring = employeeList.get(i).newDate(date7);
                        System.out.println("\n**" + full + "Class6 expires on " + newstring + " (" + days + " days) from now.**" );
                    }
                }
                else {
                    long difference = (date1.getTime() - date7.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    String newstring = employeeList.get(i).newDate(date7);
                	System.out.println("\n***" + full + "Class6 has been expired since " + newstring + " (" + days + " days) ago.***");
                }
                //Class7
                if (date1.compareTo(date8) < 0) {
                    long difference = (date1.getTime() - date8.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= daystoexpire) {
                    	String newstring = employeeList.get(i).newDate(date8);
                        System.out.println("\n**" + full + "Class7 expires on " + newstring + " (" + days + " days) from now.**" );
                    }
                }
                else {
                    long difference = (date1.getTime() - date8.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    String newstring = employeeList.get(i).newDate(date8);
                	System.out.println("\n***" + full + "Class7 has been expired since " + newstring + " (" + days + " days) ago.***");
                }
                //Class8
                if (date1.compareTo(date9) < 0) {
                    long difference = (date1.getTime() - date9.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= daystoexpire) {
                    	String newstring = employeeList.get(i).newDate(date9);
                        System.out.println("\n**" + full + "Class8 expires on " + newstring + " (" + days + " days) from now.**" );
                    }
                }
                else {
                    long difference = (date1.getTime() - date9.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    String newstring = employeeList.get(i).newDate(date9);
                	System.out.println("\n***" + full + "Class8 has been expired since " + newstring + " (" + days + " days) ago.***");
                }
                //Class9
                if (date1.compareTo(date10) < 0) {
                    long difference = (date1.getTime() - date10.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= daystoexpire) {
                    	String newstring = employeeList.get(i).newDate(date10);
                        System.out.println("\n**" + full + "Class9 expires on " + newstring + " (" + days + " days) from now.**" );
                    }
                }
                else {
                    long difference = (date1.getTime() - date10.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    String newstring = employeeList.get(i).newDate(date10);
                	System.out.println("\n***" + full + "Class9 has been expired since " + newstring + " (" + days + " days) ago.***");
                }
                //Class10
                if (date1.compareTo(date11) < 0) {
                    long difference = (date1.getTime() - date11.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= daystoexpire) {
                    	String newstring = employeeList.get(i).newDate(date11);
                        System.out.println("\n**" + full + "Class10 expires on " + newstring + " (" + days + " days) from now.**" );
                    }
                }
                else {
                    long difference = (date1.getTime() - date11.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    String newstring = employeeList.get(i).newDate(date11);
                	System.out.println("\n***" + full + "Class10 has been expired since " + newstring + " (" + days + " days) ago.***");
                }
                //Class11
                if (date1.compareTo(date12) < 0) {
                    long difference = (date1.getTime() - date12.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= daystoexpire) {
                    	String newstring = employeeList.get(i).newDate(date12);
                        System.out.println("\n**" + full + "Class11 expires on " + newstring + " (" + days + " days) from now.**" );
                    }
                }
                else {
                    long difference = (date1.getTime() - date12.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    String newstring = employeeList.get(i).newDate(date12);
                	System.out.println("\n***" + full + "Class11 has been expired since " + newstring + " (" + days + " days) ago.***");
                }
                //Class12
                if (date1.compareTo(date13) < 0) {
                    long difference = (date1.getTime() - date13.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= daystoexpire) {
                    	String newstring = employeeList.get(i).newDate(date13);
                        System.out.println("\n**" + full + "Class12 expires on " + newstring + " (" + days + " days) from now.**" );
                    }
                }
                else {
                    long difference = (date1.getTime() - date13.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    String newstring = employeeList.get(i).newDate(date13);
                	System.out.println("\n***" + full + "Class12 has been expired since " + newstring + " (" + days + " days) ago.***");
                }
                //Class13
                if (date1.compareTo(date14) < 0) {
                    long difference = (date1.getTime() - date14.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= daystoexpire) {
                    	String newstring = employeeList.get(i).newDate(date14);
                        System.out.println("\n**" + full + "Class13 expires on " + newstring + " (" + days + " days) from now.**" );
                    }
                }
                else {
                    long difference = (date1.getTime() - date14.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    String newstring = employeeList.get(i).newDate(date14);
                	System.out.println("\n***" + full + "Class13 has been expired since " + newstring + " (" + days + " days) ago.***");
                }
                //Class14
                if (date1.compareTo(date15) < 0) {
                    long difference = (date1.getTime() - date15.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= daystoexpire) {
                    	String newstring = employeeList.get(i).newDate(date15);
                        System.out.println("\n**" + full + "Class14 expires on " + newstring + " (" + days + " days) from now.**" );
                    }
                }
                else {
                    long difference = (date1.getTime() - date15.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    String newstring = employeeList.get(i).newDate(date15);
                	System.out.println("\n***" + full + "Class14 has been expired since " + newstring + " (" + days + " days) ago.***");
                }
                //Class15
                if (date1.compareTo(date16) < 0) {
                    long difference = (date1.getTime() - date16.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= daystoexpire) {
                    	String newstring = employeeList.get(i).newDate(date16);
                        System.out.println("\n**" + full + "Class15 expires on " + newstring + " (" + days + " days) from now.**" );
                    }
                }
                else {
                    long difference = (date1.getTime() - date16.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    String newstring = employeeList.get(i).newDate(date16);
                	System.out.println("\n***" + full + "Class15 has been expired since " + newstring + " (" + days + " days) ago.***");
                }
                

            }
            
        } catch (Exception e) {
            System.out.println(e);
        }

        //System.out.println("date1 : " + sdf.format(date1));
        //System.out.println("date2 : " + sdf.format(date2));
    }

}
