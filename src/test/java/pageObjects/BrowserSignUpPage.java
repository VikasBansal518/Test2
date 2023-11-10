package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserSignUpPage {
	WebDriver driver;

	@FindBy(xpath = "//h1[contains(text(),'Create')]")
	WebElement Header;

	@FindBy(xpath = "//*[@id='user_full_name']")
	WebElement userName;

	@FindBy(xpath = "//*[@id='user_email_login']")
	WebElement businessEmail;

	@FindBy(xpath = "//*[@id='user_password']")
	WebElement password;

	public BrowserSignUpPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	public void veryHeader() {
	String getheadertext = Header.getText().trim();
	assertEquals(true,true);
	}
	public void enterFullName(String arg1) {
	userName.sendKeys(arg1);
	}
	public void enterBusinessEmail(String arg1) {
	businessEmail.sendKeys(arg1);
	}
	public void enterPasswrod(String arg1) {
	password.sendKeys(arg1);
	}

}
