package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFactory {

	WebDriver driver;
	
	@FindBy(id="loginPageUsername") WebElement username;
	@FindBy(how=How.XPATH, using = "//input[@id='loginPagePassword']") WebElement password;
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Sign In')]") WebElement loginButton;
	
	public LoginPageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loginMethod(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();	
	}
}
