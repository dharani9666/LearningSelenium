package com.Amazokort.generic.excelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Amazokort.generic.common.FrameWorkConstant;

public class ReadExcelFile implements FrameWorkConstant {
	FileInputStream fis;
	FileOutputStream fos;
	Workbook wb;

	public String readdata(String sheet, int row, int column) {
		// convert the Physical Excel File Into Java Undersatable

		try {
			fis = new FileInputStream(Excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Create the WorkBook
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// UsingWokbook go to Sheet,row,column and cell fetch the Data
		String data = wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();

		return data;
	}

	public void writedata(String sheet, int row, int column, String data)
			{
		try {
			fis = new FileInputStream(Excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Create the WorkBook
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Create A New Column and Write Data on it.
		wb.getSheet(sheet).createRow(row).createCell(column).setCellValue(data);

		// Convert Java data into Physical File
		try {
			fos = new FileOutputStream(Excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Write the Data
		try {
			wb.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Close the Workbook
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void displaydata(String sheet, int row, int column)  {
		// convert the Physical Excel File Into Java Undersatable
		try {
			fis = new FileInputStream(Excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Create the WorkBook
		try {
			wb = WorkbookFactory.create(fis);
		}
		catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// UsingWokbook go to Sheet,row,column and cell fetch the Data
		String data = wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();

		// Print The Data
		System.out.println(data);

	}

	public void displaymultipledata(String sheet, int column) {
		// convert the Physical Excel File Into Java Undersatable
		try {
			fis = new FileInputStream(Excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Create the WorkBook
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		// UsingWokbook go to Sheet
		Sheet sht = wb.getSheet(sheet);

		int count = sht.getLastRowNum();

		for (int i = 1; i <= count; i++) 
		{

			// optimized code
			String data = wb.getSheet(sheet).getRow(i).getCell(column).getStringCellValue();
			System.out.println(data);
		}

	}

}