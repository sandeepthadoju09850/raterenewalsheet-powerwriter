package ap.pages.CA;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class CA_PremiumModification extends BL_OR_CP {

	public void CA_PremiumModification_Details(String strRegressionID, String transaction,String suspendSheet, String strAgentLink, String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs,ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.CA_PremiumModification)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.CA_PremiumModification, strRegressionID, transaction);
		int iteration = 0;

		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strPremiumModification_BTN_Edit = (String) row.get("PremiumModification_BTN_Edit");
			String strPremiumModification_BTN_Edit1 = (String) row.get("PremiumModification_BTN_Edit1");
			String strPremiumModification_TXT_Liabcrdr = (String) row.get("PremiumModification_TXT_Liabcrdr");
			String strPremiumModification_TXT_State = (String) row.get("PremiumModification_TXT_State");
			String strPremiumModification_DD_PDFARC_Management = (String) row.get("PremiumModification_DD_PDFARC_Management");
			String strPremiumModification_DD_PDFARC_ManagementReason = (String) row.get("PremiumModification_DD_PDFARC_ManagementReason");
			String strPremiumModification_DD_PDFARC_Equipment = (String) row.get("PremiumModification_DD_PDFARC_Equipment");
			String strPremiumModification_DD_PDFARC_EquipmentReason = (String) row.get("PremiumModification_DD_PDFARC_EquipmentReason");
			String strPremiumModification_DD_PDFARC_Employees = (String) row.get("PremiumModification_DD_PDFARC_Employees");
			String strPremiumModification_DD_PDFARC_EmployeesReason = (String) row.get("PremiumModification_DD_PDFARC_EmployeesReason");
			String strPremiumModification_DD_PDFARC_Safety = (String) row.get("PremiumModification_DD_PDFARC_Safety");
			String strPremiumModification_DD_PDFARC_SafetyReason = (String) row.get("PremiumModification_DD_PDFARC_SafetyReason");
			String strPremiumModification_TXT_Pdcrdr = (String) row.get("PremiumModification_TXT_Pdcrdr");
			String strPremiumModification_DD_Lsrac_Management = (String) row.get("PremiumModification_DD_Lsrac_Management");
			String strPremiumModification_DD_Lsrac_ManagementReason = (String) row.get("PremiumModification_DD_Lsrac_ManagementReason");
			String strPremiumModification_DD_Lsrac_Equipment = (String) row.get("PremiumModification_DD_Lsrac_Equipment");
			String strPremiumModification_DD_Lsrac_EquipmentReason = (String) row.get("PremiumModification_DD_Lsrac_EquipmentReason");
			String strPremiumModification_DD_Lsrac_Employees = (String) row.get("PremiumModification_DD_Lsrac_Employees");
			String strPremiumModification_DD_Lsrac_EmployeesReason = (String) row.get("PremiumModification_DD_Lsrac_EmployeesReason");
			String strPremiumModification_DD_Lsrac_Safety = (String) row.get("PremiumModification_DD_Lsrac_Safety");
			String strPremiumModification_DD_Lsrac_SafetyReason = (String) row.get("PremiumModification_DD_Lsrac_SafetyReason");
			/*String strPremiumModification_BTN_Add = (String) row.get("PremiumModification_BTN_Add");
			String strPremiumModification_BTN_Delete = (String) row.get("PremiumModification_BTN_Delete");*/	
			try {
				se.log().logTestStep("CA_PremiumModification_Details");
				test.log(LogStatus.INFO, "CA_PremiumModification_Details","Transaction Step : "+transaction + "<br>" +"Page : CA_PremiumModification_Details");
				se.verify().verifyEquals("CA_PremiumModification_Details  of AgencyPortal ", getSchRatinglabel().isDisplayed(),true, true,test);		
				if(strPremiumModification_BTN_Edit.contains("Edit"))
				{
					se.element().Click(getPremiumModification_BTN_Edit(strPremiumModification_BTN_Edit1), test);
					se.element().enterOrValidateText(getPremiumModification_TXT_State(strPremiumModification_TXT_State), strPremiumModification_TXT_State,test);
					se.element().enterOrValidateText(getSchRatingCreditDebitLiabFactorTxt(strPremiumModification_TXT_Liabcrdr), strPremiumModification_TXT_Liabcrdr,test);
					se.element().SelectElement(SchRatingLiabilityManagementDD, strPremiumModification_DD_Lsrac_Management,test);
					se.element().SelectElement(SchRatingLiabilityManagementReasondd,strPremiumModification_DD_Lsrac_ManagementReason, test);
					se.element().SelectElement(SchRatingLiabilityEmpDD, strPremiumModification_DD_Lsrac_Employees,test);
					se.element().SelectElement(SchRatingLiabilityEmployessdd,strPremiumModification_DD_Lsrac_EmployeesReason, test);
					se.element().SelectElement(SchRatingLiabilityEquipDD, strPremiumModification_DD_Lsrac_Equipment,test);
					se.element().SelectElement(SchRatingLiabilityEquipmentdd,strPremiumModification_DD_Lsrac_EquipmentReason, test);
					se.element().SelectElement(SchRatingLiabilitySafetyDD, strPremiumModification_DD_Lsrac_Safety,test);
					se.element().SelectElement(SchRatingLiabilitySafetyReasondd, strPremiumModification_DD_Lsrac_SafetyReason, test);
					se.element().enterOrValidateText(getSchRatingPhysicalFactorTxt(strPremiumModification_TXT_Pdcrdr), strPremiumModification_TXT_Pdcrdr,test);
					se.element().SelectElement(SchRatingPhysicalManagementDD, strPremiumModification_DD_PDFARC_Management,test);
					se.element().SelectElement(SchRatingPhysicalManagementdd,strPremiumModification_DD_PDFARC_ManagementReason, test);
					se.element().SelectElement(SchRatingPhysicalEmpDD, strPremiumModification_DD_PDFARC_Employees,test);
					se.element().SelectElement(SchRatingPhysicalEmployessdd,strPremiumModification_DD_PDFARC_EmployeesReason, test);
					se.element().SelectElement(SchRatingPhysicalEquipDD, strPremiumModification_DD_PDFARC_Equipment,test);
					se.element().SelectElement(SchRatingPhysicalEquipmentdd,strPremiumModification_DD_PDFARC_EquipmentReason, test);
					se.element().SelectElement(SchRatingPhysicalESafetyDD, strPremiumModification_DD_PDFARC_Safety,test);
					se.element().SelectElement(SchRatingPhysicalSafetydd, strPremiumModification_DD_PDFARC_SafetyReason, test);
					//se.element().enterOrValidateText(getSchRatingPhysicalFactorTxt(strPremiumModification_TXT_Pdcrdr), strPremiumModification_TXT_Pdcrdr,test);
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getLocations_BTN_Save());
					se.element().Click(getLocations_BTN_Save(), test);
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CA_PremiumModification_Details", true, false, true, test);

			}
			iteration++;
		}
		executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
