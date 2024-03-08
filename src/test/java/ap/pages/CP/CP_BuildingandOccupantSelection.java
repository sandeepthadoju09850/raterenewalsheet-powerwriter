package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.Utils.TestPageFactory;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;
import ap.pages.common.APPW_CommonMethods;

public class CP_BuildingandOccupantSelection extends OR_CP{
	String Edit ="Edit";
	String Delete ="Delete";
	public void CP_BuildandOccupantSelection_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Building_And_Occupant_Selection)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Building_And_Occupant_Selection, strRegressionID, transaction);
		int iteration = 0;
		APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class);
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strBuildingandOccupSelection_BTN_Add = (String) row.get("BuildingandOccupSelection_BTN_Add");
			String strBuildingandOccupSelection_DD_Loc = (String) row.get("BuildingandOccupSelection_DD_Loc");
			String strBuildingandOccupSelection_Label_BuildingNo = (String) row.get("BuildingandOccupSelection_Label_BuildingNo");
			String strBuildingandOccupSelection_DD_SelectanOccupant = (String) row.get("BuildingandOccupSelection_DD_SelectanOccupant");
			String strBuildingandOccupSelection_BTN_Edit = (String) row.get("BuildingandOccupSelection_BTN_Edit");
			String strBuildingandOccupSelection_BTN_Edit_Loc = (String) row.get("BuildingandOccupSelection_BTN_Edit_Loc");
			String strBuildingandOccupSelection_BTN_Delete = (String) row.get("BuildingandOccupSelection_BTN_Delete");
			String strBuildingandOccupSelection_BTN_Delete_Loc = (String) row.get("BuildingandOccupSelection_BTN_Delete_Loc");
			String strBuildingandOccupSelection_DeleteMessage = (String) row.get("BuildingandOccupSelection_DeleteMessage");
			String strBuildingandOccupSelection_EditMessage = (String) row.get("BuildingandOccupSelection_EditMessage");
			try {
				se.log().logTestStep("CP_BuildingandOccupantSelection");
				test.log(LogStatus.INFO, "CP_BuildingandOccupantSelection","Transaction Step : "+transaction + "<br>" +"Page : CP_BuildingandOccupantSelection");
				se.verify().verifyEquals("CP_BuildingandOccupantSelection  of AgencyPortal ", getBuildingandOccupantSelection_label().isDisplayed(),true, true,test);
				
				
					int count=0;
					if(iteration>=1||transaction.contains("RedoNewQuote")) {
						se.element().Click(getBuildingandOccupantSelection_BTN_AddNew(strBuildingandOccupSelection_BTN_Add), test);
					}
					if(!suspendSheet.equalsIgnoreCase(constants.Building_Details)){
						APPW_CommonMethods.refreshWhen502error( this.getClass().getSimpleName(), 2,  test);
					}
					se.element().SelectElement(BuildingandOccupSelection_DD_Loc, strBuildingandOccupSelection_DD_Loc,test);
					se.element().waitForElement(progressBar,120);
					se.element().waitBasedOnCount(PleaseWaitPopup,40);
					count=0;
					verifyConnectionError(count,test);
					se.element().enterOrValidateText(getBuildingandOccupSelection_Label_BuildingNo(strBuildingandOccupSelection_Label_BuildingNo),strBuildingandOccupSelection_Label_BuildingNo,test);
					
					//se.element().waitForElementtoText(getBuildingandOccupSelection_DD_SelectanOccupant(),600,strBuildingandOccupSelection_DD_SelectanOccupant);
					se.util().sleep(5000);
					se.element().SelectElement(BuildingandOccupSelection_DD_SelectanOccupant, strBuildingandOccupSelection_DD_SelectanOccupant,test);
					se.element().waitForElement(progressBar,120);
					se.util().sleep(2000);
					if(!se.element().SelectElement(BuildingandOccupSelection_DD_SelectanOccupant, strBuildingandOccupSelection_DD_SelectanOccupant,test)){
							
							se.element().Click(getBuildingandOccupSelection_DD_SelectanOccupant(), test);
							test.log(LogStatus.FAIL,"CP_BuildingandOccupantSelection  of AgencyPortal - error - could not select SelectanOccupant ",test.addScreenCapture(Util.captureScreenshot("UnexpectedError on CP_BuildingandOccupantSelection" , se)));
							test.log(LogStatus.INFO,"Trying to select an occupant again ");
							
							se.element().Click(getBuildingandOccupSelection_DD_SelectanOccupant(), test);
							se.element().SelectElement(BuildingandOccupSelection_DD_Loc, "Select One",test);
							se.element().waitBasedOnCount(PleaseWaitPopup,40);
							se.element().waitForElement(progressBar,120);
							
							se.element().SelectElement(BuildingandOccupSelection_DD_Loc, strBuildingandOccupSelection_DD_Loc,test);
							se.element().waitBasedOnCount(PleaseWaitPopup,40);
							se.element().waitForElement(progressBar,120);
							
							se.util().sleep(30000);
							se.element().SelectElement(BuildingandOccupSelection_DD_Loc, "Select One",test);
							se.element().waitBasedOnCount(PleaseWaitPopup,40);
							se.element().waitForElement(progressBar,120);
							
							se.element().SelectElement(BuildingandOccupSelection_DD_Loc, strBuildingandOccupSelection_DD_Loc,test);
							se.element().waitBasedOnCount(PleaseWaitPopup,40);
							se.element().waitForElement(progressBar,120);
							

							se.util().sleep(30000);
							se.element().SelectElement(BuildingandOccupSelection_DD_Loc, "Select One",test);
							se.element().waitBasedOnCount(PleaseWaitPopup,40);
							se.element().waitForElement(progressBar,120);
							
							se.element().SelectElement(BuildingandOccupSelection_DD_Loc, strBuildingandOccupSelection_DD_Loc,test);
							se.element().waitBasedOnCount(PleaseWaitPopup,40);
							se.element().waitForElement(progressBar,120);
							
							se.util().sleep(30000);
							se.element().SelectElement(BuildingandOccupSelection_DD_Loc, "Select One",test);
							se.element().waitBasedOnCount(PleaseWaitPopup,40);
							se.element().waitForElement(progressBar,120);
							
							se.element().SelectElement(BuildingandOccupSelection_DD_Loc, strBuildingandOccupSelection_DD_Loc,test);
							se.element().waitBasedOnCount(PleaseWaitPopup,40);
							se.element().waitForElement(progressBar,120);
							
							se.util().sleep(30000);
							se.element().SelectElement(BuildingandOccupSelection_DD_Loc, "Select One",test);
							se.element().waitBasedOnCount(PleaseWaitPopup,40);
							se.element().waitForElement(progressBar,120);
							
							se.element().SelectElement(BuildingandOccupSelection_DD_Loc, strBuildingandOccupSelection_DD_Loc,test);
							se.element().waitBasedOnCount(PleaseWaitPopup,40);
							se.element().waitForElement(progressBar,120);
							
							

							
							
							
							se.element().enterOrValidateText(getBuildingandOccupSelection_Label_BuildingNo(strBuildingandOccupSelection_Label_BuildingNo),strBuildingandOccupSelection_Label_BuildingNo,test);
							
							//se.element().waitForElementtoText(getBuildingandOccupSelection_DD_SelectanOccupant(),600,strBuildingandOccupSelection_DD_SelectanOccupant);
							se.util().sleep(5000);
							se.element().SelectElement(BuildingandOccupSelection_DD_SelectanOccupant, strBuildingandOccupSelection_DD_SelectanOccupant,test);
							se.element().waitBasedOnCount(PleaseWaitPopup,40);
							se.element().waitForElement(progressBar,120);
							se.util().sleep(2000);
						
					}
					se.element().Click(getBuildingandOccupSelection_BTN_Add(), test);
					se.element().waitForElement(progressBar,220);
					se.util().sleep(2000);
					
					if(strBuildingandOccupSelection_BTN_Edit.contains("Edit"))
					{
						
						test.log(LogStatus.INFO,"Clicking on Edit of Building and Occupant Selection Roster screen -",test.addScreenCapture(Util.captureScreenshot("Building and Occupant Selection Roster screen" , se)));
						
						se.element().Click(getBuildingandOccupSelection_BTN_Edit(strBuildingandOccupSelection_BTN_Edit_Loc), test);
						if(se.element().isElementPresent(BuildingandOccupSelection_EditMessage)) {
							se.element().enterOrValidateText(getBuildingandOccupSelection_EditMessage(strBuildingandOccupSelection_EditMessage),strBuildingandOccupSelection_EditMessage,test);
						}
						else {
							test.log(LogStatus.FAIL,"Building and Occupant screen Edit message is not displayed- ",test.addScreenCapture(Util.captureScreenshot("Location screen Address standardisation" , se)));
							
						}
						se.element().waitForLoad(120);
						se.element().waitForElementToDisappear_One(progressBar, 60);
					}
						
					else if(strBuildingandOccupSelection_BTN_Delete.contains("Delete"))
					{
						test.log(LogStatus.INFO,"Clicking on Delete of Building and Occupant Selection Roster screen -",test.addScreenCapture(Util.captureScreenshot("Building and Occupant Selection Roster screen" , se)));
						
						se.element().Click(getBuildingandOccupSelection_BTN_Delete(strBuildingandOccupSelection_BTN_Delete_Loc), test);
						if(se.element().isElementPresent(BuildingandOccupSelection_DeleteMessage)) {
							se.element().enterOrValidateText(getBuildingandOccupSelection_DeleteMessage(strBuildingandOccupSelection_DeleteMessage),strBuildingandOccupSelection_DeleteMessage,test);
						}
						else {
							test.log(LogStatus.FAIL,"Building and Occupant screen Delete message is not displayed- ",test.addScreenCapture(Util.captureScreenshot("Building and Occupant Selection screen Delete message" , se)));
							
						}
						se.util().sleep(1000);
					}
					
				
			}
			catch(Exception e){
				
				e.printStackTrace();
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for CP_BuildandOccupantSelection_Details ", true, false, true, test);
			
			}
			iteration++;
		}
		se.element().Click(getGI_CHK_Continue(), test);
		//Workaround for TC_ND11
		/*Boolean Status=se.element().waitForAlertPresent(5);
		if(Status.equals("true"))
		//if(strRegressionID.contains("TC_04") && transaction.contains("RedoNewQuote"))
		{
			driver.switchTo().alert().accept();
		}*/
		
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}



	public void verifyConnectionError(int count,ExtentTest test){
		try{
		do{
			se.element().waitBasedOnCount(PleaseWaitPopup,40);
			String error="";
			Alert alert;
			if(se.element().waitForAlertPresent(5)){
				alert = driver.switchTo().alert();
				 error= alert.getText();
				if(error.contains("Connection to server failed"))
					{
					
					test.log(LogStatus.INFO, "Alert text is -", "<br>Actual: "+driver.switchTo().alert().getText()+"<br>Expected: "+"No Alert"+"<br>");
					alert.accept();
					test.log(LogStatus.FAIL,"CP_BuildingandOccupantSelection  of AgencyPortal - error - "+ driver.switchTo().alert().getText(),test.addScreenCapture(Util.captureScreenshot("UnexpectedError on CP_BuildingandOccupantSelection" , se)));
						Assert.fail("stopping the test case");
				}
			}
			if(count>=2){
				break;
			}
			count++;
		}
		while (se.element().isElementPresent(PleaseWaitPopup));
		}catch(Exception e){
			e.printStackTrace();
			e.getMessage();
		}
		
		
		
	}






}
