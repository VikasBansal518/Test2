package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleelementExceptionHandling {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("URL");
		By elementLocator = By.id("elementId");
		WebElement element = findElementWithRetry(driver, elementLocator);
		// Perform actions on the element
		driver.quit();
	}

	private static WebElement findElementWithRetry(WebDriver driver, By locator) {
		final int maxAttempts = 3;
		int attempts = 0;
		while (attempts < maxAttempts) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				return element;
			} catch (StaleElementReferenceException e) {
				attempts++;
				if (attempts == maxAttempts) {
					throw e;
				}
			}
		}

		throw new RuntimeException("Element not found after maximum retries");
	}
}
