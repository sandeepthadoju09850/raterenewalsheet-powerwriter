package Libraries.ap.automation.common.framework;

//com.secura.automation.repository.OR_CP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.SeHelper;
import ap.Constants.constants;
import ap.OR.OR_CP;

/**
 * Element wrapper class. Contains all things WebElement related. Each method
 * that does something must call se.log().logSeStep
 *
 * 
 */
public class Element extends OR_CP{
	private SeHelper se;

	private int defaultTimeOut = 20;
	private int globalSeTimeOut = 20;

	private boolean inFrame = false;

	public Element(SeHelper se) {
		this.se = se;
	}

	/**
	 * Change the default timeout for the waits
	 *
	 * @param seconds
	 */
	public void setTimeOut(int seconds) {
		globalSeTimeOut = seconds;
	}

	/**
	 * Reset the timeout back to default
	 */
	public void resetTimeOut() {
		globalSeTimeOut = defaultTimeOut;
	}

	/**
	 * Gets the current setting for the timeout
	 *
	 * @return the current timeout setting
	 */
	public int getTimeOut() {
		return globalSeTimeOut;
	}

	/**
	 * Wait for an element, using the default timeout Element.globalSeTimeOut
	 *
	 * @param locator
	 * @return
	 */
	public boolean waitForElement(final By locator) {
		if(constants.Env.contains("dev")) {
		setTimeOut(40000);
		resetTimeOut();
		}
		return waitForElement(locator,globalSeTimeOut);
	}

	public boolean waitForElement(final By locator, String testData) {
		if(constants.Env.contains("dev")) {
			setTimeOut(40000);
			resetTimeOut();
			}
		return waitForElement(locator, globalSeTimeOut, testData);
	}

	public boolean waitForElement(final By locator, int timeOutInSeconds, String testData) {

		try {
			if (!testData.equalsIgnoreCase("N/A")) {
				new WebDriverWait(se.driver(), timeOutInSeconds).ignoring(RuntimeException.class)
				.until(new ExpectedCondition<WebElement>() {
					public WebElement apply(WebDriver d) {
						se.element().MovetoElement(d.findElement(locator));
						return d.findElement(locator);
					}
				});
			}
			return true;
		} catch (TimeoutException e) {
			se.log().logSeStep("Timed out waiting for element " + locator.toString());
			se.verify().reportError("Timed Out Waiting For Element");
			return false;
		} catch (Exception e) {
			String errorName = "Un-handled Exception in waitForElement: ";
			se.log().logSeStep(errorName + e + ": " + e.getMessage() + "at the element " + locator);
			return false;
		}
	}

	/**
	 * Wait for an element to be displayed, using the default timeout
	 * Element.globalSeTimeOut
	 *
	 * @param locator
	 * @return
	 */
	public boolean waitForElementIsDisplayed(final By locator) {
		return waitForElementIsDisplayed(locator, globalSeTimeOut);
	}

	/**
	 * Wait for an element to be displayed, using the default timeout
	 * Element.globalSeTimeOut
	 *
	 * @param element
	 * @return
	 */
	public boolean waitForElementIsDisplayed(WebElement element) {
		return waitForElementIsDisplayed(element, globalSeTimeOut);
	}

	/**
	 * Wait for an element, using specified timeout
	 *
	 * @param locator
	 * @param timeOutInSeconds
	 * @return
	 */
	public boolean waitForElement(final By locator, int timeOutInSeconds) {
		try {
			new WebDriverWait(se.driver(), timeOutInSeconds).ignoring(RuntimeException.class)
			.until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver d) {
					return d.findElement(locator);
				}
			});
			return true;
		} catch (TimeoutException e) {
			e.printStackTrace();
			se.log().logSeStep("Timed out waiting for element " + locator.toString());
			se.verify().reportError("Timed Out Waiting For Element");
			return false;
		} catch (Exception e) {
			String errorName = "Un-handled Exception in waitForElement: ";
			se.log().logSeStep(errorName + e + ": " + e.getMessage());
			return false;
		}

	}

	/**
	 * Wait for an element to be displayed, using specified timeout
	 *
	 * @param locator
	 * @param timeOutInSeconds
	 * @return
	 */
	public boolean waitForElementIsDisplayed(final By locator, int timeOutInSeconds) {
		try {
			(new WebDriverWait(se.driver(), timeOutInSeconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
			
			return true;
		} catch (TimeoutException e) {
			se.log().logSeStep("Timed out waiting for element " + locator.toString());
			se.verify().reportError("Timed Out Waiting For Element");
			return false;
		} catch (Exception e) {
			String errorName = "Un-handled Exception in waitForElement: ";
			se.log().logSeStep(errorName + e + ": " + e.getMessage());
			return false;
		}
	}
	
	public boolean waitUntiltextIsDisplayed(WebElement element, String expectedText) {
		try {
			boolean flag = true;
			block: {
				int count = 0;

				flag = true;
				while (flag) {

					if (element.getText().contains(expectedText)) {
						flag = true;
						break block;
					} else {
						se.util().sleep(20000);
						count++;
					}
					if (count == 30) {
						flag = false;
						break block;

					}

				}
			}
			return flag;
		} catch (TimeoutException e) {
			se.log().logSeStep(
					"Timed out waiting for text - " + expectedText + "Actual text is - " + element.getText());
			se.verify().reportError(
					"Timed out waiting for text - " + expectedText + "Actual text is - " + element.getText());
			return false;
		} catch (Exception e) {
			String errorName = "Un-handled Exception in waitForElement: ";
			se.log().logSeStep(errorName + e + ": " + e.getMessage());
			return false;
		}
	}

	/**
	 * Wait for an element to be displayed, using specified timeout
	 *
	 * @param element
	 * @param timeOutInSeconds
	 * @return
	 */
	public boolean waitForElementIsDisplayed(final WebElement element, int timeOutInSeconds) {
		try {
			
			new WebDriverWait(se.driver(), timeOutInSeconds).ignoring(RuntimeException.class)
			.until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver d) {
					return element.isDisplayed();
				}
			});
			return true;
		} catch (TimeoutException e) {
			se.log().logSeStep("Timed out waiting for element " + element.toString());
			se.verify().reportError("Timed Out Waiting For Element");
			return false;
		} catch (Exception e) {
			String errorName = "Un-handled Exception in waitForElement: ";
			se.log().logSeStep(errorName + e + ": " + e.getMessage());
			return false;
		}

	}

	/**
	 * Returns true if element exists
	 *
	 * @param locator
	 * @return
	 */
	public boolean exists(final By locator) {
		// se.log().logSeStep("Checking if Element exists: " +
		// locator.toString());
		se.driver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		try {
			se.driver().findElement(locator);
			return true;
		} catch (Exception e) {
			// swallow
			return false;
		}
	}

	public WebElement searchForElement(final By locator,String testdata) {
		return searchForElement(locator, testdata,globalSeTimeOut);
	}

	public WebElement searchForElement(final By locator) {
		return searchForElement(locator,globalSeTimeOut);
	}
	public void sleep(int ms)
	{
		try {
			se.driver().manage().timeouts().implicitlyWait(ms, TimeUnit.MILLISECONDS);
			System.out.println("implicitlyWait for the element");
			
		} catch (Exception e) {
		}
	}
	/**
	 * Search frames for an Element
	 *
	 * @param locator
	 * @return
	 */
	private WebElement searchForElement(final By locator,  String testdata,final int timeOutInSeconds) {

		if (waitForElement(locator, timeOutInSeconds,testdata)) {
			return getElement(locator,testdata);
		}
		return null;
	}

	private WebElement searchForElement(final By locator,  final int timeOutInSeconds) {

		if (waitForElement(locator, timeOutInSeconds)) {
			return getElement(locator);
		}
		return null;
	}
	public boolean waitForLoad(int timeOutInSeconds) {
		try {


			WebDriverWait wait = new WebDriverWait(se.driver(), timeOutInSeconds);


			((JavascriptExecutor)se.driver()).executeScript("return document.readyState").equals("complete");
			return true;
		}
		catch (Exception e) {
			e.getMessage();
		}
		return false;
	}


	/**
	 * Wait for an element such as a spinner or modal, to go away.
	 *
	 * @param locator
	 * @return true if element disappears within the timeout limit
	 */
	public boolean waitForElementToDisappear(final By locator, int timeoutSeconds) {
		boolean elementIsFound = true;
		int timeout = 0;
		// se.log().logSeStep("Waiting for element: " + locator.toString() + "
		// to disappear");
		do {
			try {
				WebElement element = se.driver().findElement(locator);
				if (element.isDisplayed() && element.isEnabled()) // &&
					// !element.getAttribute("style").contains("none")
				{
					se.util().sleep(5000);
					timeout++;
				} else
					elementIsFound = false;
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
				elementIsFound = false;
			}
		}
		while (elementIsFound && (timeout < timeoutSeconds));

		if (timeout == timeoutSeconds)
			se.log().logSeStep("Timed out in waitForElementToDisappear");
		return !elementIsFound;
	}

	public boolean waitForElementToDisappear_One(final By locator, int timeoutSeconds) {
		
		//int timeout = 0;
		// se.log().logSeStep("Waiting for element: " + locator.toString() + "
		// to disappear");

		try {

			(new WebDriverWait(se.driver(), timeoutSeconds)).until(ExpectedConditions.invisibilityOfElementLocated(locator));
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			return false;

		}
	}
public boolean waitForElementToDisappear_One(final By locator,String attribute,String value, int timeoutSeconds) {
		
		try {

			(new WebDriverWait(se.driver(), timeoutSeconds)).until(ExpectedConditions.attributeContains(locator, attribute, value));
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			return false;

		}
	}
	
		public boolean waitForElementToAppear_One(String dataVal,final By locator, int timeoutSeconds) {
			
			//int timeout = 0;
			// se.log().logSeStep("Waiting for element: " + locator.toString() + "
			// to disappear");

			try {
				if(dataVal.equalsIgnoreCase("N/A")) {
					return true;
				}else {
					(new WebDriverWait(se.driver(), timeoutSeconds)).until(ExpectedConditions.presenceOfElementLocated(locator));
					(new WebDriverWait(se.driver(), timeoutSeconds)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
					return true;
				}

				

			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
				return false;

			}



	}

	public boolean waitBasedOnCount(final By locator, int maxcount){
		
		try {

			int count=0;
			do{
				se.util().sleep(3000);
				if(count>=maxcount){
					break;
				}
				count++;
			}
			while (se.element().isElementPresent(locator));
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			return false;

		}
		
	}

	public boolean waitForElementtoSelect(WebElement element, int timeoutSeconds) {
		boolean elementIsFound = true;

		//int timeout = 0;
		// se.log().logSeStep("Waiting for element: " + locator.toString() + "
		// to disappear");

		try {

			(new WebDriverWait(se.driver(), timeoutSeconds)).until(ExpectedConditions.elementToBeSelected(element));
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			elementIsFound = false;

		}


		return elementIsFound;
	}
	
		boolean elementIsFound = true;
		public boolean waitForElementtoText(WebElement element, int timeoutSeconds,String text) {

		//int timeout = 0;
		// se.log().logSeStep("Waiting for element: " + locator.toString() + "
		// to disappear");

		try {

			(new WebDriverWait(se.driver(), timeoutSeconds)).until(ExpectedConditions.textToBePresentInElement(element, text));
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			elementIsFound = false;

		}


		return elementIsFound;
	}


	public boolean waitForElementToClickable(WebElement element, int timeoutSeconds) {
		boolean elementIsFound = true;
		//int timeout = 0;
		// se.log().logSeStep("Waiting for element: " + locator.toString() + "
		// to disappear");

		try {

			(new WebDriverWait(se.driver(), timeoutSeconds)).until(ExpectedConditions.elementToBeClickable(element));
			elementIsFound = true;
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			elementIsFound = false;

		}


		return elementIsFound;
	}
	
	public boolean waitForAlertPresent( int timeoutSeconds) {
		boolean elementIsFound = true;
		//int timeout = 0;
		// se.log().logSeStep("Waiting for element: " + locator.toString() + "
		// to disappear");

		try {

			(new WebDriverWait(se.driver(), timeoutSeconds)).until(ExpectedConditions.alertIsPresent());
			elementIsFound = true;
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			elementIsFound = false;

		}


		return elementIsFound;
	}
	public boolean waitForElementToChange(final By locator, int timeoutSeconds) {
		boolean elementIsFound = true;
		int timeout = 0;
		do {
			try {
				String element = se.driver().findElement(locator).getAttribute("value");
				if (element.equalsIgnoreCase("$0.00")) {
					se.util().sleep(1000);
					timeout++;
				} else
					elementIsFound = false;
			} catch (Exception e) {
				elementIsFound = false;
			}
		} while (elementIsFound && (timeout < timeoutSeconds));
		return !elementIsFound;
	}

	
	/**
	 * Wait for an element to be displayed, using specified timeout
	 *
	 * @param element
	 * @param timeOutInSeconds
	 * @return
	 */

	public void waitForElementLoading(WebElement we) {

		try {
			int i = 0;
			while (i < 10) {
				se.util().sleep(1000);
				se.element().waitForElementIsDisplayed(we);
				if (isElementPresent(we))
					break;

				i = i + 1;
			}

		} catch (Exception e) {
			System.out.println(
					"Not able to locate the element on the page OR the element did not load on the page in less than 10 seconds during the test run: "
							+ e.getMessage());
		}
	}

	public boolean enterText(WebElement element, String testdata) {
		// se.log().logSeStep("Enter Text '" + testdata + "' in Element: " +
		// element.toString());
		if (element != null && element.isDisplayed() && element.isEnabled()) {
			try {
				if ("input".equals(element.getTagName())) {
					element.sendKeys("");
				} else {
					new Actions(se.driver()).moveToElement(element).perform();
				}
				if (testdata.equals("N/A") || testdata.equals("NA")) {
					enterTAB(element);
				} else {
					element.clear();
					/*se.util().sleep(1000);
					try {
						se.util().sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}*/
					se.element().clearTheField(element);
					element.sendKeys(testdata);
					enterTAB(element);
				}

				return true;
			} catch (InvalidElementStateException e) {
				// se.log().logSeStep("Could not enter text in " +
				// element.toString() + ", element not visible or not enabled");
				// se.verify().reportError("Could not enter text, element not
				// visible or not enabled");
				return false;
			} catch (Exception e) {
				// se.log().logSeStep("Could not enter text in " +
				// element.toString());
				// se.verify().reportError("Could not enter text");
				return false;
			}
		} else
			return false;

	}

	

	public void refreshBrowser() {
		try {
			se.driver().navigate().refresh();
			//se.util().sleep(3000);

		} catch (Exception e) {
			String errorName = "Un-handled Exception in waitForElement: ";
			se.log().logSeStep(errorName + e + ": " + e.getMessage());
		}
	}

	
	public By lnk_home = By.partialLinkText("Contract Home");

	public WebElement getHome() {
		se.element().waitForElement(lnk_home);
		return se.element().getElement(lnk_home);
	}

	/**
	 * Finds and returns the element
	 *
	 * @param locator
	 * @return
	 */
	public WebElement getElement(final By locator) {
		try {
			return se.driver().findElement(locator);
		} catch (NoSuchElementException e) {
			String errorName = "NoSuchElementException Exception in getElement:";
			se.log().logSeStep(errorName + e.getMessage());
			se.log().logTcError(errorName, se.browser().takeScreenShot());
			return null;
		} catch (Exception e) {
			String errorName = "Un-handled Exception in getElement:";
			se.log().logSeStep(errorName + e.getMessage());
			se.log().logTcError(errorName, se.browser().takeScreenShot());
			return null;
		}
	}

	public WebElement getElement(final By locator, String testData) {
		if (!testData.equalsIgnoreCase("N/A")) {
			try {
				return se.driver().findElement(locator);
			} catch (NoSuchElementException e) {
				String errorName = "NoSuchElementException Exception in getElement:";
				se.log().logSeStep(errorName + e.getMessage());
				se.log().logTcError(errorName, se.browser().takeScreenShot());
				return null;
			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
				String errorName = "Un-handled Exception in getElement:";
				se.log().logSeStep(errorName + e.getMessage());
				se.log().logTcError(errorName, se.browser().takeScreenShot());
				return null;
			}
		} else {
			return null;
		}

	}
	public List<WebElement> getElements(final By locator, String testData) {
		if (!testData.equalsIgnoreCase("N/A")) {
			try {
				return se.driver().findElements(locator);
			} catch (NoSuchElementException e) {
				String errorName = "NoSuchElementException Exception in getElement:";
				se.log().logSeStep(errorName + e.getMessage());
				se.log().logTcError(errorName, se.browser().takeScreenShot());
				return null;
			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
				String errorName = "Un-handled Exception in getElement:";
				se.log().logSeStep(errorName + e.getMessage());
				se.log().logTcError(errorName, se.browser().takeScreenShot());
				return null;
			}
		} else {
			return null;
		}

	}
	/**
	 * Finds and returns a list of matching elements
	 *
	 * @param locator
	 * @return
	 */
	public List<WebElement> getElements(final By locator) {
		try {
			return se.driver().findElements(locator);
		} catch (Exception e) {
			String errorName = "Un-handled Exception in getElements:";
			se.log().logSeStep(errorName + e.getMessage());
			se.log().logTcError(errorName, se.browser().takeScreenShot());
			return new ArrayList<WebElement>();
		}
	}

	public boolean enterOrValidateText(WebElement element, String testdata, ExtentTest test) {
		try {
			if (!testdata.equalsIgnoreCase("N/A")) {
			
				if (testdata.contains("validate2")) {

					String[] strtestdata = testdata.split("=");
					String[] strActualTD = strtestdata[1].split("\\|");
					if (strActualTD[1].equalsIgnoreCase("E")) {
						verifyTextIsEnabled(element, strActualTD[0].trim(), test);
					}
					if (strActualTD[1].equalsIgnoreCase("D")) {
						verifyTextIsDisabled(element, strActualTD[0].trim(), test);

					}
				} else {

					enterText(element, testdata, test);
				}
				return true;
			}

			else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean enterText(WebElement element, String testdata, ExtentTest test) {
		// se.log().logSeStep("Enter Text '" + testdata + "' in Element: " +
		// element.toString());
		String str = element.toString();

		String[] arrOfStr = str.split("->", 2);
		if (!testdata.equalsIgnoreCase("N/A")) {	
			if (element != null && element.isDisplayed() && element.isEnabled()) {
				try {
					if ("input".equals(element.getTagName())) {
						element.sendKeys("");

					} else {
						new Actions(se.driver()).moveToElement(element).perform();
					}
					if (testdata.equals("N/A")) {
						enterTAB(element);
					} else {
						element.clear();

						//						try {
						//							se.element().waitForElement(element);
						//						} catch (InterruptedException e) {
						//							e.printStackTrace();
						//						}
						se.element().waitForElementToDisappear_One(progressBar,120);
						

						se.element().Click(element, test);
						se.element().clearTheField(element);
						//se.element().waitForElementToDisappear_One(progressBar, 5000);
						se.element().clearTheField(element);
						element.sendKeys(testdata);
						//se.element().waitForElementToDisappear_One(progressBar, 5000);
						se.element().Click(element, test);
						enterTAB(element);
						se.element().waitForElementToDisappear_One(progressBar,120);
						test.log(LogStatus.INFO, "Entering text in the field: " + arrOfStr[1],
								"Entered the text: " + testdata);
					}
					
					return true;

				} catch (InvalidElementStateException e) {
				
					test.log(LogStatus.WARNING, "Could not Enter text in the field: " + arrOfStr[1],
							"Could not Enter the text: " + testdata);
					return false;
				} catch (Exception e) {
					test.log(LogStatus.WARNING, "Could not Enter text in the field: " + arrOfStr[1],
							"Could not Enter the text: " + testdata);
					return false;
				}
			} else
				test.log(LogStatus.WARNING, "Could not Enter text in the field: " + arrOfStr[1],
						"Could not Enter the text: " + testdata);
				return false;
		} else
			test.log(LogStatus.WARNING, "Could not Enter text in the field: " + arrOfStr[1],
					"Could not Enter the text: " + testdata);
			return false;

	}

	public boolean enterText(WebElement element, String elementname, String testdata, ExtentTest test) {
		// se.log().logSeStep("Enter Text '" + testdata + "' in Element: " +
		// element.toString());
		if (!testdata.equalsIgnoreCase("N/A")) {
			if (element != null && element.isDisplayed() && element.isEnabled()) {
				try {
					if ("input".equals(element.getTagName())) {
						element.sendKeys("");

					} else {
						new Actions(se.driver()).moveToElement(element).perform();
					}
					if (testdata.equals("N/A")) {
						enterTAB(element);
					} else {
						element.clear();

						try {
							se.util().sleep(500);
						} catch (Exception e) {
							e.printStackTrace();
						}
						se.util().sleep(1000);

						element.sendKeys(testdata);
						enterTAB(element);
						/*se.element().waitForElementToDisappear(bluelineIndicator, 5000);
						se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);*/
						String str = element.toString();
						String[] arrOfStr = str.split("->", 2);
						test.log(LogStatus.INFO, "Entering text in the field: ",
								"Entered the text: " + testdata);
					}
					return true;

				} catch (InvalidElementStateException e) {
					// se.log().logSeStep("Could not enter text in " +
					// element.toString() + ", element not visible or not
					// enabled");
					// se.verify().reportError("Could not enter text, element
					// not
					// visible or not enabled");
					return false;
				} catch (Exception e) {
					// se.log().logSeStep("Could not enter text in " +
					// element.toString());
					// se.verify().reportError("Could not enter text");
					return false;
				}
			} else
				return false;
		} else
			return false;

	}

	public void enter_textRich(final WebElement element, String testdata, ExtentTest test) {
		try {
			WebDriverWait wait = new WebDriverWait(se.driver(), 30);
			wait.until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver driver) {

					if (element.isDisplayed() && element.isEnabled())
						return true;
					else
						return false;
				}
			});

			if ("input".equals(element.getTagName()) || "textarea".equals(element.getTagName())) {
				element.sendKeys("");
				wait.until(new ExpectedCondition<Boolean>() {
					public Boolean apply(WebDriver driver) {
						if (element.equals(driver.switchTo().activeElement()))
							return true;
						else
							return false;
					}
				});
				element.clear();
			} else {
				new Actions(se.driver()).moveToElement(element).perform();
			}
			element.sendKeys(testdata);
		} catch (Exception e) {

			se.log().logSeStep("An unexpected error " + e.getMessage()
			+ " occurred while executing updateCheckValue of the object ");
			e.printStackTrace();
		}

	}

	public void checkUncheckOrValidate(WebElement element, String testdata, ExtentTest test) {
		String str ="";

		String[] arrOfStr={"","Element not found",""};
		try {
			
			if (!testdata.equalsIgnoreCase("N/A")) {
				str= element.toString();
				arrOfStr = str.split("->", 2);
				if (testdata.contains("validate2")) {
					String[] strtestdata = testdata.split("=");
					String[] strActualTD = strtestdata[1].split("\\|");
					if (strActualTD[1].equalsIgnoreCase("E")) {
						VerifyCheckvalueIsEnabled(element, strActualTD[0].trim(), test);
					}
					if (strActualTD[1].equalsIgnoreCase("D")) {
						VerifyCheckvalueIsDisabled(element, strActualTD[0].trim(), test);
					}
				} else {
					checkvalue(element, testdata, test);
					test.log(LogStatus.INFO, "Check or Uncheck the field: " + arrOfStr[1],
							"TestData: " + testdata);
				}
				
			}
			
		} catch (Exception e) {
			test.log(LogStatus.WARNING, "Could not Check or Uncheck the field: " + arrOfStr[1],
					"TestData: " + testdata);
			se.log().logSeStep("An unexpected error " + e.getMessage()
			+ " occurred while executing updateCheckValue of the object ");
			e.printStackTrace();
		}

	}

	public void chkElement(WebElement Element, String testdata,ExtentTest test) {
		try{
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();
			
			if (testdata.equalsIgnoreCase("YES") || testdata.equalsIgnoreCase("NO")) {
				
				executor.executeScript("arguments[0].click();", Element);
				test.log(LogStatus.INFO,"Clicked on element - " ,Element.toString());	
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
			test.log(LogStatus.WARNING, "Could not Click on element - " ,Element.toString());
		}
		
	}
	
	public void checkvalue(WebElement element, String testdata, ExtentTest test) {
		try {

			if (!testdata.equals("N/A")) {
				String str = element.toString();
				String[] arrOfStr = str.split("->", 2);
				if (element.isDisplayed()) {
					boolean isChecked;
					try {
						if (element.getAttribute("checked") != null
								&& element.getAttribute("checked").equalsIgnoreCase("true")) {
							isChecked = true;
						} else {
							isChecked = false;
						}

					} catch (Exception e) {
						isChecked = false;
					}
					if (isChecked && testdata.equalsIgnoreCase("Check")) {
						se.log().logSeStep("Skipped: Element is already checked ");
						test.log(LogStatus.INFO, "Verifying the state of the CheckBox_Radiobutton : " + arrOfStr[1],
								"State of CheckBox_Radiobutton is Selected");
					} else if (!isChecked && testdata.equalsIgnoreCase("Check")) {
						new Actions(se.driver()).moveToElement(element).perform();
						//se.util().sleep(500);
						element.sendKeys(Keys.SPACE);
						se.element().waitForElementToDisappear_One(progressBar, 60);

						test.log(LogStatus.INFO, "Verifying the state of the CheckBox_Radiobutton : " ,
								"State of CheckBox_Radiobutton is Selected");
					} else if (!isChecked && testdata.equalsIgnoreCase("Uncheck")) {
						se.log().logSeStep("Skipped: Element is already unchecked ");
						test.log(LogStatus.INFO,
								"Verifying the state of the CheckBox_Radiobutton are not checked : " ,
								"State of CheckBox_Radiobutton is not Selected ");
					} else if (isChecked && testdata.equalsIgnoreCase("Uncheck")) {
						new Actions(se.driver()).moveToElement(element).perform();
						//se.util().sleep(500);
						element.sendKeys(Keys.SPACE);
						se.element().waitForElementToDisappear_One(progressBar, 60);

						test.log(LogStatus.INFO,
								"Verifying the state of the CheckBox_Radiobutton are not checked : " ,
								"State of CheckBox_Radiobutton is not Selected ");
					} else {

					}
				} else {

				}
			}

		} catch (Exception ex) {
			se.log().logSeStep("An unexpected error " + ex.getMessage()
			+ " occurred while executing updateCheckValue of the object ");
			ex.printStackTrace();
		}
	}

	public boolean enterTAB(WebElement element) {
		// se.log().logSeStep("Enter Text '" + testdata + "' in Element: " +
		// element.toString());
		if (element != null) {
			try {
				element.sendKeys(Keys.TAB);
				return true;
			} catch (InvalidElementStateException e) {
				// se.log().logSeStep("Could not enter text in " +
				// element.toString() + ", element not visible or not enabled");
				// se.verify().reportError("Could not enter text, element not
				// visible or not enabled");
				return false;
			} catch (Exception e) {
				// se.log().logSeStep("Could not enter text in " +
				// element.toString());
				// se.verify().reportError("Could not enter text");
				return false;
			}
		} else
			return false;

	}

	public boolean clearTheField(WebElement element) {

		if (element != null) {
			try {
				String value = element.getAttribute("value");
				if (value.length() > 1) {
					for (int i = 0; i <= value.length(); i++) {
						System.out.println(i);
						element.sendKeys(Keys.BACK_SPACE);
					}
				}
				return true;
			} catch (InvalidElementStateException e) {
				return false;
			} catch (Exception e) {
				return false;
			}
		} else
			return false;

	}

	public boolean clearTheField1(final By locator) {
		WebElement element = searchForElement(locator);
		if (element != null) {
			try {
				String value = element.getAttribute("value");
				System.out.println(value.length());
				if (value.length() >= 1) {
					for (int i = 0; i <= value.length(); i++) {
						System.out.println(i);
						element.sendKeys(Keys.BACK_SPACE);
						element.sendKeys(Keys.TAB);
					}
				}
				return true;
			} catch (InvalidElementStateException e) {
				return false;
			} catch (Exception e) {
				return false;
			}
		} else
			return false;

	}

	/**
	 * Get the text from the element
	 *
	 * @param locator
	 * @return
	 */
	public String getText(final By locator) {
		WebElement element;
		String text = "";
		// se.log().logSeStep("Get Text From Element: " + locator.toString());
		element = searchForElement(locator);
		if (element != null) {
			try {
				text = element.getText();
			} catch (InvalidElementStateException e) {
				se.log().logSeStep(
						"Could not get text from " + locator.toString() + ", elemet not visible or not enabled");
				se.verify().reportError("Could not get text from, element not visible or not enabled");
			} catch (Exception e) {
				se.log().logSeStep("Could not get text from " + locator.toString());
				se.verify().reportError("Could not get text");
			}
			return text;
		} else
			return text;

	}
	
	public String  javaScripttext(final By locator) {

        String text=null;

        WebElement element = searchForElement(locator);

        if (element != null) {
			try {

        JavascriptExecutor executor = (JavascriptExecutor) se.driver();

        text = executor.executeScript("return arguments[0].innerHTML;",element).toString();

        
        se.log().logSeStep(
				" get text from " + locator.toString() + ", elemet is visible and enabled");
       
        return text;
        
			}
			catch (Exception e) {
				se.log().logSeStep("Could not get text from " + locator.toString());
				se.verify().reportError("Could not get text");
			}
        }
        else {
        	return text;	
        }
		return text;
		

}

	public String  javaScripttext(WebElement element) {

        String text=null;
        String Text=null;

      

        if (element != null) {
			try {

        JavascriptExecutor executor = (JavascriptExecutor) se.driver();

        text = executor.executeScript("return arguments[0].innerHTML;",element).toString();
         Text=text.trim();
        
        se.log().logSeStep(
				" get text from " + element.toString() + ", elemet is visible and enabled");
       
        return Text;
        
			}
			catch (Exception e) {
				se.log().logSeStep("Could not get text from " + element.toString());
				se.verify().reportError("Could not get text");
			}
        }
        else {
        	return Text;	
        }
		return Text;
		

}
	public String gettext(WebElement element) {
		//WebElement element;
		String text = "";
		// se.log().logSeStep("Get Text From Element: " + locator.toString());
		//element = searchForElement(locator);
		if (element != null) {
			try {
				text = element.getText();
			} catch (InvalidElementStateException e) {
				se.log().logSeStep(
						"Could not get text from " + element.toString() + ", elemet not visible or not enabled");
				se.verify().reportError("Could not get text from, element not visible or not enabled");
			} catch (Exception e) {
				se.log().logSeStep("Could not get text from " + element.toString());
				se.verify().reportError("Could not get text");
			}
			return text;
		} else
			return text;

	}

	/**
	 * Selects an item from a drop down
	 *
	 * @param locator
	 * @param value
	 * @return
	 */
	/*public boolean selectElementByValue(final By locator, String value) {
		// se.log().logSeStep(String.format("Select By Value%s In Element: %s",
		// value, locator.toString()));
		WebElement element = searchForElement(locator);
		if (element != null) {
			Select select = new Select(element);
			try {
				select.deselectAll();
			} catch (Exception e) {
				// ignore
			}
			select.selectByValue(value);
			return true;
		} else
			return false;

	}*/

	public void clickelement(WebElement Element, ExtentTest test) {
		try{
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();
			executor.executeScript("arguments[0].click();", Element);
			test.log(LogStatus.INFO,"Clicked on element - " ,Element.toString());
			
		}catch(Exception e){
			e.printStackTrace();
			test.log(LogStatus.WARNING, "Could not Click on element - " ,Element.toString());
		}
		
	}
	/**
	 * Selects an item from a drop down
	 *
	 * @param locator
	 * @param selection
	 * @return
	 */
	public boolean selectElement(final By locator, String selection,ExtentTest test) {
		// se.log().logSeStep("Select " + selection + " In Element: "
		// + locator.toString());
		@SuppressWarnings("unused")
		String browserName = ((RemoteWebDriver) se.driver()).getCapabilities().getBrowserName();

		WebElement element = searchForElement(locator,selection);

		if (selection.equalsIgnoreCase("N/A"))
		{
			return true;
		}
		else if (element != null) {
			se.element().clickelement(element,test);
			Select select = new Select(element);
			try {
				select.deselectAll();

			} catch (Exception e) {
				// ignore
			}
			//se.util().sleep(2000);

			select.selectByVisibleText(selection);
			//se.util().sleep(1000);

			se.element().clickelement(element,test);
			//enterTAB(element);
			test.log(LogStatus.INFO,"Selected element with text - "+selection ,element.toString());
			
			return true;
		} else
			test.log(LogStatus.WARNING,"Could not select element with text - "+selection );
			return false;
	}

	public String getSelectedValue(final By locator,String selection,ExtentTest test) throws IOException {
		WebElement element;
		String text = "";

		element = searchForElement(locator,selection);
		if (selection.equalsIgnoreCase("N/A"))
		{
			return text;
		}

		else if (element != null) {
			try {
				Select select =new Select(element);
				se.element().waitForElementToDisappear_One(progressBar, 60);
				WebElement option=select.getFirstSelectedOption();
				text = option.getText().trim();
				if(text.equalsIgnoreCase(selection))
				{
					test.log(LogStatus.PASS, "Verifying the Dropdown of the element : " ,
							"Actual Value: " + text + " (Protected)" + "<br> " + "Expected Value: "
									+ selection + " (Protected)");
				}
				else
				{
					test.log(LogStatus.FAIL, "Verifying the Dropdown of the element : " ,
							"Actual Value: " + text + " (Protected)" + "<br> " + "Expected Value: "
									+ selection + " (Protected)");
					test.log(LogStatus.FAIL,"validating the Dropdown of the element",test.addScreenCapture(Util.captureScreenshot("validatingtheDropdownoftheelement", se)));


				}
			} catch (InvalidElementStateException e) {
				se.log().logSeStep(
						"Could not get text from " + locator.toString() + ", elemet not visible or not enabled");
				se.verify().reportError("Could not get text from, element not visible or not enabled");
			} catch (Exception e) {
				se.log().logSeStep("Could not get text from " + locator.toString());
				se.verify().reportError("Could not get text");
				test.log(LogStatus.FAIL,"validating the Dropdown of the element",test.addScreenCapture(Util.captureScreenshot("validatingtheDropdownoftheelement", se)));

			}
			return text;
		} else
			return text;

	}
	public boolean selectElementDDrOrValidateText(WebElement element, String testdata, ExtentTest test) {
		try {
			if (!testdata.equalsIgnoreCase("N/A")) {
				if (testdata.contains("validate2")) {
					String[] strtestdata = testdata.split("=");
					String[] strActualTD = strtestdata[1].split("\\|");
					if (strActualTD[1].equalsIgnoreCase("E")) {
						verifyTextIsEnabled(element, strActualTD[0], test);
					}
					if (strActualTD[1].equalsIgnoreCase("D")) {
						verifyTextIsDisabled(element, strActualTD[0], test);
					}

				} else {
					try {
						selectElementDD(element, testdata, test);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return true;
			}

			else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	public void selectElementDD(final WebElement element, final String testdata, ExtentTest test)
			throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(se.driver(), 30);

		if ("input".equals(element.getTagName())) {
			element.sendKeys("");
		}
		element.clear();
		element.sendKeys("");
		se.util().sleep(500);

		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {

				if (element.getText().length() == 0)
					return true;
				else
					element.clear();
				element.sendKeys("");
				try {
					se.util().sleep(500);
				} catch (Exception e) {

					e.printStackTrace();
				}
				return false;
			}
		});

		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(testdata);


		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {

				if (element.getAttribute("value").equals(testdata))
					return true;
				else
					element.clear();
				element.sendKeys("");
				try {
					se.util().sleep(500);
				} catch (Exception e) {

					e.printStackTrace();
				}
				element.sendKeys(Keys.ARROW_DOWN);
				element.sendKeys(testdata);
				return false;
			}
		});

		se.util().sleep(300);
		element.sendKeys(Keys.ENTER);
		se.util().sleep(300);
		String str = element.toString();
		String[] arrOfStr = str.split("->", 2);
		test.log(LogStatus.INFO, "Entering text in the field: " + arrOfStr, "Entered the text: " + testdata);
		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {

				String invalid = element.getAttribute("aria-invalid");
				if (invalid == null || "".equals(invalid))
					return true;
				else
					return false;
			}
		});

	}

	/**
	 * Selects an item from a drop down
	 *
	 * @param locator
	 * @param selection
	 * @return
	 */
	public void selectvalue(final By locator, String selection) {

		try {

			WebElement select = se.driver().findElement(locator);
			List<WebElement> options = select.findElements(By.tagName("option"));

			for (WebElement option : options) {

				if (option.getText().trim().equalsIgnoreCase(selection)) {

					option.click();
					break;

				}
			}

		} catch (InvalidElementStateException e) {
			se.log().logSeStep("Could not select on " + locator.toString() + ", element not visible");

		}

	}


	/**
	 * Returns to the default browser window or frame
	 */
	public void returnToDefaultContent() {
		se.driver().switchTo().defaultContent();
		inFrame = false;
	}

	/**
	 * Returns the number of matching elements
	 *
	 * @param locator
	 * @return
	 */
	public int getNumberOfElements(By locator) {
		List<WebElement> elements = getElements(locator);
		if (elements == null)
			return 0;
		return elements.size();
	}

	public void getalllinks(String linkname) {

		List<WebElement> alllinks = se.driver().findElements(By.tagName("a"));

		for (int i = 0; i < alllinks.size(); i++) {
			String linkvalue = alllinks.get(i).getText();
			if (linkvalue.trim().contains(linkname)) {
				alllinks.get(i).click();
				break;
			}
		}
	}




	public void dropdownValues(String dataValue) {

		List<WebElement> Allvalues = se.driver().findElements(By.tagName("div"));

		for(int i =0;i<Allvalues.size(); i++) {

			String linkvalue = Allvalues.get(i).getText();
			if (linkvalue.trim().contains(dataValue)) {
				Allvalues.get(i).click();
				break;
			}

		}


	}

	
	public boolean Click(String elementname,WebElement Element,ExtentTest test) {
		//WebDriverWait wait = new WebDriverWait(se.driver(), 120);
		if (Element != null && Element.isDisplayed() && Element.isEnabled()) {
			try {
				// se.log().logSeStep("Click Element : " + Element.toString());
				//se.element().waitForElementToDisappear1(progressBar, 5000);

				Element.click();
				se.log().logSeStep("Clicked on the element " + Element.toString() + ", element is  visible");
				test.log(LogStatus.INFO, "Clicked on the element - " , Element.toString() );
				//se.util().sleep(4000);
				//se.element().waitForElementToDisappear1(progressBar, 5000);
				return true;
			} catch (InvalidElementStateException e) {
				e.printStackTrace();

				se.log().logSeStep("Could not click on " + Element.toString() + ", element not visible");
				test.log(LogStatus.WARNING, "Could not click on - " , Element.toString() );
				return false;
			}
			catch ( Exception e) {
				e.printStackTrace();


				return false;
			}
		} else
			se.log().logSeStep("Could not click on " + Element.toString() + ", element id disable and not clickable");
		return false;
	}

	public boolean Click1(final By locator) {
		//WebDriverWait wait = new WebDriverWait(se.driver(), 120);
		WebElement Element = searchForElement(locator);
		if (Element != null && Element.isDisplayed() && Element.isEnabled()) {
			try {
				// se.log().logSeStep("Click Element : " + Element.toString());
				//se.element().waitForElementToDisappear1(progressBar, 5000);
				Element.click();
				se.log().logSeStep("Clicked on the element " + Element.toString() + ", element is  visible");
				//se.util().sleep(4000);
				//se.element().waitForElementToDisappear1(progressBar, 5000);
				return true;
			} catch (InvalidElementStateException e) {
				e.printStackTrace();

				se.log().logSeStep("Could not click on " + Element.toString() + ", element not visible");
				return false;
			}
		} else
			se.log().logSeStep("Could not click on " + Element.toString() + ", element id disable and not clickable");
		return false;
	}




	public void selectradiovalue(final By locator, String value) {

		String browserName = ((RemoteWebDriver) se.driver()).getCapabilities().getBrowserName();

		List<WebElement> radios = se.driver().findElements(locator);

		for (int i = 0; i < radios.size(); i++) {

			String radiovalue = radios.get(i).getAttribute("value");
			if (radiovalue.trim().contains(value)) {
				radios.get(i).click();
				break;
			}
			else 
				se.log().logSeStep("Could not click on " + locator.toString() + ", element id disable and not clickable");

		}

	}
	/*
	 * public void selectRadioByValue(final By locator, String value) {
	 * 
	 * String browserName = ((RemoteWebDriver)
	 * se.driver()).getCapabilities().getBrowserName();
	 * 
	 * String valueChangeCase = value.toUpperCase();
	 * 
	 * List<WebElement> radios = se.driver().findElements(locator); for (int i =
	 * 0; i < radios.size(); i++) { String radiovalue =
	 * radios.get(i).getAttribute("value"); if
	 * (radiovalue.trim().contains(value)) { radios.get(i).click(); break; }
	 * 
	 * } }
	 */

	public void selectRadioByValue(final By locator, String value) throws AWTException, InterruptedException {

		@SuppressWarnings("unused")
		String browserName = ((RemoteWebDriver) se.driver()).getCapabilities().getBrowserName();

		/*
		 * String valueChangeCase = value.toUpperCase();
		 * 
		 * WebElement radios = se.driver().findElement(locator);
		 */
		/*
		 * boolean buttonpresent = radios.isDisplayed();
		 * System.out.println("button is enabled"+buttonpresent);
		 * 
		 * boolean button = radios.isEnabled();
		 * System.out.println("button is enabled"+button);
		 * 
		 * boolean selected_status = radios.isSelected();
		 * System.out.println("button is selected"+selected_status);
		 * 
		 * radios.click();
		 * 
		 * boolean Afterselectbutton = radios.isEnabled();
		 * System.out.println("button is enabled"+Afterselectbutton);
		 * 
		 */

		/*
		 * String radiovalue = radios.getAttribute("value"); if
		 * (radiovalue.trim().equals(value)) {
		 * 
		 * se.element().Click(radios);
		 * 
		 * 
		 * 
		 * }
		 */
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		se.util().sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		se.util().sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		se.util().sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		se.util().sleep(2000);
		/*
		 * robot.keyPress(KeyEvent.VK_TAB); se.util().sleep(2000);
		 */
		/* robot.keyPress(KeyEvent.VK_KP_RIGHT); */
		se.util().sleep(2000);
		robot.keyPress(KeyEvent.VK_RIGHT);

	}

	public void clickElement(WebElement Element) {

		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		executor.executeScript("var elem=arguments[0]; setTimeout(function() {elem.click();}, 100)", Element);

	}

	public void JsClick(WebElement Element) {
		se.util().sleep(500);
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		executor.executeScript("arguments[0].click();", Element);
		//se.util().sleep(500);
		se.log().logSeStep("Clicked on the element " + Element.toString() + ", element is  visible");
		//test.log(LogStatus.INFO, "Click on the Element: " + elementname, "Clicked on " + elementname);

	}

	public boolean clickSearchIcon(WebElement Element, ExtentTest test) {
		try {
			se.util().sleep(2000);

			JavascriptExecutor executor = (JavascriptExecutor) se.driver();
			new Actions(se.driver()).moveToElement(Element);
			executor.executeScript("arguments[0].click();", Element);
			test.log(LogStatus.INFO, "Click on the Element: " + Element, "Clicked on " + Element);
			se.element().waitForElement(By.xpath("//span[contains(text(),'CLOSE')]"));
			return true;
		} catch (Exception e) {
			se.log().logSeStep("Could not click on " + Element.toString() + ", element not visible  " + e.getMessage());
			return false;
		}

	}

	public void clickElement(WebElement Element, ExtentTest test) {

		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		new Actions(se.driver()).moveToElement(Element);
		executor.executeScript("arguments[0].click();", Element);
		/*se.element().waitForElementToDisappear(bluelineIndicator, 5000);
		se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);*/
		test.log(LogStatus.INFO, "Click on the Element: " + Element, "Clicked on " + Element);

	}

	public boolean Click(WebElement Element, String elementname, ExtentTest test) {
		WebDriverWait wait = new WebDriverWait(se.driver(), 30);
		if (Element != null && Element.isDisplayed() && Element.isEnabled()) {
			try {
				// se.log().logSeStep("Click Element : " + Element.toString());
				new Actions(se.driver()).moveToElement(Element).perform();
				Element.click();
				/*se.element().waitForElementToDisappear(bluelineIndicator, 5000);
				se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);*/
				String str = Element.toString();
				String[] arrOfStr = str.split("->", 2);
				test.log(LogStatus.INFO, "Click on the Element: " + elementname, "Clicked on " + elementname);
				return true;
			} catch (InvalidElementStateException e) {
				se.log().logSeStep("Could not click on " + elementname + ", element not visible");
				return false;
			}
		} else
			return false;
	}

	public boolean Click( WebElement Element, ExtentTest test) {
		//public boolean Click( WebElement Element) {
		WebDriverWait wait = new WebDriverWait(se.driver(), 30);
		if (Element != null && Element.isDisplayed() && Element.isEnabled()) {
			try {
				// se.log().logSeStep("Click Element : " + Element.toString());
				se.util().sleep(1000);
				Element.click();
				/*se.element().waitForElementToDisappear(bluelineIndicator, 5000);
				se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);*/
				String str = Element.toString();
				String[] arrOfStr = str.split("->", 2);
				test.log(LogStatus.INFO, "Click on the Element: " + Element.toString(), "Clicked on element");
				return true;
			} catch (InvalidElementStateException e) {
				e.printStackTrace();
				se.log().logSeStep("Could not click on " + Element.toString() + ", element not visible");
				test.log(LogStatus.WARNING, "Could not click on - " , Element.toString() );
				return false;
			}
		} else
			return false;
	}

	public void tryClick(final WebElement Element, ExtentTest test) {
		// creating of wait of 30 secs for the elements to appear on the screen
		WebDriverWait wait = new WebDriverWait(se.driver(), 30);
		// wait for the elements to appear on the screen which needs to be
		// clicked
		se.element().waitForElementIsDisplayed(Element);
		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				// Element is displayed and is enabled, click on the element
				if (Element.isDisplayed() && Element.isEnabled())
					return true;
				else
					return false;
			}
		});
		new Actions(se.driver()).moveToElement(Element).perform();
		Element.click();
	}

	public boolean ClickNext(WebElement Element, ExtentTest test) {
		WebDriverWait wait = new WebDriverWait(se.driver(), 30);
		if (Element != null && Element.isDisplayed() && Element.isEnabled()) {
			try {
				// se.log().logSeStep("Click Element : " + Element.toString());
				Element.click();
				int xCoord = 500;
				int yCoord = 500;

				// Move the cursor

				/*se.element().waitForElementToDisappear(bluelineIndicator, 5000);
				se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);*/
				String str = Element.toString();
				String[] arrOfStr = str.split("->", 2);
				test.log(LogStatus.INFO, "Click on the Element: " + arrOfStr[1], "Clicked on the Element");
				return true;
			} catch (InvalidElementStateException e) {
				se.log().logSeStep("Could not click on " + Element.toString() + ", element not visible");
				return false;
			}
		} else
			return false;
	}

	public void doubleClick(WebElement Element) {
		Actions ac1 = new Actions(se.driver());
		ac1.moveToElement(Element);
		ac1.doubleClick(Element).perform();
	}
	public void MovetoElement(WebElement Element) {
		try{
			Actions ac1 = new Actions(se.driver());
		
		ac1.moveToElement(Element).perform();
	
		
		}
		catch(Exception e){
			se.log().logSeStep("Could not move to  " + Element.toString() + ", element not visible");
			
		}
	}
	public void MovetoElement(WebElement Element,ExtentTest test) {
		try{
			Actions ac1 = new Actions(se.driver());
		
		ac1.moveToElement(Element).perform();
		ac1.doubleClick(Element).perform();
		test.log(LogStatus.INFO, "Moved to element -", "element : " + Element.toString());
		}
		catch(Exception e){
			test.log(LogStatus.WARNING, "Unable to move to element -", "element : " + Element.toString());
			
		}
	}

	/**
	 * Click the element
	 *
	 * @param locator
	 * @return
	 */
	public boolean clickElement(final By locator, String elementname, ExtentTest test) {
		test.log(LogStatus.INFO, "Click on the Element: " + elementname, "Clicked on the Element");
		return clickElement(locator, null, false, -1, null, -1, -1, null, false);
	}

	public boolean clickElement(final By locator, ExtentTest test) {
		test.log(LogStatus.INFO, "Click on the Element: ", "Clicked on the Element");
		return clickElement(locator, null, false, -1, null, -1, -1, null, false);
	}

	public boolean clickElement(final By locator) {

		return clickElement(locator, null, false, -1, null, -1, -1, null, false);
	}

	public boolean clickElement(final By locator, final String containsText, final boolean exactText,
			final int nthElement, final String frameName, final int x, final int y, final By successLocator,
			final boolean shouldDisappear) {
		// Build logging message from options
		StringBuilder msg = new StringBuilder();
		msg.append("Click");
		if (nthElement != -1)
			msg.append(" (").append(nthElement).append(")");
		msg.append(" element: ").append(locator.toString());
		if (containsText != null && !containsText.isEmpty())
			msg.append(" containing '").append(containsText).append("'");
		if (frameName != null && !frameName.isEmpty())
			msg.append(" in Frame ").append(frameName);
		if (x != -1 || y != -1)
			msg.append(" At (").append(x).append(",").append(y).append(")");
		// se.log().logSeStep(msg.toString());

		try {
			return new WebDriverWait(se.driver(), globalSeTimeOut).ignoring(Throwable.class)
					.withMessage("Unable to click on element").until(new ExpectedCondition<Boolean>() {
						public Boolean apply(WebDriver driver) {
							// Switch frame is specified
							if (frameName != null && !frameName.isEmpty())
								switchToFrame(frameName);

							// Find targetElement
							WebElement targetElement = null;
							if (containsText != null && !containsText.isEmpty()) {
								for (WebElement element : getElements(locator)) {
									String elementText = element.getText();
									if (elementText.equals(containsText)
											|| (!exactText && elementText.contains(containsText))) {
										targetElement = element;
										break;
									}
								}
							} else if (nthElement != -1) {
								targetElement = getElements(locator).get(nthElement);
							} else {
								targetElement = getElement(locator);
							}

							// Click on the element
							if (targetElement != null) {
								if (x != -1 || y != -1) {
									new Actions(driver).moveToElement(targetElement).moveByOffset(x, y).click()
									.perform();
									/*se.element().waitForElementToDisappear(bluelineIndicator, 5000);
									se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);*/
								} else {
									targetElement.click();
									/*se.element().waitForElementToDisappear(bluelineIndicator, 5000);
									se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);*/
								}
							}

							// Check for success locator
							boolean success = (targetElement != null && successLocator == null)
									|| (shouldDisappear ? waitForElementToDisappear(successLocator, 5)
											: waitForElementIsDisplayed(successLocator, 5));

							// Switch frame back to default, if frame was
							// specified
							if (success && frameName != null && !frameName.isEmpty())
								returnToDefaultContent();

							// Did we do it?
							return success;
						}
					});
		} catch (Throwable t) {
			String errorName = "Click Element: ";
			// se.log().logSeStep(errorName + t.getMessage() + ": " +
			// ExceptionUtils.getStackTrace(t));
			// se.log().logTcError(errorName, se.browser().takeScreenShot());
			// Switch frame back to default, if a frame was specified
			if (frameName != null && !frameName.isEmpty())
				returnToDefaultContent();
			return false;
		}
	}

	/**
	 * Switch to a frame by name
	 *
	 * @param iFrameName
	 * @return
	 */
	public boolean switchToFrame(String iFrameName) {
		if (inFrame)
			returnToDefaultContent();
		try {
			se.driver().switchTo().frame(iFrameName);
			inFrame = true;
			return true;
		} catch (Exception e) {
			se.log().logSeStep("Un-handled Exception in swithToFrame: " + e.getMessage());
			return false;
		}
	}

	public boolean switchToFrame(WebElement element) {
		if (inFrame)
			returnToDefaultContent();
		try {
			se.driver().switchTo().frame(element);
			inFrame = true;
			return true;
		} catch (Exception e) {
			se.log().logSeStep("Un-handled Exception in swithToFrame: " + e.getMessage());
			return false;
		}
	}

	public boolean isElementPresent(WebElement we) {
		boolean flag = false;
		try {
			se.util().sleep(5000);
			flag = we.isDisplayed();
			return flag; // Success!
		} catch (Exception e) {
			return flag;
		}
	}
	public boolean hover(WebElement element) {
		// se.log().logSeStep("Hover Over Element: " + element.toString());

		if (se.browser().getBrowserName().trim().equalsIgnoreCase("Chrome")) {

			String code = "var fireOnThis = arguments[0];" + "var evObj = document.createEvent('MouseEvents');"
					+ "evObj.initEvent( 'mouseover', true, true );" + "fireOnThis.dispatchEvent(evObj);";
			((JavascriptExecutor) se.driver()).executeScript(code, element);
		} else {

			Actions actions = new Actions(se.driver());
			Action action = actions.moveToElement(element).build();
			action.perform();
		}

		return true;
	}


	/**
	 * @throws IOException 
	 * Selects an item from a drop down
	 *
	 * @param locator
	 * @param selection
	 * @return
	 * @throws  
	 */
	public boolean selectElement(final By locator, String selection) throws IOException {
		// se.log().logSeStep("Select " + selection + " In Element: "
		// + locator.toString());
		boolean flag = true;
		try{
			String browserName = ((RemoteWebDriver) se.driver()).getCapabilities().getBrowserName();
			WebElement element = searchForElement(locator);
			if(selection.equals("N/A") || selection.equals("NA")){
				selection = "";
			} else{

				if (element != null) {
					Select select = new Select(element);
					try {
						select.deselectAll();

					} catch (Exception e) {
						// ignore
					}
					select.selectByVisibleText(selection);
					flag = true;
				} else{
					flag = false;
				}
			}
		}catch (Exception e) {
			se.verify().verifyEqualsNoScreenshot("Issue with dropdown for"+locator+" ---", true, false);
		}
		return flag;	
	}

	public boolean verifyTextIsDisabled(WebElement element, String testdata, ExtentTest test) {
		try {
			if (element != null && element.isDisplayed() && !testdata.equals("N/A")) {
				try {
					//se.util().sleep(1000);
					String strActualValue = element.getText().trim();
					//String strActualValue = se.element().javaScripttext(element).trim();
					String str = element.toString();
					String[] arrOfStr = str.split("->", 2);
					//System.out.println(element.isEnabled());
					if (element.isDisplayed() && strActualValue.equals(testdata)) {
						test.log(LogStatus.PASS, "Verifying the Text of the element : " ,
								"Actual Value: " + strActualValue + " (Protected)" + "<br> " + "Expected Value: "
										+ testdata + " (Protected)");
					} else if (!element.isEnabled() && !strActualValue.equals(testdata)) {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : " ,
								"Actual Value: " + strActualValue + " (Protected)" + "<br> " + "Expected Value: "
										+ testdata + " (Protected)");
					} else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : " ,
								"Actual Value: " + strActualValue + " (Not Protected)" + "<br> " + "Expected Value: "
										+ testdata + " (Protected)");
						test.log(LogStatus.FAIL,"validating the Text of the element",test.addScreenCapture(Util.captureScreenshot("validatingtheTextoftheelement", se)));
					}
					return true;
				} catch (InvalidElementStateException e) {
					return false;
				} catch (Exception e) {
					e.printStackTrace();
					e.getMessage();
					return false;
				}
			} else
				return false;
		} catch (Exception e) {

			return false;
		}

	}

	public boolean verifyTextIsEnabled(WebElement element, String elementname, String testdata, ExtentTest test) {
		try {
			if (element != null && element.isDisplayed() && !testdata.equals("N/A")) {
				try {
					se.util().sleep(1000);
					String strActualValue = element.getAttribute("value");
					String str = element.toString();
					String[] arrOfStr = str.split("->", 2);
					if (element.isEnabled() && strActualValue.equals(testdata)) {
						test.log(LogStatus.PASS, "Verifying the Text of the element : " ,
								"Actual Value: " + strActualValue + " (Not Protected)" + " <br> " + "Expected Value: "
										+ testdata + " (Not Protected)");
					} else if (element.isEnabled() && !strActualValue.equals(testdata)) {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : " ,
								"Actual Value: " + strActualValue + " (Not Protected)" + " <br> " + "Expected Value: "
										+ testdata + " (Not Protected)");
					} else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : " ,
								"Actual Value: " + strActualValue + " (Protected)" + "<br> " + "Expected Value: "
										+ testdata + " (Not Protected)");
					}
					return true;
				} catch (InvalidElementStateException e) {
					return false;
				} catch (Exception e) {
					return false;
				}
			} else
				return false;
		} catch (Exception e) {

			return false;
		}

	}

	public boolean verifyTextIsDisabled(WebElement element, String elementname, String testdata, ExtentTest test) {

		try {
			if (element != null && element.isDisplayed() && !testdata.equals("N/A")) {
				try {
					se.util().sleep(1000);
					String strActualValue = element.getAttribute("value");
					String str = element.toString();
					String[] arrOfStr = str.split("->", 2);
					if (!element.isEnabled() && strActualValue.equals(testdata)) {
						test.log(LogStatus.PASS, "Verifying the Text of the element : " ,
								"Actual Value: " + strActualValue + " (Protected)" + "<br> " + "Expected Value: "
										+ testdata + " (Protected)");
					} else if (!element.isEnabled() && !strActualValue.equals(testdata)) {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : " ,
								"Actual Value: " + strActualValue + " (Protected)" + "<br> " + "Expected Value: "
										+ testdata + " (Protected)");
						test.log(LogStatus.FAIL,"validating the Text of the element",test.addScreenCapture(Util.captureScreenshot("validatingtheTextoftheelement", se)));

					} else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : " ,
								"Actual Value: " + strActualValue + " (Not Protected)" + "<br> " + "Expected Value: "
										+ testdata + " (Protected)");
						test.log(LogStatus.FAIL,"validating the Text of the element",test.addScreenCapture(Util.captureScreenshot("validatingtheTextoftheelement", se)));

					}
					return true;
				} catch (InvalidElementStateException e) {
					return false;
				} catch (Exception e) {
					return false;
				}
			} else
				return false;
		} catch (Exception e) {

			return false;
		}

	}

	public boolean verifyTextIsEnabled(WebElement element, String testdata, ExtentTest test) {

		try {
			if (element != null && element.isDisplayed() && !testdata.equals("N/A")) {
				try {
//					se.util().sleep(1000);
					String strActualValue = element.getAttribute("value").trim();
					String str = element.toString();
					String[] arrOfStr = str.split("->", 2);

					if (element.isEnabled() && strActualValue.equals(testdata.trim())) {
						test.log(LogStatus.PASS, "Verifying the Text of the element : " ,
								"Actual Value: " + strActualValue + " (Not Protected)" + " <br> " + "Expected Value: "
										+ testdata + " (Not Protected)");
					} else if (element.isEnabled() && !strActualValue.equals(testdata.trim())) {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : " ,
								"Actual Value: " + strActualValue + " (Not Protected)" + " <br> " + "Expected Value: "
										+ testdata + " (Not Protected)");
						test.log(LogStatus.FAIL,"validating the Text of the element",test.addScreenCapture(Util.captureScreenshot("validatingtheTextoftheelement", se)));

					} else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : " ,
								"Actual Value: " + strActualValue + " (Protected)" + "<br> " + "Expected Value: "
										+ testdata + " (Not Protected)");
						test.log(LogStatus.FAIL,"validating the Text of the element",test.addScreenCapture(Util.captureScreenshot("validatingtheTextoftheelement", se)));

					}
					return true;
				} catch (InvalidElementStateException e) {
					return false;
				} catch (Exception e) {
					return false;
				}
			} else
				return false;
		} catch (Exception e) {

			return false;
		}

	}

	public void VerifyCheckvalueIsEnabled(WebElement element, String testdata, ExtentTest test) {
		try {
			String strActualValue = "";
			boolean isChecked = element.isSelected();
			if (isChecked) {
				strActualValue = "true";
				System.out.println(strActualValue);
			} else {
				strActualValue = "false";
			}

			String str = element.toString();
			String[] arrOfStr = str.split("->", 2);
			if (element.isDisplayed() && !testdata.equals("N/A")) {

				if (element.isEnabled()) {

					if (strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Check")) {
						String strActual = "Check";
						test.log(LogStatus.PASS, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Not Protected)" + "<br> " + "Expected Value: " + testdata + " (Not Protected)");
					} else if (strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Uncheck")) {
						String strActual = "Check";
						test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Not Protected)" + "<br> " + "Expected Value: " + testdata + " (Not Protected)");
					}

					if (!strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Uncheck")) {
						String strActual = "Uncheck";
						test.log(LogStatus.PASS, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Not Protected)" + "<br> " + "Expected Value: " + testdata + " (Not Protected)");
					}

					else if (!strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Check")) {
						String strActual = "Uncheck";
						test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Not Protected)" + "<br> " + "Expected Value: " + testdata + " (Not Protected)");
					}
				}

				else if (!element.isEnabled()) {

					if (strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Check")) {
						String strActual = "Check";
						test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Protected)" + "<br> " + "Expected Value: " + testdata + " (Not Protected)");
					} else if (strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Uncheck")) {
						String strActual = "Check";
						test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Protected)" + "<br> " + "Expected Value: " + testdata + " (Not Protected)");
					}

					if (!strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Unheck")) {
						String strActual = "Uncheck";
						test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Protected)" + "<br> " + "Expected Value: " + testdata + " (Not Protected)");
					} else if (!strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Check")) {
						String strActual = "Uncheck";
						test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Protected)" + "<br> " + "Expected Value: " + testdata + " (Not Protected)");
					}

				}
			}
		} catch (Exception ex) {
			se.log().logSeStep("An unexpected error " + ex.getMessage()
			+ " occurred while executing updateCheckValue of the object ");
			ex.printStackTrace();
		}

	}

	public void VerifyCheckvalueIsDisabled(WebElement element, String testdata, ExtentTest test) {
		try {
			String strActualValue = "";
			boolean isChecked = element.isSelected();

			if (isChecked) {
				strActualValue = "true";
				System.out.println(strActualValue);
			} else {
				strActualValue = "flase";
			}

			String str = element.toString();
			String[] arrOfStr = str.split("->", 2);
			if (element.isDisplayed() && !testdata.equals("N/A")) {

				if (!element.isEnabled()) {

					if (strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Check")) {
						String strActual = "Check";
						test.log(LogStatus.PASS, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Protected)" + "<br> " + "Expected Value: " + testdata + " (Protected)");
					} else if (strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Uncheck")) {
						String strActual = "Check";
						test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Protected)" + "<br> " + "Expected Value: " + testdata + " (Protected)");
					}

					if (!strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Uncheck")) {
						String strActual = "Uncheck";
						test.log(LogStatus.PASS, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Protected)" + "<br> " + "Expected Value: " + testdata + " (Protected)");
					}

					else if (!strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Check")) {
						String strActual = "Uncheck";
						test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Protected)" + "<br> " + "Expected Value: " + testdata + " (Protected)");
					}
				}

				else if (!element.isEnabled()) {

					if (strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Check")) {
						String strActual = "Check";
						test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Protected)" + "<br> " + "Expected Value: " + testdata + " (Not Protected)");
					} else if (strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Uncheck")) {
						String strActual = "Check";
						test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Protected)" + "<br> " + "Expected Value: " + testdata + " (Not Protected)");
					}

					if (!strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Uncheck")) {
						String strActual = "Uncheck";
						test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Protected)" + "<br> " + "Expected Value: " + testdata + " (Not Protected)");
					} else if (!strActualValue.equalsIgnoreCase("true") && testdata.equalsIgnoreCase("Check")) {
						String strActual = "Uncheck";
						test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
								+ " (Protected)" + "<br> " + "Expected Value: " + testdata + " (Not Protected)");
					}

				}
			}

		} catch (Exception ex) {
			se.log().logSeStep("An unexpected error " + ex.getMessage()
			+ " occurred while executing updateCheckValue of the object ");
			ex.printStackTrace();
		}

	}

	public void IsVerifyCheckvalueIsEnabled(WebElement element, String testdata, ExtentTest test) {
		try {
			String strActualValue = element.getAttribute("checked");
			String str = element.toString();
			String[] arrOfStr = str.split("->", 2);
			if (element.isDisplayed() && !testdata.equals("N/A")) {
				boolean isChecked;
				if (element.isEnabled()) {

					try {
						if (strActualValue.equalsIgnoreCase("true")) {
							String strActual = "Check";
							test.log(LogStatus.PASS, "Verifying the element : " + arrOfStr[1],
									"Actual Value: " + strActual + " (Not Protected)" + "<br> " + "Expected Value: "
											+ testdata + " (Not Protected)");
						} else {
							String strActual = "Uncheck";
							test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1],
									"Actual Value: " + strActual + " (Protected)" + "<br> " + "Expected Value: "
											+ testdata + " (Not Protected)");
						}
					} catch (Exception e) {
						isChecked = false;
						String strActual = "Uncheck";
						if (testdata.equalsIgnoreCase("Uncheck")) {
							test.log(LogStatus.PASS, "Verifying the element : " + arrOfStr[1],
									"Actual Value: " + strActual + " (Not Protected)" + "<br> " + "Expected Value: "
											+ testdata + " (Not Protected)");
						} else {
							test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1],
									"Actual Value: " + strActual + " (Not Protected)" + "<br> " + "Expected Value: "
											+ testdata + " (Not Protected)");
						}
					}
				} else {
					String strActual;
					if (strActualValue.equalsIgnoreCase("true")) {
						strActual = "Checked";
					} else {
						strActual = "Not Checked";
					}
					test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
							+ " (Protected)" + "<br> " + "Expected Value: " + testdata + " (Not Protected)");
				}
			}
		} catch (Exception ex) {
			se.log().logSeStep("An unexpected error " + ex.getMessage()
			+ " occurred while executing updateCheckValue of the object ");
			ex.printStackTrace();
		}
	}

	public void IsVerifyCheckvalueIsDisabled(WebElement element, String testdata, ExtentTest test) {
		try {
			String strActualValue = element.getAttribute("checked");
			String str = element.toString();
			String[] arrOfStr = str.split("->", 2);
			if (element.isDisplayed() && !testdata.equals("N/A")) {
				boolean isChecked;
				if (!element.isEnabled()) {
					try {
						if (strActualValue.equalsIgnoreCase("true")) {
							String strActual = "Check";
							test.log(LogStatus.PASS, "Verifying the element : " + arrOfStr[1],
									"Actual Value: " + strActual + " (Protected)" + "<br> " + "Expected Value: "
											+ testdata + " (Protected)");
						} else {
							String strActual = "Uncheck";
							test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1],
									"Actual Value: " + strActual + " (Not Protected)" + "<br> " + "Expected Value: "
											+ testdata + " (Protected)");
						}
					} catch (Exception e) {
						isChecked = false;
						String strActual = "Uncheck";
						if (testdata.equalsIgnoreCase("Uncheck")) {
							test.log(LogStatus.PASS, "Verifying the element : " + arrOfStr[1],
									"Actual Value: " + strActual + " (Protected)" + "<br> " + "Expected Value: "
											+ testdata + " (Protected)");
						} else {
							test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1],
									"Actual Value: " + strActual + " (Protected)" + "<br> " + "Expected Value: "
											+ testdata + " (Protected)");
						}
					}
				} else {
					String strActual;
					if (strActualValue.equalsIgnoreCase("true")) {
						strActual = "Check";
					} else {
						strActual = "Uncheck";
					}
					test.log(LogStatus.FAIL, "Verifying the element : " + arrOfStr[1], "Actual Value: " + strActual
							+ " (Not Protected)" + "<br> " + "Expected Value: " + testdata + " (Protected)");
				}
			}
		} catch (Exception ex) {
			se.log().logSeStep("An unexpected error " + ex.getMessage()
			+ " occurred while executing updateCheckValue of the object ");
			ex.printStackTrace();
		}
	}

	public boolean isElementPresent(By locator) {
		try {
			se.driver().findElement(locator);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public boolean isElementVisible(By locator) {
		try {
		 se.driver().findElement(locator).isDisplayed();
		return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	public boolean isElementDisplayed(By locator,String attribute) {
		
		String attributevalue="";
		try {
			 attributevalue = se.driver().findElement(locator).getAttribute(attribute);
		 if(!attributevalue.isEmpty()){
			 return true;
		 }else{
			 return false;
		 }
		
		}
		catch (Exception e) {
			return false;
		}
	}

	public boolean isElementEnabled(By locator) {
		try {
		 se.driver().findElement(locator).isEnabled();
		return true;
		}
		catch (Exception e) {
			return false;
		}
	}


	public boolean verifyTextIsEnabledDD(List<WebElement> element,WebElement element1, String testdata, ExtentTest test) {

		try {
			if (element1 != null && element1.isDisplayed() && !testdata.equals("N/A")) {
				try {
					se.util().sleep(1000);
					/*String strActualValue = element1.getAttribute("value");*/
					String strActualValue = element1.getText();
					/*String ArrActVal = element*/
					String str = element1.toString();
					String[] arrOfStr = str.split("->", 2);

					if(element.contains(strActualValue))
					{
						test.log(LogStatus.PASS, "Verifying the Text of the element : " ,
								"Actual Value: " + strActualValue + " (Not Protected)" + " <br> " + "Expected Value: "
										+ testdata + " (Not Protected)");
					}
					else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : " ,
								"Actual Value: " + strActualValue + " (Protected)" + "<br> " + "Expected Value: "
										+ testdata + " (Not Protected)");
					}


					return true;
				} catch (InvalidElementStateException e) {
					return false;
				} catch (Exception e) {
					return false;
				}
			} else
				return false;
		} catch (Exception e) {

			return false;
		}

	}

	public String getSelectedValue(final By locator) {
		WebElement element;
		String text = "";

		element = searchForElement(locator);
		Select select =new Select(element);
		if (element != null) {
			try {
				se.util().sleep(3000);
				WebElement option=select.getFirstSelectedOption();
				text = option.getText();
			} catch (InvalidElementStateException e) {
				se.log().logSeStep(
						"Could not get text from " + locator.toString() + ", elemet not visible or not enabled");
				se.verify().reportError("Could not get text from, element not visible or not enabled");
			} catch (Exception e) {
				se.log().logSeStep("Could not get text from " + locator.toString());
				se.verify().reportError("Could not get text");
			}
			return text;
		} else
			return text;

	}

	public String getSelectedText(final By locator) {
		WebElement element;
		String text = "";

		element = searchForElement(locator);

		if (element != null) {
			try {
				
				text = element.getText().trim();


			} catch (InvalidElementStateException e) {
				se.log().logSeStep("Could not get text from " + locator.toString() + ", elemet not visible or not enabled");
				se.verify().reportError("Could not get text from, element not visible or not enabled");
			} catch (Exception e) {
				se.log().logSeStep("Could not get text from " + locator.toString());
				se.verify().reportError("Could not get text");
			}
			return text;
		} else
			return text;

	}





	public boolean selectElementDDrOrValidateTextList(List<WebElement> element,WebElement element1, String testdata, ExtentTest test) {
		try {
			if (!testdata.equalsIgnoreCase("N/A")) {
				if (testdata.contains("validate2")) {
					String[] strtestdata = testdata.split("=");
					String[] strActualTD = strtestdata[1].split("\\|");
					/*if (strActualTD[1].equalsIgnoreCase("E")) {
					verifyTextIsEnabled(element, strActualTD[0], test);
				}
				if (strActualTD[1].equalsIgnoreCase("D")) {
					verifyTextIsDisabled(element, strActualTD[0], test);
				}*/
					if (strActualTD[1].equalsIgnoreCase("DD")) {
						verifyTextIsEnabledDD(element,element1,strActualTD[0], test);
					}
				} else {
					/*try {
					selectElementDD(element, testdata, test);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				}
				return true;
			}

			else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}
	
	public void switchtab(final By locator,String URL)
	{
		//WebElement Element=se.driver().findElement(locator);
		//Element.sendKeys(Keys.CONTROL +"t");
		 Actions act = new Actions(se.driver());
	        act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
	   Set <String> windowHandles = se.driver().getWindowHandles();

	    System.out.println(windowHandles.size());

	    for(String winHandle : se.driver().getWindowHandles()){

	    	se.driver().switchTo().window(winHandle);
	    	se.driver().navigate().to(URL);

	    }


	}
	public boolean SelectElement(final By locator,String testdata, ExtentTest test) throws IOException, InterruptedException {
		// se.log().logSeStep("Select " + selection + " In Element: "
		// + locator.toString());
		@SuppressWarnings("unused")
		String browserName = ((RemoteWebDriver) se.driver()).getCapabilities().getBrowserName();

		WebElement element = searchForElement(locator,testdata);

		if (!testdata.equalsIgnoreCase("N/A"))
		{
			if (testdata.contains("validate2")) {

				String[] strtestdata = testdata.split("=");
				String[] strActualTD = strtestdata[1].split("\\|");
				if (strActualTD[1].equalsIgnoreCase("DDV")) {
					getSelectedValue(locator, strActualTD[0].trim(), test);

				}
			}

			else  if(element!=null) {
				//se.element().waitForElementtoText(element,120,testdata);
				se.element().clickelement(element,test);
				Select select = new Select(element);
				try {

					se.element().waitForElementToDisappear_One(progressBar,120);
					select.selectByVisibleText(testdata);
					
					se.element().waitForElementToDisappear_One(progressBar,120);

					se.log().logSeStep("selected the text: " + testdata + ", element is  selected");
					test.log(LogStatus.INFO,"selected the text: ", "<br>Actual: "+ testdata +"<br>Expected: "+" element is  selected"+"<br>");
					se.element().clickelement(element,test);
					return true;

				} catch (Exception e) {
					se.log().logSeStep("selected the text: " + testdata + ", element is  not selected");
					test.log(LogStatus.WARNING,"could not select the text: " + testdata + ", element is  not selected",test.addScreenCapture(Util.captureScreenshot("UnexpectedError while selecting " , se)));
					e.getMessage();
					e.printStackTrace();
					return false;
				}
				//se.util().sleep(2000);

				
			} 
		}


		return true;
	}


	

public boolean SelectElementByIndex(final By locator,String testdata, ExtentTest test) throws IOException {
	// se.log().logSeStep("Select " + selection + " In Element: "
	// + locator.toString());
	@SuppressWarnings("unused")
	String browserName = ((RemoteWebDriver) se.driver()).getCapabilities().getBrowserName();
	 int Testdata=Integer.parseInt(testdata);

	WebElement element = searchForElement(locator,testdata);


			se.element().clickelement(element,test);
			Select select = new Select(element);
			try {

				se.element().waitForElementToDisappear_One(progressBar, 60);
				select.selectByIndex(Testdata);
				
				se.log().logSeStep("selected the text: " + testdata + ", element is  selected");
				
				se.element().clickelement(element,test);
				test.log(LogStatus.INFO, "selected the text: " + testdata + ", element is  selected");




			} catch (Exception e) {
				se.log().logSeStep("could not select the text: " + testdata + ", element is  not selected");
				test.log(LogStatus.INFO, "could not select the text: " + testdata + ", element is  selected");


				e.getMessage();
				e.printStackTrace();
			}
			//se.util().sleep(2000);

			return true;
		
	


	
}
 
}



