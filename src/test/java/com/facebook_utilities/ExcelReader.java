package com.facebook_utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {
	// instance variable
	public String filePath;
	public String sheetName;

	// constructor
	public ExcelReader(String filePath, String sheetName) {
		super();
		this.filePath = filePath;
		this.sheetName = sheetName;
	}

	// this is the method to handle text data type
	public String readStringData(int rowNum, int columnNum) {
		String cellData = null;// flag

		try {
			FileInputStream fis = new FileInputStream(filePath);
			Workbook regBook = new XSSFWorkbook(fis);
			Sheet sheet = regBook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell column = row.getCell(columnNum);
			cellData = column.getStringCellValue();
			System.out.println(cellData);
			regBook.close();
			fis.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return cellData;
	}

// this is the method to handle Numeric data type
	public double readNumericData(int rowNum, int columnNum) {
		double cellData = 0.0;// flag

		try {
			FileInputStream fis = new FileInputStream(filePath);
			Workbook regBook = new XSSFWorkbook(fis);
			Sheet sheet = regBook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell column = row.getCell(columnNum);
			cellData = column.getNumericCellValue();
			System.out.println(cellData);
			regBook.close();
			fis.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return cellData;
	}

//this is the method to handle Date data type
	public LocalDateTime readDateData(int rowNum, int columnNum) {
		LocalDateTime cellData = null;// flag

		try {
			FileInputStream fis = new FileInputStream(filePath);
			Workbook regBook = new XSSFWorkbook(fis);
			Sheet sheet = regBook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell column = row.getCell(columnNum);
			cellData = column.getLocalDateTimeCellValue();
			System.out.println(cellData);
			regBook.close();
			fis.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return cellData;
	}

	public static void main(String[] args) {
		String filePath = "src/test/resources/registration.xlsx";
		ExcelReader excelReader = new ExcelReader(filePath, "Sheet1");
		excelReader.readStringData(1, 0);
		excelReader.readStringData(2, 0);
		excelReader.readStringData(3, 0);
		excelReader.readStringData(1, 6);
		excelReader.readStringData(2, 6);
		excelReader.readStringData(3, 6);

	}

}
