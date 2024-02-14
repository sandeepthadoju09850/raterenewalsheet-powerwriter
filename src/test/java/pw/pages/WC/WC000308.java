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

public class WC000308 extends OR_WC{
public void WC000308Page(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			
		    if(suspendSheet.equalsIgnoreCase(constants.WC000308)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.WC000308, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strWC000308_BTN_Add = (String) row.get("WC000308_BTN_Add");
				String strWC000308_BTN_Details = (String) row.get("WC000308_BTN_Details");
				String strWC000308_BTN_Done = (String) row.get("WC000308_BTN_Done");
				String strWC000308_TXT_ExcludeType = (String) row.get("WC000308_TXT_ExcludeType");
				String strWC000308_TXT_ExcludeTypeFilterNeeded = (String) row.get("WC000308_TXT_ExcludeTypeFilterNeeded");
				String strWC000308_TXT_Name = (String) row.get("WC000308_TXT_Name");

				try
				{
					se.log().logSeStep("WC000308");
					test.log(LogStatus.INFO, "WC000308","Transaction Step : "+ transaction + "<br>" +"Page : WC000308");
					se.verify().verifyEquals("WC000308 page of PowerWriter ", getWC000308_TXT_LabelName().isDisplayed(),true, true,test);
					
					if(strWC000308_BTN_Add.equalsIgnoreCase("Yes")){
						se.element().Click(getWC000308_BTN_Add(),test);
					}
					
					if(!strWC000308_BTN_Details.equalsIgnoreCase("N/A")){
						se.element().Click(getWC000308_BTN_Details(strWC000308_BTN_Details),test);
					}
					
					se.element().selectPopupWithMagnifier(getWC000308_TXT_ExcludeType(strWC000308_TXT_ExcludeType),getWC000308_TXT_ExcludeTypeSearch(strWC000308_TXT_ExcludeType),strWC000308_TXT_ExcludeType,strWC000308_TXT_ExcludeTypeFilterNeeded,strWC000308_TXT_ExcludeType, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getWC000308_TXT_Name(strWC000308_TXT_Name),strWC000308_TXT_Name,test);
					se.element().Click(getNext(),test);
					
					if(strWC000308_BTN_Done.equalsIgnoreCase("Yes")){
						se.element().Click(getDone(),test);
					}
				
					
				}catch(Exception e) {
					se.verify().verifyEquals("Failed to fill in details for WC000308", true, false, true, test);
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



