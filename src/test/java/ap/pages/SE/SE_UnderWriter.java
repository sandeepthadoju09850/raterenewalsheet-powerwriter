package ap.pages.SE;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class SE_UnderWriter extends BL_OR_CP {
	public void SE_UnderWriter_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.UnderwritingQuestions)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.UnderwritingQuestions, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			//String strUW_RBTN_Anypolicyorcoveragedeclined_Yes = (String) row.get("UW_RBTN_Anypolicyorcoveragedeclined_Yes");
			//String strUW_RBTN_Anypolicyorcoveragedeclined_No = (String) row.get("UW_RBTN_Anypolicyorcoveragedeclined_No");
			String strUW_CHK_WillApplicantBeProvidingTrans_Yes = (String) row.get("UW_CHK_WillApplicantBeProvidingTrans_Yes");
			String strUW_CHK_WillApplicantBeProvidingTrans_No = (String) row.get("UW_CHK_WillApplicantBeProvidingTrans_No");
			String strUW_CHK_Hastheapplicanthosted_Yes = (String) row.get("UW_CHK_Hastheapplicanthosted_Yes");
			String strUW_CHK_Hastheapplicanthosted_No = (String) row.get("UW_CHK_Hastheapplicanthosted_No");
			String strUW_TXT_HastheApplicantEverBeenCited = (String) row.get("UW_TXT_HastheApplicantEverBeenCited");
			String strUW_CHK_Atpreviouseventshavethere_Yes = (String) row.get("UW_CHK_Atpreviouseventshavethere_Yes");
			String strUW_CHK_Atpreviouseventshavethere_No = (String) row.get("UW_CHK_Atpreviouseventshavethere_No");
			String strUW_CHK_WilltheServersbelicensed_Yes  = (String) row.get("UW_CHK_WilltheServersbelicensed_Yes");
			String strUW_CHK_WilltheServersbelicensed_No = (String) row.get("UW_CHK_WilltheServersbelicensed_No");
			String strUW_CHK_Isaliquorlicenserequired_Yes  = (String) row.get("UW_CHK_Isaliquorlicenserequired_Yes");
			String strUW_CHK_Isaliquorlicenserequired_No = (String) row.get("UW_CHK_Isaliquorlicenserequired_No");
			String strUW_CHK_WillIDbecheckedbefore_No = (String) row.get("UW_CHK_WillIDbecheckedbefore_No");
			String strUW_CHK_WillIDbecheckedbefore_Yes = (String) row.get("UW_CHK_WillIDbecheckedbefore_Yes");
			String strUW_CHK_Willtherebeadoublefence_Yes= (String) row.get("UW_CHK_WillIDbecheckedbefore_Yes");
			String strUW_CHK_Willtherebeadoublefence_No= (String) row.get("UW_CHK_WillIDbecheckedbefore_No");
			String strUW_CHK_Willlawenforcementorsecurity_No= (String) row.get("UW_CHK_Willlawenforcementorsecurity_No");
			String strUW_CHK_Willlawenforcementorsecurity_Yes= (String) row.get("UW_CHK_Willlawenforcementorsecurity_Yes");
			String strUW_CHK_Arespectatorsallowedtocamp_Yes= (String) row.get("UW_CHK_Arespectatorsallowedtocamp_Yes");
			String strUW_CHK_Arespectatorsallowedtocamp_No= (String) row.get("UW_CHK_Arespectatorsallowedtocamp_No");
			String strUW_CHK_Isthereabarrierbetween_Yes= (String) row.get("UW_CHK_Isthereabarrierbetween_Yes");
			String strUW_CHK_Isthereabarrierbetween_No= (String) row.get("UW_CHK_Isthereabarrierbetween_No");
			String strUW_TXT_TypeOfBarrierused = (String) row.get("UW_TXT_TypeOfBarrierused");
			String strUW_Radio_SPELossesInPast = (String) row.get("UW_Radio_SPELossesInPast");
			
			String strUW_TXT_TheAmountOfDistanceBetweenSpectators = (String) row.get("UW_TXT_TheAmountOfDistanceBetweenSpectators");
			String strUW_CHK_Areallparticipantsrequired_Yes = (String) row.get("UW_CHK_Areallparticipantsrequired_Yes");
			String strUW_CHK_Areallparticipantsrequired_No = (String) row.get("UW_CHK_Areallparticipantsrequired_No");
			String strUW_CHK_Willlawenforcement_Yes = (String) row.get("UW_CHK_Willlawenforcement_Yes");
			String strUW_CHK_Willlawenforcement_Explain = (String) row.get("UW_CHK_Willlawenforcement_Explain");
			String strUW_CHK_Willlawenforcement_No = (String) row.get("UW_CHK_Willlawenforcement_No");
			String strUW_CHK_Willapplicantuseanymobile_Yes = (String) row.get("UW_CHK_Willapplicantuseanymobile_Yes");
			String strUW_CHK_Willapplicantuseanymobile_No = (String) row.get("UW_CHK_Willapplicantuseanymobile_No");
			String strUW_TXT_Whattypeofmobileequipment = (String) row.get("UW_TXT_Whattypeofmobileequipment");
			String strUW_TXT_Howmanyofeachtype = (String) row.get("UW_TXT_Howmanyofeachtype");
			String strUW_TXT_Describetheuse = (String) row.get("UW_TXT_Describetheuse");
			String strUW_CHK_WillTheMobileEquipment_Yes = (String) row.get("UW_CHK_WillTheMobileEquipment_Yes");
			String strUW_CHK_WillTheMobileEquipment_No = (String) row.get("UW_CHK_WillTheMobileEquipment_No");
			String strUW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_No = (String) row.get("UW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_No");
			String strUW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_Yes = (String) row.get("UW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_Yes");
			String strUW_CHK_IsThereAHandWashingStation_Yes = (String) row.get("UW_CHK_IsThereAHandWashingStation_Yes");
			String strUW_CHK_IsThereAHandWashingStation_No = (String) row.get("UW_CHK_IsThereAHandWashingStation_No");
			String strUW_CHK_Willtheapplicantbeoperatingawagon_Yes = (String) row.get("UW_CHK_Willtheapplicantbeoperatingawagon_Yes");
			String strUW_CHK_Willtheapplicantbeoperatingawagon_No = (String) row.get("UW_CHK_Willtheapplicantbeoperatingawagon_No");
			String strUW_CHK_WillItHaveFourSides_Yes = (String) row.get("UW_CHK_WillItHaveFourSides_Yes");
			String strUW_CHK_WillItHaveFourSides_No = (String) row.get("UW_CHK_WillItHaveFourSides_No");
			String strUW_TXT_NumberOfWagons = (String) row.get("UW_TXT_NumberOfWagons");
			String strUW_CHK_DoesTheTravelRoute_Yes = (String) row.get("UW_CHK_DoesTheTravelRoute_Yes");
			String strUW_CHK_DoesTheTravelRoute_No = (String) row.get("UW_CHK_DoesTheTravelRoute_No");
			String strUW_CHK_Willtheapplicantbeoperatingatriathlon_Yes = (String) row.get("UW_CHK_Willtheapplicantbeoperatingatriathlon_Yes");
			String strUW_CHK_Willtheapplicantbeoperatingatriathlon_No = (String) row.get("UW_CHK_Willtheapplicantbeoperatingatriathlon_No");
			String strUW_CHK_IsTheEventSanc_Yes = (String) row.get("UW_CHK_IsTheEventSanc_Yes");
			String strUW_CHK_IsTheEventSanc_No = (String) row.get("UW_CHK_IsTheEventSanc_No");
			String strUW_CHK_AreWetsuitsReq_Yes = (String) row.get("UW_CHK_AreWetsuitsReq_Yes");
			String strUW_CHK_AreWetsuitsReq_No = (String) row.get("UW_CHK_AreWetsuitsReq_No");
			String strUW_CHK_Areallvendorsorexhibitors_Yes = (String) row.get("UW_CHK_Areallvendorsorexhibitors_Yes");
			String strUW_CHK_Areallvendorsorexhibitors_No = (String) row.get("UW_CHK_Areallvendorsorexhibitors_No");
			String strUW_CHK_WillEmergencyMedicalSystems_Yes = (String) row.get("UW_CHK_WillEmergencyMedicalSystems_Yes");
			String strUW_CHK_WillEmergencyMedicalSystems_No = (String) row.get("UW_CHK_WillEmergencyMedicalSystems_No");
			String strUW_CHK_Hasthiseventbeenheldpreviously_Yes = (String) row.get("UW_CHK_Hasthiseventbeenheldpreviously_Yes");
			String strUW_CHK_Hasthiseventbeenheldpreviously_No = (String) row.get("UW_CHK_Hasthiseventbeenheldpreviously_No");
			String strUW_CHK_ThisEventWasnot_Yes = (String) row.get("UW_CHK_ThisEventWasnot_Yes");
			String strUW_CHK_ThisEventWasnot_No = (String) row.get("UW_CHK_ThisEventWasnot_No");
			String strUW_TXT_NameOfPriorInsurance = (String) row.get("UW_TXT_NameOfPriorInsurance");
			String strUW_TXT_PremiumPaid = (String) row.get("UW_TXT_PremiumPaid");
			//Will the exhibit be inspected by the fire department question is missing.
			//Does the applicant have a written plan question is missing
			//Will there be portable fire extinguishers question is missing
			//Are tour guides inside the haunted house question is missing
			//Will there be candles or pyrotechnics question is missing
			//Will there be slides? question is missing
			String strUW_CHK_Isthereanyinoronwateractivities_Yes = (String) row.get("UW_CHK_Isthereanyinoronwateractivities_Yes");
			String strUW_CHK_Isthereanyinoronwateractivities_No = (String) row.get("UW_CHK_Isthereanyinoronwateractivities_No");
			String strUW_CHK_WillvendorsberequiredtoprovideCOI_Yes = (String) row.get("UW_CHK_WillvendorsberequiredtoprovideCOI_Yes");
			String strUW_CHK_WillvendorsberequiredtoprovideCOI_No = (String) row.get("UW_CHK_WillvendorsberequiredtoprovideCOI_No");
			String strUW_CHK_WillEventBeUsingPublicRoads_Yes = (String) row.get("UW_CHK_WillEventBeUsingPublicRoads_Yes");
			String strUW_CHK_WillEventBeUsingPublicRoads_No = (String) row.get("UW_CHK_WillEventBeUsingPublicRoads_No");
			//Are there multiple stops during ride? question missing
			String strUW_CHK_Arethereanyinflatablesattheevent_Yes = (String) row.get("UW_CHK_Arethereanyinflatablesattheevent_Yes");
			String strUW_CHK_Arethereanyinflatablesattheevent_No = (String) row.get("UW_CHK_Arethereanyinflatablesattheevent_No");
			String strUW_CHK_AreThereBarriersOrGuard_Yes = (String) row.get("UW_CHK_AreThereBarriersOrGuard_Yes");
			String strUW_CHK_AreThereBarriersOrGuard_No = (String) row.get("UW_CHK_AreThereBarriersOrGuard_No");
			String strUW_CHK_AreWarningSignspostedToAdvice_Yes = (String) row.get("UW_CHK_AreWarningSignspostedToAdvice_Yes");
			String strUW_CHK_AreWarningSignspostedToAdvice_No = (String) row.get("UW_CHK_AreWarningSignspostedToAdvice_No");
			String strUW_CHK_IsThereACrowdControl_Yes = (String) row.get("UW_CHK_IsThereACrowdControl_Yes");
			String strUW_CHK_IsThereACrowdControl_No = (String) row.get("UW_CHK_IsThereACrowdControl_No");
			String strUW_CHK_AreSpectatorsAtAnyTime_Yes = (String) row.get("UW_CHK_AreSpectatorsAtAnyTime_Yes");
			String strUW_CHK_AreSpectatorsAtAnyTime_No = (String) row.get("UW_CHK_AreSpectatorsAtAnyTime_No");
			String strUW_CHK_Arespectatorsallowed_Yes = (String) row.get("UW_CHK_Arespectatorsallowed_Yes");
			String strUW_CHK_Arespectatorsallowed_No = (String) row.get("UW_CHK_Arespectatorsallowed_No");
			String strUW_CHK_AreWaiversAndReleaseRequired_Yes = (String) row.get("UW_CHK_AreWaiversAndReleaseRequired_Yes");
			String strUW_CHK_AreWaiversAndReleaseRequired_No = (String) row.get("UW_CHK_AreWaiversAndReleaseRequired_No");
			String strUW_CHK_IsSecurityProvidedToEnforce_Yes = (String) row.get("UW_CHK_IsSecurityProvidedToEnforce_Yes");
			String strUW_CHK_IsSecurityProvidedToEnforce_No = (String) row.get("UW_CHK_IsSecurityProvidedToEnforce_No");
			String strUW_TXT_MaximumSpeedAttainable = (String) row.get("UW_TXT_MaximumSpeedAttainable");
			
			
			/*String strUW_CHK_Anypolicyorcoveragedeclined_Yes = (String) row.get("UW_CHK_Anypolicyorcoveragedeclined_Yes");
			String strUW_CHK_Anypolicyorcoveragedeclined_Explain = (String) row.get("UW_CHK_Anypolicyorcoveragedeclined_Explain");
			String strUW_CHK_Anypolicyorcoveragedeclined_No = (String) row.get("UW_CHK_Anypolicyorcoveragedeclined_No");*/
			String strUW_CHK_Isthereabarrier_Yes = (String) row.get("UW_CHK_Isthereabarrier_Yes");
			String strUW_CHK_Isthereabarrier_No = (String) row.get("UW_CHK_Isthereabarrier_No");
			//String strUW_CHK_WillapplicantbeoperatingParade_Yes = (String) row.get("UW_CHK_WillapplicantbeoperatingParade_Yes");
			//String strUW_CHK_WillapplicantbeoperatingParade_No = (String) row.get("UW_CHK_WillapplicantbeoperatingParade_No");
			//String strUW_CHK_Willtheapplicantbeoperatingadunktank_Yes = (String) row.get("UW_CHK_Willtheapplicantbeoperatingadunktank_Yes");
			//String strUW_CHK_Willtheapplicantbeoperatingadunktank_NO = (String) row.get("UW_CHK_Willtheapplicantbeoperatingadunktank_NO");
			//String strUW_CHK_Willtheapplicantbeoperatingapetting_Yes = (String) row.get("UW_CHK_Willtheapplicantbeoperatingapetting_Yes");
			//String strUW_CHK_Willtheapplicantbeoperatingapetting_No = (String) row.get("UW_CHK_Willtheapplicantbeoperatingapetting_No");
			//String strUW_CHK_ArethereanyAdditionalInsureds_Yes = (String) row.get("UW_CHK_ArethereanyAdditionalInsureds_Yes");
			//String strUW_CHK_ArethereanyAdditionalInsureds_No = (String) row.get("UW_CHK_ArethereanyAdditionalInsureds_No");
			//String strUW_TXT_PleaseProvideAddInfoForEach = (String) row.get("UW_TXT_PleaseProvideAddInfoForEach");
			//String strUW_CHK_Areanyprofessionalgolfers_Yes = (String) row.get("UW_CHK_Areanyprofessionalgolfers_Yes");
			//String strUW_CHK_Areanyprofessionalgolfers_No = (String) row.get("UW_CHK_Areanyprofessionalgolfers_No");
			//String strUW_CHK_Willtheapplicantliketopurchase_Yes = (String) row.get("UW_CHK_Willtheapplicantliketopurchase_Yes");
			//String strUW_CHK_Willtheapplicantliketopurchase_No = (String) row.get("UW_CHK_Willtheapplicantliketopurchase_No");
			//String strUW_TXT_WhatHoleNumbersIsRequestedForReinstatement = (String) row.get("UW_TXT_WhatHoleNumbersIsRequestedForReinstatement");
			String strUW_CHK_Areallparticipantsrequiredtosignwaivers_Yes= (String) row.get("UW_CHK_Areallparticipantsrequiredtosignwaivers_Yes");
			String strUW_CHK_Areallparticipantsrequiredtosignwaivers_No= (String) row.get("UW_CHK_Areallparticipantsrequiredtosignwaivers_No");
			//String strUW_CHK_IsGrandstandSeating_Yes = (String) row.get("UW_CHK_IsGrandstandSeating_Yes");
			//String strUW_CHK_IsGrandstandSeating_No = (String) row.get("UW_CHK_IsGrandstandSeating_No");
			String strUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Yes = (String) row.get("UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Yes");
			String strUW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Explanation = (String) row.get("UW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Explanation");
			String strUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_No = (String) row.get("UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_No");
			String strUW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_Yes =(String) row.get("UW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_Yes");
			String strUW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_No =(String) row.get("UW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_No");
			String strUW_CHK_WillTheEventIncludeParade_Yes =(String) row.get("UW_CHK_WillTheEventIncludeParade_Yes");
			String strUW_CHK_WillTheEventIncludeParade_No =(String) row.get("UW_CHK_WillTheEventIncludeParade_No");
			String strUW_CHK_WillThrowingCandyBeAllowed_Yes = (String) row.get("UW_CHK_WillThrowingCandyBeAllowed_Yes");
			String strUW_CHK_WillThrowingCandyBeAllowed_No = (String) row.get("UW_CHK_WillThrowingCandyBeAllowed_No");
			String strUW_TXT_HowManyUnitsWill = (String) row.get("UW_TXT_HowManyUnitsWill");
			String strUW_CHK_WillTheEventIncludeDunkTank_Yes = (String) row.get("UW_CHK_WillTheEventIncludeDunkTank_Yes");
			String strUW_CHK_WillTheEventIncludeDunkTank_No = (String) row.get("UW_CHK_WillTheEventIncludeDunkTank_No");
			String strUW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_Yes = (String) row.get("UW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_Yes");
			String strUW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_No = (String) row.get("UW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_No");
			String strUW_CHK_WillTheEventIncludePettingzoo_Yes = (String) row.get("UW_CHK_WillTheEventIncludePettingzoo_Yes");
			String strUW_CHK_WillTheEventIncludePettingzoo_No = (String) row.get("UW_CHK_WillTheEventIncludePettingzoo_No");
			String strUW_CHK_NoneAtEvent = (String) row.get("UW_CHK_NoneAtEvent");
			
			
			
			
			try
			{
				se.log().logTestStep("SE_UnderWriter_Details");
				test.log(LogStatus.INFO, "SE_UnderWriter_Details","Transaction Step : "+transaction + "<br>" +"Page : SE_UnderWriter_Details");
				se.verify().verifyEquals("SE_UnderWriter_Details  of AgencyPortal ", getUnderWritterSE_label().isDisplayed(),true, true,test);
				se.element().checkUncheckOrValidate(getUW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_Yes(strUW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_Yes),strUW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_Yes,test);
				se.element().checkUncheckOrValidate(getUW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTree_No(strUW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_No),strUW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_No,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Yes(strUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Yes),strUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Yes,test);
				se.element().enterOrValidateText( getUW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Explanation(strUW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Explanation),strUW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Explanation,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_No(strUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_No),strUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_No,test);
				/*se.element().checkUncheckOrValidate( getUW_CHK_Anypolicyorcoveragedeclined_Yes(strUW_CHK_Anypolicyorcoveragedeclined_Yes),strUW_CHK_Anypolicyorcoveragedeclined_Yes,test);
				se.element().enterOrValidateText( getUW_CHK_Anypolicyorcoveragedeclined_Explain(strUW_CHK_Anypolicyorcoveragedeclined_Explain),strUW_CHK_Anypolicyorcoveragedeclined_Explain,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Anypolicyorcoveragedeclined_No(strUW_CHK_Anypolicyorcoveragedeclined_No),strUW_CHK_Anypolicyorcoveragedeclined_No,test);
				*/se.element().checkUncheckOrValidate( getUW_CHK_WillApplicantBeProvidingTrans_Yes(strUW_CHK_WillApplicantBeProvidingTrans_Yes),strUW_CHK_WillApplicantBeProvidingTrans_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillApplicantBeProvidingTrans_No(strUW_CHK_WillApplicantBeProvidingTrans_No),strUW_CHK_WillApplicantBeProvidingTrans_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Arespectatorsallowed_Yes(strUW_CHK_Arespectatorsallowed_Yes),strUW_CHK_Arespectatorsallowed_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Arespectatorsallowed_No(strUW_CHK_Arespectatorsallowed_No),strUW_CHK_Arespectatorsallowed_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Isthereabarrier_Yes(strUW_CHK_Isthereabarrier_Yes),strUW_CHK_Isthereabarrier_Yes,test);
				se.element().enterOrValidateText(getUW_TXT_Howmanyofeachtype(strUW_TXT_Howmanyofeachtype),strUW_TXT_Howmanyofeachtype,test);
				se.element().enterOrValidateText(getUW_TXT_Howmanyofeachtype(strUW_TXT_Describetheuse),strUW_TXT_Describetheuse,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Isthereabarrier_No(strUW_CHK_Isthereabarrier_No),strUW_CHK_Isthereabarrier_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Areallparticipantsrequired_Yes(strUW_CHK_Areallparticipantsrequired_Yes),strUW_CHK_Areallparticipantsrequired_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Areallparticipantsrequired_No(strUW_CHK_Areallparticipantsrequired_No),strUW_CHK_Areallparticipantsrequired_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Willlawenforcement_Yes(strUW_CHK_Willlawenforcement_Yes),strUW_CHK_Willlawenforcement_Yes,test);
				se.element().enterOrValidateText( getUW_CHK_Willlawenforcement_Explain(strUW_CHK_Willlawenforcement_Explain),strUW_CHK_Willlawenforcement_Explain,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Willlawenforcement_No(strUW_CHK_Willlawenforcement_No),strUW_CHK_Willlawenforcement_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Willapplicantuseanymobile_Yes(strUW_CHK_Willapplicantuseanymobile_Yes),strUW_CHK_Willapplicantuseanymobile_Yes,test);
				se.element().enterOrValidateText(getUW_TXT_Whattypeofmobileequipment(strUW_TXT_Whattypeofmobileequipment),strUW_TXT_Whattypeofmobileequipment,test);
				se.element().enterOrValidateText(getUW_TXT_TypeOfBarrierused(strUW_TXT_TypeOfBarrierused),strUW_TXT_TypeOfBarrierused,test);
				se.element().enterOrValidateText(getUW_TXT_TheAmountOfDistanceBetweenSpectators(strUW_TXT_TheAmountOfDistanceBetweenSpectators),strUW_TXT_TheAmountOfDistanceBetweenSpectators,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Willapplicantuseanymobile_No(strUW_CHK_Willapplicantuseanymobile_No),strUW_CHK_Willapplicantuseanymobile_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillTheMobileEquipment_Yes(strUW_CHK_WillTheMobileEquipment_Yes),strUW_CHK_WillTheMobileEquipment_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillTheMobileEquipment_No(strUW_CHK_WillTheMobileEquipment_No),strUW_CHK_WillTheMobileEquipment_No,test);
				//se.element().checkUncheckOrValidate( getUW_CHK_WillapplicantbeoperatingParade_Yes(strUW_CHK_WillapplicantbeoperatingParade_Yes),strUW_CHK_WillapplicantbeoperatingParade_Yes,test);
				//se.element().checkUncheckOrValidate( getUW_CHK_WillapplicantbeoperatingParade_No(strUW_CHK_WillapplicantbeoperatingParade_No),strUW_CHK_WillapplicantbeoperatingParade_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillTheEventIncludeParade_Yes(strUW_CHK_WillTheEventIncludeParade_Yes),strUW_CHK_WillTheEventIncludeParade_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillTheEventIncludeParade_No(strUW_CHK_WillTheEventIncludeParade_No),strUW_CHK_WillTheEventIncludeParade_No,test);	
				se.element().checkUncheckOrValidate( getUW_CHK_WillThrowingCandyBeAllowed_Yes(strUW_CHK_WillThrowingCandyBeAllowed_Yes),strUW_CHK_WillThrowingCandyBeAllowed_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillThrowingCandyBeAllowed_No(strUW_CHK_WillThrowingCandyBeAllowed_No),strUW_CHK_WillThrowingCandyBeAllowed_No,test);
				se.element().enterOrValidateText(getUW_TXT_HowManyUnitsWill(strUW_TXT_HowManyUnitsWill),strUW_TXT_HowManyUnitsWill,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillTheEventIncludeDunkTank_Yes(strUW_CHK_WillTheEventIncludeDunkTank_Yes),strUW_CHK_WillTheEventIncludeDunkTank_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillTheEventIncludeDunkTank_No(strUW_CHK_WillTheEventIncludeDunkTank_No),strUW_CHK_WillTheEventIncludeDunkTank_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_Yes(strUW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_Yes),strUW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_No(strUW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_No),strUW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillTheEventIncludePettingzoo_Yes(strUW_CHK_WillTheEventIncludePettingzoo_Yes),strUW_CHK_WillTheEventIncludePettingzoo_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillTheEventIncludePettingzoo_No(strUW_CHK_WillTheEventIncludePettingzoo_No),strUW_CHK_WillTheEventIncludePettingzoo_No,test);
				
				se.element().checkUncheckOrValidate( getUW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_Yes(strUW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_Yes),strUW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_No(strUW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_No),strUW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_No,test);
				//se.element().checkUncheckOrValidate( getUW_CHK_Willtheapplicantbeoperatingadunktank_Yes(strUW_CHK_Willtheapplicantbeoperatingadunktank_Yes),strUW_CHK_Willtheapplicantbeoperatingadunktank_Yes,test);
				//se.element().checkUncheckOrValidate( getUW_CHK_Willtheapplicantbeoperatingadunktank_NO(strUW_CHK_Willtheapplicantbeoperatingadunktank_NO),strUW_CHK_Willtheapplicantbeoperatingadunktank_NO,test);
				//se.element().checkUncheckOrValidate( getUW_CHK_Willtheapplicantbeoperatingapetting_Yes(strUW_CHK_Willtheapplicantbeoperatingapetting_Yes),strUW_CHK_Willtheapplicantbeoperatingapetting_Yes,test);
				//se.element().checkUncheckOrValidate( getUW_CHK_Willtheapplicantbeoperatingapetting_No(strUW_CHK_Willtheapplicantbeoperatingapetting_No),strUW_CHK_Willtheapplicantbeoperatingapetting_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_IsThereAHandWashingStation_Yes(strUW_CHK_IsThereAHandWashingStation_Yes),strUW_CHK_IsThereAHandWashingStation_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_IsThereAHandWashingStation_No(strUW_CHK_IsThereAHandWashingStation_No),strUW_CHK_IsThereAHandWashingStation_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Willtheapplicantbeoperatingawagon_Yes(strUW_CHK_Willtheapplicantbeoperatingawagon_Yes),strUW_CHK_Willtheapplicantbeoperatingawagon_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Willtheapplicantbeoperatingawagon_No(strUW_CHK_Willtheapplicantbeoperatingawagon_No),strUW_CHK_Willtheapplicantbeoperatingawagon_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillItHaveFourSides_Yes(strUW_CHK_WillItHaveFourSides_Yes),strUW_CHK_WillItHaveFourSides_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillItHaveFourSides_No(strUW_CHK_WillItHaveFourSides_No),strUW_CHK_WillItHaveFourSides_No,test);
				se.element().enterOrValidateText( getUW_TXT_NumberOfWagons(strUW_TXT_NumberOfWagons),strUW_TXT_NumberOfWagons,test);
				se.element().checkUncheckOrValidate( getUW_CHK_DoesTheTravelRoute_Yes(strUW_CHK_DoesTheTravelRoute_Yes),strUW_CHK_DoesTheTravelRoute_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_DoesTheTravelRoute_No(strUW_CHK_DoesTheTravelRoute_No),strUW_CHK_DoesTheTravelRoute_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Willtheapplicantbeoperatingatriathlon_Yes(strUW_CHK_Willtheapplicantbeoperatingatriathlon_Yes),strUW_CHK_Willtheapplicantbeoperatingatriathlon_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Willtheapplicantbeoperatingatriathlon_No(strUW_CHK_Willtheapplicantbeoperatingatriathlon_No),strUW_CHK_Willtheapplicantbeoperatingatriathlon_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_IsTheEventSanc_Yes(strUW_CHK_IsTheEventSanc_Yes),strUW_CHK_IsTheEventSanc_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_IsTheEventSanc_No(strUW_CHK_IsTheEventSanc_No),strUW_CHK_IsTheEventSanc_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AreWetsuitsReq_Yes(strUW_CHK_AreWetsuitsReq_Yes),strUW_CHK_AreWetsuitsReq_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AreWetsuitsReq_No(strUW_CHK_AreWetsuitsReq_No),strUW_CHK_AreWetsuitsReq_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Areallvendorsorexhibitors_Yes(strUW_CHK_Areallvendorsorexhibitors_Yes),strUW_CHK_Areallvendorsorexhibitors_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Areallvendorsorexhibitors_No(strUW_CHK_Areallvendorsorexhibitors_No),strUW_CHK_Areallvendorsorexhibitors_No,test);
				//se.element().checkUncheckOrValidate( getUW_CHK_ArethereanyAdditionalInsureds_Yes(strUW_CHK_ArethereanyAdditionalInsureds_Yes),strUW_CHK_ArethereanyAdditionalInsureds_Yes,test);
				//se.element().checkUncheckOrValidate( getUW_CHK_ArethereanyAdditionalInsureds_No(strUW_CHK_ArethereanyAdditionalInsureds_No),strUW_CHK_ArethereanyAdditionalInsureds_No,test);
				//se.element().enterOrValidateText( getUW_TXT_PleaseProvideAddInfoForEach(strUW_TXT_PleaseProvideAddInfoForEach),strUW_TXT_PleaseProvideAddInfoForEach,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillEmergencyMedicalSystems_Yes(strUW_CHK_WillEmergencyMedicalSystems_Yes),strUW_CHK_WillEmergencyMedicalSystems_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillEmergencyMedicalSystems_No(strUW_CHK_WillEmergencyMedicalSystems_No),strUW_CHK_WillEmergencyMedicalSystems_No,test);
				//se.element().checkUncheckOrValidate( getUW_CHK_Areanyprofessionalgolfers_Yes(strUW_CHK_Areanyprofessionalgolfers_Yes),strUW_CHK_Areanyprofessionalgolfers_Yes,test);
				//se.element().checkUncheckOrValidate( getUW_CHK_Areanyprofessionalgolfers_No(strUW_CHK_Areanyprofessionalgolfers_No),strUW_CHK_Areanyprofessionalgolfers_No,test);
				//se.element().checkUncheckOrValidate( getUW_CHK_Willtheapplicantliketopurchase_Yes(strUW_CHK_Willtheapplicantliketopurchase_Yes),strUW_CHK_Willtheapplicantliketopurchase_Yes,test);
				//se.element().checkUncheckOrValidate( getUW_CHK_Willtheapplicantliketopurchase_No(strUW_CHK_Willtheapplicantliketopurchase_No),strUW_CHK_Willtheapplicantliketopurchase_No,test);
				//se.element().enterOrValidateText(getUW_TXT_WhatHoleNumbersIsRequestedForReinstatement(strUW_TXT_WhatHoleNumbersIsRequestedForReinstatement),strUW_TXT_WhatHoleNumbersIsRequestedForReinstatement,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Hasthiseventbeenheldpreviously_Yes(strUW_CHK_Hasthiseventbeenheldpreviously_Yes),strUW_CHK_Hasthiseventbeenheldpreviously_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Hasthiseventbeenheldpreviously_No(strUW_CHK_Hasthiseventbeenheldpreviously_No),strUW_CHK_Hasthiseventbeenheldpreviously_No,test);
				se.element().enterOrValidateText(getUW_TXT_NameOfPriorInsurance(strUW_TXT_NameOfPriorInsurance),strUW_TXT_NameOfPriorInsurance,test);
				se.element().enterOrValidateText(getUW_TXT_PremiumPaid(strUW_TXT_PremiumPaid),strUW_TXT_PremiumPaid,test);
				se.element().checkUncheckOrValidate( getUW_CHK_ThisEventWasnot_No(strUW_CHK_ThisEventWasnot_No),strUW_CHK_ThisEventWasnot_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_ThisEventWasnot_Yes(strUW_CHK_ThisEventWasnot_Yes),strUW_CHK_ThisEventWasnot_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Isthereanyinoronwateractivities_Yes(strUW_CHK_Isthereanyinoronwateractivities_Yes),strUW_CHK_Isthereanyinoronwateractivities_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Isthereanyinoronwateractivities_No(strUW_CHK_Isthereanyinoronwateractivities_No),strUW_CHK_Isthereanyinoronwateractivities_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillvendorsberequiredtoprovideCOI_Yes(strUW_CHK_WillvendorsberequiredtoprovideCOI_Yes),strUW_CHK_WillvendorsberequiredtoprovideCOI_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillvendorsberequiredtoprovideCOI_No(strUW_CHK_WillvendorsberequiredtoprovideCOI_No),strUW_CHK_WillvendorsberequiredtoprovideCOI_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillEventBeUsingPublicRoads_Yes(strUW_CHK_WillEventBeUsingPublicRoads_Yes),strUW_CHK_WillEventBeUsingPublicRoads_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillEventBeUsingPublicRoads_No(strUW_CHK_WillEventBeUsingPublicRoads_No),strUW_CHK_WillEventBeUsingPublicRoads_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Arethereanyinflatablesattheevent_Yes(strUW_CHK_Arethereanyinflatablesattheevent_Yes),strUW_CHK_Arethereanyinflatablesattheevent_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Arethereanyinflatablesattheevent_No(strUW_CHK_Arethereanyinflatablesattheevent_No),strUW_CHK_Arethereanyinflatablesattheevent_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Hastheapplicanthosted_Yes(strUW_CHK_Hastheapplicanthosted_Yes),strUW_CHK_Hastheapplicanthosted_Yes,test);
				se.element().enterOrValidateText(getUW_TXT_HastheApplicantEverBeenCited(strUW_TXT_HastheApplicantEverBeenCited),strUW_TXT_HastheApplicantEverBeenCited,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Hastheapplicanthosted_No(strUW_CHK_Hastheapplicanthosted_No),strUW_CHK_Hastheapplicanthosted_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Atpreviouseventshavethere_Yes(strUW_CHK_Atpreviouseventshavethere_Yes),strUW_CHK_Atpreviouseventshavethere_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Atpreviouseventshavethere_No(strUW_CHK_Atpreviouseventshavethere_No),strUW_CHK_Atpreviouseventshavethere_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WilltheServersbelicensed_Yes(strUW_CHK_WilltheServersbelicensed_Yes),strUW_CHK_WilltheServersbelicensed_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WilltheServersbelicensed_No(strUW_CHK_WilltheServersbelicensed_No),strUW_CHK_WilltheServersbelicensed_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Isaliquorlicenserequired_Yes(strUW_CHK_Isaliquorlicenserequired_Yes),strUW_CHK_Isaliquorlicenserequired_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Isaliquorlicenserequired_No(strUW_CHK_Isaliquorlicenserequired_No),strUW_CHK_Isaliquorlicenserequired_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillIDbecheckedbefore_Yes(strUW_CHK_WillIDbecheckedbefore_Yes),strUW_CHK_WillIDbecheckedbefore_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_WillIDbecheckedbefore_No(strUW_CHK_WillIDbecheckedbefore_No),strUW_CHK_WillIDbecheckedbefore_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Willtherebeadoublefence_Yes(strUW_CHK_Willtherebeadoublefence_Yes),strUW_CHK_Willtherebeadoublefence_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Willtherebeadoublefence_No(strUW_CHK_Willtherebeadoublefence_No),strUW_CHK_Willtherebeadoublefence_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Willlawenforcementorsecurity_Yes(strUW_CHK_Willlawenforcementorsecurity_Yes),strUW_CHK_Willlawenforcementorsecurity_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Willlawenforcementorsecurity_No(strUW_CHK_Willlawenforcementorsecurity_No),strUW_CHK_Willlawenforcementorsecurity_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Arespectatorsallowedtocamp_Yes(strUW_CHK_Arespectatorsallowedtocamp_Yes),strUW_CHK_Arespectatorsallowedtocamp_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Arespectatorsallowedtocamp_No(strUW_CHK_Arespectatorsallowedtocamp_No),strUW_CHK_Arespectatorsallowedtocamp_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Isthereabarrierbetween_Yes(strUW_CHK_Isthereabarrierbetween_Yes),strUW_CHK_Isthereabarrierbetween_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Isthereabarrierbetween_No(strUW_CHK_Isthereabarrierbetween_No),strUW_CHK_Isthereabarrierbetween_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Areallparticipantsrequiredtosignwaivers_Yes(strUW_CHK_Areallparticipantsrequiredtosignwaivers_Yes),strUW_CHK_Areallparticipantsrequiredtosignwaivers_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Areallparticipantsrequiredtosignwaivers_No(strUW_CHK_Areallparticipantsrequiredtosignwaivers_No),strUW_CHK_Areallparticipantsrequiredtosignwaivers_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AreThereBarriersOrGuard_Yes(strUW_CHK_AreThereBarriersOrGuard_Yes),strUW_CHK_AreThereBarriersOrGuard_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AreThereBarriersOrGuard_No(strUW_CHK_AreThereBarriersOrGuard_No),strUW_CHK_AreThereBarriersOrGuard_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AreWarningSignspostedToAdvice_Yes(strUW_CHK_AreWarningSignspostedToAdvice_Yes),strUW_CHK_AreWarningSignspostedToAdvice_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AreWarningSignspostedToAdvice_No(strUW_CHK_AreWarningSignspostedToAdvice_No),strUW_CHK_AreWarningSignspostedToAdvice_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_IsThereACrowdControl_Yes(strUW_CHK_IsThereACrowdControl_Yes),strUW_CHK_IsThereACrowdControl_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_IsThereACrowdControl_No(strUW_CHK_IsThereACrowdControl_No),strUW_CHK_IsThereACrowdControl_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AreSpectatorsAtAnyTime_Yes(strUW_CHK_AreSpectatorsAtAnyTime_Yes),strUW_CHK_AreSpectatorsAtAnyTime_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AreSpectatorsAtAnyTime_No(strUW_CHK_AreSpectatorsAtAnyTime_No),strUW_CHK_AreSpectatorsAtAnyTime_No,test);
				//se.element().checkUncheckOrValidate( getUW_CHK_IsGrandstandSeating_Yes(strUW_CHK_IsGrandstandSeating_Yes),strUW_CHK_IsGrandstandSeating_Yes,test);
				//se.element().checkUncheckOrValidate( getUW_CHK_IsGrandstandSeating_No(strUW_CHK_IsGrandstandSeating_No),strUW_CHK_IsGrandstandSeating_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AreWaiversAndReleaseRequired_Yes(strUW_CHK_AreWaiversAndReleaseRequired_Yes),strUW_CHK_AreWaiversAndReleaseRequired_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AreWaiversAndReleaseRequired_No(strUW_CHK_AreWaiversAndReleaseRequired_No),strUW_CHK_AreWaiversAndReleaseRequired_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_IsSecurityProvidedToEnforce_Yes(strUW_CHK_IsSecurityProvidedToEnforce_Yes),strUW_CHK_IsSecurityProvidedToEnforce_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_IsSecurityProvidedToEnforce_No(strUW_CHK_IsSecurityProvidedToEnforce_No),strUW_CHK_IsSecurityProvidedToEnforce_No,test);
				se.element().enterOrValidateText(getUW_TXT_MaximumSpeedAttainable(strUW_TXT_MaximumSpeedAttainable),strUW_TXT_MaximumSpeedAttainable,test);
				se.element().checkUncheckOrValidate(getUW_CHK_NoneAtEvent(strUW_CHK_NoneAtEvent), strUW_CHK_NoneAtEvent, test);
				
				if(!strUW_Radio_SPELossesInPast.equals("N/A")) {
					se.element().chkElement(getUW_Radio_SPELossesInPast(strUW_Radio_SPELossesInPast), strUW_Radio_SPELossesInPast,test);
					}
				
				executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
				se.element().Click(getGI_CHK_Continue(), test);
				//if(  transaction=="NewQuote")
				//{
				//se.element().waitBasedOnCount(PleaseWaitPopup,40);
				//se.element().Click(getGI_CHK_Continue());
				//}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for SE_UnderWriter_Details ", true, false, true, test);
			}
			iteration++;
		}
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
