package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;

public class CP_CrimeCoverageSelection extends OR_CP{
	public void CP_CrimeCoverageSelection_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Crime_Coverage_Selection)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Crime_Coverage_Selection, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strCrimeCoverageSelection_TXTV_BasisOfCoverage = (String) row.get("CrimeCoverageSelection_TXTV_BasisOfCoverage");
			String strCrimeCoverageSelection_TXT_NoOfRatableEmployees = (String) row.get("CrimeCoverageSelection_TXT_NoOfRatableEmployees");
			String strCrimeCoverageSelection_CHK_EmployeeTheft = (String) row.get("CrimeCoverageSelection_CHK_EmployeeTheft");
			String strCrimeCoverageSelection_DD_EmployeeTheftLimit = (String) row.get("CrimeCoverageSelection_DD_EmployeeTheftLimit");
			String strCrimeCoverageSelection_TXTV_EmployeeTheftDeductible = (String) row.get("CrimeCoverageSelection_TXTV_EmployeeTheftDeductible");
			String strCrimeCoverageSelection_CHK_ERISAProtection = (String) row.get("CrimeCoverageSelection_CHK_ERISAProtection");
			String strCrimeCoverageSelection_TXT_ERISAPlanName = (String) row.get("CrimeCoverageSelection_TXT_ERISAPlanName");
			String strCrimeCoverageSelection_CHK_TheftOfMoneyandSecurities = (String) row.get("CrimeCoverageSelection_CHK_TheftOfMoneyandSecurities");
			String strCrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimit = (String) row.get("CrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimit");
			String strCrimeCoverageSelection_CHK_OutsideThePremises = (String) row.get("CrimeCoverageSelection_CHK_OutsideThePremises");
			String strCrimeCoverageSelection_DD_OutsideThePremisesLimit = (String) row.get("CrimeCoverageSelection_DD_OutsideThePremisesLimit");
			String strCrimeCoverageSelection_TXTV_OutsideThePremisesDeductible = (String) row.get("CrimeCoverageSelection_TXTV_OutsideThePremisesDeductible");
			String strCrimeCoverageSelection_CHK_ComputerFraud = (String) row.get("CrimeCoverageSelection_CHK_ComputerFraud");
			String strCrimeCoverageSelection_DD_ComputerFraudLimit = (String) row.get("CrimeCoverageSelection_DD_ComputerFraudLimit");
			String strCrimeCoverageSelection_TXTV_ComputerFraudDeductible = (String) row.get("CrimeCoverageSelection_TXTV_ComputerFraudDeductible");
			String strCrimeCoverageSelection_CHK_ForgeryorAlteration = (String) row.get("CrimeCoverageSelection_CHK_ForgeryorAlteration");
			String strCrimeCoverageSelection_DD_ForgeorAlterLimit = (String) row.get("CrimeCoverageSelection_DD_ForgeorAlterLimit");
			String strCrimeCoverageSelection_TXTV_ForgeorAlterDeductible = (String) row.get("CrimeCoverageSelection_TXTV_ForgeorAlterDeductible");
			String strCrimeCoverageSelection_CHK_FundTransfer = (String) row.get("CrimeCoverageSelection_CHK_FundTransfer");
			String strCrimeCoverageSelection_DD_FundTransferLimit = (String) row.get("CrimeCoverageSelection_DD_FundTransferLimit");
			String strCrimeCoverageSelection_TXTV_FundTransferDeductible = (String) row.get("CrimeCoverageSelection_TXTV_FundTransferDeductible");
			String strCrimeCoverageSelection_CHK_MoneyOrdersandCounterfietMoney = (String) row.get("CrimeCoverageSelection_CHK_MoneyOrdersandCounterfietMoney");
			String strCrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyLimit = (String) row.get("CrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyLimit");
			String strCrimeCoverageSelection_TXTV_MoneyOrdersandCounterfietMoneyDeduc = (String) row.get("CrimeCoverageSelection_TXTV_MoneyOrdersandCounterfietMoneyDeduc");
			String strCrimeCoverageSelection_CHK_ClientsProperty = (String) row.get("CrimeCoverageSelection_CHK_ClientsProperty");
			String strCrimeCoverageSelection_DD_ClientsPropertyLimit = (String) row.get("CrimeCoverageSelection_DD_ClientsPropertyLimit");
			String strCrimeCoverageSelection_TXTV_ClientsPropertyDeduc = (String) row.get("CrimeCoverageSelection_TXTV_ClientsPropertyDeduc");
			String strCrimeCoverageSelection_TXTV_TheftOfMoneyandSecuritiesLimitDeduc = (String) row.get("CrimeCoverageSelection_TXTV_TheftOfMoneyandSecuritiesLimitDeduc");
			String strCrimeCoverageSelection_CHK_RobberyOrSafeBurglary = (String) row.get("CrimeCoverageSelection_CHK_RobberyOrSafeBurglary");
			String strCrimeCoverageSelection_DD_RobberyOrSafeBurglaryLimit = (String) row.get("CrimeCoverageSelection_DD_RobberyOrSafeBurglaryLimit");
			String strCrimeCoverageSelection_DD_RobberyOrSafeBurglaryDed = (String) row.get("CrimeCoverageSelection_DD_RobberyOrSafeBurglaryDed");
			String strCrimeCoverageSelection_DD_EmployeeTheftDeductible = (String) row.get("CrimeCoverageSelection_DD_EmployeeTheftDeductible");
			String strCrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimitDeduc = (String) row.get("CrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimitDeduc");
			String strCrimeCoverageSelection_DD_OutsideThePremisesDeductible = (String) row.get("CrimeCoverageSelection_DD_OutsideThePremisesDeductible");
			String strCrimeCoverageSelection_DD_ComputerFraudDeductible = (String) row.get("CrimeCoverageSelection_DD_ComputerFraudDeductible");
			String strCrimeCoverageSelection_DD_ForgeorAlterDeductible = (String) row.get("CrimeCoverageSelection_DD_ForgeorAlterDeductible");
			String strCrimeCoverageSelection_DD_FundTransferDeductible = (String) row.get("CrimeCoverageSelection_DD_FundTransferDeductible");
			String strCrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyDeduc = (String) row.get("CrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyDeduc");
			String strCrimeCoverageSelection_TXT_Validation = (String) row.get("CrimeCoverageSelection_TXT_Validation");
			String strCrimeCoverageSelection_TXTV_RobberyOrSafeBurglaryDed = (String) row.get("CrimeCoverageSelection_TXTV_RobberyOrSafeBurglaryDed");
			try {
				se.log().logTestStep("CP_CrimeCoverageSelection_Details");
				test.log(LogStatus.INFO, "CP_CrimeCoverageSelection_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_CrimeCoverageSelection_Details");
				se.verify().verifyEquals("CP_CrimeCoverageSelection_Details  of AgencyPortal ", getCrimeCoverageSelection_label().isDisplayed(),true, true,test);
				se.element().enterOrValidateText(getCrimeCoverageSelection_TXTV_BasisOfCoverage(strCrimeCoverageSelection_TXTV_BasisOfCoverage), strCrimeCoverageSelection_TXTV_BasisOfCoverage,test);
				se.element().enterOrValidateText(getCrimeCoverageSelection_TXT_NoOfRatableEmployees(strCrimeCoverageSelection_TXT_NoOfRatableEmployees), strCrimeCoverageSelection_TXT_NoOfRatableEmployees, test);
				se.element().checkUncheckOrValidate(getCrimeCoverageSelection_CHK_EmployeeTheft(strCrimeCoverageSelection_CHK_EmployeeTheft), strCrimeCoverageSelection_CHK_EmployeeTheft, test);
				se.element().SelectElement( CrimeCoverageSelection_DD_EmployeeTheftLimit,strCrimeCoverageSelection_DD_EmployeeTheftLimit,test);
				se.element().enterOrValidateText(getCrimeCoverageSelection_TXTV_EmployeeTheftDeductible(strCrimeCoverageSelection_TXTV_EmployeeTheftDeductible), strCrimeCoverageSelection_TXTV_EmployeeTheftDeductible, test);
				se.element().checkUncheckOrValidate(getCrimeCoverageSelection_CHK_ERISAProtection(strCrimeCoverageSelection_CHK_ERISAProtection), strCrimeCoverageSelection_CHK_ERISAProtection, test);
				se.element().enterOrValidateText( getCrimeCoverageSelection_TXT_ERISAPlanName(strCrimeCoverageSelection_TXT_ERISAPlanName),strCrimeCoverageSelection_TXT_ERISAPlanName,test);
				se.element().SelectElement(CrimeCoverageSelection_DD_EmployeeTheftDeductible,strCrimeCoverageSelection_DD_EmployeeTheftDeductible,test);
				se.element().checkUncheckOrValidate(getCrimeCoverageSelection_CHK_TheftOfMoneyandSecurities(strCrimeCoverageSelection_CHK_TheftOfMoneyandSecurities), strCrimeCoverageSelection_CHK_TheftOfMoneyandSecurities, test);
				se.element().SelectElement(CrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimit,strCrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimit,test);
				se.element().enterOrValidateText(getCrimeCoverageSelection_TXTV_TheftOfMoneyandSecuritiesLimitDeduc(strCrimeCoverageSelection_TXTV_TheftOfMoneyandSecuritiesLimitDeduc),strCrimeCoverageSelection_TXTV_TheftOfMoneyandSecuritiesLimitDeduc,test);
				se.element().SelectElement(CrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimitDeduc,strCrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimitDeduc,test);
				se.element().checkUncheckOrValidate(getCrimeCoverageSelection_CHK_RobberyOrSafeBurglary(strCrimeCoverageSelection_CHK_RobberyOrSafeBurglary), strCrimeCoverageSelection_CHK_RobberyOrSafeBurglary, test);
				se.element().SelectElement(CrimeCoverageSelection_DD_RobberyOrSafeBurglaryLimit,strCrimeCoverageSelection_DD_RobberyOrSafeBurglaryLimit,test);
				se.element().enterOrValidateText(getCrimeCoverageSelection_TXTV_RobberyOrSafeBurglaryDed(strCrimeCoverageSelection_TXTV_RobberyOrSafeBurglaryDed),strCrimeCoverageSelection_TXTV_RobberyOrSafeBurglaryDed,test);
				se.element().SelectElement(CrimeCoverageSelection_DD_RobberyOrSafeBurglaryDed,strCrimeCoverageSelection_DD_RobberyOrSafeBurglaryDed,test);
				se.element().checkUncheckOrValidate(getCrimeCoverageSelection_CHK_OutsideThePremises(strCrimeCoverageSelection_CHK_OutsideThePremises), strCrimeCoverageSelection_CHK_OutsideThePremises, test);
				se.element().SelectElement(CrimeCoverageSelection_DD_OutsideThePremisesLimit,strCrimeCoverageSelection_DD_OutsideThePremisesLimit,test);
				se.element().enterOrValidateText(getCrimeCoverageSelection_TXTV_OutsideThePremisesDeductible(strCrimeCoverageSelection_TXTV_OutsideThePremisesDeductible),strCrimeCoverageSelection_TXTV_OutsideThePremisesDeductible,test);
				se.element().SelectElement(CrimeCoverageSelection_DD_OutsideThePremisesDeductible,strCrimeCoverageSelection_DD_OutsideThePremisesDeductible,test);
				se.element().checkUncheckOrValidate(getCrimeCoverageSelection_CHK_ComputerFraud(strCrimeCoverageSelection_CHK_ComputerFraud), strCrimeCoverageSelection_CHK_ComputerFraud, test);
				se.element().SelectElement(CrimeCoverageSelection_DD_ComputerFraudLimit,strCrimeCoverageSelection_DD_ComputerFraudLimit,test);
				se.element().enterOrValidateText(getCrimeCoverageSelection_TXTV_ComputerFraudDeductible(strCrimeCoverageSelection_TXTV_ComputerFraudDeductible),strCrimeCoverageSelection_TXTV_ComputerFraudDeductible,test);
				se.element().SelectElement(CrimeCoverageSelection_DD_ComputerFraudDeductible,strCrimeCoverageSelection_DD_ComputerFraudDeductible,test);
				se.element().checkUncheckOrValidate(getCrimeCoverageSelection_CHK_ForgeryorAlteration(strCrimeCoverageSelection_CHK_ForgeryorAlteration), strCrimeCoverageSelection_CHK_ForgeryorAlteration, test);
				se.element().SelectElement(CrimeCoverageSelection_DD_ForgeorAlterLimit,strCrimeCoverageSelection_DD_ForgeorAlterLimit,test);
				se.element().enterOrValidateText(getCrimeCoverageSelection_TXTV_ForgeorAlterDeductible(strCrimeCoverageSelection_TXTV_ForgeorAlterDeductible),strCrimeCoverageSelection_TXTV_ForgeorAlterDeductible,test);
				se.element().SelectElement(CrimeCoverageSelection_DD_ForgeorAlterDeductible,strCrimeCoverageSelection_DD_ForgeorAlterDeductible,test);
				se.element().checkUncheckOrValidate(getCrimeCoverageSelection_CHK_FundTransfer(strCrimeCoverageSelection_CHK_FundTransfer), strCrimeCoverageSelection_CHK_FundTransfer, test);
				se.element().SelectElement(CrimeCoverageSelection_DD_FundTransferLimit,strCrimeCoverageSelection_DD_FundTransferLimit,test);
				se.element().enterOrValidateText(getCrimeCoverageSelection_TXTV_FundTransferDeductible(strCrimeCoverageSelection_TXTV_FundTransferDeductible),strCrimeCoverageSelection_TXTV_FundTransferDeductible,test);
				se.element().SelectElement(CrimeCoverageSelection_DD_FundTransferDeductible,strCrimeCoverageSelection_DD_FundTransferDeductible,test);
				se.element().checkUncheckOrValidate(getCrimeCoverageSelection_CHK_MoneyOrdersandCounterfietMoney(strCrimeCoverageSelection_CHK_MoneyOrdersandCounterfietMoney), strCrimeCoverageSelection_CHK_MoneyOrdersandCounterfietMoney, test);
				se.element().SelectElement(CrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyLimit,strCrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyLimit,test);
				se.element().enterOrValidateText(getCrimeCoverageSelection_TXTV_MoneyOrdersandCounterfietMoneyDeduc(strCrimeCoverageSelection_TXTV_MoneyOrdersandCounterfietMoneyDeduc),strCrimeCoverageSelection_TXTV_MoneyOrdersandCounterfietMoneyDeduc,test);
				se.element().SelectElement(CrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyDeduc,strCrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyDeduc,test);
				se.element().checkUncheckOrValidate(getCrimeCoverageSelection_CHK_ClientsProperty(strCrimeCoverageSelection_CHK_ClientsProperty), strCrimeCoverageSelection_CHK_ClientsProperty, test);
				se.element().SelectElement(CrimeCoverageSelection_DD_ClientsPropertyLimit,strCrimeCoverageSelection_DD_ClientsPropertyLimit,test);
				se.element().enterOrValidateText(getCrimeCoverageSelection_TXTV_ClientsPropertyDeduc(strCrimeCoverageSelection_TXTV_ClientsPropertyDeduc),strCrimeCoverageSelection_TXTV_ClientsPropertyDeduc,test);
				if(!strCrimeCoverageSelection_TXT_Validation.equalsIgnoreCase("N/A"))
				{
					String ErrorMsg=se.element().getSelectedText(PremiumIndication_TXT_Rattingerror);
					if(!ErrorMsg.contains("Number of Ratable employees must be less"))
					{
						se.element().Click(getGI_CHK_Continue(), test);
					}
					se.element().enterOrValidateText( getPremiumIndication_TXT_Rattingerror(strCrimeCoverageSelection_TXT_Validation),strCrimeCoverageSelection_TXT_Validation,test);
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_CrimeCoverageSelection_Details ", true, false, true, test);
			}
			iteration++;
		}
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}

}
