package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class CP_CondoUnitCoverage extends OR_CP{

public void CondoUnitCoverage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
	try{
	
	List<Map<String, String>> table = ExcelOperations.getPagesData("CP_CondoUnitCoverage", strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

	String strCP_CondoUnitCov_BTN_ADD = (String) row.get("CP_CondoUnitCov_BTN_ADD");
	String strCP_CondoUnitCov_BTN_Details = (String) row.get("CP_CondoUnitCov_BTN_Details");
	String strCP_CondoUnitCov_BTN_Done = (String) row.get("CP_CondoUnitCov_BTN_Done");
	String strCP_CondoUnitCov_TXT_UnitNumber = (String) row.get("CP_CondoUnitCov_TXT_UnitNumber");
	String strCP_CondoUnitCov_TXT_ClassCode = (String) row.get("CP_CondoUnitCov_TXT_ClassCode");
	String strCP_CondoUnitCov_TXT_ClassDescription = (String) row.get("CP_CondoUnitCov_TXT_ClassDescription");
	String strCP_CondoUnitCov_TXT_PolicyType = (String) row.get("CP_CondoUnitCov_TXT_PolicyType");
	String strCP_CondoUnitCov_CHK_MiscRealProperty = (String) row.get("CP_CondoUnitCov_CHK_MiscRealProperty");
	String strCP_CondoUnitCov_TXT_PropertyDesc1 = (String) row.get("CP_CondoUnitCov_TXT_PropertyDesc1");
	String strCP_CondoUnitCov_TXT_AmountOfInsurance1 = (String) row.get("CP_CondoUnitCov_TXT_AmountOfInsurance1");
	String strCP_CondoUnitCov_CHK_LossAssessment = (String) row.get("CP_CondoUnitCov_CHK_LossAssessment");
	String strCP_CondoUnitCov_TXT_Cause_of_loss = (String) row.get("CP_CondoUnitCov_TXT_Cause_of_loss");
	String strCP_CondoUnitCov_TXT_PropertyDesc2 = (String) row.get("CP_CondoUnitCov_TXT_PropertyDesc2");
	String strCP_CondoUnitCov_TXT_AmountOfInsurance2 = (String) row.get("CP_CondoUnitCov_TXT_AmountOfInsurance2");
	String strCP_CondoUnitCov_TXT_Deductible2 = (String) row.get("CP_CondoUnitCov_TXT_Deductible2");
	String strCP_CondoUnitCov_TXT_Peril = (String) row.get("CP_CondoUnitCov_TXT_Peril");
	String strCP_CondoUnitCov_TXT_MiscellaneousRealPropertyLossCost = (String) row.get("CP_CondoUnitCov_TXT_MiscellaneousRealPropertyLossCost");
	String strCP_CondoUnitCov_TXT_LossCostMultiplier = (String) row.get("CP_CondoUnitCov_TXT_LossCostMultiplier");
	String strCP_CondoUnitCov_TXT_PackageModifierFactor = (String) row.get("CP_CondoUnitCov_TXT_PackageModifierFactor");
	String strCP_CondoUnitCov_TXT_FinalRate = (String) row.get("CP_CondoUnitCov_TXT_FinalRate");
	String strCP_CondoUnitCov_TXT_TransactionPremium = (String) row.get("CP_CondoUnitCov_TXT_TransactionPremium");
	String strCP_CondoUnitCov_BTN_DoneWithBuildings    = (String) row.get("CP_CondoUnitCov_BTN_DoneWithBuildings");
	String strCP_CondoUnitCov_TXT_AmountOfInsurance2_FilterNeeded    = (String) row.get("CP_CondoUnitCov_TXT_AmountOfInsurance2_FilterNeeded");
	
	try{
			se.log().logTestStep("CondoUnitCoverage");
			test.log(LogStatus.INFO, "CondoUnitCoverage page","Transaction Step : "+transaction + "<br>" +"Page : CP_CondoUnitCoverage");
			se.verify().verifyEquals("CondoUnitCoverage Page of PowerWriter ", getCP_CondoUnitCov_TXT_VerifyCondoUnitText().isDisplayed(),true, true,test);
	
			if((strCP_CondoUnitCov_BTN_ADD.equalsIgnoreCase("Yes"))){
				se.element().Click(getCP_CondoUnitCov_BTN_ADD(strCP_CondoUnitCov_BTN_ADD),test);
				}
				if((strCP_CondoUnitCov_BTN_Details.equalsIgnoreCase("Yes"))){
				se.element().tryClick(getCP_CondoUnitCov_BTN_Details(strCP_CondoUnitCov_BTN_Details),test);
				}
				
			se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_UnitNumber(strCP_CondoUnitCov_TXT_UnitNumber),strCP_CondoUnitCov_TXT_UnitNumber,test);
			se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_ClassCode(strCP_CondoUnitCov_TXT_ClassCode),strCP_CondoUnitCov_TXT_ClassCode,test);
			se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_ClassDescription(strCP_CondoUnitCov_TXT_ClassDescription),strCP_CondoUnitCov_TXT_ClassDescription,test);
			se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_PolicyType(strCP_CondoUnitCov_TXT_PolicyType),strCP_CondoUnitCov_TXT_PolicyType,test);
			se.element().checkUncheckOrValidate(getCP_CondoUnitCov_CHK_MiscRealProperty(strCP_CondoUnitCov_CHK_MiscRealProperty),strCP_CondoUnitCov_CHK_MiscRealProperty,test);
			se.element().checkUncheckOrValidate(getCP_CondoUnitCov_CHK_LossAssessment(strCP_CondoUnitCov_CHK_LossAssessment),strCP_CondoUnitCov_CHK_LossAssessment,test);
			// Implementing below code(condition for KS CP) as part for workaround for defect DF-6994
			/*if(strRegressionID.equalsIgnoreCase("CP_6")){
				se.element().Click(getNext(),test);
				if(se.element().isElementPresent(Wariningyesbutton)){
					se.element().waitForElement(Wariningyesbutton);
					se.element().Click(getWariningyesbutton(), test);
					
				} 
			}*/
			// Implementing above code(condition for KS CP) as part for workaround for defect DF-6994
			se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_PropertyDesc1(strCP_CondoUnitCov_TXT_PropertyDesc1),strCP_CondoUnitCov_TXT_PropertyDesc1,test);
			se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_AmountOfInsurance1(strCP_CondoUnitCov_TXT_AmountOfInsurance1),strCP_CondoUnitCov_TXT_AmountOfInsurance1,test);
			
			//se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_Cause_of_loss(strCP_CondoUnitCov_TXT_Cause_of_loss),strCP_CondoUnitCov_TXT_Cause_of_loss,test);
			se.element().selectPopupWithMagnifier(getCP_CondoUnitCov_TXT_Cause_of_loss(strCP_CondoUnitCov_TXT_Cause_of_loss), getCP_CondoUnitCov_TXT_Cause_of_lossSearch(strCP_CondoUnitCov_TXT_Cause_of_loss), strCP_CondoUnitCov_TXT_Cause_of_loss, constants.NA, strCP_CondoUnitCov_TXT_Cause_of_loss, constants.NA, constants.NA, constants.NA, test);
			
			se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_PropertyDesc2(strCP_CondoUnitCov_TXT_PropertyDesc2),strCP_CondoUnitCov_TXT_PropertyDesc2,test);
			se.element().clearTheField(getCP_CondoUnitCov_TXT_AmountOfInsurance2(strCP_CondoUnitCov_TXT_AmountOfInsurance2));
			se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_AmountOfInsurance2(strCP_CondoUnitCov_TXT_AmountOfInsurance2),strCP_CondoUnitCov_TXT_AmountOfInsurance2,test);
			//se.element().selectPopupWithMagnifier(getCP_CondoUnitCov_TXT_AmountOfInsurance2(strCP_CondoUnitCov_TXT_AmountOfInsurance2), getCP_CondoUnitCov_TXT_AmountOfInsurance2Search(strCP_CondoUnitCov_TXT_AmountOfInsurance2), strCP_CondoUnitCov_TXT_AmountOfInsurance2, strCP_CondoUnitCov_TXT_AmountOfInsurance2_FilterNeeded, strCP_CondoUnitCov_TXT_AmountOfInsurance2, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_Deductible2(strCP_CondoUnitCov_TXT_Deductible2),strCP_CondoUnitCov_TXT_Deductible2,test);
			se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_Peril(strCP_CondoUnitCov_TXT_Peril),strCP_CondoUnitCov_TXT_Peril,test);
			se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_MiscellaneousRealPropertyLossCost(strCP_CondoUnitCov_TXT_MiscellaneousRealPropertyLossCost),strCP_CondoUnitCov_TXT_MiscellaneousRealPropertyLossCost,test);
			se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_LossCostMultiplier(strCP_CondoUnitCov_TXT_LossCostMultiplier),strCP_CondoUnitCov_TXT_LossCostMultiplier,test);
			se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_PackageModifierFactor(strCP_CondoUnitCov_TXT_PackageModifierFactor),strCP_CondoUnitCov_TXT_PackageModifierFactor,test);
			se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_FinalRate(strCP_CondoUnitCov_TXT_FinalRate),strCP_CondoUnitCov_TXT_FinalRate,test);
			se.element().enterOrValidateText(getCP_CondoUnitCov_TXT_TransactionPremium(strCP_CondoUnitCov_TXT_TransactionPremium),strCP_CondoUnitCov_TXT_TransactionPremium,test);

			se.element().Click(getNext(),test);
			
				if((strCP_CondoUnitCov_BTN_Done.equalsIgnoreCase("Yes"))){
				
				se.element().Click(getDone(),test);
			}
			if(strCP_CondoUnitCov_BTN_DoneWithBuildings.equalsIgnoreCase("Yes")){
				se.element().Click(getDone(),test); 
				}
	
		}catch(Exception e){
			
			se.verify().verifyEquals("Failed to fill in details for CP_CondoUnitCoverage", true, false, true, test);
			
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

