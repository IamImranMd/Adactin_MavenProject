package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void writeDatas() throws Throwable {
	
	    File f = new File("C:\\Users\\hp\\Desktop\\datas.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("datas").createRow(0).createCell(0).setCellValue("email");
		wb.getSheet("datas").getRow(0).createCell(1).setCellValue("password");
		wb.getSheet("datas").createRow(1).createCell(0).setCellValue("imran@yahoo.com");
		wb.getSheet("datas").getRow(1).createCell(1).setCellValue("imran123");
		wb.getSheet("datas").createRow(2).createCell(0).setCellValue("toretto@yahoo.com");
		wb.getSheet("datas").getRow(2).createCell(1).setCellValue("toretto123");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		System.out.println("Done");
	}
	
	public static void main(String[] args) throws Throwable{
		
		writeDatas();
	}
	

}
