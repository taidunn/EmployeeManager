import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelMain2 {
	
	public void writeFileUsingPOI(ArrayList<Employee> employeeList) throws IOException, ParseException {

		// create blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Create a blank sheet
		XSSFSheet sheet = workbook.createSheet("Management");

		// Iterate over data and write to sheet

		int rownum = 0;

		CellStyle cellMain = workbook.createCellStyle();
		CreationHelper createHelper = workbook.getCreationHelper();
		cellMain.setBorderBottom(BorderStyle.THIN);
		cellMain.setBorderTop(BorderStyle.THIN);
		cellMain.setBorderLeft(BorderStyle.THIN);
		cellMain.setBorderRight(BorderStyle.THIN);
		XSSFFont font = workbook.createFont();
		font.setFontHeightInPoints((short) 14);
		font.setBold(true);
		font.setItalic(false);
		cellMain.setFont(font);
		cellMain.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
		cellMain.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		CellStyle classNames = workbook.createCellStyle();
		classNames.setBorderBottom(BorderStyle.THIN);
		classNames.setBorderTop(BorderStyle.THIN);
		classNames.setBorderLeft(BorderStyle.THIN);
		classNames.setBorderRight(BorderStyle.THIN);
		font = workbook.createFont();
		font.setFontHeightInPoints((short) 11);
		font.setBold(true);
		font.setItalic(false);
		classNames.setFont(font);
		classNames.setFillForegroundColor(IndexedColors.AQUA.getIndex());
		classNames.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		Row row = sheet.createRow(rownum++);

		// int CL = 0;
		Cell cell;
		//
		// cell = row.createCell(CL);
		// cell.setCellStyle(cellMain);
		// cell.setCellValue(" **** THIS IS A PLACEHOLDER FOR NOW **** ");
		// CL++;
		//
		// row = sheet.createRow(rownum++);

		int i = 0;

		cell = row.createCell(i);
		cell.setCellStyle(cellMain);
		cell.setCellValue("EmployeeID");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(cellMain);
		cell.setCellValue("Name (Last, First)");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(classNames);
		cell.setCellValue("Class1");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(classNames);
		cell.setCellValue("Class2");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(classNames);
		cell.setCellValue("Class3");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(classNames);
		cell.setCellValue("Class4");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(classNames);
		cell.setCellValue("Class5");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(classNames);
		cell.setCellValue("Class6");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(classNames);
		cell.setCellValue("Class7");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(classNames);
		cell.setCellValue("Class8");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(classNames);
		cell.setCellValue("Class9");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(classNames);
		cell.setCellValue("Class10");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(classNames);
		cell.setCellValue("Class11");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(classNames);
		cell.setCellValue("Class12");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(classNames);
		cell.setCellValue("Class13");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(classNames);
		cell.setCellValue("Class14");
		sheet.autoSizeColumn(i);
		i++;
		cell = row.createCell(i);
		cell.setCellStyle(classNames);
		cell.setCellValue("Class15");
		sheet.autoSizeColumn(i);
		i++;

		for (Employee person : employeeList) {
			row = sheet.createRow(rownum++);

			int cellnum = 0;
			CellStyle cellGreen = workbook.createCellStyle();
			// CreationHelper createHelper = workbook.getCreationHelper();
			cellGreen.setDataFormat(createHelper.createDataFormat().getFormat("dd-mmm-yy"));
			cellGreen.setBorderBottom(BorderStyle.THIN);
			cellGreen.setBorderTop(BorderStyle.THIN);
			cellGreen.setBorderLeft(BorderStyle.THIN);
			cellGreen.setBorderRight(BorderStyle.THIN);
			cellGreen.setFillForegroundColor(IndexedColors.SEA_GREEN.getIndex());
			cellGreen.setFillPattern(FillPatternType.SOLID_FOREGROUND);

			CellStyle cellRed = workbook.createCellStyle();
			cellRed.setDataFormat(createHelper.createDataFormat().getFormat("dd-mmm-yy"));
			cellRed.setBorderBottom(BorderStyle.THIN);
			cellRed.setBorderTop(BorderStyle.THIN);
			cellRed.setBorderLeft(BorderStyle.THIN);
			cellRed.setBorderRight(BorderStyle.THIN);
			cellRed.setFillForegroundColor(IndexedColors.RED.getIndex());
			cellRed.setFillPattern(FillPatternType.SOLID_FOREGROUND);

			CellStyle cellOrange = workbook.createCellStyle();
			cellOrange.setDataFormat(createHelper.createDataFormat().getFormat("dd-mmm-yy"));
			cellOrange.setBorderBottom(BorderStyle.THIN);
			cellOrange.setBorderTop(BorderStyle.THIN);
			cellOrange.setBorderLeft(BorderStyle.THIN);
			cellOrange.setBorderRight(BorderStyle.THIN);
			cellOrange.setFillForegroundColor(IndexedColors.LIGHT_ORANGE.getIndex());
			cellOrange.setFillPattern(FillPatternType.SOLID_FOREGROUND);

			CellStyle cellEmpID = workbook.createCellStyle();
			cellEmpID.setDataFormat(createHelper.createDataFormat().getFormat("dd-mmm-yy"));
			cellEmpID.setBorderBottom(BorderStyle.THIN);
			cellEmpID.setBorderTop(BorderStyle.THIN);
			cellEmpID.setBorderLeft(BorderStyle.THIN);
			cellEmpID.setBorderRight(BorderStyle.THIN);
			font = workbook.createFont();
			font.setBold(true);
			cellEmpID.setFont(font);
			cellEmpID.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
			cellEmpID.setFillPattern(FillPatternType.SOLID_FOREGROUND);

			CellStyle cellEmpName = workbook.createCellStyle();
			cellEmpName.setDataFormat(createHelper.createDataFormat().getFormat("dd-mmm-yy"));
			cellEmpName.setBorderBottom(BorderStyle.THIN);
			cellEmpName.setBorderTop(BorderStyle.THIN);
			cellEmpName.setBorderLeft(BorderStyle.THIN);
			cellEmpName.setBorderRight(BorderStyle.THIN);

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
			List<Date> dates = new ArrayList<Date>();
			
			String first = null;
			String last = null;
			String id = null;
			String full = null;
			int daystoexpire = 60;

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date mainDate = sdf.parse(LocalInformation);
			first = (person.getFName());
			last = (person.getLName());
			id = (person.getEmployeeId());
			full = (last + ", " + first);

			for (String classDate : person.getClasses()) {
				Date date = null;
				try {
					date = sdf.parse(classDate);
				} catch (Exception e) {
					
				}
				dates.add(date);
			}

			// Entering for Work
			cell = row.createCell(cellnum);
			cell.setCellStyle(cellEmpID);
			cell.setCellValue(id);
			sheet.autoSizeColumn(cellnum);
			cellnum++;

			// Entering for Full Name
			cell = row.createCell(cellnum);
			cell.setCellStyle(cellEmpName);
			cell.setCellValue(full);
			sheet.autoSizeColumn(cellnum);
			cellnum++;
			
			for (Date date : dates) {
				if (date == null) {
					cell = row.createCell(cellnum);
					cell.setCellStyle(cellGreen);
					cell.setCellValue("N/A");
					sheet.autoSizeColumn(cellnum);
					cellnum++;
					continue;
				}
				
				if (mainDate.compareTo(date) < 0) {
					long difference = (mainDate.getTime() - date.getTime()) / 86400000;
					int days = (int) Math.abs(difference);
					if (days <= daystoexpire) {
						// These classes are expiring in the next 90 days.
						// The color will be orange.
						cell = row.createCell(cellnum);
						cell.setCellStyle(cellOrange);
						cell.setCellValue(date);
						sheet.autoSizeColumn(cellnum);
						cellnum++;
					} else if (days > daystoexpire) {
						// These classes aren't expiring soon.
						// This color will be green.
						cell = row.createCell(cellnum);
						cell.setCellStyle(cellGreen);
						cell.setCellValue(date);
						sheet.autoSizeColumn(cellnum);
						cellnum++;
					}
				} else {
					long difference = (mainDate.getTime() - date.getTime()) / 86400000;
					// These classes have expired.
					// This color will be red.
					cell = row.createCell(cellnum);
					cell.setCellStyle(cellRed);
					cell.setCellValue(date);
					sheet.autoSizeColumn(cellnum);
					cellnum++;
				}
			}


		}

		try {
			// Write the workbook in file system
			FileOutputStream out = new FileOutputStream(new File("AdvancedEmpManager.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("AdvancedEmpManager.xlsx has been created successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			workbook.close();
		}
	}

}
