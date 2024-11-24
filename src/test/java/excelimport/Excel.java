package excelimport;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\framework\\excel\\karthi.xlsx");
	FileInputStream fileinputstream	 = new FileInputStream(file); 
	try (Workbook workbook = new XSSFWorkbook(fileinputstream)) {
		org.apache.poi.ss.usermodel.Sheet sheet= workbook.getSheet("mic");
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i); 
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell.toString());
			}
		}
	}
	
	
	
	
}
}
