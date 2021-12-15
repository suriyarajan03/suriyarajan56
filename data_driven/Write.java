package com.data_driven;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Write {
public   static void write_datas() throws IOException {
	File f = new File("C:\\Users\\surya\\Desktop\\demo.xlsx");
	FileInputStream fi = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fi);
	wb.createSheet("test2").createRow(0).createCell(0).setCellValue("player name");
	wb.getSheet("test2").getRow(0).createCell(1).setCellValue("role");
	wb.getSheet("test2").createRow(1).createCell(0).setCellValue("jadeja");
	wb.getSheet("test2").getRow(1).createCell(1).setCellValue("all rounder");
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	wb.close();
	System.out.println("written successfully");
}


	public static void main(String[] args) throws IOException {
write_datas();
	}
}



