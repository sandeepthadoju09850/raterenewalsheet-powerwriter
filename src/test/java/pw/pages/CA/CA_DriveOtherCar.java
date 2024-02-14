package pw.pages.CA;

/**
 * @author ${pr09529}
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
import pw.OR.OR_CP;
import pw.OR.OR_GL;

public class CA_DriveOtherCar extends OR_CA{
	
	public void DriveOtherCar(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.CA_DriveOtherCar)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_DriveOtherCar, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
			String strDriveOtherCar_BTN_Add = (String) row.get("DriveOtherCar_BTN_Add");
			String strDriveOtherCar_BTN_Done = (String) row.get("DriveOtherCar_BTN_Done");
			String strDriveOtherCar_BTN_Remove = (String) row.get("DriveOtherCar_BTN_Remove");
			//String strDriveOtherCar_BTN_Copy = (String) row.get("DriveOtherCar_BTN_Copy");
			String strDriveOtherCar_BTN_Details = (String) row.get("DriveOtherCar_BTN_Details");
			String strDriveOtherCar_TXT_State = (String) row.get("DriveOtherCar_TXT_State");
			//String strDriveOtherCar_TXT_StateFilterNeeded = (String) row.get("DriveOtherCar_TXT_StateFilterNeeded");
			String strDriveOtherCar_TXT_Territory = (String) row.get("DriveOtherCar_TXT_Territory");
			String strDriveOtherCar_TXT_TerritoryFilterNeeded = (String) row.get("DriveOtherCar_TXT_TerritoryFilterNeeded");
			String strDriveOtherCar_CHK_TitlePrefix = (String) row.get("DriveOtherCar_CHK_TitlePrefix");
			String strDriveOtherCar_TXT_TitlePrefix = (String) row.get("DriveOtherCar_TXT_TitlePrefix");
			String strDriveOtherCar_TXT_TitlePrefixFilterNeeded = (String) row.get("DriveOtherCar_TXT_TitlePrefixFilterNeeded");
			String strDriveOtherCar_TXT_FirstName_IncludeSpouse = (String) row.get("DriveOtherCar_TXT_FirstName_IncludeSpouse");
			String strDriveOtherCar_TXT_MiddleName = (String) row.get("DriveOtherCar_TXT_MiddleName");
			String strDriveOtherCar_TXT_LastName = (String) row.get("DriveOtherCar_TXT_LastName");
			String strDriveOtherCar_TXT_NameSuffix = (String) row.get("DriveOtherCar_TXT_NameSuffix");
			String strDriveOtherCar_BTN_AddRow = (String) row.get("DriveOtherCar_BTN_AddRow");
			String strDriveOtherCar_BTN_RemoveRow = (String) row.get("DriveOtherCar_BTN_RemoveRow");
			String strDriveOtherCar_BTN_CopyRow = (String) row.get("DriveOtherCar_BTN_CopyRow");
			String strDriveOtherCar_CHK_Liability = (String) row.get("DriveOtherCar_CHK_Liability");
			String strDriveOtherCar_CHK_UnInsuredMotorist = (String) row.get("DriveOtherCar_CHK_UnInsuredMotorist");
			String strDriveOtherCar_CHK_UnderInsuredMotorist = (String) row.get("DriveOtherCar_CHK_UnderInsuredMotorist");
			String strDriveOtherCar_CHK_Comprehensive = (String) row.get("DriveOtherCar_CHK_Comprehensive");
			String strDriveOtherCar_TXT_ComprehensiveDeductible = (String) row.get("DriveOtherCar_TXT_ComprehensiveDeductible");
			String strDriveOtherCar_TXT_ComprehensiveDeductibleFilterNeeded = (String) row.get("DriveOtherCar_TXT_ComprehensiveDeductibleFilterNeeded");
			String strDriveOtherCar_CHK_Collision = (String) row.get("DriveOtherCar_CHK_Collision");
			String strDriveOtherCar_TXT_CollisionDeductible = (String) row.get("DriveOtherCar_TXT_CollisionDeductible");
			String strDriveOtherCar_TXT_CollisionDeductibleFilterNeeded = (String) row.get("DriveOtherCar_TXT_CollisionDeductibleFilterNeeded");
		//	String strDriveOtherCar_TXT_Liability_CombinedSingleLimit = (String) row.get("DriveOtherCar_TXT_Liability_CombinedSingleLimit");
		//	String strDriveOtherCar_TXT_Liability_Deductible = (String) row.get("DriveOtherCar_TXT_Liability_Deductible");
		//	String strDriveOtherCar_TXT_UnInsuredMotorist = (String) row.get("DriveOtherCar_TXT_UnInsuredMotorist");	
		//	String strDriveOtherCar_TXT_UnderInsuredMotorist = (String) row.get("DriveOtherCar_TXT_UnderInsuredMotorist");
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("CA_DriveOtherCar");
				test.log(LogStatus.INFO, "CA_DriveOtherCar page","Transaction Step : "+strTestDescription + "<br>" +"Page : CA_DriveOtherCar");
				se.verify().verifyEquals("CA_DriveOtherCar Page of PowerWriter ", getCA_DriveOtherCar_LabelName().isDisplayed(),true, true,test);
				
				if(strDriveOtherCar_BTN_Add.equalsIgnoreCase("Yes")){
					se.element().waitForElementIsDisplayed(DriveOtherCar_BTN_Add, 10);
					se.element().Click(getDriveOtherCar_BTN_Add(), test);
				}
				if(!strDriveOtherCar_BTN_Details.equalsIgnoreCase(constants.NA)){
					se.element().Click(getDriveOtherCar_BTN_Details(strDriveOtherCar_BTN_Details), test);
				}
				
				if(strDriveOtherCar_BTN_Remove.equalsIgnoreCase("Yes")){
					se.element().checkUncheckOrValidate(getDriveOtherCar_BTN_Remove(),"Check",test);
					se.element().Click(getDriveOtherCar_BTN_Remove(), test);
				}
					
					se.element().enterOrValidateText(getDriveOtherCar_TXT_State(strDriveOtherCar_TXT_State),strDriveOtherCar_TXT_State,test);
					se.element().selectPopupWithMagnifier(getDriveOtherCar_TXT_Territory(strDriveOtherCar_TXT_Territory),getDriveOtherCar_TXT_TerritorySearch(strDriveOtherCar_TXT_Territory),strDriveOtherCar_TXT_Territory,strDriveOtherCar_TXT_TerritoryFilterNeeded,strDriveOtherCar_TXT_Territory, constants.NA, constants.NA,constants.NA,test);
					if(strDriveOtherCar_BTN_AddRow.equalsIgnoreCase("Yes")){
						se.element().waitForElementIsDisplayed(DriveOtherCar_BTN_AddRow, 10);
						se.element().Click(getDriveOtherCar_BTN_AddRow(strDriveOtherCar_BTN_AddRow), test);
					}
					
					se.element().checkUncheckOrValidate(getDriveOtherCar_CHK_TitlePrefix(strDriveOtherCar_CHK_TitlePrefix),strDriveOtherCar_CHK_TitlePrefix,test);
					se.element().selectPopupWithMagnifier(getDriveOtherCar_TXT_TitlePrefix(strDriveOtherCar_TXT_TitlePrefix),getDriveOtherCar_TXT_TitlePrefixSearch(strDriveOtherCar_TXT_TitlePrefix),strDriveOtherCar_TXT_TitlePrefix,strDriveOtherCar_TXT_TitlePrefixFilterNeeded,strDriveOtherCar_TXT_TitlePrefix, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getDriveOtherCar_TXT_FirstName_IncludeSpouse(strDriveOtherCar_TXT_FirstName_IncludeSpouse),strDriveOtherCar_TXT_FirstName_IncludeSpouse,test);
					se.element().enterOrValidateText(getDriveOtherCar_TXT_MiddleName(strDriveOtherCar_TXT_MiddleName),strDriveOtherCar_TXT_MiddleName,test);
					se.element().enterOrValidateText(getDriveOtherCar_TXT_LastName(strDriveOtherCar_TXT_LastName),strDriveOtherCar_TXT_LastName,test);
					se.element().enterOrValidateText(getDriveOtherCar_TXT_NameSuffix(strDriveOtherCar_TXT_NameSuffix),strDriveOtherCar_TXT_NameSuffix,test);
					
					se.element().checkUncheckOrValidate(getDriveOtherCar_CHK_Liability(strDriveOtherCar_CHK_Liability),strDriveOtherCar_CHK_Liability,test);
				//	se.element().enterOrValidateText(getDriveOtherCar_TXT_Liability_CombinedSingleLimit(strDriveOtherCar_TXT_Liability_CombinedSingleLimit),strDriveOtherCar_TXT_Liability_CombinedSingleLimit,test);
				//	se.element().enterOrValidateText(getDriveOtherCar_TXT_Liability_Deductible(strDriveOtherCar_TXT_Liability_Deductible),strDriveOtherCar_TXT_Liability_Deductible,test);

					se.element().checkUncheckOrValidate(getDriveOtherCar_CHK_UnInsuredMotorist(strDriveOtherCar_CHK_UnInsuredMotorist),strDriveOtherCar_CHK_UnInsuredMotorist,test);
				//	se.element().enterOrValidateText(getDriveOtherCar_TXT_UnInsuredMotorist(strDriveOtherCar_TXT_UnInsuredMotorist),strDriveOtherCar_TXT_UnInsuredMotorist,test);
					
					se.element().checkUncheckOrValidate(getDriveOtherCar_CHK_UnderInsuredMotorist(strDriveOtherCar_CHK_UnderInsuredMotorist),strDriveOtherCar_CHK_UnderInsuredMotorist,test);
				//	se.element().enterOrValidateText(getDriveOtherCar_TXT_UnderInsuredMotorist(strDriveOtherCar_TXT_UnderInsuredMotorist),strDriveOtherCar_TXT_UnderInsuredMotorist,test);
					
					se.element().checkUncheckOrValidate(getDriveOtherCar_CHK_Comprehensive(strDriveOtherCar_CHK_Comprehensive),strDriveOtherCar_CHK_Comprehensive,test);
					se.element().selectPopupWithMagnifier(getDriveOtherCar_TXT_ComprehensiveDeductible(strDriveOtherCar_TXT_ComprehensiveDeductible),getDriveOtherCar_TXT_ComprehensiveDeductibleSearch(strDriveOtherCar_TXT_ComprehensiveDeductible),strDriveOtherCar_TXT_ComprehensiveDeductible,strDriveOtherCar_TXT_ComprehensiveDeductibleFilterNeeded,strDriveOtherCar_TXT_ComprehensiveDeductible, constants.NA, constants.NA,constants.NA,test);

					se.element().checkUncheckOrValidate(getDriveOtherCar_CHK_Collision(strDriveOtherCar_CHK_Collision),strDriveOtherCar_CHK_Collision,test);
					se.element().selectPopupWithMagnifier(getDriveOtherCar_TXT_CollisionDeductible(strDriveOtherCar_TXT_CollisionDeductible),getDriveOtherCar_TXT_CollisionDeductibleSearch(strDriveOtherCar_TXT_CollisionDeductible),strDriveOtherCar_TXT_CollisionDeductible,strDriveOtherCar_TXT_CollisionDeductibleFilterNeeded,strDriveOtherCar_TXT_CollisionDeductible, constants.NA, constants.NA,constants.NA,test);

					se.element().clickElement(getNext());
					se.util().sleep(2000);
					if(strDriveOtherCar_BTN_Done.equals("Yes")) {
						se.element().clickElement(getDone());
						}
				
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_DriveOtherCar ", true, false, true, test);
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
		
