package com.axis.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilePage {
WebDriver ldriver;
	
	public EditProfilePage(WebDriver rdriver)
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
	
	//For Password on signIn Screen
	@FindBy (xpath="//input[@id='ius-password']")
	@CacheLookup
    WebElement password;
	
	//For Sign In button
	@FindBy (xpath="//button[@id='ius-sign-in-submit-btn']")
	@CacheLookup
    WebElement signInButton;
	
	
	//OTP screen radio button
	@FindBy (xpath="//span[@id='ius-label-mfa-send-an-email-to']")
	@CacheLookup
	WebElement otpRadioButton;
	
	
	//Continue button on OTP screen
	@FindBy (xpath="//input[@id='ius-mfa-options-submit-btn']")
	@CacheLookup
	WebElement continueButton;
	

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
	

	
	//Skip for now after sign In
	@FindBy (xpath="//button[@id='ius-verified-user-update-btn-skip']")
	@CacheLookup
	WebElement skipForNowButton;
	
	//For edit profile tab
	@FindBy (xpath="//a[@routerlink='/edit-profile'][@href='/edit-profile']")
	@CacheLookup
	WebElement editProfileTab;
	
	
	//For edit first name
	@FindBy (xpath="")
	@CacheLookup
	WebElement editFirstName;
	
	//For edit last name
	@FindBy (xpath="")
	@CacheLookup
	WebElement editLastName;
	
	//For edit status-User
	@FindBy (xpath="")
	@CacheLookup
	WebElement editStatusUser;
	
	//For edit status advisor
	@FindBy (xpath="")
	@CacheLookup
	WebElement editStatusAdvisor;
	
	//For save button on edit profile screen
	@FindBy (xpath="")
	@CacheLookup
	WebElement saveButton;
	
	//For Cancel button on edit profile screen
	@FindBy (xpath="")
	@CacheLookup
	WebElement cancelButton;
	
	
	
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
	
	
	//For Password on SignIn screen
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	
	//For SignIn button
	public void clickSignInButton()
	{
		signInButton.click();
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
	
	
	//For Skip now button
	public void clickSkipForNow()
	{
		skipForNowButton.click();
	}
	
	
	// for edit profile tab
	public void clickEditProfileTab()
	{
		editProfileTab.click();
	}
	
	
	
}
