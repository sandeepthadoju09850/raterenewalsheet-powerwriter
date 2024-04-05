package Libraries.automation.common;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import Libraries.automation.common.CommonBaseTest;
import Libraries.automation.common.framework.Util;
import pw.Constants.constants;

public class ExcelOperations {
	
	public static List<String> getTransactionList(String strRegressionID) {
		
	LinkedHashMap<String, Object> getRowsSheet1 = CommonBaseTest.getXLSTestDataByRow(
			strRegressionID.substring(0, 2),"../../resources/testData/Scenario_Selection", "new", "Txn_Suspend_Sheet");
		List<String> transactionsList = new ArrayList<String>();
		for (String name1 : getRowsSheet1.keySet()) {
			List<Map<String, String>> suspendSheetTable = new ArrayList<Map<String, String>>();
			suspendSheetTable = (List<Map<String, String>>) getRowsSheet1.get(name1);
			int iteration =0;
			while (iteration < suspendSheetTable.size()) {
				Map<String, String> suspendSheetRow = suspendSheetTable.get(iteration);
				if (suspendSheetRow.get("Reg_ID").equalsIgnoreCase(strRegressionID)) {

					 transactionsList = Util.getAvalableList(suspendSheetRow);

					//System.out.println("Transaction List" + transactionsList);
					break;
				}
iteration++;
}
		}
		return transactionsList;
	}
	
	
	public static List<String> getPagesList(String strRegressionID,String transaction) {
		LinkedHashMap<String, Object> getRowsSheet2 = CommonBaseTest.getXLSTestDataByRow(strRegressionID.substring(0, 2),"../../resources/testData/Scenario_Selection", "new", "Page_Suspend_Sheet");
		List<String> pagesList = new ArrayList<String>();
		for (String name2 : getRowsSheet2.keySet()) {
			List<Map<String, String>> transactionTable = new ArrayList<Map<String, String>>();
			transactionTable = (List<Map<String, String>>) getRowsSheet2.get(name2);
			int iteration = 0;
			while (iteration < transactionTable.size()) {
				Map<String, String> transactionSheetRow = transactionTable.get(iteration);		
				if (transactionSheetRow.get("Reg_ID").equalsIgnoreCase(strRegressionID)&&transactionSheetRow.get("Transaction Name").equalsIgnoreCase(transaction)) { 			
					pagesList = Util.getAvalableList(transactionSheetRow);	
					//System.out.println("Page List" + pagesList);
					break;
				}
				iteration++;
				
			}
		}
		return pagesList;
	}



@SuppressWarnings("unchecked")
public static LinkedHashMap<String, String> getPageData(String page,String strRegressionID,String transaction) {
	LinkedHashMap<String, Object> getRowsSheet = CommonBaseTest.getXLSTestDataByRow( constants.NA,"../../resources/testData/Pages.xlsx", "new", page);
	LinkedHashMap<String, String> pageData = new LinkedHashMap<>();
	for (String name : getRowsSheet.keySet()) {
		List<Map<String, String>> pageTable = new ArrayList<Map<String, String>>();
		pageTable = (List<Map<String, String>>) getRowsSheet.get(name);
		int iteration = 0;
		while (iteration < pageTable.size()) {
			LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) pageTable.get(iteration);
			if (pageSheetRow.get("LOB").equalsIgnoreCase(strRegressionID)&&pageSheetRow.get("Transaction Name").equalsIgnoreCase(transaction)) { 			
				pageData = pageSheetRow;
				break;
			}
		iteration++	;
	}
}
return pageData;
}

//Commented Get Pages Old Code
/*@SuppressWarnings("unchecked")
public static List<Map<String, String>> getPagesData(String page,String strRegressionID,String transaction) {
	LinkedHashMap<String, Object> getRowsSheet;
	if(strRegressionID.contains("CA")||(strRegressionID.contains("WC"))){
	 getRowsSheet = CommonBaseTest.getXLSTestDataByRow( "../../resources/testData/CAWCPages.xlsx", "new", page);
	}
	else{
	 getRowsSheet = CommonBaseTest.getXLSTestDataByRow( "../../resources/testData/Pages.xlsx", "new", page);
	}
	List<Map<String, String>> pageTable = new ArrayList<Map<String, String>>();
	List<Map<String, String>> table = new ArrayList<Map<String, String>>();
	for (String name : getRowsSheet.keySet()) {
		pageTable = (List<Map<String, String>>) getRowsSheet.get(name);
		int iteration = 0;
		while (iteration < pageTable.size()) {
			LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) pageTable.get(iteration);
			if (pageSheetRow.get("LOB").equalsIgnoreCase(strRegressionID)&&pageSheetRow.get("Transaction Name").equalsIgnoreCase(transaction)) { 			
				table.add(pageSheetRow);
			}
		iteration++	;
	}
}
return table;
}*/

//New Method to get pages data

@SuppressWarnings("unchecked")
public static List<Map<String, String>> getBLPagesData(String page,String strRegressionID,String transaction) {
	LinkedHashMap<String, Object> getRowsSheet;
	
	//String sheetname ="R2_AP_TestData_"+ System.getProperty("Environment");
	
	String sheetname =System.getProperty("Testdata")+"_Bizlink_TestData"; 
	getRowsSheet = CommonBaseTest.getXLSTestDataByRow("../../resources/test_data/"+sheetname+".xlsx", "new", page);

	List<Map<String, String>> pageTable = new ArrayList<Map<String, String>>();
	List<Map<String, String>> table = new ArrayList<Map<String, String>>();
	for (String name : getRowsSheet.keySet()) {
		pageTable = (List<Map<String, String>>) getRowsSheet.get(name);
		int iteration = 0;
		while (iteration < pageTable.size()) {
			LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) pageTable.get(iteration);
			if (pageSheetRow.get("LOB").equalsIgnoreCase(strRegressionID)&&pageSheetRow.get("Transaction Name").equalsIgnoreCase(transaction)) { 			
				table.add(pageSheetRow);
			}
		iteration++	;
	}
}
return table;
}

@SuppressWarnings("unchecked")
public static List<Map<String, String>> getPagesData(String page,String strRegressionID,String transaction) {
	LinkedHashMap<String, Object> getRowsSheet = null;
	if(strRegressionID.contains(constants.CA)||(strRegressionID.contains(constants.WC))){
	 getRowsSheet = CommonBaseTest.getXLSTestDataByRow( constants.NA,"../../resources/testData/CAWCPages.xlsx", "new", page);
	}
	else if(strRegressionID.contains(constants.CP)||(strRegressionID.contains(constants.BP))||(strRegressionID.contains(constants.TC))){
	 getRowsSheet = CommonBaseTest.getXLSTestDataByRow( constants.NA,"../../resources/testData/Pages.xlsx", "new", page);
	}
	else if(strRegressionID.contains(constants.CU)||strRegressionID.contains(constants.PM)) {
		if(transaction.contains(constants.CP)||(transaction.contains(constants.BP))||(transaction.contains(constants.TC))){
			 getRowsSheet = CommonBaseTest.getXLSTestDataByRow(constants.NA, "../../resources/testData/Pages.xlsx", "new", page);
		}
		else if(transaction.contains(constants.CA)||(transaction.contains(constants.WC))){
			getRowsSheet = CommonBaseTest.getXLSTestDataByRow(constants.NA, "../../resources/testData/CAWCPages.xlsx", "new", page);
		}
		else if(transaction.contains(constants.CU)){
			 getRowsSheet = CommonBaseTest.getXLSTestDataByRow( constants.NA,"../../resources/testData/CUPages.xlsx", "new", page);
		}
		else if(transaction.contains(constants.CP)||(transaction.contains(constants.BP))||(transaction.contains(constants.TC))){
			 getRowsSheet = CommonBaseTest.getXLSTestDataByRow(constants.NA, "../../resources/testData/Pages.xlsx", "new", page);
		}
		else{
			 getRowsSheet = CommonBaseTest.getXLSTestDataByRow("../../resources/testData/E2EFlow_Bizlink_TestData.xlsx", "new", page);
		}
	}
	List<Map<String, String>> pageTable = new ArrayList<Map<String, String>>();
	List<Map<String, String>> table = new ArrayList<Map<String, String>>();
	for (String name : getRowsSheet.keySet()) {
		pageTable = (List<Map<String, String>>) getRowsSheet.get(name);
		int iteration = 0;
		while (iteration < pageTable.size()) {
			LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) pageTable.get(iteration);
			if (pageSheetRow.get("LOB").equalsIgnoreCase(strRegressionID)&&pageSheetRow.get("Transaction Name").equalsIgnoreCase(transaction)) { 			
				table.add(pageSheetRow);
			}
		iteration++	;
	}
}
return table;
}


public static List<Map<String, String>> getBuildingPagesData(String page,String strRegressionID,String buildingName,String  transaction) {
	LinkedHashMap<String, Object> getRowsSheet = CommonBaseTest.getXLSTestDataByRow( constants.NA,"../../resources/testData/Pages.xlsx", "new", page);
	List<Map<String, String>> pageTable = new ArrayList<Map<String, String>>();
	List<Map<String, String>> table = new ArrayList<Map<String, String>>();
	for (String name : getRowsSheet.keySet()) {
		pageTable = (List<Map<String, String>>) getRowsSheet.get(name);
		int iteration = 0;
		while (iteration < pageTable.size()) {
			LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) pageTable.get(iteration);
			if (pageSheetRow.get("LOB").equalsIgnoreCase(strRegressionID)&&pageSheetRow.get("Transaction Name").equalsIgnoreCase(transaction)&&(pageSheetRow.get("CP_Bldgs_BuildingName").equalsIgnoreCase(buildingName))) { 			
				table.add(pageSheetRow);
			}
		iteration++	;
	}
}
return table;
}

@SuppressWarnings("unchecked")
public static List<String> getBLTransactionsList(String strRegressionID) {
	
	LinkedHashMap<String, Object> getRowsSheet = CommonBaseTest.getXLSTestDataByRow("../../resources/test_data/Scenario_Selection", "new", "SuspendSheet");
	List<Map<String, String>> pageTable = new ArrayList<Map<String, String>>();
	List<String> TransactionList = new ArrayList<String>();
	String execute = constants.Execute;
	for (String name : getRowsSheet.keySet()) {
		pageTable = (List<Map<String, String>>) getRowsSheet.get(name);
		int iteration = 0;
		while (iteration < pageTable.size()) {
			LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) pageTable.get(iteration);
			if (pageSheetRow.get("Reg_ID").equalsIgnoreCase(strRegressionID)&&pageSheetRow.get("Execute").equalsIgnoreCase("Yes")) {
				if(execute.equalsIgnoreCase("Bizlink")) {
					if(pageSheetRow.get("Transaction Name").contains("NewQuote")) {
						TransactionList.add(pageSheetRow.get("Transaction Name"));
					}
					
				}else if(execute.equalsIgnoreCase("PW")){
					TransactionList.add(pageSheetRow.get("Transaction Name"));
				}
					
			}
		iteration++	;
	
		}
}
return TransactionList;
}

@SuppressWarnings("unchecked")
public static List<String> getTransactionsList(String strRegressionID) {
	
	LinkedHashMap<String, Object> getRowsSheet = CommonBaseTest.getXLSTestDataByRow(
			strRegressionID.substring(0, 2),"../../resources/testData/Scenario_Selection", "new", "SuspendSheet");
	List<Map<String, String>> pageTable = new ArrayList<Map<String, String>>();
	List<String> TransactionList = new ArrayList<String>();
	for (String name : getRowsSheet.keySet()) {
		pageTable = (List<Map<String, String>>) getRowsSheet.get(name);
		int iteration = 0;
		while (iteration < pageTable.size()) {
			LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) pageTable.get(iteration);
			if (pageSheetRow.get("Reg_ID").equalsIgnoreCase(strRegressionID)&&pageSheetRow.get("Execute").equalsIgnoreCase("Yes")) {
					TransactionList.add(pageSheetRow.get("Transaction Name"));
			}
		iteration++	;
	
		}
}
return TransactionList;
}


public static String getPageToBeSuspended(String strRegressionID,String Transaction) {
	
	LinkedHashMap<String, Object> getRowsSheet = CommonBaseTest.getXLSTestDataByRow(
			strRegressionID.substring(0, 2),"../../resources/testData/Scenario_Selection", "new", "SuspendSheet");
	List<Map<String, String>> pageTable = new ArrayList<Map<String, String>>();
	String suspendedPage = "No";
	for (String name : getRowsSheet.keySet()) {
		pageTable = (List<Map<String, String>>) getRowsSheet.get(name);
		int iteration = 0;
		while (iteration < pageTable.size()) {
			LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) pageTable.get(iteration);
			if (pageSheetRow.get("Reg_ID").equalsIgnoreCase(strRegressionID)&&pageSheetRow.get("Transaction Name").equalsIgnoreCase(Transaction)&&pageSheetRow.get("SuspendPage?").equalsIgnoreCase("Yes")) {
				suspendedPage = pageSheetRow.get("PageToSuspend");
				}
			iteration++	;
			}
		
	
		}
	return suspendedPage;
}

@SuppressWarnings("unchecked")
public static String getControlDate(String strRegressionID,String Transaction) {
	
	LinkedHashMap<String, Object> getRowsSheet = CommonBaseTest.getXLSTestDataByRow(
			strRegressionID.substring(0, 2),"../../resources/testData/Scenario_Selection", "new", "SuspendSheet");
	List<Map<String, String>> pageTable = new ArrayList<Map<String, String>>();
	String controlDateVal = "";
	String firstControlDate = System.getProperty("ControlDate");
	String controlDate = "";
	for (String name : getRowsSheet.keySet()) {
		pageTable = (List<Map<String, String>>) getRowsSheet.get(name);
		int iteration = 0;
		while (iteration < pageTable.size()) {
			LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) pageTable.get(iteration);
			if (pageSheetRow.get("Reg_ID").equalsIgnoreCase(strRegressionID)&&pageSheetRow.get("Transaction Name").equalsIgnoreCase(Transaction)) {
				controlDateVal = pageSheetRow.get("ControlDate");
				//If condition to get the control date based on the value from control date column on suspend sheet.
				if(controlDateVal.equalsIgnoreCase(constants.NA)){
					controlDate = controlDateVal;
				} else if(controlDateVal.equals("0") || controlDateVal.equals("1") || controlDateVal.equals("2")){
					int controlDateNo = Integer.parseInt(controlDateVal);
					controlDate = Util.getFutureYear(firstControlDate, controlDateNo);
				} else{
					controlDate = controlDateVal;
				}
			}
			iteration++	;
			}
		
	
		}
	return controlDate;
}




}





