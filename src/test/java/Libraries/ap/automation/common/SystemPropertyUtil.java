package Libraries.ap.automation.common;

public class SystemPropertyUtil {
	
		
	private final static String windowWidthKey = "window.width";
	private final static String windowHeightKey = "window.height";
	private final static String testDataDirectorykey = "test.data.directory";
	private final static String httpCredentialsKey = "http.credentials";
	private final static String browsersKey = "browsers";	
	private final static String baseUrlKey = "base.url";
	//private final static String basePerfUrlKey = "base.Perfurl";
	
	private final static String localeUrlKey = "locale.url";
	private final static String baseUrlDefault = "";
	private final static String localeUrlDefault = "";
	private final static String popupUrlKey = "pop.url";
	private final static String CSSUrlKey = "css.url";
	private final static String popupUrl1Key = "pop.url1";
	private final static String popupUrlDefault = "";
	private final static String pwUrlKey = "pw.url";
	private final static String pwUrlDefault = "";
	private final static String crcUrlKey = "crc.url";
	private final static String crcUrlDefault = "";
	private final static String EffectiveDateDefault = "";
	private final static String EffectiveDate = "Effective.Date";
	private final static String ControlDateDefault = "";
	private final static String ControlDate = "Control.Date";


	
	
	
	//Default values
	private final static int windowWidthDefault = 1920;
	private final static int windowHeightDefault = 1080;
	private final static String testDataDirectoryDefault = "target/test-classes";
	private final static String httpCredentialsDefault = "true";
	private final static String browsersDefault = "Chrome";

	
	private final static int windowWidth = System.getProperties().containsKey(windowWidthKey) ? Integer.parseInt(System.getProperty(windowWidthKey)) : windowWidthDefault;		
	private final static int windowHeight =System.getProperties().containsKey(windowHeightKey) ? Integer.parseInt(System.getProperty(windowHeightKey)) : windowHeightDefault;
	private final static String browsers =System.getProperties().containsKey(browsersKey) ? System.getProperty(browsersKey) : browsersDefault; //new enums
	
	private final static String testDataDirectory = System.getProperties().containsKey(testDataDirectorykey) ? System.getProperty(testDataDirectorykey) : testDataDirectoryDefault;
	private final static boolean httpCredentials = Boolean.parseBoolean(System.getProperties().containsKey(httpCredentialsKey) ? System.getProperty(httpCredentialsKey) : httpCredentialsDefault);

	
	private final static String baseUrl = System.getProperties().containsKey(baseUrlKey) ? System.getProperty(baseUrlKey) : baseUrlDefault;
	//private final static String baseperfUrl = System.getProperties().containsKey(basePerfUrlKey) ? System.getProperty(basePerfUrlKey) : baseUrlDefault;
	private final static String localeUrl = System.getProperties().containsKey(localeUrlKey) ? System.getProperty(localeUrlKey) : localeUrlDefault;
	private final static String popupUrl = System.getProperties().containsKey(popupUrlKey) ? System.getProperty(popupUrlKey) : popupUrlDefault;
	private final static String popupUrl1 = System.getProperties().containsKey(popupUrl1Key) ? System.getProperty(popupUrl1Key) : popupUrlDefault;

	private final static String cssUrl = System.getProperties().containsKey(CSSUrlKey) ? System.getProperty(CSSUrlKey) : popupUrlDefault;

	private final static String pwUrl = System.getProperties().containsKey(pwUrlKey) ? System.getProperty(pwUrlKey) : pwUrlDefault;
	
	private final static String crcUrl = System.getProperties().containsKey(crcUrlKey) ? System.getProperty(crcUrlKey) : crcUrlDefault;
	private final static String effectivedate = System.getProperties().containsKey(EffectiveDate) ? System.getProperty(EffectiveDate) : EffectiveDateDefault;
	private final static String controldate = System.getProperties().containsKey(ControlDate) ? System.getProperty(ControlDate) : ControlDateDefault;
	
	public static String getBaseUrl() {
		return baseUrl;
	}
	
	/*public static String getBaseperfUrl() {
		return baseperfUrl;
	}*/
	public static String getLocale() {
		return localeUrl;
	}
	public static String getEff_Date() {
		return effectivedate;
	}
	
	public static String getCont_Date() {
		return controldate;
	}
	public static String getPopup() {
		return popupUrl;
	}
	public static String getPopup1() {
		return popupUrl1;
	}
	
	public static String getCSS() {
		return cssUrl;
	}
	
	public static String getPw() {
		return pwUrl;
	}
	
	public static String getCRC(){
		return crcUrl;
	}

	public static int getWindowWidth() {
		return windowWidth;
	}
	
	public static int getWindowHeight() {
		return windowHeight;
	}
	
	public static String getTestDataDirectory() {
		return testDataDirectory;
	}
	
	public static boolean getHttpCredentials() {
		return httpCredentials;
	}
	
	
	public static String getBrowsers() {
		//translate old style to new SeHelper enums		
		return browsers;
	}
	
	public static String getBaseStoreUrl()
	{
		return getBaseUrl();
	}
	/*public static String getBaseperformanceUrl()
	{
		return getBaseperfUrl();
	}*/
	public static String getLocalUrl()
	{
		return getLocale();
	}
	public static String getPopupUrl()
	{
		return getPopup();
	}
	public static String getEffectiveDate()
	{
		return getEff_Date();
	}
	
	public static String getControlDate()
	{
		return getCont_Date();
	}
	
	public static String getCSSUrl()
	{
		return getCSS();
	}
	
	public static String getPwUrl()
	{
		return getPw();
	}
	
	public static String getCRCUrl()
	{
		return getCRC();
	}
	
}
