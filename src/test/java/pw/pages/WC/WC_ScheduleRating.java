/**
* @author ${el00119}
*/

package pw.pages.WC;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_WC;
//import com.relevantcodes.extentreports.ExtentTest;
public class WC_ScheduleRating extends OR_WC {

	public void WC_ScheduleRatingPage(String strRegressionID,String transaction,String suspendSheet,ExtentTest test) throws IOException{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.WC_ScheduleRating)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		    
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.WC_ScheduleRating, strRegressionID, transaction);
			int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		try{
			String strScheduleRating_BTN_Details = (String) row.get("ScheduleRating_BTN_Details");
			String strScheduleRating_BTN_Done = (String) row.get("ScheduleRating_BTN_Done");
			String strScheduleRating_TXT_State = (String) row.get("ScheduleRating_TXT_State");
			String strScheduleRating_CHK_NoScheduleRatingForThisState = (String) row.get("ScheduleRating_CHK_NoScheduleRatingForThisState");
			String strScheduleRating_TXT_Coverage = (String) row.get("ScheduleRating_TXT_Coverage");
			/*String strScheduleRating_TXT_FiledMinimum = (String) row.get("ScheduleRating_TXT_FiledMinimum");
			String strScheduleRating_TXT_FiledMaximum = (String) row.get("ScheduleRating_TXT_FiledMaximum");
			String strScheduleRating_TXT_Maximum = (String) row.get("ScheduleRating_TXT_Maximum");
			String strScheduleRating_TXT_Minimum = (String) row.get("ScheduleRating_TXT_Minimum");*/
			String strScheduleRating_TXT_SelectModifier = (String) row.get("ScheduleRating_TXT_SelectModifier");
			//String strScheduleRating_TXT_TotalModifier = (String) row.get("ScheduleRating_TXT_TotalModifier");
			String strScheduleRating_CHK_ProvideSchRatingBreakdown_Yes = (String) row.get("ScheduleRating_CHK_ProvideSchRatingBreakdown_Yes");
			String strScheduleRating_CHK_ProvideSchRatingBreakdown_No = (String) row.get("ScheduleRating_CHK_ProvideSchRatingBreakdown_No");
			String strScheduleRating_TXT_ScheduleRisk_Coverage = (String) row.get("ScheduleRating_TXT_ScheduleRisk_Coverage");
			String strScheduleRating_TXT_RiskCharacteristic = (String) row.get("ScheduleRating_TXT_RiskCharacteristic");
			/*String strScheduleRating_TXT_ScheduleRisk_Minimum = (String) row.get("ScheduleRating_TXT_ScheduleRisk_Minimum");
			String strScheduleRating_TXT_ScheduleRisk_Maximum = (String) row.get("ScheduleRating_TXT_ScheduleRisk_Maximum");
			*/String strScheduleRating_TXT_ScheduleRisk_SelectedModifier = (String) row.get("ScheduleRating_TXT_ScheduleRisk_SelectedModifier");
			String strScheduleRating_TXT_ScheduleRisk_Reason = (String) row.get("ScheduleRating_TXT_ScheduleRisk_Reason");
			//String strScheduleRating_TXT_ScheduleRisk_ReasonFilterNeeded = (String) row.get("ScheduleRating_TXT_ScheduleRisk_ReasonFilterNeeded");
			String strScheduleRating_BTN_Next = (String) row.get("ScheduleRating_BTN_Next");
			String strScheduleRating_TXT_ScheduleRiskCharc_RowNo = (String) row.get("ScheduleRating_TXT_ScheduleRiskCharc_RowNo");
			
			
			se.log().logTestStep("WC_ScheduleRating");
			test.log(LogStatus.INFO, "WC_ScheduleRating page","Transaction Step : "+transaction + "<br>" +"Page : WC_ScheduleRating");
			se.verify().verifyEquals("WC_ScheduleRating of PowerWriter ", getScheduleRating_LBL_ScheduleRating().isDisplayed(),true, true,test);
			
			if(!strScheduleRating_BTN_Details.equalsIgnoreCase("N/A")){
				se.element().Click(getScheduleRating_BTN_Details(strScheduleRating_BTN_Details), test);
			}
			se.element().enterOrValidateText(getScheduleRating_TXT_State(strScheduleRating_TXT_State),strScheduleRating_TXT_State,test);
			se.element().checkUncheckOrValidate(getScheduleRating_CHK_NoScheduleRatingForThisState(strScheduleRating_CHK_NoScheduleRatingForThisState),strScheduleRating_CHK_NoScheduleRatingForThisState,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_SelectModifier(strScheduleRating_TXT_Coverage,strScheduleRating_TXT_SelectModifier),strScheduleRating_TXT_SelectModifier,test);
			se.element().checkUncheckOrValidate(getScheduleRating_CHK_ProvideSchRatingBreakdown_Yes(strScheduleRating_CHK_ProvideSchRatingBreakdown_Yes),strScheduleRating_CHK_ProvideSchRatingBreakdown_Yes,test);
			se.element().checkUncheckOrValidate(getScheduleRating_CHK_ProvideSchRatingBreakdown_No(strScheduleRating_CHK_ProvideSchRatingBreakdown_No),strScheduleRating_CHK_ProvideSchRatingBreakdown_No,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_ScheduleRisk_SelectedModifier(strScheduleRating_TXT_ScheduleRisk_Coverage,strScheduleRating_TXT_ScheduleRiskCharc_RowNo,strScheduleRating_TXT_ScheduleRisk_SelectedModifier),strScheduleRating_TXT_ScheduleRisk_SelectedModifier,test);
			//se.element().enterOrValidateText(getScheduleRating_TXT_ScheduleRisk_Reason(strScheduleRating_TXT_ScheduleRisk_Coverage,strScheduleRating_TXT_ScheduleRiskCharc_RowNo,strScheduleRating_TXT_ScheduleRisk_Reason),strScheduleRating_TXT_ScheduleRisk_Reason,test);
			
			se.element().selectPopupWithMagnifier(getScheduleRating_TXT_ScheduleRisk_Reason(strScheduleRating_TXT_ScheduleRisk_Coverage,strScheduleRating_TXT_ScheduleRiskCharc_RowNo,strScheduleRating_TXT_ScheduleRisk_Reason),getScheduleRating_TXT_ScheduleRisk_ReasonSearch(strScheduleRating_TXT_ScheduleRisk_Coverage,strScheduleRating_TXT_ScheduleRiskCharc_RowNo,strScheduleRating_TXT_ScheduleRisk_Reason),strScheduleRating_TXT_ScheduleRisk_Reason,constants.NA,strScheduleRating_TXT_ScheduleRisk_Reason, constants.NA, constants.NA,constants.NA,test);
			
			if(strScheduleRating_BTN_Next.equalsIgnoreCase(constants.Yes)){
				se.element().Click(getNext(),test);
			}
			
			
			if(strScheduleRating_BTN_Done.equalsIgnoreCase(constants.Yes)){
				se.element().Click(getDone(),test);
			}
			
		
		} catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for WCScheduleRating", true, false, true, test);
			
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
	

