package pw.pages.CP;

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

public class CP_FloodCoveragePage extends OR_CP{
	
	public void FloodCoveragePage(String strRegressionID,String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_FloodCoverage")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }

		List<Map<String, String>> table = ExcelOperations.getPagesData("CP_FloodCoverage", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			try{
				
				CP_FloodCoveragePage FloodCoverage = TestPageFactory.initElements(se, CP_FloodCoveragePage.class);
				FloodCoverage.CP_FloodCoverage(row,transaction,test);
				FloodCoverage.CP_FloodDefaultCoverageDetails(row, transaction, test);
			}
			catch(Exception e){
				
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



	public void CP_FloodCoverage(Map<String, String> row,String transaction, ExtentTest test) throws IOException {
		
		String strCP_FloodCoverage_CHK_CovType_NFIP = (String) row.get("CP_FloodCoverage_CHK_CovType_NFIP");
		String strCP_FloodCoverage_CHK_CovType_NoNFIP = (String) row.get("CP_FloodCoverage_CHK_CovType_NoNFIP");
		String strCP_FloodCoverage_TXT_FloodDeductible = (String) row.get("CP_FloodCoverage_TXT_FloodDeductible");
		String strCP_FloodCoverage_TXT_AnnualAggregateLimit = (String) row.get("CP_FloodCoverage_TXT_AnnualAggregateLimit");
		String strCP_FloodCoverage_CHK_NoCoinsuranceOption = (String) row.get("CP_FloodCoverage_CHK_NoCoinsuranceOption");
		String strCP_FloodCoverage_CHK_UnderlyingInsuranceWaiver = (String) row.get("CP_FloodCoverage_CHK_UnderlyingInsuranceWaiver");
		String strCP_FloodCoverage_TXT_DescofCovPersPropintheOpen = (String) row.get("CP_FloodCoverage_TXT_DescofCovPersPropintheOpen");
		String strCP_FloodCoverage_CHK_OtherFloodInsurance = (String) row.get("CP_FloodCoverage_CHK_OtherFloodInsurance");
		String strCP_FloodCoverage_CHK_OtherFloodType_PrimaryNFIP = (String) row.get("CP_FloodCoverage_CHK_OtherFloodType_PrimaryNFIP");
		String strCP_FloodCoverage_CHK_OtherFloodType_Other = (String) row.get("CP_FloodCoverage_CHK_OtherFloodType_Other");
		String strCP_FloodCoverage_TXT_DescriptionofOtherInsurance = (String) row.get("CP_FloodCoverage_TXT_DescriptionofOtherInsurance");
		String strCP_FloodCoverage_CHK_SeperateLimits = (String) row.get("CP_FloodCoverage_CHK_SeperateLimits");
		String strCP_FloodCoverage_CHK_BlanketLimits = (String) row.get("CP_FloodCoverage_CHK_BlanketLimits");
		String strCP_FloodCoverage_TXT_FloodDeductibleFilterNeeded = (String) row.get("CP_FloodCoverage_TXT_FloodDeductibleFilterNeeded");
		
		try{
			se.log().logTestStep("CP_FloodCoveragePage");
			test.log(LogStatus.INFO, "CP_FloodCoveragePage","Transaction Step : "+  transaction + "<br>" +"Page : CP_FloodCoveragePage"  + "<br>" +"Section: CP_FloodCoveragePage");
			se.util().sleep(1000);
			se.verify().verifyEquals("FloodCoveragePage of PowerWriter ", getCP_VerifyFloodCoverageText().isDisplayed(),true, true,test);
			se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_CovType_NFIP(strCP_FloodCoverage_CHK_CovType_NFIP),strCP_FloodCoverage_CHK_CovType_NFIP,test);
            se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_CovType_NoNFIP(strCP_FloodCoverage_CHK_CovType_NoNFIP),strCP_FloodCoverage_CHK_CovType_NoNFIP,test);
            /*if(!strCP_FloodCoverage_TXT_FloodDeductible.equalsIgnoreCase("N/A") && !strCP_FloodCoverage_TXT_FloodDeductible.contains("validate2")) {
            	se.element().clickSearchIcon(getCP_FloodCoverage_BTN_FloodDeductible_Search(), test);
            	se.element().Click(getCP_FloodCoverage_LNK_FloodDeductible(strCP_FloodCoverage_TXT_FloodDeductible), test);
            }else{
            	se.element().enterOrValidateText(getCP_FloodCoverage_TXT_FloodDeductible(strCP_FloodCoverage_TXT_FloodDeductible),strCP_FloodCoverage_TXT_FloodDeductible,test);
            }*/
            se.element().selectPopupWithMagnifier(getCP_FloodCoverage_TXT_FloodDeductible(strCP_FloodCoverage_TXT_FloodDeductible), getCP_FloodCoverage_BTN_FloodDeductible_Search(strCP_FloodCoverage_TXT_FloodDeductible), strCP_FloodCoverage_TXT_FloodDeductible, strCP_FloodCoverage_TXT_FloodDeductibleFilterNeeded, strCP_FloodCoverage_TXT_FloodDeductible,constants.NA, constants.NA, constants.NA, test);
            
            se.element().enterOrValidateText(getCP_FloodCoverage_TXT_AnnualAggregateLimit(strCP_FloodCoverage_TXT_AnnualAggregateLimit),strCP_FloodCoverage_TXT_AnnualAggregateLimit,test);
            se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_NoCoinsuranceOption(strCP_FloodCoverage_CHK_NoCoinsuranceOption),strCP_FloodCoverage_CHK_NoCoinsuranceOption,test);
            se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_UnderlyingInsuranceWaiver(strCP_FloodCoverage_CHK_UnderlyingInsuranceWaiver),strCP_FloodCoverage_CHK_UnderlyingInsuranceWaiver,test);
            se.element().enterOrValidateText(getCP_FloodCoverage_TXT_DescofCovPersPropintheOpen(strCP_FloodCoverage_TXT_DescofCovPersPropintheOpen),strCP_FloodCoverage_TXT_DescofCovPersPropintheOpen,test);
            se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_OtherFloodInsurance(strCP_FloodCoverage_CHK_OtherFloodInsurance),strCP_FloodCoverage_CHK_OtherFloodInsurance,test);
            se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_OtherFloodType_PrimaryNFIP(strCP_FloodCoverage_CHK_OtherFloodType_PrimaryNFIP),strCP_FloodCoverage_CHK_OtherFloodType_PrimaryNFIP,test);
            se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_OtherFloodType_Other(strCP_FloodCoverage_CHK_OtherFloodType_Other),strCP_FloodCoverage_CHK_OtherFloodType_Other,test);
            se.element().enterOrValidateText(getCP_FloodCoverage_TXT_DescriptionofOtherInsurance(strCP_FloodCoverage_TXT_DescriptionofOtherInsurance),strCP_FloodCoverage_TXT_DescriptionofOtherInsurance,test);
            se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_SeperateLimits(strCP_FloodCoverage_CHK_SeperateLimits),strCP_FloodCoverage_CHK_SeperateLimits,test);
            se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_BlanketLimits(strCP_FloodCoverage_CHK_BlanketLimits),strCP_FloodCoverage_CHK_BlanketLimits,test);
            
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_FloodCoveragePage", true, false, true, test);
		}
		
	}
	
	public void CP_FloodDefaultCoverageDetails(Map<String, String> row,String transaction, ExtentTest test) throws IOException {
		String strCP_FloodCoverage_CHK_Building = (String) row.get("CP_FloodCoverage_CHK_Building");
		String strCP_FloodCoverage_TXT_BuildingLimit = (String) row.get("CP_FloodCoverage_TXT_BuildingLimit");
		String strCP_FloodCoverage_TXT_BuildingPremium = (String) row.get("CP_FloodCoverage_TXT_BuildingPremium");
		String strCP_FloodCoverage_CHK_PersonalProperty = (String) row.get("CP_FloodCoverage_CHK_PersonalProperty");
		String strCP_FloodCoverage_TXT_PersonalPropertyLimit = (String) row.get("CP_FloodCoverage_TXT_PersonalPropertyLimit");
		String strCP_FloodCoverage_TXT_PersonalPropertyPremium = (String) row.get("CP_FloodCoverage_TXT_PersonalPropertyPremium");
		String strCP_FloodCoverage_CHK_BusinessIncome = (String) row.get("CP_FloodCoverage_CHK_BusinessIncome");
		String strCP_FloodCoverage_CHK_WithExtraExpense = (String) row.get("CP_FloodCoverage_CHK_WithExtraExpense");
		String strCP_FloodCoverage_CHK_WithoutExtraExpense = (String) row.get("CP_FloodCoverage_CHK_WithoutExtraExpense");
		String strCP_FloodCoverage_TXT_BusinessIncomeLimit = (String) row.get("CP_FloodCoverage_TXT_BusinessIncomeLimit");
		String strCP_FloodCoverage_TXT_BusinessIncomePremium = (String) row.get("CP_FloodCoverage_TXT_BusinessIncomePremium");
		String strCP_FloodCoverage_CHK_ExtraExpense = (String) row.get("CP_FloodCoverage_CHK_ExtraExpense");
		String strCP_FloodCoverage_TXT_ExtraExpenseLimit = (String) row.get("CP_FloodCoverage_TXT_ExtraExpenseLimit");
		String strCP_FloodCoverage_TXT_ExtraExpensePremium = (String) row.get("CP_FloodCoverage_TXT_ExtraExpensePremium");
		String strCP_FloodCoverage_CHK_SpecialClass = (String) row.get("CP_FloodCoverage_CHK_SpecialClass");
		String strCP_FloodCoverage_TXT_SpecialClassLimit = (String) row.get("CP_FloodCoverage_TXT_SpecialClassLimit");
		String strCP_FloodCoverage_TXT_SpecialClassPremium = (String) row.get("CP_FloodCoverage_TXT_SpecialClassPremium");
		String strCP_FloodCoverage_TXT_SeparateTotalFLoodLimit = (String) row.get("CP_FloodCoverage_TXT_SeparateTotalFLoodLimit");
		String strCP_FloodCoverage_TXT_SeparateTotalPremium = (String) row.get("CP_FloodCoverage_TXT_SeparateTotalPremium");
		String strCP_FloodCoverage_TXT_BlanketNumber = (String) row.get("CP_FloodCoverage_TXT_BlanketNumber");
		String strCP_FloodCoverage_CHK_Blanket_Building = (String) row.get("CP_FloodCoverage_CHK_Blanket_Building");
		String strCP_FloodCoverage_CHK_Blanket_PerProp = (String) row.get("CP_FloodCoverage_CHK_Blanket_PerProp");
		String strCP_FloodCoverage_CHK_Blanket_BusinessIncome = (String) row.get("CP_FloodCoverage_CHK_Blanket_BusinessIncome");
		String strCP_FloodCoverage_CHK_Blanket_ExtraExpense = (String) row.get("CP_FloodCoverage_CHK_Blanket_ExtraExpense");
		String strCP_FloodCoverage_CHK_Blanket_SpecialClass = (String) row.get("CP_FloodCoverage_CHK_Blanket_SpecialClass");
		String strCP_FloodCoverage_TXT_BlanketLimit = (String) row.get("CP_FloodCoverage_TXT_BlanketLimit");
		String strCP_FloodCoverage_TXT_BlanketTotalPremium = (String) row.get("CP_FloodCoverage_TXT_BlanketTotalPremium");
		
		try{
			se.log().logTestStep("CP_FloodDefaultCoverageDetails");
			test.log(LogStatus.INFO, "CP_FloodDefaultCoverageDetails","Transaction Step : "+  transaction + "<br>" +"Page : CP_FloodDefaultCoverageDetails"  + "<br>" +"Section: CP_FloodDefaultCoverageDetails");
			se.util().sleep(1000);
			se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_Building(strCP_FloodCoverage_CHK_Building),strCP_FloodCoverage_CHK_Building,test);
			se.element().enterOrValidateText(getCP_FloodCoverage_TXT_BuildingLimit(strCP_FloodCoverage_TXT_BuildingLimit),strCP_FloodCoverage_TXT_BuildingLimit,test);
			se.element().enterOrValidateText(getCP_FloodCoverage_TXT_BuildingPremium(strCP_FloodCoverage_TXT_BuildingPremium),strCP_FloodCoverage_TXT_BuildingPremium,test);
			se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_PersonalProperty(strCP_FloodCoverage_CHK_PersonalProperty),strCP_FloodCoverage_CHK_PersonalProperty,test);
			se.element().enterOrValidateText(getCP_FloodCoverage_TXT_PersonalPropertyLimit(strCP_FloodCoverage_TXT_PersonalPropertyLimit),strCP_FloodCoverage_TXT_PersonalPropertyLimit,test);
			se.element().enterOrValidateText(getCP_FloodCoverage_TXT_PersonalPropertyPremium(strCP_FloodCoverage_TXT_PersonalPropertyPremium),strCP_FloodCoverage_TXT_PersonalPropertyPremium,test);
			se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_BusinessIncome(strCP_FloodCoverage_CHK_BusinessIncome),strCP_FloodCoverage_CHK_BusinessIncome,test);
			se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_WithExtraExpense(strCP_FloodCoverage_CHK_WithExtraExpense),strCP_FloodCoverage_CHK_WithExtraExpense,test);
			se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_WithoutExtraExpense(strCP_FloodCoverage_CHK_WithoutExtraExpense),strCP_FloodCoverage_CHK_WithoutExtraExpense,test);
			se.element().enterOrValidateText(getCP_FloodCoverage_TXT_BusinessIncomeLimit(strCP_FloodCoverage_TXT_BusinessIncomeLimit),strCP_FloodCoverage_TXT_BusinessIncomeLimit,test);
			se.element().enterOrValidateText(getCP_FloodCoverage_TXT_BusinessIncomePremium(strCP_FloodCoverage_TXT_BusinessIncomePremium),strCP_FloodCoverage_TXT_BusinessIncomePremium,test);
			se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_ExtraExpense(strCP_FloodCoverage_CHK_ExtraExpense),strCP_FloodCoverage_CHK_ExtraExpense,test);
			se.element().enterOrValidateText(getCP_FloodCoverage_TXT_ExtraExpenseLimit(strCP_FloodCoverage_TXT_ExtraExpenseLimit),strCP_FloodCoverage_TXT_ExtraExpenseLimit,test);
			se.element().enterOrValidateText(getCP_FloodCoverage_TXT_ExtraExpensePremium(strCP_FloodCoverage_TXT_ExtraExpensePremium),strCP_FloodCoverage_TXT_ExtraExpensePremium,test);
			se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_SpecialClass(strCP_FloodCoverage_CHK_SpecialClass),strCP_FloodCoverage_CHK_SpecialClass,test);
			se.element().enterOrValidateText(getCP_FloodCoverage_TXT_SpecialClassLimit(strCP_FloodCoverage_TXT_SpecialClassLimit),strCP_FloodCoverage_TXT_SpecialClassLimit,test);
			se.element().enterOrValidateText(getCP_FloodCoverage_TXT_SpecialClassPremium(strCP_FloodCoverage_TXT_SpecialClassPremium),strCP_FloodCoverage_TXT_SpecialClassPremium,test);
			se.element().enterOrValidateText(getCP_FloodCoverage_TXT_SeparateTotalFLoodLimit(strCP_FloodCoverage_TXT_SeparateTotalFLoodLimit),strCP_FloodCoverage_TXT_SeparateTotalFLoodLimit,test);
			se.element().enterOrValidateText(getCP_FloodCoverage_TXT_SeparateTotalPremium(strCP_FloodCoverage_TXT_SeparateTotalPremium),strCP_FloodCoverage_TXT_SeparateTotalPremium,test);
			se.element().enterOrValidateText(getCP_FloodCoverage_TXT_BlanketNumber(strCP_FloodCoverage_TXT_BlanketNumber),strCP_FloodCoverage_TXT_BlanketNumber,test);
			se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_Blanket_Building(strCP_FloodCoverage_CHK_Blanket_Building), strCP_FloodCoverage_CHK_Blanket_Building, test);
			se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_Blanket_PerProp(strCP_FloodCoverage_CHK_Blanket_PerProp), strCP_FloodCoverage_CHK_Blanket_PerProp, test);
			se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_Blanket_BusinessIncome(strCP_FloodCoverage_CHK_Blanket_BusinessIncome), strCP_FloodCoverage_CHK_Blanket_BusinessIncome, test);
			se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_Blanket_ExtraExpense(strCP_FloodCoverage_CHK_Blanket_ExtraExpense), strCP_FloodCoverage_CHK_Blanket_ExtraExpense, test);
			se.element().checkUncheckOrValidate(getCP_FloodCoverage_CHK_Blanket_SpecialClass(strCP_FloodCoverage_CHK_Blanket_SpecialClass), strCP_FloodCoverage_CHK_Blanket_SpecialClass, test);			
			se.element().enterOrValidateText(getCP_FloodCoverage_TXT_BlanketLimit(strCP_FloodCoverage_TXT_BlanketLimit),strCP_FloodCoverage_TXT_BlanketLimit,test);
			se.element().enterOrValidateText(getCP_FloodCoverage_TXT_BlanketTotalPremium(strCP_FloodCoverage_TXT_BlanketTotalPremium),strCP_FloodCoverage_TXT_BlanketTotalPremium,test);
	
			se.element().Click(getNext(),test);
			se.util().sleep(1000);
			
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_FloodDefaultCoverageDetails", true, false, true, test);
				
		}
	}	
}
