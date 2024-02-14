package pw.pages.CP;

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
import pw.OR.OR_CP;
import pw.pages.COMMON.PW_CommonMethods;

public class CP_Buildings extends OR_CP {

	public void BuildingDetails(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try {
			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
			if (SuspendSheet.equalsIgnoreCase("CP_Buildings")) {
				test.log(LogStatus.INFO, "Page Suspended :- ", "Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
				testTearDown(se, test);
			}

			List<Map<String, String>> table = ExcelOperations.getPagesData("CP_Buildings", strRegressionID, transaction);
			int iteration = 0;
			
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				try {
					String strIDwithTxn = strRegressionID + "_" + transaction;
					String BuildingName = (String) row.get("CP_Bldgs_BuildingName");
					String strIDwithTxnAndBldName = strRegressionID + "_" + transaction + "_" + BuildingName;
					String strCP_Bldgs_BTN_Remove = (String) row.get("CP_Bldgs_BTN_Remove");
					String strCP_Bldgs_CHK_LocationNumber = (String) row.get("CP_Bldgs_CHK_LocationNumber");
					String Bldg_BTN_Done = (String) row.get("CP_Bldgs_BTN_Done");
					
					CP_Coverages CPCoverages = TestPageFactory.initElements(se, CP_Coverages.class);
					CP_SpecialClassCoverage SpecialClassCoverage = TestPageFactory.initElements(se, CP_SpecialClassCoverage.class);
					CP_AdditionalProperty AdditionalProperty = TestPageFactory.initElements(se, CP_AdditionalProperty.class);
					CP_BusinessIncome BusinessIncome = TestPageFactory.initElements(se, CP_BusinessIncome.class);
					CP_DebrisRemovalCoverage DebrisRemovalCoverage = TestPageFactory.initElements(se, CP_DebrisRemovalCoverage.class);
					CP_Spoilage CPSpoilage = TestPageFactory.initElements(se, CP_Spoilage.class);
					CP_TheftOfBuildingMaterial TheftOfBuildingMaterial = TestPageFactory.initElements(se, CP_TheftOfBuildingMaterial.class);
					PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);

					se.log().logTestStep("CP_Buildings");
					test.log(LogStatus.INFO, "CP_Buildings page", "Transaction Step : " + transaction + "<br>" + "Page : CP_Buildings");
					se.verify().verifyEquals("CP_Buildings of PowerWriter ", getCP_Bldgs_VerifyLocationText().isDisplayed(), true, true, test);
					
					if (strCP_Bldgs_BTN_Remove.equalsIgnoreCase("Yes")) {
						se.element().checkUncheckOrValidate(getCP_Loc_selectLocation(strCP_Bldgs_CHK_LocationNumber), "Check", test);
						se.element().Click(getCP_Loc_removeLocation(), test);
					}
					
					CP_Bldgs_LocationInformation(row, test);
					CP_Bldgs_IllinoisFireTax(row, test);
					CP_Bldgs_KYTaxInformation(row, test);
					CP_Bldgs_BuildingDetails(row, test);
					CP_Bldgs_TerritoryInformation(row, test);
					CP_Bldgs_BuildingInformation(row, strIDwithTxnAndBldName, test);
					CP_Bldgs_AgeofBuilding(row, test);
					CP_Bldgs_AdditionalExclusions(row, test);
					CP_Bldgs_BuildingCodeEffectivenessGrading(row, test);
					CP_Bldgs_DeductibleOption(row, test);
					CP_Bldgs_OtherCausesOfLoss(row, test);
					CP_Bldgs_MineSubsidence(row, test);
					CP_Bldgs_BuildingOptions(row, test);
					CP_Bldgs_EarthquakeInformation(row, test);
					CP_Bldgs_PropertyCoverages(row, test);

					if (se.element().isElementPresent(common_btn_Next_type1)) {
						se.element().Click(getNext(), test);
					}
					//5/11/2023 sheetal added this below step for DF-913 gap to update the new value of Construction details
					if ((strRegressionID.equalsIgnoreCase("TC_2") && transaction.equalsIgnoreCase("NewQuote")
							&& BuildingName.equalsIgnoreCase("Location 1 Building 1"))) {
						
						String strCP_Bldgs_ConstructionFilter = (String) row.get("CP_Bldgs_ConstructionFilter");
						String strCP_Bldgs_TXT_Construction = (String) row.get("CP_Bldgs_TXT_Construction");
						String strCP_Bldgs_TXT_NewConstructionDetails_Popup = (String) row.get("CP_Bldgs_TXT_NewConstructionDetails_Popup");
						
						
						se.element().waitForElementIsDisplayed(CommPackage_BTN_CommercialProperty_YesButton, 10);
						
						if (se.element().isElementPresent(CommPackage_BTN_CommercialProperty_YesButton)) {
							se.element().Click(getCommPackage_BTN_CommercialProperty_YesButton(), test);
						}
						
						if((strIDwithTxnAndBldName.equalsIgnoreCase("TC_2_NewQuote_Location 1 Building 1"))) {
							se.element().selectPopupWithMagnifier(getCP_Bldgs_TXT_Construction(strCP_Bldgs_TXT_Construction),
									getCP_Bldgs_BTN_ConstructionLookupIcon(strCP_Bldgs_TXT_Construction), strCP_Bldgs_TXT_Construction,
									strCP_Bldgs_ConstructionFilter, strCP_Bldgs_TXT_Construction,
									strCP_Bldgs_TXT_NewConstructionDetails_Popup, constants.NA, constants.NA, test);
							
							if (se.element().isElementPresent(common_btn_Next_type1)) {
								se.element().Click(getNext(), test);
							}
						}
					}
					

					if ((strRegressionID.equalsIgnoreCase("CP_15") && transaction.equalsIgnoreCase("QFRRevise")
							&& BuildingName.equalsIgnoreCase("Location 6 Building 1"))) {
						
						String strCP_Bldgs_TXT_IL_JurisdictionDesc = (String) row.get("CP_Bldgs_TXT_IL_JurisdictionDesc");
						String strCP_Bldgs_TXT_IL_JurisdictionDesc_PopUp = (String) row.get("CP_Bldgs_TXT_IL_JurisdictionDesc_PopUp");
						
						se.element().waitForElementIsDisplayed(CommPackage_BTN_CommercialProperty_YesButton, 10);
						
						if (se.element().isElementPresent(CommPackage_BTN_CommercialProperty_YesButton)) {
							se.element().Click(getCommPackage_BTN_CommercialProperty_YesButton(), test);
						}
						
						if (!strCP_Bldgs_TXT_IL_JurisdictionDesc.equalsIgnoreCase("N/A") && !strCP_Bldgs_TXT_IL_JurisdictionDesc.contains("validate2")) {
							se.element().enterOrValidateText(getCP_Bldgs_TXT_IL_JurisdictionDesc(strCP_Bldgs_TXT_IL_JurisdictionDesc), strCP_Bldgs_TXT_IL_JurisdictionDesc, test);
							se.util().sleep(2000);
							if (se.element().isElementPresent(common_btn_Next_type1)) {
								se.element().Click(getNext(), test);
							}
						}
					}
					
					if (se.element().isElementPresent(CommPackage_BTN_CommercialProperty_YesButton)) {
						se.element().Click(getCommPackage_BTN_CommercialProperty_YesButton(), test);
					}
					
					if ((!strIDwithTxn.equalsIgnoreCase("CP_13_FlatEndorsement1"))
							&& (!strIDwithTxn.equalsIgnoreCase("CP_1_ConvertQFRToPolicy"))
							&& (!strIDwithTxnAndBldName
									.equalsIgnoreCase("CP_1_ConvertQFRToPolicyB2_Location 1 Building 2"))
							&& (!strIDwithTxnAndBldName
									.equalsIgnoreCase("CP_1_ProRataEndorsement2_Location 1 Building 1"))
							&& (!strIDwithTxn.equalsIgnoreCase("BP_4_FlatEndorsement1"))
							&& (!strIDwithTxn.equalsIgnoreCase("BP_4_QuoteForRenewal"))
							&& (!strIDwithTxn.equalsIgnoreCase("BP_1_QuoteForRenewal"))
							&& (!strIDwithTxn.equalsIgnoreCase("BP_12_DeleteFlatEndorsement1"))
							&& (!strIDwithTxnAndBldName
									.equalsIgnoreCase("BP_12_DeleteFlatEndorsement1_Location 1 Building 1")
									&& (!strIDwithTxnAndBldName
											.equalsIgnoreCase("BP_12_DeleteFlatEndorsement1B2_Location 1 Building 2"))
									&& (!strIDwithTxn.equalsIgnoreCase("TC_12_FlatEndorsement1")))) {
						
						CPCoverages.CP_BuildingCoveragePage(strRegressionID, transaction, BuildingName, test);
						CPCoverages.CP_BusinessPersonalProperty(strRegressionID, transaction, BuildingName, test);
						BusinessIncome.BusinessIncome(strRegressionID, transaction, BuildingName, test);
						CPCoverages.CP_ExtraExpenseCoveragePage(strRegressionID, transaction, BuildingName, test);
						CPCoverages.CP_LandlordAsAdditionalInsuredPage(strRegressionID, transaction, BuildingName, test);
						CPCoverages.CP_GreenUpgradesCoveragePage(strRegressionID, transaction, BuildingName, test);
						SpecialClassCoverage.SpecialClassCoverage(strRegressionID, transaction, BuildingName, test);
						AdditionalProperty.AdditionalProperty(strRegressionID, transaction, BuildingName, test);
						DebrisRemovalCoverage.DebrisRemovalCoverage(strRegressionID, transaction, BuildingName, test);
						CPSpoilage.Spoilage(strRegressionID, transaction, BuildingName, test);
						CPCoverages.CP_OrdinanceOrLawCoveragePage(strRegressionID, transaction, BuildingName, test);
						CPCoverages.CP_UtilityServiceCoveragePage(strRegressionID, transaction, BuildingName, test);
						CPCoverages.CP_VacancyPermitCoveragePage(strRegressionID, transaction, BuildingName, test);
						TheftOfBuildingMaterial.CP_TheftOfBldgMaterial(strRegressionID, transaction, BuildingName, test);
						CPCoverages.CP_PeakSeasonCoveragePage(strRegressionID, transaction, BuildingName, test);
						CPCoverages.CP_OptionalProvisions(strRegressionID, transaction, BuildingName, test);
						CPCoverages.CP_MortgageholdersEOCoveragePage(strRegressionID, transaction, BuildingName, test);
					}

					if (strIDwithTxnAndBldName.equalsIgnoreCase("CP_1_ProRataEndorsement2_Location 1 Building 1")) {
						CommonMethods.NavigateTo("Utility Service Coverage (2)", test);
						CPCoverages.CP_UtilityServiceCoveragePage(strRegressionID, transaction, "Location 1 Building 1",
								test);
					}

					if (Bldg_BTN_Done.equalsIgnoreCase(constants.Yes)) {
						se.element().Click(getDone(), test);
					}

				
				}catch (Exception e) {
					se.verify().verifyEquals("Failed to fill in details for CP_Bulidings", true, false, true, test);

				}
				iteration++;
			}

		} catch (Exception e) {

			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

	}

	public void CP_Bldgs_LocationInformation(Map<String, String> row, ExtentTest test) throws IOException {

		String strCP_Bldgs_BTN_ADDBuilding = (String) row.get("CP_Bldgs_BTN_ADDBuilding");
		String strCP_Bldgs_BTN_EditBuilding = (String) row.get("CP_Bldgs_BTN_EditBuildingNumber");
		String strCP_Bldgs_TXT_LocationNumber = (String) row.get("CP_Bldgs_TXT_LocationNumber");
		String strCP_Bldgs_TXT_Name = (String) row.get("CP_Bldgs_TXT_Name");
		String strCP_Bldgs_TXT_Description = (String) row.get("CP_Bldgs_TXT_Description");
		String strCP_Bldgs_TXT_Street = (String) row.get("CP_Bldgs_TXT_Street");
		String strCP_Bldgs_TXT_SteUnit = (String) row.get("CP_Bldgs_TXT_SteUnit");
		String strCP_Bldgs_TXT_City = (String) row.get("CP_Bldgs_TXT_City");
		String strCP_Bldgs_TXT_State = (String) row.get("CP_Bldgs_TXT_State");
		String strCP_Bldgs_TXT_Zip = (String) row.get("CP_Bldgs_TXT_Zip");
		
		try {
			
			if (strCP_Bldgs_BTN_ADDBuilding.equalsIgnoreCase("Yes")) {
				se.element().Click(getCP_Bldgs_BTN_AddBuilding(), test);
			}
			if (!strCP_Bldgs_BTN_EditBuilding.equalsIgnoreCase("N/A")) {
				se.element().Click(getCP_Bldgs_BTN_EditBuilding(strCP_Bldgs_BTN_EditBuilding), test);
			}
			se.element().enterOrValidateText(getCP_Bldgs_TXT_LocationNumber(strCP_Bldgs_TXT_LocationNumber),
					strCP_Bldgs_TXT_LocationNumber, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_Name(strCP_Bldgs_TXT_Name), strCP_Bldgs_TXT_Name, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_Description(strCP_Bldgs_TXT_Description),
					strCP_Bldgs_TXT_Description, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_Street(strCP_Bldgs_TXT_Street), strCP_Bldgs_TXT_Street,
					test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_SteUnit(strCP_Bldgs_TXT_SteUnit), strCP_Bldgs_TXT_SteUnit,
					test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_City(strCP_Bldgs_TXT_City), strCP_Bldgs_TXT_City, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_State(strCP_Bldgs_TXT_State), strCP_Bldgs_TXT_State, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_Zip(strCP_Bldgs_TXT_Zip), strCP_Bldgs_TXT_Zip, test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Bldgs_LocationInformation ", true, false, true,
					test);
		}
	}

	public void CP_Bldgs_IllinoisFireTax(Map<String, String> row, ExtentTest test) throws IOException {
		String strCP_Bldgs_CHK_IL_All_juridiction = (String) row.get("CP_Bldgs_CHK_IL_All_juridiction");
		String strCP_Bldgs_TXT_IL_JurisdictionDesc = (String) row.get("CP_Bldgs_TXT_IL_JurisdictionDesc");
		String strCP_Bldgs_TXT_IL_FPDCode = (String) row.get("CP_Bldgs_TXT_IL_FPDCode");
		String strCP_Bldgs_TXT_IL_FireProtDist = (String) row.get("CP_Bldgs_TXT_IL_FireProtDist");
		String strCP_Bldgs_TXT_IL_JurisdictionDesc_PopUp = (String) row.get("CP_Bldgs_TXT_IL_JurisdictionDesc_PopUp");
		String strCP_Bldgs_TXT_IL_JurisdictionDescFilterNeeded = (String) row
				.get("CP_Bldgs_TXT_IL_JurisdictionDescFilterNeeded");
		try {
			
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_IL_All_juridiction(strCP_Bldgs_CHK_IL_All_juridiction),
					strCP_Bldgs_CHK_IL_All_juridiction, test);
			if (!strCP_Bldgs_TXT_IL_JurisdictionDesc.equalsIgnoreCase("N/A")
					&& !strCP_Bldgs_TXT_IL_JurisdictionDesc.contains("validate2")) {
				if (se.element().isElementPresent(CP_Bldgs_BTN_IL_JurisdictionSearch)) {
					se.element().clickSearchIcon(
							getCP_Bldgs_BTN_IL_JurisdictionSearch(strCP_Bldgs_TXT_IL_JurisdictionDesc), test);
					se.element().enterOrValidateText(
							getCP_Bldgs_Txt_Search_JurisdictionDescription(strCP_Bldgs_TXT_IL_JurisdictionDesc),
							strCP_Bldgs_TXT_IL_JurisdictionDesc, test);
					se.element().clickElement(getCP_Bldgs_BTN_Search_Icon(), test);
					se.element().Click(getCP_Bldgs_LNK_IL_Jurisdiction(strCP_Bldgs_TXT_IL_JurisdictionDesc_PopUp,
							strCP_Bldgs_TXT_IL_JurisdictionDesc), test);
				} else {
					se.element().enterOrValidateText(
							getCP_Bldgs_TXT_IL_JurisdictionDesc(strCP_Bldgs_TXT_IL_JurisdictionDesc),
							strCP_Bldgs_TXT_IL_JurisdictionDesc, test);
				}

			} else {
				se.element().enterOrValidateText(
						getCP_Bldgs_TXT_IL_JurisdictionDesc(strCP_Bldgs_TXT_IL_JurisdictionDesc),
						strCP_Bldgs_TXT_IL_JurisdictionDesc, test);
			}
			se.element().enterOrValidateText(getCP_Bldgs_TXT_IL_FPDCode(strCP_Bldgs_TXT_IL_FPDCode),
					strCP_Bldgs_TXT_IL_FPDCode, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_IL_FireProtDist(strCP_Bldgs_TXT_IL_FireProtDist),
					strCP_Bldgs_TXT_IL_FireProtDist, test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Bldgs_IllinoisFireTax", true, false, true, test);

		}
	}

	public void CP_Bldgs_KYTaxInformation(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCP_Bldgs_CHK_KY_DoNotApplyCityorcountyTaxes = (String) row.get("CP_Bldgs_CHK_KY_DoNotApplyCityorcountyTaxes");
		String strCP_Bldgs_CHK_KY_AllCityName = (String) row.get("CP_Bldgs_CHK_KY_AllCityName");
		String strCP_Bldgs_TXT_KY_City = (String) row.get("CP_Bldgs_TXT_KY_City");
		String strCP_Bldgs_TXT_KY_CityCode = (String) row.get("CP_Bldgs_TXT_KY_CityCode");
		String strCP_Bldgs_CHK_KY_AllCountyName = (String) row.get("CP_Bldgs_CHK_KY_AllCountyName");
		String strCP_Bldgs_TXT_KY_County = (String) row.get("CP_Bldgs_TXT_KY_County");
		String strCP_Bldgs_TXT_KY_CountyCode = (String) row.get("CP_Bldgs_TXT_KY_CountyCode");
		String strCP_Bldgs_TXT_KY_TaxCode = (String) row.get("CP_Bldgs_TXT_KY_TaxCode");
		
		try {
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_KY_DoNotApplyCityorcountyTaxes(strCP_Bldgs_CHK_KY_DoNotApplyCityorcountyTaxes),
					strCP_Bldgs_CHK_KY_DoNotApplyCityorcountyTaxes, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_KY_AllCityName(strCP_Bldgs_CHK_KY_AllCityName),
					strCP_Bldgs_CHK_KY_AllCityName, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_KY_City(strCP_Bldgs_TXT_KY_City), strCP_Bldgs_TXT_KY_City,
					test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_KY_CityCode(strCP_Bldgs_TXT_KY_CityCode),
					strCP_Bldgs_TXT_KY_CityCode, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_KY_AllCountyName(strCP_Bldgs_CHK_KY_AllCountyName),
					strCP_Bldgs_CHK_KY_AllCountyName, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_KY_County(strCP_Bldgs_TXT_KY_County),
					strCP_Bldgs_TXT_KY_County, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_KY_CountyCode(strCP_Bldgs_TXT_KY_CountyCode),
					strCP_Bldgs_TXT_KY_CountyCode, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_KY_TaxCode(strCP_Bldgs_TXT_KY_TaxCode),
					strCP_Bldgs_TXT_KY_TaxCode, test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Bldgs_KYTaxInformation", true, false, true,
					test);
		}
	}

	public void CP_Bldgs_BuildingDetails(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCP_Bldgs_TXT_BuildingNumber = (String) row.get("CP_Bldgs_TXT_BuildingNumber");
		String strCP_Bldgs_TXT_ISORiskID = (String) row.get("CP_Bldgs_TXT_ISORiskID");
		String strCP_Bldgs_TXT_ExperienceLevel = (String) row.get("CP_Bldgs_TXT_ExperienceLevel");
		String strCP_Bldgs_TXT_ISOoccupantID = (String) row.get("CP_Bldgs_TXT_ISOoccupantID");
		String strCP_Bldgs_TXT_BuildingDescription = (String) row.get("CP_Bldgs_TXT_BuildingDescription");
		String strCP_Bldgs_TXT_ISO_AddressDetails = (String) row.get("CP_Bldgs_TXT_ISO_AddressDetails");
		String strCP_Bldgs_TXT_ISO_AddDetails = (String) row.get("CP_Bldgs_TXT_ISO_AddDetails");
		String strCP_Bldgs_LBL_ISO_AddressMatchType = (String) row.get("CP_Bldgs_LBL_ISO_AddressMatchType");
		String strCP_Bldgs_TXT_ISO_AddressDetailsFilterNeeded = (String) row.get("CP_Bldgs_TXT_ISO_AddressDetailsFilterNeeded");
		String strCP_Bldgs_LBL_ISO_AddressOccupantDescription = (String) row.get("CP_Bldgs_LBL_ISO_AddressOccupantDescription");
		String strCP_Bldgs_TXT_ISO_BusinessNameforELC = (String) row.get("CP_Bldgs_TXT_ISO_BusinessNameforELC");
		String strCP_Bldgs_TXT_ISO_OccupancyDetails = (String) row.get("CP_Bldgs_TXT_ISO_OccupancyDetails");
		String strCP_Bldgs_TXT_BCEGServiceRequestID = (String) row.get("CP_Bldgs_TXT_BCEGServiceRequestID");
		String strCP_Bldgs_TXT_FEPPCServiceRequestID = (String) row.get("CP_Bldgs_TXT_FEPPCServiceRequestID");
		String strCP_Bldgs_TXT_PREMServiceRequestID = (String) row.get("CP_Bldgs_TXT_PREMServiceRequestID");
		String strCP_Bldgs_TXT_BURServiceRequestID = (String) row.get("CP_Bldgs_TXT_BURServiceRequestID");
		String strCP_Bldgs_CHK_ISO_ConfirmAddressDetails = (String) row.get("CP_Bldgs_CHK_ISO_ConfirmAddressDetails");
		String strCP_Bldgs_CHK_rental = (String) row.get("CP_Bldgs_CHK_rental");
		
		try {
			se.element().enterOrValidateText(getCP_Bldgs_TXT_BuildingNumber(strCP_Bldgs_TXT_BuildingNumber),
					strCP_Bldgs_TXT_BuildingNumber, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_ISORiskID(strCP_Bldgs_TXT_ISORiskID),
					strCP_Bldgs_TXT_ISORiskID, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_ISOoccupantID(strCP_Bldgs_TXT_ISOoccupantID),
					strCP_Bldgs_TXT_ISOoccupantID, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_BuildingDescription(strCP_Bldgs_TXT_BuildingDescription),
					strCP_Bldgs_TXT_BuildingDescription, test);
			se.element().selectPopupWithMagnifier(
					getCP_Bldgs_TXT_ISO_AddressDetails(strCP_Bldgs_TXT_ISO_AddressDetails),
					getCP_Bldgs_BTN_ISO_AddressDetailsIcon(strCP_Bldgs_TXT_ISO_AddressDetails),
					strCP_Bldgs_TXT_ISO_AddressDetails, strCP_Bldgs_TXT_ISO_AddressDetailsFilterNeeded,
					strCP_Bldgs_TXT_ISO_AddressDetails, strCP_Bldgs_TXT_ISO_AddDetails,
					strCP_Bldgs_LBL_ISO_AddressOccupantDescription, strCP_Bldgs_LBL_ISO_AddressMatchType, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_ISO_BusinessNameforELC(strCP_Bldgs_TXT_ISO_BusinessNameforELC),
					strCP_Bldgs_TXT_ISO_BusinessNameforELC, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_ISO_OccupancyDetails(strCP_Bldgs_TXT_ISO_OccupancyDetails),
					strCP_Bldgs_TXT_ISO_OccupancyDetails, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_BCEGServiceRequestID(strCP_Bldgs_TXT_BCEGServiceRequestID),
					strCP_Bldgs_TXT_BCEGServiceRequestID, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_FEPPCServiceRequestID(strCP_Bldgs_TXT_FEPPCServiceRequestID),
					strCP_Bldgs_TXT_FEPPCServiceRequestID, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_PREMServiceRequestID(strCP_Bldgs_TXT_PREMServiceRequestID),
					strCP_Bldgs_TXT_PREMServiceRequestID, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_BURServiceRequestID(strCP_Bldgs_TXT_BURServiceRequestID),
					strCP_Bldgs_TXT_BURServiceRequestID, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_ISO_ConfirmAddressDetails(strCP_Bldgs_CHK_ISO_ConfirmAddressDetails),
					strCP_Bldgs_CHK_ISO_ConfirmAddressDetails, test);
			se.element().waitForElementToDisappear(spinner, 5000);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_ExperienceLevel(strCP_Bldgs_TXT_ExperienceLevel),
					strCP_Bldgs_TXT_ExperienceLevel, test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Bldgs_BuildingDetails", true, false, true, test);

		}
	}

	public void CP_Bldgs_TerritoryInformation(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCP_Bldgs_TXT_Territory = (String) row.get("CP_Bldgs_TXT_Territory");
		String strCP_Bldgs_TXT_TerritoryDescription = (String) row.get("CP_Bldgs_TXT_TerritoryDescription");
		String strCP_Bldgs_TXT_GroupITerritory = (String) row.get("CP_Bldgs_TXT_GroupITerritory");
		String strCP_Bldgs_TXT_GroupIITerritory = (String) row.get("CP_Bldgs_TXT_GroupIITerritory");
		String strCP_Bldgs_CHK_does_cy_tw_fire_company = (String) row.get("CP_Bldgs_CHK_does_cy_tw_fire_company");
		String strCP_Bldgs_TXT_1company_cd_factor = (String) row.get("CP_Bldgs_TXT_1company_cd_factor");
		String strCP_Bldgs_TXT_grp_ii_territory_description = (String) row.get("CP_Bldgs_TXT_grp_ii_territory_description");
		String strCP_Bldgs_TXT_GeographicWindHazardLevel = (String) row.get("CP_Bldgs_TXT_GeographicWindHazardLevel");
		String strCP_Bldgs_TXT_TotalAmountofInsurance = (String) row.get("CP_Bldgs_TXT_TotalAmountofInsurance");
		
		try {
			se.element().enterOrValidateText(getCP_Bldgs_TXT_Territory(strCP_Bldgs_TXT_Territory),
					strCP_Bldgs_TXT_Territory, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_TerritoryDescription(strCP_Bldgs_TXT_TerritoryDescription),
					strCP_Bldgs_TXT_TerritoryDescription, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_GroupITerritory(strCP_Bldgs_TXT_GroupITerritory),
					strCP_Bldgs_TXT_GroupITerritory, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_GroupIITerritory(strCP_Bldgs_TXT_GroupIITerritory),
					strCP_Bldgs_TXT_GroupIITerritory, test);
			se.util().sleep(3000);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_does_cy_tw_fire_company(strCP_Bldgs_CHK_does_cy_tw_fire_company),
					strCP_Bldgs_CHK_does_cy_tw_fire_company, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_1company_cd_factor(strCP_Bldgs_TXT_1company_cd_factor),
					strCP_Bldgs_TXT_1company_cd_factor, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_grp_ii_territory_description(strCP_Bldgs_TXT_grp_ii_territory_description),
					strCP_Bldgs_TXT_grp_ii_territory_description, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_GeographicWindHazardLevel(strCP_Bldgs_TXT_GeographicWindHazardLevel),
					strCP_Bldgs_TXT_GeographicWindHazardLevel, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_TotalAmountofInsurance(strCP_Bldgs_TXT_TotalAmountofInsurance),
					strCP_Bldgs_TXT_TotalAmountofInsurance, test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Bldgs_TerritoryInformation", true, false, true, test);
		}
	}

	public void CP_Bldgs_BuildingInformation(Map<String, String> row, String strIDwithTxnAndBldName, ExtentTest test)
			throws IOException {
		
		String strCP_Bldgs_CHK_SelectAddClassCodes = (String) row.get("CP_Bldgs_CHK_SelectAddClassCodes");
		String strCP_Bldgs_TXT_ClassCode = (String) row.get("CP_Bldgs_TXT_ClassCode");
		String strCP_Bldgs_TXT_ClassDescription_PopUp = (String) row.get("CP_Bldgs_TXT_ClassDescription_PopUp");
		String strCP_Bldgs_TXT_ClassDescription = (String) row.get("CP_Bldgs_TXT_ClassDescription");
		String strCP_Bldgs_TXT_bg2_rate_type = (String) row.get("CP_Bldgs_TXT_bg2_rate_type");
		String strCP_Bldgs_TXT_RiskType = (String) row.get("CP_Bldgs_TXT_RiskType");
		String strCP_Bldgs_CHK_OpenSides = (String) row.get("CP_Bldgs_CHK_OpenSides");
		String strCP_Bldgs_CHK_SprinkleredProperty = (String) row.get("CP_Bldgs_CHK_SprinkleredProperty");
		String strCP_Bldgs_CHK_ValuesexptoAutoSprinkSystemslessthan50percentage = (String) row.get("CP_Bldgs_CHK_ValuesexptoAutoSprinkSystemslessthan50percentage");
		String strCP_Bldgs_TXT_TotalFloorArea = (String) row.get("CP_Bldgs_TXT_TotalFloorArea");
		String strCP_Bldgs_TXT_Construction = (String) row.get("CP_Bldgs_TXT_Construction");
		String strCP_Bldgs_TXT_ConstructionDetails_Popup = (String) row.get("CP_Bldgs_TXT_ConstructionDetails_Popup");
		String strCP_Bldgs_TXT_ConstructionDetails = (String) row.get("CP_Bldgs_TXT_ConstructionDetails");
		String strCP_Bldgs_TXT_BG1RATETYPE = (String) row.get("CP_Bldgs_TXT_BG1RATETYPE");
		String strCP_Bldgs_TXT_BG1RATETYPESearchField = (String) row.get("CP_Bldgs_TXT_BG1RATETYPESearchField");
		String strCP_Bldgs_TXT_BGIIRATETYPE = (String) row.get("CP_Bldgs_TXT_BGIIRATETYPE");
		String strCP_Bldgs_TXT_BGIIRATETYPESearchField = (String) row.get("CP_Bldgs_TXT_BGIIRATETYPESearchField");
		String strCP_Bldgs_TXT_ASGR = (String) row.get("CP_Bldgs_TXT_ASGR");
		String strCP_Bldgs_CHK_SelectAddPPCCodes = (String) row.get("CP_Bldgs_CHK_SelectAddPPCCodes");
		String strCP_Bldgs_TXT_ProtectionClassSearchField = (String) row.get("CP_Bldgs_TXT_ProtectionClassSearchField");
		String strCP_Bldgs_TXT_ProtectionClass = (String) row.get("CP_Bldgs_TXT_ProtectionClass");
		String strCP_Bldgs_CHK_WindUplift_Yes = (String) row.get("CP_Bldgs_CHK_WindUplift_Yes");
		String strCP_Bldgs_CHK_WindUplift_No = (String) row.get("CP_Bldgs_CHK_WindUplift_No");
		String strCP_Bldgs_TXT_BuildingWindConstructionCode = (String) row.get("CP_Bldgs_TXT_BuildingWindConstructionCode");
		String strCP_Bldgs_TXT_GroupIISymbolDescription = (String) row.get("CP_Bldgs_TXT_GroupIISymbol Description");
		String strCP_Bldgs_CHK_DoyouwanttocopyTotalFloorArea = (String) row.get("CP_Bldgs_CHK_DoyouwanttocopyTotalFloorArea");
		String strCP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Sqft = (String) row.get("CP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Sqft");
		String strCP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Percnt = (String) row.get("CP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Percnt");
		String strCP_Bldgs_TXT_SquareFootageoccupiedbyinsured = (String) row.get("CP_Bldgs_TXT_SquareFootageoccupiedbyinsured");
		String strCP_Bldgs_TXT_SquareFootgeOccupedpercent = (String) row.get("CP_Bldgs_TXT_SquareFootgeOccupedpercent");
		String strCP_Bldgs_CHK_DoesSubstandardConditionsApply = (String) row.get("CP_Bldgs_CHK_DoesSubstandardConditionsApply");
		String strCP_Bldgs_TXT_RatePlan = (String) row.get("CP_Bldgs_TXT_RatePlan");
		String strCP_Bldgs_TXT_RatePlanDescription = (String) row.get("CP_Bldgs_TXT_RatePlanDescription");
		String strCP_Bldgs_CHK_TentativeRate = (String) row.get("CP_Bldgs_CHK_TentativeRate");
		String strCP_Bldgs_TXT_SecificRateGrooupIISymbol = (String) row.get("CP_Bldgs_TXT_SecificRateGrooupIISymbol");
		String strCP_Bldgs_TXT_NumberofStories = (String) row.get("CP_Bldgs_TXT_NumberofStories");
		String strCP_Bldgs_TXT_NumberofBasements = (String) row.get("CP_Bldgs_TXT_NumberofBasements");
		String strCP_Bldgs_TXT_PercentOccupiedInsured = (String) row.get("CP_Bldgs_TXT_PercentOccupiedInsured");
		String strCP_Bldgs_TXT_ApartmentPercentage = (String) row.get("CP_Bldgs_TXT_ApartmentPercentage");
		String strCP_Bldgs_TXT_OfficePercentage = (String) row.get("CP_Bldgs_TXT_OfficePercentage");
		String strCP_Bldgs_TXT_RestaurentPercentage = (String) row.get("CP_Bldgs_TXT_RestaurentPercentage");
		String strCP_Bldgs_TXT_RetailSalePercentage = (String) row.get("CP_Bldgs_TXT_RetailSalePercentage");
		String strCP_Bldgs_TXT_ServicesOccPercentage = (String) row.get("CP_Bldgs_TXT_ServicesOccPercentage");
		String strCP_Bldgs_TXT_ManufacturingPercentage = (String) row.get("CP_Bldgs_TXT_ManufacturingPercentage");
		String strCP_Bldgs_TXT_ClassCodeSearchField = (String) row.get("CP_Bldgs_TXT_ClassCodeSearchField");
		String strCP_Bldgs_ConstructionFilter = (String) row.get("CP_Bldgs_ConstructionFilter");
		
			

		try {
			se.util().sleep(10000);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_SelectAddClassCodes(strCP_Bldgs_CHK_SelectAddClassCodes),strCP_Bldgs_CHK_SelectAddClassCodes, test);

			String strCP_Bldgs_TXT_ClassDescription1 = Util.getActaulString(strCP_Bldgs_TXT_ClassDescription);

			if (!strCP_Bldgs_TXT_ClassCode.equalsIgnoreCase("N/A")) {
				if (!getCP_Bldgs_TXT_ClassDescription(strCP_Bldgs_TXT_ClassDescription).getAttribute("value")
						.equalsIgnoreCase(strCP_Bldgs_TXT_ClassDescription1)) {
					if (strCP_Bldgs_TXT_ClassCode.contains("validate2")) {
						String strCP_Bldgs_TXT_Classcode1 = Util.getActaulString(strCP_Bldgs_TXT_ClassCode);
						se.element().enterOrValidateText(getCP_Bldgs_TXT_ClassCode(strCP_Bldgs_TXT_ClassCode),
								strCP_Bldgs_TXT_ClassCode, test);
						se.element().selectPopupWithMagnifier(getCP_Bldgs_TXT_ClassCode(strCP_Bldgs_TXT_Classcode1),
								getCP_Bldgs_TXT_ClassCodeSearchIcon(strCP_Bldgs_TXT_Classcode1),
								strCP_Bldgs_TXT_Classcode1, strCP_Bldgs_TXT_ClassCodeSearchField,
								strCP_Bldgs_TXT_Classcode1, strCP_Bldgs_TXT_ClassDescription_PopUp, constants.NA,
								constants.NA, test);

					} else {
						se.element().selectPopupWithMagnifier(getCP_Bldgs_TXT_ClassCode(strCP_Bldgs_TXT_ClassCode),
								getCP_Bldgs_TXT_ClassCodeSearchIcon(strCP_Bldgs_TXT_ClassCode),
								strCP_Bldgs_TXT_ClassCode, strCP_Bldgs_TXT_ClassCodeSearchField,
								strCP_Bldgs_TXT_ClassCode, strCP_Bldgs_TXT_ClassDescription_PopUp, constants.NA,
								constants.NA, test);
					}
				} else {
					se.element().selectClasscode(getCP_Bldgs_TXT_ClassCode(strCP_Bldgs_TXT_ClassCode),
							strCP_Bldgs_TXT_ClassCodeSearchField, strCP_Bldgs_TXT_ClassCode,
							strCP_Bldgs_TXT_ClassDescription_PopUp, constants.NA, constants.NA, test);
				}
			}
			se.element().enterOrValidateText(getCP_Bldgs_TXT_ClassDescription(strCP_Bldgs_TXT_ClassDescription),
					strCP_Bldgs_TXT_ClassDescription, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_bg2_rate_type(strCP_Bldgs_TXT_bg2_rate_type),
					strCP_Bldgs_TXT_bg2_rate_type, test);
			se.element().selectPopupWithMagnifier(getCP_Bldgs_TXT_RiskType(strCP_Bldgs_TXT_RiskType),
					getCP_Bldgs_TXT_RiskTypeSearch(strCP_Bldgs_TXT_RiskType), strCP_Bldgs_TXT_RiskType, constants.NA,
					strCP_Bldgs_TXT_RiskType, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_OpenSides(strCP_Bldgs_CHK_OpenSides),
					strCP_Bldgs_CHK_OpenSides, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_SprinkleredProperty(strCP_Bldgs_CHK_SprinkleredProperty),
					strCP_Bldgs_CHK_SprinkleredProperty, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_ValuesexptoAutoSprinkSystemslessthan50percentage(
							strCP_Bldgs_CHK_ValuesexptoAutoSprinkSystemslessthan50percentage),
					strCP_Bldgs_CHK_ValuesexptoAutoSprinkSystemslessthan50percentage, test);
			
			if (!strCP_Bldgs_TXT_TotalFloorArea.equalsIgnoreCase("N/A")
					&& !strCP_Bldgs_TXT_TotalFloorArea.contains("validate2")) {
				se.element().clearTheField(getCP_Bldgs_TXT_TotalFloorArea(strCP_Bldgs_TXT_TotalFloorArea));
			}
			
			se.element().enterOrValidateText(getCP_Bldgs_TXT_TotalFloorArea(strCP_Bldgs_TXT_TotalFloorArea), strCP_Bldgs_TXT_TotalFloorArea, test);

			se.element().selectPopupWithMagnifier(getCP_Bldgs_TXT_Construction(strCP_Bldgs_TXT_Construction),
					getCP_Bldgs_BTN_ConstructionLookupIcon(strCP_Bldgs_TXT_Construction), strCP_Bldgs_TXT_Construction,
					strCP_Bldgs_ConstructionFilter, strCP_Bldgs_TXT_Construction,
					strCP_Bldgs_TXT_ConstructionDetails_Popup, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_ConstructionDetails(strCP_Bldgs_TXT_ConstructionDetails), strCP_Bldgs_TXT_ConstructionDetails, test);
			se.util().sleep(5000);

			se.element().selectPopupWithMagnifier(getCP_Bldgs_TXT_BG1RATETYPE(strCP_Bldgs_TXT_BG1RATETYPE),
					getCP_Bldgs_BTN_BG1RATETYPE(strCP_Bldgs_TXT_BG1RATETYPE), strCP_Bldgs_TXT_BG1RATETYPE, constants.NA,
					strCP_Bldgs_TXT_BG1RATETYPE, constants.NA, constants.NA, constants.NA, test);

			se.element().selectPopupWithMagnifier(getCP_Bldgs_TXT_BGIIRATETYPE(strCP_Bldgs_TXT_BGIIRATETYPE),
					getCP_Bldgs_BTN_BGIIRATETYPE(strCP_Bldgs_TXT_BGIIRATETYPE), strCP_Bldgs_TXT_BGIIRATETYPE,
					constants.NA, strCP_Bldgs_TXT_BGIIRATETYPE, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_ASGR(strCP_Bldgs_TXT_ASGR), strCP_Bldgs_TXT_ASGR, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_SelectAddPPCCodes(strCP_Bldgs_CHK_SelectAddPPCCodes),strCP_Bldgs_CHK_SelectAddPPCCodes, test);

			se.element().selectPopupWithMagnifier(getCP_Bldgs_TXT_ProtectionClass(strCP_Bldgs_TXT_ProtectionClass),
					getCP_Bldgs_BTN_ProtectionClass(strCP_Bldgs_TXT_ProtectionClass), strCP_Bldgs_TXT_ProtectionClass,
					strCP_Bldgs_TXT_ProtectionClassSearchField, strCP_Bldgs_TXT_ProtectionClass, constants.NA,
					constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_WindUplift_Yes(strCP_Bldgs_CHK_WindUplift_Yes), strCP_Bldgs_CHK_WindUplift_Yes, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_WindUplift_No(strCP_Bldgs_CHK_WindUplift_No), strCP_Bldgs_CHK_WindUplift_No, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_BuildingWindConstructionCode(strCP_Bldgs_TXT_BuildingWindConstructionCode),
					strCP_Bldgs_TXT_BuildingWindConstructionCode, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_GroupIISymbolDescription(strCP_Bldgs_TXT_GroupIISymbolDescription),
					strCP_Bldgs_TXT_GroupIISymbolDescription, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_DoyouwanttocopyTotalFloorArea(strCP_Bldgs_CHK_DoyouwanttocopyTotalFloorArea),
					strCP_Bldgs_CHK_DoyouwanttocopyTotalFloorArea, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Sqft(strCP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Sqft),
					strCP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Sqft, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Percnt(strCP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Percnt),
					strCP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Percnt, test);
			if (!strCP_Bldgs_TXT_SquareFootageoccupiedbyinsured.equalsIgnoreCase("N/A") && !strCP_Bldgs_TXT_SquareFootageoccupiedbyinsured.contains("validate2")) {
				se.element().clearTheField(getCP_Bldgs_TXT_SquareFootageoccupiedbyinsured(strCP_Bldgs_TXT_SquareFootageoccupiedbyinsured));
			}
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_SquareFootageoccupiedbyinsured(strCP_Bldgs_TXT_SquareFootageoccupiedbyinsured),
					strCP_Bldgs_TXT_SquareFootageoccupiedbyinsured, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_SquareFootgeOccupedpercent(strCP_Bldgs_TXT_SquareFootgeOccupedpercent),
					strCP_Bldgs_TXT_SquareFootgeOccupedpercent, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_DoesSubstandardConditionsApply(strCP_Bldgs_CHK_DoesSubstandardConditionsApply),
					strCP_Bldgs_CHK_DoesSubstandardConditionsApply, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_RatePlan(strCP_Bldgs_TXT_RatePlan), strCP_Bldgs_TXT_RatePlan, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_RatePlanDescription(strCP_Bldgs_TXT_RatePlanDescription), strCP_Bldgs_TXT_RatePlanDescription, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_TentativeRate(strCP_Bldgs_CHK_TentativeRate), strCP_Bldgs_CHK_TentativeRate, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_SecificRateGrooupIISymbol(strCP_Bldgs_TXT_SecificRateGrooupIISymbol),
					strCP_Bldgs_TXT_SecificRateGrooupIISymbol, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_NumberofStories(strCP_Bldgs_TXT_NumberofStories), strCP_Bldgs_TXT_NumberofStories, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_NumberofBasements(strCP_Bldgs_TXT_NumberofBasements), strCP_Bldgs_TXT_NumberofBasements, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_PercentOccupiedInsured(strCP_Bldgs_TXT_PercentOccupiedInsured),
					strCP_Bldgs_TXT_PercentOccupiedInsured, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_ApartmentPercentage(strCP_Bldgs_TXT_ApartmentPercentage), strCP_Bldgs_TXT_ApartmentPercentage, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_OfficePercentage(strCP_Bldgs_TXT_OfficePercentage), strCP_Bldgs_TXT_OfficePercentage, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_RestaurentPercentage(strCP_Bldgs_TXT_RestaurentPercentage), strCP_Bldgs_TXT_RestaurentPercentage, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_RetailSalePercentage(strCP_Bldgs_TXT_RetailSalePercentage), strCP_Bldgs_TXT_RetailSalePercentage, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_ServicesOccPercentage(strCP_Bldgs_TXT_ServicesOccPercentage),
					strCP_Bldgs_TXT_ServicesOccPercentage, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_ManufacturingPercentage(strCP_Bldgs_TXT_ManufacturingPercentage),
					strCP_Bldgs_TXT_ManufacturingPercentage, test);
			
			if((strIDwithTxnAndBldName.equalsIgnoreCase("TC_14_NewQuote_Location 2 Building 1"))) {
				se.element().selectPopupWithMagnifier(getCP_Bldgs_TXT_Construction(strCP_Bldgs_TXT_Construction),
						getCP_Bldgs_BTN_ConstructionLookupIcon(strCP_Bldgs_TXT_Construction), strCP_Bldgs_TXT_Construction,
						strCP_Bldgs_ConstructionFilter, strCP_Bldgs_TXT_Construction,
						strCP_Bldgs_TXT_ConstructionDetails_Popup, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_Bldgs_TXT_ConstructionDetails(strCP_Bldgs_TXT_ConstructionDetails), strCP_Bldgs_TXT_ConstructionDetails, test);
				se.util().sleep(5000);
			}

			String strCP_Bldgs_TXT_ConstructionDetails1 = Util.getActaulString(strCP_Bldgs_TXT_ConstructionDetails_Popup);
			
			if (!strIDwithTxnAndBldName.equalsIgnoreCase(
					"PM_23_NewQuote_Location 1 Building 1)||(PMSmoke_4_NewQuote_Location 1 Building 1")) {
				if (!strIDwithTxnAndBldName.equalsIgnoreCase("TC_14_NewQuote_Location 2 Building 1") && !strIDwithTxnAndBldName.equalsIgnoreCase("TC_14_QuoteForRenewal_Location 2 Building 1") && !strIDwithTxnAndBldName.equalsIgnoreCase("TC_2_NewQuote_Location 1 Building 1")) {
					if (!strCP_Bldgs_TXT_ConstructionDetails_Popup.equalsIgnoreCase("N/A")) {
						if (!getCP_Bldgs_TXT_ConstructionDetails(strCP_Bldgs_TXT_ConstructionDetails)
								.getAttribute("value").equalsIgnoreCase(strCP_Bldgs_TXT_ConstructionDetails1)) {
							se.element().selectPopupWithMagnifier(
									getCP_Bldgs_TXT_Construction(strCP_Bldgs_TXT_Construction),
									getCP_Bldgs_BTN_ConstructionLookupIcon(strCP_Bldgs_TXT_Construction),
									strCP_Bldgs_TXT_Construction, strCP_Bldgs_ConstructionFilter,
									strCP_Bldgs_TXT_Construction, strCP_Bldgs_TXT_ConstructionDetails_Popup,
									constants.NA, constants.NA, test);

							se.element().selectPopupWithMagnifier(
									getCP_Bldgs_TXT_BG1RATETYPE(strCP_Bldgs_TXT_BG1RATETYPE),
									getCP_Bldgs_BTN_BG1RATETYPE(strCP_Bldgs_TXT_BG1RATETYPE),
									strCP_Bldgs_TXT_BG1RATETYPE, constants.NA, strCP_Bldgs_TXT_BG1RATETYPE,
									constants.NA, constants.NA, constants.NA, test);

							se.element().selectPopupWithMagnifier(
									getCP_Bldgs_TXT_BGIIRATETYPE(strCP_Bldgs_TXT_BGIIRATETYPE),
									getCP_Bldgs_BTN_BGIIRATETYPE(strCP_Bldgs_TXT_BGIIRATETYPE),
									strCP_Bldgs_TXT_BGIIRATETYPE, constants.NA, strCP_Bldgs_TXT_BGIIRATETYPE,
									constants.NA, constants.NA, constants.NA, test);

						}
					}
				}
			}
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Bldgs_BuildingInformation", true, false, true,
					test);
		}
	}

	public void CP_Bldgs_AgeofBuilding(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCP_Bldgs_TXT_YearBuilt = (String) row.get("CP_Bldgs_TXT_YearBuilt");
		String strCP_Bldgs_CHK_Unknown = (String) row.get("CP_Bldgs_CHK_Unknown");
		String strCP_Bldgs_CHK_Updates = (String) row.get("CP_Bldgs_CHK_Updates");
		String strCP_Bldgs_TXT_RoofingYear = (String) row.get("CP_Bldgs_TXT_RoofingYear");
		String strCP_Bldgs_TXT_PlumbingYear = (String) row.get("CP_Bldgs_TXT_PlumbingYear");
		String strCP_Bldgs_TXT_HeatingYear = (String) row.get("CP_Bldgs_TXT_HeatingYear");
		String strCP_Bldgs_TXT_WiringYear = (String) row.get("CP_Bldgs_TXT_WiringYear");
		String strCP_Bldgs_TXT_BUROnsiteSurveyDate = (String) row.get("CP_Bldgs_TXT_BUROnsiteSurveyDate");
		
		try {
			se.element().enterOrValidateText(getCP_Bldgs_TXT_YearBuilt(strCP_Bldgs_TXT_YearBuilt),
					strCP_Bldgs_TXT_YearBuilt, test);
			se.util().sleep(2000);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_Unknown(strCP_Bldgs_CHK_Unknown),
					strCP_Bldgs_CHK_Unknown, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_Updates(strCP_Bldgs_CHK_Updates),
					strCP_Bldgs_CHK_Updates, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_RoofingYear(strCP_Bldgs_TXT_RoofingYear),
					strCP_Bldgs_TXT_RoofingYear, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_PlumbingYear(strCP_Bldgs_TXT_PlumbingYear),
					strCP_Bldgs_TXT_PlumbingYear, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_HeatingYear(strCP_Bldgs_TXT_HeatingYear),
					strCP_Bldgs_TXT_HeatingYear, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_WiringYear(strCP_Bldgs_TXT_WiringYear),
					strCP_Bldgs_TXT_WiringYear, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_BUROnsiteSurveyDate(strCP_Bldgs_TXT_BUROnsiteSurveyDate),
					strCP_Bldgs_TXT_BUROnsiteSurveyDate, test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Bldgs_AgeofBuilding", true, false, true, test);

		}
	}

	public void CP_Bldgs_AdditionalExclusions(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCP_Bldgs_CHK_ExcludeVandalism = (String) row.get("CP_Bldgs_CHK_ExcludeVandalism");
		String strCP_Bldgs_CHK_ExcludeSprinklerLeakage = (String) row.get("CP_Bldgs_CHK_ExcludeSprinklerLeakage");
		String strCP_Bldgs_CHK_ExcludeWindstormandHail = (String) row.get("CP_Bldgs_CHK_ExcludeWindstormandHail");
		String strCP_Bldgs_CHK_ExcludeTheft = (String) row.get("CP_Bldgs_CHK_ExcludeTheft");
		
		try {
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_ExcludeVandalism(strCP_Bldgs_CHK_ExcludeVandalism), strCP_Bldgs_CHK_ExcludeVandalism, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_ExcludeSprinklerLeakage(strCP_Bldgs_CHK_ExcludeSprinklerLeakage),
					strCP_Bldgs_CHK_ExcludeSprinklerLeakage, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_ExcludeWindstormandHail(strCP_Bldgs_CHK_ExcludeWindstormandHail),
					strCP_Bldgs_CHK_ExcludeWindstormandHail, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_ExcludeTheft(strCP_Bldgs_CHK_ExcludeTheft), strCP_Bldgs_CHK_ExcludeTheft, test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Bldgs_AdditionalExclusions", true, false, true, test);
		}
	}

	public void CP_Bldgs_BuildingCodeEffectivenessGrading(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCP_Bldgs_CHK_BCEG = (String) row.get("CP_Bldgs_CHK_BCEG");
		String strCP_Bldgs_CHK_IndividualGrading = (String) row.get("CP_Bldgs_CHK_IndividualGrading");
		String strCP_Bldgs_CHK_CommunityGrading = (String) row.get("CP_Bldgs_CHK_CommunityGrading");
		String strCP_Bldgs_CHK_SelectAddBGIIBCEGSCode = (String) row.get("CP_Bldgs_CHK_SelectAddBGIIBCEGSCode");
		String strCP_Bldgs_TXT_BGIIBCEGSCode = (String) row.get("CP_Bldgs_TXT_BGIIBCEGSCode");
		
		try {
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_BCEG(strCP_Bldgs_CHK_BCEG), strCP_Bldgs_CHK_BCEG, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_IndividualGrading(strCP_Bldgs_CHK_IndividualGrading), strCP_Bldgs_CHK_IndividualGrading, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_CommunityGrading(strCP_Bldgs_CHK_CommunityGrading), strCP_Bldgs_CHK_CommunityGrading, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_SelectAddBGIIBCEGSCode(strCP_Bldgs_CHK_SelectAddBGIIBCEGSCode),
					strCP_Bldgs_CHK_SelectAddBGIIBCEGSCode, test);
			se.element().selectPopupWithMagnifier(getCP_Bldgs_TXT_BGIIBCEGSCode(strCP_Bldgs_TXT_BGIIBCEGSCode),
					getCP_Bldgs_TXT_BGIIBCEGSCodeSearch(strCP_Bldgs_TXT_BGIIBCEGSCode), strCP_Bldgs_TXT_BGIIBCEGSCode,
					constants.NA, strCP_Bldgs_TXT_BGIIBCEGSCode, constants.NA, constants.NA, constants.NA, test);
			
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Bldgs_BuildingCodeEffectivenessGrading", true, false, true, test);
		}
	}

	public void CP_Bldgs_DeductibleOption(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCP_Bldgs_TXT_Deductible = (String) row.get("CP_Bldgs_TXT_Deductible");
		String strCP_Bldgs_CHK_WindHailDeductible = (String) row.get("CP_Bldgs_CHK_WindHailDeductible");
		String strCP_Bldgs_CHK_WHDedType_Amount = (String) row.get("CP_Bldgs_CHK_WHDedType_Amount");
		String strCP_Bldgs_CHK_WHDedType_Percentage = (String) row.get("CP_Bldgs_CHK_WHDedType_Percentage");
		String strCP_Bldgs_TXT_WHDedAmount = (String) row.get("CP_Bldgs_TXT_WHDedAmount");
		String strCP_Bldgs_TXT_WHDedPercentage = (String) row.get("CP_Bldgs_TXT_WHDedPercentage");
		String strCP_Bldgs_CHK_TheftDeductible = (String) row.get("CP_Bldgs_CHK_TheftDeductible");
		String strCP_Bldgs_TXT_TheftDeductibleAmount = (String) row.get("CP_Bldgs_TXT_TheftDeductibleAmount");
		String strCP_Bldgs_CHK_RoofSurfacingACV = (String) row.get("CP_Bldgs_CHK_RoofSurfacingACV");
		String strCP_Bldgs_CHK_RoofSurfacingCosmeticLossExclusion = (String) row.get("CP_Bldgs_CHK_RoofSurfacingCosmeticLossExclusion");
		
		try {
			se.element().selectPopupWithMagnifier(getCP_Bldgs_TXT_Deductible(strCP_Bldgs_TXT_Deductible),
					getCP_Bldgs_TXT_DeductibleSearch(strCP_Bldgs_TXT_Deductible), strCP_Bldgs_TXT_Deductible,
					constants.NA, strCP_Bldgs_TXT_Deductible, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_WindHailDeductible(strCP_Bldgs_CHK_WindHailDeductible), strCP_Bldgs_CHK_WindHailDeductible, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_WHDedType_Amount(strCP_Bldgs_CHK_WHDedType_Amount), strCP_Bldgs_CHK_WHDedType_Amount, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_WHDedType_Percentage(strCP_Bldgs_CHK_WHDedType_Percentage),
					strCP_Bldgs_CHK_WHDedType_Percentage, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_WHDedAmount(strCP_Bldgs_TXT_WHDedAmount), strCP_Bldgs_TXT_WHDedAmount, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_WHDedPercentage(strCP_Bldgs_TXT_WHDedPercentage), strCP_Bldgs_TXT_WHDedPercentage, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_TheftDeductible(strCP_Bldgs_CHK_TheftDeductible), strCP_Bldgs_CHK_TheftDeductible, test);
			se.element().selectPopupWithMagnifier(
					getCP_Bldgs_TXT_TheftDeductibleAmount(strCP_Bldgs_TXT_TheftDeductibleAmount),
					getCP_Bldgs_TXT_TheftDeductibleAmountSearch(strCP_Bldgs_TXT_TheftDeductibleAmount),
					strCP_Bldgs_TXT_TheftDeductibleAmount, constants.NA, strCP_Bldgs_TXT_TheftDeductibleAmount,
					constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_RoofSurfacingACV(strCP_Bldgs_CHK_RoofSurfacingACV), strCP_Bldgs_CHK_RoofSurfacingACV, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_RoofSurfacingCosmeticLossExclusion(
							strCP_Bldgs_CHK_RoofSurfacingCosmeticLossExclusion), strCP_Bldgs_CHK_RoofSurfacingCosmeticLossExclusion, test);
			
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Bldgs_DeductibleOption", true, false, true, test);
		}
	}

	public void CP_Bldgs_OtherCausesOfLoss(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCP_Bldgs_CHK_Pierandwhafraddcov = (String) row.get("CP_Bldgs_CHK_Pierandwhafraddcov");
		String strCP_Bldgs_CHK_Watercraftexclusion = (String) row.get("CP_Bldgs_CHK_Watercraftexclusion");
		String strCP_Bldgs_CHK_dev_rem_add_ins = (String) row.get("CP_Bldgs_CHK_dev_rem_add_ins");
		String strCP_Bldgs_TXT_special_form_territory = (String) row.get("CP_Bldgs_TXT_special_form_territory");
		String strCP_Bldgs_TXT_special_theft_deductible = (String) row.get("CP_Bldgs_TXT_special_theft_deductible");
		String strCP_Bldgs_CHK_DoesProtDevandSerClauseApply = (String) row.get("CP_Bldgs_CHK_DoesProtDevandSerClauseApply");
		String strCP_Bldgs_CHK_P1AutoSprinklerClause = (String) row.get("CP_Bldgs_CHK_P1AutoSprinklerClause");
		String strCP_Bldgs_CHK_P2AutoFireAlarmClause = (String) row.get("CP_Bldgs_CHK_P2AutoFireAlarmClause");
		String strCP_Bldgs_CHK_P3SecurityServiceClause = (String) row.get("CP_Bldgs_CHK_P3SecurityServiceClause");
		String strCP_Bldgs_CHK_P4ServiceContractClause = (String) row.get("CP_Bldgs_CHK_P4ServiceContractClause");
		String strCP_Bldgs_CHK_P9OtherProtSystems = (String) row.get("CP_Bldgs_CHK_P9OtherProtSystems");
		String strCP_Bldgs_TXT_OtherProtSystemsDesc = (String) row.get("CP_Bldgs_TXT_OtherProtSystemsDesc");
		String strCP_Bldgs_CHK_do_pro_dev_ser_cla_app = (String) row.get("CP_Bldgs_CHK_do_pro_dev_ser_cla_app");
		String strCP_Bldgs_CHK_BurgandRobbProtSafeguards = (String) row.get("CP_Bldgs_CHK_BurgandRobbProtSafeguards");
		String strCP_Bldgs_CHK_in_add_liv_ex = (String) row.get("CP_Bldgs_CHK_in_add_liv_ex");
		String strCP_Bldgs_CHK_BR1AutoBurglaryAlarm = (String) row.get("CP_Bldgs_CHK_BR1AutoBurglaryAlarm");
		String strCP_Bldgs_CHK_BR2AutoBurglaryAlarm = (String) row.get("CP_Bldgs_CHK_BR2AutoBurglaryAlarm");
		String strCP_Bldgs_CHK_BR3SecurityService = (String) row.get("CP_Bldgs_CHK_BR3SecurityService");
		String strCP_Bldgs_CHK_BR4OtherDescription = (String) row.get("CP_Bldgs_CHK_BR4OtherDescription");
		String strCP_Bldgs_TXT_ProtectiveSafeBR4Descr = (String) row.get("CP_Bldgs_TXT_ProtectiveSafeBR4Descr");
		String strCP_Bldgs_TXT_WatchmanService = (String) row.get("CP_Bldgs_TXT_WatchmanService");
		String strCP_Bldgs_TXT_BurglarAlarmSystem = (String) row.get("CP_Bldgs_TXT_BurglarAlarmSystem");
		String strCP_Bldgs_TXT_extent_of_protection = (String) row.get("CP_Bldgs_TXT_extent_of_protection");
		String strCP_Bldgs_TXT_Credit = (String) row.get("CP_Bldgs_TXT_Credit");
		String strCP_Bldgs_TXT_credit_type_1 = (String) row.get("CP_Bldgs_TXT_credit_type_1");
		String strCP_Bldgs_CHK_heat_n_Coo = (String) row.get("CP_Bldgs_CHK_heat_n_Coo");
		String strCP_Bldgs_CHK_Wiring = (String) row.get("CP_Bldgs_CHK_Wiring");
		String strCP_Bldgs_CHK_Conversion = (String) row.get("CP_Bldgs_CHK_Conversion");
		String strCP_Bldgs_CHK_Phy_con_n_hou = (String) row.get("CP_Bldgs_CHK_Phy_con_n_hou");
		String strCP_Bldgs_CHK_exposure = (String) row.get("CP_Bldgs_CHK_exposure");
		
		try {
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_Pierandwhafraddcov(strCP_Bldgs_CHK_Pierandwhafraddcov), strCP_Bldgs_CHK_Pierandwhafraddcov, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_Watercraftexclusion(strCP_Bldgs_CHK_Watercraftexclusion),
					strCP_Bldgs_CHK_Watercraftexclusion, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_dev_rem_add_ins(strCP_Bldgs_CHK_dev_rem_add_ins), strCP_Bldgs_CHK_dev_rem_add_ins, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_special_form_territory(strCP_Bldgs_TXT_special_form_territory),
					strCP_Bldgs_TXT_special_form_territory, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_special_theft_deductible(strCP_Bldgs_TXT_special_theft_deductible),
					strCP_Bldgs_TXT_special_theft_deductible, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_DoesProtDevandSerClauseApply(strCP_Bldgs_CHK_DoesProtDevandSerClauseApply),
					strCP_Bldgs_CHK_DoesProtDevandSerClauseApply, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_P1AutoSprinklerClause(strCP_Bldgs_CHK_P1AutoSprinklerClause),
					strCP_Bldgs_CHK_P1AutoSprinklerClause, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_P2AutoFireAlarmClause(strCP_Bldgs_CHK_P2AutoFireAlarmClause),
					strCP_Bldgs_CHK_P2AutoFireAlarmClause, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_P3SecurityServiceClause(strCP_Bldgs_CHK_P3SecurityServiceClause),
					strCP_Bldgs_CHK_P3SecurityServiceClause, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_P4ServiceContractClause(strCP_Bldgs_CHK_P4ServiceContractClause),
					strCP_Bldgs_CHK_P4ServiceContractClause, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_P9OtherProtSystems(strCP_Bldgs_CHK_P9OtherProtSystems),
					strCP_Bldgs_CHK_P9OtherProtSystems, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_OtherProtSystemsDesc(strCP_Bldgs_TXT_OtherProtSystemsDesc),
					strCP_Bldgs_TXT_OtherProtSystemsDesc, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_do_pro_dev_ser_cla_app(strCP_Bldgs_CHK_do_pro_dev_ser_cla_app),
					strCP_Bldgs_CHK_do_pro_dev_ser_cla_app, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_BurgandRobbProtSafeguards(strCP_Bldgs_CHK_BurgandRobbProtSafeguards),
					strCP_Bldgs_CHK_BurgandRobbProtSafeguards, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_in_add_liv_ex(strCP_Bldgs_CHK_in_add_liv_ex),
					strCP_Bldgs_CHK_in_add_liv_ex, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_BR1AutoBurglaryAlarm(strCP_Bldgs_CHK_BR1AutoBurglaryAlarm),
					strCP_Bldgs_CHK_BR1AutoBurglaryAlarm, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_BR2AutoBurglaryAlarm(strCP_Bldgs_CHK_BR2AutoBurglaryAlarm),
					strCP_Bldgs_CHK_BR2AutoBurglaryAlarm, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_BR3SecurityService(strCP_Bldgs_CHK_BR3SecurityService),
					strCP_Bldgs_CHK_BR3SecurityService, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_BR4OtherDescription(strCP_Bldgs_CHK_BR4OtherDescription),
					strCP_Bldgs_CHK_BR4OtherDescription, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_ProtectiveSafeBR4Descr(strCP_Bldgs_TXT_ProtectiveSafeBR4Descr),
					strCP_Bldgs_TXT_ProtectiveSafeBR4Descr, test);
			se.element().selectPopupWithMagnifier(getCP_Bldgs_TXT_WatchmanService(strCP_Bldgs_TXT_WatchmanService),
					getCP_Bldgs_TXT_WatchmanServiceSearch(strCP_Bldgs_TXT_WatchmanService),
					strCP_Bldgs_TXT_WatchmanService, constants.NA, strCP_Bldgs_TXT_WatchmanService, constants.NA,
					constants.NA, constants.NA, test);
			se.element().selectPopupWithMagnifier(
					getCP_Bldgs_TXT_BurglarAlarmSystem(strCP_Bldgs_TXT_BurglarAlarmSystem),
					getCP_Bldgs_TXT_BurglarAlarmSystemSearch(strCP_Bldgs_TXT_BurglarAlarmSystem),
					strCP_Bldgs_TXT_BurglarAlarmSystem, constants.NA, strCP_Bldgs_TXT_BurglarAlarmSystem, constants.NA,
					constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_extent_of_protection(strCP_Bldgs_TXT_extent_of_protection), strCP_Bldgs_TXT_extent_of_protection, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_Credit(strCP_Bldgs_TXT_Credit), strCP_Bldgs_TXT_Credit, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_credit_type_1(strCP_Bldgs_TXT_credit_type_1), strCP_Bldgs_TXT_credit_type_1, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_heat_n_Coo(strCP_Bldgs_CHK_heat_n_Coo), strCP_Bldgs_CHK_heat_n_Coo, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_Wiring(strCP_Bldgs_CHK_Wiring), strCP_Bldgs_CHK_Wiring, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_Conversion(strCP_Bldgs_CHK_Conversion), strCP_Bldgs_CHK_Conversion, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_Phy_con_n_hou(strCP_Bldgs_CHK_Phy_con_n_hou), strCP_Bldgs_CHK_Phy_con_n_hou, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_exposure(strCP_Bldgs_CHK_exposure), strCP_Bldgs_CHK_exposure, test);

		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Bldgs_OtherCausesOfLoss", true, false, true, test);
		}
	}

	public void CP_Bldgs_MineSubsidence(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCP_Bldgs_CHK_does_mine_sub_aply = (String) row.get("CP_Bldgs_CHK_does_mine_sub_aply");
		String strCP_Bldgs_TXT_occupancy_type = (String) row.get("CP_Bldgs_TXT_occupancy_type");
		String strCP_Bldgs_TXT_BuildingType = (String) row.get("CP_Bldgs_TXT_BuildingType");
		String strCP_Bldgs_TXT_mine_sub_limit = (String) row.get("CP_Bldgs_TXT_mine_sub_limit");

		try {
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_does_mine_sub_aply(strCP_Bldgs_CHK_does_mine_sub_aply), strCP_Bldgs_CHK_does_mine_sub_aply, test);
			se.element().waitForElement(InfoOKbutton, 10);
			
			if (se.element().isElementPresent(InfoOKbutton)) {
				se.element().Click(getInfoOKbutton(), test);
			}
			se.element().enterOrValidateText(getCP_Bldgs_TXT_occupancy_type(strCP_Bldgs_TXT_occupancy_type), strCP_Bldgs_TXT_occupancy_type, test);
			se.element().selectPopupWithMagnifier(getCP_Bldgs_BuildingType(strCP_Bldgs_TXT_BuildingType),
					getCP_Bldgs_BuildingTypeSeach(strCP_Bldgs_TXT_BuildingType), strCP_Bldgs_TXT_BuildingType,
					constants.NA, strCP_Bldgs_TXT_BuildingType, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_mine_sub_limit(strCP_Bldgs_TXT_mine_sub_limit), strCP_Bldgs_TXT_mine_sub_limit, test);
			
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Bldgs_MineSubsidence", true, false, true, test);

		}
	}

	public void CP_Bldgs_BuildingOptions(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCP_Bldgs_CHK_FireDepartSerChargeIncrLimit = (String) row.get("CP_Bldgs_CHK_FireDepartSerChargeIncrLimit");
		String strCP_Bldgs_TXT_FireSerIncreasedLimit = (String) row.get("CP_Bldgs_TXT_FireSerIncreasedLimit");
		String strCP_Bldgs_CHK_DebrisRemAddInsurance = (String) row.get("CP_Bldgs_CHK_DebrisRemAddInsurance");
		String strCP_Bldgs_CHK_IncludeFloodCoverage = (String) row.get("CP_Bldgs_CHK_IncludeFloodCoverage");
		String strCP_Bldgs_TXT_BOConstruction = (String) row.get("CP_Bldgs_TXT_BOConstruction");
		
		try {
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_FireDepartSerChargeIncrLimit(strCP_Bldgs_CHK_FireDepartSerChargeIncrLimit),
					strCP_Bldgs_CHK_FireDepartSerChargeIncrLimit, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_FireSerIncreasedLimit(strCP_Bldgs_TXT_FireSerIncreasedLimit),
					strCP_Bldgs_TXT_FireSerIncreasedLimit, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_DebrisRemAddInsurance(strCP_Bldgs_CHK_DebrisRemAddInsurance),
					strCP_Bldgs_CHK_DebrisRemAddInsurance, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_IncludeFloodCoverage(strCP_Bldgs_CHK_IncludeFloodCoverage),
					strCP_Bldgs_CHK_IncludeFloodCoverage, test);
			se.element().selectPopupWithMagnifier(getCP_Bldgs_TXT_BOConstruction(strCP_Bldgs_TXT_BOConstruction),
					getCP_Bldgs_TXT_FloodCov_Construction_Search(strCP_Bldgs_TXT_BOConstruction),
					strCP_Bldgs_TXT_BOConstruction, constants.NA, strCP_Bldgs_TXT_BOConstruction, constants.NA,
					constants.NA, constants.NA, test);
			
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Bldgs_BuildingOptions", true, false, true, test);
		}
	}

	public void CP_Bldgs_EarthquakeInformation(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCP_Bldgs_CHK_EarthquakeCoverage = (String) row.get("CP_Bldgs_CHK_EarthquakeCoverage");
		String strCP_Bldgs_CHK_Earthquake = (String) row.get("CP_Bldgs_CHK_Earthquake");
		String strCP_Bldgs_CHK_Earthquakesublimit = (String) row.get("CP_Bldgs_CHK_Earthquakesublimit");
		String strCP_Bldgs_TXT_EarthquakeTerritory = (String) row.get("CP_Bldgs_TXT_EarthquakeTerritory");
		String strCP_Bldgs_TXT_EarthquakeBuildingClassPopup = (String) row.get("CP_Bldgs_TXT_EarthquakeBuildingClassPopup");
		String strCP_Bldgs_TXT_EarthquakeBuildingClass = (String) row.get("CP_Bldgs_TXT_EarthquakeBuildingClass");
		String strCP_Bldgs_TXT_EarthquakeBuildingClassDescription = (String) row.get("CP_Bldgs_TXT_EarthquakeBuildingClassDescription");
		String strCP_Bldgs_TXT_EarthquakeMandatoryDeductiblePercent = (String) row.get("CP_Bldgs_TXT_EarthquakeMandatoryDeductiblePercent");
		String strCP_Bldgs_TXT_PropertyDamageDeductiblePercent = (String) row.get("CP_Bldgs_TXT_PropertyDamageDeductiblePercent");
		String strCP_Bldgs_CHK_IncreasedAnnualAggregateLimit = (String) row.get("CP_Bldgs_CHK_IncreasedAnnualAggregateLimit");
		String strCP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercent = (String) row.get("CP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercent");
		String strCP_Bldgs_CHK_EQSprinklerLeakageOnly = (String) row.get("CP_Bldgs_CHK_EQSprinklerLeakageOnly");
		String strCP_Bldgs_TXT_EarthquakeBCEGSCode = (String) row.get("CP_Bldgs_TXT_EarthquakeBCEGSCode");
		String strCP_Bldgs_TXT_NumberofStories = (String) row.get("CP_Bldgs_TXT_NumberofStories");
		String strCP_Bldgs_TXT_MasonryVeneer = (String) row.get("CP_Bldgs_TXT_MasonryVeneer");
		String strCP_Bldgs_CHK_RoofTankHazard = (String) row.get("CP_Bldgs_CHK_RoofTankHazard");
		
		try {
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_EarthquakeCoverage(strCP_Bldgs_CHK_EarthquakeCoverage),strCP_Bldgs_CHK_EarthquakeCoverage, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_Earthquake(strCP_Bldgs_CHK_Earthquake),strCP_Bldgs_CHK_Earthquake, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_Earthquakesublimit(strCP_Bldgs_CHK_Earthquakesublimit),strCP_Bldgs_CHK_Earthquakesublimit, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_EarthquakeTerritory(strCP_Bldgs_TXT_EarthquakeTerritory),strCP_Bldgs_TXT_EarthquakeTerritory, test);
			se.element().selectPopupWithMagnifier(
					getCP_Bldgs_TXT_EarthquakeBuildingClass(strCP_Bldgs_TXT_EarthquakeBuildingClass),
					getCP_Bldgs_TXT_EarthquakeBuildingClassSearch(strCP_Bldgs_TXT_EarthquakeBuildingClass),
					strCP_Bldgs_TXT_EarthquakeBuildingClass, strCP_Bldgs_TXT_EarthquakeBuildingClassPopup,
					strCP_Bldgs_TXT_EarthquakeBuildingClass, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(
					getCP_Bldgs_TXT_EarthquakeMandatoryDeductiblePercent(
							strCP_Bldgs_TXT_EarthquakeMandatoryDeductiblePercent),
					strCP_Bldgs_TXT_EarthquakeMandatoryDeductiblePercent, test);
			se.element().selectPopupWithMagnifier(
					getCP_Bldgs_TXT_PropertyDamageDeductiblePercent(strCP_Bldgs_TXT_PropertyDamageDeductiblePercent),
					getCP_Bldgs_TXT_PropertyDamageDeductiblePercentSearch(
							strCP_Bldgs_TXT_PropertyDamageDeductiblePercent),
					strCP_Bldgs_TXT_PropertyDamageDeductiblePercent, constants.NA,
					strCP_Bldgs_TXT_PropertyDamageDeductiblePercent, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_IncreasedAnnualAggregateLimit(strCP_Bldgs_CHK_IncreasedAnnualAggregateLimit),
					strCP_Bldgs_CHK_IncreasedAnnualAggregateLimit, test);
			se.element().selectPopupWithMagnifier(
					getCP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercent(
							strCP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercent),
					getCP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercentSearch(
							strCP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercent),
					strCP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercent, constants.NA,
					strCP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercent, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_EQSprinklerLeakageOnly(strCP_Bldgs_CHK_EQSprinklerLeakageOnly),
					strCP_Bldgs_CHK_EQSprinklerLeakageOnly, test);
			se.element().selectPopupWithMagnifier(
					getCP_Bldgs_TXT_EarthquakeBCEGSCode(strCP_Bldgs_TXT_EarthquakeBCEGSCode),
					getCP_Bldgs_TXT_EarthquakeBCEGSCodeSearch(strCP_Bldgs_TXT_EarthquakeBCEGSCode),
					strCP_Bldgs_TXT_EarthquakeBCEGSCode, constants.NA, strCP_Bldgs_TXT_EarthquakeBCEGSCode,
					constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_NumberofStories(strCP_Bldgs_TXT_NumberofStories),strCP_Bldgs_TXT_NumberofStories, test);
			se.element().enterOrValidateText(getCP_Bldgs_TXT_MasonryVeneer(strCP_Bldgs_TXT_MasonryVeneer),strCP_Bldgs_TXT_MasonryVeneer, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_RoofTankHazard(strCP_Bldgs_CHK_RoofTankHazard),strCP_Bldgs_CHK_RoofTankHazard, test);

		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Bldgs_EarthquakeInformation", true, false, true,test);
		}
	}

	public void CP_Bldgs_PropertyCoverages(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCP_Bldgs_CHK_IncludeFloodCoverage = (String) row.get("CP_Bldgs_CHK_IncludeFloodCoverage");
		String strCP_Bldgs_CHK_BuildingCoverage = (String) row.get("CP_Bldgs_CHK_BuildingCoverage");
		String strCP_Bldgs_CHK_PersonalPropertyCoverage = (String) row.get("CP_Bldgs_CHK_PersonalPropertyCoverage");
		String strCP_Bldgs_CHK_BusinessIncome = (String) row.get("CP_Bldgs_CHK_BusinessIncome");
		String strCP_Bldgs_CHK_SpecialClassCoverage = (String) row.get("CP_Bldgs_CHK_SpecialClassCoverage");
		String strCP_Bldgs_CHK_UtilityServiceCoverage = (String) row.get("CP_Bldgs_CHK_UtilityServiceCoverage");
		String strCP_Bldgs_CHK_VacancyPermitCoverage = (String) row.get("CP_Bldgs_CHK_VacancyPermitCoverage");
		String strCP_Bldgs_CHK_ExtraExpenseCoverage = (String) row.get("CP_Bldgs_CHK_ExtraExpenseCoverage");
		String strCP_Bldgs_CHK_MortgageholdersEOcoverage = (String) row.get("CP_Bldgs_CHK_MortgageholdersEOcoverage");
		
		try {
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_IncludeFloodCoverage(strCP_Bldgs_CHK_IncludeFloodCoverage),
					strCP_Bldgs_CHK_IncludeFloodCoverage, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_BuildingCoverage(strCP_Bldgs_CHK_BuildingCoverage),
					strCP_Bldgs_CHK_BuildingCoverage, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_PersonalPropertyCoverage(strCP_Bldgs_CHK_PersonalPropertyCoverage),
					strCP_Bldgs_CHK_PersonalPropertyCoverage, test);
			se.element().checkUncheckOrValidate(getCP_Bldgs_CHK_BusinessIncome(strCP_Bldgs_CHK_BusinessIncome),
					strCP_Bldgs_CHK_BusinessIncome, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_SpecialClassCoverage(strCP_Bldgs_CHK_SpecialClassCoverage),
					strCP_Bldgs_CHK_SpecialClassCoverage, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_UtilityServiceCoverage(strCP_Bldgs_CHK_UtilityServiceCoverage),
					strCP_Bldgs_CHK_UtilityServiceCoverage, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_VacancyPermitCoverage(strCP_Bldgs_CHK_VacancyPermitCoverage),
					strCP_Bldgs_CHK_VacancyPermitCoverage, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_ExtraExpenseCoverage(strCP_Bldgs_CHK_ExtraExpenseCoverage),
					strCP_Bldgs_CHK_ExtraExpenseCoverage, test);
			se.element().checkUncheckOrValidate(
					getCP_Bldgs_CHK_MortgageholdersEOcoverage(strCP_Bldgs_CHK_MortgageholdersEOcoverage),
					strCP_Bldgs_CHK_MortgageholdersEOcoverage, test);
			
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Bldgs_PropertyCoverages", true, false, true,test);
		}
	}
}
