package com.facebook_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebookPages.RegistrationPage;
import com.facebook_base.BaseTest;
import com.facebook_utilities.JDBCReader;

public class RegistrationTestFromJDBC extends BaseTest{
	
	RegistrationPage registrationPage;
	
	JDBCReader jdbcReader;
	
	@BeforeMethod
	public void openApp() {
		openApplication(); 
	}
	@Test(priority=0)
	public void registerFaruq() {
		System.out.println("registration");
		 registrationPage= new RegistrationPage(driver);
		 jdbcReader = new JDBCReader();
		 registrationPage.createNewAccount();
		 //make sure write the accurate column name
		 registrationPage.firstName(jdbcReader.selectColumnName("firstName"));
		 registrationPage.lastName(jdbcReader.selectColumnName("lastName"));
		 registrationPage.mobleNumber(jdbcReader.selectColumnName("mobileNumber"));
		 registrationPage.reEnterEmail(jdbcReader.selectColumnName("reEnterEmail"));
		 registrationPage.newPassword(jdbcReader.selectColumnName("newPassword"));
		 registrationPage.birthMonth(jdbcReader.selectColumnName("birtMonth"));
		 registrationPage.birthDay(jdbcReader.selectColumnName("birthDay"));
		 registrationPage.birthYear(jdbcReader.selectColumnName("birthYear"));
		 registrationPage.selectGender(jdbcReader.selectColumnName("gender"));
	}
	
	
	
	@AfterMethod
	public void tearDownApp() {
		closeApplication();
	}

}
