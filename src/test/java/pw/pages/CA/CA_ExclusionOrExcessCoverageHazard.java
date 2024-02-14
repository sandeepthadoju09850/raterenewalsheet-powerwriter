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
public class CA_ExclusionOrExcessCoverageHazard extends OR_CA{
	
	public void ExclusionOrExcessCoverageHazard(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		//String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	if(suspendSheet.equalsIgnoreCase(constants.CA_ExclusionOrExcessCoverageHazard)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+ suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_ExclusionOrExcessCoverageHazard, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_AddCov = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_AddCov");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_RemoveCov = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_RemoveCov");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_CopyCov = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_CopyCov");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_Btn_EditCov = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_Btn_EditCov");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Details = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Details");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Done = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Done");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_Description = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_Description");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_VehicleDesignation = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_VehicleDesignation");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_VehAdd = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_VehAdd");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNo = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNo");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNoFilterNeeded = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNoFilterNeeded");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_VIN = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_VIN");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Year = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Year");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Make = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Make");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Model = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Model");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_ProvisionSelect = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_ProvisionSelect");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Description = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Description");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Provision = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Provision");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_ProvisionFilterNeeded = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_ProvisionFilterNeeded");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_Txt_LmtOfInsurance = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_Txt_LmtOfInsurance");
			String strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_EndOfOthProvision = (String) row.get("ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_EndOfOthProvision");
			

		try{
			
			se.log().logTestStep("CA_ExclusionOrExcessCoverageHazardsOtherwiseInsured");
			test.log(LogStatus.INFO, "CA_ExclusionOrExcessCoverageHazardsOtherwiseInsured page","Transaction Step : "+transaction + "<br>" +"Page : CA_ExclusionOrExcessCoverageHazardsOtherwiseInsured");
			se.verify().verifyEquals("CA_ExclusionOrExcessCoverageHazardsOtherwiseInsured Page of PowerWriter ", getExclusionOrExcessCoverageHazardsOtherwiseInsured_Label().isDisplayed(),true, true,test);
			
			if(!strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_AddCov.equalsIgnoreCase("N/A")){
				se.element().Click(getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_AddCov(strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_AddCov),test);
			}
	
			if(!strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Details.equalsIgnoreCase("N/A")){
				se.element().Click(getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Details(strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Details),test);
			}
			
			//se.element().Click(getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_CopyCov(strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_CopyCov),strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_CopyCov,test);
			//se.element().Click(getExclusionOrExcessCoverageHazardsOtherwiseInsured_Btn_EditCov(strExclusionOrExcessCoverageHazardsOtherwiseInsured_Btn_EditCov),strExclusionOrExcessCoverageHazardsOtherwiseInsured_Btn_EditCov,test);
			se.element().checkUncheckOrValidate(getExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_Description(strExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_Description),strExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_Description,test);
			
			if(!strExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_Description.equalsIgnoreCase("N/A")){
				se.element().enterOrValidateText(getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Description(strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Description),strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Description,test);
				se.element().enterOrValidateText(getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Provision(strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Provision),strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Provision,test);

				//se.element().enterOrValidateText(getExclusionOrExcessCoverageHazardsOtherwiseInsured_Txt_LmtOfInsurance(strExclusionOrExcessCoverageHazardsOtherwiseInsured_Txt_LmtOfInsurance),strExclusionOrExcessCoverageHazardsOtherwiseInsured_Txt_LmtOfInsurance,test);
				//se.element().enterOrValidateText(getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_EndOfOthProvision(strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_EndOfOthProvision),strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_EndOfOthProvision,test);

			}
			
			se.element().checkUncheckOrValidate(getExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_VehicleDesignation(strExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_VehicleDesignation),strExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_VehicleDesignation,test);
			
			if(!strExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_VehicleDesignation.equalsIgnoreCase("N/A")){
				if(strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_VehAdd.equalsIgnoreCase("Yes")){
					se.element().Click(getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_VehAdd(strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_VehAdd),test);
				}	
				
				//se.element().enterOrValidateText(getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNo(strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNo),strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNo,test);
				se.element().selectPopupWithMagnifier(getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNo(strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNo),getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNoSearch(strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNo),strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNo,strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNoFilterNeeded,strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNo, constants.NA, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_VIN(strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_VIN),strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_VIN,test);
				se.element().enterOrValidateText(getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Year(strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Year),strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Year,test);
				se.element().enterOrValidateText(getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Make(strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Make),strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Make,test);
				se.element().enterOrValidateText(getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Model(strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Model),strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Model,test);
				//se.element().Click(getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_ProvisionSelect(strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_ProvisionSelect),strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_ProvisionSelect,test);
				
				se.element().selectPopupWithMagnifier(getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Provision(strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Provision),getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_ProvisionSearch(strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Provision),strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Provision,strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_ProvisionFilterNeeded,strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Provision, constants.NA, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getExclusionOrExcessCoverageHazardsOtherwiseInsured_Txt_LmtOfInsurance(strExclusionOrExcessCoverageHazardsOtherwiseInsured_Txt_LmtOfInsurance),strExclusionOrExcessCoverageHazardsOtherwiseInsured_Txt_LmtOfInsurance,test);
				se.element().enterOrValidateText(getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_EndOfOthProvision(strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_EndOfOthProvision),strExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_EndOfOthProvision,test);
				
			}
					se.element().clickElement(getNext());

			if(strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_RemoveCov.equalsIgnoreCase("Yes")){
				se.element().Click(getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_RemoveCov(strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_RemoveCov), test);
			}
			if(strExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Done.equalsIgnoreCase("Yes")){
				se.element().Click(getDone(),test);
			}
			
			
			}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CA_ExclusionOrExcessCoverageHazardsOtherwiseInsured ", true, false, true, test);			
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