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

public class CP_SpecialClassCoverage extends OR_CP{
	
	public void SpecialClassCoverage(String strRegressionID, String transaction, String buildingName,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_SpecialClassCoverage")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_SpecialClassCoverage", strRegressionID,buildingName, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

		String strCP_SpecClassCov_BTN_ADD = (String) row.get("CP_SpecClassCov_BTN_ADD");
		String strCP_SpecClassCov_BTN_Details = (String) row.get("CP_SpecClassCov_BTN_Details");
		String strCP_SpecClassCov_BTN_Done = (String) row.get("CP_SpecClassCov_BTN_Done");
		String strCP_SpecClassCov_TXT_PolicyType = (String) row.get("CP_SpecClassCov_TXT_PolicyType");
		String strCP_SpecClassCov_TXT_SpecialClassDescription = (String) row.get("CP_SpecClassCov_TXT_SpecialClassDescription");
		String strCP_SpecClassCov_TXT_SpecialClassDescriptionSearchField = (String) row.get("CP_SpecClassCov_TXT_SpecialClassDescriptionSearchField");
		String strCP_SpecClassCov_TXT_SpecialItemNumber = (String) row.get("CP_SpecClassCov_TXT_SpecialItemNumber");
		String strCP_SpecClassCov_TXT_SpecialClassGroupIISymbol = (String) row.get("CP_SpecClassCov_TXT_SpecialClassGroupIISymbol");
		String strCP_SpecClassCov_TXT_SpecialClassGroupIISymbolDescription = (String) row.get("CP_SpecClassCov_TXT_SpecialClassGroupIISymbolDescription");
		String strCP_SpecClassCov_TXT_ClassCode = (String) row.get("CP_SpecClassCov_TXT_ClassCode");
		String strCP_SpecClassCov_TXT_CoverageType = (String) row.get("CP_SpecClassCov_TXT_CoverageType");
		String strCP_SpecClassCov_TXT_ProtectionClass = (String) row.get("CP_SpecClassCov_TXT_ProtectionClass");
		String strCP_SpecClassCov_TXT_RatePlan = (String) row.get("CP_SpecClassCov_TXT_RatePlan");
		String strCP_SpecClassCov_TXT_RatePlanDescription = (String) row.get("CP_SpecClassCov_TXT_RatePlanDescription");
		String strCP_SpecClassCov_TXT_Deductible = (String) row.get("CP_SpecClassCov_TXT_Deductible");
		String strCP_SpecClassCov_TXT_AmountOfInsurance = (String) row.get("CP_SpecClassCov_TXT_AmountOfInsurance");
		String strCP_SpecClassCov_CHK_WindAndHailDeductible = (String) row.get("CP_SpecClassCov_CHK_WindAndHailDeductible");
		String strCP_SpecClassCov_CHK_WindAndHailDeductibleTypeAmount = (String) row.get("CP_SpecClassCov_CHK_WindAndHailDeductibleTypeAmount");
		String strCP_SpecClassCov_CHK_WindAndHailDeductibleTypePercent = (String) row.get("CP_SpecClassCov_CHK_WindAndHailDeductibleTypePercent");
		String strCP_SpecClassCov_TXT_WindAndHailDeductibleAmount = (String) row.get("CP_SpecClassCov_TXT_WindAndHailDeductibleAmount");
		String strCP_SpecClassCov_TXT_WindAndHailDeductiblePercent = (String) row.get("CP_SpecClassCov_TXT_WindAndHailDeductiblePercent");
		String strCP_SpecClassCov_TXT_Coinsurance = (String) row.get("CP_SpecClassCov_TXT_Coinsurance");
		String strCP_SpecClassCov_TXT_CauseOfLoss = (String) row.get("CP_SpecClassCov_TXT_CauseOfLoss");
		String strCP_SpecClassCov_CHK_SameasBuilding = (String) row.get("CP_SpecClassCov_CHK_SameasBuilding");
		String strCP_SpecClassCov_CHK_ExcludeVandalism = (String) row.get("CP_SpecClassCov_CHK_ExcludeVandalism");
		String strCP_SpecClassCov_CHK_ExcludeWindstormandHail = (String) row.get("CP_SpecClassCov_CHK_ExcludeWindstormandHail");
		String strCP_SpecClassCov_CHK_ExcludeTheft = (String) row.get("CP_SpecClassCov_CHK_ExcludeTheft");
		String strCP_SpecClassCov_CHK_AgreedValue = (String) row.get("CP_SpecClassCov_CHK_AgreedValue");
		String strCP_SpecClassCov_TXT_AgreedValueExpirationDate = (String) row.get("CP_SpecClassCov_TXT_AgreedValueExpirationDate");
		String strCP_SpecClassCov_CHK_ACVRC_ActualCashValue = (String) row.get("CP_SpecClassCov_CHK_ACVRC_ActualCashValue");
		String strCP_SpecClassCov_CHK_ACVRC_ReplacementCost = (String) row.get("CP_SpecClassCov_CHK_ACVRC_ReplacementCost");
		String strCP_SpecClassCov_TXT_InflationGuardPercent = (String) row.get("CP_SpecClassCov_TXT_InflationGuardPercent");
		String strCP_SpecClassCov_TXT_MoltenMaterial = (String) row.get("CP_SpecClassCov_TXT_MoltenMaterial");
		String strCP_SpecClassCov_CHK_EarthquakeCauseofLoss = (String) row.get("CP_SpecClassCov_CHK_EarthquakeCauseofLoss");
		String strCP_SpecClassCov_TXT_EarthquakeTerritory = (String) row.get("CP_SpecClassCov_TXT_EarthquakeTerritory");
		String strCP_SpecClassCov_TXT_EarthquakeSpecialBuildingClassDescription = (String) row.get("CP_SpecClassCov_TXT_EarthquakeSpecialBuildingClassDescription");
		String strCP_SpecClassCov_TXT_EarthquakeSpecialBuildingClass = (String) row.get("CP_SpecClassCov_TXT_EarthquakeSpecialBuildingClass");
		String strCP_SpecClassCov_TXT_EarthquakeMandatoryDeductible = (String) row.get("CP_SpecClassCov_TXT_EarthquakeMandatoryDeductible");
		String strCP_SpecClassCov_TXT_EarthquakeOptionalHigherDeductiblePercent = (String) row.get("CP_SpecClassCov_TXT_EarthquakeOptionalHigherDeductiblePercent");
		String strCP_SpecClassCov_BTN_DoneWithBuilding  = (String) row.get("CP_SpecClassCov_BTN_DoneWithBuilding");
		String strCP_SpecClassCov_TXT_InflationGuardPercent_FilterNeeded  = (String) row.get("CP_SpecClassCov_TXT_InflationGuardPercent_FilterNeeded");
		
		try{
				se.log().logTestStep("CP_SpecialClassCoverage");
				test.log(LogStatus.INFO, "CP_SpecialClassCoverage page","Transaction Step : "+transaction + "<br>" +"Page : CP_SpecialClassCoverage");
				se.verify().verifyEquals("SpecialClassCoverage Page of PowerWriter ", getCP_SpecClassCov_TXT_VerifySpecialClassCoverageText().isDisplayed(),true, true,test);
				
				if((strCP_SpecClassCov_BTN_ADD.equalsIgnoreCase("Yes"))){
					se.element().Click(getCP_SpecClassCov_BTN_ADD(strCP_SpecClassCov_BTN_ADD),test);
					}
					if((strCP_SpecClassCov_BTN_Details.equalsIgnoreCase("Yes"))){
					se.element().tryClick(getCP_SpecClassCov_BTN_Details(strCP_SpecClassCov_BTN_Details),test);
					}
				
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_PolicyType(strCP_SpecClassCov_TXT_PolicyType), strCP_SpecClassCov_TXT_PolicyType,test);
				
				if(!strCP_SpecClassCov_TXT_SpecialClassDescription.equalsIgnoreCase("N/A") && !strCP_SpecClassCov_TXT_SpecialClassDescription.contains("validate2")) {
					se.element().clickSearchIcon(getCP_SpecClassCov_BTN_SpecialClassDescriptionSearch(strCP_SpecClassCov_TXT_SpecialClassDescription), test);
					if(!strCP_SpecClassCov_TXT_SpecialClassDescriptionSearchField.equalsIgnoreCase("N/A")){
						se.element().enterOrValidateText(getCP_SpecClassCov_TXT_SearchSpecialClassDescription(strCP_SpecClassCov_TXT_SpecialClassDescription), strCP_SpecClassCov_TXT_SpecialClassDescription, test);
						se.element().clickElement(getCP_SpecClassCov_BTN_Search_Icon(), test);
						se.util().sleep(1000);
					}
					se.element().clickelement(getCP_SpecClassCov_LNK_SpecialClassDescriptionOption(strCP_SpecClassCov_TXT_SpecialClassDescription),strCP_SpecClassCov_TXT_SpecialClassDescription,test);
				}else {
					se.element().enterOrValidateText(getCP_SpecClassCov_TXT_SpecialClassDescription(strCP_SpecClassCov_TXT_SpecialClassDescription), strCP_SpecClassCov_TXT_SpecialClassDescription, test);
				}
				
				//se.element().enterOrValidateText(getCP_SpecClassCov_TXT_SpecialClassDescription(strCP_SpecClassCov_TXT_SpecialClassDescription), strCP_SpecClassCov_TXT_SpecialClassDescription, test);
				//se.element().selectPopupWithMagnifier(getCP_SpecClassCov_TXT_SpecialClassDescription(strCP_SpecClassCov_TXT_SpecialClassDescription), getCP_SpecClassCov_BTN_SpecialClassDescriptionSearch(strCP_SpecClassCov_TXT_SpecialClassDescription), strCP_SpecClassCov_TXT_SpecialClassDescription, strCP_SpecClassCov_TXT_SpecialClassDescriptionSearchField, strCP_SpecClassCov_TXT_SpecialClassDescription, constants.NA, constants.NA, constants.NA, test);
				
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_SpecialItemNumber(strCP_SpecClassCov_TXT_SpecialItemNumber), strCP_SpecClassCov_TXT_SpecialItemNumber, test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_SpecialClassGroupIISymbol(strCP_SpecClassCov_TXT_SpecialClassGroupIISymbol), strCP_SpecClassCov_TXT_SpecialClassGroupIISymbol,test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_SpecialClassGroupIISymbolDescription(strCP_SpecClassCov_TXT_SpecialClassGroupIISymbolDescription), strCP_SpecClassCov_TXT_SpecialClassGroupIISymbolDescription,test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_ClassCode(strCP_SpecClassCov_TXT_ClassCode), strCP_SpecClassCov_TXT_ClassCode,test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_CoverageType(strCP_SpecClassCov_TXT_CoverageType), strCP_SpecClassCov_TXT_CoverageType,test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_ProtectionClass(strCP_SpecClassCov_TXT_ProtectionClass), strCP_SpecClassCov_TXT_ProtectionClass,test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_RatePlan(strCP_SpecClassCov_TXT_RatePlan), strCP_SpecClassCov_TXT_RatePlan,test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_RatePlanDescription(strCP_SpecClassCov_TXT_RatePlanDescription), strCP_SpecClassCov_TXT_RatePlanDescription,test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_Deductible(strCP_SpecClassCov_TXT_Deductible), strCP_SpecClassCov_TXT_Deductible,test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_AmountOfInsurance(strCP_SpecClassCov_TXT_AmountOfInsurance), strCP_SpecClassCov_TXT_AmountOfInsurance,test);
				se.element().checkUncheckOrValidate(getCP_SpecClassCov_CHK_WindAndHailDeductible(strCP_SpecClassCov_CHK_WindAndHailDeductible), strCP_SpecClassCov_CHK_WindAndHailDeductible,test);
				se.element().checkUncheckOrValidate(getCP_SpecClassCov_CHK_WindAndHailDeductibleTypeAmount(strCP_SpecClassCov_CHK_WindAndHailDeductibleTypeAmount), strCP_SpecClassCov_CHK_WindAndHailDeductibleTypeAmount,test);
				se.element().checkUncheckOrValidate(getCP_SpecClassCov_CHK_WindAndHailDeductibleTypePercent(strCP_SpecClassCov_CHK_WindAndHailDeductibleTypePercent), strCP_SpecClassCov_CHK_WindAndHailDeductibleTypePercent,test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_WindAndHailDeductibleAmount(strCP_SpecClassCov_TXT_WindAndHailDeductibleAmount), strCP_SpecClassCov_TXT_WindAndHailDeductibleAmount,test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_WindAndHailDeductiblePercent(strCP_SpecClassCov_TXT_WindAndHailDeductiblePercent), strCP_SpecClassCov_TXT_WindAndHailDeductiblePercent,test);
				//se.element().enterOrValidateText(getCP_SpecClassCov_TXT_Coinsurance(strCP_SpecClassCov_TXT_Coinsurance), strCP_SpecClassCov_TXT_Coinsurance,test);
				se.element().selectPopupWithMagnifier(getCP_SpecClassCov_TXT_Coinsurance(strCP_SpecClassCov_TXT_Coinsurance), getCP_SpecClassCov_TXT_CoinsuranceSearch(strCP_SpecClassCov_TXT_Coinsurance), strCP_SpecClassCov_TXT_Coinsurance, constants.NA, strCP_SpecClassCov_TXT_Coinsurance, constants.NA, constants.NA, constants.NA, test);
				
				/*if(!strCP_SpecClassCov_TXT_CauseOfLoss.equalsIgnoreCase("N/A") && !strCP_SpecClassCov_TXT_CauseOfLoss.contains("validate2")) {
					se.element().clickSearchIcon(getCP_SpecClassCov_BTN_CauseOfLossSearch(), test);
					se.element().clickelement(getCP_SpecClassCov_LNK_CauseOfLossOption(strCP_SpecClassCov_TXT_CauseOfLoss),strCP_SpecClassCov_TXT_CauseOfLoss,test);
				}else {
					se.element().enterOrValidateText(getCP_SpecClassCov_TXT_CauseOfLoss(strCP_SpecClassCov_TXT_CauseOfLoss), strCP_SpecClassCov_TXT_CauseOfLoss,test);
				}*/
			
				se.element().selectPopupWithMagnifier(getCP_SpecClassCov_TXT_CauseOfLoss(strCP_SpecClassCov_TXT_CauseOfLoss), getCP_SpecClassCov_BTN_CauseOfLossSearch(strCP_SpecClassCov_TXT_CauseOfLoss), strCP_SpecClassCov_TXT_CauseOfLoss, constants.NA, strCP_SpecClassCov_TXT_CauseOfLoss, constants.NA, constants.NA, constants.NA, test);
				
				se.element().checkUncheckOrValidate(getCP_SpecClassCov_CHK_SameasBuilding(strCP_SpecClassCov_CHK_SameasBuilding), strCP_SpecClassCov_CHK_SameasBuilding,test);
				se.element().checkUncheckOrValidate(getCP_SpecClassCov_CHK_ExcludeVandalism(strCP_SpecClassCov_CHK_ExcludeVandalism), strCP_SpecClassCov_CHK_ExcludeVandalism,test);
				se.element().checkUncheckOrValidate(getCP_SpecClassCov_CHK_ExcludeWindstormandHail(strCP_SpecClassCov_CHK_ExcludeWindstormandHail), strCP_SpecClassCov_CHK_ExcludeWindstormandHail,test);
				se.element().checkUncheckOrValidate(getCP_SpecClassCov_CHK_ExcludeTheft(strCP_SpecClassCov_CHK_ExcludeTheft), strCP_SpecClassCov_CHK_ExcludeTheft,test);
				se.element().checkUncheckOrValidate(getCP_SpecClassCov_CHK_AgreedValue(strCP_SpecClassCov_CHK_AgreedValue), strCP_SpecClassCov_CHK_AgreedValue,test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_AgreedValueExpirationDate(strCP_SpecClassCov_TXT_AgreedValueExpirationDate), strCP_SpecClassCov_TXT_AgreedValueExpirationDate,test);
				se.element().checkUncheckOrValidate(getCP_SpecClassCov_CHK_ACVRC_ActualCashValue(strCP_SpecClassCov_CHK_ACVRC_ActualCashValue), strCP_SpecClassCov_CHK_ACVRC_ActualCashValue,test);
				se.element().checkUncheckOrValidate(getCP_SpecClassCov_CHK_ACVRC_ReplacementCost(strCP_SpecClassCov_CHK_ACVRC_ReplacementCost), strCP_SpecClassCov_CHK_ACVRC_ReplacementCost,test);
			
				/*if(!strCP_SpecClassCov_TXT_InflationGuardPercent.equalsIgnoreCase("N/A") && !strCP_SpecClassCov_TXT_InflationGuardPercent.contains("validate2")) {
					se.element().clickSearchIcon(getCP_SpecClassCov_BTN_InflationGuardPercentSearch(), test);
					se.element().clickelement(getCP_SpecClassCov_LNK_InflationGuardPercentOption(strCP_SpecClassCov_TXT_InflationGuardPercent),strCP_SpecClassCov_TXT_InflationGuardPercent,test);
				}else {
					se.element().enterOrValidateText(getCP_SpecClassCov_TXT_InflationGuardPercent(strCP_SpecClassCov_TXT_InflationGuardPercent), strCP_SpecClassCov_TXT_InflationGuardPercent,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_SpecClassCov_TXT_InflationGuardPercent(strCP_SpecClassCov_TXT_InflationGuardPercent), getCP_SpecClassCov_BTN_InflationGuardPercentSearch(strCP_SpecClassCov_TXT_InflationGuardPercent), strCP_SpecClassCov_TXT_InflationGuardPercent, strCP_SpecClassCov_TXT_InflationGuardPercent_FilterNeeded, strCP_SpecClassCov_TXT_InflationGuardPercent, constants.NA, constants.NA, constants.NA, test);
				
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_MoltenMaterial(strCP_SpecClassCov_TXT_MoltenMaterial), strCP_SpecClassCov_TXT_MoltenMaterial,test);
				se.element().checkUncheckOrValidate(getCP_SpecClassCov_CHK_EarthquakeCauseofLoss(strCP_SpecClassCov_CHK_EarthquakeCauseofLoss), strCP_SpecClassCov_CHK_EarthquakeCauseofLoss,test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_EarthquakeTerritory(strCP_SpecClassCov_TXT_EarthquakeTerritory), strCP_SpecClassCov_TXT_EarthquakeTerritory,test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_EarthquakeSpecialBuildingClassDescription(strCP_SpecClassCov_TXT_EarthquakeSpecialBuildingClassDescription), strCP_SpecClassCov_TXT_EarthquakeSpecialBuildingClassDescription,test);
				se.util().sleep(3000);
				if(!strCP_SpecClassCov_TXT_EarthquakeSpecialBuildingClassDescription.equalsIgnoreCase("N/A")){
					se.element().clickElement(getCP_SpecClassCov_LNK_SelectEarthquakeSpecialBuildingClassDescription(strCP_SpecClassCov_TXT_EarthquakeSpecialBuildingClassDescription), test);
				}
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_EarthquakeSpecialBuildingClass(strCP_SpecClassCov_TXT_EarthquakeSpecialBuildingClass), strCP_SpecClassCov_TXT_EarthquakeSpecialBuildingClass,test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_EarthquakeMandatoryDeductible(strCP_SpecClassCov_TXT_EarthquakeMandatoryDeductible), strCP_SpecClassCov_TXT_EarthquakeMandatoryDeductible,test);
				se.element().enterOrValidateText(getCP_SpecClassCov_TXT_EarthquakeOptionalHigherDeductiblePercent(strCP_SpecClassCov_TXT_EarthquakeOptionalHigherDeductiblePercent), strCP_SpecClassCov_TXT_EarthquakeOptionalHigherDeductiblePercent,test);
				se.element().Click(getNext(),test);
				
				if(strRegressionID.equalsIgnoreCase("CP_14") && transaction.equalsIgnoreCase("NewQuote") && buildingName.equalsIgnoreCase("Location 4 Building 1"))
				{
					se.element().waitForElementIsDisplayed(CommPackage_BTN_CommercialProperty_YesButton, 10);
					if(se.element().isElementPresent(CommPackage_BTN_CommercialProperty_YesButton)){
						se.element().Click(getCommPackage_BTN_CommercialProperty_YesButton(), test);
					}
					se.util().sleep(1000);
					se.element().enterOrValidateText(getCP_BldgCov_TXT_EQSubLimit("20000"), "20000", test);
					se.element().enterOrValidateText(getCP_BldgCov_TXT_SubLimitPercentage("55"), "55", test);
					se.element().Click(getNext(),test);
					
				}
				
				if((strCP_SpecClassCov_BTN_Done.equalsIgnoreCase("Yes"))){
					
					se.element().Click(getDone(),test);
				}
				if((strCP_SpecClassCov_BTN_DoneWithBuilding.equalsIgnoreCase("Yes"))){
					
					se.element().Click(getDone(),test);
				}	
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_SpecialClassCoverage", true, false, true, test);
			
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
