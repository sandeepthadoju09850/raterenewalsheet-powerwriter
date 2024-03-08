package ap.regression.WC;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Libraries.ap.automation.common.BaseTest;
import Libraries.ap.automation.common.CommonAPMethods;
import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.SeHelper;
import Libraries.ap.automation.common.Utils.TestPageFactory;
import Libraries.ap.automation.common.framework.Browser.Browsers;
import ap.Constants.constants;
import ap.OR.OR_CP;
import ap.pages.CA.CA_Drivers;
import ap.pages.CA.CA_Underwriter;
import ap.pages.CP.CP_CoverageParts;
import ap.pages.CP.CP_ExtendedNamedInsured;
import ap.pages.CP.CP_GenInfo;
import ap.pages.CP.CP_LiabilityAdditonalInterests;
import ap.pages.CP.CP_Locations;
import ap.pages.CP.CP_LossHistoryExpRating;
import ap.pages.CP.CP_PremiumIndication;
import ap.pages.WC.WC_PolicyInformation;
import ap.pages.WC.WC_PremiumModification;
import ap.pages.WC.WC_RatingClassifications;
import ap.pages.WC.WC_StateRatingFactors;
import ap.pages.common.AP_Login;

public class WC10_IN_WCRegression extends BaseTest {

	ExtentReports extent;
	ExtentTest test;

	@SuppressWarnings("unused")
	public static void WC10_IN_WCRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		{
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();

			CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
			OR_CP ORCP = TestPageFactory.initElements(se, OR_CP.class);
			AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);

			CP_GenInfo CP_GenInfo = TestPageFactory.initElements(se, CP_GenInfo.class);

			CP_ExtendedNamedInsured CP_ExtendedNamedInsured = TestPageFactory.initElements(se, CP_ExtendedNamedInsured.class);
			CP_CoverageParts CP_CoverageParts = TestPageFactory.initElements(se, CP_CoverageParts.class);
			CP_Locations CP_Locations = TestPageFactory.initElements(se, CP_Locations.class);


			WC_PolicyInformation WC_PolicyInformation=TestPageFactory.initElements(se, WC_PolicyInformation.class);
			WC_StateRatingFactors WC_StateRatingFactors=TestPageFactory.initElements(se, WC_StateRatingFactors.class);
			WC_RatingClassifications WC_RatingClassifications=TestPageFactory.initElements(se, WC_RatingClassifications.class);
			WC_PremiumModification WC_PremiumModification=TestPageFactory.initElements(se, WC_PremiumModification.class);
			CP_LiabilityAdditonalInterests CP_LiabilityAdditonalInterests=TestPageFactory.initElements(se, CP_LiabilityAdditonalInterests.class);
			CP_PremiumIndication CP_PremiumIndication=TestPageFactory.initElements(se, CP_PremiumIndication.class);
			CP_LossHistoryExpRating CP_LossHistoryExpRating=TestPageFactory.initElements(se, CP_LossHistoryExpRating.class);
			CA_Underwriter CA_Underwriter=TestPageFactory.initElements(se, CA_Underwriter.class);
			CA_Drivers CA_Drivers=TestPageFactory.initElements(se, CA_Drivers.class);


			try {
				String transaction = "NewQuote";
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
//						CP_GenInfo.CP_GenInfo_Details(strRegressionID, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
//						CP_Locations.CP_Locations_Details(strRegressionID, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
//						WC_PolicyInformation.WC_PolicyInformation_Details(strRegressionID, transaction, suspendSheet, test);
//						WC_StateRatingFactors.WC_StateRatingFactors_Details(strRegressionID, transaction, suspendSheet, test);
//						WC_RatingClassifications.WC_RatingClassifications_Details(strRegressionID, transaction, suspendSheet, test);
//						CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionID, transaction, suspendSheet, test);
//						WC_PremiumModification.WC_PremiumModification_Details(strRegressionID, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
					}
					
					if (transactionsList.contains("RedoNewQuote")) {
						transaction = "RedoNewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);


//						BT.NavigateToTabs("Locations",test);
//						CP_Locations.CP_Locations_Details(strRegressionID, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
//						WC_PolicyInformation.WC_PolicyInformation_Details(strRegressionID, transaction, suspendSheet, test);
//						WC_StateRatingFactors.WC_StateRatingFactors_Details(strRegressionID, transaction, suspendSheet, test);
//						WC_RatingClassifications.WC_RatingClassifications_Details(strRegressionID, transaction, suspendSheet, test);
//						CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionID, transaction, suspendSheet, test);
						WC_PremiumModification.WC_PremiumModification_Details(strRegressionID, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
					}
					iteration++;

				}
			}
			catch (Exception e) {
				e.printStackTrace();
				se.verify().verifyEquals("WC10_IN_WCRegression test  failed", true, false, true, test);
				testTearDown(se,test);
			}

		}
	}
}
