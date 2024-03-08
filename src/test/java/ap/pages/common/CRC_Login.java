package ap.pages.common;

import java.io.IOException;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Libraries.ap.automation.common.SystemPropertyUtil;
import ap.OR.OR_CP;

public class CRC_Login extends OR_CP {
	/*************** CRC Login ***************/
	public void CRCLogin(String transaction,ExtentTest test) throws IOException  {
		try {
			
			if(transaction.equalsIgnoreCase("CRCNewQuote"))
			{
				se.log().logTestStep("Access CRC Application");
				se.browser().get(SystemPropertyUtil.getCRCUrl(), test);
				test.log(LogStatus.INFO, "Access CRC Application", "<br> URL : "+SystemPropertyUtil.getCRCUrl());
			}
			
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
			se.verify().verifyEquals("CRC App login fail", true, false, true, test);
		}
}}
