package pw.pages.CA;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CA;
import pw.OR.OR_CP;
import pw.OR.OR_GL;


/**
* @author ${ro09528}
*/
public class CA_FungiOrBacteriaLiability extends OR_CA{
	
	public void FungiOrBacteriaLiability(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		//String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(suspendSheet.equalsIgnoreCase(constants.CA_FungiOrBacteriaLiability)){
			
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_FungiOrBacteriaLiability, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strFungiOrBacteriaLiability_CHK_Coverage_Excluded = (String) row.get("FungiOrBacteriaLiability_CHK_Coverage_Excluded");
			String strFungiOrBacteriaLiability_CHK_Coverage_Limited = (String) row.get("FungiOrBacteriaLiability_CHK_Coverage_Limited");
			String strFungiOrBacteriaLiability_TXT_AggregateLimit = (String) row.get("FungiOrBacteriaLiability_TXT_AggregateLimit");
			String strFungiOrBacteriaLiability_TXT_AggregateLimitFilterNeeded = (String) row.get("FungiOrBacteriaLiability_TXT_AggregateLimitFilterNeeded");
			String strFungiOrBacteriaLiability_TXT_AnnualPremium = (String) row.get("FungiOrBacteriaLiability_TXT_AnnualPremium");
			String strFungiOrBacteriaLiability_CHK_KY_DoNotApplyCity = (String) row.get("FungiOrBacteriaLiability_CHK_KY_DoNotApplyCity");
			String strFungiOrBacteriaLiability_CHK_KY_AllCityName = (String) row.get("FungiOrBacteriaLiability_CHK_KY_AllCityName");
			String strFungiOrBacteriaLiability_TXT_Tax_KY_City = (String) row.get("FungiOrBacteriaLiability_TXT_Tax_KY_City");
			String strFungiOrBacteriaLiability_TXT_Tax_KY_CityFilterNeeded = (String) row.get("FungiOrBacteriaLiability_TXT_Tax_KY_CityFilterNeeded");
			String strFungiOrBacteriaLiability_TXT_Tax_KY_City_Code = (String) row.get("FungiOrBacteriaLiability_TXT_Tax_KY_City_Code");
			String strFungiOrBacteriaLiability_TXT_Tax_KY_County = (String) row.get("FungiOrBacteriaLiability_TXT_Tax_KY_County");
			String strFungiOrBacteriaLiability_TXT_Tax_KY_CountyFilterNeeded = (String) row.get("FungiOrBacteriaLiability_TXT_Tax_KY_CountyFilterNeeded");
			String strFungiOrBacteriaLiability_TXT_Tax_KY_County_Code = (String) row.get("FungiOrBacteriaLiability_TXT_Tax_KY_County_Code");
			String strFungiOrBacteriaLiability_TXT_KY_Taxcode = (String) row.get("FungiOrBacteriaLiability_TXT_KY_Taxcode");

		try{
			se.log().logTestStep("CA_FungiOrBacteriaLiability");
			test.log(LogStatus.INFO, "CA_FungiOrBacteriaLiability page","Transaction Step : "+transaction + "<br>" +"Page : CA_FungiOrBacteriaLiability");
			se.verify().verifyEquals("CA_FungiOrBacteriaLiability Page of PowerWriter ", getFungiOrBacteriaLiability().isDisplayed(),true, true,test);
						
			se.element().checkUncheckOrValidate(getFungiOrBacteriaLiability_CHK_Coverage_Excluded(strFungiOrBacteriaLiability_CHK_Coverage_Excluded),strFungiOrBacteriaLiability_CHK_Coverage_Excluded,test);
			se.element().checkUncheckOrValidate(getFungiOrBacteriaLiability_CHK_Coverage_Limited(strFungiOrBacteriaLiability_CHK_Coverage_Limited),strFungiOrBacteriaLiability_CHK_Coverage_Limited,test);
			se.element().selectPopupWithMagnifier(getFungiOrBacteriaLiability_TXT_AggregateLimit(strFungiOrBacteriaLiability_TXT_AggregateLimit),getFungiOrBacteriaLiability_TXT_AggregateLimitSearch(strFungiOrBacteriaLiability_TXT_AggregateLimit),strFungiOrBacteriaLiability_TXT_AggregateLimit,strFungiOrBacteriaLiability_TXT_AggregateLimitFilterNeeded,strFungiOrBacteriaLiability_TXT_AggregateLimit, constants.NA, constants.NA,constants.NA,test);
			se.element().enterOrValidateText(getFungiOrBacteriaLiability_TXT_AnnualPremium(strFungiOrBacteriaLiability_TXT_AnnualPremium),strFungiOrBacteriaLiability_TXT_AnnualPremium,test);
			se.element().checkUncheckOrValidate(getFungiOrBacteriaLiability_CHK_KY_DoNotApplyCity(strFungiOrBacteriaLiability_CHK_KY_DoNotApplyCity),strFungiOrBacteriaLiability_CHK_KY_DoNotApplyCity,test);
			se.element().checkUncheckOrValidate(getFungiOrBacteriaLiability_CHK_KY_AllCityName(strFungiOrBacteriaLiability_CHK_KY_AllCityName),strFungiOrBacteriaLiability_CHK_KY_AllCityName,test);
			se.element().enterOrValidateText(getFungiOrBacteriaLiability_TXT_Tax_KY_City_Code(strFungiOrBacteriaLiability_TXT_Tax_KY_City_Code),strFungiOrBacteriaLiability_TXT_Tax_KY_City_Code,test);
			se.element().enterOrValidateText(getFungiOrBacteriaLiability_TXT_Tax_KY_County_Code(strFungiOrBacteriaLiability_TXT_Tax_KY_County_Code),strFungiOrBacteriaLiability_TXT_Tax_KY_County_Code,test);
			se.element().enterOrValidateText(getFungiOrBacteriaLiability_TXT_KY_Taxcode(strFungiOrBacteriaLiability_TXT_KY_Taxcode),strFungiOrBacteriaLiability_TXT_KY_Taxcode,test);
			se.element().selectPopupWithMagnifier(getFungiOrBacteriaLiability_TXT_Tax_KY_City(strFungiOrBacteriaLiability_TXT_Tax_KY_City),getFungiOrBacteriaLiability_TXT_Tax_KY_CitySearch(strFungiOrBacteriaLiability_TXT_Tax_KY_City),strFungiOrBacteriaLiability_TXT_Tax_KY_City,strFungiOrBacteriaLiability_TXT_Tax_KY_CityFilterNeeded,strFungiOrBacteriaLiability_TXT_Tax_KY_City, constants.NA, constants.NA,constants.NA,test);
			se.element().selectPopupWithMagnifier(getFungiOrBacteriaLiability_TXT_Tax_KY_County(strFungiOrBacteriaLiability_TXT_Tax_KY_County),getFungiOrBacteriaLiability_TXT_Tax_KY_CountySearch(strFungiOrBacteriaLiability_TXT_Tax_KY_County),strFungiOrBacteriaLiability_TXT_Tax_KY_County,strFungiOrBacteriaLiability_TXT_Tax_KY_CountyFilterNeeded,strFungiOrBacteriaLiability_TXT_Tax_KY_County, constants.NA, constants.NA,constants.NA,test);
			se.element().clickElement(getNext());
			
			}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CA_FungiOrBacteriaLiability ", true, false, true, test);		
										
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