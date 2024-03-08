package Libraries.ap.automation.common;

import org.apache.commons.configuration.ConfigurationException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.*;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.framework.*;
import Libraries.ap.automation.common.framework.Browser.Browsers;

import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class SeHelper {
	private WebDriver driver;
	private final Browser browser = new Browser(this);
	private final Verification verification = new Verification(this);
	private final Data data = new Data();
	private final Element element = new Element(this);
	private final Util util = new Util();
	private final Settings settings = buildSettings();
	private final Log log = new Log(settings().value("couchDb.url"),
			"_" + Util.randomNum(0, 9999) + "_" + Util.getDateStamp(new SimpleDateFormat("yyyyMMddkkmmssSSS")));
	private final CommonBaseTest commonBaseTest = new CommonBaseTest();

	public static int seMethodCount = 0;
	private Browser.Browsers currentBrowser;

	// Sauce Labs
	private final String USERNAME = "saignapika";
	private final String ACCESS_KEY = "34455b8c-cc8b-4788-ba89-be2b9125b050";
	private final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	//private final String GridURL = "http://ho-ap-d98.intranet.secura.net:4444/wd/hub";
	private Method method;

	/**
	 * Construct basic SeHelper object. You need to call startSession(Browser)
	 * to fully wire the helper for testing.
	 */
	public SeHelper() {
	}

	/**
	 * Construct basic SeHelper object, already configured for a browser.
	 *
	 * You need to call startSession to fully wire the helper for testing.
	 *
	 * @param browser
	 *            Browser you want to test against
	 */
	public SeHelper(Browser.Browsers browser) {
		this.currentBrowser = browser;
	}

	/**
	 * Safely builds a new Settings object, used to allow Settings to be final.
	 *
	 * TODO: This can be factored out once SeHelper can throw exceptions on
	 * construction (test refactoring).
	 *
	 * @return Settings object, or null if unable to construct.
	 */
	private Settings buildSettings() {
		Settings output = null;
		try {
			output = new Settings();
		} catch (ConfigurationException e) {
			System.err.println("Error loading settings: " + e.getMessage());
			e.printStackTrace();
		}
		return output;
	}

	/**
	 * Current Browser Type for this session
	 */
	public Browsers currentBrowser() {
		return currentBrowser;
	}

	/**
	 * Browser object backing this SeHelper object;
	 */
	public Browser browser() {
		return browser;
	}

	/**
	 * WebDriver object backing this SeHelper object;
	 */
	public WebDriver driver() {
		return driver;
	}

	/**
	 * Element object backing this SeHelper object;
	 */
	public Element element() {
		return element;
	}

	/**
	 * Verification object backing this SeHelper object;
	 */
	public Verification verify() {
		return verification;
	}

	/**
	 * Log object backing this SeHelper object;
	 */
	public Log log() {
		return log;
	}

	/**
	 * Data object backing this SeHelper object;
	 */
	public Data data() {
		return data;
	}

	/**
	 * Settings object backing this SeHelper object;
	 */
	public Settings settings() {
		return settings;
	}

	/**
	 * Util object backing this SeHelper object;
	 */
	public Util util() {
		return util;
	}

	/**
	 * Set the orientation for mobile before calling newDriver
	 * 
	 * @param orientation
	 */

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Create a new WebDriver object for the specified browser and pointed at
	 * the specific proxy
	 *
	 * @param myBrowser
	 *            Browser to create for
	 * @param proxy
	 *            Proxy to use
	 */
	public void startSession(Browsers myBrowser, Proxy proxy) {
System.out.println("before start session");
		startSession(myBrowser, buildDriver(myBrowser, proxy));

		log().setTcBrowserName(browser().getBrowserName());
		log().setTcBrowserVersion(browser().getBrowserVersion());
		browser().maximizeBrowser();
	}

	/**
	 * Starts a Browser session using the specified Browser and pre-created
	 * WebDriver
	 *
	 * @param myBrowser
	 *            Browser to create for
	 * @param driver
	 *            WebDriver to use
	 */
	public void startSession(Browsers myBrowser, WebDriver driver) {
		this.currentBrowser = myBrowser;
		this.driver = driver;
	}

	/**
	 * Starts a Browser session using the specified Browser
	 *
	 * @param myBrowser
	 *            Browser to create for
	 */
	public void startSession(Browsers myBrowser) {
		Proxy proxy = new Proxy();

		proxy.setAutodetect(true);

		startSession(myBrowser, proxy);
	}

	/**
	 * Starts a Browser session using the currentBrowser
	 */
	public void startSession() {
		startSession(currentBrowser);
	}

	@SuppressWarnings("static-access")
	private WebDriver buildDriver(Browsers myBrowser, Proxy proxy) {
		WebDriver driver = null;

		DesiredCapabilities capabilities = null;
		LoggingPreferences loggingPreferences = new LoggingPreferences();
		ChromeOptions chromeOptions;

		SeHelper se = new SeHelper();
		//se.util().sleep(2000);
		// String sMethodName = CommonBaseTest.myMethods[seMethodCount];
		// seMethodCount++;

		String SEnvname = commonBaseTest.getEnv();
		System.out.println(SEnvname);
		String sUserName = OSTools.getUsername();
		System.out.println("inside Builddriver start session");
		// getMethod(method);

		try {
			switch (myBrowser) {

			case Chrome:
				capabilities = DesiredCapabilities.chrome();
				System.setProperty("webdriver.chrome.driver",getChromedriverPath());
				 chromeOptions = new ChromeOptions();
				 chromeOptions.addArguments("--disable-infobars");
				 chromeOptions.addArguments("--no-sandbox");
				// chromeOptions.addArguments("--incognito");
				
				
//				chromeOptions1.addArguments("--proxy-server='direct://'");
//				chromeOptions1.addArguments("--proxy-bypass-list=*");
				 chromeOptions.addArguments("auth-server-whitelist=*.intranet.secura.net");
				 chromeOptions.addArguments("auth-negotiate-delegatewhitelst=*.intranet.secura.net");
				 chromeOptions.addArguments("auth-schemes=digest,ntlm,negotiate");
	             

				 chromeOptions.setExperimentalOption("useAutomationExtension", false);
				 chromeOptions.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));

				capabilities.setCapability(CapabilityType.PROXY, proxy);
				capabilities.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setCapability (CapabilityType.ACCEPT_INSECURE_CERTS, true);
				
				capabilities.setJavascriptEnabled(true);
				capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
				addChromeExtension(capabilities);
				System.out.println(capabilities);
				driver = new ChromeDriver(capabilities);
				driver.manage().deleteAllCookies();
				break;
			case InternetExplorer:
				capabilities = DesiredCapabilities.internetExplorer();
				System.setProperty("webdriver.ie.driver", getIEDriverPath());
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setJavascriptEnabled(true);
				capabilities.setCapability("requireWindowFocus", true);
				capabilities.setCapability("nativeEvents", false);
				capabilities.setCapability("unexpectedAlertBehaviour", "accept");
				capabilities.setCapability("disable-popup-blocking", true);
				capabilities.setCapability("enablePersistentHover", true);
				capabilities.setCapability("ignoreZoomSetting", true);
				capabilities.setCapability("ie.ensureCleanSession", true);
				driver = new InternetExplorerDriver(capabilities);
				break;

			case VMChrome:
				capabilities = DesiredCapabilities.chrome();
				System.setProperty("webdriver.chrome.driver", getChromedriverPath());
				capabilities.setCapability(CapabilityType.PROXY, proxy);
				addChromeExtension(capabilities);
				driver = new ChromeDriver(capabilities);
				break;
			case VMIE:
				capabilities = DesiredCapabilities.internetExplorer();
				System.setProperty("webdriver.ie.driver", getIEDriverPath());
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
				capabilities.internetExplorer().setCapability("ignoreProtectedModeSettings", true);
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setJavascriptEnabled(true);
				capabilities.setCapability("requireWindowFocus", true);
				capabilities.setCapability("enablePersistentHover", false);
				capabilities.setCapability("nativeEvents", false);
				capabilities.setCapability("unexpectedAlertBehaviour", "accept");
				capabilities.setCapability("disable-popup-blocking", true);
				capabilities.setCapability("enablePersistentHover", true);
				driver = new InternetExplorerDriver(capabilities);

				break;

			case GridChrome:
				capabilities = DesiredCapabilities.chrome();
				capabilities.setBrowserName("chrome");
				capabilities.setPlatform(Platform.WINDOWS);
				
				//System.setProperty("webdriver.chrome.driver",getChromedriverPath());
				 chromeOptions = new ChromeOptions();
				 chromeOptions.addArguments("--disable-infobars");
				 chromeOptions.addArguments("--no-sandbox");
				// chromeOptions.addArguments("--incognito");
				
				
//				chromeOptions1.addArguments("--proxy-server='direct://'");
//				chromeOptions1.addArguments("--proxy-bypass-list=*");
				 chromeOptions.addArguments("auth-server-whitelist=*.intranet.secura.net");
				 chromeOptions.addArguments("auth-negotiate-delegatewhitelst=*.intranet.secura.net");
				 chromeOptions.addArguments("auth-schemes=digest,ntlm,negotiate");
	             

				 chromeOptions.setExperimentalOption("useAutomationExtension", false);
				 chromeOptions.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));

				capabilities.setCapability(CapabilityType.PROXY, proxy);
				capabilities.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setCapability (CapabilityType.ACCEPT_INSECURE_CERTS, true);
				
				capabilities.setJavascriptEnabled(true);
				capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
				addChromeExtension(capabilities);
				System.out.println(capabilities);
				/*driver = new ChromeDriver(capabilities);
				driver.manage().deleteAllCookies();*/
//------------------------------------------------------------
				
				chromeOptions.setBinary("C:/NewGC/Google/Chrome/Application/chrome.exe");
				chromeOptions.merge(capabilities);
				driver = new RemoteWebDriver(getSeGridUrl(), chromeOptions);
				/* try {
					 System.out.println("before remote driver grid -");
					driver = new RemoteWebDriver(new URL("http://ho-ap-d98.intranet.secura.net:4444/wd/hub"), capabilities);
					 System.out.println("before remote driver grid -");
				 } catch (MalformedURLException e1) {
					System.out.println("Exception while driver initiation in chrome"+e1);
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
				// System.setProperty("Webdriver.chorme.driver",
				// "C:\\AutomationCodeCleanup\\PWRateComparision\\Drivers\\chromedriver.exe");
				// capabilities.setCapability(CapabilityType.PROXY, proxy);
				// capabilities.setBrowserName("chrome");
				// capabilities.setPlatform(Platform.WINDOWS);
				// capabilities.setCapability("chrome.switches",Arrays.asList("--no-sandbox"));
				// addChromeExtension(capabilities);
				// driver = (new Augmenter()).augment(new
				// RemoteWebDriver(getSeGridUrl(), capabilities));
				// ((RemoteWebDriver)driver).setFileDetector(new
				// LocalFileDetector());
				se.log().logSeStep("size of the window before maximise - "+driver.manage().window().getSize());
				//driver.manage().window().setPosition(new Point(0, 0));
				driver.manage().window().setSize(new Dimension(1600,900));
				se.log().logSeStep("size of the window after maximise - "+driver.manage().window().getSize());
				break;

			case GridInternetExplorer:
				capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setJavascriptEnabled(true);
				capabilities.setCapability("requireWindowFocus", true);
				capabilities.setCapability("enablePersistentHover", false);
				capabilities.setCapability("nativeEvents", false);
				capabilities.setCapability("unexpectedAlertBehaviour", "accept");
				capabilities.setCapability("disable-popup-blocking", true);
				capabilities.setCapability("enablePersistentHover", true);
				capabilities.setCapability("ignoreZoomSetting", true);
				capabilities.setCapability("ie.ensureCleanSession", true);
				driver = (new Augmenter()).augment(new RemoteWebDriver(getSeGridUrl(), capabilities));
				((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
				break;

			case SauceChrome:

				capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability("platform", "Windows 8");
				capabilities.setCapability("version", "44.0");
				se.util().sleep(15000);
				seMethodCount++;
				se.log.logSeStep(" array values " + seMethodCount + " - " + CommonBaseTest.myMethods[6]);
				String sMethodName = CommonBaseTest.myMethods[seMethodCount];

				capabilities.setCapability("name", sMethodName + " by " + sUserName + " on " + SEnvname);

				try {
					driver = new RemoteWebDriver(new URL(URL), capabilities);
					((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case SauceIE:
				capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability("platform", "Windows 8.1");
				capabilities.setCapability("version", "11.0");
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
				capabilities.internetExplorer().setCapability("ignoreProtectedModeSettings", true);
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setJavascriptEnabled(true);
				capabilities.setCapability("requireWindowFocus", true);
				capabilities.setCapability("enablePersistentHover", false);
				capabilities.setCapability("nativeEvents", false);
				capabilities.setCapability("unexpectedAlertBehaviour", "accept");
				capabilities.setCapability("disable-popup-blocking", true);
				capabilities.setCapability("enablePersistentHover", true);
				se.util().sleep(15000);

				seMethodCount++;
				String sMethodNameIE = CommonBaseTest.myMethods[seMethodCount];
				se.log.logSeStep(" Method name in WebDriver : " + sMethodNameIE);

				capabilities.setCapability("name", sMethodNameIE + " by " + sUserName + " on " + SEnvname);
				try {
					driver = new RemoteWebDriver(new URL(URL), capabilities);
					((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());

				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			default:
				return null;
			}
		} catch (UnreachableBrowserException e) {
			System.out.println("Browser Not Reachable, Grid may be down");
			System.out.println(e.getMessage());
			return null;
		}
		return driver;
	}

	private URL getSeGridUrl() {
		URL seGrid = null;
		try {
			seGrid = new URL(settings().value("sehelper.seleniumGrid"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return seGrid;
	}

	/**
	 * Add system property specified chrome extension to chrome capabilities
	 *
	 * @param capabilities
	 *            DesiredCapabilities to add capabilities to
	 */
	private void addChromeExtension(DesiredCapabilities capabilities) {
		// String chromeExtension =
		// settings().value("sehelper.chromeExtension");
		String chromeExtension = "";
		if (chromeExtension != null && !chromeExtension.isEmpty()) {
			ChromeOptions options = new ChromeOptions();
			options.addExtensions(new File(chromeExtension));
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		}
	}

	/**
	 * Returns full path to the IEDriverServer
	 *
	 * @return full path to IEDriverServer
	 */
	public String getIEDriverPath() {
		return OSTools.getUserHome() + "/selenium/IEDriverServer.exe";
	}

	/**
	 * Returns full path to the chromedriver executable
	 *
	 * @return full path to chromedriver
	 */
	public String getChromedriverPath() {
		String chomedriverFilename = "chromedriver.exe";
		return OSTools.getUserHome() + "/selenium/" + chomedriverFilename;
	}

	// toString returns the "currentBrowser" so the reports look all pretty
	// like.
	@Override
	public String toString() {
		if (currentBrowser != null)
			return currentBrowser.toString();
		else
			return "none";
	}
	
	public void getHost(ExtentTest test) {
		 
		
	       
	       
	        try {
	        	InetAddress ip = InetAddress.getLocalHost();
	        	String hostname = ip.getHostName();
	        	
	        	if(hostname.equalsIgnoreCase("HO-AP-D98"))
	        	{
	            test.log(LogStatus.INFO,"<b style='color:green;'>Executing  Scripts in Jenkins machine #</b>", "<b style='background-color : yellow;'>"+hostname+"</b>");
	        	}
	        	else
	        	{
		            test.log(LogStatus.INFO,"<b style='color:green;'>Executing  Scripts in local machine #</b>", "<b style='background-color : yellow;'>"+hostname+"</b>");

	        	}
	        } catch (UnknownHostException e) {
	 
	            e.printStackTrace();
	        }
	    }
	

}

