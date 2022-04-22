package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider() throws Exception {
		
		String path="C:\\Users\\santo\\eclipse-workspace\\Framework_Batch7\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		 wb=new XSSFWorkbook(file);	
	}
	public String getStringData(String Sheetname,int row,int cell) {
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		
	}

}
