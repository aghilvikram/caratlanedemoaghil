package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {
	public Object[][] getData() throws IOException{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"testdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("data");
		int noOfRows = sheet.getLastRowNum();
		System.out.println(noOfRows);
		short noOfCols = sheet.getRow(0).getLastCellNum();
		System.out.println(noOfCols);
		String data=null;
		for(int i=1; i<noOfRows; i++) {
			for(int j=0; j<noOfCols; j++) {
				String values = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(values);
				data=values;
			}
		}
		return null;
	}

}
