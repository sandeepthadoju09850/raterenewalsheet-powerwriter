package ap.pages.CA;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;

public class CA_TrailerInterchange extends OR_CP  {

	public void CA_TrailerInterchange_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.TrailerInterchange)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.TrailerInterchange, strRegressionID, transaction);
		int iteration = 0;

		while (iteration < table.size()) {
			se.util().sleep(5000);
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strTraInt_BTN_AddNew= (String) row.get("TraInt_BTN_AddNew");
			String strTraInt_BTN_EditLoc= (String) row.get("TraInt_BTN_EditLoc");
			String strTraInt_DD_State= (String) row.get("TraInt_DD_State");
			String strTraInt_TXT_NumOfTrailers= (String) row.get("TraInt_TXT_NumOfTrailers");
			String strTraInt_TXT_NumOfDaysCov= (String) row.get("TraInt_TXT_NumOfDaysCov");
			String strTraInt_DD_Radius= (String) row.get("TraInt_DD_Radius");
			String strTraInt_DD_Metropolitan= (String) row.get("TraInt_DD_Metropolitan");
			String strTraInt_DD_PrincipalGaragZone= (String) row.get("TraInt_DD_PrincipalGaragZone");
			String strTraInt_TXT_LegalLiabilityPD= (String) row.get("TraInt_TXT_LegalLiabilityPD");
			String strTraInt_CHK_Comprehensive= (String) row.get("TraInt_CHK_Comprehensive");
			String strTraInt_CHK_Collision= (String) row.get("TraInt_CHK_Collision");
			String strTraInt_DD_CollisionDeduct= (String) row.get("TraInt_DD_CollisionDeduct");
			String strTraInt_BTN_Edit= (String) row.get("TraInt_BTN_Edit");
						
			try {
				se.log().logTestStep("CA_TrailerInterchange");
				test.log(LogStatus.INFO, "CA_TrailerInterchange","Transaction Step : "+transaction + "<br>" +"Page : CA_TrailerInterchange");
				se.verify().verifyEquals("CA_TrailerInterchange  of AgencyPortal ", getmenu_lnk_TrailerInterchange().isDisplayed(),true, true,test);
				if(strTraInt_BTN_Edit.equals("Edit"))
				{
					se.element().Click(getLocations_BTN_Edit(strTraInt_BTN_EditLoc), test);
					se.element().SelectElement(TraIntSch_DD_State, strTraInt_DD_State, test);
					se.element().enterOrValidateText(getTraInt_TXT_NumOfTrailers(strTraInt_TXT_NumOfTrailers), strTraInt_TXT_NumOfTrailers, test);
					se.element().enterOrValidateText(getTraInt_TXT_NumOfDaysCov(strTraInt_TXT_NumOfDaysCov), strTraInt_TXT_NumOfDaysCov, test);
					se.element().SelectElement(TraInt_DD_Radius, strTraInt_DD_Radius,test);
					se.element().SelectElement(TraInt_DD_Metropolitan, strTraInt_DD_Metropolitan,test);
					se.element().SelectElement(TraInt_DD_PrincipalGaragZone, strTraInt_DD_PrincipalGaragZone,test);
					se.element().enterOrValidateText(getTraInt_TXT_LegalLiabilityPD(strTraInt_TXT_LegalLiabilityPD), strTraInt_TXT_LegalLiabilityPD, test);
					se.element().checkUncheckOrValidate(getTraInt_CHK_Comprehensive(strTraInt_CHK_Comprehensive), strTraInt_CHK_Comprehensive, test);
					se.element().checkUncheckOrValidate(getTraInt_CHK_Collision(strTraInt_CHK_Collision), strTraInt_CHK_Collision, test);
					se.element().SelectElement(TraInt_DD_CollisionDeduct, strTraInt_DD_CollisionDeduct,test);
					se.element().Click(getLocations_BTN_Save(), test);
				}
				else if(strTraInt_BTN_AddNew.equals("Add"))
				{
					if(iteration>=1) {
						se.element().Click(getLocations_BTN_AddNew(strTraInt_BTN_AddNew), test); 
						}
					se.element().SelectElement(TraIntSch_DD_State, strTraInt_DD_State, test);
					se.element().enterOrValidateText(getTraInt_TXT_NumOfTrailers(strTraInt_TXT_NumOfTrailers), strTraInt_TXT_NumOfTrailers, test);
					se.element().enterOrValidateText(getTraInt_TXT_NumOfDaysCov(strTraInt_TXT_NumOfDaysCov), strTraInt_TXT_NumOfDaysCov, test);
					se.element().SelectElement(TraInt_DD_Radius, strTraInt_DD_Radius,test);
					se.element().SelectElement(TraInt_DD_Metropolitan, strTraInt_DD_Metropolitan,test);
					se.element().SelectElement(TraInt_DD_PrincipalGaragZone, strTraInt_DD_PrincipalGaragZone,test);
					se.element().enterOrValidateText(getTraInt_TXT_LegalLiabilityPD(strTraInt_TXT_LegalLiabilityPD), strTraInt_TXT_LegalLiabilityPD, test);
					se.element().checkUncheckOrValidate(getTraInt_CHK_Comprehensive(strTraInt_CHK_Comprehensive), strTraInt_CHK_Comprehensive, test);
					se.element().checkUncheckOrValidate(getTraInt_CHK_Collision(strTraInt_CHK_Collision), strTraInt_CHK_Collision, test);
					se.element().SelectElement(TraInt_DD_CollisionDeduct, strTraInt_DD_CollisionDeduct,test);
					se.element().Click(getAdd_Button(), test);
			}
				}
			catch(Exception e){
				e.printStackTrace();
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for CA_Trailer Interchange ", true, false, true, test);
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
