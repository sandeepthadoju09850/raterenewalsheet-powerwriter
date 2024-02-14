
package pw.pages.CA;

/**
 * @author ${ra09491}
 */

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CA;

public class CA_NamedDriverCollision extends OR_CA  {
	
	public void CANamedDriverCollisionPage(String strRegressionID,String transaction,String suspendSheet,ExtentTest test) throws IOException {
	
		try{
	    if(suspendSheet.equalsIgnoreCase(constants.CA_NamedDriverCollison)){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
	         testTearDown(se, test);
	    }
	    
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_NamedDriverCollison, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strNamedDriverColl_BTN_Add = (String) row.get("NamedDriverColl_BTN_Add");
			String strNamedDriverColl_BTN_Details = (String) row.get("NamedDriverColl_BTN_Details");
			String strNamedDriverColl_BTN_Done = (String) row.get("NamedDriverColl_BTN_Done");
			String strNamedDriverColl_TXT_LocationNo = (String) row.get("NamedDriverColl_TXT_LocationNo");
			String strNamedDriverColl_TXT_Name = (String) row.get("NamedDriverColl_TXT_Name");
			String strNamedDriverColl_TXT_Description = (String) row.get("NamedDriverColl_TXT_Description");
			String strNamedDriverColl_TXT_DriverNo = (String) row.get("NamedDriverColl_TXT_DriverNo");
			String strNamedDriverColl_TXT_DriverNoFilterNeeded = (String) row.get("NamedDriverColl_TXT_DriverNoFilterNeeded");
			String strNamedDriverColl_TXT_TitlePrefix = (String) row.get("NamedDriverColl_TXT_TitlePrefix");
			String strNamedDriverColl_TXT_FirstName = (String) row.get("NamedDriverColl_TXT_FirstName");
			String strNamedDriverColl_TXT_MiddleName = (String) row.get("NamedDriverColl_TXT_MiddleName");
			String strNamedDriverColl_TXT_LastName = (String) row.get("NamedDriverColl_TXT_LastName");
			String strNamedDriverColl_TXT_NameSuffix = (String) row.get("NamedDriverColl_TXT_NameSuffix");
			String strNamedDriverColl_TXT_DateOfBirth = (String) row.get("NamedDriverColl_TXT_DateOfBirth");
			String strNamedDriverColl_CHK_GenderMale = (String) row.get("NamedDriverColl_CHK_GenderMale");
			String strNamedDriverColl_CHK_GenderFemale = (String) row.get("NamedDriverColl_CHK_GenderFemale");
			String strNamedDriverColl_TXT_MaritalStatus = (String) row.get("NamedDriverColl_TXT_MaritalStatus");
			String strNamedDriverColl_TXT_DateOfHire = (String) row.get("NamedDriverColl_TXT_DateOfHire");
			String strNamedDriverColl_TXT_DeductibleFilterNeeded = (String) row.get("NamedDriverColl_TXT_DeductibleFilterNeeded");
			String strNamedDriverColl_TXT_Deductible = (String) row.get("NamedDriverColl_TXT_Deductible");
			try
			{
				se.log().logTestStep("Named Driver Collision");
				test.log(LogStatus.INFO, "Named Driver Collision page","Transaction Step : "+transaction + "<br>" +"Page : CA_NamedDriverCollision");
				se.verify().verifyEquals("Named Driver Collision  of PowerWriter ", getNamedDriverColl_BTN_Label().isDisplayed(),true, true,test);
				
				if(!strNamedDriverColl_BTN_Add.equals(constants.NA)){
					se.element().Click(getNamedDriverColl_BTN_Add(strNamedDriverColl_BTN_Add),strNamedDriverColl_BTN_Add,test);
				}
				if(!strNamedDriverColl_BTN_Details.equals(constants.NA)){
					se.element().Click(getNamedDriverColl_BTN_Details(strNamedDriverColl_BTN_Details),strNamedDriverColl_BTN_Details,test);
				
				}
				se.element().enterOrValidateText(getNamedDriverColl_TXT_LocationNo(strNamedDriverColl_TXT_LocationNo),strNamedDriverColl_TXT_LocationNo,test);
				se.element().enterOrValidateText(getNamedDriverColl_TXT_Name(strNamedDriverColl_TXT_Name),strNamedDriverColl_TXT_Name,test);
				se.element().enterOrValidateText(getNamedDriverColl_TXT_Description(strNamedDriverColl_TXT_Description),strNamedDriverColl_TXT_Description,test);
				se.element().selectPopupWithMagnifier(getNamedDriverColl_TXT_DriverNo(strNamedDriverColl_TXT_DriverNo),getNamedDriverColl_TXT_DriverNoSearch(strNamedDriverColl_TXT_DriverNo),strNamedDriverColl_TXT_DriverNo,strNamedDriverColl_TXT_DriverNoFilterNeeded,strNamedDriverColl_TXT_DriverNo, constants.NA, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getNamedDriverColl_TXT_TitlePrefix(strNamedDriverColl_TXT_TitlePrefix),strNamedDriverColl_TXT_TitlePrefix,test);
				se.element().enterOrValidateText(getNamedDriverColl_TXT_FirstName(strNamedDriverColl_TXT_FirstName),strNamedDriverColl_TXT_FirstName,test);
				se.element().enterOrValidateText(getNamedDriverColl_TXT_MiddleName(strNamedDriverColl_TXT_MiddleName),strNamedDriverColl_TXT_MiddleName,test);
				se.element().enterOrValidateText(getNamedDriverColl_TXT_LastName(strNamedDriverColl_TXT_LastName),strNamedDriverColl_TXT_LastName,test);
				se.element().enterOrValidateText(getNamedDriverColl_TXT_NameSuffix(strNamedDriverColl_TXT_NameSuffix),strNamedDriverColl_TXT_NameSuffix,test);
				se.element().enterOrValidateText(getNamedDriverColl_TXT_DateOfBirth(strNamedDriverColl_TXT_DateOfBirth),strNamedDriverColl_TXT_DateOfBirth,test);
				se.element().checkUncheckOrValidate(getNamedDriverColl_CHK_GenderMale(strNamedDriverColl_CHK_GenderMale),strNamedDriverColl_CHK_GenderMale,test);
				se.element().checkUncheckOrValidate(getNamedDriverColl_CHK_GenderFemale(strNamedDriverColl_CHK_GenderFemale),strNamedDriverColl_CHK_GenderFemale,test);
				se.element().enterOrValidateText(getNamedDriverColl_TXT_MaritalStatus(strNamedDriverColl_TXT_MaritalStatus),strNamedDriverColl_TXT_MaritalStatus,test);
				se.element().enterOrValidateText(getNamedDriverColl_TXT_DateOfHire(strNamedDriverColl_TXT_DateOfHire),strNamedDriverColl_TXT_DateOfHire,test);
				se.element().selectPopupWithMagnifier(getNamedDriverColl_TXT_Deductible(strNamedDriverColl_TXT_Deductible),getNamedDriverColl_TXT_DeductibleSearch(strNamedDriverColl_TXT_Deductible),strNamedDriverColl_TXT_Deductible,strNamedDriverColl_TXT_DeductibleFilterNeeded,strNamedDriverColl_TXT_Deductible, constants.NA, constants.NA,constants.NA,test);
				se.element().clickElement(getNext(),test);
				if(!strNamedDriverColl_BTN_Done.equals(constants.NA)){
					se.element().Click(getNamedDriverColl_BTN_Done(strNamedDriverColl_BTN_Done),strNamedDriverColl_BTN_Done,test);
				}
				
			}
			catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for Named Driver Collision page ", true, false, true, test);
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
