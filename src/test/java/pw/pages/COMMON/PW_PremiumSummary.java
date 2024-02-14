package pw.pages.COMMON;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import Libraries.automation.common.framework.XlsData;
import pw.Constants.constants;
import pw.OR.OR_Common;

public class PW_PremiumSummary extends OR_Common {

	public void GetPremiumSummary(String strRegressionID, String transaction, List<String> transactionsList, File file,
			XSSFWorkbook workbook, ExtentTest test) throws IOException {
		
		PW_CommonMethods CommonMethods = new PW_CommonMethods();
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase(constants.Premium_Summary)) {
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Premium_Summary, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

			try {
				se.element().waitForElement(PremiumSummary_LBL_PremiumSummary);

				test.log(LogStatus.INFO, "PremiumSummary","Transaction Step : " + transaction + "<br>" + "Page : PremiumSummary");
				se.verify().verifyEquals("PremiumSummary Page of PowerWriter ",getPremiumSummary_LBL_PremiumSummary().isDisplayed(), true, true, test);
				
				int startRowNumber = 1;
				if (transactionsList.indexOf(transaction) == 0) {
					startRowNumber = 0;
				} 
					GetGeneralInfo(row, test);
					GetPremiumInfo(row, transaction, strRegressionID, startRowNumber, file, workbook, test);
					GetLOBLevelPremiumsInfo(row, test);
				se.element().Click(getcommon_BTN_completetranx(), test);
			
				
			} catch (Exception e) {
				se.verify().verifyEquals("Failed to fill in details for GetPremiumSummary ", true, false, true, test);
				
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
	public void CA_GetPremiumSummary(String strRegressionID, String transaction, List<String> transactionsList, File file,
			XSSFWorkbook workbook, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase(constants.Premium_Summary)) {
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Premium_Summary, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

			try {
				se.element().waitForElement(PremiumSummary_LBL_PremiumSummary);

				test.log(LogStatus.INFO, "CAPremiumSummary","Transaction Step : " + transaction + "<br>" + "Page : PremiumSummary");
				se.verify().verifyEquals("CAPremiumSummary Page of PowerWriter ",getPremiumSummary_LBL_PremiumSummary().isDisplayed(), true, true, test);

				
				int startRowNumber = 1;
				if (transactionsList.indexOf(transaction) == 0) {
					startRowNumber = 0;
				} 
				CA_GetGeneralInfo(row, test);
				CA_GetPremiumInfo(row, transaction, strRegressionID, startRowNumber, file, workbook, test);
				driver.switchTo().defaultContent();
				se.element().Click(getcommon_BTN_completetranx(), test);
			
				
			} catch (Exception e) {
				se.verify().verifyEquals("Failed to fill in details for GetPremiumSummary ", true, false, true, test);
				
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
	public void CU_GetPremiumSummary(String strRegressionID, String transaction, List<String> transactionsList, File file,
			XSSFWorkbook workbook, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase(constants.Premium_Summary)) {
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Premium_Summary, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

			try {
				se.element().waitForElement(PremiumSummary_LBL_PremiumSummary);

				test.log(LogStatus.INFO, "CUPremiumSummary","Transaction Step : " + transaction + "<br>" + "Page : PremiumSummary");
				se.verify().verifyEquals("CUPremiumSummary Page of PowerWriter ",getPremiumSummary_LBL_PremiumSummary().isDisplayed(), true, true, test);

				
				int startRowNumber = 1;
				if (transactionsList.indexOf(transaction) == 0) {
					startRowNumber = 0;
				} 
				
				
				GetGeneralInfo(row, test);
				GetPremiumInfo(row, transaction, strRegressionID, startRowNumber, file, workbook, test);
				se.element().Click(getcommon_BTN_completetranx(), test);
			
				
			} catch (Exception e) {
				se.verify().verifyEquals("Failed to fill in details for GetPremiumSummary ", true, false, true, test);
				
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
	
	public void WC_GetPremiumSummary(String strRegressionID, String transaction, List<String> transactionsList, File file,
			XSSFWorkbook workbook, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase(constants.Premium_Summary)) {
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Premium_Summary, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

			try {
				se.element().waitForElement(PremiumSummary_LBL_PremiumSummary);

				test.log(LogStatus.INFO, "WCPremiumSummary","Transaction Step : " + transaction + "<br>" + "Page : PremiumSummary");
				se.verify().verifyEquals("WCPremiumSummary Page of PowerWriter ",getPremiumSummary_LBL_PremiumSummary().isDisplayed(), true, true, test);

				
				int startRowNumber = 1;
				if (transactionsList.indexOf(transaction) == 0) {
					startRowNumber = 0;
				} 
				
				WC_GetPremiumInfo(row, transaction, strRegressionID, startRowNumber, file, workbook, test);
				se.element().Click(getcommon_BTN_completetranx(), test);
			
				
			} catch (Exception e) {
				se.verify().verifyEquals("Failed to fill in details for GetPremiumSummary ", true, false, true, test);
				
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

	public void CA_GetGeneralInfo(Map<String, String> row, ExtentTest test) throws IOException {

		try {

			String strPremiumSummary_GeneralInfo_InsuredName = (String) row.get("PremiumSummary_GeneralInfo_InsuredName");
			String strPremiumSummary_GeneralInfo_QuoteNo_CompanyCode = (String)row.get("PremiumSummary_GeneralInfo_QuoteNo_CompanyCode");
			String strPremiumSummary_GeneralInfo_EffectiveDate = (String) row.get("PremiumSummary_GeneralInfo_EffectiveDate");
			String strPremiumSummary_GeneralInfo_ExpirationDate = (String) row.get("PremiumSummary_GeneralInfo_ExpirationDate");
			String strPremiumSummary_GeneralInfo_ProducerName = (String) row.get("PremiumSummary_GeneralInfo_ProducerName");
			String strPremiumSummary_GeneralInfo_Coverage = (String) row.get("PremiumSummary_GeneralInfo_Coverage");
			String strPremiumSummary_GeneralInfo_ProRateFactor = (String) row.get("PremiumSummary_GeneralInfo_ProRateFactor");
			driver.switchTo().defaultContent();
			driver.switchTo().frame(getPremiumSummary_IFrame());
			String strPremiumSummary_GeneralInfo_InsuredName_Actual = getPremiumSummary_GeneralInfo_InsuredName().getText().trim();
			//String strPremiumSummary_GeneralInfo_QuoteNo_CompanyCode_Actual = getPremiumSummary_GeneralInfo_QuoteNumber().getText().trim();
			String strPremiumSummary_GeneralInfo_EffectiveDate_Actual = getPremiumSummary_CAGeneralInfo_EffectiveDate().getText().trim();
			String strPremiumSummary_GeneralInfo_ExpirationDate_Actual = getPremiumSummary_GeneralInfo_ExpirationDate().getText().trim();
			String strPremiumSummary_GeneralInfo_ProducerName_Actual = getPremiumSummary_GeneralInfo_ProducerName().getText().trim();
			String strPremiumSummary_GeneralInfo_Coverage_Actual = getPremiumSummary_GeneralInfo_Coverage_Actual().getText().trim();
			String strPremiumSummary_GeneralInfo_ProRateFactor_Actual = getPremiumSummary_GeneralInfo_ProRateFactor().getText().trim();
			
			checkAndRewriteCompanyCode(strPremiumSummary_GeneralInfo_QuoteNo_CompanyCode, test);

			se.verify().verifyAsPassOrError("InsuredName Validation", strPremiumSummary_GeneralInfo_InsuredName_Actual,strPremiumSummary_GeneralInfo_InsuredName.trim(), true, test);
			se.verify().verifyAsPassOrError("EffectiveDate Validation", strPremiumSummary_GeneralInfo_EffectiveDate_Actual,
					strPremiumSummary_GeneralInfo_EffectiveDate.trim(), true, test);
			se.verify().verifyAsPassOrError("ExpirationDate Validation", strPremiumSummary_GeneralInfo_ExpirationDate_Actual,
					strPremiumSummary_GeneralInfo_ExpirationDate.trim(), true, test);
			se.verify().verifyAsPassOrError("ProducerName Validation", strPremiumSummary_GeneralInfo_ProducerName_Actual,
					strPremiumSummary_GeneralInfo_ProducerName.trim(), true, test);
			se.verify().verifyAsPassOrError("Coverage Validation", strPremiumSummary_GeneralInfo_Coverage_Actual,
					strPremiumSummary_GeneralInfo_Coverage.trim(), true, test);
			se.verify().verifyAsPassOrError("ProRateFactor Validation", strPremiumSummary_GeneralInfo_ProRateFactor_Actual,
					strPremiumSummary_GeneralInfo_ProRateFactor.trim(), true, test);
			driver.switchTo().defaultContent();
		} catch (Exception e) {

			se.verify().verifyEquals("Failed to verify General Info section on Premium summary screen of CA LOB", true, false, true, test);
			se.log().logTestStep("Exception in Premium details - General Info section of CA LOB - " + e);

		}

	}
	public void GetGeneralInfo(Map<String, String> row, ExtentTest test) throws IOException {
		
		PW_CommonMethods CommonMethods = new PW_CommonMethods();

		try {

			String strPremiumSummary_GeneralInfo_InsuredName = (String) row.get("PremiumSummary_GeneralInfo_InsuredName");
			String strPremiumSummary_GeneralInfo_QuoteNo_CompanyCode = (String)row.get("PremiumSummary_GeneralInfo_QuoteNo_CompanyCode");
			String strPremiumSummary_GeneralInfo_Underwriter = (String) row.get("PremiumSummary_GeneralInfo_Underwriter");
			String strPremiumSummary_GeneralInfo_EffectiveDate = (String) row.get("PremiumSummary_GeneralInfo_EffectiveDate");
			String strPremiumSummary_GeneralInfo_ExpirationDate = (String) row.get("PremiumSummary_GeneralInfo_ExpirationDate");
			String strPremiumSummary_GeneralInfo_TransactionEffectiveDate = (String) row.get("PremiumSummary_GeneralInfo_TransactionEffectiveDate");
			String strPremiumSummary_GeneralInfo_ProducerName = (String) row.get("PremiumSummary_GeneralInfo_ProducerName");
			String strPremiumSummary_GeneralInfo_LineOfBusiness = (String) row.get("PremiumSummary_GeneralInfo_LineOfBusiness");
			String strPremiumSummary_GeneralInfo_ProRateFactor = (String) row.get("PremiumSummary_GeneralInfo_ProRateFactor");

			driver.switchTo().frame(getPremiumSummary_IFrame());
			
			//String strPremiumSummary_GeneralInfo_QuoteNo_CompanyCode_Actual = getPremiumSummary_GeneralInfo_QuoteNumber().getText().trim();
			String strPremiumSummary_GeneralInfo_Underwriter_Actual = getPremiumSummary_GeneralInfo_Underwriter().getText().trim();
			String strPremiumSummary_GeneralInfo_EffectiveDate_Actual = getPremiumSummary_GeneralInfo_EffectiveDate().getText().trim();
			String strPremiumSummary_GeneralInfo_ExpirationDate_Actual = getPremiumSummary_GeneralInfo_ExpirationDate().getText().trim();
			String strPremiumSummary_GeneralInfo_TransactionEffectiveDate_Actual = getPremiumSummary_GeneralInfo_TransactionEffectiveDate().getText().trim();
			String strPremiumSummary_GeneralInfo_ProducerName_Actual = getPremiumSummary_GeneralInfo_ProducerName().getText().trim();
			String strPremiumSummary_GeneralInfo_LineOfBusiness_Actual = getPremiumSummary_GeneralInfo_LineOfBusiness().getText().trim();
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();
			executor.executeScript("arguments[0].scrollIntoView(0,250);", getPremiumSummary_GeneralInfo_ProRateFactor());
			se.util().sleep(1000);
			
			String strPremiumSummary_GeneralInfo_ProRateFactor_Actual = getPremiumSummary_GeneralInfo_ProRateFactor().getText().trim();
			
			checkAndRewriteCompanyCode(strPremiumSummary_GeneralInfo_QuoteNo_CompanyCode, test);
			
			// 07/03-Commenting Insured Name Validation 
			//se.verify().verifyAsPassOrError("InsuredName Validation", strPremiumSummary_GeneralInfo_InsuredName_Actual,strPremiumSummary_GeneralInfo_InsuredName.trim(), true, test);
			se.verify().verifyAsPassOrError("Underwriter Validation", strPremiumSummary_GeneralInfo_Underwriter_Actual,
					strPremiumSummary_GeneralInfo_Underwriter.trim(), true, test);
			se.verify().verifyAsPassOrError("EffectiveDate Validation", strPremiumSummary_GeneralInfo_EffectiveDate_Actual,
					strPremiumSummary_GeneralInfo_EffectiveDate.trim(), true, test);
			se.verify().verifyAsPassOrError("ExpirationDate Validation", strPremiumSummary_GeneralInfo_ExpirationDate_Actual,
					strPremiumSummary_GeneralInfo_ExpirationDate.trim(), true, test);
			se.verify().verifyAsPassOrError("TransactionEffectiveDate Validation",
					strPremiumSummary_GeneralInfo_TransactionEffectiveDate_Actual,
					strPremiumSummary_GeneralInfo_TransactionEffectiveDate.trim(), true, test);
			se.verify().verifyAsPassOrError("ProducerName Validation", strPremiumSummary_GeneralInfo_ProducerName_Actual,
					strPremiumSummary_GeneralInfo_ProducerName.trim(), true, test);
			se.verify().verifyAsPassOrError("LineOfBusiness Validation", strPremiumSummary_GeneralInfo_LineOfBusiness_Actual,
					strPremiumSummary_GeneralInfo_LineOfBusiness.trim(), true, test);
			se.verify().verifyAsPassOrError("ProRateFactor Validation", strPremiumSummary_GeneralInfo_ProRateFactor_Actual,
					strPremiumSummary_GeneralInfo_ProRateFactor.trim(), true, test);
			driver.switchTo().defaultContent();
		} catch (Exception e) {

			se.verify().verifyEquals("Failed to verify General Info section on Premium summary screen ", true, false, true, test);
			se.log().logTestStep("Exception in Premium details - General Info section  - " + e);

		}

	}
	
	public void checkAndRewriteCompanyCode(String expectedCompanyCode, ExtentTest test) {

		driver.switchTo().defaultContent();
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		executor.executeScript("arguments[0].scrollIntoView(0,250);", getcomonLnkProductInfoScreen());
		se.util().sleep(1000);
	
		String strPremiumSummary_GeneralInfo_QuoteNo_CompanyCode_Actual = getcomonLnkProductInfoScreen().getText().trim();
		se.log().logTestStep("The Current Actual value of Company code is - "  + strPremiumSummary_GeneralInfo_QuoteNo_CompanyCode_Actual);
		if (!(strPremiumSummary_GeneralInfo_QuoteNo_CompanyCode_Actual.contains(expectedCompanyCode))) {
			String[] strQuoteNoCompanyName = expectedCompanyCode.split("-");
			se.element().Click(getcomonLnkProductInfoScreen(), test);
			se.element().enterOrValidateText(getProductInfo_TXT_Company(strQuoteNoCompanyName[1].trim()), strQuoteNoCompanyName[1].trim(), test);
			se.element().Click(getCalprem(), test);
			String strPremiumSummary_GeneralInfo_QuoteNo_CompanyCode_ActualafterCompanyswitch = getcomonLnkProductInfoScreen().getText().trim();
			driver.switchTo().frame(getPremiumSummary_IFrame());
			se.log().logTestStep("The Current Actual value of Company code is - "  + strPremiumSummary_GeneralInfo_QuoteNo_CompanyCode_ActualafterCompanyswitch);
		}
	}


	public void GetPremiumInfo(Map<String, String> row, String transaction, String strRegressionID, int startRowNumber,
			File file, XSSFWorkbook workbook, ExtentTest test) throws IOException {

		try {

			String strPremiumSummary_PremInfo_TransactionPremium = (String) row
					.get("PremiumSummary_PremInfo_TransactionPremium");
			String strPremiumSummary_PremInfo_AnnualizedTransactionPremium = (String) row
					.get("PremiumSummary_PremInfo_AnnualizedTransactionPremium");
			String strPremiumSummary_PremInfo_TransactionSurchargeTaxesFees = (String) row
					.get("PremiumSummary_PremInfo_TransactionSurchargeTaxesFees");
			String strPremiumSummary_PremInfo_AnnualizedTransactionSurchargeTaxesFees = (String) row
					.get("PremiumSummary_PremInfo_AnnualizedTransactionSurchargeTaxesFees");
			String strPremiumSummary_PremInfo_TotalTransactionPremium = (String) row
					.get("PremiumSummary_PremInfo_TotalTransactionPremium");
			String strPremiumSummary_PremInfo_TotalAnnualizedTransactionPremium = (String) row
					.get("PremiumSummary_PremInfo_TotalAnnualizedTransactionPremium");
			String strPremiumSummary_PremInfo_TotalAnnualPolicyPremium = (String) row
					.get("PremiumSummary_PremInfo_TotalAnnualPolicyPremium");
			String strPremiumSummary_PremInfo_WaivedPremium = (String) row.get("PremiumSummary_PremInfo_WaivedPremium");

			driver.switchTo().frame(getPremiumSummary_IFrame());
			
			String strPremiumSummary_PremInfo_TransactionPremium_Actual;
			if(transaction.contains(constants.Audit)||transaction.equalsIgnoreCase(constants.ReviseAudit)){
				 strPremiumSummary_PremInfo_TransactionPremium_Actual = getPremiumSummary_PremInfo_WrittenPremium()
						.getText().trim();
			}else{
				 strPremiumSummary_PremInfo_TransactionPremium_Actual = getPremiumSummary_PremInfo_TransactionPremium()
						.getText().trim();
			}
			
			String strPremiumSummary_PremInfo_AnnualizedTransactionPremium_Actual = getPremiumSummary_PremInfo_AnnualizedTransactionPremium()
					.getText().trim();
			String strPremiumSummary_PremInfo_TransactionSurchargeTaxesFees_Actual = getPremiumSummary_PremInfo_TransactionSurchargeTaxesFees()
					.getText().trim();
			String strPremiumSummary_PremInfo_AnnualizedTransactionSurchargeTaxesFees_Actual = getPremiumSummary_PremInfo_AnnualizedTransactionSurchargeTaxesFees()
					.getText().trim();
			String strPremiumSummary_PremInfo_TotalTransactionPremium_Actual;
			if(transaction.contains(constants.Audit)||transaction.equalsIgnoreCase(constants.ReviseAudit)){
				strPremiumSummary_PremInfo_TotalTransactionPremium_Actual = getPremiumSummary_PremInfo_TotalAuditedTransactionPremium()
						.getText().trim();
			}else{
				strPremiumSummary_PremInfo_TotalTransactionPremium_Actual = getPremiumSummary_PremInfo_TotalTransactionPremium()
						.getText().trim();
			}
			String strPremiumSummary_PremInfo_TotalAnnualizedTransactionPremium_Actual = getPremiumSummary_PremInfo_TotalAnnualizedTransactionPremium()
					.getText().trim();
			String strPremiumSummary_PremInfo_TotalAnnualPolicyPremium_Actual = getPremiumSummary_PremInfo_TotalAnnualPolicyPremium()
					.getText().trim();

			se.verify().verifyAsPassOrError("TransactionPremium Validation",
					strPremiumSummary_PremInfo_TransactionPremium_Actual,
					strPremiumSummary_PremInfo_TransactionPremium.trim(), true, test);
			se.verify().verifyAsPassOrError("AnnualizedTransactionPremium Validation",
					strPremiumSummary_PremInfo_AnnualizedTransactionPremium_Actual,
					strPremiumSummary_PremInfo_AnnualizedTransactionPremium.trim(), true, test);
			se.verify().verifyAsPassOrError("TransactionSurchargeTaxesFees Validation",
					strPremiumSummary_PremInfo_TransactionSurchargeTaxesFees_Actual,
					strPremiumSummary_PremInfo_TransactionSurchargeTaxesFees.trim(), true, test);
			se.verify().verifyAsPassOrError("AnnualizedTransactionSurchargeTaxesFees Validation",
					strPremiumSummary_PremInfo_AnnualizedTransactionSurchargeTaxesFees_Actual,
					strPremiumSummary_PremInfo_AnnualizedTransactionSurchargeTaxesFees.trim(), true, test);
			se.verify().verifyAsPassOrError("TotalTransactionPremium Validation",
					strPremiumSummary_PremInfo_TotalTransactionPremium_Actual,
					strPremiumSummary_PremInfo_TotalTransactionPremium.trim(), true, test);
			se.verify().verifyAsPassOrError("TotalAnnualizedTransactionPremium Validation",
					strPremiumSummary_PremInfo_TotalAnnualizedTransactionPremium_Actual,
					strPremiumSummary_PremInfo_TotalAnnualizedTransactionPremium.trim(), true, test);
			se.verify().verifyAsPassOrError("TotalAnnualPolicyPremium Validation",
					strPremiumSummary_PremInfo_TotalAnnualPolicyPremium_Actual,
					strPremiumSummary_PremInfo_TotalAnnualPolicyPremium.trim(), true, test);
			String strPremiumSummary_PremInfo_WaivedPremium_Actual = " ";
			if (!strPremiumSummary_PremInfo_WaivedPremium.equalsIgnoreCase(constants.NA)) {
				strPremiumSummary_PremInfo_WaivedPremium_Actual = getPremiumSummary_PremInfo_WaivedPremium().getText()
						.trim();
				se.verify().verifyAsPassOrError("WaivedPremium Validation", strPremiumSummary_PremInfo_WaivedPremium_Actual,
						strPremiumSummary_PremInfo_WaivedPremium.trim(), true, test);
			}

			
			List<String> PremiumNames = new ArrayList<>();
			PremiumNames.add("TransactionPremium");
			PremiumNames.add("Total_Surcharge");
			PremiumNames.add("Total_Premium");
			PremiumNames.add("Waived_Premium");

			List<String> Expected = new ArrayList<>();
			Expected.add(0, strPremiumSummary_PremInfo_TransactionPremium.trim());
			Expected.add(1, strPremiumSummary_PremInfo_TransactionSurchargeTaxesFees.trim());
			Expected.add(2, strPremiumSummary_PremInfo_TotalTransactionPremium.trim());
			if (!strPremiumSummary_PremInfo_WaivedPremium.equalsIgnoreCase(constants.NA)) {
				Expected.add(3, strPremiumSummary_PremInfo_WaivedPremium.trim());

			} else {
				Expected.add(3, constants.NA);
			}

			List<String> Actuals = new ArrayList<>();
			Actuals.add(0, strPremiumSummary_PremInfo_TransactionPremium_Actual);
			Actuals.add(1, strPremiumSummary_PremInfo_TransactionSurchargeTaxesFees_Actual);
			Actuals.add(2, strPremiumSummary_PremInfo_TotalTransactionPremium_Actual);
			List<String> Status = new ArrayList<>();

			if (strPremiumSummary_PremInfo_TransactionPremium.trim()
					.equals(strPremiumSummary_PremInfo_TransactionPremium_Actual)) {
				Status.add(0, constants.Pass);
			} else {
				Status.add(0, constants.Fail);
			}

			if (strPremiumSummary_PremInfo_TransactionSurchargeTaxesFees.trim()
					.equals(strPremiumSummary_PremInfo_TransactionSurchargeTaxesFees_Actual)) {
				Status.add(1, constants.Pass);
			} else {
				Status.add(1, constants.Fail);
			}
			if (strPremiumSummary_PremInfo_TotalTransactionPremium.trim()
					.equals(strPremiumSummary_PremInfo_TotalTransactionPremium_Actual)) {
				Status.add(2, constants.Pass);
			} else {
				Status.add(2, constants.Fail);
			}
			if (!strPremiumSummary_PremInfo_WaivedPremium.equalsIgnoreCase(constants.NA)) {

				Actuals.add(3, strPremiumSummary_PremInfo_WaivedPremium_Actual);
				if (strPremiumSummary_PremInfo_WaivedPremium.trim()
						.equals(strPremiumSummary_PremInfo_WaivedPremium_Actual)) {
					Status.add(3, constants.Pass);
				} else {
					Status.add(3, constants.Fail);
				}
			} else {
				Actuals.add(3, constants.NA);
				Status.add(3, constants.NA);

			}

			updatePremiumsInXL(PremiumNames, Expected, Actuals, Status, transaction, strRegressionID, startRowNumber,
					 file,  workbook,  test);
		} catch (Exception e) {

			se.verify().verifyEquals("Failed to verify premium info on Premium Summary screen ", true, false, true, test);
			se.log().logTestStep("Exception in Premium Info\n  - " + e);

		}

	}
	public void CA_GetPremiumInfo(Map<String, String> row, String transaction, String strRegressionID, int startRowNumber,
			File file, XSSFWorkbook workbook, ExtentTest test) throws IOException {

		try {

			String strPremiumSummary_PremInfo_TotalTransactionPremium = (String) row
					.get("PremiumSummary_PremInfo_TotalTransactionPremium");
			
			String strPremiumSummary_PremInfo_TotalSurchargeTaxesFees = (String) row
					.get("PremiumSummary_PremInfo_TotalSurchargeTaxesFees");
			
			String strPremiumSummary_PremInfo_TotalPremium = (String) row
					.get("PremiumSummary_PremInfo_TotalPremium");
			
			String strPremiumSummary_PremInfo_TotalWaivedPremium = (String) row.get("PremiumSummary_PremInfo_TotalWaivedPremium");

			
			driver.switchTo().frame(getPremiumSummary_IFrame());
			
			String strPremiumSummary_PremInfo_TotalTransactionPremium_Actual;
			 strPremiumSummary_PremInfo_TotalTransactionPremium_Actual = getPremiumSummary_PremInfo_TotalTransactionPremium_CA().getText().trim();
	
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();
			executor.executeScript("arguments[0].scrollIntoView(0,250);", getPremiumSummary_PremInfo_TotalSurchargeTaxesFees());
			se.util().sleep(1000);
			String strPremiumSummary_PremInfo_TotalSurchargeTaxesFees_Actual = getPremiumSummary_PremInfo_TotalSurchargeTaxesFees().getText().trim();
			
			String strPremiumSummary_PremInfo_TotalPremium_Actual = getPremiumSummary_PremInfo_TotalPremium().getText().trim();
			
			se.verify().verifyAsPassOrError("Total TransactionPremium Validation",
					strPremiumSummary_PremInfo_TotalTransactionPremium_Actual,
					strPremiumSummary_PremInfo_TotalTransactionPremium.trim(), true, test);
			
			se.verify().verifyAsPassOrError("TransactionSurchargeTaxesFees Validation",
					strPremiumSummary_PremInfo_TotalSurchargeTaxesFees_Actual,
					strPremiumSummary_PremInfo_TotalSurchargeTaxesFees.trim(), true, test);
			
			se.verify().verifyAsPassOrError("TotalPremium Validation",
					strPremiumSummary_PremInfo_TotalPremium_Actual,
					strPremiumSummary_PremInfo_TotalPremium.trim(), true, test);
			
			String strPremiumSummary_PremInfo_TotalWaivedPremium_Actual = " ";
			if (!strPremiumSummary_PremInfo_TotalWaivedPremium.equalsIgnoreCase(constants.NA)) {
				 strPremiumSummary_PremInfo_TotalWaivedPremium_Actual = getPremiumSummary_PremInfo_TotalWaivedPremium().getText().trim();

				se.verify().verifyAsPassOrError("Total WaivedPremium Validation", strPremiumSummary_PremInfo_TotalWaivedPremium_Actual,
						strPremiumSummary_PremInfo_TotalWaivedPremium.trim(), true, test);
			}

			
			List<String> PremiumNames = new ArrayList<>();
			PremiumNames.add("TotalTransactionPremium");
			PremiumNames.add("Total_Surcharge");
			PremiumNames.add("Total_Premium");
			PremiumNames.add("Waived_Premium");

			List<String> Expected = new ArrayList<>();
			Expected.add(0, strPremiumSummary_PremInfo_TotalTransactionPremium.trim());
			Expected.add(1, strPremiumSummary_PremInfo_TotalSurchargeTaxesFees.trim());
			Expected.add(2, strPremiumSummary_PremInfo_TotalPremium.trim());
			if (!strPremiumSummary_PremInfo_TotalWaivedPremium.equalsIgnoreCase(constants.NA)) {
				Expected.add(3, strPremiumSummary_PremInfo_TotalWaivedPremium.trim());

			} else {
				Expected.add(3, constants.NA);
			}

			List<String> Actuals = new ArrayList<>();
			Actuals.add(0, strPremiumSummary_PremInfo_TotalTransactionPremium_Actual);
			Actuals.add(1, strPremiumSummary_PremInfo_TotalSurchargeTaxesFees_Actual);
			Actuals.add(2, strPremiumSummary_PremInfo_TotalPremium_Actual);
			List<String> Status = new ArrayList<>();

			if (strPremiumSummary_PremInfo_TotalTransactionPremium.trim()
					.equals(strPremiumSummary_PremInfo_TotalTransactionPremium_Actual)) {
				Status.add(0, constants.Pass);
			} else {
				Status.add(0, constants.Fail);
			}

			if (strPremiumSummary_PremInfo_TotalSurchargeTaxesFees.trim()
					.equals(strPremiumSummary_PremInfo_TotalSurchargeTaxesFees_Actual)) {
				Status.add(1, constants.Pass);
			} else {
				Status.add(1, constants.Fail);
			}
			if (strPremiumSummary_PremInfo_TotalPremium.trim()
					.equals(strPremiumSummary_PremInfo_TotalPremium_Actual)) {
				Status.add(2, constants.Pass);
			} else {
				Status.add(2, constants.Fail);
			}
			if (!strPremiumSummary_PremInfo_TotalWaivedPremium.equalsIgnoreCase(constants.NA)) {

				Actuals.add(3, strPremiumSummary_PremInfo_TotalWaivedPremium_Actual);
				if (strPremiumSummary_PremInfo_TotalWaivedPremium.trim()
						.equals(strPremiumSummary_PremInfo_TotalWaivedPremium_Actual)) {
					Status.add(3, constants.Pass);
				} else {
					Status.add(3, constants.Fail);
				}
			} else {
				Actuals.add(3, constants.NA);
				Status.add(3, constants.NA);

			}
			updatePremiumsInXL(PremiumNames, Expected, Actuals, Status, transaction, strRegressionID, startRowNumber,
					 file,  workbook,  test);
		} catch (Exception e) {

			se.verify().verifyEquals("Failed to verify premium info on Premium Summary screen of CA scenario", true, false, true, test);
			se.log().logTestStep("Exception in Premium Info CA scenario\n  - " + e);

		}

	}
	public void WC_GetPremiumInfo(Map<String, String> row, String transaction, String strRegressionID, int startRowNumber,
			File file, XSSFWorkbook workbook, ExtentTest test) throws IOException {

		try {
			String strWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium = (String) row.get("WCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium");
			String strWCPremiumSummary_GeneralInfo_TotalSurcharges = (String) row.get("WCPremiumSummary_GeneralInfo_TotalSurcharges");
			String strPremiumSummary_GeneralInfo_QuoteNo_CompanyCode = (String)row.get("PremiumSummary_GeneralInfo_QuoteNo_CompanyCode");
			String strWCPremiumSummary_GeneralInfo_TotalEstimatedPremium = (String) row.get("WCPremiumSummary_GeneralInfo_TotalEstimatedPremium");
			String strWCPremiumSummary_GeneralInfo_LiabilityLimits = (String) row.get("WCPremiumSummary_GeneralInfo_LiabilityLimits");
			String strWCPremiumSummary_GeneralInfo_PolicyMinimumPremiumState = (String) row.get("WCPremiumSummary_GeneralInfo_PolicyMinimumPremiumState");
			String strWCPremiumSummary_GeneralInfo_PolicyMinimumPremium = (String) row.get("WCPremiumSummary_GeneralInfo_PolicyMinimumPremium");
			String strWCPremiumSummary_GeneralInfo_ExpenseConstantState = (String) row.get("WCPremiumSummary_GeneralInfo_ExpenseConstantState");
			String strWCPremiumSummary_GeneralInfo_ExpenseConstantPremium = (String) row.get("WCPremiumSummary_GeneralInfo_ExpenseConstantPremium");
			String strWCPremiumSummary_GeneralInfo_ProRateFactor = (String) row.get("WCPremiumSummary_GeneralInfo_ProRateFactor");
			driver.switchTo().defaultContent();
			driver.switchTo().frame(getPremiumSummary_IFrame());
			
			checkAndRewriteCompanyCode(strPremiumSummary_GeneralInfo_QuoteNo_CompanyCode, test);
			
			String strWCPremiumSummary_GeneralInfo_LiabilityLimits_Actual = getWCPremiumSummary_GeneralInfo_LiabilityLimits().getText().trim();
			String strWCPremiumSummary_GeneralInfo_PolicyMinimumPremiumState_Actual = getWCPremiumSummary_GeneralInfo_PolicyMinimumPremiumState().getText().trim();
			String strWCPremiumSummary_GeneralInfo_PolicyMinimumPremium_Actual = getWCPremiumSummary_GeneralInfo_PolicyMinimumPremium().getText().trim();
			String strWCPremiumSummary_GeneralInfo_ExpenseConstantState_Actual = getWCPremiumSummary_GeneralInfo_ExpenseConstantState().getText().trim();
			String strWCPremiumSummary_GeneralInfo_ExpenseConstantPremium_Actual = getWCPremiumSummary_GeneralInfo_ExpenseConstantPremium().getText().trim();
			String strWCPremiumSummary_GeneralInfo_ProRateFactor_Actual = getWCPremiumSummary_GeneralInfo_ProRateFactor().getText().trim();
			se.verify().verifyAsPassOrError("LiabilityLimits Validation", strWCPremiumSummary_GeneralInfo_LiabilityLimits_Actual,strWCPremiumSummary_GeneralInfo_LiabilityLimits.trim(), true, test);
			
			se.verify().verifyAsPassOrError("PolicyMinimumPremiumState Validation", strWCPremiumSummary_GeneralInfo_PolicyMinimumPremiumState_Actual,
					strWCPremiumSummary_GeneralInfo_PolicyMinimumPremiumState.trim(), true, test);
			se.verify().verifyAsPassOrError("PolicyMinimumPremium Validation", strWCPremiumSummary_GeneralInfo_PolicyMinimumPremium_Actual,
					strWCPremiumSummary_GeneralInfo_PolicyMinimumPremium.trim(), true, test);
		
			se.verify().verifyAsPassOrError("ExpenseConstantState Validation", strWCPremiumSummary_GeneralInfo_ExpenseConstantState_Actual,
					strWCPremiumSummary_GeneralInfo_ExpenseConstantState.trim(), true, test);{}
			se.verify().verifyAsPassOrError("ExpenseConstantPremium Validation", strWCPremiumSummary_GeneralInfo_ExpenseConstantPremium_Actual,
					strWCPremiumSummary_GeneralInfo_ExpenseConstantPremium.trim(), true, test);
			se.verify().verifyAsPassOrError("ProRateFactor Validation", strWCPremiumSummary_GeneralInfo_ProRateFactor_Actual,
					strWCPremiumSummary_GeneralInfo_ProRateFactor.trim(), true, test);
			
			 
			String strWCPremiumSummary_GeneralInfo_TotalSurcharges_Actual = getWCPremiumSummary_GeneralInfo_TotalSurcharges().getText().trim();
			
			
			String strWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium_Actual;
			if(transaction.contains(constants.Audit)||transaction.equalsIgnoreCase(constants.ReviseAudit)){
				strWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium_Actual = getWCPremiumSummary_GeneralInfo_TotalAuditedTransactionPremium()
						.getText().trim();
			}else{
				strWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium_Actual = getWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium().getText().trim();
				}
		
			String strWCPremiumSummary_GeneralInfo_TotalEstimatedPremium_Actual;
			if(transaction.contains(constants.Audit)||transaction.equalsIgnoreCase(constants.ReviseAudit)){
				strWCPremiumSummary_GeneralInfo_TotalEstimatedPremium_Actual = getWCPremiumSummary_GeneralInfo_TotalAuditedPremium().getText().trim();
			}else{
				strWCPremiumSummary_GeneralInfo_TotalEstimatedPremium_Actual = getWCPremiumSummary_GeneralInfo_TotalEstimatedPremium().getText().trim();
				}
			
			
			se.verify().verifyAsPassOrError("Total TransactionPremium Validation",
					strWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium_Actual,
					strWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium.trim(), true, test);
			
			se.verify().verifyAsPassOrError("TransactionSurchargeTaxesFees Validation",
					strWCPremiumSummary_GeneralInfo_TotalSurcharges_Actual,
					strWCPremiumSummary_GeneralInfo_TotalSurcharges.trim(), true, test);
			
			se.verify().verifyAsPassOrError("TotalPremium Validation",
					strWCPremiumSummary_GeneralInfo_TotalEstimatedPremium_Actual,
					strWCPremiumSummary_GeneralInfo_TotalEstimatedPremium.trim(), true, test);
			
			
			
			List<String> PremiumNames = new ArrayList<>();
			PremiumNames.add("TotalTransactionPremium");
			PremiumNames.add("Total_Surcharge");
			PremiumNames.add("Total_Premium");
			PremiumNames.add("Waived_Premium");

			List<String> Expected = new ArrayList<>();
			Expected.add(0, strWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium.trim());
			Expected.add(1, strWCPremiumSummary_GeneralInfo_TotalSurcharges.trim());
			Expected.add(2, strWCPremiumSummary_GeneralInfo_TotalEstimatedPremium.trim());
			
			Expected.add(3, constants.NA);
			

			List<String> Actuals = new ArrayList<>();
			Actuals.add(0, strWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium_Actual);
			Actuals.add(1, strWCPremiumSummary_GeneralInfo_TotalSurcharges_Actual);
			Actuals.add(2, strWCPremiumSummary_GeneralInfo_TotalEstimatedPremium_Actual);
			List<String> Status = new ArrayList<>();

			if (strWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium.trim()
					.equals(strWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium_Actual)) {
				Status.add(0, constants.Pass);
			} else {
				Status.add(0, constants.Fail);
			}

			if (strWCPremiumSummary_GeneralInfo_TotalSurcharges.trim()
					.equals(strWCPremiumSummary_GeneralInfo_TotalSurcharges_Actual)) {
				Status.add(1, constants.Pass);
			} else {
				Status.add(1, constants.Fail);
			}
			if (strWCPremiumSummary_GeneralInfo_TotalEstimatedPremium.trim()
					.equals(strWCPremiumSummary_GeneralInfo_TotalEstimatedPremium_Actual)) {
				Status.add(2, constants.Pass);
			} else {
				Status.add(2, constants.Fail);
			}
			if(true) { //WC does not have waived premium hence updating as NA
				Actuals.add(3, constants.NA);
				Status.add(3, constants.NA);

			}
			updatePremiumsInXL(PremiumNames, Expected, Actuals, Status, transaction, strRegressionID, startRowNumber,
					 file,  workbook,  test);
		} catch (Exception e) {

			se.verify().verifyEquals("Failed to verify premium info on Premium Summary screen of WC scenario", true, false, true, test);
			se.log().logTestStep("Exception in Premium Info WC scenario\n  - " + e);

		}

	}
	public void updatePremiumsInXL(List<String> PremiumNames,List<String> Expected,List<String> Actuals,List<String> Status,String transaction,String strRegressionID,int startRowNumber,
			File file, XSSFWorkbook workbook, ExtentTest test) throws IOException {

		try {

			XlsData xl = new XlsData();
			LinkedHashMap<String, String> hmap = new LinkedHashMap<String, String>();
			//Old Methods
			/*String strquoteNumber = Util.getQuoteNumber().get(strRegressionID);
			String strRegressionName = Util.getRegressionName().get(strRegressionID).trim();
			*/
			//New Methods
			String strquoteNumber = Util.getQuoteNumber(strRegressionID,transaction);
			String strRegressionName = Util.getRegressionName(strRegressionID);
			String[] getLOB = strRegressionID.split("_");
			String LOB = getLOB[0];

			XSSFSheet Sheet = null;
			/*
			 * FileInputStream fi =null; FileOutputStream fo = null;
			 */
			if (!xl.isSheetExist(workbook, strRegressionName)) {
				Sheet = xl.Createsheet(workbook, strRegressionName);
			} else {
				/*
				 * fi =new FileInputStream(file); fo = new
				 * FileOutputStream(file); workbook = new XSSFWorkbook(fi);
				 */
				Sheet = workbook.getSheet(strRegressionName);
			}

			for (int i = 0; i <= 3; i++) {

				/* Adding elements to HashMap */
				hmap.put("LOB", LOB);
				hmap.put("RegressionID", strRegressionID);
				hmap.put("RegressionName", strRegressionName);
				hmap.put("QuoteNumber", strquoteNumber);
				hmap.put("TransactionName", transaction);
				hmap.put("PremiumName", PremiumNames.get(i));
				hmap.put("Expected", Expected.get(i));
				hmap.put("Actual", Actuals.get(i));
				hmap.put("Status", Status.get(i));
				if (!file.exists()) {
					if (startRowNumber  == 0) {
						if(i==0){
							xl.SetCellData(hmap, startRowNumber+1 + i, Sheet, workbook);
						}else{
							xl.SetCellData(hmap,  i+1, Sheet, workbook);
						}
					}else{
						if(i==0){
							xl.SetCellData(hmap, startRowNumber+i, Sheet, workbook);
						}else{
							xl.SetCellData(hmap,  i+1, Sheet, workbook);
						}
					}
				} else {
					

					if (startRowNumber  == 0) {
						if(i==0){
							
							xl.SetCellDataInExistingWorkbook(hmap, startRowNumber+1 + i,startRowNumber, Sheet, strRegressionName, workbook, file,
									xl);
						}else{
							
							xl.SetCellDataInExistingWorkbook(hmap, i+1,startRowNumber, Sheet, strRegressionName, workbook, file,
									xl);
						}
					}else{
						if(i==0){
							
							xl.SetCellDataInExistingWorkbook(hmap, startRowNumber + i,startRowNumber, Sheet, strRegressionName, workbook, file,
									xl);
						}else{
							
							xl.SetCellDataInExistingWorkbook(hmap, i+1,startRowNumber, Sheet, strRegressionName, workbook, file,
									xl);
						}
					}
				
					
					}

			}
			if (!file.exists()) {
				if (startRowNumber  == 0) {
					xl.SetCellData(hmap, startRowNumber , Sheet, workbook);
				}
			} else {
				if (startRowNumber  == 0) {
					xl.SetCellDataInExistingWorkbook(hmap, startRowNumber,startRowNumber, Sheet, strRegressionName, workbook, file,
							xl);
				}
			}

			if (!file.exists()) {
				xl.createxlsFile(workbook, file);

			}
			driver.switchTo().defaultContent();
		} catch (Exception e) {

			se.verify().verifyEquals("Failed to verify premium info on Premium Summary screen of CA scenario", true, false, true, test);
			se.log().logTestStep("Exception in Premium Info CA scenario\n  - " + e);

		}

	}

	public void GetLOBLevelPremiumsInfo(Map<String, String> row, ExtentTest test) throws IOException {

		try {

			String strPremiumSummary_LOB_Prop_TRANSACTIONPREMIUM = (String) row
					.get("PremiumSummary_LOB_Prop_TRANSACTIONPREMIUM");
			String strPremiumSummary_LOB_Prop_TAXESSURCHARGESANDFEES = (String) row
					.get("PremiumSummary_LOB_Prop_TAXESSURCHARGESANDFEES");
			String strPremiumSummary_LOB_Prop_TOTALANNUALPREMIUM = (String) row
					.get("PremiumSummary_LOB_Prop_TOTALANNUALPREMIUM");
			String strPremiumSummary_LOB_Liab_TRANSACTIONPREMIUM = (String) row
					.get("PremiumSummary_LOB_Liab_TRANSACTIONPREMIUM");
			String strPremiumSummary_LOB_Liab_TAXESSURCHARGESANDFEES = (String) row
					.get("PremiumSummary_LOB_Liab_TAXESSURCHARGESANDFEES");
			String strPremiumSummary_LOB_Liab_TOTALANNUALPREMIUM = (String) row
					.get("PremiumSummary_LOB_Liab_TOTALANNUALPREMIUM");
			String strPremiumSummary_LOB_Crime_TRANSACTIONPREMIUM = (String) row
					.get("PremiumSummary_LOB_Crime_TRANSACTIONPREMIUM");
			String strPremiumSummary_LOB_Crime_TAXESSURCHARGESANDFEES = (String) row
					.get("PremiumSummary_LOB_Crime_TAXESSURCHARGESANDFEES");
			String strPremiumSummary_LOB_Crime_TOTALANNUALPREMIUM = (String) row
					.get("PremiumSummary_LOB_Crime_TOTALANNUALPREMIUM");
			String strPremiumSummary_LOB_InMarine_TRANSACTIONPREMIUM = (String) row
					.get("PremiumSummary_LOB_InMarine_TRANSACTIONPREMIUM");
			String strPremiumSummary_LOB_InMarine_TAXESSURCHARGESANDFEES = (String) row
					.get("PremiumSummary_LOB_InMarine_TAXESSURCHARGESANDFEES");
			String strPremiumSummary_LOB_InMarine_TOTALANNUALPREMIUM = (String) row
					.get("PremiumSummary_LOB_InMarine_TOTALANNUALPREMIUM");
			String strPremiumSummary_LOB_DAndO_TRANSACTIONPREMIUM = (String) row
					.get("PremiumSummary_LOB_DAndO_TRANSACTIONPREMIUM");
			String strPremiumSummary_LOB_DAndO_TAXESSURCHARGESANDFEES = (String) row
					.get("PremiumSummary_LOB_DAndO_TAXESSURCHARGESANDFEES");
			String strPremiumSummary_LOB_DAndO_TOTALANNUALPREMIUM = (String) row
					.get("PremiumSummary_LOB_DAndO_TOTALANNUALPREMIUM");
			String strPremiumSummary_LOB_EPLI_TRANSACTIONPREMIUM = (String) row
					.get("PremiumSummary_LOB_EPLI_TRANSACTIONPREMIUM");
			String strPremiumSummary_LOB_EPLI_TAXESSURCHARGESANDFEES = (String) row
					.get("PremiumSummary_LOB_EPLI_TAXESSURCHARGESANDFEES");
			String strPremiumSummary_LOB_EPLI_TOTALANNUALPREMIUM = (String) row
					.get("PremiumSummary_LOB_EPLI_TOTALANNUALPREMIUM");
			String strPremiumSummary_LOB_PLCM_TRANSACTIONPREMIUM = (String) row
					.get("PremiumSummary_LOB_PLCM_TRANSACTIONPREMIUM");
			String strPremiumSummary_LOB_PLCM_TAXESSURCHARGESANDFEES = (String) row
					.get("PremiumSummary_LOB_PLCM_TAXESSURCHARGESANDFEES");
			String strPremiumSummary_LOB_PLCM_TOTALANNUALPREMIUM = (String) row
					.get("PremiumSummary_LOB_PLCM_TOTALANNUALPREMIUM");
			String strPremiumSummary_LOB_Cyber_TRANSACTIONPREMIUM = (String) row
					.get("PremiumSummary_LOB_Cyber_TRANSACTIONPREMIUM");
			String strPremiumSummary_LOB_Cyber_TAXESSURCHARGESANDFEES = (String) row
					.get("PremiumSummary_LOB_Cyber_TAXESSURCHARGESANDFEES");
			String strPremiumSummary_LOB_Cyber_TOTALANNUALPREMIUM = (String) row
					.get("PremiumSummary_LOB_Cyber_TOTALANNUALPREMIUM");

			driver.switchTo().frame(getPremiumSummary_IFrame());

			if (!strPremiumSummary_LOB_Prop_TRANSACTIONPREMIUM.equalsIgnoreCase(constants.NA)) {
				String strPremiumSummary_LOB_Prop_TRANSACTIONPREMIUM_Actual = getPremiumSummary_LOB_Prop_TRANSACTIONPREMIUM()
						.getText().trim();
				se.verify().verifyAsPassOrError("LOB_Prop_TRANSACTIONPREMIUM Validation",
						strPremiumSummary_LOB_Prop_TRANSACTIONPREMIUM_Actual,
						strPremiumSummary_LOB_Prop_TRANSACTIONPREMIUM.trim(), true, test);
				String strPremiumSummary_LOB_Prop_TAXESSURCHARGESANDFEES_Actual = getPremiumSummary_LOB_Prop_TAXESSURCHARGESANDFEES()
						.getText().trim();
				se.verify().verifyAsPassOrError("LOB_Prop_TAXESSURCHARGESANDFEES Validation",
						strPremiumSummary_LOB_Prop_TAXESSURCHARGESANDFEES_Actual,
						strPremiumSummary_LOB_Prop_TAXESSURCHARGESANDFEES.trim(), true, test);
				String strPremiumSummary_LOB_Prop_TOTALANNUALPREMIUM_Actual = getPremiumSummary_LOB_Prop_TOTALANNUALPREMIUM()
						.getText().trim();
				se.verify().verifyAsPassOrError("LOB_Prop_TOTALANNUALPREMIUM Validation",
						strPremiumSummary_LOB_Prop_TOTALANNUALPREMIUM_Actual,
						strPremiumSummary_LOB_Prop_TOTALANNUALPREMIUM.trim(), true, test);
			}

			if (!strPremiumSummary_LOB_Liab_TRANSACTIONPREMIUM.equalsIgnoreCase(constants.NA)) {
				String strPremiumSummary_LOB_Liab_TRANSACTIONPREMIUM_Actual = getPremiumSummary_LOB_Liab_TRANSACTIONPREMIUM()
						.getText().trim();
				String strPremiumSummary_LOB_Liab_TAXESSURCHARGESANDFEES_Actual = getPremiumSummary_LOB_Liab_TAXESSURCHARGESANDFEES()
						.getText().trim();
				String strPremiumSummary_LOB_Liab_TOTALANNUALPREMIUM_Actual = getPremiumSummary_LOB_Liab_TOTALANNUALPREMIUM()
						.getText().trim();
				se.verify().verifyAsPassOrError("LOB_Liab_TRANSACTIONPREMIUM Validation",
						strPremiumSummary_LOB_Liab_TRANSACTIONPREMIUM_Actual,
						strPremiumSummary_LOB_Liab_TRANSACTIONPREMIUM.trim(), true, test);
				se.verify().verifyAsPassOrError("LOB_Liab_TAXESSURCHARGESANDFEES Validation",
						strPremiumSummary_LOB_Liab_TAXESSURCHARGESANDFEES_Actual,
						strPremiumSummary_LOB_Liab_TAXESSURCHARGESANDFEES.trim(), true, test);
				se.verify().verifyAsPassOrError("LOB_Liab_TOTALANNUALPREMIUM Validation",
						strPremiumSummary_LOB_Liab_TOTALANNUALPREMIUM_Actual,
						strPremiumSummary_LOB_Liab_TOTALANNUALPREMIUM.trim(), true, test);

			}
			if (!strPremiumSummary_LOB_Crime_TRANSACTIONPREMIUM.equalsIgnoreCase(constants.NA)) {
				String strPremiumSummary_LOB_Crime_TRANSACTIONPREMIUM_Actual = getPremiumSummary_LOB_Crime_TRANSACTIONPREMIUM()
						.getText().trim();
				String strPremiumSummary_LOB_Crime_TAXESSURCHARGESANDFEES_Actual = getPremiumSummary_LOB_Crime_TAXESSURCHARGESANDFEES()
						.getText().trim();
				String strPremiumSummary_LOB_Crime_TOTALANNUALPREMIUM_Actual = getPremiumSummary_LOB_Crime_TOTALANNUALPREMIUM()
						.getText().trim();
				se.verify().verifyAsPassOrError("LOB_Crime_TRANSACTIONPREMIUM Validation",
						strPremiumSummary_LOB_Crime_TRANSACTIONPREMIUM_Actual,
						strPremiumSummary_LOB_Crime_TRANSACTIONPREMIUM.trim(), true, test);
				se.verify().verifyAsPassOrError("LOB_Crime_TAXESSURCHARGESANDFEES Validation",
						strPremiumSummary_LOB_Crime_TAXESSURCHARGESANDFEES_Actual,
						strPremiumSummary_LOB_Crime_TAXESSURCHARGESANDFEES.trim(), true, test);
				se.verify().verifyAsPassOrError("LOB_Crime_TOTALANNUALPREMIUM Validation",
						strPremiumSummary_LOB_Crime_TOTALANNUALPREMIUM_Actual,
						strPremiumSummary_LOB_Crime_TOTALANNUALPREMIUM.trim(), true, test);

			}
			if (!strPremiumSummary_LOB_InMarine_TRANSACTIONPREMIUM.equalsIgnoreCase(constants.NA)) {
				String strPremiumSummary_LOB_InMarine_TRANSACTIONPREMIUM_Actual = getPremiumSummary_LOB_InMarine_TRANSACTIONPREMIUM()
						.getText().trim();
				String strPremiumSummary_LOB_InMarine_TAXESSURCHARGESANDFEES_Actual = getPremiumSummary_LOB_InMarine_TAXESSURCHARGESANDFEES()
						.getText().trim();
				String strPremiumSummary_LOB_InMarine_TOTALANNUALPREMIUM_Actual = getPremiumSummary_LOB_InMarine_TOTALANNUALPREMIUM()
						.getText().trim();
				se.verify().verifyAsPassOrError("LOB_InMarine_TRANSACTIONPREMIUM Validation",
						strPremiumSummary_LOB_InMarine_TRANSACTIONPREMIUM_Actual,
						strPremiumSummary_LOB_InMarine_TRANSACTIONPREMIUM.trim(), true, test);
				se.verify().verifyAsPassOrError("LOB_InMarine_TAXESSURCHARGESANDFEES Validation",
						strPremiumSummary_LOB_InMarine_TAXESSURCHARGESANDFEES_Actual,
						strPremiumSummary_LOB_InMarine_TAXESSURCHARGESANDFEES.trim(), true, test);
				se.verify().verifyAsPassOrError("LOB_InMarine_TOTALANNUALPREMIUM Validation",
						strPremiumSummary_LOB_InMarine_TOTALANNUALPREMIUM_Actual,
						strPremiumSummary_LOB_InMarine_TOTALANNUALPREMIUM.trim(), true, test);

			}
			if (!strPremiumSummary_LOB_DAndO_TRANSACTIONPREMIUM.equalsIgnoreCase(constants.NA)) {
				String strPremiumSummary_LOB_DAndO_TRANSACTIONPREMIUM_Actual = getPremiumSummary_LOB_DAndO_TRANSACTIONPREMIUM()
						.getText().trim();
				String strPremiumSummary_LOB_DAndO_TAXESSURCHARGESANDFEES_Actual = getPremiumSummary_LOB_DAndO_TAXESSURCHARGESANDFEES()
						.getText().trim();
				String strPremiumSummary_LOB_DAndO_TOTALANNUALPREMIUM_Actual = getPremiumSummary_LOB_DAndO_TOTALANNUALPREMIUM()
						.getText().trim();
				se.verify().verifyAsPassOrError("LOB_DAndO_TRANSACTIONPREMIUM Validation",
						strPremiumSummary_LOB_DAndO_TRANSACTIONPREMIUM_Actual,
						strPremiumSummary_LOB_DAndO_TRANSACTIONPREMIUM.trim(), true, test);
				se.verify().verifyAsPassOrError("LOB_DAndO_TAXESSURCHARGESANDFEES Validation",
						strPremiumSummary_LOB_DAndO_TAXESSURCHARGESANDFEES_Actual,
						strPremiumSummary_LOB_DAndO_TAXESSURCHARGESANDFEES.trim(), true, test);
				se.verify().verifyAsPassOrError("LOB_DAndO_TOTALANNUALPREMIUM Validation",
						strPremiumSummary_LOB_DAndO_TOTALANNUALPREMIUM_Actual,
						strPremiumSummary_LOB_DAndO_TOTALANNUALPREMIUM.trim(), true, test);

			}
			if (!strPremiumSummary_LOB_EPLI_TRANSACTIONPREMIUM.equalsIgnoreCase(constants.NA)) {
				String strPremiumSummary_LOB_EPLI_TRANSACTIONPREMIUM_Actual = getPremiumSummary_LOB_EPLI_TRANSACTIONPREMIUM()
						.getText().trim();
				String strPremiumSummary_LOB_EPLI_TAXESSURCHARGESANDFEES_Actual = getPremiumSummary_LOB_EPLI_TAXESSURCHARGESANDFEES()
						.getText().trim();
				String strPremiumSummary_LOB_EPLI_TOTALANNUALPREMIUM_Actual = getPremiumSummary_LOB_EPLI_TOTALANNUALPREMIUM()
						.getText().trim();
				se.verify().verifyAsPassOrError("LOB_EPLI_TTRANSACTIONPREMIUM Validation",
						strPremiumSummary_LOB_EPLI_TRANSACTIONPREMIUM_Actual,
						strPremiumSummary_LOB_EPLI_TRANSACTIONPREMIUM.trim(), true, test);
				se.verify().verifyAsPassOrError("LOB_EPLI_TTAXESSURCHARGESANDFEES Validation",
						strPremiumSummary_LOB_EPLI_TAXESSURCHARGESANDFEES_Actual,
						strPremiumSummary_LOB_EPLI_TAXESSURCHARGESANDFEES.trim(), true, test);
				se.verify().verifyAsPassOrError("LOB_EPLI_TTOTALANNUALPREMIUM Validation",
						strPremiumSummary_LOB_EPLI_TOTALANNUALPREMIUM_Actual,
						strPremiumSummary_LOB_EPLI_TOTALANNUALPREMIUM.trim(), true, test);

			}

			if (!strPremiumSummary_LOB_PLCM_TRANSACTIONPREMIUM.equalsIgnoreCase(constants.NA)) {
				String strPremiumSummary_LOB_PLCM_TRANSACTIONPREMIUM_Actual = getPremiumSummary_LOB_PLCM_TRANSACTIONPREMIUM()
						.getText().trim();
				String strPremiumSummary_LOB_PLCM_TAXESSURCHARGESANDFEES_Actual = getPremiumSummary_LOB_PLCM_TAXESSURCHARGESANDFEES()
						.getText().trim();
				String strPremiumSummary_LOB_PLCM_TOTALANNUALPREMIUM_Actual = getPremiumSummary_LOB_PLCM_TOTALANNUALPREMIUM()
						.getText().trim();

				se.verify().verifyAsPassOrError("LOB_PLCM_TRANSACTIONPREMIUM Validation",
						strPremiumSummary_LOB_PLCM_TRANSACTIONPREMIUM_Actual,
						strPremiumSummary_LOB_PLCM_TRANSACTIONPREMIUM.trim(), true, test);
				se.verify().verifyAsPassOrError("LOB_PLCM_TAXESSURCHARGESANDFEES Validation",
						strPremiumSummary_LOB_PLCM_TAXESSURCHARGESANDFEES_Actual,
						strPremiumSummary_LOB_PLCM_TAXESSURCHARGESANDFEES.trim(), true, test);
				se.verify().verifyAsPassOrError("LOB_PLCM_TOTALANNUALPREMIUM Validation",
						strPremiumSummary_LOB_PLCM_TOTALANNUALPREMIUM_Actual,
						strPremiumSummary_LOB_PLCM_TOTALANNUALPREMIUM.trim(), true, test);
				
			}
				if (!strPremiumSummary_LOB_Cyber_TRANSACTIONPREMIUM.equalsIgnoreCase(constants.NA)) {
					String strPremiumSummary_LOB_Cyber_TRANSACTIONPREMIUM_Actual = getPremiumSummary_LOB_Cyber_TRANSACTIONPREMIUM()
							.getText().trim();
					String strPremiumSummary_LOB_Cyber_TAXESSURCHARGESANDFEES_Actual = getPremiumSummary_LOB_Cyber_TAXESSURCHARGESANDFEES()
							.getText().trim();
					String strPremiumSummary_LOB_Cyber_TOTALANNUALPREMIUM_Actual = getPremiumSummary_LOB_Cyber_TOTALANNUALPREMIUM()
							.getText().trim();

					se.verify().verifyAsPassOrError("LOB_Cyber_TRANSACTIONPREMIUM Validation",
							strPremiumSummary_LOB_Cyber_TRANSACTIONPREMIUM_Actual,
							strPremiumSummary_LOB_Cyber_TRANSACTIONPREMIUM.trim(), true, test);
					se.verify().verifyAsPassOrError("LOB_Cyber_TAXESSURCHARGESANDFEES Validation",
							strPremiumSummary_LOB_Cyber_TAXESSURCHARGESANDFEES_Actual,
							strPremiumSummary_LOB_Cyber_TAXESSURCHARGESANDFEES.trim(), true, test);
					se.verify().verifyAsPassOrError("LOB_Cyber_TOTALANNUALPREMIUM Validation",
							strPremiumSummary_LOB_Cyber_TOTALANNUALPREMIUM_Actual,
							strPremiumSummary_LOB_Cyber_TOTALANNUALPREMIUM.trim(), true, test);

			}

			driver.switchTo().defaultContent();
		} catch (Exception e) {

			se.verify().verifyEquals("Failed to verify details for PremiumSummary Screen ", true, false, true, test);
			se.log().logTestStep("Exception in Premium summary\n  - " + e);

		}

	}
}
