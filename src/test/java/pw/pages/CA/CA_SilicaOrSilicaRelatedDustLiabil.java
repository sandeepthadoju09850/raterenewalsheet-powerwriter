package pw.pages.CA;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CA;
import pw.OR.OR_CP;
import pw.OR.OR_GL;


/**
* @author ${ro09528}
*/

public class CA_SilicaOrSilicaRelatedDustLiabil extends OR_CA{
	
	public void SilicaOrSilicaRelatedDustLiabil(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		//String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(suspendSheet.equalsIgnoreCase(constants.CA_SilicaOrSilicaRelatedDustLiabil)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_SilicaOrSilicaRelatedDustLiabil, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strSilicaOrSilicaRelatedDustLiability_BTN_Details = (String) row.get("SilicaOrSilicaRelatedDustLiability_BTN_Details");
			String strSilicaOrSilicaRelatedDustLiability_BTN_Add = (String) row.get("SilicaOrSilicaRelatedDustLiability_BTN_Add");
			String strSilicaOrSilicaRelatedDustLiability_BTN_Edit = (String) row.get("SilicaOrSilicaRelatedDustLiability_BTN_Edit");
			String strSilicaOrSilicaRelatedDustLiability_BTN_Done = (String) row.get("SilicaOrSilicaRelatedDustLiability_BTN_Done");
			String strSilicaOrSilicaRelatedDustLiability_TXT_StateFilterNeeded = (String) row.get("SilicaOrSilicaRelatedDustLiability_BTN_Done");
			String strSilicaOrSilicaRelatedDustLiability_TXT_State = (String) row.get("SilicaOrSilicaRelatedDustLiability_TXT_State");
			String strSilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_CoveredAutos = (String) row.get("SilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_CoveredAutos");
			String strSilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_OtherThanCoveredAutos = (String) row.get("SilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_OtherThanCoveredAutos");
			String strSilicaOrSilicaRelatedDustLiability_TXT_AnnualPremium = (String) row.get("SilicaOrSilicaRelatedDustLiability_TXT_AnnualPremium");
			
			try{						
			se.log().logTestStep("CA_SilicaOrSilicaRelatedDustLiability");
			test.log(LogStatus.INFO, "CA_SilicaOrSilicaRelatedDustLiability page","Transaction Step : "+transaction + "<br>" +"Page : CA_SilicaOrSilicaRelatedDustLiability");
			se.verify().verifyEquals("CA_SilicaOrSilicaRelatedDustLiability Page of PowerWriter ", getSilicaOrSilicaRelatedDustLiability_Label().isDisplayed(),true, true,test);
			if(!strSilicaOrSilicaRelatedDustLiability_BTN_Add.equals(constants.NA)){
				se.element().Click(getSilicaOrSilicaRelatedDustLiability_BTN_Add(strSilicaOrSilicaRelatedDustLiability_BTN_Add),strSilicaOrSilicaRelatedDustLiability_BTN_Add,test);
			}
			if(!strSilicaOrSilicaRelatedDustLiability_BTN_Details.equals(constants.NA)){
				se.element().Click(getSilicaOrSilicaRelatedDustLiability_BTN_Details(strSilicaOrSilicaRelatedDustLiability_BTN_Details),strSilicaOrSilicaRelatedDustLiability_BTN_Details,test);
			}			
			se.element().Click(getSilicaOrSilicaRelatedDustLiability_BTN_Edit(strSilicaOrSilicaRelatedDustLiability_BTN_Edit),strSilicaOrSilicaRelatedDustLiability_BTN_Edit,test);
			se.element().selectPopupWithMagnifier(getSilicaOrSilicaRelatedDustLiability_TXT_State(strSilicaOrSilicaRelatedDustLiability_TXT_State),getSilicaOrSilicaRelatedDustLiability_TXT_StateSearch(strSilicaOrSilicaRelatedDustLiability_TXT_State),strSilicaOrSilicaRelatedDustLiability_TXT_State,strSilicaOrSilicaRelatedDustLiability_TXT_StateFilterNeeded,strSilicaOrSilicaRelatedDustLiability_TXT_State, constants.NA, constants.NA,constants.NA,test);
			se.element().checkUncheckOrValidate(getSilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_CoveredAutos(strSilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_CoveredAutos),strSilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_CoveredAutos,test);
			se.element().checkUncheckOrValidate(getSilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_OtherThanCoveredAutos(strSilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_OtherThanCoveredAutos),strSilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_OtherThanCoveredAutos,test);
			se.element().enterOrValidateText(getSilicaOrSilicaRelatedDustLiability_TXT_AnnualPremium(strSilicaOrSilicaRelatedDustLiability_TXT_AnnualPremium),strSilicaOrSilicaRelatedDustLiability_TXT_AnnualPremium,test);
		
			se.element().clickElement(getNext());
			se.util().sleep(2000);
			if(!strSilicaOrSilicaRelatedDustLiability_BTN_Done.equals(constants.NA)){
				se.element().Click(getGarageKeepers_BTN_Done(strSilicaOrSilicaRelatedDustLiability_BTN_Done),strSilicaOrSilicaRelatedDustLiability_BTN_Done,test);
			}
			}catch(Exception e){
						se.verify().verifyEquals("Failed to fill in details for CA_SilicaOrSilicaRelatedDustLiability ", true, false, true, test);			
			}
				iteration++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

	}
	

}