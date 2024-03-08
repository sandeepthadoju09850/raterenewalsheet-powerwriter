package Libraries.ap.automation.common.framework;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.IOUtils;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.ITestAnnotation;

import com.google.common.base.Function;

import Libraries.ap.automation.common.CommonBaseTest;
import Libraries.ap.automation.common.SeHelper;
import Libraries.ap.automation.common.SystemPropertyUtil;

//import java.net.URI;
//import java.net.URISyntaxException;

public class  Util{
	public static final SimpleDateFormat ISO8601_DATESTAMP = new SimpleDateFormat("yyyy-MM-dd");
	public static final SimpleDateFormat ISO8601_DATETIMESTAMP = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	//public final SimpleDateFormat ISO8601_DATETIMESTAMP_FILE = new SimpleDateFormat("yyyyMMdd kkmmssSSS");
	public static final SimpleDateFormat ISO8601_TIMESTAMP = new SimpleDateFormat("HH:mm:ss.SSS");
 
    
	public Calendar cal = Calendar.getInstance();

	public Util()
	{
	}
	/**
	 * Sleep some ms
	 * @param ms
	 */
	public void sleep(int ms)
	{
		try {
			System.out.println("Sleeping for the element");
			Thread.sleep(ms);
		} catch (InterruptedException e) {
		}
	}

	/**
	 * generates a random int between Min and Max inclusive, returns Integer instead of int so user is able to perform Integer.toString()
	 * Created by An Doan.
	 *
	 * @param Min : min number
	 * @param Max : max number
	 * @return Integer : Integer between min and max inclusive
	 *
	 */
	public static Integer randomNum(int Min, int Max) {
		return Min + (int) (Math.random() * ((Max - Min) + 1));
	}
	
	public static Long randomNum(long Min, long Max) {
		return Min + (long) (Math.random() * ((Max - Min) + 1));
	}
	

	/**
	 * get the date stamp
	 * @param dateFormat
	 * @return
	 */
	public static String getDateStamp(SimpleDateFormat dateFormat)
	{
		//dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

		if (dateFormat.equals(ISO8601_DATETIMESTAMP))
			return dateFormat.format(new Date()).replace(" ", "T") + "Z";
		else
			return dateFormat.format(new Date());
	}

	
	public int randomnumber() {
	    Random r = new Random( System.currentTimeMillis() );
	    return 10000 + r.nextInt(20000);
	}
	
	public int randomPolicyNo() {
	    Random r = new Random();
	    return 001111111 + r.nextInt(001234567);
	}
	
	
	public String gettodaydate(String format){
				
		SimpleDateFormat dateOnly = new SimpleDateFormat(format);
		String date = dateOnly.format(cal.getTime());
		return date;
		
	}	
	
	public static String getCurrentDate() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String date = sdf.format(cal.getTime()).toString();
		return date;
	}
	
	public static String getCurrentDate1() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String date = sdf.format(cal.getTime()).toString();
		return date;
	}

	public static String getCurrentTime() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("hh-mm-ssa");
		String time = sdf.format(cal.getTime()).toString();
		return time;
	}
	public static Date getTime() {
		Calendar cal = Calendar.getInstance();
		return cal.getTime();
    }
	public static long DiffInTime(Date d1, Date d2) {
		  long difference_In_Minutes = 0;
     try {

         long difference_In_Time
             = d2.getTime() - d1.getTime();

      
         difference_In_Minutes   = TimeUnit
                   .MILLISECONDS
                   .toMinutes(difference_In_Time)
               % 60;
        
     }
     catch (Exception e) {
         e.printStackTrace();
     }
     return difference_In_Minutes;
	
  
	}
	public String replacetext(String value, String Character){
		
		String newvalue = value.replace(Character,"");		
		return newvalue;	
	}
	
	public static String FutureDate(int data){
		try {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateOnly = new SimpleDateFormat("MM-dd-yyyy");
		String d =SystemPropertyUtil.getEffectiveDate();
		cal.setTime(dateOnly.parse(d));
		cal.add(Calendar.DAY_OF_MONTH, data);
		String convertedDate=dateOnly.format(cal.getTime());    
		return  convertedDate;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
	public static String Eventdate(String  Date){
        try {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
        int newdate=24-Integer.parseInt(Date);
        cal.add(Calendar.DATE, newdate );   
        String convertedDate=dateOnly.format(cal.getTime());
        return  convertedDate;
        }
        catch (NumberFormatException e)
        {
            return String.valueOf(0);
        }
       
       
    }
	
	
	public static String EventStartDate(String  Date){
        try {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
        int newdate=Integer.parseInt(Date);
        cal.add(Calendar.DAY_OF_MONTH, newdate );   
        String convertedDate=dateOnly.format(cal.getTime());
        return  convertedDate;
        }
        catch (NumberFormatException e)
        {
            return String.valueOf(0);
        }
       
       
    }
	
	
	
	public String nextmonth_date(){
		
		SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
		cal.add(Calendar.MONTH, 1 );    
		String convertedDate=dateOnly.format(cal.getTime());    
		return  convertedDate;
		
	}
	
	public String futuredate(String cycledate) throws ParseException{
	
			SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
			Date date = dateOnly.parse(cycledate);
			cal.setTime(date);
			cal.add(Calendar.MONTH, 3);    
			String futureDate = dateOnly.format(cal.getTime());    
			return  futureDate;		
	}
	
	public String futureyear(String cycledate, int noofyears) throws ParseException{
		
		SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
		Date date = dateOnly.parse(cycledate);
		cal.setTime(date);
		cal.add(Calendar.YEAR, noofyears);    
		String futureDate = dateOnly.format(cal.getTime());    
		return  futureDate;		
	}
	
	public String nextmonthdate(){
		
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		LocalDate today = LocalDate.now();
		LocalDate nextmonth = today.plus(1, ChronoUnit.MONTHS);
		String futuredate = nextmonth.format(formatter);	
		return  futuredate;
		
	}
	
	public String nextmonthdateformat(){
		
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		LocalDate today = LocalDate.now();
		LocalDate nextmonth = today.plus(1, ChronoUnit.MONTHS);
		String futuredate = nextmonth.format(formatter);	
		return  futuredate;
		
	}
	
	public String twomonthsdateformat(){
		
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		LocalDate today = LocalDate.now();
		LocalDate nextmonth = today.plus(2, ChronoUnit.MONTHS);
		String futureDate = nextmonth.format(formatter);
		String futuredate = change_dateformat(futureDate);
		return  futuredate;
		
	}
	
	public String quaterlydate(){
		
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		LocalDate today = LocalDate.now();
		LocalDate nextmonth = today.plus(3, ChronoUnit.MONTHS);
		String futuredate = nextmonth.format(formatter);	
		return  futuredate;
		
	}
	
	public String twomonthsdate(){
		
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		LocalDate today = LocalDate.now();
		LocalDate nextmonth = today.plus(2, ChronoUnit.MONTHS);
		String futuredate = nextmonth.format(formatter);	
		return  futuredate;
		
	}	
	
	public String nextmonth_date(String datevalue){
		
		SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
		cal.add(Calendar.MONTH, 1 );		
		String convertedDate=dateOnly.format(cal.getTime());		
		return  convertedDate;
		
		
		
	}
	
	public String getFutureDay(String date,int noOfDays){
		
		String[] dateval = date.split("/");
		
		int month = Integer.parseInt(dateval[0]);
		int day = Integer.parseInt(dateval[1]);
		int year = Integer.parseInt(dateval[2]);
				
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.of(year, month, day);
		LocalDate nextmonth = today.plus(noOfDays, ChronoUnit.DAYS);
		String futuredate = nextmonth.format(formatter);	
		String finalDate = change_dateformat(futuredate);
		return finalDate;
		
	}
	
	public String getFutureMonth(String date,int noOfMonths){
		
		String[] dateval = date.split("/");
		
		int month = Integer.parseInt(dateval[0]);
		int day = Integer.parseInt(dateval[1]);
		int year = Integer.parseInt(dateval[2]);
				
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.of(year, month, day);
		LocalDate nextmonth = today.plus(noOfMonths, ChronoUnit.MONTHS);
		String futuredate = nextmonth.format(formatter);	
		String finalDate = change_dateformat(futuredate);
		return finalDate;
		
	}
	
	public String getFutureYear(String date,int noOfYears){
		
		String[] dateval = date.split("/");
		
		int month = Integer.parseInt(dateval[0]);
		int day = Integer.parseInt(dateval[1]);
		int year = Integer.parseInt(dateval[2]);
				
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.of(year, month, day);
		LocalDate nextmonth = today.plus(noOfYears, ChronoUnit.YEARS);
		String futuredate = nextmonth.format(formatter);	
		String finalDate = change_dateformat(futuredate);
		return finalDate;
		
	}
	
	
	public String getEarlierMonth(String date,int noOfMonths){
		
		String[] dateval = date.split("/");
		
		int month = Integer.parseInt(dateval[0]);
		int day = Integer.parseInt(dateval[1]);
		int year = Integer.parseInt(dateval[2]);
				
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.of(year, month, day);
		LocalDate nextmonth = today.minus(noOfMonths, ChronoUnit.MONTHS);
		String earlierdate = nextmonth.format(formatter);	
		String finalDate = change_dateformat(earlierdate);
		return finalDate;
		
	}
	
	public String getEarlierDay(String date,int noOfDays){
		
		String[] dateval = date.split("/");
		
		int month = Integer.parseInt(dateval[0]);
		int day = Integer.parseInt(dateval[1]);
		int year = Integer.parseInt(dateval[2]);
				
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.of(year, month, day);
		LocalDate nextmonth = today.minus(noOfDays, ChronoUnit.DAYS);
		String earlierdate = nextmonth.format(formatter);	
		String finalDate = change_dateformat(earlierdate);	
		return finalDate;
		
	}
	
	public String getEarlierYear(String date,int noOfMonths){
		
		String[] dateval = date.split("/");
		
		int month = Integer.parseInt(dateval[0]);
		int day = Integer.parseInt(dateval[1]);
		int year = Integer.parseInt(dateval[2]);
				
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.of(year, month, day);
		LocalDate nextyear = today.minus(noOfMonths, ChronoUnit.YEARS);
		String earlierdate = nextyear.format(formatter);	
		String finalDate = change_dateformat(earlierdate);
		return finalDate;
		
	}

	public String dateformat(String date){
		
		String[] dateval = date.split("/");
		
		int month = Integer.parseInt(dateval[0]);
		int day = Integer.parseInt(dateval[1]);
		int year = Integer.parseInt(dateval[2]);
				
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		LocalDate datevalue = LocalDate.of(year, month, day);		
		String formateddate = datevalue.format(formatter);
			
		return formateddate;
		
	}
	
	public String changedateformat(String date){
				
			String[] dateval = date.split("-");
			String formatedate = dateval[0]+dateval[1]+dateval[2];		
			return formatedate;
	}	
	
	public String change_dateformat(String date){
		
		String[] dateval = date.split("-");		                                                           
		String formatedate = dateval[1]+"/"+dateval[2]+"/"+dateval[0];		
		return formatedate;
	}	
	
	public String convertStringToDollorFormat(String sString){
		 Double dAmount =  Double.parseDouble(sString);		
		 NumberFormat fmt = NumberFormat.getCurrencyInstance();
		 String  sDollor = fmt.format(dAmount);	
		return sDollor;
	}
	
	
	public String getEarlierdate(){
		
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.now();
		LocalDate earlierdate = today.plus(-15, ChronoUnit.DAYS);
		String Earlierdate = earlierdate.format(formatter);	
		String formattedate = change_dateformat(Earlierdate);
		return  formattedate;
		
	}
	
	public String getTodaydate(){
		
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.now();		
		String Todaydate = today.format(formatter);	
		String todaydate = change_dateformat(Todaydate);
		return  todaydate;
	}
	
	public static String getScreenshotDestinationPath(String testname, SeHelper se) throws IOException{
		String screenshot = Util.captureScreenshot(testname, se);
		screenshot = screenshot.substring(ExtentManager.resultsPath.length()+1);
		return screenshot;
	}
	
	public static String captureScreenshot(String screenshotName, SeHelper se) throws IOException{
			File screenshotSource = null;
			screenshotSource = ((TakesScreenshot) se.driver()).getScreenshotAs(OutputType.FILE);
			screenshotName = screenshotName.trim();
			String dest = ExtentManager.getPathForScreenshots()+"\\"+screenshotName+"_"+Util.getCurrentDate()+"_"+Util.getCurrentTime()+".png";
			System.out.println(dest);
			File screenshotDest   = new File(dest);
			FileUtils.copyFile(screenshotSource, screenshotDest);
			InputStream is = new FileInputStream(dest);
		     byte[] imageBytes = IOUtils.toByteArray(is);
		     String base64 = Base64.getEncoder().encodeToString(imageBytes);
		     
			return "data:image/png;base64,"+base64;
	}
	
	public void dynamicFluentWAIT(final By locator)
	{
		

		WebDriver driver = null;
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(5, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

			WebElement element = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					WebElement element = driver.findElement(locator);
					if(element.isDisplayed())
					{
						System.out.println("element is visible");
						return element;
					}
					else
					{
						System.out.println("FluentWait Failed");
						return null;
					}
					/*String getTextOnPage = element.getText();
					if(getTextOnPage.equals(Expectedtext)){
						System.out.println(getTextOnPage);
						return element;
					}else{
						System.out.println("FluentWait Failed");
						return null;
					}*/
				}
			});
		}
	
	public static List<String> getAvalableList(Map<String, String> row){
		List<String> list = new ArrayList<String>();
		for (String name : row.keySet()) {
			if (row.get(name).equalsIgnoreCase("Yes")) {
				list.add(name);
			}
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public static Map<String, String> getExecutionDetails() {
		// TODO Auto-generated method stub
		Map<String, Object> getRowsSheet1 = CommonBaseTest.getXLSTestData("../../resources/test_data/Scenario_Selection", "new", "Scenario_Selection");
		List<Map<String, String>> scenarioSelectionSheetTable = new ArrayList<Map<String, String>>();
		scenarioSelectionSheetTable = (List<Map<String, String>>) getRowsSheet1.get(getRowsSheet1.keySet().iterator().next());
		Map<String, String> executionDetails = scenarioSelectionSheetTable.get(1);
		//System.out.println("Print"+scenarioSelectionSheetTable.get(1));
		return executionDetails;

	}
	
	public static Map<String, String> getQuoteNumber() {
		// TODO Auto-generated method stub
		Map<String, Object> getRowsSheet1 = CommonBaseTest.getXLSTestData("../../resources/test_data/Scenario_Selection", "new", "Scenario_Selection");
		List<Map<String, String>> scenarioSelectionSheetTable = new ArrayList<Map<String, String>>();
		scenarioSelectionSheetTable = (List<Map<String, String>>) getRowsSheet1.get(getRowsSheet1.keySet().iterator().next());
		//System.out.println("Scenario Selection sheet table "+scenarioSelectionSheetTable);
		Map<String, String> quoteNumberDetails = scenarioSelectionSheetTable.get(2);
		//System.out.println("Policy Numbers"+quoteNumberDetails);
		return quoteNumberDetails;

	}
	
	public static Map<String, String> getAccountNumber() {
		// TODO Auto-generated method stub
		Map<String, Object> getRowsSheet1 = CommonBaseTest.getXLSTestData("../../resources/test_data/Scenario_Selection", "new", "Scenario_Selection");
		List<Map<String, String>> scenarioSelectionSheetTable = new ArrayList<Map<String, String>>();
		scenarioSelectionSheetTable = (List<Map<String, String>>) getRowsSheet1.get(getRowsSheet1.keySet().iterator().next());
		//System.out.println("Scenario Selection sheet table "+scenarioSelectionSheetTable);
		Map<String, String> accountNumberDetails = scenarioSelectionSheetTable.get(3);
		//System.out.println("Account Numbers"+accountNumberDetails);
		return accountNumberDetails;

	}
	
	public static Map<String, String> getCloneQuoteNumber() {
		// TODO Auto-generated method stub
		Map<String, Object> getRowsSheet1 = CommonBaseTest.getXLSTestData("../../resources/test_data/Scenario_Selection", "new", "Scenario_Selection");
		List<Map<String, String>> scenarioSelectionSheetTable = new ArrayList<Map<String, String>>();
		scenarioSelectionSheetTable = (List<Map<String, String>>) getRowsSheet1.get(getRowsSheet1.keySet().iterator().next());
		//System.out.println("Scenario Selection sheet table "+scenarioSelectionSheetTable);
		Map<String, String> quoteNumberDetails = scenarioSelectionSheetTable.get(4);
		//System.out.println("Policy Numbers"+quoteNumberDetails);
		return quoteNumberDetails;

	}
	
	public static Map<String, String> getCloneAccountNumber() {
		// TODO Auto-generated method stub
		Map<String, Object> getRowsSheet1 = CommonBaseTest.getXLSTestData("../../resources/test_data/Scenario_Selection", "new", "Scenario_Selection");
		List<Map<String, String>> scenarioSelectionSheetTable = new ArrayList<Map<String, String>>();
		scenarioSelectionSheetTable = (List<Map<String, String>>) getRowsSheet1.get(getRowsSheet1.keySet().iterator().next());
		//System.out.println("Scenario Selection sheet table "+scenarioSelectionSheetTable);
		Map<String, String> accountNumberDetails = scenarioSelectionSheetTable.get(5);
		//System.out.println("Account Numbers"+accountNumberDetails);
		return accountNumberDetails;

	}
	
	@SuppressWarnings("unchecked")
    public static String getRegressionName(String regressionID) {
           
           int iteration = 0;
           String  regressionName = "";
           Map<String, Object> getRowsSheet = CommonBaseTest
                         .getXLSTestDataByRow("../../resources/test_data/Scenario_Selection", "new", "Scenario_Selection");
           List<Map<String, String>> scenarioSelectionData = new ArrayList<Map<String, String>>();
           scenarioSelectionData = (List<Map<String, String>>) getRowsSheet.get(getRowsSheet.keySet().iterator().next());
           while (iteration < scenarioSelectionData.size()) {
                  LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) scenarioSelectionData
                               .get(iteration);
                  if (pageSheetRow.get("Reg_ID").equalsIgnoreCase(regressionID)) {
                        regressionName = pageSheetRow.get("Scenario_Name");
                        break;
                  }
                  iteration++;
           }
           return regressionName;
    }

    

	
	//New Methods to Read data row wise

	///Method to Skip Scenarios for which status sis NO
		@SuppressWarnings("unchecked")
		public static void skipExecution(Method testMethod, ITestAnnotation annotation) {
			int iteration = 0;
			Map<String, Object> getRowsSheet = CommonBaseTest
					.getXLSTestDataByRow("../../resources/test_data/Scenario_Selection", "new", "Scenario_Selection");
			List<Map<String, String>> scenarioSelectionData = new ArrayList<Map<String, String>>();
			scenarioSelectionData = (List<Map<String, String>>) getRowsSheet.get(getRowsSheet.keySet().iterator().next());
			//System.out.println("Scenario Selection Dat"+scenarioSelectionData);
			
			
			while (iteration < scenarioSelectionData.size()) {
				LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) scenarioSelectionData
						.get(iteration);
				//System.out.println("Scenario Selection  - "+pageSheetRow.get("Reg_ID"));
				if(pageSheetRow.get("Reg_ID").equalsIgnoreCase(testMethod.getName())&&pageSheetRow.get("Execute")==null){
					annotation.setEnabled(false);
					break;
				}
				if (pageSheetRow.get("Reg_ID").equalsIgnoreCase(testMethod.getName())&& pageSheetRow.get("Execute").equalsIgnoreCase("No")) {
					annotation.setEnabled(false);
					break;
				}
				
				
				iteration++;
			}
		}

	
	public static String resolveApostrophes(String item) {

		if (!item.contains("'")) {
			return "'" + item + "'";
		}
		StringBuilder finalString = new StringBuilder();
		finalString.append("concat('");
		finalString.append(item.replace("'", "',\"'\",'"));
		finalString.append("')");
		return finalString.toString();
	}
	
	
	
	
	
	public static String getActaulString(String testData) {
		
		if(testData.contains("validate2"))
		{
			String[] strtestdata =testData.split("=");
			String[] strActualTD = strtestdata[1].split("\\|");
			String actual = strActualTD[0];
		return actual;
	}
		else {
			return testData;	
		}
		
	}
	
	// ADDED FOR RANDOM NUMBER - EXTERNAL - NILESH
		public String randomApplicantNameNo() {
		    Random r = new Random();
		    int no = 00000 + r.nextInt(99999);
		    return Integer.toString(no);
		}
	
}