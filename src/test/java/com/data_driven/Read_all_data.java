package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_all_data {
	private static void read_all_data() throws IOException {
		File f = new File("C:\\Users\\kavia\\eclipse-workspace\\project\\Excel\\New Microsoft Excel Worksheet.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheetAt = wb.getSheetAt(0);

		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < NumberOfRows; i++) {

			XSSFRow row = sheetAt.getRow(i);

			int NumberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < NumberOfCells; j++) {

				XSSFCell cell = row.getCell(j);

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
		}wb.close();
	}
	public static void main(String[] args) throws IOException {
		read_all_data();
	}
   
}
