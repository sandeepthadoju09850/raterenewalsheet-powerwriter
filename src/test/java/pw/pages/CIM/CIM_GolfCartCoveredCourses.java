package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CIM;

public class CIM_GolfCartCoveredCourses extends OR_CIM{
		
		public void GolfCartCoveredCourses(String strRegressionID,String transaction,ExtentTest test) throws IOException {
			try{
			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		    if(SuspendSheet.equalsIgnoreCase("CIM_GolfCartCoveredCourses")){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
		         testTearDown(se, test);
		    }
			List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_GolfCartCoveredCourses", strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strCIM_GolfCartCoveredCourses_BTN_ADD = (String) row.get("CIM_GolfCartCoveredCourses_BTN_ADD");
			String strCIM_GolfCartCoveredCourses_BTN_Details = (String) row.get("CIM_GolfCartCoveredCourses_BTN_Details");
			String strCIM_GolfCartCoveredCourses_BTN_Done = (String) row.get("CIM_GolfCartCoveredCourses_BTN_Done");
			String strCIM_GolfCartCoveredCourses_TXT_CoveredCourseLocationNo = (String) row.get("CIM_GolfCartCoveredCourses_TXT_CoveredCourseLocationNo");
			String strCIM_GolfCartCoveredCourses_TXT_Description = (String) row.get("CIM_GolfCartCoveredCourses_TXT_Description");
			String strCIM_GolfCartCoveredCourses_TXT_Street = (String) row.get("CIM_GolfCartCoveredCourses_TXT_Street");
			String strCIM_GolfCartCoveredCourses_TXT_SteUnit = (String) row.get("CIM_GolfCartCoveredCourses_TXT_Ste/Unit");
			String strCIM_GolfCartCoveredCourses_TXT_City = (String) row.get("CIM_GolfCartCoveredCourses_TXT_City");
			String strCIM_GolfCartCoveredCourses_TXT_State = (String) row.get("CIM_GolfCartCoveredCourses_TXT_State");
			String strCIM_GolfCartCoveredCourses_TXT_Zip = (String) row.get("CIM_GolfCartCoveredCourses_TXT_Zip");
			String strCIM_GolfCartCoveredCourses_TXT_CoveredCourseName = (String) row.get("CIM_GolfCartCoveredCourses_TXT_CoveredCourseName");
			
			
			
			try{
				se.log().logTestStep("GolfCartCoveredCourses");
				test.log(LogStatus.INFO, "GolfCartCoveredCourses page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMGolfCartCoveredCourses");
				se.verify().verifyEquals("GolfCartCoveredCourses page of PowerWriter ", getCIM_GolfCartCoveredCourses_TXT_VerifyGolfCartCoveredCoursesText().isDisplayed(),true, true,test);
				
				if((strCIM_GolfCartCoveredCourses_BTN_ADD.equalsIgnoreCase("Yes"))){
					se.element().Click(getCIM_GolfCartCoveredCourses_BTN_ADD(strCIM_GolfCartCoveredCourses_BTN_ADD),test);
					}
					if((strCIM_GolfCartCoveredCourses_BTN_Details.equalsIgnoreCase("Yes"))){
					se.element().tryClick(getCIM_GolfCartCoveredCourses_BTN_Details(strCIM_GolfCartCoveredCourses_BTN_Details),test);
					}
				
				se.element().selectPopupWithMagnifier(getCIM_GolfCartCoveredCourses_TXT_CoveredCourseLocationNo(strCIM_GolfCartCoveredCourses_TXT_CoveredCourseLocationNo), getCIM_GolfCartCoveredCourses_BTN_CoveredCourseLocationNoSearch(strCIM_GolfCartCoveredCourses_TXT_CoveredCourseLocationNo), strCIM_GolfCartCoveredCourses_TXT_CoveredCourseLocationNo, constants.NA, strCIM_GolfCartCoveredCourses_TXT_CoveredCourseLocationNo, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCIM_GolfCartCoveredCourses_TXT_Description(strCIM_GolfCartCoveredCourses_TXT_Description),strCIM_GolfCartCoveredCourses_TXT_Description,test);
				se.element().enterOrValidateText(getCIM_GolfCartCoveredCourses_TXT_Street(strCIM_GolfCartCoveredCourses_TXT_Street),strCIM_GolfCartCoveredCourses_TXT_Street,test);
				se.element().enterOrValidateText(getCIM_GolfCartCoveredCourses_TXT_SteUnit(strCIM_GolfCartCoveredCourses_TXT_SteUnit),strCIM_GolfCartCoveredCourses_TXT_SteUnit,test);
				se.element().enterOrValidateText(getCIM_GolfCartCoveredCourses_TXT_City(strCIM_GolfCartCoveredCourses_TXT_City),strCIM_GolfCartCoveredCourses_TXT_City,test);
				se.element().enterOrValidateText(getCIM_GolfCartCoveredCourses_TXT_State(strCIM_GolfCartCoveredCourses_TXT_State),strCIM_GolfCartCoveredCourses_TXT_State,test);
				se.element().enterOrValidateText(getCIM_GolfCartCoveredCourses_TXT_Zip(strCIM_GolfCartCoveredCourses_TXT_Zip),strCIM_GolfCartCoveredCourses_TXT_Zip,test);
				se.element().enterOrValidateText(getCIM_GolfCartCoveredCourses_TXT_CoveredCourseName(strCIM_GolfCartCoveredCourses_TXT_CoveredCourseName),strCIM_GolfCartCoveredCourses_TXT_CoveredCourseName,test);

				se.element().Click(getNext(),test);
				
				if((strCIM_GolfCartCoveredCourses_BTN_Done.equalsIgnoreCase("Yes"))){
					
					se.element().Click(getDone(),test);
				}
			
			}
			catch (Exception e) {
				se.verify().verifyEquals("Failed to fill in details for CIM_GolfCartCoveredCourses", true, false, true, test);
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