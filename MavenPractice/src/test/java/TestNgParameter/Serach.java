package TestNgParameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Serach {
	WebDriver driver;
	
	@Test
	@Parameters({"Keyword"})
	public void serahword(String key) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		 WebElement serachbar = driver.findElement(By.name("q"));
		 serachbar.sendKeys(key);
		 Assert.assertEquals(key, serachbar.getAttribute("value"));
		 driver.quit();
		
	}
	
	

}
