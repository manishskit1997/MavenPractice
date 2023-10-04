package inetBanking.testCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;

public class BaseClass {

	ReadConfig redconfig=new ReadConfig();

	public String baseURL=redconfig.getBaseUrl();
	public String username=redconfig.getUsername();
	public String password=redconfig.getPassword();
	public  WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{

		//logger=logger.getLogger("inetBanking");
		//PropertyConfigurator.configure("log4j.properties.txt");

		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",redconfig.getChromePath());
			driver =new ChromeDriver();

		}
		else
			if(br.equals("firefox"))
			{
				System.setProperty("webdriver.firefox.driver",redconfig.getFirefoxPath());
				driver =new FirefoxDriver();

			} 
		driver.get(baseURL);

	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}


}
