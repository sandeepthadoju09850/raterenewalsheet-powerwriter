package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class CP_ElectronicCommerce  extends OR_CP  {
	 public void ElectronicCommerce(String strRegressionID, String transaction, ExtentTest test) throws IOException {	
		 try{
		 List<Map<String, String>> table = ExcelOperations.getPagesData("CP_ElectronicCommerce", strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

		  String strCP_ElectCommerce_TXT_ProvisionName = (String) row.get("CP_ElectCommerce_TXT_ProvisionName");
		  String strCP_ElectCommerce_TXT_FormNumber = (String) row.get("CP_ElectCommerce_TXT_FormNumber");
		  String strCP_ElectCommerce_TXT_Coverage = (String) row.get("CP_ElectCommerce_TXT_Coverage");
		  String strCP_ElectCommerce_TXT_DescriptionofBusiness = (String) row.get("CP_ElectCommerce_TXT_DescriptionofBusiness");
		  String strCP_ElectCommerce_TXT_LocationofBusiness = (String) row.get("CP_ElectCommerce_TXT_LocationofBusiness");
		  String strCP_ElectCommerce_TXT_AnnAggLimitofInsurance = (String) row.get("CP_ElectCommerce_TXT_AnnAggLimitofInsurance");
		  String strCP_ElectCommerce_TXT_SectionIDedAmount = (String) row.get("CP_ElectCommerce_TXT_SectionIDedAmount");
		  String strTransaction = (String) row.get("Transaction");
		try{
			se.log().logTestStep("CP_ElectronicCommerce");
			test.log(LogStatus.INFO, "CP_ElectronicCommerce","Transaction Step : "+ strTransaction + "<br>" +"Page : CP_ElectronicCommerce"  + "<br>" +"Section: CP_ElectronicCommerce");
			se.util().sleep(1000);
			se.verify().verifyEquals("CP_ElectronicCommerce of PowerWriter ", getCP_VerifyElectronicCommerceText().isDisplayed(),true, true,test);
			se.element().enterOrValidateText(getCP_ElectCommerce_TXT_ProvisionName(strCP_ElectCommerce_TXT_ProvisionName),strCP_ElectCommerce_TXT_ProvisionName,test);
			se.element().enterOrValidateText(getCP_ElectCommerce_TXT_FormNumber(strCP_ElectCommerce_TXT_FormNumber),strCP_ElectCommerce_TXT_FormNumber,test);
			se.element().enterOrValidateText(getCP_ElectCommerce_TXT_Coverage(strCP_ElectCommerce_TXT_Coverage),strCP_ElectCommerce_TXT_Coverage,test);
			se.element().enterOrValidateText(getCP_ElectCommerce_TXT_DescriptionofBusiness(strCP_ElectCommerce_TXT_DescriptionofBusiness),strCP_ElectCommerce_TXT_DescriptionofBusiness,test);
			se.element().enterOrValidateText(getCP_ElectCommerce_TXT_LocationofBusiness(strCP_ElectCommerce_TXT_LocationofBusiness),strCP_ElectCommerce_TXT_LocationofBusiness,test);
			se.element().selectPopupWithMagnifier(getCP_ElectCommerce_TXT_AnnAggLimitofInsurance(strCP_ElectCommerce_TXT_AnnAggLimitofInsurance), getCP_ElectCommerce_BTN_AnnAggLimitofInsurance_Search(strCP_ElectCommerce_TXT_AnnAggLimitofInsurance), strCP_ElectCommerce_TXT_AnnAggLimitofInsurance, constants.NA, strCP_ElectCommerce_TXT_AnnAggLimitofInsurance, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCP_ElectCommerce_TXT_SectionIDedAmount(strCP_ElectCommerce_TXT_SectionIDedAmount),strCP_ElectCommerce_TXT_SectionIDedAmount,test);

			se.element().Click(getNext(),test);
			se.util().sleep(1000);
			
		}catch(Exception e){ 
			se.verify().verifyEquals("Failed to fill in details for CP_ElectronicCommerce", true, false, true, test);
			
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
