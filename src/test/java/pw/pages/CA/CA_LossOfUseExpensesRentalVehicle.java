package pw.pages.CA;
/**
 * @author ${is09492}
 */
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_CA;

public class CA_LossOfUseExpensesRentalVehicle extends OR_CA{

	public void LossOfUseExpensesRentalVehicle(String strRegressionID, String transaction,  ExtentTest test) throws IOException {
		
		try{
			
			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		    if(SuspendSheet.equalsIgnoreCase("LossOfUseExpensesRentalVehicle")){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
		         testTearDown(se, test);
		    }
			List<Map<String, String>> table = ExcelOperations.getPagesData("LossOfUseExpenses-RentalVehicle", strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

				String strLossOfUseExpenses_TXT_AmtPerDay = (String) row.get("LossOfUseExpenses_TXT_AmtPerDay");
				String strLossOfUseExpenses_TXT_MaxLimit = (String) row.get("LossOfUseExpenses_TXT_MaxLimit");
				
				try {
				se.log().logTestStep("CA_LossOfUseExpensesRentalVehicle");
				test.log(LogStatus.INFO, "CA_LossOfUseExpensesRentalVehicle page","Transaction Step : "+transaction + "<br>" +"Page : CA_LossOfUseExpensesRentalVehicle");
				se.verify().verifyEquals("CA_LossOfUseExpensesRentalVehicle Details  of PowerWriter ", getLossOfUseExpenses_BTN_Label().isDisplayed(),true, true,test);
				
				se.element().enterOrValidateText(getLossOfUseExpenses_TXT_AmtPerDay(strLossOfUseExpenses_TXT_AmtPerDay),strLossOfUseExpenses_TXT_AmtPerDay,test);
				se.element().enterOrValidateText(getLossOfUseExpenses_TXT_MaxLimit(strLossOfUseExpenses_TXT_MaxLimit),strLossOfUseExpenses_TXT_MaxLimit,test);

			}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CA_LossOfUseExpensesRentalVehicle ", true, false, true, test);
				
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

			
			
