package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {
	
	public String[][] readData(String fileName, String sheetName) throws IOException {
		
		//Step -1: to get into the workbook
		  XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		//Step -1: to get into the worksheetname
		  XSSFSheet ws = wb.getSheet(sheetName);
		//Step -1: to get the no.of rows excluding the header (first row)
		  int rowCount = ws.getLastRowNum();
		//Step -1: to get the no.of columns
		  short cellCount = ws.getRow(1).getLastCellNum();
		  //declare 2D array
		  String[][] data = new String[rowCount][cellCount];
		  
		  for (int i = 1; i<= rowCount; i++) {
			  
			  for(int j = 0; j< cellCount; j++) {
				  String cellValues = ws.getRow(i).getCell(j).getStringCellValue();
				  System.out.println(cellValues);
				  //0,0
				  data[i-1][j] = cellValues;
				  
			  }
		  }
		  
		  //to close the workbook
		  wb.close();
		  
		  return data;
		 
	}

}
