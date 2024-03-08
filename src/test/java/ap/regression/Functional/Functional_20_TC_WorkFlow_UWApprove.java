package ap.regression.Functional;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.BaseTest;
import Libraries.ap.automation.common.CommonAPMethods;
import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.SeHelper;
import Libraries.ap.automation.common.Utils.TestPageFactory;
import Libraries.ap.automation.common.framework.Util;
import Libraries.ap.automation.common.framework.Browser.Browsers;
import ap.Constants.constants;
import ap.OR.OR_CP;
import ap.pages.CP.CP_AccountClearance;
import ap.pages.CP.CP_AdditionalCoverageParts;
import ap.pages.CP.CP_BillingInformation;
import ap.pages.CP.CP_BuildingandOccupantSelection;
import ap.pages.CP.CP_BulidingDetails;
import ap.pages.CP.CP_CarrierInformation;
import ap.pages.CP.CP_ContractorsEquipmentScheduled;
import ap.pages.CP.CP_CoverageParts;
import ap.pages.CP.CP_CrimeCoverageSelection;
import ap.pages.CP.CP_ExtendedNamedInsured;
import ap.pages.CP.CP_GenInfo;
import ap.pages.CP.CP_InlandMarineCovSelection;
import ap.pages.CP.CP_LiabilityAdditonalInterests;
import ap.pages.CP.CP_Liablityclasses;
import ap.pages.CP.CP_Liablitycoverages;
import ap.pages.CP.CP_Locations;
import ap.pages.CP.CP_LossHistoryExpRating;
import ap.pages.CP.CP_OptionalPropertyCoverages;
import ap.pages.CP.CP_PremiumIndication;
import ap.pages.CP.CP_PremiumModification;
import ap.pages.CP.CP_PropertyAdditionalInterests;
import ap.pages.CP.CP_PropertyCoverages;
import ap.pages.CP.CP_Summary;
import ap.pages.CP.CP_UnderWriter;
import ap.pages.common.APPW_CommonMethods;
import ap.pages.common.AP_Login;

public class Functional_20_TC_WorkFlow_UWApprove extends BaseTest{
	ExtentReports extent;
	ExtentTest test;
	static String quote;
	static String PolicyNumber = "";


	@SuppressWarnings("unused")
	public static void TC_WorkFlow_UWApprove(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,String strRegressionName, File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		{
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();

			CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
			OR_CP ORCP = TestPageFactory.initElements(se, OR_CP.class);
			AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
			CP_GenInfo CP_GenInfo = TestPageFactory.initElements(se, CP_GenInfo.class);
			CP_CoverageParts CP_CoverageParts = TestPageFactory.initElements(se, CP_CoverageParts.class);
			CP_Locations CP_Locations = TestPageFactory.initElements(se, CP_Locations.class);
			CP_BuildingandOccupantSelection CP_BandOS = TestPageFactory.initElements(se, CP_BuildingandOccupantSelection.class);
			CP_BulidingDetails CP_BulidingDetails = TestPageFactory.initElements(se, CP_BulidingDetails.class);
			CP_PropertyCoverages CP_PropertyCoverages = TestPageFactory.initElements(se, CP_PropertyCoverages.class);
			CP_OptionalPropertyCoverages CP_OptionalPropertyCoverages = TestPageFactory.initElements(se, CP_OptionalPropertyCoverages.class);
			CP_Liablitycoverages CP_Liablitycoverages=TestPageFactory.initElements(se, CP_Liablitycoverages.class);
			CP_Liablityclasses CP_Liablityclasses=TestPageFactory.initElements(se, CP_Liablityclasses.class);
			CP_LiabilityAdditonalInterests CP_LiabilityAdditonalInterests = TestPageFactory.initElements(se, CP_LiabilityAdditonalInterests.class);
			CP_AdditionalCoverageParts CP_AdditionalCoverageParts = TestPageFactory.initElements(se, CP_AdditionalCoverageParts.class);
			CP_CrimeCoverageSelection CP_CrimeCoverageSelection =TestPageFactory.initElements(se, CP_CrimeCoverageSelection.class);
			CP_InlandMarineCovSelection CP_InlandMarineCovSelection = TestPageFactory.initElements(se, CP_InlandMarineCovSelection.class);
			CP_PremiumIndication CP_PremiumIndication = TestPageFactory.initElements(se, CP_PremiumIndication.class);
			CP_LossHistoryExpRating CP_LossHistoryExpRating=TestPageFactory.initElements(se, CP_LossHistoryExpRating.class);
			CP_PremiumModification CP_PremiumModification=TestPageFactory.initElements(se, CP_PremiumModification.class);
			CP_UnderWriter CP_UnderWritter=TestPageFactory.initElements(se, CP_UnderWriter.class);
			CP_PropertyAdditionalInterests CP_PropertyAdditionalInterests=TestPageFactory.initElements(se, CP_PropertyAdditionalInterests.class);
			CP_CarrierInformation CP_CarrierInformation=TestPageFactory.initElements(se, CP_CarrierInformation.class);
			CP_BillingInformation CP_BillingInformation=TestPageFactory.initElements(se, CP_BillingInformation.class);
			CP_Summary CP_Summary=TestPageFactory.initElements(se, CP_Summary.class);
			CP_AccountClearance CP_AccountClearance = TestPageFactory.initElements(se, CP_AccountClearance.class);
			CP_ContractorsEquipmentScheduled CP_ContractorsEquipmentScheduled = TestPageFactory.initElements(se, CP_ContractorsEquipmentScheduled.class);
			APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class);

			String transaction = "NewQuote";
			try {

				List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
				List<Map<String, String>> table = ExcelOperations.getPagesData(constants.loginPageName, strRegressionID,transaction);

				int iteration = 0;
				while (iteration < table.size()) {
					System.out.println(table.size());
					LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
					String strAgentLink = (String) row.get("AgentLink");
					String strLOB = (String) row.get("LOB_Select");
					String strRole_SelectRoleAs = (String) row.get("Select_RoleAs");
					String strRelease_SelectRelease = (String) row.get("Select_Release");

					if (transactionsList.contains("NewQuote")) {
						transaction = "NewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						
						LoginPage.APAppLogin(strRegressionID,   transaction,"Yes", test);
						CP_GenInfo.CP_GenInfo_Details(strRegressionID, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
						CP_AccountClearance.CP_AccountClearance_Details(strRegressionID, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
						CP_CoverageParts.CP_CoverageParts_Details(strRegressionID, transaction, suspendSheet, test);
						CP_Locations.CP_Locations_Details(strRegressionID, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
						quote=APPW_CommonMethods.getQuoteNumber(strRegressionID,test);
						CP_BandOS.CP_BuildandOccupantSelection_Details(strRegressionID, transaction, suspendSheet, test);
						CP_BulidingDetails.CP_Buliding_Details(strRegressionID, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
						CP_PropertyCoverages.CP_PropertyCoverages_Details(strRegressionID, transaction, suspendSheet, test);
						CP_OptionalPropertyCoverages.CP_OptionalPropertyCoverages_Details(strRegressionID, transaction, suspendSheet, test);
						CP_Liablitycoverages.CP_Liablitycoverages_Details(strRegressionID, transaction, suspendSheet, test);
						CP_Liablityclasses.CP_Liablityclasses_Details(strRegressionID, transaction, suspendSheet, test);
						BT.ClickContinue(test);
						CP_InlandMarineCovSelection.CP_InlandMarineCovSelection_Details(strRegressionID, transaction, suspendSheet, test);
						CP_ContractorsEquipmentScheduled.CP_ContractorsEquipmentScheduled_Details(strRegressionID, transaction, suspendSheet, test);
						CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionID, transaction, suspendSheet, test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						CP_UnderWritter.CP_UnderWriter_Details(strRegressionID, transaction, suspendSheet, test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						CP_BillingInformation.CP_BillingInformation_Details(strRegressionID, transaction, suspendSheet, test);
						CP_Summary.CP_Summary_Details(strRegressionID,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,quote, test, file,  workbook);
						LoginPage.APLogoutDetails(  strAgentLink,test);

					}

					iteration++;

				}
			}
			catch (Exception e) {
				e.printStackTrace();
				se.verify().verifyEquals("Functional_20 test  failed", true, false, true, test);
				testTearDown(se,test);
			}






		}




	}








}
