package com.data_driven;


import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void read_particlar_data() throws IOException {
		
		File f = new File("C:\\Users\\surya\\eclipse-workspace\\Maven_Projects\\Excel\\details.xlsx");
FileInputStream fi=new FileInputStream(f);
Workbook wb =new XSSFWorkbook(fi);
Sheet sheetAt = wb.getSheetAt(0);
Row row = sheetAt.getRow(4);
Cell cell = row.getCell(0);
CellType cellType = cell.getCellType();
if (cellType.equals(CellType.STRING)) {
	String value = cell.getStringCellValue();
	System.out.println("particular value :"+value);
	
}
else if (cellType.equals(CellType.NUMERIC)) {
	double cellvalue = cell.getNumericCellValue();
	int value=(int)cellvalue;
	System.out.println("particular value :"+value);
}
wb.close();
	}
	public static void all_datas() throws IOException {
		File f =new File("C:\\Users\\surya\\eclipse-workspace\\Maven_Projects\\Excel\\details.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb =new XSSFWorkbook(fi);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int r = 0; r < numberOfRows; r++) {
			Row row = sheetAt.getRow(r);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int c = 0; c <  numberOfCells ; c++) {
				Cell cell = row.getCell(c);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println("all datas  : "+value);
			
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					double cellValue = cell.getNumericCellValue();
					int value=(int)cellValue;
					System.out.println("all datas  : "+value);
				}
			}
		}	
	wb.close();
	}
	public static void particlar_row() throws IOException {
		File f =new File("C:\\Users\\surya\\eclipse-workspace\\Maven_Projects\\Excel\\details.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb =new XSSFWorkbook(fi);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int r = 0; r <numberOfRows ; r++) {
			Row row = sheetAt.getRow(r);
			
				
			
			int numberOfCells = row.getPhysicalNumberOfCells();
		for (int c = 0; c < numberOfCells; c++) {
			
		
			Cell cell = row.getCell(c);
		
			CellType cellType = cell.getCellType();
		
			if (cellType.equals(CellType.STRING)) {
			cell.getStringCellValue();
			String value = cell.getStringCellValue();
			if (r==0) {
				
			
			System.out.println("particular row   : "+value);
			}
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			double cellValue = cell.getNumericCellValue();
			int value=(int)cellValue;
			if (r==0) {
				System.out.println("particular row   : "+value);
		}
			}
				
		}	
				
		}
wb.close();
	}
	public static void particular_column() throws IOException {File f =new File("C:\\Users\\surya\\eclipse-workspace\\Maven_Projects\\Excel\\details.xlsx");
	FileInputStream fi=new FileInputStream(f);
	Workbook wb =new XSSFWorkbook(fi);
	Sheet sheetAt = wb.getSheetAt(0);
	int numberOfRows = sheetAt.getPhysicalNumberOfRows();
	
	for (int r = 0; r <numberOfRows ; r++) {
		Row row = sheetAt.getRow(r);
	
		
		int numberOfCells = row.getPhysicalNumberOfCells();
	for (int c = 0; c < numberOfCells; c++) {
		
	
		Cell cell = row.getCell(c);
	
		CellType cellType = cell.getCellType();
	
		if (cellType.equals(CellType.STRING)) {
		cell.getStringCellValue();
		String value = cell.getStringCellValue();
		if (c==0) {
			
		
		System.out.println("particular column  : "+value);
		}
	}
	else if (cellType.equals(CellType.NUMERIC)) {
		double cellValue = cell.getNumericCellValue();
		int value=(int)cellValue;
		if (c==0) {
			System.out.println("particular column   : "+value);
	}
			
		}
			
	}	
			

	}
	wb.close();
	}
	
		public static void main(String[] args) throws IOException {
			read_particlar_data();
			particlar_row();
			particular_column();
			all_datas();
			
		}
}