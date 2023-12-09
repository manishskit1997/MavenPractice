package method2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascriptexc {
	public static void main(String[] args) {
		WebDriver driver;
		driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/login.html");
		//driver.findElement(By.id("email")).sendKeys("Hello");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='Avinas kumar';");
		js.executeScript("document.getElementById('passwd').value='kumar';");
		WebElement element = driver.findElement(By.id("SubmitLogin"));
		js.executeScript("arguments[0].click();",element);
		driver.quit();
		
	}

}
