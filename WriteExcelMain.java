import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelMain {
 
 public void writeFileUsingPOI(ArrayList < Employee > employeeList) throws IOException {
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
   CellStyle cellStyle = workbook.createCellStyle();
   CreationHelper createHelper = workbook.getCreationHelper();
   cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-mmm-yy"));

   
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
    //Entering for Class1
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum);   
    cell.setCellValue(person.getClass1());
    sheet.autoSizeColumn(cellnum);
    cellnum++;
    //Entering for Class2    
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum);
    cell.setCellValue(person.getClass2());
    sheet.autoSizeColumn(cellnum);
    cellnum++;
    //Entering for Class3
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum);
    cell.setCellValue(person.getClass3());
    sheet.autoSizeColumn(cellnum);
    cellnum++;
    //Entering for Class4
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum);
    cell.setCellValue(person.getClass4());
    sheet.autoSizeColumn(cellnum);
    cellnum++;
    //Entering for Class5
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum);
    cell.setCellValue(person.getClass5()); 
    sheet.autoSizeColumn(cellnum);
    cellnum++;
    //Entering for Class6
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum);
    cell.setCellValue(person.getClass6()); 
    sheet.autoSizeColumn(cellnum);
    cellnum++;
    //Entering for Class7
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum);
    cell.setCellValue(person.getClass7()); 
    sheet.autoSizeColumn(cellnum);
    cellnum++;
    //Entering for Class8
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum);
    cell.setCellValue(person.getClass8()); 
    sheet.autoSizeColumn(cellnum);
    cellnum++;
    //Entering for Class9
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum);
    cell.setCellValue(person.getClass9()); 
    sheet.autoSizeColumn(cellnum);
    cellnum++;
    //Entering for Class10
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum);
    cell.setCellValue(person.getClass10()); 
    sheet.autoSizeColumn(cellnum);
    cellnum++;
    //Entering for Class11
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum);
    cell.setCellValue(person.getClass11()); 
    sheet.autoSizeColumn(cellnum);
    cellnum++;
    //Entering for Class12
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum);
    cell.setCellValue(person.getClass12()); 
    sheet.autoSizeColumn(cellnum);
    cellnum++;
    //Entering for Class13
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum);
    cell.setCellValue(person.getClass13()); 
    sheet.autoSizeColumn(cellnum);
    cellnum++;
    //Entering for Class14
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum);
    cell.setCellValue(person.getClass14()); 
    sheet.autoSizeColumn(cellnum);
    cellnum++;
    //Entering for Class15
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum);
    cell.setCellValue(person.getClass15()); 
    sheet.autoSizeColumn(cellnum);
    cellnum++;
    
    
  }
  try {
   //Write the workbook in file system
   FileOutputStream out = new FileOutputStream(new File("EmployeeManager.xlsx"));
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
