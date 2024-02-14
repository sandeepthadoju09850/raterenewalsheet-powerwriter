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
import pw.OR.OR_CP;
import pw.OR.OR_GL;

/**
* @author ${ro09528}
*/
public class CA_RegistrationPlates extends OR_CA{
	
	public void RegistrationPlates(String strRegressionID, String transaction,String suspenSheet, ExtentTest test) throws IOException {
		try{
		//String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(suspenSheet.equalsIgnoreCase(constants.CA_RegistrationPlates)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspenSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_RegistrationPlates, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strRegistrationPlates_BTN_Add = (String) row.get("RegistrationPlates_BTN_Add");
			String strRegistrationPlates_BTN_RemoveCov = (String) row.get("RegistrationPlates_BTN_RemoveCov");
			String strRegistrationPlates_BTN_Done = (String) row.get("RegistrationPlates_BTN_Done");
			String strRegistrationPlates_BTN_Details = (String) row.get("RegistrationPlates_BTN_Details");
			String strRegistrationPlates_TXT_State = (String) row.get("RegistrationPlates_TXT_State");
			String strRegistrationPlates_TXT_StateFilterNeeded = (String) row.get("RegistrationPlates_TXT_StateFilterNeeded");
			String strRegistrationPlates_TXT_ZipCode = (String) row.get("RegistrationPlates_TXT_ZipCode");
			String strRegistrationPlates_TXT_ZipCodeFilterNeeded = (String) row.get("RegistrationPlates_TXT_ZipCodeFilterNeeded");
			String strRegistrationPlates_TXT_NoOfPlates = (String) row.get("RegistrationPlates_TXT_NoOfPlates");
			String strRegistrationPlates_TXT_DescriptionOfPlates = (String) row.get("RegistrationPlates_TXT_DescriptionOfPlates");
			String strRegistrationPlates_TXT_Territory = (String) row.get("RegistrationPlates_TXT_Territory");
			String strRegistrationPlates_TXT_TerritoryFilterNeeded = (String) row.get("RegistrationPlates_TXT_TerritoryFilterNeeded");
			String strRegistrationPlates_TXT_TerritoryDescription = (String) row.get("RegistrationPlates_TXT_TerritoryDescription");
			String strRegistrationPlates_CHK_Liability = (String) row.get("RegistrationPlates_CHK_Liability");
			String strRegistrationPlates_TXT_LiabCSL = (String) row.get("RegistrationPlates_TXT_LiabCSL");
			String strRegistrationPlates_TXT_LiabDed = (String) row.get("RegistrationPlates_TXT_LiabDed");
			String strRegistrationPlates_CHK_LiabDedType_CSL = (String) row.get("RegistrationPlates_CHK_LiabDedType_CSL");
			String strRegistrationPlates_CHK_LiabDedType_PropDamPerAccDed = (String) row.get("RegistrationPlates_CHK_LiabDedType_PropDamPerAccDed");
			String strRegistrationPlates_CHK_MedicalPayments = (String) row.get("RegistrationPlates_CHK_MedicalPayments");
			String strRegistrationPlates_TXT_LimitEachPerson = (String) row.get("RegistrationPlates_TXT_LimitEachPerson");
			String strRegistrationPlates_TXT_UnInsuredMotoristCSL = (String) row.get("RegistrationPlates_TXT_UnInsuredMotoristCSL");
			String strRegistrationPlates_CHK_UnInsuredMotorist = (String) row.get("RegistrationPlates_CHK_UnInsuredMotorist");
			String strRegistrationPlates_CHK_UnderInsuredMotorist = (String) row.get("RegistrationPlates_CHK_UnderInsuredMotorist");
			String strRegistrationPlates_TXT_UnderInsuredMotoristCSL = (String) row.get("RegistrationPlates_TXT_UnderInsuredMotoristCSL");

					try{
						se.log().logTestStep("CA_RegistrationPlates");
						test.log(LogStatus.INFO, "CA_RegistrationPlates page","Transaction Step : "+transaction + "<br>" +"Page : CA_RegistrationPlates");
						se.verify().verifyEquals("CA_RegistrationPlates Page of PowerWriter ", getRegistrationPlates().isDisplayed(),true, true,test);
						if(!strRegistrationPlates_BTN_Add.equals(constants.NA)){
							se.element().Click(getRegistrationPlates_BTN_Add(strRegistrationPlates_BTN_Add),strRegistrationPlates_BTN_Add,test);
						}
						
						if(!strRegistrationPlates_BTN_Details.equals(constants.NA)){
							se.element().Click(getRegistrationPlates_BTN_Details(strRegistrationPlates_BTN_Details),strRegistrationPlates_BTN_Details,test);
						}

						 if(!strRegistrationPlates_BTN_RemoveCov.equals(constants.NA)){
								se.element().Click(getRegistrationPlates_BTN_RemoveCov(strRegistrationPlates_BTN_RemoveCov),strRegistrationPlates_BTN_RemoveCov,test);
							}
								
						
						se.element().selectPopupWithMagnifier(getRegistrationPlates_TXT_State(strRegistrationPlates_TXT_State),getRegistrationPlates_TXT_StateSearch(strRegistrationPlates_TXT_State),strRegistrationPlates_TXT_State,strRegistrationPlates_TXT_StateFilterNeeded,strRegistrationPlates_TXT_State, constants.NA, constants.NA,constants.NA,test);
						//se.element().selectPopupWithMagnifier(getRegistrationPlates_TXT_ZipCode(strRegistrationPlates_TXT_ZipCode),getRegistrationPlates_TXT_ZipCodeSearch(strRegistrationPlates_TXT_ZipCode),strRegistrationPlates_TXT_ZipCode,strRegistrationPlates_TXT_ZipCodeFilterNeeded,strRegistrationPlates_TXT_ZipCode, constants.NA, constants.NA,constants.NA,test);
						se.element().enterOrValidateText(getRegistrationPlates_TXT_ZipCode(strRegistrationPlates_TXT_ZipCode),strRegistrationPlates_TXT_ZipCode,test);
						se.element().enterOrValidateText(getRegistrationPlates_TXT_NoOfPlates(strRegistrationPlates_TXT_NoOfPlates),strRegistrationPlates_TXT_NoOfPlates,test);
						se.element().enterOrValidateText(getRegistrationPlates_TXT_DescriptionOfPlates(strRegistrationPlates_TXT_DescriptionOfPlates),strRegistrationPlates_TXT_DescriptionOfPlates,test);
						se.element().selectPopupWithMagnifier(getRegistrationPlates_TXT_Territory(strRegistrationPlates_TXT_Territory),getRegistrationPlates_TXT_TerritorySearch(strRegistrationPlates_TXT_Territory),strRegistrationPlates_TXT_Territory,strRegistrationPlates_TXT_TerritoryFilterNeeded,strRegistrationPlates_TXT_Territory, constants.NA, constants.NA,constants.NA,test);
						se.element().enterOrValidateText(getRegistrationPlates_TXT_TerritoryDescription(strRegistrationPlates_TXT_TerritoryDescription),strRegistrationPlates_TXT_TerritoryDescription,test);
						se.element().checkUncheckOrValidate(getRegistrationPlates_CHK_Liability(strRegistrationPlates_CHK_Liability),strRegistrationPlates_CHK_Liability,test);
						se.element().enterOrValidateText(getRegistrationPlates_TXT_LiabCSL(strRegistrationPlates_TXT_LiabCSL),strRegistrationPlates_TXT_LiabCSL,test);
						se.element().enterOrValidateText(getRegistrationPlates_TXT_LiabDed(strRegistrationPlates_TXT_LiabDed),strRegistrationPlates_TXT_LiabDed,test);
						se.element().checkUncheckOrValidate(getRegistrationPlates_CHK_LiabDedType_CSL(strRegistrationPlates_CHK_LiabDedType_CSL),strRegistrationPlates_CHK_LiabDedType_CSL,test);
						se.element().checkUncheckOrValidate(getRegistrationPlates_CHK_LiabDedType_PropDamPerAccDed(strRegistrationPlates_CHK_LiabDedType_PropDamPerAccDed),strRegistrationPlates_CHK_LiabDedType_PropDamPerAccDed,test);
						se.element().checkUncheckOrValidate(getRegistrationPlates_CHK_MedicalPayments(strRegistrationPlates_CHK_MedicalPayments),strRegistrationPlates_CHK_MedicalPayments,test);
						se.element().enterOrValidateText(getRegistrationPlates_TXT_LimitEachPerson(strRegistrationPlates_TXT_LimitEachPerson),strRegistrationPlates_TXT_LimitEachPerson,test);
						se.element().checkUncheckOrValidate(getRegistrationPlates_CHK_UnInsuredMotorist(strRegistrationPlates_CHK_UnInsuredMotorist),strRegistrationPlates_CHK_UnInsuredMotorist,test);
						se.element().checkUncheckOrValidate(getRegistrationPlates_TXT_UnInsuredMotoristCSL(strRegistrationPlates_TXT_UnInsuredMotoristCSL),strRegistrationPlates_TXT_UnInsuredMotoristCSL,test);
						se.element().checkUncheckOrValidate(getRegistrationPlates_CHK_UnderInsuredMotorist(strRegistrationPlates_CHK_UnderInsuredMotorist),strRegistrationPlates_CHK_UnderInsuredMotorist,test);
						se.element().enterOrValidateText(getRegistrationPlates_TXT_UnderInsuredMotoristCSL(strRegistrationPlates_TXT_UnderInsuredMotoristCSL),strRegistrationPlates_TXT_UnderInsuredMotoristCSL,test);
						
						se.element().clickElement(getNext());
						
						 if(strRegistrationPlates_BTN_Done.equalsIgnoreCase("Yes")){
								se.element().Click(getDone(),test);
							}
			
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_RegistrationPlates ", true, false, true, test);			
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