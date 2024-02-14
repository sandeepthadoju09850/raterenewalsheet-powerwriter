package pw.pages.WC;
/**
* @author ${sh09475}
*/
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_WC;

public class WC000310 extends OR_WC {
public void WC000310Page(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			
		    if(suspendSheet.equalsIgnoreCase(constants.WC000310)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.WC000310, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strWC000310_BTN_Add = (String) row.get("WC000310_BTN_Add");
				String strWC000310_BTN_Details = (String) row.get("WC000310_BTN_Details");
				String strWC000310_BTN_Done = (String) row.get("WC000310_BTN_Done");
				String strWC000310_TXT_PersonType = (String) row.get("WC000310_TXT_PersonType");
				String strWC000310_TXT_PersonTypeFilterNeeded = (String) row.get("WC000310_TXT_PersonTypeFilterNeeded");
				String strWC000310_TXT_name = (String) row.get("WC000310_TXT_name");
				String strWC000310_TXT_State = (String) row.get("WC000310_TXT_State");

				
				try
				{
					se.log().logSeStep("WC000310");
					test.log(LogStatus.INFO, "WC000310","Transaction Step : "+ transaction + "<br>" +"Page : WC000310");
					se.verify().verifyEquals("WC000310 page of PowerWriter ", getWC000310_TXT_LabelName().isDisplayed(),true, true,test);
					
					if(strWC000310_BTN_Add.equalsIgnoreCase("Yes")){
						se.element().Click(getWC000310_BTN_Add(),test);
					}
					
					if(!strWC000310_BTN_Details.equalsIgnoreCase("N/A")){
						se.element().Click(getWC000310_BTN_Details(strWC000310_BTN_Details),test);
					}
					se.element().selectPopupWithMagnifier(getWC000310_TXT_PersonType(strWC000310_TXT_PersonType),getWC000310_TXT_PersonTypeSearch(strWC000310_TXT_PersonType),strWC000310_TXT_PersonType,strWC000310_TXT_PersonTypeFilterNeeded,strWC000310_TXT_PersonType, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getWC000310_TXT_name(strWC000310_TXT_name),strWC000310_TXT_name,test);
					se.element().enterOrValidateText(getWC000310_TXT_State(strWC000310_TXT_State),strWC000310_TXT_State,test);
					se.element().Click(getNext(),test);
					if(strWC000310_BTN_Done.equalsIgnoreCase("Yes")){
						se.element().Click(getDone(),test);
					}
					
				}catch(Exception e) {
					se.verify().verifyEquals("Failed to fill in details for WC000310", true, false, true, test);
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



