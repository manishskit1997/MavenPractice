package com.verifylink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyLinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 	 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://hcp-it.acc-oaov2.net/amgen-network");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		List<WebElement> All_links = driver.findElements(By.tagName("a"));
		System.out.println("the lotal links are: "+All_links.size());

		for(WebElement links:All_links)
		{
			String url1=links.getAttribute("href");
			System.out.println(url1);
			
			URL url=new URL(url1);
			HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(3000);
			httpURLConnect.connect();
			if(httpURLConnect.getResponseCode()==200)
			{
				System.out.println(url1+" -Valid   "+httpURLConnect.getResponseMessage());
			}
			else
			if(httpURLConnect.getResponseCode()==httpURLConnect.HTTP_NOT_FOUND )
			{
				System.out.println(url1+" -Invalid  "+httpURLConnect.getResponseMessage()+" -"+httpURLConnect.HTTP_NOT_FOUND );
			}
			
		}
		
	}

}
