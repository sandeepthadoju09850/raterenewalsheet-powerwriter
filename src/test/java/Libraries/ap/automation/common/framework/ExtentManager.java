package Libraries.ap.automation.common.framework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.NetworkMode;

public class ExtentManager {
	
	/*static ExtentReports extent;
    private static String date = "Run_" + Util.getCurrentDate();
	private static String dateNTime = "Run_" + Util.getCurrentDate() + "_" + Util.getCurrentTime();
	private static String homePath = homepath() + "\\Results";
	private static String resultsFolder = homePath + "\\" + date;
	public static String resultsPath = resultsFolder + "\\" + dateNTime + "/CP";
	final static String summaryReportHTML = resultsPath + "\\BatchExecutionReportSummary.html";
	private static String screenshotPath = resultsPath + "\\Screenshots";*/
	
	static ExtentReports extent;
    private static String date = "Run_" + Util.getCurrentDate();
	private static String dateNTime = "Run_" + Util.getCurrentDate() + "_" + Util.getCurrentTime();
	private static String homePath = homepath() + "\\Reports";

	private static String resultsFolder = homePath + "\\" + date;
	public static String resultsPath = resultsFolder + "\\" + dateNTime  ;
	final static String summaryReportHTML = resultsPath + "\\NewQuoteRegressionReportSummary.html";
	private static String screenshotPath = resultsPath + "\\Screenshots";
	
	public static String homepath(){
		try {
			homePath = new File(".").getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return homePath;
	}
	
    public synchronized static ExtentReports getInstance() {
        if (extent == null)
            createInstance();
        return extent;
    }
 
    //Create an extent report instance
    public synchronized static ExtentReports createInstance() {
        String fileName = getReportPath(resultsPath);
        System.out.println(fileName + "---------------------------- Html path");
        extent = new ExtentReports(fileName, true, NetworkMode.ONLINE);
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
        return extent;
    }
 
    //Create the report path
    private static String getReportPath (String path) {
    	File testDirectory = new File(path);
        if (!testDirectory.exists()) {
        	if (testDirectory.mkdirs()) {
                System.out.println("Directory: " + path + " is created!" );
                return summaryReportHTML;
            } else {
                System.out.println("Failed to create directory: " + path);
                return System.getProperty("user.dir");
            }
        } else {
            System.out.println("Directory already exists: " + path);
        }
		return summaryReportHTML;
    }
   
   public static String getPremiumsFile() {
		return resultsPath;
	}
	
	public static String getPathForScreenshots() {
		return screenshotPath;
	}
	
	public static void writeExcel() throws IOException  {
		 
		
		 
		   String USER_HOME = System.getProperty("user.dir");
		   File f = new File(USER_HOME+"\\resources\\test_data\\PremiumSummaryReport.xlsx");
		   try {
		   if(!f.exists()) {
		        
		            f.createNewFile();
		         }
		   else 
		   {
			   System.out.println(" file exists : " + f.exists());
		   }
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
		   }
			FileOutputStream fileOut = new FileOutputStream(f);
			 
			@SuppressWarnings("resource")
			Workbook wb = new XSSFWorkbook();
			
	          
	       
		
		 
			
		 
		
		 String sheetname = "Quote";
		
			// System.out.println("Creating Sheet Name as : " + sheetname);
			CreationHelper createHelper = wb.getCreationHelper();
		org.apache.poi.ss.usermodel.Sheet sheet = wb.createSheet(sheetname);
		 
		  
		 
		// Create the first Row
		 
		  
		 
		Row row1 = sheet.createRow((short) 0);
		 
		  
		 
		// inserting first row cell value
		 
		row1.createCell(0).setCellValue(createHelper.createRichTextString("LOB"));
		 
		  
		 
		row1.createCell(1).setCellValue(createHelper.createRichTextString("RegId"));
		 
		  
		 
		row1.createCell(2).setCellValue(createHelper.createRichTextString("QuoteNumber"));
		 
		  
		 
		row1.createCell(3).setCellValue(createHelper.createRichTextString("AccountNumber"));
		 
		  
		
		  
		 

		// Write the output to a file
		 
		  
		 
		wb.write(fileOut);
		 
		fileOut.close();
		
		}
		
		
		 
	}
		  
