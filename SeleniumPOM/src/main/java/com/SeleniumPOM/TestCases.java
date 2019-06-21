package com.SeleniumPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases {

	@Test
	public void verifyValidLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ymurugan\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stage.disneyworld.disney.go.com/login/?appRedirect=");
		Thread.sleep(5000);

		LoginPage login = new LoginPage(driver);
		login.typeUserName("wdw417ym@mailinator.com");
		login.typePassword("dis123");
		login.clickButton();
		driver.quit();
	}
}
