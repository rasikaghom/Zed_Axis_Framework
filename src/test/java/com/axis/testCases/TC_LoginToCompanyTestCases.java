package com.axis.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.axis.pageObject.LoginScreenPage;

public class TC_LoginToCompanyTestCases extends BaseClass{

	@Test(priority=1)
	public void intuitButton() throws InterruptedException, IOException
	{
		
		LoginScreenPage login=new LoginScreenPage(driver);   //login
		login.clickIntuitButton();
		logger.info("Intuit Button is clickable");

		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Zed-Axis Online"))
		{
			
			Assert.assertTrue(true);
			logger.info("User redirecting to Sign_In screen successfully");
			
		}
		else
		{
			captureScreen(driver,"intuitButton");
			Assert.assertTrue(false);
			logger.info("User not redirecting to Sign_In screen");
			
		}
	}
	
	
	  @Test(priority=2)
		public void SignInTest() throws InterruptedException, IOException
		{
			LoginScreenPage login=new LoginScreenPage(driver);   //login
			//login.clickIntuitButton();
			//logger.info("User redirecting to SignIn screen successfully");
			
			Thread.sleep(2000);

			//LoginScreenPage login=new LoginScreenPage(driver);
			login.setUserName(userName);
			logger.info("Username entered successfully");
			login.setPassword(password);
			logger.info("Password entered successfully");
			login.clickSignInButton();
			Thread.sleep(2000);
			logger.info("User is able to click Sign In button");
			Thread.sleep(2000);
			//login.ClickRadioButton();
		//	Thread.sleep(2000);
			//login.clickContinueButton();
			Thread.sleep(2000);
			login.clickSkipForNow();
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("Intuit Accounts - Sign In"))
				{
				     Assert.assertTrue(true);
			         logger.info("User redirecting to select for a company screen successfully");
				
			         }
			else
			  {
				  captureScreen(driver,"SignInTest");
		             Assert.assertTrue(false);
				  logger.info("User failed to redirecting select for a company screen");
			}
				Thread.sleep(10000);
}
	  @Test(priority=3)
		public void CompanySelection() throws InterruptedException, IOException
		{
			LoginScreenPage login=new LoginScreenPage(driver);   //login
			login.clickLoginCompany();
			login.clickSandboxCompany3();
			login.clickNextButton();
	  Thread.sleep(50000);
	  System.out.println(driver.getTitle());
	  
}
}