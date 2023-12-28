package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;


public class TestBase {

	public WebDriver driver;
	public PickoContainerTextContent PCTC;

	public TestBase(PickoContainerTextContent PCTC)

	{
		this.PCTC=PCTC;

	}

	public WebDriver WedDriver() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties pop=new Properties();
		pop.load(fis);
		String url=pop.getProperty("QAurl");
		String browser_properties=pop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		
		String browser=browser_maven!=null ? browser_maven : browser_properties;
		
		if(PCTC.driver==null) {
			if(browser.equalsIgnoreCase("chrome")){
			PCTC.driver=new ChromeDriver();
			}
			else
				if(browser.equalsIgnoreCase("Firefox")) {
					PCTC.driver=new FirefoxDriver();
					}
			PCTC.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			PCTC.driver.get(url);
		}
		return PCTC.driver;
	}

}
