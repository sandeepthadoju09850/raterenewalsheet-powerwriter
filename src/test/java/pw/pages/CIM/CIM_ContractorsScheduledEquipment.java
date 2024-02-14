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

public class CIM_ContractorsScheduledEquipment extends OR_CIM {
	
	public void CIM_ContrScheduledEquip(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_ContractorsScheduledEquipme")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_ContractorsScheduledEquipme", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);      
		 String strCIM_ContractorsScheduledEquipment_BTN_Add=(String) row.get("CIM_ContractorsScheduledEquipment_BTN_Add");
 		 String strCIM_ContractorsScheduledEquipment_Edit=(String) row.get("CIM_ContractorsScheduledEquipment_Edit");
 		 String strCIM_ContractorsScheduledEquipment_Done=(String) row.get("CIM_ContractorsScheduledEquipment_Done");
         String strCIM_ContractorsScheduledEquipment_TXT_ItemNo=(String) row.get("CIM_ContractorsScheduledEquipment_TXT_ItemNo");
         String strCIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ActualCashValue=(String) row.get("CIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ActualCashValue");
         String strCIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ReplacementCost=(String) row.get("CIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ReplacementCost");
         String strCIM_ContractorsScheduledEquipment_TXT_DescOfScheduledEquipment=(String) row.get("CIM_ContractorsScheduledEquipment_TXT_DescOfScheduledEquipment");
         String strCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentLimit=(String) row.get("CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentLimit");
         String strCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentDescDed=(String) row.get("CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentDescDed");
         String strCIM_ContractorsScheduledEquipment_TXT_SelectItemType=(String) row.get("CIM_ContractorsScheduledEquipment_TXT_SelectItemType");
         String strCIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_Yes=(String) row.get("CIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_Yes");
         String strCIM_ContractorsScheduledEquipment_TXT_OverrideReason=(String) row.get("CIM_ContractorsScheduledEquipment_TXT_OverrideReason");
         String strCIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_No=(String) row.get("CIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_No");
         String strCIM_ContractorsScheduledEquipment_TXT_OverrideReasonFilterNeeded = (String) row.get("CIM_ContractorsScheduledEquipment_TXT_OverrideReasonFilterNeeded");
         String strCIM_ContractorsScheduledEquipment_TXT_BaseRate=(String) row.get("CIM_ContractorsScheduledEquipment_TXT_BaseRate");
         String strCIM_ContractorsScheduledEquipment_TXT_BaseRateOverride=(String) row.get("CIM_ContractorsScheduledEquipment_TXT_BaseRateOverride");
         String strCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipDescDedFtr=(String) row.get("CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipDescDedFtr");
         String strCIM_ContractorsScheduledEquipment_TXT_TransitionFtr=(String) row.get("CIM_ContractorsScheduledEquipment_TXT_TransitionFtr");
         String strCIM_ContractorsScheduledEquipment_TXT_FinalRate=(String) row.get("CIM_ContractorsScheduledEquipment_TXT_FinalRate");
         String strCIM_ContractorsScheduledEquipment_TXT_OverrideFinalRate=(String) row.get("CIM_ContractorsScheduledEquipment_TXT_OverrideFinalRate");
         String strCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipLimit=(String) row.get("CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipLimit");
         String strCIM_ContractorsScheduledEquipment_TXT_Premium=(String) row.get("CIM_ContractorsScheduledEquipment_TXT_Premium");
         String strCIM_ContractorsScheduledEquipment_TXT_OverridePremium=(String) row.get("CIM_ContractorsScheduledEquipment_TXT_OverridePremium");                
         String strCIM_ContractorsScheduledEquipment_CHK_5years_Yes=(String) row.get("CIM_ContractorsScheduledEquipment_CHK_5years_Yes");                
         String strCIM_ContractorsScheduledEquipment_CHK_5years_No=(String) row.get("CIM_ContractorsScheduledEquipment_CHK_5years_No");                
         String strTransaction  = (String) row.get("Transaction Name");
         
         try{
	        
        	se.log().logTestStep("ContractorsScheduledEquipment");
 			test.log(LogStatus.INFO, "ContractorsScheduledEquipment page","Transaction Step : " + strTransaction + "<br>" +"Page : CIM_ContractorsScheduledEquipment");
        	
       		  if(strCIM_ContractorsScheduledEquipment_BTN_Add.equalsIgnoreCase("Yes")){
     				se.element().clickElement(CIM_ContractorsScheduledEquipment_BTN_Add);
     			}
       		  
     			if(strCIM_ContractorsScheduledEquipment_Edit.equalsIgnoreCase("Yes")){
     				se.element().Click(getCIM_ContractorsScheduledEquipment_Edit(strCIM_ContractorsScheduledEquipment_Edit),test);
     			}
     		  se.element().enterOrValidateText(getCIM_ContractorsScheduledEquipment_TXT_ItemNo(strCIM_ContractorsScheduledEquipment_TXT_ItemNo),strCIM_ContractorsScheduledEquipment_TXT_ItemNo,test);
       		  se.element().checkUncheckOrValidate(getCIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ActualCashValue(strCIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ActualCashValue),strCIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ActualCashValue,test);
       		  se.element().checkUncheckOrValidate(getCIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ReplacementCost(strCIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ReplacementCost),strCIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ReplacementCost,test);
       		  se.element().enterOrValidateText(getCIM_ContractorsScheduledEquipment_TXT_DescOfScheduledEquipment(strCIM_ContractorsScheduledEquipment_TXT_DescOfScheduledEquipment),strCIM_ContractorsScheduledEquipment_TXT_DescOfScheduledEquipment,test);
       		  se.element().enterOrValidateText(getCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentLimit(strCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentLimit),strCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentLimit,test);
       		  se.element().selectPopupWithMagnifier(getCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentDescDed(strCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentDescDed), getCIM_ContractorsScheduledEquipment_BTN_ScheduledEquipmentDescDed(strCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentDescDed), strCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentDescDed,constants.NA, strCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentDescDed,constants.NA, constants.NA, constants.NA, test);
    		  se.element().selectPopupWithMagnifier(getCIM_ContractorsScheduledEquipment_TXT_SelectItemType(strCIM_ContractorsScheduledEquipment_TXT_SelectItemType), getCIM_ContractorsScheduledEquipment_BTN_SelectItemType(strCIM_ContractorsScheduledEquipment_TXT_SelectItemType), strCIM_ContractorsScheduledEquipment_TXT_SelectItemType,constants.NA, strCIM_ContractorsScheduledEquipment_TXT_SelectItemType,constants.NA, constants.NA, constants.NA, test);
    		  se.element().checkUncheckOrValidate(getCIM_ContractorsScheduledEquipment_CHK_5years_Yes(strCIM_ContractorsScheduledEquipment_CHK_5years_Yes),strCIM_ContractorsScheduledEquipment_CHK_5years_Yes,test);
       		  se.element().checkUncheckOrValidate(getCIM_ContractorsScheduledEquipment_CHK_5years_No(strCIM_ContractorsScheduledEquipment_CHK_5years_No),strCIM_ContractorsScheduledEquipment_CHK_5years_No,test);
     		    if(strCIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_Yes.equalsIgnoreCase("Check"))
            { 
       		  se.element().checkUncheckOrValidate(getCIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_Yes(strCIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_Yes),strCIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_Yes,test);
       		  se.element().selectPopupWithMagnifier(getCIM_ContractorsScheduledEquipment_TXT_OverrideReason(strCIM_ContractorsScheduledEquipment_TXT_OverrideReason), getCIM_ContractorsScheduledEquipment_TXT_OverrideReasonSearch(strCIM_ContractorsScheduledEquipment_TXT_OverrideReason), strCIM_ContractorsScheduledEquipment_TXT_OverrideReason,strCIM_ContractorsScheduledEquipment_TXT_OverrideReasonFilterNeeded, strCIM_ContractorsScheduledEquipment_TXT_OverrideReason,constants.NA, constants.NA, constants.NA, test);
    		  se.element().enterOrValidateText(getCIM_ContractorsScheduledEquipment_TXT_BaseRate(strCIM_ContractorsScheduledEquipment_TXT_BaseRate),strCIM_ContractorsScheduledEquipment_TXT_BaseRate,test);
       		  se.element().enterOrValidateText(getCIM_ContractorsScheduledEquipment_TXT_BaseRateOverride(strCIM_ContractorsScheduledEquipment_TXT_BaseRateOverride),strCIM_ContractorsScheduledEquipment_TXT_BaseRateOverride,test);
       		  se.element().enterOrValidateText(getCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipDescDedFtr(strCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipDescDedFtr),strCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipDescDedFtr,test);
       		  se.element().enterOrValidateText(getCIM_ContractorsScheduledEquipment_TXT_TransitionFtr(strCIM_ContractorsScheduledEquipment_TXT_TransitionFtr),strCIM_ContractorsScheduledEquipment_TXT_TransitionFtr,test);
       		  se.element().enterOrValidateText(getCIM_ContractorsScheduledEquipment_TXT_FinalRate(strCIM_ContractorsScheduledEquipment_TXT_FinalRate),strCIM_ContractorsScheduledEquipment_TXT_FinalRate,test);
       		  se.element().enterOrValidateText(getCIM_ContractorsScheduledEquipment_TXT_OverrideFinalRate(strCIM_ContractorsScheduledEquipment_TXT_OverrideFinalRate),strCIM_ContractorsScheduledEquipment_TXT_OverrideFinalRate,test);
       		  se.element().enterOrValidateText(getCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipLimit(strCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipLimit),strCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipLimit,test);
       		  se.element().enterOrValidateText(getCIM_ContractorsScheduledEquipment_TXT_Premium(strCIM_ContractorsScheduledEquipment_TXT_Premium),strCIM_ContractorsScheduledEquipment_TXT_Premium,test);
       		  se.element().enterOrValidateText(getCIM_ContractorsScheduledEquipment_TXT_OverridePremium(strCIM_ContractorsScheduledEquipment_TXT_OverridePremium),strCIM_ContractorsScheduledEquipment_TXT_OverridePremium,test);
            }
              se.element().checkUncheckOrValidate(getCIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_No(strCIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_No),strCIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_No,test);
       		  se.element().Click(getNext(), test);
       		  se.util().sleep(1000);
       		  
       		  if(strCIM_ContractorsScheduledEquipment_Done.equalsIgnoreCase("Yes")){
     				se.element().Click(getNext(), test);
     			}
 	       }
	       catch(Exception e){
	              se.verify().verifyEquals("Failed to fill in details for CP_CIMContrScheduledEquip ", true, false, true, test);
	              {
	            	  
	              }
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
