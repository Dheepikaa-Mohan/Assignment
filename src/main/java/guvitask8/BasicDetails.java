package guvitask8;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BasicDetails {

	
	public static void main(String[] args) throws IOException {
XSSFWorkbook book = new XSSFWorkbook();
	
	XSSFSheet sheet = book.createSheet("BasicDetailss");
				Object[][] data = {
				{"Name","Age","Email"},
				{"John Doe",30,"john@test.com"},
				{"Jane Doe",28,"john@test.com"},
				{"Bob Smith",35,"jacky@example.com"},
				{"Swapnil",37,"swapnil@example.com"}
		};
		int rowCount=0;
	for(Object[] row1 : data) {
		XSSFRow row = sheet.createRow(rowCount++);
			
			int columnCount=0;
			for(Object col : row1) {
		XSSFCell cell = row.createCell(columnCount++);
				if(col instanceof String) {
					
					cell.setCellValue((String)col);
					
				} else  if (col instanceof Integer) {
					
					cell.setCellValue((Integer)col);
				}
			}

	}
		try {
			FileOutputStream output = new FileOutputStream("C:\\Users\\surya\\eclipse-workspace\\ExcelReadWrite\\src\\main\\java\\guvitask8\\BasicDetails.xlsx");
			book.write(output);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		book.close();
	}}
