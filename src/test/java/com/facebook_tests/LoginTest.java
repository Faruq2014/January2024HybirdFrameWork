package com.facebook_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebookPages.LoginPage;
import com.facebook_base.BaseTest;
import com.facebook_utilities.PropertiseReader;

public class LoginTest extends BaseTest{
	LoginPage loginPage;
	PropertiseReader properties;
	
	
	@BeforeMethod
	public void openFacebook() {
		openApplication();
	}
	
	@Test
	public void validLoginTest() {
		 loginPage=new LoginPage(driver);
		 properties= new PropertiseReader();
		loginPage.userName(properties.readUserName());
		loginPage.password(properties.readPassword());
		loginPage.loginButton();
	}
	
	@Test
	public void invalidLoginTest() {
		 loginPage=new LoginPage(driver);
		 properties= new PropertiseReader();
		loginPage.userName(properties.readUserName());
		loginPage.password(properties.readPassword());
		loginPage.loginButton();
	}
	
	@Test
	public void boundaryLoginTest() {
		 loginPage=new LoginPage(driver);
		 properties= new PropertiseReader();
		loginPage.userName(properties.readUserName());
		loginPage.password(properties.readPassword());
		loginPage.loginButton();
	}
	
	@AfterMethod
	public void closeFacebook() {
		closeApplication();
	}
		

}
