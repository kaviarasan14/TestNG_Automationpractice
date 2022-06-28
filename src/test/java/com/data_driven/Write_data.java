package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {

	private static void write_date() throws IOException {

		File f = new File("C:\\Users\\kavia\\Desktop\\writedata.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		wb.createSheet("sheet2").createRow(0).createCell(0).setCellValue("S.NO");

		wb.getSheet("sheet2").getRow(0).createCell(1).setCellValue("Username");

		wb.getSheet("sheet2").getRow(0).createCell(2).setCellValue("Password");

		wb.getSheet("sheet2").createRow(1).createCell(0).setCellValue("1");

		wb.getSheet("sheet2").getRow(1).createCell(1).setCellValue("test@gmail.com");

		wb.getSheet("sheet2").getRow(1).createCell(2).setCellValue("1234");

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		wb.close();

		// System.exit(0); //code exits at this line so sysout not printed

		System.out.println("Write data suscessful");
	}

	public static void main(String[] args) throws IOException {
		write_date();

	}

}
