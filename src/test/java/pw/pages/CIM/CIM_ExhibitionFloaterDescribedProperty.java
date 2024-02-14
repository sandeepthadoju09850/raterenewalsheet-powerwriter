package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CIM;

public class CIM_ExhibitionFloaterDescribedProperty extends OR_CIM {
	

public void CIMExhibitionFloaterDescribedProperty(String strRegressionID,String transaction,ExtentTest test) throws IOException {
	try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_ExhibitionFloatrDescrbdProp")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_ExhibitionFloatrDescrbdProp", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIMExhibitionFloaterDescribedProperty_BTN_Add = (String) row.get("CIMExhibitionFloaterDescribedProperty_BTN_Add");
		String strCIMExhibitionFloaterDescribedProperty_BTN_Details = (String) row.get("CIMExhibitionFloaterDescribedProperty_BTN_Details");
		String strCIMExhibitionFloaterDescribedProperty_TXT_DescribedProperty = (String) row.get("CIMExhibitionFloaterDescribedProperty_TXT_DescribedProperty");
		String strCIMExhibitionFloaterDescribedProperty_TXT_ItemNo = (String) row.get("CIMExhibitionFloaterDescribedProperty_TXT_ItemNo");
		String strCIMExhibitionFloaterDescribedProperty_BTN_Done = (String) row.get("CIMExhibitionFloaterDescribedProperty_BTN_Done");
		try{

		test.log(LogStatus.INFO, "CIMExhibitionFloaterDescribedProperty","Transaction Step : " + transaction + "<br>" + "Page : CIMExhibitionFloaterDescribedProperty");
		se.verify().verifyEquals("CIMExhibitionFloaterDescribedProperty Page of PowerWriter ", getCIMExhibitionFloaterDescribedProperty_LBL_ExhibitionFloaterDescribedProperty("CIMExhibitionFloaterDescribedProperty").isDisplayed(),true, true,test);
		
		if((strCIMExhibitionFloaterDescribedProperty_BTN_Add.equalsIgnoreCase(constants.Yes))){
			se.element().Click(getCIMExhibitionFloaterDescribedProperty_BTN_Add(strCIMExhibitionFloaterDescribedProperty_BTN_Add),test);
			se.verify().verifyEquals("CIMExhibitionFloaterDescribedProperty Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
		}
		if((strCIMExhibitionFloaterDescribedProperty_BTN_Details.equalsIgnoreCase(constants.Yes))){
		se.element().tryClick(getCIMExhibitionFloaterDescribedProperty_BTN_Details(strCIMExhibitionFloaterDescribedProperty_BTN_Details),test);
		se.verify().verifyEquals("CIMExhibitionFloaterDescribedProperty Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
		}
			se.element().enterOrValidateText(getCIMExhibitionFloaterDescribedProperty_TXT_ItemNo(strCIMExhibitionFloaterDescribedProperty_TXT_ItemNo),strCIMExhibitionFloaterDescribedProperty_TXT_ItemNo,test);
			se.element().enterOrValidateText(getCIMExhibitionFloaterDescribedProperty_TXT_DescribedProperty(strCIMExhibitionFloaterDescribedProperty_TXT_DescribedProperty),strCIMExhibitionFloaterDescribedProperty_TXT_DescribedProperty,test);
			se.element().Click(getNext(),test);
					
		if((strCIMExhibitionFloaterDescribedProperty_BTN_Done.equalsIgnoreCase(constants.Yes))){
		se.element().Click(getDone(),test);
		}
					
					
	
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details for CIMExhibitionFloaterDescribedProperty ", true, false, true, test);
	
}
		iteration++;
	}

}
catch (Exception e) {
// TODO: handle exception
se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
testTearDown(se, test);
}

}
}
