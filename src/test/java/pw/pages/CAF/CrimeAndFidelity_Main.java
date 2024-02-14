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

public class CrimeAndFidelity_Main extends OR_Crime{
	
	public void CrimeAndFidelity_MainPage(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("Crime")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("Crime", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		try {
			CrimeAndFidelity_Main CAF_MainPage = TestPageFactory.initElements(se, CrimeAndFidelity_Main.class);

			CAF_MainPage.CAF_PolicyDetailsSection(row, test);
			CAF_MainPage.CAF_KYTaxInformationSection(row, test);
			CAF_MainPage.CAF_ClassificationInformationSection(row, test);
			CAF_MainPage.CAF_CompanyRatingPlansSection(row, test);
			se.element().clickElement(getNext());
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for new application ", true, false, true, test);
		}
		iteration++;
	}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Faied",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

}

	
	public void CAF_PolicyDetailsSection(Map<String, String> row, ExtentTest test) throws IOException {
	
		String strCrime_TXT_PolicyType = (String) row.get("Crime_TXT_PolicyType");
		String strCrime_TXT_CoverageType = (String) row.get("Crime_TXT_CoverageType");
		String strCrime_TXT_PrimaryState = (String) row.get("Crime_TXT_PrimaryState");
		String strCrime_TXT_PrimaryCity = (String) row.get("Crime_TXT_PrimaryCity");
		String strCrime_TXT_Zip = (String) row.get("Crime_TXT_Zip");
		String strCrime_CHK_MiscellaneousCov = (String) row.get("Crime_CHK_MiscellaneousCov");
		String strCrime_TXT_TotalNumOfEmp = (String) row.get("Crime_TXT_TotalNumOfEmp");
		String strCrime_TXT_NumOfRatableEmp = (String) row.get("Crime_TXT_NumOfRatableEmp");
		String strCrime_TXT_NumOfAdditionalPremises = (String) row.get("Crime_TXT_NumOfAdditionalPremises");
		String transaction = (String) row.get("Transaction Name");
		
		try {
			se.log().logTestStep("CP_CAF_MainPage");
			test.log(LogStatus.INFO, "CP_CIM_Main page","Transaction Step : " + transaction + "<br>" + "Page : CP_CAF_MainPage");
			se.element().waitForElementIsDisplayed(getCrime_LabelName(), 10);
			se.verify().verifyEquals("CP_CIM_Main Page of PowerWriter ",getCrime_LabelName().isDisplayed(), true, true, test);
			se.element().enterOrValidateText(getCrime_TXT_PolicyType(strCrime_TXT_PolicyType),strCrime_TXT_PolicyType,test);
			se.element().enterOrValidateText(getCrime_TXT_CoverageType(strCrime_TXT_CoverageType),strCrime_TXT_CoverageType,test);
			se.element().enterOrValidateText(getCrime_TXT_PrimaryState(strCrime_TXT_PrimaryState),strCrime_TXT_PrimaryState,test);
			
			//below 2 New fields displayed from April 2021 release
			se.element().enterOrValidateText(getCrime_TXT_PrimaryCityy(strCrime_TXT_PrimaryCity),strCrime_TXT_PrimaryCity,test);
			se.element().selectPopupWithMagnifier(getCrime_TXT_Zip_(strCrime_TXT_Zip), getCrime_TXT_Zip_Search(strCrime_TXT_Zip), strCrime_TXT_PrimaryCity, constants.NA, strCrime_TXT_PrimaryCity, constants.NA, constants.NA, constants.NA, test);
			
			se.element().checkUncheckOrValidate(getCrime_CHK_MiscellaneousCov(strCrime_CHK_MiscellaneousCov),strCrime_CHK_MiscellaneousCov,test);
			se.element().enterOrValidateText(getCrime_TXT_TotalNumOfEmp(strCrime_TXT_TotalNumOfEmp),strCrime_TXT_TotalNumOfEmp,test);
			se.element().enterOrValidateText(getCrime_TXT_NumOfRatableEmp(strCrime_TXT_NumOfRatableEmp),strCrime_TXT_NumOfRatableEmp,test);
			se.element().enterOrValidateText(getCrime_TXT_NumOfAdditionalPremises(strCrime_TXT_NumOfAdditionalPremises),strCrime_TXT_NumOfAdditionalPremises,test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_CAF_MainPage ", true, false, true, test);
		}
		}

	public void CAF_KYTaxInformationSection(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCrime_CHK_DoNotApplyCityOrCountyTax = (String) row.get("Crime_CHK_DoNotApplyCityOrCountyTax");
		String strCrime_CHK_AllCityName = (String) row.get("Crime_CHK_AllCityName");
		String strCrime_TXT_City = (String) row.get("Crime_TXT_City");
		String strCrime_TXT_CityCode = (String) row.get("Crime_TXT_CityCode");
		String strCrime_CHK_AllCountyName = (String) row.get("Crime_CHK_AllCountyName");
		String strCrime_TXT_County = (String) row.get("Crime_TXT_County");
		String strCrime_TXT_CountyCode = (String) row.get("Crime_TXT_CountyCode");
		String strCrime_TXT_TaxCode = (String) row.get("Crime_TXT_TaxCode");
		String strCrime_TXT_PackageModFactor = (String) row.get("Crime_TXT_PackageModFactor");
		String transaction = (String) row.get("Transaction Name");
		
		try {

			se.log().logTestStep("CAF_KYTaxInformationSection");
			test.log(LogStatus.INFO, "CAF_KYTaxInformationSection page","Transaction Step : " + transaction + "<br>" + "Page : CP_CAF_MainPage");
			se.element().checkUncheckOrValidate(getCrime_CHK_DoNotApplyCityOrCountyTax(strCrime_CHK_DoNotApplyCityOrCountyTax),strCrime_CHK_DoNotApplyCityOrCountyTax,test);
			se.element().checkUncheckOrValidate(getCrime_CHK_AllCityName(strCrime_CHK_AllCityName),strCrime_CHK_AllCityName,test);
			se.element().enterOrValidateText(getCrime_TXT_City(strCrime_TXT_City),strCrime_TXT_City,test);
			if(se.element().isElementPresent(common_BTN_PopupClose)){
				se.element().Click(getCommon_LNK_PopupOption(strCrime_TXT_City), test);
			}
			se.element().enterOrValidateText(getCrime_TXT_CityCode(strCrime_TXT_CityCode),strCrime_TXT_CityCode,test);
			se.element().checkUncheckOrValidate(getCrime_CHK_AllCountyName(strCrime_CHK_AllCountyName),strCrime_CHK_AllCountyName,test);
			se.element().enterOrValidateText(getCrime_TXT_County(strCrime_TXT_County),strCrime_TXT_County,test);
			se.element().enterOrValidateText(getCrime_TXT_CountyCode(strCrime_TXT_CountyCode),strCrime_TXT_CountyCode,test);
			se.element().enterOrValidateText(getCrime_TXT_TaxCode(strCrime_TXT_TaxCode),strCrime_TXT_TaxCode,test);
			se.element().enterOrValidateText(getCrime_TXT_PackageModFactor(strCrime_TXT_PackageModFactor),strCrime_TXT_PackageModFactor,test);
			
		} catch (Exception e) {
			
			se.verify().verifyEquals("Failed to fill in details for CP_Crime_Location ", true, false, true, test);
		}
		}

	public void CAF_ClassificationInformationSection(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCrime_TXT_ClassCode = (String) row.get("Crime_TXT_ClassCode");
		String strCrime_TXT_ClassDescription = (String) row.get("Crime_TXT_ClassDescription");
		String strCrime_TXT_ClassDescriptionPopup = (String) row.get("Crime_TXT_ClassDescriptionPopup");
		String strCrime_TXT_ClassCode_PopupSearchDisplay = (String) row.get("Crime_TXT_ClassCode_PopupSearchDisplay");
		String strCrime_TXT_PredominantActivity = (String) row.get("Crime_TXT_PredominantActivity");
		String strCrime_TXT_MajorIndustryGroup = (String) row.get("Crime_TXT_MajorIndustryGroup");
		String strCrime_CHK_ConvertToAnAggLimOfIns = (String) row.get("Crime_CHK_ConvertToAnAggLimOfIns");
		String strCrime_TXT_AggregateLimit = (String) row.get("Crime_TXT_AggregateLimit");
		String strCrime_CHK_SecuraManuscript = (String) row.get("Crime_CHK_SecuraManuscript");
		String transaction = (String) row.get("Transaction Name");
		
		try {
			se.log().logTestStep("CAF_ClassificationInformationSection");
			test.log(LogStatus.INFO, "CAF_ClassificationInformationSection ","Transaction Step : " + transaction + "<br>" + "Page : CP_CAF_MainPage");
			se.element().selectClasscode(getCrime_TXT_ClassCode(strCrime_TXT_ClassCode), strCrime_TXT_ClassCode_PopupSearchDisplay, strCrime_TXT_ClassCode, strCrime_TXT_ClassDescriptionPopup, "N/A", "N/A", test);
			se.element().enterOrValidateText(getCrime_TXT_ClassDescription(strCrime_TXT_ClassDescription),strCrime_TXT_ClassDescription,test);
			se.element().enterOrValidateText(getCrime_TXT_PredominantActivity(strCrime_TXT_PredominantActivity),strCrime_TXT_PredominantActivity,test);
			se.element().enterOrValidateText(getCrime_TXT_MajorIndustryGroup(strCrime_TXT_MajorIndustryGroup),strCrime_TXT_MajorIndustryGroup,test);
			se.element().checkUncheckOrValidate(getCrime_CHK_ConvertToAnAggLimOfIns(strCrime_CHK_ConvertToAnAggLimOfIns),strCrime_CHK_ConvertToAnAggLimOfIns,test);
			se.element().enterOrValidateText(getCrime_TXT_AggregateLimit(strCrime_TXT_AggregateLimit),strCrime_TXT_AggregateLimit,test);
			se.element().checkUncheckOrValidate(getCrime_CHK_SecuraManuscript(strCrime_CHK_SecuraManuscript),strCrime_CHK_SecuraManuscript,test);
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for CAF_ClassificationInformationSection ", true, false, true, test);
		}
		}
	
	public void CAF_CompanyRatingPlansSection(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCrime_TXT_TransitionFactor = (String) row.get("Crime_TXT_TransitionFactor");
		String strCrime_TXT_MiscellaneousFactor = (String) row.get("Crime_TXT_MiscellaneousFactor");
		String transaction = (String) row.get("Transaction Name");
		
		try {
			se.log().logTestStep("CAF_CompanyRatingPlansSection");
			test.log(LogStatus.INFO, "CAF_CompanyRatingPlansSection page","Transaction Step : " + transaction + "<br>" + "Page : CP_CAF_MainPage");
			se.element().enterOrValidateText(getCrime_TXT_TransitionFactor(strCrime_TXT_TransitionFactor),strCrime_TXT_TransitionFactor,test);
			se.element().enterOrValidateText(getCrime_TXT_MiscellaneousFactor(strCrime_TXT_MiscellaneousFactor),strCrime_TXT_MiscellaneousFactor,test);

		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CAF_CompanyRatingPlansSection ", true, false, true, test);
		}
		}

}
