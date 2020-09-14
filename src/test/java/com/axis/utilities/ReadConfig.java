package com.axis.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	// create constructor
	public ReadConfig()
	{
		File src=new File("./Configurations\\config.properties");
	
		try{
			
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) 
		
		{
			System.out.println("Exception is "+ e.getMessage());
		}	
			
	}
	
	//create method for url 
	public String getApplicationUrl()
	
	{
		String url=pro.getProperty("baseUrl");
		return url;
		
	}
	
	//create method for username
	public String getUsername()
	{
		
		String username=pro.getProperty("userName");
		return username;
		
	}
	
	// create method for password
	public String getPassword()
	{
		
		String password=pro.getProperty("password");
		return password;
		
	}
	
	//create method for chromepath
	public String getChromePath()
	{
		
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
		
	}
		
	//create method for firefox
	public String getFirefoxPath()
	{
		
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
		
	}
	
}
		