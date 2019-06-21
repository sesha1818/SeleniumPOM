package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCaseFactory {

	@Test
	public void verifyValidLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ymurugan\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stage.disneyworld.disney.go.com/login/?appRedirect=");
		
		LoginPageFactory locateElements = PageFactory.initElements(driver,LoginPageFactory.class);
		locateElements.loginMethod("wdw417ym@mailinator.com", "dis123");
		Thread.sleep(5000);
		driver.quit();
	}
}
