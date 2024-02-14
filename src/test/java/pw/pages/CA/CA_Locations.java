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

public class CA_Locations extends OR_CA{
	
	public void Locations(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		
	try{
		//String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(suspendSheet.equalsIgnoreCase("Locations")){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
			List<Map<String, String>> table = ExcelOperations.getPagesData("Locations", strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strLocations_BTN_CHKRow = (String) row.get("Locations_BTN_CHKRow");
				String strLocations_BTN_DEL = (String) row.get("Locations_BTN_DEL");
				String strLocations_BTN_Add = (String) row.get("Locations_BTN_Add");
				String strLocations_BTN_Done = (String) row.get("Locations_BTN_Done");
				String strLocations_BTN_Details = (String) row.get("Locations_BTN_Details");
				String strLocations_TXT_LocationNumber = (String) row.get("Locations_TXT_LocationNumber");
				String strLocations_CHK_CopyMailingAddress = (String) row.get("Locations_CHK_CopyMailingAddress");
				String strLocations_TXT_Name = (String) row.get("Locations_TXT_Name");
				String strLocations_CHK_MainLocation = (String) row.get("Locations_CHK_MainLocation");
				String strLocations_TXT_Description = (String) row.get("Locations_TXT_Description");
				String strLocations_TXT_LineStreet_1 = (String) row.get("Locations_TXT_LineStreet_1");
				String strLocations_TXT_LineStreet_2 = (String) row.get("Locations_TXT_LineStreet_2");
				String strLocations_TXT_City = (String) row.get("Locations_TXT_City");
				String strLocations_TXT_State = (String) row.get("Locations_TXT_State");
				String strLocations_TXT_StateFilterNeeded = (String) row.get("Locations_TXT_StateFilterNeeded");
				String strLocations_TXT_Zipcode = (String) row.get("Locations_TXT_Zipcode");
				//String strLocations_TXT_ZipcodeFilterNeeded = (String) row.get("Locations_TXT_ZipcodeFilterNeeded");
				String strLocations_TXT_SuggAddress = (String) row.get("Locations_TXT_SuggAddress");
				String strLocations_TXT_SuggAddressFilterNeeded = (String) row.get("Locations_TXT_SuggAddressFilterNeeded");
				String strLocations_CHK_KeepAddressasEntered = (String) row.get("Locations_CHK_KeepAddressasEntered");
				String strLocations_TXT_TerritoryCode = (String) row.get("Locations_TXT_TerritoryCode");
				String strLocations_TXT_TerritoryCodeFilterNeeded = (String) row.get("Locations_TXT_TerritoryCodeFilterNeeded");
				String strLocations_TXT_TerritoryOption = (String) row.get("Locations_TXT_TerritoryOption");
				String strLocations_TXT_TerritoryDesc = (String) row.get("Locations_TXT_TerritoryDesc");
				String strLocations_CHK_Interest_Tenant = (String) row.get("Locations_CHK_Interest_Tenant");
				String strLocations_CHK_Interest_Owner = (String) row.get("Locations_CHK_Interest_Owner");
				String strLocations_TXT_JurisDesc = (String) row.get("Locations_TXT_JurisDesc");
				String strLocations_TXT_FPDcode = (String) row.get("Locations_TXT_FPDcode");
				String strLocations_TXT_Fireprotectiondist = (String) row.get("Locations_TXT_Fireprotectiondist");
				String strLocations_CHK_DonotapplyCity = (String) row.get("Locations_CHK_DonotapplyCity");
				String strLocations_CHK_AllCityName = (String) row.get("Locations_CHK_AllCityName");
				String strLocations_TXT_KYCity = (String) row.get("Locations_TXT_KYCity");
				String strLocations_TXT_KYCityFilterNeeded = (String) row.get("Locations_TXT_KYCityFilterNeeded");
				String strLocations_TXT_KYCitycode = (String) row.get("Locations_TXT_KYCitycode");
				String strLocations_TXT_County = (String) row.get("Locations_TXT_County");
				String strLocations_TXT_CountyFilterNeeded = (String) row.get("Locations_TXT_CountyFilterNeeded");
				String strLocations_TXT_CountyCode = (String) row.get("Locations_TXT_CountyCode");
				String strLocations_TXT_Taxcode = (String) row.get("Locations_TXT_Taxcode");
				String strLocations_TXT_ClassIEmployeesRegularOperatorFullTime = (String) row.get("Locations_TXT_ClassIEmployeesRegularOperatorFullTime");
				String strLocations_TXT_ClassIEmployeesRegularOperatorPartTime = (String) row.get("Locations_TXT_ClassIEmployeesRegularOperatorPartTime");
				String strLocations_TXT_ClassIEmployeesAllOthersFullTime = (String) row.get("Locations_TXT_ClassIEmployeesAllOthersFullTime");
				String strLocations_TXT_ClassIEmployeesAllOthersPartTime = (String) row.get("Locations_TXT_ClassIEmployeesAllOthersPartTime");
				String strLocations_TXT_ClassIINonEmployeesUnderAge25 = (String) row.get("Locations_TXT_ClassIINonEmployeesUnderAge25");
				String strLocations_TXT_ClassIINonEmployeesAllOthers = (String) row.get("Locations_TXT_ClassIINonEmployeesAllOthers");
				String strLocations_TXT_DealerOrTransporterPlateCount = (String) row.get("Locations_TXT_DealerOrTransporterPlateCount");
				String strLocations_CHK_Locwithoutauto = (String) row.get("Locations_CHK_Locwithoutauto");
				String strLocations_CHK_Locwithauto = (String) row.get("Locations_CHK_Locwithauto");
				String strLocations_TXT_classification_code = (String) row.get("Locations_TXT_classification_code");
				String strLocations_CHK_1liability = (String) row.get("Locations_CHK_1liability");
				String strLocations_TXT_TortLimit = (String) row.get("Locations_TXT_TortLimit");
				String strLocations_TXT_TortLimitCode = (String) row.get("Locations_TXT_TortLimitCode");
				String strLocations_TXT_CombinedSingleLimit = (String) row.get("Locations_TXT_CombinedSingleLimit");
				String strLocations_TXT_ProductsAndWorkYouPerformedAggregateLimit = (String) row.get("Locations_TXT_ProductsAndWorkYouPerformedAggregateLimit");
				String strLocations_TXT_ProductsAndWorkYouPerformedOtherAggregateLimit = (String) row.get("Locations_TXT_ProductsAndWorkYouPerformedOtherAggregateLimit");
				String strLocations_TXT_GeneralLiabilityAggregateLimit = (String) row.get("Locations_TXT_GeneralLiabilityAggregateLimit");
				String strLocations_TXT_GeneralLiabilityOtherAggregateLimit = (String) row.get("Locations_TXT_GeneralLiabilityOtherAggregateLimit");
				String strLocations_TXT_Deductible = (String) row.get("Locations_TXT_Deductible");
				String strLocations_CHK_LocationDeductibleTypeCombinedSingleLimit = (String) row.get("Locations_CHK_LocationDeductibleTypeCombinedSingleLimit");
				String strLocations_CHK_LocationDeductibleTypePropertyDmgperAccDed = (String) row.get("Locations_CHK_LocationDeductibleTypePropertyDmgperAccDed");
				String strLocations_CHK_PersonalInjuryProtection = (String) row.get("Locations_CHK_PersonalInjuryProtection");
				String strLocations_CHK_CoverageSelectionBuyBackPIP = (String) row.get("Locations_CHK_CoverageSelectionBuyBackPIP");
				String strLocations_CHK_CoverageSelectionGuestPedestrianPIP = (String) row.get("Locations_CHK_CoverageSelectionGuestPedestrianPIP");
				String strLocations_CHK_AdditionalPersonalInjuryProtection = (String) row.get("Locations_CHK_AdditionalPersonalInjuryProtection");
				String strLocations_CHK_AddPIPOptionNumber = (String) row.get("Locations_CHK_AddPIPOptionNumber");
				String strLocations_CHK_AddPIPMaximumLimit = (String) row.get("Locations_CHK_AddPIPMaximumLimit");
				String strLocations_CHK_AddPIPTotalWeeklyMaxWorkLoss = (String) row.get("Locations_CHK_AddPIPTotalWeeklyMaxWorkLoss");
				String strLocations_CHK_AddPIPFuneralExpenses = (String) row.get("Locations_CHK_AddPIPFuneralExpenses");
				String strLocations_CHK_MedicalPayments = (String) row.get("Locations_CHK_MedicalPayments");
				String strLocations_TXT_LOLimitEachPerson = (String) row.get("Locations_TXT_LOLimitEachPerson");
				String strLocations_CHK_MedicalPayments_Auto = (String) row.get("Locations_CHK_MedicalPayments_Auto");
				String strLocations_TXT_AutoLimitEachPerson = (String) row.get("Locations_TXT_AutoLimitEachPerson");
				String strLocations_CHK_UninsuredMotorist = (String) row.get("Locations_CHK_UninsuredMotorist");
				String strLocations_TXT_UninsuredMotoristCombinedSingleLimit = (String) row.get("Locations_TXT_UninsuredMotoristCombinedSingleLimit");
				String strLocations_CHK_UninsuredMotoristPD = (String) row.get("Locations_CHK_UninsuredMotoristPD");
				String strLocations_CHK_UnderInsuredMotorist = (String) row.get("Locations_CHK_UnderInsuredMotorist");
				String strLocations_TXT_UnderInsuredMotoristCombinedSingleLimit = (String) row.get("Locations_TXT_UnderInsuredMotoristCombinedSingleLimit");
				String strLocations_CHK_OtherThanCollision = (String) row.get("Locations_CHK_OtherThanCollision");
				String strLocations_BTN_OtherThanCollisionAdd = (String) row.get("Locations_BTN_OtherThanCollisionAdd");
				String strLocations_TXT_LossTypeFilterNeeded = (String) row.get("Locations_TXT_LossTypeFilterNeeded");
				String strLocations_TXT_LossType = (String) row.get("Locations_TXT_LossType");
				String strLocations_TXT_TypeOfPropertyFilterNeeded = (String) row.get("Locations_TXT_TypeOfPropertyFilterNeeded");
				String strLocations_TXT_TypeOfProperty = (String) row.get("Locations_TXT_TypeOfProperty");
				String strLocations_CHK_IsAllPerilsDeductible = (String) row.get("Locations_CHK_IsAllPerilsDeductible");
				String strLocations_TXT_Value = (String) row.get("Locations_TXT_Value");
				String strLocations_TXT_DeductiblePerCarFilterNeeded = (String) row.get("Locations_TXT_DeductiblePerCarFilterNeeded");
				String strLocations_TXT_DeductiblePerCar = (String) row.get("Locations_TXT_DeductiblePerCar");
				String strLocations_TXT_DeductiblePerOccurrencePopup = (String) row.get("Locations_TXT_DeductiblePerOccurrencePopup");
				String strLocations_TXT_DeductiblePerOccurrencePopupFilterNeeded = (String) row.get("Locations_TXT_DeductiblePerOccurrencePopupFilterNeeded");
				String strLocations_TXT_DeductiblePerOccurrence = (String) row.get("Locations_TXT_DeductiblePerOccurrence");
				String strLocations_TXT_DeductiblePerOccurrenceFilterNeeded = (String) row.get("Locations_TXT_DeductiblePerOccurrenceFilterNeeded");
				String strLocations_TXT_WindHailDeductibleEachCoveredAutoFilterNeeded = (String) row.get("Locations_TXT_WindHailDeductibleEachCoveredAutoFilterNeeded");
				String strLocations_TXT_WindHailDeductibleEachCoveredAuto = (String) row.get("Locations_TXT_WindHailDeductibleEachCoveredAuto");
				String strLocations_TXT_WindHailDeductibleAnyOneEvent_Option = (String) row.get("Locations_TXT_WindHailDeductibleAnyOneEvent_Option");
				String strLocations_TXT_WindHailDeductibleAnyOneEvent = (String) row.get("Locations_TXT_WindHailDeductibleAnyOneEvent");
				String strLocations_CHK_IsFalsePretenseCoverage = (String) row.get("Locations_CHK_IsFalsePretenseCoverage");
				String strLocations_TXT_LimitFilterNeeded = (String) row.get("Locations_TXT_LimitFilterNeeded");
				String strLocations_TXT_Limit = (String) row.get("Locations_TXT_Limit");
				String strLocations_TXT_TotalInventoryValue = (String) row.get("Locations_TXT_TotalInventoryValue");
				String strLocations_CHK_OwnerPremises = (String) row.get("Locations_CHK_OwnerPremises");
				String strLocations_TXT_NameOfPerson = (String) row.get("Locations_TXT_NameOfPerson");
				String strLocations_TXT_AutoDealerCollisionLimit = (String) row.get("Locations_TXT_AutoDealerCollisionLimit");
				String strLocations_TXT_RepossessedAutoDealerCollisionTotalValues = (String) row.get("Locations_TXT_RepossessedAutoDealerCollisionTotalValues");
				String strLocations_TXT_AutoDealerCollisionCoverageFilterNeeded = (String) row.get("Locations_TXT_AutoDealerCollisionCoverageFilterNeeded");
				String strLocations_TXT_AutoDealerCollisionCoverage = (String) row.get("Locations_TXT_AutoDealerCollisionCoverage");
				
				try{
				se.log().logTestStep("CA_Locations");
				
				test.log(LogStatus.INFO, "CA_Locations page","Transaction Step : "+transaction + "<br>" +"Page : CP_Locations");
				se.verify().verifyEquals("CA_Locations of PowerWriter ", getLocations_LBL_Locations().isDisplayed(),true, true,test);
				
				if(!strLocations_BTN_Add.equals(constants.NA)){
					se.element().Click(getLocations_BTN_Add(strLocations_BTN_Add),strLocations_BTN_Add,test);
				}
				
				if(!strLocations_BTN_Details.equals(constants.NA)){
					se.element().Click(getLocations_BTN_Details(strLocations_BTN_Details),strLocations_BTN_Details,test);
				}
				
				 if(!strLocations_BTN_DEL.equals(constants.NA)){
					    se.element().checkUncheckOrValidate(getLocations_BTN_CHKRow(strLocations_BTN_CHKRow),"Check",test);
						se.element().Click(getLocations_BTN_DEL(strLocations_BTN_DEL),strLocations_BTN_DEL,test);
					}
				
				se.element().selectElementDDrOrValidateText(getLocations_BTN_CHKRow(strLocations_BTN_CHKRow),strLocations_BTN_CHKRow,test);
				se.element().enterOrValidateText(getLocations_TXT_LocationNumber(strLocations_TXT_LocationNumber),strLocations_TXT_LocationNumber,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_CopyMailingAddress(strLocations_CHK_CopyMailingAddress),strLocations_CHK_CopyMailingAddress,test);
				se.element().enterOrValidateText(getLocations_TXT_Name(strLocations_TXT_Name),strLocations_TXT_Name,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_MainLocation(strLocations_CHK_MainLocation),strLocations_CHK_MainLocation,test);
				se.element().enterOrValidateText(getLocations_TXT_Description(strLocations_TXT_Description),strLocations_TXT_Description,test);
				se.element().enterOrValidateText(getLocations_TXT_LineStreet_1(strLocations_TXT_LineStreet_1),strLocations_TXT_LineStreet_1,test);
				se.element().enterOrValidateText(getLocations_TXT_LineStreet_2(strLocations_TXT_LineStreet_2),strLocations_TXT_LineStreet_2,test);
				se.element().enterOrValidateText(getLocations_TXT_City(strLocations_TXT_City),strLocations_TXT_City,test);
				se.element().selectPopupWithMagnifier(getLocations_TXT_State(strLocations_TXT_State),getLocations_TXT_StateSearch(strLocations_TXT_State),strLocations_TXT_State,strLocations_TXT_StateFilterNeeded,strLocations_TXT_State, constants.NA, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getLocations_TXT_Zipcode(strLocations_TXT_Zipcode),strLocations_TXT_Zipcode,test);
				//se.element().selectPopupWithMagnifier(getLocations_TXT_Zipcode(strLocations_TXT_Zipcode),getLocations_TXT_ZipcodeSearch(strLocations_TXT_Zipcode),strLocations_TXT_Zipcode,strLocations_TXT_ZipcodeFilterNeeded,strLocations_TXT_Zipcode, constants.NA, constants.NA,constants.NA,test);
				se.element().selectPopupWithMagnifier(getLocations_TXT_SuggAddress(strLocations_TXT_SuggAddress),getLocations_TXT_SuggAddressSearch(strLocations_TXT_SuggAddress),strLocations_TXT_SuggAddress,strLocations_TXT_SuggAddressFilterNeeded,strLocations_TXT_SuggAddress, constants.NA, constants.NA,constants.NA,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_KeepAddressasEntered(strLocations_CHK_KeepAddressasEntered),strLocations_CHK_KeepAddressasEntered,test);
				se.element().selectPopupWithMagnifier(getLocations_TXT_TerritoryCode(strLocations_TXT_TerritoryCode),getLocations_TXT_TerritoryCodeSearch(strLocations_TXT_TerritoryCode),strLocations_TXT_TerritoryCode,strLocations_TXT_TerritoryCodeFilterNeeded,strLocations_TXT_TerritoryCode, constants.NA, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getLocations_TXT_TerritoryDesc(strLocations_TXT_TerritoryDesc),strLocations_TXT_TerritoryDesc,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_Interest_Tenant(strLocations_CHK_Interest_Tenant),strLocations_CHK_Interest_Tenant,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_Interest_Owner(strLocations_CHK_Interest_Owner),strLocations_CHK_Interest_Owner,test);
				se.element().enterOrValidateText(getLocations_TXT_JurisDesc(strLocations_TXT_JurisDesc),strLocations_TXT_JurisDesc,test);
				se.element().enterOrValidateText(getLocations_TXT_FPDcode(strLocations_TXT_FPDcode),strLocations_TXT_FPDcode,test);
				se.element().enterOrValidateText(getLocations_TXT_Fireprotectiondist(strLocations_TXT_Fireprotectiondist),strLocations_TXT_Fireprotectiondist,test);
				
				//Ky Tax info
				se.element().checkUncheckOrValidate(getLocations_CHK_DonotapplyCity(strLocations_CHK_DonotapplyCity),strLocations_CHK_DonotapplyCity,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_AllCityName(strLocations_CHK_AllCityName),strLocations_CHK_AllCityName,test);
				se.element().selectPopupWithMagnifier(getLocations_TXT_KYCity(strLocations_TXT_KYCity), getLocations_TXT_KYCitySearch(strLocations_TXT_KYCity), strLocations_TXT_KYCity, strLocations_TXT_KYCityFilterNeeded, strLocations_TXT_KYCity, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getLocations_TXT_Citycode(strLocations_TXT_KYCitycode),strLocations_TXT_KYCitycode,test);
				se.element().selectPopupWithMagnifier(getLocations_TXT_County(strLocations_TXT_County), getLocations_TXT_CountySearch(strLocations_TXT_County), strLocations_TXT_County, strLocations_TXT_CountyFilterNeeded, strLocations_TXT_County, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getLocations_TXT_CountyCode(strLocations_TXT_CountyCode),strLocations_TXT_CountyCode,test);
				se.element().enterOrValidateText(getLocations_TXT_Taxcode(strLocations_TXT_Taxcode),strLocations_TXT_Taxcode,test);
				
				//Auto Dealers Operators Details
				se.element().enterOrValidateText(getLocations_TXT_ClassIEmployeesRegularOperatorFullTime(strLocations_TXT_ClassIEmployeesRegularOperatorFullTime),strLocations_TXT_ClassIEmployeesRegularOperatorFullTime,test);
				se.element().enterOrValidateText(getLocations_TXT_ClassIEmployeesRegularOperatorPartTime(strLocations_TXT_ClassIEmployeesRegularOperatorPartTime),strLocations_TXT_ClassIEmployeesRegularOperatorPartTime,test);
				se.element().enterOrValidateText(getLocations_TXT_ClassIEmployeesAllOthersFullTime(strLocations_TXT_ClassIEmployeesAllOthersFullTime),strLocations_TXT_ClassIEmployeesAllOthersFullTime,test);
				se.element().enterOrValidateText(getLocations_TXT_ClassIEmployeesAllOthersPartTime(strLocations_TXT_ClassIEmployeesAllOthersPartTime),strLocations_TXT_ClassIEmployeesAllOthersPartTime,test);
				se.element().enterOrValidateText(getLocations_TXT_ClassIINonEmployeesUnderAge25(strLocations_TXT_ClassIINonEmployeesUnderAge25),strLocations_TXT_ClassIINonEmployeesUnderAge25,test);
				se.element().enterOrValidateText(getLocations_TXT_ClassIINonEmployeesAllOthers(strLocations_TXT_ClassIINonEmployeesAllOthers),strLocations_TXT_ClassIINonEmployeesAllOthers,test);
				
				//location coverage Details
				se.element().enterOrValidateText(getLocations_TXT_DealerOrTransporterPlateCount(strLocations_TXT_DealerOrTransporterPlateCount),strLocations_TXT_DealerOrTransporterPlateCount,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_Locwithoutauto(strLocations_CHK_Locwithoutauto),strLocations_CHK_Locwithoutauto,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_Locwithauto(strLocations_CHK_Locwithauto),strLocations_CHK_Locwithauto,test);
				se.element().enterOrValidateText(getLocations_TXT_classification_code(strLocations_TXT_classification_code),strLocations_TXT_classification_code,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_1liability(strLocations_CHK_1liability),strLocations_CHK_1liability,test);
				se.element().enterOrValidateText(getLocations_TXT_TortLimit(strLocations_TXT_TortLimit),strLocations_TXT_TortLimit,test);
				se.element().enterOrValidateText(getLocations_TXT_TortLimitCode(strLocations_TXT_TortLimitCode),strLocations_TXT_TortLimitCode,test);
				se.element().enterOrValidateText(getLocations_TXT_CombinedSingleLimit(strLocations_TXT_CombinedSingleLimit),strLocations_TXT_CombinedSingleLimit,test);
				se.element().enterOrValidateText(getLocations_TXT_ProductsAndWorkYouPerformedAggregateLimit(strLocations_TXT_ProductsAndWorkYouPerformedAggregateLimit),strLocations_TXT_ProductsAndWorkYouPerformedAggregateLimit,test);
				se.element().enterOrValidateText(getLocations_TXT_ProductsAndWorkYouPerformedOtherAggregateLimit(strLocations_TXT_ProductsAndWorkYouPerformedOtherAggregateLimit),strLocations_TXT_ProductsAndWorkYouPerformedOtherAggregateLimit,test);
				se.element().enterOrValidateText(getLocations_TXT_GeneralLiabilityAggregateLimit(strLocations_TXT_GeneralLiabilityAggregateLimit),strLocations_TXT_GeneralLiabilityAggregateLimit,test);
				se.element().enterOrValidateText(getLocations_TXT_GeneralLiabilityOtherAggregateLimit(strLocations_TXT_GeneralLiabilityOtherAggregateLimit),strLocations_TXT_GeneralLiabilityOtherAggregateLimit,test);
				se.element().enterOrValidateText(getLocations_TXT_Deductible(strLocations_TXT_Deductible),strLocations_TXT_Deductible,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_LocationDeductibleTypeCombinedSingleLimit(strLocations_CHK_LocationDeductibleTypeCombinedSingleLimit),strLocations_CHK_LocationDeductibleTypeCombinedSingleLimit,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_LocationDeductibleTypePropertyDmgperAccDed(strLocations_CHK_LocationDeductibleTypePropertyDmgperAccDed),strLocations_CHK_LocationDeductibleTypePropertyDmgperAccDed,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_PersonalInjuryProtection(strLocations_CHK_PersonalInjuryProtection),strLocations_CHK_PersonalInjuryProtection,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_CoverageSelectionBuyBackPIP(strLocations_CHK_CoverageSelectionBuyBackPIP),strLocations_CHK_CoverageSelectionBuyBackPIP,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_CoverageSelectionGustPedestrianPIP(strLocations_CHK_CoverageSelectionGuestPedestrianPIP),strLocations_CHK_CoverageSelectionGuestPedestrianPIP,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_AdditionalPersonalInjuryProtection(strLocations_CHK_AdditionalPersonalInjuryProtection),strLocations_CHK_AdditionalPersonalInjuryProtection,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_AddPIPOptionNumber(strLocations_CHK_AddPIPOptionNumber),strLocations_CHK_AddPIPOptionNumber,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_AddPIPMaximumLimit(strLocations_CHK_AddPIPMaximumLimit),strLocations_CHK_AddPIPMaximumLimit,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_AddPIPTotalWeeklyMaxWorkLoss(strLocations_CHK_AddPIPTotalWeeklyMaxWorkLoss),strLocations_CHK_AddPIPTotalWeeklyMaxWorkLoss,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_AddPIPFuneralExpenses(strLocations_CHK_AddPIPFuneralExpenses),strLocations_CHK_AddPIPFuneralExpenses,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_MedicalPayments(strLocations_CHK_MedicalPayments),strLocations_CHK_MedicalPayments,test);
				se.element().enterOrValidateText(getLocations_TXT_LOLimitEachPerson(strLocations_TXT_LOLimitEachPerson),strLocations_TXT_LOLimitEachPerson,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_MedicalPayments_Auto(strLocations_CHK_MedicalPayments_Auto),strLocations_CHK_MedicalPayments_Auto,test);
				se.element().enterOrValidateText(getLocations_TXT_AutoLimitEachPerson(strLocations_TXT_AutoLimitEachPerson),strLocations_TXT_AutoLimitEachPerson,test);
				//se.element().enterOrValidateText(getLocations_TXT_limit_each_person_Medical_Payments_Auto(strLocations_TXT_limit_each_person_Medical_Payments_Auto),strLocations_TXT_limit_each_person_Medical_Payments_Auto,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_UninsuredMotorist(strLocations_CHK_UninsuredMotorist),strLocations_CHK_UninsuredMotorist,test);
				se.element().enterOrValidateText(getLocations_TXT_UninsuredMotoristCombinedSingleLimit(strLocations_TXT_UninsuredMotoristCombinedSingleLimit),strLocations_TXT_UninsuredMotoristCombinedSingleLimit,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_UninsuredMotoristPD(strLocations_CHK_UninsuredMotoristPD),strLocations_CHK_UninsuredMotoristPD,test);
				
				//Physical Damage Coverages
				se.element().checkUncheckOrValidate(getLocations_CHK_OtherThanCollision(strLocations_CHK_OtherThanCollision),strLocations_CHK_OtherThanCollision,test);
				if(!strLocations_CHK_OtherThanCollision.equals(constants.NA) && strLocations_BTN_OtherThanCollisionAdd.equals("Yes")) {
				se.element().Click(getLocations_BTN_OtherThanCollisionAdd(strLocations_BTN_OtherThanCollisionAdd),strLocations_BTN_OtherThanCollisionAdd,test);
				se.element().selectPopupWithMagnifier(getLocations_TXT_LossType(strLocations_TXT_LossType),getLocations_TXT_LossTypeSearch(strLocations_TXT_LossType),strLocations_TXT_LossType,strLocations_TXT_LossTypeFilterNeeded,strLocations_TXT_LossType, constants.NA, constants.NA,constants.NA,test);
				se.element().selectPopupWithMagnifier(getLocations_TXT_TypeOfProperty(strLocations_TXT_TypeOfProperty),getLocations_TXT_TypeOfPropertySearch(strLocations_TXT_TypeOfProperty),strLocations_TXT_TypeOfProperty,strLocations_TXT_TypeOfPropertyFilterNeeded,strLocations_TXT_TypeOfProperty, constants.NA, constants.NA,constants.NA,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_IsAllPerilsDeductible(strLocations_CHK_IsAllPerilsDeductible),strLocations_CHK_IsAllPerilsDeductible,test);
				se.element().enterOrValidateText(getLocations_TXT_Value(strLocations_TXT_Value),strLocations_TXT_Value,test);
				se.element().selectPopupWithMagnifier(getLocations_TXT_DeductiblePerCar(strLocations_TXT_DeductiblePerCar),getLocations_TXT_DeductiblePerCarSearch(strLocations_TXT_DeductiblePerCar),strLocations_TXT_DeductiblePerCar,strLocations_TXT_DeductiblePerCarFilterNeeded,strLocations_TXT_DeductiblePerCar, strLocations_TXT_DeductiblePerOccurrencePopup, constants.NA,constants.NA,test);
				se.element().selectPopupWithMagnifier(getLocations_TXT_DeductiblePerOccurrence(strLocations_TXT_DeductiblePerOccurrence),getLocations_TXT_DeductiblePerOccurrenceSearch(strLocations_TXT_DeductiblePerOccurrence),strLocations_TXT_DeductiblePerOccurrence,strLocations_TXT_DeductiblePerOccurrenceFilterNeeded,strLocations_TXT_DeductiblePerOccurrence, strLocations_TXT_WindHailDeductibleAnyOneEvent_Option, constants.NA,constants.NA,test);
				se.element().selectPopupWithMagnifier(getLocations_TXT_WindHailDeductibleEachCoveredAuto(strLocations_TXT_WindHailDeductibleEachCoveredAuto),getLocations_TXT_WindHailDeductibleEachCoveredAutoSearch(strLocations_TXT_WindHailDeductibleEachCoveredAuto),strLocations_TXT_WindHailDeductibleEachCoveredAuto,strLocations_TXT_WindHailDeductibleEachCoveredAutoFilterNeeded,strLocations_TXT_WindHailDeductibleEachCoveredAuto, strLocations_TXT_WindHailDeductibleAnyOneEvent_Option, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getLocations_TXT_WindHailDeductibleAnyOneEvent(strLocations_TXT_WindHailDeductibleAnyOneEvent),strLocations_TXT_WindHailDeductibleAnyOneEvent,test);
				}
				else if(!strLocations_CHK_OtherThanCollision.equals("Check") && strLocations_BTN_OtherThanCollisionAdd.equals(constants.NA))
				{
					se.element().enterOrValidateText(getLocations_TXT_Value(strLocations_TXT_Value),strLocations_TXT_Value,test);
				}
				
				//Additional provisions
				se.element().checkUncheckOrValidate(getLocations_CHK_IsFalsePretenseCoverage(strLocations_CHK_IsFalsePretenseCoverage),strLocations_CHK_IsFalsePretenseCoverage,test);
				se.element().selectPopupWithMagnifier(getLocations_TXT_Limit(strLocations_TXT_Limit),getLocations_TXT_LimitSearch(strLocations_TXT_Limit),strLocations_TXT_Limit,strLocations_TXT_LimitFilterNeeded,strLocations_TXT_Limit, constants.NA, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getLocations_TXT_TotalInventoryValue(strLocations_TXT_TotalInventoryValue),strLocations_TXT_TotalInventoryValue,test);
				se.element().checkUncheckOrValidate(getLocations_CHK_OwnerPremises(strLocations_CHK_OwnerPremises),strLocations_CHK_OwnerPremises,test);
				se.element().enterOrValidateText(getLocations_TXT_NameOfPerson(strLocations_TXT_NameOfPerson),strLocations_TXT_NameOfPerson,test);
				se.element().enterOrValidateText(getLocations_TXT_AutoDealerCollisionLimit(strLocations_TXT_AutoDealerCollisionLimit),strLocations_TXT_AutoDealerCollisionLimit,test);
				se.element().enterOrValidateText(getLocations_TXT_RepossessedAutoDealerCollisionTotalValues(strLocations_TXT_RepossessedAutoDealerCollisionTotalValues),strLocations_TXT_RepossessedAutoDealerCollisionTotalValues,test);
				
				//Blanket Collision Coverage
				se.element().selectPopupWithMagnifier(getLocations_TXT_AutoDealerCollisionCoverage(strLocations_TXT_AutoDealerCollisionCoverage),getLocations_TXT_AutoDealerCollisionCoverageSearch(strLocations_TXT_AutoDealerCollisionCoverage),strLocations_TXT_AutoDealerCollisionCoverage,strLocations_TXT_AutoDealerCollisionCoverageFilterNeeded,strLocations_TXT_AutoDealerCollisionCoverage, constants.NA, constants.NA,constants.NA,test);
				se.element().clickElement(getNext());	
				

					/*
					 * if(!strLocations_BTN_Done.equals(constants.NA)){
					 * se.element().Click(getLocations_BTN_Done(strLocations_BTN_Done),
					 * strLocations_BTN_Done,test); }
					 */
				
				 if(strLocations_BTN_Done.equalsIgnoreCase("Yes")){
						se.element().Click(getDone(),test);
					}
				
			}
				
			catch(Exception e) {
				
				se.verify().verifyEquals("Failed to fill in details for CA_Locations", true, false,true, test);		
			}
			iteration++;
		
}
}
	catch (Exception e) {
		// TODO: handle exception
		se.log().logTestStep(						
				"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
		test.log(LogStatus.FAIL, "Failed",
				"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
		testTearDown(se, test);
	}
	}
}
		



