package common;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NosuchwindowExceptionHandling {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		
		  WebDriver d= new ChromeDriver();
		  d.manage().window().maximize();
		  d.get("https://www.google.com"); 
		  Thread.sleep(4000);
		 
		System.out.println("Browse opened");
		
		d.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		
		Set <String> win= d.getWindowHandles();
		
		String window=d.getWindowHandle();
		
		System.out.println(window);
		
		try {
		d.switchTo().window("10");
		}catch (Exception e)  // NoSuchWindowException
		{
		//	System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		Thread.sleep(4000);
		System.out.println("Closing the broswer");
		d.close();
	

	}

}
