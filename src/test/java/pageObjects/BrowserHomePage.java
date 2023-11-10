package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserHomePage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@name='q']")
	WebElement textBox;
	@FindBy(xpath = "//*[@id='signupModalButton']")
	WebElement getStarted;

	public BrowserHomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	public void enterSearchText() throws InterruptedException {
	textBox.sendKeys("Testing");
	Thread.sleep(4000);
	}
	public void getTitle() {
	
	System.out.println("Title of the screen is "+driver.getTitle());
	}

}
