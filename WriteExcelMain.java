/*import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelMain {
 
 public static void main(String[] args) throws IOException {
	 new WriteExcelMain().writeFileUsingPOI();
   }
 
 public void writeFileUsingPOI() throws IOException 
 {
  //create blank workbook
  XSSFWorkbook workbook = new XSSFWorkbook(); 
 
  //Create a blank sheet
  XSSFSheet sheet = workbook.createSheet("Country");
 
//  ArrayList<Object[]> data=new ArrayList<Object[]>();
  ArrayList<Employee> employeeList = new ArrayList<>();
 
  //Iterate over data and write to sheet
  int rownum = 0;
  for (Employee person : employeeList)
  {
   Row row = sheet.createRow(rownum++);
 
   int cellnum = 0;
   for (Object obj : person)
   {
    Cell cell = row.createCell(cellnum++);
    if(obj instanceof String)
     cell.setCellValue((String)obj);
    else if(obj instanceof Double)
     cell.setCellValue((Double)obj);
    else if(obj instanceof Integer)
     cell.setCellValue((Integer)obj);
   }
  }
  try
  {
   //Write the workbook in file system
   FileOutputStream out = new FileOutputStream(new File("CountriesDetails.xlsx"));
   workbook.write(out);
   out.close();
   System.out.println("CountriesDetails.xlsx has been created successfully");
  } 
  catch (Exception e) 
  {
   e.printStackTrace();
  }
  finally {
   workbook.close();
  }
 }
 
 
}*/
