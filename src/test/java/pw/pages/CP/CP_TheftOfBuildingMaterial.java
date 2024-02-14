package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class CP_TheftOfBuildingMaterial extends OR_CP {
	public void CP_TheftOfBldgMaterial(String strRegressionID, String transaction, String buildingName,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction); 
		if(SuspendSheet.equalsIgnoreCase("CP_TheftofBuildingMaterials")){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
		         testTearDown(se, test);
		    }
		List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_TheftofBuildingMaterials", strRegressionID, buildingName, transaction);
		
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

		String strCP_TheftBldgMaterial_TXT_FormNumber = (String) row.get("CP_TheftBldgMaterial_TXT_FormNumber");
		String strCP_TheftBldgMaterial_TXT_FormName = (String) row.get("CP_TheftBldgMaterial_TXT_FormName");
		String strCP_TheftBldgMaterial_TXT_TheftOfBuildingMaterialsLimit = (String) row.get("CP_TheftBldgMaterial_TXT_TheftOfBuildingMaterialsLimit");
		String strCP_TheftBldgMaterial_TXT_TheftDeductible = (String) row.get("CP_TheftBldgMaterial_TXT_TheftDeductible");
		String strCP_TheftBldgMaterial_TXT_Peril = (String) row.get("CP_TheftBldgMaterial_TXT_Peril");
		String strCP_TheftBldgMaterial_TXT_TheftFactor = (String) row.get("CP_TheftBldgMaterial_TXT_TheftFactor");
		String strCP_TheftBldgMaterial_TXT_BasicGroupIRate = (String) row.get("CP_TheftBldgMaterial_TXT_BasicGroupIRate");
		String strCP_TheftBldgMaterial_CHK_OverrideManualFactor = (String) row.get("CP_TheftBldgMaterial_CHK_OverrideManualFactor");
		String strCP_TheftBldgMaterial_TXT_ManualFactor = (String) row.get("CP_TheftBldgMaterial_TXT_ManualFactor");
		String strCP_TheftBldgMaterial_TXT_BasicGroupIFinalRate = (String) row.get("CP_TheftBldgMaterial_TXT_BasicGroupIFinalRate");
		String strCP_TheftBldgMaterial_TXT_TransactionPremium = (String) row.get("CP_TheftBldgMaterial_TXT_TransactionPremium");
		String strTransaction = (String) row.get("Transaction Name");

		try{
			se.log().logTestStep("CP_TheftOfBldgMaterial");
			test.log(LogStatus.INFO, "CP_TheftOfBldgMaterial","Transaction Step : "+ strTransaction + "<br>" +"Page : CP_TheftOfBldgMaterial"  + "<br>" +"Section: CP_TheftOfBldgMaterial");
			se.util().sleep(1000);
			se.verify().verifyEquals("CP_TheftOfBldgMaterial of PowerWriter ", getCP_VerifyTheftOfBuildingMatText().isDisplayed(),true, true,test);
			se.element().enterOrValidateText(getCP_TheftBldgMaterial_TXT_FormNumber(strCP_TheftBldgMaterial_TXT_FormNumber),strCP_TheftBldgMaterial_TXT_FormNumber,test);
			se.element().enterOrValidateText(getCP_TheftBldgMaterial_TXT_FormName(strCP_TheftBldgMaterial_TXT_FormName),strCP_TheftBldgMaterial_TXT_FormName,test);
			se.element().enterOrValidateText(getCP_TheftBldgMaterial_TXT_TheftOfBuildingMaterialsLimit(strCP_TheftBldgMaterial_TXT_TheftOfBuildingMaterialsLimit),strCP_TheftBldgMaterial_TXT_TheftOfBuildingMaterialsLimit,test);
			/*if(!strCP_TheftBldgMaterial_TXT_TheftDeductible.equalsIgnoreCase("N/A") && !strCP_TheftBldgMaterial_TXT_TheftDeductible.contains("validate2")) {
            	se.element().clickSearchIcon(getCP_TheftBldgMaterial_BTN_TheftDeductible_Search(), test);
            	se.element().clickElement(getCP_TheftBldgMaterial_LNK_TheftDeductible(strCP_TheftBldgMaterial_TXT_TheftDeductible), test);
            }else{
            	se.element().enterOrValidateText(getCP_TheftBldgMaterial_TXT_TheftDeductible(strCP_TheftBldgMaterial_TXT_TheftDeductible),strCP_TheftBldgMaterial_TXT_TheftDeductible,test);
             }*/
			//se.element().enterOrValidateText(getCP_TheftBldgMaterial_TXT_TheftDeductible(strCP_TheftBldgMaterial_TXT_TheftDeductible),strCP_TheftBldgMaterial_TXT_TheftDeductible,test);
            se.element().selectPopupWithMagnifier(getCP_TheftBldgMaterial_TXT_TheftDeductible(strCP_TheftBldgMaterial_TXT_TheftDeductible), getCP_TheftBldgMaterial_BTN_TheftDeductible_Search(strCP_TheftBldgMaterial_TXT_TheftDeductible), strCP_TheftBldgMaterial_TXT_TheftDeductible, constants.NA, strCP_TheftBldgMaterial_TXT_TheftDeductible, constants.NA, constants.NA, constants.NA, test);
			se.element().Click(getNext(),test);
			se.util().sleep(1000);
			
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_TheftOfBldgMaterial", true, false, true, test);
			
			}
					iteration++;
				}
			
		}
		catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			testTearDown(se, test);
		}
			
	}
}
