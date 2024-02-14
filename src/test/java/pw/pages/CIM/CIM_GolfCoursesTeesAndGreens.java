package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CIM;

public class CIM_GolfCoursesTeesAndGreens extends OR_CIM {

	public void Add_GolfCoursesTeesAndGreens(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase("CIM_GolfCoursesTeesAndGreens")) {
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_GolfCourseTeesAndGreens", strRegressionID,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strAdd_BTN = (String) row.get("Add_BTN");
			String strDone_BTN = (String) row.get("Done_BTN");
			String strDetails_BTN = (String) row.get("Details_BTN");
			String strLoc_CoveredCourse_LocNo_TXT = (String) row.get("Loc_CoveredCourse_LocNo");
			String strLoc_Description_TXT = (String) row.get("Loc_Description");
			String strLoc_Street_TXT = (String) row.get("Loc_Street");
			String strLoc_SteUnit_TXT = (String) row.get("Loc_SteUnit");
			String strLoc_City_TXT = (String) row.get("Loc_City");
			String strLoc_State_TXT = (String) row.get("Loc_State");
			String strLoc_Zip_TXT = (String) row.get("Loc_Zip");
			String strLoc_CoveredCourse_Name_TXT = (String) row.get("Loc_CoveredCourse_Name");
			String strKYTax_DoNotApplyTaxes_CHK = (String) row.get("KYTax_DoNotApplyTaxes");
			String strKYTax_AllCityName_CHK = (String) row.get("KYTax_AllCityName");
			String strKYTax_City_TXT = (String) row.get("KYTax_City");
			String strKYTax_CityCode_TXT = (String) row.get("KYTax_CityCode");
			String strKYTax_County_TXT = (String) row.get("KYTax_County");
			String strKYTax_CountyCode_TXT = (String) row.get("KYTax_CountyCode");
			String strKYTax_TaxCode_TXT = (String) row.get("KYTax_TaxCode");
			String strLimits_Limit_AnyOne = (String) row.get("Limits_Limit_AnyOne");
			String strLimits_Limit_All = (String) row.get("Limits_Limit_All");
			String strLimits_Custom_AnyOne = (String) row.get("Limits_Custom_AnyOne");
			String strLimits_Custom_All = (String) row.get("Limits_Custom_All");
			String strLimits_Custom_Charge = (String) row.get("Limits_Custom_Charge");
			String strOverideBaseRate_Yes_RDO = (String) row.get("OverideBaseRate?_Yes");
			String strOverideBaseRate_No_RDO = (String) row.get("OverideBaseRate?_No");
			String strOverride_Reason_TXT = (String) row.get("Override_Reason");
			String strRatingDet_BaseRate_Override_TXT = (String) row.get("RatingDet_BaseRate_Override");
			
			try{
				se.log().logTestStep("CIM_GolfCourseTeesAndGreens");
				test.log(LogStatus.INFO, "CIM_GolfCourseTeesAndGreens page","Transaction Step : " + transaction + "<br>" + "Page : CIM_GolfCourseTeesAndGreens");
				
			if((!strAdd_BTN.equalsIgnoreCase("N/A"))){
				se.element().Click(getCommon_CIM_Cov_BTN_Add(strAdd_BTN),test);
				}
				if((!strDetails_BTN.equalsIgnoreCase("N/A"))){
				se.element().tryClick(getDetails_BTN(strDetails_BTN),test);
				}
			
			//se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_location_no(strLoc_CoveredCourse_LocNo_TXT), strLoc_CoveredCourse_LocNo_TXT, test);
			se.element().selectPopupWithMagnifier(getCommon_CIM_Loc_TXT_location_no(strLoc_CoveredCourse_LocNo_TXT), getCommon_CIM_Loc_TXT_location_noSearch(strLoc_CoveredCourse_LocNo_TXT), strLoc_CoveredCourse_LocNo_TXT, constants.NA, strLoc_CoveredCourse_LocNo_TXT, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_description(strLoc_Description_TXT), strLoc_Description_TXT, test);
			se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_Street(strLoc_Street_TXT), strLoc_Street_TXT, test);
			se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_SteUnit(strLoc_SteUnit_TXT), strLoc_SteUnit_TXT, test);
			se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_city(strLoc_City_TXT), strLoc_City_TXT, test);
			se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_State(strLoc_State_TXT), strLoc_State_TXT, test);
			se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_zip_code(strLoc_Zip_TXT), strLoc_Zip_TXT, test);
			se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_name(strLoc_CoveredCourse_Name_TXT), strLoc_CoveredCourse_Name_TXT, test);
			
			se.element().checkUncheckOrValidate(getCommon_KYTax_CHK_DoNotApplyTaxes(strKYTax_DoNotApplyTaxes_CHK),strKYTax_DoNotApplyTaxes_CHK, test);
			se.element().checkUncheckOrValidate(getCommon_KYTax_CHK_AllCityName(strKYTax_AllCityName_CHK), strKYTax_AllCityName_CHK, test);
			
			if (strKYTax_DoNotApplyTaxes_CHK.equalsIgnoreCase("Uncheck")) {
				se.element().enterOrValidateText(getCommon_KYTax_TXT_City(strKYTax_City_TXT), strKYTax_City_TXT, test);
				se.element().enterOrValidateText(getCommon_KYTax_TXT_CityCode(strKYTax_CityCode_TXT), strKYTax_CityCode_TXT, test);
				se.element().enterOrValidateText(getCommon_KYTax_TXT_County(strKYTax_County_TXT), strKYTax_County_TXT, test);
				se.element().enterOrValidateText(getCommon_KYTax_TXT_CountyCode(strKYTax_CountyCode_TXT), strKYTax_CountyCode_TXT, test);
				se.element().enterOrValidateText(getCommon_KYTax_TXT_TaxCode(strKYTax_TaxCode_TXT), strKYTax_TaxCode_TXT, test);
			}
			
			/*se.element().enterOrValidateText(getCIM_GlfCrsTeeGreen_Limits_TXT_Limit_AnyOne(strLimits_Limit_AnyOne), strLimits_Limit_AnyOne, test);
			if(strLimits_Limit_AnyOne.contains("Custom")){
				se.element().enterOrValidateText(getCIM_GlfCrsTeeGreen_Limits_TXT_LimitAllItems(strLimits_Limit_All), strLimits_Limit_All, test);
				se.element().enterOrValidateText(getCIM_GlfCrsTeeGreen_Limits_TXT_CustLimit_AnyOne(strLimits_Custom_AnyOne), strLimits_Custom_AnyOne, test);
				se.element().enterOrValidateText(getCIM_GlfCrsTeeGreen_Limits_TXT_CustLimit_AllItems(strLimits_Custom_All), strLimits_Custom_All, test);
				se.element().enterOrValidateText(getCIM_GlfCrsTeeGreen_Limits_TXT_CustLimit_PremCharge(strLimits_Custom_Charge), strLimits_Custom_Charge, test);
			} else{
				se.element().Click(getCIM_GlfCrsTeeGreen_Limits_LNK_Limit_AnyOne_Popup(strLimits_Limit_All, strLimits_Limit_AnyOne),strLimits_Limit_All+"||"+strLimits_Limit_AnyOne, test);
				se.element().enterOrValidateText(getCIM_GlfCrsTeeGreen_Limits_TXT_LimitAllItems(strLimits_Limit_All), strLimits_Limit_All, test);
			}*/
			
			se.element().selectPopupWithMagnifier(getCIM_GlfCrsTeeGreen_Limits_TXT_Limit_AnyOne(strLimits_Limit_AnyOne), getCIM_GlfCrsTeeGreen_Limits_LNK_Limit_AnyOne_Search(strLimits_Limit_AnyOne), strLimits_Limit_AnyOne, constants.NA, strLimits_Limit_AnyOne, strLimits_Limit_All, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCommon_KYTax_Rdo_OverrideBaseRate_Y(strOverideBaseRate_Yes_RDO), strOverideBaseRate_Yes_RDO, test);
			se.element().checkUncheckOrValidate(getCommon_KYTax_Rdo_OverrideBaseRate_N(strOverideBaseRate_No_RDO), strOverideBaseRate_No_RDO, test);
			
			if (strOverideBaseRate_Yes_RDO.equalsIgnoreCase("Check")) {
				se.element().enterOrValidateText(getCommon_KYTax_TXT_OverrideReason(strOverride_Reason_TXT), strOverride_Reason_TXT, test);
				se.element().enterOrValidateText(getCommon_CIM_RatingDetail_TXT_BaseRateOverride(strRatingDet_BaseRate_Override_TXT), strRatingDet_BaseRate_Override_TXT,test);
			}

			se.element().Click(getNext(),test);
			if(!strDone_BTN.equals("N/A")){
				se.element().Click(getDone(), test);
				}

		}
			 catch (Exception e) {
					se.verify().verifyEquals("Failed to execute CIM_GolfCoursesTeesAndGreens", true, false, true, test);
					
				}
						iteration++;
					}
				
			}
			catch (Exception e) {
				// TODO: handle exception
				se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
				test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
				testTearDown(se, test);
			}
				
		}
		}
