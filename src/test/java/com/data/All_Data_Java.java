package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data_Java {

	public static void All_Data() throws IOException {

		File f = new File("C:\\Users\\hp\\eclipse-workspace\\MavenProject1\\data\\datas.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		int pnr = s.getPhysicalNumberOfRows();

		for (int i = 0; i <= pnr - 1; i++) {

			Row r = s.getRow(i);

			int pnc = r.getPhysicalNumberOfCells();

			for (int j = 0; j <= pnc - 1; j++) {

				Cell c = r.getCell(j);

				CellType ct = c.getCellType();

				if (ct.equals(CellType.STRING)) {

					String string = c.getStringCellValue();

					System.out.println(string);
					
				} else if (ct.equals(CellType.NUMERIC)) {

					double d = c.getNumericCellValue();

					int i1 = (int) d;

					System.out.println(i1);
				}
			}
		}
	}

	public static void main(String[] args) throws Throwable {

		All_Data();
	}
}
