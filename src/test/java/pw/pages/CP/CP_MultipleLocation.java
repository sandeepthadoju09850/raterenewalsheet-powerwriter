package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class CP_MultipleLocation extends OR_CP {
	
	public void MultipleLocation(String strRegressionID,String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_MultipleLocAvgRating")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }

		List<Map<String, String>> table = ExcelOperations.getPagesData("CP_MultipleLocAvgRating", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			try{
				
				CP_MultipleLocation MultipleLocation = TestPageFactory.initElements(se, CP_MultipleLocation.class);
				MultipleLocation.CP_MultiLocationAverageRating(row,transaction,test);
				MultipleLocation.CP_AddLocSpecialCoinsuranceProvisions(row, transaction, test);
				MultipleLocation.CP_AddLocSpecialCoinsuProvRatingDetails(row, transaction, test);
			
			}
			catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CP_MultipleLocation", true, false, true, test);
				
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
	
	public void CP_MultiLocationAverageRating(Map<String, String> row,String transaction, ExtentTest test) throws IOException {
		String strCP_MultiLocAvgRating_TXT_BG1Rate = (String) row.get("CP_MultiLocAvgRating_TXT_BG1Rate");
		String strCP_MultiLocAvgRating_TXT_BG2Rate = (String) row.get("CP_MultiLocAvgRating_TXT_BG2Rate");
		String strCP_MultiLocAvgRating_TXT_BroadRate = (String) row.get("CP_MultiLocAvgRating_TXT_BroadRate");
		String strCP_MultiLocAvgRating_TXT_SpecialRate = (String) row.get("CP_MultiLocAvgRating_TXT_SpecialRate");
		String strCP_MultiLocAvgRating_TXT_EQRate = (String) row.get("CP_MultiLocAvgRating_TXT_EQRate");
		String strCP_MultiLocAvgRating_CHK_AddLocSpecCoinsuranceProvisionsForm = (String) row.get("CP_MultiLocAvgRating_CHK_AddLocSpecCoinsuranceProvisionsForm");
		String strCP_MultiLocAvgRating_TXT_AddSpecCo_OverallLimitofInsurance = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_OverallLimitofInsurance");
		String strCP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_Cause of Loss");
		String strCP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance");
		String strCP_MultiLocAvgRating_CHK_AddSpecCo_Earthquake  = (String) row.get("CP_MultiLocAvgRating_CHK_AddSpecCo_Earthquake ");
		
		try{
			se.log().logTestStep("CP_MultiLocationAverageRating");
			test.log(LogStatus.INFO, "CP_MultiLocationAverageRating","Transaction Step : "+ transaction + "<br>" +"Page : CP_MultiLocationAverageRating"  + "<br>" +"Section: CP_MultiLocationAverageRating");
			se.util().sleep(1000);
			se.verify().verifyEquals("MultiLocationAverageRating of PowerWriter ", getCP_VerifyMutipleLocationAverageRatingText().isDisplayed(),true, true,test);
			se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_BG1Rate(strCP_MultiLocAvgRating_TXT_BG1Rate),strCP_MultiLocAvgRating_TXT_BG1Rate,test);
			se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_BG2Rate(strCP_MultiLocAvgRating_TXT_BG2Rate),strCP_MultiLocAvgRating_TXT_BG2Rate,test);
			se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_BroadRate(strCP_MultiLocAvgRating_TXT_BroadRate),strCP_MultiLocAvgRating_TXT_BroadRate,test);
			se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_SpecialRate(strCP_MultiLocAvgRating_TXT_SpecialRate),strCP_MultiLocAvgRating_TXT_SpecialRate,test);
			se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_EQRate(strCP_MultiLocAvgRating_TXT_EQRate),strCP_MultiLocAvgRating_TXT_EQRate,test);
			se.element().checkUncheckOrValidate(getCP_MultiLocAvgRating_CHK_AddLocSpecCoinsuranceProvisionsForm(strCP_MultiLocAvgRating_CHK_AddLocSpecCoinsuranceProvisionsForm),strCP_MultiLocAvgRating_CHK_AddLocSpecCoinsuranceProvisionsForm,test);
			se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_OverallLimitofInsurance(strCP_MultiLocAvgRating_TXT_AddSpecCo_OverallLimitofInsurance),strCP_MultiLocAvgRating_TXT_AddSpecCo_OverallLimitofInsurance,test);
			/*if(!strCP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss.equalsIgnoreCase("N/A") && !strCP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss.contains("validate2")) {
            	se.element().clickSearchIcon(getCP_MultiLocAvgRating_BTN_AddSpecCo_CauseofLoss_Search(), test);
            	se.element().Click(getCP_MultiLocAvgRating_LNK_AddSpecCo_CauseofLoss(strCP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss), test);
            }else{
            	se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss(strCP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss),strCP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss,test);
            }*/
			se.element().selectPopupWithMagnifier(getCP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss(strCP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss), getCP_MultiLocAvgRating_BTN_AddSpecCo_CauseofLoss_Search(strCP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss), strCP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss, constants.NA, strCP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss, constants.NA, constants.NA, constants.NA, test);
			
			/*if(!strCP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance.equalsIgnoreCase("N/A") && !strCP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance.contains("validate2")) {
            	se.element().clickSearchIcon(getCP_MultiLocAvgRating_BTN_AddSpecCo_Coinsurance_Search(), test);
            	se.element().Click(getCP_MultiLocAvgRating_LNK_AddSpecCo_Coinsurance(strCP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance), test);
            }else{
            	se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance(strCP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance),strCP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance,test);
            }*/
			
			se.element().selectPopupWithMagnifier(getCP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance(strCP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance), getCP_MultiLocAvgRating_BTN_AddSpecCo_Coinsurance_Search(strCP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance), strCP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance, constants.NA, strCP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance, constants.NA, constants.NA, constants.NA, test);
			
			se.element().checkUncheckOrValidate(getCP_MultiLocAvgRating_CHK_AddSpecCo_Earthquake (strCP_MultiLocAvgRating_CHK_AddSpecCo_Earthquake ),strCP_MultiLocAvgRating_CHK_AddSpecCo_Earthquake ,test);
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_MultiLocationAverageRating", true, false, true, test);
		}
	
	}
	  public void CP_AddLocSpecialCoinsuranceProvisions(Map<String, String> row,String transaction, ExtentTest test) throws IOException {	
		  String strCP_MultiLocAvgRating_TXT_AddSpecCo_LocType1 = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_LocType1");
		  String strCP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty1 = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty1");
		  String strCP_MultiLocAvgRating_TXT_AddSpecCo_Stock1 = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_Stock1");
		  String strCP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers1 = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers1");
		  String strCP_MultiLocAvgRating_TXT_AddSpecCo_LocType2 = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_LocType2");
		  String strCP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty2 = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty2");
		  String strCP_MultiLocAvgRating_TXT_AddSpecCo_Stock2 = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_Stock2");
		  String strCP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers2 = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers2");
		  String strCP_MultiLocAvgRating_TXT_AddSpecCo_LocType3 = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_LocType3");
		  String strCP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty3 = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty3");
		  String strCP_MultiLocAvgRating_TXT_AddSpecCo_Stock3 = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_Stock3");
		  String strCP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers3 = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers3");
		  
		try{
				se.log().logTestStep("CP_AddLocSpecialCoinsuranceProvisions");
				test.log(LogStatus.INFO, "CP_AddLocSpecialCoinsuranceProvisions","Transaction Step : "+  transaction + "<br>" +"Page : CP_AddLocSpecialCoinsuranceProvisions"  + "<br>" +"Section: CP_AddLocSpecialCoinsuranceProvisions");
				se.util().sleep(1000);
				se.verify().verifyEquals("AddLocSpecialCoinsuranceProvisions of PowerWriter ", getCP_VerifyAddLocSpecialCoinsuranceProvText().isDisplayed(),true, true,test);
				se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_LocType1(strCP_MultiLocAvgRating_TXT_AddSpecCo_LocType1),strCP_MultiLocAvgRating_TXT_AddSpecCo_LocType1,test);
				se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty1(strCP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty1),strCP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty1,test);
				se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_Stock1(strCP_MultiLocAvgRating_TXT_AddSpecCo_Stock1),strCP_MultiLocAvgRating_TXT_AddSpecCo_Stock1,test);
				se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers1(strCP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers1),strCP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers1,test);
				se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_LocType2(strCP_MultiLocAvgRating_TXT_AddSpecCo_LocType2),strCP_MultiLocAvgRating_TXT_AddSpecCo_LocType2,test);
				se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty2(strCP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty2),strCP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty2,test);
				se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_Stock2(strCP_MultiLocAvgRating_TXT_AddSpecCo_Stock2),strCP_MultiLocAvgRating_TXT_AddSpecCo_Stock2,test);
				se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers2(strCP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers2),strCP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers2,test);
				se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_LocType3(strCP_MultiLocAvgRating_TXT_AddSpecCo_LocType3),strCP_MultiLocAvgRating_TXT_AddSpecCo_LocType3,test);
				se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty3(strCP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty3),strCP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty3,test);
				se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_Stock3(strCP_MultiLocAvgRating_TXT_AddSpecCo_Stock3),strCP_MultiLocAvgRating_TXT_AddSpecCo_Stock3,test);
				se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers3(strCP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers3),strCP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers3,test);
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_AddLocSpecialCoinsuranceProvisions", true, false, true, test);
		}
	
	}
	  public void CP_AddLocSpecialCoinsuProvRatingDetails(Map<String, String> row,String transaction, ExtentTest test) throws IOException {	
		  String strCP_MultiLocAvgRating_TXT_AddSpecCo_Peril = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_Peril");
		  String strCP_MultiLocAvgRating_TXT_AddSpecCo_Premium = (String) row.get("CP_MultiLocAvgRating_TXT_AddSpecCo_Premium");
		  
		try{
			se.log().logTestStep("CP_AddLocSpecialCoinsuProvRatingDetails");
			test.log(LogStatus.INFO, "CP_AddLocSpecialCoinsuProvRatingDetails","Transaction Step : "+  transaction + "<br>" +"Page : CP_AddLocSpecialCoinsuProvRatingDetails"  + "<br>" +"Section: CP_AddLocSpecialCoinsuProvRatingDetails");
			se.util().sleep(1000);
			se.verify().verifyEquals("AddLocSpecialCoinsuProvRatingDetails of PowerWriter ", getCP_VerifyAddLocSpecialCoinsProvRatingDetailsText().isDisplayed(),true, true,test);
			se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_Peril(strCP_MultiLocAvgRating_TXT_AddSpecCo_Peril),strCP_MultiLocAvgRating_TXT_AddSpecCo_Peril,test);
			se.element().enterOrValidateText(getCP_MultiLocAvgRating_TXT_AddSpecCo_Premium(strCP_MultiLocAvgRating_TXT_AddSpecCo_Premium),strCP_MultiLocAvgRating_TXT_AddSpecCo_Premium,test);
			
			se.element().Click(getNext(),test);
			se.util().sleep(1000);
			 
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_AddLocSpecialCoinsuProvRatingDetails", true, false, true, test);
		}
	
	}
	 
}
