package pw.pages.CA;

/**
 * @author ${ra09491}
 */

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CA;

public class CA_GarageKeeperes extends OR_CA  {
	
	public void CAGarageKeepersPage(String strRegressionID,String transaction,String suspendSheet,ExtentTest test) throws IOException {
		
		try{
		
	    if(suspendSheet.equalsIgnoreCase(constants.GarageKeepers)){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
	         testTearDown(se, test);
	    }
	    
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.GarageKeepers, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strGarageKeepers_BTN_AddCov = (String) row.get("GarageKeepers_BTN_AddCov");
			String strGarageKeepers_BTN_Details = (String) row.get("GarageKeepers_BTN_Details");
			String strGarageKeepers_BTN_Done = (String) row.get("GarageKeepers_BTN_Done");
			String strGarageKeepers_TXT_PrimaryRatingBasis = (String) row.get("GarageKeepers_TXT_PrimaryRatingBasis");
			String strGarageKeepers_TXT_PrimaryRatingBasisFilterNeeded = (String) row.get("GarageKeepers_TXT_PrimaryRatingBasisFilterNeeded");
			String strGarageKeepers_TXT_LocationNumber = (String) row.get("GarageKeepers_TXT_LocationNumber");
			String strGarageKeepers_TXT_Name = (String) row.get("GarageKeepers_TXT_Name");
			String strGarageKeepers_TXT_Description = (String) row.get("GarageKeepers_TXT_Description");
			String strGarageKeepers_TXT_Street = (String) row.get("GarageKeepers_TXT_Street");
			String strGarageKeepers_TXT_Ste_Unt = (String) row.get("GarageKeepers_TXT_Ste/Unt");
			String strGarageKeepers_TXT_City = (String) row.get("GarageKeepers_TXT_City");
			String strGarageKeepers_TXT_State = (String) row.get("GarageKeepers_DDN_State");
			String strGarageKeepers_TXT_ZipCode = (String) row.get("GarageKeepers_TXT_ZipCode");
			String strGarageKeepers_TXT_Classification = (String) row.get("GarageKeepers_TXT_Classification");
			String strGarageKeepers_TXT_ClassificationFilterNeeded = (String) row.get("GarageKeepers_TXT_ClassificationFilterNeeded");
			String strGarageKeepers_CHK_OtherThanCollision = (String) row.get("GarageKeepers_CHK_OtherThanCollision");
			String strGarageKeepers_TXT_Type = (String) row.get("GarageKeepers_TXT_Type");
			String strGarageKeepers_TXT_TypeFilterNeeded = (String) row.get("GarageKeepers_TXT_TypeFilterNeeded");
			String strGarageKeepers_CHK_AllPerilsDeductible = (String) row.get("GarageKeepers_CHK_AllPerilsDeductible");
			String strGarageKeepers_TXT_DedPerCar = (String) row.get("GarageKeepers_TXT_DedPerCar");
			String strGarageKeepers_TXT_DedPerCarFilterNeeded = (String) row.get("GarageKeepers_TXT_DedPerCarFilterNeeded");
			String strGarageKeepers_TXT_DedPerOccurence = (String) row.get("GarageKeepers_TXT_DedPerOccurence");
			String strGarageKeepers_TXT_DedPerOccurencePopup = (String) row.get("GarageKeepers_TXT_DedPerOccurencePopup");
			String strGarageKeepers_TXT_OTC_MaxLimitFilterNeeded = (String) row.get("GarageKeepers_TXT_OTC_MaxLimitFilterNeeded");
			String strGarageKeepers_TXT_OTC_MaxLimit = (String) row.get("GarageKeepers_TXT_OTC_MaxLimit");
			String strGarageKeepers_CHK_Collision = (String) row.get("GarageKeepers_CHK_Collision");
			String strGarageKeepers_TXT_Deductible = (String) row.get("GarageKeepers_TXT_Deductible");
			String strGarageKeepers_TXT_DeductibleFilterNeeded = (String) row.get("GarageKeepers_TXT_DeductibleFilterNeeded");
			String strGarageKeepers_TXT_Coll_MaxLimit = (String) row.get("GarageKeepers_TXT_Coll_MaxLimit");
			String strGarageKeepers_TXT_Coll_MaxLimitFilterNeeded = (String) row.get("GarageKeepers_TXT_Coll_MaxLimitFilterNeeded");
			String strGarageKeepers_TXT_KYTax_City = (String) row.get("GarageKeepers_TXT_KYTax_City");
			String strGarageKeepers_TXT_KYTax_City_Code = (String) row.get("GarageKeepers_TXT_KYTax_City_Code");
			String strGarageKeepers_TXT_KYTax_County = (String) row.get("GarageKeepers_TXT_KYTax_County");
			String strGarageKeepers_TXT_KYTax_County_Code = (String) row.get("GarageKeepers_TXT_KYTax_County_Code");
			String strGarageKeepers_CHK_1is_no_tax_KY = (String) row.get("GarageKeepers_CHK_1is_no_tax_KY");
			String strGarageKeepers_CHK_1c_municipality_name_KY = (String) row.get("GarageKeepers_CHK_1c_municipality_name_KY");
			String strGarageKeepers_CHK_Remove = (String) row.get("GarageKeepers_CHK_Remove");
			String strGarageKeepers_BTN_Remove = (String) row.get("GarageKeepers_BTN_Remove");
			
			
			
			try
			{
				se.log().logTestStep("Garage Keepers Details");
				test.log(LogStatus.INFO, "Garage Keepers Details page","Transaction Step : "+transaction + "<br>" +"Page : CA_GarageKeepersPage");
				se.verify().verifyEquals("Garage Keepers Details  of PowerWriter ", getGarageKeepers_BTN_Label().isDisplayed(),true, true,test);
				
				if(!strGarageKeepers_BTN_AddCov.equals(constants.NA)){
					se.element().Click(getGarageKeepers_BTN_AddCov(strGarageKeepers_BTN_AddCov),strGarageKeepers_BTN_AddCov,test);
				}
				if(!strGarageKeepers_BTN_Details.equals(constants.NA)){
					se.element().Click(getGarageKeepers_BTN_Details(strGarageKeepers_BTN_Details),strGarageKeepers_BTN_Details,test);
				}
				
				if(strGarageKeepers_BTN_Remove.equalsIgnoreCase("Yes")){
					se.element().checkUncheckOrValidate(getGarageKeepers_CHK_Remove(strGarageKeepers_CHK_Remove),"Check",test);
					se.element().Click(getGarageKeepers_BTN_Remove(strGarageKeepers_BTN_Remove), test);
				}
				
				se.element().selectPopupWithMagnifier(getGarageKeepers_TXT_PrimaryRatingBasis(strGarageKeepers_TXT_PrimaryRatingBasis),getGarageKeepers_TXT_PrimaryRatingBasisSearch(strGarageKeepers_TXT_PrimaryRatingBasis),strGarageKeepers_TXT_PrimaryRatingBasis,strGarageKeepers_TXT_PrimaryRatingBasisFilterNeeded,strGarageKeepers_TXT_PrimaryRatingBasis, constants.NA, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getGarageKeepers_TXT_LocationNumber(strGarageKeepers_TXT_LocationNumber),strGarageKeepers_TXT_LocationNumber,test);
				se.element().enterOrValidateText(getGarageKeepers_TXT_Name(strGarageKeepers_TXT_Name),strGarageKeepers_TXT_Name,test);
				se.element().enterOrValidateText(getGarageKeepers_TXT_Description(strGarageKeepers_TXT_Description),strGarageKeepers_TXT_Description,test);
				se.element().enterOrValidateText(getGarageKeepers_TXT_Street(strGarageKeepers_TXT_Street),strGarageKeepers_TXT_Street,test);
				se.element().enterOrValidateText(getGarageKeepers_TXT_Ste_Unt(strGarageKeepers_TXT_Ste_Unt),strGarageKeepers_TXT_Ste_Unt,test);
				se.element().enterOrValidateText(getGarageKeepers_TXT_City(strGarageKeepers_TXT_City),strGarageKeepers_TXT_City,test);
				se.element().enterOrValidateText(getGarageKeepers_TXT_State(strGarageKeepers_TXT_State),strGarageKeepers_TXT_State,test);
				se.element().enterOrValidateText(getGarageKeepers_TXT_ZipCode(strGarageKeepers_TXT_ZipCode),strGarageKeepers_TXT_ZipCode,test);
				se.element().enterOrValidateText(getGarageKeepers_TXT_KYTax_City(strGarageKeepers_TXT_KYTax_City),strGarageKeepers_TXT_KYTax_City,test);
				se.element().enterOrValidateText(getGarageKeepers_TXT_KYTax_City_Code(strGarageKeepers_TXT_KYTax_City_Code),strGarageKeepers_TXT_KYTax_City_Code,test);
				se.element().enterOrValidateText(getGarageKeepers_TXT_KYTax_County(strGarageKeepers_TXT_KYTax_County),strGarageKeepers_TXT_KYTax_County,test);
				se.element().enterOrValidateText(getGarageKeepers_TXT_KYTax_County_Code(strGarageKeepers_TXT_KYTax_County_Code),strGarageKeepers_TXT_KYTax_County_Code,test);
				se.element().selectPopupWithMagnifier(getGarageKeepers_TXT_Classification(strGarageKeepers_TXT_Classification),getGarageKeepers_TXT_ClassificationSearch(strGarageKeepers_TXT_Classification),strGarageKeepers_TXT_Classification,strGarageKeepers_TXT_ClassificationFilterNeeded,strGarageKeepers_TXT_Classification, constants.NA, constants.NA,constants.NA,test);
				se.element().checkUncheckOrValidate(getGarageKeepers_CHK_OtherThanCollision(strGarageKeepers_CHK_OtherThanCollision),strGarageKeepers_CHK_OtherThanCollision,test);
				se.element().selectPopupWithMagnifier(getGarageKeepers_TXT_Type(strGarageKeepers_TXT_Type),getGarageKeepers_TXT_TypeSearch(strGarageKeepers_TXT_Type),strGarageKeepers_TXT_Type,strGarageKeepers_TXT_TypeFilterNeeded,strGarageKeepers_TXT_Type, constants.NA, constants.NA,constants.NA,test);
				se.element().checkUncheckOrValidate(getGarageKeepers_CHK_AllPerilsDeductible(strGarageKeepers_CHK_AllPerilsDeductible),strGarageKeepers_CHK_AllPerilsDeductible,test);
				se.element().selectPopupWithMagnifier(getGarageKeepers_TXT_DedPerCar(strGarageKeepers_TXT_DedPerCar),getGarageKeepers_TXT_DedPerCarSearch(strGarageKeepers_TXT_DedPerCar),strGarageKeepers_TXT_DedPerCar,strGarageKeepers_TXT_DedPerCarFilterNeeded,strGarageKeepers_TXT_DedPerCar, strGarageKeepers_TXT_DedPerOccurencePopup, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getGarageKeepers_TXT_DedPerOccurence(strGarageKeepers_TXT_DedPerOccurence),strGarageKeepers_TXT_DedPerOccurence,test);
				se.element().selectPopupWithMagnifier(getGarageKeepers_TXT_OTC_MaxLimit(strGarageKeepers_TXT_OTC_MaxLimit),getGarageKeepers_TXT_OTC_MaxLimitSearch(strGarageKeepers_TXT_OTC_MaxLimit),strGarageKeepers_TXT_OTC_MaxLimit,strGarageKeepers_TXT_OTC_MaxLimitFilterNeeded,strGarageKeepers_TXT_OTC_MaxLimit, constants.NA, constants.NA,constants.NA,test);
				se.element().checkUncheckOrValidate(getGarageKeepers_CHK_Collision(strGarageKeepers_CHK_Collision),strGarageKeepers_CHK_Collision,test);
				se.element().selectPopupWithMagnifier(getGarageKeepers_TXT_Deductible(strGarageKeepers_TXT_Deductible),getGarageKeepers_TXT_DeductibleSearch(strGarageKeepers_TXT_Deductible),strGarageKeepers_TXT_Deductible,strGarageKeepers_TXT_DeductibleFilterNeeded,strGarageKeepers_TXT_Deductible, constants.NA, constants.NA,constants.NA,test);
				se.element().selectPopupWithMagnifier(getGarageKeepers_TXT_Coll_MaxLimit(strGarageKeepers_TXT_Coll_MaxLimit),getGarageKeepers_TXT_Coll_MaxLimitSearch(strGarageKeepers_TXT_Coll_MaxLimit),strGarageKeepers_TXT_Coll_MaxLimit,strGarageKeepers_TXT_Coll_MaxLimitFilterNeeded,strGarageKeepers_TXT_Coll_MaxLimit, constants.NA, constants.NA,constants.NA,test);
				se.element().checkUncheckOrValidate(getGarageKeepers_CHK_1is_no_tax_KY(strGarageKeepers_CHK_1is_no_tax_KY),strGarageKeepers_CHK_1is_no_tax_KY,test);
				se.element().checkUncheckOrValidate(getGarageKeepers_CHK_1c_municipality_name_KY(strGarageKeepers_CHK_1c_municipality_name_KY),strGarageKeepers_CHK_1c_municipality_name_KY,test);
				se.element().clickElement(getNext(),test);
				if(!strGarageKeepers_BTN_Done.equals(constants.NA)){
					se.element().Click(getGarageKeepers_BTN_Done(strGarageKeepers_BTN_Done),strGarageKeepers_BTN_Done,test);
				}
				
			}
			catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CA_GarageKeepers page ", true, false, true, test);
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
