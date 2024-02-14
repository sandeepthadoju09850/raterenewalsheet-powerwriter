package pw.pages.CAF;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class CAF_CrimeEndorsement extends OR_CP{
	
	public void CAF_CrimeEndorsementMethod (String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
			if (SuspendSheet.equalsIgnoreCase("Crime_Endorsements")) {
				test.log(LogStatus.INFO, "Page Suspended :- ",
						"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
				testTearDown(se, test);
			}
		List<Map<String, String>> table = ExcelOperations.getPagesData("Crime_Endorsements", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
			String strCrime_Endorsements_BTN_ADD = (String) row.get("Crime_Endorsements_BTN_ADD");
			String strCrime_Endorsements_BTN_Details = (String) row.get("Crime_Endorsements_BTN_Details");
			String strCrime_Endorsements_BTN_Done = (String) row.get("Crime_Endorsements_BTN_Done");
			String strCrime_Endorsements_TXT_FormNameSearchDisplay = (String) row.get("Crime_Endorsements_TXT_FormNameSearchDisplay");
			String strCrime_Endorsements_TXT_FormName = (String) row.get("Crime_Endorsements_TXT_FormName");
			String strCrime_Endorsements_TXT_FormNameInsuringAgreement = (String) row.get("Crime_Endorsements_TXT_FormNameInsuringAgreement");
			String strCrime_Endorsements_TXT_FormNumber = (String) row.get("Crime_Endorsements_TXT_FormNumber");
			String strCrime_Endorsements_TXT_LocationNo = (String) row.get("Crime_Endorsements_TXT_LocationNo");
			String strCrime_Endorsements_TXT_Name = (String) row.get("Crime_Endorsements_TXT_Name");
			String strCrime_Endorsements_TXT_Description = (String) row.get("Crime_Endorsements_TXT_Description");
			String strCrime_Endorsements_TXT_Street1 = (String) row.get("Crime_Endorsements_TXT_Street1");
			String strCrime_Endorsements_TXT_Street2 = (String) row.get("Crime_Endorsements_TXT_Street2");
			String strCrime_Endorsements_TXT_City = (String) row.get("Crime_Endorsements_TXT_City");
			String strCrime_Endorsements_TXT_State = (String) row.get("Crime_Endorsements_TXT_State");
			String strCrime_Endorsements_TXT_Zip = (String) row.get("Crime_Endorsements_TXT_Zip");
			
			
			String strCrime_Endorsements_CHK_BurglarAlarmSystem = (String) row.get("Crime_Endorsements_CHK_BurglarAlarmSystem");
			String strCrime_Endorsements_TXT_NameOfAlarmCompany = (String) row.get("Crime_Endorsements_TXT_NameOfAlarmCompany");
			String strCrime_Endorsements_TXT_ULClassification = (String) row.get("Crime_Endorsements_TXT_ULClassification");
			String strCrime_Endorsements_CHK_AlarmCompHasKeysYes = (String) row.get("Crime_Endorsements_CHK_AlarmCompHasKeysYes");
			String strCrime_Endorsements_CHK_AlarmCompHasKeysNo = (String) row.get("Crime_Endorsements_CHK_AlarmCompHasKeysNo");
			String strCrime_Endorsements_CHK_TypeOfAlarmPremises = (String) row.get("Crime_Endorsements_CHK_TypeOfAlarmPremises");
			String strCrime_Endorsements_CHK_TypeOfAlarmSafeorVault = (String) row.get("Crime_Endorsements_CHK_TypeOfAlarmSafeorVault");
			String strCrime_Endorsements_TXT_CertificateNo = (String) row.get("Crime_Endorsements_TXT_CertificateNo");
			String strCrime_Endorsements_TXT_Eff = (String) row.get("Crime_Endorsements_TXT_Eff");
			String strCrime_Endorsements_TXT_Exp = (String) row.get("Crime_Endorsements_TXT_Exp");
			String strCrime_Endorsements_CHK_OutsideCentralStationYes = (String) row.get("Crime_Endorsements_CHK_OutsideCentralStationYes");
			String strCrime_Endorsements_CHK_OutsideCentralStationNo = (String) row.get("Crime_Endorsements_CHK_OutsideCentralStationNo");
			String strCrime_Endorsements_CHK_OutsideGongYes = (String) row.get("Crime_Endorsements_CHK_OutsideGongYes");
			String strCrime_Endorsements_CHK_OutsideGongNo = (String) row.get("Crime_Endorsements_CHK_OutsideGongNo");
			String strCrime_Endorsements_CHK_PrivateWatchpersons = (String) row.get("Crime_Endorsements_CHK_PrivateWatchpersons");
			
			String strCrime_Endorsements_TXT_StateNumOfPrivateWatchPersons = (String) row.get("Crime_Endorsements_TXT_StateNumOfPrivateWatchPersons");
			String strCrime_Endorsements_CHK_RegistorAtleastHourlyOnClockYes = (String) row.get("Crime_Endorsements_CHK_RegistorAtleastHourlyOnClockYes");
			String strCrime_Endorsements_CHK_RegistorAtleastHourlyOnClockNo = (String) row.get("Crime_Endorsements_CHK_RegistorAtleastHourlyOnClockNo");
			String strCrime_Endorsements_CHK_SignalCentralStationYes = (String) row.get("Crime_Endorsements_CHK_SignalCentralStationYes");
			String strCrime_Endorsements_CHK_SignalCentralStationNo= (String) row.get("Crime_Endorsements_CHK_SignalCentralStationNo");
			String strCrime_Endorsements_CHK_AtleastHourlyYes = (String) row.get("Crime_Endorsements_CHK_AtleastHourlyYes");
			String strCrime_Endorsements_CHK_AtleastHourlyNo = (String) row.get("Crime_Endorsements_CHK_AtleastHourlyNo");
			String strCrime_Endorsements_CHK_ThePremIsEquipwithBullestResistAlarmSystem = (String) row.get("Crime_Endorsements_CHK_ThePremIsEquipwithBullestResistAlarmSystem");
			String strCrime_Endorsements_CHK_Guards = (String) row.get("Crime_Endorsements_CHK_Guards");
			String strCrime_Endorsements_TXT_StateNumGuardsWillBeInsidePremises = (String) row.get("Crime_Endorsements_TXT_StateNumGuardsWillBeInsidePremises");
			String strCrime_Endorsements_CHK_ThePremIsEquippedwithHoldupAlarm = (String) row.get("Crime_Endorsements_CHK_ThePremIsEquippedwithHoldupAlarm");
			String strCrime_Endorsements_CHK_ACentralStation = (String) row.get("Crime_Endorsements_CHK_ACentralStation");
			String strCrime_Endorsements_CHK_APoliceStationWithRegPoliceOff = (String) row.get("Crime_Endorsements_CHK_APoliceStationWithRegPoliceOff");
			String strCrime_Endorsements_CHK_ALocalGong = (String) row.get("Crime_Endorsements_CHK_ALocalGong");
			String strCrime_Endorsements_CHK_InsuredInfo = (String) row.get("Crime_Endorsements_CHK_InsuredInfo");
			String strCrime_Endorsements_CHK_CoveredPropWillBeConveyedOutsidePrem = (String) row.get("Crime_Endorsements_CHK_CoveredPropWillBeConveyedOutsidePrem");
			
			String strCrime_Endorsements_TXT_CoverageIndicator = (String) row.get("Crime_Endorsements_TXT_CoverageIndicator");
			String strCrime_Endorsements_TXT_SpecifiedProperty = (String) row.get("Crime_Endorsements_TXT_SpecifiedProperty");
			String strCrime_Endorsements_TXT_NameOfAgent = (String) row.get("Crime_Endorsements_TXT_NameOfAgent");
			String strCrime_Endorsements_TXT_ServicePerformedForYou = (String) row.get("Crime_Endorsements_TXT_ServicePerformedForYou");
			String strCrime_Endorsements_TXT_Limit = (String) row.get("Crime_Endorsements_TXT_Limit");
			String strCrime_Endorsements_TXT_LimitPerGuest = (String) row.get("Crime_Endorsements_TXT_LimitPerGuest");
			String strCrime_Endorsements_TXT_LimitPerOccurence = (String) row.get("Crime_Endorsements_TXT_LimitPerOccurence");
				
			String strCrime_Endorsements_TXT_InsuringAgreement = (String) row.get("Crime_Endorsements_TXT_InsuringAgreement");
			String strCrime_Endorsements_TXT_CoveredInstruments = (String) row.get("Crime_Endorsements_TXT_CoveredInstruments");
			String strCrime_Endorsements_TXT_NuberOfCardholders = (String) row.get("Crime_Endorsements_TXT_NuberOfCardholders");
			String strCrime_Endorsements_TXT_NumberOfPremises = (String) row.get("Crime_Endorsements_TXT_NumberOfPremises");
			String strCrime_Endorsements_TXT_NumberOfAgents = (String) row.get("Crime_Endorsements_TXT_NumberOfAgents");
			
			String strCrime_Endorsements_TXT_DecreasedLimit = (String) row.get("Crime_Endorsements_TXT_DecreasedLimit");
			String strCrime_Endorsements_TXT_ClassCode = (String) row.get("Crime_Endorsements_TXT_ClassCode");
			String strCrime_Endorsements_TXT_ClassDescPopup = (String) row.get("Crime_Endorsements_TXT_ClassDescPopup");
			String strCrime_Endorsements_TXT_ClassDescription = (String) row.get("Crime_Endorsements_TXT_ClassDescription");
			String strCrime_Endorsements_TXT_MajorIndustryGroup = (String) row.get("Crime_Endorsements_TXT_MajorIndustryGroup");
			String strCrime_Endorsements_TXT_PredominantActivity = (String) row.get("Crime_Endorsements_TXT_PredominantActivity");
			String strCrime_Endorsements_TXT_TotalNumberOfPartners = (String) row.get("Crime_Endorsements_TXT_TotalNumberOfPartners");
			String strCrime_Endorsements_TXT_AggregateLimitfactor = (String) row.get("Crime_Endorsements_TXT_AggregateLimitfactor");
			String strCrime_Endorsements_TXT_CoveredLossPercent = (String) row.get("Crime_Endorsements_TXT_CoveredLossPercent");
			String strCrime_Endorsements_TXT_PackageModFactor = (String) row.get("Crime_Endorsements_TXT_PackageModFactor");
			
			try{
				se.log().logTestStep("Crime_Endorsements_Details");
				test.log(LogStatus.INFO, "Crime_Endorsements_Details page","Transaction Step : "+transaction + "<br>" +"Page : Crime_Endorsements_Details");
				se.verify().verifyEquals("Crime_Endorsements_Details Page of PowerWriter ",getCrime_Endorsements_LabelName().isDisplayed(), true, true, test);
				
				
				
				if((strCrime_Endorsements_BTN_ADD.equalsIgnoreCase("Yes"))){
					se.element().Click(getCrime_Endorsements_BTN_Add(strCrime_Endorsements_BTN_ADD),test);
					}
					if((strCrime_Endorsements_BTN_Details.equalsIgnoreCase("Yes"))){
					se.element().tryClick(getCrime_Endorsements_BTN_Details(strCrime_Endorsements_BTN_Details),test);
					}
				
				if(!strCrime_Endorsements_TXT_FormName.equalsIgnoreCase("N/A") && !strCrime_Endorsements_TXT_FormName.contains("validate2")) {
					se.element().clickSearchIcon(getCrime_Endorsements_BTN_FormNameSearch(),test);
					if(!strCrime_Endorsements_TXT_FormNameSearchDisplay.equalsIgnoreCase("N/A")){
					
					se.element().enterOrValidateText(getCrime_Endorsements_TXT_FormNameSearchFilter(),strCrime_Endorsements_TXT_FormName,test);
					if(!strCrime_Endorsements_TXT_FormNameInsuringAgreement.equalsIgnoreCase("N/A")) {
						se.element().enterOrValidateText(getCrime_Endorsements_TXT_FormNameInsuringAgreement(),strCrime_Endorsements_TXT_FormNameInsuringAgreement,test);
					}
					se.element().Click(getSearch(),test);
					}
					se.element().clickelement(getCrime_Endorsements_LNK_FormNameInsuringAgreementOption(strCrime_Endorsements_TXT_FormNameInsuringAgreement,strCrime_Endorsements_TXT_FormName),strCrime_Endorsements_TXT_FormName,test);
				}else {
					se.element().enterOrValidateText(getCrime_Endorsements_TXT_FormName(strCrime_Endorsements_TXT_FormName),strCrime_Endorsements_TXT_FormName,test);	
				}
				
				
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_FormNumber(strCrime_Endorsements_TXT_FormNumber),strCrime_Endorsements_TXT_FormNumber,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_LocationNo(strCrime_Endorsements_TXT_LocationNo),strCrime_Endorsements_TXT_LocationNo,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_Name(strCrime_Endorsements_TXT_Name),strCrime_Endorsements_TXT_Name,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_Description(strCrime_Endorsements_TXT_Description),strCrime_Endorsements_TXT_Description,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_Street1(strCrime_Endorsements_TXT_Street1),strCrime_Endorsements_TXT_Street1,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_Street2(strCrime_Endorsements_TXT_Street2),strCrime_Endorsements_TXT_Street2,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_City(strCrime_Endorsements_TXT_City),strCrime_Endorsements_TXT_City,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_State(strCrime_Endorsements_TXT_State),strCrime_Endorsements_TXT_State,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_Zip(strCrime_Endorsements_TXT_Zip),strCrime_Endorsements_TXT_Zip,test);
				
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_BurglarAlarmSystem(strCrime_Endorsements_CHK_BurglarAlarmSystem),strCrime_Endorsements_CHK_BurglarAlarmSystem,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_NameOfAlarmCompany(strCrime_Endorsements_TXT_NameOfAlarmCompany ),strCrime_Endorsements_TXT_NameOfAlarmCompany ,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_ULClassification(strCrime_Endorsements_TXT_ULClassification),strCrime_Endorsements_TXT_ULClassification,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_AlarmCompHasKeysYes(strCrime_Endorsements_CHK_AlarmCompHasKeysYes),strCrime_Endorsements_CHK_AlarmCompHasKeysYes,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_AlarmCompHasKeysNo(strCrime_Endorsements_CHK_AlarmCompHasKeysNo),strCrime_Endorsements_CHK_AlarmCompHasKeysNo,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_TypeOfAlarmPremises(strCrime_Endorsements_CHK_TypeOfAlarmPremises),strCrime_Endorsements_CHK_TypeOfAlarmPremises,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_TypeOfAlarmSafeorVault(strCrime_Endorsements_CHK_TypeOfAlarmSafeorVault),strCrime_Endorsements_CHK_TypeOfAlarmSafeorVault,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_CertificateNo(strCrime_Endorsements_TXT_CertificateNo),strCrime_Endorsements_TXT_CertificateNo,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_Eff(strCrime_Endorsements_TXT_Eff),strCrime_Endorsements_TXT_Eff,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_Exp(strCrime_Endorsements_TXT_Exp),strCrime_Endorsements_TXT_Exp,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_OutsideCentralStationYes(strCrime_Endorsements_CHK_OutsideCentralStationYes),strCrime_Endorsements_CHK_OutsideCentralStationYes,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_OutsideCentralStationNo(strCrime_Endorsements_CHK_OutsideCentralStationNo),strCrime_Endorsements_CHK_OutsideCentralStationNo,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_OutsideGongYes(strCrime_Endorsements_CHK_OutsideGongYes),strCrime_Endorsements_CHK_OutsideGongYes,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_OutsideGongNo(strCrime_Endorsements_CHK_OutsideGongNo),strCrime_Endorsements_CHK_OutsideGongNo,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_PrivateWatchpersons(strCrime_Endorsements_CHK_PrivateWatchpersons),strCrime_Endorsements_CHK_PrivateWatchpersons,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_StateNumOfPrivateWatchPersons(strCrime_Endorsements_TXT_StateNumOfPrivateWatchPersons),strCrime_Endorsements_TXT_StateNumOfPrivateWatchPersons,test);
				
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_RegistorAtleastHourlyOnClockYes(strCrime_Endorsements_CHK_RegistorAtleastHourlyOnClockYes),strCrime_Endorsements_CHK_RegistorAtleastHourlyOnClockYes,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_RegistorAtleastHourlyOnClockNo(strCrime_Endorsements_CHK_RegistorAtleastHourlyOnClockNo),strCrime_Endorsements_CHK_RegistorAtleastHourlyOnClockNo,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_SignalCentralStationYes(strCrime_Endorsements_CHK_SignalCentralStationYes),strCrime_Endorsements_CHK_SignalCentralStationYes,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_SignalCentralStationNo(strCrime_Endorsements_CHK_SignalCentralStationNo),strCrime_Endorsements_CHK_SignalCentralStationNo,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_AtleastHourlyYes(strCrime_Endorsements_CHK_AtleastHourlyYes),strCrime_Endorsements_CHK_AtleastHourlyYes,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_AtleastHourlyNo(strCrime_Endorsements_CHK_AtleastHourlyNo),strCrime_Endorsements_CHK_AtleastHourlyNo,test);
				
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_ThePremIsEquipwithBullestResistAlarmSystem(strCrime_Endorsements_CHK_ThePremIsEquipwithBullestResistAlarmSystem),strCrime_Endorsements_CHK_ThePremIsEquipwithBullestResistAlarmSystem,test);
				
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_Guards(strCrime_Endorsements_CHK_Guards),strCrime_Endorsements_CHK_Guards,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_StateNumGuardsWillBeInsidePremises(strCrime_Endorsements_TXT_StateNumGuardsWillBeInsidePremises),strCrime_Endorsements_TXT_StateNumGuardsWillBeInsidePremises,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_ThePremIsEquippedwithHoldupAlarm(strCrime_Endorsements_CHK_ThePremIsEquippedwithHoldupAlarm),strCrime_Endorsements_CHK_ThePremIsEquippedwithHoldupAlarm,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_ACentralStation(strCrime_Endorsements_CHK_ACentralStation),strCrime_Endorsements_CHK_ACentralStation,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_APoliceStationWithRegPoliceOff(strCrime_Endorsements_CHK_APoliceStationWithRegPoliceOff),strCrime_Endorsements_CHK_APoliceStationWithRegPoliceOff,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_ALocalGong(strCrime_Endorsements_CHK_ALocalGong),strCrime_Endorsements_CHK_ALocalGong,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_InsuredInfo(strCrime_Endorsements_CHK_InsuredInfo),strCrime_Endorsements_CHK_InsuredInfo,test);
				se.element().checkUncheckOrValidate(getCrime_Endorsements_CHK_CoveredPropWillBeConveyedOutsidePrem(strCrime_Endorsements_CHK_CoveredPropWillBeConveyedOutsidePrem),strCrime_Endorsements_CHK_CoveredPropWillBeConveyedOutsidePrem,test);
				
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_CoverageIndicator(strCrime_Endorsements_TXT_CoverageIndicator),strCrime_Endorsements_TXT_CoverageIndicator,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_SpecifiedProperty(strCrime_Endorsements_TXT_SpecifiedProperty),strCrime_Endorsements_TXT_SpecifiedProperty,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_NameOfAgent(strCrime_Endorsements_TXT_NameOfAgent),strCrime_Endorsements_TXT_NameOfAgent,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_ServicePerformedForYou(strCrime_Endorsements_TXT_ServicePerformedForYou),strCrime_Endorsements_TXT_ServicePerformedForYou,test);

				se.element().enterOrValidateText(getCrime_Endorsements_TXT_Limit(strCrime_Endorsements_TXT_Limit),strCrime_Endorsements_TXT_Limit,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_LimitPerGuest(strCrime_Endorsements_TXT_LimitPerGuest),strCrime_Endorsements_TXT_LimitPerGuest,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_LimitPerOccurence(strCrime_Endorsements_TXT_LimitPerOccurence),strCrime_Endorsements_TXT_LimitPerOccurence,test);
				
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_InsuringAgreement(strCrime_Endorsements_TXT_InsuringAgreement),strCrime_Endorsements_TXT_InsuringAgreement,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_NumberOfAgents(strCrime_Endorsements_TXT_NumberOfAgents),strCrime_Endorsements_TXT_NumberOfAgents,test);
				
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_NumberOfPremises(strCrime_Endorsements_TXT_NumberOfPremises),strCrime_Endorsements_TXT_NumberOfPremises,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_DecreasedLimit(strCrime_Endorsements_TXT_DecreasedLimit),strCrime_Endorsements_TXT_DecreasedLimit,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_CoveredInstruments(strCrime_Endorsements_TXT_CoveredInstruments),strCrime_Endorsements_TXT_CoveredInstruments,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_NumberOfCardHolders(strCrime_Endorsements_TXT_NuberOfCardholders),strCrime_Endorsements_TXT_NuberOfCardholders,test);
				
				/*if(!strCrime_Endorsements_TXT_ClassCode.equalsIgnoreCase("N/A") && !strCrime_Endorsements_TXT_ClassCode.contains("validate2")) {
					se.element().clickSearchIcon(getCrime_Endorsements_BTN_ClassCodeSearch(),test);
					se.element().enterOrValidateText(getCrime_Endorsements_TXT_ClassCodeSearchFilter(),strCrime_Endorsements_TXT_ClassCode,test);
					if(!strCrime_Endorsements_TXT_ClassDescPopup.equalsIgnoreCase("N/A")) {
						se.element().enterOrValidateText(getCrime_Endorsements_TXT_ClassCodeClassDescriptionFilter(),strCrime_Endorsements_TXT_ClassDescPopup,test);
					}
					se.element().Click(getSearch(),test);
					se.element().clickelement(getCrime_Endorsements_LNK_ClassCodeOption(strCrime_Endorsements_TXT_ClassCode),strCrime_Endorsements_TXT_ClassCode,test);
				}else {
					se.element().enterOrValidateText(getCrime_Endorsements_TXT_ClassCode(strCrime_Endorsements_TXT_ClassCode),strCrime_Endorsements_TXT_ClassCode,test);	
				}*/
				se.element().selectClasscode(getCrime_Endorsements_TXT_ClassCode(strCrime_Endorsements_TXT_ClassCode), "Yes", strCrime_Endorsements_TXT_ClassCode, strCrime_Endorsements_TXT_ClassDescPopup, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_ClassDescription(strCrime_Endorsements_TXT_ClassDescription),strCrime_Endorsements_TXT_ClassDescription,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_MajorIndustryGroup(strCrime_Endorsements_TXT_MajorIndustryGroup),strCrime_Endorsements_TXT_MajorIndustryGroup,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_PredominantActivity(strCrime_Endorsements_TXT_PredominantActivity),strCrime_Endorsements_TXT_PredominantActivity,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_TotalNumberOfPartners(strCrime_Endorsements_TXT_TotalNumberOfPartners),strCrime_Endorsements_TXT_TotalNumberOfPartners,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_CoveredLossPercent(strCrime_Endorsements_TXT_CoveredLossPercent),strCrime_Endorsements_TXT_CoveredLossPercent,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_PackageModFactor(strCrime_Endorsements_TXT_PackageModFactor),strCrime_Endorsements_TXT_PackageModFactor,test);
				se.element().enterOrValidateText(getCrime_Endorsements_TXT_AggregateLimitfactor(strCrime_Endorsements_TXT_AggregateLimitfactor),strCrime_Endorsements_TXT_AggregateLimitfactor,test);
				
				se.element().Click(getNext(),test);
				
				if((strCrime_Endorsements_BTN_Done.equalsIgnoreCase("Yes"))){
					
					se.element().Click(getDone(),test);
				}
				
				
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for Crime_Endorsements_Details ", true, false, true, test);
			}
			iteration++;
		}
	
}
catch (Exception e) {
	// TODO: handle exception
	se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
	test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
	Assert.fail("Failing the test case");
}
	
}

	
	public void deleteFormCR2010(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{	
		List<Map<String, String>> table = ExcelOperations.getPagesData("Crime_Endorsements", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			try{
				String Crime_Endorsement_BTN_Delete = (String) row.get("Crime_Endorsements_BTN_Delete");
				String strCrime_Endorsements_BTN_Done = (String) row.get("Crime_Endorsements_BTN_Done");
			
				if(Crime_Endorsement_BTN_Delete.equalsIgnoreCase(constants.Yes)){
					se.element().checkUncheckOrValidate(getCommon_CHK_Select_Item_From_List("1"),"Check",test);
					se.element().Click(getCommon_BTN_Delete(), test);
				}
				
				if((strCrime_Endorsements_BTN_Done.equalsIgnoreCase("Yes"))){
					se.element().waitForElementIsDisplayed(common_btn_Done);
					se.element().Click(getDone(),test);
				}
				
				
			}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for Crime_Endorsements_Details ", true, false, true, test);
			}
			iteration++;
		}
	}
		catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Failed", "Issue in the Crime Ensorsements page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			testTearDown(se, test);
		}	
}
	public void clickDone(ExtentTest test) throws IOException{
		se.verify().verifyEquals("Crime_Endorsements_Details Page of PowerWriter ",getCrime_Endorsements_LabelName().isDisplayed(), true, true, test);
		se.element().Click(getDone(),test);
	}
}
