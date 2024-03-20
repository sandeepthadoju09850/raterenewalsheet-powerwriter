package ap.pages.common;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.SystemPropertyUtil;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class AP_AccountCreation extends BL_OR_CP {
	public void AccountCreation(String strRegressionID, String transaction,  ExtentTest test) throws IOException
	{
		AddressValidation AddressValidation=TestPageFactory.initElements(se, AddressValidation.class);	
			List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.AccountCreation, strRegressionID, transaction);
			int iteration = 0;
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
				String strAccount_TXT_ApplicantName = (String) row.get("Account_TXT_ApplicantName");
				String strAccount_CHK_AccountForSE_No = (String) row.get("Account_CHK_AccountForSE_No");
				String strAccount_CHK_AccountForSE_Yes = (String) row.get("Account_CHK_AccountForSE_Yes");
				String strAccount_CHK_AccountForAccidentHealth_No = (String) row.get("Account_CHK_AccountForAccidentHealth_No");
				String strAccount_CHK_AccountForAccidentHealth_Yes = (String) row.get("Account_CHK_AccountForAccidentHealth_Yes");
				String strAccount_CHK_DoesApplicantRatingLocations_No = (String) row.get("Account_CHK_DoesApplicantRatingLocations_No");
				String strAccount_CHK_DoesApplicantRatingLocations_Yes = (String) row.get("Account_CHK_DoesApplicantRatingLocations_Yes");
				String strAccount_TXT_DateBusinessStart = (String) row.get("Account_TXT_DateBusinessStart");
				String strAccount_TXT_MailingAdd1 = (String) row.get("GI_AppInfo_TXT_MailingAddressLine1");
				String strAccount_TXT_MailingAdd2 = (String) row.get("GI_AppInfo_TXT_MailingAddressLine2");
				String strAccount_TXT_MailingAddCity = (String) row.get("GI_AppInfo_TXT_City");
				String strAccount_DD_MailingAddState = (String) row.get("GI_AppInfo_DD_StateorProvince");
				String strAccount_TXT_MailingAddZip = (String) row.get("GI_AppInfo_TXT_ZipCode");
				String strGI_AI_DD_AgencyName = (String) row.get("GI_AI_DD_AgencyName");
				String strGI_AI_TXT_AgencyName = (String) row.get("GI_AI_TXT_AgencyName");
				String strGI_AI_DD_Producer = (String) row.get("GI_AI_DD_Producer");
				String strAccount_TXT_TotalNumberofEmployees = (String) row.get("Account_TXT_TotalNumberofEmployees");
				
				//String strGI_AI_TXT_AgencyPhone = (String) row.get("GI_AI_Label_AgencyPhone");
				String strGI_AI_TXT_Agent_CSR_Name = (String) row.get("GI_AI_TXT_Agent/CSR_Name");
				String strGI_AI_TXT_Agent_CSR_Phone = (String) row.get("GI_AI_TXT_Agent/CSR_Phone");
				String strGI_AI_TXT_Agent_CSR_Email = (String) row.get("GI_AI_TXT_Agent/CSR E-mail");
				//String strGI_AppInfo_TXT_EffectiveDate = (String) row.get("GI_AppInfo_TXT_EffectiveDate");
				String strGI_AppInfo_DD_Legal_Entity = (String) row.get("GI_AppInfo_DD_Legal_Entity");
				
				//String eff_date = Util.getCurrentDate();
				String eff_date = SystemPropertyUtil.getEffectiveDate();
				String strAddVal_NewAddressValidation = (String) row.get("AddVal_NewAddressValidation");
				//String strGI_AppInfo_TXT_Tax_ID = (String) row.get("GI_AppInfo_TXT_Tax_ID");
				String strAccount_CHK_Tax_ID_Type_FEIN = (String) row.get("Account_CHK_Tax_ID_Type_FEIN");
				String strAccount_CHK_Tax_ID_Type_SSN = (String) row.get("Account_CHK_Tax_ID_Type_SSN");
				String strAccount_TXT_taxIdFEIN = (String) row.get("Account_TXT_taxIdFEIN");
				String strAccount_TXT_taxIdSSN = (String) row.get("Account_TXT_taxIdSSN");
				String strAccount_DD_AccountHolderPayPlan = (String) row.get("Account_DD_AccountHolderPayPlan");

				try {
					se.log().logTestStep("AccountCreation");
					test.log(LogStatus.INFO, "AccountCreation","Transaction Step : "+transaction + "<br>" +"Page : AccountCreation");
					se.verify().verifyEquals("AccountCreation of AgencyPortal ", getGI_AgencyInformationSection_label().isDisplayed(),true, true,test);
					
					if(transaction.equalsIgnoreCase("NewQuote")&&strGI_AI_DD_AgencyName.equalsIgnoreCase("Yes")) {
						se.element().Click(getGI_AI_Click_AgencyName(), test);
					}
					se.element().enterOrValidateText(getAccount_AI_TXT_AgencyName(strGI_AI_TXT_AgencyName),strGI_AI_TXT_AgencyName,test);
					se.util().sleep(3000);
					if(constants.Env.contains("dev")) {
					se.element().waitForElementToDisappear_One(progressBar,120);
					se.element().waitBasedOnCount(PleaseWaitPopup,60);
					se.util().sleep(10000);
					}
					se.element().waitForElementToAppear_One(strGI_AI_DD_Producer,GI_AI_DD_Producer, 30);
					
					se.element().SelectElement(GI_AI_DD_Producer, strGI_AI_DD_Producer,test);
					se.element().enterOrValidateText(getAccount_TXT_CSR_Name(strGI_AI_TXT_Agent_CSR_Name),strGI_AI_TXT_Agent_CSR_Name,test);
					se.element().enterOrValidateText(getAccount_TXT_CSR_Phone(strGI_AI_TXT_Agent_CSR_Phone),strGI_AI_TXT_Agent_CSR_Phone,test);
					se.element().enterOrValidateText(getAccount_TXT_csrEmail(strGI_AI_TXT_Agent_CSR_Email),strGI_AI_TXT_Agent_CSR_Email,test);
					//se.util().sleep(3000);
					if(iteration>0) {
						se.element().waitBasedOnCount(PleaseWaitPopup,40);
					}
					se.element().waitForElement(GI_AppInfo_TXT_EffectiveDate);
					/*if (!strGI_AppInfo_TXT_EffectiveDate.contains("N/A") && transaction.contains("NewQuote"))
					{
						se.element().enterOrValidateText(getGI_AppInfo_TXT_EffectiveDate(strGI_AppInfo_TXT_EffectiveDate),strGI_AppInfo_TXT_EffectiveDate,test);
						se.util().sleep(2000);
						se.element().waitBasedOnCount(PleaseWaitPopup,40);
					}
					else*/ if(transaction.equalsIgnoreCase("NewQuote")) 
					{
						se.element().enterOrValidateTextDate(getGI_AppInfo_TXT_EffectiveDate(eff_date),eff_date,test);
							se.util().sleep(2000);
						se.element().waitBasedOnCount(PleaseWaitPopup,40);
					}
					
					Format f = new SimpleDateFormat("HH.mm");
					String strDate = f.format(new Date());
					//System.out.println(strDate);
					String OldstrAccount_TXT_ApplicantName = strDate+ strAccount_TXT_ApplicantName;
					
					
					
					se.element().enterOrValidateText(getAccount_TXT_ApplicantName(OldstrAccount_TXT_ApplicantName),OldstrAccount_TXT_ApplicantName,test);
					se.element().checkUncheckOrValidate(getAccount_CHK_AccountForSE_Yes(strAccount_CHK_AccountForSE_Yes),strAccount_CHK_AccountForSE_Yes,test);
					se.element().checkUncheckOrValidate(getAccount_CHK_AccountForSE_No(strAccount_CHK_AccountForSE_No),strAccount_CHK_AccountForSE_No,test);
					se.element().checkUncheckOrValidate(getAccount_CHK_AccountForAccidentHealth_No(strAccount_CHK_AccountForAccidentHealth_No),strAccount_CHK_AccountForAccidentHealth_No,test);
					se.element().checkUncheckOrValidate(getAccount_CHK_AccountForAccidentHealth_Yes(strAccount_CHK_AccountForAccidentHealth_Yes),strAccount_CHK_AccountForAccidentHealth_Yes,test);
					se.element().checkUncheckOrValidate(getAccount_CHK_DoesApplicantRatingLocations_No(strAccount_CHK_DoesApplicantRatingLocations_No),strAccount_CHK_DoesApplicantRatingLocations_No,test);
					se.element().checkUncheckOrValidate(getAccount_CHK_DoesApplicantRatingLocations_Yes(strAccount_CHK_DoesApplicantRatingLocations_Yes),strAccount_CHK_DoesApplicantRatingLocations_Yes,test);
					
					se.element().enterOrValidateTextDate(getAccount_TXT_DateBusinessStart(strAccount_TXT_DateBusinessStart),strAccount_TXT_DateBusinessStart,test);
					
					se.util().sleep(3000);
					if(!strAccount_TXT_TotalNumberofEmployees.contains("N/A"))
					{
					se.util().sleep(5000);
					se.element().waitForElementToDisappear_One(progressBar,120);
					se.element().waitForElementToAppear_One(strAccount_TXT_TotalNumberofEmployees,GI_NatOfBusi_TXT_TotalNumberofEmployees,60);
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_NatOfBusi_TXT_TotalNumberofEmployees(strAccount_TXT_TotalNumberofEmployees));
					se.element().Click(getGI_NatOfBusi_TXT_TotalNumberofEmployees(strAccount_TXT_TotalNumberofEmployees), test);
					se.element().enterOrValidateText(getGI_NatOfBusi_TXT_TotalNumberofEmployees(strAccount_TXT_TotalNumberofEmployees),strAccount_TXT_TotalNumberofEmployees,test);
					se.element().waitForElementToDisappear_One(progressBar,120);
					}
					if(!strAddVal_NewAddressValidation.contains("New"))
					{
					se.element().enterOrValidateText(getAccount_TXT_MailingAdd1(strAccount_TXT_MailingAdd1),strAccount_TXT_MailingAdd1,test);
					se.element().enterOrValidateText(getAccount_TXT_MailingAdd2(strAccount_TXT_MailingAdd2),strAccount_TXT_MailingAdd2,test);
					se.element().enterOrValidateText(getAccount_TXT_MailingAddCity(strAccount_TXT_MailingAddCity),strAccount_TXT_MailingAddCity,test);
					se.element().SelectElement(Account_DD_MailingAddState, strAccount_DD_MailingAddState,test);
					se.element().enterOrValidateText(getAccount_TXT_MailingAddZip(strAccount_TXT_MailingAddZip),strAccount_TXT_MailingAddZip,test);
					}
					else{
						AddressValidation.AddressStandardization(row, test);
					}
					
					se.element().SelectElement(Account_DD_Legal_Entity,strGI_AppInfo_DD_Legal_Entity,test);
					
					se.element().checkUncheckOrValidate(getAccount_CHK_Tax_ID_Type_FEIN(strAccount_CHK_Tax_ID_Type_FEIN),strAccount_CHK_Tax_ID_Type_FEIN,test);
					se.element().checkUncheckOrValidate(getAccount_CHK_Tax_ID_Type_SSN(strAccount_CHK_Tax_ID_Type_SSN),strAccount_CHK_Tax_ID_Type_SSN,test);
					se.element().waitForElementToDisappear_One(progressBar,120);
					se.util().sleep(3000);
					se.element().enterOrValidateText(getAccount_TXT_taxIdFEIN(strAccount_TXT_taxIdFEIN),strAccount_TXT_taxIdFEIN,test);
					se.element().enterOrValidateText(getAccount_TXT_taxIdSSN(strAccount_TXT_taxIdSSN),strAccount_TXT_taxIdSSN,test);
					se.util().sleep(3000);

					se.element().SelectElement(Account_DD_AccountHolderPayPlan,strAccount_DD_AccountHolderPayPlan,test);
					se.util().sleep(3000);

					
					
					se.element().Click(getBtnContinue(), test);
				}catch(Exception e){
		e.printStackTrace();
		e.getMessage();
		se.verify().verifyEquals("Failed to fill in details for Account Creation ", true, false, true, test);
	}
							iteration++;
			}
	
	}
}