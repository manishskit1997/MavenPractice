package method2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SwitchtoNewTab {
	@Test
	public void testmethod(){
		WebDriver driver;
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		//driver.close();
		Set<String> windowhandles = driver.getWindowHandles();
		String p_id = driver.getWindowHandle();
		driver.switchTo().window(p_id);
		driver.close();
		//		System.out.println(windowhandles);
		//		List<String> handles=new ArrayList<>();
		//		windowhandles.addAll(windowhandles);
		//		driver.switchTo().window(handles.get(0));
		//driver.close();


	}

}
