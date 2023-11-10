package pageobjectTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.BrowserHomePage;
import pageObjects.BrowserSignUpPage;

public class BrowserTest {
	WebDriver driver;
	BrowserHomePage objBrowserHomePage;
	BrowserSignUpPage objBrowserSignUpPage;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); 
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	}

	@Test(priority = 1)
	public void navigate_to_homepage_click_on_getstarted() throws InterruptedException {
		objBrowserHomePage = new BrowserHomePage(driver);
		objBrowserHomePage.enterSearchText();
		objBrowserHomePage.getTitle();
	}

	@Test(priority = 2, enabled = false)
	public void enter_userDetails() {
		objBrowserSignUpPage = new BrowserSignUpPage(driver);
		objBrowserSignUpPage.veryHeader();
		objBrowserSignUpPage.enterFullName("TestUser");
		objBrowserSignUpPage.enterBusinessEmail("TestUser@gmail.com");
		objBrowserSignUpPage.enterPasswrod("TestUserPassword");
		
	}
	
	@AfterTest
	public void close() {
		System.out.println("TC completed");
		driver.quit();

}
}
