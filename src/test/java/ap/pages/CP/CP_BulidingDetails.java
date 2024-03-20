package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;
import ap.pages.common.APPW_CommonMethods;

public class CP_BulidingDetails extends BL_OR_CP {
	String text="";
	static	String quote="";
	public void CP_Buliding_Details(String strRegressionID, String transaction,String suspendSheet,String strAgentLink,String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs ,ExtentTest test) throws IOException
	
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Building_Details)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Building_Details, strRegressionID, transaction);
		int iteration = 0;
		APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class);
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strBuildingDetails_BTN_Edit = (String) row.get("BuildingDetails_BTN_Edit");
			String strBuildingDetails_BTN_Edit_LOC = (String) row.get("BuildingDetails_BTN_Edit_Loc");
			String strBuildingDetails_TXT_Location = (String) row.get("BuildingDetails_TXT_Location");
			String strBuildingDetails_TXT_Building = (String) row.get("BuildingDetails_TXT_Building");
			String strBuildingDetails_TXT_Occupant = (String) row.get("BuildingDetails_TXT_Occupant");
			String strBuildingDetails_CHK_SelectAdditionalClassCodes = (String) row.get("BuildingDetails_CHK_Select Additional Class Codes");
			String strBuildingDetails_DD_ClassCode = (String) row.get("BuildingDetails_DD_ClassCode");
			String strBuildingDetails_TXT_Arethereotheroccupants = (String) row.get("BuildingDetails_TXT_Are there other occupants");
			String strBuildingDetails_CHK_Arethereotheroccupants_No = (String) row.get("BuildingDetails_CHK_Arethereotheroccupants_No");
			String strBuildingDetails_CHK_Arethereotheroccupants_Yes = (String) row.get("BuildingDetails_CHK_Arethereotheroccupants_Yes");
			String strBuildingDetails_TXT_ExplainTheAdditionalOccupancies = (String) row.get("BuildingDetails_TXT_ExplainTheAdditionalOccupancies");
			
			String strBuildingDetails_TXT_BuildingDescription = (String) row.get("BuildingDetails_TXT_BuildingDescription");
			String strBuildingDetails_DD_ConstructionType = (String) row.get("BuildingDetails_DD_ConstructionType");
			String strBuildingDetails_TXT_Isthisbuildingopen_sided = (String) row.get("BuildingDetails_TXT_Is this building open-sided");
			String strBuildingDetails_DDV_Is_this_building_open_sided = (String) row.get("BuildingDetails_DDV_Is this building open-sided");
			String strBuildingDetails_TXT_TotalFloorAreaofBuilding = (String) row.get("BuildingDetails_TXT_TotalFloorAreaofBuilding");
			String strBuildingDetails_TXT_NumberofStories = (String) row.get("BuildingDetails_TXT_NumberofStories");
			String strBuildingDetails_DD_RoofMaterial = (String) row.get("BuildingDetails_DD_RoofMaterial");
			String strBuildingDetails_TXT_YearBulit = (String) row.get("BuildingDetails_TXT_YearBulit");
			String strBuildingDetails_CHK_YearBulitisunknown = (String) row.get("BuildingDetails_CHK_YearBulitisunknown");
			String strBuildingDetails_TXT_RoofYrupdt = (String) row.get("BuildingDetails_TXT_RoofYrupdt");
			String strBuildingDetails_TXT_Plumbingyrupdt = (String) row.get("BuildingDetails_TXT_Plumbingyrupdt");
			String strBuildingDetails_TXT_Heatingyrupdt = (String) row.get("BuildingDetails_TXT_Heatingyrupdt");
			String strBuildingDetails_TXT_Writingyrupdt = (String) row.get("BuildingDetails_TXT_Writingyrupdt");
			String strBuildingDetails_CHK_SelectAddPPCCodes = (String) row.get("BuildingDetails_CHK_SelectAddPPCCodes");
			String strBuildingDetails_DD_Protectionclass = (String) row.get("BuildingDetails_DD_Protectionclass");
			String strBuildingDetails_DD_IStheBulidingSprinkled = (String) row.get("BuildingDetails_DD_IStheBulidingSprinkled");
			String strBuildingDetails_CHK_AutomaticSprinkler = (String) row.get("BuildingDetails_CHK_AutomaticSprinkler");
			String strBuildingDetails_CHK_AutomaticFire = (String) row.get("BuildingDetails_CHK_AutomaticFire");
			String strBuildingDetails_CHK_FireSecurity = (String) row.get("BuildingDetails_CHK_FireSecurity");
			String strBuildingDetails_CHK_ServiceContract = (String) row.get("BuildingDetails_CHK_ServiceContract");
			String strBuildingDetails_CHK_AutomaticBurglary_outside = (String) row.get("BuildingDetails_CHK_AutomaticBurglary_outside");
			String strBuildingDetails_CHK_AutomaticBurglary_Loud = (String) row.get("BuildingDetails_CHK_AutomaticBurglary_Loud");
			String strBuildingDetails_CHK_Security = (String) row.get("BuildingDetails_CHK_Security");
			String strBuildingDetails_TXT_AddBuildInfo_ASGR = (String) row.get("BuildingDetails_TXT_AddBuildInfo_ASGR");
			String strBuildingDetails_TXT_AddBuildInfo_PercenTOccByApp = (String) row.get("BuildingDetails_TXT_AddBuildInfo_PercenTOccByApp");
			String strBuildingDetails_CHK_AddBuildInfo_TentaRatesApp = (String) row.get("BuildingDetails_CHK_AddBuildInfo_TentaRatesApp");
			String strBuildingDetails_TXT_AddBuildInfo_ApartmentPercent = (String) row.get("BuildingDetails_TXT_AddBuildInfo_ApartmentPercent");
			String strBuildingDetails_TXT_AddBuildInfo_OfficePercent = (String) row.get("BuildingDetails_TXT_AddBuildInfo_OfficePercent");
			String strBuildingDetails_TXT_AddBuildInfo_RestaurantPercent = (String) row.get("BuildingDetails_TXT_AddBuildInfo_RestaurantPercent");
			String strBuildingDetails_TXT_AddBuildInfo_RetailSalePercent = (String) row.get("BuildingDetails_TXT_AddBuildInfo_RetailSalePercent");
			String strBuildingDetails_TXT_AddBuildInfo_ServOccupanciesPercent = (String) row.get("BuildingDetails_TXT_AddBuildInfo_ServOccupanciesPercent");
			
			String strBuildingDetails_TXT_AddBuildInfo_ManufacturePercent = (String) row.get("BuildingDetails_TXT_AddBuildInfo_ManufacturePercent");
			String strBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails = (String) row.get("BuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails");
			String strBuildingDetails_DD_IllinoisFireTax_JurisdictionDescription = (String) row.get("BuildingDetails_DD_IllinoisFireTax_JurisdictionDescription");
			String strBuildingDetails_CHK_KentuckyTaxInfo_Local_Government_Prem_Tax = (String) row.get("BuildingDetails_CHK_KentuckyTaxInfo_Local_Government_Prem_Tax");
			String strBuildingDetails_DD_MunicipalityCity = (String) row.get("BuildingDetails_DD_MunicipalityCity");
			String strBuildingDetails_DD_County = (String) row.get("BuildingDetails_DD_County");
			String strBuildingDetails_BTN_Delete = (String) row.get("BuildingDetails_BTN_Delete");
			String strBuildingDetails_BTN_Delete_Loc = (String) row.get("BuildingDetails_BTN_Delete_Loc");
			String strBuildingDetails_DeleteMessage = (String) row.get("BuildingDetails_DeleteMessage");
			
			//Unused Variables
			/*String strBuildingDetails_ReadOnly = (String) row.get("BuildingDetails_ReadOnly");
			
			
			String strBuildingDetails_TXT_BUROnsite = (String) row.get("BuildingDetails_TXT_BUROnsite");
			CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
			 */
			try {
				se.log().logTestStep("CP_BulidingDetails");
				test.log(LogStatus.INFO, "CP_BulidingDetails","Transaction Step : "+transaction + "<br>" +"Page : CP_BulidingDetails");
				se.verify().verifyEquals("CP_BulidingDetails  of AgencyPortal ", getBuildingandDetails_label().isDisplayed(),true, true,test);
				if(strBuildingDetails_BTN_Edit.contains("Edit"))
				{
					// Commented this code as Redo is now not performed for AG_02
					/*CP_PremiumModification CP_PremiumModification=TestPageFactory.initElements(se, CP_PremiumModification.class);
					CP_Summary CP_Summary=TestPageFactory.initElements(se, CP_Summary.class);
					quote = CP_PremiumModification.getquotenumber(test);
					se.element().Click(getBuildingandDetails_BTN_Edit(strBuildingDetails_BTN_Edit_LOC));
						if(iteration>=0 && strBuildingDetails_ReadOnly.contains("Y") && transaction.contains("NewQuote") )
						{
						String text=se.element().getText(PremiumModification_TXT_Readonly);
						if(text.contains("This screen is read-only"))
						{
							CP_Summary.CP_Internal_QuoteOpen(strRegressionID,   transaction, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote,"N/A", test);
							se.element().Click(getPremiumModification_BTN_Edit(strBuildingDetails_BTN_Edit_LOC));
							se.element().checkUncheckOrValidate(getBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails(strBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails),strBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails,test);
						}
						}
					//  se.util().sleep(180000);
					 */
					se.element().Click(getBuildingandDetails_BTN_Edit(strBuildingDetails_BTN_Edit_LOC), test);
					if(!suspendSheet.equalsIgnoreCase(constants.Building_Details)){
						APPW_CommonMethods.refreshWhen502error( this.getClass().getSimpleName(), 2,  test);
					}
					se.element().waitForElement(BuildingDetails_TXT_Location, 30);
					if(se.element().isElementVisible(BuildingDetails_HardstopMessage)){
						if(getBuildingDetails_HardstopMessageTxt().getText().contains("Currently unable to fetch property details")){
						test.log(LogStatus.INFO, "HardstopMessage text is -", "<br>Actual: "+getBuildingDetails_HardstopMessageTxt().getText()+"<br>Expected: "+"No Alert"+"<br>");
						test.log(LogStatus.FAIL,"HardstopMessage on Building screen of AgencyPortal - error - "+getBuildingDetails_HardstopMessageTxt().getText(),test.addScreenCapture(Util.captureScreenshot("BuildingDetails_HardstopMessageTxt" , se)));
						if(se.element().isElementVisible(BuildingDetails_BTN_Cancel)){
							se.util().sleep(3000);
							se.element().Click(getBuildingDetails_BTN_Cancel(), test);
						}
						se.element().Click(getBuildingandDetails_BTN_Edit(strBuildingDetails_BTN_Edit_LOC), test);
						se.element().waitForElement(BuildingDetails_TXT_Location, 30);
						}
					}
					se.element().enterOrValidateText(getBuildingDetails_TXT_Location(strBuildingDetails_TXT_Location),strBuildingDetails_TXT_Location,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_Building(strBuildingDetails_TXT_Building),strBuildingDetails_TXT_Building,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_Occupant(strBuildingDetails_TXT_Occupant),strBuildingDetails_TXT_Occupant,test);
					se.element().checkUncheckOrValidate(getBuildingDetails_CHK_SelectAdditionalClassCodes(strBuildingDetails_CHK_SelectAdditionalClassCodes),strBuildingDetails_CHK_SelectAdditionalClassCodes,test);
					
					//if(se.element().isElementPresent(BuildingDetails_DD_ClassCode))
					//{
						
						if(!strBuildingDetails_DD_ClassCode.equalsIgnoreCase("N/A")){
							test.log(LogStatus.INFO,"Class code is selected by default - is -"+getBuildingDetails_TXT_ClassCodeSelected(strBuildingDetails_DD_ClassCode).getText().trim(),test.addScreenCapture(Util.captureScreenshot("DefaultedClasscode" , se)));
							
						//se.element().enterOrValidateText(getBuildingDetails_TXT_ClassCode(strBuildingDetails_DD_ClassCode),strBuildingDetails_DD_ClassCode,test);
						
						//se.verify().verifyEquals("BuildingDetails_TXT_ClassCode validation" , se.element().getSelectedText(BuildingDetails_TXT_ClassCode), strBuildingDetails_DD_ClassCode, test);
						if (!strBuildingDetails_DD_ClassCode.contains("'")) {
							if(getBuildingDetails_TXT_ClassCode(strBuildingDetails_DD_ClassCode).isSelected())
							{
								test.log(LogStatus.INFO, "Expected class code and By default selected are same - " ,getBuildingDetails_TXT_ClassCode(strBuildingDetails_DD_ClassCode).getText().trim());
							}else{
								test.log(LogStatus.WARNING, "Expected class code is not selected by default - expected is -" ,strBuildingDetails_DD_ClassCode);
								test.log(LogStatus.FAIL,"Expected class code is not selected by default - actual is -",test.addScreenCapture(Util.captureScreenshot("UnexpectedError on CP_Buildingdetails" , se)));
								
								se.element().SelectElement(BuildingDetails_DD_ClassCode, strBuildingDetails_DD_ClassCode,test);

							}
						}else{
							String[] ClassCode1= strBuildingDetails_DD_ClassCode.split("'");
							String strBuildingDetails_DD_ClassCode1 = ClassCode1[0];
							if(getBuildingDetails_TXT_ClassCode(strBuildingDetails_DD_ClassCode1).isSelected())
							{
								test.log(LogStatus.INFO, "Expected class code is selected by default - " ,getBuildingDetails_TXT_ClassCode(strBuildingDetails_DD_ClassCode1).getText().trim());
							}else{
								test.log(LogStatus.WARNING, "Expected class code is not selected by default - expected is -" ,getBuildingDetails_TXT_ClassCode(strBuildingDetails_DD_ClassCode1).getText().trim());
								test.log(LogStatus.FAIL,"Expected class code is not selected by default - actual is -",test.addScreenCapture(Util.captureScreenshot("UnexpectedError on CP_BuildingandOccupantSelection" , se)));
								
								se.element().SelectElement(BuildingDetails_DD_ClassCode, strBuildingDetails_DD_ClassCode,test);

							}
						}
						
					} 
					//}
					se.element().enterOrValidateText(getBuildingDetails_TXT_Arethereotheroccupants(strBuildingDetails_TXT_Arethereotheroccupants),strBuildingDetails_TXT_Arethereotheroccupants,test);
					se.element().checkUncheckOrValidate(getBuildingDetails_CHK_Arethereotheroccupants_No(strBuildingDetails_CHK_Arethereotheroccupants_No),strBuildingDetails_CHK_Arethereotheroccupants_No,test);
					se.element().checkUncheckOrValidate(getBuildingDetails_CHK_Arethereotheroccupants_Yes(strBuildingDetails_CHK_Arethereotheroccupants_Yes),strBuildingDetails_CHK_Arethereotheroccupants_Yes,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_ExplainTheAdditionalOccupancies(strBuildingDetails_TXT_ExplainTheAdditionalOccupancies),strBuildingDetails_TXT_ExplainTheAdditionalOccupancies,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_BuildingDescription(strBuildingDetails_TXT_BuildingDescription),strBuildingDetails_TXT_BuildingDescription,test);
					//Work Around
					try{
						if(se.element().isElementPresent(BuildingDetails_DD_ConstructionType_WA))
						{
							
							
								se.element().SelectElement(BuildingDetails_DD_ConstructionType,strBuildingDetails_DD_ConstructionType,test);
							
						}
					}
					catch(Exception e) 
					{
						e.getMessage();
						e.printStackTrace();	
					}

					//Work Around
					if(se.element().isElementPresent(BuildingDetails_TXT_Isthisbuildingopen_sided_WA))
					{
						se.element().enterOrValidateText(getBuildingDetails_TXT_Isthisbuildingopen_sided_WA(strBuildingDetails_TXT_Isthisbuildingopen_sided),strBuildingDetails_TXT_Isthisbuildingopen_sided,test);
					}
					else
					{
						se.element().SelectElement(BuildingDetails_DD_Isthisbuildingopen_sided,strBuildingDetails_DDV_Is_this_building_open_sided,test);
					}

					se.element().enterOrValidateText(getBuildingDetails_TXT_TotalFloorAreaofBuilding(strBuildingDetails_TXT_TotalFloorAreaofBuilding),strBuildingDetails_TXT_TotalFloorAreaofBuilding,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_NumberofStories(strBuildingDetails_TXT_NumberofStories),strBuildingDetails_TXT_NumberofStories,test);
					se.element().SelectElement(BuildingDetails_DD_RoofMaterial,strBuildingDetails_DD_RoofMaterial,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_YearBulit(strBuildingDetails_TXT_YearBulit),strBuildingDetails_TXT_YearBulit,test);
					se.element().checkUncheckOrValidate(getBuildingDetails_CHK_YearBulitisunknown(strBuildingDetails_CHK_YearBulitisunknown),strBuildingDetails_CHK_YearBulitisunknown,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_RoofYrupdt(strBuildingDetails_TXT_RoofYrupdt),strBuildingDetails_TXT_RoofYrupdt,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_Plumbingyrupdt(strBuildingDetails_TXT_Plumbingyrupdt),strBuildingDetails_TXT_Plumbingyrupdt,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_Heatingyrupdt(strBuildingDetails_TXT_Heatingyrupdt),strBuildingDetails_TXT_Heatingyrupdt,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_Writingyrupdt(strBuildingDetails_TXT_Writingyrupdt),strBuildingDetails_TXT_Writingyrupdt,test);
					se.element().checkUncheckOrValidate(getBuildingDetails_CHK_SelectAddPPCCodes(strBuildingDetails_CHK_SelectAddPPCCodes),strBuildingDetails_CHK_SelectAddPPCCodes,test);
					se.element().SelectElement(BuildingDetails_DD_Protectionclass,strBuildingDetails_DD_Protectionclass,test);
					se.element().SelectElement(BuildingDetails_DD_IStheBulidingSprinkled,strBuildingDetails_DD_IStheBulidingSprinkled,test);
					se.element().checkUncheckOrValidate(getBuildingDetails_CHK_AutomaticSprinkler(strBuildingDetails_CHK_AutomaticSprinkler),strBuildingDetails_CHK_AutomaticSprinkler,test);
					se.element().checkUncheckOrValidate(getBuildingDetails_CHK_AutomaticFire(strBuildingDetails_CHK_AutomaticFire),strBuildingDetails_CHK_AutomaticFire,test);
					se.element().checkUncheckOrValidate(getBuildingDetails_CHK_FireSecurity(strBuildingDetails_CHK_FireSecurity),strBuildingDetails_CHK_FireSecurity,test);
					se.element().checkUncheckOrValidate(getBuildingDetails_CHK_ServiceContract(strBuildingDetails_CHK_ServiceContract),strBuildingDetails_CHK_ServiceContract,test);
					se.element().checkUncheckOrValidate(getBuildingDetails_CHK_AutomaticBurglary_outside(strBuildingDetails_CHK_AutomaticBurglary_outside),strBuildingDetails_CHK_AutomaticBurglary_outside,test);
					se.element().checkUncheckOrValidate(getBuildingDetails_CHK_AutomaticBurglary_Loud(strBuildingDetails_CHK_AutomaticBurglary_Loud),strBuildingDetails_CHK_AutomaticBurglary_Loud,test);
					se.element().checkUncheckOrValidate(getBuildingDetails_CHK_Security(strBuildingDetails_CHK_Security),strBuildingDetails_CHK_Security,test);
					se.element().checkUncheckOrValidate(getBuildingDetails_CHK_KentuckyTaxInfo_Local_Government_Prem_Tax(strBuildingDetails_CHK_KentuckyTaxInfo_Local_Government_Prem_Tax),strBuildingDetails_CHK_KentuckyTaxInfo_Local_Government_Prem_Tax,test);
					se.element().waitForElementToAppear_One(strBuildingDetails_DD_MunicipalityCity,BuildingDetails_DD_MunicipalityCity, 30);
					se.element().SelectElement(BuildingDetails_DD_MunicipalityCity,strBuildingDetails_DD_MunicipalityCity,test);
					se.element().SelectElement(BuildingDetails_DD_County,strBuildingDetails_DD_County,test);
					se.element().SelectElement(BuildingDetails_DD_IllinoisFireTax_JurisdictionDescription,strBuildingDetails_DD_IllinoisFireTax_JurisdictionDescription,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_ASGR(strBuildingDetails_TXT_AddBuildInfo_ASGR),strBuildingDetails_TXT_AddBuildInfo_ASGR,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_PercenTOccByApp(strBuildingDetails_TXT_AddBuildInfo_PercenTOccByApp),strBuildingDetails_TXT_AddBuildInfo_PercenTOccByApp,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_ApartmentPercent(strBuildingDetails_TXT_AddBuildInfo_ApartmentPercent),strBuildingDetails_TXT_AddBuildInfo_ApartmentPercent,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_OfficePercent(strBuildingDetails_TXT_AddBuildInfo_OfficePercent),strBuildingDetails_TXT_AddBuildInfo_OfficePercent,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_RestaurantPercent(strBuildingDetails_TXT_AddBuildInfo_RestaurantPercent),strBuildingDetails_TXT_AddBuildInfo_RestaurantPercent,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_RetailSalePercent(strBuildingDetails_TXT_AddBuildInfo_RetailSalePercent),strBuildingDetails_TXT_AddBuildInfo_RetailSalePercent,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_ServOccupanciesPercent(strBuildingDetails_TXT_AddBuildInfo_ServOccupanciesPercent),strBuildingDetails_TXT_AddBuildInfo_ServOccupanciesPercent,test);
					se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_ManufacturePercent(strBuildingDetails_TXT_AddBuildInfo_ManufacturePercent),strBuildingDetails_TXT_AddBuildInfo_ManufacturePercent,test);
					se.element().checkUncheckOrValidate(getBuildingDetails_CHK_AddBuildInfo_TentaRatesApp(strBuildingDetails_CHK_AddBuildInfo_TentaRatesApp),strBuildingDetails_CHK_AddBuildInfo_TentaRatesApp,test);
					
					if(se.element().isElementPresent(BuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails)){
						se.util().sleep(5000);
						se.element().checkUncheckOrValidate(getBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails(strBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails),strBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails,test);
						strBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails = "N/A";
						se.util().sleep(3000);
					}else{
					se.element().waitForElement(BuildingDetails_BTN_Save, 30);
					se.element().Click(getBuildingDetails_BTN_Save(), test);
					se.element().waitForLoad(120);
					se.element().waitForElementToDisappear_One(progressBar, 60);
					
					}
					
					//String bulidingisomsg=se.element().getSelectedText(BuildingDetails_TXT_bulidingisomsg);
					if(se.element().isElementVisible(BuildingDetails_BTN_Save)&&!strBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails.equalsIgnoreCase("N/A"))
					{
						
						boolean flag1=se.element().waitForElementToClickable(getBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails(strBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails),5);
						if(flag1==true) {
							se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_PercenTOccByApp(strBuildingDetails_TXT_AddBuildInfo_PercenTOccByApp),strBuildingDetails_TXT_AddBuildInfo_PercenTOccByApp,test);
							if(!strRegressionID.equalsIgnoreCase("Functional_24")) {
							se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_ApartmentPercent(strBuildingDetails_TXT_AddBuildInfo_ApartmentPercent),strBuildingDetails_TXT_AddBuildInfo_ApartmentPercent,test);
							se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_OfficePercent(strBuildingDetails_TXT_AddBuildInfo_OfficePercent),strBuildingDetails_TXT_AddBuildInfo_OfficePercent,test);
							se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_RestaurantPercent(strBuildingDetails_TXT_AddBuildInfo_RestaurantPercent),strBuildingDetails_TXT_AddBuildInfo_RestaurantPercent,test);
							se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_RetailSalePercent(strBuildingDetails_TXT_AddBuildInfo_RetailSalePercent),strBuildingDetails_TXT_AddBuildInfo_RetailSalePercent,test);
							se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_ServOccupanciesPercent(strBuildingDetails_TXT_AddBuildInfo_ServOccupanciesPercent),strBuildingDetails_TXT_AddBuildInfo_ServOccupanciesPercent,test);
							se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_ManufacturePercent(strBuildingDetails_TXT_AddBuildInfo_ManufacturePercent),strBuildingDetails_TXT_AddBuildInfo_ManufacturePercent,test);
							}
							se.element().checkUncheckOrValidate(getBuildingDetails_CHK_AddBuildInfo_TentaRatesApp(strBuildingDetails_CHK_AddBuildInfo_TentaRatesApp),strBuildingDetails_CHK_AddBuildInfo_TentaRatesApp,test);
							se.util().sleep(3000);
							se.element().checkUncheckOrValidate(getBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails(strBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails),strBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails,test);	
							se.util().sleep(3000);
						}
						se.element().waitForElementToClickable(getBuildingDetails_BTN_Save(),5);
						
						se.element().waitForElementToDisappear_One(progressBar, 120);
						executor.executeScript("arguments[0].scrollIntoView(0,500);", getBuildingDetails_BTN_Save());
						se.element().Click(getBuildingDetails_BTN_Save(), test);
						se.element().waitForLoad(120);
						se.element().waitForElementToDisappear_One(progressBar, 60);
					
						
					}
					if(se.element().isElementVisible(BuildingDetails_HardstopMessage)){
						
						if(getBuildingDetails_HardstopMessageTxt().getText().equalsIgnoreCase("Sum of percentages should be equal to 100%.")){
							test.log(LogStatus.INFO, "HardstopMessage text is -", "<br>Actual: "+getBuildingDetails_HardstopMessageTxt().getText()+"<br>Expected: "+"Sum of percentages should be equal to 100%."+"<br>");
							
							if(strRegressionID.equalsIgnoreCase("Functional_24")) {
							se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_ApartmentPercent(strBuildingDetails_TXT_AddBuildInfo_ApartmentPercent),strBuildingDetails_TXT_AddBuildInfo_ApartmentPercent,test);
							se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_OfficePercent(strBuildingDetails_TXT_AddBuildInfo_OfficePercent),strBuildingDetails_TXT_AddBuildInfo_OfficePercent,test);
							se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_RestaurantPercent(strBuildingDetails_TXT_AddBuildInfo_RestaurantPercent),strBuildingDetails_TXT_AddBuildInfo_RestaurantPercent,test);
							se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_RetailSalePercent(strBuildingDetails_TXT_AddBuildInfo_RetailSalePercent),strBuildingDetails_TXT_AddBuildInfo_RetailSalePercent,test);
							se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_ServOccupanciesPercent(strBuildingDetails_TXT_AddBuildInfo_ServOccupanciesPercent),strBuildingDetails_TXT_AddBuildInfo_ServOccupanciesPercent,test);
							se.element().enterOrValidateText(getBuildingDetails_TXT_AddBuildInfo_ManufacturePercent(strBuildingDetails_TXT_AddBuildInfo_ManufacturePercent),strBuildingDetails_TXT_AddBuildInfo_ManufacturePercent,test);
							se.element().checkUncheckOrValidate(getBuildingDetails_CHK_AddBuildInfo_TentaRatesApp(strBuildingDetails_CHK_AddBuildInfo_TentaRatesApp),strBuildingDetails_CHK_AddBuildInfo_TentaRatesApp,test);
							se.element().checkUncheckOrValidate(getBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails(strBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails),strBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails,test);	
							}
							}
						
						else if(!getBuildingDetails_HardstopMessageTxt().getText().contains("There are items in the list that must be edited before continuing")){
							test.log(LogStatus.INFO, "HardstopMessage text is -", "<br>Actual: "+getBuildingDetails_HardstopMessageTxt().getText()+"<br>Expected: "+"No Alert"+"<br>");
							test.log(LogStatus.FAIL,"HardstopMessage on Building screen of AgencyPortal - error - "+getBuildingDetails_HardstopMessageTxt().getText(),test.addScreenCapture(Util.captureScreenshot("BuildingDetails_HardstopMessageTxt" , se)));
							se.verify().verifyEquals("HardstopMessage on  CP_BuildingDetails_Details ", true, false, true, test);
							}
						
					}					
					if(!se.element().isElementVisible(GI_CHK_Continue)){
					if(se.element().isElementVisible(BuildingDetails_BTN_Save))
					{
						se.element().Click(getBuildingDetails_BTN_Save(), test);
						se.element().waitForLoad(120);
						se.element().waitForElementToDisappear_One(progressBar, 60);
					}
					 if(se.element().isElementVisible(Common_BTN_Cancel)){
						se.util().sleep(3000);
						se.element().Click(getCommon_BTN_Cancel("Cancel"), test);
					}
					}
					
					if(strBuildingDetails_BTN_Delete.contains("Delete"))
					{
						test.log(LogStatus.INFO,"Clicking on Delete of Building Details Roster screen -",test.addScreenCapture(Util.captureScreenshot("Building and Occupant Selection Roster screen" , se)));
						
						se.element().Click(getBuildingDetails_BTN_Delete(strBuildingDetails_BTN_Delete_Loc), test);
						if(se.element().isElementPresent(BuildingDetails_DeleteMessage)) {
							se.element().enterOrValidateText(getBuildingDetails_DeleteMessage(strBuildingDetails_DeleteMessage),strBuildingDetails_DeleteMessage,test);
						}
						else {
							test.log(LogStatus.FAIL,"Building Details Delete message is not displayed- ",test.addScreenCapture(Util.captureScreenshot("Building and Occupant Selection screen Delete message" , se)));
							
						}
						se.util().sleep(1000);
					}
				}
			}
			catch(Exception e){
				e.printStackTrace();
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for CP_BuildingDetails_Details ", true, false, true, test);

			}
			iteration++;
			// Commented this code as Redo is now not performed for AG_02
			/*if(!text.contains("This screen is read-only")&& transaction.contains("NewQuote")&& strBuildingDetails_ReadOnly.contains("Y"))
			{
				CP_Summary CP_Summary=TestPageFactory.initElements(se, CP_Summary.class);
				CP_Summary.CP_External_QuoteOpen(strRegressionID,   transaction, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote, test);
				BT.NavigateToTabs("Building Details",test);
			}*/
		}
		try{
			se.element().Click(getGI_CHK_Continue(), test);
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_BuildingDetails_Details ", true, false, true, test);
			e.printStackTrace();
			e.getMessage();
		}
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}


