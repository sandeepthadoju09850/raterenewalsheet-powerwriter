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
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CA;

public class CA_Symbols extends OR_CA {
	
	public void Symbols(String strRegressionID,String transaction, String suspendSheet,ExtentTest test) throws IOException {
	
		try{
	
		
	    if(suspendSheet.equalsIgnoreCase(constants.CovAutoSymbols)){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
	         testTearDown(se, test);
	    }
	    
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CovAutoSymbols, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			try
			{
				CA_Symbols CASymbolsPage =  TestPageFactory.initElements(se, CA_Symbols.class);
				test.log(LogStatus.INFO, "Business Auto Symbols","Transaction Step : "+ transaction + "<br>" +"Page : CoveredAutoSymbols");
				se.log().logSeStep("Selecting Business Auto Symbols ");
				se.verify().verifyEquals("CoveredAutoSymbols page of PowerWriter ", getCovAutoSymbols_TXT_Label().isDisplayed(),true, true,test);
			
				CASymbolsPage.BusinessAuto(row,test);
				CASymbolsPage.AutoDealers(row,test);
				CASymbolsPage.MotorCarrier(row,test);
				se.element().Click(getNext(),test);
			}
			catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CASymbols page ", true, false, true, test);
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
	
	
	public void BusinessAuto(Map<String, String> row,ExtentTest test) throws IOException {
		
		String strCovAutoSymbols_CHK_BusAuto_LiabilityCov_1 = (String) row.get("CovAutoSymbols_CHK_BusAuto_LiabilityCov_1");
		String strCovAutoSymbols_CHK_BusAuto_LiabilityCov_2 = (String) row.get("CovAutoSymbols_CHK_BusAuto_LiabilityCov_2");
		String strCovAutoSymbols_CHK_BusAuto_LiabilityCov_3 = (String) row.get("CovAutoSymbols_CHK_BusAuto_LiabilityCov_3");
		String strCovAutoSymbols_CHK_BusAuto_LiabilityCov_4 = (String) row.get("CovAutoSymbols_CHK_BusAuto_LiabilityCov_4");
		String strCovAutoSymbols_CHK_BusAuto_LiabilityCov_7 = (String) row.get("CovAutoSymbols_CHK_BusAuto_LiabilityCov_7");
		String strCovAutoSymbols_CHK_BusAuto_LiabilityCov_8 = (String) row.get("CovAutoSymbols_CHK_BusAuto_LiabilityCov_8");
		String strCovAutoSymbols_CHK_BusAuto_LiabilityCov_9 = (String) row.get("CovAutoSymbols_CHK_BusAuto_LiabilityCov_9");
		String strCovAutoSymbols_CHK_BusAuto_LiabilityCov_10 = (String) row.get("CovAutoSymbols_CHK_BusAuto_LiabilityCov_10");
		String strCovAutoSymbols_CHK_BusAuto_LiabilityCov_19 = (String) row.get("CovAutoSymbols_CHK_BusAuto_LiabilityCov_19");
		String strCovAutoSymbols_CHK_BusAuto_PIPCov_5 = (String) row.get("CovAutoSymbols_CHK_BusAuto_PIPCov_5");
		String strCovAutoSymbols_CHK_BusAuto_PIPCov_7 = (String) row.get("CovAutoSymbols_CHK_BusAuto_PIPCov_7");
		String strCovAutoSymbols_CHK_BusAuto_PIPCov_10 = (String) row.get("CovAutoSymbols_CHK_BusAuto_PIPCov_10");
		String strCovAutoSymbols_CHK_BusAuto_PIPCov_19 = (String) row.get("CovAutoSymbols_CHK_BusAuto_PIPCov_19");
		String strCovAutoSymbols_CHK_BusAuto_MedPayCov_2 = (String) row.get("CovAutoSymbols_CHK_BusAuto_MedPayCov_2");
		String strCovAutoSymbols_CHK_BusAuto_MedPayCov_3 = (String) row.get("CovAutoSymbols_CHK_BusAuto_MedPayCov_3");
		String strCovAutoSymbols_CHK_BusAuto_MedPayCov_4 = (String) row.get("CovAutoSymbols_CHK_BusAuto_MedPayCov_4");
		String strCovAutoSymbols_CHK_BusAuto_MedPayCov_7 = (String) row.get("CovAutoSymbols_CHK_BusAuto_MedPayCov_7");
		String strCovAutoSymbols_CHK_BusAuto_MedPayCov_8 = (String) row.get("CovAutoSymbols_CHK_BusAuto_MedPayCov_8");
		String strCovAutoSymbols_CHK_BusAuto_MedPayCov_9 = (String) row.get("CovAutoSymbols_CHK_BusAuto_MedPayCov_9");
		String strCovAutoSymbols_CHK_BusAuto_MedPayCov_10 = (String) row.get("CovAutoSymbols_CHK_BusAuto_MedPayCov_10");
		String strCovAutoSymbols_CHK_BusAuto_MedPayCov_19 = (String) row.get("CovAutoSymbols_CHK_BusAuto_MedPayCov_19");
		String strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_2 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_2");
		String strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_3 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_3");
		String strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_4 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_4");
		String strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_6 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_6");
		String strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_7 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_7");
		String strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_8 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_8");
		String strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_9 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_9");
		String strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_10 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_10");
		String strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_19 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_19");
		String strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_2 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_2");
		String strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_3 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_3");
		String strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_4 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_4");
		String strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_6 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_6");
		String strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_7 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_7");
		String strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_8 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_8");
		String strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_9 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_9");
		String strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_10 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_10");
		String strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_19 = (String) row.get("CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_19");
		String strCovAutoSymbols_CHK_BusAuto_TowingLabour_3 = (String) row.get("CovAutoSymbols_CHK_BusAuto_TowingLabour_3");
		String strCovAutoSymbols_CHK_BusAuto_TowingLabour_7 = (String) row.get("CovAutoSymbols_CHK_BusAuto_TowingLabour_7");
		String strCovAutoSymbols_CHK_BusAuto_TowingLabour_10 = (String) row.get("CovAutoSymbols_CHK_BusAuto_TowingLabour_10");
		String strCovAutoSymbols_CHK_BusAuto_TowingLabour_19 = (String) row.get("CovAutoSymbols_CHK_BusAuto_TowingLabour_19");
		String strCovAutoSymbols_CHK_BusAuto_Comprehensive_2 = (String) row.get("CovAutoSymbols_CHK_BusAuto_Comprehensive_2");
		String strCovAutoSymbols_CHK_BusAuto_Comprehensive_3 = (String) row.get("CovAutoSymbols_CHK_BusAuto_Comprehensive_3");
		String strCovAutoSymbols_CHK_BusAuto_Comprehensive_4 = (String) row.get("CovAutoSymbols_CHK_BusAuto_Comprehensive_4");
		String strCovAutoSymbols_CHK_BusAuto_Comprehensive_7 = (String) row.get("CovAutoSymbols_CHK_BusAuto_Comprehensive_7");
		String strCovAutoSymbols_CHK_BusAuto_Comprehensive_8 = (String) row.get("CovAutoSymbols_CHK_BusAuto_Comprehensive_8");
		String strCovAutoSymbols_CHK_BusAuto_Comprehensive_10 = (String) row.get("CovAutoSymbols_CHK_BusAuto_Comprehensive_10");
		String strCovAutoSymbols_CHK_BusAuto_Comprehensive_19 = (String) row.get("CovAutoSymbols_CHK_BusAuto_Comprehensive_19");
		String strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_2 = (String) row.get("CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_2");
		String strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_3 = (String) row.get("CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_3");
		String strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_4 = (String) row.get("CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_4");
		String strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_7 = (String) row.get("CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_7");
		String strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_8 = (String) row.get("CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_8");
		String strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_10 = (String) row.get("CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_10");
		String strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_19 = (String) row.get("CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_19");
		String strCovAutoSymbols_CHK_BusAuto_Collision_2 = (String) row.get("CovAutoSymbols_CHK_BusAuto_Collision_2");
		String strCovAutoSymbols_CHK_BusAuto_Collision_3 = (String) row.get("CovAutoSymbols_CHK_BusAuto_Collision_3");
		String strCovAutoSymbols_CHK_BusAuto_Collision_4 = (String) row.get("CovAutoSymbols_CHK_BusAuto_Collision_4");
		String strCovAutoSymbols_CHK_BusAuto_Collision_7 = (String) row.get("CovAutoSymbols_CHK_BusAuto_Collision_7");
		String strCovAutoSymbols_CHK_BusAuto_Collision_8 = (String) row.get("CovAutoSymbols_CHK_BusAuto_Collision_8");
		String strCovAutoSymbols_CHK_BusAuto_Collision_10 = (String) row.get("CovAutoSymbols_CHK_BusAuto_Collision_10");
		String strCovAutoSymbols_CHK_BusAuto_Collision_19 = (String) row.get("CovAutoSymbols_CHK_BusAuto_Collision_19");
		String transaction = (String) row.get("Transaction Name");
		
		try {
			
			test.log(LogStatus.INFO, "Business Auto Symbols","Transaction Step : "+ transaction + "<br>" +"Page : CoveredAutoSymbols");
			se.log().logSeStep("Selecting Business Auto Symbols ");
			se.verify().verifyEquals("CA_AdditionalCoverages of PowerWriter ", getCovAutoSymbols_TXT_Label().isDisplayed(),true, true,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_LiabilityCov_1(strCovAutoSymbols_CHK_BusAuto_LiabilityCov_1),strCovAutoSymbols_CHK_BusAuto_LiabilityCov_1,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_LiabilityCov_2(strCovAutoSymbols_CHK_BusAuto_LiabilityCov_2),strCovAutoSymbols_CHK_BusAuto_LiabilityCov_2,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_LiabilityCov_3(strCovAutoSymbols_CHK_BusAuto_LiabilityCov_3),strCovAutoSymbols_CHK_BusAuto_LiabilityCov_3,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_LiabilityCov_4(strCovAutoSymbols_CHK_BusAuto_LiabilityCov_4),strCovAutoSymbols_CHK_BusAuto_LiabilityCov_4,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_LiabilityCov_7(strCovAutoSymbols_CHK_BusAuto_LiabilityCov_7),strCovAutoSymbols_CHK_BusAuto_LiabilityCov_7,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_LiabilityCov_8(strCovAutoSymbols_CHK_BusAuto_LiabilityCov_8),strCovAutoSymbols_CHK_BusAuto_LiabilityCov_8,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_LiabilityCov_9(strCovAutoSymbols_CHK_BusAuto_LiabilityCov_9),strCovAutoSymbols_CHK_BusAuto_LiabilityCov_9,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_LiabilityCov_10(strCovAutoSymbols_CHK_BusAuto_LiabilityCov_10),strCovAutoSymbols_CHK_BusAuto_LiabilityCov_10,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_LiabilityCov_19(strCovAutoSymbols_CHK_BusAuto_LiabilityCov_19),strCovAutoSymbols_CHK_BusAuto_LiabilityCov_19,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_PIPCov_5(strCovAutoSymbols_CHK_BusAuto_PIPCov_5),strCovAutoSymbols_CHK_BusAuto_PIPCov_5,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_PIPCov_7(strCovAutoSymbols_CHK_BusAuto_PIPCov_7),strCovAutoSymbols_CHK_BusAuto_PIPCov_7,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_PIPCov_10(strCovAutoSymbols_CHK_BusAuto_PIPCov_10),strCovAutoSymbols_CHK_BusAuto_PIPCov_10,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_PIPCov_19(strCovAutoSymbols_CHK_BusAuto_PIPCov_19),strCovAutoSymbols_CHK_BusAuto_PIPCov_19,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_MedPayCov_2(strCovAutoSymbols_CHK_BusAuto_MedPayCov_2),strCovAutoSymbols_CHK_BusAuto_MedPayCov_2,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_MedPayCov_3(strCovAutoSymbols_CHK_BusAuto_MedPayCov_3),strCovAutoSymbols_CHK_BusAuto_MedPayCov_3,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_MedPayCov_4(strCovAutoSymbols_CHK_BusAuto_MedPayCov_4),strCovAutoSymbols_CHK_BusAuto_MedPayCov_4,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_MedPayCov_7(strCovAutoSymbols_CHK_BusAuto_MedPayCov_7),strCovAutoSymbols_CHK_BusAuto_MedPayCov_7,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_MedPayCov_8(strCovAutoSymbols_CHK_BusAuto_MedPayCov_8),strCovAutoSymbols_CHK_BusAuto_MedPayCov_8,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_MedPayCov_9(strCovAutoSymbols_CHK_BusAuto_MedPayCov_9),strCovAutoSymbols_CHK_BusAuto_MedPayCov_9,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_MedPayCov_10(strCovAutoSymbols_CHK_BusAuto_MedPayCov_10),strCovAutoSymbols_CHK_BusAuto_MedPayCov_10,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_MedPayCov_19(strCovAutoSymbols_CHK_BusAuto_MedPayCov_19),strCovAutoSymbols_CHK_BusAuto_MedPayCov_19,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_2(strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_2),strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_2,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_3(strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_3),strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_3,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_4(strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_4),strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_4,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_6(strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_6),strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_6,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_7(strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_7),strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_7,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_8(strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_8),strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_8,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_9(strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_9),strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_9,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_10(strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_10),strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_10,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_19(strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_19),strCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_19,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_2(strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_2),strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_2,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_3(strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_3),strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_3,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_4(strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_4),strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_4,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_6(strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_6),strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_6,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_7(strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_7),strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_7,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_8(strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_8),strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_8,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_9(strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_9),strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_9,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_10(strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_10),strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_10,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_19(strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_19),strCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_19,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_TowingLabour_3(strCovAutoSymbols_CHK_BusAuto_TowingLabour_3),strCovAutoSymbols_CHK_BusAuto_TowingLabour_3,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_TowingLabour_7(strCovAutoSymbols_CHK_BusAuto_TowingLabour_7),strCovAutoSymbols_CHK_BusAuto_TowingLabour_7,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_TowingLabour_10(strCovAutoSymbols_CHK_BusAuto_TowingLabour_10),strCovAutoSymbols_CHK_BusAuto_TowingLabour_10,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_TowingLabour_19(strCovAutoSymbols_CHK_BusAuto_TowingLabour_19),strCovAutoSymbols_CHK_BusAuto_TowingLabour_19,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_Comprehensive_2(strCovAutoSymbols_CHK_BusAuto_Comprehensive_2),strCovAutoSymbols_CHK_BusAuto_Comprehensive_2,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_Comprehensive_3(strCovAutoSymbols_CHK_BusAuto_Comprehensive_3),strCovAutoSymbols_CHK_BusAuto_Comprehensive_3,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_Comprehensive_4(strCovAutoSymbols_CHK_BusAuto_Comprehensive_4),strCovAutoSymbols_CHK_BusAuto_Comprehensive_4,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_Comprehensive_7(strCovAutoSymbols_CHK_BusAuto_Comprehensive_7),strCovAutoSymbols_CHK_BusAuto_Comprehensive_7,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_Comprehensive_8(strCovAutoSymbols_CHK_BusAuto_Comprehensive_8),strCovAutoSymbols_CHK_BusAuto_Comprehensive_8,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_Comprehensive_10(strCovAutoSymbols_CHK_BusAuto_Comprehensive_10),strCovAutoSymbols_CHK_BusAuto_Comprehensive_10,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_Comprehensive_19(strCovAutoSymbols_CHK_BusAuto_Comprehensive_19),strCovAutoSymbols_CHK_BusAuto_Comprehensive_19,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_2(strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_2),strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_2,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_3(strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_3),strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_3,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_4(strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_4),strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_4,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_7(strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_7),strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_7,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_8(strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_8),strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_8,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_10(strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_10),strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_10,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_19(strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_19),strCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_19,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_Collision_2(strCovAutoSymbols_CHK_BusAuto_Collision_2),strCovAutoSymbols_CHK_BusAuto_Collision_2,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_Collision_3(strCovAutoSymbols_CHK_BusAuto_Collision_3),strCovAutoSymbols_CHK_BusAuto_Collision_3,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_Collision_4(strCovAutoSymbols_CHK_BusAuto_Collision_4),strCovAutoSymbols_CHK_BusAuto_Collision_4,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_Collision_7(strCovAutoSymbols_CHK_BusAuto_Collision_7),strCovAutoSymbols_CHK_BusAuto_Collision_7,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_Collision_8(strCovAutoSymbols_CHK_BusAuto_Collision_8),strCovAutoSymbols_CHK_BusAuto_Collision_8,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_Collision_10(strCovAutoSymbols_CHK_BusAuto_Collision_10),strCovAutoSymbols_CHK_BusAuto_Collision_10,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_BusAuto_Collision_19(strCovAutoSymbols_CHK_BusAuto_Collision_19),strCovAutoSymbols_CHK_BusAuto_Collision_19,test);
			
			
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for Business Auto Symbols", true, false, true, test);
		}
	}
	
	public void AutoDealers(Map<String, String> row,ExtentTest test) throws IOException {

		String strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_21 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_LiabilityCov_21");
		String strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_22 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_LiabilityCov_22");
		String strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_23 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_LiabilityCov_23");
		String strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_24 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_LiabilityCov_24");
		String strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_27 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_LiabilityCov_27");
		String strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_28 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_LiabilityCov_28");
		String strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_29 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_LiabilityCov_29");
		String strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_32 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_LiabilityCov_32");
		String strCovAutoSymbols_CHK_AutoDealers_PIPCov_25 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PIPCov_25");
		String strCovAutoSymbols_CHK_AutoDealers_PIPCov_27 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PIPCov_27");
		String strCovAutoSymbols_CHK_AutoDealers_PIPCov_32 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PIPCov_32");
		String strCovAutoSymbols_CHK_AutoDealers_MedPayCov_21 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_MedPayCov_21");
		String strCovAutoSymbols_CHK_AutoDealers_MedPayCov_22 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_MedPayCov_22");
		String strCovAutoSymbols_CHK_AutoDealers_MedPayCov_23 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_MedPayCov_23");
		String strCovAutoSymbols_CHK_AutoDealers_MedPayCov_24 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_MedPayCov_24");
		String strCovAutoSymbols_CHK_AutoDealers_MedPayCov_27 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_MedPayCov_27");
		String strCovAutoSymbols_CHK_AutoDealers_MedPayCov_28 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_MedPayCov_28");
		String strCovAutoSymbols_CHK_AutoDealers_MedPayCov_29 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_MedPayCov_29");
		String strCovAutoSymbols_CHK_AutoDealers_MedPayCov_32 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_MedPayCov_32");
		String strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_22 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_22");
		String strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_23 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_23");
		String strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_24 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_24");
		String strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_26 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_26");
		String strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_27 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_27");
		String strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_32 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_32");
		String strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_22 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_22");
		String strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_23 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_23");
		String strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_24 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_24");
		String strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_26 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_26");
		String strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_27 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_27");
		String strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_32 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_32");
		String strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_22 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_22");
		String strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_23 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_23");
		String strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_24 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_24");
		String strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_27 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_27");
		String strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_28 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_28");
		String strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_31 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_31");
		String strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_32 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_32");
		String strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_22 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PhyDamColl_22");
		String strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_23 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PhyDamColl_23");
		String strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_24 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PhyDamColl_24");
		String strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_27 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PhyDamColl_27");
		String strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_28 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PhyDamColl_28");
		String strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_31 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PhyDamColl_31");
		String strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_32 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_PhyDamColl_32");
		String strCovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_30 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_30");
		String strCovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_32 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_32");
		String strCovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_30 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_30");
		String strCovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_32 = (String) row.get("CovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_32");
		String transaction = (String) row.get("Transaction Name");
		
		try {
			
			test.log(LogStatus.INFO, "Auto Dealers Symbols","Transaction Step : "+ transaction + "<br>" +"Page : CoveredAutoSymbols");
			se.log().logSeStep("Selecting Auto Dealers Symbols ");
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_21(strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_21),strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_21,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_22(strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_22),strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_22,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_23(strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_23),strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_23,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_24(strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_24),strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_24,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_27(strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_27),strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_27,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_28(strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_28),strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_28,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_29(strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_29),strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_29,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_32(strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_32),strCovAutoSymbols_CHK_AutoDealers_LiabilityCov_32,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PIPCov_25(strCovAutoSymbols_CHK_AutoDealers_PIPCov_25),strCovAutoSymbols_CHK_AutoDealers_PIPCov_25,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PIPCov_27(strCovAutoSymbols_CHK_AutoDealers_PIPCov_27),strCovAutoSymbols_CHK_AutoDealers_PIPCov_27,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PIPCov_32(strCovAutoSymbols_CHK_AutoDealers_PIPCov_32),strCovAutoSymbols_CHK_AutoDealers_PIPCov_32,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_MedPayCov_21(strCovAutoSymbols_CHK_AutoDealers_MedPayCov_21),strCovAutoSymbols_CHK_AutoDealers_MedPayCov_21,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_MedPayCov_22(strCovAutoSymbols_CHK_AutoDealers_MedPayCov_22),strCovAutoSymbols_CHK_AutoDealers_MedPayCov_22,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_MedPayCov_23(strCovAutoSymbols_CHK_AutoDealers_MedPayCov_23),strCovAutoSymbols_CHK_AutoDealers_MedPayCov_23,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_MedPayCov_24(strCovAutoSymbols_CHK_AutoDealers_MedPayCov_24),strCovAutoSymbols_CHK_AutoDealers_MedPayCov_24,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_MedPayCov_27(strCovAutoSymbols_CHK_AutoDealers_MedPayCov_27),strCovAutoSymbols_CHK_AutoDealers_MedPayCov_27,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_MedPayCov_28(strCovAutoSymbols_CHK_AutoDealers_MedPayCov_28),strCovAutoSymbols_CHK_AutoDealers_MedPayCov_28,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_MedPayCov_29(strCovAutoSymbols_CHK_AutoDealers_MedPayCov_29),strCovAutoSymbols_CHK_AutoDealers_MedPayCov_29,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_MedPayCov_32(strCovAutoSymbols_CHK_AutoDealers_MedPayCov_32),strCovAutoSymbols_CHK_AutoDealers_MedPayCov_32,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_22(strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_22),strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_22,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_23(strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_23),strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_23,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_24(strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_24),strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_24,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_26(strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_26),strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_26,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_27(strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_27),strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_27,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_32(strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_32),strCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_32,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_22(strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_22),strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_22,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_23(strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_23),strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_23,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_24(strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_24),strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_24,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_26(strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_26),strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_26,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_27(strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_27),strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_27,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_32(strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_32),strCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_32,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_22(strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_22),strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_22,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_23(strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_23),strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_23,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_24(strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_24),strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_24,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_27(strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_27),strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_27,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_28(strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_28),strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_28,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_31(strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_31),strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_31,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_32(strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_32),strCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_32,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PhyDamColl_22(strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_22),strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_22,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PhyDamColl_23(strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_23),strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_23,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PhyDamColl_24(strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_24),strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_24,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PhyDamColl_27(strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_27),strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_27,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PhyDamColl_28(strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_28),strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_28,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PhyDamColl_31(strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_31),strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_31,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_PhyDamColl_32(strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_32),strCovAutoSymbols_CHK_AutoDealers_PhyDamColl_32,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_30(strCovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_30),strCovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_30,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_32(strCovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_32),strCovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_32,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_30(strCovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_30),strCovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_30,test);
			se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_32(strCovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_32),strCovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_32,test);
			
			
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for Auto dealers symbol", true, false, true, test);
		}
	}

	public void MotorCarrier(Map<String, String> row,ExtentTest test) throws IOException {
	String strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_61 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_LiabilityCov_61");
	String strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_62 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_LiabilityCov_62");
	String strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_63 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_LiabilityCov_63");
	String strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_64 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_LiabilityCov_64");
	String strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_67 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_LiabilityCov_67");
	String strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_68 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_LiabilityCov_68");
	String strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_71 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_LiabilityCov_71");
	String strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_72 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_LiabilityCov_72");
	String strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_73 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_LiabilityCov_73");
	String strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_79 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_LiabilityCov_79");
	String strCovAutoSymbols_CHK_MotCarrier_PIPCov_65 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PIPCov_65");
	String strCovAutoSymbols_CHK_MotCarrier_PIPCov_67 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PIPCov_67");
	String strCovAutoSymbols_CHK_MotCarrier_PIPCov_72 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PIPCov_72");
	String strCovAutoSymbols_CHK_MotCarrier_PIPCov_73 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PIPCov_73");
	String strCovAutoSymbols_CHK_MotCarrier_PIPCov_79 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PIPCov_79");
	String strCovAutoSymbols_CHK_MotCarrier_MedPayCov_62 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_MedPayCov_62");
	String strCovAutoSymbols_CHK_MotCarrier_MedPayCov_63 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_MedPayCov_63");
	String strCovAutoSymbols_CHK_MotCarrier_MedPayCov_64 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_MedPayCov_64");
	String strCovAutoSymbols_CHK_MotCarrier_MedPayCov_67 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_MedPayCov_67");
	String strCovAutoSymbols_CHK_MotCarrier_MedPayCov_71 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_MedPayCov_71");
	String strCovAutoSymbols_CHK_MotCarrier_MedPayCov_72 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_MedPayCov_72");
	String strCovAutoSymbols_CHK_MotCarrier_MedPayCov_73 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_MedPayCov_73");
	String strCovAutoSymbols_CHK_MotCarrier_MedPayCov_79 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_MedPayCov_79");
	String strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_62 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_62");
	String strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_63 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_63");
	String strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_64 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_64");
	String strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_66 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_66");
	String strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_67 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_67");
	String strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_72 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_72");
	String strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_73 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_73");
	String strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_79 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_79");
	String strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_62 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_62");
	String strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_63 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_63");
	String strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_64 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_64");
	String strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_66 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_66");
	String strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_67 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_67");
	String strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_72 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_72");
	String strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_73 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_73");
	String strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_79 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_79");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_62 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_62");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_63 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_63");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_64 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_64");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_67 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_67");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_68 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_68");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_72 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_72");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_73 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_73");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_79 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_79");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_62 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_62");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_63 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_63");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_64 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_64");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_67 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_67");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_68 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_68");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_72 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_72");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_73 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_73");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_79 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_79");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_62 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamColl_62");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_63 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamColl_63");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_64 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamColl_64");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_67 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamColl_67");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_68 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamColl_68");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_72 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamColl_72");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_73 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamColl_73");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_79 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamColl_79");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_63 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_63");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_67 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_67");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_72 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_72");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_73 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_73");
	String strCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_79 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_79");
	String strCovAutoSymbols_CHK_MotCarrier_TraiInterComp_69 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_TraiInterComp_69");
	String strCovAutoSymbols_CHK_MotCarrier_TraiInterComp_70 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_TraiInterComp_70");
	String strCovAutoSymbols_CHK_MotCarrier_TraiInterComp_72 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_TraiInterComp_72");
	String strCovAutoSymbols_CHK_MotCarrier_TraiInterComp_73 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_TraiInterComp_73");
	String strCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_69 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_69");
	String strCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_70 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_70");
	String strCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_72 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_72");
	String strCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_73 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_73");
	String strCovAutoSymbols_CHK_MotCarrier_TraiInterColl_69 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_TraiInterColl_69");
	String strCovAutoSymbols_CHK_MotCarrier_TraiInterColl_70 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_TraiInterColl_70");
	String strCovAutoSymbols_CHK_MotCarrier_TraiInterColl_72 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_TraiInterColl_72");
	String strCovAutoSymbols_CHK_MotCarrier_TraiInterColl_73 = (String) row.get("CovAutoSymbols_CHK_MotCarrier_TraiInterColl_73");
	String transaction = (String) row.get("Transaction Name");
	
	try {
		
		test.log(LogStatus.INFO, "Motor Carrier Symbols","Transaction Step : "+ transaction + "<br>" +"Page : CoveredAutoSymbols");
		se.log().logSeStep("Selecting Motor Carrier Symbols ");
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_61(strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_61),strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_61,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_62(strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_62),strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_62,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_63(strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_63),strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_63,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_64(strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_64),strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_64,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_67(strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_67),strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_67,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_68(strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_68),strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_68,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_71(strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_71),strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_71,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_72(strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_72),strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_72,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_73(strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_73),strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_73,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_79(strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_79),strCovAutoSymbols_CHK_MotCarrier_LiabilityCov_79,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PIPCov_65(strCovAutoSymbols_CHK_MotCarrier_PIPCov_65),strCovAutoSymbols_CHK_MotCarrier_PIPCov_65,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PIPCov_67(strCovAutoSymbols_CHK_MotCarrier_PIPCov_67),strCovAutoSymbols_CHK_MotCarrier_PIPCov_67,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PIPCov_72(strCovAutoSymbols_CHK_MotCarrier_PIPCov_72),strCovAutoSymbols_CHK_MotCarrier_PIPCov_72,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PIPCov_73(strCovAutoSymbols_CHK_MotCarrier_PIPCov_73),strCovAutoSymbols_CHK_MotCarrier_PIPCov_73,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PIPCov_79(strCovAutoSymbols_CHK_MotCarrier_PIPCov_79),strCovAutoSymbols_CHK_MotCarrier_PIPCov_79,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_MedPayCov_62(strCovAutoSymbols_CHK_MotCarrier_MedPayCov_62),strCovAutoSymbols_CHK_MotCarrier_MedPayCov_62,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_MedPayCov_63(strCovAutoSymbols_CHK_MotCarrier_MedPayCov_63),strCovAutoSymbols_CHK_MotCarrier_MedPayCov_63,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_MedPayCov_64(strCovAutoSymbols_CHK_MotCarrier_MedPayCov_64),strCovAutoSymbols_CHK_MotCarrier_MedPayCov_64,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_MedPayCov_67(strCovAutoSymbols_CHK_MotCarrier_MedPayCov_67),strCovAutoSymbols_CHK_MotCarrier_MedPayCov_67,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_MedPayCov_71(strCovAutoSymbols_CHK_MotCarrier_MedPayCov_71),strCovAutoSymbols_CHK_MotCarrier_MedPayCov_71,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_MedPayCov_72(strCovAutoSymbols_CHK_MotCarrier_MedPayCov_72),strCovAutoSymbols_CHK_MotCarrier_MedPayCov_72,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_MedPayCov_73(strCovAutoSymbols_CHK_MotCarrier_MedPayCov_73),strCovAutoSymbols_CHK_MotCarrier_MedPayCov_73,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_MedPayCov_79(strCovAutoSymbols_CHK_MotCarrier_MedPayCov_79),strCovAutoSymbols_CHK_MotCarrier_MedPayCov_79,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_62(strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_62),strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_62,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_63(strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_63),strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_63,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_64(strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_64),strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_64,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_66(strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_66),strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_66,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_67(strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_67),strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_67,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_72(strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_72),strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_72,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_73(strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_73),strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_73,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_79(strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_79),strCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_79,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_62(strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_62),strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_62,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_63(strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_63),strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_63,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_64(strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_64),strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_64,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_66(strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_66),strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_66,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_67(strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_67),strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_67,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_72(strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_72),strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_72,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_73(strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_73),strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_73,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_79(strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_79),strCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_79,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_62(strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_62),strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_62,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_63(strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_63),strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_63,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_64(strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_64),strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_64,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_67(strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_67),strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_67,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_68(strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_68),strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_68,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_72(strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_72),strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_72,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_73(strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_73),strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_73,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_79(strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_79),strCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_79,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_62(strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_62),strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_62,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_63(strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_63),strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_63,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_64(strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_64),strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_64,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_67(strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_67),strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_67,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_68(strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_68),strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_68,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_72(strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_72),strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_72,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_73(strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_73),strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_73,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_79(strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_79),strCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_79,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_62(strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_62),strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_62,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_63(strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_63),strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_63,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_64(strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_64),strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_64,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_67(strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_67),strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_67,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_68(strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_68),strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_68,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_72(strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_72),strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_72,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_73(strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_73),strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_73,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_79(strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_79),strCovAutoSymbols_CHK_MotCarrier_PhyDamColl_79,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_63(strCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_63),strCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_63,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_67(strCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_67),strCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_67,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_72(strCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_72),strCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_72,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_73(strCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_73),strCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_73,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_79(strCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_79),strCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_79,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_TraiInterComp_69(strCovAutoSymbols_CHK_MotCarrier_TraiInterComp_69),strCovAutoSymbols_CHK_MotCarrier_TraiInterComp_69,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_TraiInterComp_70(strCovAutoSymbols_CHK_MotCarrier_TraiInterComp_70),strCovAutoSymbols_CHK_MotCarrier_TraiInterComp_70,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_TraiInterComp_72(strCovAutoSymbols_CHK_MotCarrier_TraiInterComp_72),strCovAutoSymbols_CHK_MotCarrier_TraiInterComp_72,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_TraiInterComp_73(strCovAutoSymbols_CHK_MotCarrier_TraiInterComp_73),strCovAutoSymbols_CHK_MotCarrier_TraiInterComp_73,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_69(strCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_69),strCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_69,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_70(strCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_70),strCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_70,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_72(strCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_72),strCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_72,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_73(strCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_73),strCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_73,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_TraiInterColl_69(strCovAutoSymbols_CHK_MotCarrier_TraiInterColl_69),strCovAutoSymbols_CHK_MotCarrier_TraiInterColl_69,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_TraiInterColl_70(strCovAutoSymbols_CHK_MotCarrier_TraiInterColl_70),strCovAutoSymbols_CHK_MotCarrier_TraiInterColl_70,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_TraiInterColl_72(strCovAutoSymbols_CHK_MotCarrier_TraiInterColl_72),strCovAutoSymbols_CHK_MotCarrier_TraiInterColl_72,test);
		se.element().checkUncheckOrValidate(getCovAutoSymbols_CHK_MotCarrier_TraiInterColl_73(strCovAutoSymbols_CHK_MotCarrier_TraiInterColl_73),strCovAutoSymbols_CHK_MotCarrier_TraiInterColl_73,test);

	} catch (Exception e) {
		se.verify().verifyEquals("Failed to fill in details for Motor Carrier Symbols", true, false, true, test);
	}
}
	
}

