package excel_Connection;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import test.SeleniumEasy.BaseTest.TestBase;

import java.io.File;
import java.io.FileInputStream;


public class ExcelConnector2 extends TestBase{
	FileInputStream FIS;
	XSSFWorkbook xBook;
	XSSFSheet xSheet;
	//"Team need to see that firstBranch"
	public ExcelConnector2(String FilePath) {
		File xFile = new File(FilePath);
		try {
			 FIS = new FileInputStream(xFile);
			 xBook = new XSSFWorkbook(FIS);
		} catch (Exception e) {
			System.out.println("First Branch");
			System.out.println("First Branch");
			System.out.println("First Branch");
			System.out.println("First Branch");
			System.out.println("First Branch");
			System.out.println("First Branch");
			System.out.println("First Branch");
			System.out.println("First Branch");
			e.getMessage();
		}
		
	}
	
	public String[][] getExcelData(int SheetNumber) {
		xSheet =xBook.getSheetAt(SheetNumber);
		
		int Row_num= xSheet.getLastRowNum();
		int Cal_num = xSheet.getRow(0).getLastCellNum();
		
		String [][] xData = new String[Row_num][Cal_num];
		
		for(int i=0;i<Row_num;i++) 
		{
			XSSFRow row = xSheet.getRow(i+1);
			for(int j=0;j<Cal_num;j++) {
				XSSFCell cell = row.getCell(j);
				String value = valueChange(cell);
				xData[i][j]=value;
			}
		}
		
		return xData;
	}

	private String valueChange(XSSFCell cell) {
		String value =null;
		Object result;
		if(cell == null)
		{
			value ="";
		}
		else {
			
			 if (cell.getCellTypeEnum() == CellType.STRING) {
				value = cell.getStringCellValue();
			 }
			 else if (cell.getCellTypeEnum()==CellType.NUMERIC) {
				 result = (int)cell.getNumericCellValue();
				 value = result.toString();
			 }
				
		}
		return value;
	}

}
