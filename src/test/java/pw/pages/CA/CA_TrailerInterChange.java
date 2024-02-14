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

public class CA_TrailerInterChange extends OR_CA  {
	
	public void CATrailerInterChangePage(String strRegressionID,String transaction,String suspendSheet,ExtentTest test) throws IOException {
		try{
		
	    if(suspendSheet.equalsIgnoreCase(constants.CA_TrailerInterChange)){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
	         testTearDown(se, test);
	    }
	    
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_TrailerInterChange, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strTrailerInterchange_BTN_Add = (String) row.get("TrailerInterchange_BTN_Add");
			String strTrailerInterchange_BTN_Details = (String) row.get("TrailerInterchange_BTN_Details");
			String strTrailerInterchange_TXT_RefNumber = (String) row.get("TrailerInterchange_TXT_RefNumber");
			String strTrailerInterchange_TXT_Description = (String) row.get("TrailerInterchange_TXT_Description");
			String strTrailerInterchange_TXT_State = (String) row.get("TrailerInterchange_TXT_State");
			String strTrailerInterchange_TXT_NumberOfTrailers = (String) row.get("TrailerInterchange_TXT_NumberOfTrailers");
			String strTrailerInterchange_TXT_NumberOfDaysForCov = (String) row.get("TrailerInterchange_TXT_NumberOfDaysForCov");
			String strTrailerInterchange_TXT_Radius = (String) row.get("TrailerInterchange_TXT_Radius");
			String strTrailerInterchange_TXT_RadiusFilterNeeded = (String) row.get("TrailerInterchange_TXT_RadiusFilterNeeded");
			String strTrailerInterchange_TXT_MetroOrRegional = (String) row.get("TrailerInterchange_TXT_MetroOrRegional");
			String strTrailerInterchange_TXT_MetroOrRegionalFilterNeeded = (String) row.get("TrailerInterchange_TXT_MetroOrRegionalFilterNeeded");
			String strTrailerInterchange_TXT_PrincipalGaragingZone = (String) row.get("TrailerInterchange_TXT_PrincipalGaragingZone");
			String strTrailerInterchange_TXT_PrincipalGaragingZoneFilterNeeded = (String) row.get("TrailerInterchange_TXT_PrincipalGaragingZoneFilterNeeded");
			String strTrailerInterchange_TXT_ZoneOfTerminal = (String) row.get("TrailerInterchange_TXT_ZoneOfTerminal");
			String strTrailerInterchange_TXT_ZoneOfTerminalFilterNeeded = (String) row.get("TrailerInterchange_TXT_ZoneOfTerminalFilterNeeded");
			String strTrailerInterchange_TXT_SingleLmtLiabBIandPDForEndoFormUIIE1 = (String) row.get("TrailerInterchange_TXT_SingleLmtLiabBIandPDForEndoFormUIIE1");
			String strTrailerInterchange_TXT_LegalLiabLmtForPhyDmge = (String) row.get("TrailerInterchange_TXT_LegalLiabLmtForPhyDmge");
			String strTrailerInterchange_CHK_OTC = (String) row.get("TrailerInterchange_CHK_OTC");
			String strTrailerInterchange_TXT_Type = (String) row.get("TrailerInterchange_TXT_Type");
			String strTrailerInterchange_TXT_TypeFilterNeeded = (String) row.get("TrailerInterchange_TXT_TypeFilterNeeded");
			String strTrailerInterchange_CHK_Collision = (String) row.get("TrailerInterchange_CHK_Collision");
			String strTrailerInterchange_TXT_Deductible = (String) row.get("TrailerInterchange_TXT_Deductible");
			String strTrailerInterchange_TXT_DeductibleFilterNeeded = (String) row.get("TrailerInterchange_TXT_DeductibleFilterNeeded");
			String strTrailerInterchange_BTN_Done = (String) row.get("TrailerInterchange_BTN_Done");
			try
			{
				se.log().logTestStep("Trailer InterChange");
				test.log(LogStatus.INFO, "Trailer InterChange page","Transaction Step : "+transaction + "<br>" +"Page : CA_NonOwnedLiability");
				se.verify().verifyEquals("Trailer InterChange  of PowerWriter ", getTrailerInterchange_BTN_Label().isDisplayed(),true, true,test);
				
				if(!strTrailerInterchange_BTN_Add.equals(constants.NA)){
					se.element().Click(getTrailerInterchange_BTN_Add(strTrailerInterchange_BTN_Add),strTrailerInterchange_BTN_Add,test);
				}
				if(!strTrailerInterchange_BTN_Details.equals(constants.NA)){
					se.element().Click(getTrailerInterchange_BTN_Details(strTrailerInterchange_BTN_Details),strTrailerInterchange_BTN_Details,test);
				
				}
				se.element().enterOrValidateText(getTrailerInterchange_TXT_RefNumber(strTrailerInterchange_TXT_RefNumber),strTrailerInterchange_TXT_RefNumber,test);
				se.element().enterOrValidateText(getTrailerInterchange_TXT_Description(strTrailerInterchange_TXT_Description),strTrailerInterchange_TXT_Description,test);
				se.element().enterOrValidateText(getTrailerInterchange_TXT_State(strTrailerInterchange_TXT_State),strTrailerInterchange_TXT_State,test);
				se.element().enterOrValidateText(getTrailerInterchange_TXT_NumberOfTrailers(strTrailerInterchange_TXT_NumberOfTrailers),strTrailerInterchange_TXT_NumberOfTrailers,test);
				se.element().enterOrValidateText(getTrailerInterchange_TXT_NumberOfDaysForCov(strTrailerInterchange_TXT_NumberOfDaysForCov),strTrailerInterchange_TXT_NumberOfDaysForCov,test);
				se.element().selectPopupWithMagnifier(getTrailerInterchange_TXT_Radius(strTrailerInterchange_TXT_Radius),getTrailerInterchange_TXT_RadiusSearch(strTrailerInterchange_TXT_Radius),strTrailerInterchange_TXT_Radius,strTrailerInterchange_TXT_RadiusFilterNeeded,strTrailerInterchange_TXT_Radius, constants.NA, constants.NA,constants.NA,test);
				se.element().selectPopupWithMagnifier(getTrailerInterchange_TXT_MetroOrRegional(strTrailerInterchange_TXT_MetroOrRegional),getTrailerInterchange_TXT_MetroOrRegionalSearch(strTrailerInterchange_TXT_MetroOrRegional),strTrailerInterchange_TXT_MetroOrRegional,strTrailerInterchange_TXT_MetroOrRegionalFilterNeeded,strTrailerInterchange_TXT_MetroOrRegional, constants.NA, constants.NA,constants.NA,test);
				se.element().selectPopupWithMagnifier(getTrailerInterchange_TXT_PrincipalGaragingZone(strTrailerInterchange_TXT_PrincipalGaragingZone),getTrailerInterchange_TXT_PrincipalGaragingZoneSearch(strTrailerInterchange_TXT_PrincipalGaragingZone),strTrailerInterchange_TXT_PrincipalGaragingZone,strTrailerInterchange_TXT_PrincipalGaragingZoneFilterNeeded,strTrailerInterchange_TXT_PrincipalGaragingZone, constants.NA, constants.NA,constants.NA,test);
				se.element().selectPopupWithMagnifier(getTrailerInterchange_TXT_ZoneOfTerminal(strTrailerInterchange_TXT_ZoneOfTerminal),getTrailerInterchange_TXT_ZoneOfTerminalSearch(strTrailerInterchange_TXT_ZoneOfTerminal),strTrailerInterchange_TXT_ZoneOfTerminal,strTrailerInterchange_TXT_ZoneOfTerminalFilterNeeded,strTrailerInterchange_TXT_ZoneOfTerminal, constants.NA, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getTrailerInterchange_TXT_SingleLmtLiabBIandPDForEndoFormUIIE1(strTrailerInterchange_TXT_SingleLmtLiabBIandPDForEndoFormUIIE1),strTrailerInterchange_TXT_SingleLmtLiabBIandPDForEndoFormUIIE1,test);
				se.element().enterOrValidateText(getTrailerInterchange_TXT_LegalLiabLmtForPhyDmge(strTrailerInterchange_TXT_LegalLiabLmtForPhyDmge),strTrailerInterchange_TXT_LegalLiabLmtForPhyDmge,test);
				se.element().checkUncheckOrValidate(getTrailerInterchange_CHK_OTC(strTrailerInterchange_CHK_OTC),strTrailerInterchange_CHK_OTC,test);
				se.element().selectPopupWithMagnifier(getTrailerInterchange_TXT_Type(strTrailerInterchange_TXT_Type),getTrailerInterchange_TXT_TypeSearch(strTrailerInterchange_TXT_Type),strTrailerInterchange_TXT_Type,strTrailerInterchange_TXT_TypeFilterNeeded,strTrailerInterchange_TXT_Type, constants.NA, constants.NA,constants.NA,test);
				se.element().checkUncheckOrValidate(getTrailerInterchange_CHK_Collision(strTrailerInterchange_CHK_Collision),strTrailerInterchange_CHK_Collision,test);
				se.element().selectPopupWithMagnifier(getTrailerInterchange_TXT_Deductible(strTrailerInterchange_TXT_Deductible),getTrailerInterchange_TXT_DeductibleSearch(strTrailerInterchange_TXT_Deductible),strTrailerInterchange_TXT_Deductible,strTrailerInterchange_TXT_DeductibleFilterNeeded,strTrailerInterchange_TXT_Deductible, constants.NA, constants.NA,constants.NA,test);
				se.element().clickElement(getNext(),test);
				if(!strTrailerInterchange_BTN_Done.equals(constants.NA)){
					se.element().Click(getTrailerInterchange_BTN_Done(strTrailerInterchange_BTN_Done),strTrailerInterchange_BTN_Done,test);
				}
				
			}
			catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for Trailer InterChange page ", true, false, true, test);
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
