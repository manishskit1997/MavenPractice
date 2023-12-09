package method2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {
	public  WebDriver driver;

	@BeforeMethod

	void pre() {
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver =new EdgeDriver();
		driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.repatha.de/");
	}

//	@AfterMethod
//	void afterMethod()
//	{
//		driver.close();
//	}


	@Test
	void  title(){


		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle() , "Repatha®");
	}

	@Test
	void textverify() {
				
				String text = driver.findElement(By.xpath("//h1[@class='teaser-stage_title']")).getText();
				if(text.contains("Jetzt anmelden und auf Informationen\r\n"
						+ "für Fachkreise zugreifen")) {
					Assert.assertTrue(true);
				}
	
	}

}
