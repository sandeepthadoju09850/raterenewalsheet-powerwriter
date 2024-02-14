package pw.pages.WC;
/**
* @author ${sh09475}
*/
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_WC;

public class WC_OptionalEndorsements extends OR_WC {
public void OptionalEndorsements(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			
		    if(suspendSheet.equalsIgnoreCase(constants.WCOptionalEndorsements)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.WCOptionalEndorsements, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
				String strOptionalEndorsements_CHK_PartnersOfficersAndOthersExcEndoWC00308 = (String) row.get("OptionalEndorsements_CHK_PartnersOfficersAndOthersExcEndoWC00308");
				String strOptionalEndorsements_CHK_SolePropPartnersOfficersAndOthersCovEndoWC000310 = (String) row.get("OptionalEndorsements_CHK_SolePropPartnersOfficersAndOthersCovEndoWC000310");

				try
				{
					se.log().logSeStep("WC_OptionalEndorsements");
					test.log(LogStatus.INFO, "WC_OptionalEndorsements","Transaction Step : "+ transaction + "<br>" +"Page : WCOptionalEndorsements");
					se.verify().verifyEquals("WC_OptionalEndorsements page of PowerWriter ", getOptionalEndorsements_TXT_LabelName().isDisplayed(),true, true,test);
	
					se.element().checkUncheckOrValidate(getOptionalEndorsements_CHK_PartnersOfficersAndOthersExcEndoWC00308(strOptionalEndorsements_CHK_PartnersOfficersAndOthersExcEndoWC00308),strOptionalEndorsements_CHK_PartnersOfficersAndOthersExcEndoWC00308,test);
					se.element().checkUncheckOrValidate(getOptionalEndorsements_CHK_SolePropPartnersOfficersAndOthersCovEndoWC000310(strOptionalEndorsements_CHK_SolePropPartnersOfficersAndOthersCovEndoWC000310),strOptionalEndorsements_CHK_SolePropPartnersOfficersAndOthersCovEndoWC000310,test);
					se.element().Click(getNext(),test);
					
				}catch(Exception e) {
					se.verify().verifyEquals("Failed to fill in details for WC_OptionalEndorsements", true, false, true, test);
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
