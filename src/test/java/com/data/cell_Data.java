package com.data;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class cell_Data {

	public static void cellDatas() throws Throwable {

		File f = new File("C:\\Users\\hp\\eclipse-workspace\\MavenProject1\\data\\datas.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		int pnr = s.getPhysicalNumberOfRows();

		for (int i = 0; i <= pnr - 1; i++) {

			Row r = s.getRow(i);

			Cell c = r.getCell(0);

			CellType ct = c.getCellType();

			if (ct.equals(CellType.STRING)) {

				String string = c.getStringCellValue();

				System.out.println(string);
			}

			else if (ct.equals(CellType.NUMERIC)) {

				double d = c.getNumericCellValue();

				int i1 = (int) d;

				System.out.println(i1);
			}
		}
	}

	public static void main(String[] args) throws Throwable {
		
		cellDatas();
	}

}
