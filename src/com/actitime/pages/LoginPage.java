package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class LoginPage extends BasePage
{
	//Declaration
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errorMessage;
	
	@FindBy(xpath="//nobr[contains(text(),actiTIME')]")
	private WebElement version;
	 
	//Initialization
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void checkUN()
	{
		verifyElement(unTB);
	}
	
	//Verify the title
	public void verifyTheTitle(String eTitle)
	{
		verifyTitle(eTitle);
		
	}
	
	//Enter the username
	public void enterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	//Enter the password
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	//Click on login
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	//Verify the error message
	public String verifyErrorMessage()
	{
		verifyElement(errorMessage)	;
		String aErrMessage=errorMessage.getText();
		return aErrMessage;
	}
	
	//Verify the version
	public String verifyVersion()
	{
		verifyElement(version);
		String aversion = version.getText();
		return aversion;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
