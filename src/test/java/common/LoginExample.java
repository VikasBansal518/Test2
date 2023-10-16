package common;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginExample {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver(); 
        d.manage().window().maximize();
		d.get("https://practicetestautomation.com/practice-test-login/"); 
		Thread.sleep(5000);
		 
		System.out.println("Browse opened");
		
		WebElement username = d.findElement(By.xpath("//*[@id='username']"));
		username.sendKeys("student");
		Thread.sleep(2000);
		WebElement password = d.findElement(By.xpath("//*[@id='password']"));
		password.sendKeys("Password123");
		Thread.sleep(2000);
		WebElement submit = d.findElement(By.xpath("//*[@id=\"submit\"]"));
		submit.click();
		Thread.sleep(2000);
		
		String actual=d.findElement(By.xpath("//strong")).getText();
		String expected="Congratulations student. You successfully logged in!";
		
		System.out.println(actual);
		System.out.println(expected);
		System.out.println(actual.length());
		System.out.println(expected.length());
		
		if(actual.equals(expected)) {
			System.out.println("Test Passed");
		}else 
			System.out.println("Test Failed");
		
		d.close();
	

	}

}
