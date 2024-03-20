package ap.pages.CA;

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

public class CA_Underwriter extends BL_OR_CP {
	public void CA_UnderWriter_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
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
			String strUW_CHK_Anyhaulingforhire_Yes = (String) row.get("UW_CHK_Anyhaulingforhire_Yes");
			String strUW_CHK_Anyhaulingforhire_No = (String) row.get("UW_CHK_Anyhaulingforhire_No");
			String strUW_CHK_AnyhaulingforManure_Yes = (String) row.get("UW_CHK_AnyhaulingforManure_Yes");
			String strUW_CHK_AnyhaulingforManure_No = (String) row.get("UW_CHK_AnyhaulingforManure_No");
			String strUW_CHK_Doover50oftheemployees_Yes = (String) row.get("UW_CHK_Doover50oftheemployees_Yes");
			String strUW_CHK_Doover50oftheemployees_No = (String) row.get("UW_CHK_Doover50oftheemployees_No");
			String strUW_CHK_TransportingHazardousMaterial_Yes = (String) row.get("UW_CHK_TransportingHazardousMaterial_Yes");
			String strUW_CHK_TransportingHazardousMaterial_No = (String) row.get("UW_CHK_TransportingHazardousMaterial_No");
			String strUW_RBTN_UWDOTNumber_No = (String) row.get("UW_RBTN_UWDOTNumber_No");
			String strUW_CHK_Areanyvehiclesleased_Yes = (String) row.get("UW_CHK_Areanyvehiclesleased_Yes");
			String strUW_CHK_Areanyvehiclesleased_No = (String) row.get("UW_CHK_Areanyvehiclesleased_No");
			String strUW_CHK_AreAnyVehiclesPersonallyTitle_Yes = (String) row.get("UW_CHK_AreAnyVehiclesPersonallyTitle_Yes");
			String strUW_CHK_AreAnyVehiclesPersonallyTitle_No = (String) row.get("UW_CHK_AreAnyVehiclesPersonallyTitle_No");
			String strUW_CHK_AreAnyVehiclesPersonallyTitle_Explain = (String) row.get("UW_CHK_AreAnyVehiclesPersonallyTitle_Explain");
			String strUW_CHK_Anycarmodified_Yes = (String) row.get("UW_CHK_Anycarmodified_Yes");
			String strUW_CHK_Anycarmodified_No = (String) row.get("UW_CHK_Anycarmodified_No");
			String strUW_CHK_AREICC_Yes = (String) row.get("UW_CHK_AREICC_Yes");
			String strUW_CHK_AREICC_No = (String) row.get("UW_CHK_AREICC_No");
			String strUW_CHK_Anyvehiclesusedby_Yes = (String) row.get("UW_CHK_Anyvehiclesusedby_Yes");
			String strUW_CHK_Anyvehiclesusedby_No = (String) row.get("UW_CHK_Anyvehiclesusedby_No");
			String strUW_CHK_Anyvehiclesowned_Yes = (String) row.get("UW_CHK_Anyvehiclesowned_Yes");
			String strUW_CHK_Anyvehiclesowned_No = (String) row.get("UW_CHK_Anyvehiclesowned_No");
			String strUW_CHK_AnyDriver_Yes = (String) row.get("UW_CHK_AnyDriver_Yes");
			String strUW_CHK_AnyDriver_No = (String) row.get("UW_CHK_AnyDriver_No");
			String strUW_CHK_Doesapplicanthaveotherbusiness_Yes = (String) row.get("UW_CHK_Doesapplicanthaveotherbusiness_Yes");
			String strUW_CHK_Doesapplicanthaveotherbusiness_No = (String) row.get("UW_CHK_Doesapplicanthaveotherbusiness_No");
			//String strUW_CHK_Isthereavehicle_Yes = (String) row.get("UW_CHK_Isthereavehicle_Yes");
			//String strUW_CHK_Isthereavehicle_No = (String) row.get("UW_CHK_Isthereavehicle_No");
			//String strUW_CHK_Anyholdharmless_Yes = (String) row.get("UW_CHK_Anyholdharmless_Yes");
			//String strUW_CHK_Anyholdharmless_No = (String) row.get("UW_CHK_Anyholdharmless_No");
			//String strUW_CHK_Doestheapplicantobtainn_Yes = (String) row.get("UW_CHK_Doestheapplicantobtainn_Yes");
			//String strUW_CHK_Doestheapplicantobtainn_No = (String) row.get("UW_CHK_Doestheapplicantobtainn_No");
			//String strUW_CHK_Doestheapplicanthaveaspecific_Yes = (String) row.get("UW_CHK_Doestheapplicanthaveaspecific_Yes");
			//String strUW_CHK_Doestheapplicanthaveaspecific_No = (String) row.get("UW_CHK_Doestheapplicanthaveaspecific_No");
			//String strUW_CHK_Areanydriversnotcovered_Yes = (String) row.get("UW_CHK_Areanydriversnotcovered_Yes");
			//String strUW_CHK_Areanydriversnotcovered_No = (String) row.get("UW_CHK_Areanydriversnotcovered_No");
			//String strUW_CHK_Hasagentinspected_Yes = (String) row.get("UW_CHK_Hasagentinspected_Yes");
			//String strUW_CHK_Hasagentinspected_No = (String) row.get("UW_CHK_Hasagentinspected_No");
			//String strUW_CHK_Areallvehicles_Yes = (String) row.get("UW_CHK_Areallvehicles_Yes");
			//String strUW_CHK_Areallvehicles_No = (String) row.get("UW_CHK_Areallvehicles_No");
			//String strUW_CHK_Doyouhaveelectronicmonitoring_Yes = (String) row.get("UW_CHK_Doyouhaveelectronicmonitoring_Yes");
			//String strUW_CHK_Doyouhaveelectronicmonitoring_No = (String) row.get("UW_CHK_Doyouhaveelectronicmonitoring_No");
			//String strUW_CHK_Anyotherinsurance_Yes = (String) row.get("UW_CHK_Anyotherinsurance_Yes");
			//String strUW_CHK_Anyotherinsurance_No = (String) row.get("UW_CHK_Anyotherinsurance_No");
			String strUW_CHK_Arethereanyinflatablesattheevent_Yes = (String) row.get("UW_CHK_Arethereanyinflatablesattheevent_Yes");
			String strUW_CHK_Arethereanyinflatablesattheevent_No = (String) row.get("UW_CHK_Arethereanyinflatablesattheevent_No");
			String strUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Yes = (String) row.get("UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Yes");
			String strUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_No = (String) row.get("UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_No");
			String strUW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Explanation = (String) row.get("UW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Explanation");
			//String strUW_RBTN_Istheapplicantasubsidiaryofanotherentity_Yes = (String) row.get("UW_RBTN_Istheapplicantasubsidiaryofanotherentity_Yes");
			//String strUW_RBTN_Istheapplicantasubsidiaryofanotherentity_No = (String) row.get("UW_RBTN_Istheapplicantasubsidiaryofanotherentity_No");
			//String strUW_RBTN_Doestheapplicanthaveanysubsidiaries_Yes = (String) row.get("UW_RBTN_Doestheapplicanthaveanysubsidiaries_Yes");
			//String strUW_RBTN_Doestheapplicanthaveanysubsidiaries_No = (String) row.get("UW_RBTN_Doestheapplicanthaveanysubsidiaries_No");
			//String strUW_RBTN_Isaformalsafetyprograminoperation_Yes = (String) row.get("UW_RBTN_Isaformalsafetyprograminoperation_Yes");
			//String strUW_TXT_Isaformalsafetyprograminoperation_Explanation = (String) row.get("UW_TXT_Isaformalsafetyprograminoperation_Explanation");
			//String strUW_RBTN_Isaformalsafetyprograminoperation_No = (String) row.get("UW_RBTN_Isaformalsafetyprograminoperation_No");
			//String strUW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Yes = (String) row.get("UW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Yes");
			//String strUW_TXT_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Explanation = (String) row.get("UW_TXT_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Explanation");
			//String strUW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_No = (String) row.get("UW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_No");
			//String strUW_RBTN_Hasapplicanthadaforeclosure_Yes = (String) row.get("UW_RBTN_Hasapplicanthadaforeclosure_Yes");
			//String strUW_TXT_Hasapplicanthadaforeclosure_Explanation = (String) row.get("UW_TXT_Hasapplicanthadaforeclosure_Explanation");
			//String strUW_RBTN_Hasapplicanthadaforeclosure_No = (String) row.get("UW_RBTN_Hasapplicanthadaforeclosure_No");
			//String strUW_RBTN_Hasapplicanthadajudgement_Yes = (String) row.get("UW_RBTN_Hasapplicanthadajudgement_Yes");
			//String strUW_TXT_Hasapplicanthadajudgement_Explanation = (String) row.get("UW_TXT_Hasapplicanthadajudgement_Explanation");
			//String strUW_RBTN_Hasapplicanthadajudgement_No = (String) row.get("UW_RBTN_Hasapplicanthadajudgement_No");
			//String strUW_RBTN_Hasbusinessbeenplaced_Yes = (String) row.get("UW_RBTN_Hasbusinessbeenplaced_Yes");
			//String strUW_TXT_Hasbusinessbeenplaced_Explanation = (String) row.get("UW_TXT_Hasbusinessbeenplaced_Explanation");
			//String strUW_RBTN_Hasbusinessbeenplaced_No = (String) row.get("UW_RBTN_Hasbusinessbeenplaced_No");
		    String strUW_CHK_ProperMaterials_Yes = (String) row.get("UW_CHK_ProperMaterials_Yes");
			String strUW_CHK_ProperMaterials_No = (String) row.get("UW_CHK_ProperMaterials_No");
			String strUW_CHK_Workforgovernmental_Yes = (String) row.get("UW_CHK_Workforgovernmental_Yes");
			String strUW_CHK_Workforgovernmental_No = (String) row.get("UW_CHK_Workforgovernmental_No");
			String strUW_TXT_Potentialtypes = (String) row.get("UW_TXT_Potentialtypes");
			String strUW_TXT_Transported = (String) row.get("UW_TXT_Transported");
			String strUW_TXT_Anyhaulingforhire_Explanation = (String) row.get("UW_TXT_Anyhaulingforhire_Explanation");
			String strUW_TXT_Doover50oftheemployees_Explanation = (String) row.get("UW_TXT_Doover50oftheemployees_Explanation");
			String strUW_TXT_Areanyvehiclesleased_Explanation = (String) row.get("UW_TXT_Areanyvehiclesleased_Explanation");
			String strUW_TXT_Anycarmodified_Explanation = (String) row.get("UW_TXT_Anycarmodified_Explanation");
			String strUW_TXT_AREICC_Explanation = (String) row.get("UW_TXT_AREICC_Explanation");
			String strUW_TXT_AnyDriver_Explanation = (String) row.get("UW_TXT_AnyDriver_Explanation");
			String strUW_CHK_AreAnyOfTheseViolations_Yes = (String) row.get("UW_CHK_AreAnyOfTheseViolations_Yes");
			String strUW_CHK_AreAnyOfTheseViolations_No = (String) row.get("UW_CHK_AreAnyOfTheseViolations_No");
			String strUW_TXT_AreAnyOfTheseViolations_Explanation = (String) row.get("UW_TXT_AreAnyOfTheseViolations_Explanation");
			String strUW_TXT_Doesapplicanthaveotherbusiness_Explanation = (String) row.get("UW_TXT_Doesapplicanthaveotherbusiness_Explanation");
			String strUW_CHK_DoesApplicantHave3OrMore_Yes = (String) row.get("UW_CHK_DoesApplicantHave3OrMore_Yes");
			String strUW_CHK_DoesApplicantHave3OrMore_No = (String) row.get("UW_CHK_DoesApplicantHave3OrMore_No");
			String strUW_CHK_AnyWorkSubletWitoutCertificates_Yes = (String) row.get("UW_CHK_AnyWorkSubletWitoutCertificates_Yes");
			String strUW_CHK_AnyWorkSubletWitoutCertificates_No = (String) row.get("UW_CHK_AnyWorkSubletWitoutCertificates_No");
			String strUW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_Yes = (String) row.get("UW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_Yes");
			String strUW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_No = (String) row.get("UW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_No");
			String strUW_CHK_AnyexposureToFlammables_Yes = (String) row.get("UW_CHK_AnyexposureToFlammables_Yes");
			String strUW_CHK_AnyexposureToFlammables_No = (String) row.get("UW_CHK_AnyexposureToFlammables_No");
			String strUW_CHK_DoyouhaveTelematics_Yes = (String) row.get("UW_CHK_DoyouhaveTelematics_Yes");
			String strUW_CHK_DoyouhaveTelematics_No = (String) row.get("UW_CHK_DoyouhaveTelematics_No");
			String strUW_CHK_Hastheapplicanthadpriorinsurance_No =(String) row.get("UW_CHK_Hastheapplicanthadpriorinsurance_No");	
			String strUW_CHK_Hastheapplicanthadpriorinsurance_Yes =(String) row.get("UW_CHK_Hastheapplicanthadpriorinsurance_Yes");	
			String strUW_RBTN_PAApplicantWorkInNewYork_No =(String) row.get("UW_RBTN_PAApplicantWorkInNewYork_No");	
			String strUW_RBTN_PAApplicantWorkInNewYork_Yes =(String) row.get("UW_RBTN_PAApplicantWorkInNewYork_Yes");	
			
			try {
				se.log().logTestStep("CP_UnderWriter_Details");
				test.log(LogStatus.INFO, "CP_UnderWriter_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_UnderWriter_Details");
				se.verify().verifyEquals("CP_UnderWriter_Details  of AgencyPortal ", getUnderWritterCA_label().isDisplayed(),true, true,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Anyhaulingforhire_Yes(strUW_CHK_Anyhaulingforhire_Yes),strUW_CHK_Anyhaulingforhire_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Anyhaulingforhire_No(strUW_CHK_Anyhaulingforhire_No),strUW_CHK_Anyhaulingforhire_No,test);
				se.element().enterOrValidateText( getUW_TXT_Anyhaulingforhire_Explanation(strUW_TXT_Anyhaulingforhire_Explanation),strUW_TXT_Anyhaulingforhire_Explanation,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AnyhaulingforManure_Yes(strUW_CHK_AnyhaulingforManure_Yes),strUW_CHK_AnyhaulingforManure_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AnyhaulingforManure_No(strUW_CHK_AnyhaulingforManure_No),strUW_CHK_AnyhaulingforManure_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Doover50oftheemployees_Yes(strUW_CHK_Doover50oftheemployees_Yes),strUW_CHK_Doover50oftheemployees_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Doover50oftheemployees_No(strUW_CHK_Doover50oftheemployees_No),strUW_CHK_Doover50oftheemployees_No,test);
				se.element().enterOrValidateText( getUW_TXT_Doover50oftheemployees_Explanation(strUW_TXT_Doover50oftheemployees_Explanation),strUW_TXT_Doover50oftheemployees_Explanation,test);
				se.element().checkUncheckOrValidate( getUW_CHK_TransportingHazardousMaterial_Yes(strUW_CHK_TransportingHazardousMaterial_Yes),strUW_CHK_TransportingHazardousMaterial_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_TransportingHazardousMaterial_No(strUW_CHK_TransportingHazardousMaterial_No),strUW_CHK_TransportingHazardousMaterial_No,test);
				
				se.element().checkUncheckOrValidate( getUW_CHK_Areanyvehiclesleased_Yes(strUW_CHK_Areanyvehiclesleased_Yes),strUW_CHK_Areanyvehiclesleased_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Areanyvehiclesleased_No(strUW_CHK_Areanyvehiclesleased_No),strUW_CHK_Areanyvehiclesleased_No,test);
				se.element().enterOrValidateText( getUW_TXT_Areanyvehiclesleased_Explanation(strUW_TXT_Areanyvehiclesleased_Explanation),strUW_TXT_Areanyvehiclesleased_Explanation,test);
				se.element().checkUncheckOrValidate(getUW_CHK_AreAnyVehiclesPersonallyTitle_Yes(strUW_CHK_AreAnyVehiclesPersonallyTitle_Yes), strUW_CHK_AreAnyVehiclesPersonallyTitle_Yes, test);
				se.element().checkUncheckOrValidate(getUW_CHK_AreAnyVehiclesPersonallyTitle_No(strUW_CHK_AreAnyVehiclesPersonallyTitle_No), strUW_CHK_AreAnyVehiclesPersonallyTitle_No, test);
				se.element().enterOrValidateText(getUW_CHK_AreAnyVehiclesPersonallyTitle_Explain(strUW_CHK_AreAnyVehiclesPersonallyTitle_Explain),strUW_CHK_AreAnyVehiclesPersonallyTitle_Explain,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Anycarmodified_Yes(strUW_CHK_Anycarmodified_Yes),strUW_CHK_Anycarmodified_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Anycarmodified_No(strUW_CHK_Anycarmodified_No),strUW_CHK_Anycarmodified_No,test);
				se.element().enterOrValidateText( getUW_TXT_Anycarmodified_Explanation(strUW_TXT_Anycarmodified_Explanation),strUW_TXT_Anycarmodified_Explanation,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AREICC_Yes(strUW_CHK_AREICC_Yes),strUW_CHK_AREICC_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AREICC_No(strUW_CHK_AREICC_No),strUW_CHK_AREICC_No,test);
				se.element().enterOrValidateText( getUW_TXT_AREICC_Explanation(strUW_TXT_AREICC_Explanation),strUW_TXT_AREICC_Explanation,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Anyvehiclesusedby_Yes(strUW_CHK_Anyvehiclesusedby_Yes),strUW_CHK_Anyvehiclesusedby_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Anyvehiclesusedby_No(strUW_CHK_Anyvehiclesusedby_No),strUW_CHK_Anyvehiclesusedby_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Anyvehiclesowned_Yes(strUW_CHK_Anyvehiclesowned_Yes),strUW_CHK_Anyvehiclesowned_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Anyvehiclesowned_No(strUW_CHK_Anyvehiclesowned_No),strUW_CHK_Anyvehiclesowned_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AnyDriver_Yes(strUW_CHK_AnyDriver_Yes),strUW_CHK_AnyDriver_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AnyDriver_No(strUW_CHK_AnyDriver_No),strUW_CHK_AnyDriver_No,test);
				se.element().enterOrValidateText( getUW_TXT_AnyDriver_Explanation(strUW_TXT_AnyDriver_Explanation),strUW_TXT_AnyDriver_Explanation,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AreAnyOfTheseViolations_Yes(strUW_CHK_AreAnyOfTheseViolations_Yes),strUW_CHK_AreAnyOfTheseViolations_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AreAnyOfTheseViolations_No(strUW_CHK_AreAnyOfTheseViolations_No),strUW_CHK_AreAnyOfTheseViolations_No,test);
				se.element().enterOrValidateText( getUW_TXT_AreAnyOfTheseViolations_Explanation(strUW_TXT_AreAnyOfTheseViolations_Explanation),strUW_TXT_AreAnyOfTheseViolations_Explanation,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Doesapplicanthaveotherbusiness_Yes(strUW_CHK_Doesapplicanthaveotherbusiness_Yes),strUW_CHK_Doesapplicanthaveotherbusiness_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Doesapplicanthaveotherbusiness_No(strUW_CHK_Doesapplicanthaveotherbusiness_No),strUW_CHK_Doesapplicanthaveotherbusiness_No,test);
				se.element().enterOrValidateText( getUW_TXT_Doesapplicanthaveotherbusiness_Explanation(strUW_TXT_Doesapplicanthaveotherbusiness_Explanation),strUW_TXT_Doesapplicanthaveotherbusiness_Explanation,test);
				/*se.element().checkUncheckOrValidate( getUW_CHK_Isthereavehicle_Yes(strUW_CHK_Isthereavehicle_Yes),strUW_CHK_Isthereavehicle_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Isthereavehicle_No(strUW_CHK_Isthereavehicle_No),strUW_CHK_Isthereavehicle_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Anyholdharmless_Yes(strUW_CHK_Anyholdharmless_Yes),strUW_CHK_Anyholdharmless_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Anyholdharmless_No(strUW_CHK_Anyholdharmless_No),strUW_CHK_Anyholdharmless_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Doestheapplicantobtainn_Yes(strUW_CHK_Doestheapplicantobtainn_Yes),strUW_CHK_Doestheapplicantobtainn_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Doestheapplicantobtainn_No(strUW_CHK_Doestheapplicantobtainn_No),strUW_CHK_Doestheapplicantobtainn_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Doestheapplicanthaveaspecific_Yes(strUW_CHK_Doestheapplicanthaveaspecific_Yes),strUW_CHK_Doestheapplicanthaveaspecific_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Doestheapplicanthaveaspecific_No(strUW_CHK_Doestheapplicanthaveaspecific_No),strUW_CHK_Doestheapplicanthaveaspecific_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Areanydriversnotcovered_Yes(strUW_CHK_Areanydriversnotcovered_Yes),strUW_CHK_Areanydriversnotcovered_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Areanydriversnotcovered_No(strUW_CHK_Areanydriversnotcovered_No),strUW_CHK_Areanydriversnotcovered_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Hasagentinspected_Yes(strUW_CHK_Hasagentinspected_Yes),strUW_CHK_Hasagentinspected_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Hasagentinspected_No(strUW_CHK_Hasagentinspected_No),strUW_CHK_Hasagentinspected_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Areallvehicles_Yes(strUW_CHK_Areallvehicles_Yes),strUW_CHK_Areallvehicles_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Areallvehicles_No(strUW_CHK_Areallvehicles_No),strUW_CHK_Areallvehicles_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Doyouhaveelectronicmonitoring_Yes(strUW_CHK_Doyouhaveelectronicmonitoring_Yes),strUW_CHK_Doyouhaveelectronicmonitoring_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Doyouhaveelectronicmonitoring_No(strUW_CHK_Doyouhaveelectronicmonitoring_No),strUW_CHK_Doyouhaveelectronicmonitoring_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Anyotherinsurance_Yes(strUW_CHK_Anyotherinsurance_Yes),strUW_CHK_Anyotherinsurance_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Anyotherinsurance_No(strUW_CHK_Anyotherinsurance_No),strUW_CHK_Anyotherinsurance_No,test);*/
				se.element().checkUncheckOrValidate( getUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_No(strUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_No),strUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_No,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Yes(strUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Yes),strUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Yes,test);
				se.element().enterOrValidateText( getUW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Explanation(strUW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Explanation),strUW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Explanation,test);
				/*se.element().checkUncheckOrValidate( getUW_RBTN_Istheapplicantasubsidiaryofanotherentity_Yes(strUW_RBTN_Istheapplicantasubsidiaryofanotherentity_Yes),strUW_RBTN_Istheapplicantasubsidiaryofanotherentity_Yes,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_Istheapplicantasubsidiaryofanotherentity_No(strUW_RBTN_Istheapplicantasubsidiaryofanotherentity_No),strUW_RBTN_Istheapplicantasubsidiaryofanotherentity_No,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_Doestheapplicanthaveanysubsidiaries_Yes_CA(strUW_RBTN_Doestheapplicanthaveanysubsidiaries_Yes),strUW_RBTN_Doestheapplicanthaveanysubsidiaries_Yes,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_Doestheapplicanthaveanysubsidiaries_No_CA(strUW_RBTN_Doestheapplicanthaveanysubsidiaries_No),strUW_RBTN_Doestheapplicanthaveanysubsidiaries_No,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_Isaformalsafetyprograminoperation_Yes(strUW_RBTN_Isaformalsafetyprograminoperation_Yes),strUW_RBTN_Isaformalsafetyprograminoperation_Yes,test);
				se.element().enterOrValidateText( getUW_TXT_Isaformalsafetyprograminoperation_Explanation(strUW_TXT_Isaformalsafetyprograminoperation_Explanation),strUW_TXT_Isaformalsafetyprograminoperation_Explanation,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_Isaformalsafetyprograminoperation_No(strUW_RBTN_Isaformalsafetyprograminoperation_No),strUW_RBTN_Isaformalsafetyprograminoperation_No,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Yes(strUW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Yes),strUW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Yes,test);
				se.element().enterOrValidateText( getUW_TXT_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Explanation(strUW_TXT_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Explanation),strUW_TXT_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Explanation,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_No(strUW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_No),strUW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_No,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_Hasapplicanthadaforeclosure_Yes(strUW_RBTN_Hasapplicanthadaforeclosure_Yes),strUW_RBTN_Hasapplicanthadaforeclosure_Yes,test);
				se.element().enterOrValidateText( getUW_TXT_Hasapplicanthadaforeclosure_Explanation(strUW_TXT_Hasapplicanthadaforeclosure_Explanation),strUW_TXT_Hasapplicanthadaforeclosure_Explanation,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_Hasapplicanthadaforeclosure_No(strUW_RBTN_Hasapplicanthadaforeclosure_No),strUW_RBTN_Hasapplicanthadaforeclosure_No,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_Hasapplicanthadajudgement_Yes_CA(strUW_RBTN_Hasapplicanthadajudgement_Yes),strUW_RBTN_Hasapplicanthadajudgement_Yes,test);
				se.element().enterOrValidateText( getUW_TXT_Hasapplicanthadajudgement_Explanation_CA(strUW_TXT_Hasapplicanthadajudgement_Explanation),strUW_TXT_Hasapplicanthadajudgement_Explanation,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_Hasapplicanthadajudgement_No_CA(strUW_RBTN_Hasapplicanthadajudgement_No),strUW_RBTN_Hasapplicanthadajudgement_No,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_Hasbusinessbeenplaced_Yes(strUW_RBTN_Hasbusinessbeenplaced_Yes),strUW_RBTN_Hasbusinessbeenplaced_Yes,test);
				se.element().enterOrValidateText( getUW_TXT_Hasbusinessbeenplaced_Explanation(strUW_TXT_Hasbusinessbeenplaced_Explanation),strUW_TXT_Hasbusinessbeenplaced_Explanation,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_Hasbusinessbeenplaced_No(strUW_RBTN_Hasbusinessbeenplaced_No),strUW_RBTN_Hasbusinessbeenplaced_No,test);*/
				se.element().enterOrValidateText( getUW_TXT_Transported(strUW_TXT_Transported),strUW_TXT_Transported,test);
				se.element().enterOrValidateText( getUW_TXT_Potentialtypes(strUW_TXT_Potentialtypes),strUW_TXT_Potentialtypes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Workforgovernmental_Yes(strUW_CHK_Workforgovernmental_Yes),strUW_CHK_Workforgovernmental_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Workforgovernmental_No(strUW_CHK_Workforgovernmental_No),strUW_CHK_Workforgovernmental_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_ProperMaterials_Yes(strUW_CHK_ProperMaterials_Yes),strUW_CHK_ProperMaterials_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_ProperMaterials_No(strUW_CHK_ProperMaterials_No),strUW_CHK_ProperMaterials_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Arethereanyinflatablesattheevent_Yes(strUW_CHK_Arethereanyinflatablesattheevent_Yes),strUW_CHK_Arethereanyinflatablesattheevent_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Arethereanyinflatablesattheevent_No(strUW_CHK_Arethereanyinflatablesattheevent_No),strUW_CHK_Arethereanyinflatablesattheevent_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_DoesApplicantHave3OrMore_Yes(strUW_CHK_DoesApplicantHave3OrMore_Yes),strUW_CHK_DoesApplicantHave3OrMore_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_DoesApplicantHave3OrMore_No(strUW_CHK_DoesApplicantHave3OrMore_No),strUW_CHK_DoesApplicantHave3OrMore_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AnyWorkSubletWitoutCertificates_Yes(strUW_CHK_AnyWorkSubletWitoutCertificates_Yes),strUW_CHK_AnyWorkSubletWitoutCertificates_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AnyWorkSubletWitoutCertificates_No(strUW_CHK_AnyWorkSubletWitoutCertificates_No),strUW_CHK_AnyWorkSubletWitoutCertificates_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_Yes(strUW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_Yes),strUW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_No(strUW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_No),strUW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AnyexposureToFlammables_Yes(strUW_CHK_AnyexposureToFlammables_Yes),strUW_CHK_AnyexposureToFlammables_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AnyexposureToFlammables_No(strUW_CHK_AnyexposureToFlammables_No),strUW_CHK_AnyexposureToFlammables_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_DoyouhaveTelematics_Yes(strUW_CHK_DoyouhaveTelematics_Yes),strUW_CHK_DoyouhaveTelematics_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_DoyouhaveTelematics_No(strUW_CHK_DoyouhaveTelematics_No),strUW_CHK_DoyouhaveTelematics_No,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Hastheapplicanthadpriorinsurance_Yes(strUW_CHK_Hastheapplicanthadpriorinsurance_Yes),strUW_CHK_Hastheapplicanthadpriorinsurance_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Hastheapplicanthadpriorinsurance_No(strUW_CHK_Hastheapplicanthadpriorinsurance_No),strUW_CHK_Hastheapplicanthadpriorinsurance_No,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_PAApplicantWorkInNewYork_Yes(strUW_RBTN_PAApplicantWorkInNewYork_Yes),strUW_RBTN_PAApplicantWorkInNewYork_Yes,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_PAApplicantWorkInNewYork_No(strUW_RBTN_PAApplicantWorkInNewYork_No),strUW_RBTN_PAApplicantWorkInNewYork_No,test);
				se.element().checkUncheckOrValidate( getUW_RBTN_UWDOTNumber_No(strUW_RBTN_UWDOTNumber_No),strUW_RBTN_UWDOTNumber_No,test);
				
				
				executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
				se.element().Click(getGI_CHK_Continue(), test);
			}
			catch(Exception e){
			e.getMessage();
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for CA_UnderWriter_Details ", true, false, true, test);
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
