package listenersDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

@SuppressWarnings("deprecation")
public class MainEventHandler {
	WebDriver driver=null;
	@BeforeTest
	public void setUp() throws Exception {
	try {
			WebDriverManager.chromedriver().setup();
    		driver= new ChromeDriver(); 
            driver.manage().window().maximize();
			} catch (Exception e) {
			System.out.println("Invalid grid URL");
		}
	}


       @AfterTest
	public void teardown() {
		driver.quit();
	}

	@Test(enabled = true)
	public void testEventListerners() {

		EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
		WDEventHandler webDriverEventHandler = new WDEventHandler();
		eventFiringWebDriver.register(webDriverEventHandler);

		eventFiringWebDriver.navigate().to("https://www.lambdatest.com/selenium-playground/simple-form-demo");
		eventFiringWebDriver.findElement(By.id("user-message")).sendKeys("WebDriver Event Listener");
		eventFiringWebDriver.findElement(By.id("showInput")).click();
		eventFiringWebDriver.navigate().refresh();
		
		System.out.println("Test Completed");

		eventFiringWebDriver.unregister(webDriverEventHandler);
	}

}
