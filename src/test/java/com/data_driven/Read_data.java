package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data {

	private static void read_particular_date() throws IOException {

		File f = new File("C:\\Users\\kavia\\eclipse-workspace\\project\\Excel\\New Microsoft Excel Worksheet.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheetAt = wb.getSheetAt(0);

		XSSFRow row = sheetAt.getRow(0);

		XSSFCell cell = row.getCell(0);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int data = (int) numericCellValue;
			System.out.println(data);
		}
	}
    public static void main(String[] args) throws IOException {
		read_particular_date();
	}

}
