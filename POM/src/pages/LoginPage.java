package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.record.formula.functions.Row;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;

public class LoginPage {

	HSSFWorkbook workbook;
	HSSFSheet sheet;
	HSSFRow hssfRow;
	HSSFCell hssfCell;
	FileInputStream inputStream;
	Row row;
	Column column;
	Cell cell;

	public void setFile(String filePath) {
		try {
			inputStream = new FileInputStream(filePath);
			workbook = new HSSFWorkbook(inputStream);
			sheet = workbook.getSheet("Sheet1");
			int k = sheet.getLastRowNum();
			System.out.println(k);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
