package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;			
import java.io.IOException;		
import java.util.Properties;		
import org.openqa.selenium.By;		


public class ReadFromPropertiesFile {				

public static void main(String[] args) throws IOException, InterruptedException {										
	
// Create WebDriver Instance		
    WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver(); 
	driver.manage().window().maximize();
    driver.get("https://practicetestautomation.com/practice-test-login/");							
// Load the properties File		
    Properties obj = new Properties();					
    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\app.properties");									
    obj.load(objfile);		
    
    WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
	username.sendKeys(obj.getProperty("username"));
	Thread.sleep(2000);
	WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	password.sendKeys(obj.getProperty("password"));
	Thread.sleep(2000);
	WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
	submit.click();
	Thread.sleep(2000);
	
	String actual=driver.findElement(By.xpath("//strong")).getText();
	String expected="Congratulations student. You successfully logged in!";
	
	System.out.println(actual);
	System.out.println(expected);
	System.out.println(actual.length());
	System.out.println(expected.length());
	
	if(actual.equals(expected)) {
		System.out.println("Test Passed");
	}else 
		System.out.println("Test Failed");
	
	driver.close();
	
  				
  }		

}