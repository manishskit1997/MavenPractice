package Stepdefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.PickoContainerTextContent;
import io.cucumber.java.*;

public class Hooks {
PickoContainerTextContent PCTC;
WebDriver driver;
public Hooks(PickoContainerTextContent PCTC)
	
	{
		this.PCTC=PCTC;	
	}
@After
public void AFterSenarion()
{
	PCTC.driver.quit();
}

@AfterStep
public void AddScreenshot(Scenario scenario) throws IOException
{
	WebDriver driver=PCTC.driver;
	if(scenario.isFailed())
	{
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		byte[] filecontent = FileUtils.readFileToByteArray(src);
		scenario.attach(filecontent, "image/png", "image");
	}
	 
}

}
