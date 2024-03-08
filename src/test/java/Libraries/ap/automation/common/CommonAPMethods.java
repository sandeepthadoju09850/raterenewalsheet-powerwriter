package Libraries.ap.automation.common;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;

import ap.OR.OR_CP;

public class CommonAPMethods extends OR_CP {
	
	public static String PN;
	public static Boolean flag;


public void NavigateToTabs(String Page, ExtentTest test) throws IOException 
{	
	se.util().sleep(2000);
	se.element().MovetoElement(getNavigatetoPage(Page), test);
	se.element().Click(getNavigatetoPage(Page), test);
	se.element().waitForElementToDisappear_One(progressBar,120);
} 
public void ClickContinue(ExtentTest test) throws IOException 
{	
	se.util().sleep(2000);
	se.element().Click(getGI_CHK_Continue(), test);
} 
public void MoveAndClickContinue(ExtentTest test) throws IOException 
{	
	se.util().sleep(2000);
	JavascriptExecutor executor = (JavascriptExecutor) se.driver();
	executor.executeScript("arguments[0].scrollIntoView(0,500);", getPI_CHK_Continue());
	//se.element().MovetoElement(getGI_CHK_Continue(), test);
	se.element().Click(getPI_CHK_Continue(), test);
} 
public void NavigateToSummaryTabs(String Page, ExtentTest test) throws IOException 
{	
	
	//se.element().Click(getNavigatetoSummaryPage(Page));
}
public String getquotenumber(ExtentTest test)
{
	String jobTitle = se.element().getText(quotehomepage);
	String splitJobTitle[] = jobTitle.split(":");
	String QuoteNumber = splitJobTitle[0].trim();

	
	System.out.println(QuoteNumber);
	return QuoteNumber; 
}



}




