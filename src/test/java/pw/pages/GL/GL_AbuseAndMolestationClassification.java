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

public class GL_AbuseAndMolestationClassification extends OR_GL{
	
	public void GL_AbuseAndMolestationClassificationMethod(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.GL_AbuseAndMolestationClassification)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}	
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.GL_AbuseAndMolestationClassification, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
				String strGL_AbuseMolestClassification_BTN_Add = (String) row.get("GL_AbuseMolestClassification_BTN_Add");
				String strGL_AbuseMolestClassification_BTN_Details = (String) row.get("GL_AbuseMolestClassification_BTN_Details");
				String strGL_AbuseMolestClassification_BTN_Done = (String) row.get("GL_AbuseMolestClassification_BTN_Done");
				String strGL_AbuseMolestClassification_TXT_ClassCode = (String) row.get("GL_AbuseMolestClassification_TXT_ClassCode");
				String strGL_AbuseMolestClassification_TXT_ClassDescriptionPopup = (String) row.get("GL_AbuseMolestClassification_TXT_ClassDescriptionPopup");
				String strGL_AbuseMolestClassification_TXT_ClassDescription = (String) row.get("GL_AbuseMolestClassification_TXT_ClassDescription");
				String strGL_AbuseMolestClassification_TXT_EstimatedExposure = (String) row.get("GL_AbuseMolestClassification_TXT_EstimatedExposure");
				String strGL_AbuseMolestClassification_TXT_ExposureBasis = (String) row.get("GL_AbuseMolestClassification_TXT_ExposureBasis");
				
				try{
					se.log().logTestStep("GL_AbuseAndMolestationClassification");
					test.log(LogStatus.INFO, "GL_AbuseAndMolestationClassification page","Transaction Step : "+transaction + "<br>" +"Page : GL_AbuseAndMolestationClassification");
					
					
					if(strGL_AbuseMolestClassification_BTN_Add.equalsIgnoreCase("Yes")){
						se.element().waitForElementIsDisplayed(GL_AbuseMolestClassification_BTN_Add, 10);
						se.element().Click(getGL_AbuseMolestClassification_BTN_Add(), test);
					}
					if(strGL_AbuseMolestClassification_BTN_Details.equalsIgnoreCase("Yes")){
						se.element().Click(getGL_AbuseMolestClassification_BTN_Details(strGL_AbuseMolestClassification_BTN_Details), test);
					}
					
					se.element().selectPopupWithMagnifier(getGL_AbuseMolestClassification_TXT_ClassCode(strGL_AbuseMolestClassification_TXT_ClassCode), getGL_AbuseMolestClassification_BTN_ClassCodeSearch(strGL_AbuseMolestClassification_TXT_ClassCode), strGL_AbuseMolestClassification_TXT_ClassCode, constants.NA, strGL_AbuseMolestClassification_TXT_ClassDescriptionPopup, constants.NA, constants.NA, constants.NA, test);
					se.element().enterOrValidateText(getGL_AbuseMolestClassification_TXT_ClassDescription(strGL_AbuseMolestClassification_TXT_ClassDescription),strGL_AbuseMolestClassification_TXT_ClassDescription,test);
					se.element().enterOrValidateText(getGL_AbuseMolestClassification_TXT_EstimatedExposure(strGL_AbuseMolestClassification_TXT_EstimatedExposure),strGL_AbuseMolestClassification_TXT_EstimatedExposure,test);
					se.element().enterOrValidateText(getGL_AbuseMolestClassification_TXT_ExposureBasis(strGL_AbuseMolestClassification_TXT_ExposureBasis),strGL_AbuseMolestClassification_TXT_ExposureBasis,test);
					
					se.element().clickElement(getNext());
					if(!strGL_AbuseMolestClassification_BTN_Done.equals("N/A")) {
						se.element().clickElement(getDone());
						}	
				
					}catch(Exception e){
							se.verify().verifyEquals("Failed to fill in details for GL_AbuseAndMolestationClassification ", true, false, true, test);			
					}
						iteration++;
					}

				} catch (Exception e) {
					// TODO: handle exception
					se.log().logTestStep(
							"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
					test.log(LogStatus.FAIL, "Failed",
							"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
					testTearDown(se, test);
				}

			}
				}
