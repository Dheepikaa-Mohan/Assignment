package guvitask8;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData {
public static void main(String[] args) throws IOException {
XSSFWorkbook book = new XSSFWorkbook();
		
		XSSFSheet sheet = book.createSheet("LoginSheet");
		
		Object[][] data = {
				{"Name","Age","City"},
				{"Agilan",20,"Chennai"},
				{"Arya",25,"Chennai"},
				{"Sai Madhi",26,"Chennai"},	
				{"Sakthi",15,"Chennai"}
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
			FileOutputStream output = new FileOutputStream("C:\\Users\\surya\\eclipse-workspace\\ExcelReadWrite\\src\\main\\java\\guvitask8\\WritingData.xlsx");
			book.write(output);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		book.close();
	}}

