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

/**
* @author ${ro09528}
*/
public class WC_Deductibles extends OR_WC {
public void  Deductibles(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			    if(suspendSheet.equalsIgnoreCase(constants.WC_Deductibles)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.WC_Deductibles, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strDeductibles_BTN_Add = (String) row.get("Deductibles_BTN_Add");
				String strDeductibles_BTN_Delete = (String) row.get("Deductibles_BTN_Delete");
				//String strDeductibles_CHK_Row_Select=(String) row.get("Deductibles_CHK_Row_Select");
				String strDeductibles_BTN_Details = (String) row.get("Deductibles_BTN_Details");
				String strDeductibles_TXT_DedPlan = (String) row.get("Deductibles_TXT_DedPlan");
				String strDeductibles_TXT_DedPlanFilterNeeded = (String) row.get("Deductibles_TXT_DedPlanFilterNeeded");
				String strDeductibles_TXT_DedType = (String) row.get("Deductibles_TXT_DedType");
				String strDeductibles_TXT_DedTypeFilterNeeded = (String) row.get("Deductibles_TXT_DedTypeFilterNeeded");
				String strDeductibles_TXT_DedBasis = (String) row.get("Deductibles_TXT_DedBasis");
				String strDeductibles_TXT_DedAmount = (String) row.get("Deductibles_TXT_DedAmount");
				String strDeductibles_TXT_DedAmountFilterNeeded = (String) row.get("Deductibles_TXT_DedAmountFilterNeeded");
				String strDeductibles_TXT_PolicyAggDedAmount = (String) row.get("Deductibles_TXT_PolicyAggDedAmount");
				String strDeductibles_TXT_CoinsuranceAmount = (String) row.get("Deductibles_TXT_CoinsuranceAmount");


			
				try
				{
					test.log(LogStatus.INFO, "WC_Deductibles","Transaction Step : "+ transaction + "<br>" +"Page : WC_Deductibles");
					se.log().logSeStep("Selecting WC_Deductibles ");
					se.verify().verifyEquals("WC_Deductibles page of PowerWriter ", getDeductibles_BTN_Label().isDisplayed(),true, true,test);
					
					if(strDeductibles_BTN_Add.equalsIgnoreCase("Yes")){
						se.element().Click(getDeductibles_BTN_Add(strDeductibles_BTN_Add),test);
					}
					if(!strDeductibles_BTN_Details.equalsIgnoreCase("N/A")){
						se.element().Click(getDeductibles_BTN_Details(strDeductibles_BTN_Details), test);
					}	
					
					if(strDeductibles_BTN_Delete.equalsIgnoreCase("Yes")){
						se.element().checkUncheckOrValidate(getClassifications_CHK_Row_Select(strDeductibles_BTN_Delete),"Check",test);
						se.element().Click(getDeductibles_BTN_Delete(strDeductibles_BTN_Delete), test);
						
					}
					
					
					//se.element().Click(getDeductibles_BTN_Delete(strDeductibles_BTN_Delete),strDeductibles_BTN_Delete,test);
					se.element().selectPopupWithMagnifier(getDeductibles_TXT_DedPlan(strDeductibles_TXT_DedPlan),getDeductibles_TXT_DedPlanSearch(strDeductibles_TXT_DedPlan),strDeductibles_TXT_DedPlan,strDeductibles_TXT_DedPlanFilterNeeded,strDeductibles_TXT_DedPlan, constants.NA, constants.NA,constants.NA,test);
					se.element().selectPopupWithMagnifier(getDeductibles_TXT_DedType(strDeductibles_TXT_DedType),getDeductibles_TXT_DedTypeSearch(strDeductibles_TXT_DedType),strDeductibles_TXT_DedType,strDeductibles_TXT_DedTypeFilterNeeded,strDeductibles_TXT_DedType, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getDeductibles_TXT_DedBasis(strDeductibles_TXT_DedBasis),strDeductibles_TXT_DedBasis,test);
					se.element().selectPopupWithMagnifier(getDeductibles_TXT_DedAmount(strDeductibles_TXT_DedAmount),getDeductibles_TXT_DedAmountSearch(strDeductibles_TXT_DedAmount),strDeductibles_TXT_DedAmount,strDeductibles_TXT_DedAmountFilterNeeded,strDeductibles_TXT_DedAmount, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getDeductibles_TXT_PolicyAggDedAmount(strDeductibles_TXT_PolicyAggDedAmount),strDeductibles_TXT_PolicyAggDedAmount,test);
					se.element().enterOrValidateText(getDeductibles_TXT_CoinsuranceAmount(strDeductibles_TXT_CoinsuranceAmount),strDeductibles_TXT_CoinsuranceAmount,test);
					se.element().clickElement(getNext());
						
				
					
				}catch(Exception e) {
					
					se.verify().verifyEquals("Failed to fill in details for WC_Deductibles", true, false, true, test);
							
					}
							iteration++;
						}
					
				}
				catch (Exception e) {{
					
				}
					
					se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
					test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
					testTearDown(se, test);
				}
					
			}
}
