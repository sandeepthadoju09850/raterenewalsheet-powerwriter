package pw.pages.CA;

/**
 * @author ${pr09529}
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
import pw.OR.OR_CP;
import pw.OR.OR_GL;

public class CA_BusinessInterruption extends OR_CA{
	
	public void BusinessInterruption(String strRegressionID, String transaction,String suspendSheet ,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.CA_BusinessInterruption)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_BusinessInterruption, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strBusinesInterruption_TXT_State = (String) row.get("BusinesInterruption_TXT_State");
			String strBusinessInterruption_TXT_DescriptionOfBussActivitiesDepndOnsheduleProperty = (String) row.get("BusinessInterruption_TXT_DescriptionOfBussActivitiesDepndOnsheduleProperty");
			String strBusinessInterruption_CHK_Business_IncomeWithoutExtraExpense = (String) row.get("BusinessInterruption_CHK_Business_IncomeWithoutExtraExpense");
			String strBusinessInterruption_CHK_Business_IncomeWithExtraExpense = (String) row.get("BusinessInterruption_CHK_Business_IncomeWithExtraExpense");
			String strBusinessInterruption_CHK_Comprehensive = (String) row.get("BusinessInterruption_CHK_Comprehensive");
			String strBusinessInterruption_CHK_specified_cause_of_loss= (String) row.get("BusinessInterruption_CHK_specified_cause_of_loss");
			String strBusinessInterruption_CHK_Collision = (String) row.get("BusinessInterruption_CHK_Collision");
			String strBusinessInterruption_TXT_BusiIncomCovWaitingPeriod = (String) row.get("BusinessInterruption_TXT_BusiIncomCovWaitingPeriod");
			String strBusinessInterruption_TXT_BusiIncomCovWaitingPeriodFilterNeeded = (String) row.get("BusinessInterruption_TXT_BusiIncomCovWaitingPeriodFilterNeeded");
			String strBusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverage = (String) row.get("BusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverage");
			String strBusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverageFilterNeeded = (String) row.get("BusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverageFilterNeeded");
			String strBusinessInterruption_CHK_OptionA_SeparateLimits = (String) row.get("BusinessInterruption_CHK_Option A_SeparateLimits");
			String strBusinesInterruption_TXT_OptionADesc_Schduld_Property = (String) row.get("BusinesInterruption_TXT_OptionADesc_Schduld_Property");
			String strBusinesInterruption_TXT_OptionA_limit_insurance= (String) row.get("BusinesInterruption_TXT_OptionA_limit_insurance");
			String strBusinessInterruption_CHK_OptionB_SingleLimits = (String) row.get("BusinessInterruption_CHK_OptionB_SingleLimits");
			String strBusinesInterruption_TXT_OptionB_limit_insurance= (String) row.get("BusinesInterruption_TXT_OptionB_limit_insurance");
			String strBusinesInterruption_TXT_OptionB_PercentageOfInsuToExposure = (String) row.get("BusinesInterruption_TXT_OptionB_PercentageOfInsuToExposure");
			String strBusinesInterruption_TXT_OptionB_PercentageOfInsuToExposureFilterNeeded = (String) row.get("BusinesInterruption_TXT_OptionB_PercentageOfInsuToExposureFilterNeeded");
			String strBusinesInterruption_TXT_OptionBDesc_Schduld_Property = (String) row.get("BusinesInterruption_TXT_OptionBDesc_Schduld_Property");
			String strBusinesInterruption_TXT_TaxCity = (String) row.get("BusinesInterruption_TXT_TaxCity");
			String strBusinesInterruption_TXT_TaxCityCode = (String) row.get("BusinesInterruption_TXT_TaxCityCode");
			String strBusinesInterruption_TXT_TaxCountry = (String) row.get("BusinesInterruption_TXT_TaxCountry");
			String strBusinesInterruption_TXT_TaxCountrycode = (String) row.get("BusinesInterruption_TXT_TaxCountrycode");
			String strBusinesInterruption_TXT_FireProtectionDistrict = (String) row.get("BusinesInterruption_TXT_FireProtectionDistrict");
			String strBusinesInterruption_TXT_JurisdictionFPDCode = (String) row.get("BusinesInterruption_TXT_JurisdictionFPDCode");
			String strBusinesInterruption_TXT_JuridictionDescription = (String) row.get("BusinesInterruption_TXT_JuridictionDescription");
			String strBusinesInterruption_TXT_JuridictionDescriptionFilterNeeded = (String) row.get("BusinesInterruption_TXT_JuridictionDescriptionFilterNeeded");
			
		try{
			se.log().logTestStep("CA_BusinessInterruption");
			
			test.log(LogStatus.INFO, "CA_BusinessInterruption page","Transaction Step : "+transaction + "<br>" +"Page : CA_BusinessInterruption");
			se.verify().verifyEquals("CA_BusinessInterruption Page of PowerWriter ",getBusinesInterruption_TXT_Label().isDisplayed(),true, true,test);
			
			se.element().enterOrValidateText(getBusinesInterruption_TXT_State(strBusinesInterruption_TXT_State),strBusinesInterruption_TXT_State,test);
			se.element().enterOrValidateText(getBusinessInterruption_TXT_DescriptionOfBussActivitiesDepndOnsheduleProperty(strBusinessInterruption_TXT_DescriptionOfBussActivitiesDepndOnsheduleProperty),strBusinessInterruption_TXT_DescriptionOfBussActivitiesDepndOnsheduleProperty,test);
			se.element().checkUncheckOrValidate(getBusinessInterruption_CHK_Business_IncomeWithoutExtraExpense(strBusinessInterruption_CHK_Business_IncomeWithoutExtraExpense),strBusinessInterruption_CHK_Business_IncomeWithoutExtraExpense,test);
			se.element().checkUncheckOrValidate(getBusinessInterruption_CHK_Business_IncomeWithExtraExpense(strBusinessInterruption_CHK_Business_IncomeWithExtraExpense),strBusinessInterruption_CHK_Business_IncomeWithExtraExpense,test);
			se.element().checkUncheckOrValidate(getBusinessInterruption_CHK_Comprehensive(strBusinessInterruption_CHK_Comprehensive),strBusinessInterruption_CHK_Comprehensive,test);
			se.element().checkUncheckOrValidate(getBusinessInterruption_CHK_specified_cause_of_loss(strBusinessInterruption_CHK_specified_cause_of_loss),strBusinessInterruption_CHK_specified_cause_of_loss,test);
			se.element().checkUncheckOrValidate(getBusinessInterruption_CHK_Collision(strBusinessInterruption_CHK_Collision),strBusinessInterruption_CHK_Collision,test);
			se.element().selectPopupWithMagnifier(getBusinessInterruption_TXT_BusiIncomCovWaitingPeriod(strBusinessInterruption_TXT_BusiIncomCovWaitingPeriod),getBusinessInterruption_TXT_BusiIncomCovWaitingPeriodSearch(strBusinessInterruption_TXT_BusiIncomCovWaitingPeriod),strBusinessInterruption_TXT_BusiIncomCovWaitingPeriod,strBusinessInterruption_TXT_BusiIncomCovWaitingPeriodFilterNeeded,strBusinessInterruption_TXT_BusiIncomCovWaitingPeriod, constants.NA, constants.NA,constants.NA,test);
			se.element().selectPopupWithMagnifier(getBusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverage(strBusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverage),getBusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverageSearch(strBusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverage),strBusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverage,strBusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverageFilterNeeded,strBusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverage, constants.NA, constants.NA,constants.NA,test);
			se.element().checkUncheckOrValidate(getBusinessInterruption_CHK_OptionA_SeparateLimits(strBusinessInterruption_CHK_OptionA_SeparateLimits),strBusinessInterruption_CHK_OptionA_SeparateLimits,test);
			se.element().enterOrValidateText(getBusinesInterruption_TXT_OptionADesc_Schduld_Property(strBusinesInterruption_TXT_OptionADesc_Schduld_Property),strBusinesInterruption_TXT_OptionADesc_Schduld_Property,test);
			se.element().enterOrValidateText(getBusinesInterruption_TXT_OptionA_limit_insurance(strBusinesInterruption_TXT_OptionA_limit_insurance),strBusinesInterruption_TXT_OptionA_limit_insurance,test);
			se.element().checkUncheckOrValidate(getBusinessInterruption_CHK_OptionB_SingleLimits(strBusinessInterruption_CHK_OptionB_SingleLimits),strBusinessInterruption_CHK_OptionB_SingleLimits,test);
			se.element().enterOrValidateText(getBusinesInterruption_TXT_OptionB_limit_insurance(strBusinesInterruption_TXT_OptionB_limit_insurance),strBusinesInterruption_TXT_OptionB_limit_insurance,test);
			se.element().selectPopupWithMagnifier(getBusinesInterruption_TXT_OptionB_PercentageOfInsuToExposure(strBusinesInterruption_TXT_OptionB_PercentageOfInsuToExposure),getBusinesInterruption_TXT_OptionB_PercentageOfInsuToExposureFilterSearch(strBusinesInterruption_TXT_OptionB_PercentageOfInsuToExposure),strBusinesInterruption_TXT_OptionB_PercentageOfInsuToExposure,strBusinesInterruption_TXT_OptionB_PercentageOfInsuToExposureFilterNeeded,strBusinesInterruption_TXT_OptionB_PercentageOfInsuToExposure, constants.NA, constants.NA,constants.NA,test);
			se.element().enterOrValidateText(getBusinesInterruption_TXT_OptionB_PercentageOfInsuToExposure(strBusinesInterruption_TXT_OptionB_PercentageOfInsuToExposure),strBusinesInterruption_TXT_OptionB_PercentageOfInsuToExposure,test);
			se.element().enterOrValidateText(getBusinesInterruption_TXT_OptionBDesc_Schduld_Property(strBusinesInterruption_TXT_OptionBDesc_Schduld_Property),strBusinesInterruption_TXT_OptionBDesc_Schduld_Property,test);
			se.element().selectPopupWithMagnifier(getBusinesInterruption_TXT_JuridictionDescription(strBusinesInterruption_TXT_JuridictionDescription),getBusinesInterruption_TXT_JuridictionDescriptionSearch(strBusinesInterruption_TXT_JuridictionDescription),strBusinesInterruption_TXT_JuridictionDescription,strBusinesInterruption_TXT_JuridictionDescriptionFilterNeeded,strBusinesInterruption_TXT_JuridictionDescription, constants.NA, constants.NA,constants.NA,test);
			se.element().enterOrValidateText(getBusinesInterruption_TXT_JurisdictionFPDCode(strBusinesInterruption_TXT_JurisdictionFPDCode),strBusinesInterruption_TXT_JurisdictionFPDCode,test);
			se.element().enterOrValidateText(getBusinesInterruption_TXT_FireProtectionDistrict(strBusinesInterruption_TXT_FireProtectionDistrict),strBusinesInterruption_TXT_FireProtectionDistrict,test);
			/*KY Fields*/
			se.element().enterOrValidateText(getBusinesInterruption_TXT_TaxCity(strBusinesInterruption_TXT_TaxCity),strBusinesInterruption_TXT_TaxCity,test);
			se.element().enterOrValidateText(getBusinesInterruption_TXT_TaxCityCode(strBusinesInterruption_TXT_TaxCityCode),strBusinesInterruption_TXT_TaxCityCode,test);		
			se.element().enterOrValidateText(getBusinesInterruption_TXT_TaxCountry(strBusinesInterruption_TXT_TaxCountry),strBusinesInterruption_TXT_TaxCountry,test);
			se.element().enterOrValidateText(getBusinesInterruption_TXT_TaxCountrycode(strBusinesInterruption_TXT_TaxCountrycode),strBusinesInterruption_TXT_TaxCountrycode,test);
			se.element().clickElement(getNext());	
		
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_BusinessInterruption ", true, false, true, test);			
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