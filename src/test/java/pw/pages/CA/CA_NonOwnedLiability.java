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

public class CA_NonOwnedLiability extends OR_CA  {
	
	public void CANonOwnedLiabilityPage(String strRegressionID,String transaction,String suspendSheet,ExtentTest test) throws IOException {
		
		try{
		
	    if(suspendSheet.equalsIgnoreCase(constants.CA_NonOwnedLiability)){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
	         testTearDown(se, test);
	    }
	    
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_NonOwnedLiability, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strNonOwnedLiability_BTN_Add = (String) row.get("NonOwnedLiability_BTN_Add");
			String strNonOwnedLiability_BTN_Details = (String) row.get("NonOwnedLiability_BTN_Details");
			String strNonOwnedLiability_BTN_DoneWithNonOwnedAuto = (String) row.get("NonOwnedLiability_BTN_DoneWithNonOwnedAuto");
			String strNonOwnedLiability_TXT_State = (String) row.get("NonOwnedLiability_TXT_State");
			String strNonOwnedLiability_TXT_ZipCode = (String) row.get("NonOwnedLiability_TXT_ZipCode");
			String strNonOwnedLiability_CHK_RiskType_SocialServAgencyRisk = (String) row.get("NonOwnedLiability_CHK_RiskType_SocialServAgencyRisk");
			String strNonOwnedLiability_CHK__RiskType_OthrThanSocialServAgencyRisk = (String) row.get("NonOwnedLiability_CHK__RiskType_OthrThanSocialServAgencyRisk");
			String strNonOwnedLiability_TXT_TypeOfCov = (String) row.get("NonOwnedLiability_TXT_TypeOfCov");
			String strNonOwnedLiability_TXT_TypeOfCovFilterNeeded = (String) row.get("NonOwnedLiability_TXT_TypeOfCovFilterNeeded");
			String strNonOwnedLiability_TXT_Territory = (String) row.get("NonOwnedLiability_TXT_Territory");
			String strNonOwnedLiability_TXT_TerrDescrption = (String) row.get("NonOwnedLiability_TXT_TerrDescrption");
			String strNonOwnedLiability_TXT_TotalNumOfEmpAtAllLoc = (String) row.get("NonOwnedLiability_TXT_TotalNumOfEmpAtAllLoc");
			String strNonOwnedLiability_TXT_TotalDrivingInstructors = (String) row.get("NonOwnedLiability_TXT_TotalDrivingInstructors");
			String strNonOwnedLiability_TXT_tot_emp_in_op_auto = (String) row.get("NonOwnedLiability_TXT_tot_emp_in_op_auto");
			String strNonOwnedLiability_CHK_BlnktIndividualLiabilityCovForVolunteers = (String) row.get("NonOwnedLiability_CHK_BlnktIndividualLiabilityCovForVolunteers");
			String strNonOwnedLiability_TXT_NoOfPartners = (String) row.get("NonOwnedLiability_TXT_NoOfPartners");
			String strNonOwnedLiability_CHK_ExtendCovForIndLiabilityOfEmp = (String) row.get("NonOwnedLiability_CHK_ExtendCovForIndLiabilityOfEmp");
			String strNonOwnedLiability_TXT_NoOfVolUseOwnAuto = (String) row.get("NonOwnedLiability_TXT_NoOfVolUseOwnAuto");
			String strNonOwnedLiability_TXT_Base_CSL = (String) row.get("NonOwnedLiability_TXT_Base_CSL");
			String strNonOwnedLiability_TXT_Base_Deductible = (String) row.get("NonOwnedLiability_TXT_Base_Deductible");
			String strNonOwnedLiability_CHK_DedType_CSL = (String) row.get("NonOwnedLiability_CHK_DedType_CSL");
			String strNonOwnedLiability_CHK_DedType_PropDamPerAccDed = (String) row.get("NonOwnedLiability_CHK_DedType_PropDamPerAccDed");
			try
			{
				se.log().logTestStep("Non Owned Liability");
				test.log(LogStatus.INFO, "Non Owned Liability page","Transaction Step : "+transaction + "<br>" +"Page : CA_NonOwnedLiability");
				se.verify().verifyEquals("Non Owned Liability  of PowerWriter ", getNonOwnedLiability().isDisplayed(),true, true,test);
				
				if(!strNonOwnedLiability_BTN_Add.equals(constants.NA)){
					se.element().Click(getNonOwnedLiability_BTN_Add(strNonOwnedLiability_BTN_Add),strNonOwnedLiability_BTN_Add,test);
				}
				if(!strNonOwnedLiability_BTN_Details.equals(constants.NA)){
					se.element().Click(getNonOwnedLiability_BTN_Details(strNonOwnedLiability_BTN_Details),strNonOwnedLiability_BTN_Details,test);
				
				}
				se.element().enterOrValidateText(getNonOwnedLiability_TXT_State(strNonOwnedLiability_TXT_State),strNonOwnedLiability_TXT_State,test);
				se.element().enterOrValidateText(getNonOwnedLiability_TXT_ZipCode(strNonOwnedLiability_TXT_ZipCode),strNonOwnedLiability_TXT_ZipCode,test);
				se.element().checkUncheckOrValidate(getNonOwnedLiability_CHK_RiskType_SocialServAgencyRisk(strNonOwnedLiability_CHK_RiskType_SocialServAgencyRisk),strNonOwnedLiability_CHK_RiskType_SocialServAgencyRisk,test);
				se.element().checkUncheckOrValidate(getNonOwnedLiability_CHK__RiskType_OthrThanSocialServAgencyRisk(strNonOwnedLiability_CHK__RiskType_OthrThanSocialServAgencyRisk),strNonOwnedLiability_CHK__RiskType_OthrThanSocialServAgencyRisk,test);
				se.element().selectPopupWithMagnifier(getNonOwnedLiability_TXT_TypeOfCov(strNonOwnedLiability_TXT_TypeOfCov),getNonOwnedLiability_TXT_TypeOfCovSearch(strNonOwnedLiability_TXT_TypeOfCov),strNonOwnedLiability_TXT_TypeOfCov,strNonOwnedLiability_TXT_TypeOfCovFilterNeeded,strNonOwnedLiability_TXT_TypeOfCov, constants.NA, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getNonOwnedLiability_TXT_Territory(strNonOwnedLiability_TXT_Territory),strNonOwnedLiability_TXT_Territory,test);
				se.element().enterOrValidateText(getNonOwnedLiability_TXT_TerrDescrption(strNonOwnedLiability_TXT_TerrDescrption),strNonOwnedLiability_TXT_TerrDescrption,test);
				se.element().enterOrValidateText(getNonOwnedLiability_TXT_TotalNumOfEmpAtAllLoc(strNonOwnedLiability_TXT_TotalNumOfEmpAtAllLoc),strNonOwnedLiability_TXT_TotalNumOfEmpAtAllLoc,test);
				se.element().enterOrValidateText(getNonOwnedLiability_TXT_TotalDrivingInstructors(strNonOwnedLiability_TXT_TotalDrivingInstructors),strNonOwnedLiability_TXT_TotalDrivingInstructors,test);
				se.element().enterOrValidateText(getNonOwnedLiability_TXT_tot_emp_in_op_auto(strNonOwnedLiability_TXT_tot_emp_in_op_auto),strNonOwnedLiability_TXT_tot_emp_in_op_auto,test);
				se.element().checkUncheckOrValidate(getNonOwnedLiability_CHK_BlnktIndividualLiabilityCovForVolunteers(strNonOwnedLiability_CHK_BlnktIndividualLiabilityCovForVolunteers),strNonOwnedLiability_CHK_BlnktIndividualLiabilityCovForVolunteers,test);
				se.element().enterOrValidateText(getstrNonOwnedLiability_TXT_NoOfPartners(strNonOwnedLiability_TXT_NoOfPartners),strNonOwnedLiability_TXT_NoOfPartners,test);
				se.element().checkUncheckOrValidate(getNonOwnedLiability_CHK_ExtendCovForIndLiabilityOfEmp(strNonOwnedLiability_CHK_ExtendCovForIndLiabilityOfEmp),strNonOwnedLiability_CHK_ExtendCovForIndLiabilityOfEmp,test);
				se.element().enterOrValidateText(getNonOwnedLiability_TXT_NoOfVolUseOwnAuto(strNonOwnedLiability_TXT_NoOfVolUseOwnAuto),strNonOwnedLiability_TXT_NoOfVolUseOwnAuto,test);
				se.element().enterOrValidateText(getNonOwnedLiability_TXT_Base_CSL(strNonOwnedLiability_TXT_Base_CSL),strNonOwnedLiability_TXT_Base_CSL,test);
				se.element().enterOrValidateText(getNonOwnedLiability_TXT_Base_Deductible(strNonOwnedLiability_TXT_Base_Deductible),strNonOwnedLiability_TXT_Base_Deductible,test);
				se.element().checkUncheckOrValidate(getNonOwnedLiability_CHK_DedType_CSL(strNonOwnedLiability_CHK_DedType_CSL),strNonOwnedLiability_CHK_DedType_CSL,test);
				se.element().checkUncheckOrValidate(getNonOwnedLiability_CHK_DedType_PropDamPerAccDed(strNonOwnedLiability_CHK_DedType_PropDamPerAccDed),strNonOwnedLiability_CHK_DedType_PropDamPerAccDed,test);
				se.element().clickElement(getNext(),test);
				if(!strNonOwnedLiability_BTN_DoneWithNonOwnedAuto.equals(constants.NA)){
					se.element().Click(getNonOwnedLiability_BTN_DoneWithNonOwnedAuto(strNonOwnedLiability_BTN_DoneWithNonOwnedAuto),strNonOwnedLiability_BTN_DoneWithNonOwnedAuto,test);
				}
				
			}
			catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for Non Owned Liability page ", true, false, true, test);
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
