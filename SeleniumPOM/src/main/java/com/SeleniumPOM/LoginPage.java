package com.SeleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By username = By.id("loginPageUsername");
	By password = By.xpath("//input[@id='loginPagePassword']");
	By loginButton = By.xpath("//span[contains(text(),'Sign In')]");

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public void typeUserName(String uname) {
		driver.findElement(username).sendKeys(uname);
	}

	public void typePassword(String pword) {
		driver.findElement(password).sendKeys(pword);
	}

	public void clickButton() {
		driver.findElement(loginButton).click();
	}
}
