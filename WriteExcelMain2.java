import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelMain2 {
 
 public void writeFileUsingPOI(ArrayList < Employee > employeeList) throws IOException, ParseException {
	 
	 
	 
  //create blank workbook
  XSSFWorkbook workbook = new XSSFWorkbook(); 
 
  //Create a blank sheet
  XSSFSheet sheet = workbook.createSheet("Management");
 
 
  //Iterate over data and write to sheet
  
  int rownum = 0;
  
	  
  
  	Row row = sheet.createRow(rownum++);
	  
	  int i = 0;
	  Cell cell;

	  
	  cell = row.createCell(i);
	  cell.setCellValue("EmployeeID");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("First Name");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Last Name");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Class1");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Class2");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Class3");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Class4");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Class5");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Class6");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Class7");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Class8");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Class9");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Class10");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Class11");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Class12");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Class13");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Class14");
	  sheet.autoSizeColumn(i);
	  i++;
	  cell = row.createCell(i);
	  cell.setCellValue("Class15");
	  sheet.autoSizeColumn(i);
	  i++;
  

  for (Employee person : employeeList){
   row = sheet.createRow(rownum++);
 
   int cellnum = 0;
   CellStyle cellGreen = workbook.createCellStyle();
   CreationHelper createHelper = workbook.getCreationHelper();
   cellGreen.setDataFormat(createHelper.createDataFormat().getFormat("dd-mmm-yy"));
   cellGreen.setFillForegroundColor(IndexedColors.GREEN.getIndex());  
   cellGreen.setFillPattern(FillPatternType.SOLID_FOREGROUND);
   
   CellStyle cellRed = workbook.createCellStyle();
   cellRed.setDataFormat(createHelper.createDataFormat().getFormat("dd-mmm-yy"));
   cellRed.setFillForegroundColor(IndexedColors.RED.getIndex());  
   cellRed.setFillPattern(FillPatternType.SOLID_FOREGROUND);
   
   CellStyle cellOrange = workbook.createCellStyle();
   cellOrange.setDataFormat(createHelper.createDataFormat().getFormat("dd-mmm-yy"));
   cellOrange.setFillForegroundColor(IndexedColors.ORANGE.getIndex());  
   cellOrange.setFillPattern(FillPatternType.SOLID_FOREGROUND);
   
   LocalDateTime myDateObj = LocalDateTime.now();
   DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
   String LocalInformation = myDateObj.format(myFormatObj);
   Date date1 = null;
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
   String first = null;
   String last = null;
   String id = null;
   String full = null;
   int daystoexpire = 60;

   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
   Date mainDate = sdf.parse(LocalInformation);
   try {
           //employeeList.get(i).print();
       	first = (person.getFName());
       	last = (person.getLName());
       	id = (person.getEmployeeId());
       	full = (first + " " + last + "'s (" + id + ") ");
           date1 = sdf.parse(person.getClass1());
           date2 = sdf.parse(person.getClass2());
           date3 = sdf.parse(person.getClass3());
           date4 = sdf.parse(person.getClass4());
           date5 = sdf.parse(person.getClass5());
           date6 = sdf.parse(person.getClass6());
           date7 = sdf.parse(person.getClass7());
           date8 = sdf.parse(person.getClass8());
           date9 = sdf.parse(person.getClass9());
           date10 = sdf.parse(person.getClass10());
           date11 = sdf.parse(person.getClass11());
           date12 = sdf.parse(person.getClass12());
           date13 = sdf.parse(person.getClass13());
           date14 = sdf.parse(person.getClass14());
           date15 = sdf.parse(person.getClass15());
          
         //Entering for Work
         cell = row.createCell(cellnum); 
         cell.setCellValue(person.getEmployeeId());
         sheet.autoSizeColumn(cellnum);
         cellnum++;
         
         //Entering for First Name
         cell = row.createCell(cellnum);
         cell.setCellValue(person.getFName());
         sheet.autoSizeColumn(cellnum);
         cellnum++;
         
         //Entering for Last Name
         cell = row.createCell(cellnum);
         cell.setCellValue(person.getLName());
         sheet.autoSizeColumn(cellnum);
         cellnum++;
         
           //Class1
           if (mainDate.compareTo(date1) < 0) {
               long difference = (mainDate.getTime() - date1.getTime()) / 86400000;
               int days = (int) Math.abs(difference);
               if (days <= daystoexpire) {
            	   //These classes are expiring in the next 90 days.
            	   //The color will be orange.
             	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellOrange);
               	    cell.setCellValue(person.getClass1());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
               else if (days > daystoexpire) {
            	   //These classes aren't expiring soon.
            	   //This color will be green.
              	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellGreen);
               	    cell.setCellValue(person.getClass1());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
           }
           else {
               long difference = (mainDate.getTime() - date1.getTime()) / 86400000;
               //These classes have expired.
               //This color will be red.
         	    cell = row.createCell(cellnum);
           	    cell.setCellStyle(cellRed);
           	    cell.setCellValue(person.getClass1());
           	    sheet.autoSizeColumn(cellnum);
           	    cellnum++;
           }
           
           //Class2
           if (mainDate.compareTo(date2) < 0) {
               long difference = (mainDate.getTime() - date2.getTime()) / 86400000;
               int days = (int) Math.abs(difference);
               if (days <= daystoexpire) {
            	   //These classes are expiring in the next 90 days.
            	   //The color will be orange.
             	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellOrange);
               	    cell.setCellValue(person.getClass2());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
               else if (days > daystoexpire) {
            	   //These classes aren't expiring soon.
            	   //This color will be green.
              	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellGreen);
               	    cell.setCellValue(person.getClass2());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
           }
           else {
               long difference = (mainDate.getTime() - date2.getTime()) / 86400000;
               //These classes have expired.
               //This color will be red.
         	    cell = row.createCell(cellnum);
           	    cell.setCellStyle(cellRed);
           	    cell.setCellValue(person.getClass2());
           	    sheet.autoSizeColumn(cellnum);
           	    cellnum++;
           }
           
           //Class3
           if (mainDate.compareTo(date3) < 0) {
               long difference = (mainDate.getTime() - date3.getTime()) / 86400000;
               int days = (int) Math.abs(difference);
               if (days <= daystoexpire) {
            	   //These classes are expiring in the next 90 days.
            	   //The color will be orange.
             	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellOrange);
               	    cell.setCellValue(person.getClass3());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
               else if (days > daystoexpire) {
            	   //These classes aren't expiring soon.
            	   //This color will be green.
              	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellGreen);
               	    cell.setCellValue(person.getClass3());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
           }
           else {
               long difference = (mainDate.getTime() - date3.getTime()) / 86400000;
               //These classes have expired.
               //This color will be red.
         	    cell = row.createCell(cellnum);
           	    cell.setCellStyle(cellRed);
           	    cell.setCellValue(person.getClass3());
           	    sheet.autoSizeColumn(cellnum);
           	    cellnum++;
           }
           
           //Class4
           if (mainDate.compareTo(date4) < 0) {
               long difference = (mainDate.getTime() - date4.getTime()) / 86400000;
               int days = (int) Math.abs(difference);
               if (days <= daystoexpire) {
            	   //These classes are expiring in the next 90 days.
            	   //The color will be orange.
             	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellOrange);
               	    cell.setCellValue(person.getClass4());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
               else if (days > daystoexpire) {
            	   //These classes aren't expiring soon.
            	   //This color will be green.
              	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellGreen);
               	    cell.setCellValue(person.getClass4());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
           }
           else {
               long difference = (mainDate.getTime() - date4.getTime()) / 86400000;
               //These classes have expired.
               //This color will be red.
         	    cell = row.createCell(cellnum);
           	    cell.setCellStyle(cellRed);
           	    cell.setCellValue(person.getClass4());
           	    sheet.autoSizeColumn(cellnum);
           	    cellnum++;
           }
           
           //Class5
           if (mainDate.compareTo(date5) < 0) {
               long difference = (mainDate.getTime() - date5.getTime()) / 86400000;
               int days = (int) Math.abs(difference);
               if (days <= daystoexpire) {
            	   //These classes are expiring in the next 90 days.
            	   //The color will be orange.
             	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellOrange);
               	    cell.setCellValue(person.getClass5());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
               else if (days > daystoexpire) {
            	   //These classes aren't expiring soon.
            	   //This color will be green.
              	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellGreen);
               	    cell.setCellValue(person.getClass5());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
           }
           else {
               long difference = (mainDate.getTime() - date5.getTime()) / 86400000;
               //These classes have expired.
               //This color will be red.
         	    cell = row.createCell(cellnum);
           	    cell.setCellStyle(cellRed);
           	    cell.setCellValue(person.getClass5());
           	    sheet.autoSizeColumn(cellnum);
           	    cellnum++;
           }
           
           //Class6
           if (mainDate.compareTo(date6) < 0) {
               long difference = (mainDate.getTime() - date6.getTime()) / 86400000;
               int days = (int) Math.abs(difference);
               if (days <= daystoexpire) {
            	   //These classes are expiring in the next 90 days.
            	   //The color will be orange.
             	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellOrange);
               	    cell.setCellValue(person.getClass6());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
               else if (days > daystoexpire) {
            	   //These classes aren't expiring soon.
            	   //This color will be green.
              	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellGreen);
               	    cell.setCellValue(person.getClass6());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
           }
           else {
               long difference = (mainDate.getTime() - date6.getTime()) / 86400000;
               //These classes have expired.
               //This color will be red.
         	    cell = row.createCell(cellnum);
           	    cell.setCellStyle(cellRed);
           	    cell.setCellValue(person.getClass6());
           	    sheet.autoSizeColumn(cellnum);
           	    cellnum++;
           }
           
           //Class7
           if (mainDate.compareTo(date7) < 0) {
               long difference = (mainDate.getTime() - date7.getTime()) / 86400000;
               int days = (int) Math.abs(difference);
               if (days <= daystoexpire) {
            	   //These classes are expiring in the next 90 days.
            	   //The color will be orange.
             	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellOrange);
               	    cell.setCellValue(person.getClass7());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
               else if (days > daystoexpire) {
            	   //These classes aren't expiring soon.
            	   //This color will be green.
              	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellGreen);
               	    cell.setCellValue(person.getClass7());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
           }
           else {
               long difference = (mainDate.getTime() - date7.getTime()) / 86400000;
               //These classes have expired.
               //This color will be red.
         	    cell = row.createCell(cellnum);
           	    cell.setCellStyle(cellRed);
           	    cell.setCellValue(person.getClass7());
           	    sheet.autoSizeColumn(cellnum);
           	    cellnum++;
           }
           
           //Class8
           if (mainDate.compareTo(date8) < 0) {
               long difference = (mainDate.getTime() - date8.getTime()) / 86400000;
               int days = (int) Math.abs(difference);
               if (days <= daystoexpire) {
            	   //These classes are expiring in the next 90 days.
            	   //The color will be orange.
             	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellOrange);
               	    cell.setCellValue(person.getClass8());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
               else if (days > daystoexpire) {
            	   //These classes aren't expiring soon.
            	   //This color will be green.
              	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellGreen);
               	    cell.setCellValue(person.getClass8());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
           }
           else {
               long difference = (mainDate.getTime() - date8.getTime()) / 86400000;
               //These classes have expired.
               //This color will be red.
         	    cell = row.createCell(cellnum);
           	    cell.setCellStyle(cellRed);
           	    cell.setCellValue(person.getClass8());
           	    sheet.autoSizeColumn(cellnum);
           	    cellnum++;
           }
           
           //Class9
           if (mainDate.compareTo(date9) < 0) {
               long difference = (mainDate.getTime() - date9.getTime()) / 86400000;
               int days = (int) Math.abs(difference);
               if (days <= daystoexpire) {
            	   //These classes are expiring in the next 90 days.
            	   //The color will be orange.
             	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellOrange);
               	    cell.setCellValue(person.getClass9());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
               else if (days > daystoexpire) {
            	   //These classes aren't expiring soon.
            	   //This color will be green.
              	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellGreen);
               	    cell.setCellValue(person.getClass9());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
           }
           else {
               long difference = (mainDate.getTime() - date9.getTime()) / 86400000;
               //These classes have expired.
               //This color will be red.
         	    cell = row.createCell(cellnum);
           	    cell.setCellStyle(cellRed);
           	    cell.setCellValue(person.getClass9());
           	    sheet.autoSizeColumn(cellnum);
           	    cellnum++;
           }
           
           //Class10
           if (mainDate.compareTo(date10) < 0) {
               long difference = (mainDate.getTime() - date10.getTime()) / 86400000;
               int days = (int) Math.abs(difference);
               if (days <= daystoexpire) {
            	   //These classes are expiring in the next 90 days.
            	   //The color will be orange.
             	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellOrange);
               	    cell.setCellValue(person.getClass10());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
               else if (days > daystoexpire) {
            	   //These classes aren't expiring soon.
            	   //This color will be green.
              	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellGreen);
               	    cell.setCellValue(person.getClass10());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
           }
           else {
               long difference = (mainDate.getTime() - date10.getTime()) / 86400000;
               //These classes have expired.
               //This color will be red.
         	    cell = row.createCell(cellnum);
           	    cell.setCellStyle(cellRed);
           	    cell.setCellValue(person.getClass10());
           	    sheet.autoSizeColumn(cellnum);
           	    cellnum++;
           }
           
           //Class11
           if (mainDate.compareTo(date11) < 0) {
               long difference = (mainDate.getTime() - date11.getTime()) / 86400000;
               int days = (int) Math.abs(difference);
               if (days <= daystoexpire) {
            	   //These classes are expiring in the next 90 days.
            	   //The color will be orange.
             	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellOrange);
               	    cell.setCellValue(person.getClass11());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
               else if (days > daystoexpire) {
            	   //These classes aren't expiring soon.
            	   //This color will be green.
              	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellGreen);
               	    cell.setCellValue(person.getClass11());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
           }
           else {
               long difference = (mainDate.getTime() - date11.getTime()) / 86400000;
               //These classes have expired.
               //This color will be red.
         	    cell = row.createCell(cellnum);
           	    cell.setCellStyle(cellRed);
           	    cell.setCellValue(person.getClass11());
           	    sheet.autoSizeColumn(cellnum);
           	    cellnum++;
           }
           
           //Class12
           if (mainDate.compareTo(date12) < 0) {
               long difference = (mainDate.getTime() - date12.getTime()) / 86400000;
               int days = (int) Math.abs(difference);
               if (days <= daystoexpire) {
            	   //These classes are expiring in the next 90 days.
            	   //The color will be orange.
             	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellOrange);
               	    cell.setCellValue(person.getClass12());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
               else if (days > daystoexpire) {
            	   //These classes aren't expiring soon.
            	   //This color will be green.
              	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellGreen);
               	    cell.setCellValue(person.getClass12());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
           }
           else {
               long difference = (mainDate.getTime() - date12.getTime()) / 86400000;
               //These classes have expired.
               //This color will be red.
         	    cell = row.createCell(cellnum);
           	    cell.setCellStyle(cellRed);
           	    cell.setCellValue(person.getClass12());
           	    sheet.autoSizeColumn(cellnum);
           	    cellnum++;
           }
           
           //Class13
           if (mainDate.compareTo(date13) < 0) {
               long difference = (mainDate.getTime() - date13.getTime()) / 86400000;
               int days = (int) Math.abs(difference);
               if (days <= daystoexpire) {
            	   //These classes are expiring in the next 90 days.
            	   //The color will be orange.
             	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellOrange);
               	    cell.setCellValue(person.getClass13());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
               else if (days > daystoexpire) {
            	   //These classes aren't expiring soon.
            	   //This color will be green.
              	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellGreen);
               	    cell.setCellValue(person.getClass13());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
           }
           else {
               long difference = (mainDate.getTime() - date13.getTime()) / 86400000;
               //These classes have expired.
               //This color will be red.
         	    cell = row.createCell(cellnum);
           	    cell.setCellStyle(cellRed);
           	    cell.setCellValue(person.getClass13());
           	    sheet.autoSizeColumn(cellnum);
           	    cellnum++;
           }
           
           //Class14
           if (mainDate.compareTo(date14) < 0) {
               long difference = (mainDate.getTime() - date14.getTime()) / 86400000;
               int days = (int) Math.abs(difference);
               if (days <= daystoexpire) {
            	   //These classes are expiring in the next 90 days.
            	   //The color will be orange.
             	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellOrange);
               	    cell.setCellValue(person.getClass14());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
               else if (days > daystoexpire) {
            	   //These classes aren't expiring soon.
            	   //This color will be green.
              	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellGreen);
               	    cell.setCellValue(person.getClass14());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
           }
           else {
               long difference = (mainDate.getTime() - date14.getTime()) / 86400000;
               //These classes have expired.
               //This color will be red.
         	    cell = row.createCell(cellnum);
           	    cell.setCellStyle(cellRed);
           	    cell.setCellValue(person.getClass14());
           	    sheet.autoSizeColumn(cellnum);
           	    cellnum++;
           }
           
           //Class15
           if (mainDate.compareTo(date15) < 0) {
               long difference = (mainDate.getTime() - date15.getTime()) / 86400000;
               int days = (int) Math.abs(difference);
               if (days <= daystoexpire) {
            	   //These classes are expiring in the next 90 days.
            	   //The color will be orange.
             	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellOrange);
               	    cell.setCellValue(person.getClass15());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
               else if (days > daystoexpire) {
            	   //These classes aren't expiring soon.
            	   //This color will be green.
              	    cell = row.createCell(cellnum);
               	    cell.setCellStyle(cellGreen);
               	    cell.setCellValue(person.getClass15());
               	    sheet.autoSizeColumn(cellnum);
               	    cellnum++;
               }
           }
           else {
               long difference = (mainDate.getTime() - date15.getTime()) / 86400000;
               //These classes have expired.
               //This color will be red.
         	    cell = row.createCell(cellnum);
           	    cell.setCellStyle(cellRed);
           	    cell.setCellValue(person.getClass15());
           	    sheet.autoSizeColumn(cellnum);
           	    cellnum++;
           }
                    
       
   } catch (Exception e) {
       System.out.println(e);
   }
   
    
    
  }
  
  try {
   //Write the workbook in file system
   FileOutputStream out = new FileOutputStream(new File("EmployeeManager2.xlsx"));
   workbook.write(out);
   out.close();
   System.out.println("EmployeeManager.xlsx has been created successfully");
  }catch (Exception e){
   e.printStackTrace();
  }
  finally {
   workbook.close();
  }
 }
 
 
}
