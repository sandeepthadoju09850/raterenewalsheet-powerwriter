package Libraries.automation.common;

import java.net.Socket;
import java.io.IOException;
import java.net.UnknownHostException;

public class SystemPropertyUtil {
	
		
	private final static String windowWidthKey = "window.width";
	private final static String windowHeightKey = "window.height";
	private final static String testDataDirectorykey = "test.data.directory";
	private final static String httpCredentialsKey = "http.credentials";
	private final static String browsersKey = "browsers";	
	private final static String baseUrlKey = "basepw.url";
	private final static String localeUrlKey = "locale.url";
	private final static String baseUrlDefault = "https://hopw49.intranet.secura.net/";
	private final static String localeUrlDefault = "";
	private final static String rrsdevKey = "RRSdev.url";
	private final static String rrsstageKey = "RRSstage.url";
	private final static String rrsQAKey = "RRSQA.url";
	private final static String rrsDevUrlDefault = "https://dev-web.intranet.secura.net/renewalrateworksheet/Commercial/Account";
	private final static String rrsStageUrlDefault ="https://stage-web.intranet.secura.net/renewalrateworksheet/Commercial/Account";
	private final static String rrsQAUrlDefault ="https://qa-web.intranet.secura.net/renewalrateworksheet/Commercial/Search";
	//Default values
	private final static String ControlDateDefault = "";
	private final static String ControlDate = "Control.Date";
	private final static String popupUrlDefault = "";
	private final static String popupUrlKey = "pop.url";
	private final static int windowWidthDefault = 1920;
	private final static int windowHeightDefault = 1080;
	private final static String testDataDirectoryDefault = "target/test-classes";
	private final static String httpCredentialsDefault = "true";
	private final static String browsersDefault = "Chrome";
	private final static String EffectiveDateDefault = "";
	private final static String EffectiveDate = "Effective.Date";
	
	private final static int windowWidth = System.getProperties().containsKey(windowWidthKey) ? Integer.parseInt(System.getProperty(windowWidthKey)) : windowWidthDefault;		
	private final static int windowHeight =System.getProperties().containsKey(windowHeightKey) ? Integer.parseInt(System.getProperty(windowHeightKey)) : windowHeightDefault;
	private final static String browsers =System.getProperties().containsKey(browsersKey) ? System.getProperty(browsersKey) : browsersDefault; //new enums
	
	private final static String testDataDirectory = System.getProperties().containsKey(testDataDirectorykey) ? System.getProperty(testDataDirectorykey) : testDataDirectoryDefault;
	private final static boolean httpCredentials = Boolean.parseBoolean(System.getProperties().containsKey(httpCredentialsKey) ? System.getProperty(httpCredentialsKey) : httpCredentialsDefault);

	
	private final static String baseUrl = System.getProperties().containsKey(baseUrlKey) ? System.getProperty(baseUrlKey) : baseUrlDefault;
	private final static String localeUrl = System.getProperties().containsKey(localeUrlKey) ? System.getProperty(localeUrlKey) : localeUrlDefault;
	private final static String popupUrl = System.getProperties().containsKey(popupUrlKey) ? System.getProperty(popupUrlKey) : popupUrlDefault;
	
	private final static String rrsdevUrl = System.getProperties().containsKey(rrsdevKey) ? System.getProperty(rrsdevKey) : rrsDevUrlDefault;
	private final static String effectivedate = System.getProperties().containsKey(EffectiveDate) ? System.getProperty(EffectiveDate) : EffectiveDateDefault;
	private final static String controldate = System.getProperties().containsKey(ControlDate) ? System.getProperty(ControlDate) : ControlDateDefault;

	private final static String rrsqaUrl = System.getProperties().containsKey(rrsQAKey) ? System.getProperty(rrsQAKey) : rrsQAUrlDefault;
	private final static String rrsstageUrl = System.getProperties().containsKey(rrsstageKey) ? System.getProperty(rrsstageKey) : rrsStageUrlDefault;
	
	public static String getBaseUrl() {
		return baseUrl;
	}
	public static String getrrsDevUrl() {
		return rrsdevUrl;
	}
	public static String getrrsQAUrl() {
		return rrsqaUrl;
	}
	public static String getrrsStageUrl() {
		return rrsstageUrl;
	}
	
	public static String getLocale() {
		return localeUrl;
	}

	public static int getWindowWidth() {
		return windowWidth;
	}
	
	public static String getEff_Date() {
		return effectivedate;
	}
	public static int getWindowHeight() {
		return windowHeight;
	}
	public static String getCont_Date() {
		return controldate;
	}
	public static String getTestDataDirectory() {
		return testDataDirectory;
	}
	
	public static boolean getHttpCredentials() {
		return httpCredentials;
	}
	
	public static String getPopup() {
		return popupUrl;
	}
	
	public static String getBrowsers() {
		//translate old style to new SeHelper enums		
		return browsers;
	}
	
	public static String getBaseStoreUrl()
	{
		return getBaseUrl();
	}
	
	public static String getRrsDeveUrl()
	{
		return getrrsDevUrl();
	}
	public static String getRrsQAUrl()
	{
		return getrrsQAUrl();
	}
	public static String getRrsStageUrl()
	{
		return getrrsStageUrl();
	}
	public static String getEffectiveDate()
	{
		return getEff_Date();
	}
	public static String getPopupUrl()
	{
		return getPopup();
	}
	public static String getControlDate()
	{
		return getCont_Date();
	}

}
