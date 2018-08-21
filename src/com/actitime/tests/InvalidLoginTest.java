package com.actitime.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

public class InvalidLoginTest extends BaseTest
{
@Test(priority=2)
public void testInvalidLogin() throws InterruptedException
{
	String loginTitle = ExcelData.getData(file_path, "TC01", 1, 2);
	String eErrorMessage = ExcelData.getData(file_path, "TC02", 1, 2);
	
	LoginPage lp=new LoginPage(driver);
	
	//verify the login page title
	lp.verifyTheTitle(loginTitle);
	int rc=ExcelData.getRowCount(file_path, "TC02");
	for(int i=1;i<rc;i++)
	{
	String user=	ExcelData.getData(file_path, "TC02",i, 0);
	String pass=	ExcelData.getData(file_path, "Tc02",i, 1);
	
	//Enter invalid username
	Reporter.log("Username:"+user, true);
	lp.enterUserName(user);
	//enter invalid password
	Reporter.log("Password :"+pass,true);
	lp.enterPassword(pass);
	//Click on login
	lp.clickOnLogin();
	Thread.sleep(2000);
	//verify error message
	String aErrorMessage=lp.verifyErrorMessage();
	Reporter.log("Actual Error Message:"+aErrorMessage,true);
	Reporter.log("Expected Error Message:"+eErrorMessage,true);
	Assert.assertEquals(aErrorMessage, eErrorMessage);
	Reporter.log("Error Message is Matching...........",true);
	Reporter.log("==================",true);
	
	
}

}
}