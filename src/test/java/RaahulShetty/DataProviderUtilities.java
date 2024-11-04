package RaahulShetty;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUtilities {

	@Test(dataProvider="data")
	public void m1(String name,String sur,String email) {
		System.out.println(name+" :"+sur+":"+email);
	}
	
	@DataProvider(name="data")
	public static Object[][] dataProviderMethod() throws IOException{
		return getData();
	}
	
	
	public static Object[][] getData() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\vikra\\OneDrive\\Desktop\\TestData.xlsx");
		XSSFWorkbook eb=new XSSFWorkbook(fis);
		XSSFSheet sheet = eb.getSheet("Data");
		int rows = sheet.getLastRowNum();
		short columns = sheet.getRow(0).getLastCellNum();
		Object data[][]=new Object[rows][columns];
		DataFormatter formatter=new DataFormatter();
		for(int i=0;i<rows; i++) {
			 XSSFRow row = sheet.getRow(i+1);
			for(int j=0;j<columns; j++) {
				
				 XSSFCell value = row.getCell(j);
				// CellType cellType = value.getCellType();
				 //CellType numeric = cellType.NUMERIC;
				// if(NumberToTextConverter.toText(value.getNumericCellValue()))
				data[i][j]= formatter.formatCellValue(value);
				// System.out.println(value);
			}
			
		}
		return data;
	}

}
