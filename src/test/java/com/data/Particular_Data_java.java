package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_Data_java {
	
	public static void read_ParticularData() throws IOException {
		
		File f = new File("C:\\Users\\hp\\eclipse-workspace\\MavenProject1\\data\\datas.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(3);
		
		Cell c = r.getCell(1);
		
		CellType ct = c.getCellType();
		
		if(ct.equals(CellType.STRING)) {
			
			String string = c.getStringCellValue();
			
			System.out.println(string);
		}
		else if(ct.equals(CellType.NUMERIC)){
			
			double d = c.getNumericCellValue();
			
			int i = (int) d;
			
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) throws Throwable {
		
		read_ParticularData();
		
	}

}
