package pw.pages.COMMON;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_WC;

public class CAWC_AdditionalNamedInsured extends OR_WC {
public void AdditionalNamedInsured(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		
		try{
			
			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
			if(SuspendSheet.equalsIgnoreCase(constants.AddNamedInsured)){
				 test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
				testTearDown(se, test);
			}
			
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.AddNamedInsured, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
				String strAddNamedInsured_BTN_NamedInsured_Add = (String) row.get("AddNamedInsured_BTN_NamedInsured_Add");
				String strAddNamedInsured_BTN_NamedInsured_Remove = (String) row.get("AddNamedInsured_BTN_NamedInsured_Remove");
				String strAddNamedInsured_BTN_NamedInsured_Details = (String) row.get("AddNamedInsured_BTN_NamedInsured_Details");
				String strAddNamedInsured_CHK_NamedInsured_Select = (String) row.get("AddNamedInsured_CHK_NamedInsured_Select");
				String strAddNamedInsured_BTN_NamedInsured_Done = (String) row.get("AddNamedInsured_BTN_NamedInsured_Done");
				String strAddNamedInsured_TXT_NameType = (String) row.get("AddNamedInsured_TXT_NameType");
				String strAddNamedInsured_TXT_NameTypeFilterNeeded = (String) row.get("AddNamedInsured_TXT_NameTypeFilterNeeded");
				String strAddNamedInsured_TXT_Name = (String) row.get("AddNamedInsured_TXT_Name");
				String strAddNamedInsured_TXT_InsuredType = (String) row.get("AddNamedInsured_TXT_InsuredType");
				String strAddNamedInsured_TXT_InsuredTypeFilterNeeded = (String) row.get("AddNamedInsured_TXT_InsuredTypeFilterNeeded");
				String strAddNamedInsured_TXT_BusinessDesc = (String) row.get("AddNamedInsured_TXT_BusinessDesc");
				String strAddNamedInsured_TXT_YearsOfOperation = (String) row.get("AddNamedInsured_TXT_YearsOfOperation");
				String strAddNamedInsured_TXT_FEIN = (String) row.get("AddNamedInsured_TXT_FEIN");
				String strAddNamedInsured_TXT_EntityNumber = (String) row.get("AddNamedInsured_TXT_EntityNumber");
				String strAddNamedInsured_TXT_SequenceNumber = (String) row.get("AddNamedInsured_TXT_SequenceNumber");
				String strAddNamedInsured_BTN_NamedInsuredDBA_Add = (String) row.get("AddNamedInsured_BTN_NamedInsuredDBA_Add");
				String strAddNamedInsured_TXT_DBANameType = (String) row.get("AddNamedInsured_TXT_DBANameType");
				String strAddNamedInsured_TXT_DBANameTypeFilterNeeded = (String) row.get("AddNamedInsured_TXT_DBANameTypeFilterNeeded");
				String strAddNamedInsured_TXT_DBAName = (String) row.get("AddNamedInsured_TXT_DBAName");
				String strAddNamedInsured_TXT_DBAName2 = (String) row.get("AddNamedInsured_TXT_DBAName2");
				String strAddNamedInsured_TXT_DBA_FEIN = (String) row.get("AddNamedInsured_TXT_DBA_FEIN");
				String strAddNamedInsured_TXT_DBA_EntityNo = (String) row.get("AddNamedInsured_TXT_DBA_EntityNo");
				String strAddNamedInsured_TXT_DBA_SeqNo = (String) row.get("AddNamedInsured_TXT_DBA_SeqNo");
				String strAddNamedInsured_BTN_UnemploymentNumbers_ADD = (String) row.get("AddNamedInsured_BTN_UnemploymentNumbers_ADD");
				String strAddNamedInsured_TXT_UnemploymentState = (String) row.get("AddNamedInsured_TXT_UnemploymentState");
				String strAddNamedInsured_TXT_UnemploymentStateFilterNeeded = (String) row.get("AddNamedInsured_TXT_UnemploymentStateFilterNeeded");
				String strAddNamedInsured_TXT_StateUnemploymentNumber = (String) row.get("AddNamedInsured_TXT_StateUnemploymentNumber");
			
				try
				{
					se.log().logSeStep("WC_AdditionalNamedInsured");
					test.log(LogStatus.INFO, "WC_AdditionalNamedInsured","Transaction Step : "+ transaction + "<br>" +"Page : WC_AdditionalNamedInsured");
					se.verify().verifyEquals("WC_AdditionalNamedInsured page of PowerWriter ", getAddNamedInsured_LBL_LabelName().isDisplayed(),true, true,test);
	
					if(strAddNamedInsured_BTN_NamedInsured_Add.equalsIgnoreCase("Yes")){
						se.element().Click(getAddNamedInsured_BTN_NamedInsured_Add(),test);
					}
					
					if(!strAddNamedInsured_BTN_NamedInsured_Details.equalsIgnoreCase(constants.NA)){
						se.element().Click(getAddNamedInsured_BTN_NamedInsured_Details(strAddNamedInsured_BTN_NamedInsured_Details),test);
					}
					
					if(strAddNamedInsured_BTN_NamedInsured_Remove.equalsIgnoreCase("Yes")){
						se.element().Click(getAddNamedInsured_CHK_NamedInsured_Select(strAddNamedInsured_CHK_NamedInsured_Select),strAddNamedInsured_CHK_NamedInsured_Select,test);
						se.element().checkUncheckOrValidate(getAddNamedInsured_CHK_NamedInsured_Select(strAddNamedInsured_CHK_NamedInsured_Select),strAddNamedInsured_CHK_NamedInsured_Select,test);
						se.element().Click(getAddNamedInsured_BTN_NamedInsured_Remove(strAddNamedInsured_BTN_NamedInsured_Remove),test);
					}
									
					se.element().selectPopupWithMagnifier(getAddNamedInsured_TXT_NameType(strAddNamedInsured_TXT_NameType),getAddNamedInsured_TXT_NameTypeSearch(strAddNamedInsured_TXT_NameType),strAddNamedInsured_TXT_NameType,strAddNamedInsured_TXT_NameTypeFilterNeeded,strAddNamedInsured_TXT_NameType, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getAddNamedInsured_TXT_Name(strAddNamedInsured_TXT_Name),strAddNamedInsured_TXT_Name,test);
					se.element().selectPopupWithMagnifier(getAddNamedInsured_TXT_InsuredType(strAddNamedInsured_TXT_InsuredType),getAddNamedInsured_TXT_InsuredTypeSearch(strAddNamedInsured_TXT_InsuredType),strAddNamedInsured_TXT_InsuredType,strAddNamedInsured_TXT_InsuredTypeFilterNeeded,strAddNamedInsured_TXT_InsuredType, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getAddNamedInsured_TXT_BusinessDesc(strAddNamedInsured_TXT_BusinessDesc),strAddNamedInsured_TXT_BusinessDesc,test);
					se.element().enterOrValidateText(getAddNamedInsured_TXT_YearsOfOperation(strAddNamedInsured_TXT_YearsOfOperation),strAddNamedInsured_TXT_YearsOfOperation,test);
					se.element().enterOrValidateText(getAddNamedInsured_TXT_FEIN(strAddNamedInsured_TXT_FEIN),strAddNamedInsured_TXT_FEIN,test);
					se.element().enterOrValidateText(getAddNamedInsured_TXT_EntityNumber(strAddNamedInsured_TXT_EntityNumber),strAddNamedInsured_TXT_EntityNumber,test);
					se.element().enterOrValidateText(getAddNamedInsured_TXT_SequenceNumber(strAddNamedInsured_TXT_SequenceNumber),strAddNamedInsured_TXT_SequenceNumber,test);
					
					if(strAddNamedInsured_BTN_NamedInsuredDBA_Add.equalsIgnoreCase("Yes")){
					se.element().Click(getAddNamedInsured_BTN_NamedInsuredDBA_Add(strAddNamedInsured_BTN_NamedInsuredDBA_Add),test);
					}
					se.element().selectPopupWithMagnifier(getAddNamedInsured_TXT_DBANameType(strAddNamedInsured_TXT_DBANameType),getAddNamedInsured_TXT_DBANameTypeSearch(strAddNamedInsured_TXT_DBANameType),strAddNamedInsured_TXT_DBANameType,strAddNamedInsured_TXT_DBANameTypeFilterNeeded,strAddNamedInsured_TXT_DBANameType, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getAddNamedInsured_TXT_DBAName(strAddNamedInsured_TXT_DBAName),strAddNamedInsured_TXT_DBAName,test);
					se.element().enterOrValidateText(getAddNamedInsured_TXT_DBAName2(strAddNamedInsured_TXT_DBAName2),strAddNamedInsured_TXT_DBAName2,test);
					se.element().enterOrValidateText(getAddNamedInsured_TXT_DBA_FEIN(strAddNamedInsured_TXT_DBA_FEIN),strAddNamedInsured_TXT_DBA_FEIN,test);
					se.element().enterOrValidateText(getAddNamedInsured_TXT_DBA_EntityNo(strAddNamedInsured_TXT_DBA_EntityNo),strAddNamedInsured_TXT_DBA_EntityNo,test);
					se.element().enterOrValidateText(getAddNamedInsured_TXT_DBA_SeqNo(strAddNamedInsured_TXT_DBA_SeqNo),strAddNamedInsured_TXT_DBA_SeqNo,test);
					if(strAddNamedInsured_BTN_UnemploymentNumbers_ADD.equalsIgnoreCase("Yes")){
						se.element().Click(getAddNamedInsured_BTN_UnemploymentNumbers_ADD(strAddNamedInsured_BTN_UnemploymentNumbers_ADD),strAddNamedInsured_BTN_UnemploymentNumbers_ADD,test);
					}
					se.element().enterOrValidateText(getAddNamedInsured_TXT_StateUnemploymentNumber(strAddNamedInsured_TXT_StateUnemploymentNumber),strAddNamedInsured_TXT_StateUnemploymentNumber,test);
					se.element().selectPopupWithMagnifier(getAddNamedInsured_TXT_UnemploymentState(strAddNamedInsured_TXT_UnemploymentState),getAddNamedInsured_TXT_UnemploymentStateSearch(strAddNamedInsured_TXT_UnemploymentState),strAddNamedInsured_TXT_UnemploymentState,strAddNamedInsured_TXT_UnemploymentStateFilterNeeded,strAddNamedInsured_TXT_UnemploymentState, constants.NA, constants.NA,constants.NA,test);
					se.element().Click(getNext(),test);
					
					if(strAddNamedInsured_BTN_NamedInsured_Done.equalsIgnoreCase("Yes")){
						se.element().Click(getDone(),test);
						}
					
				}catch(Exception e) {
					se.verify().verifyEquals("Failed to fill in details for AdditionalNamedInsured", true, false, true, test);
							
					
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
