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

public class CIM_GolfCartCoverage extends OR_CIM {
	public void GolfCartCoverage(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_GolfCartCoverage")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_GolfCartCoverage", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_GolfCartCoverage_TXT_AnyOneCartLimit=(String) row.get("CIM_GolfCartCoverage_TXT_AnyOneCartLimit");
		String strCIM_GolfCartCoverage_TXT_CatastropheLim=(String) row.get("CIM_GolfCartCoverage_TXT_CatastropheLim");
		String strCIM_GolfCartCoverage_CHK_Flood=(String) row.get("CIM_GolfCartCoverage_CHK_Flood");
		String strCIM_GolfCartCoverage_CHK_Flood_AdditionalPerilsDedApplies=(String) row.get("CIM_GolfCartCoverage_CHK_Flood_AdditionalPerilsDedApplies");
		String strCIM_GolfCartCoverage_CHK_GroundWater=(String) row.get("CIM_GolfCartCoverage_CHK_GroundWater");
		String strCIM_GolfCartCoverage_CHK_GroundWater_AddtnlPerilsDedApplies=(String) row.get("CIM_GolfCartCoverage_CHK_GroundWater_AddtnlPerilsDedApplies");
		String strCIM_GolfCartCoverage_CHK_EarthMovement=(String) row.get("CIM_GolfCartCoverage_CHK_EarthMovement");
		String strCIM_GolfCartCoverage_CHK_EarthMovement_AddtnlPerilsDedApplies=(String) row.get("CIM_GolfCartCoverage_CHK_EarthMovement_AddtnlPerilsDedApplies");
		String strCIM_GolfCartCoverage_TXT_AdditionalPerilsDeductible=(String) row.get("CIM_GolfCartCoverage_TXT_AdditionalPerilsDeductible");
		String strCIM_GolfCartCoverage_CHK_OverrideBaseRate_Yes=(String) row.get("CIM_GolfCartCoverage_CHK_OverrideBaseRate_Yes");
		String strCIM_GolfCartCoverage_TXT_OverrideReason=(String) row.get("CIM_GolfCartCoverage_TXT_OverrideReason");
		String strCIM_GolfCartCoverage_CHK_OverrideBaseRate_No=(String) row.get("CIM_GolfCartCoverage_CHK_OverrideBaseRate_No");
		String strCIM_GolfCartCoverage_CHK_DoNotApplyCityOrCountyTaxes=(String) row.get("CIM_GolfCartCoverage_CHK_DoNotApplyCityOrCountyTaxes");
		String strCIM_GolfCartCoverage_CHK_AllCityName=(String) row.get("CIM_GolfCartCoverage_CHK_AllCityName");
		String strCIM_GolfCartCoverage_TXT_City=(String) row.get("CIM_GolfCartCoverage_TXT_City");
		String strCIM_GolfCartCoverage_TXT_CityCode=(String) row.get("CIM_GolfCartCoverage_TXT_CityCode");
		String strCIM_GolfCartCoverage_TXT_County=(String) row.get("CIM_GolfCartCoverage_TXT_County");
		String strCIM_GolfCartCoverage_TXT_CountyCode=(String) row.get("CIM_GolfCartCoverage_TXT_CountyCode");
		String strCIM_GolfCartCoverage_TXT_TaxCode=(String) row.get("CIM_GolfCartCoverage_TXT_TaxCode");
		String strCIM_GolfCartCoverage_TXT_BaseRate=(String) row.get("CIM_GolfCartCoverage_TXT_BaseRate");
		String strCIM_GolfCartCoverage_TXT_BaseRateOverride=(String) row.get("CIM_GolfCartCoverage_TXT_BaseRateOverride");
		String strCIM_GolfCartCoverage_TXT_DeductibleFtr=(String) row.get("CIM_GolfCartCoverage_TXT_DeductibleFtr");
		String strCIM_GolfCartCoverage_TXT_TransitionFtr=(String) row.get("CIM_GolfCartCoverage_TXT_TransitionFtr");
		String strCIM_GolfCartCoverage_TXT_FinalRtae=(String) row.get("CIM_GolfCartCoverage_TXT_FinalRtae");
		String strCIM_GolfCartCoverage_TXT_OverrideFinalRate=(String) row.get("CIM_GolfCartCoverage_TXT_OverrideFinalRate");
		String strCIM_GolfCartCoverage_TXT_CatastropheLimit=(String) row.get("CIM_GolfCartCoverage_TXT_CatastropheLimit");
		String strCIM_GolfCartCoverage_TXT_GolfCartCovPrem=(String) row.get("CIM_GolfCartCoverage_TXT_GolfCartCovPrem");
		String strCIM_GolfCartCoverage_TXT_GolfCartCovOverridePrem=(String) row.get("CIM_GolfCartCoverage_TXT_GolfCartCovOverridePrem");
		String strCIM_GolfCartCoverage_TXT_GolfCartCovMinPrem=(String) row.get("CIM_GolfCartCoverage_TXT_GolfCartCovMinPrem");
		String strCIM_GolfCartCoverage_TXT_GolfCartCovFinalPrem=(String) row.get("CIM_GolfCartCoverage_TXT_GolfCartCovFinalPrem");
		String strTransaction  = (String) row.get("Transaction Name");
			
		try {
			
			se.log().logTestStep("GolfCartCoverage");
			test.log(LogStatus.INFO, "GolfCartCoverage page","Transaction Step : " + strTransaction + "<br>" +"Page : CIM_GolfCartCoverage");
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_AnyOneCartLimit(strCIM_GolfCartCoverage_TXT_AnyOneCartLimit),strCIM_GolfCartCoverage_TXT_AnyOneCartLimit,test);
			if(!strCIM_GolfCartCoverage_TXT_CatastropheLim.equalsIgnoreCase("N/A") && !strCIM_GolfCartCoverage_TXT_CatastropheLim.contains("validate2")){
				se.element().clearTheField(getCIM_GolfCartCoverage_TXT_CatastropheLim(strCIM_GolfCartCoverage_TXT_CatastropheLim));
			}
			if(!strCIM_GolfCartCoverage_TXT_CatastropheLim.contains("validate2")){
			se.element().clearTheField(getCIM_GolfCartCoverage_TXT_CatastropheLim(strCIM_GolfCartCoverage_TXT_CatastropheLim));
			}
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_CatastropheLim(strCIM_GolfCartCoverage_TXT_CatastropheLim),strCIM_GolfCartCoverage_TXT_CatastropheLim,test);
			se.element().checkUncheckOrValidate(getCIM_GolfCartCoverage_CHK_Flood(strCIM_GolfCartCoverage_CHK_Flood),strCIM_GolfCartCoverage_CHK_Flood,test);
			se.element().checkUncheckOrValidate(getCIM_GolfCartCoverage_CHK_Flood_AdditionalPerilsDedApplies(strCIM_GolfCartCoverage_CHK_Flood_AdditionalPerilsDedApplies),strCIM_GolfCartCoverage_CHK_Flood_AdditionalPerilsDedApplies,test);
			se.element().checkUncheckOrValidate(getCIM_GolfCartCoverage_CHK_GroundWater(strCIM_GolfCartCoverage_CHK_GroundWater),strCIM_GolfCartCoverage_CHK_GroundWater,test);
			se.element().checkUncheckOrValidate(getCIM_GolfCartCoverage_CHK_GroundWater_AddtnlPerilsDedApplies(strCIM_GolfCartCoverage_CHK_GroundWater_AddtnlPerilsDedApplies),strCIM_GolfCartCoverage_CHK_GroundWater_AddtnlPerilsDedApplies,test);
			se.element().checkUncheckOrValidate(getCIM_GolfCartCoverage_CHK_EarthMovement(strCIM_GolfCartCoverage_CHK_EarthMovement),strCIM_GolfCartCoverage_CHK_EarthMovement,test);
			se.element().checkUncheckOrValidate(getCIM_GolfCartCoverage_CHK_EarthMovement_AddtnlPerilsDedApplies(strCIM_GolfCartCoverage_CHK_EarthMovement_AddtnlPerilsDedApplies),strCIM_GolfCartCoverage_CHK_EarthMovement_AddtnlPerilsDedApplies,test);
			se.element().selectPopupWithMagnifier(getCIM_GolfCartCoverage_TXT_AdditionalPerilsDeductible(strCIM_GolfCartCoverage_TXT_AdditionalPerilsDeductible), getCIM_GolfCartCoverage_BTN_AdditionalPerilsDeductible(strCIM_GolfCartCoverage_TXT_AdditionalPerilsDeductible), strCIM_GolfCartCoverage_TXT_AdditionalPerilsDeductible, constants.NA, strCIM_GolfCartCoverage_TXT_AdditionalPerilsDeductible, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCIM_GolfCartCoverage_CHK_OverrideBaseRate_Yes(strCIM_GolfCartCoverage_CHK_OverrideBaseRate_Yes),strCIM_GolfCartCoverage_CHK_OverrideBaseRate_Yes,test);
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_OverrideReason(strCIM_GolfCartCoverage_TXT_OverrideReason),strCIM_GolfCartCoverage_TXT_OverrideReason,test);
			se.element().checkUncheckOrValidate(getCIM_GolfCartCoverage_CHK_OverrideBaseRate_No(strCIM_GolfCartCoverage_CHK_OverrideBaseRate_No),strCIM_GolfCartCoverage_CHK_OverrideBaseRate_No,test);
			se.element().checkUncheckOrValidate(getCIM_GolfCartCoverage_CHK_DoNotApplyCityOrCountyTaxes(strCIM_GolfCartCoverage_CHK_DoNotApplyCityOrCountyTaxes),strCIM_GolfCartCoverage_CHK_DoNotApplyCityOrCountyTaxes,test);
			se.element().checkUncheckOrValidate(getCIM_GolfCartCoverage_CHK_AllCityName(strCIM_GolfCartCoverage_CHK_AllCityName),strCIM_GolfCartCoverage_CHK_AllCityName,test);
			if(!strCIM_GolfCartCoverage_TXT_City.equalsIgnoreCase("N/A") && !strCIM_GolfCartCoverage_TXT_City.contains("validate2")){
				se.element().clickSearchIcon(getCIM_GolfCartCoverage_BTN_City(), test);
				se.element().clickElement(getCIM_GolfCartCoverage_LNK_City(strCIM_GolfCartCoverage_TXT_City), test);
		    }else{
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_City(strCIM_GolfCartCoverage_TXT_City),strCIM_GolfCartCoverage_TXT_City,test);
		    }
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_CityCode(strCIM_GolfCartCoverage_TXT_CityCode),strCIM_GolfCartCoverage_TXT_CityCode,test);
			if(!strCIM_GolfCartCoverage_TXT_County.equalsIgnoreCase("N/A") && !strCIM_GolfCartCoverage_TXT_County.contains("validate2")){
				se.element().clickSearchIcon(getCIM_GolfCartCoverage_BTN_County(), test);
				se.element().clickElement(getCIM_GolfCartCoverage_LNK_County(strCIM_GolfCartCoverage_TXT_County), test);
				
		    }else{
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_County(strCIM_GolfCartCoverage_TXT_County),strCIM_GolfCartCoverage_TXT_County,test);
		    }
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_CountyCode(strCIM_GolfCartCoverage_TXT_CountyCode),strCIM_GolfCartCoverage_TXT_CountyCode,test);
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_TaxCode(strCIM_GolfCartCoverage_TXT_TaxCode),strCIM_GolfCartCoverage_TXT_TaxCode,test);
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_BaseRate(strCIM_GolfCartCoverage_TXT_BaseRate),strCIM_GolfCartCoverage_TXT_BaseRate,test);
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_BaseRateOverride(strCIM_GolfCartCoverage_TXT_BaseRateOverride),strCIM_GolfCartCoverage_TXT_BaseRateOverride,test);
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_DeductibleFtr(strCIM_GolfCartCoverage_TXT_DeductibleFtr),strCIM_GolfCartCoverage_TXT_DeductibleFtr,test);
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_TransitionFtr(strCIM_GolfCartCoverage_TXT_TransitionFtr),strCIM_GolfCartCoverage_TXT_TransitionFtr,test);
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_FinalRtae(strCIM_GolfCartCoverage_TXT_FinalRtae),strCIM_GolfCartCoverage_TXT_FinalRtae,test);
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_OverrideFinalRate(strCIM_GolfCartCoverage_TXT_OverrideFinalRate),strCIM_GolfCartCoverage_TXT_OverrideFinalRate,test);
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_CatastropheLimit(strCIM_GolfCartCoverage_TXT_CatastropheLimit),strCIM_GolfCartCoverage_TXT_CatastropheLimit,test);
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_GolfCartCovPrem(strCIM_GolfCartCoverage_TXT_GolfCartCovPrem),strCIM_GolfCartCoverage_TXT_GolfCartCovPrem,test);
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_GolfCartCovOverridePrem(strCIM_GolfCartCoverage_TXT_GolfCartCovOverridePrem),strCIM_GolfCartCoverage_TXT_GolfCartCovOverridePrem,test);
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_GolfCartCovMinPrem(strCIM_GolfCartCoverage_TXT_GolfCartCovMinPrem),strCIM_GolfCartCoverage_TXT_GolfCartCovMinPrem,test);
			se.element().enterOrValidateText(getCIM_GolfCartCoverage_TXT_GolfCartCovFinalPrem(strCIM_GolfCartCoverage_TXT_GolfCartCovFinalPrem),strCIM_GolfCartCoverage_TXT_GolfCartCovFinalPrem,test);
			se.element().Click(getNext(), test);
			se.util().sleep(1000);
			
		
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CIM_GolfCartCoverage", true, false, true, test);
			
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
		
