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

public class CP_AdditionalInterest extends OR_CP{

	public void CP_AddInterest(String strRegressionID, String transaction,  ExtentTest test) throws IOException {
		try{
		
		List<Map<String, String>> table = ExcelOperations.getPagesData("CP_Additional_Interest", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCP_AddInterest_BTN_Add=(String) row.get("CP_AddInterest_BTN_Add");
		String strCP_AddInterest_Edit=(String) row.get("CP_AddInterest_Edit");
		String strCP_AddInterest_Done=(String) row.get("CP_AddInterest_Done");
		String strCP_AddInterest_TXT_Name=(String) row.get("CP_AddInterest_TXT_Name");
		String strCP_AddInterest_CHK_AdditionalInterestEndorsement=(String) row.get("CP_AddInterest_CHK_AdditionalInterestEndorsement");
		String strCP_AddInterest_CHK_BuildingOwner=(String) row.get("CP_AddInterest_CHK_BuildingOwner");
		String strCP_AddInterest_CHK_LandlordAsAdditionalInsured=(String) row.get("CP_AddInterest_CHK_LandlordAsAdditionalInsured");
		String strCP_AddInterest_CHK_LossPayee=(String) row.get("CP_AddInterest_CHK_LossPayee");
		String strCP_AddInterest_CHK_LossPayeeAndAdditonalInssured=(String) row.get("CP_AddInterest_CHK_LossPayeeAndAdditonalInssured");
		String strCP_AddInterest_CHK_BuildersRiskRenovation=(String) row.get("CP_AddInterest_CHK_BuildersRiskRenovation");
		String strCP_AddInterest_CHK_MortgageHolder=(String) row.get("CP_AddInterest_CHK_MortgageHolder");
		String strCP_AddInterest_TXT_Street=(String) row.get("CP_AddInterest_TXT_Street");
		String strCP_AddInterest_TXT_SteUnit=(String) row.get("CP_AddInterest_TXT_Ste/Unit");
		String strCP_AddInterest_TXT_City=(String) row.get("CP_AddInterest_TXT_City");
		String strCP_AddInterest_TXT_State=(String) row.get("CP_AddInterest_TXT_State");
		String strCP_AddInterest_TXT_Zip=(String) row.get("CP_AddInterest_TXT_Zip");
		String strCP_AddInterest_TXT_DescriptionOfProperty=(String) row.get("CP_AddInterest_TXT_DescriptionOfProperty");
		String strCP_AddInterest_BTN_Bldg_Add = (String) row.get("CP_AddInterest_BTN_Bldg_Add");
		String strCP_AddInterest_BTN_Bldg_RowNumber = (String) row.get("CP_AddInterest_BTN_Bldg_RowNumber");
		String strCP_AddInterest_TXT_LocationNo=(String) row.get("CP_AddInterest_TXT_LocationNo");
		String strCP_AddInterest_TXT_LocationPopUp=(String) row.get("CP_AddInterest_TXT_LocationPopUp");
		String strCP_AddInterest_TXT_BuildingNo=(String) row.get("CP_AddInterest_TXT_BuildingNo");
		String strCP_AddInterest_TXT_Description=(String) row.get("CP_AddInterest_TXT_Description");
		String strCP_AddInterest_TXT_ApplicableClauseDesc=(String) row.get("CP_AddInterest_TXT_ApplicableClauseDesc");
		String strCP_AddInterest_TXT_ApplicableClause=(String) row.get("CP_AddInterest_TXT_ApplicableClause");
		String strTransaction  = (String) row.get("Transaction Name");
		
		try{
		
			se.log().logTestStep("CP_AdditionalInterest");
			test.log(LogStatus.INFO, "AdditionalInterest page","Transaction Step : " + strTransaction + "<br>" +"Page : CP_AdditionalInterest"); 
			se.verify().verifyEquals("AdditionalInterest Page of PowerWriter ", getCP_AddInterest_LBL_VerifyAdditionalInterest().isDisplayed(),true, true,test);
			if(strCP_AddInterest_BTN_Add.equalsIgnoreCase("Yes")){
				se.element().tryClick(getCP_AddInterest_BTN_Add(),test);
			}
			if(!strCP_AddInterest_Edit.equalsIgnoreCase("N/A")){
				se.element().tryClick(getCP_AddInterest_Edit(strCP_AddInterest_Edit),test);
			}
			if(strCP_AddInterest_BTN_Add.equals("Yes")||!strCP_AddInterest_Edit.equals("N/A")){
				se.util().sleep(2000);
				se.element().enterOrValidateText(getCP_AddInterest_TXT_Name(strCP_AddInterest_TXT_Name), strCP_AddInterest_TXT_Name, test);
				se.element().checkUncheckOrValidate(getCP_AddInterest_CHK_AdditionalInterestEndorsement(strCP_AddInterest_CHK_AdditionalInterestEndorsement), strCP_AddInterest_CHK_AdditionalInterestEndorsement, test);
				se.element().checkUncheckOrValidate(getCP_AddInterest_CHK_BuildingOwner(strCP_AddInterest_CHK_BuildingOwner), strCP_AddInterest_CHK_BuildingOwner, test);
				se.element().checkUncheckOrValidate(getCP_AddInterest_CHK_LandlordAsAdditionalInsured(strCP_AddInterest_CHK_LandlordAsAdditionalInsured), strCP_AddInterest_CHK_LandlordAsAdditionalInsured, test);
				se.element().checkUncheckOrValidate(getCP_AddInterest_CHK_LossPayee(strCP_AddInterest_CHK_LossPayee), strCP_AddInterest_CHK_LossPayee, test);
				se.element().checkUncheckOrValidate(getCP_AddInterest_CHK_LossPayeeAndAdditonalInssured(strCP_AddInterest_CHK_LossPayeeAndAdditonalInssured), strCP_AddInterest_CHK_LossPayeeAndAdditonalInssured, test);
				se.element().checkUncheckOrValidate(getCP_AddInterest_CHK_BuildersRiskRenovation(strCP_AddInterest_CHK_BuildersRiskRenovation), strCP_AddInterest_CHK_BuildersRiskRenovation, test);
				se.element().checkUncheckOrValidate(getCP_AddInterest_CHK_MortgageHolder(strCP_AddInterest_CHK_MortgageHolder), strCP_AddInterest_CHK_MortgageHolder, test);
				se.element().enterOrValidateText(getCP_AddInterest_TXT_Street(strCP_AddInterest_TXT_Street), strCP_AddInterest_TXT_Street, test);
				se.element().enterOrValidateText(getCP_AddInterest_TXT_SteUnit(strCP_AddInterest_TXT_SteUnit), strCP_AddInterest_TXT_SteUnit, test);
				se.element().enterOrValidateText(getCP_AddInterest_TXT_City(strCP_AddInterest_TXT_City), strCP_AddInterest_TXT_City, test); 
				
				se.element().enterOrValidateText(getCP_AddInterest_TXT_State(strCP_AddInterest_TXT_State), strCP_AddInterest_TXT_State, test);
				
				se.element().enterOrValidateText(getCP_AddInterest_TXT_Zip(strCP_AddInterest_TXT_Zip), strCP_AddInterest_TXT_Zip, test);
				se.element().enterOrValidateText(getCP_AddInterest_TXT_DescriptionOfProperty(strCP_AddInterest_TXT_DescriptionOfProperty), strCP_AddInterest_TXT_DescriptionOfProperty, test);
		if(!strCP_AddInterest_BTN_Bldg_Add.equalsIgnoreCase(constants.Yes)){
				se.element().enterOrValidateText(getCP_AddInterest_TXT_LocationNo(strCP_AddInterest_TXT_LocationNo,strCP_AddInterest_BTN_Bldg_RowNumber), strCP_AddInterest_TXT_LocationNo, test);
				if(se.element().isElementPresent(CP_AddInterest_BTN_Close)){
					se.element().Click(getCP_AddInterest_TXT_LocationPopUp(strCP_AddInterest_TXT_LocationPopUp), test);
				}
				se.element().enterOrValidateText(getCP_AddInterest_TXT_BuildingNo(strCP_AddInterest_TXT_BuildingNo,strCP_AddInterest_BTN_Bldg_RowNumber), strCP_AddInterest_TXT_BuildingNo, test);
				se.element().enterOrValidateText(getCP_AddInterest_TXT_Description(strCP_AddInterest_TXT_Description,strCP_AddInterest_BTN_Bldg_RowNumber), strCP_AddInterest_TXT_Description, test);
				se.element().selectPopupWithMagnifier(getCP_AddInterest_TXT_ApplicableClauseDesc(strCP_AddInterest_TXT_ApplicableClauseDesc,strCP_AddInterest_BTN_Bldg_RowNumber),getCP_AddInterest_BTN_ApplicableClauseDesc_SearchIcon(strCP_AddInterest_TXT_ApplicableClauseDesc,strCP_AddInterest_BTN_Bldg_RowNumber),strCP_AddInterest_TXT_ApplicableClauseDesc, constants.NA, strCP_AddInterest_TXT_ApplicableClauseDesc, constants.NA, constants.NA, constants.NA, test);
				//se.element().enterOrValidateText(getCP_AddInterest_TXT_ApplicableClauseDesc(strCP_AddInterest_TXT_ApplicableClauseDesc), strCP_AddInterest_TXT_ApplicableClauseDesc, test);
				se.element().enterOrValidateText(getCP_AddInterest_TXT_ApplicableClause(strCP_AddInterest_TXT_ApplicableClause,strCP_AddInterest_BTN_Bldg_RowNumber), strCP_AddInterest_TXT_ApplicableClause, test);
				//--- Added an if condition to add another building to the Additional Interest. This is a temporary script which needs to be optimised later.
		}else {
					se.element().tryClick(getCP_AddInterest_BTN_Add(),test);
					se.element().enterOrValidateText(getCP_AddInterest_TXT_LocationNo(strCP_AddInterest_TXT_LocationNo,strCP_AddInterest_BTN_Bldg_RowNumber), strCP_AddInterest_TXT_LocationNo, test);
					if(se.element().isElementPresent(CP_AddInterest_BTN_Close)){
						se.element().Click(getCP_AddInterest_TXT_LocationPopUp(strCP_AddInterest_TXT_LocationPopUp), test);
					}
					se.element().enterOrValidateText(getCP_AddInterest_TXT_BuildingNo(strCP_AddInterest_TXT_BuildingNo,strCP_AddInterest_BTN_Bldg_RowNumber), strCP_AddInterest_TXT_BuildingNo, test);
					se.element().enterOrValidateText(getCP_AddInterest_TXT_Description(strCP_AddInterest_TXT_Description,strCP_AddInterest_BTN_Bldg_RowNumber), strCP_AddInterest_TXT_Description, test);
					
					//@Sai - Replaced line #121 with #119 as application behavior changed in September release install 
					
					se.element().selectPopupWithMagnifier(getCP_AddInterest_TXT_ApplicableClauseDesc(strCP_AddInterest_TXT_ApplicableClauseDesc,strCP_AddInterest_BTN_Bldg_RowNumber),getCP_AddInterest_BTN_ApplicableClauseDesc_SearchIcon(strCP_AddInterest_TXT_ApplicableClauseDesc,strCP_AddInterest_BTN_Bldg_RowNumber),strCP_AddInterest_TXT_ApplicableClauseDesc, constants.NA, strCP_AddInterest_TXT_ApplicableClauseDesc, constants.NA, constants.NA, constants.NA, test);
					
					//se.element().enterOrValidateText(getCP_AddInterest_TXT_ApplicableClauseDesc(strCP_AddInterest_TXT_ApplicableClauseDesc), strCP_AddInterest_TXT_ApplicableClauseDesc, test);
					
					se.element().enterOrValidateText(getCP_AddInterest_TXT_ApplicableClause(strCP_AddInterest_TXT_ApplicableClause,strCP_AddInterest_BTN_Bldg_RowNumber), strCP_AddInterest_TXT_ApplicableClause, test);
					
				}
				se.element().Click(getNext(),test);
			}
			
		
			if(strCP_AddInterest_Done.equalsIgnoreCase("Yes")){
				se.element().Click(getNext(),test);
			}
		
			
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details for CP_AdditionalInterest ", true, false, true, test);
	
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
