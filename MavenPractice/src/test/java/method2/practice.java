package method2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practice {
	public  WebDriver driver;
	
	@Test
	void  practice() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.repatha.de/");
		String sorece = driver.getPageSource();
		System.out.println(sorece);
		Thread.sleep(2000);		
		driver.close();
	}

}
