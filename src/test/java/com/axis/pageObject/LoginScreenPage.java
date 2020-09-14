package com.axis.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreenPage {
WebDriver ldriver;
	
	public LoginScreenPage(WebDriver rdriver)
	{
		ldriver=rdriver;
        PageFactory.initElements(rdriver, this);    // constructor
	
	}
	
	//create webelement with locator
	//Intuit button on welcome screen
	@FindBy(xpath="//button[@class='btn btn-lg f-blue btn-white f-semiBold']")
	@CacheLookup
	WebElement intuitButton;
	
	//For Username on sign In screen
	@FindBy (xpath="//input[@id='ius-userid']")
	@CacheLookup
	WebElement userName;
	
	//For Invalid Username on signIn screen
	@FindBy (xpath="//input[@id='ius-userid']")
	@CacheLookup
	WebElement invalidUserName;
	
	//For Password on signIn Screen
	@FindBy (xpath="//input[@id='ius-password']")
	@CacheLookup
    WebElement password;
	
	//for Invalid Password on sign In screen
	@FindBy (xpath="//input[@id='ius-password']")
	@CacheLookup
	WebElement invalidPassword;
	
	//For Sign In button
	@FindBy (xpath="//button[@id='ius-sign-in-submit-btn']")
	@CacheLookup
    WebElement signInButton;
	
	//For Forgot Password link on signIn screen
	@FindBy (xpath="//a[@id='ius-link-account-recovery']")
	@CacheLookup
	WebElement forgotPassword;
	
	//For Create New Account link on Sign In screen
	@FindBy (xpath="//a[@id='ius-link-sign-up']")
	@CacheLookup
	WebElement createAccount;
	
	// Cancel button on Forgot password screen
	@FindBy (xpath="//button[@id='ius-collect-username-cancel-link']")
	@CacheLookup
	WebElement forgotCancelButton;
	
	// SignIn Button on Create new account screen
	@FindBy (xpath="//button[@id='ius-hosted-ui-navigation-sign-in-button']")
	@CacheLookup
	WebElement signInButtonOnNewAccount;
	
	//OTP screen radio button
	@FindBy (xpath="//span[@id='ius-label-mfa-send-an-email-to']")
	@CacheLookup
	WebElement otpRadioButton;
	
	
	//Continue button on OTP screen
	@FindBy (xpath="//input[@id='ius-mfa-options-submit-btn']")
	@CacheLookup
	WebElement continueButton;
	
	
	//Not You link on search for a company screen
	@FindBy (xpath="//div[@class='not-you']")
	@CacheLookup
	WebElement notYouLink;
	
	// Search button to select login company
	@FindBy (xpath="//button[@class='action-button'][@aria-expanded='false']")
	@CacheLookup
	WebElement searchLoginCompany;
	
	//Select company as a login company -- select sandbox company1
	@FindBy (xpath="//div[@class='company-list-item'][@title='Sandbox Company_US_1']//div[contains(text(),'Sandbox Company_US_1')]")
	@CacheLookup
	WebElement loginSandboxCompany1;
		
		
	//Select company as a login company -- select sandbox company2
	@FindBy (xpath="//div[@class='company-list-item'][@title='Sandbox Company_US_2']//div[contains(text(),'Sandbox Company_US_2')]")
	@CacheLookup
	WebElement loginSandboxCompany2;
		
	
	//Select company as a login company -- select sandbox company3
	@FindBy (xpath="//div[@class='company-list-item'][@title='Sandbox Company_US_3']//div[contains(text(),'Sandbox Company_US_3')]")
	@CacheLookup
	WebElement loginSandboxCompany3;
	
	//Select company as a login company -- select sandbox company4
	@FindBy (xpath="//div[@class='company-list-item'][@title='Sandbox Company_US_4']//div[contains(text(),'Sandbox Company_US_4')]")
	@CacheLookup
	WebElement loginSandboxCompany4;
		
	//Select company as a login company -- select sandbox company5
	@FindBy (xpath="//div[@class='company-list-item'][@title='Sandbox Company_US_5']//div[contains(text(),'Sandbox Company_US_5')]")
	@CacheLookup
	WebElement loginSandboxCompany5;
		
		
	//Select company as a login company -- select sandbox company6
	@FindBy (xpath="//div[@class='company-list-item'][@title='Sandbox Company_US_6']//div[contains(text(),'Sandbox Company_US_6')]")
	@CacheLookup
	WebElement loginSandboxCompany6;
		
	
	//For Next button on search for a company screen
	@FindBy (xpath="//button[@class='ha-button pull-right ha-button-primary btn-next']")
	@CacheLookup
	WebElement nextButton;
	
	//For NoThanks button
	@FindBy (xpath="//button[@class='ha-button btn-no-thanks']")
	@CacheLookup
	WebElement noThanksButton;
	
	
	//Skip for now after sign In
	@FindBy (xpath="//button[@id='ius-verified-user-update-btn-skip']")
	@CacheLookup
	WebElement skipForNowButton;
	
	
	
	
	
	// create action method
	//For Intuit button
    public void clickIntuitButton()
	{	
	intuitButton.click();
	}
	
    //For UserName on SignIn Screen
	public void setUserName(String uname)
	{
		userName.sendKeys(uname);
		
	}
	
	
	//for Invalid Username on SignIn screen
	public void setInvalidUserName(String uname)
	{
		invalidUserName.sendKeys(uname);
		
	}
	
	
	//For Password on SignIn screen
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	//For invalid Password on SignIn screen
		public void setInvalidPassword(String pass)
		{
			invalidPassword.sendKeys(pass);
		}
	
	
	
	//For SignIn button
	public void clickSignInButton()
	{
		signInButton.click();
	}
	
	//For Forgot Password link on signIn button
	public void clickForgotPassword()
	{
		forgotPassword.click();
	}
	
	//For Create account link on Sign In button
	public void clickCreateAccount()
	{
		createAccount.click();
	}
	
	//For Cancel button on forgot password screen
	public void clickForgotCancelbutton()
	{
		forgotCancelButton.click();
    }
	
	//For SignIn button on Create new account screen
	public void clickSignIn2Button()
	{
		signInButtonOnNewAccount.click();
	}
	
	// Otp screen radio button
	public void ClickRadioButton()
	{
		otpRadioButton.click();
	}
	
	
	//continue button on otp
	public void clickContinueButton()
	{
		continueButton.click();
	}
	
	
	
	//For Not You link on Search for a company screen
	public void clickNotYouLink()
	{
		notYouLink.click();
	}
	
	
	//For searching login company 
	public void clickLoginCompany()
	{
		searchLoginCompany.click();
	}
	
	//For Login Company1
	public void clickSandboxCompany1()
	{
		loginSandboxCompany1.click();
	}
	
	//For Login Company2
	public void clickSandboxCompany2()
		{
			loginSandboxCompany2.click();
		}
		
	//For Login Company3
	public void clickSandboxCompany3()
		{
			loginSandboxCompany3.click();
		}
		
		
	//For Login Company4
	public void clickSandboxCompany4()
		{
			loginSandboxCompany4.click();
		}
		
		
	//For Login Company5
	public void clickSandboxCompany5()
		{
			loginSandboxCompany5.click();
		}
		
		
	//For Login Company6
	public void clickSandboxCompany6()
		{
			loginSandboxCompany6.click();
		}
		
	//For Next Button
	public void clickNextButton()
		{
			nextButton.click();
		}
		
	//For No Thanks button
	public void clickNoThanksButton()
		{
			noThanksButton.click();
		}
	
	
	//For Skip now button
	public void clickSkipForNow()
	{
		skipForNowButton.click();
	}
	
}