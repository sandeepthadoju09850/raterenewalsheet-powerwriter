package ap.pages.CA;

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

public class CA_Garagekeepers extends BL_OR_CP {

	public void CA_Garagekeepers_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Garagekeepers)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.Garagekeepers, strRegressionID, transaction);
		int iteration = 0;

		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strGaragekeepers_DD_Location = (String) row.get("Garagekeepers_DD_Location");
			String strGaragekeepers_DD_PriRatingBasis = (String) row.get("Garagekeepers_DD_PriRatingBasis");
			String strGaragekeepers_DD_Classification = (String) row.get("Garagekeepers_DD_Classification");
			String strGaragekeepers_CHK_Comprehensive = (String) row.get("Garagekeepers_CHK_Comprehensive");
			String strGaragekeepers_CHK_AllPerilsDed = (String) row.get("Garagekeepers_CHK_AllPerilsDed");
			String strGaragekeepers_DD_DeductiblePer = (String) row.get("Garagekeepers_DD_DeductiblePer");
			String strGaragekeepers_TXT_CompreMaxLimit = (String) row.get("Garagekeepers_TXT_CompreMaxLimit");
			String strGaragekeepers_CHK_Collision = (String) row.get("Garagekeepers_CHK_Collision");
			String strGaragekeepers_DD_Deductible = (String) row.get("Garagekeepers_DD_Deductible");
			String strGaragekeepers_TXT_CollisionMaxLimit = (String) row.get("Garagekeepers_TXT_CollisionMaxLimit");
			String strGaragekeepers_BTN_Edit = (String) row.get("Garagekeeper_BTN_Edit");
			String strGaragekeepers_BTN_EditLoc = (String) row.get("Garagekeeper_BTN_EditLoc");
			String strGaragekeepers_BTN_Add = (String) row.get("Garagekeeper_BTN_Add");
			//String strGaragekeepers_BTN_AddLoc = (String) row.get("Garagekeeper_BTN_AddLoc");
			try {
				se.log().logTestStep("CA_Garagekeeperss");
				test.log(LogStatus.INFO, "CA_Garagekeeperss","Transaction Step : "+transaction + "<br>" +"Page : CA_Garagekeeperss");
				se.verify().verifyEquals("CA_Garagekeeperss  of AgencyPortal ", getLBLGaragekeepers().isDisplayed(),true, true,test);
				if(strGaragekeepers_BTN_Edit.equals("Edit"))
				{
					se.element().Click(getLocations_BTN_Edit(strGaragekeepers_BTN_EditLoc), test);
					se.element().selectElement(Garagekeepers_DD_Location, strGaragekeepers_DD_Location);
					se.element().selectElement(Garagekeepers_DD_PriRatingBasis, strGaragekeepers_DD_PriRatingBasis);
					se.element().selectElement(Garagekeepers_DD_Classification, strGaragekeepers_DD_Classification);
					se.element().checkUncheckOrValidate(getGaragekeepers_CHK_Comprehensive(strGaragekeepers_CHK_Comprehensive),strGaragekeepers_CHK_Comprehensive,test);
					se.element().checkUncheckOrValidate(getGaragekeepers_CHK_AllPerilsDed(strGaragekeepers_CHK_AllPerilsDed),strGaragekeepers_CHK_AllPerilsDed,test);
					se.element().selectElement(Garagekeepers_DD_DeductiblePer, strGaragekeepers_DD_DeductiblePer);
					se.element().enterOrValidateText(getGaragekeepers_TXT_CompreMaxLimit(strGaragekeepers_TXT_CompreMaxLimit), strGaragekeepers_TXT_CompreMaxLimit,test);
					se.element().checkUncheckOrValidate(getGaragekeepers_CHK_Collision(strGaragekeepers_CHK_Collision),strGaragekeepers_CHK_Collision,test);
					se.element().selectElement(Garagekeepers_DD_Deductible, strGaragekeepers_DD_Deductible);
					se.element().enterOrValidateText(getGaragekeepers_TXT_CollisionMaxLimit(strGaragekeepers_TXT_CollisionMaxLimit), strGaragekeepers_TXT_CollisionMaxLimit,test);
					se.element().Click(getLocations_BTN_Save(), test);
				}
				else if(strGaragekeepers_BTN_Add.equals("Add"))
				{
					if(iteration>=1) {
						se.element().Click(getLocations_BTN_AddNew(strGaragekeepers_BTN_Add), test);
					}
					se.element().selectElement(Garagekeepers_DD_Location, strGaragekeepers_DD_Location);
					se.element().selectElement(Garagekeepers_DD_PriRatingBasis, strGaragekeepers_DD_PriRatingBasis);
					se.element().selectElement(Garagekeepers_DD_Classification, strGaragekeepers_DD_Classification);
					se.element().checkUncheckOrValidate(getGaragekeepers_CHK_Comprehensive(strGaragekeepers_CHK_Comprehensive),strGaragekeepers_CHK_Comprehensive,test);
					se.element().checkUncheckOrValidate(getGaragekeepers_CHK_AllPerilsDed(strGaragekeepers_CHK_AllPerilsDed),strGaragekeepers_CHK_AllPerilsDed,test);
					se.element().selectElement(Garagekeepers_DD_DeductiblePer, strGaragekeepers_DD_DeductiblePer);
					se.element().enterOrValidateText(getGaragekeepers_TXT_CompreMaxLimit(strGaragekeepers_TXT_CompreMaxLimit), strGaragekeepers_TXT_CompreMaxLimit,test);
					se.element().checkUncheckOrValidate(getGaragekeepers_CHK_Collision(strGaragekeepers_CHK_Collision),strGaragekeepers_CHK_Collision,test);
					se.element().selectElement(Garagekeepers_DD_Deductible, strGaragekeepers_DD_Deductible);
					se.element().enterOrValidateText(getGaragekeepers_TXT_CollisionMaxLimit(strGaragekeepers_TXT_CollisionMaxLimit), strGaragekeepers_TXT_CollisionMaxLimit,test);
					se.element().Click(getAdd_Button(), test);
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CA_Garagekeeperss_Details ", true, false, true, test);
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
