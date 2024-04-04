package ap.pages.CA;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class CA_VehiclesCoverages extends BL_OR_CP {
	
	public void CA_VehiclesCoverages_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.VehiclesCoverages)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.VehiclesCoverages, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
		se.util().sleep(8000);
		if(iteration!=0) {
			if(se.element().isElementPresent(RosterAddNewButton)) {
			se.verify().verifyEquals("Vehicle for iteration - "+iteration+" is added successfully", true,true, true,test);
			}else {
				se.verify().verifyEquals("Vehicle for iteration - "+iteration+" is not added successfully",false,true, true,test);
			}
			
		}
		int count =0;
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strVehiclesCoverages_DD_GarageLoc= (String) row.get("VehiclesCoverages_DD_GarageLoc");
			String strVehiclesCoverages_DD_VehicleType= (String) row.get("VehiclesCoverages_DD_VehicleType");
			String strVehiclesCoverages_DD_VehVDSpecialType= (String) row.get("VehiclesCoverages_DD_VehVDSpecialType");
			String strVehiceCoverages_CHK_VehicTrailer_Yes= (String) row.get("VehiceCoverages_CHK_VehicTrailer_Yes");
			String strVehiceCoverages_CHK_VehicTrailer_No= (String) row.get("VehiceCoverages_CHK_VehicTrailer_No");
			String strVehiclesCoverages_CHK_VehLookup= (String) row.get("VehiclesCoverages_CHK_VehLookup");
			String strVehicleCoverages_TXT_Vin= (String) row.get("VehicleCoverages_TXT_Vin");
			String strVehiclesCoverages_TXT_Make= (String) row.get("VehiclesCoverages_TXT_Make");
			String strVehicleCoverages_TXT_Year= (String) row.get("VehicleCoverages_TXT_Year");
			String strVehiclesCoverages_TXT_Model= (String) row.get("VehiclesCoverages_TXT_Model");
			String strVehiclesCoverages_TXT_GrossVeh= (String) row.get("VehiclesCoverages_TXT_GrossVeh");
			String strVehiclesCoverages_DD_VehSize= (String) row.get("VehiclesCoverages_DD_VehSize");
			String strVehiclesCoverages_TXT_OrgCostNew= (String) row.get("VehiclesCoverages_TXT_OrgCostNew");
			String strVehiclesCoverages_DD_Regdstate= (String) row.get("VehiclesCoverages_DD_Regdstate");
			String strVehiclesCoverages_DD_PrimaryUse= (String) row.get("VehiclesCoverages_DD_PrimaryUse");
			String strVehiclesCoverages_DD_Industry= (String) row.get("VehiclesCoverages_DD_Industry");
			String strVehiclesCoverages_DD_IndustryClass= (String) row.get("VehiclesCoverages_DD_IndustryClass");			
			String strVehiclesCoverages_TXT_ClassCode= (String) row.get("VehiclesCoverages_TXT_ClassCode");
			String strVehiclesCoverages_CHK_Snowplowing= (String) row.get("VehiclesCoverages_CHK_Snowplowing");
			String strVehiclesCoverages_CHK_Dumping= (String) row.get("VehiclesCoverages_CHK_Dumping");
			String strVehiclesCoverages_CHK_VehHireAuto= (String) row.get("VehiclesCoverages_CHK_VehHireAuto");
			String strVehiclesCoverages_CHK_DeliveryCourier= (String) row.get("VehiclesCoverages_CHK_DeliveryCourier");
			String strVehiclesCoverages_CHK_Transportation= (String) row.get("VehiclesCoverages_CHK_Transportation");
			String strVehiclesCoverages_DD_PropertyDamage= (String) row.get("VehiclesCoverages_DD_PropertyDamage");
			String strVehiclesCoverages_DD_CompCvg= (String) row.get("VehiclesCoverages_DD_CompCvg");
			String strVehiclesCoverages_CHK_FullGlassCvg= (String) row.get("VehiclesCoverages_CHK_FullGlassCvg");
			String strVehiclesCoverages_DD_CollisionDeduct= (String) row.get("VehiclesCoverages_DD_CollisionDeduct");
			String strVehiclesCoverages_DD_CollisionCov= (String) row.get("VehiclesCoverages_DD_CollisionCov");
			String strVehiclesCoverages_CHK_ValuationActual= (String) row.get("VehiclesCoverages_CHK_ValuationActual");
			String strVehiclesCoverages_CHK_ValuationStated= (String) row.get("VehiclesCoverages_CHK_ValuationStated");
			String strVehiclesCoverages_TXT_StatedAmount= (String) row.get("VehiclesCoverages_TXT_StatedAmount");
			String strVehiclesCoverages_CHK_AutoLoan= (String) row.get("VehiclesCoverages_CHK_AutoLoan");
			String strVehiclesCoverages_CHK_RentalReimb= (String) row.get("VehiclesCoverages_CHK_RentalReimb");
			String strVehicleCoverages_BTN_Add= (String) row.get("VehicleCoverages_BTN_Add");
			String strVehiclesCoverages_DD_ClassCode= (String) row.get("VehiclesCoverages_DD_ClassCode");
			String strVehiclesCoverages_DD_TowingAndLaborLim= (String) row.get("VehiclesCoverages_DD_TowingAndLaborLim");
			String strVehiclesCoverages_DD_Make= (String) row.get("VehiclesCoverages_DD_Make");
			String strVehiclesCoverages_DD_Model= (String) row.get("VehiclesCoverages_DD_Model");
			String strVehiclesCoverages_LNK_ModelNum= (String) row.get("VehiclesCoverages_LNK_ModelNum");
			String strVehiclesCoverages_LNK_ModelNum_VIN= (String) row.get("VehiclesCoverages_LNK_ModelNum_VIN");
			String strVehiclesCoverages_LNK_OrgCostNew= (String) row.get("VehiclesCoverages_LNK_OrgCostNew");
			String strVehiclesCoverages_TXT_VehSize= (String) row.get("VehiclesCoverages_TXT_VehSize");
			String strVehiclesCoverages_TXT_NumOfDays= (String) row.get("VehiclesCoverages_TXT_NumOfDays");
			String strVehiclesCoverages_TXT_MaxAmountPerDay= (String) row.get("VehiclesCoverages_TXT_MaxAmountPerDay");
			String strVehiclesCoverages_DD_SeasonalUse= (String) row.get("VehiclesCoverages_DD_SeasonalUse");
			String strVehiclesCoverages_DD_MobileHomeType= (String) row.get("VehiclesCoverages_DD_MobileHomeType");
			String strVehiclesCoverages_TXT_MotorHomeLengthInfeet= (String) row.get("VehiclesCoverages_TXT_MotorHomeLengthInfeet");
			String strVehiclesCoverages_BTN_Edit = (String) row.get("VehicleCoverages_BTN_Edit");
			String strVehiclesCoverages_BTN_Edit_Veh = (String) row.get("VehicleCoverages_BTN_Edit_Veh");
			String strVehiclesCoverages_BTN_Delete_Veh = (String) row.get("VehicleCoverages_BTN_Delete_Veh");
			String strVehiclesCoverages_DD_NumYearsLicense= (String) row.get("VehiclesCoverages_DD_NumYearsLicense");
			String strVehiclesCoverages_DD_TransportationPercentage = (String) row.get("VehiclesCoverages_DD_TransportationPercentage");
			try {
				block :
				{
				se.log().logTestStep("CA_VehiclesCoverages");
				test.log(LogStatus.INFO, "CA_VehiclesCoverages","Transaction Step : "+transaction + "<br>" +"Page : CA_VehiclesCoverages");
				se.verify().verifyEquals("CA_VehiclesCoverages  of AgencyPortal ", getMenuLnkVehicles().isDisplayed(),true, true,test);
				if(strVehicleCoverages_BTN_Add.contains("Add")) {
					se.element().Click(getBuildingandOccupantSelection_BTN_AddNew(strVehicleCoverages_BTN_Add), test);
				}else if(strVehiclesCoverages_BTN_Edit_Veh.contains("Edit")){
					test.log(LogStatus.INFO,"Clicking on Edit of Vehicles Roster screen -",test.addScreenCapture(Util.captureScreenshot("vehicles Roster screen" , se)));
					se.element().Click(getLocations_BTN_Edit(strVehiclesCoverages_BTN_Edit), test);
					se.element().waitForLoad(120);
					se.element().waitForElementToDisappear_One(progressBar, 60);
				}else if(strVehiclesCoverages_BTN_Delete_Veh.contains("Delete")){
					test.log(LogStatus.INFO,"Clicking Delete of a Vehicle on Roster screen -",test.addScreenCapture(Util.captureScreenshot("vehicles Roster screen" , se)));
					se.element().Click(getLocations_BTN_Delete(strVehiclesCoverages_BTN_Delete_Veh), test);
					se.util().sleep(3000);
					se.element().Click(getLocations_BTN_Delete_Yes(), test);
					break block;
				}
				
				se.util().sleep(3000);
				se.element().SelectElement(veh_dd_garageLoc,strVehiclesCoverages_DD_GarageLoc,test);
				se.util().sleep(3000);
				se.element().SelectElement(veh_dd_vehicleType,strVehiclesCoverages_DD_VehicleType,test);
				
				se.util().sleep(3000);
				se.element().waitBasedOnCount(PleaseWaitPopup,3);
				try{
				if(strVehiclesCoverages_DD_VehicleType.contains("Trucks")) {
					se.element().waitForElementIsDisplayed(veh_rdo_VehicleTypeTrailer_Yes,30);
					se.element().checkUncheckOrValidate(getveh_rdo_VehicleTypeTrailer_Yes(strVehiceCoverages_CHK_VehicTrailer_Yes),strVehiceCoverages_CHK_VehicTrailer_Yes,test);
					se.element().checkUncheckOrValidate(getveh_rdo_VehicleTypeTrailer_No(strVehiceCoverages_CHK_VehicTrailer_No),strVehiceCoverages_CHK_VehicTrailer_No,test);
					se.element().waitBasedOnCount(PleaseWaitPopup,3);
									
				}
				
				if(strVehiclesCoverages_DD_VehicleType.contains("Special")) {
					se.element().SelectElement(veh_dd_specialVehicleType,strVehiclesCoverages_DD_VehVDSpecialType,test);
					se.element().waitBasedOnCount(PleaseWaitPopup,4);
					se.util().sleep(3000);
					se.element().SelectElement(veh_dd_mobileHomeType, strVehiclesCoverages_DD_MobileHomeType, test);
					se.element().waitBasedOnCount(PleaseWaitPopup,4);
					se.util().sleep(3000);
					se.element().enterOrValidateText(getveh_TXT_MotorHomeLengthInfeet(strVehiclesCoverages_TXT_MotorHomeLengthInfeet),strVehiclesCoverages_TXT_MotorHomeLengthInfeet,test);
					se.element().waitBasedOnCount(PleaseWaitPopup,4);
									
				}
				se.util().sleep(3000);
				se.element().Click(getVehVINNo(strVehicleCoverages_TXT_Vin), test);
				}catch(Exception e){
					
					
					test.log(LogStatus.WARNING, "Could not click on vehicle number field for Iteration - "+iteration+" and trying to again click", test.addScreenCapture(Util.captureScreenshot("Vehicle number field" , se)));
					if(count<3){
					se.browser().refresh();
					se.element().waitForLoad(120);
					se.util().sleep(2000);
					//se.element().MovetoElement(getNavigatetoPage("Policy Coverages"), test);
					se.element().Click(getNavigatetoPage("Policy Coverages"), test);
					se.util().sleep(2000);
					se.element().Click(getCommon_TabNavigationConfirmation_Yes(), test);
					se.util().sleep(4000);
					NavigatetoPage = By.xpath(".//a[contains(text(),'Individual Schedule')]");
					if(se.element().waitForElementToAppear_One(" ",NavigatetoPage, 5)) {
						se.element().Click(getNavigatetoPage("Individual Schedule"), test);
						se.util().sleep(2000);
						
					}
					se.element().waitForElementToAppear_One(" ",GI_CHK_Continue, 5);
					se.element().Click(getGI_CHK_Continue(), test);
					
						iteration--;
						count++;
						break block;
						}
				
				}
				se.element().enterOrValidateText(getVehVINNo(strVehicleCoverages_TXT_Vin),strVehicleCoverages_TXT_Vin,test);
				se.element().enterTAB(getVehVINNo(strVehicleCoverages_TXT_Vin));
				se.element().waitBasedOnCount(PleaseWaitPopup,3);
				se.util().sleep(2000);
				if(!strVehiclesCoverages_LNK_ModelNum_VIN.equalsIgnoreCase("N/A")){
					if(!strVehicleCoverages_TXT_Vin.equalsIgnoreCase("N/A")){
						se.element().waitForElementToAppear_One(" ",Veh_lightbox_Vehicles, 20);
					if( se.element().isElementPresent(Veh_lightbox_Vehicles)){
					se.element().Click(getswitchtab(), test);
				se.element().waitForElement(Veh_lightbox_Vehicles,30);
				se.util().sleep(2000);
				
					/*String NewstrVehiclesCoverages_LNK_ModelNum_VIN = Util.getActaulString(strVehiclesCoverages_LNK_ModelNum_VIN);
					se.element().Click(getVehiclesCoverages_VINPopup(strVehiclesCoverages_TXT_OrgCostNew,NewstrVehiclesCoverages_LNK_ModelNum_VIN ), test);
					*/
				if(!strVehiclesCoverages_LNK_OrgCostNew.equalsIgnoreCase("N/A")){	
					
					
				se.element().clickElement(getVehiclesCoverages_LNK_OrgCostNew(strVehiclesCoverages_LNK_OrgCostNew), test);{}
				}
				else {
						se.element().Click(getVehiclesCoverages_LNK_ModelNum(strVehiclesCoverages_LNK_ModelNum_VIN), test);{}
				}
					
					test.log(LogStatus.INFO,"Vehicle Light box from VIN number is displayed -",test.addScreenCapture(Util.captureScreenshot("Vehicle screen light box is displayed" , se)));
				
				se.element().Click(getgeninfo_lightbox_account_Save(), test);
				se.util().sleep(2000);
					}else{
						test.log(LogStatus.WARNING,"Vehicle Light box from VIN number is not displayed -",test.addScreenCapture(Util.captureScreenshot("Vehicle screen light box is not displayed" , se)));
						
					}
					se.element().waitForElementToDisappear_One(Veh_lightbox_Vehicles, 20);
					}
				}
				se.element().waitForElementToAppear_One(strVehicleCoverages_TXT_Year,veh_txt_vehYear, 20);
				se.element().enterOrValidateText(getVehYear(strVehicleCoverages_TXT_Year),strVehicleCoverages_TXT_Year,test);
				se.util().sleep(2000);
				se.element().checkUncheckOrValidate(getVehVehicleLookup(strVehiclesCoverages_CHK_VehLookup),strVehiclesCoverages_CHK_VehLookup,test);
				se.util().sleep(2000);
				se.element().enterOrValidateText(getVehMake(strVehiclesCoverages_TXT_Make),strVehiclesCoverages_TXT_Make,test);
				se.element().enterOrValidateText(getVehModel(strVehiclesCoverages_TXT_Model),strVehiclesCoverages_TXT_Model,test);
				se.element().SelectElement(VehiclesCoverages_DD_Make,strVehiclesCoverages_DD_Make,test);
				se.util().sleep(2000);
				se.element().SelectElement(VehiclesCoverages_DD_Model,strVehiclesCoverages_DD_Model,test);
				se.util().sleep(2000);
				se.element().enterTAB(getVehiclesCoverages_DD_Model(strVehiclesCoverages_DD_Model));
				se.util().sleep(2000);
				if(!strVehiclesCoverages_LNK_ModelNum.equalsIgnoreCase("N/A")){
					
					
						se.element().waitBasedOnCount(PleaseWaitPopup,4);
						
						se.element().waitForElementToAppear_One(" ",Veh_lightbox_Vehicles, 20);
					if( se.element().isElementPresent(Veh_lightbox_Vehicles)){
					se.element().Click(getswitchtab(), test);
					se.element().waitForElement(Veh_lightbox_Vehicles,30);
				se.util().sleep(1000);
				se.element().Click(getVehiclesCoverages_LNK_ModelNum(strVehiclesCoverages_LNK_ModelNum), test);
				test.log(LogStatus.INFO,"Vehicle Light box from Model and Make is displayed -",test.addScreenCapture(Util.captureScreenshot("Vehicle screen light box is displayed" , se)));
				se.element().Click(getgeninfo_lightbox_account_Save(), test);
				se.util().sleep(1000);
					}else{
						test.log(LogStatus.FAIL,"Vehicle Light box from Model and Make is not displayed -",test.addScreenCapture(Util.captureScreenshot("Vehicle screen light box is not displayed" , se)));
						
					}
					se.element().waitForElementToDisappear_One(Veh_lightbox_Vehicles, 20);
				}
				se.element().waitBasedOnCount(PleaseWaitPopup,4);
				se.element().waitForElementToAppear_One(strVehiclesCoverages_TXT_GrossVeh,veh_txt_grossVehicleCombinedWeight, 60);
				se.element().enterOrValidateText(getVehGrossVehicleCombinedWeight(strVehiclesCoverages_TXT_GrossVeh),strVehiclesCoverages_TXT_GrossVeh,test);
				se.element().enterOrValidateText(getVehiclesCoverages_TXT_VehSize(strVehiclesCoverages_TXT_VehSize),strVehiclesCoverages_TXT_VehSize,test);
				se.element().SelectElement(veh_dd_vehicleSize,strVehiclesCoverages_DD_VehSize,test);
				se.element().waitBasedOnCount(PleaseWaitPopup,4);
				
				se.element().enterOrValidateText(getVehOriginalCostNew(strVehiclesCoverages_TXT_OrgCostNew),strVehiclesCoverages_TXT_OrgCostNew,test);
				se.element().SelectElement(veh_dd_registeredState,strVehiclesCoverages_DD_Regdstate,test);
				se.util().sleep(5000);
				if(strVehiclesCoverages_DD_VehicleType.contains("Truck")) {
					se.util().sleep(2000);
				se.element().SelectElement(VehiclesCoverages_DD_PrimaryUse,strVehiclesCoverages_DD_PrimaryUse,test);
				se.util().sleep(2000);
				se.element().SelectElement(VehiclesCoverages_DD_Industry,strVehiclesCoverages_DD_Industry,test);
				se.util().sleep(2000);
				se.element().waitBasedOnCount(PleaseWaitPopup,3);
				se.element().SelectElement(VehiclesCoverages_DD_IndustryClass,strVehiclesCoverages_DD_IndustryClass,test);
				}else {
				se.element().enterOrValidateText(getVehiclesCoverages_TXT_ClassCode(strVehiclesCoverages_TXT_ClassCode),strVehiclesCoverages_TXT_ClassCode,test);
				}
				if(!strVehiclesCoverages_DD_ClassCode.equalsIgnoreCase("N/A")){
					se.util().sleep(5000);
				se.element().Click(getVehClasscode(), test);
				se.util().sleep(2000);
				se.element().enterOrValidateText(getVehLookUpSearchClassCode(strVehiclesCoverages_DD_ClassCode),strVehiclesCoverages_DD_ClassCode,test);
				se.element().SelectElement(VehiclesCoverages_DD_NumYearsLicense, strVehiclesCoverages_DD_NumYearsLicense, test);
				//se.element().SelectElement(veh_dd_classcode,strVehiclesCoverages_DD_ClassCode,test);
				}
				se.element().SelectElement(VehCov_DD_SeasonalUse,strVehiclesCoverages_DD_SeasonalUse,test);
				se.element().checkUncheckOrValidate(getVehSnowPlowing(strVehiclesCoverages_CHK_Snowplowing),strVehiclesCoverages_CHK_Snowplowing,test);
				se.element().checkUncheckOrValidate(getVehUsedForDumping(strVehiclesCoverages_CHK_Dumping),strVehiclesCoverages_CHK_Dumping,test);
				se.element().checkUncheckOrValidate(getVehVehicleHiredAuto(strVehiclesCoverages_CHK_VehHireAuto),strVehiclesCoverages_CHK_VehHireAuto,test);
				se.element().checkUncheckOrValidate(getVehPrearrangedDeliveryOrCourier(strVehiclesCoverages_CHK_DeliveryCourier),strVehiclesCoverages_CHK_DeliveryCourier,test);
				se.element().checkUncheckOrValidate(getVehPrearrangedTransportationService(strVehiclesCoverages_CHK_Transportation),strVehiclesCoverages_CHK_Transportation,test);
				se.element().SelectElement(VehiclesCoverages_DD_TransportationPercentage,strVehiclesCoverages_DD_TransportationPercentage,test);
				
				se.element().SelectElement(veh_dd_VehPropertyDamageLiablityDeductible,strVehiclesCoverages_DD_PropertyDamage,test);
				se.element().SelectElement(veh_dd_ComprehensiveCoverage,strVehiclesCoverages_DD_CompCvg,test);
				se.element().checkUncheckOrValidate(getVehFullGlassCoverage(strVehiclesCoverages_CHK_FullGlassCvg),strVehiclesCoverages_CHK_FullGlassCvg,test);
				se.element().SelectElement(veh_dd_CollisionDeductible,strVehiclesCoverages_DD_CollisionDeduct,test);
				se.element().SelectElement(VehiclesCoverages_DD_CollisionCov,strVehiclesCoverages_DD_CollisionCov,test);
				se.element().checkUncheckOrValidate(getveh_rdo_ValuationMethodActual(strVehiclesCoverages_CHK_ValuationActual),strVehiclesCoverages_CHK_ValuationActual,test);
				se.element().checkUncheckOrValidate(getveh_rdo_ValuationMethodStated(strVehiclesCoverages_CHK_ValuationStated),strVehiclesCoverages_CHK_ValuationStated,test);
				se.util().sleep(10000);
				se.element().enterOrValidateText(getVehiclesCoverages_TXT_StatedAmount(strVehiclesCoverages_TXT_StatedAmount),strVehiclesCoverages_TXT_StatedAmount,test);
				se.element().checkUncheckOrValidate(getVehAutoLoanLeaseGapCoverage(strVehiclesCoverages_CHK_AutoLoan),strVehiclesCoverages_CHK_AutoLoan,test);
				se.element().checkUncheckOrValidate(getVehrentalReimbursement(strVehiclesCoverages_CHK_RentalReimb),strVehiclesCoverages_CHK_RentalReimb,test);
				
				se.element().enterOrValidateText(getVehCov_TXT_NumOfDays(strVehiclesCoverages_TXT_NumOfDays),strVehiclesCoverages_TXT_NumOfDays,test);
				se.element().enterOrValidateText(getVehCov_TXT_MaxAmountPerDay(strVehiclesCoverages_TXT_MaxAmountPerDay), strVehiclesCoverages_TXT_MaxAmountPerDay,test);
				se.element().SelectElement(VehiclesCoverages_DD_TowingAndLaborLim,strVehiclesCoverages_DD_TowingAndLaborLim,test);
				se.util().sleep(6000);
				 if(strVehiclesCoverages_BTN_Edit_Veh.contains("Edit")){
					se.element().Click(getSave_Button(), test);
				}else {
					se.element().Click(getAdd_Button(), test);
				}
				//se.element().waitForElementToAppear_One(strVehiclesCoverages_DD_GarageLoc,veh_dd_garageLoc, 10);(10000);
				//se.element().Click(getAdd_Button(), test);
				/*if(!se.element().isElementPresent(GI_CHK_Continue)){
					se.element().refreshBrowser();
					se.element().Click(getCancel_Button("Cancel"), test);
					iteration--;
				}*/
			}
			
			}
			catch(Exception e){
				e.printStackTrace();{}
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for CA_VehiclesCoverages ", true, false, true, test);
			}
			iteration++;
	}
		se.util().sleep(3000);
		
		se.element().Click(getGI_CHK_Continue(), test);
	}catch (Exception e) {
		
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
		testTearDown(se, test);
	}
	}
}
