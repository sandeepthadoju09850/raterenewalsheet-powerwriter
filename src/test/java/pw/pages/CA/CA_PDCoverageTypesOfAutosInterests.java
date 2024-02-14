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
public class CA_PDCoverageTypesOfAutosInterests extends OR_CA{
	
	public  void PDCoverageTypesOfAutosInterests(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
	
			 if(suspendSheet.equalsIgnoreCase(constants.CA_PDCoverageTypesOfAutosInterests)){
			    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			         testTearDown(se, test);
			    }
		
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_PDCoverageTypesOfAutosInterests, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strPDCoverageTypesOfAutosInterestsCovered_CHK_LimitOfInsForLossAtUnscheduledLoc = (String) row.get("PDCoverageTypesOfAutosInterestsCovered_CHK_LimitOfInsForLossAtUnscheduledLoc");
			String strPDCoverageTypesOfAutosInterestsCovered_TXT_AdditionalLocationsWhereYouStoreCoveredAutos = (String) row.get("PDCoverageTypesOfAutosInterestsCovered_TXT_AdditionalLocationsWhereYouStoreCoveredAutos");
			String strPDCoverageTypesOfAutosInterestsCovered_TXT_InTransit = (String) row.get("PDCoverageTypesOfAutosInterestsCovered_TXT_InTransit");
			String strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_NewAutos = (String) row.get("PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_NewAutos");
			String strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_UsedAutosDemonstrators = (String) row.get("PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_UsedAutosDemonstrators");
			String strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInCoveredAutosYouOwn = (String) row.get("PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInCoveredAutosYouOwn");
			String strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInFinanceAutos = (String) row.get("PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInFinanceAutos");
			String strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestAndCreditorsNamed = (String) row.get("PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestAndCreditorsNamed");
			String strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_AllInterestByYouOrAnyCreditor = (String) row.get("PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_AllInterestByYouOrAnyCreditor");
			String strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_NewAutos = (String) row.get("PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_NewAutos");
			String strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_UsedAutosDemonstrators = (String) row.get("PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_UsedAutosDemonstrators");
			String strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInCoveredAutosYouOwn = (String) row.get("PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInCoveredAutosYouOwn");
			String strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInFinanceAutos = (String) row.get("PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInFinanceAutos");
			String strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestAndCreditorsNamed = (String) row.get("PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestAndCreditorsNamed");
			String strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_AllInterestByYouOrAnyCreditor = (String) row.get("PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_AllInterestByYouOrAnyCreditor");

		try{
			se.log().logTestStep("CA_PDCoverageTypesOfAutosInterestsCovered");
			test.log(LogStatus.INFO, "CA_PDCoverageTypesOfAutosInterestsCovered page","Transaction Step : "+transaction + "<br>" +"Page : CA_PDCoverageTypesOfAutosInterestsCovered");
			se.verify().verifyEquals("CA_PDCoverageTypesOfAutosInterestsCovered Page of PowerWriter ", getPDCoverageTypesOfAutosInterestsCovered().isDisplayed(),true, true,test);
			se.element().checkUncheckOrValidate(getPDCoverageTypesOfAutosInterestsCovered_CHK_LimitOfInsForLossAtUnscheduledLoc(strPDCoverageTypesOfAutosInterestsCovered_CHK_LimitOfInsForLossAtUnscheduledLoc),strPDCoverageTypesOfAutosInterestsCovered_CHK_LimitOfInsForLossAtUnscheduledLoc,test);
			se.element().enterOrValidateText(getPDCoverageTypesOfAutosInterestsCovered_TXT_AdditionalLocationsWhereYouStoreCoveredAutos(strPDCoverageTypesOfAutosInterestsCovered_TXT_AdditionalLocationsWhereYouStoreCoveredAutos),strPDCoverageTypesOfAutosInterestsCovered_TXT_AdditionalLocationsWhereYouStoreCoveredAutos,test);
			se.element().enterOrValidateText(getPDCoverageTypesOfAutosInterestsCovered_TXT_InTransit(strPDCoverageTypesOfAutosInterestsCovered_TXT_InTransit),strPDCoverageTypesOfAutosInterestsCovered_TXT_InTransit,test);
			se.element().checkUncheckOrValidate(getPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_NewAutos(strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_NewAutos),strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_NewAutos,test);
			se.element().checkUncheckOrValidate(getPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_UsedAutosDemonstrators(strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_UsedAutosDemonstrators),strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_UsedAutosDemonstrators,test);
			se.element().checkUncheckOrValidate(getPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInCoveredAutosYouOwn(strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInCoveredAutosYouOwn),strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInCoveredAutosYouOwn,test);
			se.element().checkUncheckOrValidate(getPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInFinanceAutos(strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInFinanceAutos),strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInFinanceAutos,test);
			se.element().checkUncheckOrValidate(getPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestAndCreditorsNamed(strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestAndCreditorsNamed),strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestAndCreditorsNamed,test);
			se.element().checkUncheckOrValidate(getPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_AllInterestByYouOrAnyCreditor(strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_AllInterestByYouOrAnyCreditor),strPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_AllInterestByYouOrAnyCreditor,test);
			se.element().checkUncheckOrValidate(getPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_NewAutos(strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_NewAutos),strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_NewAutos,test);
			se.element().checkUncheckOrValidate(getPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_UsedAutosDemonstrators(strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_UsedAutosDemonstrators),strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_UsedAutosDemonstrators,test);
			se.element().checkUncheckOrValidate(getPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInCoveredAutosYouOwn(strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInCoveredAutosYouOwn),strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInCoveredAutosYouOwn,test);
			se.element().checkUncheckOrValidate(getPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInFinanceAutos(strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInFinanceAutos),strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInFinanceAutos,test);
			se.element().checkUncheckOrValidate(getPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestAndCreditorsNamed(strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestAndCreditorsNamed),strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestAndCreditorsNamed,test);
			se.element().checkUncheckOrValidate(getPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_AllInterestByYouOrAnyCreditor(strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_AllInterestByYouOrAnyCreditor),strPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_AllInterestByYouOrAnyCreditor,test);
			
			}catch(Exception e){							
					se.verify().verifyEquals("Failed to fill in details for CA_PDCoverageTypesOfAutosInterestsCovered ", true, false, true, test);			
				
			}
				iteration++;
				
			}
		se.element().clickElement(getNext());

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