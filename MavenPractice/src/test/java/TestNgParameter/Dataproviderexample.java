package TestNgParameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviderexample {

	@Test(dataProvider = "serchData",dataProviderClass = DataproviderSeprateClass.class)
	public void serahword(String country , String monument) {
		WebDriver driver;
		//WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement serachbar = driver.findElement(By.name("q"));
		serachbar.sendKeys(country +" "+monument);
		driver.findElement(By.name("btnK")).submit();

	}
	
	

}
