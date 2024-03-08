package Libraries.ap.automation.common.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Libraries.ap.automation.common.Page;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class XlsData extends Page {
	private Workbook workbook;
	private XSSFWorkbook workbk;

	public XlsData() {
	}

	/**
	 * Opens an xls workbook
	 * 
	 * @param filename
	 */
	public Workbook openWorkbook(String filename) {
		try {
			// System.out.println(new URI(filename));
			File f = new File(filename);
			// InputStream f = new FileInputStream(filename);
			return workbook = Workbook.getWorkbook(f);
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// System.out.println("The file not found: " + e.getMessage());
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Opens an xls workbook
	 * 
	 * @param stream
	 */
	public Workbook openWorkbook(InputStream stream) {
		try {
			// System.out.println(new URI(filename));
			// File f = new File(filename);
			// InputStream f = new FileInputStream(filename);
			return workbook = Workbook.getWorkbook(stream);
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// System.out.println("The file not found: " + e.getMessage());
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	// public String[][] parseXLSSheet(String filename, int sheetNumber)
	public String[][] parseXLSSheet(String filename, String sheetName) {
		openWorkbook(filename);
		// Sheet sheet = workbook.getSheet(sheetNumber);
		Sheet sheet = workbook.getSheet(sheetName);
		int rows = sheet.getRows();
		int cols = sheet.getColumns();
		String[][] data = new String[rows][cols];
		// for each row
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				// We are commenting this line to get right row count
				// and ignoring null row values
				// data[row][col] = sheet.getCell(col,row).getContents();
				if (sheet.getCell(col, row).getContents().trim().length() >= 1
						&& sheet.getCell(col, row).getContents() != null) {
					data[row][col] = sheet.getCell(col, row).getContents();
				}
			}
		}

		closeWorkbook();

		return data;
	}
	
	
		public List<LinkedHashMap<String, String>> parseXLSXSheetTypeByRow(String filename, String sheetName) {
		// System.out.println("Inside parseXLSXSheet");
			openWorkbk(filename);
		XSSFSheet sheet = workbk.getSheet(sheetName);
		XSSFRow row = null;
		XSSFCell cell = null;
		List<LinkedHashMap<String, String>> table = new ArrayList<LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> rowMap = null;
		List<String> firstRow = new ArrayList<String>();

		int i = 0;
		for (int rownum = sheet.getFirstRowNum(); rownum <= sheet.getLastRowNum(); rownum++) {
			row = sheet.getRow(rownum);
			if (row != null) {
				rowMap = new LinkedHashMap<String, String>();
				int j = 0;
				for (int cellnum = row.getFirstCellNum(); cellnum < row.getLastCellNum(); cellnum++) {
					cell = row.getCell(cellnum);
					 if (cell == null) {
						 System.out.println("Row"+rownum+"Has Blank Value at Cell Number"+cellnum);
					 }
					 if (cell != null) {
						 cell.setCellType(Cell.CELL_TYPE_STRING); 
						 }
					
					/*
					 * if(cell.getStringCellValue() == null ||
					 * cell.getRawValue() == null){ continue; }else{
					 */
					if (rownum == sheet.getFirstRowNum()) {
						firstRow.add(cell.getStringCellValue());
					} else {
						try {
							
							if (cell.getStringCellValue().length() > 0) {
								rowMap.put(firstRow.get(j), cell.getStringCellValue());
							}
							if(cell.getStringCellValue().equalsIgnoreCase("Go To PageList")){
								rownum = sheet.getLastRowNum()+1;
								cellnum=row.getLastCellNum()+1;
							}
						} catch (Exception e) {

						}
					}
					j++;
				}
			}
			if (rownum != sheet.getFirstRowNum())
				table.add(rowMap);

			i++;
		}

		return table;
	}
	



	/**
	 * 
	 * @param filename
	 * @param sheetName
	 * @return
	 */
	public List<Map<String, String>> getTestEnvironmentDetails(String sRunApplicationType) {
		try {
			int ZERO = 0;

			// Columns defined in ConfigurationFile.xls in EnvData Sheet
			int ENV_APPLICATION_TYPE = 1;
			int ENV_TEST_ENVIRONMENT = 2;
			int ENV_EXECUTION_STATUS = 3;
			int ENV_LOGIN_ID = 4;
			int ENV_PASSWORD = 5;
			int ENV_APP_ADDRESS = 6;

			// Columns defined in ConfigurationFile.xls in AppLinks Sheet
			int APP_TEST_ENVIRONMENT = 0;
			int APP_APP_ADDRESS = 1;

			String sExpString = "YES";

			List<Map<String, String>> table = new ArrayList<Map<String, String>>();
			HashMap<String, String> rowMap = null;
			List<String> firstRow = new ArrayList<String>();

			XlsData xlsdata = new XlsData();
			String[][] envdata;
			String[][] appdata = null;
			String[][] retdata = null;
			retdata = new String[1][7];

			String sFileName = "";
			String sEnvSheetName = "EnvData";
			String sAppSheetName = "AppLinks";
			envdata = parseXLSSheet(sFileName, sEnvSheetName);
			appdata = parseXLSSheet(sFileName, sAppSheetName);

			if (envdata.length != appdata.length) {
				System.out.println(
						"Please define Test Config details all environments between EnvData and AppLinks data sheets. The number of rows should be the same.");
				return (null);
			}
			int iFound = 0;
			int iDataRow = 0;
			for (int row = 1; row < envdata.length; row++) {
				if (envdata[row][ENV_APPLICATION_TYPE].equalsIgnoreCase(sRunApplicationType)) {
					if (envdata[row][ENV_EXECUTION_STATUS].equalsIgnoreCase(sExpString)) {
						iFound++;
						iDataRow = row;
					}
				}
			}

			if (iFound == ZERO) {
				System.out.println("No Environment is configured for " + sRunApplicationType
						+ " execution in Test Configuration file.");
				return (null);
			} else if (iFound > 1) {
				System.out.println("Please set 'YES' for only one Test environment...");
				return (null);
			} else {
				if (!envdata[iDataRow][ENV_TEST_ENVIRONMENT]
						.equalsIgnoreCase(appdata[iDataRow][APP_TEST_ENVIRONMENT])) {
					System.out.println(
							"Environment Name does not match. Please maintain the same order of environments between EnvData and AppLinks Sheets...");
					return (null);
				} else {
					rowMap = new HashMap<String, String>();
					rowMap.put(envdata[ZERO][ENV_TEST_ENVIRONMENT], envdata[iDataRow][ENV_TEST_ENVIRONMENT]);
					rowMap.put(envdata[ZERO][ENV_EXECUTION_STATUS], envdata[iDataRow][ENV_EXECUTION_STATUS]);
					rowMap.put(envdata[ZERO][ENV_LOGIN_ID], envdata[iDataRow][ENV_LOGIN_ID]);
					rowMap.put(envdata[ZERO][ENV_PASSWORD], envdata[iDataRow][ENV_PASSWORD]);
					rowMap.put(appdata[ZERO][APP_APP_ADDRESS], appdata[iDataRow][APP_APP_ADDRESS]);
					table.add(rowMap);
					return table;

				}
			}
		} catch (Exception e) {
			System.out.println("getTestEnvironmentDetails failed...");
			return (null);
			// TODO Auto-generated catch block

		}
	}

	// public String[][] parseXLSSheet(InputStream stream, int sheetNumber)
	public String[][] parseXLSSheet(InputStream stream, String sheetName) {
		openWorkbook(stream);
		// Sheet sheet = workbook.getSheet(sheetNumber);
		Sheet sheet = workbook.getSheet(sheetName);
		int rows = sheet.getRows();
		int cols = sheet.getColumns();
		String[][] data = new String[rows][cols];
		// for each row

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				// We are commenting this line to get right row count
				// and ignoring null row values
				// data[row][col] = sheet.getCell(col,row).getContents();
				if (sheet.getCell(col, row).getContents().trim().length() >= 1
						&& sheet.getCell(col, row).getContents() != null) {
					data[row][col] = sheet.getCell(col, row).getContents();
				}
			}
		}

		closeWorkbook();

		return data;
	}

	/**
	 * Closes the workbook
	 */
	public void closeWorkbook() {
		workbook.close();
	}

	/**
	 * Opens an xlsx workbook
	 * 
	 * @param stream
	 */
	public XSSFWorkbook openWorkbk(String filename) {
		try {
			// System.out.println(new URI(filename));
			//InputStream is = getResourceAsStream(filename);			
			File f = new File(filename);
			//BufferedReader reader = new BufferedReader(new InputStreamReader(f));
			FileInputStream file = new FileInputStream(f);
			//file.read();
			// Get the workbook instance for XLS file
			return workbk = new XSSFWorkbook(file);
		} catch (IOException e) {
			/*
			 * e.getMessage(); e.printStackTrace();
			 */
			// TODO Auto-generated catch block
			// System.out.println("The file not found: " + e.getMessage());
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public List<Map<String, String>> parseXLSXSheet(String filename, String sheetName) {
        openWorkbk(filename);
        XSSFSheet sheet = workbk.getSheet(sheetName);
        XSSFRow row = null;
        XSSFCell cell = null;
        List<Map<String, String>> table = new ArrayList<Map<String, String>>();
        HashMap<String, String> rowMap = null;
        List<String> firstRow = new ArrayList<String>();

        int i = 0;
        for (int colnum = sheet.getRow(i).getFirstCellNum() + 1; colnum < sheet.getRow(i).getLastCellNum(); colnum++) {
               if (sheet.getRow(colnum) != null) {
                     rowMap = new HashMap<String, String>();
                     int j = 0;
                     for (int rownum = sheet.getFirstRowNum() + 1; rownum <= sheet.getLastRowNum(); rownum++) {
                            row = sheet.getRow(rownum);
                            if (colnum == row.getFirstCellNum() + 1) {
                                   cell = sheet.getRow(rownum).getCell(colnum);
                                   cell.setCellType(Cell.CELL_TYPE_STRING);
                                   //Added an additional if condition to break the loop on "EndOfCols" and "EndOfRows" flag
                                   if(cell.getStringCellValue().equalsIgnoreCase("EndOfCols") || cell.getStringCellValue().equalsIgnoreCase("EndOfRows"))
                                                 break;
                                   if (cell.getStringCellValue() != null
                                                 && cell.getStringCellValue().length() != 0) {
                                          firstRow.add(cell.getStringCellValue());
                                   }
                            } else {
                                   try {
                                          cell = sheet.getRow(rownum).getCell(colnum);
                                          cell.setCellType(Cell.CELL_TYPE_STRING);
                                          //Added an additional if condition to break the loop on "EndOfCols" and "EndOfRows" flag
                                          if(cell.getStringCellValue().equalsIgnoreCase("EndOfCols") || cell.getStringCellValue().equalsIgnoreCase("EndOfRows"))
                                                        break;
                                          if (cell.getStringCellValue() != null
                                                        && cell.getStringCellValue().length() > 0) {
                                                 rowMap.put(firstRow.get(j),cell.getStringCellValue());
                                                 j++;
                                          }
                                   } catch (Exception e) {
                                   }
                            }
                     }
               }
               if (colnum != sheet.getRow(i).getFirstCellNum() + 1)
                     //Added a condition to skip the table on empty value.
                     if(!rowMap.isEmpty()){
                            table.add(rowMap);
                            i++;
                     }
                     
        }
        return table;
 }


	public List<Map<String, String>> parseXLSXSheet1(String filename, String sheetName) {
		openWorkbk(filename);
		// System.out.println("Inside parseXLSXSheet");
		XSSFSheet sheet = workbk.getSheet(sheetName);
		XSSFRow row = null;
		XSSFCell cell = null;
		List<Map<String, String>> table = new ArrayList<Map<String, String>>();
		HashMap<String, String> rowMap = null;
		List<String> firstRow = new ArrayList<String>();

		int i = 0;
		for (int rownum = sheet.getFirstRowNum(); rownum <= sheet.getLastRowNum(); rownum++) {
			row = sheet.getRow(rownum);
			if (row != null) {
				rowMap = new HashMap<String, String>();
				int j = 0;
				for (int cellnum = row.getFirstCellNum(); cellnum < row.getLastCellNum(); cellnum++) {
					cell = row.getCell(cellnum);
					/*
					 * if(cell.getStringCellValue() == null ||
					 * cell.getRawValue() == null){ continue; }else{
					 */
					if (rownum == sheet.getFirstRowNum()) {
						firstRow.add(cell.getStringCellValue());
					} else {
						try {
							if (cell.getStringCellValue().length() > 0) {
								rowMap.put(firstRow.get(j), cell.getStringCellValue());
							}
						} catch (Exception e) {

						}
					}
					j++;
				}
			}
			if (rownum != sheet.getFirstRowNum())
				table.add(rowMap);

			i++;
		}

		return table;
	}


	

/*public boolean setCellData(String xlFilePath,String sheetName,int colNumber,int rowNum,String value)
{
try
{
FileInputStream fis= new FileInputStream(xlFilePath);	
HSSFWorkbook workbook = new HSSFWorkbook(fis);
HSSFSheet sheet = workbook.getSheet(sheetName);

sheet = workbook.getSheet(sheetName);

row = sheet.getRow(rowNum);
if(row==null)
row =sheet.createRow(rowNum);
cell=row.getCell(colNumber);
if(cell==null)
cell = row.createCell(colNumber);
cell.setCellValue(value);

FileOutStream data = new FileOutStream(xlFilePath);
workbook.write(data);
workbook.close();
fis.close();
data.close();	
}
catch (Exception ex)
{
	ex.printStackTrace();
	return false;
}
return true;
}*/

	public boolean setCellData(String xlfile,String sheetName,int colNumber,int rowNum,String value)
	{
		
		try
		{
			
			//String xFile =xlfile.substring(1);
			
			FileInputStream fi=new FileInputStream(xlfile);
			XSSFWorkbook	wb = new XSSFWorkbook(fi);
			
			XSSFSheet ws = wb.getSheet(sheetName);
			XSSFRow Row = ws.getRow(rowNum);
			
			XSSFCell Cell = Row.createCell(colNumber);
			CellStyle Style = wb.createCellStyle();
			Style.setBorderBottom(CellStyle.BORDER_THIN);
			Style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
			Style.setBorderLeft(CellStyle.BORDER_THIN);
			Style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
			Style.setBorderRight(CellStyle.BORDER_THIN);
			Style.setRightBorderColor(IndexedColors.BLACK.getIndex());
			Style.setBorderTop(CellStyle.BORDER_THIN);
			Style.setTopBorderColor(IndexedColors.BLACK.getIndex());
			Cell.setCellStyle(Style);
			if(value.equalsIgnoreCase("Pass")){
				Style.setFillPattern(CellStyle.SOLID_FOREGROUND);
				Style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
				Style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
				Cell.setCellValue(value);
				Cell.setCellStyle(Style);
			}
			else if(value.equalsIgnoreCase("Fail")){
				Style.setFillPattern(CellStyle.SOLID_FOREGROUND);
				Style.setFillForegroundColor(IndexedColors.RED.getIndex());
				Style.setFillBackgroundColor(IndexedColors.RED.getIndex());
				Cell.setCellValue(value);
				Cell.setCellStyle(Style);
				
			}
			else if(colNumber==0 || rowNum ==0){

				Style.setFillPattern(CellStyle.SOLID_FOREGROUND);
				Style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
				Style.setFillBackgroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
				
				Cell.setCellValue(value);
				Cell.setCellStyle(Style);
				
			}
			else if(colNumber==1 && rowNum ==1){
				Style.setFillPattern(CellStyle.SOLID_FOREGROUND);
				Style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
				Style.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
				
				Cell.setCellValue(value);
				Cell.setCellStyle(Style);
				
			}
			else{
			Cell.setCellValue(value);
			Cell.setCellStyle(Style);
			}
			FileOutputStream  fo=new FileOutputStream(xlfile);
			wb.write(fo);
			wb.close();
			fi.close();
			fo.close();
		}
		catch(Exception ex)
		
		{
			
			ex.printStackTrace();
			
			return false;
		}
			
		
		
		return true;
		
	}
	
	
	public void SetCellData(LinkedHashMap<String, String> hmap,int rownum,XSSFSheet firstSheet,XSSFWorkbook wb) throws Exception {

		try {
			//System.out.println("l1.size()"+hmap.size());
			int j=0;
				Row row = firstSheet.createRow(rownum);
				Iterator<Entry<String, String>> it = hmap.entrySet().iterator();
				while (it.hasNext()) {
					
					Map.Entry<String, String> pair = (Map.Entry<String, String>) it.next();
					//System.out.println(pair.getKey() + " = " + pair.getValue());
					
						Cell Cell = row.createCell(j);
						CellStyle Style = wb.createCellStyle();
						Style.setBorderBottom(CellStyle.BORDER_THIN);
						Style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
						Style.setBorderLeft(CellStyle.BORDER_THIN);
						Style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
						Style.setBorderRight(CellStyle.BORDER_THIN);
						Style.setRightBorderColor(IndexedColors.BLACK.getIndex());
						Style.setBorderTop(CellStyle.BORDER_THIN);
						Style.setTopBorderColor(IndexedColors.BLACK.getIndex());
						Cell.setCellStyle(Style);
						
						if(rownum==0) {
							//System.out.println("Updated header cell - "+" - "+pair.getKey());
							Cell.setCellValue(pair.getKey());
							Style.setFillPattern(CellStyle.SOLID_FOREGROUND);
							Style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
							Style.setFillBackgroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
							Cell.setCellStyle(Style);
							
						}else{
						
							//System.out.println("Updated value cell - "+" - "+pair.getValue());
							Cell.setCellValue(pair.getValue());
							String value = pair.getValue();
							if(value.equalsIgnoreCase("Pass")){
								Style.setFillPattern(CellStyle.SOLID_FOREGROUND);
								Style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
								Style.setFillBackgroundColor(IndexedColors.LIGHT_GREEN.getIndex());
								Cell.setCellStyle(Style);
							}
							else if(value.equalsIgnoreCase("Fail")){
								Style.setFillPattern(CellStyle.SOLID_FOREGROUND);
								Style.setFillForegroundColor(IndexedColors.ROSE.getIndex());
								Style.setFillBackgroundColor(IndexedColors.ROSE.getIndex());
								Cell.setCellStyle(Style);
						}
							/*else if(value.equalsIgnoreCase("N/A")){
								Style.setFillPattern(CellStyle.SOLID_FOREGROUND);
								Style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
								Style.setFillBackgroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
								Cell.setCellStyle(Style);
						}*/
						
					
				}
						j++;
				}
				
		} catch (Exception e) {
			System.out.println("Exception - "+e);
		} finally {
		}

	}
	public void SetCellDataInExistingWorkbook(LinkedHashMap<String, String> hmap,int startRow,int i, XSSFSheet Sheet,String sheetname,XSSFWorkbook wb,File file,XlsData xl) throws Exception {

		try {
			//System.out.println("l1.size()"+hmap.size());
			
				FileInputStream fi=new FileInputStream(file);
				wb = new XSSFWorkbook(fi);
				 
				if(!xl.isSheetExist(wb,sheetname)){
					 Sheet = wb.createSheet(sheetname);
				 }else{
				Sheet = wb.getSheet(sheetname);
				 }
				int j=0, rowNum;
				if(startRow ==0 ){
					rowNum = 0;
					
				}
				else if(startRow ==1 && i==1){
					rowNum = Sheet.getLastRowNum()+2;
				}else{
					rowNum = Sheet.getLastRowNum()+1;
				}
					
				
				Row row = Sheet.createRow(rowNum);
				//System.out.println("Sheet.getLastRowNum() - "+Sheet.getLastRowNum());
				Iterator<Entry<String, String>> it = hmap.entrySet().iterator();
				while (it.hasNext()) {
					
					Map.Entry<String, String> pair = (Map.Entry<String, String>) it.next();
					//System.out.println(pair.getKey() + " = " + pair.getValue());
					
						Cell Cell = row.createCell(j);
						CellStyle Style = wb.createCellStyle();
						Style.setBorderBottom(CellStyle.BORDER_THIN);
						Style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
						Style.setBorderLeft(CellStyle.BORDER_THIN);
						Style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
						Style.setBorderRight(CellStyle.BORDER_THIN);
						Style.setRightBorderColor(IndexedColors.BLACK.getIndex());
						Style.setBorderTop(CellStyle.BORDER_THIN);
						Style.setTopBorderColor(IndexedColors.BLACK.getIndex());
						Cell.setCellStyle(Style);
						
						if(startRow==0) {
							//System.out.println("Updated header cell - "+" - "+pair.getKey());
							Cell.setCellValue(pair.getKey());
							Style.setFillPattern(CellStyle.SOLID_FOREGROUND);
							Style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
							Style.setFillBackgroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
							Cell.setCellStyle(Style);
							
						}else{
						
							//System.out.println("Updated value cell - "+" - "+pair.getValue());
							Cell.setCellValue(pair.getValue());
							String value = pair.getValue();
							if(value.equalsIgnoreCase("Pass")){
								Style.setFillPattern(CellStyle.SOLID_FOREGROUND);
								Style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
								Style.setFillBackgroundColor(IndexedColors.LIGHT_GREEN.getIndex());
								Cell.setCellStyle(Style);
							}
							else if(value.equalsIgnoreCase("Fail")){
								Style.setFillPattern(CellStyle.SOLID_FOREGROUND);
								Style.setFillForegroundColor(IndexedColors.ROSE.getIndex());
								Style.setFillBackgroundColor(IndexedColors.ROSE.getIndex());
								Cell.setCellStyle(Style);
						}
							/*else if(value.equalsIgnoreCase("N/A")){
								Style.setFillPattern(CellStyle.SOLID_FOREGROUND);
								Style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
								Style.setFillBackgroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
								Cell.setCellStyle(Style);
						}*/
						
					
				}
						j++;
				}
				FileOutputStream  fo=new FileOutputStream(file);
				wb.write(fo);
				wb.close();
				fi.close();
				fo.close();
				
		} catch (Exception e) {
			System.out.println("Exception - "+e);
		} finally {
		}

	}
	
	public void createxlsFile(XSSFWorkbook workbook,File file){
		FileOutputStream fos = null;
		try {
			
			
			fos=new FileOutputStream(file);
			XSSFCellStyle hsfstyle=workbook.createCellStyle();
			hsfstyle.setBorderBottom((short) 1);
			hsfstyle.setFillBackgroundColor((short)245);
			workbook.write(fos);
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	 public XSSFSheet Createsheet(XSSFWorkbook workbook,String sheetName) {
		 	XSSFSheet firstSheet;
			
			//System.out.println("sheetName - "+sheetName );
			
				firstSheet = workbook.createSheet(sheetName);
			
			
			return  firstSheet;
			
				 
		}
	 public XSSFSheet getsheet(XSSFWorkbook workbook,String sheetName) {
		 	XSSFSheet firstSheet;
			
			//System.out.println("sheetName - "+sheetName );
		
				firstSheet = workbook.getSheet(sheetName);
				//System.out.println("firstSheet - "+firstSheet);
				
			
			
			return  firstSheet;
			
				 
		}
	 // find whether sheets exists	
		public boolean isSheetExist(XSSFWorkbook	wb,String sheetName){
			int index = wb.getSheetIndex(sheetName);
			if(index==-1){
				index=wb.getSheetIndex(sheetName.toUpperCase());
					if(index==-1)
						return false;
					else
						return true;
			}
			else
				return true;
		}
	
	
}

