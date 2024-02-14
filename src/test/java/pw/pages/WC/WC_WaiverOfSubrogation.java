package pw.pages.WC;
/**
* @author ${ra09491}
*/
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_WC;

public class WC_WaiverOfSubrogation extends OR_WC {
public void WaiverOfSubrogation(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			
		    if(suspendSheet.equalsIgnoreCase(constants.WCLocations)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.WC_WaiverOfSubrogation, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
				String strWaiverOfSubrogation_BTN_Add = (String) row.get("WaiverOfSubrogation_BTN_Add");
				String strWaiverOfSubrogation_BTN_Details = (String) row.get("WaiverOfSubrogation_BTN_Details");
				String strWaiverOfSubrogation_BTN_Done = (String) row.get("WaiverOfSubrogation_BTN_Done");
				String strWaiverOfSubrogation_BTN_Delete = (String) row.get("WaiverOfSubrogation_BTN_Delete");
				String strWaiverOfSubrogation_TXT_ContractIDOrNum = (String) row.get("WaiverOfSubrogation_TXT_ContractIDOrNum");
				String strWaiverOfSubrogation_TXT_WaiverType = (String) row.get("WaiverOfSubrogation_TXT_WaiverType");
				String strWaiverOfSubrogation_TXT_EntityType = (String) row.get("WaiverOfSubrogation_TXT_EntityType");
				String strWaiverOfSubrogation_TXT_EntityName = (String) row.get("WaiverOfSubrogation_TXT_EntityName");
				String strWaiverOfSubrogation_TXT_Street = (String) row.get("WaiverOfSubrogation_TXT_Street");
				String strWaiverOfSubrogation_TXT_SteUnit = (String) row.get("WaiverOfSubrogation_TXT_SteUnit");
				String strWaiverOfSubrogation_TXT_City = (String) row.get("WaiverOfSubrogation_TXT_City");
				String strWaiverOfSubrogation_DDN_State = (String) row.get("WaiverOfSubrogation_DDN_State");
				String strWaiverOfSubrogation_TXT_Zip = (String) row.get("WaiverOfSubrogation_TXT_Zip");
				String strWaiverOfSubrogation_TXT_DescriptionOfWorkOrProject = (String) row.get("WaiverOfSubrogation_TXT_DescriptionOfWorkOrProject");
				String strWaiverOfSubrogation_TXT_WaiverPercentage = (String) row.get("WaiverOfSubrogation_TXT_WaiverPercentage");
				String strWaiverOfSubrogation_TXT_WaiverMinAmt = (String) row.get("WaiverOfSubrogation_TXT_WaiverMinAmt");
				String strWaiverOfSubrogation_TXT_WaiverFlatFee = (String) row.get("WaiverOfSubrogation_TXT_WaiverFlatFee");
				String strWaiverOfSubrogation_TXT_Add_SpecificClassificationInfo = (String) row.get("WaiverOfSubrogation_TXT_Add_SpecificClassificationInfo");
				String strWaiverOfSubrogation_TXT_ClassCode = (String) row.get("WaiverOfSubrogation_TXT_ClassCode");
				String strWaiverOfSubrogation_TXT_DescriptionCode = (String) row.get("WaiverOfSubrogation_TXT_DescriptionCode");
				String strWaiverOfSubrogation_TXT_DescClass = (String) row.get("WaiverOfSubrogation_TXT_DescClass");
				String strWaiverOfSubrogation_TXT_ClassExposure = (String) row.get("WaiverOfSubrogation_TXT_ClassExposure");
				String strWaiverOfSubrogation_TXT_USLH_IND = (String) row.get("WaiverOfSubrogation_TXT_USLH_IND");
				String strWaiverOfSubrogation_TXT_AnnualExp = (String) row.get("WaiverOfSubrogation_TXT_AnnualExp");
				String strWaiverOfSubrogation_TXT_NextButton = (String) row.get("WaiverOfSubrogation_TXT_NextButton");
				
			
				try
				{
					se.log().logSeStep("WC_WaiverOfSubrogation");
					test.log(LogStatus.INFO, "WC_WaiverOfSubrogation","Transaction Step : "+ transaction + "<br>" +"Page : WC_WaiverOfSubrogation");
					se.verify().verifyEquals("WC_WaiverOfSubrogation page of PowerWriter ", getWaiverOfSubrogation_TXT_LabelName().isDisplayed(),true, true,test);
	
					
					if(strWaiverOfSubrogation_BTN_Add.equalsIgnoreCase("Yes")){
						se.element().Click(getWaiverOfSubrogation_BTN_Add(strWaiverOfSubrogation_BTN_Add),strWaiverOfSubrogation_BTN_Add,test);
						
					}
					
					if(!strWaiverOfSubrogation_BTN_Details.equalsIgnoreCase("N/A")){
						se.element().Click(getWaiverOfSubrogation_BTN_Details(strWaiverOfSubrogation_BTN_Details),strWaiverOfSubrogation_BTN_Details,test);
					}
					
					if(strWaiverOfSubrogation_BTN_Delete.equalsIgnoreCase("Yes")){
						se.element().Click(getWaiverOfSubrogation_BTN_Delete(strWaiverOfSubrogation_BTN_Delete),strWaiverOfSubrogation_BTN_Delete,test);
					}
					
	
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_ContractIDOrNum(strWaiverOfSubrogation_TXT_ContractIDOrNum),strWaiverOfSubrogation_TXT_ContractIDOrNum,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_WaiverType(strWaiverOfSubrogation_TXT_WaiverType),strWaiverOfSubrogation_TXT_WaiverType,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_EntityType(strWaiverOfSubrogation_TXT_EntityType),strWaiverOfSubrogation_TXT_EntityType,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_EntityName(strWaiverOfSubrogation_TXT_EntityName),strWaiverOfSubrogation_TXT_EntityName,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_Street(strWaiverOfSubrogation_TXT_Street),strWaiverOfSubrogation_TXT_Street,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_SteUnit(strWaiverOfSubrogation_TXT_SteUnit),strWaiverOfSubrogation_TXT_SteUnit,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_City(strWaiverOfSubrogation_TXT_City),strWaiverOfSubrogation_TXT_City,test);
					se.element().selectElementDDrOrValidateText(getWaiverOfSubrogation_DDN_State(strWaiverOfSubrogation_DDN_State),strWaiverOfSubrogation_DDN_State,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_Zip(strWaiverOfSubrogation_TXT_Zip),strWaiverOfSubrogation_TXT_Zip,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_DescriptionOfWorkOrProject(strWaiverOfSubrogation_TXT_DescriptionOfWorkOrProject),strWaiverOfSubrogation_TXT_DescriptionOfWorkOrProject,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_WaiverPercentage(strWaiverOfSubrogation_TXT_WaiverPercentage),strWaiverOfSubrogation_TXT_WaiverPercentage,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_WaiverMinAmt(strWaiverOfSubrogation_TXT_WaiverMinAmt),strWaiverOfSubrogation_TXT_WaiverMinAmt,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_WaiverFlatFee(strWaiverOfSubrogation_TXT_WaiverFlatFee),strWaiverOfSubrogation_TXT_WaiverFlatFee,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_Add_SpecificClassificationInfo(strWaiverOfSubrogation_TXT_Add_SpecificClassificationInfo),strWaiverOfSubrogation_TXT_Add_SpecificClassificationInfo,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_ClassCode(strWaiverOfSubrogation_TXT_ClassCode),strWaiverOfSubrogation_TXT_ClassCode,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_DescriptionCode(strWaiverOfSubrogation_TXT_DescriptionCode),strWaiverOfSubrogation_TXT_DescriptionCode,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_DescClass(strWaiverOfSubrogation_TXT_DescClass),strWaiverOfSubrogation_TXT_DescClass,test);
					if(!strWaiverOfSubrogation_TXT_ClassExposure.equalsIgnoreCase("N/A") && !strWaiverOfSubrogation_TXT_ClassExposure.contains("validate2")){
						se.element().clearTheField(getWaiverOfSubrogation_TXT_AnnualExposure(strWaiverOfSubrogation_TXT_ClassExposure));
					}
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_AnnualExposure(strWaiverOfSubrogation_TXT_ClassExposure),strWaiverOfSubrogation_TXT_ClassExposure,test);
					//se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_ClassExposure(strWaiverOfSubrogation_TXT_ClassExposure),strWaiverOfSubrogation_TXT_ClassExposure,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_USLH_IND(strWaiverOfSubrogation_TXT_USLH_IND),strWaiverOfSubrogation_TXT_USLH_IND,test);
					se.element().enterOrValidateText(getWaiverOfSubrogation_TXT_AnnualExp(strWaiverOfSubrogation_TXT_AnnualExp),strWaiverOfSubrogation_TXT_AnnualExp,test);

					if(strWaiverOfSubrogation_TXT_NextButton.equalsIgnoreCase("Yes")){
						se.element().Click(getNext(),test);
						}
					
					
					
					if(strWaiverOfSubrogation_BTN_Done.equalsIgnoreCase("Yes")){
						se.element().Click(getDone(),test);	
						}
					
				}catch(Exception e) {
					se.verify().verifyEquals("Failed to fill in details for WC_WaiverOfSubrogation", true, false, true, test);
							
					
					}
							iteration++;
						}
					
				}
				catch (Exception e) {
					
					se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
					test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
					testTearDown(se, test);
				}
					
			}
			}
