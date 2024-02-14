package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_CIM;

public class CIM_ComputerLocationAndLimits extends OR_CIM{
	
	public void ComputerLocationAndLimits(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_ComputerLocationandLimits")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_ComputerLocationandLimits", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_ComputerLocationandLimits_BTN_ADD = (String) row.get("CIM_ComputerLocationandLimits_BTN_ADD");
		String strCIM_ComputerLocationandLimits_BTN_Details = (String) row.get("CIM_ComputerLocationandLimits_BTN_Details");
		String strCIM_ComputerLocationandLimits_BTN_Done = (String) row.get("CIM_ComputerLocationandLimits_BTN_Done");
		String strCIM_ComputerLocationandLimits_TXT_LocationNo = (String) row.get("CIM_ComputerLocationandLimits_TXT_LocationNo");
		String strCIM_ComputerLocationandLimits_TXT_Name = (String) row.get("CIM_ComputerLocationandLimits_TXT_Name");
		String strCIM_ComputerLocationandLimits_TXT_Description = (String) row.get("CIM_ComputerLocationandLimits_TXT_Description");
		String strCIM_ComputerLocationandLimits_TXT_Street = (String) row.get("CIM_ComputerLocationandLimits_TXT_Street");
		String strCIM_ComputerLocationandLimits_TXT_SteUnit = (String) row.get("CIM_ComputerLocationandLimits_TXT_Ste/Unit");
		String strCIM_ComputerLocationandLimits_TXT_City = (String) row.get("CIM_ComputerLocationandLimits_TXT_City");
		String strCIM_ComputerLocationandLimits_TXT_StateDescription = (String) row.get("CIM_ComputerLocationandLimits_TXT_StateDescription");
		String strCIM_ComputerLocationandLimits_TXT_ZipCode = (String) row.get("CIM_ComputerLocationandLimits_TXT_ZipCode");
		String strCIM_ComputerLocationandLimits_TXT_HardwareLimit = (String) row.get("CIM_ComputerLocationandLimits_TXT_HardwareLimit");
		String strCIM_ComputerLocationandLimits_TXT_ProgramAndApplicationsAndMediaLimit = (String) row.get("CIM_ComputerLocationandLimits_TXT_ProgramAndApplicationsAndMediaLimit");
		String strCIM_ComputerLocationandLimits_TXT_IncomeCoverageLimit = (String) row.get("CIM_ComputerLocationandLimits_TXT_IncomeCoverageLimit");
		
		
		try{
			se.log().logTestStep("ComputerLocationAndLimits");
			test.log(LogStatus.INFO, "ComputerLocationAndLimits page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMComputerLocationAndLimits");
			se.verify().verifyEquals("ComputerLocationAndLimits page of PowerWriter ", getCIM_ComputerLocationandLimits_TXT_VerifyComputerLocationandLimitsText().isDisplayed(),true, true,test);
			
			if((strCIM_ComputerLocationandLimits_BTN_ADD.equalsIgnoreCase("Yes"))){
				se.element().Click(getCIM_ComputerLocationandLimits_BTN_ADD(strCIM_ComputerLocationandLimits_BTN_ADD),test);
				}
				if((strCIM_ComputerLocationandLimits_BTN_Details.equalsIgnoreCase("Yes"))){
				se.element().tryClick(getCIM_ComputerLocationandLimits_BTN_Details(strCIM_ComputerLocationandLimits_BTN_Details),test);
				}
			
			se.element().enterOrValidateText(getCIM_ComputerLocationandLimits_TXT_LocationNo(strCIM_ComputerLocationandLimits_TXT_LocationNo),strCIM_ComputerLocationandLimits_TXT_LocationNo,test);
			se.element().enterOrValidateText(getCIM_ComputerLocationandLimits_TXT_Name(strCIM_ComputerLocationandLimits_TXT_Name),strCIM_ComputerLocationandLimits_TXT_Name,test);
			se.element().enterOrValidateText(getCIM_ComputerLocationandLimits_TXT_Description(strCIM_ComputerLocationandLimits_TXT_Description),strCIM_ComputerLocationandLimits_TXT_Description,test);
			se.element().enterOrValidateText(getCIM_ComputerLocationandLimits_TXT_Street(strCIM_ComputerLocationandLimits_TXT_Street),strCIM_ComputerLocationandLimits_TXT_Street,test);
			se.element().enterOrValidateText(getCIM_ComputerLocationandLimits_TXT_SteUnit(strCIM_ComputerLocationandLimits_TXT_SteUnit),strCIM_ComputerLocationandLimits_TXT_SteUnit,test);
			se.element().enterOrValidateText(getCIM_ComputerLocationandLimits_TXT_City(strCIM_ComputerLocationandLimits_TXT_City),strCIM_ComputerLocationandLimits_TXT_City,test);
			se.element().enterOrValidateText(getCIM_ComputerLocationandLimits_TXT_StateDescription(strCIM_ComputerLocationandLimits_TXT_StateDescription),strCIM_ComputerLocationandLimits_TXT_StateDescription,test);
			se.element().enterOrValidateText(getCIM_ComputerLocationandLimits_TXT_ZipCode(strCIM_ComputerLocationandLimits_TXT_ZipCode),strCIM_ComputerLocationandLimits_TXT_ZipCode,test);
			se.element().enterOrValidateText(getCIM_ComputerLocationandLimits_TXT_HardwareLimit(strCIM_ComputerLocationandLimits_TXT_HardwareLimit),strCIM_ComputerLocationandLimits_TXT_HardwareLimit,test);
			se.element().enterOrValidateText(getCIM_ComputerLocationandLimits_TXT_ProgramAndApplicationsAndMediaLimit(strCIM_ComputerLocationandLimits_TXT_ProgramAndApplicationsAndMediaLimit),strCIM_ComputerLocationandLimits_TXT_ProgramAndApplicationsAndMediaLimit,test);
			se.element().enterOrValidateText(getCIM_ComputerLocationandLimits_TXT_IncomeCoverageLimit(strCIM_ComputerLocationandLimits_TXT_IncomeCoverageLimit),strCIM_ComputerLocationandLimits_TXT_IncomeCoverageLimit,test);

			se.element().Click(getNext(),test);
			
			if((strCIM_ComputerLocationandLimits_BTN_Done.equalsIgnoreCase("Yes"))){
				
				se.element().Click(getDone(),test);
			}
		}
		catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for ComputerLocationAndLimits ", true, false, true, test);
			
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