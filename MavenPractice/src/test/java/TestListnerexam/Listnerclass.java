package TestListnerexam;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class Listnerclass implements ITestListener{

	public void onFinish(ITestContext Result)
	{
		System.out.println("On finished method invoked..");
	}
	public void onStart(ITestContext Result)
	{
		System.out.println("on Start method invoked..");
		
	}
	
	public void onTestFailure(ITestContext Result)
	{
		System.out.println("on failure method invoked.."+Result.getName());
		
	}
	
	public void onTestSkipped(ITestContext Result)
	{
		System.out.println("on skipped method invoked.."+Result.getName());
	}
	
	public void onTestSuccess(ITestContext Result)
	{
		System.out.println("Name of test method successfuly executed: "+Result.getName());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestContext Result)
	{
		
	}
}
