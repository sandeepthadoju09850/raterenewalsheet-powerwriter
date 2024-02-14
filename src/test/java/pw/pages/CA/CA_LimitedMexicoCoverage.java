package pw.pages.CA;

/**
 * @author ${pr09529}
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

public class CA_LimitedMexicoCoverage extends OR_CA  {
	
	public void LimitedMexicoCoverage(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
	
		try{
			
			if(suspendSheet.equalsIgnoreCase(constants.CA_LimitedMexicoCoverage)){
				test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_LimitedMexicoCoverage, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
				String strLTDMexico_BTN_Add = (String) row.get("LTDMexico_BTN_Add");
				String strLTDMexico_BTN_Details = (String) row.get("LTDMexico_BTN_Details");
				String strLTDMexico_BTN_Done = (String) row.get("LTDMexico_BTN_Done");
				//String strLTDMexico_BTN_Remove = (String) row.get("LTDMexico_BTN_Remove");
				String strLTDMexico_TXT_State = (String) row.get("LTDMexico_TXT_State");
				String strLTDMexico_TXT_StateFilterNeeded = (String) row.get("LTDMexico_TXT_StateFilterNeeded");
				//String strLTDMexico_TXT_AnnualPremiumFilterNeeded = (String) row.get("LTDMexico_RXT_AnnualPremiumFilterNeeded");
				String strLTDMexico_TXT_AnnualPremium = (String) row.get("LTDMexico_RXT_AnnualPremium");
				
				try{
					se.log().logTestStep("LimitedMexicoCoverage");
					test.log(LogStatus.INFO, "CA_LimitedMexicoCoverage page","Transaction Step : " + transaction + "<br>" +"Page : CA_LimitedMexicoCoverage"); 
					se.verify().verifyEquals("CA_LimitedMexicoCoverage Page of PowerWriter ", getCA_CA_LTDMexico_LBL_LabelName().isDisplayed(),true, true,test);
					
					if(strLTDMexico_BTN_Add.equalsIgnoreCase("Yes")){
						se.element().Click(getLTDMexico_BTN_Add(),test);
					}
					if(!strLTDMexico_BTN_Details.equalsIgnoreCase(constants.NA)){
						se.element().Click(getLTDMexico_BTN_Details(strLTDMexico_BTN_Details),test);
					}
					/*if(strLTDMexico_BTN_Remove.equalsIgnoreCase("Yes")){
						se.element().Click(getLTDMexico_BTN_Remove(),test);
					}
					*/
							se.util().sleep(2000);
							se.element().selectPopupWithMagnifier(getLTDMexico_TXT_State(strLTDMexico_TXT_State),getLTDMexico_TXT_StateSearch(strLTDMexico_TXT_State),strLTDMexico_TXT_State,strLTDMexico_TXT_StateFilterNeeded,strLTDMexico_TXT_State, constants.NA, constants.NA,constants.NA,test);
							se.element().enterOrValidateText(getLTDMexico_TXT_AnnualPremium(strLTDMexico_TXT_AnnualPremium),strLTDMexico_TXT_AnnualPremium,test);
							se.element().Click(getNext(),test);
					
						if(strLTDMexico_BTN_Done.equalsIgnoreCase("Yes")){
							se.element().clickElement(getDone());
						}		
				}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_LimitedMexicoCoverage ", true, false, true, test);	
				}				
				iteration++;
			
			}
		} catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			testTearDown(se, test);
		}
	}
}