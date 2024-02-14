package pw.pages.CA;

/**
 * @author ${is09492}
 */
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CA;

public class CA_AdditionalCoverages extends OR_CA{

	public void AdditionalCoverages(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			
			if(suspendSheet.equalsIgnoreCase(constants.CA_AdditionalCoverages)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }

			
			List<Map<String, String>> table = ExcelOperations.getPagesData("AdditionalCoverages", strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strAdditionalCoverages_CHK_NamedDriverCollision = (String) row.get("AdditionalCoverages_CHK_NamedDriverCollision");
			String strAdditionalCoverages_CHK_BroadFormProd = (String) row.get("AdditionalCoverages_CHK_BroadFormProd");
			String strAdditionalCoverages_CHK_BusinessIntLoggers = (String) row.get("AdditionalCoverages_CHK_BusinessIntLoggers");
			String strAdditionalCoverages_CHK_BusinessInterruption = (String) row.get("AdditionalCoverages_CHK_BusinessInterruption");
			String strAdditionalCoverages_CHK_DriveAwayCollision = (String) row.get("AdditionalCoverages_CHK_DriveAwayCollision");
			String strAdditionalCoverages_CHK_ExclusionOrExcCovHazardsOtherwiseInsured = (String) row.get("AdditionalCoverages_CHK_ExclusionOrExcCovHazardsOtherwiseInsured");
			String strAdditionalCoverages_CHK_GarageKeepers = (String) row.get("AdditionalCoverages_CHK_GarageKeepers");
			String strAdditionalCoverages_CHK_GarageKeepersCustSoundReceivingCov = (String) row.get("AdditionalCoverages_CHK_GarageKeepersCustSoundReceivingCov");
			String strAdditionalCoverages_CHK_FungiOrBacteriaLiability = (String) row.get("AdditionalCoverages_CHK_FungiOrBacteriaLiability");
			String strAdditionalCoverages_CHK_AutoBodyManufacturersAndInstallers = (String) row.get("AdditionalCoverages_CHK_AutoBodyManufacturersAndInstallers");
			String strAdditionalCoverages_CHK_DriveAwayContratorsLiability = (String) row.get("AdditionalCoverages_CHK_DriveAwayContratorsLiability");
			String strAdditionalCoverages_CHK_DriveOtherCar = (String) row.get("AdditionalCoverages_CHK_DriveOtherCar");
			String strAdditionalCoverages_CHK_FellowEmployeeCov = (String) row.get("AdditionalCoverages_CHK_FellowEmployeeCov");
			String strAdditionalCoverages_CHK_FinancialResponsibilityFiling = (String) row.get("AdditionalCoverages_CHK_FinancialResponsibilityFiling");
			String strAdditionalCoverages_CHK_HiredBorrowedAuto = (String) row.get("AdditionalCoverages_CHK_HiredBorrowedAuto");
			String strAdditionalCoverages_CHK_LeasedWorkersCov = (String) row.get("AdditionalCoverages_CHK_LeasedWorkersCov");
			String strAdditionalCoverages_CHK_LimitedMexicoCov = (String) row.get("AdditionalCoverages_CHK_LimitedMexicoCov");
			String strAdditionalCoverages_CHK_NamedIndividualBroadenedPIP = (String) row.get("AdditionalCoverages_CHK_NamedIndividualBroadenedPIP");
			String strAdditionalCoverages_CHK_NonOwnedLiability = (String) row.get("AdditionalCoverages_CHK_NonOwnedLiability");
			String strAdditionalCoverages_CHK_RepossessedAuto = (String) row.get("AdditionalCoverages_CHK_RepossessedAuto");
			String strAdditionalCoverages_CHK_RegistrationPlatesNotIssuedForSpecificAuto = (String) row.get("AdditionalCoverages_CHK_RegistrationPlatesNotIssuedForSpecificAuto");
			String strAdditionalCoverages_CHK_SilicaOrSilicaRelatedDustExclusion = (String) row.get("AdditionalCoverages_CHK_SilicaOrSilicaRelatedDustExclusion");
			String strAdditionalCoverages_CHK_TrailerInterchange = (String) row.get("AdditionalCoverages_CHK_TrailerInterchange");
			String strAdditionalCoverages_CHK_AutosHeldForSaleBYServiceOperationsOTC = (String) row.get("AdditionalCoverages_CHK_AutosHeldForSaleBYServiceOperationsOTC");
			String strAdditionalCoverages_CHK_LimitedBroadenedPollutionLiability = (String) row.get("AdditionalCoverages_CHK_LimitedBroadenedPollutionLiability");
			String strAdditionalCoverages_CHK_BusinessAutoWrap = (String) row.get("AdditionalCoverages_CHK_BusinessAutoWrap");
			String strAdditionalCoverages_CHK_SecuraManuscript = (String) row.get("AdditionalCoverages_CHK_SecuraManuscript");
			String strAdditionalCoverages_CHK_AutoAdditionalInsuredWrap = (String) row.get("AdditionalCoverages_CHK_AutoAdditionalInsuredWrap");
			String strAdditionalCoverages_CHK_MotorCarrierFilings = (String) row.get("AdditionalCoverages_CHK_MotorCarrierFilings");
			String strAdditionalCoverages_CHK_MultipleDeductibleCoordination = (String) row.get("AdditionalCoverages_CHK_MultipleDeductibleCoordination");
			String strAdditionalCoverages_CHK_1completed_operations = (String) row.get("AdditionalCoverages_CHK_1completed_operations");
			String strAdditionalCoverages_CHK_eliminate500ded = (String) row.get("AdditionalCoverages_CHK_eliminate500ded");
			String strAdditionalCoverages_CHK_1year_2000_endorsement = (String) row.get("AdditionalCoverages_CHK_1year_2000_endorsement");
			String strAdditionalCoverages_CHK_1broad_form_comp_ope = (String) row.get("AdditionalCoverages_CHK_1broad_form_comp_ope");
			String strAdditionalCoverages_CHK_1c_auto_deal_liab_wrap = (String) row.get("AdditionalCoverages_CHK_1c_auto_deal_liab_wrap");
			String strAdditionalCoverages_CHK_1garage_wtrcrft_phy_dam = (String) row.get("AdditionalCoverages_CHK_1garage_wtrcrft_phy_dam");
			String strAdditionalCoverages_CHK_1pickup_delivery = (String) row.get("AdditionalCoverages_CHK_1pickup_delivery");
			String strAdditionalCoverages_CHK_funeraldirectors = (String) row.get("AdditionalCoverages_CHK_funeraldirectors");
			String strAdditionalCoverages_CHK_Rental = (String) row.get("AdditionalCoverages_CHK_Rental");
			String strAdditionalCoverages_CHK_loss_of_use_exp = (String) row.get("AdditionalCoverages_CHK_loss_of_use_exp");

		try {
				se.log().logTestStep("CA_AdditionalCoverages");
				test.log(LogStatus.INFO, "CA_AdditionalCoverages page","Transaction Step : "+transaction + "<br>" +"Page : CA_AdditionalCoverages");
				se.verify().verifyEquals("CA_AdditionalCoverages Details  of PowerWriter ", getAdditionalCoverages_BTN_Label().isDisplayed(),true, true,test);
				
				
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_NamedDriverCollision(strAdditionalCoverages_CHK_NamedDriverCollision),strAdditionalCoverages_CHK_NamedDriverCollision,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_BroadFormProd(strAdditionalCoverages_CHK_BroadFormProd),strAdditionalCoverages_CHK_BroadFormProd,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_BusinessIntLoggers(strAdditionalCoverages_CHK_BusinessIntLoggers),strAdditionalCoverages_CHK_BusinessIntLoggers,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_BusinessInterruption(strAdditionalCoverages_CHK_BusinessInterruption),strAdditionalCoverages_CHK_BusinessInterruption,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_DriveAwayCollision(strAdditionalCoverages_CHK_DriveAwayCollision),strAdditionalCoverages_CHK_DriveAwayCollision,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_ExclusionOrExcCovHazardsOtherwiseInsured(strAdditionalCoverages_CHK_ExclusionOrExcCovHazardsOtherwiseInsured),strAdditionalCoverages_CHK_ExclusionOrExcCovHazardsOtherwiseInsured,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_GarageKeepers(strAdditionalCoverages_CHK_GarageKeepers),strAdditionalCoverages_CHK_GarageKeepers,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_GarageKeepersCustSoundReceivingCov(strAdditionalCoverages_CHK_GarageKeepersCustSoundReceivingCov),strAdditionalCoverages_CHK_GarageKeepersCustSoundReceivingCov,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_FungiOrBacteriaLiability(strAdditionalCoverages_CHK_FungiOrBacteriaLiability),strAdditionalCoverages_CHK_FungiOrBacteriaLiability,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_AutoBodyManufacturersAndInstallers(strAdditionalCoverages_CHK_AutoBodyManufacturersAndInstallers),strAdditionalCoverages_CHK_AutoBodyManufacturersAndInstallers,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_DriveAwayContratorsLiability(strAdditionalCoverages_CHK_DriveAwayContratorsLiability),strAdditionalCoverages_CHK_DriveAwayContratorsLiability,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_DriveOtherCar(strAdditionalCoverages_CHK_DriveOtherCar),strAdditionalCoverages_CHK_DriveOtherCar,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_FellowEmployeeCov(strAdditionalCoverages_CHK_FellowEmployeeCov),strAdditionalCoverages_CHK_FellowEmployeeCov,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_FinancialResponsibilityFiling(strAdditionalCoverages_CHK_FinancialResponsibilityFiling),strAdditionalCoverages_CHK_FinancialResponsibilityFiling,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_HiredBorrowedAuto(strAdditionalCoverages_CHK_HiredBorrowedAuto),strAdditionalCoverages_CHK_HiredBorrowedAuto,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_LeasedWorkersCov(strAdditionalCoverages_CHK_LeasedWorkersCov),strAdditionalCoverages_CHK_LeasedWorkersCov,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_LimitedMexicoCov(strAdditionalCoverages_CHK_LimitedMexicoCov),strAdditionalCoverages_CHK_LimitedMexicoCov,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_NamedIndividualBroadenedPIP(strAdditionalCoverages_CHK_NamedIndividualBroadenedPIP),strAdditionalCoverages_CHK_NamedIndividualBroadenedPIP,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_NonOwnedLiability(strAdditionalCoverages_CHK_NonOwnedLiability),strAdditionalCoverages_CHK_NonOwnedLiability,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_RepossessedAuto(strAdditionalCoverages_CHK_RepossessedAuto),strAdditionalCoverages_CHK_RepossessedAuto,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_RegistrationPlatesNotIssuedForSpecificAuto(strAdditionalCoverages_CHK_RegistrationPlatesNotIssuedForSpecificAuto),strAdditionalCoverages_CHK_RegistrationPlatesNotIssuedForSpecificAuto,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_SilicaOrSilicaRelatedDustExclusion(strAdditionalCoverages_CHK_SilicaOrSilicaRelatedDustExclusion),strAdditionalCoverages_CHK_SilicaOrSilicaRelatedDustExclusion,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_TrailerInterchange(strAdditionalCoverages_CHK_TrailerInterchange),strAdditionalCoverages_CHK_TrailerInterchange,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_AutosHeldForSaleBYServiceOperationsOTC(strAdditionalCoverages_CHK_AutosHeldForSaleBYServiceOperationsOTC),strAdditionalCoverages_CHK_AutosHeldForSaleBYServiceOperationsOTC,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_LimitedBroadenedPollutionLiability(strAdditionalCoverages_CHK_LimitedBroadenedPollutionLiability),strAdditionalCoverages_CHK_LimitedBroadenedPollutionLiability,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_BusinessAutoWrap(strAdditionalCoverages_CHK_BusinessAutoWrap),strAdditionalCoverages_CHK_BusinessAutoWrap,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_SecuraManuscript(strAdditionalCoverages_CHK_SecuraManuscript),strAdditionalCoverages_CHK_SecuraManuscript,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_AutoAdditionalInsuredWrap(strAdditionalCoverages_CHK_AutoAdditionalInsuredWrap),strAdditionalCoverages_CHK_AutoAdditionalInsuredWrap,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_MotorCarrierFilings(strAdditionalCoverages_CHK_MotorCarrierFilings),strAdditionalCoverages_CHK_MotorCarrierFilings,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_MultipleDeductibleCoordination(strAdditionalCoverages_CHK_MultipleDeductibleCoordination),strAdditionalCoverages_CHK_MultipleDeductibleCoordination,test);
				//se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_1state_broad_prod(strAdditionalCoverages_CHK_1state_broad_prod),strAdditionalCoverages_CHK_1state_broad_prod,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_1completed_operations(strAdditionalCoverages_CHK_1completed_operations),strAdditionalCoverages_CHK_1completed_operations,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_eliminate500ded(strAdditionalCoverages_CHK_eliminate500ded),strAdditionalCoverages_CHK_eliminate500ded,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_1year_2000_endorsement(strAdditionalCoverages_CHK_1year_2000_endorsement),strAdditionalCoverages_CHK_1year_2000_endorsement,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_1broad_form_comp_ope(strAdditionalCoverages_CHK_1broad_form_comp_ope),strAdditionalCoverages_CHK_1broad_form_comp_ope,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_1c_auto_deal_liab_wrap(strAdditionalCoverages_CHK_1c_auto_deal_liab_wrap),strAdditionalCoverages_CHK_1c_auto_deal_liab_wrap,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_1garage_wtrcrft_phy_dam(strAdditionalCoverages_CHK_1garage_wtrcrft_phy_dam),strAdditionalCoverages_CHK_1garage_wtrcrft_phy_dam,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_1pickup_delivery(strAdditionalCoverages_CHK_1pickup_delivery),strAdditionalCoverages_CHK_1pickup_delivery,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_funeraldirectors(strAdditionalCoverages_CHK_funeraldirectors),strAdditionalCoverages_CHK_funeraldirectors,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_Rental(strAdditionalCoverages_CHK_Rental),strAdditionalCoverages_CHK_Rental,test);
				se.element().checkUncheckOrValidate(getAdditionalCoverages_CHK_loss_of_use_exp(strAdditionalCoverages_CHK_loss_of_use_exp),strAdditionalCoverages_CHK_loss_of_use_exp,test);
				se.element().clickElement(getNext());
				se.util().sleep(2000);


			}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CA_AdditionalCoverages ", true, false, true, test);
				
			}
					iteration++;
				}
			
		}
		catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			testTearDown(se, test);
		}
			
	}
}


	
