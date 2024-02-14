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

public class CIM_LossPayable extends OR_CIM {
	public void LossPayable(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_LossPayable")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_LossPayable", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strTransaction = (String) row.get("Transaction");
		String strCIM_LossPayable_BTN_Add=(String) row.get("CIM_LossPayable_BTN_Add");
		String strCIM_LossPayable_Edit=(String) row.get("CIM_LossPayable_Edit");
		String strCIM_LossPayable_Done=(String) row.get("CIM_LossPayable_Done");
		String strCIM_LossPayable_TXT_Name = (String) row.get("CIM_LossPayable_TXT_Name");
		String strCIM_LossPayable_CHK_InterestType_LossPayable = (String) row.get("CIM_LossPayable_CHK_InterestType_LossPayable");
		String strCIM_LossPayable_CHK_InterestType_LenderLossPayable = (String) row.get("CIM_LossPayable_CHK_InterestType_LenderLossPayable");
		String strCIM_LossPayable_CHK_InterestType_ContractforSale = (String) row.get("CIM_LossPayable_CHK_InterestType_ContractforSale");
		String strCIM_LossPayable_TXT_Street = (String) row.get("CIM_LossPayable_TXT_Street");
		String strCIM_LossPayable_TXT_SteUnit = (String) row.get("CIM_LossPayable_TXT_SteUnit");
		String strCIM_LossPayable_TXT_City = (String) row.get("CIM_LossPayable_TXT_City");
		String strCIM_LossPayable_DDN_State = (String) row.get("CIM_LossPayable_DDN_State");
		String strCIM_LossPayable_TXT_Zip = (String) row.get("CIM_LossPayable_TXT_Zip");
		String strCIM_LossPayable_TXT_DescriptionofCoveredProperty = (String) row.get("CIM_LossPayable_TXT_DescriptionofCoveredProperty");
		String strCIM_LossPayable_TXT_LocationNo = (String) row.get("CIM_LossPayable_TXT_LocationNo");
		String strCIM_LossPayable_TXT_Loc_Name = (String) row.get("CIM_LossPayable_TXT_Loc_Name");
		String strCIM_LossPayable_TXT_Loc_Description = (String) row.get("CIM_LossPayable_TXT_Loc_Description");
		String strCIM_LossPayable_TXT_Loc_Street = (String) row.get("CIM_LossPayable_TXT_Loc_Street");
		String strCIM_LossPayable_TXT_Loc_SteUnit = (String) row.get("CIM_LossPayable_TXT_Loc_SteUnit");
		String strCIM_LossPayable_TXT_Loc_City = (String) row.get("CIM_LossPayable_TXT_Loc_City");
		String strCIM_LossPayable_TXT_Loc_State = (String) row.get("CIM_LossPayable_TXT_Loc_State");
		String strCIM_LossPayable_TXT_Loc_Zip = (String) row.get("CIM_LossPayable_TXT_Loc_Zip");

		try{
			se.log().logTestStep("LossPayable");
			test.log(LogStatus.INFO, "LossPayable page","Transaction Step : "+strTransaction + "<br>" +"Page : LossPayable");
			se.verify().verifyEquals("LossPayable page of PowerWriter ", getCIM_LossPayable_TXT_VerifyLossPayableText().isDisplayed(),true, true,test);	
			if(strCIM_LossPayable_BTN_Add.equalsIgnoreCase("Yes")){
				se.element().clickElement(AddbuttonCIMLossPayable);
			}
			if(strCIM_LossPayable_Edit.equalsIgnoreCase("Yes")){
				se.element().tryClick(getEditbuttonCIMLosspayable(strCIM_LossPayable_Edit),test);
			}	
			se.verify().verifyEquals("CIM_LossPayable of PowerWriter ", getCIM_LossPayable_TXT_VerifyLossPayableText().isDisplayed(),true, true,test);
			se.element().enterOrValidateText(getCIM_LossPayable_TXT_Name(strCIM_LossPayable_TXT_Name),strCIM_LossPayable_TXT_Name,test);
			se.element().checkUncheckOrValidate(getCIM_LossPayable_CHK_InterestType_LossPayable(strCIM_LossPayable_CHK_InterestType_LossPayable),strCIM_LossPayable_CHK_InterestType_LossPayable,test);
			se.element().checkUncheckOrValidate(getCIM_LossPayable_CHK_InterestType_LenderLossPayable(strCIM_LossPayable_CHK_InterestType_LenderLossPayable),strCIM_LossPayable_CHK_InterestType_LenderLossPayable,test);
			se.element().checkUncheckOrValidate(getCIM_LossPayable_CHK_InterestType_ContractforSale(strCIM_LossPayable_CHK_InterestType_ContractforSale),strCIM_LossPayable_CHK_InterestType_ContractforSale,test);
			se.element().enterOrValidateText(getCIM_LossPayable_TXT_Street(strCIM_LossPayable_TXT_Street),strCIM_LossPayable_TXT_Street,test);
			se.element().enterOrValidateText(getCIM_LossPayable_TXT_SteUnit(strCIM_LossPayable_TXT_SteUnit),strCIM_LossPayable_TXT_SteUnit,test);
			se.element().enterOrValidateText(getCIM_LossPayable_TXT_City(strCIM_LossPayable_TXT_City),strCIM_LossPayable_TXT_City,test);
			se.element().selectElementDDrOrValidateText(getCIM_LossPayable_DDN_State(strCIM_LossPayable_DDN_State),strCIM_LossPayable_DDN_State,test);
			se.element().enterOrValidateText(getCIM_LossPayable_TXT_Zip(strCIM_LossPayable_TXT_Zip),strCIM_LossPayable_TXT_Zip,test);
			se.element().enterOrValidateText(getCIM_LossPayable_TXT_DescriptionofCoveredProperty(strCIM_LossPayable_TXT_DescriptionofCoveredProperty),strCIM_LossPayable_TXT_DescriptionofCoveredProperty,test);
			se.element().selectPopupWithMagnifier(getCIM_LossPayable_TXT_LocationNo(strCIM_LossPayable_TXT_LocationNo), getCIM_LossPayable_BTN_LocationNoSearch(strCIM_LossPayable_TXT_LocationNo), strCIM_LossPayable_TXT_LocationNo, constants.NA, strCIM_LossPayable_TXT_LocationNo, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_LossPayable_TXT_Loc_Name(strCIM_LossPayable_TXT_Loc_Name),strCIM_LossPayable_TXT_Loc_Name,test);
			se.element().enterOrValidateText(getCIM_LossPayable_TXT_Loc_Description(strCIM_LossPayable_TXT_Loc_Description),strCIM_LossPayable_TXT_Loc_Description,test);
			se.element().enterOrValidateText(getCIM_LossPayable_TXT_Loc_Street(strCIM_LossPayable_TXT_Loc_Street),strCIM_LossPayable_TXT_Loc_Street,test);
			se.element().enterOrValidateText(getCIM_LossPayable_TXT_Loc_SteUnit(strCIM_LossPayable_TXT_Loc_SteUnit),strCIM_LossPayable_TXT_Loc_SteUnit,test);
			se.element().enterOrValidateText(getCIM_LossPayable_TXT_Loc_City(strCIM_LossPayable_TXT_Loc_City),strCIM_LossPayable_TXT_Loc_City,test);
			se.element().enterOrValidateText(getCIM_LossPayable_TXT_Loc_State(strCIM_LossPayable_TXT_Loc_State),strCIM_LossPayable_TXT_Loc_State,test);
			se.element().enterOrValidateText(getCIM_LossPayable_TXT_Loc_Zip(strCIM_LossPayable_TXT_Loc_Zip),strCIM_LossPayable_TXT_Loc_Zip,test);
	
			se.element().Click(getNext(),test);
			se.util().sleep(1000);
			 
			if(strCIM_LossPayable_Done.equalsIgnoreCase("Yes")){
			se.element().Click(getNext(),test);
			}
		
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CIM_LossPayable", true, false, true, test);
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