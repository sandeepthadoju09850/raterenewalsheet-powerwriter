package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CIM;

public class CIM_MiscellaneousBailee extends OR_CIM {
	public void MiscellaneousBailee(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_MiscellaneousBailee")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_MiscellaneousBailee", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_MiscellaneousBailee_BTN_Add=(String) row.get("CIM_MiscellaneousBailee_BTN_Add");
		String strCIM_MiscellaneousBailee_Edit=(String) row.get("CIM_MiscellaneousBailee_Edit");
		String strCIM_MiscellaneousBailee_Done=(String) row.get("CIM_MiscellaneousBailee_Done");
		String strCIM_MiscellaneousBailee_TXT_ItemNo = (String) row.get("CIM_MiscellaneousBailee_TXT_ItemNo");
		String strCIM_MiscellaneousBailee_TXT_LocationNo = (String) row.get("CIM_MiscellaneousBailee_TXT_LocationNo");
		String strCIM_MiscellaneousBailee_TXT_Name = (String) row.get("CIM_MiscellaneousBailee_TXT_Name");
		String strCIM_MiscellaneousBailee_TXT_Description = (String) row.get("CIM_MiscellaneousBailee_TXT_Description");
		String strCIM_MiscellaneousBailee_TXT_Street = (String) row.get("CIM_MiscellaneousBailee_TXT_Street");
		String strCIM_MiscellaneousBailee_TXT_SteUnit = (String) row.get("CIM_MiscellaneousBailee_TXT_SteUnit");
		String strCIM_MiscellaneousBailee_TXT_City = (String) row.get("CIM_MiscellaneousBailee_TXT_City");
		String strCIM_MiscellaneousBailee_TXT_State = (String) row.get("CIM_MiscellaneousBailee_TXT_State");
		String strCIM_MiscellaneousBailee_TXT_Zip = (String) row.get("CIM_MiscellaneousBailee_TXT_Zip");
		String strCIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedProperty = (String) row.get("CIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedProperty");
		String strCIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedPropertyLim = (String) row.get("CIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedPropertyLim");
		String strCIM_MiscellaneousBailee_CHK_OverrideBaseRateYes = (String) row.get("CIM_MiscellaneousBailee_CHK_OverrideBaseRateYes");
		String strCIM_MiscellaneousBailee_TXT_OverrideReason = (String) row.get("CIM_MiscellaneousBailee_TXT_OverrideReason");
		String strCIM_MiscellaneousBailee_CHK_OverrideBaseRateNo = (String) row.get("CIM_MiscellaneousBailee_CHK_OverrideBaseRateNo");
		String strCIM_MiscellaneousBailee_TXT_BaseRate = (String) row.get("CIM_MiscellaneousBailee_TXT_BaseRate");
		String strCIM_MiscellaneousBailee_TXT_BaseRateOverride = (String) row.get("CIM_MiscellaneousBailee_TXT_BaseRateOverride");
		String strCIM_MiscellaneousBailee_TXT_DeductibleFactor = (String) row.get("CIM_MiscellaneousBailee_TXT_DeductibleFactor");
		String strCIM_MiscellaneousBailee_TXT_TransitionAdjustmentFtr = (String) row.get("CIM_MiscellaneousBailee_TXT_TransitionAdjustmentFtr");
		String strCIM_MiscellaneousBailee_TXT_FinalRate = (String) row.get("CIM_MiscellaneousBailee_TXT_FinalRate");
		String strCIM_MiscellaneousBailee_TXT_OverrideFinalRate = (String) row.get("CIM_MiscellaneousBailee_TXT_OverrideFinalRate");
		String strCIM_MiscellaneousBailee_TXT_Limit = (String) row.get("CIM_MiscellaneousBailee_TXT_Limit");
		String strCIM_MiscellaneousBailee_TXT_Premium = (String) row.get("CIM_MiscellaneousBailee_TXT_Premium");
		String strCIM_MiscellaneousBailee_TXT_OverridePremium = (String) row.get("CIM_MiscellaneousBailee_TXT_OverridePremium");
		String strTransaction = (String) row.get("Transaction Name");
		
		try{
			se.log().logTestStep("MiscellaneousBailee");
			
			test.log(LogStatus.INFO, "MiscellaneousBailee page","Transaction Step : "+strTransaction + "<br>" +"Page : MiscellaneousBailee");
			se.verify().verifyEquals("MiscellaneousBailee page of PowerWriter ", getCIM_MiscellaneousBailee_TXT_VerifyMiscellaneousBaileeText().isDisplayed(),true, true,test);	
			if(strCIM_MiscellaneousBailee_BTN_Add.equalsIgnoreCase("Yes")){
				se.element().clickElement(AddbuttonCIMMiscellaneousBailee);
			}
			if(strCIM_MiscellaneousBailee_Edit.equalsIgnoreCase("Yes")){
				se.element().tryClick(getEditbuttonCIMMiscellaneousBailee(strCIM_MiscellaneousBailee_Edit),test);
			}
			se.element().enterOrValidateText(getCIM_MiscellaneousBailee_TXT_ItemNo(strCIM_MiscellaneousBailee_TXT_ItemNo),strCIM_MiscellaneousBailee_TXT_ItemNo,test);
			se.element().selectPopupWithMagnifier(getCIM_MiscellaneousBailee_TXT_LocationNo(strCIM_MiscellaneousBailee_TXT_LocationNo), getCIM_MiscellaneousBailee_BTN_LocationNoSearch(strCIM_MiscellaneousBailee_TXT_LocationNo), strCIM_MiscellaneousBailee_TXT_LocationNo, constants.NA, strCIM_MiscellaneousBailee_TXT_LocationNo, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_MiscellaneousBailee_TXT_Name(strCIM_MiscellaneousBailee_TXT_Name),strCIM_MiscellaneousBailee_TXT_Name,test);
			se.element().enterOrValidateText(getCIM_MiscellaneousBailee_TXT_Description(strCIM_MiscellaneousBailee_TXT_Description),strCIM_MiscellaneousBailee_TXT_Description,test);
			se.element().enterOrValidateText(getCIM_MiscellaneousBailee_TXT_Street(strCIM_MiscellaneousBailee_TXT_Street),strCIM_MiscellaneousBailee_TXT_Street,test);
			se.element().enterOrValidateText(getCIM_MiscellaneousBailee_TXT_SteUnit(strCIM_MiscellaneousBailee_TXT_SteUnit),strCIM_MiscellaneousBailee_TXT_SteUnit,test);
			se.element().enterOrValidateText(getCIM_MiscellaneousBailee_TXT_City(strCIM_MiscellaneousBailee_TXT_City),strCIM_MiscellaneousBailee_TXT_City,test);
			se.element().enterOrValidateText(getCIM_MiscellaneousBailee_TXT_State(strCIM_MiscellaneousBailee_TXT_State),strCIM_MiscellaneousBailee_TXT_State,test);
			se.element().enterOrValidateText(getCIM_MiscellaneousBailee_TXT_Zip(strCIM_MiscellaneousBailee_TXT_Zip),strCIM_MiscellaneousBailee_TXT_Zip,test);
			se.element().enterOrValidateText(getCIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedProperty(strCIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedProperty),strCIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedProperty,test);
			se.element().enterOrValidateText(getCIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedPropertyLim(strCIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedPropertyLim),strCIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedPropertyLim,test);
			se.element().checkUncheckOrValidate(getCIM_MiscellaneousBailee_CHK_OverrideBaseRateYes(strCIM_MiscellaneousBailee_CHK_OverrideBaseRateYes),strCIM_MiscellaneousBailee_CHK_OverrideBaseRateYes,test);
			se.element().enterOrValidateText(getCIM_MiscellaneousBailee_TXT_OverrideReason(strCIM_MiscellaneousBailee_TXT_OverrideReason),strCIM_MiscellaneousBailee_TXT_OverrideReason,test);
			se.element().checkUncheckOrValidate(getCIM_MiscellaneousBailee_CHK_OverrideBaseRateNo(strCIM_MiscellaneousBailee_CHK_OverrideBaseRateNo),strCIM_MiscellaneousBailee_CHK_OverrideBaseRateNo,test);
			se.element().Click(getNext(),test);
			se.util().sleep(1000);
			 
			if(strCIM_MiscellaneousBailee_Done.equalsIgnoreCase("Yes")){
			se.element().Click(getNext(),test);
			}
	
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CIM_MiscellaneousBailee", true, false, true, test);
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

