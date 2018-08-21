package com.actitime.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
	@Test(priority=1)
	public void testValidLoginLogout()
	{
		String loginTitle=ExcelData.getData(file_path, "TC01", 1, 2);
		String username=ExcelData.getData(file_path, "TC01", 1, 0);
		String password=ExcelData.getData(file_path, "TC01", 1, 1);
		String eTitle=ExcelData.getData(file_path, "TC01", 1, 3);
		
		LoginPage lp=new LoginPage(driver);
		EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
		
		//Verify the login page
		lp.verifyTheTitle(loginTitle);
		//Enter Valid Username
		Reporter.log("Username is:"+username,true);
		lp.enterUserName(username);
		
		//enter valid password
		Reporter.log("Password is:"+password,true);
		lp.enterPassword(password);
		
		//click on login
		lp.clickOnLogin();
		
		//verify enter time track
		lp.verifyTheTitle(eTitle);
		
		Reporter.log("line number 39", true);
		
		//click on logout
		ep.clickonLogout();
		
		Reporter.log("line number 44", true);
		
		//verify login page
		lp.verifyTitle(loginTitle);
		
		Reporter.log("line number 49", true);
	}

}

