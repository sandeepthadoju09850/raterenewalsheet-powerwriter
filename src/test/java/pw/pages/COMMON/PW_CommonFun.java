package pw.pages.COMMON;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.Page;
import Libraries.automation.common.SystemPropertyUtil;
import Libraries.automation.common.framework.OSTools;

public class PW_CommonFun extends Page {

	

	/**
	 * Description - Accessing webapp
	 * @param env 
	 */
	
	
	
	public void PWAppStartUp(ExtentTest test ) {
		ClearBrowserCache();
		getHost(test);
		se.log().logTestStep("Access PW Application");
		test.log(LogStatus.INFO, "Started Execution", "Connecting to PW URL<br><b style='color:OrangeRed'><a href='"+SystemPropertyUtil.getBaseStoreUrl()+"'</a>"+SystemPropertyUtil.getBaseStoreUrl()+"</b>");
		String PWURL = SystemPropertyUtil.getBaseStoreUrl();
		if(PWURL.contains("39")) {
			PWURL = PWURL+"mic";
		}
		se.browser().get(PWURL);
		
	}

	
	
	public void getHost(ExtentTest test) {

		try {
			InetAddress ip = InetAddress.getLocalHost();
			String hostname = ip.getHostName();
			String sUserName = OSTools.getUsername();

			test.log(LogStatus.INFO, "<b>Initiated script execution</b>",
					"<b style='background-color:lightgreen; color:blue'>" + hostname + "</b><br>UserName: "+sUserName);

		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
	}
	
	public void ClearBrowserCache()
	{
		driver.manage().deleteAllCookies(); //delete all cookies
		se.util().sleep(7000); //wait 7 seconds to clear cookies.
	}

	public void RRSAppStartUp(ExtentTest test, String env) {
		
		ClearBrowserCache();
		getHost(test);
		
		
		
		if(env.equals("stage")) {
			se.log().logTestStep("Access RRS Application");
			test.log(LogStatus.INFO, "Started Execution", "Connecting to RRS URL<br><b style='color:OrangeRed'><a href='"+SystemPropertyUtil.getRrsStageUrl()+"'</a>"+SystemPropertyUtil.getRrsStageUrl()+"</b>");
			
		String RRSStage = SystemPropertyUtil.getRrsStageUrl();
		se.browser().get(RRSStage);
		}
		
		else if(env.equals("dev")) {
			se.log().logTestStep("Access RRS Application");
			test.log(LogStatus.INFO, "Started Execution", "Connecting to RRS URL<br><b style='color:OrangeRed'><a href='"+SystemPropertyUtil.getRrsDeveUrl()+"'</a>"+SystemPropertyUtil.getRrsDeveUrl()+"</b>");			
			String RRSDev = SystemPropertyUtil.getRrsDeveUrl();
			se.browser().get(RRSDev);
		}
		else if(env.equals("qa")) {
			se.log().logTestStep("Access RRS Application");
			test.log(LogStatus.INFO, "Started Execution", "Connecting to RRS URL<br><b style='color:OrangeRed'><a href='"+SystemPropertyUtil.getRrsQAUrl()+"'</a>"+SystemPropertyUtil.getRrsQAUrl()+"</b>");
			
			String RRSQA = SystemPropertyUtil.getRrsQAUrl();
			se.browser().get(RRSQA);
		}
		// TODO Auto-generated method stub
		
	}

	

}
