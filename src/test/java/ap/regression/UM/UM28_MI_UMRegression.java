package ap.regression.UM;

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
import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.SeHelper;
import Libraries.ap.automation.common.Utils.TestPageFactory;
import Libraries.ap.automation.common.framework.Browser.Browsers;
import ap.Constants.constants;
import ap.pages.CP.CP_PremiumIndication;
import ap.pages.CP.CP_PremiumModification;
import ap.pages.CP.CP_Summary;
import ap.pages.UM.UM_GenInfo;
import ap.pages.UM.UM_ScheduleName;
import ap.pages.UM.UM_Umbrellalimits;
import ap.pages.UM.UM_UnderLying;
import ap.pages.UM.UM_Underwriter;
import ap.pages.common.AP_Login;

public class UM28_MI_UMRegression extends BaseTest{
	ExtentReports extent;
	ExtentTest test;
	static String quote;
	@SuppressWarnings("unused")
	public static void UM28_MI_UMRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,String strRegressionName, File file,XSSFWorkbook workbook, ExtentTest test) throws IOException 
		{
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();

			AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
			UM_UnderLying  UnderLying = TestPageFactory.initElements(se, UM_UnderLying.class);
			UM_GenInfo  UM_GenInfo = TestPageFactory.initElements(se, UM_GenInfo.class);
			UM_Umbrellalimits  UM_Umbrellalimits = TestPageFactory.initElements(se, UM_Umbrellalimits.class);
			UM_ScheduleName  UM_ScheduleName = TestPageFactory.initElements(se, UM_ScheduleName.class);
			CP_PremiumIndication CP_PremiumIndication = TestPageFactory.initElements(se, CP_PremiumIndication.class);
			CP_PremiumModification CP_PremiumModification=TestPageFactory.initElements(se, CP_PremiumModification.class);
			UM_Underwriter UM_Underwriter=TestPageFactory.initElements(se, UM_Underwriter.class);
			CP_Summary CP_Summary=TestPageFactory.initElements(se, CP_Summary.class);

			


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


						LoginPage.APAppLogin(strRegressionID,   transaction,"No", test);
						UnderLying.UM_UnderLying_Details(strRegressionID, transaction, suspendSheet, test);
						UM_GenInfo.UM_GenInfo_Details(strRegressionID, transaction, suspendSheet,  test);
						UM_Umbrellalimits.UM_Umbrellalimits_Details(strRegressionID, transaction, suspendSheet, test);
						UM_ScheduleName.UM_ScheduleName_Details(strRegressionID, transaction, suspendSheet, test);
						CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionID, transaction, suspendSheet, test);
//						CP_PremiumModification.CP_PremiumModification_Details(strRegressionID, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote, test);
						UM_Underwriter.UM_UW_Details(strRegressionID, transaction, suspendSheet, test);
						
						CP_Summary.CP_Summary_Details(strRegressionID,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,quote, test, file,  workbook);
						
					}


					iteration++;


				}
					

				}
			
			catch (Exception e) {
				e.printStackTrace();
				se.verify().verifyEquals("UM28_MI_UMRegression test  failed", true, false, true, test);
				testTearDown(se,test);
			}






		}




	}









