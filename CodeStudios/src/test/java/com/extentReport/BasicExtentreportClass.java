package com.extentReport;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtentreportClass {

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;

	@BeforeTest
	public void ConfigureReport(){
		htmlReporter =new ExtentSparkReporter("ExtentReport.html");
		reports=new ExtentReports();
		reports.attachReporter(htmlReporter);

		//Add the environment details

		reports.setSystemInfo("Suite", "Sanity check");
		reports.setSystemInfo("Sprint", "1");
		reports.setSystemInfo("Machine", "PC");
		reports.setSystemInfo("OS", "Windows 11");
		reports.setSystemInfo("User", "Manish Kumar");
		reports.setSystemInfo("Browser", "Chrome");

		//configuration to change look and feel
		htmlReporter.config().setDocumentTitle("Automation Test");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE,MMMM DD,YYYY,hh:mm a '('zzz')'");
	}


	@Test
	public void launchWebsite() {
		reports.createTest("Launch the browser and launch browser");
		Assert.assertTrue(false);

	}

	@Test
	public void VerifyTitle() {
		reports.createTest("VerifyTitle");
		Assert.assertTrue(true);

	}
	@Test
	public void VerifyLogo() {
		reports.createTest("VerifyLogo");
		Assert.assertTrue(false);

	}
	@Test
	public void VerifyEmail() {
		reports.createTest("VerifyEmail");
		throw new SkipException("Skipking this test case with exception..");

	}
	@Test
	public void Verifyusername() {
		reports.createTest("Verifyusername");
		Assert.assertTrue(true);

	}

	@AfterMethod
	public void getTestResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"FAIL", ExtentColor.RED));
		}
		else
			if(result.getStatus()==ITestResult.SUCCESS)
			{
				test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"FAIL", ExtentColor.GREEN));
			}
			else

				if(result.getStatus()==ITestResult.SKIP)
				{
					test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"FAIL", ExtentColor.YELLOW));
				}


	}
	@AfterTest
	public void tearDown()
	{
		reports.flush();
	}
}
