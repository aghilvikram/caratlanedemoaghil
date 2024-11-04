package RaahulShetty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static  ArrayList getData() throws Exception {
		
		ArrayList<String> al=new ArrayList<String>();
		String val;
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\vikra\\OneDrive\\Desktop\\TestData.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		String sheetName = workbook.getSheetName(0);
		int noOfSheets = workbook.getNumberOfSheets();
		XSSFSheet sheet = workbook.getSheet("Data");
		Iterator<Row> rows = sheet.iterator();
		Row row = rows.next();
		Iterator<Cell> cells = row.cellIterator();
		int k=0;
		int column=0;
		while(cells.hasNext()) {
			Cell value = cells.next();
			if(value.getStringCellValue().equalsIgnoreCase("userName")) {
				column=k;
			}
			k++;
		}
		System.out.println(column);
		while(rows.hasNext()) {
			System.out.println("rows present");
			Row r = rows.next();
			if(r.getCell(column).getStringCellValue().equalsIgnoreCase("vikram")){
				System.out.println("column is 0");
				Iterator<Cell> cels = r.cellIterator();
				while(cels.hasNext()) {
					System.out.println("cell hasnext");
				    //val = cels.next().getStringCellValue();
				    Cell cel = cels.next();
				    CellType cellType = cel.getCellType();
				    if(cel.getCellTypeEnum()==cellType.STRING) {
				    	al.add(cel.getStringCellValue());
				    } else if(cel.getCellTypeEnum()==cellType.NUMERIC) {
				    	al.add(NumberToTextConverter.toText(cel.getNumericCellValue()));
				    }
					System.out.println("value is:"+ cels.next().getStringCellValue().toString());
					
				}
				
;				
			}
				
			
		}
		return al;
		
	}

	public static void main(String[] args) throws Exception {
		
		
		ArrayList data = getData();
		System.out.println(data.get(0));
		/*
		 * int lastRowNum = sheet.getLastRowNum(); short lastCellNum =
		 * sheet.getRow(0).getLastCellNum();
		 * 
		 * for(int i=0; i<lastRowNum; i++) { for(int j=0; j<lastCellNum; j++) { XSSFRow
		 * row = sheet.getRow(i); XSSFCell cell = row.getCell(j); String value =
		 * cell.getStringCellValue(); System.out.println(value.toString()); }}
		 */
		

	}

}
