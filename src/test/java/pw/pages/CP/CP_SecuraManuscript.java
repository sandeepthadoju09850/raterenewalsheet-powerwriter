package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CP;

 	public class CP_SecuraManuscript extends OR_CP{
 		
 		public void SecuraManuscriptPage(String strRegressionID,String transaction, ExtentTest test) throws IOException {
 			try{
 			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
 		    if(SuspendSheet.equalsIgnoreCase("CP_SecuraManuscript")){
 		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
 		         testTearDown(se, test);
 		    }

 			List<Map<String, String>> table = ExcelOperations.getPagesData("CP_SecuraManuscript", strRegressionID, transaction);
 			int iteration = 0;
 			while (iteration < table.size()) {
 				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
 				try{
 					
 					String strCP_SecuraManuscript_BTN_Done = (String) row.get("CP_SecuraManuscript_BTN_Done");
 					CP_SecuraManuscript SecuraManuscript = TestPageFactory.initElements(se, CP_SecuraManuscript.class);
 					SecuraManuscript.SecuraManuscript(row,transaction,test);
 					SecuraManuscript.SecuraManuscriptLocation(row, transaction, test);
 					SecuraManuscript.SecuraManuscriptIllinoisFireTax(row, transaction, test);
 					SecuraManuscript.SecuraManuscriptKYTaxInfo(row, transaction, test);
 					se.element().Click(getNext(),test);
 					se.util().sleep(1000);
 					if(strCP_SecuraManuscript_BTN_Done.equalsIgnoreCase("Yes")){
 						se.element().Click(getNext(),test);
 					}
 				
 				}
 				catch(Exception e){
 					se.verify().verifyEquals("Failed to fill in details for CP_SecuraManuscript", true, false, true, test);
 					
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
 		
	public void SecuraManuscript(Map<String, String> row,String transaction, ExtentTest test) throws IOException{
		String strCP_SecuraManuscript_TXT_State = (String) row.get("CP_SecuraManuscript_TXT_State");
		String strCP_SecuraManuscript_TXT_Form = (String) row.get("CP_SecuraManuscript_TXT_Form");
		String strCP_SecuraManuscript_BTN_ADD = (String) row.get("CP_SecuraManuscript_BTN_ADD");
			String strCP_SecuraManuscript_BTN_Edit = (String) row.get("CP_SecuraManuscript_BTN_Edit");
		try
		{
		se.log().logTestStep("SecuraManuscript");
		test.log(LogStatus.INFO, "SecuraManuscript","Transaction Step : "+ transaction + "<br>" +"Page : SecuraManuscript"  + "<br>" +"Section: SecuraManuscript");
		se.util().sleep(1000);
		if(strCP_SecuraManuscript_BTN_ADD.equalsIgnoreCase(constants.Yes)) {
			se.element().Click(getAdd(),test);
		}
		if(strCP_SecuraManuscript_BTN_Edit.equalsIgnoreCase(constants.Yes)) {
			se.element().Click(getCP_SecuraManuscript_BTN_Edit(),test);
		}
		//se.element().clickElement(ClickonAddSecuraManuscript,test);
		se.verify().verifyEquals("SecuraManuscript of PowerWriter ", getCP_VerifySecuraManuscriptText().isDisplayed(),true, true,test);
		/*if(!strCP_SecuraManuscript_TXT_State.equalsIgnoreCase("N/A") && !strCP_SecuraManuscript_TXT_State.contains("validate2")) {
        	se.element().clickSearchIcon(getCP_SecuraManuscript_BTN_State_Search(), test);
        	se.element().Click(getCP_SecuraManuscript_LNK_State(strCP_SecuraManuscript_TXT_State), test);
        }else{
        	se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_State(strCP_SecuraManuscript_TXT_State),strCP_SecuraManuscript_TXT_State,test);
        }*/
		
		se.element().selectPopupWithMagnifier(getCP_SecuraManuscript_TXT_State(strCP_SecuraManuscript_TXT_State), getCP_SecuraManuscript_BTN_State_Search(strCP_SecuraManuscript_TXT_State), strCP_SecuraManuscript_TXT_State, constants.NA, strCP_SecuraManuscript_TXT_State, constants.NA, constants.NA, constants.NA, test);
		/*if(!strCP_SecuraManuscript_TXT_Form.equalsIgnoreCase("N/A") && !strCP_SecuraManuscript_TXT_Form.contains("validate2")) {
        	se.element().clickSearchIcon(getCP_SecuraManuscript_BTN_Form_Search(), test);
        	se.element().Click(getCP_SecuraManuscript_LNK_Form(strCP_SecuraManuscript_TXT_Form), test);
        }else{
        	se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_Form(strCP_SecuraManuscript_TXT_Form),strCP_SecuraManuscript_TXT_Form,test);
        }*/
		
		se.element().selectPopupWithMagnifier(getCP_SecuraManuscript_TXT_Form(strCP_SecuraManuscript_TXT_Form), getCP_SecuraManuscript_BTN_Form_Search(strCP_SecuraManuscript_TXT_Form), strCP_SecuraManuscript_TXT_Form, constants.NA, strCP_SecuraManuscript_TXT_Form, constants.NA, constants.NA, constants.NA, test);
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for SecuraManuscript", true, false, true, test);
		}
	}
	public void SecuraManuscriptLocation(Map<String, String> row,String transaction, ExtentTest test) throws IOException{
		String strCP_SecuraManuscript_TXT_LocationNo = (String) row.get("CP_SecuraManuscript_TXT_LocationNo");
		String strCP_SecuraManuscript_TXT_Name = (String) row.get("CP_SecuraManuscript_TXT_Name");
		String strCP_SecuraManuscript_TXT_Description = (String) row.get("CP_SecuraManuscript_TXT_Description");
		String strCP_SecuraManuscript_TXT_Street = (String) row.get("CP_SecuraManuscript_TXT_Street");
		String strCP_SecuraManuscript_TXT_SteUnit = (String) row.get("CP_SecuraManuscript_TXT_Ste/Unit");
		String strCP_SecuraManuscript_TXT_City = (String) row.get("CP_SecuraManuscript_TXT_City");
		String strCP_SecuraManuscript_DDN_StateCode = (String) row.get("CP_SecuraManuscript_DDN_StateCode");
		String strCP_SecuraManuscript_TXT_Zip = (String) row.get("CP_SecuraManuscript_TXT_Zip");
		String strCP_SecuraManuscript_CHK_AllLocations = (String) row.get("CP_SecuraManuscript_CHK_AllLocations");
		String strCP_SecuraManuscript_TXT_Description1 = (String) row.get("CP_SecuraManuscript_TXT_Description1");
		String strCP_SecuraManuscript_CHK_Edit = (String) row.get("CP_SecuraManuscript_CHK_Edit");
		String strCP_SecuraManuscript_TXT_CSPCode = (String) row.get("CP_SecuraManuscript_TXT_CSPCode");
		String strCP_SecuraManuscript_TXT_AnnualPremium = (String) row.get("CP_SecuraManuscript_TXT_AnnualPremium");
		String strCP_SecuraManuscript_CHK_PremiumChargeTypeProRata = (String) row.get("CP_SecuraManuscript_CHK_PremiumChargeTypeProRata");
		String strCP_SecuraManuscript_CHK_PremiumChargeTypeFlatCharge = (String) row.get("CP_SecuraManuscript_CHK_PremiumChargeTypeFlatCharge");
		String strCP_SecuraManuscript_CHK_PremiumChargeTypeFullyEarned = (String) row.get("CP_SecuraManuscript_CHK_PremiumChargeTypeFullyEarned");
		try
		{
		se.log().logTestStep("SecuraManuscriptLocation");
		test.log(LogStatus.INFO, "SecuraManuscriptLocation","Transaction Step : "+ transaction + "<br>" +"Page : SecuraManuscriptLocation"  + "<br>" +"Section: SecuraManuscriptLocation");
		se.util().sleep(1000);
		se.verify().verifyEquals("SecuraManuscriptLocation of PowerWriter ", getCP_VerifySecuraManuscriptLocationText().isDisplayed(),true, true,test);
		/*if(!strCP_SecuraManuscript_TXT_LocationNo.equalsIgnoreCase("N/A") && !strCP_SecuraManuscript_TXT_LocationNo.contains("validate2")) {
        	se.element().clickSearchIcon(getCP_SecuraManuscript_BTN_LocationNo_Search(), test);
        	se.util().sleep(2000);
        	se.element().Click(getCP_SecuraManuscript_LNK_LocationNo(strCP_SecuraManuscript_TXT_LocationNo), test);
        }else{
        	se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_LocationNo(strCP_SecuraManuscript_TXT_LocationNo),strCP_SecuraManuscript_TXT_LocationNo,test);
        }*/
		
		se.element().selectPopupWithMagnifier(getCP_SecuraManuscript_TXT_LocationNo(strCP_SecuraManuscript_TXT_LocationNo), getCP_SecuraManuscript_BTN_LocationNo_Search(strCP_SecuraManuscript_TXT_LocationNo), strCP_SecuraManuscript_TXT_LocationNo, constants.NA, strCP_SecuraManuscript_TXT_LocationNo, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_Name(strCP_SecuraManuscript_TXT_Name),strCP_SecuraManuscript_TXT_Name,test);
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_Description(strCP_SecuraManuscript_TXT_Description),strCP_SecuraManuscript_TXT_Description,test);
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_Street(strCP_SecuraManuscript_TXT_Street),strCP_SecuraManuscript_TXT_Street,test);
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_SteUnit(strCP_SecuraManuscript_TXT_SteUnit),strCP_SecuraManuscript_TXT_SteUnit,test);
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_City(strCP_SecuraManuscript_TXT_City),strCP_SecuraManuscript_TXT_City,test);
		se.element().selectElementDDrOrValidateText(getCP_SecuraManuscript_DDN_StateCode(strCP_SecuraManuscript_DDN_StateCode),strCP_SecuraManuscript_DDN_StateCode,test);
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_Zip(strCP_SecuraManuscript_TXT_Zip),strCP_SecuraManuscript_TXT_Zip,test);
		se.element().checkUncheckOrValidate(getCP_SecuraManuscript_CHK_AllLocations(strCP_SecuraManuscript_CHK_AllLocations),strCP_SecuraManuscript_CHK_AllLocations,test);
		se.element().enter_textRich(getCP_SecuraManuscript_TXT_Description1(strCP_SecuraManuscript_TXT_Description1),strCP_SecuraManuscript_TXT_Description1,test);
		se.element().checkUncheckOrValidate(getCP_SecuraManuscript_CHK_Edit(strCP_SecuraManuscript_CHK_Edit),strCP_SecuraManuscript_CHK_Edit,test);
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_CSPCode(strCP_SecuraManuscript_TXT_CSPCode),strCP_SecuraManuscript_TXT_CSPCode,test);
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_AnnualPremium(strCP_SecuraManuscript_TXT_AnnualPremium),strCP_SecuraManuscript_TXT_AnnualPremium,test);
		se.element().checkUncheckOrValidate(getCP_SecuraManuscript_CHK_PremiumChargeTypeProRata(strCP_SecuraManuscript_CHK_PremiumChargeTypeProRata),strCP_SecuraManuscript_CHK_PremiumChargeTypeProRata,test);
		se.element().checkUncheckOrValidate(getCP_SecuraManuscript_CHK_PremiumChargeTypeFlatCharge(strCP_SecuraManuscript_CHK_PremiumChargeTypeFlatCharge),strCP_SecuraManuscript_CHK_PremiumChargeTypeFlatCharge,test);
		se.element().checkUncheckOrValidate(getCP_SecuraManuscript_CHK_PremiumChargeTypeFullyEarned(strCP_SecuraManuscript_CHK_PremiumChargeTypeFullyEarned),strCP_SecuraManuscript_CHK_PremiumChargeTypeFullyEarned,test);
		}
		
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for SecuraManuscriptLocation", true, false, true, test);
		}
	}
	public void SecuraManuscriptIllinoisFireTax(Map<String, String> row,String transaction, ExtentTest test) throws IOException{
		String strCP_SecuraManuscript_TXT_JurisdictionDescription = (String) row.get("CP_SecuraManuscript_TXT_JurisdictionDescription");
		String strCP_SecuraManuscript_TXT_FPDCode = (String) row.get("CP_SecuraManuscript_TXT_FPDCode");
		String strCP_SecuraManuscript_TXT_FireProtectionDistrict = (String) row.get("CP_SecuraManuscript_TXT_FireProtectionDistrict");
		String strCP_SecuraManuscript_TXT_JurisdictionDescription_FilterNeeded = (String) row.get("CP_SecuraManuscript_TXT_JurisdictionDescription_FilterNeeded");
		try
		{
		se.log().logTestStep("SecuraManuscriptIllinoisFireTax");
		test.log(LogStatus.INFO, "SecuraManuscriptIllinoisFireTax","Transaction Step : "+ transaction + "<br>" +"Page : SecuraManuscriptIllinoisFireTax"  + "<br>" +"Section: SecuraManuscriptIllinoisFireTax");
		se.util().sleep(1000);
		//se.verify().verifyEquals("SecuraManuscriptIllinoisFireTax of PowerWriter ", getCP_VerifySecuraManuscriptIllinoisFireTaxText().isDisplayed(),true, true,test);
		/*if(!strCP_SecuraManuscript_TXT_JurisdictionDescription.equalsIgnoreCase("N/A") && !strCP_SecuraManuscript_TXT_JurisdictionDescription.contains("validate2")) {
        	se.element().clickSearchIcon(getCP_SecuraManuscript_BTN_JurisdictionDescription_Search(), test);
        	se.element().Click(getCP_SecuraManuscript_LNK_JurisdictionDescription(strCP_SecuraManuscript_TXT_JurisdictionDescription), test);
        }
		else{
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_JurisdictionDescription(strCP_SecuraManuscript_TXT_JurisdictionDescription),strCP_SecuraManuscript_TXT_JurisdictionDescription,test);
        }*/
		se.element().selectPopupWithMagnifier(getCP_SecuraManuscript_TXT_JurisdictionDescription(strCP_SecuraManuscript_TXT_JurisdictionDescription), getCP_SecuraManuscript_BTN_JurisdictionDescription_Search(strCP_SecuraManuscript_TXT_JurisdictionDescription), strCP_SecuraManuscript_TXT_JurisdictionDescription, strCP_SecuraManuscript_TXT_JurisdictionDescription_FilterNeeded, strCP_SecuraManuscript_TXT_JurisdictionDescription, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_FPDCode(strCP_SecuraManuscript_TXT_FPDCode),strCP_SecuraManuscript_TXT_FPDCode,test);
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_FireProtectionDistrict(strCP_SecuraManuscript_TXT_FireProtectionDistrict),strCP_SecuraManuscript_TXT_FireProtectionDistrict,test);
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for SecuraManuscriptIllinoisFireTax", true, false, true, test);
		}
	}
	public void SecuraManuscriptKYTaxInfo(Map<String, String> row,String transaction, ExtentTest test) throws IOException{
		String strCP_SecuraManuscript_CHK_DoNotApplyCityorCountyTaxes = (String) row.get("CP_SecuraManuscript_CHK_DoNotApplyCityorCountyTaxes");
		String strCP_SecuraManuscript_CHK_AllCityName = (String) row.get("CP_SecuraManuscript_CHK_AllCityName");
		String strCP_SecuraManuscript_TXT_City1 = (String) row.get("CP_SecuraManuscript_TXT_City1");
		String strCP_SecuraManuscript_TXT_CityCode = (String) row.get("CP_SecuraManuscript_TXT_CityCode");
		String strCP_SecuraManuscript_TXT_County = (String) row.get("CP_SecuraManuscript_TXT_County");
		String strCP_SecuraManuscript_TXT_CountyCode = (String) row.get("CP_SecuraManuscript_TXT_CountyCode");
		String strCP_SecuraManuscript_TXT_TaxCode = (String) row.get("CP_SecuraManuscript_TXT_TaxCode");
		String strCP_SecuraManuscript_TXT_City_FilterNeeded = (String) row.get("CP_SecuraManuscript_TXT_City_FilterNeeded");
		String strCP_SecuraManuscript_TXT_County_FilterNeeded = (String) row.get("CP_SecuraManuscript_TXT_County_FilterNeeded");
		try
		{
		se.log().logTestStep("SecuraManuscriptKYTaxInfo");
		test.log(LogStatus.INFO, "SecuraManuscriptKYTaxInfo","Transaction Step : "+ transaction + "<br>" +"Page : SecuraManuscriptKYTaxInfo"  + "<br>" +"Section: SecuraManuscriptKYTaxInfo");
		se.util().sleep(1000);
		//se.verify().verifyEquals("SecuraManuscriptKYTaxInfo of PowerWriter ", getCP_VerifySecuraManuscriptKYTaxInfoText().isDisplayed(),true, true,test);
		se.element().checkUncheckOrValidate(getCP_SecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(strCP_SecuraManuscript_CHK_DoNotApplyCityorCountyTaxes),strCP_SecuraManuscript_CHK_DoNotApplyCityorCountyTaxes,test);
		se.element().checkUncheckOrValidate(getCP_SecuraManuscript_CHK_AllCityName(strCP_SecuraManuscript_CHK_AllCityName),strCP_SecuraManuscript_CHK_AllCityName,test);
		/*if(!strCP_SecuraManuscript_TXT_City1.equalsIgnoreCase("N/A") && !strCP_SecuraManuscript_TXT_City1.contains("validate2")) {
        	se.element().clickSearchIcon(getCP_SecuraManuscript_BTN_City1_Search(), test);
        	se.element().Click(getCP_SecuraManuscript_LNK_City1(strCP_SecuraManuscript_TXT_City1), test);
        }
		else{
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_City1(strCP_SecuraManuscript_TXT_City1),strCP_SecuraManuscript_TXT_City1,test);
		}*/
		
		se.element().selectPopupWithMagnifier(getCP_SecuraManuscript_TXT_City1(strCP_SecuraManuscript_TXT_City1), getCP_SecuraManuscript_BTN_City1_Search(strCP_SecuraManuscript_TXT_City1), strCP_SecuraManuscript_TXT_City1, strCP_SecuraManuscript_TXT_City_FilterNeeded, strCP_SecuraManuscript_TXT_City1, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_CityCode(strCP_SecuraManuscript_TXT_CityCode),strCP_SecuraManuscript_TXT_CityCode,test);
		/*if(!strCP_SecuraManuscript_TXT_County.equalsIgnoreCase("N/A") && !strCP_SecuraManuscript_TXT_County.contains("validate2")) {
        	se.element().clickSearchIcon(getCP_SecuraManuscript_BTN_CountyCode_Search(), test);
        	se.element().Click(getCP_SecuraManuscript_LNK_CountyCode(strCP_SecuraManuscript_TXT_County), test);
        }
		else{
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_County(strCP_SecuraManuscript_TXT_County),strCP_SecuraManuscript_TXT_County,test);
		}*/
		
		se.element().selectPopupWithMagnifier(getCP_SecuraManuscript_TXT_County(strCP_SecuraManuscript_TXT_County), getCP_SecuraManuscript_BTN_CountyCode_Search(strCP_SecuraManuscript_TXT_County), strCP_SecuraManuscript_TXT_County, strCP_SecuraManuscript_TXT_County_FilterNeeded, strCP_SecuraManuscript_TXT_County, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_CountyCode(strCP_SecuraManuscript_TXT_CountyCode),strCP_SecuraManuscript_TXT_CountyCode,test);
		se.element().enterOrValidateText(getCP_SecuraManuscript_TXT_TaxCode(strCP_SecuraManuscript_TXT_TaxCode),strCP_SecuraManuscript_TXT_TaxCode,test);
		
		{
			
		}
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for SecuraManuscriptKYTaxInfo", true, false, true, test);
		}
	   }
 	
 	  }

	

