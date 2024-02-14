package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CP;
import pw.OR.OR_GL;

public class GL_AgriBusiness extends OR_GL{
	
	
	
	public void GL_AgriBusinessPage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase("GL_AgriBusiness")){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("GL_AgriBusiness", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		try {
			GL_AgriBusiness GL_AgriBusinessPage = TestPageFactory.initElements(se,GL_AgriBusiness.class);
			GL_AgriBusinessPage.nonOwnedAutoAndMobileEquipmentSection(row, test);
			GL_AgriBusinessPage.consultingServicesSection(row, test);
			GL_AgriBusinessPage.limitedPesticideHerbicideSection(row, test);
			se.element().clickElement(getNext());
		
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for GL_AgriBusiness page ", true, false,true, test);
		}
		iteration++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

	}

public void nonOwnedAutoAndMobileEquipmentSection(Map<String, String> row, ExtentTest test) throws IOException {
	
	String strGL_AgriBusiness_CHK_NonOwnedAutoAndMobEquip = (String) row.get("GL_AgriBusiness_CHK_NonOwnedAutoAndMobEquip");
	String strGL_AgriBusiness_TXT_Limit = (String) row.get("GL_AgriBusiness_TXT_Limit");
	String strGL_AgriBusiness_TXT_NumOfUnloadingFacilities = (String) row.get("GL_AgriBusiness_TXT_NumOfUnloadingFacilities");
	String strGL_AgriBusiness_CHK_SeedMerchant = (String) row.get("GL_AgriBusiness_CHK_SeedMerchant");
	String strGL_AgriBusiness_TXT_Seedlimit = (String) row.get("GL_AgriBusiness_TXT_Seedlimit");
	String strGL_AgriBusiness_TXT_SeedAggrLimit = (String) row.get("GL_AgriBusiness_TXT_SeedAggrLimit");
	String strGL_AgriBusiness_TXT_SeedDeductible = (String) row.get("GL_AgriBusiness_TXT_SeedDeductible");
	String strGL_AgriBusiness_TXT_DescriptionOfSeeds = (String) row.get("GL_AgriBusiness_TXT_DescriptionOfSeeds");
	String strGL_AgriBusiness_TXT_SeedSales = (String) row.get("GL_AgriBusiness_TXT_SeedSales");
	
	
	String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("Non Owned Auto And Mobile Equipment Section");
			test.log(LogStatus.INFO, "Non Owned Auto And Mobile Equipment Section section","Transaction Step : "+transaction + "<br>" +"Page : GL_AgriBusiness");
			se.verify().verifyEquals("GL_AgriBusiness_Details Page of PowerWriter ", getGL_AgriBusiness_CHK_NonOwnedAutoAndMobEquip(strGL_AgriBusiness_CHK_NonOwnedAutoAndMobEquip).isDisplayed(),true, true,test);
			se.element().checkUncheckOrValidate(getGL_AgriBusiness_CHK_NonOwnedAutoAndMobEquip(strGL_AgriBusiness_CHK_NonOwnedAutoAndMobEquip),strGL_AgriBusiness_CHK_NonOwnedAutoAndMobEquip,test);
			//se.element().enterOrValidateText(getGL_AgriBusiness_TXT_Limit(strGL_AgriBusiness_TXT_Limit),strGL_AgriBusiness_TXT_Limit,test);
			se.element().selectPopupWithMagnifier(getGL_AgriBusiness_TXT_Limit(strGL_AgriBusiness_TXT_Limit), getGL_AgriBusiness_TXT_LimitSearch(strGL_AgriBusiness_TXT_Limit), strGL_AgriBusiness_TXT_Limit, "N/A", strGL_AgriBusiness_TXT_Limit,"N/A", "N/A", "N/A", test);
			se.element().enterOrValidateText(getGL_AgriBusiness_TXT_NumOfUnloadingFacilities(strGL_AgriBusiness_TXT_NumOfUnloadingFacilities),strGL_AgriBusiness_TXT_NumOfUnloadingFacilities,test);
			se.element().checkUncheckOrValidate(getGL_AgriBusiness_CHK_SeedMerchant(strGL_AgriBusiness_CHK_SeedMerchant),strGL_AgriBusiness_CHK_SeedMerchant,test);
			se.element().enterOrValidateText(getGL_AgriBusiness_TXT_Seedlimit(strGL_AgriBusiness_TXT_Seedlimit),strGL_AgriBusiness_TXT_Seedlimit,test);
			se.element().enterOrValidateText(getGL_AgriBusiness_TXT_SeedAggrLimit(strGL_AgriBusiness_TXT_SeedAggrLimit),strGL_AgriBusiness_TXT_SeedAggrLimit,test);
			se.element().enterOrValidateText(getGL_AgriBusiness_TXT_SeedDeductible(strGL_AgriBusiness_TXT_SeedDeductible),strGL_AgriBusiness_TXT_SeedDeductible,test);
			se.element().enterOrValidateText(getGL_AgriBusiness_TXT_DescriptionOfSeeds(strGL_AgriBusiness_TXT_DescriptionOfSeeds),strGL_AgriBusiness_TXT_DescriptionOfSeeds,test);
			se.element().enterOrValidateText(getGL_AgriBusiness_TXT_SeedSales(strGL_AgriBusiness_TXT_SeedSales),strGL_AgriBusiness_TXT_SeedSales,test);
			
		}
		catch(Exception e) {
			se.verify().verifyEquals("Failed to fill in details for GL_AgriBusinessPage ", true, false,true, test);		
			}
	}

public void consultingServicesSection(Map<String, String> row, ExtentTest test) throws IOException {
	
	String strGL_AgriBusiness_CHK_ConsultingServices = (String) row.get("GL_AgriBusiness_CHK_ConsultingServices");
	String strGL_AgriBusiness_CHK_CropConsultingServices = (String) row.get("GL_AgriBusiness_CHK_CropConsultingServices");
	String strGL_AgriBusiness_TXT_CropConsServ_Limit = (String) row.get("GL_AgriBusiness_TXT_CropConsServ_Limit");
	String strGL_AgriBusiness_TXT_CropConsServ_AggregateLimit = (String) row.get("GL_AgriBusiness_TXT_CropConsServ_AggregateLimit");
	String strGL_AgriBusiness_TXT_CropConsServ_Deductible = (String) row.get("GL_AgriBusiness_TXT_CropConsServ_Deductible");
	String strGL_AgriBusiness_TXT_CropConsServ_Sales = (String) row.get("GL_AgriBusiness_TXT_CropConsServ_Sales");
	String strGL_AgriBusiness_CHK_SoilServicesConsultingServices = (String) row.get("GL_AgriBusiness_CHK_SoilServicesConsultingServices");
	String strGL_AgriBusiness_TXT_SoilServices_Limit = (String) row.get("GL_AgriBusiness_TXT_SoilServices_Limit");
	String strGL_AgriBusiness_TXT_SoilServices_AggregateLimit = (String) row.get("GL_AgriBusiness_TXT_SoilServices_AggregateLimit");
	String strGL_AgriBusiness_TXT_SoilServices_Deductible = (String) row.get("GL_AgriBusiness_TXT_SoilServices_Deductible");
	String strGL_AgriBusiness_TXT_SoilServices_Sales = (String) row.get("GL_AgriBusiness_TXT_SoilServices_Sales");
	String strGL_AgriBusiness_CHK_FarmMngmntConsultingServices = (String) row.get("GL_AgriBusiness_CHK_FarmMngmntConsultingServices");
	String strGL_AgriBusiness_TXT_FarmMngmntConsServ_Limit = (String) row.get("GL_AgriBusiness_TXT_FarmMngmntConsServ_Limit");
	String strGL_AgriBusiness_TXT_FarmMngmntConsServ_AggregateLimit = (String) row.get("GL_AgriBusiness_TXT_FarmMngmntConsServ_AggregateLimit");
	String strGL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible = (String) row.get("GL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible");
	String strGL_AgriBusiness_TXT_FarmMngmntConsServ_Sales = (String) row.get("GL_AgriBusiness_TXT_FarmMngmntConsServ_Sales");
	String transaction = (String) row.get("Transaction");
	try{
		se.log().logTestStep("Consulting Services Section");
		test.log(LogStatus.INFO, "Consulting Services Section section","Transaction Step : "+transaction + "<br>" +"Page : GL_AgriBusiness");
		if(!strGL_AgriBusiness_CHK_ConsultingServices.equals("N/A")){
			se.element().checkUncheckOrValidate(getGL_AgriBusiness_CHK_ConsultingServices(strGL_AgriBusiness_CHK_ConsultingServices),strGL_AgriBusiness_CHK_ConsultingServices,test);
			if(!strGL_AgriBusiness_CHK_CropConsultingServices.equals("N/A")){
				se.element().checkUncheckOrValidate(getGL_AgriBusiness_CHK_CropConsultingServices(strGL_AgriBusiness_CHK_CropConsultingServices),strGL_AgriBusiness_CHK_CropConsultingServices,test);
				//se.element().enterOrValidateText(getGL_AgriBusiness_TXT_CropConsServ_Limit(strGL_AgriBusiness_TXT_CropConsServ_Limit),strGL_AgriBusiness_TXT_CropConsServ_Limit,test);
				se.element().selectPopupWithMagnifier(getGL_AgriBusiness_TXT_CropConsServ_Limit(strGL_AgriBusiness_TXT_CropConsServ_Limit),getGL_AgriBusiness_TXT_CropConsServ_LimitSearch(strGL_AgriBusiness_TXT_CropConsServ_Limit), strGL_AgriBusiness_TXT_CropConsServ_Limit,constants.NA, strGL_AgriBusiness_TXT_CropConsServ_Limit, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getGL_AgriBusiness_TXT_CropConsServ_AggregateLimit(strGL_AgriBusiness_TXT_CropConsServ_AggregateLimit),strGL_AgriBusiness_TXT_CropConsServ_AggregateLimit,test);
				//se.element().enterOrValidateText(getGL_AgriBusiness_TXT_CropConsServ_Deductible(strGL_AgriBusiness_TXT_CropConsServ_Deductible),strGL_AgriBusiness_TXT_CropConsServ_Deductible,test);
				se.element().selectPopupWithMagnifier(getGL_AgriBusiness_TXT_CropConsServ_Deductible(strGL_AgriBusiness_TXT_CropConsServ_Deductible),getGL_AgriBusiness_TXT_CropConsServ_DeductibleSearch(strGL_AgriBusiness_TXT_CropConsServ_Deductible), strGL_AgriBusiness_TXT_CropConsServ_Deductible,constants.NA, strGL_AgriBusiness_TXT_CropConsServ_Deductible, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getGL_AgriBusiness_TXT_CropConsServ_Sales(strGL_AgriBusiness_TXT_CropConsServ_Sales),strGL_AgriBusiness_TXT_CropConsServ_Sales,test);
			}
			if(!strGL_AgriBusiness_CHK_SoilServicesConsultingServices.equals("N/A")){
				se.element().checkUncheckOrValidate(getGL_AgriBusiness_CHK_SoilServicesConsultingServices(strGL_AgriBusiness_CHK_SoilServicesConsultingServices),strGL_AgriBusiness_CHK_SoilServicesConsultingServices,test);
				//se.element().enterOrValidateText(getGL_AgriBusiness_TXT_SoilServices_Limit(strGL_AgriBusiness_TXT_SoilServices_Limit),strGL_AgriBusiness_TXT_SoilServices_Limit,test);
				se.element().selectPopupWithMagnifier(getGL_AgriBusiness_TXT_SoilServices_Limit(strGL_AgriBusiness_TXT_SoilServices_Limit),GL_AgriBusiness_TXT_SoilServices_LimitSearch(strGL_AgriBusiness_TXT_SoilServices_Limit), strGL_AgriBusiness_TXT_SoilServices_Limit,constants.NA, strGL_AgriBusiness_TXT_SoilServices_Limit, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getGL_AgriBusiness_TXT_SoilServices_AggregateLimit(strGL_AgriBusiness_TXT_SoilServices_AggregateLimit),strGL_AgriBusiness_TXT_SoilServices_AggregateLimit,test);
				//se.element().enterOrValidateText(getGL_AgriBusiness_TXT_SoilServices_Deductible(strGL_AgriBusiness_TXT_SoilServices_Deductible),strGL_AgriBusiness_TXT_SoilServices_Deductible,test);
				se.element().selectPopupWithMagnifier(getGL_AgriBusiness_TXT_SoilServices_Deductible(strGL_AgriBusiness_TXT_SoilServices_Deductible),getGL_AgriBusiness_TXT_SoilServices_DeductibleSearch(strGL_AgriBusiness_TXT_SoilServices_Deductible), strGL_AgriBusiness_TXT_SoilServices_Deductible,constants.NA, strGL_AgriBusiness_TXT_SoilServices_Deductible, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getGL_AgriBusiness_TXT_SoilServices_Sales(strGL_AgriBusiness_TXT_SoilServices_Sales),strGL_AgriBusiness_TXT_SoilServices_Sales,test);
			}
			if(!strGL_AgriBusiness_CHK_FarmMngmntConsultingServices.equals("N/A")){
				se.element().checkUncheckOrValidate(getGL_AgriBusiness_CHK_FarmMngmntConsultingServices(strGL_AgriBusiness_CHK_FarmMngmntConsultingServices),strGL_AgriBusiness_CHK_FarmMngmntConsultingServices,test);
				//se.element().enterOrValidateText(getGL_AgriBusiness_TXT_FarmMngmntConsServ_Limit(strGL_AgriBusiness_TXT_FarmMngmntConsServ_Limit),strGL_AgriBusiness_TXT_FarmMngmntConsServ_Limit,test);
				se.element().selectPopupWithMagnifier(getGL_AgriBusiness_TXT_FarmMngmntConsServ_Limit(strGL_AgriBusiness_TXT_FarmMngmntConsServ_Limit),getGL_AgriBusiness_TXT_FarmMngmntConsServ_LimitSearch(strGL_AgriBusiness_TXT_FarmMngmntConsServ_Limit), strGL_AgriBusiness_TXT_FarmMngmntConsServ_Limit,constants.NA, strGL_AgriBusiness_TXT_FarmMngmntConsServ_Limit, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getGL_AgriBusiness_TXT_FarmMngmntConsServ_AggregateLimit(strGL_AgriBusiness_TXT_FarmMngmntConsServ_AggregateLimit),strGL_AgriBusiness_TXT_FarmMngmntConsServ_AggregateLimit,test);
				//se.element().enterOrValidateText(getGL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible(strGL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible),strGL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible,test);
				se.element().selectPopupWithMagnifier(getGL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible(strGL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible),getGL_AgriBusiness_TXT_FarmMngmntConsServ_DeductibleSearch(strGL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible), strGL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible,constants.NA, strGL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible, constants.NA, constants.NA, constants.NA, test);				
				se.element().enterOrValidateText(getGL_AgriBusiness_TXT_FarmMngmntConsServ_Sales(strGL_AgriBusiness_TXT_FarmMngmntConsServ_Sales),strGL_AgriBusiness_TXT_FarmMngmntConsServ_Sales,test);
			}
			}	
	}
	catch(Exception e) {
		se.verify().verifyEquals("Failed to fill in Consulting Services Section details for GL_AgriBusinessPage ", true, false,true, test);		
		}
}

public void limitedPesticideHerbicideSection(Map<String, String> row, ExtentTest test) throws IOException {
	String strGL_AgriBusiness_CHK_LtdPestHerbicideorFertilizerAppl = (String) row.get("GL_AgriBusiness_CHK_LtdPestHerbicideorFertilizerAppl");
	String strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit = (String) row.get("GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit");
	String strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_AggregateLimit = (String) row.get("GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_AggregateLimit");

	String strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible = (String) row.get("GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible");
	String strGL_AgriBusiness_CHK_PesticideorHerbicideAppl = (String) row.get("GL_AgriBusiness_CHK_PesticideorHerbicideAppl");
	String strGL_AgriBusiness_TXT_NumberOfAcres = (String) row.get("GL_AgriBusiness_TXT_NumberOfAcres");
	String strGL_AgriBusiness_CHK_FertilizerApplications = (String) row.get("GL_AgriBusiness_CHK_FertilizerApplications");
	String strGL_AgriBusiness_TXT_FertApp_NumberOfAcres = (String) row.get("GL_AgriBusiness_TXT_FertApp_NumberOfAcres");
	String transaction = (String) row.get("Transaction");
	try{
		se.log().logTestStep("limited Pesticide Herbicide Section");
		test.log(LogStatus.INFO, "limited Pesticide Herbicide Section ","Transaction Step : "+transaction + "<br>" +"Page : GL_AgriBusiness");
		se.element().checkUncheckOrValidate(getGL_AgriBusiness_CHK_LtdPestHerbicideorFertilizerAppl(strGL_AgriBusiness_CHK_LtdPestHerbicideorFertilizerAppl),strGL_AgriBusiness_CHK_LtdPestHerbicideorFertilizerAppl,test);
		//se.element().enterOrValidateText(getGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit(strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit),strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit,test);
		se.element().selectPopupWithMagnifier(getGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit(strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit), getGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_LimitSearch(strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit), strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit,constants.NA, strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit, constants.NA, constants.NA, constants.NA, test);
		
		se.element().enterOrValidateText(getGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_AggregateLimit(strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_AggregateLimit),strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_AggregateLimit,test);
		//se.element().enterOrValidateText(getGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible(strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible),strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible,test);
		se.element().selectPopupWithMagnifier(getGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible(strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible), getGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_DeductibleSearch(strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible), strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible,constants.NA, strGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible, constants.NA, constants.NA, constants.NA, test);
		
		se.element().checkUncheckOrValidate(getGL_AgriBusiness_CHK_PesticideorHerbicideAppl(strGL_AgriBusiness_CHK_PesticideorHerbicideAppl),strGL_AgriBusiness_CHK_PesticideorHerbicideAppl,test);
		se.element().enterOrValidateText(getGL_AgriBusiness_TXT_NumberOfAcres(strGL_AgriBusiness_TXT_NumberOfAcres),strGL_AgriBusiness_TXT_NumberOfAcres,test);
		se.element().checkUncheckOrValidate(getGL_AgriBusiness_CHK_FertilizerApplications(strGL_AgriBusiness_CHK_FertilizerApplications),strGL_AgriBusiness_CHK_FertilizerApplications,test);
		se.element().enterOrValidateText(getGL_AgriBusiness_TXT_FertApp_NumberOfAcres(strGL_AgriBusiness_TXT_FertApp_NumberOfAcres),strGL_AgriBusiness_TXT_FertApp_NumberOfAcres,test);
	}
	catch(Exception e) {
		se.verify().verifyEquals("Failed to fill in GL_AgriBusiness details for GL_AgriBusinessPage ", true, false,true, test);		
		}
}
	
}