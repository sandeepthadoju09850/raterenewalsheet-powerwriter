package Libraries.automation.common.framework;

import java.io.File;
import java.io.IOException;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.NetworkMode;

public class ExtentManager {
	
	static ExtentReports extent;
    private static String date = "Run_" + Util.getCurrentDate();
	private static String dateNTime = "Run_" + Util.getCurrentDate() + "_" + Util.getCurrentTime();
	private static String homePath = homepath() + "\\Results";
	//private static String resultsFolder = homePath + "\\" + date;
	//public static String resultsPath = resultsFolder + "\\" + dateNTime + "/CP";
	public static String resultsPath = homePath;
	final static String summaryReportHTML = homePath + "\\BatchExecutionReportSummary.html";
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
        String fileName = getReportPath(homePath);
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
		return homePath;
	}
	
	public static String getPathForScreenshots() {
		return screenshotPath;
	}
}
