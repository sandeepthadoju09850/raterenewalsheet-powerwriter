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

public class CIM_MusicalInstrumentDealers extends OR_CIM{
	
	public void MusicalInstrumentDealers(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_MusicalInstrumentDealer")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_MusicalInstrumentDealer", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_MusicalInstrumentDealer_BTN_ADD = (String) row.get("CIM_MusicalInstrumentDealer_BTN_ADD");
		String strCIM_MusicalInstrumentDealer_BTN_Details = (String) row.get("CIM_MusicalInstrumentDealer_BTN_Details");
		String strCIM_MusicalInstrumentDealer_BTN_Done = (String) row.get("CIM_MusicalInstrumentDealer_BTN_Done");
		String strCIM_MusicalInstrumentDealer_TXT_LocationNo = (String) row.get("CIM_MusicalInstrumentDealer_TXT_LocationNo");
		String strCIM_MusicalInstrumentDealer_TXT_BuildingNo = (String) row.get("CIM_MusicalInstrumentDealer_TXT_BuildingNo");
		String strCIM_MusicalInstrumentDealer_TXT_BuildingDescription = (String) row.get("CIM_MusicalInstrumentDealer_TXT_BuildingDescription");
		String strCIM_MusicalInstrumentDealer_TXT_Limit = (String) row.get("CIM_MusicalInstrumentDealer_TXT_Limit");
		String strCIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoring = (String) row.get("CIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoring");
		String strCIM_MusicalInstrumentDealer_TXT_CertificateGrading = (String) row.get("CIM_MusicalInstrumentDealer_TXT_CertificateGrading");
		String strCIM_MusicalInstrumentDealer_TXT_CertificateGradingPopupSearchDisplay= (String) row.get("CIM_MusicalInstrumentDealer_TXT_CertificateGradingPopupSearchDisplay");
		String strCIM_MusicalInstrumentDealer_TXT_ExtentOfPremiseProtection = (String) row.get("CIM_MusicalInstrumentDealer_TXT_ExtentOfPremiseProtection");
		String strCIM_MusicalInstrumentDealer_CHK_SecondCentralStationPremAlarmSystm = (String) row.get("CIM_MusicalInstrumentDealer_CHK_SecondCentralStationPremAlarmSystm");
		String strCIM_MusicalInstrumentDealer_CHK_ThirdCentralStationPremAlarmSystm = (String) row.get("CIM_MusicalInstrumentDealer_CHK_ThirdCentralStationPremAlarmSystm");
		String strCIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreClosed = (String) row.get("CIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreClosed");
		String strCIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreOpen = (String) row.get("CIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreOpen");
		String strCIM_MusicalInstrumentDealer_CHK_WatchPersonCentralStationWatchpersonsClock = (String) row.get("CIM_MusicalInstrumentDealer_CHK_WatchPersonCentralStationWatchpersonsClock");
		String strCIM_MusicalInstrumentDealer_TXT_FurnitureFixAndOfficeSuppLim = (String) row.get("CIM_MusicalInstrumentDealer_TXT_FurnitureFixAndOfficeSuppLim");
		String strCIM_MusicalInstrumentDealer_TXT_ImprovementsAndBettermentsLim = (String) row.get("CIM_MusicalInstrumentDealer_TXT_ImprovementsAndBettermentsLim");
		String strCIM_MusicalInstrumentDealer_TXT_MachineryToolsAndFittingsLim = (String) row.get("CIM_MusicalInstrumentDealer_TXT_MachineryToolsAndFittingsLim");
		String strCIM_MusicalInstrumentDealer_TXT_PatternsDiesMoldAndModelsLim = (String) row.get("CIM_MusicalInstrumentDealer_TXT_PatternsDiesMoldAndModelsLim");
		String strCIM_MusicalInstrumentDealer_TXT_TotalLimEmployeeCustody = (String) row.get("CIM_MusicalInstrumentDealer_TXT_TotalLimEmployeeCustody");
		String strCIM_MusicalInstrumentDealer_TXT_TotalLimElsewhereNotAtPrem = (String) row.get("CIM_MusicalInstrumentDealer_TXT_TotalLimElsewhereNotAtPrem");
		String strCIM_MusicalInstrumentDealer_TXT_PackageModFactor = (String) row.get("CIM_MusicalInstrumentDealer_TXT_PackageModFactor");
		String strCIM_MusicalInstrumentDealer_TXT_CertificateGradingPopup_ExtentPremises = (String) row.get("CIM_MusicalInstrumentDealer_TXT_CertificateGradingPopup_ExtentPremises");
		
		try{
			se.log().logTestStep("MusicalInstrumentDealers");
			test.log(LogStatus.INFO, "MusicalInstrumentDealers page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMusicalInstrumentDealers");
			se.verify().verifyEquals("MusicalInstrumentDealers page of PowerWriter ", getCIM_MusicalInstrumentDealer_TXT_VerifyMusicalInstrumentDealerText().isDisplayed(),true, true,test);
		
			if((strCIM_MusicalInstrumentDealer_BTN_ADD.equalsIgnoreCase("Yes"))){
				se.element().Click(getCIM_MusicalInstrumentDealer_BTN_ADD(strCIM_MusicalInstrumentDealer_BTN_ADD),test);
				}
				if((strCIM_MusicalInstrumentDealer_BTN_Details.equalsIgnoreCase("Yes"))){
					se.element().clickElement(getCIM_MusicalInstrumentDealer_BTN_Details(strCIM_MusicalInstrumentDealer_BTN_Details),test);
				}
				
				se.element().enterOrValidateText(getCIM_MusicalInstrumentDealer_TXT_LocationNo(strCIM_MusicalInstrumentDealer_TXT_LocationNo),strCIM_MusicalInstrumentDealer_TXT_LocationNo,test);
				se.element().enterOrValidateText(getCIM_MusicalInstrumentDealer_TXT_BuildingNo(strCIM_MusicalInstrumentDealer_TXT_BuildingNo),strCIM_MusicalInstrumentDealer_TXT_BuildingNo,test);
				se.element().enterOrValidateText(getCIM_MusicalInstrumentDealer_TXT_BuildingDescription(strCIM_MusicalInstrumentDealer_TXT_BuildingDescription),strCIM_MusicalInstrumentDealer_TXT_BuildingDescription,test);
				se.element().enterOrValidateText(getCIM_MusicalInstrumentDealer_TXT_Limit(strCIM_MusicalInstrumentDealer_TXT_Limit),strCIM_MusicalInstrumentDealer_TXT_Limit,test);
				se.element().selectPopupWithMagnifier(getCIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoring(strCIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoring), getCIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoringSearch(strCIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoring), strCIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoring, constants.NA, strCIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoring, constants.NA, constants.NA, constants.NA, test);
				se.element().selectPopupWithMagnifier(getCIM_MusicalInstrumentDealer_TXT_CertificateGrading(strCIM_MusicalInstrumentDealer_TXT_CertificateGrading), getCIM_MusicalInstrumentDealer_BTN_CertificateGradingSearch(strCIM_MusicalInstrumentDealer_TXT_CertificateGrading), strCIM_MusicalInstrumentDealer_TXT_CertificateGrading, strCIM_MusicalInstrumentDealer_TXT_CertificateGradingPopupSearchDisplay, strCIM_MusicalInstrumentDealer_TXT_CertificateGrading, strCIM_MusicalInstrumentDealer_TXT_CertificateGradingPopup_ExtentPremises, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCIM_MusicalInstrumentDealer_TXT_ExtentOfPremiseProtection(strCIM_MusicalInstrumentDealer_TXT_ExtentOfPremiseProtection),strCIM_MusicalInstrumentDealer_TXT_ExtentOfPremiseProtection,test);
				se.element().checkUncheckOrValidate(getCIM_MusicalInstrumentDealer_CHK_SecondCentralStationPremAlarmSystm(strCIM_MusicalInstrumentDealer_CHK_SecondCentralStationPremAlarmSystm),strCIM_MusicalInstrumentDealer_CHK_SecondCentralStationPremAlarmSystm,test);
				se.element().checkUncheckOrValidate(getCIM_MusicalInstrumentDealer_CHK_ThirdCentralStationPremAlarmSystm(strCIM_MusicalInstrumentDealer_CHK_ThirdCentralStationPremAlarmSystm),strCIM_MusicalInstrumentDealer_CHK_ThirdCentralStationPremAlarmSystm,test);
				se.element().checkUncheckOrValidate(getCIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreClosed(strCIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreClosed),strCIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreClosed,test);
				se.element().checkUncheckOrValidate(getCIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreOpen(strCIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreOpen),strCIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreOpen,test);
				se.element().checkUncheckOrValidate(getCIM_MusicalInstrumentDealer_CHK_WatchPersonCentralStationWatchpersonsClock(strCIM_MusicalInstrumentDealer_CHK_WatchPersonCentralStationWatchpersonsClock),strCIM_MusicalInstrumentDealer_CHK_WatchPersonCentralStationWatchpersonsClock,test);
				se.element().enterOrValidateText(getCIM_MusicalInstrumentDealer_TXT_FurnitureFixAndOfficeSuppLim(strCIM_MusicalInstrumentDealer_TXT_FurnitureFixAndOfficeSuppLim),strCIM_MusicalInstrumentDealer_TXT_FurnitureFixAndOfficeSuppLim,test);
				se.element().enterOrValidateText(getCIM_MusicalInstrumentDealer_TXT_ImprovementsAndBettermentsLim(strCIM_MusicalInstrumentDealer_TXT_ImprovementsAndBettermentsLim),strCIM_MusicalInstrumentDealer_TXT_ImprovementsAndBettermentsLim,test);
				se.element().enterOrValidateText(getCIM_MusicalInstrumentDealer_TXT_MachineryToolsAndFittingsLim(strCIM_MusicalInstrumentDealer_TXT_MachineryToolsAndFittingsLim),strCIM_MusicalInstrumentDealer_TXT_MachineryToolsAndFittingsLim,test);
				se.element().enterOrValidateText(getCIM_MusicalInstrumentDealer_TXT_PatternsDiesMoldAndModelsLim(strCIM_MusicalInstrumentDealer_TXT_PatternsDiesMoldAndModelsLim),strCIM_MusicalInstrumentDealer_TXT_PatternsDiesMoldAndModelsLim,test);
				se.element().enterOrValidateText(getCIM_MusicalInstrumentDealer_TXT_TotalLimEmployeeCustody(strCIM_MusicalInstrumentDealer_TXT_TotalLimEmployeeCustody),strCIM_MusicalInstrumentDealer_TXT_TotalLimEmployeeCustody,test);
				se.element().enterOrValidateText(getCIM_MusicalInstrumentDealer_TXT_TotalLimElsewhereNotAtPrem(strCIM_MusicalInstrumentDealer_TXT_TotalLimElsewhereNotAtPrem),strCIM_MusicalInstrumentDealer_TXT_TotalLimElsewhereNotAtPrem,test);
				se.element().enterOrValidateText(getCIM_MusicalInstrumentDealer_TXT_PackageModFactor(strCIM_MusicalInstrumentDealer_TXT_PackageModFactor),strCIM_MusicalInstrumentDealer_TXT_PackageModFactor,test);
				
				se.element().Click(getNext(),test);
				
				if((strCIM_MusicalInstrumentDealer_BTN_Done.equalsIgnoreCase("Yes"))){
					
					se.element().Click(getDone(),test);
				}
	
			
	}
		catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CIM_MusicalInstrumentDetails ", true, false, true, test);
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
