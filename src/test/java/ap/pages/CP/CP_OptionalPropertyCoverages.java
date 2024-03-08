package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;

public class CP_OptionalPropertyCoverages extends OR_CP{
	public void CP_OptionalPropertyCoverages_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Optional_Property_Coverages)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Optional_Property_Coverages, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strOPC_CHK_WaterBackupandSumpOverflow = (String) row.get("OPC_CHK_WaterBackupandSumpOverflow");
			String strOPC_DDV_PremisesLimitType = (String) row.get("OPC_DDV_PremisesLimitType");
			String strOPC_DDV_WaterBackupLimit = (String) row.get("OPC_DDV_WaterBackupLimit");
			String strOPC_CHK_DataCompromise = (String) row.get("OPC_CHK_DataCompromise");
			String strOPC_CHK_DataCompromiseLimit = (String) row.get("OPC_CHK_DataCompromiseLimit");
			String strOPC_CHK_DomesticAnimalBailee = (String) row.get("OPC_CHK_DomesticAnimalBailee");
			String strOPC_DDV_PerOccurrenceLimit = (String) row.get("OPC_DDV_PerOccurrenceLimit");
			String strOPC_DDV_PerAnimalMaxLimit = (String) row.get("OPC_DDV_PerAnimalMaxLimit");
			String strOPC_DDV_Deductible = (String) row.get("OPC_DDV_Deductible");
			String strOPC_CHK_EquipmentBreakdownWrap = (String) row.get("OPC_CHK_EquipmentBreakdownWrap");
			String strOPC_DoesApplicantHaveAnyPropertyAdditionalInterests_Yes = (String) row.get("OPC_DoesApplicantHaveAnyPropertyAdditionalInterests_Yes");
			String strOPC_DoesApplicantHaveAnyPropertyAdditionalInterests_No = (String) row.get("OPC_DoesApplicantHaveAnyPropertyAdditionalInterests_No");
			
			try {
				se.log().logTestStep("CP_OptionalPropertyCoverages_Details");
				test.log(LogStatus.INFO, "CP_OptionalPropertyCoverages_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_OptionalPropertyCoverages_Details");
				se.verify().verifyEquals("CP_OptionalPropertyCoverages_Details  of AgencyPortal ", getOptionalPropertyCoverages_label().isDisplayed(),true, true,test);
				se.element().checkUncheckOrValidate( getOPC_CHK_WaterBackupandSumpOverflow(strOPC_CHK_WaterBackupandSumpOverflow),strOPC_CHK_WaterBackupandSumpOverflow,test);
				se.element().SelectElement(OPC_DDV_PremisesLimitType,strOPC_DDV_PremisesLimitType,test);
				se.element().SelectElement(OPC_DDV_WaterBackupLimit,strOPC_DDV_WaterBackupLimit,test);
				//se.verify().verifyEquals("OPC_DDV_PremisesLimitType validation",se.element(). getSelectedValue(OPC_DDV_PremisesLimitType),strOPC_DDV_PremisesLimitType,true,test);
				//se.verify().verifyEquals("OPC_DDV_WaterBackupLimit validation",se.element(). getSelectedValue(OPC_DDV_WaterBackupLimit),strOPC_DDV_WaterBackupLimit,true,test);
				se.element().checkUncheckOrValidate( getOPC_CHK_DataCompromise(strOPC_CHK_DataCompromise),strOPC_CHK_DataCompromise,test);
				se.element().enterOrValidateText(getOPC_CHK_DataCompromiseLimit(strOPC_CHK_DataCompromiseLimit),strOPC_CHK_DataCompromiseLimit,test);
				//se.verify().verifyEquals("OPC_CHK_DataCompromiseLimit validation",se.element(). getSelectedText(OPC_CHK_DataCompromiseLimit),strOPC_CHK_DataCompromiseLimit,true,test);
				se.element().checkUncheckOrValidate( getOPC_CHK_DomesticAnimalBailee(strOPC_CHK_DomesticAnimalBailee),strOPC_CHK_DomesticAnimalBailee,test);
				se.element().SelectElement(OPC_DDV_PerOccurrenceLimit,strOPC_DDV_PerOccurrenceLimit,test);
				se.element().SelectElement(OPC_DDV_PerAnimalMaxLimit,strOPC_DDV_PerAnimalMaxLimit,test);
				se.element().SelectElement(OPC_DDV_Deductible,strOPC_DDV_Deductible,test);
				se.element().checkUncheckOrValidate( getOPC_DoesApplicantHaveAnyPropertyAdditionalInterests_Yes(strOPC_DoesApplicantHaveAnyPropertyAdditionalInterests_Yes),strOPC_DoesApplicantHaveAnyPropertyAdditionalInterests_Yes,test);
				se.element().checkUncheckOrValidate( getOPC_DoesApplicantHaveAnyPropertyAdditionalInterests_No(strOPC_DoesApplicantHaveAnyPropertyAdditionalInterests_No),strOPC_DoesApplicantHaveAnyPropertyAdditionalInterests_No,test);
				
				se.element().checkUncheckOrValidate( getOPC_CHK_EquipmentBreakdownWrap(strOPC_CHK_EquipmentBreakdownWrap),strOPC_CHK_EquipmentBreakdownWrap,test);
				se.element().waitForElement(GI_CHK_Continue);
				executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
				se.element().Click(getGI_CHK_Continue(), test);
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for Optional_Property_Coverages ", true, false, true, test);
			}
			iteration++;
			
		}
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}


