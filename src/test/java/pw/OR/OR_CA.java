package pw.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OR_CA extends OR_Common{
	
	
	/*****************************************
	 * Start of Additional Coverages page locators
	 ******************************************/
	
	public By AdditionalCoverages_BTN_Label = By.xpath("//*[contains(@id,'lob_ca_addl_cov-label')]");
	
	public WebElement getAdditionalCoverages_BTN_Label()
	{
	se.element().waitForElement(AdditionalCoverages_BTN_Label);
	return se.element().getElement(AdditionalCoverages_BTN_Label);
	}
	
	public By AdditionalCoverages_CHK_NamedDriverCollision =By.xpath("//*[contains(@id,'named_driver_collision-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_NamedDriverCollision(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_NamedDriverCollision ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_NamedDriverCollision,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_BroadFormProd =By.xpath("//*[contains(@id,'state_broad_prod-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_BroadFormProd(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_BroadFormProd ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_BroadFormProd,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_BusinessIntLoggers =By.xpath("//*[contains(@id,'1c_buss_interrupt_logger-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_BusinessIntLoggers(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_BusinessIntLoggers ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_BusinessIntLoggers,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_BusinessInterruption =By.xpath("//*[contains(@id,'business_interruption-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_BusinessInterruption(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_BusinessInterruption ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_BusinessInterruption,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_DriveAwayCollision =By.xpath("//*[contains(@id,'drive_away_coll-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_DriveAwayCollision(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_DriveAwayCollision ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_DriveAwayCollision,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_ExclusionOrExcCovHazardsOtherwiseInsured =By.xpath("//*[contains(@id,'1ca_excl_exss_hzrd-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_ExclusionOrExcCovHazardsOtherwiseInsured(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_ExclusionOrExcCovHazardsOtherwiseInsured ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_ExclusionOrExcCovHazardsOtherwiseInsured,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_GarageKeepers =By.xpath("//*[contains(@id,'garage_keepers-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_GarageKeepers(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_GarageKeepers ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_GarageKeepers,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_GarageKeepersCustSoundReceivingCov =By.xpath("//*[contains(@id,'garage_keeper_snd_rec-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_GarageKeepersCustSoundReceivingCov(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_GarageKeepersCustSoundReceivingCov ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_GarageKeepersCustSoundReceivingCov,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_FungiOrBacteriaLiability =By.xpath("//*[contains(@id,'fungi_bact_liab-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_FungiOrBacteriaLiability(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_FungiOrBacteriaLiability ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_FungiOrBacteriaLiability,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_AutoBodyManufacturersAndInstallers =By.xpath("//*[contains(@id,'auto_body_manu-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_AutoBodyManufacturersAndInstallers(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_AutoBodyManufacturersAndInstallers ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_AutoBodyManufacturersAndInstallers,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_DriveAwayContratorsLiability =By.xpath("//*[contains(@id,'drive_away_contractor-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_DriveAwayContratorsLiability(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_DriveAwayContratorsLiability ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_DriveAwayContratorsLiability,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_DriveOtherCar =By.xpath("//*[contains(@id,'drive_other_car-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_DriveOtherCar(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_DriveOtherCar ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_DriveOtherCar,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_FellowEmployeeCov =By.xpath("//*[contains(@id,'fellow_employee-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_FellowEmployeeCov(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_FellowEmployeeCov ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_FellowEmployeeCov,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_FinancialResponsibilityFiling =By.xpath("//*[contains(@id,'financial_resp_filing-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_FinancialResponsibilityFiling(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_FinancialResponsibilityFiling ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_FinancialResponsibilityFiling,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_HiredBorrowedAuto =By.xpath("//*[contains(@id,'hired_borrow-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_HiredBorrowedAuto(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_HiredBorrowedAuto ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_HiredBorrowedAuto,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_LeasedWorkersCov =By.xpath("//*[contains(@id,'leased_workers-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_LeasedWorkersCov(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_LeasedWorkersCov ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_LeasedWorkersCov,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_LimitedMexicoCov =By.xpath("//*[contains(@id,'limited_mexico-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_LimitedMexicoCov(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_LimitedMexicoCov ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_LimitedMexicoCov,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_NamedIndividualBroadenedPIP =By.xpath("//*[contains(@id,'named_ind_broad_pip-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_NamedIndividualBroadenedPIP(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_NamedIndividualBroadenedPIP ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_NamedIndividualBroadenedPIP,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_NonOwnedLiability =By.xpath("//*[contains(@id,'non_owned_liab-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_NonOwnedLiability(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_NonOwnedLiability ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_NonOwnedLiability,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_RepossessedAuto =By.xpath("//*[contains(@id,'1repossessed_auto-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_RepossessedAuto(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_RepossessedAuto ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_RepossessedAuto,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_RegistrationPlatesNotIssuedForSpecificAuto =By.xpath("//*[contains(@id,'registration_plates-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_RegistrationPlatesNotIssuedForSpecificAuto(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_RegistrationPlatesNotIssuedForSpecificAuto ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_RegistrationPlatesNotIssuedForSpecificAuto,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_SilicaOrSilicaRelatedDustExclusion =By.xpath("//*[contains(@id,'silicia_dust_liab-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_SilicaOrSilicaRelatedDustExclusion(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_SilicaOrSilicaRelatedDustExclusion ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_SilicaOrSilicaRelatedDustExclusion,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_TrailerInterchange =By.xpath("//*[contains(@id,'trailer_interchange-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_TrailerInterchange(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_TrailerInterchange ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_TrailerInterchange,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_AutosHeldForSaleBYServiceOperationsOTC =By.xpath("//*[contains(@id,'autos_held_for_sale-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_AutosHeldForSaleBYServiceOperationsOTC(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_AutosHeldForSaleBYServiceOperationsOTC ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_AutosHeldForSaleBYServiceOperationsOTC,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_LimitedBroadenedPollutionLiability =By.xpath("//*[contains(@id,'limited_poll_liab-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_LimitedBroadenedPollutionLiability(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_LimitedBroadenedPollutionLiability ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_LimitedBroadenedPollutionLiability,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_BusinessAutoWrap =By.xpath("//*[contains(@id,'bus_auto_wrap-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_BusinessAutoWrap(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_BusinessAutoWrap ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_BusinessAutoWrap,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_SecuraManuscript =By.xpath("//*[contains(@id,'manuscript-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_SecuraManuscript(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_SecuraManuscript ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_SecuraManuscript,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_AutoAdditionalInsuredWrap =By.xpath("//*[contains(@id,'field_key$3f14af6f-2808-3c5e-a023-572a5e2c0f97$1addl_ins_wrap-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_AutoAdditionalInsuredWrap(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_AutoAdditionalInsuredWrap ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_AutoAdditionalInsuredWrap,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_MotorCarrierFilings =By.xpath("//*[contains(@id,'mot_carr_fill-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_MotorCarrierFilings(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_MotorCarrierFilings ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_MotorCarrierFilings,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_MultipleDeductibleCoordination =By.id("field_key$406f7a06-f01b-3d74-93ee-da7796a2670b$1multiple_ded_coordinat-checkbox");
	public WebElement getAdditionalCoverages_CHK_MultipleDeductibleCoordination(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_MultipleDeductibleCoordination ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_MultipleDeductibleCoordination,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_1state_broad_prod =By.id("field_key$574118c0-0157-3309-83dc-b462ecd6f50c$1state_broad_prod-checkbox");
	public WebElement getAdditionalCoverages_CHK_1state_broad_prod(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_1state_broad_prod ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_1state_broad_prod,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_1completed_operations =By.xpath("//*[contains(@id,completed_operations-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_1completed_operations(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_1completed_operations ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_1completed_operations,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_eliminate500ded =By.xpath("//*[contains(@id,'completed_operations-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_eliminate500ded(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_eliminate500ded ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_eliminate500ded,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_1year_2000_endorsement =By.xpath("//*[contains(@id,'year_2000_endorsement-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_1year_2000_endorsement(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_1year_2000_endorsement ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_1year_2000_endorsement,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_1broad_form_comp_ope =By.xpath("//*[contains(@id,'broad_form_comp_ope-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_1broad_form_comp_ope(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_1broad_form_comp_ope ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_1broad_form_comp_ope,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_1c_auto_deal_liab_wrap =By.xpath("//*[contains(@id,'auto_deal_liab_wrap-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_1c_auto_deal_liab_wrap(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_1c_auto_deal_liab_wrap ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_1c_auto_deal_liab_wrap,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_1garage_wtrcrft_phy_dam =By.xpath("//*[contains(@id,'garage_wtrcrft_phy_dam-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_1garage_wtrcrft_phy_dam(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_1garage_wtrcrft_phy_dam ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_1garage_wtrcrft_phy_dam,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_1pickup_delivery =By.xpath("//*[contains(@id,'pickup_delivery-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_1pickup_delivery(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_1pickup_delivery ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_1pickup_delivery,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_funeraldirectors =By.xpath("//*[contains(@id,'fun_dir_med_pay-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_funeraldirectors(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_funeraldirectors ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_funeraldirectors,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_Rental =By.xpath("//*[contains(@id,'rental_vehicle-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_Rental(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_Rental ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_Rental,dataVal);
	}
	                            
	public By AdditionalCoverages_CHK_loss_of_use_exp =By.xpath("//*[contains(@id,'loss_of_use_exp-checkbox')]/input");
	public WebElement getAdditionalCoverages_CHK_loss_of_use_exp(String dataVal)
	{
	se.element().waitForElement(AdditionalCoverages_CHK_loss_of_use_exp ,dataVal);
	return se.element().getElement(AdditionalCoverages_CHK_loss_of_use_exp,dataVal);
	}
	
	/*****************************************
	 * End of Additional Coverages page locators
	 ******************************************/
	
	
	/*****************************************
	 * Start of GarageKeepersCustmersSoundRecevingCoverage page locators
	 ******************************************/
	
	public By GarageKeepersCustmersSoundRecevingCov_BTN_Label = By.xpath("//*[contains(@id,'garage_keeper_snd_rec_cov-label')]");
	
	public WebElement getGarageKeepersCustmersSoundRecevingCov_BTN_Label()
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_BTN_Label);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_BTN_Label);
	}
	
	public By GarageKeepersCustmersSoundRecevingCov_BTN_AddCov =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_BTN_AddCov()
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_BTN_AddCov);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_BTN_AddCov);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_BTN_CopyCov =By.id("04ce06b5-45f7-3eb6-a0e2-513896679f20-copybutton-image");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_BTN_CopyCov(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_BTN_CopyCov ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_BTN_CopyCov,dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_BTN_RemoveCov =By.id("04ce06b5-45f7-3eb6-a0e2-513896679f20-delete-image");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_BTN_RemoveCov(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_BTN_RemoveCov ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_BTN_RemoveCov,dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_BTN_Details =By.xpath("//*[contains(@id,'1garage_keeper_snd_rec_cov-image')]");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_BTN_Details(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_BTN_Details ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_BTN_Details,dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasis =By.id("field_key$d1e2aade-26ef-327a-9177-509529da605c$1primary_rating_basis-textbox");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasis(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasis ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasis,dataVal);
	}
	
	public By GarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasisSearch =By.xpath("//*[contains(@id,'primary_rating_basis-textbox')]/../div");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasisSearch(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasisSearch ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_PrimaryRatingBasisSearch,dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_TXT_LocationNumber =By.id("field_key$48af5af0-0c81-3dcb-9204-900eee4a48d8$1location_no-textbox");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_LocationNumber(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_LocationNumber ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_LocationNumber,dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_TXT_Name =By.id("field_key$4f4588c0-35b8-3387-be5c-320d28c8709a$1name-textbox");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_Name(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_Name ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_Name,dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_TXT_Description =By.id("field_key$b8bd9ad9-f4fb-356b-9625-e06360abdd71$1description-textbox");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_Description(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_Description ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_Description,dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_TXT_Street =By.id("field_key$e9c9e691-37dd-3570-b832-f475aa239d73$1line_1-textbox");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_Street(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_Street ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_Street,dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_TXT_City =By.id("field_key$f309630c-f19c-3652-8d0d-4245d4454503$1city-textbox");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_City(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_City ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_City,dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_TXT_State =By.id("field_key$b2e47cfa-4055-37f7-8f9b-926a4e1590cb$1state_code-listbox");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_State(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_State ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_State,dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_TXT_ZipCode =By.id("field_key$88b5c497-76c0-3f98-931f-7fb5a4393c76$1zip_code-textbox");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_ZipCode(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_ZipCode ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_ZipCode,dataVal);
	}
	
	public By GarageKeepersCustmersSoundRecevingCov_CHK_DoNotApplyCityOrCountyTaxes = By
			.xpath("//span[contains(@id,'is_no_tax-checkbox')]/input");

	public WebElement getGarageKeepersCustmersSoundRecevingCov_CHK_DoNotApplyCityOrCountyTaxes(String dataVal) {
		se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_CHK_DoNotApplyCityOrCountyTaxes, dataVal);
		return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_CHK_DoNotApplyCityOrCountyTaxes, dataVal);
	}

	public By GarageKeepersCustmersSoundRecevingCov_CHK_AllCityName = By.xpath("//span[contains(@id,'c_municipality_name-checkbox')]/input");

	public WebElement getGarageKeepersCustmersSoundRecevingCov_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_CHK_AllCityName, dataVal);
		return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_CHK_AllCityName, dataVal);
	}

	public By GarageKeepersCustmersSoundRecevingCov_TXT_KYCity = By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]");
			//.id("field_key$e1403b3e-f76f-397d-b677-c86cbfcfd63c$1risk_municipality_name-textbox");

	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_KYCity(String dataVal) {
		se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_KYCity, dataVal);
		return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_KYCity, dataVal);
	}

	public By GarageKeepersCustmersSoundRecevingCov_TXT_CityCode = By.xpath("//*[contains(@id,'1risk_city_code-textbox')]");
			//.id("field_key$712bfbe9-0350-3b19-b3af-ff58e9aea68b$1risk_city_code-textbox");

	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_CityCode(String dataVal) {
		se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_CityCode, dataVal);
		return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_CityCode, dataVal);
	}

	
	public By GarageKeepersCustmersSoundRecevingCov_TXT_County = By.xpath("//*[contains(@id,'1risk_county-textbox')]");
			//.id("field_key$7488f220-0a91-3b8b-bd9f-6d3ad671f255$1risk_county-textbox");

	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_County(String dataVal) {
		se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_County, dataVal);
		return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_County, dataVal);
	}

	public By GarageKeepersCustmersSoundRecevingCov_TXT_CountyCode = By.xpath("//*[contains(@id,'1risk_county_code-textbox')]");
			//.id("field_key$678a97f1-935f-3203-9a6f-95a13f25bf9f$1risk_county_code-textbox");

	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_CountyCode, dataVal);
		return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_CountyCode, dataVal);
	}

	public By GarageKeepersCustmersSoundRecevingCov_TXT_TaxCode = By.xpath("//*[contains(@id,'1risk_tax_code-textbox')]");
			//.id("field_key$0f26809b-72be-39a4-8d06-8edb123995ba$1risk_tax_code-textbox");

	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_TaxCode, dataVal);
		return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_TaxCode, dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_TXT_Classification =By.id("field_key$afcc0f26-814f-38a2-89fd-040b974bd388$1classification-textbox");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_Classification(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_Classification ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_Classification,dataVal);
	}
	
	public By GarageKeepersCustmersSoundRecevingCov_BTN_ClassificationSearch = By.xpath("//*[contains(@id,'classification-textbox')]/../div");

	public WebElement getGarageKeepersCustmersSoundRecevingCov_BTN_ClassificationSearch(String dataVal) {
		se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_BTN_ClassificationSearch, dataVal);
		return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_BTN_ClassificationSearch, dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_CHK_OtherThanCollision =By.xpath("//*[contains(@id,'gara_otc-checkbox')]/input");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_CHK_OtherThanCollision(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_CHK_OtherThanCollision ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_CHK_OtherThanCollision,dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_TXT_Type =By.id("field_key$8e8786b3-c8ad-3cf3-9e59-e4d6e8cdad89$1loss_type-textbox");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_Type(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_Type ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_Type,dataVal);
	}
	
	
	public By GarageKeepersCustmersSoundRecevingCov_BTN_TypeSearch = By.xpath("//*[contains(@id,'loss_type-textbox')]/../div");

	public WebElement getGarageKeepersCustmersSoundRecevingCov_BTN_TypeSearch(String dataVal) {
		se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_BTN_TypeSearch, dataVal);
		return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_BTN_TypeSearch, dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_TXT_DedPerCar =By.id("field_key$cad44b95-6f10-3c39-9797-b632e0dc873e$1deductible_per_car-textbox");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_DedPerCar(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_DedPerCar ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_DedPerCar,dataVal);
	}
	
	public By GarageKeepersCustmersSoundRecevingCov_BTN_DedPerCarSearch = By.xpath("//*[contains(@id,'deductible_per_car-textbox')]/../div");

	public WebElement getGarageKeepersCustmersSoundRecevingCov_BTN_DedPerCarSearch(String dataVal) {
		se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_BTN_DedPerCarSearch, dataVal);
		return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_BTN_DedPerCarSearch, dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_TXT_DedPerOccurence =By.id("field_key$949e70aa-a5f3-3e4c-84f3-fff304110f31$1deductible_per_occu-textbox");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_DedPerOccurence(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_DedPerOccurence ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_DedPerOccurence,dataVal);
	}
	
	public By GarageKeepersCustmersSoundRecevingCov_TXT_OTCMaxLimit =By.id("field_key$260b2b49-968c-37d9-8562-5ac1f23bdc20$1max_limit-textbox");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_OTCMaxLimit(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_OTCMaxLimit ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_OTCMaxLimit,dataVal);
	}
	
	public By GarageKeepersCustmersSoundRecevingCov_BTN_OTCMaxLimitSearch = By.xpath("//*[contains(@id,'field_key$260b2b49-968c-37d9-8562-5ac1f23bdc20$1max_limit-textbox')]/../div");

	public WebElement getGarageKeepersCustmersSoundRecevingCov_BTN_OTCMaxLimitSearch(String dataVal) {
		se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_BTN_OTCMaxLimitSearch, dataVal);
		return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_BTN_OTCMaxLimitSearch, dataVal);
	}
	
	                            
	public By GarageKeepersCustmersSoundRecevingCov_CHK_Collosion =By.xpath("//*[contains(@id,'gara_collision-checkbox')]/input");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_CHK_Collosion(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_CHK_Collosion ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_CHK_Collosion,dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_TXT_Deductible =By.id("field_key$26402d25-7c8f-3a7b-988c-af9f1cff598f$1deductible-textbox");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_Deductible(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_Deductible ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_Deductible,dataVal);
	}
	
	public By GarageKeepersCustmersSoundRecevingCov_BTN_DeductibleSearch = By.xpath("//*[contains(@id,'field_key$26402d25-7c8f-3a7b-988c-af9f1cff598f$1deductible-textbox')]/../div");

	public WebElement getGarageKeepersCustmersSoundRecevingCov_BTN_DeductibleSearch(String dataVal) {
		se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_BTN_DeductibleSearch, dataVal);
		return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_BTN_DeductibleSearch, dataVal);
	}
	                            
	public By GarageKeepersCustmersSoundRecevingCov_TXT_MaxLimit =By.id("field_key$135e081b-bbce-3b5a-9520-fe1157338d8a$1maximum_limit-textbox");
	public WebElement getGarageKeepersCustmersSoundRecevingCov_TXT_MaxLimit(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_TXT_MaxLimit ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_TXT_MaxLimit,dataVal);
	}
	
	
	public By GarageKeepersCustmersSoundRecevingCov_BTN_MaxLimitSearch = By.xpath("//*[contains(@id,'field_key$135e081b-bbce-3b5a-9520-fe1157338d8a$1maximum_limit-textbox')]/../div");

	public WebElement getGarageKeepersCustmersSoundRecevingCov_BTN_MaxLimitSearch(String dataVal) {
		se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_BTN_MaxLimitSearch, dataVal);
		return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_BTN_MaxLimitSearch, dataVal);
	}
	
	public By GarageKeepersCustmersSoundRecevingCov_BTN_Done =By.xpath("//*[contains(@id,'/-continue-image')]");
	public WebElement getstrGarageKeepersCustmersSoundRecevingCov_BTN_Done(String dataVal)
	{
	se.element().waitForElement(GarageKeepersCustmersSoundRecevingCov_BTN_Done ,dataVal);
	return se.element().getElement(GarageKeepersCustmersSoundRecevingCov_BTN_Done,dataVal);
	}
	
	
	/*****************************************
	 * End of GarageKeepersCustmersSoundRecevingCoverage page locators
	 ******************************************/
	
	
	/*****************************************
	 * Start of HiredOrBorrowedAuto page locators
	 ******************************************/
	
	public By HiredOrBorrowedAuto_BTN_Label = By.xpath("//*[contains(@id,'hired_borrow_cov-label')]");
	
	public WebElement getHiredOrBorrowedAuto_BTN_Label()
	{
	se.element().waitForElement(HiredOrBorrowedAuto_BTN_Label);
	return se.element().getElement(HiredOrBorrowedAuto_BTN_Label);
	}
	
	public By HiredOrBorrowedAuto_BTN_Add =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getHiredOrBorrowedAuto_BTN_Add()
	{
	se.element().waitForElement(HiredOrBorrowedAuto_BTN_Add);
	return se.element().getElement(HiredOrBorrowedAuto_BTN_Add);
	}
	                            
	public By HiredOrBorrowedAuto_BTN_RemoveCov =By.xpath("//div[contains(@id,'delete-image')]");
	public WebElement getHiredOrBorrowedAuto_BTN_RemoveCov()
	{
	se.element().waitForElement(HiredOrBorrowedAuto_BTN_RemoveCov);
	return se.element().getElement(HiredOrBorrowedAuto_BTN_RemoveCov);
	}
	
	
	public By HiredOrBorrowedAuto_BTN_Details;

	public WebElement getHiredOrBorrowedAuto_BTN_Details(String dataVal) {
		HiredOrBorrowedAuto_BTN_Details = By.xpath("//div[contains(@id,'"+dataVal+"hired_borrow_cov-image')]");
		se.element().waitForElement(HiredOrBorrowedAuto_BTN_Details);
		return se.element().getElement(HiredOrBorrowedAuto_BTN_Details);
	}
	
	public By HiredOrBorrowedAuto_selectDetails;

	public WebElement getHiredOrBorrowedAuto_selectDetails(String dataVal) {
		HiredOrBorrowedAuto_selectDetails = By.xpath("(//*[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
		
		se.element().waitForElement(HiredOrBorrowedAuto_selectDetails);
		return se.element().getElement(HiredOrBorrowedAuto_selectDetails);
	}
	                            
	                            
	public By HiredOrBorrowedAuto_TXT_State =By.id("field_key$7106a3ac-9b71-3991-84b1-da2cb6509038$1state-textbox");
	public WebElement getHiredOrBorrowedAuto_TXT_State(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_TXT_State ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_TXT_State,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_TXT_ZipCode =By.id("field_key$cbd06bbe-eced-3eb3-a7bb-946cd2898d13$1zip_code-textbox");
	public WebElement getHiredOrBorrowedAuto_TXT_ZipCode(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_TXT_ZipCode ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_TXT_ZipCode,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_TXT_HiredAutoType =By.id("field_key$dac46dc8-5e43-3553-846e-c49161853838$1hired_auto_type-textbox");
	public WebElement getHiredOrBorrowedAuto_TXT_HiredAutoType(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_TXT_HiredAutoType ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_TXT_HiredAutoType,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_CHK_Liability =By.xpath("//*[contains(@id,'liability-checkbox')]/input");
	public WebElement getHiredOrBorrowedAuto_CHK_Liability(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_CHK_Liability ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_CHK_Liability,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_TXT_CostOfHire =By.id("field_key$ec49b520-b638-39af-8ef4-38de36cc315f$1cost_of_hire-textbox");
	public WebElement getHiredOrBorrowedAuto_TXT_CostOfHire(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_TXT_CostOfHire ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_TXT_CostOfHire,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_TXT_CSL =By.id("field_key$726a9235-054f-3957-b7c6-01a0e8e03a64$1combined_single_limit_disp-textbox");
	public WebElement getHiredOrBorrowedAuto_TXT_CSL(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_TXT_CSL ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_TXT_CSL,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_TXT_Deductible =By.id("field_key$d651f0e2-a588-3b1d-9be9-cf4977c36e28$1deductible-textbox");
	public WebElement getHiredOrBorrowedAuto_TXT_Deductible(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_TXT_Deductible ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_TXT_Deductible,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_CHK_DedType_CSL =By.xpath("//*[contains(text(),'Combined Single Limit')]/../../preceding-sibling::div[1]//input");
	public WebElement getHiredOrBorrowedAuto_CHK_DedType_CSL(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_CHK_DedType_CSL ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_CHK_DedType_CSL,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_CHK_DedType_PropDamPerAccDed =By.xpath("//*[contains(text(),'Property Damage Per Accident Deductible')]/../../preceding-sibling::div[1]//input");
	public WebElement getHiredOrBorrowedAuto_CHK_DedType_PropDamPerAccDed(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_CHK_DedType_PropDamPerAccDed ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_CHK_DedType_PropDamPerAccDed,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_CHK_CovergaeType_ExcessLiability =By.xpath("//*[text()='Excess Liability']/../../preceding-sibling::div[1]//input");
	public WebElement getHiredOrBorrowedAuto_CHK_CovergaeType_ExcessLiability(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_CHK_CovergaeType_ExcessLiability ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_CHK_CovergaeType_ExcessLiability,dataVal);
	}
	 
	public By HiredOrBorrowedAuto_CHK_CoveragType_PrimaryLiability =By.xpath("//*[text()='Primary Liability']/../../preceding-sibling::div[1]//input");
	public WebElement getHiredOrBorrowedAuto_CHK_CoveragType_PrimaryLiability(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_CHK_CoveragType_PrimaryLiability ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_CHK_CoveragType_PrimaryLiability,dataVal);
	}
	
	
	public By HiredOrBorrowedAuto_CHK_RentalBasis_CostOfHire =By.xpath("//*[text()='Cost of Hire']/../../preceding-sibling::div[1]//input");
	public WebElement getHiredOrBorrowedAuto_CHK_RentalBasis_CostOfHire(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_CHK_RentalBasis_CostOfHire ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_CHK_RentalBasis_CostOfHire,dataVal);
	}
	
	
	public By HiredOrBorrowedAuto_CHK_RentalBasis_RentalPeriod =By.xpath("//*[text()='Rental Period']/../../preceding-sibling::div[1]//input");
	public WebElement getHiredOrBorrowedAuto_CHK_RentalBasis_RentalPeriod(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_CHK_RentalBasis_RentalPeriod ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_CHK_RentalBasis_RentalPeriod,dataVal);
	}
	
	public By HiredOrBorrowedAuto_CHK_PersonalInjuryProtection =By.xpath("//*[contains(@id,'1personal_injury-checkbox')]/input");
	public WebElement getHiredOrBorrowedAuto_CHK_PersonalInjuryProtection(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_CHK_PersonalInjuryProtection ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_CHK_PersonalInjuryProtection,dataVal);
	}
	public By HiredOrBorrowedAuto_CHK_MedicalPayments =By.xpath("//*[contains(@id,'med_pay-checkbox')]/input");
	public WebElement getHiredOrBorrowedAuto_CHK_MedicalPayments(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_CHK_MedicalPayments ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_CHK_MedicalPayments,dataVal);
	}
	
	                            
	public By HiredOrBorrowedAuto_CHK_AutosLeasedHiredRentedOrBorWithDrivers =By.xpath("//*[contains(@id,'auto_leased_hired-checkbox')]/input");
	public WebElement getHiredOrBorrowedAuto_CHK_AutosLeasedHiredRentedOrBorWithDrivers(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_CHK_AutosLeasedHiredRentedOrBorWithDrivers ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_CHK_AutosLeasedHiredRentedOrBorWithDrivers,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_CHK_OthrThanCollision =By.xpath("//*[contains(@id,'1otc-checkbox')]/input");
	public WebElement getHiredOrBorrowedAuto_CHK_OthrThanCollision(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_CHK_OthrThanCollision ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_CHK_OthrThanCollision,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_TXT_Type =By.id("field_key$039bbf9e-6e57-3cbf-a3ff-9bb584f2eeca$1loss_type-textbox");
	public WebElement getHiredOrBorrowedAuto_TXT_Type(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_TXT_Type ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_TXT_Type,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_TXT_OtherThanColl_CostOfHire =By.id("field_key$be402a77-5cb8-3e0d-82f8-2568065de148$1cost_of_hire-textbox");
	public WebElement getHiredOrBorrowedAuto_TXT_OtherThanColl_CostOfHire(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_TXT_OtherThanColl_CostOfHire ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_TXT_OtherThanColl_CostOfHire,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_TXT_OtherThanColl_Deductible =By.id("field_key$12fcbe3d-82e0-3bdd-bf01-e4d0673c301d$1deductible-textbox");
	public WebElement getHiredOrBorrowedAuto_TXT_OtherThanColl_Deductible(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_TXT_OtherThanColl_Deductible ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_TXT_OtherThanColl_Deductible,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_TXT_MaxLmt =By.id("field_key$80f317c1-d154-38b3-a511-f79509e334c8$1max_limit-textbox");
	public WebElement getHiredOrBorrowedAuto_TXT_MaxLmt(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_TXT_MaxLmt ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_TXT_MaxLmt,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_TXT_DailyRate =By.id("field_key$08b30182-ceaf-3f50-9753-826697e557ff$1daily_rate_display-textbox");
	public WebElement getHiredOrBorrowedAuto_TXT_DailyRate(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_TXT_DailyRate ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_TXT_DailyRate,dataVal);
	}
	
	public By HiredOrBorrowedAuto_TXT_JurisdictionDesc = By.xpath("//input[contains(@id,'municipality-textbox')]");

	public WebElement getHiredOrBorrowedAuto_TXT_JurisdictionDesc(String dataVal) {
		se.element().waitForElement(HiredOrBorrowedAuto_TXT_JurisdictionDesc, dataVal);
		return se.element().getElement(HiredOrBorrowedAuto_TXT_JurisdictionDesc, dataVal);
	}

	public By HiredOrBorrowedAuto_TXT_FPDCode = By.xpath("//*[contains(@id,'1municipality_code-textbox')]");
			//.id("field_key$60f81668-d046-3fb3-b76e-b805acf25c52$1municipality_code-textbox");

	public WebElement getHiredOrBorrowedAuto_TXT_FPDCode(String dataVal) {
		se.element().waitForElement(HiredOrBorrowedAuto_TXT_FPDCode, dataVal);
		return se.element().getElement(HiredOrBorrowedAuto_TXT_FPDCode, dataVal);
	}

	public By HiredOrBorrowedAuto_TXT_FireProtectionDistrict = By.xpath("//*[contains(@id,'1municipality_desc-textbox')]");
			//.id("field_key$afa794bb-9c62-3d38-a72d-da8f65b768e2$1municipality_desc-textbox");

	public WebElement getHiredOrBorrowedAuto_TXT_FireProtectionDistrict(String dataVal) {
		se.element().waitForElement(HiredOrBorrowedAuto_TXT_FireProtectionDistrict, dataVal);
		return se.element().getElement(HiredOrBorrowedAuto_TXT_FireProtectionDistrict, dataVal);
	}
	
	
	                            
	public By HiredOrBorrowedAuto_CHK_Collision =By.xpath("//*[contains(@id,'collision-checkbox')]/input");
	public WebElement getHiredOrBorrowedAuto_CHK_Collision(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_CHK_Collision ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_CHK_Collision,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_TXT_Collision_Deductible =By.id("field_key$1258b2eb-bbbf-349e-9bfa-f4308d878695$1deductible-textbox");
	public WebElement getHiredOrBorrowedAuto_TXT_Collision_Deductible(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_TXT_Collision_Deductible ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_TXT_Collision_Deductible,dataVal);
	}
	                            
	public By HiredOrBorrowedAuto_TXT_Collision_DailyRate =By.id("field_key$00ceea23-eaa6-367a-9e17-c3f2cec9496a$1daily_rate_display-textbox");
	public WebElement getHiredOrBorrowedAuto_TXT_Collision_DailyRate(String dataVal)
	{
	se.element().waitForElement(HiredOrBorrowedAuto_TXT_Collision_DailyRate ,dataVal);
	return se.element().getElement(HiredOrBorrowedAuto_TXT_Collision_DailyRate,dataVal);
	}
	
	
	/*****************************************
	 * End of HiredOrBorrowedAuto page locators
	 ******************************************/
	
	
	
	/*****************************************
	 * Start of LossOfUseExpensesRentalVehicle page locators
	 ******************************************/
	public By LossOfUseExpenses_BTN_Label = By.xpath("//*[contains(@id,'loss_of_use_exp_cov-label')]");
	
	public WebElement getLossOfUseExpenses_BTN_Label()
	{
	se.element().waitForElement(LossOfUseExpenses_BTN_Label);
	return se.element().getElement(LossOfUseExpenses_BTN_Label);
	}
	
	public By LossOfUseExpenses_TXT_AmtPerDay =By.id("field_key$f8b68cdb-954a-3b8a-a4d9-43ea450b6983$1amt_per_day-textbox");
	public WebElement getLossOfUseExpenses_TXT_AmtPerDay(String dataVal)
	{
	se.element().waitForElement(LossOfUseExpenses_TXT_AmtPerDay ,dataVal);
	return se.element().getElement(LossOfUseExpenses_TXT_AmtPerDay,dataVal);
	}
	                            
	public By LossOfUseExpenses_TXT_MaxLimit =By.id("field_key$f7742c2e-9fa1-3de1-923b-04020eb2a145$1max_amount-textbox");
	public WebElement getLossOfUseExpenses_TXT_MaxLimit(String dataVal)
	{
	se.element().waitForElement(LossOfUseExpenses_TXT_MaxLimit ,dataVal);
	return se.element().getElement(LossOfUseExpenses_TXT_MaxLimit,dataVal);
	}
	public By LossOfUseExpenses_TXT_AmtPerDaySearch =By.xpath("//input[contains(@id,'1amt_per_day-textbox')]/../div");
	public WebElement getLossOfUseExpenses_TXT_AmtPerDaySearch(String dataVal)
	{
	se.element().waitForElement(LossOfUseExpenses_TXT_AmtPerDaySearch ,dataVal);
	return se.element().getElement(LossOfUseExpenses_TXT_AmtPerDaySearch,dataVal);
	}
	
	/*****************************************
	 * End of LossOfUseExpensesRentalVehicle page locators
	 ******************************************/
	/*****************************************
	 * Start of Year 2000 Endorsements page locators
	 ******************************************/
	public By Year2000Endorsements_Label =By.xpath("//*[contains(@id,'year_2000_endorse_cov-label')]");
	public WebElement getYear2000Endorsements()
	{
	se.element().waitForElement(Year2000Endorsements_Label);
	return se.element().getElement(Year2000Endorsements_Label);
	}
	
	      
	public By Year2000Endorsements_CHK_EndorsmentType_Exclusions =By.xpath("//div[text()='Exclusions']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getYear2000Endorsements_CHK_EndorsmentType_Exclusions(String dataVal)
	{
	se.element().waitForElement(Year2000Endorsements_CHK_EndorsmentType_Exclusions ,dataVal);
	return se.element().getElement(Year2000Endorsements_CHK_EndorsmentType_Exclusions,dataVal);
	}
	                            
	public By Year2000Endorsements_CHK_EndorsmentType_LimitedCoverage =By.xpath("//div[text()='Limited Coverage']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getYear2000Endorsements_CHK_EndorsmentType_LimitedCoverage(String dataVal)
	{
	se.element().waitForElement(Year2000Endorsements_CHK_EndorsmentType_LimitedCoverage ,dataVal);
	return se.element().getElement(Year2000Endorsements_CHK_EndorsmentType_LimitedCoverage,dataVal);
	}
	                            
	public By Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblems =By.xpath("//*[contains(@id,'1excl_2000croep-checkbox')]/input");
	public WebElement getYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblems(String dataVal)
	{
	se.element().waitForElement(Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblems ,dataVal);
	return se.element().getElement(Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblems,dataVal);
	}
	                            
	public By Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsProductsWorkYouPerformed =By.xpath("//*[contains(@id,'1excl_2000croep_wrkuperf-checkbox')]/input");
	public WebElement getYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsProductsWorkYouPerformed(String dataVal)
	{
	se.element().waitForElement(Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsProductsWorkYouPerformed ,dataVal);
	return se.element().getElement(Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsProductsWorkYouPerformed,dataVal);
	}
	                            
	public By Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsWithExceptionForBodilyInjuryOnYourPremises =By.xpath("//*[contains(@id,'1excl_2000croep_bodinj-checkbox')]/input");
	public WebElement getYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsWithExceptionForBodilyInjuryOnYourPremises(String dataVal)
	{
	se.element().waitForElement(Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsWithExceptionForBodilyInjuryOnYourPremises ,dataVal);
	return se.element().getElement(Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsWithExceptionForBodilyInjuryOnYourPremises,dataVal);
	}
	                            
	public By Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsExclusionOfSpecifiedCovForDesgLocProdServicesOrWork =By.xpath("//*[contains(@id,'1excl_2000croep_exclspec-checkbox')]/input");
	public WebElement getYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsExclusionOfSpecifiedCovForDesgLocProdServicesOrWork(String dataVal)
	{
	se.element().waitForElement(Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsExclusionOfSpecifiedCovForDesgLocProdServicesOrWork ,dataVal);
	return se.element().getElement(Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsExclusionOfSpecifiedCovForDesgLocProdServicesOrWork,dataVal);
	}
	   
	/*****************************************
	 * End of Year 2000 Endorsements page locators
	 ******************************************/
	/*****************************************
	 * Start of Registration plates page locators
	 ******************************************/
	
	public By RegistrationPlates_Label =By.xpath("//*[contains(@id,'registr_plates_cov-label')]");
	public WebElement getRegistrationPlates()
	{
	se.element().waitForElement(RegistrationPlates_Label);
	return se.element().getElement(RegistrationPlates_Label);
	}
	
	
	public By RegistrationPlates_BTN_Add =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getRegistrationPlates_BTN_Add(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_BTN_Add ,dataVal);
	return se.element().getElement(RegistrationPlates_BTN_Add,dataVal);
	}
	                            
	public By RegistrationPlates_BTN_RemoveCov =By.xpath("//*[contains(@id,'delete-image')]");
	public WebElement getRegistrationPlates_BTN_RemoveCov(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_BTN_RemoveCov ,dataVal);
	return se.element().getElement(RegistrationPlates_BTN_RemoveCov,dataVal);
	}
	                            
	public By RegistrationPlates_BTN_Done =By.xpath("//*[contains(@id,'-continue-image')]");
	public WebElement getRegistrationPlates_BTN_Done(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_BTN_Done ,dataVal);
	return se.element().getElement(RegistrationPlates_BTN_Done,dataVal);
	}
	                            
	public By RegistrationPlates_BTN_Details =By.xpath("//*[contains(@id,'registr_plates_cov-image')]");
	public WebElement getRegistrationPlates_BTN_Details(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_BTN_Details ,dataVal);
	return se.element().getElement(RegistrationPlates_BTN_Details,dataVal);
	}
	                            
	public By RegistrationPlates_TXT_State =By.xpath("//*[contains(@id,'state-textbox')]");
	public WebElement getRegistrationPlates_TXT_State(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_TXT_State ,dataVal);
	return se.element().getElement(RegistrationPlates_TXT_State,dataVal);
	}
	                            
	public By RegistrationPlates_TXT_StateSearch =By.xpath("//*[contains(@id,'state-textbox')]/../div");
	public WebElement getRegistrationPlates_TXT_StateSearch(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_TXT_StateSearch ,dataVal);
	return se.element().getElement(RegistrationPlates_TXT_StateSearch,dataVal);
	}
	                            
	public By RegistrationPlates_TXT_ZipCode =By.xpath("//*[contains(@id,'1zip_code-textbox')]");
	public WebElement getRegistrationPlates_TXT_ZipCode(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_TXT_ZipCode ,dataVal);
	return se.element().getElement(RegistrationPlates_TXT_ZipCode,dataVal);
	}
	                            
	public By RegistrationPlates_TXT_ZipCodeSearch =By.xpath("//*[contains(@id,'1zip_code-textbox')]/../div");
	public WebElement getRegistrationPlates_TXT_ZipCodeSearch(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_TXT_ZipCodeSearch ,dataVal);
	return se.element().getElement(RegistrationPlates_TXT_ZipCodeSearch,dataVal);
	}
	                            
	public By RegistrationPlates_TXT_NoOfPlates =By.xpath("//*[contains(@id,'1no_of_plates-textbox')]");
	public WebElement getRegistrationPlates_TXT_NoOfPlates(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_TXT_NoOfPlates ,dataVal);
	return se.element().getElement(RegistrationPlates_TXT_NoOfPlates,dataVal);
	}
	                            
	public By RegistrationPlates_TXT_DescriptionOfPlates =By.xpath("//*[contains(@id,'1plates_des-textbox')]");
	public WebElement getRegistrationPlates_TXT_DescriptionOfPlates(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_TXT_DescriptionOfPlates ,dataVal);
	return se.element().getElement(RegistrationPlates_TXT_DescriptionOfPlates,dataVal);
	}
	                            
	public By RegistrationPlates_TXT_Territory =By.xpath("//*[contains(@id,'1territory_code-textbox')]");
	public WebElement getRegistrationPlates_TXT_Territory(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_TXT_Territory ,dataVal);
	return se.element().getElement(RegistrationPlates_TXT_Territory,dataVal);
	}
	                            
	public By RegistrationPlates_TXT_TerritorySearch =By.xpath("//*[contains(@id,'1territory_code-textbox')]/../div");
	public WebElement getRegistrationPlates_TXT_TerritorySearch(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_TXT_TerritorySearch ,dataVal);
	return se.element().getElement(RegistrationPlates_TXT_TerritorySearch,dataVal);
	}
	                            
	public By RegistrationPlates_TXT_TerritoryDescription =By.xpath("//*[contains(@id,'1territory-textbox')]");
	public WebElement getRegistrationPlates_TXT_TerritoryDescription(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_TXT_TerritoryDescription ,dataVal);
	return se.element().getElement(RegistrationPlates_TXT_TerritoryDescription,dataVal);
	}
	                            
	public By RegistrationPlates_CHK_Liability =By.xpath("//*[contains(@id,'1liability-checkbox')]/input");
	public WebElement getRegistrationPlates_CHK_Liability(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_CHK_Liability ,dataVal);
	return se.element().getElement(RegistrationPlates_CHK_Liability,dataVal);
	}
	                            
	public By RegistrationPlates_TXT_LiabCSL =By.xpath("//*[contains(@id,'1combined_single_limit_disp-textbox')]");
	public WebElement getRegistrationPlates_TXT_LiabCSL(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_TXT_LiabCSL ,dataVal);
	return se.element().getElement(RegistrationPlates_TXT_LiabCSL,dataVal);
	}
	                            
	public By RegistrationPlates_TXT_LiabDed =By.xpath("//*[contains(@id,'1deductible-textbox')]");
	public WebElement getRegistrationPlates_TXT_LiabDed(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_TXT_LiabDed ,dataVal);
	return se.element().getElement(RegistrationPlates_TXT_LiabDed,dataVal);
	}
	                            
	public By RegistrationPlates_CHK_LiabDedType_CSL =By.xpath("//div[text()='Combined Single Limit']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getRegistrationPlates_CHK_LiabDedType_CSL(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_CHK_LiabDedType_CSL ,dataVal);
	return se.element().getElement(RegistrationPlates_CHK_LiabDedType_CSL,dataVal);
	}
	                            
	public By RegistrationPlates_CHK_LiabDedType_PropDamPerAccDed =By.xpath("//div[text()='Property Damage Per Accident Deductible']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getRegistrationPlates_CHK_LiabDedType_PropDamPerAccDed(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_CHK_LiabDedType_PropDamPerAccDed ,dataVal);
	return se.element().getElement(RegistrationPlates_CHK_LiabDedType_PropDamPerAccDed,dataVal);
	}
	                            
	public By RegistrationPlates_CHK_MedicalPayments =By.xpath("//*[contains(@id,'1medical_payments-checkbox')]/input");
	public WebElement getRegistrationPlates_CHK_MedicalPayments(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_CHK_MedicalPayments ,dataVal);
	return se.element().getElement(RegistrationPlates_CHK_MedicalPayments,dataVal);
	}
	                            
	public By RegistrationPlates_TXT_LimitEachPerson =By.xpath("//*[contains(@id,'1limit_each_person-textbox')]");
	public WebElement getRegistrationPlates_TXT_LimitEachPerson(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_TXT_LimitEachPerson ,dataVal);
	return se.element().getElement(RegistrationPlates_TXT_LimitEachPerson,dataVal);
	}
	                            
	public By RegistrationPlates_TXT_UnInsuredMotoristCSL =By.xpath("//*[contains(@id,'field_key$2575de46-ffff-33c2-9e32-b116ffd730f6$1combined_single_limit-textbox')]");
	public WebElement getRegistrationPlates_TXT_UnInsuredMotoristCSL(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_TXT_UnInsuredMotoristCSL ,dataVal);
	return se.element().getElement(RegistrationPlates_TXT_UnInsuredMotoristCSL,dataVal);
	}
	                            
	public By RegistrationPlates_CHK_UnInsuredMotorist =By.xpath("//*[contains(@id,'field_key$e82f66c9-12f3-3c26-a98b-6197c2fe1084$1uninsured_motorist-checkbox')]/input");
	public WebElement getRegistrationPlates_CHK_UnInsuredMotorist(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_CHK_UnInsuredMotorist ,dataVal);
	return se.element().getElement(RegistrationPlates_CHK_UnInsuredMotorist,dataVal);
	}
	                            
	public By RegistrationPlates_CHK_UnderInsuredMotorist =By.xpath("//*[contains(@id,'field_key$f16de2cc-bed5-30e9-9ca4-a71d290df3ed$1underinsured_motorist-checkbox')]/input");
	public WebElement getRegistrationPlates_CHK_UnderInsuredMotorist(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_CHK_UnderInsuredMotorist ,dataVal);
	return se.element().getElement(RegistrationPlates_CHK_UnderInsuredMotorist,dataVal);
	}
	                            
	public By RegistrationPlates_TXT_UnderInsuredMotoristCSL =By.xpath("//*[contains(@id,'field_key$c685eb01-3bcb-3124-b069-3cb8d672ae58$1combined_single_limit-textbox')]");
	public WebElement getRegistrationPlates_TXT_UnderInsuredMotoristCSL(String dataVal)
	{
	se.element().waitForElement(RegistrationPlates_TXT_UnderInsuredMotoristCSL ,dataVal);
	return se.element().getElement(RegistrationPlates_TXT_UnderInsuredMotoristCSL,dataVal);
	}
	 
	/*****************************************
	 * Start of Registration plates page locators
	 ******************************************/
	
	
	
	/*****************************************
	 * Start of Symbols Locators
	 ******************************************/
	
	public By CovAutoSymbols_TXT_Label = By.xpath("//*[contains(@id,'lob_ca_cvrd_auto_info-label')]");
	public WebElement getCovAutoSymbols_TXT_Label()
	{
	se.element().waitForElement(CovAutoSymbols_TXT_Label);
	return se.element().getElement(CovAutoSymbols_TXT_Label);
	}
	
	public By CovAutoSymbols_CHK_BusAuto_LiabilityCov_1 =By.xpath("//span[@id='field_key$47df5e8d-3d5a-329b-b0c6-2ead5dba33bb$1coverage_1-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_LiabilityCov_1(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_1 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_1,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_LiabilityCov_2 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$1coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_LiabilityCov_2(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_2 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_2,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_LiabilityCov_3 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$1coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_LiabilityCov_3(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_3 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_3,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_LiabilityCov_4 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$1coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_LiabilityCov_4(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_4 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_4,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_LiabilityCov_7 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$1coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_LiabilityCov_7(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_7 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_7,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_LiabilityCov_8 =By.xpath("//span[@id='field_key$375ee3f0-b303-3bb9-9491-a1da2fd7953c$1coverage_8-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_LiabilityCov_8(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_8 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_8,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_LiabilityCov_9 =By.xpath("//span[@id='field_key$05f56ff9-04bf-3434-9509-00013215c504$1coverage_9-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_LiabilityCov_9(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_9 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_9,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_LiabilityCov_10 =By.xpath("//span[@id='field_key$29cf1441-2f96-37df-a688-b63f6a0e3286$1coverage_10-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_LiabilityCov_10(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_10 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_10,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_LiabilityCov_19 =By.xpath("//span[@id='field_key$23e6da06-485b-3afe-9468-5239fa6702b3$1coverage_11-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_LiabilityCov_19(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_19 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_LiabilityCov_19,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_PIPCov_5 =By.xpath("//span[@id='field_key$83eeaf31-fb7c-370a-be44-53b5e3341b5e$2coverage_5-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_PIPCov_5(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_PIPCov_5 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_PIPCov_5,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_PIPCov_7 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$2coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_PIPCov_7(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_PIPCov_7 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_PIPCov_7,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_PIPCov_10 =By.xpath("//span[@id='field_key$29cf1441-2f96-37df-a688-b63f6a0e3286$2coverage_10-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_PIPCov_10(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_PIPCov_10 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_PIPCov_10,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_PIPCov_19 =By.xpath("//span[@id='field_key$23e6da06-485b-3afe-9468-5239fa6702b3$2coverage_11-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_PIPCov_19(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_PIPCov_19 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_PIPCov_19,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_MedPayCov_2 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$3coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_MedPayCov_2(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_2 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_2,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_MedPayCov_3 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$3coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_MedPayCov_3(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_3 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_3,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_MedPayCov_4 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$3coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_MedPayCov_4(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_4 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_4,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_MedPayCov_7 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$3coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_MedPayCov_7(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_7 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_7,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_MedPayCov_8 =By.xpath("//span[@id='field_key$375ee3f0-b303-3bb9-9491-a1da2fd7953c$3coverage_8-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_MedPayCov_8(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_8 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_8,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_MedPayCov_9 =By.xpath("//span[@id='field_key$05f56ff9-04bf-3434-9509-00013215c504$3coverage_9-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_MedPayCov_9(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_9 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_9,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_MedPayCov_10 =By.xpath("//span[@id='field_key$29cf1441-2f96-37df-a688-b63f6a0e3286$3coverage_10-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_MedPayCov_10(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_10 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_10,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_MedPayCov_19 =By.xpath("//span[@id='field_key$23e6da06-485b-3afe-9468-5239fa6702b3$3coverage_11-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_MedPayCov_19(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_19 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_MedPayCov_19,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_2 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$4coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_2(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_2 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_2,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_3 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$4coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_3(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_3 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_3,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_4 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$4coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_4(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_4 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_4,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_6 =By.xpath("//span[@id='field_key$99d13cf9-aee1-3790-ad83-19ecb3131d67$4coverage_6-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_6(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_6 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_6,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_7 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$4coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_7(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_7 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_7,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_8 =By.xpath("//span[@id='field_key$375ee3f0-b303-3bb9-9491-a1da2fd7953c$4coverage_8-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_8(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_8 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_8,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_9 =By.xpath("//span[@id='field_key$05f56ff9-04bf-3434-9509-00013215c504$4coverage_9-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_9(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_9 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_9,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_10 =By.xpath("//span[@id='field_key$29cf1441-2f96-37df-a688-b63f6a0e3286$4coverage_10-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_10(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_10 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_10,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_19 =By.xpath("//span[@id='field_key$23e6da06-485b-3afe-9468-5239fa6702b3$4coverage_11-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_19(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_19 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnInsuredMotCov_19,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_2 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$5coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_2(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_2 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_2,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_3 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$5coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_3(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_3 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_3,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_4 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$5coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_4(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_4 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_4,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_6 =By.xpath("//span[@id='field_key$99d13cf9-aee1-3790-ad83-19ecb3131d67$5coverage_6-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_6(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_6 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_6,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_7 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$5coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_7(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_7 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_7,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_8 =By.xpath("//span[@id='field_key$375ee3f0-b303-3bb9-9491-a1da2fd7953c$5coverage_8-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_8(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_8 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_8,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_9 =By.xpath("//span[@id='field_key$05f56ff9-04bf-3434-9509-00013215c504$5coverage_9-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_9(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_9 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_9,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_10 =By.xpath("//span[@id='field_key$29cf1441-2f96-37df-a688-b63f6a0e3286$5coverage_10-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_10(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_10 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_10,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_19 =By.xpath("//span[@id='field_key$23e6da06-485b-3afe-9468-5239fa6702b3$5coverage_11-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_19(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_19 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_UnderInsuredMotCov_19,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_TowingLabour_3 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$6coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_TowingLabour_3(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_TowingLabour_3 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_TowingLabour_3,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_TowingLabour_7 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$6coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_TowingLabour_7(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_TowingLabour_7 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_TowingLabour_7,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_TowingLabour_10 =By.xpath("//span[@id='field_key$29cf1441-2f96-37df-a688-b63f6a0e3286$6coverage_10-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_TowingLabour_10(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_TowingLabour_10 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_TowingLabour_10,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_TowingLabour_19 =By.xpath("//span[@id='field_key$23e6da06-485b-3afe-9468-5239fa6702b3$6coverage_11-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_TowingLabour_19(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_TowingLabour_19 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_TowingLabour_19,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_Comprehensive_2 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$7coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_Comprehensive_2(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_Comprehensive_2 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_Comprehensive_2,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_Comprehensive_3 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$7coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_Comprehensive_3(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_Comprehensive_3 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_Comprehensive_3,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_Comprehensive_4 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$7coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_Comprehensive_4(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_Comprehensive_4 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_Comprehensive_4,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_Comprehensive_7 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$7coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_Comprehensive_7(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_Comprehensive_7 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_Comprehensive_7,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_Comprehensive_8 =By.xpath("//span[@id='field_key$375ee3f0-b303-3bb9-9491-a1da2fd7953c$7coverage_8-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_Comprehensive_8(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_Comprehensive_8 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_Comprehensive_8,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_Comprehensive_10 =By.xpath("//span[@id='field_key$29cf1441-2f96-37df-a688-b63f6a0e3286$7coverage_10-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_Comprehensive_10(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_Comprehensive_10 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_Comprehensive_10,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_Comprehensive_19 =By.xpath("//span[@id='field_key$23e6da06-485b-3afe-9468-5239fa6702b3$7coverage_11-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_Comprehensive_19(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_Comprehensive_19 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_Comprehensive_19,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_2 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$8coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_2(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_2 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_2,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_3 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$8coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_3(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_3 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_3,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_4 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$8coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_4(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_4 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_4,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_7 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$8coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_7(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_7 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_7,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_8 =By.xpath("//span[@id='field_key$375ee3f0-b303-3bb9-9491-a1da2fd7953c$8coverage_8-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_8(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_8 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_8,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_10 =By.xpath("//span[@id='field_key$29cf1441-2f96-37df-a688-b63f6a0e3286$8coverage_10-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_10(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_10 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_10,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_19 =By.xpath("//span[@id='field_key$23e6da06-485b-3afe-9468-5239fa6702b3$8coverage_11-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_19(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_19 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_SpecCauseofLoss_19,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_Collision_2 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$9coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_Collision_2(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_Collision_2 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_Collision_2,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_Collision_3 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$9coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_Collision_3(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_Collision_3 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_Collision_3,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_Collision_4 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$9coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_Collision_4(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_Collision_4 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_Collision_4,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_Collision_7 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$9coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_Collision_7(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_Collision_7 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_Collision_7,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_Collision_8 =By.xpath("//span[@id='field_key$375ee3f0-b303-3bb9-9491-a1da2fd7953c$9coverage_8-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_Collision_8(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_Collision_8 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_Collision_8,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_Collision_10 =By.xpath("//span[@id='field_key$29cf1441-2f96-37df-a688-b63f6a0e3286$9coverage_10-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_Collision_10(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_Collision_10 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_Collision_10,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_BusAuto_Collision_19 =By.xpath("//span[@id='field_key$23e6da06-485b-3afe-9468-5239fa6702b3$9coverage_11-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_BusAuto_Collision_19(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_BusAuto_Collision_19 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_BusAuto_Collision_19,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_LiabilityCov_21 =By.xpath("//span[@id='field_key$47df5e8d-3d5a-329b-b0c6-2ead5dba33bb$1coverage_1-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_21(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_21 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_21,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_LiabilityCov_22 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$1coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_22(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_22 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_22,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_LiabilityCov_23 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$1coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_23(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_23 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_23,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_LiabilityCov_24 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$1coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_24(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_24 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_24,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_LiabilityCov_27 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$1coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_27(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_27 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_27,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_LiabilityCov_28 =By.xpath("//span[@id='field_key$375ee3f0-b303-3bb9-9491-a1da2fd7953c$1coverage_8-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_28(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_28 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_28,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_LiabilityCov_29 =By.xpath("//span[@id='field_key$05f56ff9-04bf-3434-9509-00013215c504$1coverage_9-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_29(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_29 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_29,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_LiabilityCov_32 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$1coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_LiabilityCov_32(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_32 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_LiabilityCov_32,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PIPCov_25 =By.xpath("//span[@id='field_key$83eeaf31-fb7c-370a-be44-53b5e3341b5e$2coverage_5-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PIPCov_25(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PIPCov_25 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PIPCov_25,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PIPCov_27 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$2coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PIPCov_27(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PIPCov_27 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PIPCov_27,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PIPCov_32 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$2coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PIPCov_32(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PIPCov_32 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PIPCov_32,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_MedPayCov_21 =By.xpath("//span[@id='field_key$47df5e8d-3d5a-329b-b0c6-2ead5dba33bb$3coverage_1-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_MedPayCov_21(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_21 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_21,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_MedPayCov_22 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$3coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_MedPayCov_22(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_22 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_22,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_MedPayCov_23 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$3coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_MedPayCov_23(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_23 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_23,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_MedPayCov_24 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$3coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_MedPayCov_24(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_24 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_24,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_MedPayCov_27 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$3coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_MedPayCov_27(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_27 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_27,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_MedPayCov_28 =By.xpath("//span[@id='field_key$375ee3f0-b303-3bb9-9491-a1da2fd7953c$3coverage_8-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_MedPayCov_28(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_28 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_28,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_MedPayCov_29 =By.xpath("//span[@id='field_key$05f56ff9-04bf-3434-9509-00013215c504$3coverage_9-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_MedPayCov_29(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_29 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_29,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_MedPayCov_32 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$3coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_MedPayCov_32(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_32 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_MedPayCov_32,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_22 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$4coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_22(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_22 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_22,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_23 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$4coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_23(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_23 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_23,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_24 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$4coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_24(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_24 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_24,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_26 =By.xpath("//span[@id='field_key$99d13cf9-aee1-3790-ad83-19ecb3131d67$4coverage_6-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_26(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_26 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_26,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_27 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$4coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_27(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_27 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_27,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_32 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$4coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_32(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_32 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_UnInsuredMotCov_32,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_22 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$5coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_22(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_22 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_22,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_23 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$5coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_23(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_23 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_23,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_24 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$5coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_24(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_24 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_24,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_26 =By.xpath("//span[@id='field_key$99d13cf9-aee1-3790-ad83-19ecb3131d67$5coverage_6-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_26(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_26 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_26,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_27 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$5coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_27(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_27 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_27,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_32 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$5coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_32(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_32 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_UnderInsuredMotCov_32,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_22 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$7coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_22(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_22 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_22,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_23 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$7coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_23(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_23 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_23,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_24 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$7coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_24(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_24 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_24,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_27 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$7coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_27(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_27 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_27,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_28 =By.xpath("//span[@id='field_key$375ee3f0-b303-3bb9-9491-a1da2fd7953c$7coverage_8-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_28(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_28 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_28,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_31 =By.xpath("//span[@id='field_key$23e6da06-485b-3afe-9468-5239fa6702b3$7coverage_11-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_31(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_31 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_31,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_32 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$7coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_32(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_32 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PhyDamCompOTC_32,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PhyDamColl_22 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$8coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PhyDamColl_22(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PhyDamColl_22 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PhyDamColl_22,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PhyDamColl_23 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$8coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PhyDamColl_23(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PhyDamColl_23 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PhyDamColl_23,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PhyDamColl_24 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$8coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PhyDamColl_24(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PhyDamColl_24 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PhyDamColl_24,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PhyDamColl_27 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$8coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PhyDamColl_27(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PhyDamColl_27 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PhyDamColl_27,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PhyDamColl_28 =By.xpath("//span[@id='field_key$375ee3f0-b303-3bb9-9491-a1da2fd7953c$8coverage_8-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PhyDamColl_28(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PhyDamColl_28 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PhyDamColl_28,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PhyDamColl_31 =By.xpath("//span[@id='field_key$23e6da06-485b-3afe-9468-5239fa6702b3$8coverage_11-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PhyDamColl_31(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PhyDamColl_31 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PhyDamColl_31,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_PhyDamColl_32 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$8coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_PhyDamColl_32(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_PhyDamColl_32 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_PhyDamColl_32,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_30 =By.xpath("//span[@id='field_key$29cf1441-2f96-37df-a688-b63f6a0e3286$10coverage_10-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_30(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_30 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_30,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_32 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$10coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_32(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_32 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_GarageKeepersComp_32,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_30 =By.xpath("//span[@id='field_key$29cf1441-2f96-37df-a688-b63f6a0e3286$11coverage_10-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_30(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_30 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_30,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_32 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$11coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_32(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_32 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_AutoDealers_GarageKeepersCo11_32,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_LiabilityCov_61 =By.xpath("//span[@id='field_key$47df5e8d-3d5a-329b-b0c6-2ead5dba33bb$1coverage_1-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_61(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_61 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_61,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_LiabilityCov_62 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$1coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_62(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_62 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_62,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_LiabilityCov_63 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$1coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_63(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_63 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_63,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_LiabilityCov_64 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$1coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_64(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_64 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_64,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_LiabilityCov_67 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$1coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_67(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_67 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_67,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_LiabilityCov_68 =By.xpath("//span[@id='field_key$375ee3f0-b303-3bb9-9491-a1da2fd7953c$1coverage_8-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_68(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_68 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_68,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_LiabilityCov_71 =By.xpath("//span[@id='field_key$23e6da06-485b-3afe-9468-5239fa6702b3$1coverage_11-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_71(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_71 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_71,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_LiabilityCov_72 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$1coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_72(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_72 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_72,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_LiabilityCov_73 =By.xpath("//span[@id='field_key$2ca3dc87-7ded-3533-b3f6-499ddca985b8$1coverage_13-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_73(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_73 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_73,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_LiabilityCov_79 =By.xpath("//span[@id='field_key$52c735df-6145-359a-b4f0-0722ba38491b$1coverage_14-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_LiabilityCov_79(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_79 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_LiabilityCov_79,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PIPCov_65 =By.xpath("//span[@id='field_key$83eeaf31-fb7c-370a-be44-53b5e3341b5e$2coverage_5-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PIPCov_65(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PIPCov_65 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PIPCov_65,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PIPCov_67 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$2coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PIPCov_67(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PIPCov_67 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PIPCov_67,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PIPCov_72 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$2coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PIPCov_72(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PIPCov_72 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PIPCov_72,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PIPCov_73 =By.xpath("//span[@id='field_key$2ca3dc87-7ded-3533-b3f6-499ddca985b8$2coverage_13-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PIPCov_73(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PIPCov_73 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PIPCov_73,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PIPCov_79 =By.xpath("//span[@id='field_key$52c735df-6145-359a-b4f0-0722ba38491b$2coverage_14-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PIPCov_79(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PIPCov_79 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PIPCov_79,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_MedPayCov_62 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$3coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_MedPayCov_62(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_62 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_62,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_MedPayCov_63 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$3coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_MedPayCov_63(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_63 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_63,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_MedPayCov_64 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$3coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_MedPayCov_64(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_64 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_64,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_MedPayCov_67 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$3coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_MedPayCov_67(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_67 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_67,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_MedPayCov_71 =By.xpath("//span[@id='field_key$23e6da06-485b-3afe-9468-5239fa6702b3$3coverage_11-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_MedPayCov_71(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_71 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_71,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_MedPayCov_72 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$3coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_MedPayCov_72(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_72 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_72,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_MedPayCov_73 =By.xpath("//span[@id='field_key$2ca3dc87-7ded-3533-b3f6-499ddca985b8$3coverage_13-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_MedPayCov_73(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_73 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_73,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_MedPayCov_79 =By.xpath("//span[@id='field_key$52c735df-6145-359a-b4f0-0722ba38491b$3coverage_14-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_MedPayCov_79(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_79 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_MedPayCov_79,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_62 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$4coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_62(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_62 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_62,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_63 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$4coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_63(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_63 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_63,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_64 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$4coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_64(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_64 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_64,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_66 =By.xpath("//span[@id='field_key$99d13cf9-aee1-3790-ad83-19ecb3131d67$4coverage_6-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_66(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_66 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_66,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_67 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$4coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_67(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_67 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_67,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_72 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$4coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_72(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_72 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_72,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_73 =By.xpath("//span[@id='field_key$2ca3dc87-7ded-3533-b3f6-499ddca985b8$4coverage_13-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_73(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_73 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_73,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_79 =By.xpath("//span[@id='field_key$52c735df-6145-359a-b4f0-0722ba38491b$4coverage_14-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_79(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_79 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnInsuredMotCov_79,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_62 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$5coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_62(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_62 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_62,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_63 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$5coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_63(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_63 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_63,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_64 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$5coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_64(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_64 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_64,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_66 =By.xpath("//span[@id='field_key$99d13cf9-aee1-3790-ad83-19ecb3131d67$5coverage_6-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_66(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_66 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_66,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_67 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$5coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_67(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_67 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_67,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_72 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$5coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_72(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_72 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_72,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_73 =By.xpath("//span[@id='field_key$2ca3dc87-7ded-3533-b3f6-499ddca985b8$5coverage_13-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_73(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_73 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_73,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_79 =By.xpath("//span[@id='field_key$52c735df-6145-359a-b4f0-0722ba38491b$5coverage_14-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_79(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_79 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_UnderInsuredMotCov_79,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_62 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$7coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_62(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_62 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_62,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_63 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$7coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_63(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_63 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_63,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_64 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$7coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_64(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_64 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_64,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_67 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$7coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_67(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_67 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_67,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_68 =By.xpath("//span[@id='field_key$375ee3f0-b303-3bb9-9491-a1da2fd7953c$7coverage_8-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_68(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_68 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_68,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_72 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$7coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_72(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_72 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_72,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_73 =By.xpath("//span[@id='field_key$2ca3dc87-7ded-3533-b3f6-499ddca985b8$7coverage_13-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_73(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_73 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_73,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_79 =By.xpath("//span[@id='field_key$52c735df-6145-359a-b4f0-0722ba38491b$7coverage_14-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_79(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_79 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamCompOTC_79,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_62 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$8coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_62(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_62 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_62,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_63 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$8coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_63(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_63 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_63,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_64 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$8coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_64(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_64 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_64,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_67 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$8coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_67(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_67 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_67,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_68 =By.xpath("//span[@id='field_key$375ee3f0-b303-3bb9-9491-a1da2fd7953c$8coverage_8-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_68(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_68 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_68,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_72 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$8coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_72(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_72 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_72,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_73 =By.xpath("//span[@id='field_key$2ca3dc87-7ded-3533-b3f6-499ddca985b8$8coverage_13-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_73(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_73 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_73,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_79 =By.xpath("//span[@id='field_key$52c735df-6145-359a-b4f0-0722ba38491b$8coverage_14-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_79(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_79 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamSpeCauseofLoss_79,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamColl_62 =By.xpath("//span[@id='field_key$aaa760a2-7213-322f-ac7b-5757dbc84a4d$9coverage_2-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_62(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_62 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_62,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamColl_63 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$9coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_63(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_63 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_63,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamColl_64 =By.xpath("//span[@id='field_key$18232e46-4f35-3610-aa60-03390bee3592$9coverage_4-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_64(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_64 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_64,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamColl_67 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$9coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_67(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_67 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_67,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamColl_68 =By.xpath("//span[@id='field_key$375ee3f0-b303-3bb9-9491-a1da2fd7953c$9coverage_8-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_68(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_68 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_68,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamColl_72 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$9coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_72(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_72 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_72,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamColl_73 =By.xpath("//span[@id='field_key$2ca3dc87-7ded-3533-b3f6-499ddca985b8$9coverage_13-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_73(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_73 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_73,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamColl_79 =By.xpath("//span[@id='field_key$52c735df-6145-359a-b4f0-0722ba38491b$9coverage_14-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamColl_79(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_79 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamColl_79,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_63 =By.xpath("//span[@id='field_key$1cd25cf2-45d1-3e5a-8967-687e736ed709$10coverage_3-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_63(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_63 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_63,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_67 =By.xpath("//span[@id='field_key$9843b49b-cff5-31a7-94f7-62ed975e16cd$10coverage_7-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_67(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_67 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_67,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_72 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$10coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_72(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_72 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_72,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_73 =By.xpath("//span[@id='field_key$2ca3dc87-7ded-3533-b3f6-499ddca985b8$10coverage_13-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_73(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_73 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_73,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_79 =By.xpath("//span[@id='field_key$52c735df-6145-359a-b4f0-0722ba38491b$10coverage_14-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_79(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_79 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_PhyDamTowLabour_79,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_TraiInterComp_69 =By.xpath("//span[@id='field_key$05f56ff9-04bf-3434-9509-00013215c504$12coverage_9-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_TraiInterComp_69(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_TraiInterComp_69 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_TraiInterComp_69,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_TraiInterComp_70 =By.xpath("//span[@id='field_key$29cf1441-2f96-37df-a688-b63f6a0e3286$12coverage_10-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_TraiInterComp_70(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_TraiInterComp_70 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_TraiInterComp_70,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_TraiInterComp_72 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$12coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_TraiInterComp_72(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_TraiInterComp_72 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_TraiInterComp_72,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_TraiInterComp_73 =By.xpath("//span[@id='field_key$2ca3dc87-7ded-3533-b3f6-499ddca985b8$12coverage_13-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_TraiInterComp_73(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_TraiInterComp_73 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_TraiInterComp_73,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_69 =By.xpath("//span[@id='field_key$05f56ff9-04bf-3434-9509-00013215c504$13coverage_9-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_69(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_69 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_69,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_70 =By.xpath("//span[@id='field_key$29cf1441-2f96-37df-a688-b63f6a0e3286$13coverage_10-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_70(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_70 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_70,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_72 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$13coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_72(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_72 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_72,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_73 =By.xpath("//span[@id='field_key$2ca3dc87-7ded-3533-b3f6-499ddca985b8$13coverage_13-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_73(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_73 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_TraiInterSpecCauseofLoss_73,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_TraiInterColl_69 =By.xpath("//span[@id='field_key$05f56ff9-04bf-3434-9509-00013215c504$14coverage_9-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_TraiInterColl_69(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_TraiInterColl_69 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_TraiInterColl_69,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_TraiInterColl_70 =By.xpath("//span[@id='field_key$29cf1441-2f96-37df-a688-b63f6a0e3286$14coverage_10-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_TraiInterColl_70(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_TraiInterColl_70 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_TraiInterColl_70,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_TraiInterColl_72 =By.xpath("//span[@id='field_key$2a9c6ce8-4f68-3973-ac04-c12c5d4adbc5$14coverage_12-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_TraiInterColl_72(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_TraiInterColl_72 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_TraiInterColl_72,dataVal);
	}
	                            
	public By CovAutoSymbols_CHK_MotCarrier_TraiInterColl_73 =By.xpath("//span[@id='field_key$2ca3dc87-7ded-3533-b3f6-499ddca985b8$14coverage_13-checkbox']/input");
	public WebElement getCovAutoSymbols_CHK_MotCarrier_TraiInterColl_73(String dataVal)
	{
	se.element().waitForElement(CovAutoSymbols_CHK_MotCarrier_TraiInterColl_73 ,dataVal);
	return se.element().getElement(CovAutoSymbols_CHK_MotCarrier_TraiInterColl_73,dataVal);
	}
	                            

	
	
	/*****************************************
	 * End of Symbols Locators
	 ******************************************/
	
	
	

	/*****************************************
	 * Start of RepossessedAutoNone page locators
	 ******************************************/
	
	public By RepossessedAutoNone_Label =By.xpath("//*[contains(@id,'repossessed_auto_cov-label')]");
	public WebElement getRepossessedAutoNone_Label()
	{
	se.element().waitForElement(RepossessedAutoNone_Label );
	return se.element().getElement(RepossessedAutoNone_Label);
	}
	
	
	public By RepossessedAutoNone_CHK_ReportingBasis_Monthly =By.xpath("//div[text()='Monthly']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getRepossessedAutoNone_CHK_ReportingBasis_Monthly(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_CHK_ReportingBasis_Monthly ,dataVal);
	return se.element().getElement(RepossessedAutoNone_CHK_ReportingBasis_Monthly,dataVal);
	}
	                            
	public By RepossessedAutoNone_CHK_ReportingBasis_Quarterly =By.xpath("//div[text()='Quarterly']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getRepossessedAutoNone_CHK_ReportingBasis_Quarterly(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_CHK_ReportingBasis_Quarterly ,dataVal);
	return se.element().getElement(RepossessedAutoNone_CHK_ReportingBasis_Quarterly,dataVal);
	}
	                            
	public By RepossessedAutoNone_CHK_ReportingBasis_None =By.xpath("//div[text()='None']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getRepossessedAutoNone_CHK_ReportingBasis_None(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_CHK_ReportingBasis_None ,dataVal);
	return se.element().getElement(RepossessedAutoNone_CHK_ReportingBasis_None,dataVal);
	}
	                            
	public By RepossessedAutoNone_CHK_Liability =By.xpath("//*[contains(@id,'liability-checkbox')]/input");
	public WebElement getRepossessedAutoNone_CHK_Liability(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_CHK_Liability ,dataVal);
	return se.element().getElement(RepossessedAutoNone_CHK_Liability,dataVal);
	}
	                            
	public By RepossessedAutoNone_CHK_Rows =By.xpath("(//*[@class='v-table-table'])[2]/tbody/tr[2]//span/input");
	public WebElement getRepossessedAutoNone_CHK_Rows(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_CHK_Rows ,dataVal);
	return se.element().getElement(RepossessedAutoNone_CHK_Rows,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_State =By.xpath("//*[contains(@id,'field_key$58ffe7fa-b296-37af-a837-0f91f25e8070$1state-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_State(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_State ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_State,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_StateSearch =By.xpath("//*[contains(@id,'field_key$58ffe7fa-b296-37af-a837-0f91f25e8070$1state-textbox')]/../div[2]");
	public WebElement getRepossessedAutoNone_TXT_StateSearch(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_StateSearch ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_StateSearch,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_Zipcode =By.xpath("//*[contains(@id,'field_key$ab5b6060-8433-3de3-82b4-b537b44affa7$1zip_code-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_Zipcode(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_Zipcode ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_Zipcode,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_ZipcodeSearch =By.xpath("//*[contains(@id,'field_key$ab5b6060-8433-3de3-82b4-b537b44affa7$1zip_code-textbox')]/../div[2]");
	public WebElement getRepossessedAutoNone_TXT_ZipcodeSearch(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_ZipcodeSearch ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_ZipcodeSearch,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_Territory =By.xpath("//*[contains(@id,'territory_code-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_Territory(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_Territory ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_Territory,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_TerritorySearch =By.xpath("//*[contains(@id,'territory_code-textbox')]/../div[2]");
	public WebElement getRepossessedAutoNone_TXT_TerritorySearch(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_TerritorySearch ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_TerritorySearch,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_TownCode =By.xpath("N/A");
	public WebElement getRepossessedAutoNone_TXT_TownCode(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_TownCode ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_TownCode,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_CSL =By.xpath("//*[contains(@id,'combined_single_limit_disp-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_CSL(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_CSL ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_CSL,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_Deductible =By.xpath("//*[contains(@id,'deductible-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_Deductible(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_Deductible ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_Deductible,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_DeductibleType =By.xpath("N/A");
	public WebElement getRepossessedAutoNone_TXT_DeductibleType(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_DeductibleType ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_DeductibleType,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_NNoOfReposAuto =By.xpath("//*[contains(@id,'num_of_rep_autos-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_NNoOfReposAuto(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_NNoOfReposAuto ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_NNoOfReposAuto,dataVal);
	}
	                            
	public By RepossessedAutoNone_CHK_Comprehensive =By.xpath("//*[contains(@id,'comprehensive-checkbox')]/input");
	public WebElement getRepossessedAutoNone_CHK_Comprehensive(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_CHK_Comprehensive ,dataVal);
	return se.element().getElement(RepossessedAutoNone_CHK_Comprehensive,dataVal);
	}
	                            
	public By RepossessedAutoNone_BTN_AddRow =By.xpath("//*[contains(@id,'c9106dd8-da04-31a0-9b47-f3b61dc8dafd-add-image')]");
	public WebElement getRepossessedAutoNone_BTN_AddRow(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_BTN_AddRow ,dataVal);
	return se.element().getElement(RepossessedAutoNone_BTN_AddRow,dataVal);
	}
	                            
	public By RepossessedAutoNone_BTN_RemoveRow =By.xpath("//*[contains(@id,'c9106dd8-da04-31a0-9b47-f3b61dc8dafd-delete-image')]");
	public WebElement getRepossessedAutoNone_BTN_RemoveRow(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_BTN_RemoveRow ,dataVal);
	return se.element().getElement(RepossessedAutoNone_BTN_RemoveRow,dataVal);
	}
	                            
	public By RepossessedAutoNone_BTN_CopyRow =By.xpath("//*[contains(@id,'c9106dd8-da04-31a0-9b47-f3b61dc8dafd-copybutton-image')]");
	public WebElement getRepossessedAutoNone_BTN_CopyRow(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_BTN_CopyRow ,dataVal);
	return se.element().getElement(RepossessedAutoNone_BTN_CopyRow,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_LocationNo =By.xpath("//*[contains(@id,'location_no-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_LocationNo(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_LocationNo ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_LocationNo,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_LocationNoSearch =By.xpath("//*[contains(@id,'location_no-textbox')]/../div[2]");
	public WebElement getRepossessedAutoNone_TXT_LocationNoSearch(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_LocationNoSearch ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_LocationNoSearch,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_Name =By.xpath("//*[contains(@id,'name-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_Name(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_Name ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_Name,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_Description =By.xpath("//*[contains(@id,'description-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_Description(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_Description ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_Description,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_Street =By.xpath("//*[contains(@id,'line_1-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_Street(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_Street ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_Street,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_City =By.xpath("//*[contains(@id,'city-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_City(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_City ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_City,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_ComprehensiveState =By.xpath("//*[contains(@id,'state_code-listbox')]");
	public WebElement getRepossessedAutoNone_TXT_ComprehensiveState(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_State ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_State,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_StateDDN =By.xpath("//*[contains(@id,'state_code-listbox')]/../div[2]");
	public WebElement getRepossessedAutoNone_TXT_StateDDN(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_StateDDN ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_StateDDN,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_ComprehensiveZipcode =By.xpath("//*[contains(@id,'field_key$626c46bd-a134-3268-ba87-88c277aac553$1zip_code-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_ComprehensiveZipcode(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_ComprehensiveZipcode ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_ComprehensiveZipcode,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_ComprehensiveZipcodeSearch =By.xpath("//*[contains(@id,'field_key$626c46bd-a134-3268-ba87-88c277aac553$1zip_code-textbox')]/../div[2]");
	public WebElement getRepossessedAutoNone_TXT_ComprehensiveZipcodeSearch(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_ComprehensiveZipcodeSearch ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_ComprehensiveZipcodeSearch,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_Type =By.xpath("//*[contains(@id,'field_key$4a09b2ec-abb7-3621-81a6-fa9c829b0499$1loss_type-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_Type(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_Type ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_Type,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_TypeSearch =By.xpath("//*[contains(@id,'field_key$4a09b2ec-abb7-3621-81a6-fa9c829b0499$1loss_type-textbox')]/../div[2]");
	public WebElement getRepossessedAutoNone_TXT_TypeSearch(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_TypeSearch ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_TypeSearch,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_TypeOfProperty =By.xpath("//*[contains(@id,'property_type-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_TypeOfProperty(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_TypeOfProperty ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_TypeOfProperty,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_TypeOfPropertySearch =By.xpath("//*[contains(@id,'property_type-textbox')]/../div[2]");
	public WebElement getRepossessedAutoNone_TXT_TypeOfPropertySearch(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_TypeOfPropertySearch ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_TypeOfPropertySearch,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_AllPerilsDeduc =By.xpath("//*[contains(@id,'field_key$cf67b804-e705-3c92-a28b-02bf3a0e09da$1is_all_perils_deduct-checkbox')]/input");
	public WebElement getRepossessedAutoNone_TXT_AllPerilsDeduc(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_AllPerilsDeduc ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_AllPerilsDeduc,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_Value =By.xpath("//*[contains(@id,'field_key$ee6f629f-f742-39d0-b487-b3a2b543290d$1value-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_Value(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_Value ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_Value,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_DeductPerCar =By.xpath("//*[contains(@id,'deductible_per_car-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_DeductPerCar(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_DeductPerCar ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_DeductPerCar,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_DeductPerCarSearch =By.xpath("//*[contains(@id,'deductible_per_car-textbox')]/../div[2]");
	public WebElement getRepossessedAutoNone_TXT_DeductPerCarSearch(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_DeductPerCarSearch ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_DeductPerCarSearch,dataVal);
	}
	                            
	public By RepossessedAutoNone_TXT_DeductPerOcc =By.xpath("//*[contains(@id,'field_key$8f60c260-c6c2-3d7e-9e15-3574ffb4d9d7$1deductible_per_occu-textbox')]");
	public WebElement getRepossessedAutoNone_TXT_DeductPerOcc(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_TXT_DeductPerOcc ,dataVal);
	return se.element().getElement(RepossessedAutoNone_TXT_DeductPerOcc,dataVal);
	}
	                            
	public By RepossessedAutoNone_CHK_ComprehensiveRows =By.xpath("((//*[@class='v-table-table'])[3]/tbody/tr[1]//span/input)[1]");
	public WebElement getRepossessedAutoNone_CHK_ComprehensiveRows(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_CHK_ComprehensiveRows ,dataVal);
	return se.element().getElement(RepossessedAutoNone_CHK_ComprehensiveRows,dataVal);
	}
	                            
	public By RepossessedAutoNone_BTN_ComprehensiveAddRow =By.xpath("//*[contains(@id,'1cbb9819-0b78-3244-8676-e1d6220abae5-add-image')]");
	public WebElement getRepossessedAutoNone_BTN_ComprehensiveAddRow(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_BTN_ComprehensiveAddRow ,dataVal);
	return se.element().getElement(RepossessedAutoNone_BTN_ComprehensiveAddRow,dataVal);
	}
	                            
	public By RepossessedAutoNone_BTN_ComprehensiveRemoveRow =By.xpath("//*[contains(@id,'1cbb9819-0b78-3244-8676-e1d6220abae5-delete-image')]");
	public WebElement getRepossessedAutoNone_BTN_ComprehensiveRemoveRow(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_BTN_ComprehensiveRemoveRow ,dataVal);
	return se.element().getElement(RepossessedAutoNone_BTN_ComprehensiveRemoveRow,dataVal);
	}
	                            
	public By RepossessedAutoNone_BTN_ComprehensiveCopyRow =By.xpath("//*[contains(@id,'1cbb9819-0b78-3244-8676-e1d6220abae5-copybutton-image')]");
	public WebElement getRepossessedAutoNone_BTN_ComprehensiveCopyRow(String dataVal)
	{
	se.element().waitForElement(RepossessedAutoNone_BTN_ComprehensiveCopyRow ,dataVal);
	return se.element().getElement(RepossessedAutoNone_BTN_ComprehensiveCopyRow,dataVal);
	}
	
	/*****************************************
	 * End of RepossessedAutoNone page locators
	 ******************************************/
	/*****************************************
	 * Start of Auto Additional Insured Wrap page locators
	 ******************************************/

	
	public By AutoAddInsuredWrap_Label =By.xpath("//*[contains(@id,'addl_ins_wrap_cov-label')]");
	public WebElement getAutoAddInsuredWrap()
	{
	se.element().waitForElement(AutoAddInsuredWrap_Label);
	return se.element().getElement(AutoAddInsuredWrap_Label);
	}
	                           
	public By AutoAddInsuredWrap_TXT_WrapPercentage =By.xpath("//*[contains(@id,'wrap_percentage-textbox')]");
	public WebElement getAutoAddInsuredWrap_TXT_WrapPercentage(String dataVal)
	{
	se.element().waitForElement(AutoAddInsuredWrap_TXT_WrapPercentage ,dataVal);
	return se.element().getElement(AutoAddInsuredWrap_TXT_WrapPercentage,dataVal);
	}
	                            
	public By AutoAddInsuredWrap_TXT_WrapPercentOverride =By.xpath("//*[contains(@id,'c_wrap_per_override-textbox')]");
	public WebElement getAutoAddInsuredWrap_TXT_WrapPercentOverride(String dataVal)
	{
	se.element().waitForElement(AutoAddInsuredWrap_TXT_WrapPercentOverride ,dataVal);
	return se.element().getElement(AutoAddInsuredWrap_TXT_WrapPercentOverride,dataVal);
	}
	                            
	public By AutoAddInsuredWrap_TXT_TXT_Override_Premium_Reason =By.xpath("//*[contains(@id,'c_override_pre_reason-textarea')]");
	public WebElement getAutoAddInsuredWrap_TXT_TXT_Override_Premium_Reason(String dataVal)
	{
	se.element().waitForElement(AutoAddInsuredWrap_TXT_TXT_Override_Premium_Reason ,dataVal);
	return se.element().getElement(AutoAddInsuredWrap_TXT_TXT_Override_Premium_Reason,dataVal);
	}
	                            
	public By AutoAddInsuredWrap_TXT_TXT_Override_Premium_ReasonSearch =By.xpath("//*[contains(@id,'c_override_pre_reason-textarea')]/../div");
	public WebElement getAutoAddInsuredWrap_TXT_TXT_Override_Premium_ReasonSearch(String dataVal)
	{
	se.element().waitForElement(AutoAddInsuredWrap_TXT_TXT_Override_Premium_ReasonSearch ,dataVal);
	return se.element().getElement(AutoAddInsuredWrap_TXT_TXT_Override_Premium_ReasonSearch,dataVal);
	}
	                            
	/*****************************************
	 * Start of Auto Additional Insured Wrap page locators
	 ******************************************/
	
	/*****************************************
	 * Start of NamedIndividualBroadened page locators
	 ******************************************/
	public By NamedIndvidualBroadened_Label =By.xpath("//*[contains(@id,'named_brd_pip_cov-label')]");
	public WebElement getNamedIndvidualBroadenedLabel()
	{
	se.element().waitForElement(NamedIndvidualBroadened_Label );
	return se.element().getElement(NamedIndvidualBroadened_Label);
	}                           
	public By NamedIndvidualBroadened_BTN_Add =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getNamedIndvidualBroadened_BTN_Add(String dataVal)
	{
	se.element().waitForElement(NamedIndvidualBroadened_BTN_Add ,dataVal);
	return se.element().getElement(NamedIndvidualBroadened_BTN_Add,dataVal);
	}
	public By NamedIndvidualBroadened_BTN_Details ;
	public WebElement getNamedIndvidualBroadened_BTN_Details(String dataVal)
	{
	NamedIndvidualBroadened_BTN_Details =  By.xpath("//div[contains(@id,'"+dataVal+"named_brd_pip_cov-image')]");
	se.element().waitForElement(NamedIndvidualBroadened_BTN_Details ,dataVal);
	return se.element().getElement(NamedIndvidualBroadened_BTN_Details,dataVal);
	}

		                            
	public By NamedIndvidualBroadened_BTN_Done =By.xpath("//*[contains(@id,'-continue-image')]");
	public WebElement getNamedIndvidualBroadened_BTN_Done(String dataVal)
	{
	se.element().waitForElement(NamedIndvidualBroadened_BTN_Done ,dataVal);
	return se.element().getElement(NamedIndvidualBroadened_BTN_Done,dataVal);
	}
	                            
	public By NamedIndvidualBroadened_BTN_Remove =By.xpath("//*[contains(@id,'delete-image')]");
	public WebElement getNamedIndvidualBroadened_BTN_Remove(String dataVal)
	{
	se.element().waitForElement(NamedIndvidualBroadened_BTN_Remove ,dataVal);
	return se.element().getElement(NamedIndvidualBroadened_BTN_Remove,dataVal);
	}
	                            
	public By NamedIndvidualBroadened_TXT_State =By.xpath("//*[contains(@id,'state-textbox')]");
	public WebElement getNamedIndvidualBroadened_TXT_State(String dataVal)
	{
	se.element().waitForElement(NamedIndvidualBroadened_TXT_State ,dataVal);
	return se.element().getElement(NamedIndvidualBroadened_TXT_State,dataVal);
	}
	                            
	public By NamedIndvidualBroadened_TXT_StateSearch =By.xpath("//*[contains(@id,'state-textbox')]/../div[2]");
	public WebElement getNamedIndvidualBroadened_TXT_StateSearch(String dataVal)
	{
	se.element().waitForElement(NamedIndvidualBroadened_TXT_StateSearch ,dataVal);
	return se.element().getElement(NamedIndvidualBroadened_TXT_StateSearch,dataVal);
	}
	                            
	public By NamedIndvidualBroadened_TXT_FirstName =By.id("field_key$fb325c82-3188-3e99-9016-fe8dd4484116$1first_name-textbox");
	public WebElement getNamedIndvidualBroadened_TXT_FirstName(String dataVal)
	{
	se.element().waitForElement(NamedIndvidualBroadened_TXT_FirstName ,dataVal);
	return se.element().getElement(NamedIndvidualBroadened_TXT_FirstName,dataVal);
	}
	                            
	public By NamedIndvidualBroadened_TXT_MiddleName =By.id("field_key$6671ff22-3a98-3f6f-a1e9-4f94c6f692fb$1middle_name-textbox");
	public WebElement getNamedIndvidualBroadened_TXT_MiddleName(String dataVal)
	{
	se.element().waitForElement(NamedIndvidualBroadened_TXT_MiddleName ,dataVal);
	return se.element().getElement(NamedIndvidualBroadened_TXT_MiddleName,dataVal);
	}
	                            
	public By NamedIndvidualBroadened_TXT_NameSuffix =By.id("field_key$80e9cf42-40a8-3600-9b87-b170d2618d1f$1name_suffix-textbox");
	public WebElement getNamedIndvidualBroadened_TXT_NameSuffix(String dataVal)
	{
	se.element().waitForElement(NamedIndvidualBroadened_TXT_NameSuffix ,dataVal);
	return se.element().getElement(NamedIndvidualBroadened_TXT_NameSuffix,dataVal);
	}
	                            
	public By NamedIndvidualBroadened_TXT_LastName =By.id("field_key$ee858c1c-487c-3792-b575-ef65480f61df$1last_name-textbox");
	public WebElement getNamedIndvidualBroadened_TXT_LastName(String dataVal)
	{
	se.element().waitForElement(NamedIndvidualBroadened_TXT_LastName ,dataVal);
	return se.element().getElement(NamedIndvidualBroadened_TXT_LastName,dataVal);
	}
	                            
	public By NamedIndvidualBroadened_TXT_TitlePrefix =By.id("field_key$ee1506df-da5c-3503-941d-d66f7d3ca296$1title_prefix-textbox");
	public WebElement getNamedIndvidualBroadened_TXT_TitlePrefix(String dataVal)
	{
	se.element().waitForElement(NamedIndvidualBroadened_TXT_TitlePrefix ,dataVal);
	return se.element().getElement(NamedIndvidualBroadened_TXT_TitlePrefix,dataVal);
	}
	
	
	/*****************************************
	 * End of NamedIndividualBroadened page locators
	 ******************************************/

	/*****************************************
	 * Start of FungiOrBacteriaLiability page locators
	 ******************************************/
	public By FungiOrBacteriaLiability =By.xpath("//*[contains(@id,'fungi_bact_liab_cov-label')]");
	public WebElement getFungiOrBacteriaLiability()
	{
	se.element().waitForElement(FungiOrBacteriaLiability );
	return se.element().getElement(FungiOrBacteriaLiability);
	}
	
	                            
	public By FungiOrBacteriaLiability_CHK_Coverage_Excluded =By.xpath("//div[text()='Excluded']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getFungiOrBacteriaLiability_CHK_Coverage_Excluded(String dataVal)
	{
	se.element().waitForElement(FungiOrBacteriaLiability_CHK_Coverage_Excluded ,dataVal);
	return se.element().getElement(FungiOrBacteriaLiability_CHK_Coverage_Excluded,dataVal);
	}
	                            
	public By FungiOrBacteriaLiability_CHK_Coverage_Limited =By.xpath("//div[text()='Limited']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getFungiOrBacteriaLiability_CHK_Coverage_Limited(String dataVal)
	{
	se.element().waitForElement(FungiOrBacteriaLiability_CHK_Coverage_Limited ,dataVal);
	return se.element().getElement(FungiOrBacteriaLiability_CHK_Coverage_Limited,dataVal);
	}
	                            
	public By FungiOrBacteriaLiability_TXT_AggregateLimit =By.xpath("//*[contains(@id,'1aggregate_limit-textbox')]");
	public WebElement getFungiOrBacteriaLiability_TXT_AggregateLimit(String dataVal)
	{
	se.element().waitForElement(FungiOrBacteriaLiability_TXT_AggregateLimit ,dataVal);
	return se.element().getElement(FungiOrBacteriaLiability_TXT_AggregateLimit,dataVal);
	}
	                            
	public By FungiOrBacteriaLiability_TXT_AggregateLimitSearch =By.xpath("//*[contains(@id,'1aggregate_limit-textbox')]/../div");
	public WebElement getFungiOrBacteriaLiability_TXT_AggregateLimitSearch(String dataVal)
	{
	se.element().waitForElement(FungiOrBacteriaLiability_TXT_AggregateLimitSearch ,dataVal);
	return se.element().getElement(FungiOrBacteriaLiability_TXT_AggregateLimitSearch,dataVal);
	}
	                            
	public By FungiOrBacteriaLiability_TXT_AnnualPremium =By.xpath("//*[contains(@id,'1manual_premium-textbox')]");
	public WebElement getFungiOrBacteriaLiability_TXT_AnnualPremium(String dataVal)
	{
	se.element().waitForElement(FungiOrBacteriaLiability_TXT_AnnualPremium ,dataVal);
	return se.element().getElement(FungiOrBacteriaLiability_TXT_AnnualPremium,dataVal);
	}
	                            
	public By FungiOrBacteriaLiability_CHK_KY_DoNotApplyCity =By.xpath("//*[contains(@id,'1is_no_tax-checkbox')]/input");
	public WebElement getFungiOrBacteriaLiability_CHK_KY_DoNotApplyCity(String dataVal)
	{
	se.element().waitForElement(FungiOrBacteriaLiability_CHK_KY_DoNotApplyCity ,dataVal);
	return se.element().getElement(FungiOrBacteriaLiability_CHK_KY_DoNotApplyCity,dataVal);
	}
	                            
	public By FungiOrBacteriaLiability_CHK_KY_AllCityName =By.xpath("//*[contains(@id,'1c_municipality_name-checkbox')]/input");
	public WebElement getFungiOrBacteriaLiability_CHK_KY_AllCityName(String dataVal)
	{
	se.element().waitForElement(FungiOrBacteriaLiability_CHK_KY_AllCityName ,dataVal);
	return se.element().getElement(FungiOrBacteriaLiability_CHK_KY_AllCityName,dataVal);
	}
	                            
	public By FungiOrBacteriaLiability_TXT_Tax_KY_City =By.id("field_key$c6fcfa6f-c8bf-3a8d-a8b5-bcf255a162dd$1risk_municipality_name-textbox");
	public WebElement getFungiOrBacteriaLiability_TXT_Tax_KY_City(String dataVal)
	{
	se.element().waitForElement(FungiOrBacteriaLiability_TXT_Tax_KY_City ,dataVal);
	return se.element().getElement(FungiOrBacteriaLiability_TXT_Tax_KY_City,dataVal);
	}
	                            
	public By FungiOrBacteriaLiability_TXT_Tax_KY_CitySearch =By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]/../div");
	public WebElement getFungiOrBacteriaLiability_TXT_Tax_KY_CitySearch(String dataVal)
	{
	se.element().waitForElement(FungiOrBacteriaLiability_TXT_Tax_KY_CitySearch ,dataVal);
	return se.element().getElement(FungiOrBacteriaLiability_TXT_Tax_KY_CitySearch,dataVal);
	}
	                            
	public By FungiOrBacteriaLiability_TXT_Tax_KY_City_Code =By.id("field_key$1c287a04-7b41-37c2-a001-1ebf3f4329c6$1risk_city_code-textbox");
	public WebElement getFungiOrBacteriaLiability_TXT_Tax_KY_City_Code(String dataVal)
	{
	se.element().waitForElement(FungiOrBacteriaLiability_TXT_Tax_KY_City_Code ,dataVal);
	return se.element().getElement(FungiOrBacteriaLiability_TXT_Tax_KY_City_Code,dataVal);
	}
	                            
	public By FungiOrBacteriaLiability_TXT_Tax_KY_County =By.id("field_key$fe53ee63-511d-3b63-b776-c9d9a70ad0af$1risk_county-textbox");
	public WebElement getFungiOrBacteriaLiability_TXT_Tax_KY_County(String dataVal)
	{
	se.element().waitForElement(FungiOrBacteriaLiability_TXT_Tax_KY_County ,dataVal);
	return se.element().getElement(FungiOrBacteriaLiability_TXT_Tax_KY_County,dataVal);
	}
	                            
	public By FungiOrBacteriaLiability_TXT_Tax_KY_CountySearch =By.xpath("//*[contains(@id,'1risk_county-textbox')]/../div");
	public WebElement getFungiOrBacteriaLiability_TXT_Tax_KY_CountySearch(String dataVal)
	{
	se.element().waitForElement(FungiOrBacteriaLiability_TXT_Tax_KY_CountySearch ,dataVal);
	return se.element().getElement(FungiOrBacteriaLiability_TXT_Tax_KY_CountySearch,dataVal);
	}
	                            
	public By FungiOrBacteriaLiability_TXT_Tax_KY_County_Code =By.id("field_key$fbacf390-9c11-3284-8886-cea6330d36fa$1risk_county_code-textbox");
	public WebElement getFungiOrBacteriaLiability_TXT_Tax_KY_County_Code(String dataVal)
	{
	se.element().waitForElement(FungiOrBacteriaLiability_TXT_Tax_KY_County_Code ,dataVal);
	return se.element().getElement(FungiOrBacteriaLiability_TXT_Tax_KY_County_Code,dataVal);
	}
	                            
	public By FungiOrBacteriaLiability_TXT_KY_Taxcode =By.id("field_key$476e9dbd-0b7d-3091-b53b-0ab6e7e8f771$1risk_tax_code-textbox");
	public WebElement getFungiOrBacteriaLiability_TXT_KY_Taxcode(String dataVal)
	{
	se.element().waitForElement(FungiOrBacteriaLiability_TXT_KY_Taxcode ,dataVal);
	return se.element().getElement(FungiOrBacteriaLiability_TXT_KY_Taxcode,dataVal);
	}
	
	/*****************************************
	 * End of FungiOrBacteriaLiability page locators
	 ******************************************/

	/*****************************************
	 * Start of PDCoverageTypesOfAutosInterestsCovered page locators
	 ******************************************/
	public By PDCoverageTypesOfAutosInterestsCovered =By.xpath("//*[contains(@id,'lob_ca_autos_hld_sale_info-label')]");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered()
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered );
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered);
	}
	

	                            
	public By PDCoverageTypesOfAutosInterestsCovered_CHK_LimitOfInsForLossAtUnscheduledLoc =By.xpath("//span[@id='field_key$8d890d70-640a-38a3-b045-fb63b7ae831c$1limit_loss_unsch_loc-checkbox']/input");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered_CHK_LimitOfInsForLossAtUnscheduledLoc(String dataVal)
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered_CHK_LimitOfInsForLossAtUnscheduledLoc ,dataVal);
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered_CHK_LimitOfInsForLossAtUnscheduledLoc,dataVal);
	}
	                            
	public By PDCoverageTypesOfAutosInterestsCovered_TXT_AdditionalLocationsWhereYouStoreCoveredAutos =By.id("field_key$697b22e6-b7aa-311e-b38e-a96eb7f7cb67$1add_loc_store_auto-textbox");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered_TXT_AdditionalLocationsWhereYouStoreCoveredAutos(String dataVal)
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered_TXT_AdditionalLocationsWhereYouStoreCoveredAutos ,dataVal);
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered_TXT_AdditionalLocationsWhereYouStoreCoveredAutos,dataVal);
	}
	                            
	public By PDCoverageTypesOfAutosInterestsCovered_TXT_InTransit =By.id("field_key$796afd69-b3b6-38b3-802e-31540eb4ef5e$1in_transit-textbox");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered_TXT_InTransit(String dataVal)
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered_TXT_InTransit ,dataVal);
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered_TXT_InTransit,dataVal);
	}
	                            
	public By PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_NewAutos =By.xpath("//span[@id='field_key$22e53c01-9d9a-3a66-9bc3-cd082b0f9af4$1coverage_1-checkbox']/input");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_NewAutos(String dataVal)
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_NewAutos ,dataVal);
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_NewAutos,dataVal);
	}
	                            
	public By PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_UsedAutosDemonstrators =By.xpath("//span[@id='field_key$5eb67ba0-b3e6-379f-ad70-21f5f195a59a$1coverage_2-checkbox']/input");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_UsedAutosDemonstrators(String dataVal)
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_UsedAutosDemonstrators ,dataVal);
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_UsedAutosDemonstrators,dataVal);
	}
	                            
	public By PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInCoveredAutosYouOwn =By.xpath("//span[@id='field_key$1002530d-d951-3e38-b314-fd47e5893b86$1coverage_3-checkbox']/input");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInCoveredAutosYouOwn(String dataVal)
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInCoveredAutosYouOwn ,dataVal);
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInCoveredAutosYouOwn,dataVal);
	}
	                            
	public By PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInFinanceAutos =By.xpath("//span[@id='field_key$6d74cf6a-9ccc-3c26-9879-f04ed28a781e$1coverage_4-checkbox']/input");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInFinanceAutos(String dataVal)
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInFinanceAutos ,dataVal);
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestInFinanceAutos,dataVal);
	}
	                            
	public By PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestAndCreditorsNamed =By.xpath("//span[@id='field_key$5ce74998-ee1f-31b0-8e0d-5d6406003450$1coverage_5-checkbox']/input");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestAndCreditorsNamed(String dataVal)
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestAndCreditorsNamed ,dataVal);
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_YourInterestAndCreditorsNamed,dataVal);
	}
	                            
	public By PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_AllInterestByYouOrAnyCreditor =By.xpath("//span[@id='field_key$5d55e638-321a-3e31-b9e6-cb54b5c207cc$1coverage_6-checkbox']/input");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_AllInterestByYouOrAnyCreditor(String dataVal)
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_AllInterestByYouOrAnyCreditor ,dataVal);
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Comprehensive_AllInterestByYouOrAnyCreditor,dataVal);
	}
	                            
	public By PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_NewAutos =By.xpath("//span[@id='field_key$22e53c01-9d9a-3a66-9bc3-cd082b0f9af4$2coverage_1-checkbox']/input");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_NewAutos(String dataVal)
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_NewAutos ,dataVal);
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_NewAutos,dataVal);
	}
	                            
	public By PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_UsedAutosDemonstrators =By.xpath("//span[@id='field_key$5eb67ba0-b3e6-379f-ad70-21f5f195a59a$2coverage_2-checkbox']/input");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_UsedAutosDemonstrators(String dataVal)
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_UsedAutosDemonstrators ,dataVal);
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_UsedAutosDemonstrators,dataVal);
	}
	                            
	public By PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInCoveredAutosYouOwn =By.xpath("//span[@id='field_key$1002530d-d951-3e38-b314-fd47e5893b86$2coverage_3-checkbox']/input");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInCoveredAutosYouOwn(String dataVal)
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInCoveredAutosYouOwn ,dataVal);
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInCoveredAutosYouOwn,dataVal);
	}
	                            
	public By PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInFinanceAutos =By.xpath("//span[@id='field_key$6d74cf6a-9ccc-3c26-9879-f04ed28a781e$2coverage_4-checkbox']/input");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInFinanceAutos(String dataVal)
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInFinanceAutos ,dataVal);
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestInFinanceAutos,dataVal);
	}
	                            
	public By PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestAndCreditorsNamed =By.xpath("//span[@id='field_key$5ce74998-ee1f-31b0-8e0d-5d6406003450$2coverage_5-checkbox']/input");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestAndCreditorsNamed(String dataVal)
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestAndCreditorsNamed ,dataVal);
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_YourInterestAndCreditorsNamed,dataVal);
	}
	                            
	public By PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_AllInterestByYouOrAnyCreditor =By.xpath("//span[@id='field_key$5d55e638-321a-3e31-b9e6-cb54b5c207cc$2coverage_6-checkbox']/input");
	public WebElement getPDCoverageTypesOfAutosInterestsCovered_CHK_Collision_AllInterestByYouOrAnyCreditor(String dataVal)
	{
	se.element().waitForElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_AllInterestByYouOrAnyCreditor ,dataVal);
	return se.element().getElement(PDCoverageTypesOfAutosInterestsCovered_CHK_Collision_AllInterestByYouOrAnyCreditor,dataVal);
	}

	/*****************************************
	 * End of PDCoverageTypesOfAutosInterestsCovered page locators
	 ******************************************/

	/*****************************************
	 * Start of ExclusionOrExcessCoverageHazardsOtherwiseInsured page locators
	 ******************************************/
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_Label=By.xpath("//*[contains(@id,'excl_exss_hzrd_cov-label')]");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_Label()
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_Label );
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_Label);
	}
	
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_AddCov =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_AddCov(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_AddCov ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_AddCov,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_RemoveCov =By.xpath("//*[contains(@id,'delete-image')]");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_RemoveCov(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_RemoveCov ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_RemoveCov,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_CopyCov =By.xpath("//*[contains(@id,'copybutton-image')]");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_CopyCov(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_CopyCov ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_CopyCov,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_Btn_EditCov =By.xpath("//*[contains(@id,'editbutton-image')]");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_Btn_EditCov(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_Btn_EditCov ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_Btn_EditCov,dataVal);
	}
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Details ;
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Details(String dataVal)
	{
		ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Details =  By.xpath("//div[contains(@id,'"+dataVal+"excl_exss_hzrd_cov-image')]");
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Details ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Details,dataVal);
	}                         
	
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Done =By.xpath("//*[contains(@id,'--continue-image')]");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Done(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Done ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_Done,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_Description =By.xpath("//div[text()='Description']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_Description(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_Description ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_Description,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_VehicleDesignation =By.xpath("//div[text()='Vehicle Designation']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_VehicleDesignation(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_VehicleDesignation ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_CHK_CoveredAutosYouOwn_VehicleDesignation,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_VehAdd =By.xpath("//*[contains(@id,'feec-add-image')]");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_VehAdd(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_VehAdd ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_VehAdd,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNo =By.id("field_key$b152a8b2-1ac1-3847-927f-e56aa7b32184$1vehicle_no-textbox");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNo(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNo ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNo,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNoSearch =By.xpath("//*[contains(@id,'vehicle_no-textbox')]/../div[2]");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNoSearch(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNoSearch ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXTVehicleNoSearch,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_VIN =By.id("field_key$ab8e87cd-c834-31e4-905f-19942fd24092$1vin-textbox");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_VIN(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_VIN ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_VIN,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Year =By.id("field_key$cdecf1df-8943-3988-8685-ac095a574b1c$1year-textbox");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Year(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Year ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Year,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Make =By.id("field_key$483249ff-e671-3261-beb1-a94a6f59465b$1make-textbox");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Make(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Make ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Make,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Model =By.id("field_key$703caf7b-4a73-358b-b5a6-9310f4e87881$1model-textbox");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Model(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Model ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Model,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_ProvisionSelect =By.id("field_key$df223817-58ff-30e3-84d3-bc74ece2f25f$1provision-textarea");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_ProvisionSelect(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_ProvisionSelect ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_BTN_ProvisionSelect,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Description =By.xpath("//*[contains(@id,'designation-textarea')]");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Description(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Description ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Description,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Provision =By.xpath("//*[contains(@id,'provision-textarea')]");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Provision(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Provision ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_Provision,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_ProvisionSearch =By.xpath("//*[contains(@id,'provision-textarea')]/../div[2]");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_ProvisionSearch(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_ProvisionSearch ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_ProvisionSearch,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_Txt_LmtOfInsurance =By.id("field_key$e4491008-2587-3d44-bf6c-733b63478daa$1limit_of_insurance-textbox");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_Txt_LmtOfInsurance(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_Txt_LmtOfInsurance ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_Txt_LmtOfInsurance,dataVal);
	}
	                            
	public By ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_EndOfOthProvision =By.xpath("//*[contains(@id,'1end_of_othr_provision_date-picker')]/input[1]");
	public WebElement getExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_EndOfOthProvision(String dataVal)
	{
	se.element().waitForElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_EndOfOthProvision ,dataVal);
	return se.element().getElement(ExclusionOrExcessCoverageHazardsOtherwiseInsured_TXT_EndOfOthProvision,dataVal);
	}
	                            
	
	/*****************************************
	 * End of ExclusionOrExcessCoverageHazardsOtherwiseInsured page locators
	 ******************************************/
	/*****************************************
	 *Start of FuneralDirectorsMedicalPaymentCov page locators
	 ******************************************/

	public By FuneralDirectors_Label =By.xpath("//*[contains(@id,'fun_dir_med_pay_cov-label')]");
	public WebElement getFuneralDirectors_Label()
	{
	se.element().waitForElement(FuneralDirectors_Label );
	return se.element().getElement(FuneralDirectors_Label);
	}
	                            
	public By FuneralDirectors_BTN_Add =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getFuneralDirectors_BTN_Add(String dataVal)
	{
	se.element().waitForElement(FuneralDirectors_BTN_Add ,dataVal);
	return se.element().getElement(FuneralDirectors_BTN_Add,dataVal);
	}
	                            
	public By FuneralDirectors_BTN_Edit =By.xpath("//*[contains(@id,'editbutton-image')]");
	public WebElement getFuneralDirectors_BTN_Edit(String dataVal)
	{
	se.element().waitForElement(FuneralDirectors_BTN_Edit ,dataVal);
	return se.element().getElement(FuneralDirectors_BTN_Edit,dataVal);
	}
	                            
	public By FuneralDirectors_BTN_Done =By.xpath("//*[contains(@id,'/-continue-image')]");
	public WebElement getFuneralDirectors_BTN_Done(String dataVal)
	{
	se.element().waitForElement(FuneralDirectors_BTN_Done ,dataVal);
	return se.element().getElement(FuneralDirectors_BTN_Done,dataVal);
	}
	                            
	public By FuneralDirectors_TXT_State =By.id("field_key$90dba2a3-f688-3f22-ab9c-6318291d2066$1state-textbox");
	public WebElement getFuneralDirectors_TXT_State(String dataVal)
	{
	se.element().waitForElement(FuneralDirectors_TXT_State ,dataVal);
	return se.element().getElement(FuneralDirectors_TXT_State,dataVal);
	}
	                            
	public By FuneralDirectors_TXT_StateSearch =By.xpath("//*[contains(@id,'1state-textbox')]/../div");
	public WebElement getFuneralDirectors_TXT_StateSearch(String dataVal)
	{
	se.element().waitForElement(FuneralDirectors_TXT_StateSearch ,dataVal);
	return se.element().getElement(FuneralDirectors_TXT_StateSearch,dataVal);
	}
	                            
	public By FuneralDirectors_BTN_Remove =By.xpath("//*[contains(@id,'delete-image')]");
	public WebElement getFuneralDirectors_BTN_Remove(String dataVal)
	{
	se.element().waitForElement(FuneralDirectors_BTN_Remove ,dataVal);
	return se.element().getElement(FuneralDirectors_BTN_Remove,dataVal);
	}
	                            
	
	public By FuneralDirectors_Details ;
    public WebElement getFuneralDirectors_Details(String dataVal)
	{
		FuneralDirectors_Details =  By.xpath("//div[contains(@id,'"+dataVal+"1fun_dir_med_pay_cov-image')]");
	se.element().waitForElement(FuneralDirectors_Details ,dataVal);
	return se.element().getElement(FuneralDirectors_Details,dataVal);
	}
	/*****************************************
	 *End of FuneralDirectorsMedicalPaymentCov page locators
	 ******************************************/

	/*****************************************
	 *Start of SecuraManusript page locators
	 ******************************************/
	public By SecuraManuscript_TXT_Label =By.xpath("//*[contains(@id,'manuscript_cov-label')]");
	public WebElement getSecuraManuscript_TXT_Label()
	{
	se.element().waitForElement(SecuraManuscript_TXT_Label );
	return se.element().getElement(SecuraManuscript_TXT_Label);
	}
	
                        
	public By SecuraManuscript_BTN_ADD =By.xpath("//*[contains(@id,'-add-image')]");
	public WebElement getSecuraManuscript_BTN_ADD(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_BTN_ADD ,dataVal);
	return se.element().getElement(SecuraManuscript_BTN_ADD,dataVal);
	}
	
	public By SecuraManuscript_BTN_Details ;
	public WebElement getSecuraManuscript_BTN_Details(String dataVal)
	{
	SecuraManuscript_BTN_Details =  By.xpath("//div[contains(@id,'"+dataVal+"manuscript_cov-image')]");
	se.element().waitForElement(SecuraManuscript_BTN_Details ,dataVal);
	return se.element().getElement(SecuraManuscript_BTN_Details,dataVal);
	}
	                            
	public By SecuraManuscript_BTN_Remove =By.xpath("//*[contains(@id,'-delete-image')]");
	public WebElement getSecuraManuscript_BTN_Remove(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_BTN_Remove ,dataVal);
	return se.element().getElement(SecuraManuscript_BTN_Remove,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_State =By.id("field_key$61048b33-e62b-3e11-a7cd-230423e86e48$1state-textbox");
	public WebElement getSecuraManuscript_TXT_State(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_State ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_State,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_StateSearch =By.xpath("//*[contains(@id,'state-textbox')]/../div[1]");
	public WebElement getSecuraManuscript_TXT_StateSearch(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_StateSearch ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_StateSearch,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_Form =By.id("field_key$51890b60-874c-3db0-8908-2018e9c8e7db$1form-textbox");
	public WebElement getSecuraManuscript_TXT_Form(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_Form ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_Form,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_FormSearch =By.xpath("//*[contains(@id,'form-textbox')]/../div[1]");
	public WebElement getSecuraManuscript_TXT_FormSearch(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_FormSearch ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_FormSearch,dataVal);
	}
	                        
	                            
	public By SecuraManuscript_TXT_Description =By.xpath("//*[contains(@id,'description-richtextarea')]/iframe");
	public WebElement getSecuraManuscript_TXT_Description(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_Description ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_Description,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_AnnualPremium =By.id("field_key$52801e66-2cea-3ea6-9fb2-5d156cdb71cf$1user_def_annual_premium-textbox");
	public WebElement getSecuraManuscript_TXT_AnnualPremium(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_AnnualPremium ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_AnnualPremium,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_ClassificationCode =By.id("field_key$225a5c06-1416-3f53-bb20-569f172a01db$1classification_code-textbox");
	public WebElement getSecuraManuscript_TXT_ClassificationCode(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_ClassificationCode ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_ClassificationCode,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_ClassificationCodeSearch =By.xpath("//*[contains(@id,'classification_code-textbox')]/../div[1]");
	public WebElement getSecuraManuscript_TXT_ClassificationCodeSearch(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_ClassificationCodeSearch ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_ClassificationCodeSearch,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_ClassificationDescription =By.id("field_key$dda8fb37-1681-386b-899b-0f49c6776cc7$1classification_description-textbox");
	public WebElement getSecuraManuscript_TXT_ClassificationDescription(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_ClassificationDescription ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_ClassificationDescription,dataVal);
	}
	                            
	public By SecuraManuscript_CHK_PremiumChargeTypeProRata =By.xpath("//div[text()='Pro-Rate']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getSecuraManuscript_CHK_PremiumChargeTypeProRata(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_CHK_PremiumChargeTypeProRata ,dataVal);
	return se.element().getElement(SecuraManuscript_CHK_PremiumChargeTypeProRata,dataVal);
	}
	                            
	public By SecuraManuscript_CHK_PremiumChargeTypeFlatCharge =By.xpath("//div[text()='Flat Charge']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getSecuraManuscript_CHK_PremiumChargeTypeFlatCharge(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_CHK_PremiumChargeTypeFlatCharge ,dataVal);
	return se.element().getElement(SecuraManuscript_CHK_PremiumChargeTypeFlatCharge,dataVal);
	}
	                            
	public By SecuraManuscript_CHK_PremiumChargeTypeFullyEarned =By.xpath("//div[text()='Fully Earned']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getSecuraManuscript_CHK_PremiumChargeTypeFullyEarned(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_CHK_PremiumChargeTypeFullyEarned ,dataVal);
	return se.element().getElement(SecuraManuscript_CHK_PremiumChargeTypeFullyEarned,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_JurisdictionDescription_FilterNeeded =By.xpath("N/A");
	public WebElement getSecuraManuscript_TXT_JurisdictionDescription_FilterNeeded(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_JurisdictionDescription_FilterNeeded ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_JurisdictionDescription_FilterNeeded,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_JurisdictionDescription =By.xpath("N/A");
	public WebElement getSecuraManuscript_TXT_JurisdictionDescription(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_JurisdictionDescription ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_JurisdictionDescription,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_FPDCode =By.xpath("N/A");
	public WebElement getSecuraManuscript_TXT_FPDCode(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_FPDCode ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_FPDCode,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_FireProtectionDistrict =By.xpath("N/A");
	public WebElement getSecuraManuscript_TXT_FireProtectionDistrict(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_FireProtectionDistrict ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_FireProtectionDistrict,dataVal);
	}
	                            
	public By SecuraManuscript_CHK_DoNotApplyCityorCountyTaxes =By.xpath("//*[contains(@id,'is_no_tax-checkbox')]/input");
	public WebElement getSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_CHK_DoNotApplyCityorCountyTaxes ,dataVal);
	return se.element().getElement(SecuraManuscript_CHK_DoNotApplyCityorCountyTaxes,dataVal);
	}
	                            
	public By SecuraManuscript_CHK_AllCityName =By.xpath("//*[contains(@id,'c_municipality_name-checkbox')]/input");
	public WebElement getSecuraManuscript_CHK_AllCityName(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_CHK_AllCityName ,dataVal);
	return se.element().getElement(SecuraManuscript_CHK_AllCityName,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_KYTaxCitySearch =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]/../div[1]");
	public WebElement getSecuraManuscript_TXT_KYTaxCitySearch(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_KYTaxCitySearch ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_KYTaxCitySearch,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_KYTaxCity =By.id("field_key$85f99f49-e4b3-3aac-bead-32346a06a9f7$1risk_municipality_name-textbox");
	public WebElement getSecuraManuscript_TXT_KYTaxCity(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_KYTaxCity ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_KYTaxCity,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_CityCode =By.id("field_key$c08bd470-2ca2-3f53-9aff-1a5cc9f1c141$1risk_city_code-textbox");
	public WebElement getSecuraManuscript_TXT_CityCode(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_CityCode ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_CityCode,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_CountySearch =By.xpath("//*[contains(@id,'risk_county-textbox')]/../div[1]");
	public WebElement getSecuraManuscript_TXT_CountySearch(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_CountySearch ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_CountySearch,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_County =By.id("field_key$af862c53-00cc-3ed1-8753-57a4da18e148$1risk_county-textbox");
	public WebElement getSecuraManuscript_TXT_County(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_County ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_County,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_CountyCode =By.id("field_key$2e356327-5948-32c0-9536-48b343324ef3$1risk_county_code-textbox");
	public WebElement getSecuraManuscript_TXT_CountyCode(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_CountyCode ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_CountyCode,dataVal);
	}
	                            
	public By SecuraManuscript_TXT_TaxCode =By.id("field_key$90fed293-17a2-36d0-ab59-c76969bc3302$1risk_tax_code-textbox");
	public WebElement getSecuraManuscript_TXT_TaxCode(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_TXT_TaxCode ,dataVal);
	return se.element().getElement(SecuraManuscript_TXT_TaxCode,dataVal);
	}
	                            
	public By SecuraManuscript_BTN_Done =By.xpath("//*[contains(@id,'--continue-image')]/../div[1]");
	public WebElement getSecuraManuscript_BTN_Done(String dataVal)
	{
	se.element().waitForElement(SecuraManuscript_BTN_Done ,dataVal);
	return se.element().getElement(SecuraManuscript_BTN_Done,dataVal);
	}

	/*****************************************
	 *End of SecuraManusript page locators
	 ******************************************/
                         
	/*****************************************
	 *Start of AutoBodyManufacturersaAndInstallers page locators
	 ******************************************/
	
	public By AutoBodyManufacturersaAndInstallers_Label =By.xpath("//*[contains(@id,'auto_body_manu_cov-label')]");
	public WebElement getAutoBodyManufacturersaAndInstallers_Label()
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_Label );
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_Label);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_BTN_Add =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getAutoBodyManufacturersaAndInstallers_BTN_Add(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_BTN_Add ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_BTN_Add,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_BTN_EditCov =By.xpath("//*[contains(@id,'editbutton-image')]");
	public WebElement getAutoBodyManufacturersaAndInstallers_BTN_EditCov(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_BTN_EditCov ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_BTN_EditCov,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_BTN_RemoveCov =By.xpath("//*[contains(@id,'delete-image')]");
	public WebElement getAutoBodyManufacturersaAndInstallers_BTN_RemoveCov(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_BTN_RemoveCov ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_BTN_RemoveCov,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_BTN_CopyCov =By.xpath("//*[contains(@id,'copybutton-image')]");
	public WebElement getAutoBodyManufacturersaAndInstallers_BTN_CopyCov(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_BTN_CopyCov ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_BTN_CopyCov,dataVal);
	}
	public By AutoBodyManufacturersaAndInstallers_BTN_Details ;
	public WebElement getAutoBodyManufacturersaAndInstallers_BTN_Details(String dataVal)
	{
	AutoBodyManufacturersaAndInstallers_BTN_Details =  By.xpath("//div[contains(@id,'"+dataVal+"1auto_body_manu_cov-image')]");
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_BTN_Details ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_BTN_Details,dataVal);
	}                      
	                           
	public By AutoBodyManufacturersaAndInstallers_TXT_State =By.xpath("//*[contains(@id,'1state-textbox')]");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_State(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_State ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_State,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_StateSearch =By.xpath("//*[contains(@id,'1state-textbox')]/../div[1]");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_StateSearch(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_StateSearch ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_StateSearch,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_ZipCode =By.id("field_key$8ae06700-87c7-3a6a-b918-f069673c7778$1zip_code-textbox");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_ZipCode(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_ZipCode ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_ZipCode,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_ZipCodeSearch =By.xpath("//*[contains(@id,'1zip_code-textbox')]/../div[1]");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_ZipCodeSearch(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_ZipCodeSearch ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_ZipCodeSearch,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_Territory =By.id("field_key$0796b9ad-3d99-3efa-86a1-08e64304ef93$1territory_code-textbox");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_Territory(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_Territory ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_Territory,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_TerritorySearch =By.xpath("//*[contains(@id,'1territory_code-textbox')]/../div[1]");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_TerritorySearch(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_TerritorySearch ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_TerritorySearch,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_TerrDescrption =By.id("field_key$e86509c5-74a9-3c98-b281-bab0f2a5381a$1territory-textbox");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_TerrDescrption(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_TerrDescrption ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_TerrDescrption,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_CHK_KYDoNotApplyCity =By.xpath("//*[contains(@id,'1is_no_tax-checkbox')]/input");
	public WebElement getAutoBodyManufacturersaAndInstallers_CHK_KYDoNotApplyCity(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_CHK_KYDoNotApplyCity ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_CHK_KYDoNotApplyCity,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_CHK_KYAllCityName =By.xpath("//*[contains(@id,'1c_municipality_name-checkbox')]/input");
	public WebElement getAutoBodyManufacturersaAndInstallers_CHK_KYAllCityName(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_CHK_KYAllCityName ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_CHK_KYAllCityName,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_KYCityName =By.id("field_key$c35340a9-39a3-3824-8b96-35bbda483282$1risk_municipality_name-textbox");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_KYCityName(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_KYCityName ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_KYCityName,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_KYCityNameSearch =By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]/../div");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_KYCityNameSearch(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_KYCityNameSearch ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_KYCityNameSearch,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_KYCityCode =By.id("field_key$25ebeda9-3753-3fbe-8cdc-d64618e19f54$1risk_city_code-textbox");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_KYCityCode(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_KYCityCode ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_KYCityCode,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_KYCounty =By.id("field_key$1b78a043-8c2d-3351-9f58-b81565d6b85f$1risk_county-textbox");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_KYCounty(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_KYCounty ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_KYCounty,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_KYCountySearch =By.xpath("//*[contains(@id,'1risk_county-textbox')]/../div");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_KYCountySearch(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_KYCountySearch ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_KYCountySearch,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_KYCountyCode =By.id("field_key$af1fd578-c149-386d-bf11-057888f7fc67$1risk_county_code-textbox");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_KYCountyCode(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_KYCountyCode ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_KYCountyCode,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_KYTaxCode =By.id("field_key$41104812-0b41-3dab-8013-0ba381eca74e$1risk_tax_code-textbox");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_KYTaxCode(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_KYTaxCode ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_KYTaxCode,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_KYTortLimit =By.id("field_key$43399548-9f0e-30f9-b9fd-81ce23c05213$1tort_limit-textarea");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_KYTortLimit(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_KYTortLimit ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_KYTortLimit,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_KYTortLimitCode =By.id("field_key$391ed1a2-cf25-3879-97ea-ad25cee2591b$1tort_limit_code-textbox");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_KYTortLimitCode(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_KYTortLimitCode ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_KYTortLimitCode,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_CombinedSingleLimit =By.id("field_key$97d3744b-c3cc-3dac-86df-b4aaf1b8f3c8$1combined_single_limit_disp-textbox");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_CombinedSingleLimit(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_CombinedSingleLimit ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_CombinedSingleLimit,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_Deductible =By.id("field_key$11842b35-55cc-3fa7-ab6e-30b98951a48f$1deductible-textbox");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_Deductible(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_Deductible ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_Deductible,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_TXT_NumberOFEmployeesInvolvedInTestingOrDeliveryOfAutos =By.id("field_key$ae1bd070-eca3-32a0-ad30-c4d0cf07d731$1number_of_testers-textbox");
	public WebElement getAutoBodyManufacturersaAndInstallers_TXT_NumberOFEmployeesInvolvedInTestingOrDeliveryOfAutos(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_TXT_NumberOFEmployeesInvolvedInTestingOrDeliveryOfAutos ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_TXT_NumberOFEmployeesInvolvedInTestingOrDeliveryOfAutos,dataVal);
	}
	                            
	public By AutoBodyManufacturersaAndInstallers_BTN_Done =By.xpath("//*[contains(@id,'-continue-image')]");
	public WebElement getAutoBodyManufacturersaAndInstallers_BTN_Done(String dataVal)
	{
	se.element().waitForElement(AutoBodyManufacturersaAndInstallers_BTN_Done ,dataVal);
	return se.element().getElement(AutoBodyManufacturersaAndInstallers_BTN_Done,dataVal);
	}
    
/*****************************************
*End of AutoBodyManufacturersaAndInstallers page locators
******************************************/
	/*****************************************
	*Start of SilicaOrSilicaRelatedDustLiability page locators
	******************************************/
	/**/
	public By SilicaOrSilicaRelatedDustLiability_BTN_Details ;
	public WebElement getSilicaOrSilicaRelatedDustLiability_BTN_Details(String dataVal)
	{
		SilicaOrSilicaRelatedDustLiability_BTN_Details =  By.xpath("//div[contains(@id,'"+dataVal+"1silicia_dust_liab_cov-image')]");
	se.element().waitForElement(SilicaOrSilicaRelatedDustLiability_BTN_Details ,dataVal);
	return se.element().getElement(SilicaOrSilicaRelatedDustLiability_BTN_Details,dataVal);
	}
	                            
	
	/*public By SilicaOrSilicaRelatedDustLiability_BTN_Details =By.xpath("instance_key$ba9b121d-4ff8-3a25-a88f-e12247c797ba$1silicia_dust_liab_cov-image");
	public WebElement getSilicaOrSilicaRelatedDustLiability_BTN_Details(String dataVal)
	{
	se.element().waitForElement(SilicaOrSilicaRelatedDustLiability_BTN_Details ,dataVal);
	return se.element().getElement(SilicaOrSilicaRelatedDustLiability_BTN_Details,dataVal);
	}*/
	                            
	public By SilicaOrSilicaRelatedDustLiability_BTN_Add =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getSilicaOrSilicaRelatedDustLiability_BTN_Add(String dataVal)
	{
	se.element().waitForElement(SilicaOrSilicaRelatedDustLiability_BTN_Add ,dataVal);
	return se.element().getElement(SilicaOrSilicaRelatedDustLiability_BTN_Add,dataVal);
	}
	                            
	public By SilicaOrSilicaRelatedDustLiability_BTN_Edit =By.xpath("//*[contains(@id,'editbutton-image')]");
	public WebElement getSilicaOrSilicaRelatedDustLiability_BTN_Edit(String dataVal)
	{
	se.element().waitForElement(SilicaOrSilicaRelatedDustLiability_BTN_Edit ,dataVal);
	return se.element().getElement(SilicaOrSilicaRelatedDustLiability_BTN_Edit,dataVal);
	}
	                            
	public By SilicaOrSilicaRelatedDustLiability_BTN_Done =By.xpath("//*[contains(@id,'-continue-image')]");
	public WebElement getSilicaOrSilicaRelatedDustLiability_BTN_Done(String dataVal)
	{
	se.element().waitForElement(SilicaOrSilicaRelatedDustLiability_BTN_Done ,dataVal);
	return se.element().getElement(SilicaOrSilicaRelatedDustLiability_BTN_Done,dataVal);
	}
	                            
	public By SilicaOrSilicaRelatedDustLiability_TXT_State =By.xpath("//*[contains(@id,'1state-textbox')]");
	public WebElement getSilicaOrSilicaRelatedDustLiability_TXT_State(String dataVal)
	{
	se.element().waitForElement(SilicaOrSilicaRelatedDustLiability_TXT_State ,dataVal);
	return se.element().getElement(SilicaOrSilicaRelatedDustLiability_TXT_State,dataVal);
	}
	                            
	public By SilicaOrSilicaRelatedDustLiability_TXT_StateSearch =By.xpath("//*[contains(@id,'1state-textbox')]/../div");
	public WebElement getSilicaOrSilicaRelatedDustLiability_TXT_StateSearch(String dataVal)
	{
	se.element().waitForElement(SilicaOrSilicaRelatedDustLiability_TXT_StateSearch ,dataVal);
	return se.element().getElement(SilicaOrSilicaRelatedDustLiability_TXT_StateSearch,dataVal);
	}
	                            
	public By SilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_CoveredAutos =By.xpath("//div[text()='Covered Autos']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getSilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_CoveredAutos(String dataVal)
	{
	se.element().waitForElement(SilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_CoveredAutos ,dataVal);
	return se.element().getElement(SilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_CoveredAutos,dataVal);
	}
	                            
	public By SilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_OtherThanCoveredAutos =By.xpath("//div[text()='Other than Covered Autos']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getSilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_OtherThanCoveredAutos(String dataVal)
	{
	se.element().waitForElement(SilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_OtherThanCoveredAutos ,dataVal);
	return se.element().getElement(SilicaOrSilicaRelatedDustLiability_CHK_ExclusionType_OtherThanCoveredAutos,dataVal);
	}
	                            
	public By SilicaOrSilicaRelatedDustLiability_TXT_AnnualPremium =By.xpath("//*[contains(@id,'1manual_premium-textbox')]");
	public WebElement getSilicaOrSilicaRelatedDustLiability_TXT_AnnualPremium(String dataVal)
	{
	se.element().waitForElement(SilicaOrSilicaRelatedDustLiability_TXT_AnnualPremium ,dataVal);
	return se.element().getElement(SilicaOrSilicaRelatedDustLiability_TXT_AnnualPremium,dataVal);
	}
	                            
	public By SilicaOrSilicaRelatedDustLiability_Label =By.xpath("//*[contains(@id,'silicia_dust_liab_cov-label')]");
	public WebElement getSilicaOrSilicaRelatedDustLiability_Label()
	{
	se.element().waitForElement(SilicaOrSilicaRelatedDustLiability_Label );
	return se.element().getElement(SilicaOrSilicaRelatedDustLiability_Label);
	}
	          

	                            
	/*****************************************
	*End of SilicaOrSilicaRelatedDustLiability page locators
	******************************************/
	
	
	/*****************************************
	 * Start of Garbage Keepers Locators
	 ******************************************/
	public By GarageKeepers_BTN_Label = By.xpath("//*[contains(@id,'garage_keepers_cov-label')]");
			
	public WebElement getGarageKeepers_BTN_Label()
	{
	se.element().waitForElement(GarageKeepers_BTN_Label);
	return se.element().getElement(GarageKeepers_BTN_Label);
	}
	
	
	public By GarageKeepers_BTN_AddCov =By.xpath("//*[@id='9de4cf51-4c8b-3769-bdd2-acda10b66b2b-add-image']");
	public WebElement getGarageKeepers_BTN_AddCov(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_BTN_AddCov ,dataVal);
	return se.element().getElement(GarageKeepers_BTN_AddCov,dataVal);
	}
	                            
	public By GarageKeepers_BTN_EditCov =By.id("9de4cf51-4c8b-3769-bdd2-acda10b66b2b-editbutton-image");
	public WebElement getGarageKeepers_BTN_EditCov(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_BTN_EditCov ,dataVal);
	return se.element().getElement(GarageKeepers_BTN_EditCov,dataVal);
	}
	                            
	public By GarageKeepers_BTN_Details ;
	public WebElement getGarageKeepers_BTN_Details(String dataVal)
	{
	GarageKeepers_BTN_Details =  By.xpath("//div[contains(@id,'"+dataVal+"garage_keepers_cov-image')]");
	se.element().waitForElement(GarageKeepers_BTN_Details ,dataVal);
	return se.element().getElement(GarageKeepers_BTN_Details,dataVal);
	}
	
	public By GarageKeepers_BTN_Remove =By.xpath("//*[contains(@id,'9de4cf51-4c8b-3769-bdd2-acda10b66b2b-delete-image')]");
 	public WebElement getGarageKeepers_BTN_Remove(String dataVal)
 	{
 	se.element().waitForElement(GarageKeepers_BTN_Remove ,dataVal);
 	return se.element().getElement(GarageKeepers_BTN_Remove,dataVal);
 	}
 	
 	public By GarageKeepers_CHK_Remove;
	public WebElement getGarageKeepers_CHK_Remove(String dataVal)
	{
		GarageKeepers_CHK_Remove =By.xpath("(//*[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
	se.element().waitForElement(GarageKeepers_CHK_Remove ,dataVal);
	return se.element().getElement(GarageKeepers_CHK_Remove,dataVal);
	}
	
	                       
	public By GarageKeepers_BTN_Done =By.xpath("//*[contains(@id,'/-continue-image')]");
	public WebElement getGarageKeepers_BTN_Done(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_BTN_Done ,dataVal);
	return se.element().getElement(GarageKeepers_BTN_Done,dataVal);
	}
	                            
	public By GarageKeepers_TXT_PrimaryRatingBasis =By.id("field_key$15b896c3-0c5a-368b-aa33-274fa626698e$1primary_rating_basis-textbox");
	public WebElement getGarageKeepers_TXT_PrimaryRatingBasis(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_PrimaryRatingBasis ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_PrimaryRatingBasis,dataVal);
	}
	                            
	public By GarageKeepers_TXT_PrimaryRatingBasisSearch =By.xpath("//input[@id='field_key$15b896c3-0c5a-368b-aa33-274fa626698e$1primary_rating_basis-textbox']/../div[1]");
	public WebElement getGarageKeepers_TXT_PrimaryRatingBasisSearch(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_PrimaryRatingBasisSearch ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_PrimaryRatingBasisSearch,dataVal);
	}
	                            
	public By GarageKeepers_TXT_LocationNumber =By.id("field_key$346b0564-f719-382b-b1c9-70cbc9f2134b$1location_no-textbox");
	public WebElement getGarageKeepers_TXT_LocationNumber(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_LocationNumber ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_LocationNumber,dataVal);
	}
	                            
	public By GarageKeepers_TXT_Name =By.id("field_key$6ac4349c-c747-3bdd-9584-5ebb55624c21$1name-textbox");
	public WebElement getGarageKeepers_TXT_Name(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_Name ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_Name,dataVal);
	}
	                            
	public By GarageKeepers_TXT_Description =By.id("field_key$3be1903e-f405-3f71-8970-4f5761604271$1description-textbox");
	public WebElement getGarageKeepers_TXT_Description(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_Description ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_Description,dataVal);
	}
	                            
	public By GarageKeepers_TXT_Street =By.id("field_key$bc18438b-47da-3444-8be0-7f2b24fff3f5$1line_1-textbox");
	public WebElement getGarageKeepers_TXT_Street(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_Street ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_Street,dataVal);
	}
	                            
	public By GarageKeepers_TXT_Ste_Unt =By.id("field_key$f804af85-271c-3061-999f-70c74bd1b6ef$1line_2-textbox");
	public WebElement getGarageKeepers_TXT_Ste_Unt(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_Ste_Unt ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_Ste_Unt,dataVal);
	}
	                            
	public By GarageKeepers_TXT_City =By.id("field_key$ef2fc149-cda5-3877-a5fa-e6dac7db995a$1city-textbox");
	public WebElement getGarageKeepers_TXT_City(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_City ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_City,dataVal);
	}
	                            
	public By GarageKeepers_TXT_State =By.id("field_key$6b619361-4b0c-392f-b897-a3758aad9929$1state_code-listbox");
	public WebElement getGarageKeepers_TXT_State(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_State ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_State,dataVal);
	}
	                            
	public By GarageKeepers_TXT_ZipCode =By.id("field_key$c2f8d0a4-9258-358a-875a-30eac606f09f$1zip_code-textbox");
	public WebElement getGarageKeepers_TXT_ZipCode(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_ZipCode ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_ZipCode,dataVal);
	}
	                            
	public By GarageKeepers_TXT_KYTax_City =By.id("field_key$b4c2d13a-d335-3dd2-b16d-7e834a8424ca$1risk_municipality_name-textbox");
	public WebElement getGarageKeepers_TXT_KYTax_City(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_KYTax_City ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_KYTax_City,dataVal);
	}
	                            
	public By GarageKeepers_TXT_KYTax_City_Code =By.id("field_key$0fbf6b7e-d77c-31c1-b201-4a36a0c34cf5$1risk_city_code-textbox");
	public WebElement getGarageKeepers_TXT_KYTax_City_Code(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_KYTax_City_Code ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_KYTax_City_Code,dataVal);
	}
	                            
	public By GarageKeepers_TXT_KYTax_County =By.id("field_key$c3fb3ab4-7e07-3bcc-86de-c126f57a170a$1risk_county-textbox");
	public WebElement getGarageKeepers_TXT_KYTax_County(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_KYTax_County ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_KYTax_County,dataVal);
	}
	                            
	public By GarageKeepers_TXT_KYTax_County_Code =By.id("field_key$0a4519a7-09d7-33a2-ad0a-8bf53ea44676$1risk_county_code-textbox");
	public WebElement getGarageKeepers_TXT_KYTax_County_Code(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_KYTax_County_Code ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_KYTax_County_Code,dataVal);
	}
	                            
	public By GarageKeepers_TXT_Classification =By.id("field_key$bae8de1f-02d8-3c86-a7c5-9aad613257bd$1classification-textbox");
	public WebElement getGarageKeepers_TXT_Classification(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_Classification ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_Classification,dataVal);
	}
	                            
	public By GarageKeepers_TXT_ClassificationSearch =By.xpath("//input[@id='field_key$bae8de1f-02d8-3c86-a7c5-9aad613257bd$1classification-textbox']/../div[1]");
	public WebElement getGarageKeepers_TXT_ClassificationSearch(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_ClassificationSearch ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_ClassificationSearch,dataVal);
	}
	                            
	public By GarageKeepers_CHK_OtherThanCollision =By.xpath("//span[@id='field_key$1b27933c-2f28-38fb-8a86-01d77d798be7$1gara_otc-checkbox']/input");
	public WebElement getGarageKeepers_CHK_OtherThanCollision(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_CHK_OtherThanCollision ,dataVal);
	return se.element().getElement(GarageKeepers_CHK_OtherThanCollision,dataVal);
	}
	                            
	public By GarageKeepers_TXT_Type =By.id("field_key$d124b2a7-9a9d-3e01-8b41-731133b95236$1loss_type-textbox");
	public WebElement getGarageKeepers_TXT_Type(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_Type ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_Type,dataVal);
	}
	                            
	public By GarageKeepers_TXT_TypeSearch =By.xpath("//input[@id='field_key$d124b2a7-9a9d-3e01-8b41-731133b95236$1loss_type-textbox']/../div[1]");
	public WebElement getGarageKeepers_TXT_TypeSearch(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_TypeSearch ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_TypeSearch,dataVal);
	}
	                            
	public By GarageKeepers_CHK_AllPerilsDeductible =By.xpath("//span[@id='field_key$009ce280-e074-3c51-ac72-c3da5b7545cd$1is_all_perils_deduct-checkbox']/input");
	public WebElement getGarageKeepers_CHK_AllPerilsDeductible(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_CHK_AllPerilsDeductible ,dataVal);
	return se.element().getElement(GarageKeepers_CHK_AllPerilsDeductible,dataVal);
	}
	                            
	public By GarageKeepers_TXT_DedPerCar =By.id("field_key$7d4cc51a-5a91-375e-ae79-819b11aec076$1deductible_per_car-textbox");
	public WebElement getGarageKeepers_TXT_DedPerCar(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_DedPerCar ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_DedPerCar,dataVal);
	}
	                            
	public By GarageKeepers_TXT_DedPerCarSearch =By.xpath("//input[@id='field_key$7d4cc51a-5a91-375e-ae79-819b11aec076$1deductible_per_car-textbox']/../div");
	public WebElement getGarageKeepers_TXT_DedPerCarSearch(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_DedPerCarSearch ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_DedPerCarSearch,dataVal);
	}
	                            
	public By GarageKeepers_TXT_DedPerOccurence =By.id("field_key$64b9ef6f-603a-3f4f-9394-df38a66f26fe$1deductible_per_occu-textbox");
	public WebElement getGarageKeepers_TXT_DedPerOccurence(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_DedPerOccurence ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_DedPerOccurence,dataVal);
	}
	                            
	public By GarageKeepers_TXT_OTC_MaxLimit =By.id("field_key$0808c16f-7327-3b66-b03b-f128a1d0f2c7$1max_limit-textbox");
	public WebElement getGarageKeepers_TXT_OTC_MaxLimit(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_OTC_MaxLimit ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_OTC_MaxLimit,dataVal);
	}
	                            
	public By GarageKeepers_TXT_OTC_MaxLimitSearch =By.xpath("//input[@id='field_key$0808c16f-7327-3b66-b03b-f128a1d0f2c7$1max_limit-textbox']/../div[1]");
	public WebElement getGarageKeepers_TXT_OTC_MaxLimitSearch(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_OTC_MaxLimitSearch ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_OTC_MaxLimitSearch,dataVal);
	}
	                            
	public By GarageKeepers_CHK_Collision =By.xpath("//span[@id='field_key$4bf45bc4-487a-3397-8427-d3407814aea0$1gara_collision-checkbox']/input");
	public WebElement getGarageKeepers_CHK_Collision(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_CHK_Collision ,dataVal);
	return se.element().getElement(GarageKeepers_CHK_Collision,dataVal);
	}
	                            
	public By GarageKeepers_TXT_Deductible =By.id("field_key$fffb0987-774f-3f06-8996-dd17bc2c5e90$1deductible-textbox");
	public WebElement getGarageKeepers_TXT_Deductible(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_Deductible ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_Deductible,dataVal);
	}
	                            
	public By GarageKeepers_TXT_DeductibleSearch =By.xpath("//input[@id='field_key$fffb0987-774f-3f06-8996-dd17bc2c5e90$1deductible-textbox']/../div[1]");
	public WebElement getGarageKeepers_TXT_DeductibleSearch(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_DeductibleSearch ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_DeductibleSearch,dataVal);
	}
	                            
	public By GarageKeepers_TXT_Coll_MaxLimit =By.id("field_key$21fddf01-b187-3645-878d-ecc1675a0f68$1maximum_limit-textbox");
	public WebElement getGarageKeepers_TXT_Coll_MaxLimit(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_Coll_MaxLimit ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_Coll_MaxLimit,dataVal);
	}
	                            
	public By GarageKeepers_TXT_Coll_MaxLimitSearch =By.xpath("//input[@id='field_key$21fddf01-b187-3645-878d-ecc1675a0f68$1maximum_limit-textbox']/../div[1]");
	public WebElement getGarageKeepers_TXT_Coll_MaxLimitSearch(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_TXT_Coll_MaxLimitSearch ,dataVal);
	return se.element().getElement(GarageKeepers_TXT_Coll_MaxLimitSearch,dataVal);
	}
	                            
	public By GarageKeepers_CHK_1is_no_tax_KY =By.xpath("//span[@id='field_key$ea825ec2-0617-3fbb-9835-9f3ccb3527fb$1is_no_tax-checkbox']/input");
	public WebElement getGarageKeepers_CHK_1is_no_tax_KY(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_CHK_1is_no_tax_KY ,dataVal);
	return se.element().getElement(GarageKeepers_CHK_1is_no_tax_KY,dataVal);
	}
	                            
	public By GarageKeepers_CHK_1c_municipality_name_KY =By.xpath("//span[@id='field_key$bd5810ed-0269-36de-9575-b8dac1cc8c06$1c_municipality_name-checkbox']/input");
	public WebElement getGarageKeepers_CHK_1c_municipality_name_KY(String dataVal)
	{
	se.element().waitForElement(GarageKeepers_CHK_1c_municipality_name_KY ,dataVal);
	return se.element().getElement(GarageKeepers_CHK_1c_municipality_name_KY,dataVal);
	}
	                            

	
	/*****************************************
	 * END of Garbage Keepers  Locators
	 ******************************************/
	
	
	/*****************************************
	 * Start of Drivers page Locators
	 ******************************************/
    public By CA_Drivers_LBL_VerifyDrivers = By
 			.xpath("//div[contains(@id,'lob_ca_drivers-label')]");

 	public WebElement getCA_Drivers_LBL_VerifyDrivers() {
 		se.element().waitForElement(CA_Drivers_LBL_VerifyDrivers);
 		return se.element().getElement(CA_Drivers_LBL_VerifyDrivers);
 	}
 	
     public By Drivers_TXT_BTN_AddDriver =By.xpath("//*[@id='c0258076-12ba-387e-804a-5cde1b71d49f-add-image']");
     public WebElement getDrivers_TXT_BTN_AddDriver()
     {
     se.element().waitForElement(Drivers_TXT_BTN_AddDriver);
     return se.element().getElement(Drivers_TXT_BTN_AddDriver);
     }
                                 
     public By Drivers_BTN_DoneDriver =By.xpath("//*[contains (@id,'continue-image')]");
     public WebElement getDrivers_BTN_DoneDriver(String dataVal)
     {
     se.element().waitForElement(Drivers_BTN_DoneDriver ,dataVal);
     return se.element().getElement(Drivers_BTN_DoneDriver,dataVal);
     }
                                 
     public By Drivers_BTN_RemoveDriver =By.xpath("//*[contains (@id,'delete-image')]");
     public WebElement getDrivers_BTN_RemoveDriver()
     {
     se.element().waitForElement(Drivers_BTN_RemoveDriver);
     return se.element().getElement(Drivers_BTN_RemoveDriver);
     }
                                 
     public By Drivers_BTN_CopyDriver =By.xpath("//*[contains (@id,'copybutton-image')]");
     public WebElement getDrivers_BTN_CopyDriver(String dataVal)
     {
     se.element().waitForElement(Drivers_BTN_CopyDriver ,dataVal);
     return se.element().getElement(Drivers_BTN_CopyDriver,dataVal);
     }
                                 
     public By Drivers_BTN_EditDriver;
     public WebElement getDrivers_BTN_EditDriver(String dataVal)
     {
    	 Drivers_BTN_EditDriver =By.xpath("//div[contains(@id,'"+dataVal+"ca_drivers-image')]");
     se.element().waitForElement(Drivers_BTN_EditDriver, dataVal );
     return se.element().getElement(Drivers_BTN_EditDriver , dataVal);
     }
                                 
     public By Drivers_TXT_DriverNumber =By.id("field_key$9ebc3483-3e11-375e-8aab-5661400f5797$1driver_no-textbox");
     public WebElement getDrivers_TXT_DriverNumber(String dataVal)
     {
     se.element().waitForElement(Drivers_TXT_DriverNumber ,dataVal);
     return se.element().getElement(Drivers_TXT_DriverNumber,dataVal);
     }
                                 
     public By Drivers_DDN_TitlePrefix =By.id("field_key$2168f86e-2154-318f-9453-702d25924db4$1title_prefix-textbox");
     public WebElement getDrivers_DDN_TitlePrefix(String dataVal)
     {
     se.element().waitForElement(Drivers_DDN_TitlePrefix ,dataVal);
     return se.element().getElement(Drivers_DDN_TitlePrefix,dataVal);
     }
                                 
     public By Drivers_CHK_ExcludeDriver_YES =By.xpath("(//span[text()='Exclude Driver from Policy']/../../following-sibling::td[2]//input)[1]");
     public WebElement getDrivers_CHK_ExcludeDriver_YES(String dataVal)
     {
     se.element().waitForElement(Drivers_CHK_ExcludeDriver_YES ,dataVal);
     return se.element().getElement(Drivers_CHK_ExcludeDriver_YES,dataVal);
     }
                                 
     public By Drivers_CHK_ExcludeDriver_NO =By.xpath("(//span[text()='Exclude Driver from Policy']/../../following-sibling::td[2]//input)[2]");
     public WebElement getDrivers_CHK_ExcludeDriver_NO(String dataVal)
     {
     se.element().waitForElement(Drivers_CHK_ExcludeDriver_NO ,dataVal);
     return se.element().getElement(Drivers_CHK_ExcludeDriver_NO,dataVal);
     }
                                 
     public By Drivers_DDN_StateOfOperations =By.id("field_key$e4722c93-239b-3bc2-9ebf-02cb628d0bcd$1state_of_operations-textbox");
     public WebElement getDrivers_DDN_StateOfOperations(String dataVal)
     {
     se.element().waitForElement(Drivers_DDN_StateOfOperations ,dataVal);
     return se.element().getElement(Drivers_DDN_StateOfOperations,dataVal);
     }
                                 
     public By Drivers_TXT_FirstName =By.id("field_key$162df988-9c6e-3bce-929e-33cf101410ac$1first_name-textbox");
     public WebElement getDrivers_TXT_FirstName(String dataVal)
     {
     se.element().waitForElement(Drivers_TXT_FirstName ,dataVal);
     return se.element().getElement(Drivers_TXT_FirstName,dataVal);
     }
                                 
     public By Drivers_TXT_MiddleName =By.id("field_key$2c8b7e15-5e72-3726-8df2-873967ea728d$1middle_name-textbox");
     public WebElement getDrivers_TXT_MiddleName(String dataVal)
     {
     se.element().waitForElement(Drivers_TXT_MiddleName ,dataVal);
     return se.element().getElement(Drivers_TXT_MiddleName,dataVal);
     }
                                 
     public By Drivers_TXT_LastName =By.id("field_key$bc9b80ba-45f4-3b38-9629-f89b387d93bd$1last_name-textbox");
     public WebElement getDrivers_TXT_LastName(String dataVal)
     {
     se.element().waitForElement(Drivers_TXT_LastName ,dataVal);
     return se.element().getElement(Drivers_TXT_LastName,dataVal);
     }
                                 
     public By Drivers_TXT_NameSuffix =By.id("field_key$1aa2a2d6-0b97-3741-a349-baf9b8aa0534$1name_suffix-textbox");
     public WebElement getDrivers_TXT_NameSuffix(String dataVal)
     {
     se.element().waitForElement(Drivers_TXT_NameSuffix ,dataVal);
     return se.element().getElement(Drivers_TXT_NameSuffix,dataVal);
     }
                                 
     public By Drivers_TXT_DateOfBirth =By.xpath("//html/body//div[@id='field_key$c69a6643-ea7c-3222-8d8b-19b4a9320cc7$1dob-picker']/input");
     public WebElement getDrivers_TXT_DateOfBirth(String dataVal)
     {
     se.element().waitForElement(Drivers_TXT_DateOfBirth ,dataVal);
     return se.element().getElement(Drivers_TXT_DateOfBirth,dataVal);
     }
                                 
     public By Drivers_CHK_Gender_Male =By.xpath("(//span[text()='Gender']/../../following-sibling::td[2]//input)[1]");
     public WebElement getDrivers_CHK_Gender_Male(String dataVal)
     {
     se.element().waitForElement(Drivers_CHK_Gender_Male ,dataVal);
     return se.element().getElement(Drivers_CHK_Gender_Male,dataVal);
     }
                                 
     public By Drivers_CHK_Gender_Female =By.xpath("(//span[text()='Gender']/../../following-sibling::td[2]//input)[2]");
     public WebElement getDrivers_CHK_Gender_Female(String dataVal)
     {
     se.element().waitForElement(Drivers_CHK_Gender_Female ,dataVal);
     return se.element().getElement(Drivers_CHK_Gender_Female,dataVal);
     }
                                 
     public By Drivers_DDN_MaritalStatus =By.id("field_key$1488aaaf-fd1f-35f4-b617-778ad7828386$1marital_status-textbox");
     public WebElement getDrivers_DDN_MaritalStatus(String dataVal)
     {
     se.element().waitForElement(Drivers_DDN_MaritalStatus ,dataVal);
     return se.element().getElement(Drivers_DDN_MaritalStatus,dataVal);
     }
                                 
     public By Drivers_TXT_DateofHire =By.xpath("//html/body//div[@id='field_key$f7da38ae-c837-3930-b901-51041dfa590e$1date_hired-picker']/input");
     public WebElement getDrivers_TXT_DateofHire(String dataVal)
     {
     se.element().waitForElement(Drivers_TXT_DateofHire ,dataVal);
     return se.element().getElement(Drivers_TXT_DateofHire,dataVal);
     }
                                 
     public By Drivers_TXT_Streetline_1 =By.id("field_key$9c84545e-6a14-3d12-ad36-9ce25475036f$1line_1-textbox");
     public WebElement getDrivers_TXT_Streetline_1(String dataVal)
     {
     se.element().waitForElement(Drivers_TXT_Streetline_1 ,dataVal);
     return se.element().getElement(Drivers_TXT_Streetline_1,dataVal);
     }
                                 
     public By Drivers_TXT_Streetline_2 =By.id("field_key$dc4adb17-3f4c-3adb-aeba-393ac0473c38$1line_2-textbox");
     public WebElement getDrivers_TXT_Streetline_2(String dataVal)
     {
     se.element().waitForElement(Drivers_TXT_Streetline_2 ,dataVal);
     return se.element().getElement(Drivers_TXT_Streetline_2,dataVal);
     }
                                 
     public By Drivers_DDN_City =By.id("field_key$e952b675-a88e-3e28-8bc7-738453ee2c90$1city-textbox");
     public WebElement getDrivers_DDN_City(String dataVal)
     {
     se.element().waitForElement(Drivers_DDN_City ,dataVal);
     return se.element().getElement(Drivers_DDN_City,dataVal);
     }
                                 
     public By Drivers_DDN_State =By.xpath("//html/body//div[@id='field_key$4992456d-9a2f-323b-ac6f-3e87da988110$1state_code-listbox']/input");
     public WebElement getDrivers_DDN_State(String dataVal)
     {
     se.element().waitForElement(Drivers_DDN_State ,dataVal);
     return se.element().getElement(Drivers_DDN_State,dataVal);
     }
                                 
     public By Drivers_DDN_Zipcode =By.id("field_key$b46e0e61-7bfc-3331-bdc9-79fe6de4b8c4$1zip_code-textbox");
     public WebElement getDrivers_DDN_Zipcode(String dataVal)
     {
     se.element().waitForElement(Drivers_DDN_Zipcode ,dataVal);
     return se.element().getElement(Drivers_DDN_Zipcode,dataVal);
     }
                                 
     public By Drivers_TXT_YearsOfDrivingExperience =By.id("field_key$722449a5-26e9-3302-9a0e-d9d9b116fb6e$1driving_exp_in_years-textbox");
     public WebElement getDrivers_TXT_YearsOfDrivingExperience(String dataVal)
     {
     se.element().waitForElement(Drivers_TXT_YearsOfDrivingExperience ,dataVal);
     return se.element().getElement(Drivers_TXT_YearsOfDrivingExperience,dataVal);
     }
                                 
     public By Drivers_TXT_License_Year =By.id("field_key$a43d58ac-9e56-3ed0-b875-18a908a45783$1license_year-textbox");
     public WebElement getDrivers_TXT_License_Year(String dataVal)
     {
     se.element().waitForElement(Drivers_TXT_License_Year ,dataVal);
     return se.element().getElement(Drivers_TXT_License_Year,dataVal);
     }
                                 
     public By Drivers_TXT_License_Number =By.id("field_key$fd39fec2-049a-39f0-ae93-6a1fd19691a3$1license_number-textbox");
     public WebElement getDrivers_TXT_License_Number(String dataVal)
     {
     se.element().waitForElement(Drivers_TXT_License_Number ,dataVal);
     return se.element().getElement(Drivers_TXT_License_Number,dataVal);
     }
                                 
     public By Drivers_DDN_License_State =By.xpath("//html/body//div[@id='field_key$ce7e6a2c-ee81-3b54-9095-8978c0809818$1license_state-listbox']/input");
     public WebElement getDrivers_DDN_License_State(String dataVal)
     {
     se.element().waitForElement(Drivers_DDN_License_State ,dataVal);
     return se.element().getElement(Drivers_DDN_License_State,dataVal);
     }
                                 


	/*****************************************
	 * End of Drivers page Locators
	 ******************************************/

     /*****************************************
 	 * Start Business Interruption of Locators
 	 ******************************************/
 	public By BusinesInterruption_TXT_Label = By
 			.xpath("//div[contains(@id,'ca_business_interruption-label')]");

 	public WebElement getBusinesInterruption_TXT_Label() {
 		se.element().waitForElement(BusinesInterruption_TXT_Label);
 		return se.element().getElement(BusinesInterruption_TXT_Label);
 	}

 	public By BusinesInterruption_TXT_State =By.xpath("//input[@id='field_key$64ad542f-880a-3d4b-8e52-7a38270ca30e$1state_1-textbox']");
 	public WebElement getBusinesInterruption_TXT_State(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_State ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_State,dataVal);
 	}
 	                            
 	public By BusinessInterruption_TXT_DescriptionOfBussActivitiesDepndOnsheduleProperty =By.xpath("//*[@id='field_key$56225b02-7dbc-37f3-aa33-5185ecbb2ba3$1busi_activity_des-textarea']");
 	public WebElement getBusinessInterruption_TXT_DescriptionOfBussActivitiesDepndOnsheduleProperty(String dataVal)
 	{
 	se.element().waitForElement(BusinessInterruption_TXT_DescriptionOfBussActivitiesDepndOnsheduleProperty ,dataVal);
 	return se.element().getElement(BusinessInterruption_TXT_DescriptionOfBussActivitiesDepndOnsheduleProperty,dataVal);
 	}
 	                            
 	public By BusinessInterruption_CHK_Business_IncomeWithoutExtraExpense =By.xpath("//div[contains(text(),'Business Income(Without Extra Expense)')]/../../preceding-sibling::div[1]//input");
 	public WebElement getBusinessInterruption_CHK_Business_IncomeWithoutExtraExpense(String dataVal)
 	{
 	se.element().waitForElement(BusinessInterruption_CHK_Business_IncomeWithoutExtraExpense ,dataVal);
 	return se.element().getElement(BusinessInterruption_CHK_Business_IncomeWithoutExtraExpense,dataVal);
 	}
 	                            
 	public By BusinessInterruption_CHK_Business_IncomeWithExtraExpense =By.xpath("//div[contains(text(),'Business Income And Extra Expense')]/../../preceding-sibling::div[1]//input");
 	public WebElement getBusinessInterruption_CHK_Business_IncomeWithExtraExpense(String dataVal)
 	{
 	se.element().waitForElement(BusinessInterruption_CHK_Business_IncomeWithExtraExpense ,dataVal);
 	return se.element().getElement(BusinessInterruption_CHK_Business_IncomeWithExtraExpense,dataVal);
 	}
 	                            
 	public By BusinessInterruption_CHK_Comprehensive =By.xpath("//div[contains(text(),'Comprehensive')]/../../preceding-sibling::div[1]//input");
 	public WebElement getBusinessInterruption_CHK_Comprehensive(String dataVal)
 	{
 	se.element().waitForElement(BusinessInterruption_CHK_Comprehensive ,dataVal);
 	return se.element().getElement(BusinessInterruption_CHK_Comprehensive,dataVal);
 	}
 	                            
 	public By BusinessInterruption_CHK_specified_cause_of_loss=By.xpath("//div[contains(text(),'Comprehensive')]/../../preceding-sibling::div[1]//input");
 	public WebElement getBusinessInterruption_CHK_specified_cause_of_loss(String dataVal)
 	{
 	se.element().waitForElement(BusinessInterruption_CHK_specified_cause_of_loss,dataVal);
 	return se.element().getElement(BusinessInterruption_CHK_specified_cause_of_loss,dataVal);
 	}
 	                            
 	public By BusinessInterruption_CHK_Collision =By.xpath("//div[contains(text(),'Collision')]/../../preceding-sibling::div[1]//input");
 	public WebElement getBusinessInterruption_CHK_Collision(String dataVal)
 	{
 	se.element().waitForElement(BusinessInterruption_CHK_Collision ,dataVal);
 	return se.element().getElement(BusinessInterruption_CHK_Collision,dataVal);
 	}
 	                            
 	public By BusinessInterruption_TXT_BusiIncomCovWaitingPeriod =By.xpath("//input[@id='field_key$bdd3b7b2-eb3a-3070-a966-934e3da70aaf$1busi_incom_wait_prd-textbox']");
 	public WebElement getBusinessInterruption_TXT_BusiIncomCovWaitingPeriod(String dataVal)
 	{
 	se.element().waitForElement(BusinessInterruption_TXT_BusiIncomCovWaitingPeriod ,dataVal);
 	return se.element().getElement(BusinessInterruption_TXT_BusiIncomCovWaitingPeriod,dataVal);
 	}
 	                            
 	public By BusinessInterruption_TXT_BusiIncomCovWaitingPeriodSearch =By.xpath("//input[@id='field_key$bdd3b7b2-eb3a-3070-a966-934e3da70aaf$1busi_incom_wait_prd-textbox']/../div");
 	public WebElement getBusinessInterruption_TXT_BusiIncomCovWaitingPeriodSearch(String dataVal)
 	{
 	se.element().waitForElement(BusinessInterruption_TXT_BusiIncomCovWaitingPeriodSearch ,dataVal);
 	return se.element().getElement(BusinessInterruption_TXT_BusiIncomCovWaitingPeriodSearch,dataVal);
 	}
 	                            
 	public By BusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverage =By.xpath("//input[@id='field_key$c0e8d870-5abb-3d40-9c06-70e9f11090ea$1ext_busi_incom_add_cov-textbox']");
 	public WebElement getBusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverage(String dataVal)
 	{
 	se.element().waitForElement(BusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverage ,dataVal);
 	return se.element().getElement(BusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverage,dataVal);
 	}
 	                            
 	public By BusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverageSearch =By.xpath("//input[@id='field_key$c0e8d870-5abb-3d40-9c06-70e9f11090ea$1ext_busi_incom_add_cov-textbox']/../div");
 	public WebElement getBusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverageSearch(String dataVal)
 	{
 	se.element().waitForElement(BusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverageSearch ,dataVal);
 	return se.element().getElement(BusinessInterruption_TXT_Extended_BusiIncomAdditionalCoverageSearch,dataVal);
 	}
 	                            
 	public By BusinessInterruption_CHK_OptionA_SeparateLimits =By.xpath("//label[contains(text(),'Option A - Separate Limits')]/../input");
 	public WebElement getBusinessInterruption_CHK_OptionA_SeparateLimits(String dataVal)
 	{
 	se.element().waitForElement(BusinessInterruption_CHK_OptionA_SeparateLimits ,dataVal);
 	return se.element().getElement(BusinessInterruption_CHK_OptionA_SeparateLimits,dataVal);
 	}
 	                            
 	public By BusinesInterruption_TXT_OptionADesc_Schduld_Property =By.xpath("//input[@id='field_key$bb087666-1729-3b82-86fc-e3bc9f0fc84c$1opta_des_schduld_prop-textbox']");
 	public WebElement getBusinesInterruption_TXT_OptionADesc_Schduld_Property(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_OptionADesc_Schduld_Property ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_OptionADesc_Schduld_Property,dataVal);
 	}
 	                            
 	public By BusinesInterruption_TXT_OptionA_limit_insurance
 	 =By.xpath("//input[@id='field_key$55c8e93c-f6b7-3122-b8da-075e68e9f696$1option_a_limit_insurance-textbox']");
 	public WebElement getBusinesInterruption_TXT_OptionA_limit_insurance
 	(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_OptionA_limit_insurance
 	 ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_OptionA_limit_insurance
 	,dataVal);
 	}
 	                            
 	public By BusinessInterruption_CHK_OptionB_SingleLimits =By.xpath("//*[@id='field_key$bbcfde89-dd74-3522-9a01-0aa9b22d4685$1option_b-checkbox']/input");
 	public WebElement getBusinessInterruption_CHK_OptionB_SingleLimits(String dataVal)
 	{
 	se.element().waitForElement(BusinessInterruption_CHK_OptionB_SingleLimits ,dataVal);
 	return se.element().getElement(BusinessInterruption_CHK_OptionB_SingleLimits,dataVal);
 	}
 	                            
 	public By BusinesInterruption_TXT_OptionB_limit_insurance
 	 =By.xpath("//*[@id='field_key$35cddf89-84b8-3b76-b78c-56bdf5b286af$1opt_b_lmt_of_insurance-textbox']");
 	public WebElement getBusinesInterruption_TXT_OptionB_limit_insurance
 	(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_OptionB_limit_insurance
 	 ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_OptionB_limit_insurance
 	,dataVal);
 	}
 	                            
 	public By BusinesInterruption_TXT_OptionB_PercentageOfInsuToExposure = By
 			.xpath("//*[@id='field_key$14349dab-d3a4-3282-8f0a-f996a96e69fd$1opt_b_perntge_insu_exposur-textbox']");

 	public WebElement getBusinesInterruption_TXT_OptionB_PercentageOfInsuToExposure(String dataVal) {
 		se.element().waitForElement(BusinesInterruption_TXT_OptionB_PercentageOfInsuToExposure, dataVal);
 		return se.element().getElement(BusinesInterruption_TXT_OptionB_PercentageOfInsuToExposure, dataVal);
 	}
 	                            
 	public By BusinesInterruption_TXT_OptionB_PercentageOfInsuToExposureFilterSearch
 	 =By.xpath("//*[@id='field_key$14349dab-d3a4-3282-8f0a-f996a96e69fd$1opt_b_perntge_insu_exposur-textbox']/../div");
 	public WebElement getBusinesInterruption_TXT_OptionB_PercentageOfInsuToExposureFilterSearch
 	(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_OptionB_PercentageOfInsuToExposureFilterSearch
 	 ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_OptionB_PercentageOfInsuToExposureFilterSearch
 	,dataVal);
 	}
 	                            
 	public By BusinesInterruption_TXT_OptionBDesc_Schduld_Property =By.xpath("//input[@id='field_key$3ee3fcc3-1a09-3a16-9fa4-498af6aef5ce$1opt_b_desc_sch_prop-textbox']");
 	public WebElement getBusinesInterruption_TXT_OptionBDesc_Schduld_Property(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_OptionBDesc_Schduld_Property ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_OptionBDesc_Schduld_Property,dataVal);
 	}
 	                            
 	public By BusinesInterruption_TXT_TaxCity =By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]");
 	public WebElement getBusinesInterruption_TXT_TaxCity(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_TaxCity ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_TaxCity,dataVal);
 	}
 	                            
 	public By BusinesInterruption_TXT_TaxCitySearch =By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]/../div");
 	public WebElement getBusinesInterruption_TXT_TaxCitySearch(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_TaxCitySearch ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_TaxCitySearch,dataVal);
 	}
 	                            
 	public By BusinesInterruption_TXT_TaxCityCode =By.xpath("//*[contains(@id,'1risk_city_code-textbox')]");
 	public WebElement getBusinesInterruption_TXT_TaxCityCode(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_TaxCityCode ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_TaxCityCode,dataVal);
 	}
 	                            
 	public By BusinesInterruption_TXT_TaxCountry =By.xpath("//*[contains(@id,'1risk_county-textbox')]");
 	public WebElement getBusinesInterruption_TXT_TaxCountry(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_TaxCountry ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_TaxCountry,dataVal);
 	}
 	 
 	public By BusinesInterruption_TXT_JuridictionDescription =By.xpath("//*[contains(@id,'1municipality-textbox')]");
 	public WebElement getBusinesInterruption_TXT_JuridictionDescription(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_JuridictionDescription ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_JuridictionDescription,dataVal);
 	}
 	
 	public By BusinesInterruption_TXT_TaxCountrySearch =By.xpath("//*[contains(@id,'1risk_county-textbox')]/../div");
 	public WebElement getBusinesInterruption_TXT_TaxCountrySearch(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_TaxCountrySearch ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_TaxCountrySearch,dataVal);
 	}
 	                           
 	public By BusinesInterruption_TXT_TaxCountrycode =By.xpath("//*[contains(@id,'1risk_county_code-textbox')]");
 	public WebElement getBusinesInterruption_TXT_TaxCountrycode(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_TaxCountrycode ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_TaxCountrycode,dataVal);
 	}		                
 	                            
 	public By BusinesInterruption_TXT_JuridictionDescriptionSearch =By.xpath("//*[contains(@id,'1municipality-textbox')]/../div");
 	public WebElement getBusinesInterruption_TXT_JuridictionDescriptionSearch(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_JuridictionDescriptionSearch ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_JuridictionDescriptionSearch,dataVal);
 	}
 	                            
 	public By BusinesInterruption_TXT_JurisdictionFPDCode =By.xpath("//*[contains(@id,'1municipality_code-textbox')]");
 	public WebElement getBusinesInterruption_TXT_JurisdictionFPDCode(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_JurisdictionFPDCode ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_JurisdictionFPDCode,dataVal);
 	}
 	                            
 	public By BusinesInterruption_TXT_FireProtectionDistrict =By.xpath("//*[contains(@id,'1municipality_desc-textbox')]");
 	public WebElement getBusinesInterruption_TXT_FireProtectionDistrict(String dataVal)
 	{
 	se.element().waitForElement(BusinesInterruption_TXT_FireProtectionDistrict ,dataVal);
 	return se.element().getElement(BusinesInterruption_TXT_FireProtectionDistrict,dataVal);
 	}
 	                            

 	/*****************************************
 	 * End of Business Interruption Locators
 	 ******************************************/
 	/*****************************************
 	 * Start of Drive Away Collision Locators
 	 ******************************************/
 	
 	public By CA_DriveAwayCollision_LabelName =By.xpath("//div[contains(@id,'drive_away_collision_cov-label')]");
 	public WebElement getCA_DriveAwayCollision_LabelName()
 	{
 	se.element().waitForElement(CA_DriveAwayCollision_LabelName );
 	return se.element().getElement(CA_DriveAwayCollision_LabelName);
 	}
 	
 	public By DriveAwayCollision_BTN_ADD =By.xpath("//*[@id='d31fdcc9-3866-3e21-85bd-4e778600c78d-add-image']");
 	public WebElement getDriveAwayCollision_BTN_ADD()
 	{
 	se.element().waitForElement(DriveAwayCollision_BTN_ADD );
 	return se.element().getElement(DriveAwayCollision_BTN_ADD);
 	}
 	public By DriveAwayCollision_BTN_Edit =By.xpath("//*[@id='d31fdcc9-3866-3e21-85bd-4e778600c78d-editbutton-image']");
 	public WebElement getstrDriveAwayCollision_BTN_Edit()
 	{
 	se.element().waitForElement(DriveAwayCollision_BTN_Edit );
 	return se.element().getElement(DriveAwayCollision_BTN_Edit);
 	}
 	
 	public By DriveAwayCollision_BTN_Remove =By.xpath("//*[@id='d31fdcc9-3866-3e21-85bd-4e778600c78d-delete-image']");
 	public WebElement getstrDriveAwayCollision_BTN_Remove()
 	{
 	se.element().waitForElement(DriveAwayCollision_BTN_Remove );
 	return se.element().getElement(DriveAwayCollision_BTN_Remove);
 	}
 	
 	public By DriveAwayCollision_BTN_Add =By.xpath("//*[@id='d31fdcc9-3866-3e21-85bd-4e778600c78d-add-image']");
 	public WebElement getDriveAwayCollision_BTN_Add(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_BTN_Add, dataVal);
 	return se.element().getElement(DriveAwayCollision_BTN_Add,dataVal );
 	}
 	                            
 	public By DriveAwayCollision_BTN_Done =By.xpath("//div[contains(@id,'continue-image')]");
 	public WebElement getDriveAwayCollision_BTN_Done(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_BTN_Done ,dataVal);
 	return se.element().getElement(DriveAwayCollision_BTN_Done,dataVal);
 	}
 	
 	public By DriveAwayCollision_CHK_Remove;
	public WebElement getDriveAwayCollision_CHK_Remove(String dataVal)
	{
		DriveAwayCollision_CHK_Remove =By.xpath("(//*[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
	se.element().waitForElement(DriveAwayCollision_CHK_Remove ,dataVal);
	return se.element().getElement(DriveAwayCollision_CHK_Remove,dataVal);
	}
 	                            
 	public By DriveAwayCollision_BTN_RemoveCov =By.xpath("//*[contains(@id,'d31fdcc9-3866-3e21-85bd-4e778600c78d-delete-image')]");
 	public WebElement getDriveAwayCollision_BTN_RemoveCov(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_BTN_RemoveCov ,dataVal);
 	return se.element().getElement(DriveAwayCollision_BTN_RemoveCov,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_BTN_Details;
 	public WebElement getDriveAwayCollision_BTN_Details(String dataVal)
 	{
 	DriveAwayCollision_BTN_Details =By.xpath("//*[contains(@id,'"+dataVal+"drive_away_collision_cov-image')]");
 	se.element().waitForElement(DriveAwayCollision_BTN_Details ,dataVal);
 	return se.element().getElement(DriveAwayCollision_BTN_Details ,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_LocNo =By.xpath("//*[contains(@id,'1location_no-textbox')]");
 	public WebElement getDriveAwayCollision_TXT_LocNo(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_LocNo ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_LocNo,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_Name =By.xpath("//*[contains(@id,'1name-textbox')]");
 	public WebElement getDriveAwayCollision_TXT_Name(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_Name ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_Name,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_Description =By.xpath("//*[contains(@id,'1description-textbox')]");
 	public WebElement getDriveAwayCollision_TXT_Description(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_Description ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_Description,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_KYTax_City =By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]");
 	public WebElement getDriveAwayCollision_TXT_KYTax_City(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_KYTax_City ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_KYTax_City,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_KYTax_CitySearch =By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]/../div");
 	public WebElement getDriveAwayCollision_TXT_KYTax_CitySearch(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_KYTax_CitySearch ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_KYTax_CitySearch,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_KYTax_City_Code =By.xpath("//*[contains(@id,'1risk_city_code-textbox')]");
 	public WebElement getDriveAwayCollision_TXT_KYTax_City_Code(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_KYTax_City_Code ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_KYTax_City_Code,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_KYTax_County =By.xpath("//*[contains(@id,'1risk_county-textbox')]");
 	public WebElement getDriveAwayCollision_TXT_KYTax_County(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_KYTax_County ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_KYTax_County,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_KYTax_CountySearch =By.xpath("//*[contains(@id,'1risk_county-textbox')]/../div");
 	public WebElement getDriveAwayCollision_TXT_KYTax_CountySearch(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_KYTax_CountySearch ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_KYTax_CountySearch,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_KYTax_County_Code =By.xpath("//*[contains(@id,'1risk_county_code-textbox')]");
 	public WebElement getDriveAwayCollision_TXT_KYTax_County_Code(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_KYTax_County_Code ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_KYTax_County_Code,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_KYTax_Tax_Code =By.xpath("//*[contains(@id,'1risk_tax_code-textbox')]");
 	public WebElement getDriveAwayCollision_TXT_KYTax_Tax_Code(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_KYTax_Tax_Code ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_KYTax_Tax_Code,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_CHK_CollisionType_Individual =By.xpath("(//span[text()='Collision Type ']/../../following-sibling::td[2]//input)[1]");
 	public WebElement getDriveAwayCollision_CHK_CollisionType_Individual(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_CHK_CollisionType_Individual ,dataVal);
 	return se.element().getElement(DriveAwayCollision_CHK_CollisionType_Individual,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_CHK_CollisionType_Blanket =By.xpath("(//span[text()='Collision Type ']/../../following-sibling::td[2]//input)[2]");
 	public WebElement getDriveAwayCollision_CHK_CollisionType_Blanket(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_CHK_CollisionType_Blanket ,dataVal);
 	return se.element().getElement(DriveAwayCollision_CHK_CollisionType_Blanket,dataVal);
 	}
 	
 	
 	  
 	public By DriveAwayCollision_TXT_CollisionCoverage =By.xpath("//input[contains(@id,'1collision_coverage-textbox')]");
 	public WebElement getDriveAwayCollision_TXT_CollisionCoverage(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_CollisionCoverage ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_CollisionCoverage,dataVal);
 	}
 	
 	public By DriveAwayCollision_TXT_CollisionCoverageSearch =By.xpath("//input[contains(@id,'1collision_coverage-textbox')]/../div");
 	public WebElement getDriveAwayCollision_TXT_CollisionCoverageSearch(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_CollisionCoverageSearch ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_CollisionCoverageSearch,dataVal);
 	}
 	
 	public By DriveAwayCollision_TXT_Deductible =By.xpath("//*[contains(@id,'1deductible-textbox')]");
 	public WebElement getDriveAwayCollision_TXT_Deductible(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_Deductible ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_Deductible,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_DeductibleSearch =By.xpath("//*[contains(@id,'1deductible-textbox')]/../div");
 	public WebElement getDriveAwayCollision_TXT_DeductibleSearch(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_DeductibleSearch ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_DeductibleSearch,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_Mileage =By.xpath("//*[contains(@id,'1milage-textbox')]");
 	public WebElement getDriveAwayCollision_TXT_Mileage(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_Mileage ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_Mileage,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_MileageSearch =By.xpath("//*[contains(@id,'1milage-textbox')]/../div");
 	public WebElement getDriveAwayCollision_TXT_MileageSearch(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_MileageSearch ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_MileageSearch,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_PriceNewAtFacToDealer =By.xpath("//*[contains(@id,'1price_new_factory_dealer-textbox')]");
 	public WebElement getDriveAwayCollision_TXT_PriceNewAtFacToDealer(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_PriceNewAtFacToDealer ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_PriceNewAtFacToDealer,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_NoOfCars =By.xpath("//*[contains(@id,'1no_of_cars-textbox')]");
 	public WebElement getDriveAwayCollision_TXT_NoOfCars(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_NoOfCars ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_NoOfCars,dataVal);
 	}
 	                            
 	public By DriveAwayCollision_TXT_NoOfTrips =By.xpath("//*[contains(@id,'1no_of_trips-textbox')]");
 	public WebElement getDriveAwayCollision_TXT_NoOfTrips(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayCollision_TXT_NoOfTrips ,dataVal);
 	return se.element().getElement(DriveAwayCollision_TXT_NoOfTrips,dataVal);
 	}
 	
 	/*****************************************
 	 * End of Drive Away Collision Locators
 	 ******************************************/
 	/*****************************************
 	 * Start of Drive Other Car Locators
 	 ******************************************/
 	public By DriveOtherCar_BTN_Add =By.xpath("//*[contains(@id,'add-image')]");
 	public WebElement getDriveOtherCar_BTN_Add()
 	{
 	se.element().waitForElement(DriveOtherCar_BTN_Add);
 	return se.element().getElement(DriveOtherCar_BTN_Add);
 	}
 	
 	public By CA_DriveOtherCar_LabelName =By.xpath("//div[contains(@id,'drive_other_car_cov-label')]");
 	public WebElement getCA_DriveOtherCar_LabelName()
 	{
 	se.element().waitForElement(CA_DriveOtherCar_LabelName);
 	return se.element().getElement(CA_DriveOtherCar_LabelName);
 	}
 	                            
 	public By DriveOtherCar_BTN_Remove =By.xpath("//div[contains(@id,'delete-image')]");
 	public WebElement getDriveOtherCar_BTN_Remove()
 	{
 	se.element().waitForElement(DriveOtherCar_BTN_Remove);
 	return se.element().getElement(DriveOtherCar_BTN_Remove);
 	}
 	                            
 	public By DriveOtherCar_BTN_Copy =By.xpath("//div[contains(@id,'copybutton-image')]");
 	public WebElement getDriveOtherCar_BTN_Copy(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_BTN_Copy ,dataVal);
 	return se.element().getElement(DriveOtherCar_BTN_Copy,dataVal);
 	}
 	                            
 	public By DriveOtherCar_BTN_Details;
 	public WebElement getDriveOtherCar_BTN_Details(String dataVal)
 	{
 	DriveOtherCar_BTN_Details =By.xpath("//*[contains(@id,'"+dataVal+"drive_other_car_cov-image')]");
 	se.element().waitForElement(DriveOtherCar_BTN_Details ,dataVal);
 	return se.element().getElement(DriveOtherCar_BTN_Details,dataVal);
 	}
 	                            
 	public By DriveOtherCar_TXT_State =By.xpath("//*[contains(@id,'1state-textbox')]");
 	public WebElement getDriveOtherCar_TXT_State(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_State ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_State,dataVal);
 	}
 	                            
 	public By DriveOtherCar_TXT_StateSearch =By.xpath("//*[contains(@id,'1state-textbox')]/../div");
 	public WebElement getDriveOtherCar_TXT_StateSearch(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_StateSearch ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_StateSearch,dataVal);
 	}
 	                            
 	public By DriveOtherCar_TXT_Territory =By.xpath("//*[contains(@id,'1territory_code-textbox')]");
 	public WebElement getDriveOtherCar_TXT_Territory(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_Territory ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_Territory,dataVal);
 	}
 	                            
 	public By DriveOtherCar_TXT_TerritorySearch =By.xpath("//*[contains(@id,'1territory_code-textbox')]/../div");
 	public WebElement getDriveOtherCar_TXT_TerritorySearch(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_TerritorySearch ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_TerritorySearch,dataVal);
 	}
 	                            
 	public By DriveOtherCar_CHK_TitlePrefix =By.xpath("//*[contains(@class,'gwt-CheckBox v-checkbox')]/input");
 	public WebElement getDriveOtherCar_CHK_TitlePrefix(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_CHK_TitlePrefix ,dataVal);
 	return se.element().getElement(DriveOtherCar_CHK_TitlePrefix,dataVal);
 	}
 	                            
 	public By DriveOtherCar_TXT_TitlePrefix =By.xpath("//*[contains(@id,'1title_prefix-textbox')]");
 	public WebElement getDriveOtherCar_TXT_TitlePrefix(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_TitlePrefix ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_TitlePrefix,dataVal);
 	}
 	                            
 	public By DriveOtherCar_TXT_TitlePrefixSearch =By.xpath("//*[contains(@id,'1title_prefix-textbox')]/../div[2]");
 	public WebElement getDriveOtherCar_TXT_TitlePrefixSearch(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_TitlePrefixSearch ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_TitlePrefixSearch,dataVal);
 	}
 	                            
 	public By DriveOtherCar_TXT_FirstName_IncludeSpouse =By.xpath("//*[contains(@id,'1first_name-textbox')]");
 	public WebElement getDriveOtherCar_TXT_FirstName_IncludeSpouse(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_FirstName_IncludeSpouse ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_FirstName_IncludeSpouse,dataVal);
 	}
 	                            
 	public By DriveOtherCar_TXT_MiddleName =By.xpath("//*[contains(@id,'1middle_name-textbox')]");
 	public WebElement getDriveOtherCar_TXT_MiddleName(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_MiddleName ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_MiddleName,dataVal);
 	}
 	                            
 	public By DriveOtherCar_TXT_LastName =By.xpath("//*[contains(@id,'1last_name-textbox')]");
 	public WebElement getDriveOtherCar_TXT_LastName(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_LastName ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_LastName,dataVal);
 	}
 	                            
 	public By DriveOtherCar_TXT_NameSuffix =By.xpath("//*[contains(@id,'1name_suffix-textbox')]");
 	public WebElement getDriveOtherCar_TXT_NameSuffix(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_NameSuffix ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_NameSuffix,dataVal);
 	}
 	                            
 	public By DriveOtherCar_BTN_AddRow =By.xpath("//*[contains(@id,'add-image')]");
 	public WebElement getDriveOtherCar_BTN_AddRow(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_BTN_AddRow ,dataVal);
 	return se.element().getElement(DriveOtherCar_BTN_AddRow,dataVal);
 	}
 	                            
 	public By DriveOtherCar_BTN_RemoveRow =By.xpath("(//*[contains(@id,'delete-image')])[2]");
 	public WebElement getDriveOtherCar_BTN_RemoveRow(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_BTN_RemoveRow ,dataVal);
 	return se.element().getElement(DriveOtherCar_BTN_RemoveRow,dataVal);
 	}
 	                            
 	public By DriveOtherCar_BTN_CopyRow =By.xpath("//*[contains(@id,'copybutton-image')]");
 	public WebElement getDriveOtherCar_BTN_CopyRow(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_BTN_CopyRow ,dataVal);
 	return se.element().getElement(DriveOtherCar_BTN_CopyRow,dataVal);
 	}
 	                            
 	public By DriveOtherCar_CHK_Liability =By.xpath("//*[contains(text(),'Liability')]/../input");
 	public WebElement getDriveOtherCar_CHK_Liability(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_CHK_Liability ,dataVal);
 	return se.element().getElement(DriveOtherCar_CHK_Liability,dataVal);
 	}
 	
 	public By DriveOtherCar_TXT_Liability_CombinedSingleLimit =By.xpath("//input[contains(@id,'1combined_single_limit_disp-textbox')]");
 	public WebElement getDriveOtherCar_TXT_Liability_CombinedSingleLimit(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_Liability_CombinedSingleLimit ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_Liability_CombinedSingleLimit,dataVal);
 	}
 	
 	public By DriveOtherCar_TXT_Liability_Deductible =By.xpath("//input[contains(@id,'1deductible-textbox')]");
 	public WebElement getDriveOtherCar_TXT_Liability_Deductible(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_Liability_Deductible ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_Liability_Deductible,dataVal);
 	}
 	                            
 	public By DriveOtherCar_CHK_UnInsuredMotorist =By.xpath("//*[contains(text(),'Uninsured Motorist')]/../input");
 	public WebElement getDriveOtherCar_CHK_UnInsuredMotorist(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_CHK_UnInsuredMotorist ,dataVal);
 	return se.element().getElement(DriveOtherCar_CHK_UnInsuredMotorist,dataVal);
 	}
 	
 	public By DriveOtherCar_TXT_UnInsuredMotorist =By.xpath("(//input[contains(@id,'1combined_single_limit-textbox')])[1]");
 	public WebElement getDriveOtherCar_TXT_UnInsuredMotorist(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_UnInsuredMotorist ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_UnInsuredMotorist,dataVal);
 	}
 	
 	public By DriveOtherCar_TXT_UnderInsuredMotorist =By.xpath("(//input[contains(@id,'1combined_single_limit-textbox')])[2]");
 	public WebElement getDriveOtherCar_TXT_UnderInsuredMotorist(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_UnderInsuredMotorist ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_UnderInsuredMotorist,dataVal);
 	}
 	
 	public By DriveOtherCar_CHK_UnderInsuredMotorist =By.xpath("//*[contains(text(),'Underinsured Motorist')]/../input");
 	public WebElement getDriveOtherCar_CHK_UnderInsuredMotorist(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_CHK_UnderInsuredMotorist ,dataVal);
 	return se.element().getElement(DriveOtherCar_CHK_UnderInsuredMotorist,dataVal);
 	}
 	                            
 	public By DriveOtherCar_CHK_Comprehensive =By.xpath("//*[contains(text(),'Comprehensive')]/../input");
 	public WebElement getDriveOtherCar_CHK_Comprehensive(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_CHK_Comprehensive ,dataVal);
 	return se.element().getElement(DriveOtherCar_CHK_Comprehensive,dataVal);
 	}
 	                            
 	public By DriveOtherCar_TXT_ComprehensiveDeductible =By.xpath("(//*[contains(@id,'1deductible-textbox')])[2]");
 	public WebElement getDriveOtherCar_TXT_ComprehensiveDeductible(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_ComprehensiveDeductible ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_ComprehensiveDeductible,dataVal);
 	}
 	                            
 	public By DriveOtherCar_TXT_ComprehensiveDeductibleSearch =By.xpath("(//*[contains(@id,'1deductible-textbox')])[2]/../div");
 	public WebElement getDriveOtherCar_TXT_ComprehensiveDeductibleSearch(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_ComprehensiveDeductibleSearch ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_ComprehensiveDeductibleSearch,dataVal);
 	}
 	                            
 	public By DriveOtherCar_CHK_Collision =By.xpath("//*[contains(text(),'Collision')]/../input");
 	public WebElement getDriveOtherCar_CHK_Collision(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_CHK_Collision ,dataVal);
 	return se.element().getElement(DriveOtherCar_CHK_Collision,dataVal);
 	}
 	                            
 	public By DriveOtherCar_TXT_CollisionDeductible =By.xpath("(//*[contains(@id,'1deductible-textbox')])[3]");
 	public WebElement getDriveOtherCar_TXT_CollisionDeductible(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_CollisionDeductible ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_CollisionDeductible,dataVal);
 	}
 	                            
 	public By DriveOtherCar_TXT_CollisionDeductibleSearch =By.xpath("(//*[contains(@id,'1deductible-textbox')])[3]/../div");
 	public WebElement getDriveOtherCar_TXT_CollisionDeductibleSearch(String dataVal)
 	{
 	se.element().waitForElement(DriveOtherCar_TXT_CollisionDeductibleSearch ,dataVal);
 	return se.element().getElement(DriveOtherCar_TXT_CollisionDeductibleSearch,dataVal);
 	}
 	                            	
 	/*****************************************
 	 * End of Drive Other Car Locators
 	 ******************************************/
 	/*****************************************
 	 * Start of Limited Broadened Pollution Liability Locators
 	 ******************************************/
 	public By CA_LimitedBroadenedPollutionLiability_LabelName =By.xpath("//div[contains(@id,'limited_poll_liab_cov-label')]");
 	public WebElement getCA_LimitedBroadenedPollutionLiability_LabelName()
 	{
 	se.element().waitForElement(CA_LimitedBroadenedPollutionLiability_LabelName );
 	return se.element().getElement(CA_LimitedBroadenedPollutionLiability_LabelName);
 	}
 	
 	public By LimitedBroadenedPollutionLiability_TXT_EachAccidentLimit =By.xpath("//input[contains(@id,'1each_accident_limit-textbox')]");
 	public WebElement getLimitedBroadenedPollutionLiability_TXT_EachAccidentLimit(String dataVal)
 	{
 	se.element().waitForElement(LimitedBroadenedPollutionLiability_TXT_EachAccidentLimit ,dataVal);
 	return se.element().getElement(LimitedBroadenedPollutionLiability_TXT_EachAccidentLimit,dataVal);
 	}
 	                            
 	public By LimitedBroadenedPollutionLiability_TXT_EachAccidentLimitSearch =By.xpath("//input[contains(@id,'1each_accident_limit-textbox')]/../div[1]");
 	public WebElement getLimitedBroadenedPollutionLiability_TXT_EachAccidentLimitSearch(String dataVal)
 	{
 	se.element().waitForElement(LimitedBroadenedPollutionLiability_TXT_EachAccidentLimitSearch ,dataVal);
 	return se.element().getElement(LimitedBroadenedPollutionLiability_TXT_EachAccidentLimitSearch,dataVal);
 	}
 	                            
 	public By LimitedBroadenedPollutionLiability_TXT_AggregateLimit =By.xpath("//input[contains(@id,'1agg_limit-textbox')]");
 	public WebElement getLimitedBroadenedPollutionLiability_TXT_AggregateLimit(String dataVal)
 	{
 	se.element().waitForElement(LimitedBroadenedPollutionLiability_TXT_AggregateLimit ,dataVal);
 	return se.element().getElement(LimitedBroadenedPollutionLiability_TXT_AggregateLimit,dataVal);
 	}
 	
 	/*****************************************
 	 * End of Limited Broadened Pollution Locators
 	 ******************************************/
 	/*****************************************
 	 * Start of Auto Additional Insured WRAP Locators
 	 ******************************************/
 	public By CA_AutoAdditionalInsuredWRAP_LabelName =By.xpath("//div[contains(@id,'addl_ins_wrap_cov-label')]");
 	public WebElement getAutoAdditionalInsuredWRAP_LabelName()
 	{
 	se.element().waitForElement(CA_AutoAdditionalInsuredWRAP_LabelName );
 	return se.element().getElement(CA_AutoAdditionalInsuredWRAP_LabelName);
 	}
 	
 	/*****************************************
 	 * End of Auto Additional Insured WRAP Locators
 	 ******************************************/
 	
 	
	
	/*****************************************
	 * Start of CA_AdditionalInterest Locators
	 ******************************************/
	
 	public By AdditionalInterest_BTN_Label = By.xpath("//*[contains(@id,'lob_ca_addl_intrst-label')]");
	
	public WebElement getAdditionalInterest_BTN_Label()
	{
	se.element().waitForElement(AdditionalInterest_BTN_Label);
	return se.element().getElement(AdditionalInterest_BTN_Label);
	}
	
	public By AdditionalInterest_BTN_ADD =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getAdditionalInterest_BTN_ADD()
	{
	se.element().waitForElement(AdditionalInterest_BTN_ADD);
	return se.element().getElement(AdditionalInterest_BTN_ADD);
	}
	
	public By AdditionalInterest_BTN_Details;

	public WebElement getAdditionalInterest_BTN_Details(String dataVal) {
		AdditionalInterest_BTN_Details = By.xpath("//div[contains(@id,'"+dataVal+"lob_ca_addl_intrst-image')]");
		se.element().waitForElement(AdditionalInterest_BTN_Details);
		return se.element().getElement(AdditionalInterest_BTN_Details);
	}
	
	public By AdditionalInterest_BTN_Select;

	public WebElement getAdditionalInterest_BTN_Select(String dataVal) {
		AdditionalInterest_BTN_Select = By.xpath("(//*[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
		
		se.element().waitForElement(AdditionalInterest_BTN_Select);
		return se.element().getElement(AdditionalInterest_BTN_Select);
	}
	
	                            
	public By AdditionalInterest_BTN_Edit =By.id("a0664fe4-8748-351d-9143-b2b47579ec53-editbutton-image");
	public WebElement getAdditionalInterest_BTN_Edit(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_BTN_Edit ,dataVal);
	return se.element().getElement(AdditionalInterest_BTN_Edit,dataVal);
	}
	                            
	public By AdditionalInterest_BTN_Delete =By.id("a0664fe4-8748-351d-9143-b2b47579ec53-delete-image");
	public WebElement getAdditionalInterest_BTN_Delete()
	{
	se.element().waitForElement(AdditionalInterest_BTN_Delete);
	return se.element().getElement(AdditionalInterest_BTN_Delete);
	}
	                            
	public By AdditionalInterest_TXT_Name =By.id("field_key$a1a5e315-a234-3f69-b389-04db93c6e6eb$1interest_name-textbox");
	public WebElement getAdditionalInterest_TXT_Name(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_Name ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_Name,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_DesignatedInsured =By.xpath("//div[text()='Designated Insured']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_DesignatedInsured(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_DesignatedInsured ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_DesignatedInsured,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_NoticeOfCancellation =By.xpath("//div[text()='Notice Of Cancellation']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_NoticeOfCancellation(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_NoticeOfCancellation ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_NoticeOfCancellation,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_NoticeOfCancellationAndMaterialChanges =By.xpath("//div[text()='Notice Of Cancellation And Material Changes']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_NoticeOfCancellationAndMaterialChanges(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_NoticeOfCancellationAndMaterialChanges ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_NoticeOfCancellationAndMaterialChanges,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_AdditionalInsuredLessorOfLeasedEquipment =By.xpath("//div[text()='Additional Insured Lessor of Leased Equipment']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_AdditionalInsuredLessorOfLeasedEquipment(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_AdditionalInsuredLessorOfLeasedEquipment ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_AdditionalInsuredLessorOfLeasedEquipment,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_PrimaryAndNoncontributoryAmendmentOfConditions =By.xpath("//div[text()='Primary and Noncontributory Amendment of Conditions']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_PrimaryAndNoncontributoryAmendmentOfConditions(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_PrimaryAndNoncontributoryAmendmentOfConditions ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_PrimaryAndNoncontributoryAmendmentOfConditions,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_CoownerOfInsuredPremises =By.xpath("//div[text()='Co-Owner of Insured Premises']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_CoownerOfInsuredPremises(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_CoownerOfInsuredPremises ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_CoownerOfInsuredPremises,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_ControllingInterest =By.xpath("//div[text()='Controlling Interest']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_ControllingInterest(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_ControllingInterest ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_ControllingInterest,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_GrantorOfLicensesScheduled =By.xpath("//div[text()='Grantor of Licenses - Scheduled']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_GrantorOfLicensesScheduled(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_GrantorOfLicensesScheduled ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_GrantorOfLicensesScheduled,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_GrantorOfLicensesAutomatic =By.xpath("//div[text()='Grantor of Licenses - Automatic ']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_GrantorOfLicensesAutomatic(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_GrantorOfLicensesAutomatic ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_GrantorOfLicensesAutomatic,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_MotorCarrierNamedLesseeAsInsured =By.xpath("//div[text()='Motor Carriers - Named Lessee As Insured']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_MotorCarrierNamedLesseeAsInsured(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_MotorCarrierNamedLesseeAsInsured ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_MotorCarrierNamedLesseeAsInsured,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_LossPayeeAutoDealersPhysicalDamage =By.xpath("//div[text()='Loss Payee -  Auto Dealers Physical Damage']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_LossPayeeAutoDealersPhysicalDamage(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_LossPayeeAutoDealersPhysicalDamage ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_LossPayeeAutoDealersPhysicalDamage,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_EmployeeAsLessorNotAppInKansas =By.xpath("//div[text()='Employee as Lessor NOT APPLICABLE IN KANSAS']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_EmployeeAsLessorNotAppInKansas(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_EmployeeAsLessorNotAppInKansas ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_EmployeeAsLessorNotAppInKansas,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasVehicle =By.xpath("//div[text()='Vehicle']/ancestor::td[1]/preceding-sibling::td[1]//div[text()='Lessor-Additional Insured and Loss Payee NOT APPLICABLE IN KANSAS']/ancestor::td[1]/preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasVehicle(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasVehicle ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasVehicle,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasUnscheduledVehicles =By.xpath("//div[text()='Unscheduled Vehicles']/ancestor::td[1]/preceding-sibling::td[1]//div[text()='Lessor-Additional Insured and Loss Payee NOT APPLICABLE IN KANSAS']/ancestor::td[1]/preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasUnscheduledVehicles(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasUnscheduledVehicles ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_LessorAdditionalInsuredNotApplKansasUnscheduledVehicles,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchise =By.xpath("//div[text()='Additional Insured -Garages - Grantor of Franchise']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchise(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchise ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchise,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchiseKansas =By.xpath("//div[text()='Additional Insured -Garages - Grantor of Franchise - Kansas']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchiseKansas(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchiseKansas ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_AdditionalInsuredGaragesGrantorOfFranchiseKansas,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_ConcessionairesTradingUnderYourName =By.xpath("//div[text()='Concessionaires Trading Under Your Name']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_ConcessionairesTradingUnderYourName(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_ConcessionairesTradingUnderYourName ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_ConcessionairesTradingUnderYourName,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_MotorCarriersNamedInsuredAndNamedLessorsForLeasedAuto =By.xpath("//div[text()='Motor Carriers - Named Insured and Named Lessors for Leased Auto - Excess Coverage']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_MotorCarriersNamedInsuredAndNamedLessorsForLeasedAuto(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_MotorCarriersNamedInsuredAndNamedLessorsForLeasedAuto ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_MotorCarriersNamedInsuredAndNamedLessorsForLeasedAuto,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_LeasorLeasedEquipmentAutomatic =By.xpath("//div[text()='Lessor of Leased Equipment - Automatic']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_LeasorLeasedEquipmentAutomatic(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_LeasorLeasedEquipmentAutomatic ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_LeasorLeasedEquipmentAutomatic,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_WaiverOfTransferOfRightsOfRecovery =By.xpath("//div[text()='Waiver of Transfer of Rights of Recovery']/../../../../../../preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_WaiverOfTransferOfRightsOfRecovery(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_WaiverOfTransferOfRightsOfRecovery ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_WaiverOfTransferOfRightsOfRecovery,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_LossPayeeUnscheduledVehicles =By.xpath("//div[text()='Unscheduled Vehicles']/ancestor::td[1]/preceding-sibling::td[1]//div[text()='Loss Payee']/ancestor::td[1]/preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_LossPayeeUnscheduledVehicles(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_LossPayeeUnscheduledVehicles ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_LossPayeeUnscheduledVehicles,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_LossPayeeVehicle =By.xpath("//div[text()='Vehicle']/ancestor::td[1]/preceding-sibling::td[1]//div[text()='Loss Payee']/ancestor::td[1]/preceding-sibling::td[1]//input");
	public WebElement getAdditionalInterest_CHK_LossPayeeVehicle(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_LossPayeeVehicle ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_LossPayeeVehicle,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_DoNotApplyCityOrCountyTaxes =By.xpath("//span[contains(@id,'is_no_tax-checkbox')]/input");
	public WebElement getAdditionalInterest_CHK_DoNotApplyCityOrCountyTaxes(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_DoNotApplyCityOrCountyTaxes ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_DoNotApplyCityOrCountyTaxes,dataVal);
	}
	                            
	public By AdditionalInterest_CHK_AllCityName =By.xpath("//span[contains(@id,'c_municipality_name-checkbox')]/input");
	public WebElement getAdditionalInterest_CHK_AllCityName(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_CHK_AllCityName ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_AllCityName,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_KYCity =By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]");
	public WebElement getAdditionalInterest_TXT_KYCity(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_KYCity ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_KYCity,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_CityCode =By.xpath("//*[contains(@id,'1risk_city_code-textbox')]");
	public WebElement getAdditionalInterest_TXT_CityCode(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_CityCode ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_CityCode,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_County =By.xpath("//*[contains(@id,'1risk_county-textbox')]");
	public WebElement getAdditionalInterest_TXT_County(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_County ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_County,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_CountyCode =By.xpath("//*[contains(@id,'1risk_county_code-textbox')]");
	public WebElement getAdditionalInterest_TXT_CountyCode(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_CountyCode ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_CountyCode,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_Taxcode =By.xpath("//*[contains(@id,'1risk_tax_code-textbox')]");
	public WebElement getAdditionalInterest_TXT_Taxcode(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_Taxcode ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_Taxcode,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_Street =By.id("field_key$72a3028a-c5f3-3fa6-8c22-cf7e8545fa4d$1line_1-textbox");
	public WebElement getAdditionalInterest_TXT_Street(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_Street ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_Street,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_SteUnit =By.id("field_key$19848d56-5c05-3af4-920b-029460ead942$1line_2-textbox");
	public WebElement getAdditionalInterest_TXT_SteUnit(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_SteUnit ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_SteUnit,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_City =By.id("field_key$def09a5d-a481-384b-a7d3-e9d1d4a15a52$1city-textbox");
	public WebElement getAdditionalInterest_TXT_City(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_City ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_City,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_StateCode =By.xpath("//div[@id='field_key$03d62fcf-2c48-33ef-94f7-29041d2bd5c3$1state_code-listbox']/input");
	public WebElement getAdditionalInterest_TXT_StateCode(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_StateCode ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_StateCode,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_ZipCode =By.id("field_key$9abff7a9-8bfd-3d83-94d2-ae275035e445$1zip_code-textbox");
	public WebElement getAdditionalInterest_TXT_ZipCode(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_ZipCode ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_ZipCode,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_UnscheduledVehicleDescription =By.id("field_key$42aa88d0-d67c-3e99-a289-bef458513032$1description-textbox");
	public WebElement getAdditionalInterest_TXT_UnscheduledVehicleDescription(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_UnscheduledVehicleDescription ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_UnscheduledVehicleDescription,dataVal);
	}
	                            
	public By AdditionalInterest_BTN_Additional_Interest_Vehicle_Add =By.id("36ca28d5-809e-3898-bf2c-e4638a4df1ee-add-image");
	public WebElement getAdditionalInterest_BTN_Additional_Interest_Vehicle_Add(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_BTN_Additional_Interest_Vehicle_Add ,dataVal);
	return se.element().getElement(AdditionalInterest_BTN_Additional_Interest_Vehicle_Add,dataVal);
	}
	
	public By AdditionalInterest_CHK_AI_Vehicle_Remove;

	public WebElement getAdditionalInterest_CHK_AI_Vehicle_Remove(String dataVal) {
		AdditionalInterest_CHK_AI_Vehicle_Remove = By.xpath("(//*[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
		
		se.element().waitForElement(AdditionalInterest_CHK_AI_Vehicle_Remove);
		return se.element().getElement(AdditionalInterest_CHK_AI_Vehicle_Remove);
	}
	
	public By AdditionalInterest_BTN_Additional_Interest_Vehicle_Remove =By.id("36ca28d5-809e-3898-bf2c-e4638a4df1ee-delete-image");
	public WebElement getAdditionalInterest_BTN_Additional_Interest_Vehicle_Remove(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_BTN_Additional_Interest_Vehicle_Remove ,dataVal);
	return se.element().getElement(AdditionalInterest_BTN_Additional_Interest_Vehicle_Remove,dataVal);
	}
	
	/*                        
	public By AdditionalInterest_TXT_Vehicle_Number =By.id("field_key$8532880d-4c2c-3706-9c1a-727e5b5f2637$1vehicle_no-textbox");
	public WebElement getAdditionalInterest_TXT_Vehicle_Number(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_Vehicle_Number ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_Vehicle_Number,dataVal);
	}
	*/
	
	public By AdditionalInterest_TXT_Vehicle_Number;

	public WebElement getAdditionalInterest_TXT_Vehicle_Number(String dataVal,String AddVehicle)
	{
		AdditionalInterest_TXT_Vehicle_Number = By.xpath("//*[contains(@id,'"+AddVehicle+"vehicle_no-textbox')]");
		se.element().waitForElement(AdditionalInterest_TXT_Vehicle_Number,dataVal);
		return se.element().getElement(AdditionalInterest_TXT_Vehicle_Number,dataVal);
	}
	
	
	public By AdditionalInterest_TXT_Year;
	public WebElement getAdditionalInterest_TXT_Year(String dataVal,String AddVehicle)
	{
		AdditionalInterest_TXT_Year =By.xpath("//*[contains(@id,'"+AddVehicle+"year-textbox')]");
	se.element().waitForElement(AdditionalInterest_TXT_Year ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_Year,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_Make;
	public WebElement getAdditionalInterest_TXT_Make(String dataVal,String AddVehicle)
	{
		AdditionalInterest_TXT_Make =By.xpath("//*[contains(@id,'"+AddVehicle+"make-textbox')]");
	se.element().waitForElement(AdditionalInterest_TXT_Make ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_Make,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_Model;
	public WebElement getAdditionalInterest_TXT_Model(String dataVal,String AddVehicle)
	{
		AdditionalInterest_TXT_Model =By.xpath("//*[contains(@id,'"+AddVehicle+"model-textbox')]");
	se.element().waitForElement(AdditionalInterest_TXT_Model ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_Model,dataVal);
	}
		                            
	public By AdditionalInterest_CHK_Vehicle_Interest_Applicable;
	public WebElement getAdditionalInterest_CHK_Vehicle_Interest_Applicable(String dataVal)
	{
		AdditionalInterest_CHK_Vehicle_Interest_Applicable =By.xpath("//div[text() ='Vehicle Interest']/ancestor::tr[1]/following-sibling::tr[4]//span[contains(@id,'"+dataVal+"is_selected-checkbox')]/input");
	se.element().waitForElement(AdditionalInterest_CHK_Vehicle_Interest_Applicable ,dataVal);
	return se.element().getElement(AdditionalInterest_CHK_Vehicle_Interest_Applicable,dataVal);
	}
	                            
	
	public By AdditionalInterest_TXT_LoanNumber1 =By.id("field_key$828a65ca-bd5a-3002-ad46-408acd911304$1loan_number-textbox");
	public WebElement getAdditionalInterest_TXT_LoanNumber1(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_LoanNumber1 ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_LoanNumber1,dataVal);
	}
	
	public By AdditionalInterest_TXT_LoanNumber2 =By.id("field_key$828a65ca-bd5a-3002-ad46-408acd911304$2loan_number-textbox");
	public WebElement getAdditionalInterest_TXT_LoanNumber2(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_LoanNumber2 ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_LoanNumber2,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_DisplayForm ;
	public WebElement getAdditionalInterest_TXT_DisplayForm(String dataVal)
	{
	AdditionalInterest_TXT_DisplayForm =By.xpath("//input[contains(@id,'"+dataVal+"display_form-textbox')]");
	se.element().waitForElement(AdditionalInterest_TXT_DisplayForm ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_DisplayForm,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_InterestType;
	public WebElement getAdditionalInterest_TXT_InterestType(String dataVal)
	{
		AdditionalInterest_TXT_InterestType =By.xpath("//input[contains(@id,'"+dataVal+"interest_type-textbox')]");
	se.element().waitForElement(AdditionalInterest_TXT_InterestType ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_InterestType,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_EndorsementPremium;
	public WebElement getAdditionalInterest_TXT_EndorsementPremium(String dataVal)
	{
		AdditionalInterest_TXT_EndorsementPremium =By.xpath("//input[contains(@id,'"+dataVal+"endorsement_prem-textbox')]");
	se.element().waitForElement(AdditionalInterest_TXT_EndorsementPremium ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_EndorsementPremium,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_MinimumPremium;
	public WebElement getAdditionalInterest_TXT_MinimumPremium(String dataVal)
	{
		AdditionalInterest_TXT_MinimumPremium =By.xpath("//input[contains(@id,'"+dataVal+"minimum_premium-textbox')]");
	se.element().waitForElement(AdditionalInterest_TXT_MinimumPremium ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_MinimumPremium,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_MaximumPremium;
	public WebElement getAdditionalInterest_TXT_MaximumPremium(String dataVal)
	{
		AdditionalInterest_TXT_MaximumPremium =By.xpath("//input[contains(@id,'"+dataVal+"maximum_premium-textbox')]");
	se.element().waitForElement(AdditionalInterest_TXT_MaximumPremium ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_MaximumPremium,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_OverrideEndorsementPremium;
	public WebElement getAdditionalInterest_TXT_OverrideEndorsementPremium(String dataVal)
	{
		AdditionalInterest_TXT_OverrideEndorsementPremium =By.xpath("//input[contains(@id,'"+dataVal+"override_endorse_prem-textbox')]");
	se.element().waitForElement(AdditionalInterest_TXT_OverrideEndorsementPremium ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_OverrideEndorsementPremium,dataVal);
	}
	                            
	/*
	 * public By AdditionalInterest_TXT_OverrideReason; public WebElement
	 * getAdditionalInterest_TXT_OverrideReason(String dataVal) {
	 * AdditionalInterest_TXT_OverrideReason
	 * =By.xpath("//textarea[contains(@id,'"+dataVal+"override_reason-textarea')]");
	 * se.element().waitForElement(AdditionalInterest_TXT_OverrideReason ,dataVal);
	 * return
	 * se.element().getElement(AdditionalInterest_TXT_OverrideReason,dataVal); }
	 */
	public By AdditionalInterest_TXT_OverrideReason1 =By.id("field_key$aec61d26-6761-3a74-bdcd-c17e9407a7be$1override_reason-textarea");
	public WebElement getAdditionalInterest_TXT_OverrideReason1(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_OverrideReason1 ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_OverrideReason1,dataVal);
	}
	
	public By AdditionalInterest_TXT_OverrideReason2 =By.id("field_key$aec61d26-6761-3a74-bdcd-c17e9407a7be$2override_reason-textarea");
	public WebElement getAdditionalInterest_TXT_OverrideReason2(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_OverrideReason2 ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_OverrideReason2,dataVal);
	}
	
	public By AdditionalInterest_TXT_OverrideReason3 =By.id("field_key$aec61d26-6761-3a74-bdcd-c17e9407a7be$3override_reason-textarea");
	public WebElement getAdditionalInterest_TXT_OverrideReason3(String dataVal)
	{
	se.element().waitForElement(AdditionalInterest_TXT_OverrideReason3 ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_OverrideReason3,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_PrimaryNonContribPercentage;
	public WebElement getAdditionalInterest_TXT_PrimaryNonContribPercentage(String dataVal)
	{
		AdditionalInterest_TXT_PrimaryNonContribPercentage =By.xpath("//input[contains(@id,'"+dataVal+"primary_nc_percentage-textbox')]");
	se.element().waitForElement(AdditionalInterest_TXT_PrimaryNonContribPercentage ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_PrimaryNonContribPercentage,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_PNCPercentOverride;
	public WebElement getAdditionalInterest_TXT_PNCPercentOverride(String dataVal)
	{
		AdditionalInterest_TXT_PNCPercentOverride =By.xpath("//input[contains(@id,'"+dataVal+"c_pnc_per_override-textbox')]");
	se.element().waitForElement(AdditionalInterest_TXT_PNCPercentOverride ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_PNCPercentOverride,dataVal);
	}
	                            
	public By AdditionalInterest_TXT_OverridePremiumReason;
	public WebElement getAdditionalInterest_TXT_OverridePremiumReason(String dataVal)
	{
		AdditionalInterest_TXT_OverridePremiumReason =By.xpath("//input[contains(@id,'"+dataVal+"c_pnc_override_reason-textarea')]");
	se.element().waitForElement(AdditionalInterest_TXT_OverridePremiumReason ,dataVal);
	return se.element().getElement(AdditionalInterest_TXT_OverridePremiumReason,dataVal);
	}
	                            

	/*****************************************
	 * End of CA_AdditionalInterest Locators
	 ******************************************/


 	/*****************************************
 	 * Start of Pickup Or DealerExclusions Locators
 	 ******************************************/
	public By DealerExclusions_BTN_Details;
 	public WebElement getDealerExclusions_BTN_Details(String dataVal)
 	{
 		DealerExclusions_BTN_Details =By.xpath("//div[contains(@id,'"+dataVal+"opt_prv_at_dlr_exln_cov-image')]");
 		se.element().waitForElement(DealerExclusions_BTN_Details ,dataVal);
 		return se.element().getElement(DealerExclusions_BTN_Details,dataVal);
 	}
 	 	                            
 	public By DealerExclusions_BTN_Add =By.xpath("//div[@id='2c75f573-e347-31c5-9dca-f49c02f206ab-add-image']");
 	public WebElement getDealerExclusions_BTN_Add()
 	{
 	se.element().waitForElement(DealerExclusions_BTN_Add);
 	return se.element().getElement(DealerExclusions_BTN_Add);
 	}
 	                            
 	public By DealerExclusions_BTN_Edit =By.xpath("//div[contains(@id,'editbutton-image')]");
 	public WebElement getDealerExclusions_BTN_Edit(String dataVal)
 	{
 	se.element().waitForElement(DealerExclusions_BTN_Edit ,dataVal);
 	return se.element().getElement(DealerExclusions_BTN_Edit,dataVal);
 	}
 	                            
 	public By DealerExclusions_BTN_Copy =By.xpath("//div[contains(@id,'copybutton-image')]");
 	public WebElement getDealerExclusions_BTN_Copy(String dataVal)
 	{
 	se.element().waitForElement(DealerExclusions_BTN_Copy ,dataVal);
 	return se.element().getElement(DealerExclusions_BTN_Copy,dataVal);
 	}
 	                            
 	public By DealerExclusions_BTN_Remove =By.xpath("//div[contains(@id,'delete-image')]");
 	public WebElement getDealerExclusions_BTN_Remove(String dataVal)
 	{
 	se.element().waitForElement(DealerExclusions_BTN_Remove ,dataVal);
 	return se.element().getElement(DealerExclusions_BTN_Remove,dataVal);
 	}
 	                            
 	public By DealerExclusions_BTN_Done =By.xpath("//div[contains(@id,'continue-image')]");
 	public WebElement getDealerExclusions_BTN_Done(String dataVal)
 	{
 	se.element().waitForElement(DealerExclusions_BTN_Done ,dataVal);
 	return se.element().getElement(DealerExclusions_BTN_Done,dataVal);
 	}
 	                            
 	public By DealerExclusions_TXT_ProvisionsName =By.xpath("//input[contains(@id,'1provision_name-textbox')]");
 	public WebElement getDealerExclusions_TXT_ProvisionsName(String dataVal)
 	{
 	se.element().waitForElement(DealerExclusions_TXT_ProvisionsName ,dataVal);
 	return se.element().getElement(DealerExclusions_TXT_ProvisionsName,dataVal);
 	}
 	                            
 	public By DealerExclusions_TXT_ProvisionsNameSearch =By.xpath("//input[contains(@id,'1provision_name-textbox')]/../div");
 	public WebElement getDealerExclusions_TXT_ProvisionsNameSearch(String dataVal)
 	{
 	se.element().waitForElement(DealerExclusions_TXT_ProvisionsNameSearch ,dataVal);
 	return se.element().getElement(DealerExclusions_TXT_ProvisionsNameSearch,dataVal);
 	}
 	                            
 	public By DealerExclusions_TXT_CoveragePart =By.xpath("//input[contains(@id,'1coverage_part-textbox')]");
 	public WebElement getDealerExclusions_TXT_CoveragePart(String dataVal)
 	{
 	se.element().waitForElement(DealerExclusions_TXT_CoveragePart ,dataVal);
 	return se.element().getElement(DealerExclusions_TXT_CoveragePart,dataVal);
 	}
 	                            
 	public By DealerExclusions_TXT_Form =By.xpath("//input[contains(@id,'1form-textbox')]");
 	public WebElement getDealerExclusions_TXT_Form(String dataVal)
 	{
 	se.element().waitForElement(DealerExclusions_TXT_Form ,dataVal);
 	return se.element().getElement(DealerExclusions_TXT_Form,dataVal);
 	}
 	                            
 	public By DealerExclusions_TXT_DesignatedProductOrProducts =By.xpath("//input[contains(@id,'1desigwrkyouperform-textbox')]");
 	public WebElement getDealerExclusions_TXT_DesignatedProductOrProducts(String dataVal)
 	{
 	se.element().waitForElement(DealerExclusions_TXT_DesignatedProductOrProducts ,dataVal);
 	return se.element().getElement(DealerExclusions_TXT_DesignatedProductOrProducts,dataVal);
 	}
 	
 	public By CA_DealerExclusions_LabelName =By.xpath("//div[contains(@id,'opt_prv_at_dlr_exln_cov-label')]");
 	public WebElement getCA_DealerExclusions_LabelName()
 	{
 	se.element().waitForElement(CA_DealerExclusions_LabelName );
 	return se.element().getElement(CA_DealerExclusions_LabelName);
 	}
 	
 	/*****************************************
 	 * End of Pickup Or DealerExclusions Locators
 	 ******************************************/
 	 /*****************************************
 	 * Start of Pickup Or Delivery Coverage Locators
 	 ******************************************/
 	public By PickUpOrDeliveryInfo_TXT_Range =By.xpath("//input[contains(@id,'1range-textbox')]");
 	public WebElement getPickUpOrDeliveryInfo_TXT_Range(String dataVal)
 	{
 	se.element().waitForElement(PickUpOrDeliveryInfo_TXT_Range ,dataVal);
 	return se.element().getElement(PickUpOrDeliveryInfo_TXT_Range,dataVal);
 	}
 	                            
 	public By PickUpOrDeliveryInfo_TXT_NumberOfDrivers =By.xpath("//input[contains(@id,'1number_of_drivers-textbox')]");
 	public WebElement getPickUpOrDeliveryInfo_TXT_NumberOfDrivers(String dataVal)
 	{
 	se.element().waitForElement(PickUpOrDeliveryInfo_TXT_NumberOfDrivers ,dataVal);
 	return se.element().getElement(PickUpOrDeliveryInfo_TXT_NumberOfDrivers,dataVal);
 	}
 	                            
 	public By PickUpOrDeliveryInfo_TXT_NumberOTrips =By.xpath("//input[contains(@id,'1number_of_trips-textbox')]");
 	public WebElement getPickUpOrDeliveryInfo_TXT_NumberOTrips(String dataVal)
 	{
 	se.element().waitForElement(PickUpOrDeliveryInfo_TXT_NumberOTrips ,dataVal);
 	return se.element().getElement(PickUpOrDeliveryInfo_TXT_NumberOTrips,dataVal);
 	}
 	                            
 	public By PickUpOrDeliveryInfo_TXT_Range1 =By.xpath("//input[contains(@id,'2range-textbox')]");
 	public WebElement getPickUpOrDeliveryInfo_TXT_Range1(String dataVal)
 	{
 	se.element().waitForElement(PickUpOrDeliveryInfo_TXT_Range1 ,dataVal);
 	return se.element().getElement(PickUpOrDeliveryInfo_TXT_Range1,dataVal);
 	}
 	                            
 	public By PickUpOrDeliveryInfo_TXT_NumberOfDrivers1 =By.xpath("//input[contains(@id,'2number_of_drivers-textbox')]");
 	public WebElement getPickUpOrDeliveryInfo_TXT_NumberOfDrivers1(String dataVal)
 	{
 	se.element().waitForElement(PickUpOrDeliveryInfo_TXT_NumberOfDrivers1 ,dataVal);
 	return se.element().getElement(PickUpOrDeliveryInfo_TXT_NumberOfDrivers1,dataVal);
 	}
 	                            
 	public By PickUpOrDeliveryInfo_TXT_NumberOTrips_1 =By.xpath("//input[contains(@id,'2number_of_trips-textbox')]");
 	public WebElement getPickUpOrDeliveryInfo_TXT_NumberOTrips_1(String dataVal)
 	{
 	se.element().waitForElement(PickUpOrDeliveryInfo_TXT_NumberOTrips_1 ,dataVal);
 	return se.element().getElement(PickUpOrDeliveryInfo_TXT_NumberOTrips_1,dataVal);
 	}
 	
 	public By CA_PickupOrDeliveryCoverage_LabelName =By.xpath("//div[contains(@id,'pickup_delivery_cov')]");
 	public WebElement getCA_PickupOrDeliveryCoverage_LabelName()
 	{
 	se.element().waitForElement(CA_PickupOrDeliveryCoverage_LabelName);
 	return se.element().getElement(CA_PickupOrDeliveryCoverage_LabelName);
 	}
 	
	
 	/*****************************************
 	 * End of Pickup Or Delivery Coverage Locators
 	 ******************************************/
 	/*****************************************
 	 * Start of Vehicles Page Locators
 	 ******************************************/
 	public By Vehicles_LBL_Vehicle =By.xpath("//*[contains(@id,'lob_ca_vehicles-label')]");
 	public WebElement getVehicles_LBL_Vehicle()
 	{
 	se.element().waitForElement(Vehicles_LBL_Vehicle );
 	return se.element().getElement(Vehicles_LBL_Vehicle);
 	}
 	public By Vehicles_CHK_Vehicle_Select;
 	public WebElement getVehicles_CHK_Vehicle_Select(String dataVal)
 	{
 		Vehicles_CHK_Vehicle_Select=By.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-5620dc27-9642-3940-a546-8a7d55f1e202']/div[3]/div[1]/table/tbody/tr["+dataVal+"]/td[2]/div/div/span/input");
 	se.element().waitForElement(Vehicles_CHK_Vehicle_Select ,dataVal);
 	return se.element().getElement(Vehicles_CHK_Vehicle_Select,dataVal);
 	}
 	                            
 	public By Vehicles_BTN_VehicleAdd =By.xpath("//*[@id='5620dc27-9642-3940-a546-8a7d55f1e202-add-image']");
 	public WebElement getVehicles_BTN_VehicleAdd()
 	{
 	se.element().waitForElement(Vehicles_BTN_VehicleAdd );
 	return se.element().getElement(Vehicles_BTN_VehicleAdd);
 	}
 	                            
 	public By Vehicles_BTN_CopyVehicle =By.xpath("//*[@id='null-PopupButton']");
 	public WebElement getVehicles_BTN_CopyVehicle(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_BTN_CopyVehicle ,dataVal);
 	return se.element().getElement(Vehicles_BTN_CopyVehicle,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_CopyInput =By.id("5620dc27-9642-3940-a546-8a7d55f1e202-addmultiple-textbox");
 	public WebElement getVehicles_TXT_CopyInput(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_CopyInput ,dataVal);
 	return se.element().getElement(Vehicles_TXT_CopyInput,dataVal);
 	}
 	                            
 	public By Vehicles_BTN_CopyGo =By.xpath("//*[contains(@id,'addmultiple-button-button-go')]");
 	public WebElement getVehicles_BTN_CopyGo()
 	{
 	se.element().waitForElement(Vehicles_BTN_CopyGo);
 	return se.element().getElement(Vehicles_BTN_CopyGo);
 	}
 	                            
 	public By Vehicles_BTN_Delete_Vehicle =By.id("5620dc27-9642-3940-a546-8a7d55f1e202-delete-image");
 	public WebElement getVehicles_BTN_Delete_Vehicle(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_BTN_Delete_Vehicle ,dataVal);
 	return se.element().getElement(Vehicles_BTN_Delete_Vehicle,dataVal);
 	}
 	                            
 	public By Vehicles_BTN_Vehicle_Detail;
 	public WebElement getVehicles_BTN_Vehicle_Detail(String dataVal)
 	{
 		Vehicles_BTN_Vehicle_Detail =By.xpath("//*[contains(@id,'$"+dataVal+"lob_ca_vehicles-image')]");
 	se.element().waitForElement(Vehicles_BTN_Vehicle_Detail ,dataVal);
 	return se.element().getElement(Vehicles_BTN_Vehicle_Detail,dataVal);
 	}
 	                            
 	/*public By Vehicles_BTN_Vehicle_Done =By.zz("");
 	public WebElement getVehicles_BTN_Vehicle_Done(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_BTN_Vehicle_Done ,dataVal);
 	return se.element().getElement(Vehicles_BTN_Vehicle_Done,dataVal);
 	}*/
 	                            
 	public By Vehicles_TXT_Vehicle_No =By.id("field_key$426e761b-8cab-354e-8553-af0beaa7f195$1vehicle_no-textbox");
 	public WebElement getVehicles_TXT_Vehicle_No(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_Vehicle_No ,dataVal);
 	return se.element().getElement(Vehicles_TXT_Vehicle_No,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_ManuallyEnterRatingClass =By.xpath("//*[@id='field_key$0e52f804-c5fe-3dc0-8307-f91a53450925$1is_manual_rating_class-checkbox']/input");
 	public WebElement getVehicles_CHK_ManuallyEnterRatingClass(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_ManuallyEnterRatingClass ,dataVal);
 	return se.element().getElement(Vehicles_CHK_ManuallyEnterRatingClass,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_SuspensionCoverage =By.xpath("(//*[contains(@id,'suspension_permitted-checkbox')]/input)[1]");
 	public WebElement getVehicles_CHK_SuspensionCoverage(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_SuspensionCoverage ,dataVal);
 	return se.element().getElement(Vehicles_CHK_SuspensionCoverage,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_VehicleType =By.id("field_key$78be0829-f5b1-3234-9382-72ae8b31d32b$1vehicle_type-textbox");
 	public WebElement getVehicles_TXT_VehicleType(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_VehicleType ,dataVal);
 	return se.element().getElement(Vehicles_TXT_VehicleType,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_VehicleTypeSearch =By.xpath("//*[@id='field_key$78be0829-f5b1-3234-9382-72ae8b31d32b$1vehicle_type-textbox']/../div");
 	public WebElement getVehicles_TXT_VehicleTypeSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_VehicleTypeSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_VehicleTypeSearch,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_VehicleSize =By.id("field_key$a5c2f749-db49-3801-aeba-078409b7052b$1vehicle_size-textbox");
 	public WebElement getVehicles_TXT_VehicleSize(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_VehicleSize ,dataVal);
 	return se.element().getElement(Vehicles_TXT_VehicleSize,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_VehicleSizeSearch =By.xpath("//*[@id='field_key$a5c2f749-db49-3801-aeba-078409b7052b$1vehicle_size-textbox']/../div");
 	public WebElement getVehicles_TXT_VehicleSizeSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_VehicleSizeSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_VehicleSizeSearch,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_VINUnknown =By.xpath("//span[@id='field_key$5cc5dcd8-7901-329f-9b06-eb943521976c$1vin_unknown-checkbox']/input");
 	public WebElement getVehicles_CHK_VINUnknown(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_VINUnknown ,dataVal);
 	return se.element().getElement(Vehicles_CHK_VINUnknown,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_VIN =By.id("field_key$3a0306fc-52ca-3331-92e0-247e91a0057c$1vin-textbox");
 	public WebElement getVehicles_TXT_VIN(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_VIN ,dataVal);
 	return se.element().getElement(Vehicles_TXT_VIN,dataVal);
 	}
 	public By Vehicles_LNK_VINPopup =By.id("field_key$3a0306fc-52ca-3331-92e0-247e91a0057c$1vin-textbox");
 	public WebElement getVehicles_LNK_VINPopup(String originalCostNew,String Year)
 	{
 		Vehicles_LNK_VINPopup =By.xpath("//*[text()='"+originalCostNew+"']//ancestor::tr[1]//*[text()='"+Year+"']/../..");
 	se.element().waitForElement(Vehicles_LNK_VINPopup ,Year);
 	return se.element().getElement(Vehicles_LNK_VINPopup,Year);
 	}
 	                        
 	public By Vehicles_LBL_VINStatus =By.xpath("//*[@id='field_key$ab4ace2f-d4a6-3951-8f96-230f7e0ceef3$1c_vin_status_str-label']");
 	public WebElement getVehicles_LBL_VINStatus(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_LBL_VINStatus ,dataVal);
 	return se.element().getElement(Vehicles_LBL_VINStatus,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_Year =By.id("field_key$b9aa767c-feb4-3bed-9c85-7ec606b96ad3$1year-textbox");
 	public WebElement getVehicles_TXT_Year(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_Year ,dataVal);
 	return se.element().getElement(Vehicles_TXT_Year,dataVal);
 	}
 	
 	public By Vehicles_LBL_Make =By.xpath("//div[contains(text(),'Choose Make')]");
 	public WebElement getVehicles_LBL_Make()
 	{
 	se.element().waitForElement(Vehicles_LBL_Make);
 	return se.element().getElement(Vehicles_LBL_Make);
 	}
 	   
 	public By Vehicles_LNK_Make;
 	public WebElement getVehicles_LNK_Make(String dataVal)
 	{
 		Vehicles_LNK_Make =By.xpath("//span[text()='"+dataVal+"']");
 	se.element().waitForElement(Vehicles_LNK_Make ,dataVal);
 	return se.element().getElement(Vehicles_LNK_Make,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_Make =By.id("field_key$1752ae9d-79cb-304e-8b7b-655d99aa9205$1make-textbox");
 	public WebElement getVehicles_TXT_Make(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_Make ,dataVal);
 	return se.element().getElement(Vehicles_TXT_Make,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_MakeSearch =By.xpath("//*[@id='field_key$1752ae9d-79cb-304e-8b7b-655d99aa9205$1make-textbox']/../div");
 	public WebElement getVehicles_TXT_MakeSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_MakeSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_MakeSearch,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_Model =By.id("field_key$6becfa29-11ee-39ba-867a-96605acf8b6f$1model-textbox");
 	public WebElement getVehicles_TXT_Model(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_Model ,dataVal);
 	return se.element().getElement(Vehicles_TXT_Model,dataVal);
 	}
 	
 	public By Vehicles_LBL_Model =By.xpath("//div[contains(text(),'Choose Model')]");
 	public WebElement getVehicles_LBL_Model()
 	{
 	se.element().waitForElement(Vehicles_LBL_Model);
 	return se.element().getElement(Vehicles_LBL_Model);
 	}
 	   
 	public By Vehicles_LNK_Model;
 	public WebElement getVehicles_LNK_Model(String dataVal)
 	{
 		Vehicles_LNK_Model =By.xpath("//*[(text() = '"+dataVal+"')]");
 	se.element().waitForElement(Vehicles_LNK_Model ,dataVal);
 	return se.element().getElement(Vehicles_LNK_Model,dataVal);
 	}
 	
 	public By Vehicles_TXT_State =By.id("field_key$6bcf503d-5bd5-3884-9817-259ff2185ea9$1state_desc-textbox");
 	public WebElement getVehicles_TXT_State(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_State ,dataVal);
 	return se.element().getElement(Vehicles_TXT_State,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_Zipcode =By.id("field_key$08c50b17-3f56-3f39-af5c-7a6418356180$1zip_code-textbox");
 	public WebElement getVehicles_TXT_Zipcode(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_Zipcode ,dataVal);
 	return se.element().getElement(Vehicles_TXT_Zipcode,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_TerritoryCode =By.id("field_key$6d629ecd-31f0-39d6-a7e8-60a047b733c3$1territory_code-textbox");
 	public WebElement getVehicles_TXT_TerritoryCode(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_TerritoryCode ,dataVal);
 	return se.element().getElement(Vehicles_TXT_TerritoryCode,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_TerritoryDescription =By.id("field_key$ff8d27c4-d202-32c8-bd1c-a2f9983650eb$1territory-textbox");
 	public WebElement getVehicles_TXT_TerritoryDescription(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_TerritoryDescription ,dataVal);
 	return se.element().getElement(Vehicles_TXT_TerritoryDescription,dataVal);
 	}
 	                            
 	public By Vehicles_DDN_StateOfRegistration =By.xpath("//div[@id='field_key$5f303593-773e-3262-85ce-602d075cf38a$1registration_state-listbox']/input");
 	public WebElement getVehicles_DDN_StateOfRegistration(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_DDN_StateOfRegistration ,dataVal);
 	return se.element().getElement(Vehicles_DDN_StateOfRegistration,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_VehicleSpecialType =By.id("field_key$04faec8c-a8b5-374e-9e98-9e65c9a4dcc7$1vehicle_special_type-textbox");
 	public WebElement getVehicles_TXT_VehicleSpecialType(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_VehicleSpecialType ,dataVal);
 	return se.element().getElement(Vehicles_TXT_VehicleSpecialType,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_VehicleSpecialTypeSearch =By.xpath("//*[@id='field_key$04faec8c-a8b5-374e-9e98-9e65c9a4dcc7$1vehicle_special_type-textbox']/../div");
 	public WebElement getVehicles_TXT_VehicleSpecialTypeSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_VehicleSpecialTypeSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_VehicleSpecialTypeSearch,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_VehicleEngineSize =By.xpath("//*[@id='field_key$17ed64c9-cacc-3880-bcd5-2b1e448c02b5$1engine_size-textbox']");
 	public WebElement getVehicles_TXT_VehicleEngineSize(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_VehicleEngineSize ,dataVal);
 	return se.element().getElement(Vehicles_TXT_VehicleEngineSize,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_TypeOfMobileHome =By.xpath("//*[@id='field_key$0a0adf39-3f89-3532-9e47-2fb09d776501$1type_of_mobile_home-textbox']");
 	public WebElement getVehicles_TXT_TypeOfMobileHome(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_TypeOfMobileHome ,dataVal);
 	return se.element().getElement(Vehicles_TXT_TypeOfMobileHome,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_KYCity =By.id("field_key$50725c50-aee8-3878-87c3-be9f0fea2e27$1risk_municipality_name-textbox");
 	public WebElement getVehicles_TXT_KYCity(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_KYCity ,dataVal);
 	return se.element().getElement(Vehicles_TXT_KYCity,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_KYCounty =By.id("field_key$510cba94-717b-35ef-b040-e62c6c6fabda$1risk_county-textbox");
 	public WebElement getVehicles_TXT_KYCounty(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_KYCounty ,dataVal);
 	return se.element().getElement(Vehicles_TXT_KYCounty,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_ISThisVehRatedWithOCP =By.xpath("//*[@id='field_key$5c28f1d1-c540-3d56-bee9-08a1a7c48b07$1ocp_veh_check-checkbox']//input");
 	public WebElement getVehicles_CHK_ISThisVehRatedWithOCP(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_ISThisVehRatedWithOCP,dataVal);
 	return se.element().getElement(Vehicles_CHK_ISThisVehRatedWithOCP,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_ThisAutoIsOperatedOnAHighwayOnlyForThePuposeOfCrossing =By.xpath("//*[@id='field_key$fc423da6-242c-3e86-8d0e-44b72d5c8bb6$1incidental_hw_use-checkbox']/input");
 	public WebElement getVehicles_CHK_ThisAutoIsOperatedOnAHighwayOnlyForThePuposeOfCrossing(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_ThisAutoIsOperatedOnAHighwayOnlyForThePuposeOfCrossing ,dataVal);
 	return se.element().getElement(Vehicles_CHK_ThisAutoIsOperatedOnAHighwayOnlyForThePuposeOfCrossing,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_Yes =By.xpath("(//div[text()='Yes']/../../preceding-sibling::div[1]//input)[1]");
 	public WebElement getVehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_Yes(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_Yes ,dataVal);
 	return se.element().getElement(Vehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_Yes,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_No =By.xpath("(//div[text()='No']/../../preceding-sibling::div[1]//input)[1]");
 	public WebElement getVehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_No(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_No ,dataVal);
 	return se.element().getElement(Vehicles_CHK_AddToEndorsementCA0437ColoradoIndividuallyOwnedMotorVehicles_No,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_Name_oO_IndividualOwner =By.xpath("//*[@id='field_key$6a4112a1-eb44-39a8-a9ac-72e710775431$1indv_owner_name-textbox']");
 	public WebElement getVehicles_TXT_Name_oO_IndividualOwner(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_Name_oO_IndividualOwner ,dataVal);
 	return se.element().getElement(Vehicles_TXT_Name_oO_IndividualOwner,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_AutoFurnishedForRegularUseOtherThanClassIOrClassIIOperators =By.xpath("//*[@id='field_key$6796fa20-a2b1-3fa6-9576-923b58d380e4$1auto_furnished-checkbox']/input");
 	public WebElement getVehicles_CHK_AutoFurnishedForRegularUseOtherThanClassIOrClassIIOperators(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_AutoFurnishedForRegularUseOtherThanClassIOrClassIIOperators ,dataVal);
 	return se.element().getElement(Vehicles_CHK_AutoFurnishedForRegularUseOtherThanClassIOrClassIIOperators,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_usedinridesharingarr_Yes =By.xpath("(//span[@class='v-radiobutton'])[1]/input");
 	public WebElement getVehicles_CHK_usedinridesharingarr_Yes(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_usedinridesharingarr_Yes ,dataVal);
 	return se.element().getElement(Vehicles_CHK_usedinridesharingarr_Yes,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_usedinridesharingarr_No =By.xpath("(//span[@class='v-radiobutton'])[2]/input");
 	public WebElement getVehicles_CHK_usedinridesharingarr_No(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_usedinridesharingarr_No ,dataVal);
 	return se.element().getElement(Vehicles_CHK_usedinridesharingarr_No,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_LeasingOrRentalConcern =By.xpath("//*[@id='field_key$3cb8ccb8-06b2-3dcb-81c6-30d2c91b35d6$1lease_rent_concern-checkbox']/input");
 	public WebElement getVehicles_CHK_LeasingOrRentalConcern(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_LeasingOrRentalConcern ,dataVal);
 	return se.element().getElement(Vehicles_CHK_LeasingOrRentalConcern,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_LeaseRentalBasis_LongTerm =By.xpath("//*[text()='Lease/Rental Basis']/../../following-sibling::td//*[text()='Long Term']/../../preceding-sibling::div[1]//input[1]");
 	public WebElement getVehicles_CHK_LeaseRentalBasis_LongTerm(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_LeaseRentalBasis_LongTerm ,dataVal);
 	return se.element().getElement(Vehicles_CHK_LeaseRentalBasis_LongTerm,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_LeaseRentalBasis_ShortTerm =By.xpath("//*[text()='Lease/Rental Basis']/../../following-sibling::td//*[text()='Short Term']/../../preceding-sibling::div[1]//input[1]");
 	public WebElement getVehicles_CHK_LeaseRentalBasis_ShortTerm(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_LeaseRentalBasis_ShortTerm ,dataVal);
 	return se.element().getElement(Vehicles_CHK_LeaseRentalBasis_ShortTerm,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_InsuredLessorHasAgreedInWritingToProvidePrimaryCoverage =By.xpath("//html/body//span[@id='field_key$f4f7d1d3-a6e6-35c6-9f83-947616956a1a$1ins_lessor-checkbox']/input");
 	public WebElement getVehicles_CHK_InsuredLessorHasAgreedInWritingToProvidePrimaryCoverage(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_InsuredLessorHasAgreedInWritingToProvidePrimaryCoverage ,dataVal);
 	return se.element().getElement(Vehicles_CHK_InsuredLessorHasAgreedInWritingToProvidePrimaryCoverage,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_SeasonalUse =By.xpath("//html/body//span[@id='field_key$e58e17fd-fc27-3f37-912b-15ec9969b561$1seasonal_use-checkbox']/input");
 	public WebElement getVehicles_CHK_SeasonalUse(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_SeasonalUse ,dataVal);
 	return se.element().getElement(Vehicles_CHK_SeasonalUse,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_OperatorExperience =By.xpath("//*[@id='field_key$b030eed9-2c28-31c9-91b0-2dbf30256156$1operator_exp-textbox']");
 	public WebElement getVehicles_TXT_OperatorExperience(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_OperatorExperience ,dataVal);
 	return se.element().getElement(Vehicles_TXT_OperatorExperience,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_OperatorExperienceSearch =By.xpath("//*[@id='field_key$b030eed9-2c28-31c9-91b0-2dbf30256156$1operator_exp-textbox']/../div");
 	public WebElement getVehicles_TXT_OperatorExperienceSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_OperatorExperienceSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_OperatorExperienceSearch,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_FarmAuto =By.xpath("//html/body//span[@id='field_key$f142d8e6-29de-3c2d-9303-2e88ddfa7fda$1farm_auto-checkbox']/input");
 	public WebElement getVehicles_CHK_FarmAuto(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_FarmAuto ,dataVal);
 	return se.element().getElement(Vehicles_CHK_FarmAuto,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_OperatorUse =By.xpath("//*[@id='field_key$3edee689-444f-36af-95a4-e0a789dcf3b2$1operator_use-textbox']");
 	public WebElement getVehicles_TXT_OperatorUse(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_OperatorUse ,dataVal);
 	return se.element().getElement(Vehicles_TXT_OperatorUse,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_OperatorUseSearch =By.xpath("//*[@id='field_key$3edee689-444f-36af-95a4-e0a789dcf3b2$1operator_use-textbox']/../div");
 	public WebElement getVehicles_TXT_OperatorUseSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_OperatorUseSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_OperatorUseSearch,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_DetailedClass =By.id("field_key$b3d23448-94f4-3abd-85f4-e2fb65947e3c$1detailed_class-textbox");
 	public WebElement getVehicles_TXT_DetailedClass(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_DetailedClass ,dataVal);
 	return se.element().getElement(Vehicles_TXT_DetailedClass,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_DetailedClass_Search =By.xpath("//*[@id='field_key$b3d23448-94f4-3abd-85f4-e2fb65947e3c$1detailed_class-textbox']/../div");
 	public WebElement getVehicles_TXT_DetailedClass_Search(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_DetailedClass_Search ,dataVal);
 	return se.element().getElement(Vehicles_TXT_DetailedClass_Search,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_SubClass =By.id("field_key$ca52a42e-54c5-3aff-a8a3-1b7f0540e90e$1sub_class-textbox");
 	public WebElement getVehicles_TXT_SubClass(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_SubClass ,dataVal);
 	return se.element().getElement(Vehicles_TXT_SubClass,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_SubClassSearch =By.xpath("//*[@id='field_key$ca52a42e-54c5-3aff-a8a3-1b7f0540e90e$1sub_class-textbox']/../div");
 	public WebElement getVehicles_TXT_SubClassSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_SubClassSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_SubClassSearch,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_AccidentPreventionCourseDiscount =By.xpath("//html/body//span[@id='field_key$5ba7c8da-5c18-3eec-aa32-86984f7c639f$1accdnt_prevn_disc-checkbox']/input");
 	public WebElement getVehicles_CHK_AccidentPreventionCourseDiscount(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_AccidentPreventionCourseDiscount ,dataVal);
 	return se.element().getElement(Vehicles_CHK_AccidentPreventionCourseDiscount,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_ClassificationCode =By.id("field_key$86d5133c-2813-3368-ba51-cc4f6c4e26bc$1classification_code-textbox");
 	public WebElement getVehicles_TXT_ClassificationCode(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_ClassificationCode ,dataVal);
 	return se.element().getElement(Vehicles_TXT_ClassificationCode,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_UsedForDumping =By.xpath("//html/body//span[@id='field_key$e0afcd39-c815-3d4b-8d74-80cca827b13b$1is_used_for_dumping-checkbox']/input");
 	public WebElement getVehicles_CHK_UsedForDumping(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_UsedForDumping ,dataVal);
 	return se.element().getElement(Vehicles_CHK_UsedForDumping,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_Yes =By.xpath("(//span[text()='Is this vehicle rented to others or used in a business primarily to transport property or equipment?']/../../following-sibling::td[2]//input)[1]");
 	public WebElement getVehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_Yes(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_Yes ,dataVal);
 	return se.element().getElement(Vehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_Yes,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_No =By.xpath("(//span[text()='Is this vehicle rented to others or used in a business primarily to transport property or equipment?']/../../following-sibling::td[2]//input)[2]");
 	public WebElement getVehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_No(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_No ,dataVal);
 	return se.element().getElement(Vehicles_CHK_IsVehicleRentedToOthersInBussPrimToTransportPropOrEquip_No,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_UseOfVehicle =By.id("field_key$30d4fa2c-6d8c-365e-b95c-19def0baf9ac$1use_of_vehicle-textbox");
 	public WebElement getVehicles_TXT_UseOfVehicle(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_UseOfVehicle ,dataVal);
 	return se.element().getElement(Vehicles_TXT_UseOfVehicle,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_UseOfVehicleSearch =By.xpath("//*[@id='field_key$30d4fa2c-6d8c-365e-b95c-19def0baf9ac$1use_of_vehicle-textbox']/../div");
 	public WebElement getVehicles_TXT_UseOfVehicleSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_UseOfVehicleSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_UseOfVehicleSearch,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_UsageRadius =By.id("field_key$c5dcef40-005b-3a44-bc57-bb3cb8dc605f$1usage_radius-textbox");
 	public WebElement getVehicles_TXT_UsageRadius(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_UsageRadius ,dataVal);
 	return se.element().getElement(Vehicles_TXT_UsageRadius,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_UsageRadiusSearch =By.xpath("//*[@id='field_key$c5dcef40-005b-3a44-bc57-bb3cb8dc605f$1usage_radius-textbox']/../div");
 	public WebElement getVehicles_TXT_UsageRadiusSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_UsageRadiusSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_UsageRadiusSearch,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_nearest_terminal =By.id("field_key$171358bc-7ac1-32a1-843b-e51492c4f857$1nearest_terminal-textbox");
 	public WebElement getVehicles_TXT_nearest_terminal(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_nearest_terminal ,dataVal);
 	return se.element().getElement(Vehicles_TXT_nearest_terminal,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_nearest_terminal_desc =By.id("field_key$dd45d3b3-2a36-3ea9-8fd6-991c17191e4d$1nearest_terminal_desc-textbox");
 	public WebElement getVehicles_TXT_nearest_terminal_desc(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_nearest_terminal_desc ,dataVal);
 	return se.element().getElement(Vehicles_TXT_nearest_terminal_desc,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_farthest_terminal =By.id("field_key$305b5929-26dd-375a-a8e9-5954959e9974$1farthest_terminal-textbox");
 	public WebElement getVehicles_TXT_farthest_terminal(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_farthest_terminal ,dataVal);
 	return se.element().getElement(Vehicles_TXT_farthest_terminal,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_farthest_terminal_desc =By.id("field_key$d1ac328f-903e-367c-a50d-fa352a6ac48c$1farthest_terminal_desc-textbox");
 	public WebElement getVehicles_TXT_farthest_terminal_desc(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_farthest_terminal_desc ,dataVal);
 	return se.element().getElement(Vehicles_TXT_farthest_terminal_desc,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_PowerUnit =By.xpath("//*[@id='field_key$1ff52fc7-ada5-3623-87e6-5828f30ab8a4$1is_power_unit_covered-checkbox']/input");
 	public WebElement getVehicles_CHK_PowerUnit(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_PowerUnit ,dataVal);
 	return se.element().getElement(Vehicles_CHK_PowerUnit,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_SpecialIndustryType =By.id("field_key$6fa4cdfa-14ec-3fb1-b73f-d53f309e599d$1special_industry_type-textbox");
 	public WebElement getVehicles_TXT_SpecialIndustryType(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_SpecialIndustryType ,dataVal);
 	return se.element().getElement(Vehicles_TXT_SpecialIndustryType,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_SpecialIndustryTypeSearch =By.xpath("//*[@id='field_key$6fa4cdfa-14ec-3fb1-b73f-d53f309e599d$1special_industry_type-textbox']/../div");
 	public WebElement getVehicles_TXT_SpecialIndustryTypeSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_SpecialIndustryTypeSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_SpecialIndustryTypeSearch,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_SpecialIndustryClass =By.id("field_key$7adec0e2-be49-34be-8151-dd7b3186fac2$1special_industry_class-textbox");
 	public WebElement getVehicles_TXT_SpecialIndustryClass(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_SpecialIndustryClass ,dataVal);
 	return se.element().getElement(Vehicles_TXT_SpecialIndustryClass,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_SpecialIndustryClassSearch =By.xpath("//*[@id='field_key$7adec0e2-be49-34be-8151-dd7b3186fac2$1special_industry_class-textbox']/../div");
 	public WebElement getVehicles_TXT_SpecialIndustryClassSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_SpecialIndustryClassSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_SpecialIndustryClassSearch,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_PrimaryCLassification =By.id("field_key$77f21632-0735-3412-95d3-cb57950b37e5$1disp_primary_class_code-textbox");
 	public WebElement getVehicles_TXT_PrimaryCLassification(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_PrimaryCLassification ,dataVal);
 	return se.element().getElement(Vehicles_TXT_PrimaryCLassification,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_PrimaryCLassificationSearch =By.xpath("//*[@id='field_key$77f21632-0735-3412-95d3-cb57950b37e5$1disp_primary_class_code-textbox']/../div");
 	public WebElement getVehicles_TXT_PrimaryCLassificationSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_PrimaryCLassificationSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_PrimaryCLassificationSearch,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_SecondaryCLassification =By.id("field_key$7208b1d8-49e8-3134-be4c-937f39273b35$1disp_secondary_class_code-textbox");
 	public WebElement getVehicles_TXT_SecondaryCLassification(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_SecondaryCLassification ,dataVal);
 	return se.element().getElement(Vehicles_TXT_SecondaryCLassification,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_SecondaryCLassificationSearch =By.xpath("//*[@id='field_key$7208b1d8-49e8-3134-be4c-937f39273b35$1disp_secondary_class_code-textbox']/../div");
 	public WebElement getVehicles_TXT_SecondaryCLassificationSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_SecondaryCLassificationSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_SecondaryCLassificationSearch,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_SpecialtyUse =By.id("field_key$0c82f763-0079-365d-998d-a2bf79ba7736$1speciality_use-textbox");
 	public WebElement getVehicles_TXT_SpecialtyUse(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_SpecialtyUse ,dataVal);
 	return se.element().getElement(Vehicles_TXT_SpecialtyUse,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_SpecialtyUseSearch =By.xpath("//*[@id='field_key$0c82f763-0079-365d-998d-a2bf79ba7736$1speciality_use-textbox']/../div");
 	public WebElement getVehicles_TXT_SpecialtyUseSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_SpecialtyUseSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_SpecialtyUseSearch,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_AmphibiousVehicle =By.xpath("//span[@id='field_key$ad06c8bc-a0a5-377b-a597-684b68c4276d$1amphibious_vehicle-checkbox']/input");
 	public WebElement getVehicles_CHK_AmphibiousVehicle(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_AmphibiousVehicle ,dataVal);
 	return se.element().getElement(Vehicles_CHK_AmphibiousVehicle,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_GrossVehicleWeight =By.id("field_key$1d9d022e-01b4-3342-bf28-3684835f8f30$1gross_weigth-textbox");
 	public WebElement getVehicles_TXT_GrossVehicleWeight(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_GrossVehicleWeight ,dataVal);
 	return se.element().getElement(Vehicles_TXT_GrossVehicleWeight,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_TransportationRange_Interstate =By.xpath("(//div[text()=' Interstate'] /../../..//div/span/input)[1]");
 	public WebElement getVehicles_CHK_TransportationRange_Interstate(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_TransportationRange_Interstate ,dataVal);
 	return se.element().getElement(Vehicles_CHK_TransportationRange_Interstate,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_TransportationRange_Intrastate =By.xpath("(//div[text()=' Interstate'] /../../..//div/span/input)[2]");
 	public WebElement getVehicles_CHK_TransportationRange_Intrastate(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_TransportationRange_Intrastate ,dataVal);
 	return se.element().getElement(Vehicles_CHK_TransportationRange_Intrastate,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_InsuredHoldsMajorityFinancialInterest =By.xpath("//*[@id='field_key$9ecc1e59-b6c8-3ea0-99ec-28cac6ededad$1insrd_mjr_fin_intrst-checkbox']/input");
 	public WebElement getVehicles_CHK_InsuredHoldsMajorityFinancialInterest(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_InsuredHoldsMajorityFinancialInterest ,dataVal);
 	return se.element().getElement(Vehicles_CHK_InsuredHoldsMajorityFinancialInterest,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_NumberOfUnits =By.id("field_key$37c299b3-b13a-3d6b-9275-4fdfa2059670$1bulk_rate_count-textbox");
 	public WebElement getVehicles_TXT_NumberOfUnits(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_NumberOfUnits ,dataVal);
 	return se.element().getElement(Vehicles_TXT_NumberOfUnits,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_SeatingCapacity =By.id("field_key$74ee725a-9b4f-3b21-81d8-aab7a425f6fc$1seating_capacity-textbox");
 	public WebElement getVehicles_TXT_SeatingCapacity(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_SeatingCapacity ,dataVal);
 	return se.element().getElement(Vehicles_TXT_SeatingCapacity,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_DoesThisVehHaveAMechLift =By.xpath("//html/body//span[@id='field_key$0705273e-b385-31dc-9cc0-8aff74af7443$1mech_lift_opt-checkbox']/input");
 	public WebElement getVehicles_CHK_DoesThisVehHaveAMechLift(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_DoesThisVehHaveAMechLift ,dataVal);
 	return se.element().getElement(Vehicles_CHK_DoesThisVehHaveAMechLift,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_IsThisVehicleHiredAuto =By.xpath("//html/body//span[@id='field_key$c93b21df-3b51-3af4-acde-2e39f28280b6$1hired_auto-checkbox']/input");
 	public WebElement getVehicles_CHK_IsThisVehicleHiredAuto(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_IsThisVehicleHiredAuto ,dataVal);
 	return se.element().getElement(Vehicles_CHK_IsThisVehicleHiredAuto,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_OwnedByAlliedOrSubsidiaryInterest =By.xpath("//html/body//span[@id='field_key$44afdbfe-866c-3e76-9717-f9d3841dcdc6$1ownd_by_alld_subsidairy-checkbox']/input");
 	public WebElement getVehicles_CHK_OwnedByAlliedOrSubsidiaryInterest(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_OwnedByAlliedOrSubsidiaryInterest ,dataVal);
 	return se.element().getElement(Vehicles_CHK_OwnedByAlliedOrSubsidiaryInterest,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_IsThisVehicleUsedToProvidePrearrangedDeliveryOrCourierServices =By.xpath("//span[@id='field_key$3a3c0a8a-c3c1-38e8-8432-f719a55c48a5$1is_del_ser_opt-checkbox']/../div");
 	public WebElement getVehicles_CHK_IsThisVehicleUsedToProvidePrearrangedDeliveryOrCourierServices(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_IsThisVehicleUsedToProvidePrearrangedDeliveryOrCourierServices ,dataVal);
 	return se.element().getElement(Vehicles_CHK_IsThisVehicleUsedToProvidePrearrangedDeliveryOrCourierServices,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_IsThisVehicleUsedToProvidePrearrangedTransportationServices =By.xpath("//span[@id='field_key$29e4ed79-df75-36fa-9bc6-c753c6071f78$1is_ride_share_opt-checkbox']/../div");
 	public WebElement getVehicles_CHK_IsThisVehicleUsedToProvidePrearrangedTransportationServices(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_IsThisVehicleUsedToProvidePrearrangedTransportationServices ,dataVal);
 	return se.element().getElement(Vehicles_CHK_IsThisVehicleUsedToProvidePrearrangedTransportationServices,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_Liability =By.xpath("//span[@id='field_key$7e1eb367-e30a-3a95-ac6c-873840a8ec13$1liability-checkbox']/input");
 	public WebElement getVehicles_CHK_Liability(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_Liability ,dataVal);
 	return se.element().getElement(Vehicles_CHK_Liability,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_TortLimit =By.id("field_key$157202da-360a-3f20-bdca-d7afa235af2d$1tort_limit-textarea");
 	public WebElement getVehicles_TXT_TortLimit(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_TortLimit ,dataVal);
 	return se.element().getElement(Vehicles_TXT_TortLimit,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_TortLimitationCode =By.id("field_key$2a940220-9b3c-325c-9ecb-32cc3bc8c34a$1tort_limit_code-textbox");
 	public WebElement getVehicles_TXT_TortLimitationCode(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_TortLimitationCode ,dataVal);
 	return se.element().getElement(Vehicles_TXT_TortLimitationCode,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_CombinedSingleLimit =By.id("field_key$2f0de182-f615-3ee1-a171-62d3815fa6d7$1combined_single_limit_disp-textbox");
 	public WebElement getVehicles_TXT_CombinedSingleLimit(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_CombinedSingleLimit ,dataVal);
 	return se.element().getElement(Vehicles_TXT_CombinedSingleLimit,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_NonPhysicalDamageDeductible =By.id("field_key$a35fe1f3-af61-3553-a48b-2b644b3d309b$1deductible-textbox");
 	public WebElement getVehicles_TXT_NonPhysicalDamageDeductible(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_NonPhysicalDamageDeductible ,dataVal);
 	return se.element().getElement(Vehicles_TXT_NonPhysicalDamageDeductible,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_Personal_Injury_Protection =By.xpath("//*[contains(@id,'pers_injury_prot-checkbox')]/input");
 	public WebElement getVehicles_CHK_Personal_Injury_Protection(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_Personal_Injury_Protection ,dataVal);
 	return se.element().getElement(Vehicles_CHK_Personal_Injury_Protection,dataVal);
 	}
 	
 	public By Vehicles_TXT_InsuredCoverageStatus =By.xpath("//*[@id='field_key$92cba96d-23cf-3d57-82b9-53fc593b1820$1insured_cov_status-textbox']");
 	public WebElement getVehicles_TXT_InsuredCoverageStatus(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_InsuredCoverageStatus ,dataVal);
 	return se.element().getElement(Vehicles_TXT_InsuredCoverageStatus,dataVal);
 	}
 	
 	public By Vehicles_TXT_SpouseResidentCovStatus =By.xpath("//*[@id='field_key$218909eb-2b14-3e1a-85ce-236818255067$1spouse_res_cov_status-textbox']");
 	public WebElement getVehicles_TXT_SpouseResidentCovStatus(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_SpouseResidentCovStatus ,dataVal);
 	return se.element().getElement(Vehicles_TXT_SpouseResidentCovStatus,dataVal);
 	}
 	
 	public By Vehicles_CHK_MedicalExpenseBenefits =By.xpath("//*[contains(@id,'1medical_exp_benefit-checkbox')]/input");
 	public WebElement getVehicles_CHK_MedicalExpenseBenefits(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_MedicalExpenseBenefits ,dataVal);
 	return se.element().getElement(Vehicles_CHK_MedicalExpenseBenefits,dataVal);
 	}
 	
 	public By Vehicles_TXT_MedExpBenefits_Limit =By.xpath("//*[@id='field_key$8d60ec4d-bf6b-3ee7-a111-6640e9d615c5$1mi_meb_limit-textbox']");
 	public WebElement getVehicles_TXT_MedExpBenefits_Limit(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_MedExpBenefits_Limit ,dataVal);
 	return se.element().getElement(Vehicles_TXT_MedExpBenefits_Limit,dataVal);
 	}
 	
 	public By Vehicles_CHK_ExcludeMedicalExpenseBenefits =By.xpath("//*[contains(@id,'1exclude_med_exp_ben-checkbox')]/input");
 	public WebElement getVehicles_CHK_ExcludeMedicalExpenseBenefits(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_ExcludeMedicalExpenseBenefits ,dataVal);
 	return se.element().getElement(Vehicles_CHK_ExcludeMedicalExpenseBenefits,dataVal);
 	}
 	
 	public By Vehicles_TXT_ExcessCoverage =By.xpath("//*[@id='field_key$f09ba4b3-db7f-3716-8e0e-a619f26964a8$1excess_pip-textbox']");
 	public WebElement getVehicles_TXT_ExcessCoverage(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_ExcessCoverage ,dataVal);
 	return se.element().getElement(Vehicles_TXT_ExcessCoverage,dataVal);
 	}
 	
 	public By Vehicles_CHK_ExcessAttendantCare =By.xpath("//*[contains(@id,'1excess_attendant_care-checkbox')]/input");
 	public WebElement getVehicles_CHK_ExcessAttendantCare(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_ExcessAttendantCare ,dataVal);
 	return se.element().getElement(Vehicles_CHK_ExcessAttendantCare,dataVal);
 	}
 	public By Vehicles_CHK_PropertyProtectionInsurance =By.xpath("//*[contains(@id,'1veh_prop_prot_insur-checkbox')]/input");
 	public WebElement getVehicles_CHK_PropertyProtectionInsurance(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_PropertyProtectionInsurance ,dataVal);
 	return se.element().getElement(Vehicles_CHK_PropertyProtectionInsurance,dataVal);
 	}
 	
 	public By Vehicles_TXT_PropProtInsu_Deductible =By.xpath("//*[@id='field_key$760b421c-e26e-32df-a185-f517f068f6a5$1deductible-textbox']");
 	public WebElement getVehicles_TXT_PropProtInsu_Deductible(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_PropProtInsu_Deductible ,dataVal);
 	return se.element().getElement(Vehicles_TXT_PropProtInsu_Deductible,dataVal);
 	}
 	
 	public By Vehicles_CHK_PropDamageLiabCovBuyback =By.xpath("//*[contains(@id,'1lmt_prop_damage_liab-checkbox')]/input");
 	public WebElement getVehicles_CHK_PropDamageLiabCovBuyback(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_PropDamageLiabCovBuyback ,dataVal);
 	return se.element().getElement(Vehicles_CHK_PropDamageLiabCovBuyback,dataVal);
 	}
 	
 	public By Vehicles_TXT_EachAccident =By.xpath("//*[@id='field_key$393ce2a5-a33b-3dda-a94c-da27300c17a4$1each_accident-textbox']");
 	public WebElement getVehicles_TXT_EachAccident(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_EachAccident ,dataVal);
 	return se.element().getElement(Vehicles_TXT_EachAccident,dataVal);
 	}
 	
 	                            
 	public By Vehicles_CHK_owner_operated =By.id("field_key$e1030da9-0391-332b-b91e-06e14d4f527b$1owner_operated-checkbox");
 	public WebElement getVehicles_CHK_owner_operated(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_owner_operated ,dataVal);
 	return se.element().getElement(Vehicles_CHK_owner_operated,dataVal);
 	}
 	                            
 	public By Vehicles_CHK__AdditionalPersonal =By.xpath("//*[@id='field_key$787be47b-4d3d-30d5-b5f2-9df4597f04cc$1add_pers_injury_prot-checkbox']/input");
 	public WebElement getVehicles_CHK__AdditionalPersonal(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK__AdditionalPersonal ,dataVal);
 	return se.element().getElement(Vehicles_CHK__AdditionalPersonal,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_TypeofCovg =By.xpath("//*[@id='field_key$a61723ce-4acd-3c50-8784-c4918555a577$1type_of_coverage-textbox']");
 	public WebElement getVehicles_TXT_TypeofCovg(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_TypeofCovg ,dataVal);
 	return se.element().getElement(Vehicles_TXT_TypeofCovg,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_SpecificUnitDeductible =By.id("field_key$d71a1404-cb6e-36dd-8662-52bb6e34c8e3$1spe_unit_deductible-textbox");
 	public WebElement getVehicles_TXT_SpecificUnitDeductible(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_SpecificUnitDeductible ,dataVal);
 	return se.element().getElement(Vehicles_TXT_SpecificUnitDeductible,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_SpecificUnitDeductibleSearch =By.xpath("//*[@id='field_key$d71a1404-cb6e-36dd-8662-52bb6e34c8e3$1spe_unit_deductible-textbox']/../div");
 	public WebElement getVehicles_TXT_SpecificUnitDeductibleSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_SpecificUnitDeductibleSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_SpecificUnitDeductibleSearch,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_DeductibleType_CSL =By.xpath("//*[text()='Deductible Type']/../../following-sibling::td//*[text()='Combined Single Limit']/../../preceding-sibling::div[1]//input[1]");
 	public WebElement getVehicles_CHK_DeductibleType_CSL(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_DeductibleType_CSL ,dataVal);
 	return se.element().getElement(Vehicles_CHK_DeductibleType_CSL,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_DeductibleType_PropertyDamPerAccDed =By.xpath("//*[text()='Deductible Type']/../../following-sibling::td//*[text()='Property Damage Per Accident Deductible']/../../preceding-sibling::div[1]//input[1]");
 	public WebElement getVehicles_CHK_DeductibleType_PropertyDamPerAccDed(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_DeductibleType_PropertyDamPerAccDed ,dataVal);
 	return se.element().getElement(Vehicles_CHK_DeductibleType_PropertyDamPerAccDed,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_TypeOfCoverage =By.xpath("//*[@id='field_key$a61723ce-4acd-3c50-8784-c4918555a577$1type_of_coverage-textbox']");
 	public WebElement getVehicles_TXT_TypeOfCoverage(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_TypeOfCoverage ,dataVal);
 	return se.element().getElement(Vehicles_TXT_TypeOfCoverage,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_UsedToTransportMigrantFarmWorkers =By.xpath("//html/body//span[@id='field_key$6be7462d-bf3a-349a-9a4c-e8ff9bf21c5b$1migrant_work_liab-checkbox']/input");
 	public WebElement getVehicles_CHK_UsedToTransportMigrantFarmWorkers(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_UsedToTransportMigrantFarmWorkers ,dataVal);
 	return se.element().getElement(Vehicles_CHK_UsedToTransportMigrantFarmWorkers,dataVal);
 	}

 	public By Vehicles_CHK_IncludePassengerHazard =By.xpath("//html/body//span[@id='field_key$fa3c3619-a0cc-38d1-8cdd-93bb0e0a88ef$1exclude_pass_hzd-checkbox']/input");
 	public WebElement getVehicles_CHK_IncludePassengerHazard(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_IncludePassengerHazard ,dataVal);
 	return se.element().getElement(Vehicles_CHK_IncludePassengerHazard,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_MedicalPayments =By.xpath("//html/body//span[@id='field_key$3fcc886a-79d3-34dc-840e-4bb06d135f8f$1medical_payments-checkbox']/input");
 	public WebElement getVehicles_CHK_MedicalPayments(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_MedicalPayments ,dataVal);
 	return se.element().getElement(Vehicles_CHK_MedicalPayments,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_LimitEachPerson =By.id("field_key$a3e2836e-11b2-3405-baf7-b4becf94a1a0$1limit_each_person-textbox");
 	public WebElement getVehicles_TXT_LimitEachPerson(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_LimitEachPerson ,dataVal);
 	return se.element().getElement(Vehicles_TXT_LimitEachPerson,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_ApplyExclusion =By.xpath("//*[@id='field_key$e6445f12-7e84-38b9-912c-8709c3154f0d$1apply_work_loss_benef-checkbox']/input");
 	public WebElement getVehicles_CHK_ApplyExclusion(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_ApplyExclusion ,dataVal);
 	return se.element().getElement(Vehicles_CHK_ApplyExclusion,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_Excess_Deductible =By.id("field_key$ef602842-2f89-32a5-a9c0-19849bec1fed$1deductible-textbox");
 	public WebElement getVehicles_TXT_Excess_Deductible(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_Excess_Deductible ,dataVal);
 	return se.element().getElement(Vehicles_TXT_Excess_Deductible,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_FurnishedForRegularUse =By.xpath("//*[@id='field_key$a26372ae-f1f3-362b-90d7-778ad759a5fb$1furnished_regular_use-checkbox']/input");
 	public WebElement getVehicles_CHK_FurnishedForRegularUse(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_FurnishedForRegularUse ,dataVal);
 	return se.element().getElement(Vehicles_CHK_FurnishedForRegularUse,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_Covered_Workers_Compensation =By.xpath("//html/body//span[@id='field_key$92003781-80c7-3745-a1ac-33d8c72964b9$1covered_wrkrs_comp-checkbox']/input");
 	public WebElement getVehicles_CHK_Covered_Workers_Compensation(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_Covered_Workers_Compensation ,dataVal);
 	return se.element().getElement(Vehicles_CHK_Covered_Workers_Compensation,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_Property_Protection_Insurance_Deductible =By.id("field_key$ef602842-2f89-32a5-a9c0-19849bec1fed$1deductible-textbox");
 	public WebElement getVehicles_TXT_Property_Protection_Insurance_Deductible(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_Property_Protection_Insurance_Deductible ,dataVal);
 	return se.element().getElement(Vehicles_TXT_Property_Protection_Insurance_Deductible,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_BuyBack_EachIncident =By.id("field_key$393ce2a5-a33b-3dda-a94c-da27300c17a4$1each_accident-textbox");
 	public WebElement getVehicles_TXT_BuyBack_EachIncident(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_BuyBack_EachIncident ,dataVal);
 	return se.element().getElement(Vehicles_TXT_BuyBack_EachIncident,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_UninsuredMotorist =By.xpath("//html/body//span[@id='field_key$94f23a98-59f0-3e31-aac6-43b96c2274d1$1uninsured_motorist-checkbox']/input");
 	public WebElement getVehicles_CHK_UninsuredMotorist(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_UninsuredMotorist ,dataVal);
 	return se.element().getElement(Vehicles_CHK_UninsuredMotorist,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_UnInsuredCombinedSingleLimit =By.id("field_key$9aaaa194-e226-31bf-8f06-0ee18f458747$1combined_single_limit-textbox");
 	public WebElement getVehicles_TXT_UnInsuredCombinedSingleLimit(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_UnInsuredCombinedSingleLimit ,dataVal);
 	return se.element().getElement(Vehicles_TXT_UnInsuredCombinedSingleLimit,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_UninsuredMotoristPD =By.xpath("//html/body//span[@id='field_key$7d65bbd3-2b33-3933-b5b7-b9d02af51c21$1uninsured_motorist_pd-checkbox']/input");
 	public WebElement getVehicles_CHK_UninsuredMotoristPD(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_UninsuredMotoristPD ,dataVal);
 	return se.element().getElement(Vehicles_CHK_UninsuredMotoristPD,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_UMPropertyDamageLimit =By.id("field_key$61536205-cb3d-35a6-9ac6-a8c7b2c93069$1property_dam_limit-textbox");
 	public WebElement getVehicles_TXT_UMPropertyDamageLimit(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_UMPropertyDamageLimit ,dataVal);
 	return se.element().getElement(Vehicles_TXT_UMPropertyDamageLimit,dataVal);
 	}
 	

 	public By Vehicles_TXT_UMPropertyDamageLimitSearch =By.xpath("//*[@id='field_key$61536205-cb3d-35a6-9ac6-a8c7b2c93069$1property_dam_limit-textbox']/../div");
 	public WebElement getVehicles_TXT_UMPropertyDamageLimitSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_UMPropertyDamageLimitSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_UMPropertyDamageLimitSearch,dataVal);
 	}
 	
 	
 	public By Vehicles_TXT_UMPropertyDamageDed =By.id("field_key$9a4d7999-f42c-3b2c-b57d-03137e187a1a$1deductible-textbox");
 	public WebElement getVehicles_TXT_UMPropertyDamageDed(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_UMPropertyDamageDed ,dataVal);
 	return se.element().getElement(Vehicles_TXT_UMPropertyDamageDed,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_UnderInsuredMotorist =By.xpath("//html/body//span[@id='field_key$598d9052-659c-3792-9534-11d9c9d0527c$1underinsured_motorist-checkbox']/input");
 	public WebElement getVehicles_CHK_UnderInsuredMotorist(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_UnderInsuredMotorist ,dataVal);
 	return se.element().getElement(Vehicles_CHK_UnderInsuredMotorist,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_CombinedLimit_UnderIns =By.id("field_key$0106a502-f850-3b60-9108-19be4bfff8f4$1combined_single_limit-textbox");
 	public WebElement getVehicles_TXT_CombinedLimit_UnderIns(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_CombinedLimit_UnderIns ,dataVal);
 	return se.element().getElement(Vehicles_TXT_CombinedLimit_UnderIns,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_OtherThanCollision =By.xpath("//*[@id='field_key$d11e86db-4266-34c3-b069-44336972960f$1otc-checkbox']/input");
 	public WebElement getVehicles_CHK_OtherThanCollision(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_OtherThanCollision ,dataVal);
 	return se.element().getElement(Vehicles_CHK_OtherThanCollision,dataVal);
 	}
 	
 	public By Vehicles_TXT_PhysicalDamageCoverageType =By.xpath("//*[@id='field_key$74a63f3c-bc7e-30a4-8958-8b055af4b25c$1loss_type-textbox']");
 	public WebElement getVehicles_TXT_PhysicalDamageCoverageType(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_PhysicalDamageCoverageType ,dataVal);
 	return se.element().getElement(Vehicles_TXT_PhysicalDamageCoverageType,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_PhysicalDamageCoverageTypeSearch =By.xpath("//*[@id='field_key$74a63f3c-bc7e-30a4-8958-8b055af4b25c$1loss_type-textbox']/../div");
 	public WebElement getVehicles_TXT_PhysicalDamageCoverageTypeSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_PhysicalDamageCoverageTypeSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_PhysicalDamageCoverageTypeSearch,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_AmountOfCoverage =By.xpath("//*[@id='field_key$521139f2-4987-3308-9d88-120b7b0105a3$1amnt_of_coverage-textbox']");
 	public WebElement getVehicles_TXT_AmountOfCoverage(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_AmountOfCoverage ,dataVal);
 	return se.element().getElement(Vehicles_TXT_AmountOfCoverage,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_PhysicalDamageDeductible =By.id("field_key$dc8a57da-6ce8-3450-ba24-0db371216fba$1deductible-textbox");
 	public WebElement getVehicles_TXT_PhysicalDamageDeductible(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_PhysicalDamageDeductible ,dataVal);
 	return se.element().getElement(Vehicles_TXT_PhysicalDamageDeductible,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_PhysicalDamageDeductibleSearch =By.xpath("//*[@id='field_key$dc8a57da-6ce8-3450-ba24-0db371216fba$1deductible-textbox']/../div");
 	public WebElement getVehicles_TXT_PhysicalDamageDeductibleSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_PhysicalDamageDeductibleSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_PhysicalDamageDeductibleSearch,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_FullGlassCoverageYes =By.xpath("(//span[text()='Full Glass Coverage']/../../following-sibling::td[2]//input)[1]");
 	public WebElement getVehicles_CHK_FullGlassCoverageYes(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_FullGlassCoverageYes ,dataVal);
 	return se.element().getElement(Vehicles_CHK_FullGlassCoverageYes,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_FullGlassCoverageNo =By.xpath("(//span[text()='Full Glass Coverage']/../../following-sibling::td[2]//input)[2]");
 	public WebElement getVehicles_CHK_FullGlassCoverageNo(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_FullGlassCoverageNo ,dataVal);
 	return se.element().getElement(Vehicles_CHK_FullGlassCoverageNo,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_Municipality =By.id("field_key$d238756b-d8d0-3b8e-adac-d173ee575dbe$1municipality-textbox");
 	public WebElement getVehicles_TXT_Municipality(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_Municipality ,dataVal);
 	return se.element().getElement(Vehicles_TXT_Municipality,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_MunicipalityCode =By.id("field_key$5226f7f9-69a4-3299-8324-8cae7036838a$1municipality_code-textbox");
 	public WebElement getVehicles_TXT_MunicipalityCode(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_MunicipalityCode ,dataVal);
 	return se.element().getElement(Vehicles_TXT_MunicipalityCode,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_MunicipalityDescription =By.id("field_key$b69adf1e-bf51-3142-b590-18e63d18979f$1municipality_desc-textbox");
 	public WebElement getVehicles_TXT_MunicipalityDescription(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_MunicipalityDescription ,dataVal);
 	return se.element().getElement(Vehicles_TXT_MunicipalityDescription,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_Collision =By.xpath("//html/body//span[@id='field_key$755406c4-e341-30d0-923e-db3f3cb0ea8d$1collision-checkbox']/input");
 	public WebElement getVehicles_CHK_Collision(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_Collision ,dataVal);
 	return se.element().getElement(Vehicles_CHK_Collision,dataVal);
 	}
 	                            
 public By Vehicles_CHK_ValueBasedContents =By.xpath("//*[@id='field_key$06359b8e-d559-3c51-ad0b-a9fcc59f7174$1value_based_contents-checkbox']/input");
 	public WebElement getVehicles_CHK_ValueBasedContents(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_ValueBasedContents ,dataVal);
 	return se.element().getElement(Vehicles_CHK_ValueBasedContents,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_CollisionDeductible =By.xpath("//*[@id='field_key$6746251b-46a0-3926-8521-eb7c05d43568$1deductible-textbox']");
 	public WebElement getVehicles_TXT_CollisionDeductible(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_CollisionDeductible ,dataVal);
 	return se.element().getElement(Vehicles_TXT_CollisionDeductible,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_CollisionDeductibleSearch =By.xpath("//*[@id='field_key$6746251b-46a0-3926-8521-eb7c05d43568$1deductible-textbox']/../div");
 	public WebElement getVehicles_TXT_CollisionDeductibleSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_CollisionDeductibleSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_CollisionDeductibleSearch,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_org =By.id("field_key$6724011d-6cb0-333d-b99b-217261af8bbb$1org_cost_new-textbox");
 	public WebElement getVehicles_TXT_org(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_org ,dataVal);
 	return se.element().getElement(Vehicles_TXT_org,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_Collision_Coverage =By.id("field_key$a6298608-6796-3433-a0da-284b1add9533$1collision_coverage-textbox");
 	public WebElement getVehicles_TXT_Collision_Coverage(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_Collision_Coverage ,dataVal);
 	return se.element().getElement(Vehicles_TXT_Collision_Coverage,dataVal);
 	}
 	
 	public By Vehicles_TXT_Collision_CoverageSearch =By.xpath("//*[contains(@id,'1collision_coverage-textbox')]/../div");
 	public WebElement getVehicles_TXT_Collision_CoverageSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_Collision_CoverageSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_Collision_CoverageSearch,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_ValuationMethod_ActualCashValue =By.xpath("(//div[text()='Actual Cash Value']/../../preceding-sibling::div[1]//input)[1]");
 	public WebElement getVehicles_CHK_ValuationMethod_ActualCashValue(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_ValuationMethod_ActualCashValue ,dataVal);
 	return se.element().getElement(Vehicles_CHK_ValuationMethod_ActualCashValue,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_ValuationMethod_StatedAmount =By.xpath("(//div[text()='Stated Amount']/../../preceding-sibling::div[1]//input)[1]");
 	public WebElement getVehicles_CHK_ValuationMethod_StatedAmount(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_ValuationMethod_StatedAmount ,dataVal);
 	return se.element().getElement(Vehicles_CHK_ValuationMethod_StatedAmount,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_Stated_Amount =By.xpath("//*[@id='field_key$20be84cb-a8ad-3907-83aa-dea9f609bdda$1stated_amount-textbox']");
 	public WebElement getVehicles_TXT_Stated_Amount(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_Stated_Amount ,dataVal);
 	return se.element().getElement(Vehicles_TXT_Stated_Amount,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_RebuiltOrStructurallyAlteredAuto =By.xpath("//span[@id='field_key$8db21c3a-3a77-381f-bb1a-59c31a27619f$1rebuilt_struct_alt_auto-checkbox']/input");
 	public WebElement getVehicles_CHK_RebuiltOrStructurallyAlteredAuto(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_RebuiltOrStructurallyAlteredAuto ,dataVal);
 	return se.element().getElement(Vehicles_CHK_RebuiltOrStructurallyAlteredAuto,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_chassis_year =By.id("field_key$2468a3a5-1e89-3ed6-8c25-7d8537810241$1chassis_year-textbox");
 	public WebElement getVehicles_TXT_chassis_year(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_chassis_year ,dataVal);
 	return se.element().getElement(Vehicles_TXT_chassis_year,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_OriginalCostNew =By.id("field_key$6724011d-6cb0-333d-b99b-217261af8bbb$1org_cost_new-textbox");
 	public WebElement getVehicles_TXT_OriginalCostNew(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_OriginalCostNew ,dataVal);
 	return se.element().getElement(Vehicles_TXT_OriginalCostNew,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_AutoLoanLeaseGapCoverage =By.xpath("//span[@id='field_key$2150890a-c85c-3538-ad0f-4f279bc92294$1auto_loan_lease_gap-checkbox']/input");
 	public WebElement getVehicles_CHK_AutoLoanLeaseGapCoverage(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_AutoLoanLeaseGapCoverage ,dataVal);
 	return se.element().getElement(Vehicles_CHK_AutoLoanLeaseGapCoverage,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_RentalReimbursement =By.xpath("//span[@id='field_key$43fa85be-28ff-3ab7-a683-8d6e0eba9cb4$1rental_reimbursement-checkbox']/input");
 	public WebElement getVehicles_CHK_RentalReimbursement(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_RentalReimbursement ,dataVal);
 	return se.element().getElement(Vehicles_CHK_RentalReimbursement,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_NumberOfDays =By.id("field_key$18f50d7c-7b6d-3428-8b4c-9dd9ebc349dd$1count_days-textbox");
 	public WebElement getVehicles_TXT_NumberOfDays(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_NumberOfDays ,dataVal);
 	return se.element().getElement(Vehicles_TXT_NumberOfDays,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_MaximumAmountPerDay =By.id("field_key$46ff0f64-96c4-35ce-82ea-35c623a23f97$1max_amount_per_day-textbox");
 	public WebElement getVehicles_TXT_MaximumAmountPerDay(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_MaximumAmountPerDay ,dataVal);
 	return se.element().getElement(Vehicles_TXT_MaximumAmountPerDay,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_MaximumAmountForAnyOnePeriod =By.id("field_key$a3009b3e-eb64-3ecc-bba9-aff4b52314e2$1max_amt_for_any_one_period-textbox");
 	public WebElement getVehicles_TXT_MaximumAmountForAnyOnePeriod(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_MaximumAmountForAnyOnePeriod ,dataVal);
 	return se.element().getElement(Vehicles_TXT_MaximumAmountForAnyOnePeriod,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_AudioVisualAndDataEquipment =By.xpath("//span[@id='field_key$36429c44-17e9-3270-8888-0d002435cca1$1av_data_equipment-checkbox']/input");
 	public WebElement getVehicles_CHK_AudioVisualAndDataEquipment(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_AudioVisualAndDataEquipment ,dataVal);
 	return se.element().getElement(Vehicles_CHK_AudioVisualAndDataEquipment,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_Added_Limit =By.id("field_key$12cab610-27f0-3404-935b-6b83c5730237$1added_limit-textbox");
 	public WebElement getVehicles_TXT_Added_Limit(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_Added_Limit ,dataVal);
 	return se.element().getElement(Vehicles_TXT_Added_Limit,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_Added_LimitSearch =By.xpath("//*[@id='field_key$12cab610-27f0-3404-935b-6b83c5730237$1added_limit-textbox']/../div");
 	public WebElement getVehicles_TXT_Added_LimitSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_Added_LimitSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_Added_LimitSearch,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_TowingAndLabor =By.xpath("//span[@id='field_key$9253940d-e2f9-361f-a9a6-2086eb7bc99a$1towing_and_labor-checkbox']/input");
 	public WebElement getVehicles_CHK_TowingAndLabor(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_TowingAndLabor ,dataVal);
 	return se.element().getElement(Vehicles_CHK_TowingAndLabor,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_TowingandLabourLimit =By.id("field_key$54508dab-ecf4-3f86-97c9-51ec9356fc74$1limit-textbox");
 	public WebElement getVehicles_TXT_TowingandLabourLimit(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_TowingandLabourLimit ,dataVal);
 	return se.element().getElement(Vehicles_TXT_TowingandLabourLimit,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_TowingandLabourLimitSearch =By.xpath("//*[@id='field_key$54508dab-ecf4-3f86-97c9-51ec9356fc74$1limit-textbox']/../div");
 	public WebElement getVehicles_TXT_TowingandLabourLimitSearch(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_TowingandLabourLimitSearch ,dataVal);
 	return se.element().getElement(Vehicles_TXT_TowingandLabourLimitSearch,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_TapesRecordsAndDiscs =By.xpath("//span[@id='field_key$8efd913a-e3e1-37c3-b0e4-6b4e8b19fc0a$1tapes_records-checkbox']/input");
 	public WebElement getVehicles_CHK_TapesRecordsAndDiscs(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_TapesRecordsAndDiscs ,dataVal);
 	return se.element().getElement(Vehicles_CHK_TapesRecordsAndDiscs,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_LiabilityMiscellaneousVehicleFactor =By.id("field_key$f26e05dd-159a-3035-8771-e301d4546d82$1liab_misc_factor-textbox");
 	public WebElement getVehicles_TXT_LiabilityMiscellaneousVehicleFactor(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_LiabilityMiscellaneousVehicleFactor ,dataVal);
 	return se.element().getElement(Vehicles_TXT_LiabilityMiscellaneousVehicleFactor,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_PhysicalDamageMiscellaneousVehicleFactor =By.id("field_key$80bb9c1e-b72b-3d6d-a14f-e9ac3311fd84$1phy_dmg_misc_factor-textbox");
 	public WebElement getVehicles_TXT_PhysicalDamageMiscellaneousVehicleFactor(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_PhysicalDamageMiscellaneousVehicleFactor ,dataVal);
 	return se.element().getElement(Vehicles_TXT_PhysicalDamageMiscellaneousVehicleFactor,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_BulkRate =By.xpath("//span[@id='field_key$c5bff60e-d1f7-3698-8798-dd30bbdb79a5$1bulk_rate-checkbox']/input");
 	public WebElement getVehicles_CHK_BulkRate(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_CHK_BulkRate ,dataVal);
 	return se.element().getElement(Vehicles_CHK_BulkRate,dataVal);
 	}
 	                            
 	public By Vehicles_CHK_VIN_Unknown_Table;
 	public WebElement getVehicles_CHK_VIN_Unknown_Table(String dataVal)
 	{
 		Vehicles_CHK_VIN_Unknown_Table =By.xpath("//html/body//span[contains(@id,'$"+dataVal+"vin_unknown-checkbox')]/input");
 	 	
 	se.element().waitForElement(Vehicles_CHK_VIN_Unknown_Table ,dataVal);
 	return se.element().getElement(Vehicles_CHK_VIN_Unknown_Table,dataVal);
 	}
 	                            
 	public By Vehicles_BTN_periodofoperations_add =By.xpath("//*[@id='9e3b89b9-6d5b-32bd-8ea9-ff552817d4b3-add-image']");
 	public WebElement getVehicles_BTN_periodofoperations_add(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_BTN_periodofoperations_add ,dataVal);
 	return se.element().getElement(Vehicles_BTN_periodofoperations_add,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_produce_carried =By.id("field_key$dc74962d-9ced-35e7-8f0b-f1ae4a09edf3$1produce_carried-textbox");
 	public WebElement getVehicles_TXT_produce_carried(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_produce_carried ,dataVal);
 	return se.element().getElement(Vehicles_TXT_produce_carried,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_fromdate =By.xpath("//*[@id='field_key$d49d926c-cd85-33b4-8724-797122de6367$1from_date-picker']/input");
 	public WebElement getVehicles_TXT_fromdate(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_fromdate ,dataVal);
 	return se.element().getElement(Vehicles_TXT_fromdate,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_todate =By.xpath("//*[@id='field_key$25002eb4-bf00-30f3-8cbf-00fd9d5ada9d$1to_date-picker']/input");
 	public WebElement getVehicles_TXT_todate(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_todate ,dataVal);
 	return se.element().getElement(Vehicles_TXT_todate,dataVal);
 	}
 	                            
 	public By Vehicles_TXT_Farm_Seasonal_Usetype =By.xpath("//*[@id='field_key$308a8b14-65e4-3c28-bd19-a8276d275444$1farm_seasonal_use-textbox']");
 	public WebElement getVehicles_TXT_Farm_Seasonal_Usetype(String dataVal)
 	{
 	se.element().waitForElement(Vehicles_TXT_Farm_Seasonal_Usetype ,dataVal);
 	return se.element().getElement(Vehicles_TXT_Farm_Seasonal_Usetype,dataVal);
 	}
 	                            

 	
 	/*****************************************
 	 * End of Vehicles Page Locators
 	 ******************************************/

	/*****************************************
	 * Start of ScheduleRating Locators
	 ******************************************/
 	public By ScheduleRating_BTN_Details;
 	public WebElement getScheduleRating_BTN_Details(String dataVal)
 	{
 		ScheduleRating_BTN_Details =By.xpath("//*[contains(@id,'$"+dataVal+"lob_ca_schedule_rate-image')]");
 	se.element().waitForElement(ScheduleRating_BTN_Details ,dataVal);
 	return se.element().getElement(ScheduleRating_BTN_Details,dataVal);
 	}
 	                            
 	public By ScheduleRating_LBL_ScheduleRating =By.xpath("//div[contains(@id,'lob_ca_schedule_rate-label')]");
 	public WebElement getScheduleRating_LBL_ScheduleRating()
 	{
 	se.element().waitForElement(ScheduleRating_LBL_ScheduleRating);
 	return se.element().getElement(ScheduleRating_LBL_ScheduleRating);
 	}
 	                            
 	public By ScheduleRating_TXT_State =By.id("field_key$f64036f8-99a5-3fae-acca-65b9f4e4d7f7$1risk_state-textbox");
 	public WebElement getScheduleRating_TXT_State(String dataVal)
 	{
 	se.element().waitForElement(ScheduleRating_TXT_State ,dataVal);
 	return se.element().getElement(ScheduleRating_TXT_State,dataVal);
 	}
 	                            
 	public By ScheduleRating_CHK_NoScheduleRatingForThisState =By.xpath("//*[contains(@id,'is_no_sdl_rating-checkbox')]/input");
 	public WebElement getScheduleRating_CHK_NoScheduleRatingForThisState(String dataVal)
 	{
 	se.element().waitForElement(ScheduleRating_CHK_NoScheduleRatingForThisState ,dataVal);
 	return se.element().getElement(ScheduleRating_CHK_NoScheduleRatingForThisState,dataVal);
 	}
 	                            
 	public By ScheduleRating_TXT_SelectModifier ;
 	public WebElement getScheduleRating_TXT_SelectModifier(String coverage,String dataVal)
 	{
 		
 		ScheduleRating_TXT_SelectModifier =By.xpath("//div[text()='"+coverage+"']//ancestor::td[1]//following-sibling::td//*[contains(@id,'override_modifier-textbox')]");
 	 	
 	se.element().waitForElement(ScheduleRating_TXT_SelectModifier ,dataVal);
 	return se.element().getElement(ScheduleRating_TXT_SelectModifier,dataVal);
 	}
 	                            
 	public By ScheduleRating_CHK_ProvideSchRatingBreakdown_Yes =By.xpath("//*[text()='Provide Schedule Rating Breakdown']//ancestor::td[1]//following-sibling::td//*[text()='Yes']/../..//preceding-sibling::div[1]//input");
 	public WebElement getScheduleRating_CHK_ProvideSchRatingBreakdown_Yes(String dataVal)
 	{
 	se.element().waitForElement(ScheduleRating_CHK_ProvideSchRatingBreakdown_Yes ,dataVal);
 	return se.element().getElement(ScheduleRating_CHK_ProvideSchRatingBreakdown_Yes,dataVal);
 	}
 	                            
 	public By ScheduleRating_CHK_ProvideSchRatingBreakdown_No =By.xpath("//*[text()='Provide Schedule Rating Breakdown']//ancestor::td[1]//following-sibling::td//*[text()='No']/../..//preceding-sibling::div[1]//input");
 	public WebElement getScheduleRating_CHK_ProvideSchRatingBreakdown_No(String dataVal)
 	{
 	se.element().waitForElement(ScheduleRating_CHK_ProvideSchRatingBreakdown_No ,dataVal);
 	return se.element().getElement(ScheduleRating_CHK_ProvideSchRatingBreakdown_No,dataVal);
 	}
 	                            
 	public By ScheduleRating_TXT_ScheduleRisk_SelectedModifier;
 	public WebElement getScheduleRating_TXT_ScheduleRisk_SelectedModifier(String coverage,String riskChar,String dataVal)
 	{
 		ScheduleRating_TXT_ScheduleRisk_SelectedModifier =By.xpath("//div[text()='"+coverage+"']//ancestor::tr[1]//*[text()='"+riskChar+"']//ancestor::td[1]//following-sibling::td//*[contains(@id,'override_value-textbox')]");
 	se.element().waitForElement(ScheduleRating_TXT_ScheduleRisk_SelectedModifier ,dataVal);
 	return se.element().getElement(ScheduleRating_TXT_ScheduleRisk_SelectedModifier,dataVal);
 	}
 	                            
 	public By ScheduleRating_TXT_ScheduleRisk_Reason;
 	public WebElement getScheduleRating_TXT_ScheduleRisk_Reason(String coverage,String riskChar,String dataVal)
 	{
 		ScheduleRating_TXT_ScheduleRisk_Reason =By.xpath("//div[text()='"+coverage+"']//ancestor::tr[1]//*[text()='"+riskChar+"']//ancestor::td[1]//following-sibling::td//*[contains(@id,'override_reason-textarea')]");
 	se.element().waitForElement(ScheduleRating_TXT_ScheduleRisk_Reason ,dataVal);
 	return se.element().getElement(ScheduleRating_TXT_ScheduleRisk_Reason,dataVal);
 	}
 	                            
 	public By ScheduleRating_TXT_ScheduleRisk_ReasonSearch ;
 	public WebElement getScheduleRating_TXT_ScheduleRisk_ReasonSearch(String coverage,String riskChar,String dataVal)
 	{
 		ScheduleRating_TXT_ScheduleRisk_ReasonSearch =By.xpath("//div[text()='"+coverage+"']//ancestor::tr[1]//*[text()='"+riskChar+"']//ancestor::td[1]//following-sibling::td//*[contains(@id,'override_reason-textarea')]/../div[2]");
 	se.element().waitForElement(ScheduleRating_TXT_ScheduleRisk_ReasonSearch ,dataVal);
 	return se.element().getElement(ScheduleRating_TXT_ScheduleRisk_ReasonSearch,dataVal);
 	}
 	                            

 	
 	/*****************************************
 	 * End of ScheduleRating Page Locators
 	 ******************************************/
	/*****************************************
	 * Start of Non Owned Liability Locators
	 ******************************************/
 	
 	public By NonOwnedLiability_BTN_Label = By.xpath("//*[contains(@id,'non_owned_liab_cov-label')]");
	
	public WebElement getNonOwnedLiability()
	{
	se.element().waitForElement(NonOwnedLiability_BTN_Label);
	return se.element().getElement(NonOwnedLiability_BTN_Label);
	}
 	public By NonOwnedLiability_BTN_Add =By.id("1e9200fe-dfe3-3055-9cf6-cad91a2ecc87-add-image");
 	public WebElement getNonOwnedLiability_BTN_Add(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_BTN_Add ,dataVal);
 	return se.element().getElement(NonOwnedLiability_BTN_Add,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_BTN_Details;
 	public WebElement getNonOwnedLiability_BTN_Details(String dataVal)
 	{
 		NonOwnedLiability_BTN_Details =By.xpath("//div[contains(@id,'"+dataVal+"non_owned_liab_cov-image')]");
 	se.element().waitForElement(NonOwnedLiability_BTN_Details ,dataVal);
 	return se.element().getElement(NonOwnedLiability_BTN_Details,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_BTN_DoneWithNonOwnedAuto =By.xpath("//*[@id='/-continue-image' and contains(.,'DONE')]");
 	public WebElement getNonOwnedLiability_BTN_DoneWithNonOwnedAuto(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_BTN_DoneWithNonOwnedAuto ,dataVal);
 	return se.element().getElement(NonOwnedLiability_BTN_DoneWithNonOwnedAuto,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_TXT_State =By.id("field_key$22f37d40-2598-364d-90ed-19273432e502$1state-textbox");
 	public WebElement getNonOwnedLiability_TXT_State(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_TXT_State ,dataVal);
 	return se.element().getElement(NonOwnedLiability_TXT_State,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_TXT_ZipCode =By.id("field_key$f6672d3a-c892-3371-9603-65d226a7afc3$1zip_code-textbox");
 	public WebElement getNonOwnedLiability_TXT_ZipCode(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_TXT_ZipCode ,dataVal);
 	return se.element().getElement(NonOwnedLiability_TXT_ZipCode,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_CHK_RiskType_SocialServAgencyRisk =By.xpath("//div[text()='Social Service Agency Risks']/../../preceding-sibling::div[1]//input");
 	public WebElement getNonOwnedLiability_CHK_RiskType_SocialServAgencyRisk(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_CHK_RiskType_SocialServAgencyRisk ,dataVal);
 	return se.element().getElement(NonOwnedLiability_CHK_RiskType_SocialServAgencyRisk,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_CHK__RiskType_OthrThanSocialServAgencyRisk =By.xpath("//div[text()='Other Than Social Service Agency Risks']/../../preceding-sibling::div[1]//input");
 	public WebElement getNonOwnedLiability_CHK__RiskType_OthrThanSocialServAgencyRisk(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_CHK__RiskType_OthrThanSocialServAgencyRisk ,dataVal);
 	return se.element().getElement(NonOwnedLiability_CHK__RiskType_OthrThanSocialServAgencyRisk,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_TXT_TypeOfCov =By.id("field_key$19802702-ab65-3b83-90cc-2d81eff579b1$1coverage_type_display-textbox");
 	public WebElement getNonOwnedLiability_TXT_TypeOfCov(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_TXT_TypeOfCov ,dataVal);
 	return se.element().getElement(NonOwnedLiability_TXT_TypeOfCov,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_TXT_TypeOfCovSearch =By.xpath("//input[@id='field_key$19802702-ab65-3b83-90cc-2d81eff579b1$1coverage_type_display-textbox']/../div");
 	public WebElement getNonOwnedLiability_TXT_TypeOfCovSearch(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_TXT_TypeOfCovSearch ,dataVal);
 	return se.element().getElement(NonOwnedLiability_TXT_TypeOfCovSearch,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_TXT_Territory =By.id("field_key$76dd254b-cfc3-31b3-99ed-e9bd6dcd038a$1territory_code-textbox");
 	public WebElement getNonOwnedLiability_TXT_Territory(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_TXT_Territory ,dataVal);
 	return se.element().getElement(NonOwnedLiability_TXT_Territory,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_TXT_TerrDescrption =By.id("field_key$bc879204-23fa-394d-a5b9-0dd6736e5317$1territory_desc-textbox");
 	public WebElement getNonOwnedLiability_TXT_TerrDescrption(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_TXT_TerrDescrption ,dataVal);
 	return se.element().getElement(NonOwnedLiability_TXT_TerrDescrption,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_TXT_TotalNumOfEmpAtAllLoc =By.id("field_key$a3e58d39-ca1f-39e1-ac2e-e746267b9cda$1tot_emp_all_loc-textbox");
 	public WebElement getNonOwnedLiability_TXT_TotalNumOfEmpAtAllLoc(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_TXT_TotalNumOfEmpAtAllLoc ,dataVal);
 	return se.element().getElement(NonOwnedLiability_TXT_TotalNumOfEmpAtAllLoc,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_TXT_TotalDrivingInstructors =By.id("field_key$23960570-f93a-3af0-b76d-b8b78eb619b3$1tot_driving_instructors-textbox");
 	public WebElement getNonOwnedLiability_TXT_TotalDrivingInstructors(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_TXT_TotalDrivingInstructors ,dataVal);
 	return se.element().getElement(NonOwnedLiability_TXT_TotalDrivingInstructors,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_TXT_tot_emp_in_op_auto =By.id("field_key$9b5d755d-a50e-3393-a12b-4bd131e4559c$1tot_emp_in_op_auto-textbox");
 	public WebElement getNonOwnedLiability_TXT_tot_emp_in_op_auto(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_TXT_tot_emp_in_op_auto ,dataVal);
 	return se.element().getElement(NonOwnedLiability_TXT_tot_emp_in_op_auto,dataVal);
 	}
 	
 	public By NonOwnedLiability_TXT_NoOfPartners =By.id("field_key$9369d9ca-f2a7-3981-9273-02cde3927304$1no_of_partners-textbox");
 	public WebElement getstrNonOwnedLiability_TXT_NoOfPartners(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_TXT_NoOfPartners ,dataVal);
 	return se.element().getElement(NonOwnedLiability_TXT_NoOfPartners,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_CHK_BlnktIndividualLiabilityCovForVolunteers =By.xpath("//span[@id='field_key$709ec1fb-9bec-3382-a605-6f0db97626ae$1volunteer_blan_indv-checkbox']/input");
 	public WebElement getNonOwnedLiability_CHK_BlnktIndividualLiabilityCovForVolunteers(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_CHK_BlnktIndividualLiabilityCovForVolunteers ,dataVal);
 	return se.element().getElement(NonOwnedLiability_CHK_BlnktIndividualLiabilityCovForVolunteers,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_CHK_ExtendCovForIndLiabilityOfEmp =By.xpath("//span[@id='field_key$a9890c6f-4388-39b1-b827-6237d20f2cf7$1ext_cov_ind_liab-checkbox']/input");
 	public WebElement getNonOwnedLiability_CHK_ExtendCovForIndLiabilityOfEmp(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_CHK_ExtendCovForIndLiabilityOfEmp ,dataVal);
 	return se.element().getElement(NonOwnedLiability_CHK_ExtendCovForIndLiabilityOfEmp,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_TXT_NoOfVolUseOwnAuto =By.id("field_key$980cf908-8e4d-3427-b667-5a4ef397a549$1no_of_volunteers-textbox");
 	public WebElement getNonOwnedLiability_TXT_NoOfVolUseOwnAuto(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_TXT_NoOfVolUseOwnAuto ,dataVal);
 	return se.element().getElement(NonOwnedLiability_TXT_NoOfVolUseOwnAuto,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_TXT_Base_CSL =By.id("field_key$7a2409bf-c0c0-328f-a7e2-bb93e5a694e4$1combined_single_limit_disp-textbox");
 	public WebElement getNonOwnedLiability_TXT_Base_CSL(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_TXT_Base_CSL ,dataVal);
 	return se.element().getElement(NonOwnedLiability_TXT_Base_CSL,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_TXT_Base_Deductible =By.id("field_key$7b3d9b97-9178-3bd6-a44b-23e8c7530da5$1deductible-textbox");
 	public WebElement getNonOwnedLiability_TXT_Base_Deductible(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_TXT_Base_Deductible ,dataVal);
 	return se.element().getElement(NonOwnedLiability_TXT_Base_Deductible,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_CHK_DedType_CSL =By.xpath("//div[text()='Combined Single Limit']/../../preceding-sibling::div[1]//input");
 	public WebElement getNonOwnedLiability_CHK_DedType_CSL(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_CHK_DedType_CSL ,dataVal);
 	return se.element().getElement(NonOwnedLiability_CHK_DedType_CSL,dataVal);
 	}
 	                            
 	public By NonOwnedLiability_CHK_DedType_PropDamPerAccDed =By.xpath("//div[text()='Property Damage Per Accident Deductible']/../../preceding-sibling::div[1]//input");
 	public WebElement getNonOwnedLiability_CHK_DedType_PropDamPerAccDed(String dataVal)
 	{
 	se.element().waitForElement(NonOwnedLiability_CHK_DedType_PropDamPerAccDed ,dataVal);
 	return se.element().getElement(NonOwnedLiability_CHK_DedType_PropDamPerAccDed,dataVal);
 	}
 	                            

 	
	/*****************************************
	 * End of  of Non Owned Liabilty Locators
	 ******************************************/
 	/*****************************************
 	 * Start of Ltd Contractual Liability Locators
 	 ******************************************/
 	public By LtdContrtactualLiability_BTN_Add =By.xpath("//div[contains(@id,'add-image')]");
 	public WebElement getLtdContrtactualLiability_BTN_Add()
 	{
 	se.element().waitForElement(LtdContrtactualLiability_BTN_Add);
 	return se.element().getElement(LtdContrtactualLiability_BTN_Add);
 	}
 	                            
 	public By LtdContrtactualLiability_BTN_Details;
 	public WebElement getLtdContrtactualLiability_BTN_Details(String dataVal)
 	{
 	LtdContrtactualLiability_BTN_Details =By.xpath("//div[contains(@id,'"+dataVal+"1opt_prv_ltd_cont_cov-image')]");
 	se.element().waitForElement(LtdContrtactualLiability_BTN_Details ,dataVal);
 	return se.element().getElement(LtdContrtactualLiability_BTN_Details,dataVal);
 	}
 	                            
 	public By LtdContrtactualLiability_BTN_Copy =By.xpath("//div[contains(@id,'copybutton-image')]");
 	public WebElement getLtdContrtactualLiability_BTN_Copy(String dataVal)
 	{
 	se.element().waitForElement(LtdContrtactualLiability_BTN_Copy ,dataVal);
 	return se.element().getElement(LtdContrtactualLiability_BTN_Copy,dataVal);
 	}
 	                            
 	public By LtdContrtactualLiability_BTN_Remove =By.xpath("//div[contains(@id,'delete-image')]");
 	public WebElement getLtdContrtactualLiability_BTN_Remove(String dataVal)
 	{
 	se.element().waitForElement(LtdContrtactualLiability_BTN_Remove ,dataVal);
 	return se.element().getElement(LtdContrtactualLiability_BTN_Remove,dataVal);
 	}
 	                            
 	public By LtdContrtactualLiability_BTN_Edit =By.xpath("//div[contains(@id,'editbutton-image')]");
 	public WebElement getLtdContrtactualLiability_BTN_Edit(String dataVal)
 	{
 	se.element().waitForElement(LtdContrtactualLiability_BTN_Edit ,dataVal);
 	return se.element().getElement(LtdContrtactualLiability_BTN_Edit,dataVal);
 	}
 	                            
 	public By LtdContrtactualLiability_BTN_Done =By.xpath("//div[contains(@id,'/-continue-image')]");
 	public WebElement getLtdContrtactualLiability_BTN_Done(String dataVal)
 	{
 	se.element().waitForElement(LtdContrtactualLiability_BTN_Done ,dataVal);
 	return se.element().getElement(LtdContrtactualLiability_BTN_Done,dataVal);
 	}
 	                            
 	public By LtdContrtactualLiability_TXT_Provisionsname =By.xpath("//input[contains(@id,'1provision_name-textbox')]");
 	public WebElement getLtdContrtactualLiability_TXT_Provisionsname(String dataVal)
 	{
 	se.element().waitForElement(LtdContrtactualLiability_TXT_Provisionsname ,dataVal);
 	return se.element().getElement(LtdContrtactualLiability_TXT_Provisionsname,dataVal);
 	}
 	                            
 	public By LtdContrtactualLiability_TXT_ProvisionsnameSearch =By.xpath("//input[contains(@id,'1provision_name-textbox')]/../div");
 	public WebElement getLtdContrtactualLiability_TXT_ProvisionsnameSearch(String dataVal)
 	{
 	se.element().waitForElement(LtdContrtactualLiability_TXT_ProvisionsnameSearch ,dataVal);
 	return se.element().getElement(LtdContrtactualLiability_TXT_ProvisionsnameSearch,dataVal);
 	}
 	                            
 	public By LtdContrtactualLiability_TXT_CoveragePart =By.xpath("//input[contains(@id,'1coverage_part-textbox')]");
 	public WebElement getLtdContrtactualLiability_TXT_CoveragePart(String dataVal)
 	{
 	se.element().waitForElement(LtdContrtactualLiability_TXT_CoveragePart ,dataVal);
 	return se.element().getElement(LtdContrtactualLiability_TXT_CoveragePart,dataVal);
 	}
 	                            
 	public By LtdContrtactualLiability_TXT_Form =By.xpath("//input[contains(@id,'1form-textbox')]");
 	public WebElement getLtdContrtactualLiability_TXT_Form(String dataVal)
 	{
 	se.element().waitForElement(LtdContrtactualLiability_TXT_Form ,dataVal);
 	return se.element().getElement(LtdContrtactualLiability_TXT_Form,dataVal);
 	}
 	                            
 	public By LtdContrtactualLiability_TXT_DesignatedContractOrAgreement =By.xpath("//input[contains(@id,'1desigcontroragremnt-textbox')]");
 	public WebElement getLtdContrtactualLiability_TXT_DesignatedContractOrAgreement(String dataVal)
 	{
 	se.element().waitForElement(LtdContrtactualLiability_TXT_DesignatedContractOrAgreement ,dataVal);
 	return se.element().getElement(LtdContrtactualLiability_TXT_DesignatedContractOrAgreement,dataVal);
 	}
 	public By CA_LtdContrtactualLiability_LabelName =By.xpath("//div[contains(@id,'opt_prv_ltd_cont_cov-label')]");
 	public WebElement getCA_LtdContrtactualLiability_LabelName()
 	{
 	se.element().waitForElement(CA_LtdContrtactualLiability_LabelName );
 	return se.element().getElement(CA_LtdContrtactualLiability_LabelName);
 	}                           

 	/*****************************************
 	 * End of Ltd Contractual Liability Locators
 	 ******************************************/
 	/*****************************************
 	 * Start of General Liability Exclusions Locators
 	 ******************************************/
 	public By GeneralLiabilityExclusions_BTN_Remove =By.xpath("//div[contains(@id,'delete-image')]");
 	public WebElement getGeneralLiabilityExclusions_BTN_Remove(String dataVal)
 	{
 	se.element().waitForElement(GeneralLiabilityExclusions_BTN_Remove ,dataVal);
 	return se.element().getElement(GeneralLiabilityExclusions_BTN_Remove,dataVal);
 	}
 	
 	public By GeneralLiabilityExclusions_BTN_Add =By.xpath("//div[contains(@id,'add-image')]");
 	public WebElement getGeneralLiabilityExclusions_BTN_Add()
 	{
 	se.element().waitForElement(GeneralLiabilityExclusions_BTN_Add);
 	return se.element().getElement(GeneralLiabilityExclusions_BTN_Add);
 	}
 	                            
 	public By GeneralLiabilityExclusions_BTN_Details;
 	public WebElement getGeneralLiabilityExclusions_BTN_Details(String dataVal)
 	{
 	GeneralLiabilityExclusions_BTN_Details =By.xpath("//div[contains(@id,'"+dataVal+"opt_prv_gen_liab_cov-image')]");
 	se.element().waitForElement(GeneralLiabilityExclusions_BTN_Details ,dataVal);
 	return se.element().getElement(GeneralLiabilityExclusions_BTN_Details,dataVal);
 	}
 	                            
 	public By GeneralLiabilityExclusions_TXT_Provisionsname =By.xpath("//input[contains(@id,'1provision_name-textbox')]");
 	public WebElement getGeneralLiabilityExclusions_TXT_Provisionsname(String dataVal)
 	{
 	se.element().waitForElement(GeneralLiabilityExclusions_TXT_Provisionsname ,dataVal);
 	return se.element().getElement(GeneralLiabilityExclusions_TXT_Provisionsname,dataVal);
 	}
 	                            
 	public By GeneralLiabilityExclusions_TXT_ProvisionsnameSearch =By.xpath("//input[contains(@id,'1provision_name-textbox')]/../div");
 	public WebElement getGeneralLiabilityExclusions_TXT_ProvisionsnameSearch(String dataVal)
 	{
 	se.element().waitForElement(GeneralLiabilityExclusions_TXT_ProvisionsnameSearch ,dataVal);
 	return se.element().getElement(GeneralLiabilityExclusions_TXT_ProvisionsnameSearch,dataVal);
 	}
 	                            
 	public By GeneralLiabilityExclusions_TXT_CoveragePart =By.xpath("//input[contains(@id,'1coverage_part-textbox')]");
 	public WebElement getGeneralLiabilityExclusions_TXT_CoveragePart(String dataVal)
 	{
 	se.element().waitForElement(GeneralLiabilityExclusions_TXT_CoveragePart ,dataVal);
 	return se.element().getElement(GeneralLiabilityExclusions_TXT_CoveragePart,dataVal);
 	}
 	                            
 	public By GeneralLiabilityExclusions_TXT_Form =By.xpath("//input[contains(@id,'1form-textbox')]");
 	public WebElement getGeneralLiabilityExclusions_TXT_Form(String dataVal)
 	{
 	se.element().waitForElement(GeneralLiabilityExclusions_TXT_Form ,dataVal);
 	return se.element().getElement(GeneralLiabilityExclusions_TXT_Form,dataVal);
 	}
 	                            
 	public By GeneralLiabilityExclusions_TXT_LocationsAndOperationsNotCovered =By.xpath("//input[contains(@id,'1loc_oper_not_covered_1-textbox')]");
 	public WebElement getGeneralLiabilityExclusions_TXT_LocationsAndOperationsNotCovered(String dataVal)
 	{
 	se.element().waitForElement(GeneralLiabilityExclusions_TXT_LocationsAndOperationsNotCovered ,dataVal);
 	return se.element().getElement(GeneralLiabilityExclusions_TXT_LocationsAndOperationsNotCovered,dataVal);
 	}
 	                            
 	public By GeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered1 =By.xpath("//input[contains(@id,'1loc_oper_not_covered_2-textbox')]");
 	public WebElement getGeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered1(String dataVal)
 	{
 	se.element().waitForElement(GeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered1 ,dataVal);
 	return se.element().getElement(GeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered1,dataVal);
 	}
 	                            
 	public By GeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered2 =By.xpath("//input[contains(@id,'1loc_oper_not_covered_3-textbox')]");
 	public WebElement getGeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered2(String dataVal)
 	{
 	se.element().waitForElement(GeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered2 ,dataVal);
 	return se.element().getElement(GeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered2,dataVal);
 	}
 	
 	public By CA_GeneralLiabilityExclusions_LabelName =By.xpath("//div[contains(@id,'opt_prv_gen_liab_cov-label')]");
 	public WebElement getCA_GeneralLiabilityExclusions_LabelName()
 	{
 	se.element().waitForElement(CA_GeneralLiabilityExclusions_LabelName );
 	return se.element().getElement(CA_GeneralLiabilityExclusions_LabelName);
 	}
 	                            
 	/*****************************************
 	 * End of General Liability Exclusions Locators
 	 ******************************************/
 	
 	/*****************************************
 	 * Start of Experience Rating Locators
 	 ******************************************/
 	
 	public By ExperienceRating_CHK_LiabilityExperienceRating =By.xpath("//span[contains(@id,'1is_liab_exp_rating-checkbox')]/input");
 	public WebElement getExperienceRating_CHK_LiabilityExperienceRating(String dataVal)
 	{
 	se.element().waitForElement(ExperienceRating_CHK_LiabilityExperienceRating ,dataVal);
 	return se.element().getElement(ExperienceRating_CHK_LiabilityExperienceRating,dataVal);
 	}
 	                            
 	public By ExperienceRating_CHK_MaturityOfTheLatestPolicy_18 =By.xpath("(//input[contains(@type,'radio')])[1]");
 	public WebElement getExperienceRating_CHK_MaturityOfTheLatestPolicy_18(String dataVal)
 	{
 	se.element().waitForElement(ExperienceRating_CHK_MaturityOfTheLatestPolicy_18 ,dataVal);
 	return se.element().getElement(ExperienceRating_CHK_MaturityOfTheLatestPolicy_18,dataVal);
 	}
 	                            
 	public By ExperienceRating_CHK_MaturityOfTheLatestPolicy_21 =By.xpath("(//input[contains(@type,'radio')])[2]");
 	public WebElement getExperienceRating_CHK_MaturityOfTheLatestPolicy_21(String dataVal)
 	{
 	se.element().waitForElement(ExperienceRating_CHK_MaturityOfTheLatestPolicy_21 ,dataVal);
 	return se.element().getElement(ExperienceRating_CHK_MaturityOfTheLatestPolicy_21,dataVal);
 	}
 	                            
 	public By ExperienceRating_CHK_MaturityOfTheLatestPolicy_24 =By.xpath("(//input[contains(@type,'radio')])[3]");
 	public WebElement getExperienceRating_CHK_MaturityOfTheLatestPolicy_24(String dataVal)
 	{
 	se.element().waitForElement(ExperienceRating_CHK_MaturityOfTheLatestPolicy_24 ,dataVal);
 	return se.element().getElement(ExperienceRating_CHK_MaturityOfTheLatestPolicy_24,dataVal);
 	}
 	                            
 	public By ExperienceRating_CHK_MaturityOfTheLatestPolicy_27 =By.xpath("(//input[contains(@type,'radio')])[4]");
 	public WebElement getExperienceRating_CHK_MaturityOfTheLatestPolicy_27(String dataVal)
 	{
 	se.element().waitForElement(ExperienceRating_CHK_MaturityOfTheLatestPolicy_27 ,dataVal);
 	return se.element().getElement(ExperienceRating_CHK_MaturityOfTheLatestPolicy_27,dataVal);
 	}
 	                            
 	public By ExperienceRating_CHK_PhysicalDamageExperienceRating =By.xpath("//span[contains(@id,'1is_phy_dam_exp_rating-checkbox')]/input");
 	public WebElement getExperienceRating_CHK_PhysicalDamageExperienceRating(String dataVal)
 	{
 	se.element().waitForElement(ExperienceRating_CHK_PhysicalDamageExperienceRating ,dataVal);
 	return se.element().getElement(ExperienceRating_CHK_PhysicalDamageExperienceRating,dataVal);
 	}
 	public By CA_ExperienceRating_LabelName =By.xpath("//div[contains(@id,'lob_ca_exp_rating-label')]");
 	public WebElement getCA_ExperienceRating_LabelName()
 	{
 	se.element().waitForElement(CA_ExperienceRating_LabelName );
 	return se.element().getElement(CA_ExperienceRating_LabelName);
 	}
 	
 	/*****************************************
 	 * End of Experience Rating Locators
 	 ******************************************/
 	
 	/*****************************************
 	 * Start of Liability Experience Rating Locators
 	 ******************************************/                         
 	public By LiabilityExperienceRating_CHK_NoClaims =By.xpath("//span[contains(@id,'1no_claims-checkbox')]/input");
 	public WebElement getLiabilityExperienceRating_CHK_NoClaims(String dataVal)
 	{
 	se.element().waitForElement(LiabilityExperienceRating_CHK_NoClaims ,dataVal);
 	return se.element().getElement(LiabilityExperienceRating_CHK_NoClaims,dataVal);
 	}
 	                            
 	public By LiabilityExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime =By.xpath("//span[contains(@id,'1c_is_loss_runs_na')]/input");
 	public WebElement getLiabilityExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime(String dataVal)
 	{
 	se.element().waitForElement(LiabilityExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime ,dataVal);
 	return se.element().getElement(LiabilityExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime,dataVal);
 	}
 	                            
 	public By LiabilityExperienceRating_CHK_ReorderLosses =By.xpath("//span[contains(@id,'1c_ca_reorder_losses-checkbox')]/input");
 	public WebElement getLiabilityExperienceRating_CHK_ReorderLosses(String dataVal)
 	{
 	se.element().waitForElement(LiabilityExperienceRating_CHK_ReorderLosses ,dataVal);
 	return se.element().getElement(LiabilityExperienceRating_CHK_ReorderLosses,dataVal);
 	}
 	                            
 	public By LiabilityExperienceRating_CHK_LossExperienceSelectRowNum =By.xpath("(//input[contains(@type,'checkbox')])[14]");
 	public WebElement getLiabilityExperienceRating_CHK_LossExperienceSelectRowNum(String dataVal)
 	{
 	se.element().waitForElement(LiabilityExperienceRating_CHK_LossExperienceSelectRowNum ,dataVal);
 	return se.element().getElement(LiabilityExperienceRating_CHK_LossExperienceSelectRowNum,dataVal);
 	}
 	                            
 	public By LiabilityExperienceRating_BTN_LossExperienceAdd =By.xpath("//div[contains(@id,'add-image')]");
 	public WebElement getLiabilityExperienceRating_BTN_LossExperienceAdd(String dataVal)
 	{
 	se.element().waitForElement(LiabilityExperienceRating_BTN_LossExperienceAdd ,dataVal);
 	return se.element().getElement(LiabilityExperienceRating_BTN_LossExperienceAdd,dataVal);
 	}
 	
 	public By LiabilityExperienceRating_BTN_LossExperienceRemove =By.xpath("(//div[contains(@id,'delete-image')])[2]");
 	public WebElement getLiabilityExperienceRating_BTN_LossExperienceRemove()
 	{
 	se.element().waitForElement(LiabilityExperienceRating_BTN_LossExperienceRemove);
 	return se.element().getElement(LiabilityExperienceRating_BTN_LossExperienceRemove);
 	}
 	                            
 	public By LiabilityExperienceRating_TXT_LossPeriod =By.xpath("//input[contains(@id,'1loss_period_no-textbox')]");
 	public WebElement getLiabilityExperienceRating_TXT_LossPeriod(String dataVal)
 	{
 	se.element().waitForElement(LiabilityExperienceRating_TXT_LossPeriod ,dataVal);
 	return se.element().getElement(LiabilityExperienceRating_TXT_LossPeriod,dataVal);
 	}
 	                            
 	public By LiabilityExperienceRating_TXT_LossPeriodSearch =By.xpath("//input[contains(@id,'1loss_period_no-textbox')]/../div");
 	public WebElement getLiabilityExperienceRating_TXT_LossPeriodSearch(String dataVal)
 	{
 	se.element().waitForElement(LiabilityExperienceRating_TXT_LossPeriodSearch ,dataVal);
 	return se.element().getElement(LiabilityExperienceRating_TXT_LossPeriodSearch,dataVal);
 	}
 	                            
 	public By LiabilityExperienceRating_TXT_DateofLoss =By.xpath("//div[contains(@id,'1loss_date-picker')]/input");
 	public WebElement getLiabilityExperienceRating_TXT_DateofLoss(String dataVal)
 	{
 	se.element().waitForElement(LiabilityExperienceRating_TXT_DateofLoss ,dataVal);
 	return se.element().getElement(LiabilityExperienceRating_TXT_DateofLoss,dataVal);
 	}
 	                            
 	public By LiabilityExperienceRating_TXT_IncurredLossAmount =By.xpath("//input[contains(@id,'1amount-textbox')]");
 	public WebElement getLiabilityExperienceRating_TXT_IncurredLossAmount(String dataVal)
 	{
 	se.element().waitForElement(LiabilityExperienceRating_TXT_IncurredLossAmount ,dataVal);
 	return se.element().getElement(LiabilityExperienceRating_TXT_IncurredLossAmount,dataVal);
 	}
 	                            
 	public By LiabilityExperienceRating_TXT_BasicLoss =By.xpath("//input[contains(@id,'1basic_loss-textbox')]");
 	public WebElement getLiabilityExperienceRating_TXT_BasicLoss(String dataVal)
 	{
 	se.element().waitForElement(LiabilityExperienceRating_TXT_BasicLoss ,dataVal);
 	return se.element().getElement(LiabilityExperienceRating_TXT_BasicLoss,dataVal);
 	}
 	                            
 	public By LiabilityExperienceRating_TXT_ALAE_Expenses =By.xpath("//input[contains(@id,'1alae_expenses-textbox')]");
 	public WebElement getLiabilityExperienceRating_TXT_ALAE_Expenses(String dataVal)
 	{
 	se.element().waitForElement(LiabilityExperienceRating_TXT_ALAE_Expenses ,dataVal);
 	return se.element().getElement(LiabilityExperienceRating_TXT_ALAE_Expenses,dataVal);
 	}
 	                            
 	public By LiabilityExperienceRating_TXT_SubjectLoss =By.xpath("//input[contains(@id,'1subject_loss-textbox')]");
 	public WebElement getLiabilityExperienceRating_TXT_SubjectLoss(String dataVal)
 	{
 	se.element().waitForElement(LiabilityExperienceRating_TXT_SubjectLoss ,dataVal);
 	return se.element().getElement(LiabilityExperienceRating_TXT_SubjectLoss,dataVal);
 	}
 	                            
 	public By LiabilityExperienceRating_BTN_UpdateFactors =By.xpath("//div[contains(@id,'updatefactors-image')]");
 	public WebElement getLiabilityExperienceRating_BTN_UpdateFactors(String dataVal)
 	{
 	se.element().waitForElement(LiabilityExperienceRating_BTN_UpdateFactors ,dataVal);
 	return se.element().getElement(LiabilityExperienceRating_BTN_UpdateFactors,dataVal);
 	}
 	public By CA_LiabilityExperienceRating_LabelName =By.xpath("(//div[contains(@id,'liab_exp_rating-label')])[1]");
 	public WebElement getCA_LiabilityExperienceRating_LabelName()
 	{
 	se.element().waitForElement(CA_LiabilityExperienceRating_LabelName );
 	return se.element().getElement(CA_LiabilityExperienceRating_LabelName);
 	}
 	
 	
 	
 	/*****************************************
 	 * End of Liability Experience Rating Locators
 	 ******************************************/
 	
 	/*****************************************
 	 * Start of Physical Damage Experience Rating Locators
 	 ******************************************/ 
 	public By CA_PhysicalDamageExperienceRating_LabelName =By.xpath("//div[contains(@id,'phy_dam_exp_rating-label')]");
 	public WebElement getCA_PhysicalDamageExperienceRating_LabelName()
 	{
 	se.element().waitForElement(CA_PhysicalDamageExperienceRating_LabelName );
 	return se.element().getElement(CA_PhysicalDamageExperienceRating_LabelName);
 	}
 	
 	public By PhysicalDamageExperienceRating_CHK_NoClaims =By.xpath("//span[contains(@id,'1no_claims-checkbox')]/input");
 	public WebElement getPhysicalDamageExperienceRating_CHK_NoClaims(String dataVal)
 	{
 	se.element().waitForElement(PhysicalDamageExperienceRating_CHK_NoClaims ,dataVal);
 	return se.element().getElement(PhysicalDamageExperienceRating_CHK_NoClaims,dataVal);
 	}
 	                            
 	public By PhysicalDamageExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime =By.xpath("//span[contains(@id,'1c_is_loss_runs_na-checkbox')]/input");
 	public WebElement getPhysicalDamageExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime(String dataVal)
 	{
 	se.element().waitForElement(PhysicalDamageExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime ,dataVal);
 	return se.element().getElement(PhysicalDamageExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime,dataVal);
 	}
 	                            
 	public By PhysicalDamageExperienceRating_CHK_LossExperienceSelectRowNum =By.xpath("(//input[contains(@type,'checkbox')])[13]");
 	public WebElement getPhysicalDamageExperienceRating_CHK_LossExperienceSelectRowNum(String dataVal)
 	{
 	se.element().waitForElement(PhysicalDamageExperienceRating_CHK_LossExperienceSelectRowNum ,dataVal);
 	return se.element().getElement(PhysicalDamageExperienceRating_CHK_LossExperienceSelectRowNum,dataVal);
 	}
 	                            
 	public By PhysicalDamageExperienceRating_BTN_LossExperienceAdd =By.xpath("//div[contains(@id,'add-image')]");
 	public WebElement getPhysicalDamageExperienceRating_BTN_LossExperienceAdd(String dataVal)
 	{
 	se.element().waitForElement(PhysicalDamageExperienceRating_BTN_LossExperienceAdd ,dataVal);
 	return se.element().getElement(PhysicalDamageExperienceRating_BTN_LossExperienceAdd,dataVal);
 	}
 	
 	public By PhysicalDamageExperienceRating_BTN_LossExperienceRemove =By.xpath("(//div[contains(@id,'delete-image')])[2]");
 	public WebElement getPhysicalDamageExperienceRating_BTN_LossExperienceRemove()
 	{
 	se.element().waitForElement(PhysicalDamageExperienceRating_BTN_LossExperienceRemove);
 	return se.element().getElement(PhysicalDamageExperienceRating_BTN_LossExperienceRemove);
 	}
 	                            
 	public By PhysicalDamageExperienceRating_TXT_LossPeriod =By.xpath("//input[contains(@id,'1loss_period_no-textbox')]");
 	public WebElement getPhysicalDamageExperienceRating_TXT_LossPeriod(String dataVal)
 	{
 	se.element().waitForElement(PhysicalDamageExperienceRating_TXT_LossPeriod ,dataVal);
 	return se.element().getElement(PhysicalDamageExperienceRating_TXT_LossPeriod,dataVal);
 	}
 	                            
 	public By PhysicalDamageExperienceRating_TXT_LossPeriodSearch =By.xpath("//input[contains(@id,'1loss_period_no-textbox')]/../div");
 	public WebElement getPhysicalDamageExperienceRating_TXT_LossPeriodSearch(String dataVal)
 	{
 	se.element().waitForElement(PhysicalDamageExperienceRating_TXT_LossPeriodSearch ,dataVal);
 	return se.element().getElement(PhysicalDamageExperienceRating_TXT_LossPeriodSearch,dataVal);
 	}
 	                            
 	public By PhysicalDamageExperienceRating_TXT_DateofLoss =By.xpath("//div[contains(@id,'1loss_date-picker')]/input");
 	public WebElement getPhysicalDamageExperienceRating_TXT_DateofLoss(String dataVal)
 	{
 	se.element().waitForElement(PhysicalDamageExperienceRating_TXT_DateofLoss ,dataVal);
 	return se.element().getElement(PhysicalDamageExperienceRating_TXT_DateofLoss,dataVal);
 	}
 	                            
 	public By PhysicalDamageExperienceRating_TXT_IncurredLossAmount =By.xpath("//input[contains(@id,'1amount-textbox')]");
 	public WebElement getPhysicalDamageExperienceRating_TXT_IncurredLossAmount(String dataVal)
 	{
 	se.element().waitForElement(PhysicalDamageExperienceRating_TXT_IncurredLossAmount ,dataVal);
 	return se.element().getElement(PhysicalDamageExperienceRating_TXT_IncurredLossAmount,dataVal);
 	}
 	                            
 	public By PhysicalDamageExperienceRating_TXT_SubjectLoss =By.xpath("//input[contains(@id,'1subject_loss-textbox')]");
 	public WebElement getPhysicalDamageExperienceRating_TXT_SubjectLoss(String dataVal)
 	{
 	se.element().waitForElement(PhysicalDamageExperienceRating_TXT_SubjectLoss ,dataVal);
 	return se.element().getElement(PhysicalDamageExperienceRating_TXT_SubjectLoss,dataVal);
 	}
 	                            
 	public By PhysicalDamageExperienceRating_BTN_UpdateFactors =By.xpath("//div[contains(@id,'updatefactors-image')]");
 	public WebElement getPhysicalDamageExperienceRating_BTN_UpdateFactors(String dataVal)
 	{
 	se.element().waitForElement(PhysicalDamageExperienceRating_BTN_UpdateFactors ,dataVal);
 	return se.element().getElement(PhysicalDamageExperienceRating_BTN_UpdateFactors,dataVal);
 	}
 	/*****************************************
 	 * End of Physical Damage Experience Rating Locators
 	 ******************************************/
 	/*****************************************
 	 * Start of Miscellaneous Options Locators
 	 ******************************************/                           
 	public By MiscellaneousOptions_CHK_Applicable =By.xpath("//span[contains(@id,'1applicable-checkbox')]/input");
 	public WebElement getMiscellaneousOptions_CHK_Applicable(String dataVal)
 	{
 	se.element().waitForElement(MiscellaneousOptions_CHK_Applicable ,dataVal);
 	return se.element().getElement(MiscellaneousOptions_CHK_Applicable,dataVal);
 	}
 	                            
 	public By MiscellaneousOptions_TXT_AmendmentOfDefOfPollutants =By.xpath("//textarea[contains(@id,'1amend_of_def_of_poll-textarea')]");
 	public WebElement getMiscellaneousOptions_TXT_AmendmentOfDefOfPollutants(String dataVal)
 	{
 	se.element().waitForElement(MiscellaneousOptions_TXT_AmendmentOfDefOfPollutants ,dataVal);
 	return se.element().getElement(MiscellaneousOptions_TXT_AmendmentOfDefOfPollutants,dataVal);
 	}
 	
 	public By CA_MiscellaneousOptions_LabelName =By.xpath("//div[contains(@id,'ca_misc_info-label')]");
 	public WebElement getMiscellaneousOptions_LabelName()
 	{
 	se.element().waitForElement(CA_MiscellaneousOptions_LabelName );
 	return se.element().getElement(CA_MiscellaneousOptions_LabelName);
 	}
 	                            
 	/*****************************************
 	 * End of Miscellaneous Options Locators
 	 ******************************************/
 	
 	/*****************************************
 	 * Start of Leased Workers Coverage Locators
 	 ******************************************/
 	public By LeasedWorkersCov_TXT_AnnualPremium =By.xpath("//input[contains(@id,'1manual_premium-textbox')]");
 	public WebElement getLeasedWorkersCov_TXT_AnnualPremium(String dataVal)
 	{
 	se.element().waitForElement(LeasedWorkersCov_TXT_AnnualPremium ,dataVal);
 	return se.element().getElement(LeasedWorkersCov_TXT_AnnualPremium,dataVal);
 	}
 	public By CA_LeasedWorkersCoverage_LabelName =By.xpath("//div[contains(@id,'leased_workers_cov-label')]");
 	public WebElement getCA_LeasedWorkersCoverage_LabelName()
 	{
 	se.element().waitForElement(CA_LeasedWorkersCoverage_LabelName );
 	return se.element().getElement(CA_LeasedWorkersCoverage_LabelName);
 	}
 	/*****************************************
 	 * End of Leased Workers Coverage Locators
 	 ******************************************/
 	
 	/*****************************************
 	 * Start of Limited Mexico Coverage Locators
 	 ******************************************/
 	public By CA_LTDMexico_LBL_LabelName=By.xpath("//div[contains(@id,'limited_mexico_cov-label')]");
 	public WebElement getCA_CA_LTDMexico_LBL_LabelName()
 	{
 	se.element().waitForElement(CA_LTDMexico_LBL_LabelName );
 	return se.element().getElement(CA_LTDMexico_LBL_LabelName);
 	}
 	public By LTDMexico_BTN_Add =By.xpath("//div[contains(@id,'add-image')]");
 	public WebElement getLTDMexico_BTN_Add()
 	{
 	se.element().waitForElement(LTDMexico_BTN_Add);
 	return se.element().getElement(LTDMexico_BTN_Add);
 	}
 	public By LTDMexico_BTN_Remove =By.xpath("//div[contains(@id,'delete-image')]");
 	public WebElement getLTDMexico_BTN_Remove()
 	{
 	se.element().waitForElement(LTDMexico_BTN_Remove);
 	return se.element().getElement(LTDMexico_BTN_Remove);
 	}                          
 	public By LTDMexico_BTN_Details;
 	public WebElement getLTDMexico_BTN_Details(String dataVal)
 	{
 	LTDMexico_BTN_Details =By.xpath("//div[contains(@id,'"+dataVal+"limited_mexico_cov-image')]");
 	se.element().waitForElement(LTDMexico_BTN_Details ,dataVal);
 	return se.element().getElement(LTDMexico_BTN_Details,dataVal);
 	}
 	                            
 	public By LTDMexico_TXT_State =By.xpath("//input[contains(@id,'1state-textbox')]");
 	public WebElement getLTDMexico_TXT_State(String dataVal)
 	{
 	se.element().waitForElement(LTDMexico_TXT_State ,dataVal);
 	return se.element().getElement(LTDMexico_TXT_State,dataVal);
 	}
 	                            
 	public By LTDMexico_TXT_StateSearch =By.xpath("//input[contains(@id,'1state-textbox')]/../div");
 	public WebElement getLTDMexico_TXT_StateSearch(String dataVal)
 	{
 	se.element().waitForElement(LTDMexico_TXT_StateSearch ,dataVal);
 	return se.element().getElement(LTDMexico_TXT_StateSearch,dataVal);
 	}
 	                            
 	public By LTDMexico_TXT_AnnualPremiumSearch =By.xpath("//input[contains(@id,'1manual_premium-textbox')]/../div[1]");
 	public WebElement getLTDMexico_TXT_AnnualPremiumSearch(String dataVal)
 	{
 	se.element().waitForElement(LTDMexico_TXT_AnnualPremiumSearch ,dataVal);
 	return se.element().getElement(LTDMexico_TXT_AnnualPremiumSearch,dataVal);
 	}
 	                            
 	public By LTDMexico_TXT_AnnualPremium =By.xpath("//input[contains(@id,'1manual_premium-textbox')]");
 	public WebElement getLTDMexico_TXT_AnnualPremium(String dataVal)
 	{
 	se.element().waitForElement(LTDMexico_TXT_AnnualPremium ,dataVal);
 	return se.element().getElement(LTDMexico_TXT_AnnualPremium,dataVal);
 	}
 	/*****************************************
 	 * End of Limited Mexico Coverage Locators
 	 ******************************************/
 	/*****************************************
 	 * Start of Limited Mexico Coverage Locators
 	 ******************************************/
 	public By OptionalProvisions_CHK_AutoDealerCovExclusion_Yes =By.xpath("(//span[text()='Auto Dealer Coverage Exclusions']/.././../..//td//input)[1]");
 	public WebElement getOptionalProvisions_CHK_AutoDealerCovExclusion_Yes(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_AutoDealerCovExclusion_Yes ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_AutoDealerCovExclusion_Yes,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_AutoDealerCovExclusion_No =By.xpath("(//span[text()='Auto Dealer Coverage Exclusions']/.././../..//td//input)[2]");
 	public WebElement getOptionalProvisions_CHK_AutoDealerCovExclusion_No(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_AutoDealerCovExclusion_No ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_AutoDealerCovExclusion_No,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_ActsErrorsandOmissionsLiability_Yes =By.xpath("(//span[text()='Acts Errors and Omissions Liability']/.././../..//td//input)[1]");
 	public WebElement getOptionalProvisions_CHK_ActsErrorsandOmissionsLiability_Yes(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_ActsErrorsandOmissionsLiability_Yes ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_ActsErrorsandOmissionsLiability_Yes,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_ActsErrorsandOmissionsLiability_No =By.xpath("(//span[text()='Acts Errors and Omissions Liability']/.././../..//td//input)[2]");
 	public WebElement getOptionalProvisions_CHK_ActsErrorsandOmissionsLiability_No(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_ActsErrorsandOmissionsLiability_No ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_ActsErrorsandOmissionsLiability_No,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_GeneralLiabExclusions_Yes =By.xpath("(//span[text()='General Liability Exclusions']/.././../..//td//input)[1]");
 	public WebElement getOptionalProvisions_CHK_GeneralLiabExclusions_Yes(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_GeneralLiabExclusions_Yes ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_GeneralLiabExclusions_Yes,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_GeneralLiabExclusions_No =By.xpath("(//span[text()='General Liability Exclusions']/.././../..//td//input)[2]");
 	public WebElement getOptionalProvisions_CHK_GeneralLiabExclusions_No(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_GeneralLiabExclusions_No ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_GeneralLiabExclusions_No,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_ExpandedGLCovTerritory_Yes =By.xpath("(//span[text()='Expanded General Liability Coverage Territory']/.././../..//td//input)[1]");
 	public WebElement getOptionalProvisions_CHK_ExpandedGLCovTerritory_Yes(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_ExpandedGLCovTerritory_Yes ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_ExpandedGLCovTerritory_Yes,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_ExpandedGLCovTerritory_No =By.xpath("(//span[text()='Expanded General Liability Coverage Territory']/.././../..//td//input)[2]");
 	public WebElement getOptionalProvisions_CHK_ExpandedGLCovTerritory_No(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_ExpandedGLCovTerritory_No ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_ExpandedGLCovTerritory_No,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_Yes =By.xpath("(//span[text()='Limited Contractual Liability Coverage for Personal and Advertising Injury']/.././../..//td//input)[1]");
 	public WebElement getOptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_Yes(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_Yes ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_Yes,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_No =By.xpath("(//span[text()='Limited Contractual Liability Coverage for Personal and Advertising Injury']/.././../..//td//input)[2]");
 	public WebElement getOptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_No(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_No ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_No,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_AggLimitsForGLCov_Yes =By.xpath("(//span[text()='Aggregate Limits for General Liability Coverages']/.././../..//td//input)[1]");
 	public WebElement getOptionalProvisions_CHK_AggLimitsForGLCov_Yes(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_AggLimitsForGLCov_Yes ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_AggLimitsForGLCov_Yes,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_AggLimitsForGLCov_No =By.xpath("(//span[text()='Aggregate Limits for General Liability Coverages']/.././../..//td//input)[2]");
 	public WebElement getOptionalProvisions_CHK_AggLimitsForGLCov_No(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_AggLimitsForGLCov_No ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_AggLimitsForGLCov_No,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_EmpBenefitsLiab_Yes =By.xpath("(//span[text()='Employee Benefits Liability']/.././../..//td//input)[1]");
 	public WebElement getOptionalProvisions_CHK_EmpBenefitsLiab_Yes(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_EmpBenefitsLiab_Yes ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_EmpBenefitsLiab_Yes,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_EmpBenefitsLiab_No =By.xpath("(//span[text()='Employee Benefits Liability']/.././../..//td//input)[2]");
 	public WebElement getOptionalProvisions_CHK_EmpBenefitsLiab_No(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_EmpBenefitsLiab_No ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_EmpBenefitsLiab_No,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_LimitedProdWithdrawalExp_Yes =By.xpath("(//span[text()='Limited Product Withdrawal Expense']/.././../..//td//input)[1]");
 	public WebElement getOptionalProvisions_CHK_LimitedProdWithdrawalExp_Yes(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_LimitedProdWithdrawalExp_Yes ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_LimitedProdWithdrawalExp_Yes,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_LimitedProdWithdrawalExp_No =By.xpath("(//span[text()='Limited Product Withdrawal Expense']/.././../..//td//input)[2]");
 	public WebElement getOptionalProvisions_CHK_LimitedProdWithdrawalExp_No(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_LimitedProdWithdrawalExp_No ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_LimitedProdWithdrawalExp_No,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_SpecialProvForClaimsMadeCov_Yes =By.xpath("(//span[text()='Special Provisions for Claims Made Coverages']/.././../..//td//input)[1]");
 	public WebElement getOptionalProvisions_CHK_SpecialProvForClaimsMadeCov_Yes(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_SpecialProvForClaimsMadeCov_Yes ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_SpecialProvForClaimsMadeCov_Yes,dataVal);
 	}
 	                            
 	public By OptionalProvisions_CHK_SpecialProvForClaimsMadeCov_No =By.xpath("(//span[text()='Special Provisions for Claims Made Coverages']/.././../..//td//input)[2]");
 	public WebElement getOptionalProvisions_CHK_SpecialProvForClaimsMadeCov_No(String dataVal)
 	{
 	se.element().waitForElement(OptionalProvisions_CHK_SpecialProvForClaimsMadeCov_No ,dataVal);
 	return se.element().getElement(OptionalProvisions_CHK_SpecialProvForClaimsMadeCov_No,dataVal);
 	}
 	
 	public By CA_OptionalProvisions_LabelName =By.xpath("//div[contains(@id,'ca_optnl_prov-label')]");
 	public WebElement getCA_OptionalProvisions_LabelName()
 	{
 	se.element().waitForElement(CA_OptionalProvisions_LabelName );
 	return se.element().getElement(CA_OptionalProvisions_LabelName);
 	}
 	                            

 	/*****************************************
 	 * End of Limited Mexico Coverage Locators
 	 ******************************************/
 	/*****************************************
 	 * Start of Drive Away Contractors Liability Locators
 	 ******************************************/
 	
 	public By DriveAwayContractorsLiability_BTN_Add =By.xpath("//div[contains(@id,'add-image')]");
 	public WebElement getDriveAwayContractorsLiability_BTN_Add()
 	{
 	se.element().waitForElement(DriveAwayContractorsLiability_BTN_Add);
 	return se.element().getElement(DriveAwayContractorsLiability_BTN_Add);
 	}
 	                            
 	public By DriveAwayContractorsLiability_BTN_RemoveCov =By.xpath("//div[contains(@id,'delete-image')]");
 	public WebElement getDriveAwayContractorsLiability_BTN_RemoveCov()
 	{
 	se.element().waitForElement(DriveAwayContractorsLiability_BTN_RemoveCov);
 	return se.element().getElement(DriveAwayContractorsLiability_BTN_RemoveCov);
 	}
 	                            
 	public By DriveAwayContractorsLiability_BTN_Details;
 	public WebElement getDriveAwayContractorsLiability_BTN_Details(String dataVal)
 	{
 	DriveAwayContractorsLiability_BTN_Details =By.xpath("//div[contains(@id,'"+dataVal+"drive_away_contr_cov-image')]");
 	se.element().waitForElement(DriveAwayContractorsLiability_BTN_Details ,dataVal);
 	return se.element().getElement(DriveAwayContractorsLiability_BTN_Details,dataVal);
 	}
 	 	                            
 	public By DriveAwayContractorsLiability_TXT_State =By.xpath("//input[contains(@id,'1state-textbox')]");
 	public WebElement getDriveAwayContractorsLiability_TXT_State(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayContractorsLiability_TXT_State ,dataVal);
 	return se.element().getElement(DriveAwayContractorsLiability_TXT_State,dataVal);
 	}
 	                            
 	public By DriveAwayContractorsLiability_TXT_StateSearch =By.xpath("//input[contains(@id,'1state-textbox')]/../div");
 	public WebElement getDriveAwayContractorsLiability_TXT_StateSearch(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayContractorsLiability_TXT_StateSearch ,dataVal);
 	return se.element().getElement(DriveAwayContractorsLiability_TXT_StateSearch,dataVal);
 	}
 	                            
 	public By DriveAwayContractorsLiability_TXT_Territory =By.xpath("//input[contains(@id,'1territory_code-textbox')]");
 	public WebElement getDriveAwayContractorsLiability_TXT_Territory(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayContractorsLiability_TXT_Territory ,dataVal);
 	return se.element().getElement(DriveAwayContractorsLiability_TXT_Territory,dataVal);
 	}
 	                            
 	public By DriveAwayContractorsLiability_TXT_DescriptionOfPlates =By.xpath("//textarea[contains(@id,'1plates_description-textarea')]");
 	public WebElement getDriveAwayContractorsLiability_TXT_DescriptionOfPlates(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayContractorsLiability_TXT_DescriptionOfPlates ,dataVal);
 	return se.element().getElement(DriveAwayContractorsLiability_TXT_DescriptionOfPlates,dataVal);
 	}
 	                            
 	public By DriveAwayContractorsLiability_TXT_CombinedSingleLimit =By.xpath("//input[contains(@id,'1combined_single_limit_disp-textbox')]");
 	public WebElement getDriveAwayContractorsLiability_TXT_CombinedSingleLimit(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayContractorsLiability_TXT_CombinedSingleLimit ,dataVal);
 	return se.element().getElement(DriveAwayContractorsLiability_TXT_CombinedSingleLimit,dataVal);
 	}
 	                            
 	public By DriveAwayContractorsLiability_TXT_Deductible =By.xpath("//input[contains(@id,'1deductible-textbox')]");
 	public WebElement getDriveAwayContractorsLiability_TXT_Deductible(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayContractorsLiability_TXT_Deductible ,dataVal);
 	return se.element().getElement(DriveAwayContractorsLiability_TXT_Deductible,dataVal);
 	}
 	                            
 	public By DriveAwayContractorsLiability_TXT_NumberOfPlates =By.xpath("//input[contains(@id,'1number_of_plates-textbox')]");
 	public WebElement getDriveAwayContractorsLiability_TXT_NumberOfPlates(String dataVal)
 	{
 	se.element().waitForElement(DriveAwayContractorsLiability_TXT_NumberOfPlates ,dataVal);
 	return se.element().getElement(DriveAwayContractorsLiability_TXT_NumberOfPlates,dataVal);
 	}
 	
 	public By CA_DriveAwayContractorsLiability_LabelName =By.xpath("//div[contains(@id,'drive_away_contr_cov-label')]");
 	public WebElement getCA_DriveAwayContractorsLiability_LabelName()
 	{
 	se.element().waitForElement(CA_DriveAwayContractorsLiability_LabelName );
 	return se.element().getElement(CA_DriveAwayContractorsLiability_LabelName);
 	}
 	/*****************************************
 	 * End of Drive Away Contractors Liability Locators
 	 ******************************************/
 	/*****************************************
 	 * Start of Financial Responsibility Filing Locators
 	 ******************************************/
 	public By CA_FinancialResponsibilityFiling_LabelName =By.xpath("//div[contains(@id,'fin_resp_filing_cov-label')]");
 	public WebElement getCA_FinancialResponsibilityFiling_LabelName()
 	{
 	se.element().waitForElement(CA_FinancialResponsibilityFiling_LabelName );
 	return se.element().getElement(CA_FinancialResponsibilityFiling_LabelName);
 	}
 	
 	public By FinancialResponsibilityFiling_BTN_Add =By.xpath("//div[contains(@id,'add-image')]");
 	public WebElement getFinancialResponsibilityFiling_BTN_Add()
 	{
 	se.element().waitForElement(FinancialResponsibilityFiling_BTN_Add);
 	return se.element().getElement(FinancialResponsibilityFiling_BTN_Add);
 	}
 	                            
 	public By FinancialResponsibilityFiling_BTN_RemoveCov =By.xpath("//div[contains(@id,'delete-image')]");
 	public WebElement getFinancialResponsibilityFiling_BTN_RemoveCov()
 	{
 	se.element().waitForElement(FinancialResponsibilityFiling_BTN_RemoveCov);
 	return se.element().getElement(FinancialResponsibilityFiling_BTN_RemoveCov);
 	}
 	                            
 	public By FinancialResponsibilityFiling_BTN_Details;
 	public WebElement getFinancialResponsibilityFiling_BTN_Details(String dataVal)
 	{
 	FinancialResponsibilityFiling_BTN_Details =By.xpath("//div[contains(@id,'"+dataVal+"fin_resp_filing_cov-image')]");
 	se.element().waitForElement(FinancialResponsibilityFiling_BTN_Details);
 	return se.element().getElement(FinancialResponsibilityFiling_BTN_Details);
 	}
 	                            
 	public By FinancialResponsibilityFiling_TXT_State =By.xpath("//input[contains(@id,'1state-textbox')]");
 	public WebElement getFinancialResponsibilityFiling_TXT_State(String dataVal)
 	{
 	se.element().waitForElement(FinancialResponsibilityFiling_TXT_State ,dataVal);
 	return se.element().getElement(FinancialResponsibilityFiling_TXT_State,dataVal);
 	}
 	                            
 	public By FinancialResponsibilityFiling_TXT_StateSearch =By.xpath("//input[contains(@id,'1state-textbox')]/../div");
 	public WebElement getFinancialResponsibilityFiling_TXT_StateSearch(String dataVal)
 	{
 	se.element().waitForElement(FinancialResponsibilityFiling_TXT_StateSearch ,dataVal);
 	return se.element().getElement(FinancialResponsibilityFiling_TXT_StateSearch,dataVal);
 	}
 	                            
 	public By FinancialResponsibilityFiling_TXT_FilingReason =By.xpath("//input[contains(@id,'1reason-textbox')]");
 	public WebElement getFinancialResponsibilityFiling_TXT_FilingReason(String dataVal)
 	{
 	se.element().waitForElement(FinancialResponsibilityFiling_TXT_FilingReason ,dataVal);
 	return se.element().getElement(FinancialResponsibilityFiling_TXT_FilingReason,dataVal);
 	}
 	                            
 	public By FinancialResponsibilityFiling_TXT_FilingReasonSearch =By.xpath("//input[contains(@id,'1reason-textbox')]/../div");
 	public WebElement getFinancialResponsibilityFiling_TXT_FilingReasonSearch(String dataVal)
 	{
 	se.element().waitForElement(FinancialResponsibilityFiling_TXT_FilingReasonSearch ,dataVal);
 	return se.element().getElement(FinancialResponsibilityFiling_TXT_FilingReasonSearch,dataVal);
 	}
 	                            
 	public By FinancialResponsibilityFiling_LabelName =By.xpath("//div[contains(@id,'fin_resp_filing_cov-label')]");
 	public WebElement getFinancialResponsibilityFiling_LabelName(String dataVal)
 	{
 	se.element().waitForElement(FinancialResponsibilityFiling_LabelName ,dataVal);
 	return se.element().getElement(FinancialResponsibilityFiling_LabelName,dataVal);
 	}
 	                            
 	/*****************************************
 	 * End of Financial Responsibility Filing Locators
 	 ******************************************/
 	/*****************************************
 	 * Start of Rental Vehicle Coverage Locators
 	 ******************************************/
 	public By RentalVehicle_BTN_Add =By.xpath("//*[contains(@id,'add-image')]");
 	public WebElement getRentalVehicle_BTN_Add()
 	{
 	se.element().waitForElement(RentalVehicle_BTN_Add);
 	return se.element().getElement(RentalVehicle_BTN_Add);
 	}
 	                            
 	public By RentalVehicle_BTN_Remove =By.xpath("//div[contains(@id,'delete-image')]");
 	public WebElement getRentalVehicle_BTN_Remove()
 	{
 	se.element().waitForElement(RentalVehicle_BTN_Remove);
 	return se.element().getElement(RentalVehicle_BTN_Remove);
 	}
 	                            
 	public By RentalVehicle_BTN_Details;
 	public WebElement getRentalVehicle_BTN_Details(String dataVal)
 	{
 	RentalVehicle_BTN_Details =By.xpath("//div[contains(@id,'"+dataVal+"rental_vehicle_cov-image')]");
 	se.element().waitForElement(RentalVehicle_BTN_Details);
 	return se.element().getElement(RentalVehicle_BTN_Details);
 	}
 	                            
 	public By RentalVehicle_TXT_StateSearch =By.xpath("//input[contains(@id,'1state-textbox')]/../div");
 	public WebElement getRentalVehicle_TXT_StateSearch(String dataVal)
 	{
 	se.element().waitForElement(RentalVehicle_TXT_StateSearch ,dataVal);
 	return se.element().getElement(RentalVehicle_TXT_StateSearch,dataVal);
 	}
 	                            
 	public By RentalVehicle_TXT_State =By.xpath("//input[contains(@id,'1state-textbox')]");
 	public WebElement getRentalVehicle_TXT_State(String dataVal)
 	{
 	se.element().waitForElement(RentalVehicle_TXT_State ,dataVal);
 	return se.element().getElement(RentalVehicle_TXT_State,dataVal);
 	}
 	
 	public By CA_RentalVehicleCoverage_LabelName =By.xpath("//div[contains(@id,'rental_vehicle_cov-label')]");
 	public WebElement getCA_RentalVehicleCoverage_LabelName()
 	{
 	se.element().waitForElement(CA_RentalVehicleCoverage_LabelName );
 	return se.element().getElement(CA_RentalVehicleCoverage_LabelName);
 	}
 	/*****************************************
 	 * End of Rental Vehicle Coverage Locators
 	 ******************************************/
 	
    
/*******************************************
* Start of CA Trailer Interchange page locators
********************************************/
 	public By TrailerInterchange_BTN_Label = By.xpath("//*[contains(@id,'trailer_interchange_cov-label')]");
	
	public WebElement getTrailerInterchange_BTN_Label()
	{
	se.element().waitForElement(TrailerInterchange_BTN_Label);
	return se.element().getElement(TrailerInterchange_BTN_Label);
	}
 	
 	
	public By TrailerInterchange_BTN_Add =By.id("3577ab83-553e-3fc3-b55b-35eec1781346-add-image");
	public WebElement getTrailerInterchange_BTN_Add(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_BTN_Add ,dataVal);
	return se.element().getElement(TrailerInterchange_BTN_Add,dataVal);
	}
	                            
	public By TrailerInterchange_BTN_Details;
	public WebElement getTrailerInterchange_BTN_Details(String dataVal)
	{
		TrailerInterchange_BTN_Details =By.xpath("//div[contains(@id,'"+dataVal+"trailer_interchange_cov-image')]");
	se.element().waitForElement(TrailerInterchange_BTN_Details ,dataVal);
	return se.element().getElement(TrailerInterchange_BTN_Details,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_RefNumber =By.id("field_key$0a99e0da-7b99-33c2-902e-6c26bc3ee917$1reference_number-textbox");
	public WebElement getTrailerInterchange_TXT_RefNumber(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_RefNumber ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_RefNumber,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_Description =By.id("field_key$45c7628f-52c8-3ead-aeee-f9eeae73c817$1description-textarea");
	public WebElement getTrailerInterchange_TXT_Description(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_Description ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_Description,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_State =By.id("field_key$38598551-c855-34ae-bd4a-e87a598a7661$1state-textbox");
	public WebElement getTrailerInterchange_TXT_State(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_State ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_State,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_NumberOfTrailers =By.id("field_key$751ca3c9-6e48-3596-85fb-904442e20282$1number_of_trailers-textbox");
	public WebElement getTrailerInterchange_TXT_NumberOfTrailers(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_NumberOfTrailers ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_NumberOfTrailers,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_NumberOfDaysForCov =By.id("field_key$fb33ff70-731e-3882-b9a9-4859efd81c0b$1number_of_days_for_cov-textbox");
	public WebElement getTrailerInterchange_TXT_NumberOfDaysForCov(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_NumberOfDaysForCov ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_NumberOfDaysForCov,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_Radius =By.id("field_key$d293353d-8126-3035-ab5a-f5bf95e25210$1radius-textbox");
	public WebElement getTrailerInterchange_TXT_Radius(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_Radius ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_Radius,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_RadiusSearch =By.xpath("//input[@id='field_key$d293353d-8126-3035-ab5a-f5bf95e25210$1radius-textbox']/../div");
	public WebElement getTrailerInterchange_TXT_RadiusSearch(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_RadiusSearch ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_RadiusSearch,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_MetroOrRegional =By.id("field_key$80f6da87-a526-367e-881e-91f50cf0539c$1metropolitan_or_regional-textbox");
	public WebElement getTrailerInterchange_TXT_MetroOrRegional(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_MetroOrRegional ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_MetroOrRegional,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_MetroOrRegionalSearch =By.xpath("//input[@id='field_key$80f6da87-a526-367e-881e-91f50cf0539c$1metropolitan_or_regional-textbox']/../div");
	public WebElement getTrailerInterchange_TXT_MetroOrRegionalSearch(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_MetroOrRegionalSearch ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_MetroOrRegionalSearch,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_PrincipalGaragingZone =By.id("field_key$1a289f7b-3e20-3b45-bb85-0be4bc85b43a$1principal_garaging_zone-textbox");
	public WebElement getTrailerInterchange_TXT_PrincipalGaragingZone(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_PrincipalGaragingZone ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_PrincipalGaragingZone,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_PrincipalGaragingZoneSearch =By.xpath("//input[@id='field_key$1a289f7b-3e20-3b45-bb85-0be4bc85b43a$1principal_garaging_zone-textbox']/../div");
	public WebElement getTrailerInterchange_TXT_PrincipalGaragingZoneSearch(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_PrincipalGaragingZoneSearch ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_PrincipalGaragingZoneSearch,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_ZoneOfTerminal =By.id("field_key$e1d931dc-17ec-3b9f-a9cd-bde274af7f8f$1zone_of_terminal-textbox");
	public WebElement getTrailerInterchange_TXT_ZoneOfTerminal(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_ZoneOfTerminal ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_ZoneOfTerminal,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_ZoneOfTerminalSearch =By.xpath("//input[@id='field_key$e1d931dc-17ec-3b9f-a9cd-bde274af7f8f$1zone_of_terminal-textbox']/../div");
	public WebElement getTrailerInterchange_TXT_ZoneOfTerminalSearch(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_ZoneOfTerminalSearch ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_ZoneOfTerminalSearch,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_SingleLmtLiabBIandPDForEndoFormUIIE1 =By.id("field_key$e1d931dc-17ec-3b9f-a9cd-bde274af7f8f$1zone_of_terminal-textbox");
	public WebElement getTrailerInterchange_TXT_SingleLmtLiabBIandPDForEndoFormUIIE1(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_SingleLmtLiabBIandPDForEndoFormUIIE1 ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_SingleLmtLiabBIandPDForEndoFormUIIE1,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_LegalLiabLmtForPhyDmge =By.id("field_key$ed113aea-3d6f-3dde-a1ec-03223f413b74$1liability_limit-textbox");
	public WebElement getTrailerInterchange_TXT_LegalLiabLmtForPhyDmge(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_LegalLiabLmtForPhyDmge ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_LegalLiabLmtForPhyDmge,dataVal);
	}
	                            
	public By TrailerInterchange_CHK_OTC =By.xpath("//span[@id='field_key$ae0fc6de-b8a3-3b45-9372-442d31d4ece5$1other_than_collision-checkbox']/input");
	public WebElement getTrailerInterchange_CHK_OTC(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_CHK_OTC ,dataVal);
	return se.element().getElement(TrailerInterchange_CHK_OTC,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_Type =By.id("field_key$d82ba418-bd04-3676-b4b8-49aae45bd038$1loss_type-textbox");
	public WebElement getTrailerInterchange_TXT_Type(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_Type ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_Type,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_TypeSearch =By.xpath("//input[@id='field_key$d82ba418-bd04-3676-b4b8-49aae45bd038$1loss_type-textbox']/../div");
	public WebElement getTrailerInterchange_TXT_TypeSearch(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_TypeSearch ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_TypeSearch,dataVal);
	}
	                            
	public By TrailerInterchange_CHK_Collision =By.xpath("//span[@id='field_key$233e9714-782f-31fb-a3dd-e10668f9d611$1collision-checkbox']/input");
	public WebElement getTrailerInterchange_CHK_Collision(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_CHK_Collision ,dataVal);
	return se.element().getElement(TrailerInterchange_CHK_Collision,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_Deductible =By.id("field_key$1765b535-b7a3-331c-b07f-913ebc5a8457$1deductible-textbox");
	public WebElement getTrailerInterchange_TXT_Deductible(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_Deductible ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_Deductible,dataVal);
	}
	                            
	public By TrailerInterchange_TXT_DeductibleSearch =By.xpath("//input[@id='field_key$1765b535-b7a3-331c-b07f-913ebc5a8457$1deductible-textbox']/../div");
	public WebElement getTrailerInterchange_TXT_DeductibleSearch(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_TXT_DeductibleSearch ,dataVal);
	return se.element().getElement(TrailerInterchange_TXT_DeductibleSearch,dataVal);
	}
	                            
	public By TrailerInterchange_BTN_Done =By.xpath("//*[@id='/-continue-image' and contains(.,'DONE')]");
	public WebElement getTrailerInterchange_BTN_Done(String dataVal)
	{
	se.element().waitForElement(TrailerInterchange_BTN_Done ,dataVal);
	return se.element().getElement(TrailerInterchange_BTN_Done,dataVal);
	}
	                            

    
/*******************************************
* End of CA Trailer Interchange page locators
********************************************/

	
    
/*******************************************
* Start of CA Named Driver Collision page locators
********************************************/
	
	public By NamedDriverColl_BTN_Label = By.xpath("//*[contains(@id,'named_driver_coll_cov-label')]");

	public WebElement getNamedDriverColl_BTN_Label() {
		se.element().waitForElement(NamedDriverColl_BTN_Label);
		return se.element().getElement(NamedDriverColl_BTN_Label);
	}

	
	public By NamedDriverColl_BTN_Add =By.id("f1a555e3-748f-3cbc-ae49-8a217c0bffb9-add-image");
	public WebElement getNamedDriverColl_BTN_Add(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_BTN_Add ,dataVal);
	return se.element().getElement(NamedDriverColl_BTN_Add,dataVal);
	}
	                            
	public By NamedDriverColl_BTN_Details =By.id("instance_key$f1a555e3-748f-3cbc-ae49-8a217c0bffb9$1named_driver_coll_cov-image");
	public WebElement getNamedDriverColl_BTN_Details(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_BTN_Details ,dataVal);
	return se.element().getElement(NamedDriverColl_BTN_Details,dataVal);
	}
	                            
	public By NamedDriverColl_BTN_Done =By.xpath("//*[@id='/-continue-image' and contains(.,'DONE')]");
	public WebElement getNamedDriverColl_BTN_Done(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_BTN_Done ,dataVal);
	return se.element().getElement(NamedDriverColl_BTN_Done,dataVal);
	}
	                            
	public By NamedDriverColl_TXT_LocationNo =By.id("field_key$bd6c2b7d-e7d4-3d7a-9367-51983678fb4a$1location_no-textbox");
	public WebElement getNamedDriverColl_TXT_LocationNo(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_TXT_LocationNo ,dataVal);
	return se.element().getElement(NamedDriverColl_TXT_LocationNo,dataVal);
	}
	                            
	public By NamedDriverColl_TXT_Name =By.id("field_key$1831cc5a-4a6c-3c9a-bf38-50823080b5c1$1name-textbox");
	public WebElement getNamedDriverColl_TXT_Name(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_TXT_Name ,dataVal);
	return se.element().getElement(NamedDriverColl_TXT_Name,dataVal);
	}
	                            
	public By NamedDriverColl_TXT_Description =By.id("field_key$26e9807d-07e9-3e03-9741-d6d5a78b4bc2$1description-textbox");
	public WebElement getNamedDriverColl_TXT_Description(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_TXT_Description ,dataVal);
	return se.element().getElement(NamedDriverColl_TXT_Description,dataVal);
	}
	                            
	public By NamedDriverColl_TXT_DriverNo =By.id("field_key$c9067638-926c-33a4-a443-0f516a801afb$1driver_no-textbox");
	public WebElement getNamedDriverColl_TXT_DriverNo(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_TXT_DriverNo ,dataVal);
	return se.element().getElement(NamedDriverColl_TXT_DriverNo,dataVal);
	}
	                            
	public By NamedDriverColl_TXT_DriverNoSearch =By.xpath("//input[@id='field_key$c9067638-926c-33a4-a443-0f516a801afb$1driver_no-textbox']/../div");
	public WebElement getNamedDriverColl_TXT_DriverNoSearch(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_TXT_DriverNoSearch ,dataVal);
	return se.element().getElement(NamedDriverColl_TXT_DriverNoSearch,dataVal);
	}
	                            
	public By NamedDriverColl_TXT_TitlePrefix =By.id("field_key$49af4ed2-6e8f-351d-ba48-5205d94a2dbc$1title_prefix-textbox");
	public WebElement getNamedDriverColl_TXT_TitlePrefix(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_TXT_TitlePrefix ,dataVal);
	return se.element().getElement(NamedDriverColl_TXT_TitlePrefix,dataVal);
	}
	                            
	public By NamedDriverColl_TXT_FirstName =By.id("field_key$b281e8e4-3705-3fec-9021-03d61f7b90b6$1first_name-textbox");
	public WebElement getNamedDriverColl_TXT_FirstName(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_TXT_FirstName ,dataVal);
	return se.element().getElement(NamedDriverColl_TXT_FirstName,dataVal);
	}
	                            
	public By NamedDriverColl_TXT_MiddleName =By.id("field_key$73a97188-1177-3c95-bdcb-291b5c125012$1middle_name-textbox");
	public WebElement getNamedDriverColl_TXT_MiddleName(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_TXT_MiddleName ,dataVal);
	return se.element().getElement(NamedDriverColl_TXT_MiddleName,dataVal);
	}
	                            
	public By NamedDriverColl_TXT_LastName =By.id("field_key$75f7d27a-de5e-3dbb-a24b-cf486935ef18$1last_name-textbox");
	public WebElement getNamedDriverColl_TXT_LastName(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_TXT_LastName ,dataVal);
	return se.element().getElement(NamedDriverColl_TXT_LastName,dataVal);
	}
	                            
	public By NamedDriverColl_TXT_NameSuffix =By.id("field_key$36be95dc-2937-328a-840e-c2f79ddb75b5$1name_suffix-textbox");
	public WebElement getNamedDriverColl_TXT_NameSuffix(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_TXT_NameSuffix ,dataVal);
	return se.element().getElement(NamedDriverColl_TXT_NameSuffix,dataVal);
	}
	                            
	public By NamedDriverColl_TXT_DateOfBirth =By.id("field_key$a775bce7-2dfc-363b-b0d5-4e9c4fad6346$1dob-picker");
	public WebElement getNamedDriverColl_TXT_DateOfBirth(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_TXT_DateOfBirth ,dataVal);
	return se.element().getElement(NamedDriverColl_TXT_DateOfBirth,dataVal);
	}
	                            
	public By NamedDriverColl_CHK_GenderMale =By.xpath("(//span[text()='Gender']/../../following-sibling::td[2]//input)[1]");
	public WebElement getNamedDriverColl_CHK_GenderMale(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_CHK_GenderMale ,dataVal);
	return se.element().getElement(NamedDriverColl_CHK_GenderMale,dataVal);
	}
	                            
	public By NamedDriverColl_CHK_GenderFemale =By.xpath("(//span[text()='Gender']/../../following-sibling::td[2]//input)[2]");
	public WebElement getNamedDriverColl_CHK_GenderFemale(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_CHK_GenderFemale ,dataVal);
	return se.element().getElement(NamedDriverColl_CHK_GenderFemale,dataVal);
	}
	                            
	public By NamedDriverColl_TXT_MaritalStatus =By.id("field_key$d3289b63-89d0-3285-a2c6-6b72484e3f97$1marital_status-textbox");
	public WebElement getNamedDriverColl_TXT_MaritalStatus(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_TXT_MaritalStatus ,dataVal);
	return se.element().getElement(NamedDriverColl_TXT_MaritalStatus,dataVal);
	}
	                            
	public By NamedDriverColl_TXT_DateOfHire =By.id("field_key$7f1f0e33-e643-3590-a0dd-682de9667bdb$1date_hired-picker");
	public WebElement getNamedDriverColl_TXT_DateOfHire(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_TXT_DateOfHire ,dataVal);
	return se.element().getElement(NamedDriverColl_TXT_DateOfHire,dataVal);
	}
	                            
	public By NamedDriverColl_TXT_Deductible =By.id("field_key$62e0f67d-791e-3c04-aab2-dbc768184d21$1deductible-textbox");
	public WebElement getNamedDriverColl_TXT_Deductible(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_TXT_Deductible ,dataVal);
	return se.element().getElement(NamedDriverColl_TXT_Deductible,dataVal);
	}
	                            
	public By NamedDriverColl_TXT_DeductibleSearch =By.xpath("//input[@id='field_key$62e0f67d-791e-3c04-aab2-dbc768184d21$1deductible-textbox']/../div");
	public WebElement getNamedDriverColl_TXT_DeductibleSearch(String dataVal)
	{
	se.element().waitForElement(NamedDriverColl_TXT_DeductibleSearch ,dataVal);
	return se.element().getElement(NamedDriverColl_TXT_DeductibleSearch,dataVal);
	}
	    
 
/*******************************************
* End of CA Named Driver Collision page locators
********************************************/
	
	
	
	
    
/*******************************************
* Start of CA  FellowEmployeeCoverage page locators
********************************************/

	public By FellowEmployeeCoverage_BTN_Label = By.xpath("//*[contains(@id,'fellow_employee_cov-label')]");

	public WebElement getFellowEmployeeCoverage_BTN_Label() {
		se.element().waitForElement(FellowEmployeeCoverage_BTN_Label);
		return se.element().getElement(FellowEmployeeCoverage_BTN_Label);
	}

	public By FellowEmployeeCoverage_CHK_CoverageType_AllEmployees =By.xpath("(//span[text()='Coverage Type']/../../following-sibling::td[2]//input)[1]");
	public WebElement getFellowEmployeeCoverage_CHK_CoverageType_AllEmployees(String dataVal)
	{
	se.element().waitForElement(FellowEmployeeCoverage_CHK_CoverageType_AllEmployees ,dataVal);
	return se.element().getElement(FellowEmployeeCoverage_CHK_CoverageType_AllEmployees,dataVal);
	}
	                            
	public By FellowEmployeeCoverage_CHK_CoverageType_DesignatedEmployeesOrPositions =By.xpath("(//span[text()='Coverage Type']/../../following-sibling::td[2]//input)[2]");
	public WebElement getFellowEmployeeCoverage_CHK_CoverageType_DesignatedEmployeesOrPositions(String dataVal)
	{
	se.element().waitForElement(FellowEmployeeCoverage_CHK_CoverageType_DesignatedEmployeesOrPositions ,dataVal);
	return se.element().getElement(FellowEmployeeCoverage_CHK_CoverageType_DesignatedEmployeesOrPositions,dataVal);
	}
	                            
	public By FellowEmployeeCoverage_TXT_NameOFPersonJobTitlePosition =By.id("field_key$01047092-fce9-3d7f-ab30-4716cabcb7a3$1person_job_position-textarea");
	public WebElement getFellowEmployeeCoverage_TXT_NameOFPersonJobTitlePosition(String dataVal)
	{
	se.element().waitForElement(FellowEmployeeCoverage_TXT_NameOFPersonJobTitlePosition ,dataVal);
	return se.element().getElement(FellowEmployeeCoverage_TXT_NameOFPersonJobTitlePosition,dataVal);
	}
	
    
/*******************************************
* End of CA  FellowEmployeeCoverage page locators
********************************************/
 	/*****************************************
 	 * Start of StateCoverageLimit Page Locators
 	 ******************************************/
 	
 	public By StateCoverageLimits_BTN_Label = By.xpath("//*[contains(@id,'lob_ca_state_cov_limits-label')]");
	
	public WebElement getStateCoverageLimits_BTN_Label()
	{
	se.element().waitForElement(StateCoverageLimits_BTN_Label);
	return se.element().getElement(StateCoverageLimits_BTN_Label);
	}
 	
 	public By StateCoverageLimits_BTN_Add =By.xpath("//*[contains(@id,'add-image')]");
 	public WebElement getStateCoverageLimits_BTN_Add()
 	{
 	se.element().waitForElement(StateCoverageLimits_BTN_Add);
 	return se.element().getElement(StateCoverageLimits_BTN_Add);
 	}
 	                            
 	public By StateCoverageLimits_BTN_Details;
 	public WebElement getStateCoverageLimits_BTN_Details(String dataVal)
 	{
 		StateCoverageLimits_BTN_Details =By.xpath("//div[contains(@id,'"+dataVal+"lob_ca_state_cov_limits-image')]");
 	se.element().waitForElement(StateCoverageLimits_BTN_Details ,dataVal);
 	return se.element().getElement(StateCoverageLimits_BTN_Details,dataVal);
 	}
 	
 	public By StateCoverageLimits_selectDetails;

	public WebElement getStateCoverageLimits_selectDetails(String dataVal) {
		HiredOrBorrowedAuto_selectDetails = By.xpath("(//*[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
		
		se.element().waitForElement(StateCoverageLimits_selectDetails);
		return se.element().getElement(StateCoverageLimits_selectDetails);
	}
	
	public By StateCoverageLimits_BTN_Delete =By.id("4dc9fa44-9f4c-3ca8-bc0d-7e9652efe388-delete-image");
	public WebElement getStateCoverageLimits_BTN_Delete()
	{
	se.element().waitForElement(StateCoverageLimits_BTN_Delete);
	return se.element().getElement(StateCoverageLimits_BTN_Delete);
	}
 	                            
 	public By StateCoverageLimits_TXT_State =By.id("field_key$977d90b4-08b7-3d24-830e-01a7dfe5feab$1state-textbox");
 	public WebElement getStateCoverageLimits_TXT_State(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_State ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_State,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_IsOCP_Adopted_State =By.xpath("//span[contains(@id,'ocp_scl_check-checkbox')]/input");
 	public WebElement getStateCoverageLimits_CHK_IsOCP_Adopted_State(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_IsOCP_Adopted_State,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_IsOCP_Adopted_State,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_VehicleCoverages =By.xpath("//span[contains(@id,'1is_vehicle_coverage-checkbox')]/input");
 	public WebElement getStateCoverageLimits_CHK_VehicleCoverages(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_VehicleCoverages ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_VehicleCoverages,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_VC_Liability =By.xpath("//span[contains(@id,'1liability-checkbox')]/input");
 	public WebElement getStateCoverageLimits_CHK_VC_Liability(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_VC_Liability ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_VC_Liability,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_VC_TortLimit =By.xpath("//*[contains(@id,'1tort_limit-textarea')]");
 	public WebElement getStateCoverageLimits_TXT_VC_TortLimit(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_TortLimit ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_TortLimit,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_VC_TortLimitSearch =By.xpath("//*[contains(@id,'1tort_limit-textarea')]/../div");
 	public WebElement getStateCoverageLimits_TXT_VC_TortLimitSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_TortLimitSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_TortLimitSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_VC_TortLimitationCode =By.id("field_key$4df6511d-2fbd-3ad0-af0c-95b065575f1d$1tort_limit_code-textbox");
 	public WebElement getStateCoverageLimits_TXT_VC_TortLimitationCode(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_TortLimitationCode ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_TortLimitationCode,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_VC_Combined_Single_Limit =By.id("field_key$02f814ac-f373-3d0d-adf5-ad19162dc289$1combined_single_limit_disp-textbox");
 	public WebElement getStateCoverageLimits_TXT_VC_Combined_Single_Limit(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_Combined_Single_Limit ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_Combined_Single_Limit,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_VC_Combined_Single_LimitSearch =By.xpath("//*[@id='field_key$02f814ac-f373-3d0d-adf5-ad19162dc289$1combined_single_limit_disp-textbox']/../div");
 	public WebElement getStateCoverageLimits_TXT_VC_Combined_Single_LimitSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_Combined_Single_LimitSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_Combined_Single_LimitSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_VC_Deductible =By.id("field_key$f1e7ceb9-659a-398a-b856-e5eb88295e4c$1deductible-textbox");
 	public WebElement getStateCoverageLimits_TXT_VC_Deductible(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_Deductible ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_Deductible,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_VC_DeductibleSearch =By.xpath("//*[@id='field_key$f1e7ceb9-659a-398a-b856-e5eb88295e4c$1deductible-textbox']/../div");
 	public WebElement getStateCoverageLimits_TXT_VC_DeductibleSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_DeductibleSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_DeductibleSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_VC_DeductibleType_CombinedSingleLimit =By.xpath("(//div[text() ='Vehicle Coverages']/ancestor::tr[1]/following-sibling::tr[4]//span[text()='Deductible Type']/ancestor::td[1]/following-sibling::td[2]//input)[1]");
 	public WebElement getStateCoverageLimits_CHK_VC_DeductibleType_CombinedSingleLimit(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_VC_DeductibleType_CombinedSingleLimit ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_VC_DeductibleType_CombinedSingleLimit,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_VC_DeductibleType_PropDamagePerAccDeductible =By.xpath("(//div[text() ='Vehicle Coverages']/ancestor::tr[1]/following-sibling::tr[4]//span[text()='Deductible Type']/ancestor::td[1]/following-sibling::td[2]//input)[2]");
 	public WebElement getStateCoverageLimits_CHK_VC_DeductibleType_PropDamagePerAccDeductible(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_VC_DeductibleType_PropDamagePerAccDeductible ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_VC_DeductibleType_PropDamagePerAccDeductible,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_VC_PersonalInjuryProtection =By.xpath("(//div[text() ='Vehicle Coverages']/ancestor::tr[1]/following-sibling::tr[4]//span[contains(@id,'1pers_injury_prot-checkbox')])/input");
 	public WebElement getStateCoverageLimits_CHK_VC_PersonalInjuryProtection(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_VC_PersonalInjuryProtection ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_VC_PersonalInjuryProtection,dataVal);
 	}
 	
 	public By StateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_Y =By.xpath("(//span[text() ='Are any drivers not covered by Workers Compensation?']/../../following-sibling::td[2]//input)[1]");
 	public WebElement getStateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_Y(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_Y ,dataVal);
 	return se.element().getElement(StateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_Y,dataVal);
 	}
 	
 	public By StateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_N =By.xpath("(//span[text() ='Are any drivers not covered by Workers Compensation?']/../../following-sibling::td[2]//input)[2]");
 	public WebElement getStateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_N(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_N ,dataVal);
 	return se.element().getElement(StateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_N,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_VC_ExcessCoverage =By.xpath("//div[text() ='Vehicle Coverages']/ancestor::tr[1]/following-sibling::tr[4]//input[contains(@id,'1excess_pip-textbox')]");
 	public WebElement getStateCoverageLimits_TXT_VC_ExcessCoverage(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_ExcessCoverage ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_ExcessCoverage,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_VC_ExcessCoverageSearch =By.xpath("//div[text() ='Vehicle Coverages']/ancestor::tr[1]/following-sibling::tr[4]//input[contains(@id,'1excess_pip-textbox')]/../div");
 	public WebElement getStateCoverageLimits_TXT_VC_ExcessCoverageSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_ExcessCoverageSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_ExcessCoverageSearch,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_VC_ExcessCoverageDeductible =By.xpath("//div[text() ='Vehicle Coverages']/ancestor::tr[1]/following-sibling::tr[4]//input[@id='field_key$29234ffc-6fc4-3878-a425-d48d7389d1fd$1deductible-textbox']");
 	public WebElement getStateCoverageLimits_TXT_VC_ExcessCoverageDeductible(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_ExcessCoverageDeductible ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_ExcessCoverageDeductible,dataVal);
 	}
 	
 	public By StateCoverageLimits_CHK_VC_PropertyProtectionInsurance =By.xpath("(//div[text() ='Vehicle Coverages']/ancestor::tr[1]/following-sibling::tr[4]//span[contains(@id,'1veh_prop_prot_insur-checkbox')])/input");
 	public WebElement getStateCoverageLimits_CHK_VC_PropertyProtectionInsurance(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_VC_PropertyProtectionInsurance ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_VC_PropertyProtectionInsurance,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_VC_PropertyProtectionInsuranceDeductible =By.xpath("//div[text() ='Vehicle Coverages']/ancestor::tr[1]/following-sibling::tr[4]//input[@id='field_key$da1cbb37-f751-3ed9-bd35-11a1f78078e6$1deductible-textbox']");
 	public WebElement getStateCoverageLimits_TXT_VC_PropertyProtectionInsuranceDeductible(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_PropertyProtectionInsuranceDeductible ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_PropertyProtectionInsuranceDeductible,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_Stackedcoverage =By.xpath("//*[@id='field_key$146f41d4-8b09-3334-865a-3f00f17218d6$1stacked_coverage-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_Stackedcoverage(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_Stackedcoverage ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_Stackedcoverage,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_VC_Medical_Payments =By.xpath("//span[@id='field_key$3e3af196-47ef-37bf-a748-81838d3d66a1$1medical_payments-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_VC_Medical_Payments(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_VC_Medical_Payments ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_VC_Medical_Payments,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_VC_LimitEachPerson =By.id("field_key$3d2e1704-dcab-34bf-8cb0-6ae3106fabe8$1limit_each_person-textbox");
 	public WebElement getStateCoverageLimits_TXT_VC_LimitEachPerson(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_LimitEachPerson ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_LimitEachPerson,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_VC_LimitEachPersonSearch =By.xpath("//*[@id='field_key$3d2e1704-dcab-34bf-8cb0-6ae3106fabe8$1limit_each_person-textbox']/../div");
 	public WebElement getStateCoverageLimits_TXT_VC_LimitEachPersonSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_LimitEachPersonSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_LimitEachPersonSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_Uninsured_Motorist =By.xpath("//span[@id='field_key$d055b694-cdcd-33bb-b6bb-a37e135ac0e1$1uninsured_motorist-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_Uninsured_Motorist(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_Uninsured_Motorist ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_Uninsured_Motorist,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimit =By.id("field_key$efe36ec3-f528-39d3-b260-aebd9b68622c$1combined_single_limit-textbox");
 	public WebElement getStateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimit(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimit ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimit,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimitSearch =By.xpath("//*[@id='field_key$efe36ec3-f528-39d3-b260-aebd9b68622c$1combined_single_limit-textbox']/../div[1]");
 	public WebElement getStateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimitSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimitSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimitSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_VC_IncludePropDamage =By.xpath("//span[@id='field_key$43467dc2-7d1b-3f13-84cc-dc5bc0aeb322$1include_property_damage-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_VC_IncludePropDamage(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_VC_IncludePropDamage ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_VC_IncludePropDamage,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_Uninsured_Motorist_PD =By.xpath("//span[@id='field_key$913a2101-1a9e-359f-bfa9-ccbeaa1a4de3$1uninsured_motorist_pd-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_Uninsured_Motorist_PD(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_Uninsured_Motorist_PD ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_Uninsured_Motorist_PD,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_property_dam_limit =By.id("field_key$0d0935ae-7f21-30fa-b848-ca416859c605$1property_dam_limit-textbox");
 	public WebElement getStateCoverageLimits_TXT_property_dam_limit(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_property_dam_limit ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_property_dam_limit,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_property_dam_limitSearch =By.xpath("//*[@id='field_key$0d0935ae-7f21-30fa-b848-ca416859c605$1property_dam_limit-textbox']/../div[1]");
 	public WebElement getStateCoverageLimits_TXT_property_dam_limitSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_property_dam_limitSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_property_dam_limitSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_VC_underinsured_motorist =By.xpath("//span[@id='field_key$2e3ae663-8f97-3611-a034-9220c258ca8e$1underinsured_motorist-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_VC_underinsured_motorist(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_VC_underinsured_motorist ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_VC_underinsured_motorist,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_combined_single_limit_underinsured =By.id("field_key$cdded567-8857-3f15-a45e-3b1aff020595$1combined_single_limit-textbox");
 	public WebElement getStateCoverageLimits_TXT_combined_single_limit_underinsured(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_combined_single_limit_underinsured ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_combined_single_limit_underinsured,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_combined_single_limit_underinsuredSearch =By.xpath("//*[@id='field_key$cdded567-8857-3f15-a45e-3b1aff020595$1combined_single_limit-textbox']/../div[1]");
 	public WebElement getStateCoverageLimits_TXT_combined_single_limit_underinsuredSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_combined_single_limit_underinsuredSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_combined_single_limit_underinsuredSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_LC_WithoutFullCoveredAutos =By.xpath("//*[text()='Without Full Covered Autos']/../../preceding-sibling::div[1]//input");
 	public WebElement getStateCoverageLimits_CHK_LC_WithoutFullCoveredAutos(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_LC_WithoutFullCoveredAutos ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_LC_WithoutFullCoveredAutos,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_FullCoveredAutos =By.xpath("//*[text()='Full Covered Autos']/../../preceding-sibling::div[1]//input");
 	public WebElement getStateCoverageLimits_CHK_FullCoveredAutos(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_FullCoveredAutos ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_FullCoveredAutos,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_LC_Liability =By.xpath("//div[text() ='Location Coverages']/ancestor::tr[1]/following-sibling::tr[6]//span[contains(@id,'liability-checkbox')]");
 	public WebElement getStateCoverageLimits_CHK_LC_Liability(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_LC_Liability ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_LC_Liability,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_LC_Combined_Single_Limit =By.id("field_key$dafa3619-cc3f-350b-9e79-af63904ef54a$1combined_single_limit_disp-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_Combined_Single_Limit(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_Combined_Single_Limit ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_Combined_Single_Limit,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_LC_Combined_Single_LimitSearch =By.xpath("//*[@id='field_key$dafa3619-cc3f-350b-9e79-af63904ef54a$1combined_single_limit_disp-textbox']/../div[1]");
 	public WebElement getStateCoverageLimits_TXT_LC_Combined_Single_LimitSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_Combined_Single_LimitSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_Combined_Single_LimitSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedAggregateLimit =By.id("field_key$d059cc0a-950b-3dca-901f-e67392455a57$1prod_wrk_perfd_agg_lt-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedAggregateLimit(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedAggregateLimit ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedAggregateLimit,dataVal);
 	}
 	
 	
 	public By StateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimit =By.id("field_key$cb74f378-7037-38b4-bfff-deb4c7cadf6c$1prod_wrk_perfd_otr_agg_lt-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimit(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimit ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimit,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimitSearch =By.xpath("//*[@id='field_key$cb74f378-7037-38b4-bfff-deb4c7cadf6c$1prod_wrk_perfd_otr_agg_lt-textbox']/../div[1]");
 	public WebElement getStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimitSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimitSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimitSearch,dataVal);
 	}
 	 	                            
 	public By StateCoverageLimits_TXT_LC_GeneralLiabilityAggregateLimit =By.id("field_key$1cf5c6a7-0f9b-3e30-98d5-2f2999e666d2$1aggregate_limit-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_GeneralLiabilityAggregateLimit(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_GeneralLiabilityAggregateLimit ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_GeneralLiabilityAggregateLimit,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimit =By.id("field_key$33ca5fed-b679-3724-8650-47479678498a$1other_aggregate_limit-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimit(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimit ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimit,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimitSearch =By.xpath("//*[@id='field_key$33ca5fed-b679-3724-8650-47479678498a$1other_aggregate_limit-textbox']/../div");
 	public WebElement getStateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimitSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimitSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimitSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_LC_Deductible =By.id("field_key$e40eacab-e433-3a8b-981e-6e2761685294$1deductible-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_Deductible(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_Deductible ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_Deductible,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_LC_DeductibleSearch =By.xpath("//*[@id='field_key$e40eacab-e433-3a8b-981e-6e2761685294$1deductible-textbox']/../div");
 	public WebElement getStateCoverageLimits_TXT_LC_DeductibleSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_DeductibleSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_DeductibleSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_LC_DeductibleType_CombinedSingleLimit =By.xpath("(//div[text() ='Location Coverages']/ancestor::tr[1]/following-sibling::tr[8]//span[text()='Deductible Type']/ancestor::td[1]/following-sibling::td[2]//input)[1]");
 	public WebElement getStateCoverageLimits_CHK_LC_DeductibleType_CombinedSingleLimit(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_LC_DeductibleType_CombinedSingleLimit ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_LC_DeductibleType_CombinedSingleLimit,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_LC_DeductibleType_PropertDamPerAccDed =By.xpath("(//div[text() ='Location Coverages']/ancestor::tr[1]/following-sibling::tr[8]//span[text()='Deductible Type']/ancestor::td[1]/following-sibling::td[2]//input)[2]");
 	public WebElement getStateCoverageLimits_CHK_LC_DeductibleType_PropertDamPerAccDed(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_LC_DeductibleType_PropertDamPerAccDed ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_LC_DeductibleType_PropertDamPerAccDed,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_LC_PersonalInjuryProtection =By.xpath("//*[@id='field_key$42bda08c-e11d-3a06-95ad-a5c53df40946$1personal_injury-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_LC_PersonalInjuryProtection(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_LC_PersonalInjuryProtection ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_LC_PersonalInjuryProtection,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_InsuredCoverageStatus =By.xpath("//*[contains(@id,'$1insured_cov_status-textbox')]");
 	public WebElement getStateCoverageLimits_TXT_InsuredCoverageStatus(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_InsuredCoverageStatus ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_InsuredCoverageStatus,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_InsuredCoverageStatusSearch =By.xpath("//*[contains(@id,'$1insured_cov_status-textbox')]/../div");
 	public WebElement getStateCoverageLimits_TXT_InsuredCoverageStatusSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_InsuredCoverageStatusSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_InsuredCoverageStatusSearch,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatus =By.xpath("//*[contains(@id,'$1spouse_res_cov_status-textbox')]");
 	
 	
 	public WebElement getStateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatus(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatus,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatus,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatusSearch =By.xpath("//*[contains(@id,'$1spouse_res_cov_status-textbox')]/../div");
 	public WebElement getStateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatusSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatusSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatusSearch,dataVal);
 	}

 	public By StateCoverageLimits_CHK_VC_MedicalExpenseBenefits =By.xpath("//*[@id='field_key$8a168078-af7c-3b8d-89b1-6b0776595af8$1medical_exp_benefit-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_VC_MedicalExpenseBenefits(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_VC_MedicalExpenseBenefits,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_VC_MedicalExpenseBenefits,dataVal);
 	}
 	 	
 	public By StateCoverageLimits_TXT_VC_Limit =By.xpath("//*[@id='field_key$bed89bf3-c4bb-3946-818a-7207feeada3d$1mi_meb_limit-textbox']");
 	public WebElement getStateCoverageLimits_TXT_VC_Limit(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_Limit,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_Limit,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_VC_LimitSearch =By.xpath("//*[@id='field_key$bed89bf3-c4bb-3946-818a-7207feeada3d$1mi_meb_limit-textbox']/../div");
 	public WebElement getStateCoverageLimits_TXT_VC_LimitSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_LimitSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_LimitSearch,dataVal);
 	}

 	public By StateCoverageLimits_CHK_VC_ExcludeMedicalExpenseBenefits =By.xpath("//*[@id='field_key$535a4c73-a6f2-363a-b388-0b0b1348d2fd$1exclude_med_exp_ben-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_VC_ExcludeMedicalExpenseBenefits(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_VC_ExcludeMedicalExpenseBenefits,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_VC_ExcludeMedicalExpenseBenefits,dataVal);
 	}
 	 	
 	public By StateCoverageLimits_RDO_VC_NumberofHouseholdMembers_All =By.xpath("(//span[text() ='Number of Household Members Covered By Qualified Health Coverage']/../../following-sibling::td[2]//input)[1]");
 	public WebElement getStateCoverageLimits_RDO_VC_NumberofHouseholdMembers_All(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_RDO_VC_NumberofHouseholdMembers_All,dataVal);
 	return se.element().getElement(StateCoverageLimits_RDO_VC_NumberofHouseholdMembers_All,dataVal);
 	}
 	
 	public By StateCoverageLimits_RDO_VC_NumberofHouseholdMembers_Oneormore =By.xpath("(//span[text() ='Number of Household Members Covered By Qualified Health Coverage']/../../following-sibling::td[2]//input)[2]");
 	public WebElement getStateCoverageLimits_RDO_VC_NumberofHouseholdMembers_Oneormore(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_RDO_VC_NumberofHouseholdMembers_Oneormore,dataVal);
 	return se.element().getElement(StateCoverageLimits_RDO_VC_NumberofHouseholdMembers_Oneormore,dataVal);
 	}
 	
 	public By StateCoverageLimits_BTN_VC_ADD =By.xpath("//*[@id='fa8f14e8-0262-33b7-acc0-6b70454a785e-add-image']");
	public WebElement getStateCoverageLimits_BTN_VC_ADD(String dataVal)
	{
	se.element().waitForElement(StateCoverageLimits_BTN_VC_ADD,dataVal);
	return se.element().getElement(StateCoverageLimits_BTN_VC_ADD,dataVal);
	}

	public By StateCoverageLimits_TXT_VC_FullNameofEachExcludedPerson =By.xpath("//*[@id='field_key$3db16a50-e62d-3ad3-bc12-4d8a88c79e8f$1exclude_person_name-textbox']");
 	public WebElement getStateCoverageLimits_TXT_VC_FullNameofEachExcludedPerson(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_FullNameofEachExcludedPerson,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_FullNameofEachExcludedPerson,dataVal);
 	}

 	public By StateCoverageLimits_TXT_VC_DateofBirth =By.xpath("//*[@id='field_key$ba56e3b4-a8a9-3407-8ba0-7f7525c3588c$1date_of_birth-picker']/input");
 	public WebElement getStateCoverageLimits_TXT_VC_DateofBirth(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_DateofBirth,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_DateofBirth,dataVal);
 	}
 	 	
 	public By StateCoverageLimits_CHK_VC_ExcessAttendantCare =By.xpath("//*[@id='field_key$16c7a528-6715-3881-b5b0-59544a367148$1excess_attendant_care-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_VC_ExcessAttendantCare(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_VC_ExcessAttendantCare,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_VC_ExcessAttendantCare,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_VC_LimitPerPersonAccident =By.xpath("//*[@id='field_key$d3b638a2-59bf-3487-91a0-a419c6aed5d4$1mi_eac_limit-textbox']");
 	public WebElement getStateCoverageLimits_TXT_VC_LimitPerPersonAccident(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_LimitPerPersonAccident ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_DeductibleCoverage,dataVal);
 	}

 	public By StateCoverageLimits_CHK_VC_AdditionalPersInjuryProt =By.xpath("//span[@id='field_key$18605582-d6aa-36eb-97f9-f4c30d05a7b0$1add_pers_injury_prot-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_VC_AdditionalPersInjuryProt(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_VC_AdditionalPersInjuryProt ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_VC_AdditionalPersInjuryProt,dataVal);
 	}
 	
 	public By StateCoverageLimits_CHK_LC_AdditionalPersInjuryProt =By.xpath("//span[@id='field_key$ab0ff010-b75a-3483-9b5a-02f9527aaa02$1additional_pip-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_LC_AdditionalPersInjuryProt(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_LC_AdditionalPersInjuryProt ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_LC_AdditionalPersInjuryProt,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_LC_OptionNumber =By.id("field_key$a93dfdb9-00d0-3280-b98f-ed46ae640370$1option_number-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_OptionNumber(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_OptionNumber ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_OptionNumber,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_LC_OptionNumberSearch =By.xpath("//*[@id='field_key$a93dfdb9-00d0-3280-b98f-ed46ae640370$1option_number-textbox']/../div");
 	public WebElement getStateCoverageLimits_TXT_LC_OptionNumberSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_OptionNumberSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_OptionNumberSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_LC_TotalMedicalExpenses =By.id("field_key$159b81f5-a1df-3676-aea8-024bba65d4bf$1total_medical_expenses-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_TotalMedicalExpenses(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_TotalMedicalExpenses ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_TotalMedicalExpenses,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_LC_TotalAggregateAmount =By.id("field_key$91918913-e704-3aab-a3d1-feb7ec40af0f$1total_aggregate_amount-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_TotalAggregateAmount(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_TotalAggregateAmount ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_TotalAggregateAmount,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_LC_TotalWeeklyMaxWorkLoss =By.id("field_key$b9f4465f-16ce-3d8e-9e41-41a210ad75f6$1tot_wkly_max_work_loss-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_TotalWeeklyMaxWorkLoss(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_TotalWeeklyMaxWorkLoss ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_TotalWeeklyMaxWorkLoss,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_LC_TotalWeeklyMaxEssServices =By.id("field_key$3e764d20-178d-36ff-b1b0-ce06518ddb36$1tot_wkly_max_ess_servcs-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_TotalWeeklyMaxEssServices(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_TotalWeeklyMaxEssServices ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_TotalWeeklyMaxEssServices,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_OptionNumber =By.id("field_key$ad34a9d9-3862-3c3f-abc2-09d36d73d967$1option_number-textbox");
 	public WebElement getStateCoverageLimits_TXT_OptionNumber(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_OptionNumber ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_OptionNumber,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_OptionNumberSearch =By.xpath("//*[@id='field_key$ad34a9d9-3862-3c3f-abc2-09d36d73d967$1option_number-textbox']/../div");
 	public WebElement getStateCoverageLimits_TXT_OptionNumberSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_OptionNumberSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_OptionNumberSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_VC_TotalMedicalExpenses =By.id("field_key$7a66c94a-ea0c-32e3-8cd7-5c2129be1676$1total_medical_expenses-textbox");
 	public WebElement getStateCoverageLimits_TXT_VC_TotalMedicalExpenses(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_TotalMedicalExpenses ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_TotalMedicalExpenses,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_VC_TotalAggregateAmount =By.id("field_key$17ca5026-9b77-36e8-9439-b7eb50c21a23$1total_aggregate_amount-textbox");
 	public WebElement getStateCoverageLimits_TXT_VC_TotalAggregateAmount(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_TotalAggregateAmount ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_TotalAggregateAmount,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_TotalWeeklyMaxWorkLoss =By.id("field_key$5262cfbc-2926-3936-ab80-5baf06eae9b1$1tot_wkly_max_work_loss-textbox");
 	public WebElement getStateCoverageLimits_TXT_TotalWeeklyMaxWorkLoss(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_TotalWeeklyMaxWorkLoss ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_TotalWeeklyMaxWorkLoss,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_TotalWeeklyMaxEssServices =By.id("field_key$efa4c719-43b4-397c-9eb6-4be1abcb05cd$1tot_wkly_max_ess_servcs-textbox");
 	public WebElement getStateCoverageLimits_TXT_TotalWeeklyMaxEssServices(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_TotalWeeklyMaxEssServices ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_TotalWeeklyMaxEssServices,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_FuneralExpenses =By.id("field_key$2da0e079-5013-37f3-95b0-4bd20599e01f$1funeral_expenses-textbox");
 	public WebElement getStateCoverageLimits_TXT_FuneralExpenses(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_FuneralExpenses ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_FuneralExpenses,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_LC_Medical_PaymentsLocAndOpts =By.xpath("//span[@id='field_key$0f102b29-f7d0-3dc7-a04a-960da975df7b$1medical_payments_auto-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_LC_Medical_PaymentsLocAndOpts(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_LC_Medical_PaymentsLocAndOpts ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_LC_Medical_PaymentsLocAndOpts,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_LC_LimitEachPerson =By.id("field_key$c9b291f6-e482-397d-be9e-5378c6e8b525$1limit_each_person-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_LimitEachPerson(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_LimitEachPerson ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_LimitEachPerson,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_LC_LimitEachPersonSearch =By.xpath("//*[@id='field_key$c9b291f6-e482-397d-be9e-5378c6e8b525$1limit_each_person-textbox']/../div[1]");
 	public WebElement getStateCoverageLimits_TXT_LC_LimitEachPersonSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_LimitEachPersonSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_LimitEachPersonSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_LC_Medical_PaymentsAuto =By.xpath("//span[@id='field_key$7d5364bb-1e3f-3a68-b6a8-581078cb13da$1medical_payments-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_LC_Medical_PaymentsAuto(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_LC_Medical_PaymentsAuto ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_LC_Medical_PaymentsAuto,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_LC_AutoLimitEachPerson =By.id("field_key$53437636-d61c-3621-a19a-503ce1490c39$1limit_each_person-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_AutoLimitEachPerson(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_AutoLimitEachPerson ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_AutoLimitEachPerson,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_LC_AutoLimitEachPersonSearch =By.xpath("//*[@id='field_key$53437636-d61c-3621-a19a-503ce1490c39$1limit_each_person-textbox']/../div[1]");
 	public WebElement getStateCoverageLimits_TXT_LC_AutoLimitEachPersonSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_AutoLimitEachPersonSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_AutoLimitEachPersonSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_LC_Uninsured_Motorist =By.xpath("//span[@id='field_key$5918d0b7-905e-377d-ad67-ff14c5e00aa2$1uninsured_motorist-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_LC_Uninsured_Motorist(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_LC_Uninsured_Motorist ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_LC_Uninsured_Motorist,dataVal);
 	}
 	    
 	public By StateCoverageLimits_TXT_LC_combined_single_limit_UninsuredSearch =By.xpath("//*[@id='field_key$b1a0774b-ea4f-3061-9361-e3651b653ebd$1combined_single_limit-textbox']/../div[1]");
 	public WebElement getStateCoverageLimits_TXT_LC_combined_single_limit_UninsuredSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_combined_single_limit_UninsuredSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_combined_single_limit_UninsuredSearch,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_LC_combined_single_limit_Uninsured =By.id("field_key$b1a0774b-ea4f-3061-9361-e3651b653ebd$1combined_single_limit-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_combined_single_limit_Uninsured(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_combined_single_limit_Uninsured ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_combined_single_limit_Uninsured,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_LC_underinsured_motorist =By.xpath("//span[@id='field_key$c75c0ac2-33ea-352c-be40-62d9c0e266fa$1underinsured_motorist-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_LC_underinsured_motorist(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_LC_underinsured_motorist ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_LC_underinsured_motorist,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_LC_combined_single_limit_underinsured =By.id("field_key$511d0b20-c065-3c3c-8145-c7285ea7462e$1combined_single_limit-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_combined_single_limit_underinsured(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_combined_single_limit_underinsured ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_combined_single_limit_underinsured,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_VC_DeductibleCoverage =By.id("field_key$f9e69491-3347-3ce6-b2b5-9cccdccae36c$1deductible_coverage-textbox");
 	public WebElement getStateCoverageLimits_TXT_VC_DeductibleCoverage(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_DeductibleCoverage ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_DeductibleCoverage,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_VC_DeductibleCoverageSearch =By.xpath("//*[@id='field_key$f9e69491-3347-3ce6-b2b5-9cccdccae36c$1deductible_coverage-textbox']/../div[1]");
 	public WebElement getStateCoverageLimits_TXT_VC_DeductibleCoverageSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_VC_DeductibleCoverageSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_VC_DeductibleCoverageSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_ExclusionOfWorkLossBenefits =By.id("field_key$2707364b-774d-35f9-8160-af22da71139e$1ex_work_loss_benefits-textbox");
 	public WebElement getStateCoverageLimits_TXT_ExclusionOfWorkLossBenefits(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_ExclusionOfWorkLossBenefits ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_ExclusionOfWorkLossBenefits,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_ExclusionOfWorkLossBenefitsSearch =By.xpath("//*[@id='field_key$2707364b-774d-35f9-8160-af22da71139e$1ex_work_loss_benefits-textbox']/../div[1]");
 	public WebElement getStateCoverageLimits_TXT_ExclusionOfWorkLossBenefitsSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_ExclusionOfWorkLossBenefitsSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_ExclusionOfWorkLossBenefitsSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_LC_IncludePropertyDamage =By.xpath("//span[@id='field_key$42d5bd0f-3f98-33d1-b828-b289a6348041$1include_property_damage-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_LC_IncludePropertyDamage(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_LC_IncludePropertyDamage ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_LC_IncludePropertyDamage,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_LC_FullCoverageNoDeductible_Yes =By.xpath("(//*/span[contains(.,'Full Coverage (No Deductible)')]/../../following-sibling::td[2]//input)[1]");
 	public WebElement getStateCoverageLimits_CHK_LC_FullCoverageNoDeductible_Yes(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_LC_FullCoverageNoDeductible_Yes ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_LC_FullCoverageNoDeductible_Yes,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_LC_FullCoverageNoDeductible_No =By.xpath("(//*/span[contains(.,'Full Coverage (No Deductible)')]/../../following-sibling::td[2]//input)[2]");
 	public WebElement getStateCoverageLimits_CHK_LC_FullCoverageNoDeductible_No(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_LC_FullCoverageNoDeductible_No ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_LC_FullCoverageNoDeductible_No,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_Yes =By.xpath("(//span[text()='Full Glass Coverage for Private Passenger Vehicles']/../../following-sibling::td[2]//input)[1]");
 	public WebElement getStateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_Yes(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_Yes ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_Yes,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_No =By.xpath("(//span[text()='Full Glass Coverage for Private Passenger Vehicles']/../../following-sibling::td[2]//input)[2]");
 	public WebElement getStateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_No(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_No ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_No,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_JurisDesc =By.id("field_key$9592e882-dfa6-3cd4-9a6d-a08fb51e8d1e$1municipality-textbox");
 	public WebElement getStateCoverageLimits_TXT_JurisDesc(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_JurisDesc ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_JurisDesc,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_JurisDescSearch =By.xpath("//*[@id='field_key$9592e882-dfa6-3cd4-9a6d-a08fb51e8d1e$1municipality-textbox']/../div[1]");
 	public WebElement getStateCoverageLimits_TXT_JurisDescSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_JurisDescSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_JurisDescSearch,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_FPDcode =By.id("field_key$09a9ebc4-cc2a-36fa-b95a-9d295d0ec1d1$1municipality_code-textbox");
 	public WebElement getStateCoverageLimits_TXT_FPDcode(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_FPDcode ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_FPDcode,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_Fireprotectiondist =By.id("field_key$4a70262f-35d8-3c84-907e-b1cf2836efea$1municipality_desc-textbox");
 	public WebElement getStateCoverageLimits_TXT_Fireprotectiondist(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_Fireprotectiondist ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_Fireprotectiondist,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_DoNotApplyCityOrCountyTax =By.xpath("//span[contains(@id,'is_no_tax-checkbox')]/input");
 	public WebElement getStateCoverageLimits_CHK_DoNotApplyCityOrCountyTax(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_DoNotApplyCityOrCountyTax ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_DoNotApplyCityOrCountyTax,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_AllCityName =By.xpath("//span[contains(@id,'c_municipality_name-checkbox')]/input");
 	public WebElement getStateCoverageLimits_CHK_AllCityName(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_AllCityName ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_AllCityName,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_City =By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]");
 	public WebElement getStateCoverageLimits_TXT_City(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_City ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_City,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_CityCode =By.xpath("//*[contains(@id,'1risk_city_code-textbox')]");
 	public WebElement getStateCoverageLimits_TXT_CityCode(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_CityCode ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_CityCode,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_County =By.xpath("//*[contains(@id,'1risk_county-textbox')]");
 	public WebElement getStateCoverageLimits_TXT_County(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_County ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_County,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_CountyCode =By.xpath("//*[contains(@id,'1risk_county_code-textbox')]");
 	public WebElement getStateCoverageLimits_TXT_CountyCode(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_CountyCode ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_CountyCode,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_TaxCode =By.xpath("//*[contains(@id,'1risk_tax_code-textbox')]");
 	public WebElement getStateCoverageLimits_TXT_TaxCode(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_TaxCode ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_TaxCode,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_TXT_ExcessCoverage =By.id("field_key$0c39b603-479a-362c-a0c0-403f938dc1e4$1excess_pip-textbox");
 	public WebElement getStateCoverageLimits_TXT_ExcessCoverage(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_ExcessCoverage ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_ExcessCoverage,dataVal);
 	}
 	                            
 	public By StateCoverageLimits_CHK_PropertyProtectionInsurance =By.xpath("//span[@id='field_key$92312ade-7f1b-3816-bf99-051b2e380594$1loc_prop_protect_insu-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_PropertyProtectionInsurance(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_PropertyProtectionInsurance ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_PropertyProtectionInsurance,dataVal);
 	}
 	
 	
 	public By StateCoverageLimits_TXT_LC_ExcessCoverage =By.id("field_key$0c39b603-479a-362c-a0c0-403f938dc1e4$1excess_pip-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_ExcessCoverage(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_ExcessCoverage ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_ExcessCoverage,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_LC_ExcessCoverageSearch =By.xpath("//*[@id='field_key$0c39b603-479a-362c-a0c0-403f938dc1e4$1excess_pip-textbox']/../div");
 	public WebElement getStateCoverageLimits_TXT_LC_ExcessCoverageSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_ExcessCoverageSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_ExcessCoverageSearch,dataVal);
 	}
 	
 	                            
 	public By StateCoverageLimits_TXT_LC_ExcessCoverage_Deductible =By.id("field_key$14bf6050-a000-3a43-828e-374bf07fa36d$1deductible-textbox");
 	public WebElement getStateCoverageLimits_TXT_LC_ExcessCoverage_Deductible(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_ExcessCoverage_Deductible ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_ExcessCoverage_Deductible,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_LC_ExcessCoverage_DeductibleSearch =By.xpath("//*[@id='field_key$14bf6050-a000-3a43-828e-374bf07fa36d$1deductible-textbox']/../div");
 	public WebElement getStateCoverageLimits_TXT_LC_ExcessCoverage_DeductibleSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_LC_ExcessCoverage_DeductibleSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_LC_ExcessCoverage_DeductibleSearch,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctible =By.id("field_key$249f9690-0ebb-3674-9b32-91d8f46ac6c6$1deductible-textbox");
 	public WebElement getStateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctible(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctible ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctible,dataVal);
 	}
 	
 	public By StateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctibleSearch =By.xpath("//*[@id='field_key$249f9690-0ebb-3674-9b32-91d8f46ac6c6$1deductible-textbox']/../div");
 	public WebElement getStateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctibleSearch(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctibleSearch ,dataVal);
 	return se.element().getElement(StateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctibleSearch,dataVal);
 	}
 	
 	public By StateCoverageLimits_CHK_PropDamLiabilityCov_Buyback =By.xpath("//span[@id='field_key$9f2b8ff5-076c-323c-8698-bde4cacbbe2a$1loc_lmt_prop_dmg_liab-checkbox']/input");
 	public WebElement getStateCoverageLimits_CHK_PropDamLiabilityCov_Buyback(String dataVal)
 	{
 	se.element().waitForElement(StateCoverageLimits_CHK_PropDamLiabilityCov_Buyback ,dataVal);
 	return se.element().getElement(StateCoverageLimits_CHK_PropDamLiabilityCov_Buyback,dataVal);
 	}
 	     
 	
 	/*****************************************
 	 * End of StateCoverageLimit Page Locators
 	 ******************************************/
 	
 	/*****************************************
	 * Start of Locations page locators
	 ******************************************/
	
	public By Locations_LBL_Locations =By.xpath("//*[contains(@id,'lob_ca_locations-label')]");
	public WebElement getLocations_LBL_Locations()
	{
	se.element().waitForElement(Locations_LBL_Locations );
	return se.element().getElement(Locations_LBL_Locations);
	}
	
	public By Locations_BTN_CHKRow;
	public WebElement getLocations_BTN_CHKRow(String dataVal)
	{
		Locations_BTN_CHKRow =By.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-35ad8a40-d0da-39b3-b854-e5ad3fae60d2']/div[3]/div[1]/table/tbody/tr["+ dataVal +"]/td[2]//input");
	se.element().waitForElement(Locations_BTN_CHKRow ,dataVal);
	return se.element().getElement(Locations_BTN_CHKRow,dataVal);
	}
	
	public By Locations_BTN_DEL =By.id("35ad8a40-d0da-39b3-b854-e5ad3fae60d2-delete-image");
	public WebElement getLocations_BTN_DEL(String dataVal)
	{
	se.element().waitForElement(Locations_BTN_DEL ,dataVal);
	return se.element().getElement(Locations_BTN_DEL,dataVal);
	}
	                            
	public By Locations_BTN_Add =By.id("35ad8a40-d0da-39b3-b854-e5ad3fae60d2-add-image");
	public WebElement getLocations_BTN_Add(String dataVal)
	{
	se.element().waitForElement(Locations_BTN_Add ,dataVal);
	return se.element().getElement(Locations_BTN_Add,dataVal);
	}
	                            
	public By Locations_BTN_Done =By.id("/-continue-image");
	public WebElement getLocations_BTN_Done(String dataVal)
	{
	se.element().waitForElement(Locations_BTN_Done ,dataVal);
	return se.element().getElement(Locations_BTN_Done,dataVal);
	}
	                            
	public By Locations_BTN_Details;
	public WebElement getLocations_BTN_Details(String dataVal)
	{
		Locations_BTN_Details =By.id("instance_key$35ad8a40-d0da-39b3-b854-e5ad3fae60d2$"+dataVal+"lob_ca_locations-image");
	se.element().waitForElement(Locations_BTN_Details ,dataVal);
	return se.element().getElement(Locations_BTN_Details,dataVal);
	}
	                            
	public By Locations_TXT_LocationNumber =By.id("field_key$19f726a9-3a26-3547-8f9d-d32ebc430f0d$1location_no-textbox");
	public WebElement getLocations_TXT_LocationNumber(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_LocationNumber ,dataVal);
	return se.element().getElement(Locations_TXT_LocationNumber,dataVal);
	}
	                            
	public By Locations_CHK_CopyMailingAddress =By.xpath("//*[@id='field_key$29d35638-5561-32f0-acc1-b07340154a5b$1copy_mailing_address-checkbox']/input");
	public WebElement getLocations_CHK_CopyMailingAddress(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_CopyMailingAddress ,dataVal);
	return se.element().getElement(Locations_CHK_CopyMailingAddress,dataVal);
	}
	                            
	public By Locations_TXT_Name =By.id("field_key$61848e0e-a214-3900-a227-2734aafecaf9$1name-textbox");
	public WebElement getLocations_TXT_Name(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Name ,dataVal);
	return se.element().getElement(Locations_TXT_Name,dataVal);
	}
	                            
	public By Locations_CHK_MainLocation =By.xpath("//*[@id='field_key$61742572-9f81-3363-b167-488c45f68cd7$1main_location-checkbox']/input");
	public WebElement getLocations_CHK_MainLocation(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_MainLocation ,dataVal);
	return se.element().getElement(Locations_CHK_MainLocation,dataVal);
	}
	                            
	public By Locations_TXT_Description =By.id("field_key$5819d376-f029-37bc-b7ce-4307c725d3e9$1description-textbox");
	public WebElement getLocations_TXT_Description(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Description ,dataVal);
	return se.element().getElement(Locations_TXT_Description,dataVal);
	}
	                            
	public By Locations_TXT_LineStreet_1 =By.id("field_key$9f8a8908-2892-3ae3-b257-337db9ec119f$1line_1-textbox");
	public WebElement getLocations_TXT_LineStreet_1(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_LineStreet_1 ,dataVal);
	return se.element().getElement(Locations_TXT_LineStreet_1,dataVal);
	}
	                            
	public By Locations_TXT_LineStreet_2 =By.id("field_key$66b1e7a4-09af-38e2-ad88-74f0eb3f3d44$1line_2-textbox");
	public WebElement getLocations_TXT_LineStreet_2(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_LineStreet_2 ,dataVal);
	return se.element().getElement(Locations_TXT_LineStreet_2,dataVal);
	}
	                            
	public By Locations_TXT_City =By.id("field_key$b4e27cfb-744d-307a-af1f-694f67c01fbf$1city-textbox");
	public WebElement getLocations_TXT_City(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_City ,dataVal);
	return se.element().getElement(Locations_TXT_City,dataVal);
	}
	                            
	public By Locations_TXT_State =By.id("field_key$8c3b8d02-55f7-3d97-8a8a-e05e80411dd0$1state_desc-textbox");
	public WebElement getLocations_TXT_State(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_State ,dataVal);
	return se.element().getElement(Locations_TXT_State,dataVal);
	}
	public By Locations_TXT_StateSearch =By.xpath("//*[contains(@id,'$1state_desc-textbox')]/../div");
	public WebElement getLocations_TXT_StateSearch(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_StateSearch ,dataVal);
	return se.element().getElement(Locations_TXT_StateSearch,dataVal);
	}
	                            
	public By Locations_TXT_Zipcode =By.id("field_key$f29c7354-06e5-3546-8b00-3a774326d676$1zip_code-textbox");
	public WebElement getLocations_TXT_Zipcode(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Zipcode ,dataVal);
	return se.element().getElement(Locations_TXT_Zipcode,dataVal);
	}
	public By Locations_TXT_ZipcodeSearch =By.xpath("//*[contains(@id,'$1zip_code-textbox')]/../div");
	public WebElement getLocations_TXT_ZipcodeSearch(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_ZipcodeSearch ,dataVal);
	return se.element().getElement(Locations_TXT_ZipcodeSearch,dataVal);
	}
	                            
	public By Locations_TXT_SuggAddress =By.id("field_key$c38ef6fd-2dc9-381c-84a0-e94bfe17480d$1c_sugg_add-textbox");
	public WebElement getLocations_TXT_SuggAddress(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_SuggAddress ,dataVal);
	return se.element().getElement(Locations_TXT_SuggAddress,dataVal);
	}
	public By Locations_TXT_SuggAddressSearch =By.xpath("//*[contains(@id,'$1c_sugg_add-textbox')]/../div");
	public WebElement getLocations_TXT_SuggAddressSearch(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_SuggAddressSearch ,dataVal);
	return se.element().getElement(Locations_TXT_SuggAddressSearch,dataVal);
	}
	                            
	public By Locations_CHK_KeepAddressasEntered =By.xpath("//*[@id='field_key$f09db4ca-a9dc-3837-9122-7c4fedb91f17$1c_acpt_newadd-checkbox']/input");
	public WebElement getLocations_CHK_KeepAddressasEntered(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_KeepAddressasEntered ,dataVal);
	return se.element().getElement(Locations_CHK_KeepAddressasEntered,dataVal);
	}
	                            
	                            
	public By Locations_TXT_TerritoryCode =By.id("field_key$047ab819-264d-37fc-89d3-3edb62a46d21$1territory_code-textbox");
	public WebElement getLocations_TXT_TerritoryCode(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_TerritoryCode ,dataVal);
	return se.element().getElement(Locations_TXT_TerritoryCode,dataVal);
	}
	
	public By Locations_TXT_TerritoryCodeSearch =By.xpath("//*[contains(@id,'$1territory_code-textbox')]/../div");
	public WebElement getLocations_TXT_TerritoryCodeSearch(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_TerritoryCodeSearch ,dataVal);
	return se.element().getElement(Locations_TXT_TerritoryCodeSearch,dataVal);
	}
	                            
	public By Locations_TXT_TerritoryDesc =By.id("field_key$9144f99f-7d67-3fea-8fcd-27d326fa0a42$1territory_description-textbox");
	public WebElement getLocations_TXT_TerritoryDesc(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_TerritoryDesc ,dataVal);
	return se.element().getElement(Locations_TXT_TerritoryDesc,dataVal);
	}
	                            
	public By Locations_CHK_Interest_Tenant =By.xpath("//div[contains(text(),'Tenant')]/../../preceding-sibling::div[1]//input");
	public WebElement getLocations_CHK_Interest_Tenant(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_Interest_Tenant ,dataVal);
	return se.element().getElement(Locations_CHK_Interest_Tenant,dataVal);
	}
	                            
	public By Locations_CHK_Interest_Owner =By.xpath("//div[contains(text(),'Owner')]/../../preceding-sibling::div[1]//input");
	public WebElement getLocations_CHK_Interest_Owner(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_Interest_Owner ,dataVal);
	return se.element().getElement(Locations_CHK_Interest_Owner,dataVal);
	}
	                            
	public By Locations_TXT_JurisDesc =By.id("field_key$3449d7eb-8cc1-3187-b83e-becbd6194bec$1municipality-textbox");
	public WebElement getLocations_TXT_JurisDesc(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_JurisDesc ,dataVal);
	return se.element().getElement(Locations_TXT_JurisDesc,dataVal);
	}
	                            
	public By Locations_TXT_FPDcode =By.id("field_key$2a3a5649-5058-3026-8295-c328c8707840$1municipality_code-textbox");
	public WebElement getLocations_TXT_FPDcode(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_FPDcode ,dataVal);
	return se.element().getElement(Locations_TXT_FPDcode,dataVal);
	}
	                            
	public By Locations_TXT_Fireprotectiondist =By.id("field_key$9cbbf5bf-3847-3c20-87a8-1b525dbb1fd6$1municipality_desc-textbox");
	public WebElement getLocations_TXT_Fireprotectiondist(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Fireprotectiondist ,dataVal);
	return se.element().getElement(Locations_TXT_Fireprotectiondist,dataVal);
	}
	                            
	public By Locations_CHK_DonotapplyCity =By.xpath("//*[contains(text(),'Do not apply City or County Taxes?')]/../input");
	public WebElement getLocations_CHK_DonotapplyCity(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_DonotapplyCity ,dataVal);
	return se.element().getElement(Locations_CHK_DonotapplyCity,dataVal);
	}
	                            
	public By Locations_CHK_AllCityName =By.xpath("//*[contains(text(),'All City Name')]/../input");
	public WebElement getLocations_CHK_AllCityName(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_AllCityName ,dataVal);
	return se.element().getElement(Locations_CHK_AllCityName,dataVal);
	}
	
	
	public By Locations_TXT_KYCitySearch =By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]/../div[1]");
	public WebElement getLocations_TXT_KYCitySearch(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_KYCitySearch ,dataVal);
	return se.element().getElement(Locations_TXT_KYCitySearch,dataVal);
	}
	                            
	public By Locations_TXT_KYCity =By.id("field_key$7edb1e1a-01f6-34de-98cd-71c16304b0cc$1risk_municipality_name-textbox");
	public WebElement getLocations_TXT_KYCity(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_KYCity ,dataVal);
	return se.element().getElement(Locations_TXT_KYCity,dataVal);
	}
	
		
	public By Locations_TXT_Citycode =By.id("field_key$703f4729-3c75-30a6-840e-bd6797f7a024$1risk_city_code-textbox");
	public WebElement getLocations_TXT_Citycode(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Citycode ,dataVal);
	return se.element().getElement(Locations_TXT_Citycode,dataVal);
	}
	     
	public By Locations_TXT_CountySearch =By.xpath("//*[contains(@id,'1f0f9b$1risk_county-textbox')]/../div[1]");
	public WebElement getLocations_TXT_CountySearch(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_CountySearch ,dataVal);
	return se.element().getElement(Locations_TXT_CountySearch,dataVal);
	}
	
	public By Locations_TXT_County =By.id("field_key$37459884-0e3d-386e-b7ab-da216a1f0f9b$1risk_county-textbox");
	public WebElement getLocations_TXT_County(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_County ,dataVal);
	return se.element().getElement(Locations_TXT_County,dataVal);
	}
	                            
	public By Locations_TXT_CountyCode =By.id("field_key$b236ed25-8954-3469-af28-3af74a6f1a15$1risk_county_code-textbox");
	public WebElement getLocations_TXT_CountyCode(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_CountyCode ,dataVal);
	return se.element().getElement(Locations_TXT_CountyCode,dataVal);
	}
	                            
	public By Locations_TXT_Taxcode =By.id("field_key$c650c753-442a-3c0a-80b6-e3e55a8b77f4$1risk_tax_code-textbox");
	public WebElement getLocations_TXT_Taxcode(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Taxcode ,dataVal);
	return se.element().getElement(Locations_TXT_Taxcode,dataVal);
	}
	                            
	public By Locations_TXT_ClassIEmployeesRegularOperatorFullTime =By.id("field_key$9026b33e-8195-3d1c-b37f-9c735cb3dedc$1cl1_ft_regular-textbox");
	public WebElement getLocations_TXT_ClassIEmployeesRegularOperatorFullTime(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_ClassIEmployeesRegularOperatorFullTime ,dataVal);
	return se.element().getElement(Locations_TXT_ClassIEmployeesRegularOperatorFullTime,dataVal);
	}
	                            
	public By Locations_TXT_ClassIEmployeesRegularOperatorPartTime =By.id("field_key$5601ebab-af3e-304c-8895-4b0959ab31ea$1cl1_pt_regular-textbox");
	public WebElement getLocations_TXT_ClassIEmployeesRegularOperatorPartTime(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_ClassIEmployeesRegularOperatorPartTime ,dataVal);
	return se.element().getElement(Locations_TXT_ClassIEmployeesRegularOperatorPartTime,dataVal);
	}
	                            
	public By Locations_TXT_ClassIEmployeesAllOthersFullTime =By.id("field_key$dd4ed919-a1e9-33fc-bfeb-a3f1bf222e58$1cl1_ft_others-textbox");
	public WebElement getLocations_TXT_ClassIEmployeesAllOthersFullTime(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_ClassIEmployeesAllOthersFullTime ,dataVal);
	return se.element().getElement(Locations_TXT_ClassIEmployeesAllOthersFullTime,dataVal);
	}
	                            
	public By Locations_TXT_ClassIEmployeesAllOthersPartTime =By.id("field_key$9464fd4f-b036-3134-a243-92c8b7f642fd$1cl1_pt_others-textbox");
	public WebElement getLocations_TXT_ClassIEmployeesAllOthersPartTime(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_ClassIEmployeesAllOthersPartTime ,dataVal);
	return se.element().getElement(Locations_TXT_ClassIEmployeesAllOthersPartTime,dataVal);
	}
	                            
	public By Locations_TXT_ClassIINonEmployeesUnderAge25 =By.id("field_key$573b9233-a1bd-3432-b3be-b34b217c49d4$1cl2_underage-textbox");
	public WebElement getLocations_TXT_ClassIINonEmployeesUnderAge25(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_ClassIINonEmployeesUnderAge25 ,dataVal);
	return se.element().getElement(Locations_TXT_ClassIINonEmployeesUnderAge25,dataVal);
	}
	                            
	public By Locations_TXT_ClassIINonEmployeesAllOthers =By.id("field_key$c04de53d-1a31-35e9-8f14-bc211c6a0fff$1cl2_others-textbox");
	public WebElement getLocations_TXT_ClassIINonEmployeesAllOthers(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_ClassIINonEmployeesAllOthers ,dataVal);
	return se.element().getElement(Locations_TXT_ClassIINonEmployeesAllOthers,dataVal);
	}
	                            
	public By Locations_TXT_DealerOrTransporterPlateCount =By.id("field_key$44c5d7ed-8681-336a-82fa-b3643ca71099$1dlr_trans_plate_count-textbox");
	public WebElement getLocations_TXT_DealerOrTransporterPlateCount(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_DealerOrTransporterPlateCount ,dataVal);
	return se.element().getElement(Locations_TXT_DealerOrTransporterPlateCount,dataVal);
	}
	                            
	public By Locations_CHK_Locwithoutauto =By.xpath("//*[contains(text(),'Without Full Covered Autos')]/../../preceding-sibling::div[1]//input");
	public WebElement getLocations_CHK_Locwithoutauto(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_Locwithoutauto ,dataVal);
	return se.element().getElement(Locations_CHK_Locwithoutauto,dataVal);
	}
	                            
	public By Locations_CHK_Locwithauto =By.xpath("(//*[contains(text(),'Full Covered Autos')]/../../preceding-sibling::div[1]//input)[2]");
	public WebElement getLocations_CHK_Locwithauto(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_Locwithauto ,dataVal);
	return se.element().getElement(Locations_CHK_Locwithauto,dataVal);
	}
	                            
	public By Locations_TXT_classification_code =By.id("field_key$a7f97436-3e0c-3fb8-8438-2d71744ed99f$1classification_code-textbox");
	public WebElement getLocations_TXT_classification_code(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_classification_code ,dataVal);
	return se.element().getElement(Locations_TXT_classification_code,dataVal);
	}
	                            
	public By Locations_CHK_1liability =By.xpath("//*[contains(text(),'Liability')]/../input");
	public WebElement getLocations_CHK_1liability(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_1liability ,dataVal);
	return se.element().getElement(Locations_CHK_1liability,dataVal);
	}
	                            
	public By Locations_TXT_TortLimit =By.id("field_key$efa6ed20-3fb4-37de-ab9f-12049f935816$1tort_limit-textarea");
	public WebElement getLocations_TXT_TortLimit(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_TortLimit ,dataVal);
	return se.element().getElement(Locations_TXT_TortLimit,dataVal);
	}
	                            
	public By Locations_TXT_TortLimitCode =By.id("field_key$d2cb34f1-5efa-3991-88b0-53635b76ce59$1tort_limit_code-textbox");
	public WebElement getLocations_TXT_TortLimitCode(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_TortLimitCode ,dataVal);
	return se.element().getElement(Locations_TXT_TortLimitCode,dataVal);
	}
	                            
	public By Locations_TXT_CombinedSingleLimit =By.id("field_key$f380171e-4a9b-31b8-9652-3adc1b5bd76f$1combined_single_limit_disp-textbox");
	public WebElement getLocations_TXT_CombinedSingleLimit(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_CombinedSingleLimit ,dataVal);
	return se.element().getElement(Locations_TXT_CombinedSingleLimit,dataVal);
	}
	                            
	public By Locations_TXT_ProductsAndWorkYouPerformedAggregateLimit =By.id("field_key$7cc1dfdd-3aee-3391-ab4b-067e604d7abe$1prod_wrk_perfd_agg_lt-textbox");
	public WebElement getLocations_TXT_ProductsAndWorkYouPerformedAggregateLimit(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_ProductsAndWorkYouPerformedAggregateLimit ,dataVal);
	return se.element().getElement(Locations_TXT_ProductsAndWorkYouPerformedAggregateLimit,dataVal);
	}
	                            
	public By Locations_TXT_ProductsAndWorkYouPerformedOtherAggregateLimit =By.id("field_key$286c229c-16f6-3dac-8736-1932cc14abdd$1prod_wrk_perfd_otr_agg_lt-textbox");
	public WebElement getLocations_TXT_ProductsAndWorkYouPerformedOtherAggregateLimit(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_ProductsAndWorkYouPerformedOtherAggregateLimit ,dataVal);
	return se.element().getElement(Locations_TXT_ProductsAndWorkYouPerformedOtherAggregateLimit,dataVal);
	}
	                            
	public By Locations_TXT_GeneralLiabilityAggregateLimit =By.id("field_key$cb14a027-000b-31db-ad1f-2cb82e162f52$1aggregate_limit-textbox");
	public WebElement getLocations_TXT_GeneralLiabilityAggregateLimit(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_GeneralLiabilityAggregateLimit ,dataVal);
	return se.element().getElement(Locations_TXT_GeneralLiabilityAggregateLimit,dataVal);
	}
	                            
	public By Locations_TXT_GeneralLiabilityOtherAggregateLimit =By.id("field_key$ff9ef603-4478-367f-8ccc-b45d13b37ecb$1other_aggregate_limit-textbox");
	public WebElement getLocations_TXT_GeneralLiabilityOtherAggregateLimit(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_GeneralLiabilityOtherAggregateLimit ,dataVal);
	return se.element().getElement(Locations_TXT_GeneralLiabilityOtherAggregateLimit,dataVal);
	}
	                            
	public By Locations_TXT_Deductible =By.id("field_key$268ff109-be75-3315-81a6-de6009d78b0f$1deductible-textbox");
	public WebElement getLocations_TXT_Deductible(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Deductible ,dataVal);
	return se.element().getElement(Locations_TXT_Deductible,dataVal);
	}
	                            
	public By Locations_CHK_LocationDeductibleTypeCombinedSingleLimit =By.xpath("(//*[contains(text(),'Deductible Type')]/../../following-sibling::td[2]//input)[1]");
	public WebElement getLocations_CHK_LocationDeductibleTypeCombinedSingleLimit(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_LocationDeductibleTypeCombinedSingleLimit ,dataVal);
	return se.element().getElement(Locations_CHK_LocationDeductibleTypeCombinedSingleLimit,dataVal);
	}
	                            
	public By Locations_CHK_LocationDeductibleTypePropertyDmgperAccDed =By.xpath("(//*[contains(text(),'Deductible Type')]/../../following-sibling::td[2]//input)[2]");
	public WebElement getLocations_CHK_LocationDeductibleTypePropertyDmgperAccDed(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_LocationDeductibleTypePropertyDmgperAccDed ,dataVal);
	return se.element().getElement(Locations_CHK_LocationDeductibleTypePropertyDmgperAccDed,dataVal);
	}
	                            
	public By Locations_CHK_PersonalInjuryProtection =By.xpath("//*[contains(text(),'Personal Injury Protection')]/../input");
	public WebElement getLocations_CHK_PersonalInjuryProtection(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_PersonalInjuryProtection ,dataVal);
	return se.element().getElement(Locations_CHK_PersonalInjuryProtection,dataVal);
	}
	                            
	public By Locations_CHK_CoverageSelectionBuyBackPIP =By.xpath("(//*[contains(text(),'Coverage Selection')]/../../following-sibling::td[2]//input)[1]");
	public WebElement getLocations_CHK_CoverageSelectionBuyBackPIP(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_CoverageSelectionBuyBackPIP ,dataVal);
	return se.element().getElement(Locations_CHK_CoverageSelectionBuyBackPIP,dataVal);
	}
	                            
	public By Locations_CHK_CoverageSelectionGustPedestrianPIP =By.xpath("(//*[contains(text(),'Coverage Selection')]/../../following-sibling::td[2]//input)[2]");
	public WebElement getLocations_CHK_CoverageSelectionGustPedestrianPIP(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_CoverageSelectionGustPedestrianPIP ,dataVal);
	return se.element().getElement(Locations_CHK_CoverageSelectionGustPedestrianPIP,dataVal);
	}
	                            
	public By Locations_CHK_AdditionalPersonalInjuryProtection =By.xpath("//*[contains(text(),'Additional Personal Injury Protection')]/../input");
	public WebElement getLocations_CHK_AdditionalPersonalInjuryProtection(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_AdditionalPersonalInjuryProtection ,dataVal);
	return se.element().getElement(Locations_CHK_AdditionalPersonalInjuryProtection,dataVal);
	}
	                            
	public By Locations_CHK_AddPIPOptionNumber =By.id("field_key$9704ee42-bd23-3bb1-8498-cd34926efe9b$1option_number-textbox");
	public WebElement getLocations_CHK_AddPIPOptionNumber(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_AddPIPOptionNumber ,dataVal);
	return se.element().getElement(Locations_CHK_AddPIPOptionNumber,dataVal);
	}
	                            
	public By Locations_CHK_AddPIPMaximumLimit =By.id("field_key$a2e2830d-fa09-309c-958c-fa1eb1eff0ff$1maximum_limit-textbox");
	public WebElement getLocations_CHK_AddPIPMaximumLimit(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_AddPIPMaximumLimit ,dataVal);
	return se.element().getElement(Locations_CHK_AddPIPMaximumLimit,dataVal);
	}
	                            
	public By Locations_CHK_AddPIPTotalWeeklyMaxWorkLoss =By.id("field_key$755a32ee-1800-328d-854d-284e16cd9918$1tot_wkly_max_work_loss-textbox");
	public WebElement getLocations_CHK_AddPIPTotalWeeklyMaxWorkLoss(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_AddPIPTotalWeeklyMaxWorkLoss ,dataVal);
	return se.element().getElement(Locations_CHK_AddPIPTotalWeeklyMaxWorkLoss,dataVal);
	}
	                            
	public By Locations_CHK_AddPIPFuneralExpenses =By.id("field_key$87f9c8df-6834-3406-beec-653ef9972f2e$1funeral_expenses-textbox");
	public WebElement getLocations_CHK_AddPIPFuneralExpenses(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_AddPIPFuneralExpenses ,dataVal);
	return se.element().getElement(Locations_CHK_AddPIPFuneralExpenses,dataVal);
	}
	                            
	public By Locations_CHK_MedicalPayments_Auto =By.xpath("//*[contains(text(),'Medical Payments - Auto')]/../input");
	public WebElement getLocations_CHK_MedicalPayments_Auto(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_MedicalPayments_Auto ,dataVal);
	return se.element().getElement(Locations_CHK_MedicalPayments_Auto,dataVal);
	}
	                            
	public By Locations_TXT_AutoLimitEachPerson =By.id("field_key$ed9508ee-7441-33b8-bea5-9718911475e1$1limit_each_person-textbox");
	public WebElement getLocations_TXT_AutoLimitEachPerson(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_AutoLimitEachPerson ,dataVal);
	return se.element().getElement(Locations_TXT_AutoLimitEachPerson,dataVal);
	}
	                            
	public By Locations_CHK_MedicalPayments =By.xpath("//*[contains(text(),'Medical Payments - Locations and Operations')]/../input");
	public WebElement getLocations_CHK_MedicalPayments(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_MedicalPayments ,dataVal);
	return se.element().getElement(Locations_CHK_MedicalPayments,dataVal);
	}
	                            
	public By Locations_TXT_LOLimitEachPerson =By.id("field_key$868a8e8e-0515-3a5b-83a4-ff9cfaeb0072$1limit_each_person-textbox");
	public WebElement getLocations_TXT_LOLimitEachPerson(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_LOLimitEachPerson ,dataVal);
	return se.element().getElement(Locations_TXT_LOLimitEachPerson,dataVal);
	}
	                            
	/*public By Locations_TXT_limit_each_person_Medical_Payments_Auto =By.();
	public WebElement getLocations_TXT_limit_each_person_Medical_Payments_Auto(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_limit_each_person_Medical_Payments_Auto ,dataVal);
	return se.element().getElement(Locations_TXT_limit_each_person_Medical_Payments_Auto,dataVal);
	}*/
	                            
	public By Locations_CHK_UninsuredMotorist =By.xpath("//*[contains(text(),'Uninsured Motorist')]/../input");
	public WebElement getLocations_CHK_UninsuredMotorist(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_UninsuredMotorist ,dataVal);
	return se.element().getElement(Locations_CHK_UninsuredMotorist,dataVal);
	}
	                            
	/*public By Locations_TXT_CombinedSingleLimit =By.id("field_key$f958e756-2f5b-3125-9ca1-1f915ac6e78f$1combined_single_limit-textbox");
	public WebElement getLocations_TXT_CombinedSingleLimit(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_CombinedSingleLimit ,dataVal);
	return se.element().getElement(Locations_TXT_CombinedSingleLimit,dataVal);
	}*/
	                            
	public By Locations_CHK_UninsuredMotoristPD =By.xpath("//*[contains(text(),'Underinsured Motorist')]/../input");
	public WebElement getLocations_CHK_UninsuredMotoristPD(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_UninsuredMotoristPD ,dataVal);
	return se.element().getElement(Locations_CHK_UninsuredMotoristPD,dataVal);
	}
	                            
	public By Locations_TXT_UninsuredMotoristCombinedSingleLimit =By.id("field_key$d8d94992-84aa-351e-afa9-c9c530335854$1combined_single_limit-textbox");
	public WebElement getLocations_TXT_UninsuredMotoristCombinedSingleLimit(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_UninsuredMotoristCombinedSingleLimit ,dataVal);
	return se.element().getElement(Locations_TXT_UninsuredMotoristCombinedSingleLimit,dataVal);
	}
	                            
	public By Locations_CHK_OtherThanCollision =By.xpath("//*[contains(text(),'Other than Collision')]/../input");
	public WebElement getLocations_CHK_OtherThanCollision(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_OtherThanCollision ,dataVal);
	return se.element().getElement(Locations_CHK_OtherThanCollision,dataVal);
	}
	                            
	public By Locations_BTN_OtherThanCollisionAdd =By.id("24cdfb75-517e-3b20-b910-9cabe3e694c8-add-image");
	public WebElement getLocations_BTN_OtherThanCollisionAdd(String dataVal)
	{
	se.element().waitForElement(Locations_BTN_OtherThanCollisionAdd ,dataVal);
	return se.element().getElement(Locations_BTN_OtherThanCollisionAdd,dataVal);
	}
	                            
	public By Locations_TXT_LossTypeSearch =By.xpath("//input[contains(@id,'1loss_type-textbox')]/following-sibling::div");
	public WebElement getLocations_TXT_LossTypeSearch(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_LossTypeSearch ,dataVal);
	return se.element().getElement(Locations_TXT_LossTypeSearch,dataVal);
	}
	                            
	public By Locations_TXT_LossType =By.id("field_key$4762f7b1-b982-31c0-91ee-9eaef62166d1$1loss_type-textbox");
	public WebElement getLocations_TXT_LossType(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_LossType ,dataVal);
	return se.element().getElement(Locations_TXT_LossType,dataVal);
	}
	                            
	public By Locations_TXT_TypeOfPropertySearch =By.xpath("//*[contains(@id,'1property_type-textbox')]/../div[2]");
	public WebElement getLocations_TXT_TypeOfPropertySearch(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_TypeOfPropertySearch ,dataVal);
	return se.element().getElement(Locations_TXT_TypeOfPropertySearch,dataVal);
	}
	                            
	public By Locations_TXT_TypeOfProperty =By.id("field_key$7bc59ecf-8cdc-3629-a0af-1a592aa5422c$1property_type-textbox");
	public WebElement getLocations_TXT_TypeOfProperty(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_TypeOfProperty ,dataVal);
	return se.element().getElement(Locations_TXT_TypeOfProperty,dataVal);
	}
	                            
	public By Locations_CHK_IsAllPerilsDeductible =By.xpath("//*[contains(@id,'field_key$24df6065-bf08-34f7-b648-d8fa62a624f8$1is_all_perils_deduct-checkbox')]/input");
	public WebElement getLocations_CHK_IsAllPerilsDeductible(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_IsAllPerilsDeductible ,dataVal);
	return se.element().getElement(Locations_CHK_IsAllPerilsDeductible,dataVal);
	}
	                            
	public By Locations_TXT_Value =By.id("field_key$fc66849d-4851-314b-b3bf-cacf2f069b34$1value-textbox");
	public WebElement getLocations_TXT_Value(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Value ,dataVal);
	return se.element().getElement(Locations_TXT_Value,dataVal);
	}
	                            
	public By Locations_TXT_DeductiblePerCarSearch =By.xpath("//*[contains(@id,'1deductible_per_car-textbox')]/../div[2]");
	public WebElement getLocations_TXT_DeductiblePerCarSearch(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_DeductiblePerCarSearch ,dataVal);
	return se.element().getElement(Locations_TXT_DeductiblePerCarSearch,dataVal);
	}
	                            
	public By Locations_TXT_DeductiblePerCar =By.id("field_key$e3bef965-ed64-3fe4-a0ff-38ae5206a634$1deductible_per_car-textbox");
	public WebElement getLocations_TXT_DeductiblePerCar(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_DeductiblePerCar ,dataVal);
	return se.element().getElement(Locations_TXT_DeductiblePerCar,dataVal);
	}
	                            
	public By Locations_TXT_DeductiblePerOccurrence =By.id("field_key$3c84abc9-7e89-3a8e-92e4-d8800290a32e$1deductible_per_occu-textbox");
	public WebElement getLocations_TXT_DeductiblePerOccurrence(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_DeductiblePerOccurrence ,dataVal);
	return se.element().getElement(Locations_TXT_DeductiblePerOccurrence,dataVal);
	}
	
	public By Locations_TXT_DeductiblePerOccurrenceSearch =By.xpath("//*[contains(@id,'1deductible_per_occu-textbox')]/../div");;
	public WebElement getLocations_TXT_DeductiblePerOccurrenceSearch(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_DeductiblePerOccurrenceSearch ,dataVal);
	return se.element().getElement(Locations_TXT_DeductiblePerOccurrenceSearch,dataVal);
	}
	                            
	public By Locations_TXT_WindHailDeductibleEachCoveredAutoSearch =By.xpath("//*[contains(@id,'1wind_ded_each_auto-textbox')]/../div[2]");
	public WebElement getLocations_TXT_WindHailDeductibleEachCoveredAutoSearch(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_WindHailDeductibleEachCoveredAutoSearch ,dataVal);
	return se.element().getElement(Locations_TXT_WindHailDeductibleEachCoveredAutoSearch,dataVal);
	}
	                            
	public By Locations_TXT_WindHailDeductibleEachCoveredAuto =By.id("field_key$677c2173-373d-3690-a0ad-49083e695ff1$1wind_ded_each_auto-textbox");
	public WebElement getLocations_TXT_WindHailDeductibleEachCoveredAuto(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_WindHailDeductibleEachCoveredAuto ,dataVal);
	return se.element().getElement(Locations_TXT_WindHailDeductibleEachCoveredAuto,dataVal);
	}
	                            
	public By Locations_TXT_WindHailDeductibleAnyOneEvent =By.id("field_key$34b4f4e3-2579-3067-a975-12b50d4ab469$1wind_ded_any_occ-textbox");
	public WebElement getLocations_TXT_WindHailDeductibleAnyOneEvent(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_WindHailDeductibleAnyOneEvent ,dataVal);
	return se.element().getElement(Locations_TXT_WindHailDeductibleAnyOneEvent,dataVal);
	}
	                            
	public By Locations_CHK_IsFalsePretenseCoverage =By.xpath("//*[contains(text(),'False Pretense Coverage')]/../input");
	public WebElement getLocations_CHK_IsFalsePretenseCoverage(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_IsFalsePretenseCoverage ,dataVal);
	return se.element().getElement(Locations_CHK_IsFalsePretenseCoverage,dataVal);
	}
	                            
	public By Locations_TXT_LimitSearch =By.xpath("//*[contains(@id,'1limit-textbox')]/../div");
	public WebElement getLocations_TXT_LimitSearch(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_LimitSearch ,dataVal);
	return se.element().getElement(Locations_TXT_LimitSearch,dataVal);
	}
	                            
	public By Locations_TXT_Limit =By.id("field_key$67062834-c769-3013-996f-d94add87ef47$1limit-textbox");
	public WebElement getLocations_TXT_Limit(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Limit ,dataVal);
	return se.element().getElement(Locations_TXT_Limit,dataVal);
	}
	                            
	public By Locations_TXT_TotalInventoryValue =By.id("field_key$5ce3b392-b305-3400-9a83-4324649cac06$1total_inventory_val-textbox");
	public WebElement getLocations_TXT_TotalInventoryValue(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_TotalInventoryValue ,dataVal);
	return se.element().getElement(Locations_TXT_TotalInventoryValue,dataVal);
	}
	                            
	public By Locations_CHK_OwnerPremises =By.xpath("//*[contains(text(),'Owner of Premises')]/../input");
	public WebElement getLocations_CHK_OwnerPremises(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_OwnerPremises ,dataVal);
	return se.element().getElement(Locations_CHK_OwnerPremises,dataVal);
	}
	                            
	public By Locations_TXT_NameOfPerson =By.id("field_key$2f1fedfc-20ba-3470-afff-f373b97c2f8e$1per_org_name-textbox");
	public WebElement getLocations_TXT_NameOfPerson(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_NameOfPerson ,dataVal);
	return se.element().getElement(Locations_TXT_NameOfPerson,dataVal);
	}
	                            
	public By Locations_TXT_AutoDealerCollisionLimit =By.id("field_key$ec7c5d19-2b22-3b22-9e43-709f207dacab$1auto_dealer_coll_limit-textbox");
	public WebElement getLocations_TXT_AutoDealerCollisionLimit(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_AutoDealerCollisionLimit ,dataVal);
	return se.element().getElement(Locations_TXT_AutoDealerCollisionLimit,dataVal);
	}
	                            
	public By Locations_TXT_RepossessedAutoDealerCollisionTotalValues =By.id("field_key$9a7e5cd9-82dd-3019-aaa9-dcb984a7b014$1reposs_auto_coll_limit-textbox");
	public WebElement getLocations_TXT_RepossessedAutoDealerCollisionTotalValues(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_RepossessedAutoDealerCollisionTotalValues ,dataVal);
	return se.element().getElement(Locations_TXT_RepossessedAutoDealerCollisionTotalValues,dataVal);
	}
	                            
	public By Locations_TXT_AutoDealerCollisionCoverageSearch =By.xpath("//*[contains(@id,'1auto_dealer_coll_cov-textbox')]/../div");
	public WebElement getLocations_TXT_AutoDealerCollisionCoverageSearch(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_AutoDealerCollisionCoverageSearch ,dataVal);
	return se.element().getElement(Locations_TXT_AutoDealerCollisionCoverageSearch,dataVal);
	}
	                            
	public By Locations_TXT_AutoDealerCollisionCoverage =By.id("field_key$81b98566-6609-3166-a795-45cdcc95d74c$1auto_dealer_coll_cov-textbox");
	public WebElement getLocations_TXT_AutoDealerCollisionCoverage(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_AutoDealerCollisionCoverage ,dataVal);
	return se.element().getElement(Locations_TXT_AutoDealerCollisionCoverage,dataVal);
	}
	                            

	
	/*****************************************
	 * End of Locations page locators
	 ******************************************/
	
	
	/*****************************************
	 * Start of CommAuto Locators
	 ******************************************/
	
	public By CA_BTN_Label = By.xpath("//*[contains(@id,'policy_lob_ca-label')]");
	public WebElement getCA_BTN_Label()
	{
	se.element().waitForElement(CA_BTN_Label);
	return se.element().getElement(CA_BTN_Label);
	}
	
	public By CA_DDN_SelectCoverage =By.xpath("//div[@id='field_key$418997d1-ba1c-3105-be12-0e449d5a8fb4$1selected_coverage-listbox']/div");
	public WebElement getCA_DDN_SelectCoverage()
	{
	se.element().waitForElement(CA_DDN_SelectCoverage);
	return se.element().getElement(CA_DDN_SelectCoverage);
	}
	
	public By CA_DDN_SelectCoverageOption;
	public WebElement getCA_DDN_SelectCoverageOption(String dataVal){
		CA_DDN_SelectCoverageOption = By.xpath("//div[@id='VAADIN_COMBOBOX_OPTIONLIST']//tr//span[text()='"+dataVal+"']/..");
	se.element().waitForElement(CA_DDN_SelectCoverageOption);
	return se.element().getElement(CA_DDN_SelectCoverageOption);
	}
	
	                            
	public By CA_TXT_PrimaryState =By.id("field_key$2ac49583-3231-3234-a335-f835dfbe8ebe$1primary_state-textbox");
	public WebElement getCA_TXT_PrimaryState(String dataVal)
	{
	se.element().waitForElement(CA_TXT_PrimaryState ,dataVal);
	return se.element().getElement(CA_TXT_PrimaryState,dataVal);
	}
	                            
	public By CA_TXT_PrimaryStateSearch =By.xpath("//*[contains(@id,'1primary_state-textbox')]/../div");
	public WebElement getCA_TXT_PrimaryStateSearch(String dataVal)
	{
	se.element().waitForElement(CA_TXT_PrimaryStateSearch ,dataVal);
	return se.element().getElement(CA_TXT_PrimaryStateSearch,dataVal);
	}
	                            
	public By CA_CHK_Fleet =By.xpath("//html/body//span[@id='field_key$3de35354-2af4-3ee0-a904-4a36e099ffe6$1is_fleet-checkbox']/input");
	public WebElement getCA_CHK_Fleet(String dataVal)
	{
	se.element().waitForElement(CA_CHK_Fleet ,dataVal);
	return se.element().getElement(CA_CHK_Fleet,dataVal);
	}
	
	public By CA_TXT_NAICSCode =By.id("field_key$de46fc3e-ad8a-35fd-b12c-69d11360608a$1naics_code-textbox");
	public WebElement getCA_TXT_NAICSCode(String dataVal)
	{
	se.element().waitForElement(CA_TXT_NAICSCode ,dataVal);
	return se.element().getElement(CA_TXT_NAICSCode,dataVal);
	}
	                            
	public By CA_TXT_NAICSCodeSearch =By.xpath("//*[contains(@id,'1naics_code-textbox')]/../div");
	public WebElement getCA_TXT_NAICSCodeSearch(String dataVal)
	{
	se.element().waitForElement(CA_TXT_NAICSCodeSearch ,dataVal);
	return se.element().getElement(CA_TXT_NAICSCodeSearch,dataVal);
	}
	//Predictive Modeling changes for CA Agribusiness
	public By CA_CHK_ElectronicMonitoringDevice =By.xpath("//*[@id='field_key$3d7d8c75-2a44-3e8c-9ce8-673747814051$1c_elec_mon_dev_tel-checkbox']/input");
	public WebElement getCA_CHK_ElectronicMonitoringDevice(String dataVal)
	{
	se.element().waitForElement(CA_CHK_ElectronicMonitoringDevice ,dataVal);
	return se.element().getElement(CA_CHK_ElectronicMonitoringDevice,dataVal);
	}
	
	public By CA_CHK_ExperienceRating =By.xpath("//*[@id='field_key$0d720a08-cc09-382a-b243-be45220f3894$1is_exp_rating-checkbox']/input");
	public WebElement getCA_CHK_ExperienceRating(String dataVal)
	{
	se.element().waitForElement(CA_CHK_ExperienceRating ,dataVal);
	return se.element().getElement(CA_CHK_ExperienceRating,dataVal);
	}
	                            
	public By CA_CHK_Audit =By.xpath("//html/body//span[@id='field_key$6556ad69-f214-3903-a468-c3120cf68fed$1is_audit-checkbox']/input");
	public WebElement getCA_CHK_Audit(String dataVal)
	{
	se.element().waitForElement(CA_CHK_Audit ,dataVal);
	return se.element().getElement(CA_CHK_Audit,dataVal);
	}
	                            
	public By CA_DDN_HazardGrade =By.xpath("//html/body//div[@id='field_key$83c45948-37b9-38f3-b77e-f090f8b2235e$1hazard_grade-listbox']/input");
	public WebElement getCA_DDN_HazardGrade(String dataVal)
	{
	se.element().waitForElement(CA_DDN_HazardGrade ,dataVal);
	return se.element().getElement(CA_DDN_HazardGrade,dataVal);
	}
	
	public By CA_TXT_LoggerCreditType =By.id("field_key$9806c53c-4886-3177-97fd-6cb8c48a9431$1logger_credit_type-textbox");
	public WebElement getCA_TXT_LoggerCreditType(String dataVal)
	{
	se.element().waitForElement(CA_TXT_LoggerCreditType ,dataVal);
	return se.element().getElement(CA_TXT_LoggerCreditType,dataVal);
	}
	public By CA_TXT_LoggerCreditTypeMagnifier =By.xpath("//*[@id='field_key$9806c53c-4886-3177-97fd-6cb8c48a9431$1logger_credit_type-textbox']/../div");
	public WebElement getCA_TXT_LoggerCreditTypeMagnifier(String dataVal)
	{
	se.element().waitForElement(CA_TXT_LoggerCreditTypeMagnifier ,dataVal);
	return se.element().getElement(CA_TXT_LoggerCreditTypeMagnifier,dataVal);
	}	                       
	public By CA_CHK_ExpiringFullTerm_Yes =By.xpath("(//span[text() ='Expiring Full Term Premium Exceeds $2,500?']/../../following-sibling::td[2]//input)[1]");
	public WebElement getCA_CHK_ExpiringFullTerm_Yes(String dataVal)
	{
	se.element().waitForElement(CA_CHK_ExpiringFullTerm_Yes ,dataVal);
	return se.element().getElement(CA_CHK_ExpiringFullTerm_Yes,dataVal);
	}
	                            
	public By CA_CHK_ExpiringFullTerm_No =By.xpath("(//span[text() ='Expiring Full Term Premium Exceeds $2,500?']/../../following-sibling::td[2]//input)[2]");
	public WebElement getCA_CHK_ExpiringFullTerm_No(String dataVal)
	{
	se.element().waitForElement(CA_CHK_ExpiringFullTerm_No ,dataVal);
	return se.element().getElement(CA_CHK_ExpiringFullTerm_No,dataVal);
	}
	                            
	public By CA_CHK_RenewalRewards =By.xpath("//html/body//span[@id='field_key$563218ff-2c34-3d34-a9dc-46c81d933fef$1renewal_rewards-checkbox']/input");
	public WebElement getCA_CHK_RenewalRewards(String dataVal)
	{
	se.element().waitForElement(CA_CHK_RenewalRewards ,dataVal);
	return se.element().getElement(CA_CHK_RenewalRewards,dataVal);
	}
	                            
	public By CA_TXT_OriginalInceptionYear =By.id("field_key$ad0a5a64-4ed9-3284-8af9-58c699388a5c$1original_inception_year-textbox");
	public WebElement getCA_TXT_OriginalInceptionYear(String dataVal)
	{
	se.element().waitForElement(CA_TXT_OriginalInceptionYear ,dataVal);
	return se.element().getElement(CA_TXT_OriginalInceptionYear,dataVal);
	}
	                            
	public By CA_CHK_AccountCredit =By.xpath("//html/body//span[@id='field_key$ac88080d-3da2-3076-8341-4c2a8b07e3c8$1account_credit-checkbox']/input");
	public WebElement getCA_CHK_AccountCredit(String dataVal)
	{
	se.element().waitForElement(CA_CHK_AccountCredit ,dataVal);
	return se.element().getElement(CA_CHK_AccountCredit,dataVal);
	}
	                            
	public By CA_TXT_NumberofEligiblepolicies =By.id("field_key$826b0353-d713-3872-afe3-1ec940cab803$1number_of_eligible_pol-textbox");
	public WebElement getCA_TXT_NumberofEligiblepolicies(String dataVal)
	{
	se.element().waitForElement(CA_TXT_NumberofEligiblepolicies ,dataVal);
	return se.element().getElement(CA_TXT_NumberofEligiblepolicies,dataVal);
	}
	                            
	public By CA_TXT_Liability_Assoc_Grp_Ftr =By.id("field_key$dd58a8d9-aa7d-323b-9475-1f9798c00abd$1liability_assoc_grp_ftr-textbox");
	public WebElement getCA_TXT_Liability_Assoc_Grp_Ftr(String dataVal)
	{
	se.element().waitForElement(CA_TXT_Liability_Assoc_Grp_Ftr ,dataVal);
	return se.element().getElement(CA_TXT_Liability_Assoc_Grp_Ftr,dataVal);
	}
	                            
	public By CA_TXT_Phys_Dmg_Assoc_Grp_Ftr =By.id("field_key$d1d2f101-2819-33f2-baf4-b0a90b305815$1phys_dmg_assoc_grp_ftr-textbox");
	public WebElement getCA_TXT_Phys_Dmg_Assoc_Grp_Ftr(String dataVal)
	{
	se.element().waitForElement(CA_TXT_Phys_Dmg_Assoc_Grp_Ftr ,dataVal);
	return se.element().getElement(CA_TXT_Phys_Dmg_Assoc_Grp_Ftr,dataVal);
	}
	                            
	public By CA_TXT_Liability_Misc_Ftr =By.id("field_key$3354c696-e4a5-36cc-8c4c-21f277eb8837$1liability_misc_ftr-textbox");
	public WebElement getCA_TXT_Liability_Misc_Ftr(String dataVal)
	{
	se.element().waitForElement(CA_TXT_Liability_Misc_Ftr ,dataVal);
	return se.element().getElement(CA_TXT_Liability_Misc_Ftr,dataVal);
	}
	public By CA_TXT_Liability_MiscFtrReason =By.id("field_key$2efb0f90-385d-3a48-adfc-70de6b6ee7cb$1liability_misc_reason-textbox");
	public WebElement getCA_TXT_Liability_MiscFtrReason(String dataVal)
	{
	se.element().waitForElement(CA_TXT_Liability_MiscFtrReason ,dataVal);
	return se.element().getElement(CA_TXT_Liability_MiscFtrReason,dataVal);
	}	
	public By CA_TXT_Liability_MiscFtrReasonSearch =By.xpath("//*[@id='field_key$2efb0f90-385d-3a48-adfc-70de6b6ee7cb$1liability_misc_reason-textbox']/../div");
	public WebElement getCA_TXT_Liability_MiscFtrReasonSearch(String dataVal)
	{
	se.element().waitForElement(CA_TXT_Liability_MiscFtrReasonSearch ,dataVal);
	return se.element().getElement(CA_TXT_Liability_MiscFtrReasonSearch,dataVal);
	}                         
	public By CA_TXT_Physical_Dmge_Misc_Ftr =By.id("field_key$1d897f01-053f-3e06-aa29-9e6f64c30ee4$1physical_dmge_misc_ftr-textbox");
	public WebElement getCA_TXT_Physical_Dmge_Misc_Ftr(String dataVal)
	{
	se.element().waitForElement(CA_TXT_Physical_Dmge_Misc_Ftr ,dataVal);
	return se.element().getElement(CA_TXT_Physical_Dmge_Misc_Ftr,dataVal);
	}
	                            
	public By CA_CHK_ExcludeTransport_OnDemandDelivery =By.xpath("//html/body//span[@id='field_key$2789a82a-8fd9-3ec1-9b01-2c2c944ba59b$1c_ex_trans_npcodds-checkbox']/input");
	public WebElement getCA_CHK_ExcludeTransport_OnDemandDelivery(String dataVal)
	{
	se.element().waitForElement(CA_CHK_ExcludeTransport_OnDemandDelivery ,dataVal);
	return se.element().getElement(CA_CHK_ExcludeTransport_OnDemandDelivery,dataVal);
	}
	                            
	public By CA_CHK_ExcludeTransport_ConvOnly =By.xpath("//html/body//span[@id='field_key$400b99e0-c3cb-3165-8b62-149ddb380eb7$1c_ex_trans_npco-checkbox']/input");
	public WebElement getCA_CHK_ExcludeTransport_ConvOnly(String dataVal)
	{
	se.element().waitForElement(CA_CHK_ExcludeTransport_ConvOnly ,dataVal);
	return se.element().getElement(CA_CHK_ExcludeTransport_ConvOnly,dataVal);
	}
	                            
	public By CA_CHK_Total_Poll_Exc_otherthancov_autos =By.xpath("//html/body//span[@id='field_key$1c72542f-56f5-3a8f-ae46-e81febe73e24$1total_pol_ex_otcov_auto-checkbox']/input");
	public WebElement getCA_CHK_Total_Poll_Exc_otherthancov_autos(String dataVal)
	{
	se.element().waitForElement(CA_CHK_Total_Poll_Exc_otherthancov_autos ,dataVal);
	return se.element().getElement(CA_CHK_Total_Poll_Exc_otherthancov_autos,dataVal);
	}
	                            
	public By CA_TXT_Classification =By.id("field_key$12cd5871-28da-3d8f-9142-4b0caae4abb4$1classification-textbox");
	public WebElement getCA_TXT_Classification(String dataVal)
	{
	se.element().waitForElement(CA_TXT_Classification ,dataVal);
	return se.element().getElement(CA_TXT_Classification,dataVal);
	}
	
	public By CA_TXT_ClassificationSearch =By.xpath("//*[@id='field_key$12cd5871-28da-3d8f-9142-4b0caae4abb4$1classification-textbox']/../div");
	public WebElement getCA_TXT_ClassificationSearch(String dataVal)
	{
	se.element().waitForElement(CA_TXT_ClassificationSearch ,dataVal);
	return se.element().getElement(CA_TXT_ClassificationSearch,dataVal);
	}
	                            
	public By CA_CHK_Franchised =By.xpath("(//span[text() ='Franchised/Non-Franchised']/../../following-sibling::td[2]//input)[1]");
	public WebElement getCA_CHK_Franchised(String dataVal)
	{
	se.element().waitForElement(CA_CHK_Franchised ,dataVal);
	return se.element().getElement(CA_CHK_Franchised,dataVal);
	}
	                            
	public By CA_CHK_Nonfranchised =By.xpath("(//span[text() ='Franchised/Non-Franchised']/../../following-sibling::td[2]//input)[2]");
	public WebElement getCA_CHK_Nonfranchised(String dataVal)
	{
	se.element().waitForElement(CA_CHK_Nonfranchised ,dataVal);
	return se.element().getElement(CA_CHK_Nonfranchised,dataVal);
	}
	                            
	public By CA_CHK_Equipdealer =By.xpath("(//span[text() ='Franchised/Non-Franchised']/../../following-sibling::td[2]//input)[3]");
	public WebElement getCA_CHK_Equipdealer(String dataVal)
	{
	se.element().waitForElement(CA_CHK_Equipdealer ,dataVal);
	return se.element().getElement(CA_CHK_Equipdealer,dataVal);
	}
	                            
	public By CA_TXT_Reporting_Basis =By.id("field_key$91d700c9-ccfe-3305-ad70-e8f7c10114f9$1reporting_basis-textbox");
	public WebElement getCA_TXT_Reporting_Basis(String dataVal)
	{
	se.element().waitForElement(CA_TXT_Reporting_Basis ,dataVal);
	return se.element().getElement(CA_TXT_Reporting_Basis,dataVal);
	}
	
	public By CA_TXT_Reporting_BasisSearch =By.xpath("//*[@id='field_key$91d700c9-ccfe-3305-ad70-e8f7c10114f9$1reporting_basis-textbox']/../div[1]");
	public WebElement getCA_TXT_Reporting_BasisSearch(String dataVal)
	{
	se.element().waitForElement(CA_TXT_Reporting_BasisSearch ,dataVal);
	return se.element().getElement(CA_TXT_Reporting_BasisSearch,dataVal);
	}
	                            
	public By CA_TXT_auto_dealer_collision =By.id("field_key$ff329e45-6455-38b3-9237-fd56720d00dd$1auto_dealer_collision-textbox");
	public WebElement getCA_TXT_auto_dealer_collision(String dataVal)
	{
	se.element().waitForElement(CA_TXT_auto_dealer_collision ,dataVal);
	return se.element().getElement(CA_TXT_auto_dealer_collision,dataVal);
	}
	                            
	public By CA_TXT_auto_dealer_collisionSearch =By.xpath("//*[contains(@id,'1auto_dealer_collision-textbox')]/../div[1]");
	public WebElement getCA_TXT_auto_dealer_collisionSearch(String dataVal)
	{
	se.element().waitForElement(CA_TXT_auto_dealer_collisionSearch ,dataVal);
	return se.element().getElement(CA_TXT_auto_dealer_collisionSearch,dataVal);
	}
	                                      
	public By CA_TXT_auto_dealer_coll_ded =By.id("field_key$0c6cfdfd-ef58-312c-9dc2-903ecdd1130f$1auto_dealer_coll_ded-textbox");
	public WebElement getCA_TXT_auto_dealer_coll_ded(String dataVal)
	{
	se.element().waitForElement(CA_TXT_auto_dealer_coll_ded ,dataVal);
	return se.element().getElement(CA_TXT_auto_dealer_coll_ded,dataVal);
	}
	
	public By CA_TXT_auto_dealer_coll_dedSearch =By.xpath("//*[@id='field_key$0c6cfdfd-ef58-312c-9dc2-903ecdd1130f$1auto_dealer_coll_ded-textbox']/../div");
	public WebElement getCA_TXT_auto_dealer_coll_dedSearch(String dataVal)
	{
	se.element().waitForElement(CA_TXT_auto_dealer_coll_dedSearch ,dataVal);
	return se.element().getElement(CA_TXT_auto_dealer_coll_dedSearch,dataVal);
	}
	                            
	public By CA_CHK_ActsErrorsorOmissionsLiability =By.xpath("//html/body//span[@id='field_key$6f316746-3553-3973-b1ef-43aa285c3607$1lob_is_aol_liability-checkbox']/input");
	public WebElement getCA_CHK_ActsErrorsorOmissionsLiability(String dataVal)
	{
	se.element().waitForElement(CA_CHK_ActsErrorsorOmissionsLiability ,dataVal);
	return se.element().getElement(CA_CHK_ActsErrorsorOmissionsLiability,dataVal);
	}
	                            
	public By CA_TXT_ActsErrorsorOmissionsLiabilityLimit =By.xpath("//*[@id='field_key$868344d7-29fe-3a24-9fdc-4dcff7304426$1c_limit-textbox']");
	public WebElement getCA_TXT_ActsErrorsorOmissionsLiabilityLimit(String dataVal)
	{
	se.element().waitForElement(CA_TXT_ActsErrorsorOmissionsLiabilityLimit ,dataVal);
	return se.element().getElement(CA_TXT_ActsErrorsorOmissionsLiabilityLimit,dataVal);
	}
	
	public By CA_TXT_ActsErrorsorOmissionsLiabilityLimitSearch =By.xpath("//*[@id='field_key$868344d7-29fe-3a24-9fdc-4dcff7304426$1c_limit-textbox']/../div");
	public WebElement getCA_TXT_ActsErrorsorOmissionsLiabilityLimitSearch(String dataVal)
	{
	se.element().waitForElement(CA_TXT_ActsErrorsorOmissionsLiabilityLimitSearch ,dataVal);
	return se.element().getElement(CA_TXT_ActsErrorsorOmissionsLiabilityLimitSearch,dataVal);
	}
	                            
	public By CA_CHK_Exl_Dmg_Rent_Prem_Cover =By.xpath("//html/body//span[@id='field_key$7f2d5538-b766-352e-bd43-95f470cccf34$1exl_dmg_rent_prem_cover-checkbox']/input");
	public WebElement getCA_CHK_Exl_Dmg_Rent_Prem_Cover(String dataVal)
	{
	se.element().waitForElement(CA_CHK_Exl_Dmg_Rent_Prem_Cover ,dataVal);
	return se.element().getElement(CA_CHK_Exl_Dmg_Rent_Prem_Cover,dataVal);
	}
	                            
	public By CA_CHK_Exc_Prods_Work_Perf =By.xpath("//html/body//span[@id='field_key$7a38baaa-7266-3ee4-b8dc-a7130655a6c7$1exc_prods_work_perfd-checkbox']/input");
	public WebElement getCA_CHK_Exc_Prods_Work_Perf(String dataVal)
	{
	se.element().waitForElement(CA_CHK_Exc_Prods_Work_Perf ,dataVal);
	return se.element().getElement(CA_CHK_Exc_Prods_Work_Perf,dataVal);
	}
	                            
	public By CA_CHK_Excl_Persnl_Inju_Liab =By.xpath("//html/body//span[@id='field_key$43beb69a-e0c0-3c00-9ca0-618fec14dd68$1excl_persnl_inju_liab-checkbox']/input");
	public WebElement getCA_CHK_Excl_Persnl_Inju_Liab(String dataVal)
	{
	se.element().waitForElement(CA_CHK_Excl_Persnl_Inju_Liab ,dataVal);
	return se.element().getElement(CA_CHK_Excl_Persnl_Inju_Liab,dataVal);
	}
	                            
	public By CA_TXT_Reposs_Auto_Coll =By.id("field_key$499ca1b2-16ca-328e-84a0-642385ab1d89$1reposs_auto_collision-textbox");
	public WebElement getCA_TXT_Reposs_Auto_Coll(String dataVal)
	{
	se.element().waitForElement(CA_TXT_Reposs_Auto_Coll ,dataVal);
	return se.element().getElement(CA_TXT_Reposs_Auto_Coll,dataVal);
	}
	                            
	public By CA_TXT_Reposs_Auto_CollSearch =By.xpath("//*[contains(@id,'1reposs_auto_collision-textbox')]/../div");
	public WebElement getCA_TXT_Reposs_Auto_CollSearch(String dataVal)
	{
	se.element().waitForElement(CA_TXT_Reposs_Auto_CollSearch ,dataVal);
	return se.element().getElement(CA_TXT_Reposs_Auto_CollSearch,dataVal);
	}
	                            
	public By CA_TXT_Reposs_Auto_Coll_Ded =By.id("field_key$38cb32eb-7737-3967-8250-bde3d732b544$1reposs_auto_coll_ded-textbox");
	public WebElement getCA_TXT_Reposs_Auto_Coll_Ded(String dataVal)
	{
	se.element().waitForElement(CA_TXT_Reposs_Auto_Coll_Ded ,dataVal);
	return se.element().getElement(CA_TXT_Reposs_Auto_Coll_Ded,dataVal);
	}
	                            
	public By CA_TXT_Reposs_Auto_Coll_DedSearch =By.xpath("//*[contains(@id,'1reposs_auto_coll_ded-textbox')]/../div");
	public WebElement getCA_TXT_Reposs_Auto_Coll_DedSearch(String dataVal)
	{
	se.element().waitForElement(CA_TXT_Reposs_Auto_Coll_DedSearch ,dataVal);
	return se.element().getElement(CA_TXT_Reposs_Auto_Coll_DedSearch,dataVal);
	}
	                            
	public By CA_TXT_Auto_Held_Srv_Collision =By.id("field_key$e0951b1b-695a-3316-b514-d8a737da33a6$1auto_held_srv_collision-textbox");
	public WebElement getCA_TXT_Auto_Held_Srv_Collision(String dataVal)
	{
	se.element().waitForElement(CA_TXT_Auto_Held_Srv_Collision ,dataVal);
	return se.element().getElement(CA_TXT_Auto_Held_Srv_Collision,dataVal);
	}
	                            
	public By CA_TXT_Auto_Held_Srv_CollisionSearch =By.xpath("//*[contains(@id,'1auto_held_srv_collision-textbox')]/../div");
	public WebElement getCA_TXT_Auto_Held_Srv_CollisionSearch(String dataVal)
	{
	se.element().waitForElement(CA_TXT_Auto_Held_Srv_CollisionSearch ,dataVal);
	return se.element().getElement(CA_TXT_Auto_Held_Srv_CollisionSearch,dataVal);
	}
	
	/*****************************************
	 * End of CommAuto Locators
	 ******************************************/
 	
}
