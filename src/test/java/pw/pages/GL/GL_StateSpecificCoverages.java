package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CP;
import pw.OR.OR_GL;

public class GL_StateSpecificCoverages extends OR_GL{
	
	public void GL_StateCoveragesPage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase("GL_StateSpecificCoverage")){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("GL_StateSpecificCoverage", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strGL_StateSpecificCoverage_TXT_State = (String) row.get("GL_StateSpecificCoverage_TXT_State");
		String strGL_StateSpecificCoverage_CHK_DoesTheriskHaveGovSubdivClass = (String) row.get("GL_StateSpecificCoverage_CHK_DoesTheriskHaveGovSubdivClass");
		String strGL_StateSpecificCoverage_TXT_PerPersonLimitOfInsuranceGovSubdiv = (String) row.get("GL_StateSpecificCoverage_TXT_PerPersonLimitOfInsuranceGovSubdiv");
		String strGL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDiv = (String) row.get("GL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDiv");
		String strGL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdiv = (String) row.get("GL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdiv");
		String strGL_StateSpecificCoverage_CHK_DoesTheriskHaveContractorClassesOfoperation	 = (String) row.get("GL_StateSpecificCoverage_CHK_DoesTheriskHaveContractorClassesOfoperation");
		String strGL_StateSpecificCoverage_TXT_PerOccurenceHomeRepairAndRemodLiab	 = (String) row.get("GL_StateSpecificCoverage_TXT_PerOccurenceHomeRepairAndRemodLiab");
		String strGL_StateSpecificCoverage_TXT_DedHomeRepairAndRemodLiab = (String) row.get("GL_StateSpecificCoverage_TXT_DedHomeRepairAndRemodLiab");
		String strGL_StateSpecificCoverage_CHK_RiskreqIowaNoticeforContractors = (String) row.get("GL_StateSpecificCoverage_CHK_RiskreqIowaNoticeforContractors");
		String strGL_StateSpecificCoverage_TXT_LossCost = (String) row.get("GL_StateSpecificCoverage_TXT_LossCost");
		String strGL_StateSpecificCoverage_TXT_LossCostMultiplier = (String) row.get("GL_StateSpecificCoverage_TXT_LossCostMultiplier");
		String strGL_StateSpecificCoverage_TXT_BaseLimitsRate = (String) row.get("GL_StateSpecificCoverage_TXT_BaseLimitsRate");
		String strGL_StateSpecificCoverage_TXT_TransactionPremium = (String) row.get("GL_StateSpecificCoverage_TXT_TransactionPremium");
		String strGL_StateSpecificCoverage_BTN_AddButton = (String) row.get("GL_StateSpecificCoverage_BTN_AddButton");
		String GL_StateSpecificCoverage_BTN_DoneButton = (String) row.get("GL_StateSpecificCoverage_BTN_DoneButton");
		
		try{
					se.log().logTestStep("GL_StateCoverages");
					test.log(LogStatus.INFO, "GL_StateCoverages page","Transaction Step : "+transaction + "<br>" +"Page : GL_StateCoverages");
					se.verify().verifyEquals("GL_StateCoverages Page of PowerWriter ", getGL_StateSpecificCoverage_LabelName().isDisplayed(),true, true,test);
					if(!strGL_StateSpecificCoverage_BTN_AddButton.equals("N/A")) {
						se.element().clickElement(getGL_StateSpecificCoverage_BTN_Add());
					}
					se.util().sleep(3000);
					se.element().selectPopupWithMagnifier(getGL_StateSpecificCoverage_TXT_State(strGL_StateSpecificCoverage_TXT_State),getGL_StateSpecificCoverage_TXT_StateSearch(strGL_StateSpecificCoverage_TXT_State),strGL_StateSpecificCoverage_TXT_State,constants.NA, strGL_StateSpecificCoverage_TXT_State, constants.NA, constants.NA, constants.NA,test);
					se.element().checkUncheckOrValidate(getGL_StateSpecificCoverage_CHK_DoesTheriskHaveGovSubdivClass(strGL_StateSpecificCoverage_CHK_DoesTheriskHaveGovSubdivClass),strGL_StateSpecificCoverage_CHK_DoesTheriskHaveGovSubdivClass,test);
					se.element().enterOrValidateText(getGL_StateSpecificCoverage_TXT_PerPersonLimitOfInsuranceGovSubdiv(strGL_StateSpecificCoverage_TXT_PerPersonLimitOfInsuranceGovSubdiv),strGL_StateSpecificCoverage_TXT_PerPersonLimitOfInsuranceGovSubdiv,test);
					se.element().enterOrValidateText(getGL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDiv(strGL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDiv),strGL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDiv,test);
					//se.element().enterOrValidateText(getGL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdiv(strGL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdiv),strGL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdiv,test);
					se.element().selectPopupWithMagnifier(getGL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdiv(strGL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdiv), getGL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdivSearch(strGL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdiv), strGL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdiv,constants.NA, strGL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdiv, constants.NA, constants.NA, constants.NA, test);
					se.element().selectPopupWithMagnifier(getGL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDiv(strGL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDiv), getGL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDivSearch(strGL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDiv), strGL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDiv,constants.NA, strGL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDiv, constants.NA, constants.NA, constants.NA, test);
					se.element().checkUncheckOrValidate(getGL_StateSpecificCoverage_CHK_DoesTheriskHaveContractorClassesOfoperation(strGL_StateSpecificCoverage_CHK_DoesTheriskHaveContractorClassesOfoperation),strGL_StateSpecificCoverage_CHK_DoesTheriskHaveContractorClassesOfoperation,test);
					se.element().enterOrValidateText(getGL_StateSpecificCoverage_TXT_PerOccurenceHomeRepairAndRemodLiab(strGL_StateSpecificCoverage_TXT_PerOccurenceHomeRepairAndRemodLiab),strGL_StateSpecificCoverage_TXT_PerOccurenceHomeRepairAndRemodLiab,test);
					se.element().enterOrValidateText(getGL_StateSpecificCoverage_TXT_DedHomeRepairAndRemodLiab(strGL_StateSpecificCoverage_TXT_DedHomeRepairAndRemodLiab),strGL_StateSpecificCoverage_TXT_DedHomeRepairAndRemodLiab,test);
					
					se.element().checkUncheckOrValidate(getGL_StateSpecificCoverage_CHK_RiskreqIowaNoticeforContractors(strGL_StateSpecificCoverage_CHK_RiskreqIowaNoticeforContractors),strGL_StateSpecificCoverage_CHK_RiskreqIowaNoticeforContractors,test);
					se.element().enterOrValidateText(getGL_StateSpecificCoverage_TXT_LossCost(strGL_StateSpecificCoverage_TXT_LossCost),strGL_StateSpecificCoverage_TXT_LossCost,test);
					se.element().enterOrValidateText(getGL_StateSpecificCoverage_TXT_LossCostMultiplier(strGL_StateSpecificCoverage_TXT_LossCostMultiplier),strGL_StateSpecificCoverage_TXT_LossCostMultiplier,test);
					se.element().enterOrValidateText(getGL_StateSpecificCoverage_TXT_BaseLimitsRate(strGL_StateSpecificCoverage_TXT_BaseLimitsRate),strGL_StateSpecificCoverage_TXT_BaseLimitsRate,test);
					se.element().enterOrValidateText(getGL_StateSpecificCoverage_TXT_TransactionPremium(strGL_StateSpecificCoverage_TXT_TransactionPremium),strGL_StateSpecificCoverage_TXT_TransactionPremium,test);
					se.element().clickElement(getNext());
					if(!GL_StateSpecificCoverage_BTN_DoneButton.equals("N/A")) {
						se.element().clickElement(getDone());
						}	
				
					
		}
	
					catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for GL_StateCoverages ", true, false, true, test);
					
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

