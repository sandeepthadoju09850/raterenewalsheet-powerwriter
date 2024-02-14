package pw.pages.WC;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_WC;

public class WC_NameLocationLinking extends OR_WC {
public void  NameLocationLinking(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			    if(suspendSheet.equalsIgnoreCase(constants.WC_NameLocationLinking)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.WC_NameLocationLinking, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strNameLocationLinking_BTN_Add = (String) row.get("NameLocationLinking_BTN_Add");
				String strNameLocationLinking_BTN_Details = (String) row.get("NameLocationLinking_BTN_Details");
				String strNameLocationLinking_BTN_Done = (String) row.get("NameLocationLinking_BTN_Done");
				
				String strNameLocationLinking_CHK_DelRow_Select = (String) row.get("NameLocationLinking_CHK_DelRow_Select");
				String strNameLocationLinking_CHK_DeleteLink = (String) row.get("NameLocationLinking_CHK_DeleteLink");
				String strNameLocationLinking_TXT_Name = (String) row.get("NameLocationLinking_TXT_Name");
				String strNameLocationLinking_TXT_NameFilterNeeded = (String) row.get("NameLocationLinking_TXT_NameFilterNeeded");
				String strNameLocationLinking_TXT_InsuredType = (String) row.get("NameLocationLinking_TXT_InsuredType");
				String strNameLocationLinking_TXT_InsuredTypeFilterNeeded = (String) row.get("NameLocationLinking_TXT_InsuredTypeFilterNeeded");
				String strNameLocationLinking_TXT_BusinessDesc = (String) row.get("NameLocationLinking_TXT_BusinessDesc");
				String strNameLocationLinking_TXT_DoingBusinessAs = (String) row.get("NameLocationLinking_TXT_DoingBusinessAs");
				String strNameLocationLinking_DDN_StateOfIncorporation = (String) row.get("NameLocationLinking_DDN_StateOfIncorporation");
				String strNameLocationLinking_TXT_YearsOfOperation = (String) row.get("NameLocationLinking_TXT_YearsOfOperation");
				String strNameLocationLinking_TXT_SearchKeywors = (String) row.get("NameLocationLinking_TXT_SearchKeywors");
				String strNameLocationLinking_TXT_FEIN = (String) row.get("NameLocationLinking_TXT_FEIN");
				String strNameLocationLinking_TXT_LocationNo = (String) row.get("NameLocationLinking_TXT_LocationNo");
				String strNameLocationLinking_TXT_LocationNoFilterNeeded = (String) row.get("NameLocationLinking_TXT_LocationNoFilterNeeded");
				String strNameLocationLinking_TXT_Loc_Name = (String) row.get("NameLocationLinking_TXT_Loc_Name");
				String strNameLocationLinking_TXT_Loc_Description = (String) row.get("NameLocationLinking_TXT_Loc_Description");
				String strNameLocationLinking_TXT_Street1 = (String) row.get("NameLocationLinking_TXT_Street1");
				String strNameLocationLinking_TXT_Street2 = (String) row.get("NameLocationLinking_TXT_Street2");
				String strNameLocationLinking_TXT_City = (String) row.get("NameLocationLinking_TXT_City");
				String strNameLocationLinking_DDN_State = (String) row.get("NameLocationLinking_DDN_State");
				String strNameLocationLinking_TXT_Zip = (String) row.get("NameLocationLinking_TXT_Zip");
				String strNameLocationLinking_TXT_ZipFilterNeeded = (String) row.get("NameLocationLinking_TXT_ZipFilterNeeded");
				String strNameLocationLinking_TXT_Phone = (String) row.get("NameLocationLinking_TXT_Phone");

				try
				{
					test.log(LogStatus.INFO, "WC_NameLocationLinking","Transaction Step : "+ transaction + "<br>" +"Page : WC_NameLocationLinking");
					se.log().logSeStep("Selecting WC_NameLocationLinking ");
					se.verify().verifyEquals("WC_NameLocationLinking page of PowerWriter ", getNameLocationLinking_BTN_Label().isDisplayed(),true, true,test);
					
					if(strNameLocationLinking_BTN_Add.equalsIgnoreCase("Yes")){
						se.element().Click(getNameLocationLinking_BTN_Add(strNameLocationLinking_BTN_Add),test);
					}
						
					if(!strNameLocationLinking_BTN_Details.equalsIgnoreCase("N/A")){
						se.element().Click(getNameLocationLinking_BTN_Details(strNameLocationLinking_BTN_Details), test);
					}
					if(strNameLocationLinking_CHK_DeleteLink.equalsIgnoreCase("Yes")){
						se.element().checkUncheckOrValidate(getNameLocationLinking_CHK_DelRow_Select(strNameLocationLinking_CHK_DeleteLink),"Check",test);
						se.element().Click(getNameLocationLinking_CHK_DeleteLink(strNameLocationLinking_CHK_DeleteLink), test);
						
					}
								
										
					se.element().checkUncheckOrValidate(getNameLocationLinking_CHK_DeleteLink(strNameLocationLinking_CHK_DeleteLink),strNameLocationLinking_CHK_DeleteLink,test);
					 se.element().selectPopupWithMagnifier(getNameLocationLinking_TXT_Name(strNameLocationLinking_TXT_Name),getNameLocationLinking_TXT_NameSearch(strNameLocationLinking_TXT_Name),strNameLocationLinking_TXT_Name,strNameLocationLinking_TXT_NameFilterNeeded,strNameLocationLinking_TXT_Name, constants.NA, constants.NA,constants.NA,test);
					 se.element().selectPopupWithMagnifier(getNameLocationLinking_TXT_InsuredType(strNameLocationLinking_TXT_InsuredType),getNameLocationLinking_TXT_InsuredTypeSearch(strNameLocationLinking_TXT_InsuredType),strNameLocationLinking_TXT_InsuredType,strNameLocationLinking_TXT_InsuredTypeFilterNeeded,strNameLocationLinking_TXT_InsuredType, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getNameLocationLinking_TXT_BusinessDesc(strNameLocationLinking_TXT_BusinessDesc),strNameLocationLinking_TXT_BusinessDesc,test);
					se.element().enterOrValidateText(getNameLocationLinking_TXT_DoingBusinessAs(strNameLocationLinking_TXT_DoingBusinessAs),strNameLocationLinking_TXT_DoingBusinessAs,test);
					se.element().Click(getNameLocationLinking_DDN_StateOfIncorporation(strNameLocationLinking_DDN_StateOfIncorporation),strNameLocationLinking_DDN_StateOfIncorporation,test);
					se.element().enterOrValidateText(getNameLocationLinking_TXT_YearsOfOperation(strNameLocationLinking_TXT_YearsOfOperation),strNameLocationLinking_TXT_YearsOfOperation,test);
					se.element().enterOrValidateText(getNameLocationLinking_TXT_SearchKeywors(strNameLocationLinking_TXT_SearchKeywors),strNameLocationLinking_TXT_SearchKeywors,test);
					se.element().enterOrValidateText(getNameLocationLinking_TXT_FEIN(strNameLocationLinking_TXT_FEIN),strNameLocationLinking_TXT_FEIN,test);
					se.element().selectPopupWithMagnifier(getNameLocationLinking_TXT_LocationNo(strNameLocationLinking_TXT_LocationNo),getNameLocationLinking_TXT_LocationNoSearch(strNameLocationLinking_TXT_LocationNo),strNameLocationLinking_TXT_LocationNo,strNameLocationLinking_TXT_LocationNoFilterNeeded,strNameLocationLinking_TXT_LocationNo, constants.NA, constants.NA,constants.NA,test);

					se.element().Click(getNameLocationLinking_TXT_Loc_Name(strNameLocationLinking_TXT_Loc_Name),strNameLocationLinking_TXT_Loc_Name,test);
					se.element().Click(getNameLocationLinking_TXT_Loc_Description(strNameLocationLinking_TXT_Loc_Description),strNameLocationLinking_TXT_Loc_Description,test);
					se.element().enterOrValidateText(getNameLocationLinking_TXT_Street1(strNameLocationLinking_TXT_Street1),strNameLocationLinking_TXT_Street1,test);
					se.element().enterOrValidateText(getNameLocationLinking_TXT_Street2(strNameLocationLinking_TXT_Street2),strNameLocationLinking_TXT_Street2,test);
					se.element().enterOrValidateText(getNameLocationLinking_TXT_City(strNameLocationLinking_TXT_City),strNameLocationLinking_TXT_City,test);
					se.element().Click(getNameLocationLinking_DDN_State(strNameLocationLinking_DDN_State),strNameLocationLinking_DDN_State,test);
					 se.element().selectPopupWithMagnifier(getNameLocationLinking_TXT_Zip(strNameLocationLinking_TXT_Zip),getNameLocationLinking_TXT_ZipSearch(strNameLocationLinking_TXT_Zip),strNameLocationLinking_TXT_Zip,strNameLocationLinking_TXT_ZipFilterNeeded,strNameLocationLinking_TXT_Zip, constants.NA, constants.NA,constants.NA,test);

					se.element().enterOrValidateText(getNameLocationLinking_TXT_Phone(strNameLocationLinking_TXT_Phone),strNameLocationLinking_TXT_Phone,test);
	                 se.element().clickElement(getNext());
	                
	                 if(strNameLocationLinking_BTN_Done.equalsIgnoreCase(constants.Yes)){
	     				se.element().Click(getDone(),test);	
	     			}
				}catch(Exception e) {
					se.verify().verifyEquals("Failed to fill in details for WC_NameLocationLinking", true, false, true, test);
										
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
