package pw.pages.DO;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_DO;

public class CP_DirectorsAndOfficers extends OR_DO {

	public void CP_DOMainPage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.DO_Main)){
			 test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.DO_Main, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		
			String strDO_CondominiumOrAssociation = (String) row.get("DO_CondominiumOrAssociation");
			String strDO_Condo_NamedAssociation = (String) row.get("DO_Condo_NamedAssociation");
			String strDO_Condo_Limit = (String) row.get("DO_Condo_Limit");
			String strDO_Condo_Residential_Condos = (String) row.get("DO_Condo_Residential_Condos");
			String strDO_Condo_ResCondo_NumOfUnits = (String) row.get("DO_Condo_ResCondo_NumOfUnits");
			String strDO_Condo_HomeOwner_Association = (String) row.get("DO_Condo_HomeOwner_Association");
			String strDO_Condo_HomeOwner_NoOfUnits = (String) row.get("DO_Condo_HomeOwner_NoOfUnits");
			String strDO_Condo_Commercial_Condos = (String) row.get("DO_Condo_Commercial_Condos");
			String strDO_Condo_Commercial_SqFt = (String) row.get("DO_Condo_Commercial_SqFt");
			
			String strDO_NotForProfit = (String) row.get("DO_NotForProfit");
			String strDO_NotForProfit_HazardGroup = (String) row.get("DO_NotForProfit_HazardGroup");
			String strDO_NotForProfit_AssetLevels = (String) row.get("DO_NotForProfit_AssetLevels");
			String strDO_NotForProfit_SeperateDefenseLimit = (String) row.get("DO_NotForProfit_SeperateDefenseLimit");
			String strDO_NotForProfit_Premium = (String) row.get("DO_NotForProfit_Premium");
			String strDO_NotForProfit_OverridePremium = (String) row.get("DO_NotForProfit_OverridePremium");
			String strDO_NotForProfit_OverridePremiumReason = (String) row.get("DO_NotForProfit_OverridePremiumReason");
			String strDO_NotForProfit_OverridePremiumReason_FilterNeeded = (String) row.get("DO_NotForProfit_OverridePremiumReason_FilterNeeded");
			String strDO_RetroactiveDate = (String) row.get("DO_RetroactiveDate");
			String strDO_TerrorismCertifiedActsCov = (String) row.get("DO_TerrorismCertifiedActsCov");
			String strDO_MiscellaneousCov = (String) row.get("DO_MiscellaneousCov");
			String strDO_SecuraManuscript = (String) row.get("DO_SecuraManuscript");
			String strDO_ExtendedReportingPeriod = (String) row.get("DO_ExtendedReportingPeriod");
			
			String strDO_KYTax_DoNotApplyCityOrCountyTaxes = (String) row.get("DO_KYTax_DoNotApplyCityOrCountyTaxes");
			String strDO_KYTax_AllCityName = (String) row.get("DO_KYTax_AllCityName");
			String strDO_KYTax_City = (String) row.get("DO_KYTax_City");
			String strDO_KYTax_CityCode = (String) row.get("DO_KYTax_CityCode");
			String strDO_KYTax_County = (String) row.get("DO_KYTax_County");
			String strDO_KYTax_CountyCode = (String) row.get("DO_KYTax_CountyCode");
			String strDO_KYTax_TaxCode = (String) row.get("DO_KYTax_TaxCode");
			String strDO_KYTax_State = (String) row.get("DO_KYTax_State");
			
			try{
				se.log().logTestStep("Entering details on Directors and Officers");
				test.log(LogStatus.INFO, "Entering details on Directors and Officers screen","Transaction Step : "+ transaction + "<br>" +"Page : Directos and officers");
				
				//se.verify().verifyEquals("Directors and Officers Page ", getPagecontainingtext(constants.DOPg).isDisplayed(),true, true,test);
				se.verify().verifyEquals("Directors and Officers Page ", getCP_DO_LabelName().isDisplayed(),true, true,test);
				se.element().checkUncheckOrValidate(getCP_DO_CHK_CondoOrAsso(strDO_CondominiumOrAssociation), strDO_CondominiumOrAssociation, test);
				if(strDO_CondominiumOrAssociation.equalsIgnoreCase(constants.Check)){
					//perform action related to Condominium or Association
					se.element().enterOrValidateText(getCP_DO_TXT_CondOrAss_NamedAssoc(strDO_Condo_NamedAssociation), strDO_Condo_NamedAssociation, test);
					
					/*se.element().enterOrValidateText(getCP_DO_TXT_CondOrAss_Limit(strDO_Condo_Limit), strDO_Condo_Limit, test);*/
					se.element().selectPopupWithMagnifier(getCP_DO_TXT_CondOrAss_Limit(strDO_Condo_Limit), getCP_DO_TXT_CondOrAss_Limit_Search(strDO_Condo_Limit), strDO_Condo_Limit, constants.NA, strDO_Condo_Limit, constants.NA, constants.NA, constants.NA, test);
					se.element().checkUncheckOrValidate(getCP_DO_CHK_CondOrAss_ResdnCondo(strDO_Condo_Residential_Condos), strDO_Condo_Residential_Condos, test);
					/*if(!strDO_Condo_ResCondo_NumOfUnits.equalsIgnoreCase("N/A") && !strDO_Condo_ResCondo_NumOfUnits.contains("validate2")) {
						se.element().clickSearchIcon(getCP_DO_BTN_CondOrAss_ResCond_NoOfUnitsrSearc(),test);
						se.element().Click(getCP_DO_LNK_CondOrAss_ResCond_NoOfUnitsption(strDO_Condo_ResCondo_NumOfUnits),strDO_Condo_ResCondo_NumOfUnits,test);
					}else {
						se.element().enterOrValidateText(getCP_DO_TXT_CondOrAss_ResCond_NoOfUnits(strDO_Condo_ResCondo_NumOfUnits),strDO_Condo_ResCondo_NumOfUnits,test);
					}*/
					se.element().selectPopupWithMagnifier(getCP_DO_TXT_CondOrAss_ResCond_NoOfUnits(strDO_Condo_ResCondo_NumOfUnits), getCP_DO_BTN_CondOrAss_ResCond_NoOfUnitsrSearch(strDO_Condo_ResCondo_NumOfUnits), strDO_Condo_ResCondo_NumOfUnits, constants.NA, strDO_Condo_ResCondo_NumOfUnits, constants.NA, constants.NA, constants.NA, test);
					
					se.element().checkUncheckOrValidate(getCP_DO_CHK_CondOrAss_HmOwnrAsso(strDO_Condo_HomeOwner_Association), strDO_Condo_HomeOwner_Association, test);
					/*se.element().enterOrValidateText(getCP_DO_TXT_CondOrAss_HmOwnrAss_NoOfUnits(strDO_Condo_HomeOwner_NoOfUnits), strDO_Condo_HomeOwner_NoOfUnits, test);*/
					se.element().selectPopupWithMagnifier(getCP_DO_TXT_CondOrAss_HmOwnrAss_NoOfUnits(strDO_Condo_HomeOwner_NoOfUnits), getCP_DO_TXT_CondOrAss_HmOwnrAss_NoOfUnits_Search(strDO_Condo_HomeOwner_NoOfUnits), strDO_Condo_HomeOwner_NoOfUnits, constants.NA, strDO_Condo_HomeOwner_NoOfUnits, constants.NA, constants.NA, constants.NA, test);
					se.element().checkUncheckOrValidate(getCP_DO_CHK_CondOrAss_CommCondo(strDO_Condo_Commercial_Condos), strDO_Condo_Commercial_Condos, test);
					/*se.element().enterOrValidateText(getCP_DO_TXT_CondOrAss_CommCondo_SqFt(strDO_Condo_Commercial_SqFt), strDO_Condo_Commercial_SqFt, test);*/
					se.element().selectPopupWithMagnifier(getCP_DO_TXT_CondOrAss_CommCondo_SqFt(strDO_Condo_Commercial_SqFt), getCP_DO_TXT_CondOrAss_CommCondo_SqFt_Search(strDO_Condo_Commercial_SqFt), strDO_Condo_Commercial_SqFt, constants.NA, strDO_Condo_Commercial_SqFt, constants.NA, constants.NA, constants.NA, test);
				}
				
					se.element().checkUncheckOrValidate(getCP_DO_CHK_NotForProfit(strDO_NotForProfit), strDO_NotForProfit, test);
				
					/*se.element().enterOrValidateText(getCP_DO_TXT_NotForProfit_HazedGrp(strDO_NotForProfit_HazardGroup), strDO_NotForProfit_HazardGroup, test);*/
					se.element().selectPopupWithMagnifier(getCP_DO_TXT_NotForProfit_HazedGrp(strDO_NotForProfit_HazardGroup), getCP_DO_TXT_NotForProfit_HazedGrp_Search(strDO_NotForProfit_HazardGroup), strDO_NotForProfit_HazardGroup, constants.NA, strDO_NotForProfit_HazardGroup, constants.NA, constants.NA, constants.NA, test);
					se.element().enterOrValidateText(getCP_DO_TXT_NotForProfit_AssetLevel(strDO_NotForProfit_AssetLevels), strDO_NotForProfit_AssetLevels, test);
					se.element().checkUncheckOrValidate(getCP_DO_CHK_NotForProfit_SepDefLimit(strDO_NotForProfit_SeperateDefenseLimit), strDO_NotForProfit_SeperateDefenseLimit, test);
					se.element().enterOrValidateText(getCP_DO_TXT_NotForProfit_Premium(strDO_NotForProfit_Premium), strDO_NotForProfit_Premium, test);
					se.element().enterOrValidateText(getCP_DO_TXT_NotForProfit_OverridePrem(strDO_NotForProfit_OverridePremium), strDO_NotForProfit_OverridePremium, test);
					//se.element().waitForElement(CP_DO_TXT_NotForProfit_OverridePrem_Reason, 50);
					/*se.element().enterOrValidateText(getCP_DO_TXT_NotForProfit_OverridePrem_Reason(strDO_NotForProfit_OverridePremiumReason), strDO_NotForProfit_OverridePremiumReason, test);*/
					se.element().selectPopupWithMagnifier(getCP_DO_TXT_NotForProfit_OverridePrem_Reason(strDO_NotForProfit_OverridePremiumReason), getCP_DO_TXT_NotForProfit_OverridePrem_Reason_Search(strDO_NotForProfit_OverridePremiumReason), strDO_NotForProfit_OverridePremiumReason, strDO_NotForProfit_OverridePremiumReason_FilterNeeded, strDO_NotForProfit_OverridePremiumReason, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_DO_TXT_RetroDate(strDO_RetroactiveDate), strDO_RetroactiveDate, test);
				se.element().checkUncheckOrValidate(getCP_DO_CHK_TerrorismCertActCov(strDO_TerrorismCertifiedActsCov), strDO_TerrorismCertifiedActsCov, test);
				se.element().checkUncheckOrValidate(getCP_DO_CHK_MiscCov(strDO_MiscellaneousCov), strDO_MiscellaneousCov, test);
				se.element().checkUncheckOrValidate(getCP_DO_CHK_SECURAManuscript(strDO_SecuraManuscript), strDO_SecuraManuscript, test);
				
				// Added KY Tax fields
				se.element().checkUncheckOrValidate(getDO_KYTax_DoNotApplyCityOrCountyTaxes(strDO_KYTax_DoNotApplyCityOrCountyTaxes),strDO_KYTax_DoNotApplyCityOrCountyTaxes,test);
				se.element().checkUncheckOrValidate(getDO_KYTax_AllCityName(strDO_KYTax_AllCityName),strDO_KYTax_AllCityName,test);
				se.element().enterOrValidateText(getDO_KYTax_City(strDO_KYTax_City),strDO_KYTax_City,test);
				se.element().enterOrValidateText(getDO_KYTax_CityCode(strDO_KYTax_CityCode),strDO_KYTax_CityCode,test);
				se.element().enterOrValidateText(getDO_KYTax_County(strDO_KYTax_County),strDO_KYTax_County,test);
				se.element().enterOrValidateText(getDO_KYTax_CountyCode(strDO_KYTax_CountyCode),strDO_KYTax_CountyCode,test);
				se.element().enterOrValidateText(getDO_KYTax_TaxCode(strDO_KYTax_TaxCode),strDO_KYTax_TaxCode,test);
				
				se.util().sleep(2000);
				se.element().Click(getNext(),test);
				
				
			} catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for DO_Main Page ", true, false, true, test);
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
		
