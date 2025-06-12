package guvitask8;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook book =new XSSFWorkbook("C:\\Users\\surya\\eclipse-workspace\\ExcelReadWrite\\src\\main\\java\\guvitask8\\WritingData.xlsx");
		
XSSFSheet sheet = book.getSheet("LoginSheet");
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		for(int i=1; i<=rowCount; i++) {
			
			XSSFRow row = sheet.getRow(i);
		
			for(int j=0; j<columnCount ; j++) {
				
				XSSFCell cell = row.getCell(j);
		System.out.print(cell.getStringCellValue()+" ");
			}
			System.out.println();
		book.close();
			}
		}
}
