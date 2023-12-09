package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class CrossBrowser {

	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void lunchBrowser(String browser) {

		switch(browser.toLowerCase())
		{
		case "edge":
			driver=new EdgeDriver();
			break;
		case "chrome":
			driver=new ChromeDriver();
			break;

		case "firefox":
			driver=new FirefoxDriver();
			break;
		default:
			driver=null;
			break;
		}


		driver.get("https://www.google.com/");

	}

	@Test

	public void verifyTitle()
	{
		String Expected="Google";

		String Actual = driver.getTitle();
		Assert.assertEquals(Actual, Expected);

	}

	@AfterTest
	public void quit() {
		driver.quit();
	}

}
