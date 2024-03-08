package Libraries.ap.automation.common;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import Libraries.ap.automation.common.framework.Util;



@SuppressWarnings("unused")
public class Transformer implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		Util.skipExecution(testMethod, annotation);
	}

	/*
	 * @Override public void transform(ITestAnnotation annotation, Class testClass,
	 * Constructor testConstructor, Method testMethod) { Map<String, String>
	 * scenarioSelectionData = Util.getExecutionDetails();
	 * System.out.println("scenarioSelectionData " + scenarioSelectionData); String
	 * strExecuteScriptStatus = (String)
	 * scenarioSelectionData.get(testMethod.getName()); if(strExecuteScriptStatus ==
	 * null){ annotation.setEnabled(false); }else{
	 * if(strExecuteScriptStatus.equalsIgnoreCase("No")) {
	 * annotation.setEnabled(false); } } }
	 */

}
