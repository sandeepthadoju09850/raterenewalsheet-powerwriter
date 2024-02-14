package pw.pages.WC;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_WC;

public class WC_WorkersCompensation extends OR_WC {
public void WorkersCompensation(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			    if(suspendSheet.equalsIgnoreCase(constants.WC_WorkersCompensation)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.WC_WorkersCompensation, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
				String strWorkersCompensation_TXT_Coverage = (String) row.get("WorkersCompensation_TXT_Coverage");
				String strWorkersCompensation_TXT_EachAccidentLimit = (String) row.get("WorkersCompensation_TXT_EachAccidentLimit");
				String strWorkersCompensation_TXT_EachAccidentLimitFilterNeeded = (String) row.get("WorkersCompensation_TXT_EachAccidentLimitFilterNeeded");
				String strWorkersCompensation_TXT_BodilyInjuryByDiseaseEmpLimitOption = (String) row.get("WorkersCompensation_TXT_BodilyInjuryByDiseaseEmpLimitOption");
				String strWorkersCompensation_TXT_BodilyInjuryByDiseasePolicyLimitOption = (String) row.get("WorkersCompensation_TXT_BodilyInjuryByDiseasePolicyLimitOption");
				String strWorkersCompensation_TXT_BodilyInjuryByDiseaseEmpLimit = (String) row.get("WorkersCompensation_TXT_BodilyInjuryByDiseaseEmpLimit");
				String strWorkersCompensation_TXT_BodilyInjuryByDiseasePolicyLimit = (String) row.get("WorkersCompensation_TXT_BodilyInjuryByDiseasePolicyLimit");
				String strWorkersCompensation_TXT_NCCIBureauRiskID = (String) row.get("WorkersCompensation_TXT_NCCIBureauRiskID");
				String strWorkersCompensation_TXT_ExperienceRatingDescription = (String) row.get("WorkersCompensation_TXT_ExperienceRatingDescription");
				String strWorkersCompensation_TXT_ExperienceRatingDescriptionFilterNeeded = (String) row.get("WorkersCompensation_TXT_ExperienceRatingDescriptionFilterNeeded");
				String strWorkersCompensation_TXT_NCCICarrierCode = (String) row.get("WorkersCompensation_TXT_NCCICarrierCode");
				String strWorkersCompensation_TXT_DividendPlan = (String) row.get("WorkersCompensation_TXT_DividendPlan");
				String strWorkersCompensation_TXT_DividendPlanFilterNeeded = (String) row.get("WorkersCompensation_TXT_DividendPlanFilterNeeded");
				String strWorkersCompensation_TXT_DividendPercentage = (String) row.get("WorkersCompensation_TXT_DividendPercentage");
				String strWorkersCompensation_TXT_State = (String) row.get("WorkersCompensation_TXT_State");
				String strWorkersCompensation_DDN_PrimaryStateOption = (String) row.get("WorkersCompensation_DDN_PrimaryStateOption");
				String strWorkersCompensation_DDN_HazardGrade = (String) row.get("WorkersCompensation_DDN_HazardGrade");
				String strWorkersCompensation_CHK_AdmiraltyLaw_FELAEmployerLiab = (String) row.get("WorkersCompensation_CHK_AdmiraltyLaw_FELAEmployerLiab");
				String strWorkersCompensation_TXT_BodilyInjuryByAccidentLim = (String) row.get("WorkersCompensation_TXT_BodilyInjuryByAccidentLim");
				String strWorkersCompensation_TXT_BodilyInjuryByDiseaseLim = (String) row.get("WorkersCompensation_TXT_BodilyInjuryByDiseaseLim");
				try
				{
					test.log(LogStatus.INFO, "Locations","Transaction Step : "+ transaction + "<br>" +"Page : WorkersCompensation");
					se.log().logSeStep("Selecting WorkersCompensation ");
					se.verify().verifyEquals("WorkersCompensation page of PowerWriter ", getWorkersCompensation_TXT_EachAccidentLimitLabel().isDisplayed(),true, true,test);
	
					se.element().enterOrValidateText(getWorkersCompensation_TXT_Coverage(strWorkersCompensation_TXT_Coverage),strWorkersCompensation_TXT_Coverage,test);

					se.element().selectPopupWithMagnifier(getWorkersCompensation_TXT_EachAccidentLimit(strWorkersCompensation_TXT_EachAccidentLimit),getWorkersCompensation_TXT_EachAccidentLimitSearch(strWorkersCompensation_TXT_EachAccidentLimit),strWorkersCompensation_TXT_EachAccidentLimit,strWorkersCompensation_TXT_EachAccidentLimitFilterNeeded,strWorkersCompensation_TXT_EachAccidentLimit, strWorkersCompensation_TXT_BodilyInjuryByDiseaseEmpLimitOption,strWorkersCompensation_TXT_BodilyInjuryByDiseasePolicyLimitOption,constants.NA,test);
					se.element().enterOrValidateText(getWorkersCompensation_TXT_BodilyInjuryByDiseaseEmpLimit(strWorkersCompensation_TXT_BodilyInjuryByDiseaseEmpLimit),strWorkersCompensation_TXT_BodilyInjuryByDiseaseEmpLimit,test);
					se.element().enterOrValidateText(getWorkersCompensation_TXT_BodilyInjuryByDiseasePolicyLimit(strWorkersCompensation_TXT_BodilyInjuryByDiseasePolicyLimit),strWorkersCompensation_TXT_BodilyInjuryByDiseasePolicyLimit,test);
					se.element().enterOrValidateText(getWorkersCompensation_TXT_NCCIBureauRiskID(strWorkersCompensation_TXT_NCCIBureauRiskID),strWorkersCompensation_TXT_NCCIBureauRiskID,test);
					se.element().selectPopupWithMagnifier(getWorkersCompensation_TXT_ExperienceRatingDescription(strWorkersCompensation_TXT_ExperienceRatingDescription),getWorkersCompensation_TXT_ExperienceRatingDescriptionSearch(strWorkersCompensation_TXT_ExperienceRatingDescription),strWorkersCompensation_TXT_ExperienceRatingDescription,strWorkersCompensation_TXT_ExperienceRatingDescriptionFilterNeeded,strWorkersCompensation_TXT_ExperienceRatingDescription, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getWorkersCompensation_TXT_NCCICarrierCode(strWorkersCompensation_TXT_NCCICarrierCode),strWorkersCompensation_TXT_NCCICarrierCode,test);
					if (!strWorkersCompensation_DDN_PrimaryStateOption.equalsIgnoreCase(constants.NA)
							&& !strWorkersCompensation_DDN_PrimaryStateOption.contains(constants.Validate)) {
						se.element().Click(getWorkersCompensation_DDN_PrimaryState(), test);
						se.element().Click(getWorkersCompensation_DDN_PrimaryStateOption(strWorkersCompensation_DDN_PrimaryStateOption), test);
					}
					se.element().selectPopupWithMagnifier(getWorkersCompensation_TXT_DividendPlan(strWorkersCompensation_TXT_DividendPlan),getWorkersCompensation_TXT_DividendPlanSearch(strWorkersCompensation_TXT_DividendPlan),strWorkersCompensation_TXT_DividendPlan,strWorkersCompensation_TXT_DividendPlanFilterNeeded,strWorkersCompensation_TXT_DividendPlan, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getWorkersCompensation_TXT_DividendPercentage(strWorkersCompensation_TXT_DividendPercentage),strWorkersCompensation_TXT_DividendPercentage,test);
					se.element().enterOrValidateText(getWorkersCompensation_TXT_State(strWorkersCompensation_TXT_State),strWorkersCompensation_TXT_State,test);
					//se.element().Click(getWorkersCompensation_DDN_PrimaryState(strWorkersCompensation_DDN_PrimaryState),strWorkersCompensation_DDN_PrimaryState,test);
					se.element().Click(getWorkersCompensation_DDN_HazardGrade(strWorkersCompensation_DDN_HazardGrade),strWorkersCompensation_DDN_HazardGrade,test);
					se.element().checkUncheckOrValidate(getWorkersCompensation_CHK_AdmiraltyLaw_FELAEmployerLiab(strWorkersCompensation_CHK_AdmiraltyLaw_FELAEmployerLiab),strWorkersCompensation_CHK_AdmiraltyLaw_FELAEmployerLiab,test);
					se.element().enterOrValidateText(getWorkersCompensation_TXT_BodilyInjuryByAccidentLim(strWorkersCompensation_TXT_BodilyInjuryByAccidentLim),strWorkersCompensation_TXT_BodilyInjuryByAccidentLim,test);
					se.element().selectPopupWithMagnifier(getWorkersCompensation_TXT_BodilyInjuryByAccidentLim(strWorkersCompensation_TXT_BodilyInjuryByAccidentLim),getWorkersCompensation_TXT_BodilyInjuryByAccidentLimSearch(strWorkersCompensation_TXT_BodilyInjuryByAccidentLim),strWorkersCompensation_TXT_BodilyInjuryByAccidentLim,constants.NA,strWorkersCompensation_TXT_BodilyInjuryByAccidentLim, constants.NA, constants.NA,constants.NA,test);
					se.element().clickElement(getNext());
										
				}catch(Exception e) {
					
					se.verify().verifyEquals("Failed to fill in details for WC_WorkersCompensation", true, false, true, test);
							
					
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
