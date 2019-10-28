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

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(LocalInformation);
        try {
            for (int i = 0; i < employeeList.size(); i++) {
                employeeList.get(i).print();
                date2 = sdf.parse(employeeList.get(i).getClass1());
                date3 = sdf.parse(employeeList.get(i).getClass2());
//                date4 = sdf.parse(employeeList.get(i).getClass3());
//                date5 = sdf.parse(employeeList.get(i).getClass4());
//                date6 = sdf.parse(employeeList.get(i).getClass5());
//                date7 = sdf.parse(employeeList.get(i).getClass6());
//                date8 = sdf.parse(employeeList.get(i).getClass7());
//                date9 = sdf.parse(employeeList.get(i).getClass8());
//                date10 = sdf.parse(employeeList.get(i).getClass9());
//                date11 = sdf.parse(employeeList.get(i).getClass10());
//                date12 = sdf.parse(employeeList.get(i).getClass11());
//                date13 = sdf.parse(employeeList.get(i).getClass12());
//                date14 = sdf.parse(employeeList.get(i).getClass13());
//                date15 = sdf.parse(employeeList.get(i).getClass14());
//                date16 = sdf.parse(employeeList.get(i).getClass15());

                
                if (date1.compareTo(date2) < 0) {
                    long difference = (date1.getTime() - date2.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= 30) {
                        System.out.println("\n**Class1 is expiring in " + days + " days.**");
                    }
                    //System.out.println(days);
                }
                else {
                    long difference = (date1.getTime() - date2.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                	System.out.println("\n***Class1 has been expired for " + days + " days.***");
                }
                if (date1.compareTo(date3) < 0) {
                    long difference = (date1.getTime() - date3.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                    if (days <= 30) {
                        System.out.println("\n**Class2 is expiring in " + days + " days.**");
                    }
                    //System.out.println(days);
                }
                else {
                    long difference = (date1.getTime() - date3.getTime()) / 86400000;
                    int days = (int) Math.abs(difference);
                	System.out.println("\n***Class2 has been expired for " + days + " days.***\n");
                }
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }

        //System.out.println("date1 : " + sdf.format(date1));
        //System.out.println("date2 : " + sdf.format(date2));
    }

}
