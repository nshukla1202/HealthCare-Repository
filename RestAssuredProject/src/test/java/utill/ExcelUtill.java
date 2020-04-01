package utill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Formatter;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtill {
	static XSSFWorkbook workbook1;
	static XSSFSheet sheet;

	public ExcelUtill(String excelPath,String sheetName){
		//XSSFWorkbook workbook;
		
		try {
			InputStream file=new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {

      
			workbook1= new XSSFWorkbook(excelPath);
			
			//workbook1= new HSSFWorkbook();
			sheet=workbook1.getSheet(sheetName);
		} catch (Exception exp) {


			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());

			// TODO Auto-generated catch block
			exp.printStackTrace();


		}
	}

	public static void getCellData(int rowNum,int colNum) {


		DataFormatter formatter=new DataFormatter();

		Object value=formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));

		//double value =sheet.getRow(1).getCell(2).getNumericCellValue();
		System.out.println(value);


	}

	//How many rows are present	
	public static void getRowCount() {

		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println("No of Rows"+rowCount);





	}

}
