package method2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sqe {

	public static void main(String[] args) {
		WebDriver driver;
		driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/login.html");
	}

}
