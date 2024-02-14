package pw.pages.WC;
/**
* @author ${sh09475}
*/
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_WC;

public class WC_Locations extends OR_WC {
public void Locations(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			
		    if(suspendSheet.equalsIgnoreCase(constants.WCLocations)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.WCLocations, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
				String strLocations_BTN_Add = (String) row.get("Locations_BTN_Add");
				String strLocations_BTN_Details = (String) row.get("Locations_BTN_Details");
				String strLocations_BTN_Delete = (String) row.get("Locations_BTN_Delete");
				String strLocations_BTN_Done = (String) row.get("Locations_BTN_Done");
				String strLocations_TXT_Location_No = (String) row.get("Locations_TXT_Location_No");
				String strLocations_CHK_CopyAddressDetails = (String) row.get("Locations_CHK_CopyAddressDetails");
				String strLocations_TXT_Name = (String) row.get("Locations_TXT_Name");
				String strLocations_TXT_Description = (String) row.get("Locations_TXT_Description");
				String strLocations_TXT_Street = (String) row.get("Locations_TXT_Street");
				String strLocations_TXT_City = (String) row.get("Locations_TXT_City");
				String strLocations_DDN_State = (String) row.get("Locations_DDN_State");
				String strLocations_TXT_Zip = (String) row.get("Locations_TXT_Zip");
				String strLocations_CHK_AddressAsEntered = (String) row.get("Locations_CHK_AddressAsEntered");
				String strLocations_TXT_NumOfEmployees = (String) row.get("Locations_TXT_NumOfEmployees");
				String strLocations_TXT_ContractOrProject = (String) row.get("Locations_TXT_ContractOrProject");
				
			
				try
				{
					se.log().logSeStep("WC_Locations");
					test.log(LogStatus.INFO, "WC_Locations","Transaction Step : "+ transaction + "<br>" +"Page : WCLocations");
					se.verify().verifyEquals("WC_Locations page of PowerWriter ", getLocations_TXT_LabelName().isDisplayed(),true, true,test);
	
					
					if(strLocations_BTN_Add.equalsIgnoreCase("Yes")){
						se.element().Click(getLocations_BTN_Add(),test);
					}
					
					if(!strLocations_BTN_Details.equalsIgnoreCase("N/A")){
						se.element().Click(getLocations_BTN_Details(strLocations_BTN_Details),test);
					}
					
					if(strLocations_BTN_Delete.equalsIgnoreCase("Yes")){
						se.element().Click(getLocations_BTN_Delete(),test);
					}
					
					se.element().enterOrValidateText(getLocations_TXT_Location_No(strLocations_TXT_Location_No),strLocations_TXT_Location_No,test);
					se.element().checkUncheckOrValidate(getLocations_CHK_CopyAddressDetails(strLocations_CHK_CopyAddressDetails),strLocations_CHK_CopyAddressDetails,test);
					se.element().enterOrValidateText(getLocations_TXT_Name(strLocations_TXT_Name),strLocations_TXT_Name,test);
					se.element().enterOrValidateText(getLocations_TXT_Description(strLocations_TXT_Description),strLocations_TXT_Description,test);
					se.element().enterOrValidateText(getLocations_TXT_Street(strLocations_TXT_Street),strLocations_TXT_Street,test);
					se.element().enterOrValidateText(getLocations_TXT_City(strLocations_TXT_City),strLocations_TXT_City,test);
					se.element().selectElementDDrOrValidateText(getLocations_DDN_State(strLocations_DDN_State),strLocations_DDN_State,test);
					se.element().enterOrValidateText(getLocations_TXT_Zip(strLocations_TXT_Zip),strLocations_TXT_Zip,test);
					se.element().checkUncheckOrValidate(getLocations_CHK_AddressAsEntered(strLocations_CHK_AddressAsEntered),strLocations_CHK_AddressAsEntered,test);
					se.element().enterOrValidateText(getLocations_TXT_NumOfEmployees(strLocations_TXT_NumOfEmployees),strLocations_TXT_NumOfEmployees,test);
					se.element().enterOrValidateText(getLocations_TXT_ContractOrProject(strLocations_TXT_ContractOrProject),strLocations_TXT_ContractOrProject,test);
					se.element().Click(getNext(),test);
					
					if(strLocations_BTN_Done.equalsIgnoreCase("Yes")){
						se.element().Click(getDone(),test);
						}
					
				}catch(Exception e) {
					se.verify().verifyEquals("Failed to fill in details for WC_Locations", true, false, true, test);
							
					
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
