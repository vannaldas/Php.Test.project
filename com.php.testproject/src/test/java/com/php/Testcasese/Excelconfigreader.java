package com.php.Testcasese;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelconfigreader {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	
	public Excelconfigreader() {
		try {
		File file = new File("C:\\Users\\DELL\\ExcelData\\Phptestdata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		  wb = new XSSFWorkbook(fis);
	
		} catch (Exception ex) {
			
			System.out.println( ex.getMessage());
		}
		 
		
	}
	

public String getData(int sheetnumber, int Row,int column) {
	 sheet1 = wb.getSheetAt(0);
	
	String data=sheet1.getRow(Row).getCell(column).getStringCellValue();
	return data;
	
}

public double getData1(int sheetnumber, int Row,int column) {
	 sheet1 = wb.getSheetAt(0);
	
	double value =sheet1.getRow(Row).getCell(column).getNumericCellValue();
	return value;
	
}




}
