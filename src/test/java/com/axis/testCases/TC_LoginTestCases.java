package com.axis.testCases;

	import java.io.IOException;
    import org.testng.Assert;
	import org.testng.annotations.Test;

import com.axis.pageObject.LoginScreenPage;


	public class TC_LoginTestCases extends BaseClass
	{
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
	public void ForgotScreen() throws InterruptedException, IOException
	{
		LoginScreenPage login=new LoginScreenPage(driver);   //login
		login.clickIntuitButton();
		
		Thread.sleep(2000);

		login.clickForgotPassword();
		logger.info("Forgot User Id or Password link is clickable");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		logger.info("User redirecting to Forgot Password screen");
		Thread.sleep(2000);
		login.clickForgotCancelbutton();
		
		if(driver.getTitle().equals("Intuit Accounts - Sign In"))
		{
	         Assert.assertTrue(true);
             logger.info("User redirecting to SignIn Screen after click on Cancel button on Forgot Password screen");
        }
        else
        {
	          captureScreen(driver,"SignInTest");
              Assert.assertTrue(false);
	          logger.info("User failed to redirecting to SignIn Screen");
        }
			Thread.sleep(3000);
	}
	
	
	
	@Test(priority=3)
	public void NewAccount() throws InterruptedException, IOException
	{
		LoginScreenPage login=new LoginScreenPage(driver);   //login
		//login.clickIntuitButton();
		
		Thread.sleep(2000);

		login.clickCreateAccount();
		logger.info("Create account link is clickable");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		logger.info("User redirecting to Create new account screen");
		Thread.sleep(2000);
		login.clickSignIn2Button();
		if(driver.getTitle().equals("Intuit Accounts - Sign In"))
		{
	         Assert.assertTrue(true);
             logger.info("User redirecting to SignIn Screen after click on sign in button on Create New Account screen");
        }
        else
        {
	          captureScreen(driver,"SignInTest");
              Assert.assertTrue(false);
	          logger.info("User failed to redirecting to SignIn Screen");
        }
	
			Thread.sleep(3000);
	}
	
	
	//@Test(priority=4)
	//public void InvalidSignInTest1() throws InterruptedException
//	{
	//	LoginScreenPage login=new LoginScreenPage(driver);
	//	Thread.sleep(2000);
//		login.setInvalidUserName("abcde");
//		login.setInvalidPassword("Password@123");
//		login.clickSignInButton();
//		Thread.sleep(2000);
//		boolean res1=driver.getPageSource().contains("Hmm. That didn't work.");
//		if(res1==true)
//		{
//			System.out.println("User entered invalid User Id");
//		}
//      else
//		{
//			System.out.println("test case fail");
//
//		}
//	   Thread.sleep(2000);
	   
//	}
	
	
//	@Test(priority=5)
//	public void InvalidSignInTest2() throws InterruptedException
//	{
//		LoginScreenPage login=new LoginScreenPage(driver);
//		Thread.sleep(2000);
//		login.setInvalidUserName("pankhuri.neema@omni-bridge.net");
//		login.setInvalidPassword("Password@12345");
//		login.clickSignInButton();
//		Thread.sleep(2000);
//		boolean res2=driver.getPageSource().contains("Hmm. That didn't work.");
//		if(res2==true)
//		{
//			System.out.println("User entered invalid password");
	//	}
		//else
		//{
			//System.out.println("test case fail");

		//}
	//}
	
	
//	@Test(priority=6)
//	public void InvalidSignInTest3() throws InterruptedException
	//{
		//LoginScreenPage login=new LoginScreenPage(driver);
		//Thread.sleep(2000);
		//login.setInvalidUserName("abvhgfy.dbyue");
	//	login.setInvalidPassword("Password@12365");
	//	login.clickSignInButton();
	//	Thread.sleep(2000);
	//	boolean res3=driver.getPageSource().contains("Hmm. That didn't work.");
	//	if(res3==true)
	//	{
//			System.out.println("user entered invalid username and password");
//		}
	//	else
//		{
	//		System.out.println("test case fail");
//
//		}
//	}
	
	
	
//	/@Test(priority=7)
//	public void InvalidSignInTest4() throws InterruptedException
//	{
//		LoginScreenPage login=new LoginScreenPage(driver);
//		Thread.sleep(2000);
//		login.setInvalidUserName("");
//		login.setInvalidPassword("");
//		login.clickSignInButton();
//		Thread.sleep(2000);
//		boolean res4=driver.getPageSource().contains("Please enter a valid user ID.");
//		if(res4==true)
//		{
//			System.out.println("test case pass");
//		}
//		else
//		{
//			System.out.println("test case fail");
//
//		}
//		boolean res5=driver.getPageSource().contains("Please enter password.");
//		if(res5==true)
//		{
//			System.out.println("test case pass");
//		}
//		else
//		{
//			System.out.println("test case fail");
//
//		}
		
//	}
	
	
    @Test(priority=4)
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
	  //  login.ClickRadioButton();
		//Thread.sleep(2000);
	//	login.clickContinueButton();
		//Thread.sleep(200000);
		
		
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
		Thread.sleep(50000);
	}
	
    
    @Test(priority=5)
    public void NotYouLink() throws InterruptedException
    {
    	LoginScreenPage login=new LoginScreenPage (driver);
    	Thread.sleep(3000);
    	login.clickNotYouLink();
    	Thread.sleep(4000);
    	logger.info("Not You Link is clickable");
    	Thread.sleep(2000);
    	logger.info("User redirecting to intuit-Sign_In screen ");
    	Thread.sleep(2000);
    	
    }
    
    
    
    @Test(priority=6)
    public void SignInTest2() throws InterruptedException, IOException
	{
		LoginScreenPage login=new LoginScreenPage(driver);   //login
		//login.clickIntuitButton();
		//logger.info("User redirecting to SignIn screen successfully");
		
		//Thread.sleep(2000);

		//LoginScreenPage login=new LoginScreenPage(driver);
		login.setUserName(userName);
		logger.info("Username entered successfully");
		Thread.sleep(2000);

		login.setPassword(password);
		logger.info("Password entered successfully");
		Thread.sleep(2000);

		login.clickSignInButton();
		logger.info("User is able to click Sign In button");
		Thread.sleep(3000);

		login.clickSkipForNow();
		Thread.sleep(3000);

		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		if(driver.getTitle().equals("QuickBooks App Store"))
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
		Thread.sleep(6000);

	}
    
    
    @Test(priority=7)
    public void NOThanksButton() throws InterruptedException
    {
    	LoginScreenPage login=new LoginScreenPage(driver);   //login
    	login.clickNoThanksButton();
		Thread.sleep(3000);
    	logger.info("No Thanks button on Search for a company screen is clickable");
		Thread.sleep(2000);
    	System.out.println(driver.getTitle());
    	//Thread.sleep(2000);
    	logger.error("Not able to connect to Intuit");
	//	Thread.sleep(3000);
		
		if(driver.getTitle().equals("Zed-Axis Online"))
		{
			Assert.assertTrue(true);
			logger.info("User redirecting to Welcome screen");
		}
		else
		{
			Assert.assertTrue(false);
		}
	//	Thread.sleep(2000);
	    System.out.println(driver.switchTo().alert().getText());

		
		//boolean res=driver.getPageSource().contains("User not able to connect to intuit.");
		//if(res==true)
	//	{
		//	Assert.assertTrue(true);
	//		logger.info("Pass");
		}
	//	else
	//	{
	//		Assert.assertTrue(false);
	//		logger.info("failed");
	//	}
		// System.out.println(driver.switchTo().alert().getText());
        // driver.switchTo().alert().accept();
		//Thread.sleep(6000);


   
    
    @Test(priority=8)
    public void SignInTest3() throws InterruptedException, IOException
	{
		LoginScreenPage login=new LoginScreenPage(driver);   //login
		login.clickIntuitButton();
		logger.info("User redirecting to SignIn screen successfully");
		
		Thread.sleep(9000);

		//LoginScreenPage login=new LoginScreenPage(driver);
		//login.setUserName(userName);
		//logger.info("Username entered successfully");
		//Thread.sleep(2000);

	//	login.setPassword(password);
	//	logger.info("Password entered successfully");
	//	Thread.sleep(2000);

	//	login.clickSignInButton();
	//	logger.info("User is able to click Sign In button");
	//	Thread.sleep(3000);

	//	login.clickSkipForNow();
	//	Thread.sleep(3000);

		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		if(driver.getTitle().equals("QuickBooks App Store"))
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
		Thread.sleep(6000);
	
	}
    
   
    @Test(priority=9)
  		public void CompanySelection() throws InterruptedException, IOException
  		{
  			LoginScreenPage login=new LoginScreenPage(driver);   //login
  			login.clickLoginCompany();
  			boolean result=driver.getPageSource().contains("Sandbox Company_US_3");
  			
  			if(result==true)
  			{
  				System.out.println("Drop down list getting opened");
  			}
  			else
  			{
  				System.out.println("Drop down list not getting opened ");
  			}
  			Thread.sleep(2000);
  			login.clickSandboxCompany3();
  		    logger.info("Login company3 selected by user");
  		    
  			Thread.sleep(2000);

  			login.clickNextButton();
  			
  	        Thread.sleep(50000);
  	         System.out.println(driver.getTitle());
  	  
  }
}
