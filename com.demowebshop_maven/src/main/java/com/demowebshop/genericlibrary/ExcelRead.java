package com.demowebshop.genericlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead implements FrameWorkConstants{
	public static void singleRead() throws Throwable {
		
		File file = new File(EXCEL_PATH);
		FileInputStream fis=new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Credentials");
		int numRows = sh.getPhysicalNumberOfRows();
		 int cellNum = sh.getRow(0).getPhysicalNumberOfCells();
		Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell.toString());
		 System.out.println(numRows);
		 System.out.println(cellNum);
	}
	
	public static String[][] multipleRead() throws Throwable, IOException  
	{
		File file = new File(EXCEL_PATH);
		FileInputStream fis=new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Credentials");
		int rowSize=sh.getPhysicalNumberOfRows();
		int colSize=sh.getRow(1).getPhysicalNumberOfCells();
		String [][] data=new String [rowSize][colSize];
		
		for (int i = 0; i < rowSize; i++) 
		{
			for (int j = 0; j < colSize; j++) 
			{
				data[i][j]=sh.getRow(i).getCell(j).toString();
			}
			
		}
		for (int i = 1; i < rowSize; i++) 
		{
			for (int j = 0; j < colSize; j++) 
			{
				System.out.println(data[i][j]);
			}
			
		}
		return data;
	}
	

}
