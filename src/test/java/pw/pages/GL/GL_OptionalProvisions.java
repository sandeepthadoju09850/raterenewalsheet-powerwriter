package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_GL;

public class GL_OptionalProvisions extends OR_GL {
	
public void CP_GLOptionalProvisions(String strRegressionID, String transaction, ExtentTest test) throws IOException {
	try{
	String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	if(SuspendSheet.equalsIgnoreCase(constants.GL_Optional_Provisions)){
		test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
		testTearDown(se, test);
	}
	List<Map<String, String>> table = ExcelOperations.getPagesData(constants.GL_Optional_Provisions, strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strGL_Optional_Provisions_CHK_DeleteLink = (String) row.get("GL_Optional_Provisions_CHK_DeleteLink");
			String strGL_Optional_Provisions_TXT_ProvisionName = (String) row.get("GL_Optional_Provisions_TXT_ProvisionName");
			String strGL_Optional_Provisions_TXT_CoveragePart = (String) row.get("GL_Optional_Provisions_TXT_CoveragePart");
			String strGL_Optional_Provisions_TXT_Form = (String) row.get("GL_Optional_Provisions_TXT_Form");
			String strGL_Optional_Provisions_TXT_AllOtherClasses = (String) row.get("GL_Optional_Provisions_TXT_AllOtherClasses");
			String strGL_Optional_Provisions_TXT_NameOfPersonOrOrganization = (String) row.get("GL_Optional_Provisions_TXT_NameOfPersonOrOrganization");
			String strGL_Optional_Provisions_CHK_CalculateByPremium = (String) row.get("GL_Optional_Provisions_CHK_CalculateByPremium");
			String strGL_Optional_Provisions_CHK_CalculateByFactor = (String) row.get("GL_Optional_Provisions_CHK_CalculateByFactor");
			String strGL_Optional_Provisions_CHK_CalculateByNoPremium = (String) row.get("GL_Optional_Provisions_CHK_CalculateByNoPremium");
			String strGL_Optional_Provisions_TXT_EndorsementPremium = (String) row.get("GL_Optional_Provisions_TXT_EndorsementPremium");
			String strGL_Optional_Provisions_TXT_DescriptionAndLocation = (String) row.get("GL_Optional_Provisions_TXT_DescriptionAndLocation");
			String strGL_Optional_Provisions_TXT_OverrideEndorsementPrem = (String) row.get("GL_Optional_Provisions_TXT_OverrideEndorsementPrem");
			String strGL_Optional_Provisions_TXT_OverrideEndorsementReason = (String) row.get("GL_Optional_Provisions_TXT_OverrideEndorsementReason");
			String strGL_Optional_Provisions_TXT_OverrideEndorsementFactor = (String) row.get("GL_Optional_Provisions_TXT_OverrideEndorsementFactor");
			String strGL_Optional_Provisions_BTN_DONE = (String) row.get("GL_Optional_Provisions_BTN_DONE");
			String strGL_Optional_Provisions_BTN_Edit = (String) row.get("GL_Optional_Provisions_BTN_Edit");
			String strGL_Optional_Provisions_BTN_Add = (String) row.get("GL_Optional_Provisions_BTN_Add");
			String strGL_Optional_Provisions_TXT_GolfOrTennisProfessional = (String) row.get("GL_Optional_Provisions_TXT_GolfOrTennisProfessional");
			String strGL_Optional_Provisions_TXT_ScheduledRailroad = (String) row.get("GL_Optional_Provisions_TXT_ScheduledRailroad");
			String strGL_Optional_Provisions_TXT_DesignatedJobSite = (String) row.get("GL_Optional_Provisions_TXT_DesignatedJobSite");
			
			try{
			test.log(LogStatus.INFO, "GL_Optional_Provisions","Transaction Step : " + transaction + "<br>" + "Page : GL_Optional_Provisions");
			se.verify().verifyEquals("GL_Optional_Provisions Page of PowerWriter ", getGL_Optional_Provisions_LBL_OptionalProvisions().isDisplayed(),true, true,test);
			if(strGL_Optional_Provisions_BTN_Add.equalsIgnoreCase("Yes")){
			se.element().Click(getGL_Optional_Provisions_BTN_Add(),test);
			se.verify().verifyEquals("GL_Optional_Provisions Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if((!strGL_Optional_Provisions_BTN_Edit.equalsIgnoreCase("N/A"))){
				se.element().tryClick(getGL_Optional_Provisions_BTN_Details(strGL_Optional_Provisions_BTN_Edit),test);
			se.verify().verifyEquals("GL_Optional_Provisions Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if(!(strGL_Optional_Provisions_CHK_DeleteLink.equalsIgnoreCase("N/A"))){
				se.element().checkUncheckOrValidate(getGL_Optional_Provisions_CHK_DeleteLink(strGL_Optional_Provisions_CHK_DeleteLink),strGL_Optional_Provisions_CHK_DeleteLink,test);
			}
			
			se.element().enterOrValidateText(getGL_Optional_Provisions_TXT_ProvisionName(strGL_Optional_Provisions_TXT_ProvisionName),strGL_Optional_Provisions_TXT_ProvisionName,test);
			se.element().enterOrValidateText(getGL_Optional_Provisions_TXT_CoveragePart(strGL_Optional_Provisions_TXT_CoveragePart),strGL_Optional_Provisions_TXT_CoveragePart,test);
			se.element().enterOrValidateText(getGL_Optional_Provisions_TXT_Form(strGL_Optional_Provisions_TXT_Form),strGL_Optional_Provisions_TXT_Form,test);
			se.element().enterOrValidateText(getGL_Optional_Provisions_TXT_GolfOrTennisProfessional(strGL_Optional_Provisions_TXT_GolfOrTennisProfessional),strGL_Optional_Provisions_TXT_GolfOrTennisProfessional,test);
			se.element().enterOrValidateText(getGL_Optional_Provisions_TXT_ScheduledRailroad(strGL_Optional_Provisions_TXT_ScheduledRailroad),strGL_Optional_Provisions_TXT_ScheduledRailroad,test);
			se.element().enterOrValidateText(getGL_Optional_Provisions_TXT_DesignatedJobSite(strGL_Optional_Provisions_TXT_DesignatedJobSite),strGL_Optional_Provisions_TXT_DesignatedJobSite,test);
			se.element().enterOrValidateText(getGL_Optional_Provisions_TXT_AllOtherClasses(strGL_Optional_Provisions_TXT_AllOtherClasses),strGL_Optional_Provisions_TXT_AllOtherClasses,test);
			
			se.element().enterOrValidateText(getGL_Optional_Provisions_TXT_NameOfPersonOrOrganization(strGL_Optional_Provisions_TXT_NameOfPersonOrOrganization),strGL_Optional_Provisions_TXT_NameOfPersonOrOrganization,test);
			
			se.element().checkUncheckOrValidate(getGL_Optional_Provisions_CHK_CalculateByPremium(strGL_Optional_Provisions_CHK_CalculateByPremium),strGL_Optional_Provisions_CHK_CalculateByPremium,test);
			se.element().checkUncheckOrValidate(getGL_Optional_Provisions_CHK_CalculateByFactor(strGL_Optional_Provisions_CHK_CalculateByFactor),strGL_Optional_Provisions_CHK_CalculateByFactor,test);
			se.element().checkUncheckOrValidate(getGL_Optional_Provisions_CHK_CalculateByNoPremium(strGL_Optional_Provisions_CHK_CalculateByNoPremium),strGL_Optional_Provisions_CHK_CalculateByNoPremium,test);
			se.element().enterOrValidateText(getGL_Optional_Provisions_TXT_EndorsementPremium(strGL_Optional_Provisions_TXT_EndorsementPremium),strGL_Optional_Provisions_TXT_EndorsementPremium,test);
			se.element().enterOrValidateText(getGL_Optional_Provisions_TXT_OverrideEndorsementPrem(strGL_Optional_Provisions_TXT_OverrideEndorsementPrem),strGL_Optional_Provisions_TXT_OverrideEndorsementPrem,test);
			se.element().enterOrValidateText(getGL_Optional_Provisions_TXT_OverrideEndorsementReason(strGL_Optional_Provisions_TXT_OverrideEndorsementReason),strGL_Optional_Provisions_TXT_OverrideEndorsementReason,test);
			se.element().enterOrValidateText(getGL_Optional_Provisions_TXT_OverrideEndorsementFactor(strGL_Optional_Provisions_TXT_OverrideEndorsementFactor),strGL_Optional_Provisions_TXT_OverrideEndorsementFactor,test);
			
			se.element().enterOrValidateText(getGL_Optional_Provisions_TXT_DescriptionAndLocation(strGL_Optional_Provisions_TXT_DescriptionAndLocation),strGL_Optional_Provisions_TXT_DescriptionAndLocation,test);
			se.element().Click(getNext(),test);
			Thread.sleep(3000);
					
			if((strGL_Optional_Provisions_BTN_DONE.equalsIgnoreCase("Yes"))){	
				se.element().Click(getDone(),test);
			}
					
			
	
	
}catch(Exception e){
	
	se.verify().verifyEquals("Failed to fill in details for GLOptionalProvisions ", true, false, true, test);
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
