package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	//public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//	ReadExcel read = new ReadExcel();
	//	read.getData("Login");

	//}
	
	public String[][] getData(String excelSheetname) throws EncryptedDocumentException, IOException
	{
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\ExcelFiles\\DataProviderExcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheetName = wb.getSheet(excelSheetname);
		
		int totalRows = sheetName.getLastRowNum();
		System.out.println(totalRows);
		Row rowCells = sheetName.getRow(0);
		int totalColumns= rowCells.getLastCellNum();
		System.out.println(totalColumns);
		
		DataFormatter format = new DataFormatter();
		
		String testData[][] =  new String[totalRows][totalColumns];
		
		for (int i= 1; i<=totalRows; i++) {
			for(int j=0; j<totalColumns;j++) {
				testData[i-1][j]=format.formatCellValue(sheetName.getRow(i).getCell(j));
				System.out.println(testData[i-1][j]);
				
				
			}
		}
		
		return testData;

}
}
