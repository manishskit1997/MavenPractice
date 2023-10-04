package com.mystore.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Readconfig {

	Properties properties;
	String path="./Configuration/config.properties";
	
	//constort
	public Readconfig()
	{
		
		try {
			properties=new Properties();
			FileInputStream fis=new FileInputStream(path);
			properties.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public String getBaseURL()
	{
		String Value = properties.getProperty("Baseurl");
		if(Value!=null)
		return Value;
		else
			throw new RuntimeException("url is not specified in config file");
	}
	
	public String getBrowser()
	{
		String Value = properties.getProperty("Browser");
		if(Value!=null)
		return Value;
		else
			throw new RuntimeException("Browser is not specified in config file");
	}
	
	public String enterEmail()
	{
		String Value = properties.getProperty("email");
		if(Value!=null)
		return Value;
		else
			throw new RuntimeException("Browser is not specified in config file");
	}
	public String enterPassword()
	{
		String Value = properties.getProperty("password");
		if(Value!=null)
		return Value;
		else
			throw new RuntimeException("Browser is not specified in config file");
	}
}
