package ap.regression.WC;

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
import ap.pages.CA.CA_Garagekeepers;
import ap.pages.CP.CP_AccReceivableSchedule;
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
import ap.pages.CP.CP_ScheduledProperty;
import ap.pages.CP.CP_SignsScheduleInfo;
import ap.pages.CP.CP_Summary;
import ap.pages.CP.CP_UnderWriter;
import ap.pages.CP.CP_ValuablePapers;
import ap.pages.WC.WC_FlatWaiverOfSubrogation;
import ap.pages.WC.WC_IndividualsIncluded;
import ap.pages.WC.WC_OtherStateInsurance;
import ap.pages.WC.WC_PolicyInformation;
import ap.pages.WC.WC_PremiumModification;
import ap.pages.WC.WC_RatingClassifications;
import ap.pages.WC.WC_StateRatingFactors;
import ap.pages.WC.WC_UWQuestions;
import ap.pages.common.APPW_CommonMethods;
import ap.pages.common.AP_Login;

public class WC05_IN_BPRegression extends BaseTest{


	

	ExtentReports extent;
	ExtentTest test;
	static String quote;
	static String PolicyNumber = "";

	@SuppressWarnings("unused")
	public static void WCBP05_IN_RegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,String strRegressionName, File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		{
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();

			CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
			OR_CP ORCP = TestPageFactory.initElements(se, OR_CP.class);
			AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
			CP_GenInfo CP_GenInfo = TestPageFactory.initElements(se, CP_GenInfo.class);
			CP_AccountClearance CP_AccountClearance = TestPageFactory.initElements(se, CP_AccountClearance.class);
			CP_Locations CP_Locations = TestPageFactory.initElements(se, CP_Locations.class);
			CP_LiabilityAdditonalInterests CP_LiabilityAdditonalInterests=TestPageFactory.initElements(se, CP_LiabilityAdditonalInterests.class);
			CP_PremiumIndication CP_PremiumIndication=TestPageFactory.initElements(se, CP_PremiumIndication.class);
			CP_LossHistoryExpRating CP_LossHistoryExpRating=TestPageFactory.initElements(se, CP_LossHistoryExpRating.class);
			CP_CarrierInformation CP_CarrierInformation=TestPageFactory.initElements(se, CP_CarrierInformation.class);
			CP_BillingInformation CP_BillingInformation=TestPageFactory.initElements(se, CP_BillingInformation.class);
			CP_Summary CP_Summary=TestPageFactory.initElements(se, CP_Summary.class);
			APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class);
			WC_FlatWaiverOfSubrogation WC_FlatWaiverOfSubrogation = TestPageFactory.initElements(se, WC_FlatWaiverOfSubrogation.class);

			CP_ExtendedNamedInsured CP_ExtendedNamedInsured = TestPageFactory.initElements(se, CP_ExtendedNamedInsured.class);
			CP_CoverageParts CP_CoverageParts = TestPageFactory.initElements(se, CP_CoverageParts.class);
			CP_BuildingandOccupantSelection CP_BandOS = TestPageFactory.initElements(se, CP_BuildingandOccupantSelection.class);
			CP_BulidingDetails CP_BulidingDetails = TestPageFactory.initElements(se, CP_BulidingDetails.class);
			CP_PropertyCoverages CP_PropertyCoverages = TestPageFactory.initElements(se, CP_PropertyCoverages.class);
			CP_OptionalPropertyCoverages CP_OptionalPropertyCoverages = TestPageFactory.initElements(se, CP_OptionalPropertyCoverages.class);
			CP_Liablitycoverages CP_Liablitycoverages=TestPageFactory.initElements(se, CP_Liablitycoverages.class);
			CP_Liablityclasses CP_Liablityclasses=TestPageFactory.initElements(se, CP_Liablityclasses.class);
			CP_AdditionalCoverageParts CP_AdditionalCoverageParts = TestPageFactory.initElements(se, CP_AdditionalCoverageParts.class);
			CP_CrimeCoverageSelection CP_CrimeCoverageSelection =TestPageFactory.initElements(se, CP_CrimeCoverageSelection.class);
			CP_InlandMarineCovSelection CP_InlandMarineCovSelection = TestPageFactory.initElements(se, CP_InlandMarineCovSelection.class);
			CP_PremiumModification CP_PremiumModification=TestPageFactory.initElements(se, CP_PremiumModification.class);
			CP_UnderWriter CP_UnderWritter=TestPageFactory.initElements(se, CP_UnderWriter.class);
			CP_PropertyAdditionalInterests CP_PropertyAdditionalInterests=TestPageFactory.initElements(se, CP_PropertyAdditionalInterests.class);
			CA_Garagekeepers CA_Garagekeepers = TestPageFactory.initElements(se, CA_Garagekeepers.class);
			CP_SignsScheduleInfo CP_SignsScheduleInfo = TestPageFactory.initElements(se, CP_SignsScheduleInfo.class);			
			CP_ContractorsEquipmentScheduled CP_ContractorsEquipmentScheduled = TestPageFactory.initElements(se, CP_ContractorsEquipmentScheduled.class);
			CP_ScheduledProperty CP_ScheduledProperty = TestPageFactory.initElements(se, CP_ScheduledProperty.class);
			CP_ValuablePapers CP_ValuablePapers = TestPageFactory.initElements(se, CP_ValuablePapers.class);
			CP_AccReceivableSchedule CP_AccReceivableSchedule = TestPageFactory.initElements(se, CP_AccReceivableSchedule.class);
			WC_PolicyInformation WC_PolicyInformation=TestPageFactory.initElements(se, WC_PolicyInformation.class);
			WC_StateRatingFactors WC_StateRatingFactors=TestPageFactory.initElements(se, WC_StateRatingFactors.class);
			WC_RatingClassifications WC_RatingClassifications=TestPageFactory.initElements(se, WC_RatingClassifications.class);
			WC_PremiumModification WC_PremiumModification=TestPageFactory.initElements(se, WC_PremiumModification.class);
			WC_IndividualsIncluded WC_IndividualsIncluded = TestPageFactory.initElements(se, WC_IndividualsIncluded.class);
			WC_OtherStateInsurance WC_OtherStateInsurance = TestPageFactory.initElements(se, WC_OtherStateInsurance.class);
			WC_UWQuestions WC_UWQuestions=TestPageFactory.initElements(se, WC_UWQuestions.class);
			


			try {
				String transaction = "NewQuote";
				String strRegressionIDUnderlined = "WCBP_05";
				List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
				System.out.println(transactionsList);
				List<Map<String, String>> table = ExcelOperations.getPagesData(constants.loginPageName, strRegressionID,transaction);

				
					
					LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(0);
					String strAgentLink = (String) row.get("AgentLink");
					String strLOB = (String) row.get("LOB_Select");
					String strRole_SelectRoleAs = (String) row.get("Select_RoleAs");
					String strRelease_SelectRelease = (String) row.get("Select_Release");
					
					List<Map<String, String>> tableBP = ExcelOperations.getPagesData(constants.loginPageName, strRegressionIDUnderlined,transaction);
					LinkedHashMap<String, String> rowBP = (LinkedHashMap<String, String>) tableBP.get(0);
					String strAgentLinkBP = (String) rowBP.get("AgentLink");
					String strLOBBP = (String) rowBP.get("LOB_Select");
					String strRole_SelectRoleAsBP = (String) rowBP.get("Select_RoleAs");
					String strRelease_SelectReleaseBP = (String) rowBP.get("Select_Release");
					
					
					if (transactionsList.contains("NewQuote")) {
						transaction = "NewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						LoginPage.APAppLogin(strRegressionIDUnderlined,   transaction,"Yes", test);
						CP_GenInfo.CP_GenInfo_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
						CP_AccountClearance.CP_AccountClearance_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
						CP_CoverageParts.CP_CoverageParts_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_Locations.CP_Locations_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
						quote=APPW_CommonMethods.getQuoteNumber(strRegressionIDUnderlined,test);
						CP_BandOS.CP_BuildandOccupantSelection_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_BulidingDetails.CP_Buliding_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
						CP_PropertyCoverages.CP_PropertyCoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_OptionalPropertyCoverages.CP_OptionalPropertyCoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_Liablitycoverages.CP_Liablitycoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_Liablityclasses.CP_Liablityclasses_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						//CP_LiabilityOptions.CP_LiabilityOptions_Details(strRegressionID, transaction, suspendSheet, test);
						CP_LiabilityAdditonalInterests.CP_LiabilityAdditonalInterests_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_AdditionalCoverageParts.CP_AdditionalCoverageParts_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_CrimeCoverageSelection.CP_CrimeCoverageSelection_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_InlandMarineCovSelection.CP_InlandMarineCovSelection_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						
						CP_AccReceivableSchedule.CP_AccReceivableSchedule_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_ContractorsEquipmentScheduled.CP_ContractorsEquipmentScheduled_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_ScheduledProperty.CP_ScheduledProperty_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_SignsScheduleInfo.CP_SignsScheduleInfo_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_ValuablePapers.CP_ValuablePapers_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);

					}
					if (transactionsList.contains("RedoNewQuote")) {
						transaction = "RedoNewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						BT.NavigateToTabs("Optional Property Coverages",test);
						CP_OptionalPropertyCoverages.CP_OptionalPropertyCoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_Liablitycoverages.CP_Liablitycoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						//BT.NavigateToTabs("Crime Coverage Selection",test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						CP_CrimeCoverageSelection.CP_CrimeCoverageSelection_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						//CP_LossHistoryExpRating.CP_LossHistoryExpRating_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_PremiumModification.CP_PremiumModification_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote, test);
						CP_UnderWritter.CP_UnderWriter_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_PropertyAdditionalInterests.CP_PropertyAdditionalInterests_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_CarrierInformation.CP_CarrierInformation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_BillingInformation.CP_BillingInformation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						
					}
					if (transactionsList.contains("RedoNewQuoteOne")) {
						transaction = "RedoNewQuoteOne";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						BT.NavigateToTabs("Optional Property Coverages",test);
						BT.ClickContinue(test);//navigate to Liability coverages
						BT.ClickContinue(test);//navigate to Liability classes
						BT.ClickContinue(test);//navigate to Liability Add Interest
						BT.ClickContinue(test);////navigate to Additional coverage parts
						BT.ClickContinue(test);//navigate to crime coverage 
						BT.ClickContinue(test);//navigate to InlandMarine coverage 
						BT.ClickContinue(test);//navigate to  account receivables
						BT.ClickContinue(test);//navigate to Contractors equipment
						BT.ClickContinue(test);//scheduledpropFloater
						BT.ClickContinue(test);//navigate to Signcoverage
						BT.ClickContinue(test);
						//BT.ClickContinue(test);//navigate to LossHistory
						BT.ClickContinue(test);//navigate to PremiumMod
						
						CP_PremiumModification.CP_PremiumModification_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote, test);	
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						//CP_BillingInformation.CP_BillingInformation_Details(strRegressionID, transaction, suspendSheet, test);
						CP_Summary.CP_Summary_Details(strRegressionIDUnderlined,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,quote, test, file,  workbook);
						
					}
					
					
					strRegressionIDUnderlined = "WC_05";
					if (transactionsList.contains("NewQuote")) {
						transaction = "NewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						
						

						APPW_CommonMethods.openQuoteInAP(quote,"N/A",test);
						APPW_CommonMethods.openAccountDetails(test);
						APPW_CommonMethods.addNewWorkItem("Workers", test);
						CP_GenInfo.CP_GenInfo_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, "Workers Comp", strRelease_SelectRelease, strRole_SelectRoleAs, test);
						CP_AccountClearance.CP_AccountClearance_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
						CP_Locations.CP_Locations_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
						quote=APPW_CommonMethods.getQuoteNumber(strRegressionIDUnderlined,test);
						WC_PolicyInformation.WC_PolicyInformation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						BT.NavigateToTabs("General Information",test);
						CP_GenInfo.CP_GenInfo_Details(strRegressionIDUnderlined, "NewQuote1", suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						WC_StateRatingFactors.WC_StateRatingFactors_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						WC_FlatWaiverOfSubrogation.WC_FlatWaiverOfSubrogation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						WC_RatingClassifications.WC_RatingClassifications_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						BT.ClickContinue(test);
						WC_IndividualsIncluded.WC_IndividualsIncluded_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						WC_UWQuestions.WC_UnderWriter_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						WC_OtherStateInsurance.WC_OtherStateInsurance_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						//BT.ClickContinue(test);
						CP_BillingInformation.CP_BillingInformation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_Summary.CP_Summary_Details(strRegressionIDUnderlined,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,quote, test, file,  workbook);
						LoginPage.APLogoutDetails( strAgentLink,test );
					
					}
					
					if (transactionsList.contains("BookPolicyInPW")) {
						transaction = "BookPolicyInPW";
						String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						test.log(LogStatus.INFO, "Bizlink Elapsed Time", "<b>Started Time : "+test.getStartedTime()+"<br> <b>Ended Time : "+Util.getTime()+"<br> <b>Time Taken : "+Util.DiffInTime(test.getStartedTime(), Util.getTime())); 
						Date PWstartTime = Util.getTime();
						LoginPage.APAppLogin(strRegressionID,   transaction,"No", test);
						APPW_CommonMethods.PW_Search_Details(test,quote,"N/A");
						APPW_CommonMethods.getDashboardActions(strRegressionID,transaction, suspendSheet, test);
						APPW_CommonMethods.getCalculatePremium(strRegressionID,"50", transaction, test);
						PolicyNumber = APPW_CommonMethods.retrievePolicyNumber(test);APPW_CommonMethods.getCalculatePremium(strRegressionID,"N/A", "PWConvertToPolicy", test);CP_Summary.CP_Summary_Details(strRegressionID,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,PolicyNumber, test, file,  workbook);
						APPW_CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
						APPW_CommonMethods.getDashboardActions(strRegressionID, "PWConvertToPolicy", suspendSheet, test);
						test.log(LogStatus.INFO, "PW Elapsed Time", "<b>Started Time : "+PWstartTime+"<br> <b>Ended Time : "+Util.getTime()+"<br> <b>Time Taken : "+Util.DiffInTime(PWstartTime, Util.getTime())); 
						
					}
				
					if (transactionsList.contains("PolicyIssuanceOnAP")) {
					 	transaction = "PolicyIssuanceOnAP";
					 	String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
					 	Date PolicyVerificationstartTime = Util.getTime();
					 	LoginPage.APAppLogin(strRegressionID,   transaction,"No", test);
					 	APPW_CommonMethods.APSearchPolicyNumber(PolicyNumber,test);
					 	CP_Summary.CP_Summary_Details(strRegressionID,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,PolicyNumber, test, file,  workbook);
					 	test.log(LogStatus.INFO, "Elapsed Time for PolicyVerification in Bizlink", "<b>Started Time : "+PolicyVerificationstartTime+"<br> <b>Ended Time : "+Util.getTime()+"<br> <b>Time Taken : "+Util.DiffInTime(PolicyVerificationstartTime, Util.getTime())); 
						
					}
					
			
			}
			catch (Exception e) {
				e.printStackTrace();
				se.verify().verifyEquals("WC05_IN_BPRegression test  failed", true, false, true, test);
				  test.setEndedTime(Util.getTime());
				  testTearDown(se,test);
			}






		}




	}














}
