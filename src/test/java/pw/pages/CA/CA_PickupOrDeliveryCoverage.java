package pw.pages.CA;

/**
 * @author ${pr09529}
 */

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CA;
import pw.OR.OR_CP;
import pw.OR.OR_GL;

public class CA_PickupOrDeliveryCoverage extends OR_CA{
	
	public void PickupOrDeliveryCoverage(String strRegressionID, String transaction ,String suspendSheet , ExtentTest test) throws IOException {
		try{
		
		if(suspendSheet.equalsIgnoreCase(constants.CA_PickupOrDeliveryCoverage)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_PickupOrDeliveryCoverage, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strPickUpOrDeliveryInfo_TXT_Range = (String) row.get("PickUpOrDeliveryInfo_TXT_Range");
			String strPickUpOrDeliveryInfo_TXT_NumberOfDrivers = (String) row.get("PickUpOrDeliveryInfo_TXT_NumberOfDrivers");
			String strPickUpOrDeliveryInfo_TXT_NumberOTrips = (String) row.get("PickUpOrDeliveryInfo_TXT_NumberOTrips");
			String strPickUpOrDeliveryInfo_TXT_Range1 = (String) row.get("PickUpOrDeliveryInfo_TXT_Range1");
			String strPickUpOrDeliveryInfo_TXT_NumberOfDrivers1 = (String) row.get("PickUpOrDeliveryInfo_TXT_NumberOfDrivers1");
			String strPickUpOrDeliveryInfo_TXT_NumberOTrips_1 = (String) row.get("PickUpOrDeliveryInfo_TXT_NumberOTrips_1");
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("CA_PickupOrDeliveryCoverage");
				test.log(LogStatus.INFO, "CA_PickupOrDeliveryCoverage page","Transaction Step : "+strTestDescription + "<br>" +"Page : GL_AdditionalInterest_Details");
				se.verify().verifyEquals("CA_PickupOrDeliveryCoverage Page of PowerWriter ", getCA_PickupOrDeliveryCoverage_LabelName().isDisplayed(),true, true,test);

					se.element().enterOrValidateText(getPickUpOrDeliveryInfo_TXT_Range(strPickUpOrDeliveryInfo_TXT_Range),strPickUpOrDeliveryInfo_TXT_Range,test);
					se.element().enterOrValidateText(getPickUpOrDeliveryInfo_TXT_NumberOfDrivers(strPickUpOrDeliveryInfo_TXT_NumberOfDrivers),strPickUpOrDeliveryInfo_TXT_NumberOfDrivers,test);
					se.element().enterOrValidateText(getPickUpOrDeliveryInfo_TXT_NumberOTrips(strPickUpOrDeliveryInfo_TXT_NumberOTrips),strPickUpOrDeliveryInfo_TXT_NumberOTrips,test);
					se.element().enterOrValidateText(getPickUpOrDeliveryInfo_TXT_Range1(strPickUpOrDeliveryInfo_TXT_Range1),strPickUpOrDeliveryInfo_TXT_Range1,test);
					se.element().enterOrValidateText(getPickUpOrDeliveryInfo_TXT_NumberOfDrivers1(strPickUpOrDeliveryInfo_TXT_NumberOfDrivers1),strPickUpOrDeliveryInfo_TXT_NumberOfDrivers1,test);
					se.element().enterOrValidateText(getPickUpOrDeliveryInfo_TXT_NumberOTrips_1(strPickUpOrDeliveryInfo_TXT_NumberOTrips_1),strPickUpOrDeliveryInfo_TXT_NumberOTrips_1,test);

					se.element().clickElement(getNext());
					se.util().sleep(2000);
					
			
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_PickupOrDeliveryCoverage ", true, false, true, test);
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
		
