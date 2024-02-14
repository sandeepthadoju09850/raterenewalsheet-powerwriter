package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_GL;

public class GL_ExperienceRating extends OR_GL {
	

public void GLExperienceRatingPage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
	try{
	String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	if(SuspendSheet.equalsIgnoreCase("GL_Experience_Rating")){
		test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
		testTearDown(se, test);
	}
	List<Map<String, String>> table = ExcelOperations.getPagesData("GL_Experience_Rating", strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
	String strGLExperienceRating_CHK_18 = (String) row.get("GLExperienceRating_CHK_18");
	String strGLExperienceRating_CHK_21 = (String) row.get("GLExperienceRating_CHK_21");
	String strGLExperienceRating_CHK_24 = (String) row.get("GLExperienceRating_CHK_24");
	String strGLExperienceRating_CHK_27 = (String) row.get("GLExperienceRating_CHK_27");
	String strGLExperienceRating_CHK_TypeOfPolicyOccurrence = (String) row.get("GLExperienceRating_CHK_TypeOfPolicyOccurrence");
	String strGLExperienceRating_CHK_TypeOfPolicyClaimsMade = (String) row.get("GLExperienceRating_CHK_TypeOfPolicyClaimsMade");
	String strGLExperienceRating_TXT_PeriodNo = (String) row.get("GLExperienceRating_TXT_PeriodNo");
	String strGLExperienceRating_CHK_LossPeriodPremises_IncludeThisPeriod = (String) row.get("GLExperienceRating_CHK_LossPeriodPremises_IncludeThisPeriod");
	String strGLExperienceRating_TXT_LossPeriodPremises_PeriodEffectiveDate = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_PeriodEffectiveDate");
	String strGLExperienceRating_TXT_LossPeriodPremises_PeriodExpirationDate = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_PeriodExpirationDate");
	String strGLExperienceRating_TXT_LossPeriodPremises_DetrendFactor = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_DetrendFactor");
	String strGLExperienceRating_TXT_LossPeriodPremises_CompanySubLossCost = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_CompanySubLossCost");
	String strGLExperienceRating_TXT_LossPeriodPremises_OverrideCompSubLossCost = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_OverrideCompSubLossCost");
	String strGLExperienceRating_TXT_LossPeriodPremises_AdjstmntForLosses = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_AdjstmntForLosses");
	String strGLExperienceRating_CHK_LossPeriodPremises_OccurrencePeriod = (String) row.get("GLExperienceRating_CHK_LossPeriodPremises_OccurrencePeriod");
	String strGLExperienceRating_CHK_LossPeriodPremises_ClaimsMadePeriod = (String) row.get("GLExperienceRating_CHK_LossPeriodPremises_ClaimsMadePeriod");
	String strGLExperienceRating_TXT_LossPeriodPremises_YearsInProgram = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_YearsInProgram");
	String strGLExperienceRating_TXT_LossPeriodPremises_OccurencyPolicyAdjFtr = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_OccurencyPolicyAdjFtr");
	String strGLExperienceRating_TXT_LossPeriodPremises_ClaimsMadeExpPolicyAdjFtr = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_ClaimsMadeExpPolicyAdjFtr");
	String strGLExperienceRating_CHK_LossPeriodProduct_IncludeThisPeriod = (String) row.get("GLExperienceRating_CHK_LossPeriodProduct_IncludeThisPeriod");
	String strGLExperienceRating_TXT_LossPeriodProduct_PeriodNo = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_PeriodNo");
	String strGLExperienceRating_TXT_LossPeriodProduct_PeriodEffectiveDate = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_PeriodEffectiveDate");
	String strGLExperienceRating_TXT_LossPeriodProduct_PeriodExpirationDate = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_PeriodExpirationDate");
	String strGLExperienceRating_TXT_LossPeriodProduct_DetrendFactor = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_DetrendFactor");
	String strGLExperienceRating_TXT_LossPeriodProduct_CompanySubLossCost = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_CompanySubLossCost");
	String strGLExperienceRating_TXT_LossPeriodProduct_OverrideCompSubLossCost = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_OverrideCompSubLossCost");
	String strGLExperienceRating_TXT_LossPeriodProduct_AdjstmntForLosses = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_AdjstmntForLosses");
	String strGLExperienceRating_CHK_LossPeriodProduct_OccurrencePeriod = (String) row.get("GLExperienceRating_CHK_LossPeriodProduct_OccurrencePeriod");
	String strGLExperienceRating_CHK_LossPeriodProduct_ClaimsMadePeriod = (String) row.get("GLExperienceRating_CHK_LossPeriodProduct_ClaimsMadePeriod");
	String strGLExperienceRating_TXT_LossPeriodProduct_YearsInProgram = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_YearsInProgram");
	String strGLExperienceRating_TXT_LossPeriodProduct_OccurencyPolicyAdjFtr = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_OccurencyPolicyAdjFtr");
	String strGLExperienceRating_TXT_LossPeriodProduct_ClaimsMadeExpPolicyAdjFtr = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_ClaimsMadeExpPolicyAdjFtr");
	String strGLExperienceRating_CHK_NoClaims = (String) row.get("GLExperienceRating_CHK_NoClaims");
	String strGLExperienceRating_CHK_LossRunsAreNotAvlblatthisTime = (String) row.get("GLExperienceRating_CHK_LossRunsAreNotAvlblatthisTime");
	String strGLExperienceRating_CHK_ReorderLosses = (String) row.get("GLExperienceRating_CHK_ReorderLosses");
	String strGLExperienceRating_CHK_DeleteLink = (String) row.get("GLExperienceRating_CHK_DeleteLink");
	String strGLExperienceRating_TXT_LossPeriod = (String) row.get("GLExperienceRating_TXT_LossPeriod");
	String strGLExperienceRating_TXT_DateOfLoss = (String) row.get("GLExperienceRating_TXT_DateOfLoss");
	String strGLExperienceRating_TXT_IncurredLossAmount = (String) row.get("GLExperienceRating_TXT_IncurredLossAmount");
	String strGLExperienceRating_TXT_SubjectLoss = (String) row.get("GLExperienceRating_TXT_SubjectLoss");
	String strGLExperienceRating_TXT_BasicLoss = (String) row.get("GLExperienceRating_TXT_BasicLoss");
	String strGLExperienceRating_TXT_ALAEExpenses = (String) row.get("GLExperienceRating_TXT_ALAEExpenses");
	String strGLExperienceRating_BTN_AddLossExperience = (String) row.get("GLExperienceRating_BTN_AddLossExperience");
	String strGLExperienceRating_BTN_Update_Factors = (String) row.get("GLExperienceRating_BTN_Update_Factors");
	String strGLExperienceRating_BTN_Done = (String) row.get("GLExperienceRating_BTN_Done");
	String strGLExperienceRating_CHK_SelectLossExperienceRowNo = (String) row.get("GLExperienceRating_CHK_SelectLossExperienceRowNo");
	
		try{
			se.log().logTestStep("GLExperienceRating");
			test.log(LogStatus.INFO, "GLExperienceRating","Transaction Step : " + transaction + "<br>" + "Page : GLExperienceRating");
			se.verify().verifyEquals("GLExperienceRating Page of PowerWriter ", getGLExperienceRating_LBL_ExperienceRating("GLExperienceRating").isDisplayed(),true, true,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_18(strGLExperienceRating_CHK_18),strGLExperienceRating_CHK_18,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_21(strGLExperienceRating_CHK_21),strGLExperienceRating_CHK_21,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_24(strGLExperienceRating_CHK_24),strGLExperienceRating_CHK_24,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_27(strGLExperienceRating_CHK_27),strGLExperienceRating_CHK_27,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_TypeOfPolicyOccurrence(strGLExperienceRating_CHK_TypeOfPolicyOccurrence),strGLExperienceRating_CHK_TypeOfPolicyOccurrence,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_TypeOfPolicyClaimsMade(strGLExperienceRating_CHK_TypeOfPolicyClaimsMade),strGLExperienceRating_CHK_TypeOfPolicyClaimsMade,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_PeriodNo(strGLExperienceRating_TXT_PeriodNo),strGLExperienceRating_TXT_PeriodNo,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_LossPeriodPremises_IncludeThisPeriod(strGLExperienceRating_CHK_LossPeriodPremises_IncludeThisPeriod),strGLExperienceRating_CHK_LossPeriodPremises_IncludeThisPeriod,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_PeriodEffectiveDate(strGLExperienceRating_TXT_LossPeriodPremises_PeriodEffectiveDate),strGLExperienceRating_TXT_LossPeriodPremises_PeriodEffectiveDate,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_PeriodExpirationDate(strGLExperienceRating_TXT_LossPeriodPremises_PeriodExpirationDate),strGLExperienceRating_TXT_LossPeriodPremises_PeriodExpirationDate,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_DetrendFactor(strGLExperienceRating_TXT_LossPeriodPremises_DetrendFactor),strGLExperienceRating_TXT_LossPeriodPremises_DetrendFactor,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_CompanySubLossCost(strGLExperienceRating_TXT_LossPeriodPremises_CompanySubLossCost),strGLExperienceRating_TXT_LossPeriodPremises_CompanySubLossCost,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_OverrideCompSubLossCost(strGLExperienceRating_TXT_LossPeriodPremises_OverrideCompSubLossCost),strGLExperienceRating_TXT_LossPeriodPremises_OverrideCompSubLossCost,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_AdjstmntForLosses(strGLExperienceRating_TXT_LossPeriodPremises_AdjstmntForLosses),strGLExperienceRating_TXT_LossPeriodPremises_AdjstmntForLosses,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_LossPeriodPremises_OccurrencePeriod(strGLExperienceRating_CHK_LossPeriodPremises_OccurrencePeriod),strGLExperienceRating_CHK_LossPeriodPremises_OccurrencePeriod,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_LossPeriodPremises_ClaimsMadePeriod(strGLExperienceRating_CHK_LossPeriodPremises_ClaimsMadePeriod),strGLExperienceRating_CHK_LossPeriodPremises_ClaimsMadePeriod,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_YearsInProgram(strGLExperienceRating_TXT_LossPeriodPremises_YearsInProgram),strGLExperienceRating_TXT_LossPeriodPremises_YearsInProgram,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_OccurencyPolicyAdjFtr(strGLExperienceRating_TXT_LossPeriodPremises_OccurencyPolicyAdjFtr),strGLExperienceRating_TXT_LossPeriodPremises_OccurencyPolicyAdjFtr,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_ClaimsMadeExpPolicyAdjFtr(strGLExperienceRating_TXT_LossPeriodPremises_ClaimsMadeExpPolicyAdjFtr),strGLExperienceRating_TXT_LossPeriodPremises_ClaimsMadeExpPolicyAdjFtr,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_LossPeriodProduct_IncludeThisPeriod(strGLExperienceRating_CHK_LossPeriodProduct_IncludeThisPeriod),strGLExperienceRating_CHK_LossPeriodProduct_IncludeThisPeriod,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_PeriodNo(strGLExperienceRating_TXT_LossPeriodProduct_PeriodNo),strGLExperienceRating_TXT_LossPeriodProduct_PeriodNo,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_PeriodEffectiveDate(strGLExperienceRating_TXT_LossPeriodProduct_PeriodEffectiveDate),strGLExperienceRating_TXT_LossPeriodProduct_PeriodEffectiveDate,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_PeriodExpirationDate(strGLExperienceRating_TXT_LossPeriodProduct_PeriodExpirationDate),strGLExperienceRating_TXT_LossPeriodProduct_PeriodExpirationDate,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_DetrendFactor(strGLExperienceRating_TXT_LossPeriodProduct_DetrendFactor),strGLExperienceRating_TXT_LossPeriodProduct_DetrendFactor,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_CompanySubLossCost(strGLExperienceRating_TXT_LossPeriodProduct_CompanySubLossCost),strGLExperienceRating_TXT_LossPeriodProduct_CompanySubLossCost,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_OverrideCompSubLossCost(strGLExperienceRating_TXT_LossPeriodProduct_OverrideCompSubLossCost),strGLExperienceRating_TXT_LossPeriodProduct_OverrideCompSubLossCost,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_AdjstmntForLosses(strGLExperienceRating_TXT_LossPeriodProduct_AdjstmntForLosses),strGLExperienceRating_TXT_LossPeriodProduct_AdjstmntForLosses,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_LossPeriodProduct_OccurrencePeriod(strGLExperienceRating_CHK_LossPeriodProduct_OccurrencePeriod),strGLExperienceRating_CHK_LossPeriodProduct_OccurrencePeriod,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_LossPeriodProduct_ClaimsMadePeriod(strGLExperienceRating_CHK_LossPeriodProduct_ClaimsMadePeriod),strGLExperienceRating_CHK_LossPeriodProduct_ClaimsMadePeriod,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_YearsInProgram(strGLExperienceRating_TXT_LossPeriodProduct_YearsInProgram),strGLExperienceRating_TXT_LossPeriodProduct_YearsInProgram,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_OccurencyPolicyAdjFtr(strGLExperienceRating_TXT_LossPeriodProduct_OccurencyPolicyAdjFtr),strGLExperienceRating_TXT_LossPeriodProduct_OccurencyPolicyAdjFtr,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_ClaimsMadeExpPolicyAdjFtr(strGLExperienceRating_TXT_LossPeriodProduct_ClaimsMadeExpPolicyAdjFtr),strGLExperienceRating_TXT_LossPeriodProduct_ClaimsMadeExpPolicyAdjFtr,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_NoClaims(strGLExperienceRating_CHK_NoClaims),strGLExperienceRating_CHK_NoClaims,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_LossRunsAreNotAvlblatthisTime(strGLExperienceRating_CHK_LossRunsAreNotAvlblatthisTime),strGLExperienceRating_CHK_LossRunsAreNotAvlblatthisTime,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_ReorderLosses(strGLExperienceRating_CHK_ReorderLosses),strGLExperienceRating_CHK_ReorderLosses,test);
			if(!strGLExperienceRating_BTN_AddLossExperience.equalsIgnoreCase("N/A")){
				se.element().Click(getGLExperienceRating_BTN_AddLossExperience(strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_BTN_AddLossExperience,test);
				
				}
			
			se.element().selectElementDDrOrValidateText(getGLExperienceRating_BTN_Update_Factors(strGLExperienceRating_BTN_Update_Factors),strGLExperienceRating_BTN_Update_Factors,test);

			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_DeleteLink(strGLExperienceRating_CHK_DeleteLink,strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_CHK_DeleteLink,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriod(strGLExperienceRating_TXT_LossPeriod,strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_TXT_LossPeriod,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_DateOfLoss(strGLExperienceRating_TXT_DateOfLoss,strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_TXT_DateOfLoss,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_IncurredLossAmount(strGLExperienceRating_TXT_IncurredLossAmount,strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_TXT_IncurredLossAmount,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_SubjectLoss(strGLExperienceRating_TXT_SubjectLoss,strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_TXT_SubjectLoss,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_BasicLoss(strGLExperienceRating_TXT_BasicLoss,strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_TXT_BasicLoss,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_ALAEExpenses(strGLExperienceRating_TXT_ALAEExpenses,strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_TXT_ALAEExpenses,test);
			
			if(!strGLExperienceRating_CHK_SelectLossExperienceRowNo.equalsIgnoreCase("N/A"))
			{
				se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_SelectLossExperienceRowNo(strGLExperienceRating_CHK_SelectLossExperienceRowNo),"Check",test);
				se.element().Click(getGLExperienceRating_BTN_RemoveLossExperience(),test);
				
			}
			
			if(strGLExperienceRating_BTN_Done.equalsIgnoreCase("Yes")){
				se.element().Click(getNext(),test);
				
				}
			
		
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details for GLExperienceRating ", true, false, true, test);
			
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


public void GLExperienceRatingPageHumanService(String strRegressionID, String transaction, boolean LossExpFlag, ExtentTest test) throws IOException {
	try{
	String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	if(SuspendSheet.equalsIgnoreCase("GL_Experience_Rating")){
		test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
		testTearDown(se, test);
	}
	List<Map<String, String>> table = ExcelOperations.getPagesData("GL_Experience_Rating", strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
	String strGLExperienceRating_CHK_18 = (String) row.get("GLExperienceRating_CHK_18");
	String strGLExperienceRating_CHK_21 = (String) row.get("GLExperienceRating_CHK_21");
	String strGLExperienceRating_CHK_24 = (String) row.get("GLExperienceRating_CHK_24");
	String strGLExperienceRating_CHK_27 = (String) row.get("GLExperienceRating_CHK_27");
	String strGLExperienceRating_CHK_TypeOfPolicyOccurrence = (String) row.get("GLExperienceRating_CHK_TypeOfPolicyOccurrence");
	String strGLExperienceRating_CHK_TypeOfPolicyClaimsMade = (String) row.get("GLExperienceRating_CHK_TypeOfPolicyClaimsMade");
	String strGLExperienceRating_TXT_PeriodNo = (String) row.get("GLExperienceRating_TXT_PeriodNo");
	String strGLExperienceRating_CHK_LossPeriodPremises_IncludeThisPeriod = (String) row.get("GLExperienceRating_CHK_LossPeriodPremises_IncludeThisPeriod");
	String strGLExperienceRating_TXT_LossPeriodPremises_PeriodEffectiveDate = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_PeriodEffectiveDate");
	String strGLExperienceRating_TXT_LossPeriodPremises_PeriodExpirationDate = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_PeriodExpirationDate");
	String strGLExperienceRating_TXT_LossPeriodPremises_DetrendFactor = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_DetrendFactor");
	String strGLExperienceRating_TXT_LossPeriodPremises_CompanySubLossCost = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_CompanySubLossCost");
	String strGLExperienceRating_TXT_LossPeriodPremises_OverrideCompSubLossCost = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_OverrideCompSubLossCost");
	String strGLExperienceRating_TXT_LossPeriodPremises_AdjstmntForLosses = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_AdjstmntForLosses");
	String strGLExperienceRating_CHK_LossPeriodPremises_OccurrencePeriod = (String) row.get("GLExperienceRating_CHK_LossPeriodPremises_OccurrencePeriod");
	String strGLExperienceRating_CHK_LossPeriodPremises_ClaimsMadePeriod = (String) row.get("GLExperienceRating_CHK_LossPeriodPremises_ClaimsMadePeriod");
	String strGLExperienceRating_TXT_LossPeriodPremises_YearsInProgram = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_YearsInProgram");
	String strGLExperienceRating_TXT_LossPeriodPremises_OccurencyPolicyAdjFtr = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_OccurencyPolicyAdjFtr");
	String strGLExperienceRating_TXT_LossPeriodPremises_ClaimsMadeExpPolicyAdjFtr = (String) row.get("GLExperienceRating_TXT_LossPeriodPremises_ClaimsMadeExpPolicyAdjFtr");
	String strGLExperienceRating_CHK_LossPeriodProduct_IncludeThisPeriod = (String) row.get("GLExperienceRating_CHK_LossPeriodProduct_IncludeThisPeriod");
	String strGLExperienceRating_TXT_LossPeriodProduct_PeriodNo = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_PeriodNo");
	String strGLExperienceRating_TXT_LossPeriodProduct_PeriodEffectiveDate = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_PeriodEffectiveDate");
	String strGLExperienceRating_TXT_LossPeriodProduct_PeriodExpirationDate = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_PeriodExpirationDate");
	String strGLExperienceRating_TXT_LossPeriodProduct_DetrendFactor = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_DetrendFactor");
	String strGLExperienceRating_TXT_LossPeriodProduct_CompanySubLossCost = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_CompanySubLossCost");
	String strGLExperienceRating_TXT_LossPeriodProduct_OverrideCompSubLossCost = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_OverrideCompSubLossCost");
	String strGLExperienceRating_TXT_LossPeriodProduct_AdjstmntForLosses = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_AdjstmntForLosses");
	String strGLExperienceRating_CHK_LossPeriodProduct_OccurrencePeriod = (String) row.get("GLExperienceRating_CHK_LossPeriodProduct_OccurrencePeriod");
	String strGLExperienceRating_CHK_LossPeriodProduct_ClaimsMadePeriod = (String) row.get("GLExperienceRating_CHK_LossPeriodProduct_ClaimsMadePeriod");
	String strGLExperienceRating_TXT_LossPeriodProduct_YearsInProgram = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_YearsInProgram");
	String strGLExperienceRating_TXT_LossPeriodProduct_OccurencyPolicyAdjFtr = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_OccurencyPolicyAdjFtr");
	String strGLExperienceRating_TXT_LossPeriodProduct_ClaimsMadeExpPolicyAdjFtr = (String) row.get("GLExperienceRating_TXT_LossPeriodProduct_ClaimsMadeExpPolicyAdjFtr");
	String strGLExperienceRating_CHK_NoClaims = (String) row.get("GLExperienceRating_CHK_NoClaims");
	String strGLExperienceRating_CHK_LossRunsAreNotAvlblatthisTime = (String) row.get("GLExperienceRating_CHK_LossRunsAreNotAvlblatthisTime");
	String strGLExperienceRating_CHK_ReorderLosses = (String) row.get("GLExperienceRating_CHK_ReorderLosses");
	String strGLExperienceRating_CHK_DeleteLink = (String) row.get("GLExperienceRating_CHK_DeleteLink");
	String strGLExperienceRating_TXT_LossPeriod = (String) row.get("GLExperienceRating_TXT_LossPeriod");
	String strGLExperienceRating_TXT_DateOfLoss = (String) row.get("GLExperienceRating_TXT_DateOfLoss");
	String strGLExperienceRating_TXT_IncurredLossAmount = (String) row.get("GLExperienceRating_TXT_IncurredLossAmount");
	String strGLExperienceRating_TXT_SubjectLoss = (String) row.get("GLExperienceRating_TXT_SubjectLoss");
	String strGLExperienceRating_TXT_BasicLoss = (String) row.get("GLExperienceRating_TXT_BasicLoss");
	String strGLExperienceRating_TXT_ALAEExpenses = (String) row.get("GLExperienceRating_TXT_ALAEExpenses");
	String strGLExperienceRating_BTN_AddLossExperience = (String) row.get("GLExperienceRating_BTN_AddLossExperience");
	String strGLExperienceRating_BTN_Update_Factors = (String) row.get("GLExperienceRating_BTN_Update_Factors");
	String strGLExperienceRating_BTN_Done = (String) row.get("GLExperienceRating_BTN_Done");
	
		try{
			se.log().logTestStep("GLExperienceRating");
			test.log(LogStatus.INFO, "GLExperienceRating","Transaction Step : " + transaction + "<br>" + "Page : GLExperienceRating");
			se.verify().verifyEquals("GLExperienceRating Page of PowerWriter ", getGLExperienceRating_LBL_ExperienceRating("GLExperienceRating").isDisplayed(),true, true,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_18(strGLExperienceRating_CHK_18),strGLExperienceRating_CHK_18,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_21(strGLExperienceRating_CHK_21),strGLExperienceRating_CHK_21,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_24(strGLExperienceRating_CHK_24),strGLExperienceRating_CHK_24,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_27(strGLExperienceRating_CHK_27),strGLExperienceRating_CHK_27,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_TypeOfPolicyOccurrence(strGLExperienceRating_CHK_TypeOfPolicyOccurrence),strGLExperienceRating_CHK_TypeOfPolicyOccurrence,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_TypeOfPolicyClaimsMade(strGLExperienceRating_CHK_TypeOfPolicyClaimsMade),strGLExperienceRating_CHK_TypeOfPolicyClaimsMade,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_PeriodNo(strGLExperienceRating_TXT_PeriodNo),strGLExperienceRating_TXT_PeriodNo,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_LossPeriodPremises_IncludeThisPeriod(strGLExperienceRating_CHK_LossPeriodPremises_IncludeThisPeriod),strGLExperienceRating_CHK_LossPeriodPremises_IncludeThisPeriod,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_PeriodEffectiveDate(strGLExperienceRating_TXT_LossPeriodPremises_PeriodEffectiveDate),strGLExperienceRating_TXT_LossPeriodPremises_PeriodEffectiveDate,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_PeriodExpirationDate(strGLExperienceRating_TXT_LossPeriodPremises_PeriodExpirationDate),strGLExperienceRating_TXT_LossPeriodPremises_PeriodExpirationDate,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_DetrendFactor(strGLExperienceRating_TXT_LossPeriodPremises_DetrendFactor),strGLExperienceRating_TXT_LossPeriodPremises_DetrendFactor,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_CompanySubLossCost(strGLExperienceRating_TXT_LossPeriodPremises_CompanySubLossCost),strGLExperienceRating_TXT_LossPeriodPremises_CompanySubLossCost,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_OverrideCompSubLossCost(strGLExperienceRating_TXT_LossPeriodPremises_OverrideCompSubLossCost),strGLExperienceRating_TXT_LossPeriodPremises_OverrideCompSubLossCost,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_AdjstmntForLosses(strGLExperienceRating_TXT_LossPeriodPremises_AdjstmntForLosses),strGLExperienceRating_TXT_LossPeriodPremises_AdjstmntForLosses,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_LossPeriodPremises_OccurrencePeriod(strGLExperienceRating_CHK_LossPeriodPremises_OccurrencePeriod),strGLExperienceRating_CHK_LossPeriodPremises_OccurrencePeriod,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_LossPeriodPremises_ClaimsMadePeriod(strGLExperienceRating_CHK_LossPeriodPremises_ClaimsMadePeriod),strGLExperienceRating_CHK_LossPeriodPremises_ClaimsMadePeriod,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_YearsInProgram(strGLExperienceRating_TXT_LossPeriodPremises_YearsInProgram),strGLExperienceRating_TXT_LossPeriodPremises_YearsInProgram,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_OccurencyPolicyAdjFtr(strGLExperienceRating_TXT_LossPeriodPremises_OccurencyPolicyAdjFtr),strGLExperienceRating_TXT_LossPeriodPremises_OccurencyPolicyAdjFtr,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodPremises_ClaimsMadeExpPolicyAdjFtr(strGLExperienceRating_TXT_LossPeriodPremises_ClaimsMadeExpPolicyAdjFtr),strGLExperienceRating_TXT_LossPeriodPremises_ClaimsMadeExpPolicyAdjFtr,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_LossPeriodProduct_IncludeThisPeriod(strGLExperienceRating_CHK_LossPeriodProduct_IncludeThisPeriod),strGLExperienceRating_CHK_LossPeriodProduct_IncludeThisPeriod,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_PeriodNo(strGLExperienceRating_TXT_LossPeriodProduct_PeriodNo),strGLExperienceRating_TXT_LossPeriodProduct_PeriodNo,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_PeriodEffectiveDate(strGLExperienceRating_TXT_LossPeriodProduct_PeriodEffectiveDate),strGLExperienceRating_TXT_LossPeriodProduct_PeriodEffectiveDate,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_PeriodExpirationDate(strGLExperienceRating_TXT_LossPeriodProduct_PeriodExpirationDate),strGLExperienceRating_TXT_LossPeriodProduct_PeriodExpirationDate,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_DetrendFactor(strGLExperienceRating_TXT_LossPeriodProduct_DetrendFactor),strGLExperienceRating_TXT_LossPeriodProduct_DetrendFactor,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_CompanySubLossCost(strGLExperienceRating_TXT_LossPeriodProduct_CompanySubLossCost),strGLExperienceRating_TXT_LossPeriodProduct_CompanySubLossCost,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_OverrideCompSubLossCost(strGLExperienceRating_TXT_LossPeriodProduct_OverrideCompSubLossCost),strGLExperienceRating_TXT_LossPeriodProduct_OverrideCompSubLossCost,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_AdjstmntForLosses(strGLExperienceRating_TXT_LossPeriodProduct_AdjstmntForLosses),strGLExperienceRating_TXT_LossPeriodProduct_AdjstmntForLosses,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_LossPeriodProduct_OccurrencePeriod(strGLExperienceRating_CHK_LossPeriodProduct_OccurrencePeriod),strGLExperienceRating_CHK_LossPeriodProduct_OccurrencePeriod,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_LossPeriodProduct_ClaimsMadePeriod(strGLExperienceRating_CHK_LossPeriodProduct_ClaimsMadePeriod),strGLExperienceRating_CHK_LossPeriodProduct_ClaimsMadePeriod,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_YearsInProgram(strGLExperienceRating_TXT_LossPeriodProduct_YearsInProgram),strGLExperienceRating_TXT_LossPeriodProduct_YearsInProgram,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_OccurencyPolicyAdjFtr(strGLExperienceRating_TXT_LossPeriodProduct_OccurencyPolicyAdjFtr),strGLExperienceRating_TXT_LossPeriodProduct_OccurencyPolicyAdjFtr,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriodProduct_ClaimsMadeExpPolicyAdjFtr(strGLExperienceRating_TXT_LossPeriodProduct_ClaimsMadeExpPolicyAdjFtr),strGLExperienceRating_TXT_LossPeriodProduct_ClaimsMadeExpPolicyAdjFtr,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_NoClaims(strGLExperienceRating_CHK_NoClaims),strGLExperienceRating_CHK_NoClaims,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_LossRunsAreNotAvlblatthisTime(strGLExperienceRating_CHK_LossRunsAreNotAvlblatthisTime),strGLExperienceRating_CHK_LossRunsAreNotAvlblatthisTime,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_ReorderLosses(strGLExperienceRating_CHK_ReorderLosses),strGLExperienceRating_CHK_ReorderLosses,test);
			if(LossExpFlag){
				se.element().Click(getGLExperienceRating_BTN_AddLossExperience(strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_BTN_AddLossExperience,test);
			//se.element().selectElementDDrOrValidateText(getGLExperienceRating_BTN_Update_Factors(strGLExperienceRating_BTN_Update_Factors),strGLExperienceRating_BTN_Update_Factors,test);
			se.element().checkUncheckOrValidate(getGLExperienceRating_CHK_DeleteLink(strGLExperienceRating_CHK_DeleteLink,strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_CHK_DeleteLink,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_LossPeriod(strGLExperienceRating_TXT_LossPeriod,strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_TXT_LossPeriod,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_DateOfLoss(strGLExperienceRating_TXT_DateOfLoss,strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_TXT_DateOfLoss,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_IncurredLossAmount(strGLExperienceRating_TXT_IncurredLossAmount,strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_TXT_IncurredLossAmount,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_SubjectLoss(strGLExperienceRating_TXT_SubjectLoss,strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_TXT_SubjectLoss,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_BasicLoss(strGLExperienceRating_TXT_BasicLoss,strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_TXT_BasicLoss,test);
			se.element().enterOrValidateText(getGLExperienceRating_TXT_ALAEExpenses(strGLExperienceRating_TXT_ALAEExpenses,strGLExperienceRating_BTN_AddLossExperience),strGLExperienceRating_TXT_ALAEExpenses,test);
			
			se.element().selectElementDDrOrValidateText(getGLExperienceRating_BTN_Update_Factors(strGLExperienceRating_BTN_Update_Factors),strGLExperienceRating_BTN_Update_Factors,test);
		}  
			
			
			
			if(strGLExperienceRating_BTN_Done.equalsIgnoreCase("Yes")){
				se.element().Click(getNext(),test);
				
				}
			
		
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details for GLExperienceRating ", true, false, true, test);
			
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


