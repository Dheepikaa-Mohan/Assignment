package guvitask8;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAndSheetCreation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	XSSFWorkbook book = new XSSFWorkbook();
		
		XSSFSheet sheet = book.createSheet("Sheet1");
			
			try {
			FileOutputStream output = new FileOutputStream("C:\\Users\\surya\\eclipse-workspace\\ExcelReadWrite\\src\\main\\java\\guvitask8\\ExcelAndSheetCreation.xlsx");
			book.write(output);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		book.close();
		}

	}


