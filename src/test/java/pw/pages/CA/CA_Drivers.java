package pw.pages.CA;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CA;

public class CA_Drivers extends OR_CA  {
	
	public void Drivers(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
	
		try{
			if(suspendSheet.equalsIgnoreCase(constants.CA_Drivers)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData("Drivers", strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
				
				String strDrivers_TXT_BTN_AddDriver = (String) row.get("Drivers_TXT_BTN_AddDriver");
				String strDrivers_BTN_DoneDriver = (String) row.get("Drivers_BTN_DoneDriver");
				String strDrivers_BTN_RemoveDriver = (String) row.get("Drivers_BTN_RemoveDriver");
				String strDrivers_BTN_CopyDriver = (String) row.get("Drivers_BTN_CopyDriver");
				String strDrivers_BTN_EditDriver = (String) row.get("Drivers_BTN_EditDriver");
				String strDrivers_TXT_DriverNumber = (String) row.get("Drivers_TXT_DriverNumber");
				String strDrivers_DDN_TitlePrefix = (String) row.get("Drivers_DDN_TitlePrefix");
				String strDrivers_CHK_ExcludeDriver_YES = (String) row.get("Drivers_CHK_ExcludeDriver_YES");
				String strDrivers_CHK_ExcludeDriver_NO = (String) row.get("Drivers_CHK_ExcludeDriver_NO");
				String strDrivers_DDN_StateOfOperations = (String) row.get("Drivers_DDN_StateOfOperations");
				String strDrivers_TXT_FirstName = (String) row.get("Drivers_TXT_FirstName");
				String strDrivers_TXT_MiddleName = (String) row.get("Drivers_TXT_MiddleName");
				String strDrivers_TXT_LastName = (String) row.get("Drivers_TXT_LastName");
				String strDrivers_TXT_NameSuffix = (String) row.get("Drivers_TXT_NameSuffix");
				String strDrivers_TXT_DateOfBirth = (String) row.get("Drivers_TXT_DateOfBirth");
				String strDrivers_CHK_Gender_Male = (String) row.get("Drivers_CHK_Gender_Male");
				String strDrivers_CHK_Gender_Female = (String) row.get("Drivers_CHK_Gender_Female");
				String strDrivers_DDN_MaritalStatus = (String) row.get("Drivers_DDN_MaritalStatus");
				String strDrivers_TXT_DateofHire = (String) row.get("Drivers_TXT_DateofHire");
				String strDrivers_TXT_Streetline_1 = (String) row.get("Drivers_TXT_Streetline_1");
				String strDrivers_TXT_Streetline_2 = (String) row.get("Drivers_TXT_Streetline_2");
				String strDrivers_DDN_City = (String) row.get("Drivers_DDN_City");
				String strDrivers_DDN_State = (String) row.get("Drivers_DDN_State");
				String strDrivers_DDN_Zipcode = (String) row.get("Drivers_DDN_Zipcode");
				String strDrivers_TXT_YearsOfDrivingExperience = (String) row.get("Drivers_TXT_YearsOfDrivingExperience");
				String strDrivers_TXT_License_Year = (String) row.get("Drivers_TXT_License_Year");
				String strDrivers_TXT_License_Number = (String) row.get("Drivers_TXT_License_Number");
				String strDrivers_DDN_License_State = (String) row.get("Drivers_DDN_License_State");
				
				try{
					se.log().logTestStep("Drivers");
					test.log(LogStatus.INFO, "Drivers page","Transaction Step : " + transaction + "<br>" +"Page : Drivers"); 
					se.verify().verifyEquals("Drivers Page of PowerWriter ", getCA_Drivers_LBL_VerifyDrivers().isDisplayed(),true, true,test);
					
					if(strDrivers_TXT_BTN_AddDriver.equalsIgnoreCase("Yes")){
						se.element().Click(getDrivers_TXT_BTN_AddDriver(),test);
					}
					if(!strDrivers_BTN_EditDriver.equalsIgnoreCase("N/A")){
						se.element().Click(getDrivers_BTN_EditDriver(strDrivers_BTN_EditDriver),test);
					}
					if(strDrivers_BTN_RemoveDriver.equalsIgnoreCase("Yes")){
						se.element().Click(getDrivers_BTN_RemoveDriver(),test);
					}
					if(strDrivers_TXT_BTN_AddDriver.equals("Yes")||strDrivers_BTN_EditDriver.equals("Yes")){
							se.util().sleep(2000);
							se.element().enterOrValidateText(getDrivers_TXT_DriverNumber(strDrivers_TXT_DriverNumber),strDrivers_TXT_DriverNumber,test);
							se.element().enterOrValidateText(getDrivers_DDN_TitlePrefix(strDrivers_DDN_TitlePrefix),strDrivers_DDN_TitlePrefix,test);
							se.element().checkUncheckOrValidate(getDrivers_CHK_ExcludeDriver_YES(strDrivers_CHK_ExcludeDriver_YES),strDrivers_CHK_ExcludeDriver_YES,test);
							se.element().checkUncheckOrValidate(getDrivers_CHK_ExcludeDriver_NO(strDrivers_CHK_ExcludeDriver_NO),strDrivers_CHK_ExcludeDriver_NO,test);
							se.element().enterOrValidateText(getDrivers_DDN_StateOfOperations(strDrivers_DDN_StateOfOperations),strDrivers_DDN_StateOfOperations,test);
							se.element().enterOrValidateText(getDrivers_TXT_FirstName(strDrivers_TXT_FirstName),strDrivers_TXT_FirstName,test);
							se.element().enterOrValidateText(getDrivers_TXT_MiddleName(strDrivers_TXT_MiddleName),strDrivers_TXT_MiddleName,test);
							se.element().enterOrValidateText(getDrivers_TXT_LastName(strDrivers_TXT_LastName),strDrivers_TXT_LastName,test);
							se.element().enterOrValidateText(getDrivers_TXT_NameSuffix(strDrivers_TXT_NameSuffix),strDrivers_TXT_NameSuffix,test);
							se.element().enterOrValidateText(getDrivers_TXT_DateOfBirth(strDrivers_TXT_DateOfBirth),strDrivers_TXT_DateOfBirth,test);
							se.element().checkUncheckOrValidate(getDrivers_CHK_Gender_Male(strDrivers_CHK_Gender_Male),strDrivers_CHK_Gender_Male,test);
							se.element().checkUncheckOrValidate(getDrivers_CHK_Gender_Female(strDrivers_CHK_Gender_Female),strDrivers_CHK_Gender_Female,test);
							se.element().enterOrValidateText(getDrivers_DDN_MaritalStatus(strDrivers_DDN_MaritalStatus),strDrivers_DDN_MaritalStatus,test);
							se.element().enterOrValidateText(getDrivers_TXT_DateofHire(strDrivers_TXT_DateofHire),strDrivers_TXT_DateofHire,test);
							se.element().enterOrValidateText(getDrivers_TXT_Streetline_1(strDrivers_TXT_Streetline_1),strDrivers_TXT_Streetline_1,test);
							se.element().enterOrValidateText(getDrivers_TXT_Streetline_2(strDrivers_TXT_Streetline_2),strDrivers_TXT_Streetline_2,test);
							se.element().enterOrValidateText(getDrivers_DDN_City(strDrivers_DDN_City),strDrivers_DDN_City,test);
							se.element().enterOrValidateText(getDrivers_DDN_State(strDrivers_DDN_State),strDrivers_DDN_State,test);
							se.element().enterOrValidateText(getDrivers_DDN_Zipcode(strDrivers_DDN_Zipcode),strDrivers_DDN_Zipcode,test);
							se.element().enterOrValidateText(getDrivers_TXT_YearsOfDrivingExperience(strDrivers_TXT_YearsOfDrivingExperience),strDrivers_TXT_YearsOfDrivingExperience,test);
							se.element().enterOrValidateText(getDrivers_TXT_License_Year(strDrivers_TXT_License_Year),strDrivers_TXT_License_Year,test);
							se.element().enterOrValidateText(getDrivers_TXT_License_Number(strDrivers_TXT_License_Number),strDrivers_TXT_License_Number,test);
							se.element().enterOrValidateText(getDrivers_DDN_License_State(strDrivers_DDN_License_State),strDrivers_DDN_License_State,test);
							se.element().Click(getNext(),test);
						}
						if(strDrivers_BTN_DoneDriver.equalsIgnoreCase("Yes")){
							se.element().Click(getNext(),test);
						}			
				}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for drivers ", true, false, true, test);	
				}				
				iteration++;
			}
			
		} catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			testTearDown(se, test);
		}
	}
}