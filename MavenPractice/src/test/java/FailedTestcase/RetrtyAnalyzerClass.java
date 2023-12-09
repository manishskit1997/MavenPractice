package FailedTestcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetrtyAnalyzerClass implements IRetryAnalyzer {
	
	int counterForRetryAttemps=0;
	int setMaxLimitForRetry=3;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess())
		{
			if(counterForRetryAttemps < setMaxLimitForRetry)
			{
				counterForRetryAttemps++;
				return true;
			}
		}
		return false;
	}

}
