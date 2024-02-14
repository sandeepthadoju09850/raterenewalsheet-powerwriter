package pw.pages.COMMON;

import java.io.IOException;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;

import pw.OR.OR_Common;

public class PW_Logout extends OR_Common {
	
	public void PWAppLogout(ExtentTest test) throws IOException {
		//Logic for logout
		se.element().Click(getProfile_BTN(), test);
		se.element().Click(getLogout_BTN(), test);
		
		
	}

}
