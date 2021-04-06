package com.php.Utillites;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Phpreadexcel {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\DELL\\ExcelData\\Phptestdata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data0=sheet1.getRow(1).getCell(4).getStringCellValue();
		System.out.println("this the data from excel"+  data0);
		double data=sheet1.getRow(1).getCell(2).getNumericCellValue();
		System.out.println("this the data from excel"+  data);
		wb.close();
		

	}

}
