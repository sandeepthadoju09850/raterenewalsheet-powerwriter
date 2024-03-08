package Libraries.ap.automation.common.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Libraries.ap.automation.common.Page;
import Libraries.ap.automation.common.SeHelper;

public class TestPageFactory extends CommonPageFactory {
	
	public static <T> T initElements(WebDriver driver, java.lang.Class<T> pageClassToProxy) {
		T obj = PageFactory.initElements(driver, pageClassToProxy);
		SeHelper se = new SeHelper();
		se.setDriver(driver);
		((Page) obj).setSeHelper(se);

		return obj;
	}

	public static <T> T initElements(SeHelper se, java.lang.Class<T> pageClassToProxy) {
		T obj = PageFactory.initElements(se.driver(), pageClassToProxy);
		((Page) obj).setSeHelper(se);
		return obj;
	}

}