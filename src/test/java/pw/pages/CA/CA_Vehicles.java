/**
* @author ${sw09380}
*/
package pw.pages.CA;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Util;
import pw.Constants.constants;
import pw.OR.OR_CA;

public class CA_Vehicles extends OR_CA  {
	
	public void CA_VehiclesPage(String strRegressionID,String transaction,String suspendSheet,ExtentTest test) throws IOException{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Vehicles)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		    
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Vehicles, strRegressionID, transaction);
			int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		try{
			CA_Vehicles CAVehiclesPage = TestPageFactory.initElements(se, CA_Vehicles.class);
			String strVehicles_CHK_Vehicle_Select = (String) row.get("Vehicles_CHK_Vehicle_Select");
			String strVehicles_BTN_VehicleAdd = (String) row.get("Vehicles_BTN_VehicleAdd");
			String strVehicles_BTN_CopyVehicle = (String) row.get("Vehicles_BTN_CopyVehicle");
			String strVehicles_TXT_CopyInput = (String) row.get("Vehicles_TXT_CopyInput");
			String strVehicles_BTN_Delete_Vehicle = (String) row.get("Vehicles_BTN_Delete_Vehicle");
			String strVehicles_BTN_Vehicle_Detail = (String) row.get("Vehicles_BTN_Vehicle_Detail");
			String strVehicles_BTN_Vehicle_Done = (String) row.get("Vehicles_BTN_Vehicle_Done");
			String strVehicles_CHK_SuspensionCoverage = (String) row.get("Vehicles_CHK_SuspensionCoverage");
			se.log().logTestStep("CA_Vehicles");
			test.log(LogStatus.INFO, "CA_Vehicles page","Transaction Step : "+transaction + "<br>" +"Page : CA_Vehicles");
			se.verify().verifyEquals("CA_Vehicles of PowerWriter ", getVehicles_LBL_Vehicle().isDisplayed(),true, true,test);
			if(strVehicles_BTN_VehicleAdd.equalsIgnoreCase("Yes")){
				se.element().Click(getVehicles_BTN_VehicleAdd(), test);
			}
			if(strVehicles_BTN_Delete_Vehicle.equalsIgnoreCase("Yes")){
				se.element().checkUncheckOrValidate(getVehicles_CHK_Vehicle_Select(strVehicles_CHK_Vehicle_Select),"Check",test);
				se.element().Click(getVehicles_BTN_Delete_Vehicle(strVehicles_BTN_Delete_Vehicle), test);
				
			}
			if(strVehicles_BTN_CopyVehicle.equalsIgnoreCase("Yes")){
				se.element().checkUncheckOrValidate(getVehicles_CHK_Vehicle_Select(strVehicles_CHK_Vehicle_Select),"Check",test);
				se.element().Click(getVehicles_BTN_CopyVehicle(strVehicles_BTN_CopyVehicle), test);
				se.element().enterOrValidateText(getVehicles_TXT_CopyInput(strVehicles_TXT_CopyInput), strVehicles_TXT_CopyInput,test);
				se.element().Click(getVehicles_BTN_CopyGo(), test);
			}
			if(!strVehicles_BTN_Vehicle_Detail.equalsIgnoreCase("N/A")){
				se.element().Click(getVehicles_BTN_Vehicle_Detail(strVehicles_BTN_Vehicle_Detail), test);
			}
			
			CAVehiclesPage.CA_VehiclesInformation(row,test);
			CAVehiclesPage.PrimaryGarageAddress(row,test);
			CAVehiclesPage.VehicleUsageInfo(row,test);
			CAVehiclesPage.NonPhysicalDamageCoverages(row,test);
			CAVehiclesPage.PhysicalDamageCoverages(row,test);
			CAVehiclesPage.KYorIL_TaxInfo(row,test);
			
			if(strVehicles_CHK_SuspensionCoverage.equalsIgnoreCase("Check")){
			se.element().checkUncheckOrValidate(getVehicles_CHK_SuspensionCoverage(strVehicles_CHK_SuspensionCoverage),strVehicles_CHK_SuspensionCoverage,test);
		}
			if(strVehicles_BTN_Delete_Vehicle.equalsIgnoreCase(constants.NA)){
				se.element().Click(getNext(),test);
			}
			if(strVehicles_BTN_Vehicle_Done.equalsIgnoreCase(constants.Yes)){
				se.element().Click(getDone(),test);
			}
			
		
		} catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CAVehicles", true, false, true, test);
			
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
	
	
public void CA_VehiclesInformation(Map<String, String> row, ExtentTest test) throws IOException {
		
	String strVehicles_TXT_Vehicle_No = (String) row.get("Vehicles_TXT_Vehicle_No");
	String strVehicles_CHK_ManuallyEnterRatingClass = (String) row.get("Vehicles_CHK_ManuallyEnterRatingClass");
	String strVehicles_CHK_SuspensionCoverage = (String) row.get("Vehicles_CHK_SuspensionCoverage");
	String strVehicles_TXT_VehicleType = (String) row.get("Vehicles_TXT_VehicleType");
	String strVehicles_TXT_VehicleTypeFilterNeeded = (String) row.get("Vehicles_TXT_VehicleType_FilterNeeded");
	String strVehicles_TXT_VehicleSize = (String) row.get("Vehicles_TXT_VehicleSize");
	String strVehicles_TXT_VehicleSizeFilterNeeded = (String) row.get("Vehicles_TXT_VehicleSize_FilterNeeded");
	String strVehicles_CHK_VINUnknown = (String) row.get("Vehicles_CHK_VINUnknown");
	String strVehicles_TXT_VIN = (String) row.get("Vehicles_TXT_VIN");
	String strVehicles_LBL_VINStatus = (String) row.get("Vehicles_LBL_VINStatus");
	String strVehicles_TXT_Year = (String) row.get("Vehicles_TXT_Year");
	String strVehicles_TXT_Make = (String) row.get("Vehicles_TXT_Make");
	String strVehicles_TXT_Model = (String) row.get("Vehicles_TXT_Model");
	String strVehicles_TXT_VINOrgCostNew = (String) row.get("Vehicles_TXT_VINOrgCostNew");
	
	try{
			
			se.element().enterOrValidateText(getVehicles_TXT_Vehicle_No(strVehicles_TXT_Vehicle_No),strVehicles_TXT_Vehicle_No,test);
			se.util().sleep(3000);
			se.element().checkUncheckOrValidate(getVehicles_CHK_SuspensionCoverage(strVehicles_CHK_SuspensionCoverage),strVehicles_CHK_SuspensionCoverage,test);
			se.element().selectPopupWithMagnifier(getVehicles_TXT_VehicleType(strVehicles_TXT_VehicleType),getVehicles_TXT_VehicleTypeSearch(strVehicles_TXT_VehicleType),strVehicles_TXT_VehicleType,strVehicles_TXT_VehicleTypeFilterNeeded,strVehicles_TXT_VehicleType, constants.NA, constants.NA,constants.NA,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_ManuallyEnterRatingClass(strVehicles_CHK_ManuallyEnterRatingClass),strVehicles_CHK_ManuallyEnterRatingClass,test);
			
			se.element().selectPopupWithMagnifier(getVehicles_TXT_VehicleSize(strVehicles_TXT_VehicleSize),getVehicles_TXT_VehicleSizeSearch(strVehicles_TXT_VehicleSize),strVehicles_TXT_VehicleSize,strVehicles_TXT_VehicleSizeFilterNeeded,strVehicles_TXT_VehicleSize, constants.NA, constants.NA,constants.NA,test);
			
			se.element().checkUncheckOrValidate(getVehicles_CHK_VINUnknown(strVehicles_CHK_VINUnknown),strVehicles_CHK_VINUnknown,test);
			if(!strVehicles_CHK_VINUnknown.equals("N/A")){
			if(getVehicles_CHK_VINUnknown(strVehicles_CHK_VINUnknown).isSelected()!=true){
				se.element().enterOrValidateText(getVehicles_TXT_VIN(strVehicles_TXT_VIN),strVehicles_TXT_VIN,test);
				se.util().sleep(5000);
				if(se.element().isElementPresent(common_BTN_PopupClose)){
					se.util().sleep(3000);
					String NewstrVehicles_TXT_Year = Util.getActaulString(strVehicles_TXT_Year);
					se.element().Click(getVehicles_LNK_VINPopup(strVehicles_TXT_VINOrgCostNew,NewstrVehicles_TXT_Year), test);
					
				}
			}
			}
			se.element().enterOrValidateText(getVehicles_TXT_Year(strVehicles_TXT_Year),strVehicles_TXT_Year,test);
			
			se.element().enterOrValidateText(getVehicles_TXT_Make(strVehicles_TXT_Make),strVehicles_TXT_Make,test);
			se.element().waitForElement(Vehicles_LBL_Make, 50);
			if(se.element().isElementPresent(Vehicles_LBL_Make)){
				se.element().clickElement(getVehicles_LNK_Make(strVehicles_TXT_Make), test);
				se.util().sleep(2000);
			}
			
			se.element().enterOrValidateText(getVehicles_TXT_Model(strVehicles_TXT_Model),strVehicles_TXT_Model,test);
		
			se.element().waitForElement(Vehicles_LBL_Model, 50);
			if(se.element().isElementPresent(Vehicles_LBL_Model)){
				se.element().clickElement(getVehicles_LNK_Model(strVehicles_TXT_Model), test);
				se.util().sleep(2000);
			}
			if(!strVehicles_LBL_VINStatus.equalsIgnoreCase(constants.NA)){
			se.verify().verifyEquals("CA_Vehicles VIN Status - ", getVehicles_LBL_VINStatus(strVehicles_LBL_VINStatus).getText().equalsIgnoreCase(strVehicles_LBL_VINStatus),true, true,test);
			}
			
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for VehiclesInformation", true, false, true, test);
			
		}
	}

public void PrimaryGarageAddress(Map<String, String> row, ExtentTest test) throws IOException {
	
	String strVehicles_TXT_State = (String) row.get("Vehicles_TXT_State");
	String strVehicles_TXT_Zipcode = (String) row.get("Vehicles_TXT_Zipcode");
	String strVehicles_TXT_TerritoryCode = (String) row.get("Vehicles_TXT_TerritoryCode");
	String strVehicles_TXT_TerritoryDescription = (String) row.get("Vehicles_TXT_TerritoryDescription");
	String strVehicles_DDN_StateOfRegistration = (String) row.get("Vehicles_DDN_StateOfRegistration");
		try{
			
			se.element().enterOrValidateText(getVehicles_TXT_State(strVehicles_TXT_State),strVehicles_TXT_State,test);
			
			if(!strVehicles_TXT_Zipcode.contains("validate2")){
				se.element().clearTheField(getVehicles_TXT_Zipcode(strVehicles_TXT_Zipcode));
				se.util().sleep(2000);
				se.element().enterOrValidateText(getVehicles_TXT_Zipcode(strVehicles_TXT_Zipcode),strVehicles_TXT_Zipcode,test);
			}
			else{
			se.element().enterOrValidateText(getVehicles_TXT_Zipcode(strVehicles_TXT_Zipcode),strVehicles_TXT_Zipcode,test);
			}
			se.element().enterOrValidateText(getVehicles_TXT_TerritoryCode(strVehicles_TXT_TerritoryCode),strVehicles_TXT_TerritoryCode,test);
			se.element().enterOrValidateText(getVehicles_TXT_TerritoryDescription(strVehicles_TXT_TerritoryDescription),strVehicles_TXT_TerritoryDescription,test);
			se.element().enterOrValidateText(getVehicles_DDN_StateOfRegistration(strVehicles_DDN_StateOfRegistration),strVehicles_DDN_StateOfRegistration,test);

		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for PrimaryGarageAddress Information", true, false, true, test);
			
		}
	}

public void KYorIL_TaxInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	String strVehicles_TXT_KYCity = (String) row.get("Vehicles_TXT_KYCity");
	String strVehicles_TXT_KYCounty = (String) row.get("Vehicles_TXT_KYCounty");
	
	String strVehicles_TXT_Municipality = (String) row.get("Vehicles_TXT_Municipality");
	String strVehicles_TXT_MunicipalityCode = (String) row.get("Vehicles_TXT_MunicipalityCode");
	String strVehicles_TXT_MunicipalityDescription = (String) row.get("Vehicles_TXT_MunicipalityDescription");
	
		try{
			
				se.element().enterOrValidateText(getVehicles_TXT_KYCity(strVehicles_TXT_KYCity),strVehicles_TXT_KYCity,test);
				se.element().enterOrValidateText(getVehicles_TXT_KYCounty(strVehicles_TXT_KYCounty),strVehicles_TXT_KYCounty,test);

				se.element().enterOrValidateText(getVehicles_TXT_Municipality(strVehicles_TXT_Municipality),strVehicles_TXT_Municipality,test);
				se.element().enterOrValidateText(getVehicles_TXT_MunicipalityCode(strVehicles_TXT_MunicipalityCode),strVehicles_TXT_MunicipalityCode,test);
				se.element().enterOrValidateText(getVehicles_TXT_MunicipalityDescription(strVehicles_TXT_MunicipalityDescription),strVehicles_TXT_MunicipalityDescription,test);

			
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for KYorIL_TaxInfo Information", true, false, true, test);
			
		}
	}
public void VehicleUsageInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	String strVehicles_TXT_VehicleSpecialType = (String) row.get("Vehicles_TXT_VehicleSpecialType");
	String strVehicles_TXT_VehicleSpecialType_FilterNeeded = (String) row.get("Vehicles_TXT_VehicleSpecialType_FilterNeeded");
	String strVehicles_TXT_VehicleEngineSize = (String) row.get("Vehicles_TXT_VehicleEngineSize");
	String strVehicles_TXT_TypeOfMobileHome = (String) row.get("Vehicles_TXT_TypeOfMobileHome");
	String strVehicles_CHK_ManuallyEnterRatingClass = (String) row.get("Vehicles_CHK_ManuallyEnterRatingClass");
	String strVehicles_CHK_ISThisVehRatedWithOCP = (String) row.get("Vehicles_CHK_ISThisVehRatedWithOCP");
	String strVehicles_CHK_ThisAutoIsOperatedOnAHighwayOnlyForThePuposeOfCrossing = (String) row.get("Vehicles_CHK_ThisAutoIsOperatedOnAHighwayOnlyForThePuposeOfCrossing");
	String strVehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_Yes = (String) row.get("Vehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_Yes");
	String strVehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_No = (String) row.get("Vehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_No");
	String strVehicles_TXT_Name_oO_IndividualOwner = (String) row.get("Vehicles_TXT_Name_oO_IndividualOwner");
	String strVehicles_CHK_AutoFurnishedForRegularUseOtherThanClassIOrClassIIOperators = (String) row.get("Vehicles_CHK_AutoFurnishedForRegularUseOtherThanClassIOrClassIIOperators");
	String strVehicles_CHK_usedinridesharingarr_Yes = (String) row.get("Vehicles_CHK_usedinridesharingarr_Yes");
	String strVehicles_CHK_usedinridesharingarr_No = (String) row.get("Vehicles_CHK_usedinridesharingarr_No");
	String strVehicles_CHK_LeasingOrRentalConcern = (String) row.get("Vehicles_CHK_LeasingOrRentalConcern");
	String strVehicles_CHK_InsuredLessorHasAgreedInWritingToProvidePrimaryCoverage = (String) row.get("Vehicles_CHK_InsuredLessorHasAgreedInWritingToProvidePrimaryCoverage");
	String strVehicles_CHK_SeasonalUse = (String) row.get("Vehicles_CHK_SeasonalUse");
	String strVehicles_TXT_OperatorExperience = (String) row.get("Vehicles_TXT_OperatorExperience");
	String strVehicles_TXT_OperatorExperience_FilterNeeded = (String) row.get("Vehicles_TXT_OperatorExperience_FilterNeeded");
	String strVehicles_CHK_FarmAuto = (String) row.get("Vehicles_CHK_FarmAuto");
	String strVehicles_TXT_OperatorUse = (String) row.get("Vehicles_TXT_OperatorUse");
	String strVehicles_TXT_OperatorUse_FilterNeeded = (String) row.get("Vehicles_TXT_OperatorUse_FilterNeeded");
	String strVehicles_TXT_DetailedClass = (String) row.get("Vehicles_TXT_DetailedClass");
	String strVehicles_TXT_DetailedClass_FilterNeeded = (String) row.get("Vehicles_TXT_DetailedClass_FilterNeeded");
	String strVehicles_TXT_SubClassPopup = (String) row.get("Vehicles_TXT_SubClassPopup");
	String strVehicles_TXT_SubClass = (String) row.get("Vehicles_TXT_SubClass");
	String strVehicles_CHK_AccidentPreventionCourseDiscount = (String) row.get("Vehicles_CHK_AccidentPreventionCourseDiscount");
	String strVehicles_TXT_ClassificationCode = (String) row.get("Vehicles_TXT_ClassificationCode");
	String strVehicles_CHK_UsedForDumping = (String) row.get("Vehicles_CHK_UsedForDumping");
	String strVehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_Yes = (String) row.get("Vehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_Yes");
	String strVehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_No = (String) row.get("Vehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_No");
	String strVehicles_TXT_UseOfVehicle = (String) row.get("Vehicles_TXT_UseOfVehicle");
	String strVehicles_TXT_UseOfVehicle_FilterNeeded = (String) row.get("Vehicles_TXT_UseOfVehicle_FilterNeeded");
	String strVehicles_TXT_UsageRadius = (String) row.get("Vehicles_TXT_UsageRadius");
	String strVehicles_TXT_UsageRadius_FilterNeeded = (String) row.get("Vehicles_TXT_UsageRadius_FilterNeeded");
	String strVehicles_TXT_nearest_terminal = (String) row.get("Vehicles_TXT_nearest_terminal");
	String strVehicles_TXT_nearest_terminal_desc = (String) row.get("Vehicles_TXT_nearest_terminal_desc");
	String strVehicles_TXT_farthest_terminal = (String) row.get("Vehicles_TXT_farthest_terminal");
	String strVehicles_TXT_farthest_terminal_desc = (String) row.get("Vehicles_TXT_farthest_terminal_desc");
	String strVehicles_CHK_PowerUnit = (String) row.get("Vehicles_CHK_PowerUnit");
	String strVehicles_TXT_SpecialIndustryType = (String) row.get("Vehicles_TXT_SpecialIndustryType");
	String strVehicles_TXT_SpecialIndustryType_FilterNeeded = (String) row.get("Vehicles_TXT_SpecialIndustryType_FilterNeeded");
	String strVehicles_TXT_SpecialIndustryClass = (String) row.get("Vehicles_TXT_SpecialIndustryClass");
	String strVehicles_TXT_SpecialIndustryClass_FilterNeeded = (String) row.get("Vehicles_TXT_SpecialIndustryClass_FilterNeeded");
	String strVehicles_TXT_PrimaryCLassification = (String) row.get("Vehicles_TXT_PrimaryCLassification");
	String strVehicles_TXT_PrimaryCLassification_FilterNeeded = (String) row.get("Vehicles_TXT_PrimaryCLassification_FilterNeeded");
	String strVehicles_TXT_SecondaryCLassification = (String) row.get("Vehicles_TXT_SecondaryCLassification");
	String strVehicles_TXT_SecondaryCLassification_FilterNeeded = (String) row.get("Vehicles_TXT_SecondaryCLassification_FilterNeeded");
	String strVehicles_TXT_SpecialtyUse = (String) row.get("Vehicles_TXT_SpecialtyUse");
	String strVehicles_TXT_SpecialtyUse_FilterNeeded = (String) row.get("Vehicles_TXT_SpecialtyUse_FilterNeeded");
	String strVehicles_CHK_AmphibiousVehicle = (String) row.get("Vehicles_CHK_AmphibiousVehicle");
	String strVehicles_TXT_GrossVehicleWeight = (String) row.get("Vehicles_TXT_GrossVehicleWeight");
	String strVehicles_CHK_TransportationRange_Interstate = (String) row.get("Vehicles_CHK_TransportationRange_Interstate");
	String strVehicles_CHK_TransportationRange_Intrastate = (String) row.get("Vehicles_CHK_TransportationRange_Intrastate");
	String strVehicles_TXT_SeatingCapacity = (String) row.get("Vehicles_TXT_SeatingCapacity");
	String strVehicles_CHK_DoesThisVehHaveAMechLift = (String) row.get("Vehicles_CHK_DoesThisVehHaveAMechLift");

	String strVehicles_CHK_IsThisVehicleHiredAuto = (String) row.get("Vehicles_CHK_IsThisVehicleHiredAuto");
	String strVehicles_CHK_OwnedByAlliedOrSubsidiaryInterest = (String) row.get("Vehicles_CHK_OwnedByAlliedOrSubsidiaryInterest");
	String strVehicles_BTN_periodofoperations_add = (String) row.get("Vehicles_BTN_periodofoperations_add");
	String strVehicles_TXT_produce_carried = (String) row.get("Vehicles_TXT_produce_carried");
	String strVehicles_TXT_fromdate = (String) row.get("Vehicles_TXT_fromdate");
	String strVehicles_TXT_todate = (String) row.get("Vehicles_TXT_todate");
	String strVehicles_TXT_Farm_Seasonal_Usetype = (String) row.get("Vehicles_TXT_Farm_Seasonal_Usetype");
	
		try{
			se.element().selectPopupWithMagnifier(getVehicles_TXT_VehicleSpecialType(strVehicles_TXT_VehicleSpecialType),getVehicles_TXT_VehicleSpecialTypeSearch(strVehicles_TXT_VehicleSpecialType),strVehicles_TXT_VehicleSpecialType,strVehicles_TXT_VehicleSpecialType_FilterNeeded,strVehicles_TXT_VehicleSpecialType, constants.NA, constants.NA,constants.NA,test);
			
			
			se.element().enterOrValidateText(getVehicles_TXT_TypeOfMobileHome(strVehicles_TXT_TypeOfMobileHome),strVehicles_TXT_TypeOfMobileHome,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_Yes(strVehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_Yes),strVehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_Yes,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_No(strVehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_No),strVehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_No,test);
			se.element().enterOrValidateText(getVehicles_TXT_Name_oO_IndividualOwner(strVehicles_TXT_Name_oO_IndividualOwner),strVehicles_TXT_Name_oO_IndividualOwner,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_ISThisVehRatedWithOCP(strVehicles_CHK_ISThisVehRatedWithOCP),strVehicles_CHK_ISThisVehRatedWithOCP,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_AutoFurnishedForRegularUseOtherThanClassIOrClassIIOperators(strVehicles_CHK_AutoFurnishedForRegularUseOtherThanClassIOrClassIIOperators),strVehicles_CHK_AutoFurnishedForRegularUseOtherThanClassIOrClassIIOperators,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_LeasingOrRentalConcern(strVehicles_CHK_LeasingOrRentalConcern),strVehicles_CHK_LeasingOrRentalConcern,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_InsuredLessorHasAgreedInWritingToProvidePrimaryCoverage(strVehicles_CHK_InsuredLessorHasAgreedInWritingToProvidePrimaryCoverage),strVehicles_CHK_InsuredLessorHasAgreedInWritingToProvidePrimaryCoverage,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_SeasonalUse(strVehicles_CHK_SeasonalUse),strVehicles_CHK_SeasonalUse,test);
			
			
			se.element().selectPopupWithMagnifier(getVehicles_TXT_OperatorExperience(strVehicles_TXT_OperatorExperience),getVehicles_TXT_OperatorExperienceSearch(strVehicles_TXT_OperatorExperience),strVehicles_TXT_OperatorExperience,strVehicles_TXT_OperatorExperience_FilterNeeded,strVehicles_TXT_OperatorExperience, constants.NA, constants.NA,constants.NA,test);
			se.element().selectPopupWithMagnifier(getVehicles_TXT_OperatorUse(strVehicles_TXT_OperatorUse),getVehicles_TXT_OperatorUseSearch(strVehicles_TXT_OperatorUse),strVehicles_TXT_OperatorUse,strVehicles_TXT_OperatorUse_FilterNeeded,strVehicles_TXT_OperatorUse, constants.NA, constants.NA,constants.NA,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_FarmAuto(strVehicles_CHK_FarmAuto),strVehicles_CHK_FarmAuto,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_AccidentPreventionCourseDiscount(strVehicles_CHK_AccidentPreventionCourseDiscount),strVehicles_CHK_AccidentPreventionCourseDiscount,test);
			
			se.element().selectPopupWithMagnifier(getVehicles_TXT_DetailedClass(strVehicles_TXT_DetailedClass),getVehicles_TXT_DetailedClass_Search(strVehicles_TXT_DetailedClass),strVehicles_TXT_DetailedClass,strVehicles_TXT_DetailedClass_FilterNeeded,strVehicles_TXT_DetailedClass, strVehicles_TXT_SubClassPopup, constants.NA,constants.NA,test);
			se.element().enterOrValidateText(getVehicles_TXT_SubClass(strVehicles_TXT_SubClass),strVehicles_TXT_SubClass,test);
			se.element().enterOrValidateText(getVehicles_TXT_VehicleEngineSize(strVehicles_TXT_VehicleEngineSize),strVehicles_TXT_VehicleEngineSize,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_ThisAutoIsOperatedOnAHighwayOnlyForThePuposeOfCrossing(strVehicles_CHK_ThisAutoIsOperatedOnAHighwayOnlyForThePuposeOfCrossing),strVehicles_CHK_ThisAutoIsOperatedOnAHighwayOnlyForThePuposeOfCrossing,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_UsedForDumping(strVehicles_CHK_UsedForDumping),strVehicles_CHK_UsedForDumping,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_ManuallyEnterRatingClass(strVehicles_CHK_ManuallyEnterRatingClass),strVehicles_CHK_ManuallyEnterRatingClass,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_Yes(strVehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_Yes),strVehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_Yes,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_No(strVehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_No),strVehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_No,test);
			
			if(strVehicles_TXT_VehicleSpecialType.equalsIgnoreCase(constants.NA)){
			if(strVehicles_TXT_PrimaryCLassification.equalsIgnoreCase(constants.NA)||strVehicles_TXT_PrimaryCLassification.contains(constants.Validate)){
			se.element().selectPopupWithMagnifier(getVehicles_TXT_UseOfVehicle(strVehicles_TXT_UseOfVehicle),getVehicles_TXT_UseOfVehicleSearch(strVehicles_TXT_UseOfVehicle),strVehicles_TXT_UseOfVehicle,strVehicles_TXT_UseOfVehicle_FilterNeeded,strVehicles_TXT_UseOfVehicle, constants.NA, constants.NA,constants.NA,test);
			se.element().selectPopupWithMagnifier(getVehicles_TXT_UsageRadius(strVehicles_TXT_UsageRadius),getVehicles_TXT_UsageRadiusSearch(strVehicles_TXT_UsageRadius),strVehicles_TXT_UsageRadius,strVehicles_TXT_UsageRadius_FilterNeeded,strVehicles_TXT_UsageRadius, constants.NA, constants.NA,constants.NA,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_PowerUnit(strVehicles_CHK_PowerUnit),strVehicles_CHK_PowerUnit,test);
			se.element().selectPopupWithMagnifier(getVehicles_TXT_SpecialIndustryType(strVehicles_TXT_SpecialIndustryType),getVehicles_TXT_SpecialIndustryTypeSearch(strVehicles_TXT_SpecialIndustryType),strVehicles_TXT_SpecialIndustryType,strVehicles_TXT_SpecialIndustryType_FilterNeeded,strVehicles_TXT_SpecialIndustryType, constants.NA, constants.NA,constants.NA,test);
			se.element().selectPopupWithMagnifier(getVehicles_TXT_SpecialIndustryClass(strVehicles_TXT_SpecialIndustryClass),getVehicles_TXT_SpecialIndustryClassSearch(strVehicles_TXT_SpecialIndustryClass),strVehicles_TXT_SpecialIndustryClass,strVehicles_TXT_SpecialIndustryClass_FilterNeeded,strVehicles_TXT_SpecialIndustryClass, constants.NA, constants.NA,constants.NA,test);
			se.element().selectPopupWithMagnifier(getVehicles_TXT_SpecialtyUse(strVehicles_TXT_SpecialtyUse),getVehicles_TXT_SpecialtyUseSearch(strVehicles_TXT_SpecialtyUse),strVehicles_TXT_SpecialtyUse,strVehicles_TXT_SpecialtyUse_FilterNeeded,strVehicles_TXT_SpecialtyUse, constants.NA, constants.NA,constants.NA,test);
			se.element().Click(getVehicles_BTN_periodofoperations_add(strVehicles_BTN_periodofoperations_add),strVehicles_BTN_periodofoperations_add,test);
			se.element().enterOrValidateText(getVehicles_TXT_produce_carried(strVehicles_TXT_produce_carried),strVehicles_TXT_produce_carried,test);
			se.element().enterOrValidateText(getVehicles_TXT_fromdate(strVehicles_TXT_fromdate),strVehicles_TXT_fromdate,test);
			se.element().enterOrValidateText(getVehicles_TXT_todate(strVehicles_TXT_todate),strVehicles_TXT_todate,test);
			se.element().selectPopupWithMagnifier(getVehicles_TXT_PrimaryCLassification(strVehicles_TXT_PrimaryCLassification),getVehicles_TXT_PrimaryCLassificationSearch(strVehicles_TXT_PrimaryCLassification),strVehicles_TXT_PrimaryCLassification,strVehicles_TXT_PrimaryCLassification_FilterNeeded,strVehicles_TXT_PrimaryCLassification, constants.NA, constants.NA,constants.NA,test);
			se.element().selectPopupWithMagnifier(getVehicles_TXT_SecondaryCLassification(strVehicles_TXT_SecondaryCLassification),getVehicles_TXT_SecondaryCLassificationSearch(strVehicles_TXT_SecondaryCLassification),strVehicles_TXT_SecondaryCLassification,strVehicles_TXT_SecondaryCLassification_FilterNeeded,strVehicles_TXT_SecondaryCLassification, constants.NA, constants.NA,constants.NA,test);
			se.element().enterOrValidateText(getVehicles_TXT_Farm_Seasonal_Usetype(strVehicles_TXT_Farm_Seasonal_Usetype),strVehicles_TXT_Farm_Seasonal_Usetype,test);
			
			}else{
				se.element().selectPopupWithMagnifier(getVehicles_TXT_PrimaryCLassification(strVehicles_TXT_PrimaryCLassification),getVehicles_TXT_PrimaryCLassificationSearch(strVehicles_TXT_PrimaryCLassification),strVehicles_TXT_PrimaryCLassification,strVehicles_TXT_PrimaryCLassification_FilterNeeded,strVehicles_TXT_PrimaryCLassification, constants.NA, constants.NA,constants.NA,test);
				se.element().selectPopupWithMagnifier(getVehicles_TXT_SecondaryCLassification(strVehicles_TXT_SecondaryCLassification),getVehicles_TXT_SecondaryCLassificationSearch(strVehicles_TXT_SecondaryCLassification),strVehicles_TXT_SecondaryCLassification,strVehicles_TXT_SecondaryCLassification_FilterNeeded,strVehicles_TXT_SecondaryCLassification, constants.NA, constants.NA,constants.NA,test);
				se.element().selectPopupWithMagnifier(getVehicles_TXT_UseOfVehicle(strVehicles_TXT_UseOfVehicle),getVehicles_TXT_UseOfVehicleSearch(strVehicles_TXT_UseOfVehicle),strVehicles_TXT_UseOfVehicle,strVehicles_TXT_UseOfVehicle_FilterNeeded,strVehicles_TXT_UseOfVehicle, constants.NA, constants.NA,constants.NA,test);
				se.element().selectPopupWithMagnifier(getVehicles_TXT_UsageRadius(strVehicles_TXT_UsageRadius),getVehicles_TXT_UsageRadiusSearch(strVehicles_TXT_UsageRadius),strVehicles_TXT_UsageRadius,strVehicles_TXT_UsageRadius_FilterNeeded,strVehicles_TXT_UsageRadius, constants.NA, constants.NA,constants.NA,test);
				se.element().checkUncheckOrValidate(getVehicles_CHK_PowerUnit(strVehicles_CHK_PowerUnit),strVehicles_CHK_PowerUnit,test);
				se.element().selectPopupWithMagnifier(getVehicles_TXT_SpecialIndustryType(strVehicles_TXT_SpecialIndustryType),getVehicles_TXT_SpecialIndustryTypeSearch(strVehicles_TXT_SpecialIndustryType),strVehicles_TXT_SpecialIndustryType,strVehicles_TXT_SpecialIndustryType_FilterNeeded,strVehicles_TXT_SpecialIndustryType, constants.NA, constants.NA,constants.NA,test);
				se.element().selectPopupWithMagnifier(getVehicles_TXT_SpecialIndustryClass(strVehicles_TXT_SpecialIndustryClass),getVehicles_TXT_SpecialIndustryClassSearch(strVehicles_TXT_SpecialIndustryClass),strVehicles_TXT_SpecialIndustryClass,strVehicles_TXT_SpecialIndustryClass_FilterNeeded,strVehicles_TXT_SpecialIndustryClass, constants.NA, constants.NA,constants.NA,test);
				se.element().selectPopupWithMagnifier(getVehicles_TXT_SpecialtyUse(strVehicles_TXT_SpecialtyUse),getVehicles_TXT_SpecialtyUseSearch(strVehicles_TXT_SpecialtyUse),strVehicles_TXT_SpecialtyUse,strVehicles_TXT_SpecialtyUse_FilterNeeded,strVehicles_TXT_SpecialtyUse, constants.NA, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getVehicles_TXT_Farm_Seasonal_Usetype(strVehicles_TXT_Farm_Seasonal_Usetype),strVehicles_TXT_Farm_Seasonal_Usetype,test);
				
			}
		}
			se.element().enterOrValidateText(getVehicles_TXT_ClassificationCode(strVehicles_TXT_ClassificationCode),strVehicles_TXT_ClassificationCode,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_AmphibiousVehicle(strVehicles_CHK_AmphibiousVehicle),strVehicles_CHK_AmphibiousVehicle,test);
			se.element().enterOrValidateText(getVehicles_TXT_GrossVehicleWeight(strVehicles_TXT_GrossVehicleWeight),strVehicles_TXT_GrossVehicleWeight,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_IsThisVehicleHiredAuto(strVehicles_CHK_IsThisVehicleHiredAuto),strVehicles_CHK_IsThisVehicleHiredAuto,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_OwnedByAlliedOrSubsidiaryInterest(strVehicles_CHK_OwnedByAlliedOrSubsidiaryInterest),strVehicles_CHK_OwnedByAlliedOrSubsidiaryInterest,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_TransportationRange_Interstate(strVehicles_CHK_TransportationRange_Interstate),strVehicles_CHK_TransportationRange_Interstate,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_TransportationRange_Intrastate(strVehicles_CHK_TransportationRange_Intrastate),strVehicles_CHK_TransportationRange_Intrastate,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_usedinridesharingarr_Yes(strVehicles_CHK_usedinridesharingarr_Yes),strVehicles_CHK_usedinridesharingarr_Yes,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_usedinridesharingarr_No(strVehicles_CHK_usedinridesharingarr_No),strVehicles_CHK_usedinridesharingarr_No,test);
			se.element().enterOrValidateText(getVehicles_TXT_nearest_terminal(strVehicles_TXT_nearest_terminal),strVehicles_TXT_nearest_terminal,test);
			se.element().enterOrValidateText(getVehicles_TXT_nearest_terminal_desc(strVehicles_TXT_nearest_terminal_desc),strVehicles_TXT_nearest_terminal_desc,test);
			se.element().enterOrValidateText(getVehicles_TXT_farthest_terminal(strVehicles_TXT_farthest_terminal),strVehicles_TXT_farthest_terminal,test);
			se.element().enterOrValidateText(getVehicles_TXT_farthest_terminal_desc(strVehicles_TXT_farthest_terminal_desc),strVehicles_TXT_farthest_terminal_desc,test);
			se.element().enterOrValidateText(getVehicles_TXT_SeatingCapacity(strVehicles_TXT_SeatingCapacity),strVehicles_TXT_SeatingCapacity,test);
			se.element().checkUncheckOrValidate(getVehicles_CHK_DoesThisVehHaveAMechLift(strVehicles_CHK_DoesThisVehHaveAMechLift),strVehicles_CHK_DoesThisVehHaveAMechLift,test);
			
			
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for VehicleUsage Information", true, false, true, test);
			
		}
	}

public void NonPhysicalDamageCoverages(Map<String, String> row, ExtentTest test) throws IOException {
	try{
		String strVehicles_CHK_Liability = (String) row.get("Vehicles_CHK_Liability");
		String strVehicles_TXT_CombinedSingleLimit = (String) row.get("Vehicles_TXT_CombinedSingleLimit");
		String strVehicles_TXT_NonPhysicalDamageDeductible = (String) row.get("Vehicles_TXT_NonPhysicalDamageDeductible");
		String strVehicles_CHK_UsedToTransportMigrantFarmWorkers = (String) row.get("Vehicles_CHK_UsedToTransportMigrantFarmWorkers");
		String strVehicles_CHK_Personal_Injury_Protection = (String) row.get("Vehicles_CHK_Personal_Injury_Protection");
		String strVehicles_TXT_InsuredCoverageStatus = (String) row.get("Vehicles_TXT_InsuredCoverageStatus");
		String strVehicles_TXT_SpouseResidentCovStatus = (String) row.get("Vehicles_TXT_SpouseResidentCovStatus");
		String strVehicles_CHK_MedicalExpenseBenefits = (String) row.get("Vehicles_CHK_MedicalExpenseBenefits");
		String strVehicles_TXT_MedExpBenefits_Limit = (String) row.get("Vehicles_TXT_MedExpBenefits_Limit");
		String strVehicles_CHK_ExcludeMedicalExpenseBenefits = (String) row.get("Vehicles_CHK_ExcludeMedicalExpenseBenefits");
		String strVehicles_TXT_ExcessCoverage = (String) row.get("Vehicles_TXT_ExcessCoverage");
		String strVehicles_CHK_ExcessAttendantCare = (String) row.get("Vehicles_CHK_ExcessAttendantCare");
		String strVehicles_CHK_PropertyProtectionInsurance = (String) row.get("Vehicles_CHK_PropertyProtectionInsurance");
		String strVehicles_TXT_PropProtInsu_Deductible = (String) row.get("Vehicles_TXT_PropProtInsu_Deductible");
		String strVehicles_CHK_PropDamageLiabCovBuyback = (String) row.get("Vehicles_CHK_PropDamageLiabCovBuyback");
		String strVehicles_TXT_EachAccident = (String) row.get("Vehicles_TXT_EachAccident");
		String strVehicles_CHK_owner_operated = (String) row.get("Vehicles_CHK_owner_operated");
		String strVehicles_CHK__AdditionalPersonal = (String) row.get("Vehicles_CHK__Additional Personal");
		String strVehicles_TXT_TypeOfCoverage = (String) row.get("Vehicles_TXT_TypeOfCoverage");
		String strVehicles_TXT_SpecificUnitDeductible = (String) row.get("Vehicles_TXT_SpecificUnitDeductible");
		String strVehicles_TXT_SpecificUnitDeductible_FilterNeeded = (String) row.get("Vehicles_TXT_SpecificUnitDeductible_FilterNeeded");
		String strVehicles_CHK_IncludePassengerHazard = (String) row.get("Vehicles_CHK_IncludePassengerHazard");
		String strVehicles_CHK_MedicalPayments = (String) row.get("Vehicles_CHK_MedicalPayments");
		String strVehicles_TXT_LimitEachPerson = (String) row.get("Vehicles_TXT_LimitEachPerson");
		String strVehicles_CHK_ApplyExclusion = (String) row.get("Vehicles_CHK_ApplyExclusion");
		String strVehicles_TXT_Excess_Deductible = (String) row.get("Vehicles_TXT_Excess_Deductible");
		String strVehicles_CHK_FurnishedForRegularUse = (String) row.get("Vehicles_CHK_FurnishedForRegularUse");
		String strVehicles_TXT_Property_Protection_Insurance_Deductible = (String) row.get("Vehicles_TXT_Property_Protection_Insurance_Deductible");
		String strVehicles_TXT_BuyBack_EachIncident = (String) row.get("Vehicles_TXT_BuyBack_EachIncident");
		String strVehicles_CHK_UninsuredMotorist = (String) row.get("Vehicles_CHK_UninsuredMotorist");
		String strVehicles_TXT_UnInsuredCombinedSingleLimit = (String) row.get("Vehicles_TXT_UnInsuredCombinedSingleLimit");
		String strVehicles_CHK_UninsuredMotoristPD = (String) row.get("Vehicles_CHK_UninsuredMotoristPD");
		String strVehicles_TXT_UMPropertyDamageLimit = (String) row.get("Vehicles_TXT_UMPropertyDamageLimit");
		String strVehicles_TXT_UMPropertyDamageLimit_FilterNeeded = (String) row.get("Vehicles_TXT_UMPropertyDamageLimit_FilterNeeded");
		String strVehicles_TXT_UMPropertyDamageDed = (String) row.get("Vehicles_TXT_UMPropertyDamageDed");
		String strVehicles_CHK_UnderInsuredMotorist = (String) row.get("Vehicles_CHK_UnderInsuredMotorist");
		String strVehicles_TXT_CombinedLimit_UnderIns = (String) row.get("Vehicles_TXT_CombinedLimit_UnderIns");
		se.element().checkUncheckOrValidate(getVehicles_CHK_Liability(strVehicles_CHK_Liability),strVehicles_CHK_Liability,test);
		se.element().enterOrValidateText(getVehicles_TXT_CombinedSingleLimit(strVehicles_TXT_CombinedSingleLimit),strVehicles_TXT_CombinedSingleLimit,test);
		se.element().enterOrValidateText(getVehicles_TXT_NonPhysicalDamageDeductible(strVehicles_TXT_NonPhysicalDamageDeductible),strVehicles_TXT_NonPhysicalDamageDeductible,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_Personal_Injury_Protection(strVehicles_CHK_Personal_Injury_Protection),strVehicles_CHK_Personal_Injury_Protection,test);	
		se.element().enterOrValidateText(getVehicles_TXT_InsuredCoverageStatus(strVehicles_TXT_InsuredCoverageStatus),strVehicles_CHK_ExcludeMedicalExpenseBenefits,test);
		se.element().enterOrValidateText(getVehicles_TXT_SpouseResidentCovStatus(strVehicles_TXT_SpouseResidentCovStatus),strVehicles_TXT_SpouseResidentCovStatus,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_MedicalExpenseBenefits(strVehicles_CHK_MedicalExpenseBenefits),strVehicles_CHK_MedicalExpenseBenefits,test);
		se.element().enterOrValidateText(getVehicles_TXT_MedExpBenefits_Limit(strVehicles_TXT_MedExpBenefits_Limit),strVehicles_TXT_MedExpBenefits_Limit,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_ExcludeMedicalExpenseBenefits(strVehicles_CHK_ExcludeMedicalExpenseBenefits),strVehicles_CHK_ExcludeMedicalExpenseBenefits,test);
		se.element().enterOrValidateText(getVehicles_TXT_ExcessCoverage(strVehicles_TXT_ExcessCoverage),strVehicles_TXT_ExcessCoverage,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_ExcessAttendantCare(strVehicles_CHK_ExcessAttendantCare),strVehicles_CHK_ExcessAttendantCare,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_PropertyProtectionInsurance(strVehicles_CHK_PropertyProtectionInsurance),strVehicles_CHK_PropertyProtectionInsurance,test);
		se.element().enterOrValidateText(getVehicles_TXT_PropProtInsu_Deductible(strVehicles_TXT_PropProtInsu_Deductible),strVehicles_TXT_PropProtInsu_Deductible,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_PropDamageLiabCovBuyback(strVehicles_CHK_PropDamageLiabCovBuyback),strVehicles_CHK_PropDamageLiabCovBuyback,test);
		se.element().enterOrValidateText(getVehicles_TXT_EachAccident(strVehicles_TXT_EachAccident),strVehicles_TXT_EachAccident,test);
		
		se.element().checkUncheckOrValidate(getVehicles_CHK_owner_operated(strVehicles_CHK_owner_operated),strVehicles_CHK_owner_operated,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK__AdditionalPersonal(strVehicles_CHK__AdditionalPersonal),strVehicles_CHK__AdditionalPersonal,test);
		se.element().enterOrValidateText(getVehicles_TXT_TypeOfCoverage(strVehicles_TXT_TypeOfCoverage),strVehicles_TXT_TypeOfCoverage,test);
		se.element().selectPopupWithMagnifier(getVehicles_TXT_SpecificUnitDeductible(strVehicles_TXT_SpecificUnitDeductible),getVehicles_TXT_SpecificUnitDeductibleSearch(strVehicles_TXT_SpecificUnitDeductible),strVehicles_TXT_SpecificUnitDeductible,strVehicles_TXT_SpecificUnitDeductible_FilterNeeded,strVehicles_TXT_SpecificUnitDeductible, constants.NA, constants.NA,constants.NA,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_UsedToTransportMigrantFarmWorkers(strVehicles_CHK_UsedToTransportMigrantFarmWorkers),strVehicles_CHK_UsedToTransportMigrantFarmWorkers,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_IncludePassengerHazard(strVehicles_CHK_IncludePassengerHazard),strVehicles_CHK_IncludePassengerHazard,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_MedicalPayments(strVehicles_CHK_MedicalPayments),strVehicles_CHK_MedicalPayments,test);
		se.element().enterOrValidateText(getVehicles_TXT_LimitEachPerson(strVehicles_TXT_LimitEachPerson),strVehicles_TXT_LimitEachPerson,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_ApplyExclusion(strVehicles_CHK_ApplyExclusion),strVehicles_CHK_ApplyExclusion,test);
		se.element().enterOrValidateText(getVehicles_TXT_Excess_Deductible(strVehicles_TXT_Excess_Deductible),strVehicles_TXT_Excess_Deductible,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_FurnishedForRegularUse(strVehicles_CHK_FurnishedForRegularUse),strVehicles_CHK_FurnishedForRegularUse,test);
		se.element().enterOrValidateText(getVehicles_TXT_Property_Protection_Insurance_Deductible(strVehicles_TXT_Property_Protection_Insurance_Deductible),strVehicles_TXT_Property_Protection_Insurance_Deductible,test);
		se.element().enterOrValidateText(getVehicles_TXT_BuyBack_EachIncident(strVehicles_TXT_BuyBack_EachIncident),strVehicles_TXT_BuyBack_EachIncident,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_UninsuredMotorist(strVehicles_CHK_UninsuredMotorist),strVehicles_CHK_UninsuredMotorist,test);
		se.element().enterOrValidateText(getVehicles_TXT_UnInsuredCombinedSingleLimit(strVehicles_TXT_UnInsuredCombinedSingleLimit),strVehicles_TXT_UnInsuredCombinedSingleLimit,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_UninsuredMotoristPD(strVehicles_CHK_UninsuredMotoristPD),strVehicles_CHK_UninsuredMotoristPD,test);
		if(!strVehicles_TXT_UMPropertyDamageLimit.contains("validate2") && !strVehicles_TXT_UMPropertyDamageLimit.contains("N/A")){
			se.element().selectPopupWithMagnifier(getVehicles_TXT_UMPropertyDamageLimit(strVehicles_TXT_UMPropertyDamageLimit),getVehicles_TXT_UMPropertyDamageLimitSearch(strVehicles_TXT_UMPropertyDamageLimit),strVehicles_TXT_UMPropertyDamageLimit,strVehicles_TXT_UMPropertyDamageLimit_FilterNeeded,strVehicles_TXT_UMPropertyDamageLimit, constants.NA, constants.NA,constants.NA,test);
				
		}
			
		else
		se.element().enterOrValidateText(getVehicles_TXT_UMPropertyDamageLimit(strVehicles_TXT_UMPropertyDamageLimit),strVehicles_TXT_UMPropertyDamageLimit,test);
		se.element().enterOrValidateText(getVehicles_TXT_UMPropertyDamageDed(strVehicles_TXT_UMPropertyDamageDed),strVehicles_TXT_UMPropertyDamageDed,test);{}
		se.element().checkUncheckOrValidate(getVehicles_CHK_UnderInsuredMotorist(strVehicles_CHK_UnderInsuredMotorist),strVehicles_CHK_UnderInsuredMotorist,test);
		se.element().enterOrValidateText(getVehicles_TXT_CombinedLimit_UnderIns(strVehicles_TXT_CombinedLimit_UnderIns),strVehicles_TXT_CombinedLimit_UnderIns,test);

		
			
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for NonPhysicalDamageCoverages Information", true, false, true, test);
			
		}
	}
public void PhysicalDamageCoverages(Map<String, String> row, ExtentTest test) throws IOException {
	try{
		String strVehicles_CHK_OtherThanCollision = (String) row.get("Vehicles_CHK_OtherThanCollision");
		String strVehicles_TXT_PhysicalDamageCoverageType = (String) row.get("Vehicles_TXT_PhysicalDamageCoverageType");
		String strVehicles_TXT_PhysicalDamageCoverageType_FilterNeeded = (String) row.get("Vehicles_TXT_PhysicalDamageCoverageType_FilterNeeded");
		String strVehicles_TXT_AmountOfCoverage = (String) row.get("Vehicles_TXT_AmountOfCoverage");
		String strVehicles_TXT_PhysicalDamageDeductible = (String) row.get("Vehicles_TXT_PhysicalDamageDeductible");
		String strVehicles_TXT_PhysicalDamageDeductible_FilterNeeded = (String) row.get("Vehicles_TXT_PhysicalDamageDeductible_FilterNeeded");
		String strVehicles_CHK_FullGlassCoverageYes = (String) row.get("Vehicles_CHK_FullGlassCoverageYes");
		String strVehicles_CHK_FullGlassCoverageNo = (String) row.get("Vehicles_CHK_FullGlassCoverageNo");
		String strVehicles_CHK_Collision = (String) row.get("Vehicles_CHK_Collision");
		String strVehicles_CHK_ValueBasedContents = (String) row.get("Vehicles_CHK_ValueBasedContents");
		String strVehicles_TXT_CollisionDeductible = (String) row.get("Vehicles_TXT_CollisionDeductible");
		String strVehicles_TXT_CollisionDeductible_FilterNeeded = (String) row.get("Vehicles_TXT_CollisionDeductible_FilterNeeded");
		String strVehicles_TXT_org = (String) row.get("Vehicles_TXT_org");
		String strVehicles_TXT_Collision_Coverage = (String) row.get("Vehicles_TXT_Collision_Coverage");
		String strVehicles_CHK_ValuationMethod_ActualCashValue = (String) row.get("Vehicles_CHK_ValuationMethod_ActualCashValue");
		String strVehicles_CHK_ValuationMethod_StatedAmount = (String) row.get("Vehicles_CHK_ValuationMethod_StatedAmount");
		String strVehicles_TXT_Stated_Amount = (String) row.get("Vehicles_TXT_Stated_Amount");
		String strVehicles_CHK_RebuiltOrStructurallyAlteredAuto = (String) row.get("Vehicles_CHK_RebuiltOrStructurallyAlteredAuto");
		String strVehicles_TXT_chassis_year = (String) row.get("Vehicles_TXT_chassis_year");
		String strVehicles_TXT_OriginalCostNew = (String) row.get("Vehicles_TXT_OriginalCostNew");
		String strVehicles_CHK_AutoLoanLeaseGapCoverage = (String) row.get("Vehicles_CHK_AutoLoanLeaseGapCoverage");
		String strVehicles_CHK_RentalReimbursement = (String) row.get("Vehicles_CHK_RentalReimbursement");
		String strVehicles_TXT_NumberOfDays = (String) row.get("Vehicles_TXT_NumberOfDays");
		String strVehicles_TXT_MaximumAmountPerDay = (String) row.get("Vehicles_TXT_MaximumAmountPerDay");
		String strVehicles_TXT_MaximumAmountForAnyOnePeriod = (String) row.get("Vehicles_TXT_MaximumAmountForAnyOnePeriod");
		String strVehicles_CHK_AudioVisualAndDataEquipment = (String) row.get("Vehicles_CHK_AudioVisualAndDataEquipment");
		String strVehicles_TXT_Added_Limit = (String) row.get("Vehicles_TXT_Added_Limit");
		String strVehicles_TXT_Added_Limit_FilterNeeded = (String) row.get("Vehicles_TXT_Added_Limit_FilterNeeded");
		String strVehicles_CHK_TowingAndLabor = (String) row.get("Vehicles_CHK_TowingAndLabor");
		String strVehicles_TXT_TowingandLabourLimit = (String) row.get("Vehicles_TXT_TowingandLabourLimit");
		String strVehicles_TXT_TowingandLabourLimit_FilterNeeded = (String) row.get("Vehicles_TXT_TowingandLabourLimit_FilterNeeded");
		String strVehicles_CHK_TapesRecordsAndDiscs = (String) row.get("Vehicles_CHK_TapesRecordsAndDiscs");
		String strVehicles_TXT_LiabilityMiscellaneousVehicleFactor = (String) row.get("Vehicles_TXT_LiabilityMiscellaneousVehicleFactor");
		String strVehicles_TXT_PhysicalDamageMiscellaneousVehicleFactor = (String) row.get("Vehicles_TXT_PhysicalDamageMiscellaneousVehicleFactor");
		String strVehicles_CHK_BulkRate = (String) row.get("Vehicles_CHK_BulkRate");
		String strVehicles_CHK_VIN_Unknown_Table = (String) row.get("Vehicles_CHK_VIN_Unknown_Table");
		
		
		se.element().checkUncheckOrValidate(getVehicles_CHK_OtherThanCollision(strVehicles_CHK_OtherThanCollision),strVehicles_CHK_OtherThanCollision,test);
		se.element().selectPopupWithMagnifier(getVehicles_TXT_PhysicalDamageCoverageType(strVehicles_TXT_PhysicalDamageCoverageType),getVehicles_TXT_PhysicalDamageCoverageTypeSearch(strVehicles_TXT_PhysicalDamageCoverageType),strVehicles_TXT_PhysicalDamageCoverageType,strVehicles_TXT_PhysicalDamageCoverageType_FilterNeeded,strVehicles_TXT_PhysicalDamageCoverageType, constants.NA, constants.NA,constants.NA,test);
		se.element().enterOrValidateText(getVehicles_TXT_AmountOfCoverage(strVehicles_TXT_AmountOfCoverage),strVehicles_TXT_AmountOfCoverage,test);
		se.element().selectPopupWithMagnifier(getVehicles_TXT_PhysicalDamageDeductible(strVehicles_TXT_PhysicalDamageDeductible),getVehicles_TXT_PhysicalDamageDeductibleSearch(strVehicles_TXT_PhysicalDamageDeductible),strVehicles_TXT_PhysicalDamageDeductible,strVehicles_TXT_PhysicalDamageDeductible_FilterNeeded,strVehicles_TXT_PhysicalDamageDeductible, constants.NA, constants.NA,constants.NA,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_FullGlassCoverageYes(strVehicles_CHK_FullGlassCoverageYes),strVehicles_CHK_FullGlassCoverageYes,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_FullGlassCoverageNo(strVehicles_CHK_FullGlassCoverageNo),strVehicles_CHK_FullGlassCoverageNo,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_Collision(strVehicles_CHK_Collision),strVehicles_CHK_Collision,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_ValueBasedContents(strVehicles_CHK_ValueBasedContents),strVehicles_CHK_ValueBasedContents,test);
		se.element().selectPopupWithMagnifier(getVehicles_TXT_CollisionDeductible(strVehicles_TXT_CollisionDeductible),getVehicles_TXT_CollisionDeductibleSearch(strVehicles_TXT_CollisionDeductible),strVehicles_TXT_CollisionDeductible,strVehicles_TXT_CollisionDeductible_FilterNeeded,strVehicles_TXT_CollisionDeductible, constants.NA, constants.NA,constants.NA,test);
		se.element().enterOrValidateText(getVehicles_TXT_org(strVehicles_TXT_org),strVehicles_TXT_org,test);
		se.element().selectPopupWithMagnifier(getVehicles_TXT_Collision_Coverage(strVehicles_TXT_Collision_Coverage), getVehicles_TXT_Collision_CoverageSearch(strVehicles_TXT_Collision_Coverage), strVehicles_TXT_Collision_Coverage, constants.NA, strVehicles_TXT_Collision_Coverage, constants.NA, constants.NA, constants.NA, test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_ValuationMethod_ActualCashValue(strVehicles_CHK_ValuationMethod_ActualCashValue),strVehicles_CHK_ValuationMethod_ActualCashValue,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_ValuationMethod_StatedAmount(strVehicles_CHK_ValuationMethod_StatedAmount),strVehicles_CHK_ValuationMethod_StatedAmount,test);
		se.element().enterOrValidateText(getVehicles_TXT_Stated_Amount(strVehicles_TXT_Stated_Amount),strVehicles_TXT_Stated_Amount,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_RebuiltOrStructurallyAlteredAuto(strVehicles_CHK_RebuiltOrStructurallyAlteredAuto),strVehicles_CHK_RebuiltOrStructurallyAlteredAuto,test);
		se.element().enterOrValidateText(getVehicles_TXT_chassis_year(strVehicles_TXT_chassis_year),strVehicles_TXT_chassis_year,test);
		se.element().enterOrValidateText(getVehicles_TXT_OriginalCostNew(strVehicles_TXT_OriginalCostNew),strVehicles_TXT_OriginalCostNew,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_AutoLoanLeaseGapCoverage(strVehicles_CHK_AutoLoanLeaseGapCoverage),strVehicles_CHK_AutoLoanLeaseGapCoverage,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_RentalReimbursement(strVehicles_CHK_RentalReimbursement),strVehicles_CHK_RentalReimbursement,test);
		se.element().enterOrValidateText(getVehicles_TXT_NumberOfDays(strVehicles_TXT_NumberOfDays),strVehicles_TXT_NumberOfDays,test);
		se.element().enterOrValidateText(getVehicles_TXT_MaximumAmountPerDay(strVehicles_TXT_MaximumAmountPerDay),strVehicles_TXT_MaximumAmountPerDay,test);
		se.element().enterOrValidateText(getVehicles_TXT_MaximumAmountForAnyOnePeriod(strVehicles_TXT_MaximumAmountForAnyOnePeriod),strVehicles_TXT_MaximumAmountForAnyOnePeriod,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_AudioVisualAndDataEquipment(strVehicles_CHK_AudioVisualAndDataEquipment),strVehicles_CHK_AudioVisualAndDataEquipment,test);
		se.element().selectPopupWithMagnifier(getVehicles_TXT_Added_Limit(strVehicles_TXT_Added_Limit),getVehicles_TXT_Added_LimitSearch(strVehicles_TXT_Added_Limit),strVehicles_TXT_Added_Limit,strVehicles_TXT_Added_Limit_FilterNeeded,strVehicles_TXT_Added_Limit, constants.NA, constants.NA,constants.NA,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_TowingAndLabor(strVehicles_CHK_TowingAndLabor),strVehicles_CHK_TowingAndLabor,test);
		se.element().selectPopupWithMagnifier(getVehicles_TXT_TowingandLabourLimit(strVehicles_TXT_TowingandLabourLimit),getVehicles_TXT_TowingandLabourLimitSearch(strVehicles_TXT_TowingandLabourLimit),strVehicles_TXT_TowingandLabourLimit,strVehicles_TXT_TowingandLabourLimit_FilterNeeded,strVehicles_TXT_TowingandLabourLimit, constants.NA, constants.NA,constants.NA,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_TapesRecordsAndDiscs(strVehicles_CHK_TapesRecordsAndDiscs),strVehicles_CHK_TapesRecordsAndDiscs,test);
		se.element().enterOrValidateText(getVehicles_TXT_LiabilityMiscellaneousVehicleFactor(strVehicles_TXT_LiabilityMiscellaneousVehicleFactor),strVehicles_TXT_LiabilityMiscellaneousVehicleFactor,test);
		se.element().enterOrValidateText(getVehicles_TXT_PhysicalDamageMiscellaneousVehicleFactor(strVehicles_TXT_PhysicalDamageMiscellaneousVehicleFactor),strVehicles_TXT_PhysicalDamageMiscellaneousVehicleFactor,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_BulkRate(strVehicles_CHK_BulkRate),strVehicles_CHK_BulkRate,test);
		se.element().checkUncheckOrValidate(getVehicles_CHK_VIN_Unknown_Table(strVehicles_CHK_VIN_Unknown_Table),strVehicles_CHK_VIN_Unknown_Table,test);

		
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for PhysicalDamageCoverages Information", true, false, true, test);
			
		}
	}
}
