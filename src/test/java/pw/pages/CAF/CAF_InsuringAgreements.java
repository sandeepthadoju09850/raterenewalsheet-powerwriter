package pw.pages.CAF;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_Crime;

public class CAF_InsuringAgreements extends OR_Crime{
	
public void CAF_InsuringAgreementsPage(String strRegressionID,String transaction,ExtentTest test) throws IOException {
	try{
	String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
    if(SuspendSheet.equalsIgnoreCase("Crime_InsuringAgreements")){
    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
         testTearDown(se, test);
    }
    

	List<Map<String, String>> table = ExcelOperations.getPagesData("Crime_InsuringAgreements", strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCrime_InsuringAgreements_BTN_Add = (String) row.get("Crime_InsuringAgreements_BTN_Add");
		String strCrime_InsuringAgreements_BTN_Edit = (String) row.get("Crime_InsuringAgreements_BTN_Edit");
		String strCrime_InsuringAgreements_BTN_Done = (String) row.get("Crime_InsuringAgreements_BTN_Done");
		String strCrime_InsuringAgreements_BTN_Delete = (String) row.get("Crime_InsuringAgreements_BTN_Delete");
		String strCrime_InsuringAgreements_CHK_AgreementSelect = (String) row.get("Crime_InsuringAgreements_CHK_AgreementSelect");
		try {	
			se.verify().verifyEquals("Insuring Agreement Details of PowerWriter ", getAdd().isDisplayed(),true, true,test);
			
			if(strCrime_InsuringAgreements_BTN_Add.equalsIgnoreCase(constants.Yes)) {
				se.element().Click(getAdd(),test);
			}
			if(strCrime_InsuringAgreements_BTN_Edit.equalsIgnoreCase(constants.Yes)) {
				se.element().Click(getCrime_InsuringAgreements_BTN_Edit(),test);
			}
			if(strCrime_InsuringAgreements_BTN_Delete.equalsIgnoreCase(constants.Yes)) {
				se.element().Click(getCrime_InsuringAgreements_BTN_Delete(),test);
			}
			if(strCrime_InsuringAgreements_BTN_Delete.equalsIgnoreCase(constants.Yes)){
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_AgreementSelect(strCrime_InsuringAgreements_CHK_AgreementSelect),"Check",test);
				se.element().Click(getCrime_InsuringAgreements_BTN_Delete(), test);
			}
			CAF_InsuringAgreements CAFInsuringAgreementsPage =  TestPageFactory.initElements(se, CAF_InsuringAgreements.class);
			CAFInsuringAgreementsPage.insuringAgreementDetails(row,test);
			CAFInsuringAgreementsPage.coverageAmendments(row,test);
			if(!strCrime_InsuringAgreements_BTN_Delete.equalsIgnoreCase(constants.Yes)){
				se.element().Click(getNext(),test);
			}
			if(strCrime_InsuringAgreements_BTN_Done.equalsIgnoreCase(constants.Yes)) {
				se.element().Click(getDone(),test);
			}
			
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CAF_InsuringAgreements", true, false, true, test);
		}
		iteration++;
	}

}
	catch (Exception e) {
		// TODO: handle exception
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Faied", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		testTearDown(se, test);
			}
			
		}

	
	
	public void insuringAgreementDetails(Map<String, String> row, ExtentTest test) throws IOException {
		
		
		
		String strCrime_InsuringAgreements_TXT_LocationNo = (String) row.get("Crime_InsuringAgreements_TXT_LocationNo");
		String strCrime_InsuringAgreements_TXT_Name = (String) row.get("Crime_InsuringAgreements_TXT_Name");
		
		String strCrime_InsuringAgreements_TXT_Description = (String) row.get("Crime_InsuringAgreements_TXT_Description");
		String strCrime_InsuringAgreements_TXT_Street = (String) row.get("Crime_InsuringAgreements_TXT_Street");
		String strCrime_InsuringAgreements_TXT_Ste_Unit = (String) row.get("Crime_InsuringAgreements_TXT_Ste/Unit");
		String strCrime_InsuringAgreements_TXT_City = (String) row.get("Crime_InsuringAgreements_TXT_City");
		String strCrime_InsuringAgreements_TXT_State = (String) row.get("Crime_InsuringAgreements_TXT_State");
		String strCrime_InsuringAgreements_TXT_Zip = (String) row.get("Crime_InsuringAgreements_TXT_Zip");
		String strCrime_InsuringAgreements_TXT_InsuringAgreementNameSearch = (String) row.get("Crime_InsuringAgreements_TXT_InsuringAgreementNameSearch");
		String strCrime_InsuringAgreements_TXT_InsuringAgreementName = (String) row.get("Crime_InsuringAgreements_TXT_InsuringAgreementName");
		String strCrime_InsuringAgreements_TXT_InsuringAgreementNamePopup = (String) row.get("Crime_InsuringAgreements_TXT_InsuringAgreementNamePopup");
		String strCrime_InsuringAgreements_TXT_NumOfRoomsOrApartments = (String) row.get("Crime_InsuringAgreements_TXT_NumOfRoomsOrApartments");
		String strCrime_InsuringAgreements_TXT_NameOfDepository = (String) row.get("Crime_InsuringAgreements_TXT_NameOfDepository");
		
		String strCrime_InsuringAgreements_TXT_LimitSearch = (String) row.get("Crime_InsuringAgreements_TXT_LimitSearch");
		String strCrime_InsuringAgreements_TXT_Limit = (String) row.get("Crime_InsuringAgreements_TXT_Limit");
		String strCrime_InsuringAgreements_TXT_LimitPerOccurence = (String) row.get("Crime_InsuringAgreements_TXT_LimitPerOccurence");
		String strCrime_InsuringAgreements_TXT_LimitPerGuest = (String) row.get("Crime_InsuringAgreements_TXT_LimitPerGuest");
		String strCrime_InsuringAgreements_TXT_Deductible = (String) row.get("Crime_InsuringAgreements_TXT_Deductible");
		String strCrime_InsuringAgreements_TXT_DeductibleSearch = (String) row.get("Crime_InsuringAgreements_TXT_DeductibleSearch");
		String strCrime_InsuringAgreements_TXT_EmployeeBenPlanIncAsInsured = (String) row.get("Crime_InsuringAgreements_TXT_EmployeeBenPlanIncAsInsured");
		String transaction = (String) row.get("Transaction Name");
		
		
		try{
			se.log().logTestStep("Insuring Agreement Details");
			test.log(LogStatus.INFO, "Insuring Agreement Details section","Transaction Step : "+transaction + "<br>" +"Page : Crime_InsuringAgreements");
			se.util().sleep(3000);
			//se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_LocationNo(strCrime_InsuringAgreements_TXT_LocationNo),strCrime_InsuringAgreements_TXT_LocationNo,test);
			se.element().selectPopupWithMagnifier(getCrime_InsuringAgreements_TXT_LocationNo(strCrime_InsuringAgreements_TXT_LocationNo), getCrime_InsuringAgreements_BTN_LocationNoSearch(strCrime_InsuringAgreements_TXT_LocationNo), strCrime_InsuringAgreements_TXT_LocationNo, "N/A", strCrime_InsuringAgreements_TXT_LocationNo, "N/A", "N/A", "N/A", test);
			se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_Name(strCrime_InsuringAgreements_TXT_Name),strCrime_InsuringAgreements_TXT_Name,test);
			se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_Description(strCrime_InsuringAgreements_TXT_Description),strCrime_InsuringAgreements_TXT_Description,test);
			se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_Street(strCrime_InsuringAgreements_TXT_Street),strCrime_InsuringAgreements_TXT_Street,test);
			se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_Ste_Unit(strCrime_InsuringAgreements_TXT_Ste_Unit),strCrime_InsuringAgreements_TXT_Ste_Unit,test);
			se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_City(strCrime_InsuringAgreements_TXT_City),strCrime_InsuringAgreements_TXT_City,test);
			se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_State(strCrime_InsuringAgreements_TXT_State),strCrime_InsuringAgreements_TXT_State,test);
			se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_Zip(strCrime_InsuringAgreements_TXT_Zip),strCrime_InsuringAgreements_TXT_Zip,test);
			
			se.element().selectPopupWithMagnifier(getCrime_InsuringAgreements_TXT_InsuringAgreementName(strCrime_InsuringAgreements_TXT_InsuringAgreementName), getCrime_InsuringAgreements_BTN_InsuringAgreementNameSearch(strCrime_InsuringAgreements_TXT_InsuringAgreementName), strCrime_InsuringAgreements_TXT_InsuringAgreementName, strCrime_InsuringAgreements_TXT_InsuringAgreementNameSearch, strCrime_InsuringAgreements_TXT_InsuringAgreementName, strCrime_InsuringAgreements_TXT_InsuringAgreementNamePopup, "N/A", "N/A", test);
			se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_NumOfRoomsOrApartments(strCrime_InsuringAgreements_TXT_NumOfRoomsOrApartments),strCrime_InsuringAgreements_TXT_NumOfRoomsOrApartments,test);
			se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_NameOfDepository(strCrime_InsuringAgreements_TXT_NameOfDepository),strCrime_InsuringAgreements_TXT_NameOfDepository,test);
			se.element().selectPopupWithMagnifier(getCrime_InsuringAgreements_TXT_Limit(strCrime_InsuringAgreements_TXT_Limit), getCrime_InsuringAgreements_BTN_LimitSearch(strCrime_InsuringAgreements_TXT_Limit), strCrime_InsuringAgreements_TXT_Limit, strCrime_InsuringAgreements_TXT_LimitSearch, strCrime_InsuringAgreements_TXT_Limit, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_LimitPerOccurence(strCrime_InsuringAgreements_TXT_LimitPerOccurence),strCrime_InsuringAgreements_TXT_LimitPerOccurence,test);
			se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_LimitPerGuest(strCrime_InsuringAgreements_TXT_LimitPerGuest),strCrime_InsuringAgreements_TXT_LimitPerGuest,test);
			se.element().selectPopupWithMagnifier(getCrime_InsuringAgreements_TXT_Deductible(strCrime_InsuringAgreements_TXT_Deductible), getCrime_InsuringAgreements_BTN_DeductibleSearch(strCrime_InsuringAgreements_TXT_Deductible), strCrime_InsuringAgreements_TXT_Deductible, strCrime_InsuringAgreements_TXT_DeductibleSearch, strCrime_InsuringAgreements_TXT_Deductible, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_EmployeeBenPlanIncAsInsured(strCrime_InsuringAgreements_TXT_EmployeeBenPlanIncAsInsured),strCrime_InsuringAgreements_TXT_EmployeeBenPlanIncAsInsured,test);
		
		}
		catch(Exception e){
			
			se.verify().verifyEquals("Failed to fill in details for Insuring Agreement Details section Coverage", true, false, true, test);		
			}
	}
	
		
		public void coverageAmendments(Map<String, String> row, ExtentTest test) throws IOException {

			
			String strCrime_InsuringAgreements_TXT_CoverageType = (String) row.get("Crime_InsuringAgreements_TXT_CoverageType");
			String strCrime_InsuringAgreements_CHK_IsCovWrittenToSupplBankingPrem = (String) row.get("Crime_InsuringAgreements_CHK_IsCovWrittenToSupplBankingPrem");
			String strCrime_InsuringAgreements_TXT_EmployeeTheftItem = (String) row.get("Crime_InsuringAgreements_TXT_EmployeeTheftItem");
			String strCrime_InsuringAgreements_TXT_NameOfCoveredEmployees = (String) row.get("Crime_InsuringAgreements_TXT_NameOfCoveredEmployees");
			String strCrime_InsuringAgreements_TXT_TitleOfCoveredPositions = (String) row.get("Crime_InsuringAgreements_TXT_TitleOfCoveredPositions");
			String strCrime_InsuringAgreements_TXT_NumOfEmployees = (String) row.get("Crime_InsuringAgreements_TXT_NumOfEmployees");
			String strCrime_InsuringAgreements_CHK_FaithfulPerfOfDutyCov = (String) row.get("Crime_InsuringAgreements_CHK_FaithfulPerfOfDutyCov");
			String strCrime_InsuringAgreements_TXT_CoverageWrittenFor = (String) row.get("Crime_InsuringAgreements_TXT_CoverageWrittenFor");
			String strCrime_InsuringAgreements_CHK_ERISAInflationGuard = (String) row.get("Crime_InsuringAgreements_CHK_ERISAInflationGuard");
			String strCrime_InsuringAgreements_CHK_ProvideSubLimForMoneySecOrCheck = (String) row.get("Crime_InsuringAgreements_CHK_ProvideSubLimForMoneySecOrCheck");
			String strCrime_InsuringAgreements_TXT_Money = (String) row.get("Crime_InsuringAgreements_TXT_Money");
			String strCrime_InsuringAgreements_TXT_Securities = (String) row.get("Crime_InsuringAgreements_TXT_Securities");
			String strCrime_InsuringAgreements_TXT_Checks_otherThanRetail = (String) row.get("Crime_InsuringAgreements_TXT_Checks(otherthanRetail)");
			String strCrime_InsuringAgreements_CHK_ReqRecordOfChecks = (String) row.get("Crime_InsuringAgreements_CHK_ReqRecordOfChecks");
			String strCrime_InsuringAgreements_CHK_ExtendPremDefToEntPlotOfGround = (String) row.get("Crime_InsuringAgreements_CHK_ExtendPremDefToEntPlotOfGround");
			String strCrime_InsuringAgreements_TXT_NumOfPreExtended = (String) row.get("Crime_InsuringAgreements_TXT_NumOfPreExtended");
			String strCrime_InsuringAgreements_CHK_ExtendPremDefToGroundEncByFenceOrWall = (String) row.get("Crime_InsuringAgreements_CHK_ExtendPremDefToGroundEncByFenceOrWall");
			String strCrime_InsuringAgreements_CHK_ExcludeSpecifiedProperty = (String) row.get("Crime_InsuringAgreements_CHK_ExcludeSpecifiedProperty");
			String strCrime_InsuringAgreements_TXT_PropertyNotCovered = (String) row.get("Crime_InsuringAgreements_TXT_PropertyNotCovered");
			String strCrime_InsuringAgreements_CHK_ExcludeDesgPremises = (String) row.get("Crime_InsuringAgreements_CHK_ExcludeDesgPremises");
			String strCrime_InsuringAgreements_TXT_AddressOfPremises = (String) row.get("Crime_InsuringAgreements_TXT_AddressOfPremises");
			String strCrime_InsuringAgreements_CHK_IncludeSellingPriceOrProcCharge = (String) row.get("Crime_InsuringAgreements_CHK_IncludeSellingPriceOrProcCharge");
			String strCrime_InsuringAgreements_CHK_AddPropertyOfOthers = (String) row.get("Crime_InsuringAgreements_CHK_AddPropertyOfOthers");
			String strCrime_InsuringAgreements_TXT_CustomersClassOfPersons = (String) row.get("Crime_InsuringAgreements_TXT_CustomersClassOfPersons");
			String strCrime_InsuringAgreements_TXT_CustomersLimitOfInsurance = (String) row.get("Crime_InsuringAgreements_TXT_CustomersLimitOfInsurance");
			String strCrime_InsuringAgreements_TXT_CustomersIncludes = (String) row.get("Crime_InsuringAgreements_TXT_CustomersIncludes");
			String strCrime_InsuringAgreements_TXT_CustomersLimitedTo = (String) row.get("Crime_InsuringAgreements_TXT_CustomersLimitedTo");
			String strCrime_InsuringAgreements_CHK_InclSecurityHeldByDepoInTrust = (String) row.get("Crime_InsuringAgreements_CHK_InclSecurityHeldByDepoInTrust");
			String strCrime_InsuringAgreements_TXT_PackageModFactor = (String) row.get("Crime_InsuringAgreements_TXT_PackageModFactor");
			String strCrime_InsuringAgreements_CHK_IncludeDamFromFoodOrLiq = (String) row.get("Crime_InsuringAgreements_CHK_IncludeDamFromFoodOrLiq");
			String strCrime_InsuringAgreements_CHK_IncludeSamplesOrArtCarried = (String) row.get("Crime_InsuringAgreements_CHK_IncludeSamplesOrArtCarried");
			String strCrime_InsuringAgreements_CHK_IncludeDamINCusOfLaundOrCleaner = (String) row.get("Crime_InsuringAgreements_CHK_IncludeDamINCusOfLaundOrCleaner");
			
			String transaction = (String) row.get("Transaction Name");
			
			
			try{
				se.log().logTestStep("Coverage Amendments Details");
				test.log(LogStatus.INFO, "Coverage Amendments Details section","Transaction Step : "+transaction + "<br>" +"Page : Crime_InsuringAgreements");
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_CoverageType(strCrime_InsuringAgreements_TXT_CoverageType),strCrime_InsuringAgreements_TXT_CoverageType,test);
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_IsCovWrittenToSupplBankingPrem(strCrime_InsuringAgreements_CHK_IsCovWrittenToSupplBankingPrem),strCrime_InsuringAgreements_CHK_IsCovWrittenToSupplBankingPrem,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_EmployeeTheftItem(strCrime_InsuringAgreements_TXT_EmployeeTheftItem),strCrime_InsuringAgreements_TXT_EmployeeTheftItem,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_NameOfCoveredEmployees(strCrime_InsuringAgreements_TXT_NameOfCoveredEmployees),strCrime_InsuringAgreements_TXT_NameOfCoveredEmployees,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_TitleOfCoveredPositions(strCrime_InsuringAgreements_TXT_TitleOfCoveredPositions),strCrime_InsuringAgreements_TXT_TitleOfCoveredPositions,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_NumOfEmployees(strCrime_InsuringAgreements_TXT_NumOfEmployees),strCrime_InsuringAgreements_TXT_NumOfEmployees,test);
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_FaithfulPerfOfDutyCov(strCrime_InsuringAgreements_CHK_FaithfulPerfOfDutyCov),strCrime_InsuringAgreements_CHK_FaithfulPerfOfDutyCov,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_CoverageWrittenFor(strCrime_InsuringAgreements_TXT_CoverageWrittenFor),strCrime_InsuringAgreements_TXT_CoverageWrittenFor,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_CoverageWrittenFor(strCrime_InsuringAgreements_TXT_CoverageWrittenFor),strCrime_InsuringAgreements_TXT_CoverageWrittenFor,test);
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_ERISAInflationGuard(strCrime_InsuringAgreements_CHK_ERISAInflationGuard),strCrime_InsuringAgreements_CHK_ERISAInflationGuard,test);
				se.util().sleep(2000);
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_ProvideSubLimForMoneySecOrCheck(strCrime_InsuringAgreements_CHK_ProvideSubLimForMoneySecOrCheck),strCrime_InsuringAgreements_CHK_ProvideSubLimForMoneySecOrCheck,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_Money(strCrime_InsuringAgreements_TXT_Money),strCrime_InsuringAgreements_TXT_Money,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_Securities(strCrime_InsuringAgreements_TXT_Securities),strCrime_InsuringAgreements_TXT_Securities,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_Checks_OtherthanRetail(strCrime_InsuringAgreements_TXT_Checks_otherThanRetail),strCrime_InsuringAgreements_TXT_Checks_otherThanRetail,test);
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_ReqRecordOfChecks(strCrime_InsuringAgreements_CHK_ReqRecordOfChecks),strCrime_InsuringAgreements_CHK_ReqRecordOfChecks,test);
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_ExtendPremDefToEntPlotOfGround(strCrime_InsuringAgreements_CHK_ExtendPremDefToEntPlotOfGround),strCrime_InsuringAgreements_CHK_ExtendPremDefToEntPlotOfGround,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_NumOfPreExtended(strCrime_InsuringAgreements_TXT_NumOfPreExtended),strCrime_InsuringAgreements_TXT_NumOfPreExtended,test);
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_ExtendPremDefToGroundEncByFenceOrWall(strCrime_InsuringAgreements_CHK_ExtendPremDefToGroundEncByFenceOrWall),strCrime_InsuringAgreements_CHK_ExtendPremDefToGroundEncByFenceOrWall,test);
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_ExcludeSpecifiedProperty(strCrime_InsuringAgreements_CHK_ExcludeSpecifiedProperty),strCrime_InsuringAgreements_CHK_ExcludeSpecifiedProperty,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_PropertyNotCovered(strCrime_InsuringAgreements_TXT_PropertyNotCovered),strCrime_InsuringAgreements_TXT_PropertyNotCovered,test);
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_ExcludeDesgPremises(strCrime_InsuringAgreements_CHK_ExcludeDesgPremises),strCrime_InsuringAgreements_CHK_ExcludeDesgPremises,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_AddressOfPremises(strCrime_InsuringAgreements_TXT_AddressOfPremises),strCrime_InsuringAgreements_TXT_AddressOfPremises,test);
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_IncludeSellingPriceOrProcCharge(strCrime_InsuringAgreements_CHK_IncludeSellingPriceOrProcCharge),strCrime_InsuringAgreements_CHK_IncludeSellingPriceOrProcCharge,test);
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_AddPropertyOfOthers(strCrime_InsuringAgreements_CHK_AddPropertyOfOthers),strCrime_InsuringAgreements_CHK_AddPropertyOfOthers,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_ClassOfPersons(strCrime_InsuringAgreements_TXT_CustomersClassOfPersons),strCrime_InsuringAgreements_TXT_CustomersClassOfPersons,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_CustomersLimitOfInsurance(strCrime_InsuringAgreements_TXT_CustomersLimitOfInsurance),strCrime_InsuringAgreements_TXT_CustomersLimitOfInsurance,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_CustomersIncludes(strCrime_InsuringAgreements_TXT_CustomersIncludes),strCrime_InsuringAgreements_TXT_CustomersIncludes,test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_CustomersLimitedTo(strCrime_InsuringAgreements_TXT_CustomersLimitedTo),strCrime_InsuringAgreements_TXT_CustomersLimitedTo,test);
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_InclSecurityHeldByDepoInTrust(strCrime_InsuringAgreements_CHK_InclSecurityHeldByDepoInTrust),strCrime_InsuringAgreements_CHK_InclSecurityHeldByDepoInTrust,test);
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_IncludeDamFromFoodOrLiq(strCrime_InsuringAgreements_CHK_IncludeDamFromFoodOrLiq),strCrime_InsuringAgreements_CHK_IncludeDamFromFoodOrLiq,test);
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_IncludeSamplesOrArtCarried(strCrime_InsuringAgreements_CHK_IncludeSamplesOrArtCarried),strCrime_InsuringAgreements_CHK_IncludeSamplesOrArtCarried,test);
				se.element().checkUncheckOrValidate(getCrime_InsuringAgreements_CHK_IncludeDamINCusOfLaundOrCleaner(strCrime_InsuringAgreements_CHK_IncludeDamINCusOfLaundOrCleaner),strCrime_InsuringAgreements_CHK_IncludeDamINCusOfLaundOrCleaner,test);
				//se.element().selectPopupWithMagnifier(getCrime_InsuringAgreements_TXT_PackageModFactor(strCrime_InsuringAgreements_TXT_PackageModFactor), getCrime_InsuringAgreements_BTN_ackageModFactorSearch(strCrime_InsuringAgreements_TXT_PackageModFactor), strCrime_InsuringAgreements_TXT_PackageModFactor, constants.NA, strCrime_InsuringAgreements_TXT_PackageModFactor, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCrime_InsuringAgreements_TXT_PackageModFactor(strCrime_InsuringAgreements_TXT_PackageModFactor),strCrime_InsuringAgreements_TXT_PackageModFactor,test);
			}
			catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for Coverage Amendments section Coverage", true, false, true, test);		
				}
		}
			
				
}
