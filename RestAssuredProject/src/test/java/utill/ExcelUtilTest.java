package utill;

public class ExcelUtilTest {
	
	public static void main(String[] args) {
		
		
		//String excelPath="./data/data XLSX Worksheet.xlsx";
		String excelPath="./data/data XLSX Worksheet.xls";
		//This above line can give you an error like oltp formate error.
		
		String sheetName="Sheet1";
		
		ExcelUtill excel=new ExcelUtill(excelPath,sheetName);
		
	excel.getRowCount();
	excel.getCellData(1,0);
	excel.getCellData(1, 1);
	excel.getCellData(1, 2);
	}

}
