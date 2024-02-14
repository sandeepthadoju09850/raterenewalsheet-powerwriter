package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CP;
import pw.OR.OR_GL;

public class GL_AdditionalInterest extends OR_GL{
	
	public void GL_AdditionalInterest_Details(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.GL_AdditionalInterest)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.GL_AdditionalInterest, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
			String strGL_AdditionalInterest_BTN_ADD = (String) row.get("GL_AdditionalInterest_BTN_ADD");
			String strGL_AdditionalInterest_BTN_Edit = (String) row.get("GL_AdditionalInterest_BTN_Edit");
			String strGL_AdditionalInterest_BTN_Done = (String) row.get("GL_AdditionalInterest_BTN_Done");
			String strGL_AdditionalInterest_TXT_Name = (String) row.get("GL_AdditionalInterest_TXT_Name");
			String strGL_AdditionalInterest_CHK_AdditionalInsuredWrap = (String) row.get("GL_AdditionalInterest_CHK_AdditionalInsuredWrap");
			String strGL_AdditionalInterest_CHK_CharitableInstitutions = (String) row.get("GL_AdditionalInterest_CHK_CharitableInstitutions");
			String strGL_AdditionalInterest_CHK_ChurchMemOffAndVolWorkers = (String) row.get("GL_AdditionalInterest_CHK_ChurchMemOffAndVolWorkers");
			String strGL_AdditionalInterest_CHK_ClubMembers = (String) row.get("GL_AdditionalInterest_CHK_ClubMembers");
			String strGL_AdditionalInterest_CHK_CoOwnerInsuredPremises = (String) row.get("GL_AdditionalInterest_CHK_CoOwnerInsuredPremises");
			String strGL_AdditionalInterest_CHK_ConcesTradingUndeerYourName = (String) row.get("GL_AdditionalInterest_CHK_ConcesTradingUndeerYourName");
			String strGL_AdditionalInterest_CHK_ControllingInterest = (String) row.get("GL_AdditionalInterest_CHK_ControllingInterest");
			String strGL_AdditionalInterest_CHK_DesignatedPersonOrOrg = (String) row.get("GL_AdditionalInterest_CHK_DesignatedPersonOrOrg");
			String strGL_AdditionalInterest_CHK_EngineersArchitectsSurv = (String) row.get("GL_AdditionalInterest_CHK_EngineersArchitectsSurv");
			String strGL_AdditionalInterest_CHK_ExecutiveOfficersPubLicCorp = (String) row.get("GL_AdditionalInterest_CHK_ExecutiveOfficersPubLicCorp");
			String strGL_AdditionalInterest_CHK_ExecutorsAdminTrusteeBenficiaries = (String) row.get("GL_AdditionalInterest_CHK_ExecutorsAdminTrusteeBenficiaries");
			String strGL_AdditionalInterest_CHK_ExtendedAutomaticAddIns = (String) row.get("GL_AdditionalInterest_CHK_ExtendedAutomaticAddIns");
			String strGL_AdditionalInterest_CHK_GrantorofFranchise = (String) row.get("GL_AdditionalInterest_CHK_GrantorofFranchise");
			String strGL_AdditionalInterest_CHK_GrantorOfLicensesAuto = (String) row.get("GL_AdditionalInterest_CHK_GrantorOfLicensesAuto");
			String strGL_AdditionalInterest_CHK_GrantorOfLicensesSch = (String) row.get("GL_AdditionalInterest_CHK_GrantorOfLicensesSch");
			String strGL_AdditionalInterest_CHK_IowaGovernImmunities = (String) row.get("GL_AdditionalInterest_CHK_IowaGovernImmunities");
			String strGL_AdditionalInterest_CHK_LessorOfLeasedEquip = (String) row.get("GL_AdditionalInterest_CHK_LessorOfLeasedEquip");
			String strGL_AdditionalInterest_CHK_ManagerLessor = (String) row.get("GL_AdditionalInterest_CHK_ManagerLessor");
			String strGL_AdditionalInterest_CHK_MortgageeAssigneeorReceiver = (String) row.get("GL_AdditionalInterest_CHK_MortgageeAssigneeorReceiver");
			String strGL_AdditionalInterest_CHK_NoticeOfCancellation = (String) row.get("GL_AdditionalInterest_CHK_NoticeOfCancellation");
			String strGL_AdditionalInterest_CHK_OilGasOperNonopWorInterest = (String) row.get("GL_AdditionalInterest_CHK_OilGasOperNonopWorInterest");
			String strGL_AdditionalInterest_CHK_OwnersOtherIntrstLandLessors = (String) row.get("GL_AdditionalInterest_CHK_OwnersOtherIntrstLandLessors");
			String strGL_AdditionalInterest_CHK_OwnersLesseesOrContr = (String) row.get("GL_AdditionalInterest_CHK_OwnersLesseesOrContr");
			String strGL_AdditionalInterest_CHK_PrimaryAndNoncontributory = (String) row.get("GL_AdditionalInterest_CHK_PrimaryAndNoncontributory");
			String strGL_AdditionalInterest_CHK_ScaffoldingOperators = (String) row.get("GL_AdditionalInterest_CHK_ScaffoldingOperators");
			String strGL_AdditionalInterest_CHK_ScheduledContractors = (String) row.get("GL_AdditionalInterest_CHK_ScheduledContractors");
			String strGL_AdditionalInterest_CHK_StatePoliticalSubdivsPermitsOrAuthorizations = (String) row.get("GL_AdditionalInterest_CHK_StatePoliticalSubdivsPermitsOrAuthorizations");
			String strGL_AdditionalInterest_CHK_Vendor = (String) row.get("GL_AdditionalInterest_CHK_Vendor");
			String strGL_AdditionalInterest_TXT_Street = (String) row.get("GL_AdditionalInterest_TXT_Street");
			String strGL_AdditionalInterest_TXT_SteUnit = (String) row.get("GL_AdditionalInterest_TXT_Ste/Unit");
			String strGL_AdditionalInterest_TXT_City = (String) row.get("GL_AdditionalInterest_TXT_City");
			String strGL_AdditionalInterest_TXT_State = (String) row.get("GL_AdditionalInterest_TXT_State");
			String strGL_AdditionalInterest_TXT_Zip = (String) row.get("GL_AdditionalInterest_TXT_Zip");
			String strGL_AdditionalInterest_CHK_Option_Singlejob = (String) row.get("GL_AdditionalInterest_CHK_Option_Singlejob");
			String strGL_AdditionalInterest_CHK_Option_Multiplejob = (String) row.get("GL_AdditionalInterest_CHK_Option_Multiplejob");
			String strGL_AdditionalInterest_TXT_DescriptionOfProduct = (String) row.get("GL_AdditionalInterest_TXT_DescriptionOfProduct");
			String strGL_AdditionalInterest_TXT_JobsiteLocation = (String) row.get("GL_AdditionalInterest_TXT_JobsiteLocation");
			String strGL_AdditionalInterest_TXT_DescOfOperation = (String) row.get("GL_AdditionalInterest_TXT_DescOfOperation");
			String strGL_AdditionalInterest_TXT_LocationNo = (String) row.get("GL_AdditionalInterest_TXT_LocationNo");
			String strGL_AdditionalInterest_TXT_OverrideEndorsementPremium1 = (String) row.get("GL_AdditionalInterest_TXT_OverrideEndorsementPremium1");
			String strGL_AdditionalInterest_TXT_OverrideReason1 = (String) row.get("GL_AdditionalInterest_TXT_OverrideReason1");
			String strGL_AdditionalInterest_TXT_State_Loc = (String) row.get("GL_AdditionalInterest_TXT_State_Loc");
			String strGL_AdditionalInterest_TXT_Street_Loc = (String) row.get("GL_AdditionalInterest_TXT_Street_Loc");
			String strGL_AdditionalInterest_TXT_Zip_Loc = (String) row.get("GL_AdditionalInterest_TXT_Zip_Loc");
			String strGL_AdditionalInterest_CHK_IncludeThisForm1 = (String) row.get("GL_AdditionalInterest_CHK_IncludeThisForm1");
			String strGL_AdditionalInterest_CHK_IncludeThisForm2 = (String) row.get("GL_AdditionalInterest_CHK_IncludeThisForm2");
			String strGL_AdditionalInterest_CHK_IncludeThisForm3 = (String) row.get("GL_AdditionalInterest_CHK_IncludeThisForm3");
			String strGL_AdditionalInterest_CHK_IncludeThisForm4 = (String) row.get("GL_AdditionalInterest_CHK_IncludeThisForm4");
			String strGL_AdditionalInterest_CHK_IncludeThisForm5 = (String) row.get("GL_AdditionalInterest_CHK_IncludeThisForm5");
			String strGL_AdditionalInterest_CHK_IncludeThisForm6 = (String) row.get("GL_AdditionalInterest_CHK_IncludeThisForm6");
			String strGL_AdditionalInterest_CHK_IncludeThisForm7 = (String) row.get("GL_AdditionalInterest_CHK_IncludeThisForm7");
			String strGL_AdditionalInterest_TXT_OverrideEndorsementPremium3 = (String) row.get("GL_AdditionalInterest_TXT_OverrideEndorsementPremium3");
			String strGL_AdditionalInterest_TXT_OverrideReason3 = (String) row.get("GL_AdditionalInterest_TXT_OverrideReason3");
			
			String strGL_AdditionalInterest_TXT_AddInterestDesc = (String) row.get("GL_AdditionalInterest_TXT_AddInterestDesc");
			String strGL_AdditionalInterest_TXT_City_Loc = (String) row.get("GL_AdditionalInterest_TXT_City_Loc");
			String strGL_AdditionalInterest_BTN_LocationAdd = (String) row.get("GL_AdditionalInterest_BTN_LocationAdd");
			String strGL_AdditionalInterest_TXT_SiteAddressStreet = (String) row.get("GL_AdditionalInterest_TXT_SiteAddressStreet");
			String strGL_AdditionalInterest_TXT_SiteAddressSteUnit = (String) row.get("GL_AdditionalInterest_TXT_SiteAddressSteUnit");
			String strGL_AdditionalInterest_TXT_SiteAddressCity= (String) row.get("GL_AdditionalInterest_TXT_SiteAddressCity");
			String strGL_AdditionalInterest_DDN_SiteAddressState = (String) row.get("GL_AdditionalInterest_DDN_SiteAddressState");
			String strGL_AdditionalInterest_TXT_SiteAddressZip = (String) row.get("GL_AdditionalInterest_TXT_SiteAddressZip");
			String strGL_AdditionalInterest_TXT_SiteAddressDescOfOperation = (String) row.get("GL_AdditionalInterest_TXT_SiteAddressDescOfOperation");
			String strGL_AdditionalInterest_CHK_RowNum = (String) row.get("GL_AdditionalInterest_CHK_RowNum");
			String strGL_AdditionalInterest_BTN_Remove = (String) row.get("GL_AdditionalInterest_BTN_Remove");
			
			String strGL_AdditionalInterest_CHK_AI_CalculateByPremium1 = (String) row.get("GL_AdditionalInterest_CHK_AI_CalculateByPremium1");
			String strGL_AdditionalInterest_CHK_AI_CalculateByPremium2 = (String) row.get("GL_AdditionalInterest_CHK_AI_CalculateByPremium2");
			
			String strGL_AdditionalInterest_CHK_AI_CalculateByFactor = (String) row.get("GL_AdditionalInterest_CHK_AI_CalculateByFactor");
				String strGL_AdditionalInterest_CHK_AI_CalculateByNoPremium = (String) row.get("GL_AdditionalInterest_CHK_AI_CalculateByNoPremium");
			
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("GL_AdditionalInterest_Details");
				test.log(LogStatus.INFO, "GL_AdditionalInterest_Details page","Transaction Step : "+strTestDescription + "<br>" +"Page : GL_AdditionalInterest_Details");
				se.verify().verifyEquals("GL_AdditionalInterest_Details Page of PowerWriter ", getGL_AdditionalInterest_LabelName().isDisplayed(),true, true,test);
				
				if(strGL_AdditionalInterest_BTN_ADD.equalsIgnoreCase("Yes")){
					se.element().waitForElementIsDisplayed(GL_AdditionalInterest_BTN_ADD, 10);
					se.element().Click(getGL_AdditionalInterest_BTN_ADD(), test);
				}
				if(strGL_AdditionalInterest_BTN_Edit.equalsIgnoreCase("Yes")){
					se.element().Click(getGL_AdditionalInterest_BTN_Edit(strGL_AdditionalInterest_BTN_Edit), test);
				}
				
				if(strGL_AdditionalInterest_BTN_Remove.equalsIgnoreCase("Yes")){
					se.element().checkUncheckOrValidate(getGL_AdditionalInterestSelectRow(strGL_AdditionalInterest_CHK_RowNum),"Check",test);
					se.element().Click(getGL_AdditionalInterest_BTN_Remove(), test);
				}else{
				
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_Name(strGL_AdditionalInterest_TXT_Name),strGL_AdditionalInterest_TXT_Name,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_AdditionalInsuredWrap(strGL_AdditionalInterest_CHK_AdditionalInsuredWrap),strGL_AdditionalInterest_CHK_AdditionalInsuredWrap,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_CharitableInstitutions(strGL_AdditionalInterest_CHK_CharitableInstitutions),strGL_AdditionalInterest_CHK_CharitableInstitutions,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_ChurchMemOffAndVolWorkers(strGL_AdditionalInterest_CHK_ChurchMemOffAndVolWorkers),strGL_AdditionalInterest_CHK_ChurchMemOffAndVolWorkers,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_ClubMembers(strGL_AdditionalInterest_CHK_ClubMembers),strGL_AdditionalInterest_CHK_ClubMembers,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_CoOwnerInsuredPremises(strGL_AdditionalInterest_CHK_CoOwnerInsuredPremises),strGL_AdditionalInterest_CHK_CoOwnerInsuredPremises,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_ConcesTradingUndeerYourName(strGL_AdditionalInterest_CHK_ConcesTradingUndeerYourName),strGL_AdditionalInterest_CHK_ConcesTradingUndeerYourName,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_ControllingInterest(strGL_AdditionalInterest_CHK_ControllingInterest),strGL_AdditionalInterest_CHK_ControllingInterest,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_DesignatedPersonOrOrg(strGL_AdditionalInterest_CHK_DesignatedPersonOrOrg),strGL_AdditionalInterest_CHK_DesignatedPersonOrOrg,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_EngineersArchitectsSurv(strGL_AdditionalInterest_CHK_EngineersArchitectsSurv),strGL_AdditionalInterest_CHK_EngineersArchitectsSurv,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_ExecutiveOfficersPubLicCorp(strGL_AdditionalInterest_CHK_ExecutiveOfficersPubLicCorp),strGL_AdditionalInterest_CHK_ExecutiveOfficersPubLicCorp,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_ExecutorsAdminTrusteeBenficiaries(strGL_AdditionalInterest_CHK_ExecutorsAdminTrusteeBenficiaries),strGL_AdditionalInterest_CHK_ExecutorsAdminTrusteeBenficiaries,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_ExtendedAutomaticAddIns(strGL_AdditionalInterest_CHK_ExtendedAutomaticAddIns),strGL_AdditionalInterest_CHK_ExtendedAutomaticAddIns,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_GrantorofFranchise(strGL_AdditionalInterest_CHK_GrantorofFranchise),strGL_AdditionalInterest_CHK_GrantorofFranchise,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_GrantorOfLicensesAuto(strGL_AdditionalInterest_CHK_GrantorOfLicensesAuto),strGL_AdditionalInterest_CHK_GrantorOfLicensesAuto,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_GrantorOfLicensesSch(strGL_AdditionalInterest_CHK_GrantorOfLicensesSch),strGL_AdditionalInterest_CHK_GrantorOfLicensesSch,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_IowaGovernImmunities(strGL_AdditionalInterest_CHK_IowaGovernImmunities),strGL_AdditionalInterest_CHK_IowaGovernImmunities,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_LessorOfLeasedEquip(strGL_AdditionalInterest_CHK_LessorOfLeasedEquip),strGL_AdditionalInterest_CHK_LessorOfLeasedEquip,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_ManagerLessor(strGL_AdditionalInterest_CHK_ManagerLessor),strGL_AdditionalInterest_CHK_ManagerLessor,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_MortgageeAssigneeorReceiver(strGL_AdditionalInterest_CHK_MortgageeAssigneeorReceiver),strGL_AdditionalInterest_CHK_MortgageeAssigneeorReceiver,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_NoticeOfCancellation(strGL_AdditionalInterest_CHK_NoticeOfCancellation),strGL_AdditionalInterest_CHK_NoticeOfCancellation,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_OilGasOperNonopWorInterest(strGL_AdditionalInterest_CHK_OilGasOperNonopWorInterest),strGL_AdditionalInterest_CHK_OilGasOperNonopWorInterest,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_OwnersOtherIntrstLandLessors(strGL_AdditionalInterest_CHK_OwnersOtherIntrstLandLessors),strGL_AdditionalInterest_CHK_OwnersOtherIntrstLandLessors,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_OwnersLesseesOrContr(strGL_AdditionalInterest_CHK_OwnersLesseesOrContr),strGL_AdditionalInterest_CHK_OwnersLesseesOrContr,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_PrimaryAndNoncontributory(strGL_AdditionalInterest_CHK_PrimaryAndNoncontributory),strGL_AdditionalInterest_CHK_PrimaryAndNoncontributory,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_ScaffoldingOperators(strGL_AdditionalInterest_CHK_ScaffoldingOperators),strGL_AdditionalInterest_CHK_ScaffoldingOperators,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_ScheduledContractors(strGL_AdditionalInterest_CHK_ScheduledContractors),strGL_AdditionalInterest_CHK_ScheduledContractors,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_StatePoliticalSubdivsPermitsOrAuthorizations(strGL_AdditionalInterest_CHK_StatePoliticalSubdivsPermitsOrAuthorizations),strGL_AdditionalInterest_CHK_StatePoliticalSubdivsPermitsOrAuthorizations,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_Vendor(strGL_AdditionalInterest_CHK_Vendor),strGL_AdditionalInterest_CHK_Vendor,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_Street(strGL_AdditionalInterest_TXT_Street),strGL_AdditionalInterest_TXT_Street,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_SteUnit(strGL_AdditionalInterest_TXT_SteUnit),strGL_AdditionalInterest_TXT_SteUnit,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_City(strGL_AdditionalInterest_TXT_City),strGL_AdditionalInterest_TXT_City,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_State(strGL_AdditionalInterest_TXT_State),strGL_AdditionalInterest_TXT_State,test);
				
				if(se.element().isElementPresent(GL_AdditionalInterest_BTN_Close)){
					se.element().waitForElementIsDisplayed(GL_AdditionalInterest_BTN_Close,10);
					//se.element().Click(getNotifcationOKbutton(), test);
					//se.element().selectPopupWithMagnifier(getGL_AdditionalInterest_TXT_State(strGL_AdditionalInterest_TXT_State), getGL_AdditionalInterest_BTN_State_Search(strGL_AdditionalInterest_TXT_State), strGL_AdditionalInterest_TXT_State, constants.NA, strGL_AdditionalInterest_TXT_State, constants.NA, constants.NA, constants.NA, test);
					se.element().Click(getGL_AdditionalInterest_LNK_StatePopupOption(strGL_AdditionalInterest_TXT_State), test);
				
				}
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_Zip(strGL_AdditionalInterest_TXT_Zip),strGL_AdditionalInterest_TXT_Zip,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_Option_Singlejob(strGL_AdditionalInterest_CHK_Option_Singlejob),strGL_AdditionalInterest_CHK_Option_Singlejob,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_Option_Multiplejob(strGL_AdditionalInterest_CHK_Option_Multiplejob),strGL_AdditionalInterest_CHK_Option_Multiplejob,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_DescriptionOfProduct(strGL_AdditionalInterest_TXT_DescriptionOfProduct),strGL_AdditionalInterest_TXT_DescriptionOfProduct,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_JobsiteLocation(strGL_AdditionalInterest_TXT_JobsiteLocation),strGL_AdditionalInterest_TXT_JobsiteLocation,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_DescOfOperation(strGL_AdditionalInterest_TXT_DescOfOperation),strGL_AdditionalInterest_TXT_DescOfOperation,test);
				
				if(strGL_AdditionalInterest_BTN_LocationAdd.equalsIgnoreCase("Yes")){
					se.element().Click(getGL_AdditionalInterest_BTN_LocationAdd(strGL_AdditionalInterest_BTN_LocationAdd), test);
				}
				se.element().selectPopupWithMagnifier(getGL_AdditionalInterest_TXT_LocationNo(strGL_AdditionalInterest_TXT_LocationNo), getGL_AdditionalInterest_TXT_LocationNoSearch(strGL_AdditionalInterest_TXT_LocationNo), strGL_AdditionalInterest_TXT_LocationNo, "N/A", strGL_AdditionalInterest_TXT_LocationNo,"N/A", "N/A", "N/A", test);
				se.util().sleep(3000);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_City_Loc(strGL_AdditionalInterest_TXT_City_Loc),strGL_AdditionalInterest_TXT_City_Loc,test);
				se.element().selectPopupWithMagnifier(getGL_AdditionalInterest_TXT_State_Loc(strGL_AdditionalInterest_TXT_State_Loc), getGL_AdditionalInterest_TXT_State_LocSearch(strGL_AdditionalInterest_TXT_State_Loc), strGL_AdditionalInterest_TXT_State_Loc, "N/A", strGL_AdditionalInterest_TXT_State_Loc,"N/A", "N/A", "N/A", test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_Street_Loc(strGL_AdditionalInterest_TXT_Street_Loc),strGL_AdditionalInterest_TXT_Street_Loc,test);
				se.element().selectPopupWithMagnifier(getGL_AdditionalInterest_TXT_Zip_Loc(strGL_AdditionalInterest_TXT_Zip_Loc), getGL_AdditionalInterest_TXT_Zip_LocSearch(strGL_AdditionalInterest_TXT_Zip_Loc), strGL_AdditionalInterest_TXT_Zip_Loc, "N/A", strGL_AdditionalInterest_TXT_Zip_Loc,"N/A", "N/A", "N/A", test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_AddInterestDesc(strGL_AdditionalInterest_TXT_AddInterestDesc),strGL_AdditionalInterest_TXT_AddInterestDesc,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_IncludeThisForm1(strGL_AdditionalInterest_CHK_IncludeThisForm1),strGL_AdditionalInterest_CHK_IncludeThisForm1,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_OverrideEndorsementPremium1(strGL_AdditionalInterest_TXT_OverrideEndorsementPremium1),strGL_AdditionalInterest_TXT_OverrideEndorsementPremium1,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_OverrideReason1(strGL_AdditionalInterest_TXT_OverrideReason1),strGL_AdditionalInterest_TXT_OverrideReason1,test);
				//TODO Improve the Common Look Up
				//se.element().selectPopupWithMagnifier(getGL_AdditionalInterest_TXT_OverrideReason1(strGL_AdditionalInterest_TXT_OverrideReason1), getGL_AdditionalInterest_TXT_OverrideReason1Search(strGL_AdditionalInterest_TXT_OverrideReason1), strGL_AdditionalInterest_TXT_OverrideReason1, strGL_AdditionalInterest_TXT_OverrideReason1FiltesrNeeded, strGL_AdditionalInterest_TXT_OverrideReason1,"N/A", "N/A", "N/A", test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_IncludeThisForm2(strGL_AdditionalInterest_CHK_IncludeThisForm2),strGL_AdditionalInterest_CHK_IncludeThisForm2,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_IncludeThisForm3(strGL_AdditionalInterest_CHK_IncludeThisForm3),strGL_AdditionalInterest_CHK_IncludeThisForm3,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_OverrideEndorsementPremium3(strGL_AdditionalInterest_TXT_OverrideEndorsementPremium3),strGL_AdditionalInterest_TXT_OverrideEndorsementPremium3,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_OverrideReason3(strGL_AdditionalInterest_TXT_OverrideReason3),strGL_AdditionalInterest_TXT_OverrideReason3,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_IncludeThisForm4(strGL_AdditionalInterest_CHK_IncludeThisForm4),strGL_AdditionalInterest_CHK_IncludeThisForm4,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_IncludeThisForm5(strGL_AdditionalInterest_CHK_IncludeThisForm5),strGL_AdditionalInterest_CHK_IncludeThisForm5,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_IncludeThisForm6(strGL_AdditionalInterest_CHK_IncludeThisForm6),strGL_AdditionalInterest_CHK_IncludeThisForm6,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_IncludeThisForm7(strGL_AdditionalInterest_CHK_IncludeThisForm7),strGL_AdditionalInterest_CHK_IncludeThisForm7,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_AI_CalculateByPremium1(strGL_AdditionalInterest_CHK_AI_CalculateByPremium1),strGL_AdditionalInterest_CHK_AI_CalculateByPremium1,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_AI_CalculateByPremium2(strGL_AdditionalInterest_CHK_AI_CalculateByPremium2),strGL_AdditionalInterest_CHK_AI_CalculateByPremium2,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_AI_CalculateByFactor(strGL_AdditionalInterest_CHK_AI_CalculateByFactor),strGL_AdditionalInterest_CHK_AI_CalculateByFactor,test);
				se.element().checkUncheckOrValidate(getGL_AdditionalInterest_CHK_AI_CalculateByNoPremium(strGL_AdditionalInterest_CHK_AI_CalculateByNoPremium),strGL_AdditionalInterest_CHK_AI_CalculateByNoPremium,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_SiteAddressStreet(strGL_AdditionalInterest_TXT_SiteAddressStreet),strGL_AdditionalInterest_TXT_SiteAddressStreet,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_SiteAddressSteUnit(strGL_AdditionalInterest_TXT_SiteAddressSteUnit),strGL_AdditionalInterest_TXT_SiteAddressSteUnit,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_SiteAddressCity(strGL_AdditionalInterest_TXT_SiteAddressCity),strGL_AdditionalInterest_TXT_SiteAddressCity,test);
				se.element().selectElementDDrOrValidateText(getGL_AdditionalInterest_DDN_SiteAddressState(strGL_AdditionalInterest_DDN_SiteAddressState),strGL_AdditionalInterest_DDN_SiteAddressState,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_SiteAddressZip(strGL_AdditionalInterest_TXT_SiteAddressZip),strGL_AdditionalInterest_TXT_SiteAddressZip,test);
				se.element().enterOrValidateText(getGL_AdditionalInterest_TXT_SiteAddressDescOfOperation(strGL_AdditionalInterest_TXT_SiteAddressDescOfOperation),strGL_AdditionalInterest_TXT_SiteAddressDescOfOperation,test);
				se.element().clickElement(getNext());
				se.util().sleep(2000);
				
				/*if(strGL_AdditionalInterest_BTN_Done.equalsIgnoreCase("Yes")){
					se.util().sleep(1000);
					se.element().clickElement(getDone());
				}*/
				
				}
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for GL_AdditionalInterest_Details ", true, false, true, test);
			}
			iteration++;
		}
		se.element().clickElement(getDone());
}
catch (Exception e) {
	// TODO: handle exception
	se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
	test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
	testTearDown(se, test);
}
		
	}
	
	public void clickDone(){
		se.element().clickElement(getDone());
		se.util().sleep(2000);
		
	}
		
}