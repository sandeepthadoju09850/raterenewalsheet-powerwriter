package Libraries.automation.common.framework;


import org.apache.commons.lang.time.DateUtils;
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
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.CommonBaseTest;
import Libraries.automation.common.SeHelper;
import pw.Constants.constants;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

//import java.net.URI;
//import java.net.URISyntaxException;

public class Util {
	protected static String sFileName="";
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
	
	public String replacetext(String value, String Character){
		
		String newvalue = value.replace(Character,"");		
		return newvalue;	
	}
	
	public String tomorrowsdate(){
		
		SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
		cal.add(Calendar.DATE, 1 );    
		String convertedDate=dateOnly.format(cal.getTime());    
		return  convertedDate;
		
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
	
	public static String getFutureYear(String date,int noOfYears){
		
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
	
	public static String change_dateformat(String date){
		
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
		testname = (Util.randomNum(0, 10000)).toString();
		String screenshot = Util.captureScreenshot(testname, se);
		screenshot = screenshot.substring(ExtentManager.resultsPath.length()+1);
		return screenshot;
	}
	
	public static String captureScreenshot(String screenshotName, SeHelper se) throws IOException{
			File screenshotSource = null;
			screenshotSource = ((TakesScreenshot) se.driver()).getScreenshotAs(OutputType.FILE);
			screenshotName = screenshotName.trim();
			String dest = ExtentManager.getPathForScreenshots()+"\\"+screenshotName+".png";
			System.out.println(dest);
			File screenshotDest   = new File(dest);
			FileUtils.copyFile(screenshotSource, screenshotDest);
			return dest;
	}
	
	public void dynamicFluentWAIT(final By locator)
	{
		

		WebDriver driver = null;
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30))
		       .pollingEvery(Duration.ofSeconds(5))
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

	/**
	 * Method To get Execution detils
	 * @author RaviTeja Yarra
	 *
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, String> getExecutionDetails() {
		// TODO Auto-generated method stub
		Map<String, Object> getRowsSheet1 = CommonBaseTest.getXLSTestData("Scenario_Selection", "new", "Scenario_Selection");
		List<Map<String, String>> scenarioSelectionSheetTable = new ArrayList<Map<String, String>>();
		scenarioSelectionSheetTable = (List<Map<String, String>>) getRowsSheet1.get(getRowsSheet1.keySet().iterator().next());
		Map<String, String> executionDetails = scenarioSelectionSheetTable.get(1);
		//System.out.println("Print"+scenarioSelectionSheetTable.get(1));
		return executionDetails;

	}
	/**
	 * Method To get Quote No detils
	 * @author RaviTeja Yarra
	 *
	 */
	public static Map<String, String> getQuoteNumber() {
		// TODO Auto-generated method stub
		Map<String, Object> getRowsSheet1 = CommonBaseTest.getXLSTestData("Scenario_Selection", "new", "Scenario_Selection");
		List<Map<String, String>> scenarioSelectionSheetTable = new ArrayList<Map<String, String>>();
		scenarioSelectionSheetTable = (List<Map<String, String>>) getRowsSheet1.get(getRowsSheet1.keySet().iterator().next());
		//System.out.println("Scenario Selection sheet table "+scenarioSelectionSheetTable);
		Map<String, String> quoteNumberDetails = scenarioSelectionSheetTable.get(2);
		//System.out.println("Policy Numbers"+quoteNumberDetails);
		return quoteNumberDetails;

	}
	/**
	 * Method To get Account No detils
	 * @author RaviTeja Yarra
	 *
	 */
	public static Map<String, String> getAccountNumber() {
		// TODO Auto-generated method stub
		Map<String, Object> getRowsSheet1 = CommonBaseTest.getXLSTestData("Scenario_Selection", "new", "Scenario_Selection");
		List<Map<String, String>> scenarioSelectionSheetTable = new ArrayList<Map<String, String>>();
		scenarioSelectionSheetTable = (List<Map<String, String>>) getRowsSheet1.get(getRowsSheet1.keySet().iterator().next());
		//System.out.println("Scenario Selection sheet table "+scenarioSelectionSheetTable);
		Map<String, String> accountNumberDetails = scenarioSelectionSheetTable.get(3);
		//System.out.println("Account Numbers"+accountNumberDetails);
		return accountNumberDetails;

	}
	/**
	 * Method To get Clone Quote detils
	 * @author RaviTeja Yarra
	 *
	 */
	public static Map<String, String> getCloneQuoteNumber() {
		// TODO Auto-generated method stub
		Map<String, Object> getRowsSheet1 = CommonBaseTest.getXLSTestData("Scenario_Selection", "new", "Scenario_Selection");
		List<Map<String, String>> scenarioSelectionSheetTable = new ArrayList<Map<String, String>>();
		scenarioSelectionSheetTable = (List<Map<String, String>>) getRowsSheet1.get(getRowsSheet1.keySet().iterator().next());
		//System.out.println("Scenario Selection sheet table "+scenarioSelectionSheetTable);
		Map<String, String> quoteNumberDetails = scenarioSelectionSheetTable.get(4);
		//System.out.println("Policy Numbers"+quoteNumberDetails);
		return quoteNumberDetails;

	}
	/**
	 * Method To get Clone Account detils
	 * @author RaviTeja Yarra
	 *
	 */
	public static Map<String, String> getCloneAccountNumber() {
		// TODO Auto-generated method stub
		Map<String, Object> getRowsSheet1 = CommonBaseTest.getXLSTestData("Scenario_Selection", "new", "Scenario_Selection");
		List<Map<String, String>> scenarioSelectionSheetTable = new ArrayList<Map<String, String>>();
		scenarioSelectionSheetTable = (List<Map<String, String>>) getRowsSheet1.get(getRowsSheet1.keySet().iterator().next());
		//System.out.println("Scenario Selection sheet table "+scenarioSelectionSheetTable);
		Map<String, String> accountNumberDetails = scenarioSelectionSheetTable.get(5);
		//System.out.println("Account Numbers"+accountNumberDetails);
		return accountNumberDetails;

	}
	/**
	 * Method To get Regression Name 
	 * @author RaviTeja Yarra
	 *
	 */
	public static Map<String, String> getRegressionName() {
		// TODO Auto-generated method stub
		Map<String, Object> getRowsSheet1 = CommonBaseTest.getXLSTestData("Scenario_Selection", "new", "Scenario_Selection");
		List<Map<String, String>> scenarioSelectionSheetTable = new ArrayList<Map<String, String>>();
		scenarioSelectionSheetTable = (List<Map<String, String>>) getRowsSheet1.get(getRowsSheet1.keySet().iterator().next());
		//System.out.println("Scenario Selection sheet table "+scenarioSelectionSheetTable);
		Map<String, String> RegressionNameDetails = scenarioSelectionSheetTable.get(0);
		//System.out.println("RegressionName - "+RegressionNameDetails);
		return RegressionNameDetails;

	}
	/**
	 * Method To get Resolve Apstrophes 
	 * @author RaviTeja Yarra
	 *
	 */
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
	
//New Methods to Read data row wise


	/**
	 * ///Method to Skip Scenarios for which status sis NO
	 * @author RaviTeja Yarra
	 *
	 */
	@SuppressWarnings("unchecked")
	public static void skipExecution(Method testMethod, ITestAnnotation annotation) {
		int iteration = 0;
		String LOB = testMethod.getName().substring(0, 2);
		Map<String, Object> getRowsSheet = CommonBaseTest
				.getXLSTestDataByRow(LOB,"Scenario_Selection", "new", "Scenario_Selection");
		List<Map<String, String>> scenarioSelectionData = new ArrayList<Map<String, String>>();
		scenarioSelectionData = (List<Map<String, String>>) getRowsSheet.get(getRowsSheet.keySet().iterator().next());
		//System.out.println("Scenario Selection Dat"+scenarioSelectionData);
		
		
		while (iteration < scenarioSelectionData.size()) {
			LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) scenarioSelectionData
					.get(iteration);
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

	public static void stopExecutionIfPassed(LinkedHashMap<String, Boolean> RegressionStatus, String LOB)
			throws IOException {

		XlsData xlsdata = new XlsData();
		String filename = "Scenario_Selection";
		String filenam = null;
		String sheetVersion = "new";
		String scenario = "_" + System.getProperty("userName") + "_" + LOB + ".xlsx";

		if (sheetVersion.equalsIgnoreCase("new")) {

			try {
				if (filename.contains("Scenario_Selection")) {
					filenam = constants.TESTDATA_PATH + filename + scenario;
				} else {
					filenam = constants.TESTDATA_PATH + filename;
				}
				xlsdata.markExecuteAsNoIfTestIsPass(RegressionStatus, filenam, filename);
			} catch (Exception e) {
				if (filename.contains("Scenario_Selection")) {
					filenam = constants.TESTDATA_PATH_ALT + filename + scenario;
				} else {
					filenam = constants.TESTDATA_PATH_ALT + filename;
				}
				xlsdata.markExecuteAsNoIfTestIsPass(RegressionStatus, filenam, filename);
			}
		}
		sFileName = filenam;
	}
	
	@SuppressWarnings("unchecked")
	public static List<LinkedHashMap<String, String>> ExecuteRegressions(String LOB) {
		int iteration = 0;
		Map<String, Object> getRowsSheet = CommonBaseTest
				.getXLSTestDataByRow(LOB,"Scenario_Selection", "new", "Scenario_Selection");
		List<Map<String, String>> scenarioSelectionData = new ArrayList<Map<String, String>>();
		scenarioSelectionData = (List<Map<String, String>>) getRowsSheet.get(getRowsSheet.keySet().iterator().next());
		//System.out.println("Scenario Selection Dat"+scenarioSelectionData);
		List<LinkedHashMap<String, String>> executableRegressions = new ArrayList<LinkedHashMap<String, String>>();
		
		while (iteration < scenarioSelectionData.size()) {
			LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) scenarioSelectionData
					.get(iteration);
			
			/*if(pageSheetRow.get("Reg_ID").equalsIgnoreCase(testMethod.getName())&&pageSheetRow.get("Execute")==null){
				
				break;
			}else if (pageSheetRow.get("Reg_ID").equalsIgnoreCase(testMethod.getName())&& pageSheetRow.get("Execute").equalsIgnoreCase("No")) {
				
				break;
			}else*/ if (pageSheetRow.get("Execute").equalsIgnoreCase("Yes")&& pageSheetRow.get("Reg_ID").contains(LOB)) {
				
			
				executableRegressions.add(pageSheetRow);
			}
			
			
			iteration++;
		}
		return executableRegressions;
	}
	
	

	public static void setQuoteAndAccountNumber(String LOB) throws IOException {
		List<LinkedHashMap<String, String>> executableRegressions = Util.ExecuteRegressions(LOB);

		XlsData xlsdata = new XlsData();
		String filename = "Scenario_Selection";
		String filenam = null;
		String sheetVersion = "new";
		String scenario = "_" + System.getProperty("userName") + "_" + LOB + ".xlsx";

		if (sheetVersion.equalsIgnoreCase("new")) {

			try {
				if (filename.contains("Scenario_Selection")) {
					filenam = constants.TESTDATA_PATH + filename + scenario;
				} else {

					filenam = constants.TESTDATA_PATH + filename;
				}
				xlsdata.updateQuoteAndAccountNumber(executableRegressions, filenam, filename);
			} catch (Exception e) {
				if (filename.contains("Scenario_Selection")) {
					filenam = constants.TESTDATA_PATH_ALT + filename + scenario;
				} else {

					filenam = constants.TESTDATA_PATH_ALT + filename;
				}
				xlsdata.updateQuoteAndAccountNumber(executableRegressions, filenam, filename);
			}

		}
		sFileName = filenam;

	}
	//Method To get account Number from sheet
	//Read data row wise
	/**
	 * Method To get get Account Numbers from Sheet  
	 * @author RaviTeja Yarra
	 *
	 */
	@SuppressWarnings("unchecked")
	public static String getAccountNumber(String regressionID, String transactionName) {
	String underlyingPolicy = transactionName.substring(0, 2);
	if(regressionID.contains(constants.PM)) {
		underlyingPolicy = "PM_"+underlyingPolicy;
	}
	int iteration = 0;
	String  accountNumber = "";
	Map<String, Object> getRowsSheet = CommonBaseTest
			.getXLSTestDataByRow(regressionID.substring(0, 2),"Scenario_Selection", "new", "Scenario_Selection");
	List<Map<String, String>> scenarioSelectionData = new ArrayList<Map<String, String>>();
	scenarioSelectionData = (List<Map<String, String>>) getRowsSheet.get(getRowsSheet.keySet().iterator().next());
	while (iteration < scenarioSelectionData.size()) {
		LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) scenarioSelectionData
				.get(iteration);
		if(!(regressionID.contains(constants.CU)||regressionID.contains(constants.PM))){
			if ((pageSheetRow.get(constants.RegressionID).equalsIgnoreCase(regressionID))) {
				accountNumber = pageSheetRow.get(constants.AccountNumber);
				break;
			}
		}
		else{
			if(!((pageSheetRow.get(constants.UnderlyingPolicy)).equalsIgnoreCase(constants.NA)||(pageSheetRow.get(constants.UnderlyingPolicy)).contains(constants.PM))){
				
				if((pageSheetRow.get(constants.RegressionID).equalsIgnoreCase(regressionID))&&(pageSheetRow.get(constants.UnderlyingPolicy).equalsIgnoreCase(underlyingPolicy))){
					accountNumber = pageSheetRow.get(constants.AccountNumber);
					break;
				}
			}
			else{
				if(underlyingPolicy.equalsIgnoreCase(constants.CU)&&(pageSheetRow.get(constants.RegressionID).equalsIgnoreCase(regressionID))&&(pageSheetRow.get(constants.UnderlyingPolicy).equalsIgnoreCase(constants.NA))){
				accountNumber = pageSheetRow.get(constants.AccountNumber);
				break;
				}
				
				if(underlyingPolicy.contains(constants.PM)&&(pageSheetRow.get(constants.RegressionID).equalsIgnoreCase(regressionID))&&(pageSheetRow.get(constants.UnderlyingPolicy).contains(constants.PM))){
					accountNumber = pageSheetRow.get(constants.AccountNumber);
					break;
				}
				
			}		
		}
		iteration++;
	}
	return accountNumber;
}
	
	//Method To get Quote Number from sheet
		//Read data row wise
	/**
	 * Method To get get Quote Numbers from Sheet  
	 * @author RaviTeja Yarra
	 *
	 */
		@SuppressWarnings("unchecked")
		public static String getQuoteNumber(String regressionID, String transactionName) {
		String underlyingPolicy = transactionName.substring(0, 2);
		if((regressionID.contains(constants.PM) && transactionName.contains(constants.CA))||regressionID.equalsIgnoreCase("PM_7")||regressionID.contains("PMSmoke")) {
			underlyingPolicy = "PM_"+underlyingPolicy;
		}
		int iteration = 0;
		String  quoteNumber = "";
		Map<String, Object> getRowsSheet = CommonBaseTest
				.getXLSTestDataByRow(regressionID.substring(0, 2),"Scenario_Selection", "new", "Scenario_Selection");
		List<Map<String, String>> scenarioSelectionData = new ArrayList<Map<String, String>>();
		scenarioSelectionData = (List<Map<String, String>>) getRowsSheet.get(getRowsSheet.keySet().iterator().next());
		while (iteration < scenarioSelectionData.size()) {
			LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) scenarioSelectionData
					.get(iteration);
			if(!(regressionID.contains(constants.CU)||regressionID.contains(constants.PM))){
				if ((pageSheetRow.get(constants.RegressionID).equalsIgnoreCase(regressionID))) {
					quoteNumber = pageSheetRow.get(constants.QuoteNumber);
					break;
				}
			}
			else{
				if(!((pageSheetRow.get(constants.UnderlyingPolicy)).equalsIgnoreCase(constants.NA)||(pageSheetRow.get(constants.UnderlyingPolicy)).contains(constants.PM))){
					
					if((pageSheetRow.get(constants.RegressionID).equalsIgnoreCase(regressionID))&&(pageSheetRow.get(constants.UnderlyingPolicy).equalsIgnoreCase(underlyingPolicy))){
						quoteNumber = pageSheetRow.get(constants.QuoteNumber);
						break;
					}
				}
				else{
					if(underlyingPolicy.equalsIgnoreCase(constants.CU)&&(pageSheetRow.get(constants.RegressionID).equalsIgnoreCase(regressionID))&&(pageSheetRow.get(constants.UnderlyingPolicy).equalsIgnoreCase(constants.NA))){
					quoteNumber = pageSheetRow.get(constants.QuoteNumber);
					break;
					}
					
					if(underlyingPolicy.contains(constants.PM)&&(pageSheetRow.get(constants.RegressionID).equalsIgnoreCase(regressionID))&&(pageSheetRow.get(constants.UnderlyingPolicy).contains(constants.PM))){
						quoteNumber = pageSheetRow.get(constants.QuoteNumber);
						break;
					}
					
				}		
			}
			iteration++;
		}
		return quoteNumber;
	}
	
	//Method to read Clone Account Number row wise
		/**
		 * Method To get get Clone Account Numbers from Sheet  
		 * @author RaviTeja Yarra
		 *
		 */
	@SuppressWarnings("unchecked")
	public static String getCloneAccountNumber(String regressionID, String transactionName) {
	String underlyingPolicy = transactionName.substring(0, 2);
	int iteration = 0;
	String  cloneAccountNumber = "";
	Map<String, Object> getRowsSheet = CommonBaseTest
			.getXLSTestDataByRow(regressionID.substring(0, 2),"Scenario_Selection", "new", "Scenario_Selection");
	List<Map<String, String>> scenarioSelectionData = new ArrayList<Map<String, String>>();
	scenarioSelectionData = (List<Map<String, String>>) getRowsSheet.get(getRowsSheet.keySet().iterator().next());
	while (iteration < scenarioSelectionData.size()) {
		LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) scenarioSelectionData
				.get(iteration);
		if(!regressionID.contains(constants.CU)){
		if ((pageSheetRow.get(constants.RegressionID).equalsIgnoreCase(regressionID))) {
			if(pageSheetRow.get(constants.isClonePolicyApplicable).equals(constants.Yes)){
				cloneAccountNumber = pageSheetRow.get(constants.CloneAccountNumber);
			} else {
				cloneAccountNumber = constants.NA;
			}
			break;
		}
		}
		else{
			if(!(pageSheetRow.get(constants.UnderlyingPolicy)).equalsIgnoreCase(constants.NA)){
				
			if((pageSheetRow.get(constants.RegressionID).equalsIgnoreCase(regressionID))&&(pageSheetRow.get(constants.UnderlyingPolicy).equalsIgnoreCase(underlyingPolicy))){
				if(pageSheetRow.get(constants.isClonePolicyApplicable).equals(constants.Yes)){
					cloneAccountNumber = pageSheetRow.get(constants.CloneAccountNumber);
				} else {
					cloneAccountNumber = constants.NA;
				}
				break;
			}
			}
			else{
				if(underlyingPolicy.equalsIgnoreCase(constants.CU)&&(pageSheetRow.get(constants.RegressionID).equalsIgnoreCase(regressionID))&&(pageSheetRow.get(constants.UnderlyingPolicy).equalsIgnoreCase(constants.NA))){
					if(pageSheetRow.get(constants.isClonePolicyApplicable).equals(constants.Yes)){
						cloneAccountNumber = pageSheetRow.get(constants.CloneAccountNumber);
					} else {
						cloneAccountNumber = constants.NA;
					}break;
				}
			}		
		}
		iteration++;
	}
	return cloneAccountNumber;
}

	//Method to get Clone Quote Number 
	//Reading data Row Wise
	/**
	 * Method To get get  Clone Quote Numbers from Sheet  
	 * @author RaviTeja Yarra
	 *
	 */
	@SuppressWarnings("unchecked")
	public static String getCloneQuoteNumber(String regressionID, String transactionName) {
	String underlyingPolicy = transactionName.substring(0, 2);
	int iteration = 0;
	String  cloneQuoteNumber = "";
	Map<String, Object> getRowsSheet = CommonBaseTest
			.getXLSTestDataByRow(regressionID.substring(0, 2),"Scenario_Selection", "new", "Scenario_Selection");
	List<Map<String, String>> scenarioSelectionData = new ArrayList<Map<String, String>>();
	scenarioSelectionData = (List<Map<String, String>>) getRowsSheet.get(getRowsSheet.keySet().iterator().next());
	while (iteration < scenarioSelectionData.size()) {
		LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) scenarioSelectionData
				.get(iteration);
			if (!regressionID.contains(constants.CU)) {
				if ((pageSheetRow.get(constants.RegressionID).equalsIgnoreCase(regressionID))) {
					// Sai-03/31/21- Added IF condition to check value of "isClonePolicyApplicable" to get rid of HTML report failure
					if (pageSheetRow.get(constants.isClonePolicyApplicable).equals(constants.Yes)) {
						cloneQuoteNumber = pageSheetRow.get(constants.CloneQuoteNumber);
					} else {
						cloneQuoteNumber = constants.NA;
					}
					break;
				}
			} else {
				if (!(pageSheetRow.get(constants.UnderlyingPolicy)).equalsIgnoreCase(constants.NA)) {

					if ((pageSheetRow.get(constants.RegressionID).equalsIgnoreCase(regressionID))
							&& (pageSheetRow.get(constants.UnderlyingPolicy).equalsIgnoreCase(underlyingPolicy))) {
						if (pageSheetRow.get(constants.isClonePolicyApplicable).equals(constants.Yes)) {
							cloneQuoteNumber = pageSheetRow.get(constants.CloneQuoteNumber);
						} else {
							cloneQuoteNumber = constants.NA;
						}
						break;
					}
				} else {
					if (underlyingPolicy.equalsIgnoreCase(constants.CU)
							&& (pageSheetRow.get(constants.RegressionID).equalsIgnoreCase(regressionID))
							&& (pageSheetRow.get(constants.UnderlyingPolicy).equalsIgnoreCase(constants.NA))) {
						if (pageSheetRow.get(constants.isClonePolicyApplicable).equals(constants.Yes)) {
							cloneQuoteNumber = pageSheetRow.get(constants.CloneQuoteNumber);
						} else {
							cloneQuoteNumber = constants.NA;
						}
						break;
					}
				}
			}
		iteration++;
	}
	return cloneQuoteNumber;
}

//New method to retrive Regression Name
	/**
	 * Method To get get  Regression Name from Sheet  
	 * @author RaviTeja Yarra
	 *
	 */
	@SuppressWarnings("unchecked")
	public static String getRegressionName(String regressionID) {
		
		int iteration = 0;
		String  regressionName = "";
		Map<String, Object> getRowsSheet = CommonBaseTest
				.getXLSTestDataByRow(regressionID.substring(0, 2),"Scenario_Selection", "new", "Scenario_Selection");
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

}