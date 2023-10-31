package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class FirstTest {
 WebDriver driver;
 
	@BeforeTest
	void test() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");	
	}
	
	@Test
	void verfiyTitle() {
		System.out.println(driver.getTitle());
	}
	
	@Test
	void SearchBar() {
		WebElement serachbar = driver.findElement(By.name("q"));
		serachbar.sendKeys("india");
		System.out.println(driver.getTitle());
		
	}
	
	@AfterTest
	void tearDown()
	{	
		driver.quit();
	}

}
