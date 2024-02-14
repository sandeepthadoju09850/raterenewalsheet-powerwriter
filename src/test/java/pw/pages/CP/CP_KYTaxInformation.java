package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_CP;

public class CP_KYTaxInformation  extends OR_CP {
	public void CP_KYTaxInformationpage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		List<Map<String, String>> table = ExcelOperations.getPagesData("KYTaxExemption", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCharitableOrgList = (String) row.get("CharitableOrgList");
		String strTestDescription = (String) row.get("TestDescription");
		try {
			se.log().logTestStep("KYTaxInformation");
			test.log(LogStatus.INFO, "KYTaxInformation page","Transaction Step : "+strTestDescription + "<br>" +"Page : CP_KYTaxInformationpage");
			/*se.element().enterText(getKYTaxInfoTxtCharitableOrgList(), strCharitableOrgList, test);*/
			se.element().Click(getKYTaxinfodropdown(),test);
			se.util().sleep(1000);
			se.element().Click(getKYTaxInfoTxtCharitableOrgList(strCharitableOrgList),test);
			se.element().Click(getNext(),"Next", test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_KYTaxInformation page", true, false, true, test);
			
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
