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

public class GL_SpecialEvents extends OR_GL{
	
	public void GL_SpecialEvents_Details(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.GL_SpecialEvents)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.GL_SpecialEvents, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strAddButton = (String) row.get("Add_BTN");
			String strDoneButton = (String) row.get("Done_BTN");
			String strEventNumber = (String) row.get("EventNumber_TXT");
			String strEventName = (String) row.get("EventName_TXT");
			String strEventStartDate = (String) row.get("EventStartDate_TXT");
			String strEventEndDate = (String) row.get("EventEndDate_TXT");
			String strNumberOfEventsetUpDays = (String) row.get("NumberOfEventsetUpDays_TXT");
			String strNumberOfEventTeardownDays = (String) row.get("NumberOfEventTeardownDays_TXT");
			String strGL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableYes = (String) row.get("AreFoodBeverageOrCraftsAvailableYes_CHK");
			String strGL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableNo = (String) row.get("AreFoodBeverageOrCraftsAvailableNo_CHK");
			String strGL_SpecialEvents_CHK_DunkTankYes = (String) row.get("DunkTankYes_CHK");
			String strBaseRate_DunkTank = (String) row.get("BaseRate_DunkTank_TXT");
			String strOverrideBaseRate_DunkTank = (String) row.get("OverrideBaseRate_DunkTank_TXT");
			String strGL_SpecialEvents_CHK_DunkTankNo = (String) row.get("DunkTankNo_CHK");
			String strGL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelYes = (String) row.get("GolfCart/ATVUsedByPersonnelYes_CHK");
			String strBaseRate_GolfCartATV = (String) row.get("BaseRate_GolfCart/ATV_TXT");
			String strOverrideBaseRate_GolfCartATV = (String) row.get("OverrideBaseRate_GolfCart/ATV_TXT");
			String strGL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelNo = (String) row.get("GolfCart/ATVUsedByPersonnelNo_CHK");
			String strGL_SpecialEvents_CHK_PettingZooYes = (String) row.get("PettingZooYes_CHK");
			String strBaseRate_PettingZoo = (String) row.get("BaseRate_PettingZoo_TXT");
			String strOverrideBaseRate_PettingZoo = (String) row.get("OverrideBaseRate_PettingZoo_TXT");
			String strGL_SpecialEvents_CHK_PettingZooNo = (String) row.get("PettingZooNo_CHK");
			String strGL_SpecialEvents_CHK_ParadeYes = (String) row.get("ParadeYes_CHK");
			String strNumberOfUnits = (String) row.get("NumberOfUnits_TXT");
			String strBaseRate_Parade = (String) row.get("BaseRate_Parade_TXT");
			String strOverrideBaseRate_Parade = (String) row.get("OverrideBaseRate_Parade_TXT");
			String strGL_SpecialEvents_CHK_ParadeNo = (String) row.get("ParadeNo_CHK");
				
		try{
				se.log().logTestStep("GL_SpecialEvents_Details");
				test.log(LogStatus.INFO, "GL_SpecialEvents_Details page","Transaction Step : "+transaction + "<br>" +"Page : GL_SpecialEvents_Details");
				se.verify().verifyEquals("GL_SpecialEvents_Details Page of PowerWriter ", getPagecontainingtext("Special Events").isDisplayed(),true, true,test);
				if(!strAddButton.equals("N/A")){
					se.element().clickElement(getGL_SpecialEvents_BTN_Add(),test);
					}
				se.element().enterOrValidateText(getGL_SpecialEvents_TXT_EventNumber(strEventNumber),strEventNumber,test);
				se.element().enterOrValidateText(getGL_SpecialEvents_TXT_EventName(strEventName),strEventName,test);
				se.element().enterOrValidateText(getGL_SpecialEvents_TXT_EventStartDate(strEventStartDate),strEventStartDate,test);
				se.element().enterOrValidateText(getGL_SpecialEvents_TXT_EventEndDate(strEventEndDate),strEventEndDate,test);
				se.element().enterOrValidateText(getGL_SpecialEvents_TXT_NumberOfEventsetUpDays(strNumberOfEventsetUpDays),strNumberOfEventsetUpDays,test);
				se.element().enterOrValidateText(getGL_SpecialEvents_TXT_NumberOfEventTeardownDays(strNumberOfEventTeardownDays),strNumberOfEventTeardownDays,test);
				se.element().checkUncheckOrValidate(getGL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableYes(strGL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableYes),strGL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableYes,test);
				se.element().checkUncheckOrValidate(getGL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableNo(strGL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableNo),strGL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableNo,test);
				se.element().checkUncheckOrValidate(getGL_SpecialEvents_CHK_DunkTankYes(strGL_SpecialEvents_CHK_DunkTankYes),strGL_SpecialEvents_CHK_DunkTankYes,test);
				se.element().enterOrValidateText(getGL_SpecialEvents_TXT_BaseRate_DunkTank(strBaseRate_DunkTank),strBaseRate_DunkTank,test);
				se.element().enterOrValidateText(getGL_SpecialEvents_TXT_OverrideBaseRate_DunkTank(strOverrideBaseRate_DunkTank),strOverrideBaseRate_DunkTank,test);
				se.element().checkUncheckOrValidate(getGL_SpecialEvents_CHK_DunkTankNo(strGL_SpecialEvents_CHK_DunkTankNo),strGL_SpecialEvents_CHK_DunkTankNo,test);
				se.element().checkUncheckOrValidate(getGL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelYes(strGL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelYes),strGL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelYes,test);
				se.element().enterOrValidateText(getGL_SpecialEvents_TXT_BaseRate_GolfCartATV(strBaseRate_GolfCartATV),strBaseRate_GolfCartATV,test);
				se.element().enterOrValidateText(getGL_SpecialEvents_TXT_OverrideBaseRate_GolfCartATV(strOverrideBaseRate_GolfCartATV),strOverrideBaseRate_GolfCartATV,test);
				se.element().checkUncheckOrValidate(getGL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelNo(strGL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelNo),strGL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelNo,test);
				se.element().checkUncheckOrValidate(getGL_SpecialEvents_CHK_PettingZooYes(strGL_SpecialEvents_CHK_PettingZooYes),strGL_SpecialEvents_CHK_PettingZooYes,test);
				se.element().enterOrValidateText(getGL_SpecialEvents_TXT_BaseRate_PettingZoo(strBaseRate_PettingZoo),strBaseRate_PettingZoo,test);
				se.element().enterOrValidateText(getGL_SpecialEvents_TXT_OverrideBaseRate_PettingZoo(strOverrideBaseRate_PettingZoo),strOverrideBaseRate_PettingZoo,test);
				se.element().checkUncheckOrValidate(getGL_SpecialEvents_CHK_PettingZooNo(strGL_SpecialEvents_CHK_PettingZooNo),strGL_SpecialEvents_CHK_PettingZooNo,test);
				se.element().checkUncheckOrValidate(getGL_SpecialEvents_CHK_ParadeYes(strGL_SpecialEvents_CHK_ParadeYes),strGL_SpecialEvents_CHK_ParadeYes,test);
				se.element().enterOrValidateText(getGL_SpecialEvents_TXT_NumberOfUnits(strNumberOfUnits),strNumberOfUnits,test);
				se.element().enterOrValidateText(getGL_SpecialEvents_TXT_BaseRate_Parade(strBaseRate_Parade),strBaseRate_Parade,test);
				se.element().enterOrValidateText(getGL_SpecialEvents_TXT_OverrideBaseRate_Parade(strOverrideBaseRate_Parade),strOverrideBaseRate_Parade,test);
				se.element().checkUncheckOrValidate(getGL_SpecialEvents_CHK_ParadeNo(strGL_SpecialEvents_CHK_ParadeNo),strGL_SpecialEvents_CHK_ParadeNo,test);
				se.element().clickElement(getNext(),test);
				if(!strDoneButton.equals("N/A")){
				se.element().clickElement(getDone(),test);
				}
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for GL_SpecialEvents_Details ", true, false, true, test);
					
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