package com.propertiesreader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Propertiesreader {
	public static void main(String[] args) throws IOException  {

		FileReader read=new FileReader("data.properties");

		Properties p=new Properties();
		p.load(read);
	
		System.out.println(p.getProperty("user"));  
		System.out.println(p.getProperty("password")); 
	}

}
