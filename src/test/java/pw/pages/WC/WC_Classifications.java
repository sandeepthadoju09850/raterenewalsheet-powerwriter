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

public class WC_Classifications extends OR_WC {
public void  Classifications(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			    if(suspendSheet.equalsIgnoreCase(constants.WC_Classifications)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.WC_Classifications, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strClassifications_TXT_SubCodeOption =(String) row.get("Classifications_TXT_SubCodeOption");
				
				String strClassifications_TXT_ClassDescriptionOption =(String) row.get("Classifications_TXT_ClassDescriptionOption");
				String strClassifications_CHK_Row_Select = (String) row.get("Classifications_CHK_Row_Select");
				String strClassifications_BTN_Add = (String) row.get("Classifications_BTN_Add");
				String strClassifications_BTN_Details = (String) row.get("Classifications_BTN_Details");
				String strClassifications_BTN_Done = (String) row.get("Classifications_BTN_Done");
				String strClassifications_BTN_Delete = (String) row.get("Classifications_BTN_Delete");
				String strClassifications_TXT_LocationNo = (String) row.get("Classifications_TXT_LocationNo");
				String strClassifications_TXT_LocationNoFilterNeeded = (String) row.get("Classifications_TXT_LocationNoFilterNeeded");
				String strClassifications_TXT_ClassLocName = (String) row.get("Classifications_TXT_ClassLocName");
				String strClassifications_TXT_ClassLocDesc = (String) row.get("Classifications_TXT_ClassLocDesc");
				String strClassifications_TXT_ClassCode = (String) row.get("Classifications_TXT_ClassCode");
				String strClassifications_TXT_ClassCodeFilterNeeded = (String) row.get("Classifications_TXT_ClassCodeFilterNeeded");
				String strClassifications_TXT_DescriptionCode = (String) row.get("Classifications_TXT_DescriptionCode");
				String strClassifications_TXT_ClassDescription = (String) row.get("Classifications_TXT_ClassDescription");
				String strClassifications_CHK_ApplyUSLH = (String) row.get("Classifications_CHK_ApplyUSLH");
				String strClassifications_CHK_StatusIfAnyNo = (String) row.get("Classifications_CHK_StatusIfAnyNo");
				String strClassifications_CHK_StatusIfAnyYes = (String) row.get("Classifications_CHK_StatusIfAnyYes");
				String strClassifications_TXT_AnnualExposure = (String) row.get("Classifications_TXT_AnnualExposure");
				String strClassifications_TXT_NumOfFullTimeEmployee = (String) row.get("Classifications_TXT_NumOfFullTimeEmployee");
				String strClassifications_TXT_NumOfPartTimeEmployee = (String) row.get("Classifications_TXT_NumOfPartTimeEmployee");


			
				try
				{
					test.log(LogStatus.INFO, "WC_Classifications","Transaction Step : "+ transaction + "<br>" +"Page : WC_Classifications");
					se.log().logSeStep("Selecting WC_Classifications ");
					se.verify().verifyEquals("WC_Classifications page of PowerWriter ", getClassifications_BTN_Label().isDisplayed(),true, true,test);
					
					if(strClassifications_BTN_Add.equalsIgnoreCase("Yes")){
						se.element().Click(getClassifications_BTN_Add(strClassifications_BTN_Add),test);
					}
						
					
					if(!strClassifications_BTN_Details.equalsIgnoreCase("N/A")){
						se.element().Click(getClassifications_BTN_Details(strClassifications_BTN_Details), test);
					}
					if(strClassifications_BTN_Delete.equalsIgnoreCase("Yes")){
						se.element().checkUncheckOrValidate(getClassifications_CHK_Row_Select(strClassifications_CHK_Row_Select),"Check",test);
						se.element().Click(getClassifications_BTN_Delete(strClassifications_BTN_Delete), test);
						
					}
					
					se.element().selectPopupWithMagnifier(getClassifications_TXT_LocationNo(strClassifications_TXT_LocationNo),getClassifications_TXT_LocationNoSearch(strClassifications_TXT_LocationNo),strClassifications_TXT_LocationNo,strClassifications_TXT_LocationNoFilterNeeded,strClassifications_TXT_LocationNo, constants.NA, constants.NA,constants.NA,test);
					se.element().selectPopupWithMagnifier(getClassifications_TXT_ClassCode(strClassifications_TXT_ClassCode),getClassifications_TXT_ClassCodeSearch(strClassifications_TXT_ClassCode),strClassifications_TXT_ClassCode,strClassifications_TXT_ClassCodeFilterNeeded,strClassifications_TXT_ClassCode, strClassifications_TXT_SubCodeOption, strClassifications_TXT_ClassDescriptionOption,constants.NA,test);

					se.element().enterOrValidateText(getClassifications_TXT_DescriptionCode(strClassifications_TXT_DescriptionCode),strClassifications_TXT_DescriptionCode,test);
					se.element().enterOrValidateText(getClassifications_TXT_ClassDescription(strClassifications_TXT_ClassDescription),strClassifications_TXT_ClassDescription,test);
					se.element().checkUncheckOrValidate(getClassifications_CHK_ApplyUSLH(strClassifications_CHK_ApplyUSLH),strClassifications_CHK_ApplyUSLH,test);
					se.element().checkUncheckOrValidate(getClassifications_CHK_StatusIfAnyNo(strClassifications_CHK_StatusIfAnyNo),strClassifications_CHK_StatusIfAnyNo,test);
					se.element().checkUncheckOrValidate(getClassifications_CHK_StatusIfAnyYes(strClassifications_CHK_StatusIfAnyYes),strClassifications_CHK_StatusIfAnyYes,test);
					se.element().enterOrValidateText(getClassifications_TXT_AnnualExposure(strClassifications_TXT_AnnualExposure),strClassifications_TXT_AnnualExposure,test);
					se.element().enterOrValidateText(getClassifications_TXT_NumOfFullTimeEmployee(strClassifications_TXT_NumOfFullTimeEmployee),strClassifications_TXT_NumOfFullTimeEmployee,test);
					se.element().enterOrValidateText(getClassifications_TXT_NumOfPartTimeEmployee(strClassifications_TXT_NumOfPartTimeEmployee),strClassifications_TXT_NumOfPartTimeEmployee,test);
					se.element().enterOrValidateText(getClassifications_TXT_LocationNo(strClassifications_TXT_LocationNo),strClassifications_TXT_LocationNo,test);

					se.element().enterOrValidateText(getClassifications_TXT_ClassLocName(strClassifications_TXT_ClassLocName),strClassifications_TXT_ClassLocName,test);
					se.element().enterOrValidateText(getClassifications_TXT_ClassLocDesc(strClassifications_TXT_ClassLocDesc),strClassifications_TXT_ClassLocDesc,test);
					se.element().clickElement(getNext());
					
					if(strClassifications_BTN_Done.equalsIgnoreCase(constants.Yes)){
						se.element().Click(getDone(),test);	
					}
					
				
					
				}catch(Exception e) {
					se.verify().verifyEquals("Failed to fill in details for WC_Classifications", true, false, true, test);
							
					
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
