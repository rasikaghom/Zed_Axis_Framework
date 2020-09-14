package com.axis.testCases;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import com.axis.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();                  // create object
	//common variables
public String baseUrl=readconfig.getApplicationUrl();
public String userName=readconfig.getUsername();
public String password=readconfig.getPassword();
public static WebDriver driver;
public static Logger logger;

@Parameters("browser")
@BeforeClass
public void Setup(String br)
  {	
	
	logger=Logger.getLogger("Zed_Axis");
	PropertyConfigurator.configure("Log4j.properties");
	
	if(br.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
        driver=new ChromeDriver();
    
	}
	
	else if(br.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
		driver=new FirefoxDriver();
		
	}
    
	driver.get(baseUrl);
	logger.info("Browser launching the Zed Axis application successfully");


  }

@AfterClass
public void teardown() 
{
driver.quit();
}

public void captureScreen(WebDriver driver, String tname) throws IOException
{
    TakesScreenshot ts=(TakesScreenshot) driver;
    File source=ts.getScreenshotAs(OutputType.FILE);
    File target=new File(System.getProperty("user.dir") +"/Screenshots/" + tname + ".png");
    FileUtils.copyFile(source, target);
    System.out.println("Screenshot taken");
    
}

}