package inetBanking.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.loginPage;

public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void loginTest() throws InterruptedException
	{
		driver.get(baseURL);
		logger.info("URL is opened");
		driver.manage().window().maximize();
		logger.info("Window maximize");
		loginPage lp=new loginPage(driver);
		lp.setUserName(username);
		logger.info("Entered USER name");
		Thread.sleep(2000);
		lp.setPassword(password);
		Thread.sleep(2000);
		logger.info("Entered password");
		lp.clickSubmit();
		logger.info("click on button");
		Thread.sleep(2000);
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) 
		{
			Assert.assertTrue(true);
			logger.info("Login test pass");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("login test fail");
		}
	}

}
