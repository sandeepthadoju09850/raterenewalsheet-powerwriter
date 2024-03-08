package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;

public class CP_LossHistoryExpRating extends OR_CP{

	public void CP_LossHistoryExpRating_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.LossHistoryExpRating)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.LossHistoryExpRating, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			se.util().sleep(5000);
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strLiabilityClasses_BTN_Add = (String) row.get("LossHistoryExpRating_BTN_ADDNew");
			String strLossHistoryExpRating_DD_TypeofLoss = (String) row.get("LossHistoryExpRating_DD_TypeofLoss");
			String strLossHistoryExpRating_TXT_DateofLoss = (String) row.get("LossHistoryExpRating_TXT_DateofLoss");
			String strLossHistoryExpRating_TXT_AmountPaid = (String) row.get("LossHistoryExpRating_TXT_AmountPaid");
			String strLossHistoryExpRating_TXT_AmountReserved = (String) row.get("LossHistoryExpRating_TXT_AmountReserved");
			String strLossHistoryExpRating_TXT_ExpenseAmount = (String) row.get("LossHistoryExpRating_TXT_ExpenseAmount");
			String strLossHistoryExpRating_TXT_TotIncurredAmount = (String) row.get("LossHistoryExpRating_TXT_TotIncurredAmount");
			String strLossHistoryExpRating_DD_ClaimStatusIndicator = (String) row.get("LossHistoryExpRating_DD_ClaimStatusIndicator");
			String strLossHistoryExpRating_DD_ClaimStatusIndicator_CA = (String) row.get("LossHistoryExpRating_DD_ClaimStatusIndicator_CA");
			String strLossHistoryExpRating_TXT_BriefDescofLoss = (String) row.get("LossHistoryExpRating_TXT_BriefDescofLoss");
			String strLossHistoryExpRating_TXT_GLCredibiltyFactorTestBox = (String) row.get("LossHistoryExpRating_TXT_GLCredibiltyFactorTestBox");
			String strLossHistoryExpRating_TXT_LiabilityIncurredAmount = (String) row.get("LossHistoryExpRating_TXT_LiabilityIncurredAmount");
			String strLossHistoryExpRating_TXT_PhysicalIncurredAmount = (String) row.get("LossHistoryExpRating_TXT_PhysicalIncurredAmount");
			
			String strLossHistoryExpRating_CHK_LIabilityLosses_No =(String) row.get("LossHistoryExpRating_CHK_LIabilityLosses_No");
			String strLossHistoryExpRating_CHK_LIabilityLosses_Yes =(String) row.get("LossHistoryExpRating_CHK_LIabilityLosses_Yes");
			
			String strLossHistoryExpRating_CHK_PhysicalDamageLosses_No=(String) row.get("LossHistoryExpRating_CHK_PhysicalDamageLosses_No");
			String strLossHistoryExpRating_CHK_PhysicalDamageLosses_Yes=(String) row.get("LossHistoryExpRating_CHK_PhysicalDamageLosses_Yes");
			String strLossHistoryExpRating_TXT_BriefDescriptionofLoss=(String) row.get("LossHistoryExpRating_TXT_BriefDescriptionofLoss");
			
			
			try {
				se.log().logTestStep("CP_LossHistoryExpRating_Details");
				test.log(LogStatus.INFO, "CP_LossHistoryExpRating_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_LossHistoryExpRating_Details");
				se.verify().verifyEquals("CP_LossHistoryExpRating_Details  of AgencyPortal ", getLossHistoryExpRating_label().isDisplayed(),true, true,test);	
				if(strLiabilityClasses_BTN_Add.contains("Add"))
				{
					se.element().Click(geLossHistoryExpRating_BTN_AddNew(), test);
					se.element().SelectElement( LossHistoryExpRating_DD_TypeofLoss,strLossHistoryExpRating_DD_TypeofLoss,test);
					se.util().sleep(2000);
					se.element().enterOrValidateText( getLossHistoryExpRating_TXT_BriefDescriptionofLoss(strLossHistoryExpRating_TXT_BriefDescriptionofLoss),strLossHistoryExpRating_TXT_BriefDescriptionofLoss,test);
					se.util().sleep(2000);
					se.element().enterOrValidateText( getLossHistoryExpRating_TXT_DateofLoss(strLossHistoryExpRating_TXT_DateofLoss),strLossHistoryExpRating_TXT_DateofLoss,test);
					se.util().sleep(2000);
					se.element().enterOrValidateText( getLossHistoryExpRating_TXT_AmountPaid(strLossHistoryExpRating_TXT_AmountPaid),strLossHistoryExpRating_TXT_AmountPaid,test);
					se.util().sleep(2000);
					se.element().enterOrValidateText( getLossHistoryExpRating_TXT_AmountReserved(strLossHistoryExpRating_TXT_AmountReserved),strLossHistoryExpRating_TXT_AmountReserved,test);
					se.util().sleep(2000);
					se.element().enterOrValidateText( getLossHistoryExpRating_TXT_ExpenseAmount(strLossHistoryExpRating_TXT_ExpenseAmount),strLossHistoryExpRating_TXT_ExpenseAmount,test);
					se.util().sleep(2000);
					se.element().enterOrValidateText( getLossHistoryExpRating_TXT_TotIncurredAmount(strLossHistoryExpRating_TXT_TotIncurredAmount),strLossHistoryExpRating_TXT_TotIncurredAmount,test);
					se.util().sleep(3000);
					se.element().SelectElement( LossHistoryExpRating_DD_ClaimStatusIndicator,strLossHistoryExpRating_DD_ClaimStatusIndicator,test);
					se.element().SelectElement( LossHistoryExpRating_DD_ClaimStatusIndicator_CA,strLossHistoryExpRating_DD_ClaimStatusIndicator_CA,test);
					se.util().sleep(3000);
					se.element().enterOrValidateText( getLossHistoryExpRating_TXT_BriefDescofLoss(strLossHistoryExpRating_TXT_BriefDescofLoss),strLossHistoryExpRating_TXT_BriefDescofLoss,test);
					se.element().enterOrValidateText( getLossHistoryExpRating_TXT_GLCredibiltyFactorTestBox(strLossHistoryExpRating_TXT_GLCredibiltyFactorTestBox),strLossHistoryExpRating_TXT_GLCredibiltyFactorTestBox,test);
					se.util().sleep(3000);
					se.element().checkUncheckOrValidate(getLossHistoryExpRating_CHK_LIabilityLosses_No(strLossHistoryExpRating_CHK_LIabilityLosses_No),strLossHistoryExpRating_CHK_LIabilityLosses_No,test);
					se.element().checkUncheckOrValidate(getLossHistoryExpRating_CHK_LIabilityLosses_Yes(strLossHistoryExpRating_CHK_LIabilityLosses_Yes),strLossHistoryExpRating_CHK_LIabilityLosses_Yes,test);
					se.element().checkUncheckOrValidate(getLossHistoryExpRating_CHK_PhysicalDamageLosses_Yes(strLossHistoryExpRating_CHK_PhysicalDamageLosses_Yes),strLossHistoryExpRating_CHK_PhysicalDamageLosses_Yes,test);
					se.element().checkUncheckOrValidate(getLossHistoryExpRating_CHK_PhysicalDamageLosses_No(strLossHistoryExpRating_CHK_PhysicalDamageLosses_No),strLossHistoryExpRating_CHK_PhysicalDamageLosses_No,test);
					
				
					se.element().enterOrValidateText( getLossHistoryExpRating_TXT_LiabilityIncurredAmount(strLossHistoryExpRating_TXT_LiabilityIncurredAmount),strLossHistoryExpRating_TXT_LiabilityIncurredAmount,test);
					se.element().enterOrValidateText( getLossHistoryExpRating_TXT_PhysicalIncurredAmount(strLossHistoryExpRating_TXT_PhysicalIncurredAmount),strLossHistoryExpRating_TXT_PhysicalIncurredAmount,test);
					se.util().sleep(5000);
					se.element().Click(getAdd_Button(), test);
					se.util().sleep(10000);
					if(!se.element().isElementEnabled(GI_CHK_Continue)){
						se.element().refreshBrowser();
						se.element().Click(getCancel_Button("Cancel"), test);
						iteration--;
					}
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_LossHistoryExpRating_Details ", true, false, true, test);
			}
			iteration++;
		}
		executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
