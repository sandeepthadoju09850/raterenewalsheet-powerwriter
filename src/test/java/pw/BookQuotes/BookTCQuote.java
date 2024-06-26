package pw.BookQuotes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import rrs.OR.OR_RRS_MainScreen;
import rrs.pages.MainScreen.PWValidations;

public class BookTCQuote extends OR_RRS_MainScreen{

	

	String total ="";
	String path ="";
	public static String policyNumberPackage="";
	public static String policyNumberCA="";
	public static String policyNumberWC="";
	public static String policyNumberUM="";
	public void PWBookQuote(String strRegressionID, String transaction, String quote, String LOB,String ConvertToPolicy,String BookPolicy,ExtentTest test) throws IOException {
		try{
			PWValidations PWValidationsPage = TestPageFactory.initElements(se, PWValidations.class);
			
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.RRS)){
			 test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
			
			
			
			try{
				se.log().logTestStep("Navigated to PW Home screen");
				test.log(LogStatus.INFO, "Navigated to PW Home screen","Transaction Step : "+ transaction + "<br>" +"Page : Rate Renewal Sheet");

				
				
				
				se.element().switchToFrame(getPW_Frm_FrameSearch());
				se.element().enterOrValidateText(getPW_TXT_Search(quote),quote,test);
				se.element().Click(getPW_Btn_Search(),test);				
				se.element().Click(getPW_Btn_SearchResultD(quote,LOB),test);												
				driver.switchTo().defaultContent();
				se.util().sleep(2000);
				
				if (transaction.equals("BPNewQuote")) {
					se.element().switchToFrame(getPW_Frm_QuoteDetails());
					se.util().sleep(2000);
					se.element().Click(getPW_LNK_PolicyNumOne(), test);
					se.util().sleep(2000);
					driver.switchTo().defaultContent();
					se.util().sleep(2000);
				}
				
				if(ConvertToPolicy.equals("Yes")){					
										
					se.element().switchToFrame(getPW_Frm_QuoteDetails());
					se.element().waitUntiltextIsDisplayed(getPW_Btn_ConvertToPolicy(), "Convert to Policy");
					se.element().waitUntiltextIsDisplayed(getPW_Btn_ConvertToPolicy(), "Convert to Policy");
					se.element().Click(getPW_Btn_ConvertToPolicy(), test);
					Thread.sleep(60000);
					driver.switchTo().defaultContent();
					se.util().sleep(3000);
					se.element().Click(getcommon_BTN_completetranx(), test);
					se.util().sleep(10000);
				}

					if (BookPolicy.equals("Yes")) {
						se.element().switchToFrame(getPW_Frm_QuoteDetails());
						se.element().waitUntiltextIsDisplayed(getPW_Btn_Book(), "Book");
						se.element().waitUntiltextIsDisplayed(getPW_Btn_Book(), "Book");
						se.element().waitUntiltextIsDisplayed(getPW_Btn_Book(), "Book");
						se.element().waitUntiltextIsDisplayed(getPW_Btn_Book(), "Book");
						
						se.element().Click(getPW_Btn_Book(), test);
						Thread.sleep(60000);
						driver.switchTo().defaultContent();
					}
				
				
			} catch(Exception e){
				se.verify().verifyEquals("Failed to get details for PW Home Page ", true, false, true, test);
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
