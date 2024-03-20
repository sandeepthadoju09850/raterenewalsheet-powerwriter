package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;
import ap.pages.common.APPW_CommonMethods;



public class CP_PremiumIndication extends BL_OR_CP {
	public void CP_PremiumIndication_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.PremiumIndication)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.PremiumIndication, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strPremiumIndication_TXT_Status = (String) row.get("PremiumIndication_TXT_Status");
			String strPremiumIndication_TXT_TotalEstimatedPremium = (String) row.get("PremiumIndication_TXT_TotalEstimatedPremium");
			String strPremiumIndication_AddCreditOrDebit = (String) row.get("PremiumIndication_AddCreditOrDebit");
			try {
				se.log().logTestStep("CP_PremiumIndication_Details");
				test.log(LogStatus.INFO, "CP_PremiumIndication_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_PremiumIndication_Details");
				APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class);
				se.util().sleep(2000);
				APPW_CommonMethods.GetSummaryHardStopRefresh(2,test);
				APPW_CommonMethods.GetPremiumIndicationRefresh(2,test);
				APPW_CommonMethods.GetPremiumRefresh(3,test);
				if(se.driver().getTitle().contains("502")){
					int count=0;
					do{
						se.browser().refresh();
						se.element().waitForLoad(120);
						if(count>=10){
							break;
						}
						count++;
					}
					while (se.driver().getTitle().contains("502"));
				}
				se.verify().verifyEquals("CP_PremiumIndication_Details  of AgencyPortal ", getPremiumIndication_label().isDisplayed(),true, true,test);
				if(strPremiumIndication_AddCreditOrDebit.equals("Y") )
 {
					
					se.element().Click(getPremiumIndication_AddCreditOrDebitClose(), test);
				}
					if(!se.element().isElementPresent(PremiumIndication_ExpectedWarning)){
						if(se.element().isElementPresent(PremiumIndication_Warning)){
						se.verify().verifyEquals("Rating error on PremiumIndicationscreen -",se.element().isElementPresent(PremiumIndication_Warning),false, true,test);
						}else if(!strPremiumIndication_TXT_TotalEstimatedPremium.equalsIgnoreCase("N/A")){
							se.verify().verifyAsPassOrWarninig("TotalEstimatedPremium on PremiumIndication screen -",getPremIndiLblTotalEstPrem(strPremiumIndication_TXT_TotalEstimatedPremium).getText(),strPremiumIndication_TXT_TotalEstimatedPremium,true,test);
							
							}
					}
					se.element().enterOrValidateText(getPremIndiLblStatusEx(strPremiumIndication_TXT_Status),strPremiumIndication_TXT_Status,test);
					if(strPremiumIndication_AddCreditOrDebit.equals("Y") )
					 {
						boolean linkDisplayed=se.element().waitForElementIsDisplayed(PremiumIndication_AddCreditOrDebitClose);
						if(linkDisplayed ) {
										se.element().Click(getPremiumIndication_AddCreditOrDebitClose(), test);
						}
									}
				}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_PremiumIndication_Details ", true, false, true, test);

			}
			iteration++;
		}
		/*String ErrorMsg=se.element().getSelectedText(PremiumIndication_TXT_Rattingerror);
		if(!ErrorMsg.contains("Invalid City, State and Zip Code combination entered on the Location screen."))
		{
			executor.executeScript("arguments[0].scrollIntoView(0,2000);", getPI_CHK_Continue());
			se.element().Click(getPI_CHK_Continue());
		}*/
		
		
		se.element().Click(getPI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
