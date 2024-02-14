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

public class CIM_ValuablePapers extends OR_CIM{
	
	public void ValuablePaper(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_ValuablePaper")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_ValuablePaper", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_ValuablePaper_BTN_ADD = (String) row.get("CIM_ValuablePaper_BTN_ADD");
		String strCIM_ValuablePaper_BTN_Details = (String) row.get("CIM_ValuablePaper_BTN_Details");
		String strCIM_ValuablePaper_BTN_Done = (String) row.get("CIM_ValuablePaper_BTN_Done");
		String strCIM_ValuablePaper_TXT_Location = (String) row.get("CIM_ValuablePaper_TXT_Location");
		String strCIM_ValuablePaper_TXT_Building = (String) row.get("CIM_ValuablePaper_TXT_Building");
		String strCIM_ValuablePaper_TXT_BuildingDescription = (String) row.get("CIM_ValuablePaper_TXT_BuildingDescription");
		String strCIM_ValuablePaper_CHK_SeperateLimitPerReceptacleYes = (String) row.get("CIM_ValuablePaper_CHK_SeperateLimitPerReceptacleYes");
		String strCIM_ValuablePaper_CHK_SeperateLimitPerReceptacleNo = (String) row.get("CIM_ValuablePaper_CHK_SeperateLimitPerReceptacleNo");
		String strCIM_ValuablePaper_TXT_Limit = (String) row.get("CIM_ValuablePaper_TXT_Limit");
		String strCIM_ValuablePaper_TXT_CoverageBasis = (String) row.get("CIM_ValuablePaper_TXT_CoverageBasis");
		String strCIM_ValuablePaper_CHK_CoverageAppliesToLibraries = (String) row.get("CIM_ValuablePaper_CHK_CoverageAppliesToLibraries");
		String strCIM_ValuablePaper_TXT_ReceptableSymbol = (String) row.get("CIM_ValuablePaper_TXT_ReceptableSymbol");
		String strCIM_ValuablePaper_TXT_ReceptableCriteria = (String) row.get("CIM_ValuablePaper_TXT_ReceptableCriteria");
		String strCIM_ValuablePaper_TXT_ReceptacleLimit = (String) row.get("CIM_ValuablePaper_TXT_ReceptacleLimit");
		String strCIM_ValuablePaper_TXT_Description = (String) row.get("CIM_ValuablePaper_TXT_Description");
		String strCIM_ValuablePaper_TXT_PKFModFtr = (String) row.get("CIM_ValuablePaper_TXT_PKFModFtr");
		
		try{
			se.log().logTestStep("ValuablePaper");
			test.log(LogStatus.INFO, "ValuablePaper page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMValuablePaper");
			se.verify().verifyEquals("ValuablePaper page of PowerWriter ", getCIM_ValuablePaper_TXT_VerifyValuablePapersText().isDisplayed(),true, true,test);
			
			
			if((strCIM_ValuablePaper_BTN_ADD.equalsIgnoreCase("Yes"))){
				se.element().Click(getCIM_ValuablePaper_BTN_ADD(strCIM_ValuablePaper_BTN_ADD),test);
				}
				if((strCIM_ValuablePaper_BTN_Details.equalsIgnoreCase("Yes"))){
				se.element().tryClick(getCIM_ValuablePaper_BTN_Details(strCIM_ValuablePaper_BTN_Details),test);
				}
			
			se.element().selectPopupWithMagnifier(getCIM_ValuablePaper_TXT_Location(strCIM_ValuablePaper_TXT_Location), getCIM_ValuablePaper_TXT_LocationSearch(strCIM_ValuablePaper_TXT_Location), strCIM_ValuablePaper_TXT_Location, constants.NA, strCIM_ValuablePaper_TXT_Location, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_ValuablePaper_TXT_Building(strCIM_ValuablePaper_TXT_Building),strCIM_ValuablePaper_TXT_Building,test);
			se.element().enterOrValidateText(getCIM_ValuablePaper_TXT_BuildingDescription(strCIM_ValuablePaper_TXT_BuildingDescription),strCIM_ValuablePaper_TXT_BuildingDescription,test);
			se.element().checkUncheckOrValidate(getCIM_ValuablePaper_CHK_SeperateLimitPerReceptacleYes(strCIM_ValuablePaper_CHK_SeperateLimitPerReceptacleYes),strCIM_ValuablePaper_CHK_SeperateLimitPerReceptacleYes,test);
			se.element().checkUncheckOrValidate(getCIM_ValuablePaper_CHK_SeperateLimitPerReceptacleNo(strCIM_ValuablePaper_CHK_SeperateLimitPerReceptacleNo),strCIM_ValuablePaper_CHK_SeperateLimitPerReceptacleNo,test);
			se.element().enterOrValidateText(getCIM_ValuablePaper_TXT_Limit(strCIM_ValuablePaper_TXT_Limit),strCIM_ValuablePaper_TXT_Limit,test);
			se.element().enterOrValidateText(getCIM_ValuablePaper_TXT_CoverageBasis(strCIM_ValuablePaper_TXT_CoverageBasis),strCIM_ValuablePaper_TXT_CoverageBasis,test);
			se.element().checkUncheckOrValidate(getCIM_ValuablePaper_CHK_CoverageAppliesToLibraries(strCIM_ValuablePaper_CHK_CoverageAppliesToLibraries),strCIM_ValuablePaper_CHK_CoverageAppliesToLibraries,test);
			se.element().enterOrValidateText(getCIM_ValuablePaper_TXT_ReceptableSymbol(strCIM_ValuablePaper_TXT_ReceptableSymbol),strCIM_ValuablePaper_TXT_ReceptableSymbol,test);
			se.element().enterOrValidateText(getCIM_ValuablePaper_TXT_ReceptableCriteria(strCIM_ValuablePaper_TXT_ReceptableCriteria),strCIM_ValuablePaper_TXT_ReceptableCriteria,test);
			se.element().enterOrValidateText(getCIM_ValuablePaper_TXT_ReceptacleLimit(strCIM_ValuablePaper_TXT_ReceptacleLimit),strCIM_ValuablePaper_TXT_ReceptacleLimit,test);
			se.element().enterOrValidateText(getCIM_ValuablePaper_TXT_Description(strCIM_ValuablePaper_TXT_Description),strCIM_ValuablePaper_TXT_Description,test);
			se.element().enterOrValidateText(getCIM_ValuablePaper_TXT_PKFModFtr(strCIM_ValuablePaper_TXT_PKFModFtr),strCIM_ValuablePaper_TXT_PKFModFtr,test);

			se.element().Click(getNext(),test);
			
			if((strCIM_ValuablePaper_BTN_Done.equalsIgnoreCase("Yes"))){
				
				se.element().Click(getDone(),test);
			}	
		
	}
		
		catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for ValuablePapers ", true, false, true, test);
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
