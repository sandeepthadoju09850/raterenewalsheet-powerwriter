package pw.pages.CA;
/**
 * @author ${is09492}
 */
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_CA;

public class CA_AdditionalInterest extends OR_CA{

	public void AdditionalInterest(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException {
		
		try{
			//String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		    if(suspendSheet.equalsIgnoreCase("AdditionalInterest")){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData("AdditionalInterest", strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
				String strAdditionalInterest_BTN_Next = (String) row.get("AdditionalInterest_BTN_Next");
				String strAdditionalInterest_BTN_ADD = (String) row.get("AdditionalInterest_BTN_ADD");
				String strAdditionalInterest_BTN_Select = (String) row.get("AdditionalInterest_BTN_Select");
				String strAdditionalInterest_BTN_Details = (String) row.get("AdditionalInterest_BTN_Details");
				String strAdditionalInterest_BTN_Edit = (String) row.get("AdditionalInterest_BTN_Edit");
				String strAdditionalInterest_BTN_Done = (String) row.get("AdditionalInterest_BTN_Done");
				String strAdditionalInterest_BTN_Delete = (String) row.get("AdditionalInterest_BTN_Delete");
				String strAdditionalInterest_TXT_Name = (String) row.get("AdditionalInterest_TXT_Name");
				String strAdditionalInterest_CHK_DesignatedInsured = (String) row.get("AdditionalInterest_CHK_DesignatedInsured");
				String strAdditionalInterest_CHK_NoticeOfCancellation = (String) row.get("AdditionalInterest_CHK_NoticeOfCancellation");
				String strAdditionalInterest_CHK_NoticeOfCancellationAndMaterialChanges = (String) row.get("AdditionalInterest_CHK_NoticeOfCancellationAndMaterialChanges");
				String strAdditionalInterest_CHK_AdditionalInsuredLessorOfLeasedEquipment = (String) row.get("AdditionalInterest_CHK_AdditionalInsuredLessorOfLeasedEquipment");
				String strAdditionalInterest_CHK_PrimaryAndNoncontributoryAmendmentOfConditions = (String) row.get("AdditionalInterest_CHK_PrimaryAndNoncontributoryAmendmentOfConditions");
				String strAdditionalInterest_CHK_CoownerOfInsuredPremises = (String) row.get("AdditionalInterest_CHK_CoownerOfInsuredPremises");
				String strAdditionalInterest_CHK_ControllingInterest = (String) row.get("AdditionalInterest_CHK_ControllingInterest");
				String strAdditionalInterest_CHK_MotorCarrierNamedLesseeAsInsured = (String) row.get("AdditionalInterest_CHK_MotorCarrierNamedLesseeAsInsured");
				String strAdditionalInterest_CHK_LossPayeeAutoDealersPhysicalDamage = (String) row.get("AdditionalInterest_CHK_LossPayeeAutoDealersPhysicalDamage");
				String strAdditionalInterest_CHK_EmployeeAsLessorNotAppInKansas = (String) row.get("AdditionalInterest_CHK_EmployeeAsLessorNotAppInKansas");
				String strAdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasVehicle = (String) row.get("AdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasVehicle");
				String strAdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasUnscheduledVehicles = (String) row.get("AdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasUnscheduledVehicles");
				String strAdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchise = (String) row.get("AdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchise");
				String strAdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchiseKansas = (String) row.get("AdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchiseKansas");
				String strAdditionalInterest_CHK_ConcessionairesTradingUnderYourName = (String) row.get("AdditionalInterest_CHK_ConcessionairesTradingUnderYourName");
				String strAdditionalInterest_CHK_MotorCarriersNamedInsuredAndNamedLessorsForLeasedAuto = (String) row.get("AdditionalInterest_CHK_MotorCarriersNamedInsuredAndNamedLessorsForLeasedAuto");
				String strAdditionalInterest_CHK_LeasorLeasedEquipmentAutomatic = (String) row.get("AdditionalInterest_CHK_LeasorLeasedEquipmentAutomatic");
				String strAdditionalInterest_CHK_WaiverOfTransferOfRightsOfRecovery = (String) row.get("AdditionalInterest_CHK_WaiverOfTransferOfRightsOfRecovery");
				String strAdditionalInterest_CHK_LossPayeeUnscheduledVehicles = (String) row.get("AdditionalInterest_CHK_LossPayeeUnscheduledVehicles");
				String strAdditionalInterest_CHK_LossPayeeVehicle = (String) row.get("AdditionalInterest_CHK_LossPayeeVehicle");
				String strAdditionalInterest_CHK_DoNotApplyCityOrCountyTaxes = (String) row.get("AdditionalInterest_CHK_DoNotApplyCityOrCountyTaxes");
				String strAdditionalInterest_CHK_AllCityName = (String) row.get("AdditionalInterest_CHK_AllCityName");
				String strAdditionalInterest_TXT_KYCity = (String) row.get("AdditionalInterest_TXT_KYCity");
				String strAdditionalInterest_TXT_CityCode = (String) row.get("AdditionalInterest_TXT_CityCode");
				String strAdditionalInterest_TXT_County = (String) row.get("AdditionalInterest_TXT_County");
				String strAdditionalInterest_TXT_CountyCode = (String) row.get("AdditionalInterest_TXT_CountyCode");
				String strAdditionalInterest_TXT_Taxcode = (String) row.get("AdditionalInterest_TXT_Taxcode");
				String strAdditionalInterest_TXT_Street = (String) row.get("AdditionalInterest_TXT_Street");
				String strAdditionalInterest_TXT_SteUnit = (String) row.get("AdditionalInterest_TXT_SteUnit");
				String strAdditionalInterest_TXT_City = (String) row.get("AdditionalInterest_TXT_City");
				String strAdditionalInterest_TXT_StateCode = (String) row.get("AdditionalInterest_TXT_StateCode");
				String strAdditionalInterest_TXT_ZipCode = (String) row.get("AdditionalInterest_TXT_ZipCode");
				String strAdditionalInterest_TXT_UnscheduledVehicleDescription = (String) row.get("AdditionalInterest_TXT_UnscheduledVehicleDescription");
				String strAdditionalInterest_BTN_Additional_Interest_Vehicle_Add = (String) row.get("AdditionalInterest_BTN_Additional_Interest_Vehicle_Add");
				String strAdditionalInterest_BTN_Additional_Interest_Vehicle_Remove = (String) row.get("AdditionalInterest_BTN_Additional_Interest_VehicleRemove");
				String strAdditionalInterest_CHK_AI_Vehicle_Remove = (String) row.get("AdditionalInterest_CHK_AI_Vehicle_Remove");
				
				
				String strAdditionalInterest_TXT_Vehicle_Number = (String) row.get("AdditionalInterest_TXT_Vehicle_Number");
				String strAdditionalInterest_TXT_Year = (String) row.get("AdditionalInterest_TXT_Year");
				String strAdditionalInterest_TXT_Make = (String) row.get("AdditionalInterest_TXT_Make");
				String strAdditionalInterest_TXT_Model = (String) row.get("AdditionalInterest_TXT_Model");
				String strAdditionalInterest_TXT_VehicleInterestRowNo = (String) row.get("AdditionalInterest_TXT_VehicleInterestRowNo");
				String strAdditionalInterest_CHK_Vehicle_Interest_Applicable = (String) row.get("AdditionalInterest_CHK_Vehicle_Interest_Applicable");
				String strAdditionalInterest_TXT_LoanNumber1 = (String) row.get("AdditionalInterest_TXT_LoanNumber1");
				String strAdditionalInterest_TXT_LoanNumber2 = (String) row.get("AdditionalInterest_TXT_LoanNumber2");
				String strAdditionalInterest_TXT_ApplicableFormsRowNo = (String) row.get("AdditionalInterest_TXT_ApplicableFormsRowNo");
				String strAdditionalInterest_TXT_DisplayForm = (String) row.get("AdditionalInterest_TXT_DisplayForm");
				String strAdditionalInterest_TXT_InterestType = (String) row.get("AdditionalInterest_TXT_InterestType");
				String strAdditionalInterest_TXT_EndorsementPremium = (String) row.get("AdditionalInterest_TXT_EndorsementPremium");
				String strAdditionalInterest_TXT_MinimumPremium = (String) row.get("AdditionalInterest_TXT_MinimumPremium");
				String strAdditionalInterest_TXT_MaximumPremium = (String) row.get("AdditionalInterest_TXT_MaximumPremium");
				String strAdditionalInterest_TXT_OverrideEndorsementPremium = (String) row.get("AdditionalInterest_TXT_OverrideEndorsementPremium");
				String strAdditionalInterest_TXT_OverrideReason1 = (String) row.get("AdditionalInterest_TXT_OverrideReason1");
				String strAdditionalInterest_TXT_OverrideReason2 = (String) row.get("AdditionalInterest_TXT_OverrideReason2");
				String strAdditionalInterest_TXT_OverrideReason3 = (String) row.get("AdditionalInterest_TXT_OverrideReason3");
				String strAdditionalInterest_TXT_PrimaryNonContribPercentage = (String) row.get("AdditionalInterest_TXT_PrimaryNonContribPercentage");
				String strAdditionalInterest_TXT_PNCPercentOverride = (String) row.get("AdditionalInterest_TXT_PNCPercentOverride");
				String strAdditionalInterest_TXT_OverridePremiumReason = (String) row.get("AdditionalInterest_TXT_OverridePremiumReason");

				try{
					se.log().logTestStep("CA_AdditionalInterest");
					test.log(LogStatus.INFO, "CA_AdditionalInterest page","Transaction Step : "+transaction + "<br>" +"Page : CA_AdditionalInterest");
					se.verify().verifyEquals("CA_AdditionalInterest Details  of PowerWriter ", getAdditionalInterest_BTN_Label().isDisplayed(),true, true,test);
					
					if(strAdditionalInterest_BTN_ADD.equalsIgnoreCase("Yes")){
						se.element().Click(getAdditionalInterest_BTN_ADD(),test);
					}
					if(!strAdditionalInterest_BTN_Details.equalsIgnoreCase("N/A")){
						se.element().Click(getAdditionalInterest_BTN_Details(strAdditionalInterest_BTN_Details),test);
					}
					if(strAdditionalInterest_BTN_Delete.equalsIgnoreCase("Yes")){
						se.element().checkUncheckOrValidate(getHiredOrBorrowedAuto_selectDetails(strAdditionalInterest_BTN_Select),"Check",test);
						se.element().Click(getAdditionalInterest_BTN_Delete(), test);
						
					}else{
				
				
				se.element().Click(getAdditionalInterest_BTN_Edit(strAdditionalInterest_BTN_Edit),strAdditionalInterest_BTN_Edit,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_Name(strAdditionalInterest_TXT_Name),strAdditionalInterest_TXT_Name,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_DesignatedInsured(strAdditionalInterest_CHK_DesignatedInsured),strAdditionalInterest_CHK_DesignatedInsured,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_NoticeOfCancellation(strAdditionalInterest_CHK_NoticeOfCancellation),strAdditionalInterest_CHK_NoticeOfCancellation,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_NoticeOfCancellationAndMaterialChanges(strAdditionalInterest_CHK_NoticeOfCancellationAndMaterialChanges),strAdditionalInterest_CHK_NoticeOfCancellationAndMaterialChanges,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_AdditionalInsuredLessorOfLeasedEquipment(strAdditionalInterest_CHK_AdditionalInsuredLessorOfLeasedEquipment),strAdditionalInterest_CHK_AdditionalInsuredLessorOfLeasedEquipment,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_PrimaryAndNoncontributoryAmendmentOfConditions(strAdditionalInterest_CHK_PrimaryAndNoncontributoryAmendmentOfConditions),strAdditionalInterest_CHK_PrimaryAndNoncontributoryAmendmentOfConditions,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_CoownerOfInsuredPremises(strAdditionalInterest_CHK_CoownerOfInsuredPremises),strAdditionalInterest_CHK_CoownerOfInsuredPremises,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_ControllingInterest(strAdditionalInterest_CHK_ControllingInterest),strAdditionalInterest_CHK_ControllingInterest,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_MotorCarrierNamedLesseeAsInsured(strAdditionalInterest_CHK_MotorCarrierNamedLesseeAsInsured),strAdditionalInterest_CHK_MotorCarrierNamedLesseeAsInsured,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_LossPayeeAutoDealersPhysicalDamage(strAdditionalInterest_CHK_LossPayeeAutoDealersPhysicalDamage),strAdditionalInterest_CHK_LossPayeeAutoDealersPhysicalDamage,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_EmployeeAsLessorNotAppInKansas(strAdditionalInterest_CHK_EmployeeAsLessorNotAppInKansas),strAdditionalInterest_CHK_EmployeeAsLessorNotAppInKansas,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasVehicle(strAdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasVehicle),strAdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasVehicle,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasUnscheduledVehicles(strAdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasUnscheduledVehicles),strAdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasUnscheduledVehicles,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchise(strAdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchise),strAdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchise,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchiseKansas(strAdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchiseKansas),strAdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchiseKansas,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_ConcessionairesTradingUnderYourName(strAdditionalInterest_CHK_ConcessionairesTradingUnderYourName),strAdditionalInterest_CHK_ConcessionairesTradingUnderYourName,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_MotorCarriersNamedInsuredAndNamedLessorsForLeasedAuto(strAdditionalInterest_CHK_MotorCarriersNamedInsuredAndNamedLessorsForLeasedAuto),strAdditionalInterest_CHK_MotorCarriersNamedInsuredAndNamedLessorsForLeasedAuto,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_LeasorLeasedEquipmentAutomatic(strAdditionalInterest_CHK_LeasorLeasedEquipmentAutomatic),strAdditionalInterest_CHK_LeasorLeasedEquipmentAutomatic,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_WaiverOfTransferOfRightsOfRecovery(strAdditionalInterest_CHK_WaiverOfTransferOfRightsOfRecovery),strAdditionalInterest_CHK_WaiverOfTransferOfRightsOfRecovery,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_LossPayeeUnscheduledVehicles(strAdditionalInterest_CHK_LossPayeeUnscheduledVehicles),strAdditionalInterest_CHK_LossPayeeUnscheduledVehicles,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_LossPayeeVehicle(strAdditionalInterest_CHK_LossPayeeVehicle),strAdditionalInterest_CHK_LossPayeeVehicle,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_DoNotApplyCityOrCountyTaxes(strAdditionalInterest_CHK_DoNotApplyCityOrCountyTaxes),strAdditionalInterest_CHK_DoNotApplyCityOrCountyTaxes,test);
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_AllCityName(strAdditionalInterest_CHK_AllCityName),strAdditionalInterest_CHK_AllCityName,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_KYCity(strAdditionalInterest_TXT_KYCity),strAdditionalInterest_TXT_KYCity,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_CityCode(strAdditionalInterest_TXT_CityCode),strAdditionalInterest_TXT_CityCode,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_County(strAdditionalInterest_TXT_County),strAdditionalInterest_TXT_County,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_CountyCode(strAdditionalInterest_TXT_CountyCode),strAdditionalInterest_TXT_CountyCode,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_Taxcode(strAdditionalInterest_TXT_Taxcode),strAdditionalInterest_TXT_Taxcode,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_Street(strAdditionalInterest_TXT_Street),strAdditionalInterest_TXT_Street,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_SteUnit(strAdditionalInterest_TXT_SteUnit),strAdditionalInterest_TXT_SteUnit,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_City(strAdditionalInterest_TXT_City),strAdditionalInterest_TXT_City,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_StateCode(strAdditionalInterest_TXT_StateCode),strAdditionalInterest_TXT_StateCode,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_ZipCode(strAdditionalInterest_TXT_ZipCode),strAdditionalInterest_TXT_ZipCode,test);
				if(se.element().isElementPresent(closeButton)){
					se.element().Click(getfirstZipOption(), test);
				}
				se.element().enterOrValidateText(getAdditionalInterest_TXT_UnscheduledVehicleDescription(strAdditionalInterest_TXT_UnscheduledVehicleDescription),strAdditionalInterest_TXT_UnscheduledVehicleDescription,test);
				
				
				if(!strAdditionalInterest_BTN_Additional_Interest_Vehicle_Add.equalsIgnoreCase("N/A")){
					se.element().Click(getAdditionalInterest_BTN_Additional_Interest_Vehicle_Add(strAdditionalInterest_BTN_Additional_Interest_Vehicle_Add),strAdditionalInterest_BTN_Additional_Interest_Vehicle_Add,test);
					
					}
				
				if(!strAdditionalInterest_BTN_Additional_Interest_Vehicle_Remove.equalsIgnoreCase("N/A")){
					se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_AI_Vehicle_Remove(strAdditionalInterest_CHK_AI_Vehicle_Remove),"Check",test);
					se.element().Click(getAdditionalInterest_BTN_Additional_Interest_Vehicle_Remove(strAdditionalInterest_BTN_Additional_Interest_Vehicle_Remove),strAdditionalInterest_BTN_Additional_Interest_Vehicle_Remove,test);
					
					}
				
				se.element().enterOrValidateText(getAdditionalInterest_TXT_Vehicle_Number(strAdditionalInterest_TXT_Vehicle_Number,strAdditionalInterest_BTN_Additional_Interest_Vehicle_Add),strAdditionalInterest_TXT_Vehicle_Number,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_Year(strAdditionalInterest_TXT_Year,strAdditionalInterest_BTN_Additional_Interest_Vehicle_Add),strAdditionalInterest_TXT_Year,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_Make(strAdditionalInterest_TXT_Make,strAdditionalInterest_BTN_Additional_Interest_Vehicle_Add),strAdditionalInterest_TXT_Make,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_Model(strAdditionalInterest_TXT_Model,strAdditionalInterest_BTN_Additional_Interest_Vehicle_Add),strAdditionalInterest_TXT_Model,test);
				
				/*se.element().Click(getAdditionalInterest_BTN_Additional_Interest_Vehicle_Add(strAdditionalInterest_BTN_Additional_Interest_Vehicle_Add),strAdditionalInterest_BTN_Additional_Interest_Vehicle_Add,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_Vehicle_Number(strAdditionalInterest_TXT_Vehicle_Number),strAdditionalInterest_TXT_Vehicle_Number,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_Year(strAdditionalInterest_TXT_Year),strAdditionalInterest_TXT_Year,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_Make(strAdditionalInterest_TXT_Make),strAdditionalInterest_TXT_Make,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_Model(strAdditionalInterest_TXT_Model),strAdditionalInterest_TXT_Model,test);*/
				se.element().checkUncheckOrValidate(getAdditionalInterest_CHK_Vehicle_Interest_Applicable(strAdditionalInterest_TXT_VehicleInterestRowNo),strAdditionalInterest_CHK_Vehicle_Interest_Applicable,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_LoanNumber1(strAdditionalInterest_TXT_LoanNumber1),strAdditionalInterest_TXT_LoanNumber1,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_LoanNumber2(strAdditionalInterest_TXT_LoanNumber2),strAdditionalInterest_TXT_LoanNumber2,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_DisplayForm(strAdditionalInterest_TXT_ApplicableFormsRowNo),strAdditionalInterest_TXT_DisplayForm,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_InterestType(strAdditionalInterest_TXT_ApplicableFormsRowNo),strAdditionalInterest_TXT_InterestType,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_EndorsementPremium(strAdditionalInterest_TXT_ApplicableFormsRowNo),strAdditionalInterest_TXT_EndorsementPremium,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_MinimumPremium(strAdditionalInterest_TXT_ApplicableFormsRowNo),strAdditionalInterest_TXT_MinimumPremium,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_MaximumPremium(strAdditionalInterest_TXT_ApplicableFormsRowNo),strAdditionalInterest_TXT_MaximumPremium,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_OverrideEndorsementPremium(strAdditionalInterest_TXT_ApplicableFormsRowNo),strAdditionalInterest_TXT_OverrideEndorsementPremium,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_OverrideReason1(strAdditionalInterest_TXT_OverrideReason1),strAdditionalInterest_TXT_OverrideReason1,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_OverrideReason2(strAdditionalInterest_TXT_OverrideReason2),strAdditionalInterest_TXT_OverrideReason2,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_OverrideReason3(strAdditionalInterest_TXT_OverrideReason3),strAdditionalInterest_TXT_OverrideReason3,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_PrimaryNonContribPercentage(strAdditionalInterest_TXT_PrimaryNonContribPercentage),strAdditionalInterest_TXT_PrimaryNonContribPercentage,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_PNCPercentOverride(strAdditionalInterest_TXT_PNCPercentOverride),strAdditionalInterest_TXT_PNCPercentOverride,test);
				se.element().enterOrValidateText(getAdditionalInterest_TXT_OverridePremiumReason(strAdditionalInterest_TXT_OverridePremiumReason),strAdditionalInterest_TXT_OverridePremiumReason,test);
				
				
					}
							if(strAdditionalInterest_BTN_Next.equalsIgnoreCase("Yes")){
								se.element().Click(getNext(),test);
							}
							if(strAdditionalInterest_BTN_Done.equalsIgnoreCase("Yes")){
								se.element().Click(getDone(),test);
							}
					
						}catch(Exception e){
							se.verify().verifyEquals("Failed to fill in details for CA_AdditionalInterest ", true, false, true, test);
							
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


