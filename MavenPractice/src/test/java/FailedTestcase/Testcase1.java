package FailedTestcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1 {
	
	@Test(retryAnalyzer=RetrtyAnalyzerClass.class)
	public void test1()
	{
		Assert.assertTrue(true);
	}
	
	@Test(retryAnalyzer=RetrtyAnalyzerClass.class)
	public void test2()
	{
		Assert.assertTrue(true);
	}

	@Test(retryAnalyzer=RetrtyAnalyzerClass.class)
	public void test3()
	{
		Assert.assertTrue(true);
	}
}
