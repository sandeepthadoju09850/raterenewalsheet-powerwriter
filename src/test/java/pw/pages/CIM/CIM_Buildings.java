package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CIM;

public class CIM_Buildings extends OR_CIM{

	public void CIM_Buildings(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
			if(SuspendSheet.equalsIgnoreCase("CIM_Buildings")){
				test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_Buildings", strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strCIM_Buildings_BTN_Add = (String) row.get("CIM_Buildings_BTN_Add");
				String strCIM_Buildings_TXT_LocationNo = (String) row.get("CIM_Buildings_TXT_LocationNo");
				String strCIM_Buildings_TXT_Name = (String) row.get("CIM_Buildings_TXT_Name");
				String strCIM_Buildings_TXT_Description = (String) row.get("CIM_Buildings_TXT_Description");
				String strCIM_Buildings_TXT_Street = (String) row.get("CIM_Buildings_TXT_Street");
				String strCIM_Buildings_TXT_Ste_Unit = (String) row.get("CIM_Buildings_TXT_Ste/Unit");
				String strCIM_Buildings_TXT_City = (String) row.get("CIM_Buildings_TXT_City");
				String strCIM_Buildings_TXT_StateDescription = (String) row.get("CIM_Buildings_TXT_StateDescription");
				String strCIM_Buildings_TXT_ZipCode = (String) row.get("CIM_Buildings_TXT_ZipCode");
				String strCIM_Buildings_TXT_Building = (String) row.get("CIM_Buildings_TXT_Building");
				String strCIM_Buildings_TXT_BuildingDescription = (String) row.get("CIM_Buildings_TXT_BuildingDescription");
				String strCIM_Buildings_TXT_Territory = (String) row.get("CIM_Buildings_TXT_Territory");
				String strCIM_Buildings_TXT_TerritoryDescription = (String) row.get("CIM_Buildings_TXT_TerritoryDescription");
				String strCIM_Buildings_CHK_TentativeRatesApply = (String) row.get("CIM_Buildings_CHK_TentativeRatesApply");
				String strCIM_Buildings_CHK_BGIClassRated = (String) row.get("CIM_Buildings_CHK_BGIClassRated");
				String strCIM_Buildings_CHK_BGIIClassRated = (String) row.get("CIM_Buildings_CHK_BGIIClassRated");
				String strCIM_Buildings_TXT_GroupITerritory = (String) row.get("CIM_Buildings_TXT_GroupITerritory");
				String strCIM_Buildings_TXT_GroupIITerritory = (String) row.get("CIM_Buildings_TXT_GroupIITerritory");
				String strCIM_Buildings_TXT_BuildingClassCode = (String) row.get("CIM_Buildings_TXT_BuildingClassCode");
				String strCIM_Buildings_TXT_BuildingClassCodeDesc_Popup = (String) row.get("CIM_Buildings_TXT_BuildingClassCodeDesc_Popup");
				String strCIM_Buildings_TXT_BuildingClassCodeFilter = (String) row.get("CIM_Buildings_TXT_BuildingClassCodeFilter");
				
				String strCIM_Buildings_TXT_BuildingClassDescription = (String) row.get("CIM_Buildings_TXT_BuildingClassDescription");
				String strCIM_Buildings_TXT_Construction = (String) row.get("CIM_Buildings_TXT_Construction");
				String strCIM_Buildings_TXT_ConstructionFilter = (String) row.get("CIM_Buildings_TXT_ConstructionFilter");
				String strCIM_Buildings_TXT_ConstructionDescription = (String) row.get("CIM_Buildings_TXT_ConstructionDescription");
				String strCIM_Buildings_TXT_ConstructionDesc_Popup = (String) row.get("CIM_Buildings_TXT_ConstructionDesc_Popup");
				String strCIM_Buildings_TXT_ConstructionPopup_GroupIISymbolDesc = (String) row.get("CIM_Buildings_TXT_ConstructionPopup_GroupIISymbolDesc");
				String strCIM_Buildings_TXT_ConstructionPopup_GroupIISymbol = (String) row.get("CIM_Buildings_TXT_ConstructionPopup_GroupIISymbol");
				String strCIM_Buildings_CHK_OpenSides = (String) row.get("CIM_Buildings_CHK_OpenSides");
				String strCIM_Buildings_TXT_ProtectionClass = (String) row.get("CIM_Buildings_TXT_ProtectionClass");
				String strCIM_Buildings_TXT_ProtectionClassFilter = (String) row.get("CIM_Buildings_TXT_ProtectionClassFilter");
				String strCIM_Buildings_TXT_PersonalPropertyClassCode = (String) row.get("CIM_Buildings_TXT_PersonalPropertyClassCode");
				String strCIM_Buildings_TXT_PersonalPropertyClassCodeFilter = (String) row.get("CIM_Buildings_TXT_PersonalPropertyClassCodeFilter");
				String strCIM_Buildings_TXT_PersonalPropertyClasscodePopup_ClassDesc = (String) row.get("CIM_Buildings_TXT_PersonalPropertyClasscodePopup_ClassDesc");	
				String strCIM_Buildings_TXT_PersonalPropertyClassDescription = (String) row.get("CIM_Buildings_TXT_PersonalPropertyClassDescription");	
				
				String strCIM_Buildings_TXT_BGILossCost = (String) row.get("CIM_Buildings_TXT_BGILossCost");
				String strCIM_Buildings_TXT_BGIILossCost = (String) row.get("CIM_Buildings_TXT_BGIILossCost");
				String strCIM_Buildings_TXT_GroupIITerritoryDescription = (String) row.get("CIM_Buildings_TXT_GroupIITerritoryDescription");
				String strCIM_Buildings_TXT_GroupIISymbolDescription = (String) row.get("CIM_Buildings_TXT_GroupIISymbolDescription");
				String strCIM_Buildings_TXT_GroupIISymbol = (String) row.get("CIM_Buildings_TXT_GroupIISymbol");
				String strCIM_Buildings_CHK_DoNotApplyCityOrCountyTax = (String) row.get("CIM_Buildings_CHK_DoNotApplyCityOrCountyTax");
				String strCIM_Buildings_CHK_AllCityName = (String) row.get("CIM_Buildings_CHK_AllCityName");
				String strCIM_Buildings_TXT_CityKYTax = (String) row.get("CIM_Buildings_TXT_CityKYTax");
				String strCIM_Buildings_TXT_CityKYTaxFilter = (String) row.get("CIM_Buildings_TXT_CityKYTaxFilter");
				String strCIM_Buildings_TXT_CItyCode = (String) row.get("CIM_Buildings_TXT_CItyCode");
				String strCIM_Buildings_TXT_CItyCode_Popup = (String) row.get("CIM_Buildings_TXT_CItyCode_Popup");
				String strCIM_Buildings_CHK_AllCoutyName = (String) row.get("CIM_Buildings_CHK_AllCoutyName");
				String strCIM_Buildings_TXT_County = (String) row.get("CIM_Buildings_TXT_County");
				String strCIM_Buildings_TXT_CountyFilter = (String) row.get("CIM_Buildings_TXT_CountyFilter");
				String strCIM_Buildings_TXT_CountyCode = (String) row.get("CIM_Buildings_TXT_CountyCode");
				String strCIM_Buildings_TXT_CountyCode_Popup = (String) row.get("CIM_Buildings_TXT_CountyCode_Popup");
				String strCIM_Buildings_TXT_TaxCode = (String) row.get("CIM_Buildings_TXT_TaxCode");
				String strCIM_Buildings_BTN_Done = (String) row.get("CIM_Buildings_BTN_Done");
				
				try{
					se.log().logTestStep("CP_CIM_Buildings");
					test.log(LogStatus.INFO, "CP_CIM_Buildings page",
							"Transaction Step : " + transaction + "<br>" + "Page : CP_CIM_Buildings");
					
				if(strCIM_Buildings_BTN_Add.equalsIgnoreCase(constants.Yes)){
					se.element().clickElement(getCIM_Buildings_BTN_Add(),test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_LocationNo(strCIM_Buildings_TXT_LocationNo),strCIM_Buildings_TXT_LocationNo,test);
					se.util().sleep(1000);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_Name(strCIM_Buildings_TXT_Name),strCIM_Buildings_TXT_Name,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_Description(strCIM_Buildings_TXT_Description),strCIM_Buildings_TXT_Description,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_Street(strCIM_Buildings_TXT_Street),strCIM_Buildings_TXT_Street,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_Ste_Unit(strCIM_Buildings_TXT_Ste_Unit),strCIM_Buildings_TXT_Ste_Unit,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_City(strCIM_Buildings_TXT_City),strCIM_Buildings_TXT_City,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_StateDescription(strCIM_Buildings_TXT_StateDescription),strCIM_Buildings_TXT_StateDescription,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_ZipCode(strCIM_Buildings_TXT_ZipCode),strCIM_Buildings_TXT_ZipCode,test);
					se.element().checkUncheckOrValidate(getCIM_Buildings_CHK_DoNotApplyCityOrCountyTax(strCIM_Buildings_CHK_DoNotApplyCityOrCountyTax),strCIM_Buildings_CHK_DoNotApplyCityOrCountyTax,test);
					se.element().checkUncheckOrValidate(getCIM_Buildings_CHK_AllCityName(strCIM_Buildings_CHK_AllCityName),strCIM_Buildings_CHK_AllCityName,test);
					se.element().selectPopupWithMagnifier(getCIM_Buildings_TXT_CityKYTax(strCIM_Buildings_TXT_CityKYTax), getCIM_Buildings_TXT_CityKYTaxSearch(strCIM_Buildings_TXT_CityKYTax), strCIM_Buildings_TXT_CityKYTax,strCIM_Buildings_TXT_CityKYTaxFilter, strCIM_Buildings_TXT_CityKYTax,strCIM_Buildings_TXT_CItyCode_Popup, constants.NA, constants.NA, test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_CItyCode(strCIM_Buildings_TXT_CItyCode),strCIM_Buildings_TXT_CItyCode,test);
					se.element().checkUncheckOrValidate(getCIM_Buildings_CHK_AllCoutyName(strCIM_Buildings_CHK_AllCoutyName),strCIM_Buildings_CHK_AllCoutyName,test);
					se.element().selectPopupWithMagnifier(getCIM_Buildings_TXT_County(strCIM_Buildings_TXT_County), getCIM_Buildings_TXT_CountySearch(strCIM_Buildings_TXT_County), strCIM_Buildings_TXT_County,strCIM_Buildings_TXT_CountyFilter, strCIM_Buildings_TXT_County,strCIM_Buildings_TXT_CountyCode_Popup, constants.NA, constants.NA, test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_CountyCode(strCIM_Buildings_TXT_CountyCode),strCIM_Buildings_TXT_CountyCode,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_TaxCode(strCIM_Buildings_TXT_TaxCode),strCIM_Buildings_TXT_TaxCode,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_Building(strCIM_Buildings_TXT_Building),strCIM_Buildings_TXT_Building,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_BuildingDescription(strCIM_Buildings_TXT_BuildingDescription),strCIM_Buildings_TXT_BuildingDescription,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_Territory(strCIM_Buildings_TXT_Territory),strCIM_Buildings_TXT_Territory,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_TerritoryDescription(strCIM_Buildings_TXT_TerritoryDescription),strCIM_Buildings_TXT_TerritoryDescription,test);
					se.element().checkUncheckOrValidate(getCIM_Buildings_CHK_TentativeRatesApply(strCIM_Buildings_CHK_TentativeRatesApply),strCIM_Buildings_CHK_TentativeRatesApply,test);
					se.element().checkUncheckOrValidate(getCIM_Buildings_CHK_BGIClassRated(strCIM_Buildings_CHK_BGIClassRated),strCIM_Buildings_CHK_BGIClassRated,test);
					se.element().checkUncheckOrValidate(getCIM_Buildings_CHK_BGIIClassRated(strCIM_Buildings_CHK_BGIIClassRated),strCIM_Buildings_CHK_BGIIClassRated,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_GroupITerritory(strCIM_Buildings_TXT_GroupITerritory),strCIM_Buildings_TXT_GroupITerritory,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_GroupIITerritory(strCIM_Buildings_TXT_GroupIITerritory),strCIM_Buildings_TXT_GroupIITerritory,test);
				
					//TODO Modify Xpath to take 2 parameters
					/*if(!strCIM_Buildings_TXT_BuildingClassCode.equalsIgnoreCase("N/A") && !strCIM_Buildings_TXT_BuildingClassCode.contains("validate2")){
						se.element().clickSearchIcon(getCIM_Buildings_BTN_BuildingClassCodeSearchIcon(), test);
						se.element().enterOrValidateText(getCIM_Buildings_TXT_BuildingClassCodeSearch(strCIM_Buildings_TXT_BuildingClassCode), strCIM_Buildings_TXT_BuildingClassCode, test);
						se.element().enterOrValidateText(getCIM_Buildings_TXT_BuildingClassCodeDetailsSearch(strCIM_Buildings_TXT_BuildingClassCodeDesc_Popup), strCIM_Buildings_TXT_BuildingClassCodeDesc_Popup, test);
						se.element().clickElement(getCIM_Buildings_BTN_Search_Icon(), test);
						se.element().Click(getCP_Bldgs_LNK_Construction(strCIM_Buildings_TXT_BuildingClassCodeDesc_Popup,strCIM_Buildings_TXT_BuildingClassCode), test);
					}else{
						se.element().enterOrValidateText(getCIM_Buildings_TXT_BuildingClassCode(strCIM_Buildings_TXT_BuildingClassCode),strCIM_Buildings_TXT_BuildingClassCode,test);
					}*/
				
					//se.element().enterOrValidateText(getCIM_Buildings_TXT_BuildingClassCode(strCIM_Buildings_TXT_BuildingClassCode),strCIM_Buildings_TXT_BuildingClassCode,test);
					se.element().selectClasscode(getCIM_Buildings_TXT_BuildingClassCode(strCIM_Buildings_TXT_BuildingClassCode),strCIM_Buildings_TXT_BuildingClassCodeFilter,strCIM_Buildings_TXT_BuildingClassCode,strCIM_Buildings_TXT_BuildingClassCodeDesc_Popup, constants.NA,constants.NA, test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_BuildingClassDescription(strCIM_Buildings_TXT_BuildingClassDescription),strCIM_Buildings_TXT_BuildingClassDescription,test);
					se.element().selectPopupWithMagnifier(getCIM_Buildings_TXT_Construction(strCIM_Buildings_TXT_Construction), getCIM_Buildings_TXT_ConstructionSearch(strCIM_Buildings_TXT_Construction), strCIM_Buildings_TXT_Construction,strCIM_Buildings_TXT_ConstructionFilter, strCIM_Buildings_TXT_Construction,strCIM_Buildings_TXT_ConstructionDesc_Popup, strCIM_Buildings_TXT_ConstructionPopup_GroupIISymbol, strCIM_Buildings_TXT_ConstructionPopup_GroupIISymbolDesc, test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_ConstructionDescription(strCIM_Buildings_TXT_ConstructionDescription),strCIM_Buildings_TXT_ConstructionDescription,test);
					se.element().checkUncheckOrValidate(getCIM_Buildings_CHK_OpenSides(strCIM_Buildings_CHK_OpenSides),strCIM_Buildings_CHK_OpenSides,test);
					se.element().selectPopupWithMagnifier(getCIM_Buildings_TXT_ProtectionClass(strCIM_Buildings_TXT_ProtectionClass), getCIM_Buildings_TXT_ProtectionClassSearch(strCIM_Buildings_TXT_ProtectionClass), strCIM_Buildings_TXT_ProtectionClass,strCIM_Buildings_TXT_ProtectionClassFilter, strCIM_Buildings_TXT_ProtectionClass,constants.NA, constants.NA, constants.NA, test);
					se.element().selectPopupWithMagnifier(getCIM_Buildings_TXT_PersonalPropertyClassCode(strCIM_Buildings_TXT_PersonalPropertyClassCode), getCIM_Buildings_TXT_PersonalPropertyClassCodeSearch(strCIM_Buildings_TXT_PersonalPropertyClassCode), strCIM_Buildings_TXT_PersonalPropertyClassCode,strCIM_Buildings_TXT_PersonalPropertyClassCodeFilter, strCIM_Buildings_TXT_PersonalPropertyClassCode,strCIM_Buildings_TXT_PersonalPropertyClasscodePopup_ClassDesc, constants.NA, constants.NA, test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_PersonalPropertyClassDescription(strCIM_Buildings_TXT_PersonalPropertyClassDescription),strCIM_Buildings_TXT_PersonalPropertyClassDescription,test);					
					se.element().enterOrValidateText(getCIM_Buildings_TXT_BGILossCost(strCIM_Buildings_TXT_BGILossCost),strCIM_Buildings_TXT_BGILossCost,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_BGIILossCost(strCIM_Buildings_TXT_BGIILossCost),strCIM_Buildings_TXT_BGIILossCost,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_GroupIITerritoryDescription(strCIM_Buildings_TXT_GroupIITerritoryDescription),strCIM_Buildings_TXT_GroupIITerritoryDescription,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_GroupIISymbolDescription(strCIM_Buildings_TXT_GroupIISymbolDescription),strCIM_Buildings_TXT_GroupIISymbolDescription,test);
					se.element().enterOrValidateText(getCIM_Buildings_TXT_GroupIISymbol(strCIM_Buildings_TXT_GroupIISymbol),strCIM_Buildings_TXT_GroupIISymbol,test);
					se.element().clickElement(getNext());
				}
				if(strCIM_Buildings_BTN_Done.equalsIgnoreCase(constants.Yes)) {
					se.element().clickElement(getDone());
				}
	
			}
		
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CIM_Buildings Page", true, false, true, test);
		}
		iteration++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Faied",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

	}
}
