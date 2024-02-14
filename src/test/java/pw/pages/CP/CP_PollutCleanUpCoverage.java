package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class CP_PollutCleanUpCoverage extends OR_CP {
	public void PollutCleanUpCoverage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_PollutantCleanUpCoverage")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }

		List<Map<String, String>> table = ExcelOperations.getPagesData("CP_PollutantCleanUpCoverage", strRegressionID, transaction);
		
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCP_PollutCleanUpCov_BTN_ADD = (String) row.get("CP_PollutCleanUpCov_BTN_ADD");
		String strCP_PollutCleanUpCov_BTN_Details = (String) row.get("CP_PollutCleanUpCovv_BTN_Details");
		String strCP_PollutCleanUpCov_BTN_Done = (String) row.get("CP_PollutCleanUpCov_BTN_Done");
		String strCP_PollutCleanUpCov_TXT_LocationNo = (String) row.get("CP_PollutCleanUpCov_TXT_LocationNo");
		String strCP_PollutCleanUpCov_TXT_Name = (String) row.get("CP_PollutCleanUpCov_TXT_Name");
		String strCP_PollutCleanUpCov_TXT_Description = (String) row.get("CP_PollutCleanUpCov_TXT_Description");
		String strCP_PollutCleanUpCov_TXT_Street1 = (String) row.get("CP_PollutCleanUpCov_TXT_Street1");
		String strCP_PollutCleanUpCov_TXT_Street2 = (String) row.get("CP_PollutCleanUpCov_TXT_Street2");
		String strCP_PollutCleanUpCov_TXT_City = (String) row.get("CP_PollutCleanUpCov_TXT_City");
		String strCP_PollutCleanUpCov_TXT_State = (String) row.get("CP_PollutCleanUpCov_TXT_State");
		String strCP_PollutCleanUpCov_TXT_Zip = (String) row.get("CP_PollutCleanUpCov_TXT_Zip");
		String strCP_PollutCleanUpCov_TXT_AmountOfInsurance = (String) row.get("CP_PollutCleanUpCov_TXT_AmountOfInsurance");
		String strCP_PollutCleanUpCov_TXT_Deductible = (String) row.get("CP_PollutCleanUpCov_TXT_Deductible");
		String strCP_PollutCleanUpCov_TXT_LossCost = (String) row.get("CP_PollutCleanUpCov_TXT_LossCost");
		String strCP_PollutCleanUpCov_TXT_LossCostMultiplier = (String) row.get("CP_PollutCleanUpCov_TXT_LossCostMultiplier");
		String strCP_PollutCleanUpCov_TXT_ProtectionClassMult = (String) row.get("CP_PollutCleanUpCov_TXT_ProtectionClassMult");
		String strCP_PollutCleanUpCov_TXT_TerritorialMult = (String) row.get("CP_PollutCleanUpCov_TXT_TerritorialMult");
		String strCP_PollutCleanUpCov_TXT_DeductibleFactor = (String) row.get("CP_PollutCleanUpCov_TXT_DeductibleFactor");
		String strCP_PollutCleanUpCov_TXT_PackageModFActor = (String) row.get("CP_PollutCleanUpCov_TXT_PackageModFActor");
		String strCP_PollutCleanUpCov_TXT_GroupIAndIIPollFTR = (String) row.get("CP_PollutCleanUpCov_TXT_GroupIAndIIPollFTR");
		String strCP_PollutCleanUpCov_TXT_LOIRelativityFtr = (String) row.get("CP_PollutCleanUpCov_TXT_LOIRelativityFtr");
		String strCP_PollutCleanUpCov_TXT_FinalRate = (String) row.get("CP_PollutCleanUpCov_TXT_FinalRate");
		String strCP_PollutCleanUpCov_TXT_TransactionPremium = (String) row.get("CP_PollutCleanUpCov_TXT_TransactionPremium");
		String strTestDescription = (String) row.get("Transaction Name");
		
		try{
				se.log().logTestStep("CP_PollutCleanUpCoverage");
				test.log(LogStatus.INFO, "CP_PollutCleanUpCoverage page","Transaction Step : "+strTestDescription + "<br>" +"Page : CP_PollutCleanUpCoverage");
				se.verify().verifyEquals("PollutCleanUpCoverage Page of PowerWriter ", getCP_PollutCleanUpCov_LabelName().isDisplayed(),true, true,test);
				
				if((strCP_PollutCleanUpCov_BTN_ADD.equalsIgnoreCase("Yes"))){
					se.element().Click(getCP_PollutCleanUpCov_BTN_ADD(strCP_PollutCleanUpCov_BTN_ADD),test);
					}
					if((strCP_PollutCleanUpCov_BTN_Details.equalsIgnoreCase("Yes"))){
					se.element().tryClick(getCP_PollutCleanUpCov_BTN_Details(strCP_PollutCleanUpCov_BTN_Details),test);
					}
				
				/*if(!strCP_PollutCleanUpCov_TXT_LocationNo.equalsIgnoreCase("N/A") && !strCP_PollutCleanUpCov_TXT_LocationNo.contains("validate2")) {
					se.element().clickSearchIcon(getCP_PollutCleanUpCov_BTN_LocationNoSearch(), test);
					se.element().Click(getCP_PollutCleanUpCov_LNK_LocationNoOption(strCP_PollutCleanUpCov_TXT_LocationNo),test);
					se.util().sleep(5000);
				}else {
					se.element().enterOrValidateText(getCP_PollutCleanUpCov_TXT_LocationNo(strCP_PollutCleanUpCov_TXT_LocationNo),strCP_PollutCleanUpCov_TXT_LocationNo,test);
				}*/
				
				se.element().selectPopupWithMagnifier(getCP_PollutCleanUpCov_TXT_LocationNo(strCP_PollutCleanUpCov_TXT_LocationNo), getCP_PollutCleanUpCov_BTN_LocationNoSearch(strCP_PollutCleanUpCov_TXT_LocationNo), strCP_PollutCleanUpCov_TXT_LocationNo, constants.NA, strCP_PollutCleanUpCov_TXT_LocationNo, constants.NA, constants.NA, constants.NA, test);
				
				se.element().enterOrValidateText(getCP_PollutCleanUpCov_TXT_Name(strCP_PollutCleanUpCov_TXT_Name),strCP_PollutCleanUpCov_TXT_Name,test);
				se.element().enterOrValidateText(getCP_PollutCleanUpCov_TXT_Description(strCP_PollutCleanUpCov_TXT_Description),strCP_PollutCleanUpCov_TXT_Description,test);
				se.element().enterOrValidateText(getCP_PollutCleanUpCov_TXT_Street1(strCP_PollutCleanUpCov_TXT_Street1),strCP_PollutCleanUpCov_TXT_Street1,test);
				se.element().enterOrValidateText(getCP_PollutCleanUpCov_TXT_Street2(strCP_PollutCleanUpCov_TXT_Street2),strCP_PollutCleanUpCov_TXT_Street2,test);
				se.element().enterOrValidateText(getCP_PollutCleanUpCov_TXT_City(strCP_PollutCleanUpCov_TXT_City),strCP_PollutCleanUpCov_TXT_City,test);
				se.element().enterOrValidateText(getCP_PollutCleanUpCov_TXT_State(strCP_PollutCleanUpCov_TXT_State),strCP_PollutCleanUpCov_TXT_State,test);
				if(!strCP_PollutCleanUpCov_TXT_Zip.equalsIgnoreCase("N/A") && !strCP_PollutCleanUpCov_TXT_Zip.contains("validate2")) {
					se.element().clickSearchIcon(getCP_PollutCleanUpCov_BTN_ZipSearch(), test);
					se.element().Click(getCP_PollutCleanUpCov_LNK_ZipOption(strCP_PollutCleanUpCov_TXT_Zip),test);
				}else {
					se.element().enterOrValidateText(getCP_PollutCleanUpCov_TXT_Zip(strCP_PollutCleanUpCov_TXT_Zip),strCP_PollutCleanUpCov_TXT_Zip,test);
				}
				
				se.element().enterOrValidateText(getCP_PollutCleanUpCov_TXT_AmountOfInsurance(strCP_PollutCleanUpCov_TXT_AmountOfInsurance),strCP_PollutCleanUpCov_TXT_AmountOfInsurance,test);
				
				/*if(!strCP_PollutCleanUpCov_TXT_Deductible.equalsIgnoreCase("N/A") && !strCP_PollutCleanUpCov_TXT_Deductible.contains("validate2")) {
					se.element().clickSearchIcon(getCP_PollutCleanUpCov_BTN_DeductibleSearch(), test);
					se.element().Click(getCP_PollutCleanUpCov_LNK_DeductibleOption(strCP_PollutCleanUpCov_TXT_Deductible),test);
				}else {
					se.element().enterOrValidateText(getCP_PollutCleanUpCov_TXT_Deductible(strCP_PollutCleanUpCov_TXT_Deductible),strCP_PollutCleanUpCov_TXT_Deductible,test);
				}*/
				
				se.element().selectPopupWithMagnifier(getCP_PollutCleanUpCov_TXT_Deductible(strCP_PollutCleanUpCov_TXT_Deductible), getCP_PollutCleanUpCov_BTN_DeductibleSearch(strCP_PollutCleanUpCov_TXT_Deductible), strCP_PollutCleanUpCov_TXT_Deductible, constants.NA, strCP_PollutCleanUpCov_TXT_Deductible, constants.NA, constants.NA, constants.NA, test);
				
				se.element().Click(getNext(),test);
				se.util().sleep(1000);
				if((strCP_PollutCleanUpCov_BTN_Done.equalsIgnoreCase("Yes"))){
					
					se.element().Click(getDone(),test);
				}
	
			
			
	}catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for CP_PollutCleanUpCoverage", true, false, true, test);
		
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
