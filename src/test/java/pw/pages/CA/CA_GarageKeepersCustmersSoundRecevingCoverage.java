package pw.pages.CA;
/**
 * @author ${is09492}
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

public class CA_GarageKeepersCustmersSoundRecevingCoverage extends OR_CA{

	public void GarageKeepersCustmersSoundRecevingCoverage(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		    if(SuspendSheet.equalsIgnoreCase("GarageKeepersCustmersSoundRecevingCoverage")){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
		         testTearDown(se, test);
		    }
			List<Map<String, String>> table = ExcelOperations.getPagesData("GarageKeepersCustmersSoundRecev", strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
				String strGarageKeepersCustmersSoundRecevingCov_BTN_AddCov = (String) row.get("GarageKeepersCustmersSoundRecevingCov_BTN_AddCov");
				String strGarageKeepersCustmersSoundRecevingCov_BTN_Details = (String) row.get("GarageKeepersCustmersSoundRecevingCov_BTN_Details");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasis = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasis");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_LocationNumber = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_LocationNumber");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_Name = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_Name");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_Description = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_Description");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_Street = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_Street");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_City = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_City");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_State = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_State");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_ZipCode = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_ZipCode");
				String strGarageKeepersCustmersSoundRecevingCov_BTN_Done = (String) row.get("GarageKeepersCustmersSoundRecevingCov_BTN_Done");
				String strGarageKeepersCustmersSoundRecevingCov_CHK_DoNotApplyCityOrCountyTaxes = (String) row.get("GarageKeepersCustmersSoundRecevingCov_CHK_DoNotApplyCityOrCountyTaxes");
				String strGarageKeepersCustmersSoundRecevingCov_CHK_AllCityName = (String) row.get("GarageKeepersCustmersSoundRecevingCov_CHK_AllCityName");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_KYCity = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_KYCity");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_CityCode = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_CityCode");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_County = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_County");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_CountyCode = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_CountyCode");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_TaxCode = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_TaxCode");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_Classification = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_Classification");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_ClassificationFilterNeeded = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_ClassificationFilterNeeded");
				String strGarageKeepersCustmersSoundRecevingCov_CHK_OtherThanCollision = (String) row.get("GarageKeepersCustmersSoundRecevingCov_CHK_OtherThanCollision");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_Type = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_Type");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_TypeFilterNeeded = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_TypeFilterNeeded");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_DedPerCar = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_DedPerCar");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_DedPerCarFilterNeeded = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_DedPerCarFilterNeeded");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_DedPerOccurence = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_DedPerOccurence");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_OTCMaxLimitFilterNeeded = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_OTCMaxLimitFilterNeeded");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_OTCMaxLimit = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_OTCMaxLimit");
				String strGarageKeepersCustmersSoundRecevingCov_CHK_Collosion = (String) row.get("GarageKeepersCustmersSoundRecevingCov_CHK_Collosion");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_Deductible = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_Deductible");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_DeductibleFilterNeeded = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_DeductibleFilterNeeded");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_MaxLimit = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_MaxLimit");
				String strGarageKeepersCustmersSoundRecevingCov_TXT_MaxLimitFilterNeeded = (String) row.get("GarageKeepersCustmersSoundRecevingCov_TXT_MaxLimitFilterNeeded");

				try{
				se.log().logTestStep("CA_GarageKeepersCustmersSoundRecevingCov");
				test.log(LogStatus.INFO, "CA_GarageKeepersCustmersSoundRecevingCov page","Transaction Step : "+transaction + "<br>" +"Page : CA_GarageKeepersCustmersSoundRecevingCov");
				se.verify().verifyEquals("CA_GarageKeepersCustmersSoundRecevingCov Details  of PowerWriter ", getGarageKeepersCustmersSoundRecevingCov_BTN_Label().isDisplayed(),true, true,test);
				
				if(strGarageKeepersCustmersSoundRecevingCov_BTN_AddCov.equalsIgnoreCase("Yes")){
					se.element().Click(getGarageKeepersCustmersSoundRecevingCov_BTN_AddCov(),test);
				}
				if(strGarageKeepersCustmersSoundRecevingCov_BTN_Details.equalsIgnoreCase("Yes")){
					se.element().Click(getGarageKeepersCustmersSoundRecevingCov_BTN_Details(strGarageKeepersCustmersSoundRecevingCov_BTN_Details),test);
				}
				
				se.element().selectPopupWithMagnifier(getGarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasis(strGarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasis), getGarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasisSearch(strGarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasis), strGarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasis, constants.NA, strGarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasis, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getGarageKeepersCustmersSoundRecevingCov_TXT_LocationNumber(strGarageKeepersCustmersSoundRecevingCov_TXT_LocationNumber),strGarageKeepersCustmersSoundRecevingCov_TXT_LocationNumber,test);
				se.element().enterOrValidateText(getGarageKeepersCustmersSoundRecevingCov_TXT_Name(strGarageKeepersCustmersSoundRecevingCov_TXT_Name),strGarageKeepersCustmersSoundRecevingCov_TXT_Name,test);
				se.element().enterOrValidateText(getGarageKeepersCustmersSoundRecevingCov_TXT_Description(strGarageKeepersCustmersSoundRecevingCov_TXT_Description),strGarageKeepersCustmersSoundRecevingCov_TXT_Description,test);
				se.element().enterOrValidateText(getGarageKeepersCustmersSoundRecevingCov_TXT_Street(strGarageKeepersCustmersSoundRecevingCov_TXT_Street),strGarageKeepersCustmersSoundRecevingCov_TXT_Street,test);
				se.element().enterOrValidateText(getGarageKeepersCustmersSoundRecevingCov_TXT_City(strGarageKeepersCustmersSoundRecevingCov_TXT_City),strGarageKeepersCustmersSoundRecevingCov_TXT_City,test);
				se.element().enterOrValidateText(getGarageKeepersCustmersSoundRecevingCov_TXT_State(strGarageKeepersCustmersSoundRecevingCov_TXT_State),strGarageKeepersCustmersSoundRecevingCov_TXT_State,test);
				se.element().enterOrValidateText(getGarageKeepersCustmersSoundRecevingCov_TXT_ZipCode(strGarageKeepersCustmersSoundRecevingCov_TXT_ZipCode),strGarageKeepersCustmersSoundRecevingCov_TXT_ZipCode,test);
				se.element().enterOrValidateText(getGarageKeepersCustmersSoundRecevingCov_CHK_DoNotApplyCityOrCountyTaxes(strGarageKeepersCustmersSoundRecevingCov_CHK_DoNotApplyCityOrCountyTaxes),strGarageKeepersCustmersSoundRecevingCov_CHK_DoNotApplyCityOrCountyTaxes,test);
				se.element().enterOrValidateText(getGarageKeepersCustmersSoundRecevingCov_CHK_AllCityName(strGarageKeepersCustmersSoundRecevingCov_CHK_AllCityName),strGarageKeepersCustmersSoundRecevingCov_CHK_AllCityName,test);
				se.element().enterOrValidateText(getGarageKeepersCustmersSoundRecevingCov_TXT_KYCity(strGarageKeepersCustmersSoundRecevingCov_TXT_KYCity),strGarageKeepersCustmersSoundRecevingCov_TXT_KYCity,test);
				se.element().enterOrValidateText(getGarageKeepersCustmersSoundRecevingCov_TXT_CityCode(strGarageKeepersCustmersSoundRecevingCov_TXT_CityCode),strGarageKeepersCustmersSoundRecevingCov_TXT_CityCode,test);
				se.element().enterOrValidateText(getGarageKeepersCustmersSoundRecevingCov_TXT_County(strGarageKeepersCustmersSoundRecevingCov_TXT_County),strGarageKeepersCustmersSoundRecevingCov_TXT_County,test);
				se.element().enterOrValidateText(getGarageKeepersCustmersSoundRecevingCov_TXT_CountyCode(strGarageKeepersCustmersSoundRecevingCov_TXT_CountyCode),strGarageKeepersCustmersSoundRecevingCov_TXT_CountyCode,test);
				se.element().enterOrValidateText(getGarageKeepersCustmersSoundRecevingCov_TXT_TaxCode(strGarageKeepersCustmersSoundRecevingCov_TXT_TaxCode),strGarageKeepersCustmersSoundRecevingCov_TXT_TaxCode,test);
				se.element().selectPopupWithMagnifier(getGarageKeepersCustmersSoundRecevingCov_TXT_Classification(strGarageKeepersCustmersSoundRecevingCov_TXT_Classification),getGarageKeepersCustmersSoundRecevingCov_BTN_ClassificationSearch(strGarageKeepersCustmersSoundRecevingCov_TXT_Classification),strGarageKeepersCustmersSoundRecevingCov_TXT_Classification,strGarageKeepersCustmersSoundRecevingCov_TXT_ClassificationFilterNeeded,strGarageKeepersCustmersSoundRecevingCov_TXT_Classification, constants.NA, constants.NA,constants.NA,test);
				se.element().checkUncheckOrValidate(getGarageKeepersCustmersSoundRecevingCov_CHK_OtherThanCollision(strGarageKeepersCustmersSoundRecevingCov_CHK_OtherThanCollision),strGarageKeepersCustmersSoundRecevingCov_CHK_OtherThanCollision,test);
				se.element().selectPopupWithMagnifier(getGarageKeepersCustmersSoundRecevingCov_TXT_Type(strGarageKeepersCustmersSoundRecevingCov_TXT_Type),getGarageKeepersCustmersSoundRecevingCov_BTN_TypeSearch(strGarageKeepersCustmersSoundRecevingCov_TXT_Type),strGarageKeepersCustmersSoundRecevingCov_TXT_Type,strGarageKeepersCustmersSoundRecevingCov_TXT_TypeFilterNeeded,strGarageKeepersCustmersSoundRecevingCov_TXT_Type, constants.NA, constants.NA,constants.NA,test);
				se.element().selectPopupWithMagnifier(getGarageKeepersCustmersSoundRecevingCov_TXT_DedPerCar(strGarageKeepersCustmersSoundRecevingCov_TXT_DedPerCar),getGarageKeepersCustmersSoundRecevingCov_BTN_DedPerCarSearch(strGarageKeepersCustmersSoundRecevingCov_TXT_DedPerCar),strGarageKeepersCustmersSoundRecevingCov_TXT_DedPerCar,strGarageKeepersCustmersSoundRecevingCov_TXT_DedPerCarFilterNeeded,strGarageKeepersCustmersSoundRecevingCov_TXT_DedPerCar, constants.NA, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getGarageKeepersCustmersSoundRecevingCov_TXT_DedPerOccurence(strGarageKeepersCustmersSoundRecevingCov_TXT_DedPerOccurence),strGarageKeepersCustmersSoundRecevingCov_TXT_DedPerOccurence,test);
				se.element().selectPopupWithMagnifier(getGarageKeepersCustmersSoundRecevingCov_TXT_OTCMaxLimit(strGarageKeepersCustmersSoundRecevingCov_TXT_OTCMaxLimit), getGarageKeepersCustmersSoundRecevingCov_BTN_OTCMaxLimitSearch(strGarageKeepersCustmersSoundRecevingCov_TXT_OTCMaxLimit), strGarageKeepersCustmersSoundRecevingCov_TXT_OTCMaxLimit, strGarageKeepersCustmersSoundRecevingCov_TXT_OTCMaxLimitFilterNeeded, strGarageKeepersCustmersSoundRecevingCov_TXT_OTCMaxLimit, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getGarageKeepersCustmersSoundRecevingCov_CHK_Collosion(strGarageKeepersCustmersSoundRecevingCov_CHK_Collosion),strGarageKeepersCustmersSoundRecevingCov_CHK_Collosion,test);
				se.element().selectPopupWithMagnifier(getGarageKeepersCustmersSoundRecevingCov_TXT_Deductible(strGarageKeepersCustmersSoundRecevingCov_TXT_Deductible),getGarageKeepersCustmersSoundRecevingCov_BTN_DeductibleSearch(strGarageKeepersCustmersSoundRecevingCov_TXT_Deductible),strGarageKeepersCustmersSoundRecevingCov_TXT_Deductible,strGarageKeepersCustmersSoundRecevingCov_TXT_DeductibleFilterNeeded,strGarageKeepersCustmersSoundRecevingCov_TXT_Deductible, constants.NA, constants.NA,constants.NA,test);
				se.element().selectPopupWithMagnifier(getGarageKeepersCustmersSoundRecevingCov_TXT_MaxLimit(strGarageKeepersCustmersSoundRecevingCov_TXT_MaxLimit),getGarageKeepersCustmersSoundRecevingCov_BTN_MaxLimitSearch(strGarageKeepersCustmersSoundRecevingCov_TXT_MaxLimit),strGarageKeepersCustmersSoundRecevingCov_TXT_MaxLimit,strGarageKeepersCustmersSoundRecevingCov_TXT_MaxLimitFilterNeeded,strGarageKeepersCustmersSoundRecevingCov_TXT_MaxLimit, constants.NA, constants.NA,constants.NA,test);

				se.element().clickElement(getNext());
				if(strGarageKeepersCustmersSoundRecevingCov_BTN_Done.equals(constants.Yes)){
					se.element().Click(getDone(),test);
				}
				
				}catch(Exception e) {
				se.verify().verifyEquals("Failed to fill in details for CA_GarageKeepersCustmersSoundRecevingCov", true, false, true, test);
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
