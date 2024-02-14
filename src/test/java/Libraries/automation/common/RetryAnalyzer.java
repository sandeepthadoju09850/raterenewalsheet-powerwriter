package Libraries.automation.common;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import static org.testng.internal.Constants.displayStatus;
import org.apache.commons.lang.ArrayUtils;

public class RetryAnalyzer implements IRetryAnalyzer {
	 private int retryCount = 0;
	    private int maxRetryCount = 1;

	// Below method returns 'true' if the test method has to be retried else 'false' 
	//and it takes the 'Result' as parameter of the test method that just ran
	    public boolean retry(ITestResult result) {
	        if (retryCount < maxRetryCount) {
	            System.out.println("Retrying test " + result.getName() + " with status "
	                    + getResultStatusName(result.getStatus()) + " for the " + (retryCount+1) + " time(s).");
	            retryCount++;
	            return true;
	        }
	        return false;
	    }
	    
	    public String getResultStatusName(int status) {
	    	String resultName = null;
	    	if(status==1)
	    		resultName = "SUCCESS";
	    	if(status==2)
	    		resultName = "FAILURE";
	    	if(status==3)
	    		resultName = "SKIP";
			return resultName;
	    }
}

