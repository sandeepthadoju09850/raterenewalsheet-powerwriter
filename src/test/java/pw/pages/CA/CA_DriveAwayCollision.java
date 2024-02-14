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
import pw.OR.OR_CP;
import pw.OR.OR_GL;

public class CA_DriveAwayCollision extends OR_CA{
	
	public void DriveAwayCollision(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.CA_DriveAwayCollision)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_DriveAwayCollision, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
			String strDriveAwayCollision_BTN_Add = (String) row.get("DriveAwayCollision_BTN_Add");
			String strDriveAwayCollision_BTN_Done = (String) row.get("DriveAwayCollision_BTN_Done");
			String strDriveAwayCollision_BTN_Details = (String) row.get("DriveAwayCollision_BTN_Details");
			String strDriveAwayCollision_TXT_LocNo = (String) row.get("DriveAwayCollision_TXT_LocNo");
			String strDriveAwayCollision_TXT_Name = (String) row.get("DriveAwayCollision_TXT_Name");
			String strDriveAwayCollision_TXT_Description = (String) row.get("DriveAwayCollision_TXT_Description");
			String strDriveAwayCollision_TXT_KYTax_City = (String) row.get("DriveAwayCollision_TXT_KYTax_City");
			String strDriveAwayCollision_TXT_KYTax_CityFilterNeeded = (String) row.get("DriveAwayCollision_TXT_KYTax_CityFilterNeeded");
			String strDriveAwayCollision_TXT_KYTax_City_Code = (String) row.get("DriveAwayCollision_TXT_KYTax_City_Code");
			String strDriveAwayCollision_TXT_KYTax_County = (String) row.get("DriveAwayCollision_TXT_KYTax_County");
			String strDriveAwayCollision_TXT_KYTax_CountyFilterNeeded = (String) row.get("DriveAwayCollision_TXT_KYTax_CountyFilterNeeded");
			String strDriveAwayCollision_TXT_KYTax_County_Code = (String) row.get("DriveAwayCollision_TXT_KYTax_County_Code");
			String strDriveAwayCollision_TXT_KYTax_Tax_Code = (String) row.get("DriveAwayCollision_TXT_KYTax_Tax_Code");
			String strDriveAwayCollision_CHK_CollisionType_Individual = (String) row.get("DriveAwayCollision_CHK_CollisionType_Individual");
			String strDriveAwayCollision_CHK_CollisionType_Blanket = (String) row.get("DriveAwayCollision_CHK_CollisionType_Blanket");
			String strDriveAwayCollision_TXT_CollisionCoverage = (String) row.get("DriveAwayCollision_TXT_CollisionCoverage");
			String strDriveAwayCollision_TXT_CollisionCoverageFilterNeeded = (String) row.get("DriveAwayCollision_TXT_CollisionCoverageFilterNeeded");
			String strDriveAwayCollision_TXT_Deductible = (String) row.get("DriveAwayCollision_TXT_Deductible");
			String strDriveAwayCollision_TXT_DeductibleFilterNeeded = (String) row.get("DriveAwayCollision_TXT_DeductibleFilterNeeded");
			String strDriveAwayCollision_TXT_Mileage = (String) row.get("DriveAwayCollision_TXT_Mileage");
			String strDriveAwayCollision_TXT_MileageFilterNeeded = (String) row.get("DriveAwayCollision_TXT_MileageFilterNeeded");
			String strDriveAwayCollision_TXT_PriceNewAtFacToDealer = (String) row.get("DriveAwayCollision_TXT_PriceNewAtFacToDealer");
			String strDriveAwayCollision_TXT_NoOfCars = (String) row.get("DriveAwayCollision_TXT_NoOfCars");
			String strDriveAwayCollision_TXT_NoOfTrips = (String) row.get("DriveAwayCollision_TXT_NoOfTrips");
			String strDriveAwayCollision_CHK_Remove = (String) row.get("DriveAwayCollision_CHK_Remove");
			String strDriveAwayCollision_BTN_Remove = (String) row.get("DriveAwayCollision_BTN_Remove");
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("CA_DriveAwayCollision");
				test.log(LogStatus.INFO, "CA_DriveAwayCollision page","Transaction Step : "+strTestDescription + "<br>" +"Page : CA_DriveAwayCollision");
				se.verify().verifyEquals("CA_DriveAwayCollision Page of PowerWriter ", getCA_DriveAwayCollision_LabelName().isDisplayed(),true, true,test);
				
				if(strDriveAwayCollision_BTN_Add.equalsIgnoreCase("Yes")){
					se.element().waitForElementIsDisplayed(DriveAwayCollision_BTN_Add, 10);
					se.element().Click(getDriveAwayCollision_BTN_Add(strDriveAwayCollision_BTN_Add), test);
				}
				if(!strDriveAwayCollision_BTN_Details.equalsIgnoreCase(constants.NA)){
					se.element().Click(getDriveAwayCollision_BTN_Details(strDriveAwayCollision_BTN_Details), test);
				}
				
				if(strDriveAwayCollision_BTN_Remove.equalsIgnoreCase("Yes")){
					se.element().checkUncheckOrValidate(getDriveAwayCollision_CHK_Remove(strDriveAwayCollision_CHK_Remove),"Check",test);
					se.element().Click(getDriveAwayCollision_BTN_RemoveCov(strDriveAwayCollision_BTN_Remove), test);
				}else{
				
					se.element().enterOrValidateText(getDriveAwayCollision_TXT_LocNo(strDriveAwayCollision_TXT_LocNo),strDriveAwayCollision_TXT_LocNo,test);
					se.element().enterOrValidateText(getDriveAwayCollision_TXT_Name(strDriveAwayCollision_TXT_Name),strDriveAwayCollision_TXT_Name,test);
					se.element().enterOrValidateText(getDriveAwayCollision_TXT_Description(strDriveAwayCollision_TXT_Description),strDriveAwayCollision_TXT_Description,test);
					se.element().checkUncheckOrValidate(getDriveAwayCollision_CHK_CollisionType_Individual(strDriveAwayCollision_CHK_CollisionType_Individual),strDriveAwayCollision_CHK_CollisionType_Individual,test);
					se.element().checkUncheckOrValidate(getDriveAwayCollision_CHK_CollisionType_Blanket(strDriveAwayCollision_CHK_CollisionType_Blanket),strDriveAwayCollision_CHK_CollisionType_Blanket,test);
					se.element().selectPopupWithMagnifier(getDriveAwayCollision_TXT_CollisionCoverage(strDriveAwayCollision_TXT_CollisionCoverage),getDriveAwayCollision_TXT_CollisionCoverageSearch(strDriveAwayCollision_TXT_CollisionCoverage),strDriveAwayCollision_TXT_CollisionCoverage,strDriveAwayCollision_TXT_CollisionCoverageFilterNeeded,strDriveAwayCollision_TXT_CollisionCoverage, constants.NA, constants.NA,constants.NA,test);
					se.element().selectPopupWithMagnifier(getDriveAwayCollision_TXT_Deductible(strDriveAwayCollision_TXT_Deductible),getDriveAwayCollision_TXT_DeductibleSearch(strDriveAwayCollision_TXT_Deductible),strDriveAwayCollision_TXT_Deductible,strDriveAwayCollision_TXT_DeductibleFilterNeeded,strDriveAwayCollision_TXT_Deductible, constants.NA, constants.NA,constants.NA,test);
					se.element().selectPopupWithMagnifier(getDriveAwayCollision_TXT_Mileage(strDriveAwayCollision_TXT_Mileage),getDriveAwayCollision_TXT_MileageSearch(strDriveAwayCollision_TXT_Mileage),strDriveAwayCollision_TXT_Mileage,strDriveAwayCollision_TXT_MileageFilterNeeded,strDriveAwayCollision_TXT_Mileage, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getDriveAwayCollision_TXT_PriceNewAtFacToDealer(strDriveAwayCollision_TXT_PriceNewAtFacToDealer),strDriveAwayCollision_TXT_PriceNewAtFacToDealer,test);
					se.element().enterOrValidateText(getDriveAwayCollision_TXT_NoOfCars(strDriveAwayCollision_TXT_NoOfCars),strDriveAwayCollision_TXT_NoOfCars,test);
					se.element().enterOrValidateText(getDriveAwayCollision_TXT_NoOfTrips(strDriveAwayCollision_TXT_NoOfTrips),strDriveAwayCollision_TXT_NoOfTrips,test);
					se.element().selectPopupWithMagnifier(getDriveAwayCollision_TXT_KYTax_City(strDriveAwayCollision_TXT_KYTax_City),getDriveAwayCollision_TXT_KYTax_CitySearch(strDriveAwayCollision_TXT_KYTax_City),strDriveAwayCollision_TXT_KYTax_City,strDriveAwayCollision_TXT_KYTax_CityFilterNeeded,strDriveAwayCollision_TXT_KYTax_City, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getDriveAwayCollision_TXT_KYTax_City_Code(strDriveAwayCollision_TXT_KYTax_City_Code),strDriveAwayCollision_TXT_KYTax_City_Code,test);
					se.element().selectPopupWithMagnifier(getDriveAwayCollision_TXT_KYTax_County(strDriveAwayCollision_TXT_KYTax_County),getDriveAwayCollision_TXT_KYTax_CountySearch(strDriveAwayCollision_TXT_KYTax_County),strDriveAwayCollision_TXT_KYTax_County,strDriveAwayCollision_TXT_KYTax_CountyFilterNeeded,strDriveAwayCollision_TXT_KYTax_County, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getDriveAwayCollision_TXT_KYTax_County_Code(strDriveAwayCollision_TXT_KYTax_County_Code),strDriveAwayCollision_TXT_KYTax_County_Code,test);
					se.element().enterOrValidateText(getDriveAwayCollision_TXT_KYTax_Tax_Code(strDriveAwayCollision_TXT_KYTax_Tax_Code),strDriveAwayCollision_TXT_KYTax_Tax_Code,test);
					se.element().clickElement(getNext());
					se.util().sleep(2000);
					if(strDriveAwayCollision_BTN_Done.equals("Yes")) {
						se.element().clickElement(getDone());
						}
				
				}
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_DriveAwayCollision ", true, false, true, test);
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
		
