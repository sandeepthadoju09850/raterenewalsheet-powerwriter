package Libraries.ap.automation.common;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;

public class ExcelOperations {
	
	public static List<String> getTransactionList(String strRegressionID) {
		
	LinkedHashMap<String, Object> getRowsSheet1 = CommonBaseTest.getXLSTestDataByRow(
				"../../resources/new_test_data/Scenario_Selection.xlsx", "new", "Txn_Suspend_Sheet");
		List<String> transactionsList = new ArrayList<String>();
		for (String name1 : getRowsSheet1.keySet()) {
			List<Map<String, String>> suspendSheetTable = new ArrayList<Map<String, String>>();
			suspendSheetTable = (List<Map<String, String>>) getRowsSheet1.get(name1);
			int iteration =0;
			while (iteration < suspendSheetTable.size()) {
				Map<String, String> suspendSheetRow = suspendSheetTable.get(iteration);
				if (suspendSheetRow.get("Reg_ID").equalsIgnoreCase(strRegressionID)) {

					 transactionsList = Util.getAvalableList(suspendSheetRow);

					System.out.println("Transaction List" + transactionsList);
					break;
				}
iteration++;
}
		}
		return transactionsList;
	}
	
	
	public static List<String> getPagesList(String strRegressionID,String transaction) {
		LinkedHashMap<String, Object> getRowsSheet2 = CommonBaseTest.getXLSTestDataByRow("../../resources/new_test_data/Scenario_Selection.xlsx", "new", "Page_Suspend_Sheet");
		List<String> pagesList = new ArrayList<String>();
		for (String name2 : getRowsSheet2.keySet()) {
			List<Map<String, String>> transactionTable = new ArrayList<Map<String, String>>();
			transactionTable = (List<Map<String, String>>) getRowsSheet2.get(name2);
			int iteration = 0;
			while (iteration < transactionTable.size()) {
				Map<String, String> transactionSheetRow = transactionTable.get(iteration);		
				if (transactionSheetRow.get("Reg_ID").equalsIgnoreCase(strRegressionID)&&transactionSheetRow.get("Transaction Name").equalsIgnoreCase(transaction)) { 			
					pagesList = Util.getAvalableList(transactionSheetRow);	
					System.out.println("Page List" + pagesList);
					break;
				}
				iteration++;
				
			}
		}
		return pagesList;
	}



@SuppressWarnings("unchecked")
public static LinkedHashMap<String, String> getPageData(String page,String strRegressionID,String transaction) {
	LinkedHashMap<String, Object> getRowsSheet = CommonBaseTest.getXLSTestDataByRow( "../../resources/new_test_data/Pages.xlsx", "new", page);
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


@SuppressWarnings("unchecked")
public static List<Map<String, String>> getPagesData(String page,String strRegressionID,String transaction) {
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

/***************** Functional Test Data Sheet *****************/
@SuppressWarnings("unchecked")
public static List<Map<String, String>> getFuncPagesData(String page,String strRegressionID,String transaction) {
	LinkedHashMap<String, Object> getRowsSheet;
	
	
	String sheetname ="Functional_BizLink_TestData"; 
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
public static List<Map<String, String>> getBuildingPagesData(String page,String strRegressionID,String buildingName,String  transaction) {
	LinkedHashMap<String, Object> getRowsSheet = CommonBaseTest.getXLSTestDataByRow( "../../resources/new_test_data/Pages.xlsx", "new", page);
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
public static List<String> getTransactionsList(String strRegressionID) {
	
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
public static String getPageToBeSuspended(String strRegressionID,String Transaction) {
	
	LinkedHashMap<String, Object> getRowsSheet = CommonBaseTest.getXLSTestDataByRow("../../resources/test_data/Scenario_Selection", "new", "SuspendSheet");
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
				"../../resources/test_data/Scenario_Selection", "new", "SuspendSheet");
	List<Map<String, String>> pageTable = new ArrayList<Map<String, String>>();
	String controlDate = null;
	for (String name : getRowsSheet.keySet()) {
		pageTable = (List<Map<String, String>>) getRowsSheet.get(name);
		int iteration = 0;
		while (iteration < pageTable.size()) {
			LinkedHashMap<String, String> pageSheetRow = (LinkedHashMap<String, String>) pageTable.get(iteration);
			if (pageSheetRow.get("Reg_ID").equalsIgnoreCase(strRegressionID)&&pageSheetRow.get("Transaction Name").equalsIgnoreCase(Transaction)) {
				controlDate = pageSheetRow.get("ControlDate");
				}
			iteration++	;
			}
		
	
		}
	return controlDate;
}


	 




}





