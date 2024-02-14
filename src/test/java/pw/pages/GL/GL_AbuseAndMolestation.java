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

public class GL_AbuseAndMolestation extends OR_GL{
	
	public void GL_AbuseAndMolestationMethod(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.GL_AbuseAndMolestation)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}	
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.GL_AbuseAndMolestation, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
				String strGL_AbuseAndMolest_TXT_OccurenceLimit = (String) row.get("GL_AbuseAndMolest_TXT_OccurenceLimit");
				String strGL_AbuseAndMolest_TXT_AggregateLimitFilterNeeded = (String) row.get("GL_AbuseAndMolest_TXT_AggregateLimitFilterNeeded");
				String strGL_AbuseAndMolest_TXT_AggregateLimitPopup = (String) row.get("GL_AbuseAndMolest_TXT_AggregateLimitPopup");
				String strGL_AbuseAndMolest_TXT_AggregateLimit = (String) row.get("GL_AbuseAndMolest_TXT_AggregateLimit");
				
				try{
					se.log().logTestStep("GL_AbuseAndMolestation");
					test.log(LogStatus.INFO, "GL_AbuseAndMolestation page","Transaction Step : "+transaction + "<br>" +"Page : GL_AbuseAndMolestation");
					//se.element().waitForElementIsDisplayed(getGL_SpecialityOption_label(), 10);
					
					se.element().selectPopupWithMagnifier(getGL_AbuseAndMolest_TXT_OccurenceLimit(strGL_AbuseAndMolest_TXT_OccurenceLimit), getGL_AbuseAndMolest_BTN_OccurenceLimitSearch(strGL_AbuseAndMolest_TXT_OccurenceLimit), strGL_AbuseAndMolest_TXT_OccurenceLimit, strGL_AbuseAndMolest_TXT_AggregateLimitFilterNeeded, strGL_AbuseAndMolest_TXT_OccurenceLimit, strGL_AbuseAndMolest_TXT_AggregateLimitPopup, constants.NA, constants.NA, test);
					se.element().enterOrValidateText(getGL_AbuseAndMolest_TXT_AggregateLimit(strGL_AbuseAndMolest_TXT_AggregateLimit),strGL_AbuseAndMolest_TXT_AggregateLimit,test);
					
					se.element().Click(getNext(),test);
					
				}catch(Exception e){
						se.verify().verifyEquals("Failed to fill in details for GL_AbuseAndMolestation ", true, false, true, test);
						
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
