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

public class CIM_PhysiciansAndSurgeonsEquipment extends OR_CIM{
	
	public void PhysiciansAndSurgeonsEquipment(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_PhysiciansAndSurgeons")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_PhysiciansAndSurgeons", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_PhysiciansAndSurgeons_BTN_ADD = (String) row.get("CIM_PhysiciansAndSurgeons_BTN_ADD");
		String strCIM_PhysiciansAndSurgeons_BTN_Details = (String) row.get("CIM_PhysiciansAndSurgeons_BTN_Details");
		String strCIM_PhysiciansAndSurgeons_BTN_Done = (String) row.get("CIM_PhysiciansAndSurgeons_BTN_Done");
		String strCIM_PhysiciansAndSurgeons_TXT_LocationNo = (String) row.get("CIM_PhysiciansAndSurgeons_TXT_LocationNo");
		String strCIM_PhysiciansAndSurgeons_TXT_BuildingNo = (String) row.get("CIM_PhysiciansAndSurgeons_TXT_BuildingNo");
		String strCIM_PhysiciansAndSurgeons_TXT_BuildingDescription = (String) row.get("CIM_PhysiciansAndSurgeons_TXT_BuildingDescription");
		String strCIM_PhysiciansAndSurgeons_TXT_Limit = (String) row.get("CIM_PhysiciansAndSurgeons_TXT_Limit");
		String strCIM_PhysiciansAndSurgeons_TXT_CoverageBasis = (String) row.get("CIM_PhysiciansAndSurgeons_TXT_CoverageBasis");
		String strCIM_PhysiciansAndSurgeons_BTN_ScheduledPropertADDButton = (String) row.get("CIM_PhysiciansAndSurgeons_BTN_ScheduledPropertADDButton");
		String strCIM_PhysiciansAndSurgeons_TXT_ItemNo = (String) row.get("CIM_PhysiciansAndSurgeons_TXT_ItemNo");
		String strCIM_PhysiciansAndSurgeons_TXT_Description = (String) row.get("CIM_PhysiciansAndSurgeons_TXT_Description");
		String strCIM_PhysiciansAndSurgeons_TXT_LimitOfInsurance = (String) row.get("CIM_PhysiciansAndSurgeons_TXT_LimitOfInsurance");
		String strCIM_PhysiciansAndSurgeons_CHK_AdditionalCoverageExtension = (String) row.get("CIM_PhysiciansAndSurgeons_CHK_AdditionalCoverageExtension");
		String strCIM_PhysiciansAndSurgeons_CHK_ArtifGeneElectricmagneticEnergyCov = (String) row.get("CIM_PhysiciansAndSurgeons_CHK_ArtifGeneElectricmagneticEnergyCov");
		String strCIM_PhysiciansAndSurgeons_TXT_ArtifGeneElectricmagneticEnergyCovAmt = (String) row.get("CIM_PhysiciansAndSurgeons_TXT_ArtifGeneElectricmagneticEnergyCovAmt");
		String strCIM_PhysiciansAndSurgeons_TXT_PackageModFactor = (String) row.get("CIM_PhysiciansAndSurgeons_TXT_PackageModFactor");
		
		try{
			se.log().logTestStep("PhysiciansAndSurgeonsEquipment");
			test.log(LogStatus.INFO, "PhysiciansAndSurgeonsEquipment page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMPhysiciansAndSurgeonsEquipment");
			se.verify().verifyEquals("PhysiciansAndSurgeonsEquipment page of PowerWriter ", getCIM_PhysiciansAndSurgeons_TXT_VerifyPhysiciansAndSurgeonsText().isDisplayed(),true, true,test);
		
			if((strCIM_PhysiciansAndSurgeons_BTN_ADD.equalsIgnoreCase("Yes"))){
				se.element().Click(getCIM_PhysiciansAndSurgeons_BTN_ADD(strCIM_PhysiciansAndSurgeons_BTN_ADD),test);
				}
				if((strCIM_PhysiciansAndSurgeons_BTN_Details.equalsIgnoreCase("Yes"))){
					se.element().tryClick(getCIM_PhysiciansAndSurgeons_BTN_Details(strCIM_PhysiciansAndSurgeons_BTN_Details),test);
				}
				
				se.element().enterOrValidateText(getCIM_PhysiciansAndSurgeons_TXT_LocationNo(strCIM_PhysiciansAndSurgeons_TXT_LocationNo),strCIM_PhysiciansAndSurgeons_TXT_LocationNo,test);
				se.element().enterOrValidateText(getCIM_PhysiciansAndSurgeons_TXT_BuildingNo(strCIM_PhysiciansAndSurgeons_TXT_BuildingNo),strCIM_PhysiciansAndSurgeons_TXT_BuildingNo,test);
				se.element().enterOrValidateText(getCIM_PhysiciansAndSurgeons_TXT_BuildingDescription(strCIM_PhysiciansAndSurgeons_TXT_BuildingDescription),strCIM_PhysiciansAndSurgeons_TXT_BuildingDescription,test);
				se.element().enterOrValidateText(getCIM_PhysiciansAndSurgeons_TXT_Limit(strCIM_PhysiciansAndSurgeons_TXT_Limit),strCIM_PhysiciansAndSurgeons_TXT_Limit,test);
				se.element().selectPopupWithMagnifier(getCIM_PhysiciansAndSurgeons_TXT_CoverageBasis(strCIM_PhysiciansAndSurgeons_TXT_CoverageBasis), getCIM_PhysiciansAndSurgeons_BTN_CoverageBasisSearch(strCIM_PhysiciansAndSurgeons_TXT_CoverageBasis), strCIM_PhysiciansAndSurgeons_TXT_CoverageBasis, constants.NA, strCIM_PhysiciansAndSurgeons_TXT_CoverageBasis, constants.NA, constants.NA, constants.NA, test);
				
				if((strCIM_PhysiciansAndSurgeons_BTN_ScheduledPropertADDButton.equalsIgnoreCase("Yes"))){
					se.element().Click(getCIM_PhysiciansAndSurgeons_BTN_ScheduledPropertADDButton(strCIM_PhysiciansAndSurgeons_BTN_ScheduledPropertADDButton),test);
					}
				
				se.element().enterOrValidateText(getCIM_PhysiciansAndSurgeons_TXT_ItemNo(strCIM_PhysiciansAndSurgeons_TXT_ItemNo),strCIM_PhysiciansAndSurgeons_TXT_ItemNo,test);
				se.element().enterOrValidateText(getCIM_PhysiciansAndSurgeons_TXT_Description(strCIM_PhysiciansAndSurgeons_TXT_Description),strCIM_PhysiciansAndSurgeons_TXT_Description,test);
				se.element().enterOrValidateText(getCIM_PhysiciansAndSurgeons_TXT_LimitOfInsurance(strCIM_PhysiciansAndSurgeons_TXT_LimitOfInsurance),strCIM_PhysiciansAndSurgeons_TXT_LimitOfInsurance,test);
				se.element().checkUncheckOrValidate(getCIM_PhysiciansAndSurgeons_CHK_AdditionalCoverageExtension(strCIM_PhysiciansAndSurgeons_CHK_AdditionalCoverageExtension),strCIM_PhysiciansAndSurgeons_CHK_AdditionalCoverageExtension,test);
				se.element().checkUncheckOrValidate(getCIM_PhysiciansAndSurgeons_CHK_ArtifGeneElectricmagneticEnergyCov(strCIM_PhysiciansAndSurgeons_CHK_ArtifGeneElectricmagneticEnergyCov),strCIM_PhysiciansAndSurgeons_CHK_ArtifGeneElectricmagneticEnergyCov,test);
				
				if(!strCIM_PhysiciansAndSurgeons_TXT_ArtifGeneElectricmagneticEnergyCovAmt.equalsIgnoreCase("N/A") && !strCIM_PhysiciansAndSurgeons_TXT_ArtifGeneElectricmagneticEnergyCovAmt.contains("validate2")) {
					se.element().clickSearchIcon(getCIM_PhysiciansAndSurgeons_BTN_ArtifGeneElectricmagneticEnergyCovAmtSearch(), test);
					se.element().clickelement(getCIM_PhysiciansAndSurgeons_LNK_ArtifGeneElectricmagneticEnergyCovAmtOption(strCIM_PhysiciansAndSurgeons_TXT_ArtifGeneElectricmagneticEnergyCovAmt),strCIM_PhysiciansAndSurgeons_TXT_ArtifGeneElectricmagneticEnergyCovAmt,test);
				}else {
					se.element().enterOrValidateText(getCIM_PhysiciansAndSurgeons_TXT_ArtifGeneElectricmagneticEnergyCovAmt(strCIM_PhysiciansAndSurgeons_TXT_ArtifGeneElectricmagneticEnergyCovAmt),strCIM_PhysiciansAndSurgeons_TXT_ArtifGeneElectricmagneticEnergyCovAmt,test);
				}
				
				
				se.element().enterOrValidateText(getCIM_PhysiciansAndSurgeons_TXT_PackageModFactor(strCIM_PhysiciansAndSurgeons_TXT_PackageModFactor),strCIM_PhysiciansAndSurgeons_TXT_PackageModFactor,test);

				se.element().Click(getNext(),test);
				
				if((strCIM_PhysiciansAndSurgeons_BTN_Done.equalsIgnoreCase("Yes"))){
					
					se.element().Click(getDone(),test);
				}
	
			
	}
		catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for PhysiciansAndSurgeonsEquipment ", true, false, true, test);
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
}
