package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CIM;

public class CIM_ScheduledPropertyFloater extends OR_CIM {

	public void CIM_ScheduledPropertyFloaterPage(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_ScheduledPropertyFloater")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_ScheduledPropertyFloater", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		try {
			CIM_ScheduledPropertyFloater CIMScheduledPropertyFloaterPage = TestPageFactory.initElements(se,CIM_ScheduledPropertyFloater.class);
			String strCIM_ScheduledPropertyFloaterPage_BTN_Done = (String) row.get("CIM_ScheduledPropertyFloaterPage_BTN_Done");
			CIMScheduledPropertyFloaterPage.locationSection(row, test);
			CIMScheduledPropertyFloaterPage.kYTaxInformationSection(row, test);
			CIMScheduledPropertyFloaterPage.ratingDetailsSection(row, test);
			se.element().Click(getNext(),test);
			if(strCIM_ScheduledPropertyFloaterPage_BTN_Done.equalsIgnoreCase("Yes")){
				se.element().Click(getNext(),test);
			}
			
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for Scheduled Property Floater page ", true, false,
					true, test);
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
	public void locationSection(Map<String, String> row, ExtentTest test) throws IOException {

		String strCIM_ScheduledPropertyFloater_BTN_Add = (String) row.get("CIM_ScheduledPropertyFloater_BTN_Add");
		String strCIM_ScheduledPropertyFloater_BTN_Details = (String) row.get("CIM_ScheduledPropertyFloater_BTN_Details");
		String strCIM_ScheduledPropertyFloater_TXT_ItemNo = (String) row.get("CIM_ScheduledPropertyFloater_TXT_ItemNo");
		String strCIM_ScheduledPropertyFloater_TXT_LocationNo = (String) row.get("CIM_ScheduledPropertyFloater_TXT_LocationNo");
		String strCIM_ScheduledPropertyFloater_TXT_Name = (String) row.get("CIM_ScheduledPropertyFloater_TXT_Name");
		String strCIM_ScheduledPropertyFloater_TXT_Description = (String) row.get("CIM_ScheduledPropertyFloater_TXT_Description");
		String strCIM_ScheduledPropertyFloater_TXT_Street = (String) row.get("CIM_ScheduledPropertyFloater_TXT_Street");
		String strCIM_ScheduledPropertyFloater_TXT_Ste_Unit = (String) row.get("CIM_ScheduledPropertyFloater_TXT_Ste_Unit");
		String strCIM_ScheduledPropertyFloater_TXT_City = (String) row.get("CIM_ScheduledPropertyFloater_TXT_City");
		String strCIM_ScheduledPropertyFloater_TXT_State = (String) row.get("CIM_ScheduledPropertyFloater_TXT_State");
		String strCIM_ScheduledPropertyFloater_TXT_Zip = (String) row.get("CIM_ScheduledPropertyFloater_TXT_Zip");
		String strCIM_ScheduledPropertyFloater_TXT_ClassDescription = (String) row.get("CIM_ScheduledPropertyFloater_TXT_ClassDescription");
		String strCIM_ScheduledPropertyFloater_TXT_DescribedProperty = (String) row.get("CIM_ScheduledPropertyFloater_TXT_DescribedProperty");
		String strCIM_ScheduledPropertyFloater_TXT_DescribedPropertyLimit = (String) row.get("CIM_ScheduledPropertyFloater_TXT_DescribedPropertyLimit");
		String strCIM_ScheduledPropertyFloater_TXT_DescribedPropertyDeductible = (String) row.get("CIM_ScheduledPropertyFloater_TXT_DescribedPropertyDeductible");
		String strCIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateYes = (String) row.get("CIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateYes");
		String strCIM_ScheduledPropertyFloater_TXT_OverrideReason = (String) row.get("CIM_ScheduledPropertyFloater_TXT_OverrideReason");
		String strCIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateNo = (String) row.get("CIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateNo");
		String strCIM_ScheduledPropertyFloater_TXT_OverrideReason_FilterNeeded = (String) row.get("CIM_ScheduledPropertyFloater_TXT_OverrideReason_FilterNeeded");
		
		String transaction = (String) row.get("Transaction Name");
		try {

			
			se.log().logTestStep("Location Section");
			test.log(LogStatus.INFO, "Location section","Transaction Step : " + transaction + "<br>" + "Page : Scheduled Property Floater");
			//se.verify().verifyEquals("Location Section of Scheduled Property Floater",getCIM_ScheduledPropertyFloater_BTN_Add().isDisplayed(), true, true, test);
			if(strCIM_ScheduledPropertyFloater_BTN_Add.equalsIgnoreCase("Yes")){
				se.element().clickElement(getCIM_ScheduledPropertyFloater_BTN_Add(), test);
			}
			
			
			if(strCIM_ScheduledPropertyFloater_BTN_Details.equalsIgnoreCase("Yes")){
				se.element().clickElement(getCIM_ScheduledPropertyFloater_BTN_Details1(),test);
				
			}
			
			
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_ItemNo(strCIM_ScheduledPropertyFloater_TXT_ItemNo),
					strCIM_ScheduledPropertyFloater_TXT_ItemNo, test);
			se.util().sleep(3000);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_LocationNo(strCIM_ScheduledPropertyFloater_TXT_LocationNo),
					strCIM_ScheduledPropertyFloater_TXT_LocationNo, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_Name(strCIM_ScheduledPropertyFloater_TXT_Name),
					strCIM_ScheduledPropertyFloater_TXT_Name, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_Description(strCIM_ScheduledPropertyFloater_TXT_Description),
					strCIM_ScheduledPropertyFloater_TXT_Description, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_Street(strCIM_ScheduledPropertyFloater_TXT_Street),
					strCIM_ScheduledPropertyFloater_TXT_Street, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_Ste_Unit(strCIM_ScheduledPropertyFloater_TXT_Ste_Unit),
					strCIM_ScheduledPropertyFloater_TXT_Ste_Unit, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_City(strCIM_ScheduledPropertyFloater_TXT_City),
					strCIM_ScheduledPropertyFloater_TXT_City, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_State(strCIM_ScheduledPropertyFloater_TXT_State),
					strCIM_ScheduledPropertyFloater_TXT_State, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_Zip(strCIM_ScheduledPropertyFloater_TXT_Zip),
					strCIM_ScheduledPropertyFloater_TXT_Zip, test);
			se.element().selectPopupWithMagnifier(getCIM_ScheduledPropertyFloater_TXT_ClassDescription(strCIM_ScheduledPropertyFloater_TXT_ClassDescription), getCIM_ScheduledPropertyFloater_TXT_ClassDescriptionSearch(strCIM_ScheduledPropertyFloater_TXT_ClassDescription), strCIM_ScheduledPropertyFloater_TXT_ClassDescription, constants.NA, strCIM_ScheduledPropertyFloater_TXT_ClassDescription, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_DescribedProperty(
							strCIM_ScheduledPropertyFloater_TXT_DescribedProperty),
					strCIM_ScheduledPropertyFloater_TXT_DescribedProperty, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_DescribedPropertyLimit(
							strCIM_ScheduledPropertyFloater_TXT_DescribedPropertyLimit),
					strCIM_ScheduledPropertyFloater_TXT_DescribedPropertyLimit, test);
			se.element().selectPopupWithMagnifier(getCIM_ScheduledPropertyFloater_TXT_DescribedPropertyDeductible(strCIM_ScheduledPropertyFloater_TXT_DescribedPropertyDeductible), getCIM_ScheduledPropertyFloater_BTN_DescribedPropertyDeductibleSearchButton(strCIM_ScheduledPropertyFloater_TXT_DescribedPropertyDeductible), strCIM_ScheduledPropertyFloater_TXT_DescribedPropertyDeductible, constants.NA, strCIM_ScheduledPropertyFloater_TXT_DescribedPropertyDeductible, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(
					getCIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateYes(
							strCIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateYes),
					strCIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateYes, test);
			se.element().selectPopupWithMagnifier(getCIM_ScheduledPropertyFloater_TXT_OverrideReason(strCIM_ScheduledPropertyFloater_TXT_OverrideReason), getCIM_ScheduledPropertyFloater_TXT_OverrideReason_Search(strCIM_ScheduledPropertyFloater_TXT_OverrideReason), strCIM_ScheduledPropertyFloater_TXT_OverrideReason, strCIM_ScheduledPropertyFloater_TXT_OverrideReason_FilterNeeded, strCIM_ScheduledPropertyFloater_TXT_OverrideReason, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(
					getCIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateNo(
							strCIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateNo),
					strCIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateNo, test);

		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for SceduledProperty_Location section ", true, false, true, test);
		}
	}

	public void kYTaxInformationSection(Map<String, String> row, ExtentTest test) throws IOException {

		String strCIM_ScheduledPropertyFloater_CHK_DonotApplyCityorCountyTaxes = (String) row
				.get("CIM_ScheduledPropertyFloater_CHK_DonotApplyCityorCountyTaxes");
		String strCIM_ScheduledPropertyFloater_CHK_AllCityName = (String) row
				.get("CIM_ScheduledPropertyFloater_CHK_AllCityName");
		String strCIM_ScheduledPropertyFloater_TXT_City = (String) row.get("CIM_ScheduledPropertyFloater_TXT_City");
		String strCIM_ScheduledPropertyFloater_TXT_CityCode = (String) row
				.get("CIM_ScheduledPropertyFloater_TXT_CityCode");
		String strCIM_ScheduledPropertyFloater_TXT_County = (String) row.get("CIM_ScheduledPropertyFloater_TXT_County");
		String strCIM_ScheduledPropertyFloater_TXT_CountyCode = (String) row
				.get("CIM_ScheduledPropertyFloater_TXT_CountyCode");
		String strCIM_ScheduledPropertyFloater_TXT_TaxCode = (String) row
				.get("CIM_ScheduledPropertyFloater_TXT_TaxCode");
		String transaction = (String) row.get("Transaction Name");

		try {
			se.log().logTestStep("kYTaxInformation section");
			test.log(LogStatus.INFO, "kYTaxInformation section",
					"Transaction Step : " + transaction + "<br>" + "Page : Scheduled Property Floater");
			se.element().checkUncheckOrValidate(
					getCIM_ScheduledPropertyFloater_CHK_DonotApplyCityorCountyTaxes(
							strCIM_ScheduledPropertyFloater_CHK_DonotApplyCityorCountyTaxes),
					strCIM_ScheduledPropertyFloater_CHK_DonotApplyCityorCountyTaxes, test);
			se.element().checkUncheckOrValidate(
					getCIM_ScheduledPropertyFloater_CHK_AllCityName(strCIM_ScheduledPropertyFloater_CHK_AllCityName),
					strCIM_ScheduledPropertyFloater_CHK_AllCityName, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_City(strCIM_ScheduledPropertyFloater_TXT_City),
					strCIM_ScheduledPropertyFloater_TXT_City, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_CityCode(strCIM_ScheduledPropertyFloater_TXT_CityCode),
					strCIM_ScheduledPropertyFloater_TXT_CityCode, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_County(strCIM_ScheduledPropertyFloater_TXT_County),
					strCIM_ScheduledPropertyFloater_TXT_County, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_CountyCode(strCIM_ScheduledPropertyFloater_TXT_CountyCode),
					strCIM_ScheduledPropertyFloater_TXT_CountyCode, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_TaxCode(strCIM_ScheduledPropertyFloater_TXT_TaxCode),
					strCIM_ScheduledPropertyFloater_TXT_TaxCode, test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for kYTaxInformation section", true, false, true, test);
		}
	}

	public void ratingDetailsSection(Map<String, String> row, ExtentTest test) throws IOException {

		String strCIM_ScheduledPropertyFloater_TXT_BaseRate = (String) row
				.get("CIM_ScheduledPropertyFloater_TXT_BaseRate");
		String strCIM_ScheduledPropertyFloater_TXT_BaseRateOverride = (String) row
				.get("CIM_ScheduledPropertyFloater_TXT_BaseRateOverride");
		String strCIM_ScheduledPropertyFloater_TXT_CoinsuranceFtr = (String) row
				.get("CIM_ScheduledPropertyFloater_TXT_CoinsuranceFtr");
		String strCIM_ScheduledPropertyFloater_TXT_DescPropDeductibleFtr = (String) row
				.get("CIM_ScheduledPropertyFloater_TXT_DescPropDeductibleFtr");
		String strCIM_ScheduledPropertyFloater_TXT_TransitionFactor = (String) row
				.get("CIM_ScheduledPropertyFloater_TXT_TransitionFactor");
		String strCIM_ScheduledPropertyFloater_TXT_FinalRate = (String) row
				.get("CIM_ScheduledPropertyFloater_TXT_FinalRate");
		String strCIM_ScheduledPropertyFloater_TXT_OverrideFinalRate = (String) row
				.get("CIM_ScheduledPropertyFloater_TXT_OverrideFinalRate");
		String strCIM_ScheduledPropertyFloater_TXT_Limit = (String) row.get("CIM_ScheduledPropertyFloater_TXT_Limit");
		String strCIM_ScheduledPropertyFloater_TXT_Premium = (String) row
				.get("CIM_ScheduledPropertyFloater_TXT_Premium");
		String strCIM_ScheduledPropertyFloater_TXT_OverridePremium = (String) row
				.get("CIM_ScheduledPropertyFloater_TXT_OverridePremium");
		String transaction = (String) row.get("Transaction Name");
		try {
			se.log().logTestStep("Rating Details");
			test.log(LogStatus.INFO, "Rating Details section",
					"Transaction Step : " + transaction + "<br>" + "Page : Scheduled Property Floater");
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_BaseRate(strCIM_ScheduledPropertyFloater_TXT_BaseRate),
					strCIM_ScheduledPropertyFloater_TXT_BaseRate, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_BaseRateOverride(
							strCIM_ScheduledPropertyFloater_TXT_BaseRateOverride),
					strCIM_ScheduledPropertyFloater_TXT_BaseRateOverride, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_CoinsuranceFtr(
							strCIM_ScheduledPropertyFloater_TXT_CoinsuranceFtr),
					strCIM_ScheduledPropertyFloater_TXT_CoinsuranceFtr, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_DescPropDeductibleFtr(
							strCIM_ScheduledPropertyFloater_TXT_DescPropDeductibleFtr),
					strCIM_ScheduledPropertyFloater_TXT_DescPropDeductibleFtr, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_TransitionFactor(
							strCIM_ScheduledPropertyFloater_TXT_TransitionFactor),
					strCIM_ScheduledPropertyFloater_TXT_TransitionFactor, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_FinalRate(strCIM_ScheduledPropertyFloater_TXT_FinalRate),
					strCIM_ScheduledPropertyFloater_TXT_FinalRate, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_OverrideFinalRate(
							strCIM_ScheduledPropertyFloater_TXT_OverrideFinalRate),
					strCIM_ScheduledPropertyFloater_TXT_OverrideFinalRate, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_Limit(strCIM_ScheduledPropertyFloater_TXT_Limit),
					strCIM_ScheduledPropertyFloater_TXT_Limit, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_Premium(strCIM_ScheduledPropertyFloater_TXT_Premium),
					strCIM_ScheduledPropertyFloater_TXT_Premium, test);
			se.element().enterOrValidateText(
					getCIM_ScheduledPropertyFloater_TXT_OverridePremium(
							strCIM_ScheduledPropertyFloater_TXT_OverridePremium),
					strCIM_ScheduledPropertyFloater_TXT_OverridePremium, test);
		} catch (Exception e) {

			se.verify().verifyEquals("Failed to fill in details for Rating Details section ", true, false, true,
					test);
		}
	}

}
