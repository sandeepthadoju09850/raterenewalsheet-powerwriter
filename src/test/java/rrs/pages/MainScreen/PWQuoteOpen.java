package rrs.pages.MainScreen;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.io.File;
import java.io.FileWriter;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Util;
import pw.Constants.constants;
import rrs.OR.OR_RRS_MainScreen;

public class PWQuoteOpen extends OR_RRS_MainScreen{
	

	String total ="";
	String path ="";
	public static String policyNumber="";
	public void PWQuoteForRenewal(LinkedHashMap<String, String> CurrentTermPremiums,LinkedHashMap<String, String> QFR,LinkedHashMap<String, String> CurrentTermPremiumsCA, LinkedHashMap<String, String> CurrentTermPremiumsWC,LinkedHashMap<String, String> CurrentTermPremiumsUM,LinkedHashMap<String, String> QFRPremiumsCA,LinkedHashMap<String, String> QFRPremiumsWC,LinkedHashMap<String, String> QFRPremiumsUM,String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
			PWValidations PWValidationsPage = TestPageFactory.initElements(se, PWValidations.class);
			
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.RRS)){
			 test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.RRS, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		
			String strPW_TXT_LeadPolicy = (String) row.get("PW_TXT_LeadPolicy");
			String strRRS_TXT_SearchPolicy = (String) row.get("RRS_TXT_SearchPolicy");
			String strPW_TXT_QuoteTransaction = (String) row.get("PW_TXT_QuoteTransaction");
			 
			
			
			
			try{
				se.log().logTestStep("Navigated to PW Home screen");
				test.log(LogStatus.INFO, "Navigated to PW Home screen","Transaction Step : "+ transaction + "<br>" +"Page : Rate Renewal Sheet");

				
				policyNumber = strRRS_TXT_SearchPolicy;
				//strRRS_TXT_SearchPolicy ="4166449";
				se.element().switchToFrame(getPW_Frm_FrameSearch());
				se.element().enterOrValidateText(getPW_TXT_Search(strRRS_TXT_SearchPolicy),strRRS_TXT_SearchPolicy,test);
				se.element().Click(getPW_Btn_Search(),test);
				boolean ele = se.element().isElementPresent(getPW_Btn_SearchResult());
				if(ele) {
					se.element().Click(getPW_Btn_SearchResult(),test);
				}
								
				driver.switchTo().defaultContent();
				
				
				
				if(transaction.equalsIgnoreCase("PWPremiums")) {				
					
					if(strPW_TXT_QuoteTransaction.equals("Package")) {
						getTransaction(CurrentTermPremiums,QFR,strPW_TXT_LeadPolicy,strRRS_TXT_SearchPolicy,strPW_TXT_QuoteTransaction,test);
					}
					else if(strPW_TXT_QuoteTransaction.equals("CA")) {
						getTransaction(CurrentTermPremiumsCA,QFRPremiumsCA,strPW_TXT_LeadPolicy,strRRS_TXT_SearchPolicy,strPW_TXT_QuoteTransaction,test);	
					}
					else if(strPW_TXT_QuoteTransaction.equals("WC")) {
						getTransaction(CurrentTermPremiumsWC,QFRPremiumsWC,strPW_TXT_LeadPolicy,strRRS_TXT_SearchPolicy,strPW_TXT_QuoteTransaction,test);	
					}
					else if(strPW_TXT_QuoteTransaction.equals("UM")) {
						getTransaction(CurrentTermPremiumsUM,QFRPremiumsUM,strPW_TXT_LeadPolicy,strRRS_TXT_SearchPolicy,strPW_TXT_QuoteTransaction,test);	
					}
					
					if(strPW_TXT_QuoteTransaction.equals("UM")) {
					creareFile();
					writeToFile(total);
					
					driver.switchTo().defaultContent();
					se.element().switchToFrame(getPW_FRM_iFrameStatus());
					String Status = se.element().getText(PW_LBL_DashboardStatus);
					Thread.sleep(30000);
					se.element().waitUntiltextIsDisplayed(getPW_LBL_DashboardStatus(),"Pending Quote");
					
					
					for(int i=0;i<5;i++) {
						if(Status.equalsIgnoreCase("Forms Management - Error")){
							se.element().Click(getPW_BTN_FormsErrorRetry(),test);	
							se.element().waitForElementIsDisplayed(getPW_LBL_DashboardStatus());
							Status = se.element().getText(PW_LBL_DashboardStatus);
						}
						if(Status.equalsIgnoreCase("Pending Quote")) {
							moveFile(path);
							break;
						}
						Thread.sleep(5000);
						Status = se.element().getText(PW_LBL_DashboardStatus);
					}
					}
				}
				
				else if(transaction.equalsIgnoreCase("ReviseQuote")) {
					se.element().switchToFrame(getPW_Frame_RenderDashboard());	
					se.element().Click(getPW_BTN_RenewalQuote(),test);	
					driver.switchTo().defaultContent();
					se.element().switchToFrame(getPW_Frm_QuoteDetails());					
					se.element().Click(getCommon_BTN_Revise(),test);					
					driver.switchTo().defaultContent();
					String ControlDate = ExcelOperations.getControlDate(strRegressionID, transaction);
					ControlDate = Util.getCurrentDate1();
					System.out.println(ControlDate);
					se.element().clearTheField(getProductInfo_TXT_ControlDate(ControlDate));
					se.element().enterOrValidateText(getProductInfo_TXT_ControlDate(ControlDate),ControlDate,test);
					se.util().sleep(500);
					se.element().Click(getCalprem(),test);
					driver.switchTo().defaultContent();
					se.element().waitForElementIsDisplayed(getPW_Frm_Summarypremiums());
					se.element().switchToFrame(getPW_Frm_Summarypremiums());
				}
				
				
			
				se.util().sleep(2000);
				
				
				
			} catch(Exception e){
				se.verify().verifyEquals("Failed to get details for PW Home Page ", true, false, true, test);
				}
				iteration++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}
	}
	
	public void quoteForRenewal(ExtentTest test) {
		
		se.element().switchToFrame(getPW_Frm_QuoteDetails());
		se.element().Click(getCommon_BTN_QuoteforRenewal(),test);
		driver.switchTo().defaultContent();
		se.element().waitForElementIsDisplayed(getCalprem());
		se.element().Click(getCalprem(),test);
		se.element().Click(getCalprem(),test);
		driver.switchTo().defaultContent();
		se.element().waitForElementIsDisplayed(getPW_Frm_Summarypremiums());
		se.element().switchToFrame(getPW_Frm_Summarypremiums());					
		
	}
	
	public void moveFile(String path) throws IOException{
		
		
	        Path temp = Files.move
	        			
	        (Paths.get("C:\\Users\\sa09850\\GitProjects\\PCMW0009_CM5078_RATEMON.TXT"), 	        		
	        Paths.get(path));
	        		
	        if(temp != null)
	        {
	        	
	            System.out.println("File renamed and moved successfully");
	        }
	        else
	        {
	            System.out.println("Failed to move the file");
	        }
		
	    }
	
	public void creareFile() {
	    try {
	    	
	    	File myObjd = new File("C:\\Users\\sa09850\\GitProjects\\PCMW0009_CM5078_RATEMON.TXT"); 
	    	   if (myObjd.delete()) { 
	    	     System.out.println("Deleted the file: " + myObjd.getName());
	    	   } else {
	    	     System.out.println("Failed to delete the file.");
	    	   } 
	    	    
	      File myObj = new File("C:\\Users\\sa09850\\GitProjects\\PCMW0009_CM5078_RATEMON.TXT");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	
	public void writeToFile(String total) {
	    try {
	      FileWriter myWriter = new FileWriter("C:\\Users\\sa09850\\GitProjects\\PCMW0009_CM5078_RATEMON.TXT");
	      myWriter.write(total);
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	
	public String stringMod(String st) {
		if(st.length()==0){
			st="0";
			return st;
		}else {
		if(st.contains("%") && st.contains(".00")) {
			String[] str =st.split(".00");
			st =str[0]+str[1];
		}
		if(st.contains(",")) {
			String[] str =st.split(",");
			st =str[0]+str[1];
			st=st.substring(1);
			System.out.println(st);
		}if(st.contains(".00")){
			String[] str =st.split(".00");
			st =str[0];			
			System.out.println(st);
		}if(st.contains("$")) {
			st=st.substring(1);
		}

		return st;
		}
	}
	
	public void getTransaction(LinkedHashMap<String, String> CTPremiums,LinkedHashMap<String, String> QFRPremiums, String strPW_TXT_LeadPolicy, String strRRS_TXT_SearchPolicy,String strPW_TXT_QuoteTransaction,ExtentTest test) throws InterruptedException {
		
		
		
		LinkedHashMap<String, String> Product= new LinkedHashMap<String, String>();
		Product.put("Target Contractor Protector", "TC");
		Product.put("Commercial Package", "CP");
		Product.put("Business Protector Policy", "BP");
		Product.put("Commercial Umbrella", "CU");
		Product.put("Commercial Auto", " A");
		Product.put("Workers Comp", "WC");
		
		LinkedHashMap<String, String> MarketSegment= new LinkedHashMap<String, String>();
		MarketSegment.put("Agri", "A");
		MarketSegment.put("Farm", "F");
		MarketSegment.put("Specialty", "L");
		MarketSegment.put("Commercial", "C");
		
		LinkedHashMap<String, String> States= new LinkedHashMap<String, String>();
		States.put("Alabama", "AL");
		States.put("Arkansas", "AR");
		States.put("Arizona", "AZ");
		States.put("California", "CA");
		States.put("Colorado", "CO");
		States.put("Florida", "FL");
		States.put("Georgia", "GA");
		States.put("Illinois", "IL");
		States.put("Indiana", "IN");
		States.put("Iowa", "IA");
		States.put("Kansas", "KS");
		States.put("Kentucky", "KY");
		States.put("Michigan", "MI");				
		States.put("Minnesota", "MN");				
		States.put("Mississippi", "MS");				
		States.put("Missouri", "MO");
		States.put("North Dakota", "ND");
		States.put("Ohio", "OH");
		States.put("Tennessee", "TN");
		States.put("Pennsylvania", "PA");
		States.put("Wisconsin", "WI");
		
		if(constants.Env.equalsIgnoreCase("Stage")) {
			path = "Q:\\USERS\\FTP\\STAGE\\CM\\RatemonExtract\\PCMW0009_CM5078_RATEMON.TXT";
		
		}else {
			path = "Q:\\USERS\\FTP\\TEST\\CM\\RatemonExtract\\PCMW0009_CM5078_RATEMON.TXT";
		}
		
		driver.switchTo().defaultContent();					
	 	se.element().switchToFrame(getPW_Frm_QuoteDetails());
		se.element().Click(getCommon_BTN_Inquire(),test);
		driver.switchTo().defaultContent();
		se.element().Click(getCommon_BTN_PremiumSummary(),test);									
		se.element().waitForElementIsDisplayed(getPW_Frm_Summarypremiums());
		se.element().switchToFrame(getPW_Frm_Summarypremiums());					
		getPremiums(CTPremiums,strPW_TXT_QuoteTransaction);					
		driver.switchTo().defaultContent();
		se.element().Click(getCommon_EXIT_button(),test);
		
		quoteForRenewal(test);
		getPremiums(QFRPremiums,strPW_TXT_QuoteTransaction);
		
		se.element().Click(getcommon_BTN_completetranx(),test);
		Thread.sleep(30000);
		driver.switchTo().defaultContent();
		
	 	se.element().switchToFrame(getPW_Frm_QuoteDetails());
	 	//se.element().waitForElementIsDisplayed(getCommon_BTN_Inquire(), 120);
	 	
	 	se.element().waitUntiltextIsDisplayed(getCommon_BTN_Inquire(),"Inquire");
	 	se.element().waitUntiltextIsDisplayed(getCommon_BTN_Inquire(),"Inquire");
		se.element().Click(getCommon_BTN_Inquire(),test);				
		driver.switchTo().defaultContent();
		
		
		System.out.println(strPW_TXT_LeadPolicy+ se.element().getText(PW_LBL_AccountNumber)+strRRS_TXT_SearchPolicy);
		String product = se.element().getText(PW_LBL_ProductName);
		String productname= Product.get(product);
		System.out.println(productname);
		
		String name = se.element().getText(PW_LBL_InsuredName);
		int namelength = name.length();
		for (int i=namelength;i<60;i++) {
			name = name+" ";
			
		}
		System.out.println(name);
		
		
		String effDate =  se.element().getText(PW_LBL_EffDate);
		String[] neweff  = effDate.split("/");
		effDate= neweff[2]+"-"+neweff[0]+"-"+neweff[1];
		System.out.println(effDate);
		
		String expDate =  se.element().getText(PW_LBL_ExpDate);
		String[] newexp  = expDate.split("/");
		expDate= newexp[2]+"-"+newexp[0]+"-"+newexp[1];
		System.out.println(expDate);
		
		String state = se.element().getText(PW_LBL_State);
		String statename= States.get(state);
		System.out.println(statename);
		
		String marketSegment = se.element().getText(PW_LBL_MarketSegment);
		String marketsegmentname= MarketSegment.get(marketSegment);
		System.out.println(marketsegmentname);
		total = total+strPW_TXT_LeadPolicy+ se.element().getText(PW_LBL_AccountNumber)+strRRS_TXT_SearchPolicy+productname+name+effDate+expDate+statename+marketsegmentname;
		
		se.element().Click(getCommon_EXIT_button(),test);
		
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String[] urlone = URL.split("entityReference=");
		String entityRef = urlone[1].substring(0, 18);
		System.out.println(entityRef);
		
		
		String empty="";
		
		for(int i=0;i<26;i++) {
			empty=empty+" ";
		}
		if(!strPW_TXT_QuoteTransaction.equals("UM")) {
		total = total+entityRef+empty+"\n";
		}else {
			total = total+entityRef+empty;
		}
		
		System.out.println(total);
		System.out.println(total.length());
	}
	
	public LinkedHashMap<String, String> getPremiums(LinkedHashMap<String, String> mp, String strPW_TXT_QuoteTransaction) {
			
			
			if(strPW_TXT_QuoteTransaction.equalsIgnoreCase("Package")) {
			String Premium_LBL_ExTotalPremium = se.element().getText(Premium_LBL_TotalPremium);				
			mp.put("Premium_LBL_TotalPremium", stringMod(Premium_LBL_ExTotalPremium));
			
			
			String Premium_LBL_ExCommercialProperty = se.element().getText(Premium_LBL_CommercialProperty);
			mp.put("Premium_LBL_CommercialProperty", stringMod(Premium_LBL_ExCommercialProperty));
			
			
			String Premium_LBL_ExGeneralLiability = se.element().getText(Premium_LBL_GeneralLiability);
			mp.put("Premium_LBL_GeneralLiability", stringMod(Premium_LBL_ExGeneralLiability));
			
			
			String Premium_LBL_ExCrimeFidelity = se.element().getText(Premium_LBL_CrimeFidelity);
			mp.put("Premium_LBL_CrimeFidelity", stringMod(Premium_LBL_ExCrimeFidelity));
			

			String Premium_LBL_ExCyberSecurity = se.element().getText(Premium_LBL_CyberSecurity);
			mp.put("Premium_LBL_CyberSecurity", stringMod(Premium_LBL_ExCyberSecurity));
			

			String Premium_LBL_ExInlandMarine = se.element().getText(Premium_LBL_InlandMarine);
			mp.put("Premium_LBL_InlandMarine", stringMod(Premium_LBL_ExInlandMarine));
			
			
			String Premium_LBL_ExEmploymentPracticesLiability = se.element().getText(Premium_LBL_EmploymentPracticesLiability);
			mp.put("Premium_LBL_EmploymentPracticesLiability", stringMod(Premium_LBL_ExEmploymentPracticesLiability));
			
			
			}else if(strPW_TXT_QuoteTransaction.equalsIgnoreCase("CA")) {
				
				String PrePW_LBL_TotalTransactionPremiumCA = se.element().getText(PW_LBL_TotalTransactionPremiumCA);
				mp.put("PW_LBL_TotalTransactionPremiumCA", stringMod(PrePW_LBL_TotalTransactionPremiumCA));
				
				String PrePW_LBL_TotalSurchargesCA = se.element().getText(PW_LBL_TotalSurchargesCA);
				mp.put("PW_LBL_TotalSurchargesCA", stringMod(PrePW_LBL_TotalSurchargesCA));
				
				String PrePW_LBL_SRCALiability = se.element().getText(PW_LBL_SRCALiability);
				mp.put("PW_LBL_SRCALiability", stringMod(PrePW_LBL_SRCALiability));
				
				String PrePW_LBL_SRCAPhysicalDamage = se.element().getText(PW_LBL_SRCAPhysicalDamage);
				mp.put("PW_LBL_SRCAPhysicalDamage", stringMod(PrePW_LBL_SRCAPhysicalDamage));
			
			}else if(strPW_TXT_QuoteTransaction.equalsIgnoreCase("WC")) {
				
				String PrePW_LBL_TotalEstimatedPremiumWC = se.element().getText(PW_LBL_TotalEstimatedPremiumWC);
				mp.put("PW_LBL_TotalEstimatedPremiumWC", stringMod(PrePW_LBL_TotalEstimatedPremiumWC));
				
				String PrePW_LBL_TotalSurchargesWC = se.element().getText(PW_LBL_TotalSurchargesWC);
				mp.put("PW_LBL_TotalSurchargesWC", stringMod(PrePW_LBL_TotalSurchargesWC));
						
			}
			else if(strPW_TXT_QuoteTransaction.equalsIgnoreCase("UM")) {
				
				String PrePW_LBL_TotalTransactionPremiumUM = se.element().getText(PW_LBL_TotalTransactionPremiumCA);
				mp.put("PW_LBL_TotalTransactionPremiumUM", stringMod(PrePW_LBL_TotalTransactionPremiumUM));
								
			}
			
			
			driver.switchTo().defaultContent();
			
			for (Entry<String, String> me : mp.entrySet()) { 
	  
	            
	            System.out.print(me.getKey() + ":"); 
	            System.out.println(me.getValue()); 
	        }
			return mp;
			 
		}

	public void openPendingQuoteInPW(String strRRS_TXT_SearchPolicy,ExtentTest test) throws InterruptedException {	
	
		se.element().switchToFrame(getPW_Frm_FrameSearch());
		se.element().enterOrValidateText(getPW_TXT_Search(strRRS_TXT_SearchPolicy),strRRS_TXT_SearchPolicy,test);
		se.element().Click(getPW_Btn_Search(),test);
		boolean ele = se.element().isElementPresent(getPW_Btn_SearchResult());
		if(ele) {
			se.element().Click(getPW_Btn_SearchResult(),test);
		}						
		driver.switchTo().defaultContent();
		se.element().switchToFrame(getPW_FRM_iFrameStatus());
		se.element().Click(getPW_LNK_PendingQuotePolicyHS(),test);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		se.element().switchToFrame(getPW_Frm_QuoteDetails());
		se.element().Click(getCommon_BTN_Revise(),test);
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		se.element().Click(getPW_TAB_ScheduleRatingScreen(), test);
	}
	
}
