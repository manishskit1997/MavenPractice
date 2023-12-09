package TestListnerexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	WebDriver driver;
	
	@Test
	public void serahword() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Assert.assertEquals("Google", driver.getTitle());
	}
	@Test
	public void testfail()
	{
		System.out.println("failed test case. ");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testskip()
	{
		System.out.println("skipped test case. ");
		throw new SkipException("skip exception throw..");
	}

}
