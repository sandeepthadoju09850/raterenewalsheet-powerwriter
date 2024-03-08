package ap.pages.CP;

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

public class CP_BoatAndMotorSchedule extends OR_CP {

	public void CP_BoatAndMotorSchedule_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.BoatAndMotorSchedule)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.BoatAndMotorSchedule, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strBoatAndMotorSchedule_BTN_AddNew = (String) row.get("BoatAndMotorSchedule_BTN_AddNew");
			String strBoatAndMotorSchedule_DD_Loc = (String) row.get("BoatAndMotorSchedule_DD_Loc");
			String strBoatAndMotorSchedule_CHK_Boat = (String) row.get("BoatAndMotorSchedule_CHK_Boat");
			String strBoatAndMotorSchedule_CHK_EngineMotorBox = (String) row.get("BoatAndMotorSchedule_CHK_EngineMotorBox");
			String strBoatAndMotorSchedule_CHK_TrailerBox = (String) row.get("BoatAndMotorSchedule_CHK_TrailerBox");
			
			String strBoatAndMotorSchedule_TXT_BI_BoatLimit= (String) row.get("BoatAndMotorSchedule_TXT_BI_BoatLimit");
			String strBoatAndMotorSchedule_TXT_BI_Year = (String) row.get("BoatAndMotorSchedule_TXT_BI_Year");
			String strBoatAndMotorSchedule_TXT_BI_Make = (String) row.get("BoatAndMotorSchedule_TXT_BI_Make");
			String strBoatAndMotorSchedule_TXT_BI_Model = (String) row.get("BoatAndMotorSchedule_TXT_BI_Model");
			String strBoatAndMotorSchedule_DD_BI_Length = (String) row.get("BoatAndMotorSchedule_DD_BI_Length");
			String strBoatAndMotorSchedule_TXT_BI_HullType = (String) row.get("BoatAndMotorSchedule_TXT_BI_HullType");
			String strBoatAndMotorSchedule_TXT_BI_Serial = (String) row.get("BoatAndMotorSchedule_TXT_BI_Serial");
			String strEOM_TXT_EngineOrMotorLimit= (String) row.get("EOM_TXT_EngineOrMotorLimit");
			String strEOM_TXT_Year= (String) row.get("EOM_TXT_Year");
			String strEOM_TXT_Make= (String) row.get("EOM_TXT_Make");
			String strEOM_TXT_Model= (String) row.get("EOM_TXT_Model");
			String strEOM_TXT_Serial= (String) row.get("EOM_TXT_Serial");
			String strEOM_TXT_HorsePower= (String) row.get("EOM_TXT_HorsePower");
			String strTI_TXT_TrailerLimit= (String) row.get("TI_TXT_TrailerLimit");
			String strTI_TXT_Year= (String) row.get("TI_TXT_Year");
			String strTI_TXT_Make= (String) row.get("TI_TXT_Make");
			String strTI_TXT_Model= (String) row.get("TI_TXT_Model");
			String strTI_TXT_Serial= (String) row.get("TI_TXT_Serial");
			try {
				se.log().logTestStep("CP_BoatAndMotorSchedule_Details");
				test.log(LogStatus.INFO, "CP_BoatAndMotorSchedule_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_BoatAndMotorSchedule_Details");
				se.verify().verifyEquals("CP_BoatAndMotorSchedule_Details  of AgencyPortal ", getBoatandMotorSchedule_label().isDisplayed(),true, true,test);
				se.util().sleep(5000);
				if(strBoatAndMotorSchedule_BTN_AddNew.equalsIgnoreCase("Add")) {
					se.element().Click(getBoatAndMotorSchedule_BTN_AddNew(strBoatAndMotorSchedule_BTN_AddNew), test);
				}
				se.element().SelectElement(BoatAndMotorSchedule_DD_Loc, strBoatAndMotorSchedule_DD_Loc,test);
				se.element().checkUncheckOrValidate( getBoatAndMotorSchedule_CHK_Boat(strBoatAndMotorSchedule_CHK_Boat),strBoatAndMotorSchedule_CHK_Boat,test);
				se.util().sleep(2000);
				se.element().enterOrValidateText( getBoatAndMotorSchedule_TXT_BI_BoatLimit(strBoatAndMotorSchedule_TXT_BI_BoatLimit),strBoatAndMotorSchedule_TXT_BI_BoatLimit,test);
				se.element().enterOrValidateText( getBoatAndMotorSchedule_TXT_BI_Year(strBoatAndMotorSchedule_TXT_BI_Year),strBoatAndMotorSchedule_TXT_BI_Year,test);
				se.element().enterOrValidateText( getBoatAndMotorSchedule_TXT_BI_Make(strBoatAndMotorSchedule_TXT_BI_Make),strBoatAndMotorSchedule_TXT_BI_Make,test);
				se.element().enterOrValidateText( getBoatAndMotorSchedule_TXT_BI_Model(strBoatAndMotorSchedule_TXT_BI_Model),strBoatAndMotorSchedule_TXT_BI_Model,test);
				se.element().enterOrValidateText(getBoatAndMotorSchedule_DD_BI_Length(strBoatAndMotorSchedule_DD_BI_Length), strBoatAndMotorSchedule_DD_BI_Length,test);
				se.element().SelectElement( BoatAndMotorSchedule_TXT_BI_HullType,strBoatAndMotorSchedule_TXT_BI_HullType,test);
				se.element().enterOrValidateText( getBoatAndMotorSchedule_TXT_BI_Serial(strBoatAndMotorSchedule_TXT_BI_Serial),strBoatAndMotorSchedule_TXT_BI_Serial,test);
				
				se.element().checkUncheckOrValidate( getBoatAndMotorSchedule_CHK_EngineMotorBox(strBoatAndMotorSchedule_CHK_EngineMotorBox),strBoatAndMotorSchedule_CHK_EngineMotorBox,test);
				se.util().sleep(2000);
				se.element().enterOrValidateText( getEOM_TXT_EngineOrMotorLimit(strEOM_TXT_EngineOrMotorLimit),strEOM_TXT_EngineOrMotorLimit,test);
				se.element().enterOrValidateText( getEOM_TXT_Year(strEOM_TXT_Year),strEOM_TXT_Year,test);
				se.element().enterOrValidateText( getEOM_TXT_Make(strEOM_TXT_Make),strEOM_TXT_Make,test);
				se.element().enterOrValidateText( getEOM_TXT_Model(strEOM_TXT_Model),strEOM_TXT_Model,test);
				se.element().enterOrValidateText( getEOM_TXT_Serial(strEOM_TXT_Serial),strEOM_TXT_Serial,test);
				se.element().enterOrValidateText( getEOM_TXT_HorsePower(strEOM_TXT_HorsePower),strEOM_TXT_HorsePower,test);
				
				se.element().checkUncheckOrValidate( getBoatAndMotorSchedule_CHK_TrailerBox(strBoatAndMotorSchedule_CHK_TrailerBox),strBoatAndMotorSchedule_CHK_TrailerBox,test);
				se.util().sleep(2000);
				se.element().enterOrValidateText( getTI_TXT_TrailerLimit(strTI_TXT_TrailerLimit),strTI_TXT_TrailerLimit,test);
				se.element().enterOrValidateText( getTI_TXT_Year(strTI_TXT_Year),strTI_TXT_Year,test);
				se.element().enterOrValidateText( getTI_TXT_Make(strTI_TXT_Make),strTI_TXT_Make,test);
				se.element().enterOrValidateText( getTI_TXT_Model(strTI_TXT_Model),strTI_TXT_Model,test);
				se.element().enterOrValidateText( getTI_TXT_Serial(strTI_TXT_Serial),strTI_TXT_Serial,test);
				se.element().Click(getBuildingandOccupSelection_BTN_Add(), test);
			}
			catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CP_BoatAndMotorSchedule_Details ", true, false, true, test);
				e.printStackTrace();
				e.getMessage();
			}
			iteration++;
		}
		se.util().sleep(2000);
		se.element().Click(getGI_CHK_Continue(), test);
	}catch (Exception e) {
		
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
		testTearDown(se, test);
	}
	}
}
