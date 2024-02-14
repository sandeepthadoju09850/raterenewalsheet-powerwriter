package pw.pages.WC;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_WC;

public class WC_WCRatingPeriod extends OR_WC {
public void  WCRatingPeriod(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			    if(suspendSheet.equalsIgnoreCase(constants.WC_WCRatingPeriod)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.WC_WCRatingPeriod, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strRatingPeriod_BTN_Add = (String) row.get("RatingPeriod_BTN_Add");
				String strRatingPeriod_BTN_Details = (String) row.get("RatingPeriod_BTN_Details");
				String strRatingPeriod_BTN_Done = (String) row.get("RatingPeriod_BTN_Done");
				String strRatingPeriod_TXT_LocationNolabel = (String) row.get("RatingPeriod_TXT_LocationNolabel");
				String strRatingPeriod_TXT_Type = (String) row.get("RatingPeriod_TXT_Type");
				String strRatingPeriod_TXT_TypeFilterNeeded = (String) row.get("RatingPeriod_TXT_TypeFilterNeeded");
				String strRatingPeriod_TXT_PeriodEffectiveDate = (String) row.get("RatingPeriod_TXT_PeriodEffectiveDate");
				String strRatingPeriod_TXT_RateEffectiveDate = (String) row.get("RatingPeriod_TXT_RateEffectiveDate");
				String strRatingPeriod_TXT_OverrideRateEffectiveDate = (String) row.get("RatingPeriod_TXT_OverrideRateEffectiveDate");
				String strRatingPeriod_TXT_OverrideRateEffectiveDateFilterNeeded = (String) row.get("RatingPeriod_TXT_OverrideRateEffectiveDateFilterNeeded");
				String strRatingPeriod_TXT_OverrideLCMDate = (String) row.get("RatingPeriod_TXT_OverrideLCMDate");
				String strRatingPeriod_TXT_OverrideLCMDateFilterNeeded = (String) row.get("RatingPeriod_TXT_OverrideLCMDateFilterNeeded");
				String strRatingPeriod_TXT_ModifierType = (String) row.get("RatingPeriod_TXT_ModifierType");
				String strRatingPeriod_TXT_ModifierTypeFilterNeeded = (String) row.get("RatingPeriod_TXT_ModifierTypeFilterNeeded");
				String strRatingPeriod_TXT_ExperienceModifierFactor = (String) row.get("RatingPeriod_TXT_ExperienceModifierFactor");
				String strRatingPeriod_TXT_ModifierStatus = (String) row.get("RatingPeriod_TXT_ModifierStatus");
				String strRatingPeriod_TXT_ModifierSchedule = (String) row.get("RatingPeriod_TXT_ModifierSchedule");
				String strRatingPeriod_TXT_AssociationGroupFactor = (String) row.get("RatingPeriod_TXT_AssociationGroupFactor");
				String strRatingPeriod_TXT_MeritModifierFactor = (String) row.get("RatingPeriod_TXT_MeritModifierFactor");
				String strRatingPeriod_TXT_MeritModifierFactorBasis = (String) row.get("RatingPeriod_TXT_MeritModifierFactorBasis");
				
				
				//*[contains(@id,'1split_type-textbox')]

			
				try
				{
					test.log(LogStatus.INFO, "WCRatingPeriod","Transaction Step : "+ transaction + "<br>" +"Page : WCRatingPeriod");
					se.log().logSeStep("Selecting WCRatingPeriod ");
					se.verify().verifyEquals("WCRatingPeriod page of PowerWriter ", getRatingPeriod_Label().isDisplayed(),true, true,test);
					
					if(strRatingPeriod_BTN_Add.equalsIgnoreCase("Yes")){
						se.element().Click(getRatingPeriod_BTN_Add(strRatingPeriod_BTN_Add),test);
					}
					if(!strRatingPeriod_BTN_Details.equalsIgnoreCase("N/A")){
						se.element().Click(getRatingPeriod_BTN_Details(strRatingPeriod_BTN_Details), test);
					}	
					
					se.element().enterOrValidateText(getRatingPeriod_TXT_LocationNolabel(strRatingPeriod_TXT_LocationNolabel),strRatingPeriod_TXT_LocationNolabel,test);
					se.element().selectPopupWithMagnifier(getRatingPeriod_TXT_Type(strRatingPeriod_TXT_Type),getRatingPeriod_TXT_TypeSearch(strRatingPeriod_TXT_Type),strRatingPeriod_TXT_Type,strRatingPeriod_TXT_TypeFilterNeeded,strRatingPeriod_TXT_Type, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getRatingPeriod_TXT_PeriodEffectiveDate(strRatingPeriod_TXT_PeriodEffectiveDate),strRatingPeriod_TXT_PeriodEffectiveDate,test);
					se.element().enterOrValidateText(getRatingPeriod_TXT_RateEffectiveDate(strRatingPeriod_TXT_RateEffectiveDate),strRatingPeriod_TXT_RateEffectiveDate,test);
					se.element().selectPopupWithMagnifier(getRatingPeriod_TXT_OverrideRateEffectiveDate(strRatingPeriod_TXT_OverrideRateEffectiveDate),getRatingPeriod_TXT_OverrideRateEffectiveDateSearch(strRatingPeriod_TXT_OverrideRateEffectiveDate),strRatingPeriod_TXT_OverrideRateEffectiveDate,strRatingPeriod_TXT_OverrideRateEffectiveDateFilterNeeded,strRatingPeriod_TXT_OverrideRateEffectiveDate, constants.NA, constants.NA,constants.NA,test);
					se.element().selectPopupWithMagnifier(getRatingPeriod_TXT_OverrideLCMDate(strRatingPeriod_TXT_OverrideLCMDate),getRatingPeriod_TXT_OverrideLCMDateSearch(strRatingPeriod_TXT_OverrideLCMDate),strRatingPeriod_TXT_OverrideLCMDate,strRatingPeriod_TXT_OverrideLCMDateFilterNeeded,strRatingPeriod_TXT_OverrideLCMDate, constants.NA, constants.NA,constants.NA,test);
					se.element().selectPopupWithMagnifier(getRatingPeriod_TXT_ModifierType(strRatingPeriod_TXT_ModifierType),getRatingPeriod_TXT_ModifierTypeSearch(strRatingPeriod_TXT_ModifierType),strRatingPeriod_TXT_ModifierType,strRatingPeriod_TXT_ModifierTypeFilterNeeded,strRatingPeriod_TXT_ModifierType, constants.NA, constants.NA,constants.NA,test);
					se.element().selectPopupWithMagnifier(getRatingPeriod_TXT_MeritModifierFactor(strRatingPeriod_TXT_MeritModifierFactor),getRatingPeriod_TXT_MeritModifierFactorSearch(strRatingPeriod_TXT_MeritModifierFactor),strRatingPeriod_TXT_MeritModifierFactor,constants.NA,strRatingPeriod_TXT_MeritModifierFactorBasis, strRatingPeriod_TXT_MeritModifierFactor, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getRatingPeriod_TXT_ExperienceModifierFactor(strRatingPeriod_TXT_ExperienceModifierFactor),strRatingPeriod_TXT_ExperienceModifierFactor,test);
					se.element().enterOrValidateText(getRatingPeriod_TXT_ModifierStatus(strRatingPeriod_TXT_ModifierStatus),strRatingPeriod_TXT_ModifierStatus,test);
					
					//Clear the field
					
					//Removing the below clear step for WC_1 as we are validating this field
					/*if(strRegressionID.equals("WC_1") && transaction.equals(constants.QFR)){
						se.element().clear(RatingPeriod_TXT_ModifierSchedule);
					}*/
					
					if(strRegressionID.equals("WC_1") && transaction.equals(constants.ConvertToPolicy1)){
						se.element().clear(RatingPeriod_TXT_ModifierSchedule);
					} 
					
					if(!strRatingPeriod_TXT_ModifierSchedule.contains(constants.Validate) && !strRatingPeriod_TXT_ModifierSchedule.equalsIgnoreCase(constants.NA)) {
						se.element().clear(RatingPeriod_TXT_ModifierSchedule);
					}
					se.element().enterOrValidateText(getRatingPeriod_TXT_ModifierSchedule(strRatingPeriod_TXT_ModifierSchedule),strRatingPeriod_TXT_ModifierSchedule,test);
					se.element().enterOrValidateText(getRatingPeriod_TXT_AssociationGroupFactor(strRatingPeriod_TXT_AssociationGroupFactor),strRatingPeriod_TXT_AssociationGroupFactor,test);

					se.element().clickElement(getNext());
						
					if(strRatingPeriod_BTN_Done.equalsIgnoreCase(constants.Yes)){
	     				se.element().Click(getDone(),test);	
	     			}
					
				}catch(Exception e) {									
					
						se.verify().verifyEquals("Failed to fill in details for WCRatingPeriod", true, false, true, test);
					
								
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
