package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waithelaper {
	public WebDriver driver;
	
	public waithelaper(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void waitForElement(WebElement element,Duration timeOutInSecons) {
		WebDriverWait wait=new WebDriverWait(driver,timeOutInSecons);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
