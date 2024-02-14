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

public class CIM_FineArtsFloater extends OR_CIM {

	public void Add_FineArtsFloater(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase("CIM_FineArtsFloater")) {
			test.log(LogStatus.INFO, "Page Suspended :- ",
					"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_FineArtsFloater", strRegressionID,
				transaction);
		int iteration = 0;
		while (iteration < table.size()) {

			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
			String strAdd_BTN = (String) row.get("Add_BTN");
			String strDone_BTN = (String) row.get("Done_BTN");
			String strItem_No_TXT = (String) row.get("Item_No_TXT");
			String strLoc_Loc_No_TXT = (String) row.get("Loc_LocNo_TXT");
			String strLoc_Name_TXT = (String) row.get("Loc_Name_TXT");
			String strLoc_Description_TXT = (String) row.get("Loc_Description_TXT");
			String strLoc_Street_TXT = (String) row.get("Loc_Street_TXT");
			String strLoc_SteUnit_TXT = (String) row.get("Loc_SteUnit_TXT");
			String strLoc_City_TXT = (String) row.get("Loc_City_TXT");
			String strLoc_State_TXT = (String) row.get("Loc_State_TXT");
			String strLoc_Zip_TXT = (String) row.get("Loc_Zip_TXT");
			String strKYTax_DoNotApplyTaxes_CHK = (String) row.get("KYTax_DoNotApplyTaxes?_CHK");
			String strKYTax_AllCityName_CHK = (String) row.get("KYTax_AllCityName_CHK");
			String strKYTax_City_TXT = (String) row.get("KYTax_City_TXT");
			String strKYTax_CityCode_TXT = (String) row.get("KYTax_CityCode_TXT");
			String strKYTax_County_TXT = (String) row.get("KYTax_County_TXT");
			String strKYTax_CountyCode_TXT = (String) row.get("KYTax_CountyCode_TXT");
			String strKYTax_TaxCode_TXT = (String) row.get("KYTax_TaxCode_TXT");
			String strFineArtsFloater_Desc_TXT = (String) row.get("FineArtsFloater_Desc_TXT");
			String strFineArtFloater_Limit_TXT = (String) row.get("FineArtFloater_Limit_TXT");
			String strFineArtsFloater_Desc_Ded_TXT = (String) row.get("FineArtsFloater_Desc_Ded_TXT");
			String strOverideBaseRate_Yes_RDO = (String) row.get("OverideBaseRate?_Yes_RDO");
			String strOverideBaseRate_No_RDO = (String) row.get("OverideBaseRate?_No_RDO");
			String strOverride_Reason_TXT = (String) row.get("Override_Reason_TXT");
			String strRatingDet_BaseRate_TXT = (String) row.get("RatingDet_BaseRate_TXT");
			String strRatingDet_BaseRate_Override_TXT = (String) row.get("RatingDet_BaseRate_Override_TXT");
			String strRatingDet_Desc_Ded_Factor_TXT = (String) row.get("RatingDet_Desc_Ded_Factor_TXT");
			String strRatingDet_Trans_Adj_Factor_TXT = (String) row.get("RatingDet_Trans_Adj_Factor_TXT");
			String strRatingDet_FinalRate_TXT = (String) row.get("RatingDet_FinalRate_TXT");
			String strRatingDet_Override_FinalRate_TXT = (String) row.get("RatingDet_Override_FinalRate_TXT");
			String strRatingDet_Limit_TXT = (String) row.get("RatingDet_Limit_TXT");
			String strRatingDet_Premium_TXT = (String) row.get("RatingDet_Premium_TXT");
			String strRatingDet_Override_Premium_TXT = (String) row.get("RatingDet_Override_Premium_TXT");
			try{
			if(strAdd_BTN.equalsIgnoreCase(constants.Yes)){

				se.element().clickElement(getCommon_CIM_Cov_BTN_Add(strAdd_BTN),test);
				se.element().enterOrValidateText(getCIM_FineArtFloater_TXT_item_no(strItem_No_TXT), strItem_No_TXT, test);
				se.element().selectPopupWithMagnifier(getCommon_CIM_Loc_TXT_location_no(strLoc_Loc_No_TXT), getCommon_CIM_Loc_TXT_location_noSearch(strLoc_Loc_No_TXT), strLoc_Loc_No_TXT, constants.NA, strLoc_Loc_No_TXT, constants.NA, constants.NA, constants.NA, test);
				//se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_location_no(strLoc_Loc_No_TXT), strLoc_Loc_No_TXT, test);
				se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_name(strLoc_Name_TXT), strLoc_Name_TXT, test);
				se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_description(strLoc_Description_TXT), strLoc_Description_TXT, test);
				se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_Street(strLoc_Street_TXT), strLoc_Street_TXT, test);
				se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_SteUnit(strLoc_SteUnit_TXT), strLoc_SteUnit_TXT, test);
				se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_city(strLoc_City_TXT), strLoc_City_TXT, test);
				se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_State(strLoc_State_TXT), strLoc_State_TXT, test);
				se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_zip_code(strLoc_Zip_TXT), strLoc_Zip_TXT, test);
				se.element().checkUncheckOrValidate(getCommon_KYTax_CHK_DoNotApplyTaxes(strKYTax_DoNotApplyTaxes_CHK),strKYTax_DoNotApplyTaxes_CHK, test);
				se.element().checkUncheckOrValidate(getCommon_KYTax_CHK_AllCityName(strKYTax_AllCityName_CHK), strKYTax_AllCityName_CHK, test);
				if(!strKYTax_DoNotApplyTaxes_CHK.equalsIgnoreCase(constants.NA)){
					if (!getCommon_KYTax_CHK_DoNotApplyTaxes(strKYTax_DoNotApplyTaxes_CHK).isSelected()) {
						se.element().enterOrValidateText(getCommon_KYTax_TXT_City(strKYTax_City_TXT), strKYTax_City_TXT, test);
						se.element().enterOrValidateText(getCommon_KYTax_TXT_CityCode(strKYTax_CityCode_TXT), strKYTax_CityCode_TXT, test);
						se.element().enterOrValidateText(getCommon_KYTax_TXT_County(strKYTax_County_TXT), strKYTax_County_TXT, test);
						se.element().enterOrValidateText(getCommon_KYTax_TXT_CountyCode(strKYTax_CountyCode_TXT), strKYTax_CountyCode_TXT, test);
						se.element().enterOrValidateText(getCommon_KYTax_TXT_TaxCode(strKYTax_TaxCode_TXT), strKYTax_TaxCode_TXT, test);
					}
				}
				
				se.element().enterOrValidateText(getCommon_KYTax_TXT_Description(strFineArtsFloater_Desc_TXT), strFineArtsFloater_Desc_TXT, test);
				se.element().enterOrValidateText(getCommon_KYTax_TXT_Limit(strFineArtFloater_Limit_TXT), strFineArtFloater_Limit_TXT, test);
				
						/*
						 * if(!strFineArtsFloater_Desc_Ded_TXT.equalsIgnoreCase(constants.NA) &&
						 * !strFineArtsFloater_Desc_Ded_TXT.contains(constants.Validate)) {
						 * 
						 * se.element().clickSearchIcon(getCommon_KYTax_BTN_Desc_DedSearch(
						 * strFineArtsFloater_Desc_Ded_TXT),test); se.util().sleep(3000);
						 * se.element().Click(getCommon_KYTax_LNK_Desc_Ded_Popup(
						 * strFineArtsFloater_Desc_Ded_TXT), strFineArtsFloater_Desc_Ded_TXT, test); }
						 * else { se.element().enterOrValidateText(getCommon_KYTax_TXT_Desc_Ded(
						 * strFineArtsFloater_Desc_Ded_TXT), strFineArtsFloater_Desc_Ded_TXT, test); }
						 */
				
				se.element().selectPopupWithMagnifier(getCommon_KYTax_TXT_Desc_Ded(strFineArtsFloater_Desc_Ded_TXT), getCommon_KYTax_BTN_Desc_DedSearch(strFineArtsFloater_Desc_Ded_TXT), strFineArtsFloater_Desc_Ded_TXT, constants.NA, strFineArtsFloater_Desc_Ded_TXT, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCommon_KYTax_Rdo_OverrideBaseRate_Y(strOverideBaseRate_Yes_RDO), strOverideBaseRate_Yes_RDO, test);
				se.element().checkUncheckOrValidate(getCommon_KYTax_Rdo_OverrideBaseRate_N(strOverideBaseRate_No_RDO), strOverideBaseRate_No_RDO, test);
				
				if (strOverideBaseRate_Yes_RDO.equalsIgnoreCase("Check")) {
					se.element().enterOrValidateText(getCommon_KYTax_TXT_OverrideReason(strOverride_Reason_TXT), strOverride_Reason_TXT, test);
					se.element().enterOrValidateText(getCommon_CIM_RatingDetail_TXT_BaseRateOverride(strRatingDet_BaseRate_Override_TXT), strRatingDet_BaseRate_Override_TXT,test);
				}
	
				se.element().Click(getNext(),test);
			}
			if(strDone_BTN.equalsIgnoreCase(constants.Yes)){
				se.element().Click(getDone(),test);
			}
		}
			 catch (Exception e) {
					se.verify().verifyEquals("Failed to execute CIM_FineArtsFloater ", true, false, true, test);	
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
