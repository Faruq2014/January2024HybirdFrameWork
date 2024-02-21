package com.facebookPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@id,'u_0_0_')]")
	public WebElement newAcct;

	public void createNewAccount() {
		newAcct.click();
	}

	@FindBy(name = "firstname")
	private WebElement fName;

	public WebElement firstName(String enterFirstName) {
		fName.sendKeys(enterFirstName);
		return fName;
	}

	@FindBy(name = "lastname")
	private WebElement lName;

	public WebElement lastName(String enterLastName) {
		lName.sendKeys(enterLastName);
		return fName;
	}

	@FindBy(name = "reg_email__")
	public WebElement mobile;

	public WebElement mobleNumber(String enterMobileNumber) {
		mobile.sendKeys(enterMobileNumber);
		return fName;
	}

	@FindBy(id = "password_step_input")
	public WebElement password;

	public WebElement newPassword(String enterNewPassword) {
		password.sendKeys(enterNewPassword);
		return password;
	}

	@FindBy(id = "month")
	public WebElement month;

	public WebElement birthMonth(String enterBirthMonth) {
		Select monthSelect = new Select(month);
		monthSelect.selectByVisibleText(enterBirthMonth);
		return month;
	}

	@FindBy(id = "day")
	public WebElement day;

	public WebElement birthDay(String enterBithDay) {
		Select daySelect = new Select(day);
		daySelect.selectByVisibleText(enterBithDay);
		return day;
	}

	@FindBy(id = "year")
	public WebElement year;

	public WebElement birthYear(String enterBirthYear) {
		Select yearSelect = new Select(year);
		yearSelect.selectByVisibleText(enterBirthYear);
		return year;
	}

	@FindBy(xpath = "//span[@class='_5k_2 _5dba']")
	public WebElement female;
	@FindBy(xpath = "(//span[@class='_5k_2 _5dba'])[2]")
	public WebElement male;
	@FindBy(xpath = "(//span[@class='_5k_2 _5dba'])[3]")
	public WebElement custom;

	public void selectGender(String enterYourGender) {

		if (enterYourGender.equalsIgnoreCase("female")) {
			female.click();
			System.out.println("user is female");
		} else if (enterYourGender.equalsIgnoreCase("male")) {
			male.click();
			System.out.println("user is male");
		} else if (enterYourGender.equalsIgnoreCase("custom")) {
			custom.click();
			System.out.println("user is custom");
		} else {
			System.out.println("know your self");
		}
	}

}
