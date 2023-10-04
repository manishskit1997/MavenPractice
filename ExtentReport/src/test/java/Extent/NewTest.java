package Extent;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {

	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("extentreport.html");
	WebDriver driver;
	@Test
	public void Browserlauch() {

		ExtentTest test=extent.createTest("Verify the pagetitle").assignAuthor("Manish").assignCategory("Functional test case").assignDevice("Window");
		test.info("I am capturing title");
		String title = driver.getTitle();
		test.info("Capture the page title as : "+title);
		if(title.equals("Google"))
		{
			test.pass("page title is verfied:Title capture "+title);
		}
		else
		{
			test.fail("page title is not match with expecxted result: "+title);
		}

	}
	
	 

	@BeforeTest
	public void beforeTest() {



		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Myreport");
		extent.attachReporter(spark);

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");

	}

	@AfterTest
	public void afterTest() {
		extent.flush();
		driver.quit();
	}

}
