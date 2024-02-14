package Libraries.automation.common.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Libraries.automation.common.CommonPage;
import Libraries.automation.common.SeHelper;

public class CommonPageFactory
{

  public static <T> T initElements(WebDriver driver, java.lang.Class<T> pageClassToProxy) {
   T obj = PageFactory.initElements(driver, pageClassToProxy);
   SeHelper se = new SeHelper();
   se.setDriver(driver);
   ((CommonPage)obj).setSeHelper(se);
 
   return obj;
  }
  
  public static <T> T initElements(SeHelper se, java.lang.Class<T> pageClassToProxy) {
	   T obj = PageFactory.initElements(se.driver(), pageClassToProxy);
	   ((CommonPage)obj).setSeHelper(se);
	   return obj;
	  }
  
}

