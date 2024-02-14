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
public class CA_RepossessedAutoNone extends OR_CA{
	
	public void RepossessedAutoNone(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		//String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(suspendSheet.equalsIgnoreCase(constants.CA_RepossessedAutoNone)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_RepossessedAutoNone, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			//String strRegistrationPlates_TXT_UnderInsuredMotoristCSL = (String) row.get("RegistrationPlates_TXT_UnderInsuredMotoristCSL");
			String strRepossessedAutoNone_CHK_ReportingBasis_Monthly = (String) row.get("RepossessedAutoNone_CHK_ReportingBasis_Monthly");
			String strRepossessedAutoNone_CHK_ReportingBasis_Quarterly = (String) row.get("RepossessedAutoNone_CHK_ReportingBasis_Quarterly");
			String strRepossessedAutoNone_CHK_ReportingBasis_None = (String) row.get("RepossessedAutoNone_CHK_ReportingBasis_None");
			String strRepossessedAutoNone_CHK_Liability = (String) row.get("RepossessedAutoNone_CHK_Liability");
			String strRepossessedAutoNone_CHK_Rows = (String) row.get("RepossessedAutoNone_CHK_Rows");
			String strRepossessedAutoNone_TXT_State = (String) row.get("RepossessedAutoNone_TXT_State");
			String strRepossessedAutoNone_TXT_StateFilterNeeded = (String) row.get("RepossessedAutoNone_TXT_StateFilterNeeded");
			String strRepossessedAutoNone_TXT_Zipcode = (String) row.get("RepossessedAutoNone_TXT_Zipcode");
			String strRepossessedAutoNone_TXT_ZipcodeFilterNeeded = (String) row.get("RepossessedAutoNone_TXT_ZipcodeFilterNeeded");
			String strRepossessedAutoNone_TXT_Territory = (String) row.get("RepossessedAutoNone_TXT_Territory");
			String strRepossessedAutoNone_TXT_TerritoryFilterNeeded = (String) row.get("RepossessedAutoNone_TXT_TerritoryFilterNeeded");
			String strRepossessedAutoNone_TXT_TownCode = (String) row.get("RepossessedAutoNone_TXT_TownCode");
			String strRepossessedAutoNone_TXT_CSL = (String) row.get("RepossessedAutoNone_TXT_CSL");
			String strRepossessedAutoNone_TXT_Deductible = (String) row.get("RepossessedAutoNone_TXT_Deductible");
			String strRepossessedAutoNone_TXT_DeductibleType = (String) row.get("RepossessedAutoNone_TXT_DeductibleType");
			String strRepossessedAutoNone_TXT_NNoOfReposAuto = (String) row.get("RepossessedAutoNone_TXT_NNoOfReposAuto");
			String strRepossessedAutoNone_CHK_Comprehensive = (String) row.get("RepossessedAutoNone_CHK_Comprehensive");
			String strRepossessedAutoNone_BTN_AddRow = (String) row.get("RepossessedAutoNone_BTN_AddRow");
			String strRepossessedAutoNone_BTN_RemoveRow = (String) row.get("RepossessedAutoNone_BTN_RemoveRow");
			String strRepossessedAutoNone_BTN_CopyRow = (String) row.get("RepossessedAutoNone_BTN_CopyRow");
			String strRepossessedAutoNone_TXT_LocationNo = (String) row.get("RepossessedAutoNone_TXT_LocationNo");
			String strRepossessedAutoNone_TXT_LocationNoFilterNeeded = (String) row.get("RepossessedAutoNone_TXT_LocationNoFilterNeeded");
			String strRepossessedAutoNone_TXT_Name = (String) row.get("RepossessedAutoNone_TXT_Name");
			String strRepossessedAutoNone_TXT_Description = (String) row.get("RepossessedAutoNone_TXT_Description");
			String strRepossessedAutoNone_TXT_Street = (String) row.get("RepossessedAutoNone_TXT_Street");
			String strRepossessedAutoNone_TXT_City = (String) row.get("RepossessedAutoNone_TXT_City");
			String strRepossessedAutoNone_TXT_ComprehensiveState = (String) row.get("RepossessedAutoNone_TXT_State");
			//String strRepossessedAutoNone_TXT_StateDDN = (String) row.get("RepossessedAutoNone_TXT_StateDDN");
			String strRepossessedAutoNone_TXT_ComprehensiveZipcode = (String) row.get("RepossessedAutoNone_TXT_ComprehensiveZipcode");
			String strRepossessedAutoNone_TXT_ComprehensiveZipcodeFilterNeeded = (String) row.get("RepossessedAutoNone_TXT_ComprehensiveZipcodeFilterNeeded");
			String strRepossessedAutoNone_TXT_TypeOfProperty = (String) row.get("RepossessedAutoNone_TXT_TypeOfProperty");
			String strRepossessedAutoNone_TXT_TypeOfPropertyFilterNeeded = (String) row.get("RepossessedAutoNone_TXT_TypeOfPropertyFilterNeeded");
			String strRepossessedAutoNone_TXT_AllPerilsDeduc = (String) row.get("RepossessedAutoNone_TXT_AllPerilsDeduc");
			String strRepossessedAutoNone_TXT_Value = (String) row.get("RepossessedAutoNone_TXT_Value");
			String strRepossessedAutoNone_TXT_DeductPerCar = (String) row.get("RepossessedAutoNone_TXT_DeductPerCar");
			String strRepossessedAutoNone_TXT_DeductPerCarFilterNeeded = (String) row.get("RepossessedAutoNone_TXT_DeductPerCarFilterNeeded");
			String strRepossessedAutoNone_TXT_DeductPerOcc = (String) row.get("RepossessedAutoNone_TXT_DeductPerOcc");
			String strRepossessedAutoNone_CHK_ComprehensiveRows = (String) row.get("RepossessedAutoNone_CHK_ComprehensiveRows");
			String strRepossessedAutoNone_BTN_ComprehensiveAddRow = (String) row.get("RepossessedAutoNone_BTN_ComprehensiveAddRow");
			String strRepossessedAutoNone_BTN_ComprehensiveRemoveRow = (String) row.get("RepossessedAutoNone_BTN_ComprehensiveRemoveRow");
			String strRepossessedAutoNone_BTN_ComprehensiveCopyRow= (String) row.get("RepossessedAutoNone_BTN_ComprehensiveCopyRow"); 
			String strRepossessedAutoNone_TXT_Type = (String) row.get("RepossessedAutoNone_TXT_Type");

					try{
						se.log().logTestStep("CA_RepossessedAutoNone");
						test.log(LogStatus.INFO, "CA_RepossessedAutoNone page","Transaction Step : "+transaction + "<br>" +"Page : CA_RepossessedAutoNone");
						se.verify().verifyEquals("CA_RepossessedAutoNone Page of PowerWriter ", getRepossessedAutoNone_Label().isDisplayed(),true, true,test);
					
					/* if(strRepossessedAutoNone_BTN_AddRow.equalsIgnoreCase("Yes")){
					 se.element().Click(getRepossessedAutoNone_BTN_AddRow(strRepossessedAutoNone_BTN_AddRow),test); }
					 if(strRepossessedAutoNone_BTN_RemoveRow.equalsIgnoreCase("Yes")){
					 //se.element().checkUncheckOrValidate(getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_RemoveCov(
					 strRepossessedAutoNone_BTN_RemoveRow),"Check",test);
					 se.element().Click(getRepossessedAutoNone_BTN_RemoveRow(
					 strRepossessedAutoNone_BTN_RemoveRow), test); }
					 if(strRepossessedAutoNone_BTN_ComprehensiveAddRow.equalsIgnoreCase("Yes")){
					 se.element().Click(getRepossessedAutoNone_BTN_ComprehensiveAddRow(
					 strRepossessedAutoNone_BTN_ComprehensiveAddRow),test); }
					  
					 if(strRepossessedAutoNone_BTN_ComprehensiveRemoveRow.equalsIgnoreCase("Yes"))
					 { //se.element().checkUncheckOrValidate( getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_RemoveCov(
					 strRepossessedAutoNone_BTN_ComprehensiveRemoveRow),"Check",test);
					 se.element().Click(getRepossessedAutoNone_BTN_ComprehensiveRemoveRow( strRepossessedAutoNone_BTN_ComprehensiveRemoveRow), test); }
					 */
						
						
						se.element().checkUncheckOrValidate(getRepossessedAutoNone_CHK_ReportingBasis_Monthly(strRepossessedAutoNone_CHK_ReportingBasis_Monthly),strRepossessedAutoNone_CHK_ReportingBasis_Monthly,test);
						se.element().checkUncheckOrValidate(getRepossessedAutoNone_CHK_ReportingBasis_Quarterly(strRepossessedAutoNone_CHK_ReportingBasis_Quarterly),strRepossessedAutoNone_CHK_ReportingBasis_Quarterly,test);
						se.element().checkUncheckOrValidate(getRepossessedAutoNone_CHK_ReportingBasis_None(strRepossessedAutoNone_CHK_ReportingBasis_None),strRepossessedAutoNone_CHK_ReportingBasis_None,test);
						se.element().checkUncheckOrValidate(getRepossessedAutoNone_CHK_Liability(strRepossessedAutoNone_CHK_Liability),strRepossessedAutoNone_CHK_Liability,test);
						se.element().checkUncheckOrValidate(getRepossessedAutoNone_CHK_Rows(strRepossessedAutoNone_CHK_Rows),strRepossessedAutoNone_CHK_Rows,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_State(strRepossessedAutoNone_TXT_State),strRepossessedAutoNone_TXT_State,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_Zipcode(strRepossessedAutoNone_TXT_Zipcode),strRepossessedAutoNone_TXT_Zipcode,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_Territory(strRepossessedAutoNone_TXT_Territory),strRepossessedAutoNone_TXT_Territory,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_TownCode(strRepossessedAutoNone_TXT_TownCode),strRepossessedAutoNone_TXT_TownCode,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_CSL(strRepossessedAutoNone_TXT_CSL),strRepossessedAutoNone_TXT_CSL,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_Deductible(strRepossessedAutoNone_TXT_Deductible),strRepossessedAutoNone_TXT_Deductible,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_DeductibleType(strRepossessedAutoNone_TXT_DeductibleType),strRepossessedAutoNone_TXT_DeductibleType,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_NNoOfReposAuto(strRepossessedAutoNone_TXT_NNoOfReposAuto),strRepossessedAutoNone_TXT_NNoOfReposAuto,test);
						se.element().checkUncheckOrValidate(getRepossessedAutoNone_CHK_Comprehensive(strRepossessedAutoNone_CHK_Comprehensive),strRepossessedAutoNone_CHK_Comprehensive,test);
						se.element().selectElementDDrOrValidateText(getRepossessedAutoNone_BTN_AddRow(strRepossessedAutoNone_BTN_AddRow),strRepossessedAutoNone_BTN_AddRow,test);
						se.element().selectElementDDrOrValidateText(getRepossessedAutoNone_BTN_RemoveRow(strRepossessedAutoNone_BTN_RemoveRow),strRepossessedAutoNone_BTN_RemoveRow,test);
						se.element().selectElementDDrOrValidateText(getRepossessedAutoNone_BTN_CopyRow(strRepossessedAutoNone_BTN_CopyRow),strRepossessedAutoNone_BTN_CopyRow,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_Name(strRepossessedAutoNone_TXT_Name),strRepossessedAutoNone_TXT_Name,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_Description(strRepossessedAutoNone_TXT_Description),strRepossessedAutoNone_TXT_Description,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_Street(strRepossessedAutoNone_TXT_Street),strRepossessedAutoNone_TXT_Street,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_City(strRepossessedAutoNone_TXT_City),strRepossessedAutoNone_TXT_City,test);
						se.element().checkUncheckOrValidate(getRepossessedAutoNone_CHK_ComprehensiveRows(strRepossessedAutoNone_CHK_ComprehensiveRows),strRepossessedAutoNone_CHK_ComprehensiveRows,test);
						se.element().Click(getRepossessedAutoNone_BTN_ComprehensiveAddRow(strRepossessedAutoNone_BTN_ComprehensiveAddRow),strRepossessedAutoNone_BTN_ComprehensiveAddRow,test);
						se.element().selectElementDDrOrValidateText(getRepossessedAutoNone_BTN_ComprehensiveRemoveRow(strRepossessedAutoNone_BTN_ComprehensiveRemoveRow),strRepossessedAutoNone_BTN_ComprehensiveRemoveRow,test);
						se.element().selectElementDDrOrValidateText(getRepossessedAutoNone_BTN_ComprehensiveCopyRow(strRepossessedAutoNone_BTN_ComprehensiveCopyRow),strRepossessedAutoNone_BTN_ComprehensiveCopyRow,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_LocationNo(strRepossessedAutoNone_TXT_LocationNo),strRepossessedAutoNone_TXT_LocationNo,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_ComprehensiveState(strRepossessedAutoNone_TXT_State),strRepossessedAutoNone_TXT_State,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_ComprehensiveZipcode(strRepossessedAutoNone_TXT_ComprehensiveZipcode),strRepossessedAutoNone_TXT_ComprehensiveZipcode,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_Type(strRepossessedAutoNone_TXT_Type),strRepossessedAutoNone_TXT_Type,test);
						se.element().selectPopupWithMagnifier(getRepossessedAutoNone_TXT_TypeOfProperty(strRepossessedAutoNone_TXT_TypeOfProperty),getRepossessedAutoNone_TXT_TypeOfPropertySearch(strRepossessedAutoNone_TXT_TypeOfProperty),strRepossessedAutoNone_TXT_TypeOfProperty,constants.NA,strRepossessedAutoNone_TXT_TypeOfProperty, constants.NA, constants.NA,constants.NA,test);
						se.element().checkUncheckOrValidate(getRepossessedAutoNone_TXT_AllPerilsDeduc(strRepossessedAutoNone_TXT_AllPerilsDeduc),strRepossessedAutoNone_TXT_AllPerilsDeduc,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_Value(strRepossessedAutoNone_TXT_Value),strRepossessedAutoNone_TXT_Value,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_DeductPerCar(strRepossessedAutoNone_TXT_DeductPerCar),strRepossessedAutoNone_TXT_DeductPerCar,test);
						se.element().enterOrValidateText(getRepossessedAutoNone_TXT_DeductPerOcc(strRepossessedAutoNone_TXT_DeductPerOcc),strRepossessedAutoNone_TXT_DeductPerOcc,test);
						se.element().selectPopupWithMagnifier(getRepossessedAutoNone_TXT_State(strRepossessedAutoNone_TXT_State),getRepossessedAutoNone_TXT_StateSearch(strRepossessedAutoNone_TXT_State),strRepossessedAutoNone_TXT_State,strRepossessedAutoNone_TXT_StateFilterNeeded,strRepossessedAutoNone_TXT_State, constants.NA, constants.NA,constants.NA,test);
						
						
						
			se.element().clickElement(getNext());
			
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_RepossessedAutoNone ", true, false, true, test);			
					{
						
					}
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