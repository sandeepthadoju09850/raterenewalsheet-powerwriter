package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class CP_PropertyAdditionalInterests extends BL_OR_CP {
	public void CP_PropertyAdditionalInterests_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Property_Additional_Interests)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.Property_Additional_Interests, strRegressionID, transaction);
	int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strPropAdditionalInts_DD_InterestAppllesTo = (String) row.get("PropAdditionalInts_DD_InterestAppllesTo");
			String strPropAdditionalInts_DD_Location = (String) row.get("PropAdditionalInts_DD_Location");
			String strPropAdditionalInts_DD_Building = (String) row.get("PropAdditionalInts_DD_Building");
			String strPropAdditionalInts_DD_InterestType = (String) row.get("PropAdditionalInts_DD_InterestType");
			String strPropAdditionalInts_TXT_Explanation = (String) row.get("PropAdditionalInts_TXT_Explanation");
			String strPropAdditionalInts_TXT_DescriptionOfCoveredProperty = (String) row.get("PropAdditionalInts_TXT_DescriptionOfCoveredProperty");
			String strPropAdditionalInts_TXT_AdditionalInterestName = (String) row.get("PropAdditionalInts_TXT_AdditionalInterestName");
			String strPropAdditionalInts_TXT_StreetAddressLine1 = (String) row.get("PropAdditionalInts_TXT_StreetAddressLine1");
			String strPropAdditionalInts_TXT_StreetAddressLine2 = (String) row.get("PropAdditionalInts_TXT_StreetAddressLine2");
			String strPropAdditionalInts_TXT_City = (String) row.get("PropAdditionalInts_TXT_City");
			String strPropAdditionalInts_DD_State = (String) row.get("PropAdditionalInts_DD_State");
			String strPropAdditionalInts_TXT_ZipCode = (String) row.get("PropAdditionalInts_TXT_ZipCode");
			String strPropAdditionalInts_BTN_Add = (String) row.get("PropAdditionalInts_BTN_ADDNew");
			String strPropAdditionalInts_BTN_Edit = (String) row.get("PropAdditionalInts_BTN_Edit");
			String strPropAdditionalInts_EditOrDelete = (String) row.get("PropAdditionalInts_EditOrDelete");
			
			
			try {
				se.util().sleep(2000);
				se.log().logTestStep("CP_PropertyAdditionalInterests_Details");
				test.log(LogStatus.INFO, "CP_PropertyAdditionalInterests_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_PropertyAdditionalInterests_Details");
				se.verify().verifyEquals("CP_PropertyAdditionalInterests_Details  of AgencyPortal ", getPropAdditionalInts_label().isDisplayed(),true, true,test);
				if(strPropAdditionalInts_BTN_Add.contains("Add"))
				{
					se.element().Click(getBuildingandOccupantSelection_BTN_AddNew(strPropAdditionalInts_BTN_Add), test);
					//se.util().sleep(3000);
				}else if(strPropAdditionalInts_BTN_Edit.contains("Edit")) {
					se.element().Click(getPropAdditionalInts_BTN_Edit(strPropAdditionalInts_EditOrDelete), test);
					
				}
					se.element().SelectElement(PropAdditionalInts_DD_InterestAppllesTo, strPropAdditionalInts_DD_InterestAppllesTo, test);
					//se.util().sleep(2000);
					se.element().SelectElement(PropAdditionalInts_DD_Location, strPropAdditionalInts_DD_Location, test);
					//se.util().sleep(2000);
					se.element().SelectElement(PropAdditionalInts_DD_Building, strPropAdditionalInts_DD_Building, test);
					se.element().SelectElement(PropAdditionalInts_DD_InterestType, strPropAdditionalInts_DD_InterestType, test);
					se.element().enterOrValidateText(getPropAdditionalInts_TXT_Explanation(strPropAdditionalInts_TXT_Explanation),strPropAdditionalInts_TXT_Explanation,test);
					se.element().enterOrValidateText(getPropAdditionalInts_TXT_DescriptionOfCoveredProperty(strPropAdditionalInts_TXT_DescriptionOfCoveredProperty),strPropAdditionalInts_TXT_DescriptionOfCoveredProperty,test);
					se.element().enterOrValidateText(getPropAdditionalInts_TXT_AdditionalInterestName(strPropAdditionalInts_TXT_AdditionalInterestName),strPropAdditionalInts_TXT_AdditionalInterestName,test);
					se.element().enterOrValidateText(getPropAdditionalInts_TXT_StreetAddressLine1(strPropAdditionalInts_TXT_StreetAddressLine1),strPropAdditionalInts_TXT_StreetAddressLine1,test);
					se.element().enterOrValidateText(getPropAdditionalInts_TXT_StreetAddressLine2(strPropAdditionalInts_TXT_StreetAddressLine2),strPropAdditionalInts_TXT_StreetAddressLine2,test);
					se.element().enterOrValidateText(getPropAdditionalInts_TXT_City(strPropAdditionalInts_TXT_City),strPropAdditionalInts_TXT_City,test);
					se.element().SelectElement(PropAdditionalInts_DD_State, strPropAdditionalInts_DD_State, test);
					se.element().enterOrValidateText(getPropAdditionalInts_TXT_ZipCode(strPropAdditionalInts_TXT_ZipCode),strPropAdditionalInts_TXT_ZipCode,test);
					if(strPropAdditionalInts_BTN_Add.contains("Add"))
					{
						se.element().Click(getBuildingandOccupSelection_BTN_Add(), test);
					}else if(strPropAdditionalInts_BTN_Edit.contains("Edit")) {
						se.element().Click(getBuildingDetails_BTN_Save(), test);
						se.util().sleep(5000);
					}
				
				
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_PropertyAdditionalInterests_Details ", true, false, true, test);
			}
			iteration++;
		}
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
