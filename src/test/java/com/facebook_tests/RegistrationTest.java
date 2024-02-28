package com.facebook_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebookPages.RegistrationPage;
import com.facebook_base.BaseTest;
import com.facebook_utilities.ExcelReader;

public class RegistrationTest extends BaseTest{
	
	RegistrationPage registrationPage;
	String filePath = "src/test/resources/registration.xlsx";
	ExcelReader excelReader;
	@BeforeMethod
	public void openApp() {
		openApplication(); 
	}
	@Test(priority=0)
	public void registerFaruq() {
		System.out.println("registration");
		 registrationPage= new RegistrationPage(driver);
		 excelReader = new ExcelReader(filePath, "Sheet1");
		 registrationPage.createNewAccount();
		 registrationPage.firstName(excelReader.readStringData(1, 0));
		 registrationPage.lastName(excelReader.readStringData(1, 1));
		 registrationPage.mobleNumber(excelReader.readStringData(1, 2));
		 registrationPage.reEnterEmail(excelReader.readStringData(1, 3));
		 registrationPage.newPassword(excelReader.readStringData(1, 4));
		 registrationPage.birthMonth(excelReader.readStringData(1, 5));
		 registrationPage.birthDay(excelReader.readStringData(1, 6));
		 registrationPage.birthYear(excelReader.readStringData(1, 7));
		 registrationPage.selectGender(excelReader.readStringData(1, 8));
	}
	
	@Test(priority=1)
	public void registerFabiha() {
		System.out.println("registration");
		 registrationPage= new RegistrationPage(driver);
		 excelReader = new ExcelReader(filePath, "Sheet1");
		 registrationPage.createNewAccount();
		 registrationPage.firstName(excelReader.readStringData(2, 0));
		 registrationPage.lastName(excelReader.readStringData(2, 1));
		 registrationPage.mobleNumber(excelReader.readStringData(2, 2));
		 registrationPage.reEnterEmail(excelReader.readStringData(2, 3));
		 registrationPage.newPassword(excelReader.readStringData(2, 4));
		 registrationPage.birthMonth(excelReader.readStringData(2, 5));
		 registrationPage.birthDay(excelReader.readStringData(2, 6));
		 registrationPage.birthYear(excelReader.readStringData(2, 7));
		 registrationPage.selectGender(excelReader.readStringData(2, 8));
	}
	
	@Test(priority=2)
	public void registerFaiza() {
		System.out.println("registration");
		 registrationPage= new RegistrationPage(driver);
		 excelReader = new ExcelReader(filePath, "Sheet1");
		 registrationPage.createNewAccount();
		 registrationPage.firstName(excelReader.readStringData(3, 0));
		 registrationPage.lastName(excelReader.readStringData(3, 1));
		 registrationPage.mobleNumber(excelReader.readStringData(3, 2));
		 registrationPage.reEnterEmail(excelReader.readStringData(3, 3));
		 registrationPage.newPassword(excelReader.readStringData(3, 4));
		 registrationPage.birthMonth(excelReader.readStringData(3, 5));
		 registrationPage.birthDay(excelReader.readStringData(3, 6));
		 registrationPage.birthYear(excelReader.readStringData(3, 7));
		 registrationPage.selectGender(excelReader.readStringData(3, 8));
	}

	
	@AfterMethod
	public void tearDownApp() {
		closeApplication();
	}

}
