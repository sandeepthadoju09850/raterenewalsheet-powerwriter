package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_GL;

public class GL_ExclusionProvisions extends OR_GL {
	
public void GL_ExclusionProvisionsMethod(String strRegressionID, String transaction, ExtentTest test) throws IOException {
	try{
	String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	if(SuspendSheet.equalsIgnoreCase(constants.GL_Optional_Provisions)){
		test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
		testTearDown(se, test);
	}
	List<Map<String, String>> table = ExcelOperations.getPagesData(constants.GL_OP_Exclusion_Provisions, strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		
			String strGL_Optional_Exclusion_Provisions_BTN_ADD = (String) row.get("GL_Optional_Exclusion_Provisions_BTN_ADD");
			String strGL_Optional_Exclusion_Provisions_BTN_Details = (String) row.get("GL_Optional_Exclusion_Provisions_BTN_Details");
			String strGL_Optional_Exclusion_Provisions_BTN_SelectDetailsIcon = (String) row.get("GL_Optional_Exclusion_Provisions_BTN_SelectDetailsIcon");
			String strGL_Optional_Exclusion_Provisions_BTN_Done = (String) row.get("GL_Optional_Exclusion_Provisions_BTN_Done");
			String strGL_Optional_Exclusion_Provisions_TXT_provision_name = (String) row.get("GL_Optional_Exclusion_Provisions_TXT_provision_name");
			String strGL_Optional_Exclusion_Provisions_TXT_coverage_part = (String) row.get("GL_Optional_Exclusion_Provisions_TXT_coverage_part");
			String strGL_Optional_Exclusion_Provisions_TXT_form = (String) row.get("GL_Optional_Exclusion_Provisions_TXT_form");

			try{
				test.log(LogStatus.INFO, "GL_Exclusion_Provisions","Transaction Step : " + transaction + "<br>" + "Page : GL_Exclusion_Provisions");
				
				se.verify().verifyEquals("GL_Exclusion_Provisions Page of PowerWriter ", getGL_Optional_Exclusion_Provisions_LBL_ExclusionProvisions().isDisplayed(),true, true,test);
				if(strGL_Optional_Exclusion_Provisions_BTN_ADD.equalsIgnoreCase("Yes")){
				se.element().Click(getGL_Optional_Exclusion_Provisions_BTN_ADD(),test);
				se.verify().verifyEquals("GL_Exclusion_Provisions Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
				}
				
				if(!strGL_Optional_Exclusion_Provisions_BTN_Details.equals(constants.NA)){
					se.element().clickElement(getGL_Optional_Exclusion_Provisions_BTN_SelectDetailsIcon(strGL_Optional_Exclusion_Provisions_BTN_SelectDetailsIcon),test);
					se.verify().verifyEquals("GL_Exclusion_Provisions Page is displayed ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
				}
				
				se.element().enterOrValidateText(getGL_Optional_Exclusion_Provisions_TXT_provision_name(strGL_Optional_Exclusion_Provisions_TXT_provision_name),strGL_Optional_Exclusion_Provisions_TXT_provision_name,test);
				se.element().enterOrValidateText(getGL_Optional_Exclusion_Provisions_TXT_coverage_part(strGL_Optional_Exclusion_Provisions_TXT_coverage_part),strGL_Optional_Exclusion_Provisions_TXT_coverage_part,test);
				se.element().enterOrValidateText(getGL_Optional_Exclusion_Provisions_TXT_form(strGL_Optional_Exclusion_Provisions_TXT_form),strGL_Optional_Exclusion_Provisions_TXT_form,test);
	
				se.element().Click(getNext(),test);
				Thread.sleep(3000);
						
				if((strGL_Optional_Exclusion_Provisions_BTN_Done.equalsIgnoreCase("Yes"))){	
					se.element().Click(getDone(),test);
				}
						
				
	
		
	}catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for GL_Exclusion_Provisions ", true, false, true, test);
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

