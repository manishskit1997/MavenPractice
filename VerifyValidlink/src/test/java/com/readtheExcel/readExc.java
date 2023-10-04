package com.readtheExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExc {
	public static void main(String[] args) throws IOException {
		String ExcelFilePath="./DataFile/MyExcel.xlsx";
		FileInputStream inputSteam=new FileInputStream(ExcelFilePath);
		Workbook book=WorkbookFactory.create(inputSteam);
		Sheet sheet = book.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=0;i<rowCount;i++)
		{
			Row row = sheet.getRow(i);
			{
				for(int j=0;j<row.getLastCellNum();j++)
				{
					Cell cell = row.getCell(j);
					String value = cell.toString();
							System.out.print(value+"||");
				}
				System.out.println();
			}

		}

		//String value = book.getSheet("Sheet1").getRow(0).getCell(0).toString();
		//System.out.println(value);

		//		XSSFWorkbook workbook=new XSSFWorkbook(inputSteam);
		//		 XSSFSheet sheet = workbook.getSheet("Sheet1");
		////				.getRow(0).getCell(0).toString();
		////		System.out.println(value);
		//		
		//		int row=sheet.getLastRowNum();
		//		int col=sheet.getRow(1).getLastCellNum();
		//		for(int r=0;r<=row;r++)
		//		{
		//			XSSFRow rows = sheet.getRow(r);
		//			for(int c=0;c<=col;c++)
		//			{
		//				XSSFCell cells = rows.getCell(c);
		//				switch(cells.getCellType())
		//				{
		//				case STRING: System.out.println(cells.getStringCellValue());break;
		//				case NUMERIC: System.out.println(cells.getNumericCellValue());break;
		//				case BOOLEAN: System.out.println(cells.getBooleanCellValue());break;
		//				default:
		//					break;
		//				}
		//			}
		//			System.out.println();
		//		}
	}

}
