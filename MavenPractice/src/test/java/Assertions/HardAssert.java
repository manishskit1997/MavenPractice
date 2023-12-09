package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert {
	
		WebDriver driver;
		
		SoftAssert softassert=new SoftAssert();
		@Test
		public void test() {
			
			driver=new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			System.out.println("Verify the pagetitle");
			softassert.assertEquals(driver.getTitle(), "Automation Testing Practice","Verify ythe page title1");
			
			System.out.println("Verifuy the wiki icon");
			WebElement Wiwkipidiaicon=driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
			softassert.assertTrue(Wiwkipidiaicon.isDisplayed());
			
			System.out.println("Verify the wiki search button");
			
			WebElement serachbutton=driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
			softassert.assertTrue(serachbutton.isDisplayed());
			
			driver.close();
			softassert.assertAll();
		}

	}

