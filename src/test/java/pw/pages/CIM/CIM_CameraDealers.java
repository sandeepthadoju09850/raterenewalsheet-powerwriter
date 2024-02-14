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

public class CIM_CameraDealers extends OR_CIM{
	
	public void CameraDealers(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_CameraDealers")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_CameraDealers", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_CameraDealers_BTN_ADD = (String) row.get("CIM_CameraDealers_BTN_ADD");
		String strCIM_CameraDealers_BTN_Details = (String) row.get("CIM_CameraDealers_BTN_Details");
		String strCIM_CameraDealers_BTN_Done = (String) row.get("CIM_CameraDealers_BTN_Done");
		String strCIM_CameraDealers_TXT_Location = (String) row.get("CIM_CameraDealers_TXT_Location");
		String strCIM_CameraDealers_TXT_Building = (String) row.get("CIM_CameraDealers_TXT_Building");
		String strCIM_CameraDealers_TXT_BuildingDescription = (String) row.get("CIM_CameraDealers_TXT_BuildingDescription");
		String strCIM_CameraDealers_TXT_Limit = (String) row.get("CIM_CameraDealers_TXT_Limit");
		String strCIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoring = (String) row.get("CIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoring");
		String strCIM_CameraDealers_TXT_CertificateGrading = (String) row.get("CIM_CameraDealers_TXT_CertificateGrading");
		String strCIM_CameraDealers_TXT_CertificateGradingFilterNeeded = (String) row.get("CIM_CameraDealers_TXT_CertificateGradingFilterNeeded");
		String strCIM_CameraDealers_TXT_CertificateGradingPopup_ExtentOfPremises = (String) row.get("CIM_CameraDealers_TXT_CertificateGradingPopup_ExtentOfPremises");
		String strCIM_CameraDealers_TXT_ExtentOfPremiseProtection = (String) row.get("CIM_CameraDealers_TXT_ExtentOfPremiseProtection");
		String strCIM_CameraDealers_CHK_SecondCentralStationPremisesAlarmSystem = (String) row.get("CIM_CameraDealers_CHK_SecondCentralStationPremisesAlarmSystem");
		String strCIM_CameraDealers_CHK_ThirdCentralStationPremisesAlarmSystem = (String) row.get("CIM_CameraDealers_CHK_ThirdCentralStationPremisesAlarmSystem");
		String strCIM_CameraDealers_CHK_WatchPersonWhenPremisesAreClosed = (String) row.get("CIM_CameraDealers_CHK_WatchPersonWhenPremisesAreClosed");
		String strCIM_CameraDealers_CHK_WatchPersonWhenPremisesAreOpen = (String) row.get("CIM_CameraDealers_CHK_WatchPersonWhenPremisesAreOpen");
		String strCIM_CameraDealers_CHK_WatchPersonCentralStationWatchpersonsClock = (String) row.get("CIM_CameraDealers_CHK_WatchPersonCentralStationWatchpersonsClock");
		String strCIM_CameraDealers_TXT_FurnitureFixturesAndOfficeSuppliesLimit = (String) row.get("CIM_CameraDealers_TXT_FurnitureFixturesAndOfficeSuppliesLimit");
		String strCIM_CameraDealers_TXT_ImprovementsAndBettermentsLimit = (String) row.get("CIM_CameraDealers_TXT_ImprovementsAndBettermentsLimit");
		String strCIM_CameraDealers_TXT_MachineryToolsAndFittingLimit = (String) row.get("CIM_CameraDealers_TXT_MachineryToolsAndFittingLimit");
		String strCIM_CameraDealers_TXT_PatternsDiesMoldModelsLimit = (String) row.get("CIM_CameraDealers_TXT_PatternsDiesMoldModelsLimit");
		String strCIM_CameraDealers_TXT_TotalLimitEmployeesCustody = (String) row.get("CIM_CameraDealers_TXT_TotalLimitEmployeesCustody");
		String strCIM_CameraDealers_TXT_TotalLimitElsewhereNotAtYourPremises = (String) row.get("CIM_CameraDealers_TXT_TotalLimitElsewhereNotAtYourPremises");
		String strCIM_CameraDealers_TXT_PackageModFactor = (String) row.get("CIM_CameraDealers_TXT_PackageModFactor");		
		
		try{
			se.log().logTestStep("CameraDealers");
			test.log(LogStatus.INFO, "CameraDealers page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMCameraDealers");
			se.verify().verifyEquals("CameraDealers page of PowerWriter ", getCIM_CameraDealers_TXT_VerifyCameraDealersText().isDisplayed(),true, true,test);
			
			if((strCIM_CameraDealers_BTN_ADD.equalsIgnoreCase("Yes"))){
				se.element().Click(getCIM_CameraDealers_BTN_ADD(strCIM_CameraDealers_BTN_ADD),test);
				}
				if((strCIM_CameraDealers_BTN_Details.equalsIgnoreCase("Yes"))){
				se.element().tryClick(getCIM_CameraDealers_BTN_Details(strCIM_CameraDealers_BTN_Details),test);
				}
			
			se.element().enterOrValidateText(getCIM_CameraDealers_TXT_Location(strCIM_CameraDealers_TXT_Location),strCIM_CameraDealers_TXT_Location,test);
			se.element().enterOrValidateText(getCIM_CameraDealers_TXT_Building(strCIM_CameraDealers_TXT_Building),strCIM_CameraDealers_TXT_Building,test);
			se.element().enterOrValidateText(getCIM_CameraDealers_TXT_BuildingDescription(strCIM_CameraDealers_TXT_BuildingDescription),strCIM_CameraDealers_TXT_BuildingDescription,test);
			se.element().enterOrValidateText(getCIM_CameraDealers_TXT_Limit(strCIM_CameraDealers_TXT_Limit),strCIM_CameraDealers_TXT_Limit,test);
			se.element().selectPopupWithMagnifier(getCIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoring(strCIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoring), getCIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoringSearch(strCIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoring), strCIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoring,constants.NA, strCIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoring,constants.NA, constants.NA, constants.NA, test);
			se.element().selectPopupWithMagnifier(getCIM_CameraDealers_TXT_CertificateGrading(strCIM_CameraDealers_TXT_CertificateGrading), getCIM_CameraDealers_BTN_CertificateGradingSearch(strCIM_CameraDealers_TXT_CertificateGrading), strCIM_CameraDealers_TXT_CertificateGrading,strCIM_CameraDealers_TXT_CertificateGradingFilterNeeded, strCIM_CameraDealers_TXT_CertificateGrading,strCIM_CameraDealers_TXT_CertificateGradingPopup_ExtentOfPremises, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_CameraDealers_TXT_ExtentOfPremiseProtection(strCIM_CameraDealers_TXT_ExtentOfPremiseProtection),strCIM_CameraDealers_TXT_ExtentOfPremiseProtection,test);
			se.element().checkUncheckOrValidate(getCIM_CameraDealers_CHK_SecondCentralStationPremisesAlarmSystem(strCIM_CameraDealers_CHK_SecondCentralStationPremisesAlarmSystem),strCIM_CameraDealers_CHK_SecondCentralStationPremisesAlarmSystem,test);
			se.element().checkUncheckOrValidate(getCIM_CameraDealers_CHK_ThirdCentralStationPremisesAlarmSystem(strCIM_CameraDealers_CHK_ThirdCentralStationPremisesAlarmSystem),strCIM_CameraDealers_CHK_ThirdCentralStationPremisesAlarmSystem,test);
			se.element().checkUncheckOrValidate(getCIM_CameraDealers_CHK_WatchPersonWhenPremisesAreClosed(strCIM_CameraDealers_CHK_WatchPersonWhenPremisesAreClosed),strCIM_CameraDealers_CHK_WatchPersonWhenPremisesAreClosed,test);
			se.element().checkUncheckOrValidate(getCIM_CameraDealers_CHK_WatchPersonWhenPremisesAreOpen(strCIM_CameraDealers_CHK_WatchPersonWhenPremisesAreOpen),strCIM_CameraDealers_CHK_WatchPersonWhenPremisesAreOpen,test);
			se.element().checkUncheckOrValidate(getCIM_CameraDealers_CHK_WatchPersonCentralStationWatchpersonsClock(strCIM_CameraDealers_CHK_WatchPersonCentralStationWatchpersonsClock),strCIM_CameraDealers_CHK_WatchPersonCentralStationWatchpersonsClock,test);
			se.element().enterOrValidateText(getCIM_CameraDealers_TXT_FurnitureFixturesAndOfficeSuppliesLimit(strCIM_CameraDealers_TXT_FurnitureFixturesAndOfficeSuppliesLimit),strCIM_CameraDealers_TXT_FurnitureFixturesAndOfficeSuppliesLimit,test);
			se.element().enterOrValidateText(getCIM_CameraDealers_TXT_ImprovementsAndBettermentsLimit(strCIM_CameraDealers_TXT_ImprovementsAndBettermentsLimit),strCIM_CameraDealers_TXT_ImprovementsAndBettermentsLimit,test);
			se.element().enterOrValidateText(getCIM_CameraDealers_TXT_MachineryToolsAndFittingLimit(strCIM_CameraDealers_TXT_MachineryToolsAndFittingLimit),strCIM_CameraDealers_TXT_MachineryToolsAndFittingLimit,test);
			se.element().enterOrValidateText(getCIM_CameraDealers_TXT_PatternsDiesMoldModelsLimit(strCIM_CameraDealers_TXT_PatternsDiesMoldModelsLimit),strCIM_CameraDealers_TXT_PatternsDiesMoldModelsLimit,test);
			se.element().enterOrValidateText(getCIM_CameraDealers_TXT_TotalLimitEmployeesCustody(strCIM_CameraDealers_TXT_TotalLimitEmployeesCustody),strCIM_CameraDealers_TXT_TotalLimitEmployeesCustody,test);
			se.element().enterOrValidateText(getCIM_CameraDealers_TXT_TotalLimitElsewhereNotAtYourPremises(strCIM_CameraDealers_TXT_TotalLimitElsewhereNotAtYourPremises),strCIM_CameraDealers_TXT_TotalLimitElsewhereNotAtYourPremises,test);
			se.element().enterOrValidateText(getCIM_CameraDealers_TXT_PackageModFactor(strCIM_CameraDealers_TXT_PackageModFactor),strCIM_CameraDealers_TXT_PackageModFactor,test);

			se.element().Click(getNext(),test);
			
			if((strCIM_CameraDealers_BTN_Done.equalsIgnoreCase("Yes"))){
				
				se.element().Click(getDone(),test);
			}
			
	}
				catch (Exception e) {
					se.verify().verifyEquals("Failed to fill in details for CameraDealers ", true, false, true, test);
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
