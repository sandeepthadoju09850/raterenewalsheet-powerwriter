package pw.pages.CA;
/**
 * @author ${is09492}
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

public class CA_HiredOrBorrowedAuto extends OR_CA{

	public void HiredOrBorrowedAuto(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException {
		
		try{
			//String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		    if(suspendSheet.equalsIgnoreCase("HiredOrBorrowedAuto")){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData("HiredOrBorrowedAuto", strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
				String strHiredOrBorrowedAuto_BTN_Add = (String) row.get("HiredOrBorrowedAuto_BTN_Add");
				String strHiredOrBorrowedAuto_BTN_RemoveCov = (String) row.get("HiredOrBorrowedAuto_BTN_RemoveCov");
				String strHiredOrBorrowedAuto_BTN_Done = (String) row.get("HiredOrBorrowedAuto_BTN_Done");
				String strHiredOrBorrowedAuto_BTN_Details = (String) row.get("HiredOrBorrowedAuto_BTN_Details");
				String strHiredOrBorrowedAuto_TXT_State = (String) row.get("HiredOrBorrowedAuto_TXT_State");
				String strHiredOrBorrowedAuto_TXT_ZipCode = (String) row.get("HiredOrBorrowedAuto_TXT_ZipCode");
				String strHiredOrBorrowedAuto_TXT_HiredAutoType = (String) row.get("HiredOrBorrowedAuto_TXT_HiredAutoType");
				String strHiredOrBorrowedAuto_CHK_Liability = (String) row.get("HiredOrBorrowedAuto_CHK_Liability");
				String strHiredOrBorrowedAuto_TXT_CostOfHire = (String) row.get("HiredOrBorrowedAuto_TXT_CostOfHire");
				String strHiredOrBorrowedAuto_TXT_CSL = (String) row.get("HiredOrBorrowedAuto_TXT_CSL");
				String strHiredOrBorrowedAuto_TXT_Deductible = (String) row.get("HiredOrBorrowedAuto_TXT_Deductible");
				String strHiredOrBorrowedAuto_CHK_DedType_CSL = (String) row.get("HiredOrBorrowedAuto_CHK_DedType_CSL");
				String strHiredOrBorrowedAuto_CHK_DedType_PropDamPerAccDed = (String) row.get("HiredOrBorrowedAuto_CHK_DedType_PropDamPerAccDed");
				String strHiredOrBorrowedAuto_CHK_CovergaeType_ExcessLiability = (String) row.get("HiredOrBorrowedAuto_CHK_CovergaeType_ExcessLiability");
				String strHiredOrBorrowedAuto_CHK_CoveragType_PrimaryLiability = (String) row.get("HiredOrBorrowedAuto_CHK_CoveragType_PrimaryLiability");
				String strHiredOrBorrowedAuto_CHK_RentalBasis_CostOfHire = (String) row.get("HiredOrBorrowedAuto_CHK_RentalBasis_CostOfHire");
				String strHiredOrBorrowedAuto_CHK_RentalBasis_RentalPeriod = (String) row.get("HiredOrBorrowedAuto_CHK_RentalBasis_RentalPeriod");
				String strHiredOrBorrowedAuto_CHK_PersonalInjuryProtection = (String) row.get("HiredOrBorrowedAuto_CHK_PersonalInjuryProtection");
				String strHiredOrBorrowedAuto_CHK_MedicalPayments = (String) row.get("HiredOrBorrowedAuto_CHK_MedicalPayments");
				String strHiredOrBorrowedAuto_CHK_AutosLeasedHiredRentedOrBorWithDrivers = (String) row.get("HiredOrBorrowedAuto_CHK_AutosLeasedHiredRentedOrBorWithDrivers");
				String strHiredOrBorrowedAuto_CHK_OthrThanCollision = (String) row.get("HiredOrBorrowedAuto_CHK_OthrThanCollision");
				String strHiredOrBorrowedAuto_TXT_Type = (String) row.get("HiredOrBorrowedAuto_TXT_Type");
				String strHiredOrBorrowedAuto_TXT_OtherThanColl_CostOfHire = (String) row.get("HiredOrBorrowedAuto_TXT_OtherThanColl_CostOfHire");
				String strHiredOrBorrowedAuto_TXT_OtherThanColl_Deductible = (String) row.get("HiredOrBorrowedAuto_TXT_OtherThanColl_Deductible");
				String strHiredOrBorrowedAuto_TXT_MaxLmt = (String) row.get("HiredOrBorrowedAuto_TXT_MaxLmt");
				String strHiredOrBorrowedAuto_TXT_DailyRate = (String) row.get("HiredOrBorrowedAuto_TXT_DailyRate");
				String strHiredOrBorrowedAuto_TXT_JurisdictionDesc = (String) row.get("HiredOrBorrowedAuto_TXT_JurisdictionDesc");
				String strHiredOrBorrowedAuto_TXT_FPDCode = (String) row.get("HiredOrBorrowedAuto_TXT_FPDCode");
				String strHiredOrBorrowedAuto_TXT_FireProtectionDistrict = (String) row.get("HiredOrBorrowedAuto_TXT_FireProtectionDistrict");
				String strHiredOrBorrowedAuto_CHK_Collision = (String) row.get("HiredOrBorrowedAuto_CHK_Collision");
				String strHiredOrBorrowedAuto_TXT_Collision_Deductible = (String) row.get("HiredOrBorrowedAuto_TXT_Collision_Deductible");
				String strHiredOrBorrowedAuto_TXT_Collision_DailyRate = (String) row.get("HiredOrBorrowedAuto_TXT_Collision_DailyRate");
				String strHiredOrBorrowedAuto_CHK_DetailCheckBox = (String) row.get("HiredOrBorrowedAuto_CHK_DetailCheckBox");
				
				try{
					se.log().logTestStep("CA_HiredOrBorrowedAuto");
					test.log(LogStatus.INFO, "CA_HiredOrBorrowedAuto page","Transaction Step : "+transaction + "<br>" +"Page : CA_HiredOrBorrowedAuto");
					se.verify().verifyEquals("CA_HiredOrBorrowedAuto Details  of PowerWriter ", getHiredOrBorrowedAuto_BTN_Label().isDisplayed(),true, true,test);
					
					if(strHiredOrBorrowedAuto_BTN_Add.equalsIgnoreCase("Yes")){
						se.element().Click(getHiredOrBorrowedAuto_BTN_Add(),test);
					}
					if(strHiredOrBorrowedAuto_BTN_Details.equalsIgnoreCase("Yes")){
						se.element().Click(getHiredOrBorrowedAuto_BTN_Details(strHiredOrBorrowedAuto_BTN_Details),test);
					}
					if(strHiredOrBorrowedAuto_BTN_RemoveCov.equalsIgnoreCase("Yes")){
						se.element().checkUncheckOrValidate(getHiredOrBorrowedAuto_selectDetails(strHiredOrBorrowedAuto_CHK_DetailCheckBox),"Check",test);
						se.element().Click(getHiredOrBorrowedAuto_BTN_RemoveCov(), test);
						
					}else{
					
					se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_State(strHiredOrBorrowedAuto_TXT_State),strHiredOrBorrowedAuto_TXT_State,test);
					se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_ZipCode(strHiredOrBorrowedAuto_TXT_ZipCode),strHiredOrBorrowedAuto_TXT_ZipCode,test);
					se.element().clearTheField(getHiredOrBorrowedAuto_TXT_HiredAutoType(strHiredOrBorrowedAuto_TXT_HiredAutoType));
					se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_HiredAutoType(strHiredOrBorrowedAuto_TXT_HiredAutoType),strHiredOrBorrowedAuto_TXT_HiredAutoType,test);
					se.element().checkUncheckOrValidate(getHiredOrBorrowedAuto_CHK_Liability(strHiredOrBorrowedAuto_CHK_Liability),strHiredOrBorrowedAuto_CHK_Liability,test);
					se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_CostOfHire(strHiredOrBorrowedAuto_TXT_CostOfHire),strHiredOrBorrowedAuto_TXT_CostOfHire,test);
					se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_CSL(strHiredOrBorrowedAuto_TXT_CSL),strHiredOrBorrowedAuto_TXT_CSL,test);
					se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_Deductible(strHiredOrBorrowedAuto_TXT_Deductible),strHiredOrBorrowedAuto_TXT_Deductible,test);
					se.element().checkUncheckOrValidate(getHiredOrBorrowedAuto_CHK_DedType_CSL(strHiredOrBorrowedAuto_CHK_DedType_CSL),strHiredOrBorrowedAuto_CHK_DedType_CSL,test);
					se.element().checkUncheckOrValidate(getHiredOrBorrowedAuto_CHK_DedType_PropDamPerAccDed(strHiredOrBorrowedAuto_CHK_DedType_PropDamPerAccDed),strHiredOrBorrowedAuto_CHK_DedType_PropDamPerAccDed,test);
					se.element().checkUncheckOrValidate(getHiredOrBorrowedAuto_CHK_CovergaeType_ExcessLiability(strHiredOrBorrowedAuto_CHK_CovergaeType_ExcessLiability),strHiredOrBorrowedAuto_CHK_CovergaeType_ExcessLiability,test);
					se.element().checkUncheckOrValidate(getHiredOrBorrowedAuto_CHK_CoveragType_PrimaryLiability(strHiredOrBorrowedAuto_CHK_CoveragType_PrimaryLiability),strHiredOrBorrowedAuto_CHK_CoveragType_PrimaryLiability,test);
					se.element().checkUncheckOrValidate(getHiredOrBorrowedAuto_CHK_RentalBasis_CostOfHire(strHiredOrBorrowedAuto_CHK_RentalBasis_CostOfHire),strHiredOrBorrowedAuto_CHK_RentalBasis_CostOfHire,test);
					se.element().checkUncheckOrValidate(getHiredOrBorrowedAuto_CHK_RentalBasis_RentalPeriod(strHiredOrBorrowedAuto_CHK_RentalBasis_RentalPeriod),strHiredOrBorrowedAuto_CHK_RentalBasis_RentalPeriod,test);
					se.element().checkUncheckOrValidate(getHiredOrBorrowedAuto_CHK_PersonalInjuryProtection(strHiredOrBorrowedAuto_CHK_PersonalInjuryProtection),strHiredOrBorrowedAuto_CHK_PersonalInjuryProtection,test);
					se.element().checkUncheckOrValidate(getHiredOrBorrowedAuto_CHK_MedicalPayments(strHiredOrBorrowedAuto_CHK_MedicalPayments),strHiredOrBorrowedAuto_CHK_MedicalPayments,test);
					se.element().checkUncheckOrValidate(getHiredOrBorrowedAuto_CHK_AutosLeasedHiredRentedOrBorWithDrivers(strHiredOrBorrowedAuto_CHK_AutosLeasedHiredRentedOrBorWithDrivers),strHiredOrBorrowedAuto_CHK_AutosLeasedHiredRentedOrBorWithDrivers,test);
					se.element().checkUncheckOrValidate(getHiredOrBorrowedAuto_CHK_OthrThanCollision(strHiredOrBorrowedAuto_CHK_OthrThanCollision),strHiredOrBorrowedAuto_CHK_OthrThanCollision,test);
					se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_Type(strHiredOrBorrowedAuto_TXT_Type),strHiredOrBorrowedAuto_TXT_Type,test);
					se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_OtherThanColl_CostOfHire(strHiredOrBorrowedAuto_TXT_OtherThanColl_CostOfHire),strHiredOrBorrowedAuto_TXT_OtherThanColl_CostOfHire,test);
					se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_OtherThanColl_Deductible(strHiredOrBorrowedAuto_TXT_OtherThanColl_Deductible),strHiredOrBorrowedAuto_TXT_OtherThanColl_Deductible,test);

					if(!strHiredOrBorrowedAuto_TXT_MaxLmt.equalsIgnoreCase(constants.NA) && !strHiredOrBorrowedAuto_TXT_MaxLmt.contains(constants.Validate)){
						se.element().clearTheField(getHiredOrBorrowedAuto_TXT_MaxLmt(strHiredOrBorrowedAuto_TXT_MaxLmt));
						se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_MaxLmt(strHiredOrBorrowedAuto_TXT_MaxLmt),strHiredOrBorrowedAuto_TXT_MaxLmt,test);
					}else{
						se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_MaxLmt(strHiredOrBorrowedAuto_TXT_MaxLmt),strHiredOrBorrowedAuto_TXT_MaxLmt,test);
					}
					
					se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_DailyRate(strHiredOrBorrowedAuto_TXT_DailyRate),strHiredOrBorrowedAuto_TXT_DailyRate,test);
					se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_JurisdictionDesc(strHiredOrBorrowedAuto_TXT_JurisdictionDesc),strHiredOrBorrowedAuto_TXT_JurisdictionDesc,test);
					se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_FPDCode(strHiredOrBorrowedAuto_TXT_FPDCode),strHiredOrBorrowedAuto_TXT_FPDCode,test);
					se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_FireProtectionDistrict(strHiredOrBorrowedAuto_TXT_FireProtectionDistrict),strHiredOrBorrowedAuto_TXT_FireProtectionDistrict,test);
					se.element().checkUncheckOrValidate(getHiredOrBorrowedAuto_CHK_Collision(strHiredOrBorrowedAuto_CHK_Collision),strHiredOrBorrowedAuto_CHK_Collision,test);
					se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_Collision_Deductible(strHiredOrBorrowedAuto_TXT_Collision_Deductible),strHiredOrBorrowedAuto_TXT_Collision_Deductible,test);
					se.element().enterOrValidateText(getHiredOrBorrowedAuto_TXT_Collision_DailyRate(strHiredOrBorrowedAuto_TXT_Collision_DailyRate),strHiredOrBorrowedAuto_TXT_Collision_DailyRate,test);
					se.element().Click(getNext(),test);
					
					if(strHiredOrBorrowedAuto_BTN_Done.equalsIgnoreCase("Yes")){
						se.element().Click(getDone(),test);
					}
					iteration++;
					
					}
					
				}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_HiredOrBorrowedAuto ", true, false, true, test);
							
						}
								
							}
						
					}
					catch (Exception e) {
						
						se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
						test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
						testTearDown(se, test);
					}
						
				}
			}

