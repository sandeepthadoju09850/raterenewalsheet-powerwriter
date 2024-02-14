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

public class CIM_CommercialArticles extends OR_CIM {
	public void CommercialArticles(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_CommercialArticles")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_CommercialArticles", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_CommercialArticles_BTN_Add=(String) row.get("CIM_CommercialArticles_BTN_Add");
		String strCIM_CommercialArticles_Edit=(String) row.get("CIM_CommercialArticles_Edit");
		String strCIM_CommercialArticles_Done=(String) row.get("CIM_CommercialArticles_Done");
		String strCIM_CommercialArticles_TXT_Classification = (String) row.get("CIM_CommercialArticles_TXT_Classification");
		String strCIM_CommercialArticles_TXT_Limit = (String) row.get("CIM_CommercialArticles_TXT_Limit");
		String strCIM_CommercialArticles_TXT_LocationNo = (String) row.get("CIM_CommercialArticles_TXT_LocationNo");
		String strCIM_CommercialArticles_TXT_Name = (String) row.get("CIM_CommercialArticles_TXT_Name");
		String strCIM_CommercialArticles_TXT_Description = (String) row.get("CIM_CommercialArticles_TXT_Description");
		String strCIM_CommercialArticles_TXT_Street = (String) row.get("CIM_CommercialArticles_TXT_Street");
		String strCIM_CommercialArticles_TXT_SteUnit = (String) row.get("CIM_CommercialArticles_TXT_SteUnit");
		String strCIM_CommercialArticles_TXT_City = (String) row.get("CIM_CommercialArticles_TXT_City");
		String strCIM_CommercialArticles_TXT_State = (String) row.get("CIM_CommercialArticles_TXT_State");
		String strCIM_CommercialArticles_TXT_Zip = (String) row.get("CIM_CommercialArticles_TXT_Zip");
		String strCIM_CommercialArticles_TXT_DeductibleAmount = (String) row.get("CIM_CommercialArticles_TXT_DeductibleAmount");
		String strCIM_CommercialArticles_TXT_BuildingDescription = (String) row.get("CIM_CommercialArticles_TXT_BuildingDescription");
		String strCIM_CommercialArticles_TXT_PackageModFactor = (String) row.get("CIM_CommercialArticles_TXT_PackageModFactor");
		String strTransaction = (String) row.get("Transaction");
		try{
			
			se.log().logTestStep("CIM_CommercialArticles");
			test.log(LogStatus.INFO, "CIM_CommercialArticles","Transaction Step : "+ strTransaction + "<br>" +"Page : CIM_CommercialArticles"  + "<br>" +"Section: CIM_CommercialArticles");
			
			se.util().sleep(1000);
			
			se.verify().verifyEquals("CIM_CommercialArticles of PowerWriter ", getCIM_CommercialArticles_TXT_VerifyCommercialArticlesText().isDisplayed(),true, true,test);
			if(strCIM_CommercialArticles_BTN_Add.equalsIgnoreCase("Yes")){
				se.element().clickElement(AddbuttonCIMCommArticles);
			}
			if(strCIM_CommercialArticles_Edit.equalsIgnoreCase("Yes")){
				se.element().tryClick(getEditbuttonCIMCommercialArticles(strCIM_CommercialArticles_Edit),test);
			}	
			se.verify().verifyEquals("CIM_CommercialArticles of PowerWriter ", getCIM_CommercialArticles_TXT_VerifyCommercialArticlesText().isDisplayed(),true, true,test);
			se.element().selectPopupWithMagnifier(getCIM_CommercialArticles_TXT_Classification(strCIM_CommercialArticles_TXT_Classification), getCIM_CommercialArticles_BTN_Classification_Search(strCIM_CommercialArticles_TXT_Classification), strCIM_CommercialArticles_TXT_Classification,constants.NA, strCIM_CommercialArticles_TXT_Classification,constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_CommercialArticles_TXT_Limit(strCIM_CommercialArticles_TXT_Limit),strCIM_CommercialArticles_TXT_Limit,test);
			se.element().enterOrValidateText(getCIM_CommercialArticles_TXT_LocationNo(strCIM_CommercialArticles_TXT_LocationNo),strCIM_CommercialArticles_TXT_LocationNo,test);
            se.element().enterOrValidateText(getCIM_CommercialArticles_TXT_Name(strCIM_CommercialArticles_TXT_Name),strCIM_CommercialArticles_TXT_Name,test);
			se.element().enterOrValidateText(getCIM_CommercialArticles_TXT_Description(strCIM_CommercialArticles_TXT_Description),strCIM_CommercialArticles_TXT_Description,test);
			se.element().enterOrValidateText(getCIM_CommercialArticles_TXT_Street(strCIM_CommercialArticles_TXT_Street),strCIM_CommercialArticles_TXT_Street,test);
			se.element().enterOrValidateText(getCIM_CommercialArticles_TXT_SteUnit(strCIM_CommercialArticles_TXT_SteUnit),strCIM_CommercialArticles_TXT_SteUnit,test);
			se.element().enterOrValidateText(getCIM_CommercialArticles_TXT_City(strCIM_CommercialArticles_TXT_City),strCIM_CommercialArticles_TXT_City,test);
			se.element().enterOrValidateText(getCIM_CommercialArticles_TXT_State(strCIM_CommercialArticles_TXT_State),strCIM_CommercialArticles_TXT_State,test);
			se.element().enterOrValidateText(getCIM_CommercialArticles_TXT_Zip(strCIM_CommercialArticles_TXT_Zip),strCIM_CommercialArticles_TXT_Zip,test);
			se.element().selectPopupWithMagnifier(getCIM_CommercialArticles_TXT_DeductibleAmount(strCIM_CommercialArticles_TXT_DeductibleAmount), getCIM_CommercialArticles_BTN_DeductibleAmt_Search(strCIM_CommercialArticles_TXT_DeductibleAmount), strCIM_CommercialArticles_TXT_DeductibleAmount,constants.NA, strCIM_CommercialArticles_TXT_DeductibleAmount,constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_CommercialArticles_TXT_PackageModFactor(strCIM_CommercialArticles_TXT_PackageModFactor),strCIM_CommercialArticles_TXT_PackageModFactor,test);
			se.element().enterOrValidateText(getCIM_CommercialArticles_TXT_BuildingDescription(strCIM_CommercialArticles_TXT_BuildingDescription),strCIM_CommercialArticles_TXT_BuildingDescription,test);
			se.element().Click(getNext(),test);
			se.util().sleep(1000);
			 
			if(strCIM_CommercialArticles_Done.equalsIgnoreCase("Yes")){
			se.element().Click(getNext(),test);
			}

		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CIM_CommercialArticles", true, false, true, test);
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
