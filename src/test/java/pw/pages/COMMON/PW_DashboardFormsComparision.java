package pw.pages.COMMON;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_WC;

public class PW_DashboardFormsComparision extends OR_WC {

	public void Dashboard_FormsComparision(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase("Dashboard_Forms")) {
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("Dashboard_Forms", strRegressionID, transaction);
		
		int iteration = 0;
		List<String> actFormsList = new LinkedList<>();
		List<String> expFormsList = new LinkedList<>();
		
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
			String strExpFormfromExcel = (String) row.get("Dashboard_Forms_Validate_Forms");
			String strDashboardStatus = (String) row.get("Dashboard_LBL_Status");
			
			try {
				se.util().sleep(30000);
				SwitchToDefaultAndThenSwitchToFrame();
				se.util().sleep(30000);
				se.element().waitForElementIsDisplayed(Dashboard_TAB_Forms, 2000);
				se.element().Click(getTabForms(), test);
				se.verify().verifyEquals("DashboardForms Table ", getDashboard_TBL_Forms().isDisplayed(),true, true, test);
				se.util().sleep(60000);
				List<WebElement> actFormRowCount = se.driver().findElements(By.xpath("//*[@id='getFormsListReportContent']/table/tbody/tr"));
					
				String formsListfromExcel[] = strExpFormfromExcel.split("\\r?\\n");
					
				for (String formFromExcel : formsListfromExcel){
					expFormsList.add(formFromExcel);
				}
					
				// We are starting from row 4 as the form table has 2 blank rows and 1 header row. So starting from 4 would give us the value of first form.
					
				for (int i=4; i<=actFormRowCount.size(); i++){
					
					int j = 1;
					
					String strActFormNo = se.driver().findElement(By.xpath(".//*[@id='getFormsListReportContent']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
					String strActFormNm = se.driver().findElement(By.xpath(".//*[@id='getFormsListReportContent']/table/tbody/tr["+i+"]/td["+(j+1)+"]")).getText();
					String strActForm = strActFormNo+"||"+strActFormNm;
					actFormsList.add(strActForm);
					j++;
				}
					
				se.verify().verifyAsPassOrError("Actual and Expected form Count",actFormsList.size(), expFormsList.size(), true, test);
				if(actFormsList.equals(expFormsList)) {
					se.verify().verifyAsPassOrError("Actual and Expected forms list matches", actFormsList.equals(expFormsList), true, true, test);
				} else{
					se.verify().verifyAsPassOrError("Actual and Expected forms mismatch", actFormsList.equals(expFormsList), true, true, test);
					actFormsList.removeAll(expFormsList);
					String missingFormsList = actFormsList.toString();
					test.log(LogStatus.ERROR, "<b style='color:Orange;'>Forms Mismatch List </b>","<b style= 'color:Orange;'>"+missingFormsList+"</b>" );	
				}
						
			} catch (Exception e) {
				se.verify().verifyEquals("Failed to Validate the form list", true, false, true, test);
			}
			iteration++;
		}

	} 
	
	public void SwitchToDefaultAndThenSwitchToFrame() throws IOException {
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(getDashboard_Iframe_TitlesReportFrame());
		} catch (Exception e) {
			se.log().logTestStep("Failed at SwitchToDefaultAndThenSwitchToFrame - " + e);

		}

	}


}
