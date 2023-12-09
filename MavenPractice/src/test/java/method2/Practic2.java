package method2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practic2 {
	
	public  WebDriver driver;

	@BeforeMethod

	void pre() {
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver =new EdgeDriver();
		driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/login.html");
	}

	@Test
	void usingJavaScript() throws Throwable 
	{
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.findElement(By.xpath("//a[text()='Accept Cookies']")).click();
		js.executeScript("documents.getElementById(('email').value='Avinash Mishra';");
		//js.executeScript("documents.getElementByXpath(('//input[@id='Form_getForm_FullName']').value='Avinash Mishra';");
		
	}

}
