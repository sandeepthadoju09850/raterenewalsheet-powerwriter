package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_GL;

public class GL_ProfessionalLiabilityOccurance extends OR_GL{
	
	public void GL_ProfessionalLiabilityOccurance_Details(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase("GL_ProfessionalLiabilityOccuran")){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("GL_ProfessionalLiabilityOccuran", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strGL_ProfessionalLiabilityOccurance_BTN_Add = (String) row.get("GL_ProfessionalLiabilityOccurance_BTN_Add");
				String strGL_ProfessionalLiabilityOccurance_BTN_Edit = (String) row.get("GL_ProfessionalLiabilityOccurance_BTN_Edit");
				String strGL_ProfessionalLiabilityOccurance_TXT_ClassCode = (String) row.get("GL_ProfessionalLiabilityOccurance_TXT_ClassCode");
				String strGL_ProfessionalLiabilityOccurance_TXT_ClassDescription = (String) row.get("GL_ProfessionalLiabilityOccurance_TXT_ClassDescription");
				String strGL_ProfessionalLiabilityOccurance_TXT_ExposureBasis = (String) row.get("GL_ProfessionalLiabilityOccurance_TXT_ExposureBasis");
				String strGL_ProfessionalLiabilityOccurance_TXT_Option = (String) row.get("GL_ProfessionalLiabilityOccurance_TXT_Option");
				String strGL_ProfessionalLiabilityOccurance_TXT_TransitionFtr = (String) row.get("GL_ProfessionalLiabilityOccurance_TXT_TransitionFtr");
				String strGL_ProfessionalLiabilityOccurance_TXT_FinalPremium = (String) row.get("GL_ProfessionalLiabilityOccurance_TXT_FinalPremium");
				String strGL_ProfessionalLiabilityOccurance_TXT_EstimatedExpsoure = (String) row.get("GL_ProfessionalLiabilityOccurance_TXT_EstimatedExpsoure");
				String strGL_ProfessionalLiabilityOccurance_BTN_Done = (String) row.get("GL_ProfessionalLiabilityOccurance_BTN_Done");
				String strTestDescription = (String) row.get("Transaction Name");
				try{
				se.log().logTestStep("GL_ProfessionalLiabilityOccurance");
				test.log(LogStatus.INFO, "GL_ProfessionalLiabilityOccurance page","Transaction Step : "+strTestDescription + "<br>" +"Page : GL_ProfessionalLiabilityOccurance");
				se.verify().verifyEquals("GL_ProfessionalLiabilityOccurance Page of PowerWriter ", (getGL_ProfessionalLiabilityOccurance_LBL_ProfessionalLiabilityOccurrence()).isDisplayed(),true, true,test);
				if(strGL_ProfessionalLiabilityOccurance_BTN_Add.equalsIgnoreCase("Yes")){
					se.element().Click(getGL_ProfessionalLiabilityOccurance_BTN_ADD(), test);
				}
				if(strGL_ProfessionalLiabilityOccurance_BTN_Edit.equalsIgnoreCase("Yes")){
					se.element().Click(getGL_ProfessionalLiabilityOccurance_BTN_Edit(strGL_ProfessionalLiabilityOccurance_BTN_Edit), test);
				}
				se.element().enterOrValidateText(getGL_ProfessionalLiabilityOccurance_TXT_ClassCode(strGL_ProfessionalLiabilityOccurance_TXT_ClassCode),strGL_ProfessionalLiabilityOccurance_TXT_ClassCode,test);
				se.element().enterOrValidateText(getGL_ProfessionalLiabilityOccurance_TXT_ClassDescription(strGL_ProfessionalLiabilityOccurance_TXT_ClassDescription),strGL_ProfessionalLiabilityOccurance_TXT_ClassDescription,test);
				se.element().enterOrValidateText(getGL_ProfessionalLiabilityOccurance_TXT_ExposureBasis(strGL_ProfessionalLiabilityOccurance_TXT_ExposureBasis),strGL_ProfessionalLiabilityOccurance_TXT_ExposureBasis,test);
				se.element().enterOrValidateText(getGL_ProfessionalLiabilityOccurance_TXT_Option(strGL_ProfessionalLiabilityOccurance_TXT_Option),strGL_ProfessionalLiabilityOccurance_TXT_Option,test);
				se.element().enterOrValidateText(getGL_ProfessionalLiabilityOccurance_TXT_TransitionFtr(strGL_ProfessionalLiabilityOccurance_TXT_TransitionFtr),strGL_ProfessionalLiabilityOccurance_TXT_TransitionFtr,test);
				se.element().enterOrValidateText(getGL_ProfessionalLiabilityOccurance_TXT_FinalPremium(strGL_ProfessionalLiabilityOccurance_TXT_FinalPremium),strGL_ProfessionalLiabilityOccurance_TXT_FinalPremium,test);
				se.element().enterOrValidateText(getGL_ProfessionalLiabilityOccurance_TXT_EstimatedExpsoure(strGL_ProfessionalLiabilityOccurance_TXT_EstimatedExpsoure),strGL_ProfessionalLiabilityOccurance_TXT_EstimatedExpsoure,test);
				se.element().Click(getNext(),test);
				if(strGL_ProfessionalLiabilityOccurance_BTN_Done.equalsIgnoreCase("Yes")){
					se.element().Click(getNext(),test);
				}
			
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for GL_ProfessionalLiabilityOccurance ", true, false, true, test);
					
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