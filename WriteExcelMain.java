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
  for (Employee person : employeeList){
   Row row = sheet.createRow(rownum++);
 
   int cellnum = 0;
   Cell cell;
   CellStyle cellStyle = workbook.createCellStyle();
   CreationHelper createHelper = workbook.getCreationHelper();
   cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-mmm-yy"));
   cell = row.createCell(cellnum++);
   
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum++); 
    cell.setCellValue(person.getEmployeeId());
    
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getFName());
    
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getLName());
    
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum++);   
    cell.setCellValue(person.getClass1());
    
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getClass2());
    
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getClass3());
    
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getClass4());
    
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getClass5());
    
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getClass6());
    
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getClass7());
    
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getClass8());
    
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getClass9());
    
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getClass10());
    
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getClass11());
    
    cell.setCellStyle(cellStyle);
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getClass12());
    
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getClass13());
    
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getClass14());
    
    cell = row.createCell(cellnum++);
    cell.setCellValue(person.getClass15());
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
