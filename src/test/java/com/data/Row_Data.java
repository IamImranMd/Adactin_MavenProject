package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Row_Data {

	public static void rowDatas() throws Throwable {

		File f = new File("C:\\Users\\hp\\eclipse-workspace\\MavenProject1\\data\\datas.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(0);

		int i1 = r.getPhysicalNumberOfCells();

		for (int i = 0; i <= i1 - 1; i++) {
			
			Cell c = r.getCell(i);

			CellType ct = c.getCellType();
			
			if(ct.equals(CellType.STRING)) {
				
				String string = c.getStringCellValue();
				
				System.out.println(string);
			}
			
			else if(ct.equals(CellType.NUMERIC)) {
				
				double d  = c.getNumericCellValue();
				
				int i2 = (int) d;
				
				System.out.println(i2);
			}
		}

	}
	
	public static void main(String[] args) throws Throwable{
		
		rowDatas();
	}

}
