package pw.pages.CA;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CA;
import pw.OR.OR_CP;
import pw.OR.OR_GL;


/**
* @author ${ro09528}
*/
public class CA_Year2000Endorsements extends OR_CA{
	
	public void Year2000Endorsements(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		//String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(suspendSheet.equalsIgnoreCase(constants.CA_Year2000Endorsements)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_Year2000Endorsements, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strYear2000Endorsements_CHK_EndorsmentType_Exclusions = (String) row.get("Year2000Endorsements_CHK_EndorsmentType_Exclusions");
			String strYear2000Endorsements_CHK_EndorsmentType_LimitedCoverage = (String) row.get("Year2000Endorsements_CHK_EndorsmentType_LimitedCoverage");
			String strYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblems = (String) row.get("Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblems");
			String strYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsProductsWorkYouPerformed = (String) row.get("Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsProductsWorkYouPerformed");
			String strYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsWithExceptionForBodilyInjuryOnYourPremises = (String) row.get("Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsWithExceptionForBodilyInjuryOnYourPremises");
			String strYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsExclusionOfSpecifiedCovForDesgLocProdServicesOrWork = (String) row.get("Year2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsExclusionOfSpecifiedCovForDesgLocProdServicesOrWork");

		try{
			se.log().logTestStep("CA_Year2000Endorsements");
			test.log(LogStatus.INFO, "CA_Year2000Endorsements page","Transaction Step : "+transaction + "<br>" +"Page : CA_Year2000Endorsements");
			se.verify().verifyEquals("CA_Year2000Endorsements Page of PowerWriter ", getYear2000Endorsements().isDisplayed(),true, true,test);
			
			se.element().checkUncheckOrValidate(getYear2000Endorsements_CHK_EndorsmentType_Exclusions(strYear2000Endorsements_CHK_EndorsmentType_Exclusions),strYear2000Endorsements_CHK_EndorsmentType_Exclusions,test);
			se.element().checkUncheckOrValidate(getYear2000Endorsements_CHK_EndorsmentType_LimitedCoverage(strYear2000Endorsements_CHK_EndorsmentType_LimitedCoverage),strYear2000Endorsements_CHK_EndorsmentType_LimitedCoverage,test);
			se.element().checkUncheckOrValidate(getYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblems(strYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblems),strYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblems,test);
			se.element().checkUncheckOrValidate(getYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsProductsWorkYouPerformed(strYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsProductsWorkYouPerformed),strYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsProductsWorkYouPerformed,test);
			se.element().checkUncheckOrValidate(getYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsWithExceptionForBodilyInjuryOnYourPremises(strYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsWithExceptionForBodilyInjuryOnYourPremises),strYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsWithExceptionForBodilyInjuryOnYourPremises,test);
			se.element().checkUncheckOrValidate(getYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsExclusionOfSpecifiedCovForDesgLocProdServicesOrWork(strYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsExclusionOfSpecifiedCovForDesgLocProdServicesOrWork),strYear2000Endorsements_CHK_ExclusionYear2000ComputerRelatedAndOtherElectronicProblemsExclusionOfSpecifiedCovForDesgLocProdServicesOrWork,test);
			se.element().clickElement(getNext());
			se.element().clickElement(getNext());
			
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_Year2000Endorsements ", true, false, true, test);			
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