package rrs.pages.MainScreen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import  org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import com.relevantcodes.extentreports.ExtentTest;

import rrs.OR.OR_RRS_MainScreen;

public class PWValidations extends OR_RRS_MainScreen{
	

	FileInputStream inputStream;
	Workbook workbook;
	XSSFSheet sheet;
	File xlsxFile;
	FileOutputStream outputStream;
	String path= "C:\\Users\\sa09850\\GitProjects\\powerwriter-automatedtesting-ui\\resources\\testData\\PWRRS.xlsx";
	int col =2;
	int rowCount = 0;
	int q=1;
	
	public void PWValidationstMethod(String field, String data, ExtentTest test) throws IOException, InvalidFormatException {
	
		

		inputStream = new FileInputStream(new File(path));
		workbook = WorkbookFactory.create(inputStream);


		sheet = (XSSFSheet) workbook.getSheet("PWPremiumsData");
		int rowCount = sheet.getLastRowNum();
		
		XSSFRow row= sheet.createRow((short)++rowCount);
		//col++;
		
		
		//XSSFRow row = sheet.createRow(rowCount);
		
		
		row.createCell(0).setCellValue(field);
		row.createCell(1).setCellValue(data);
		

		outputStream = new FileOutputStream(path);
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();
	}
	

}
