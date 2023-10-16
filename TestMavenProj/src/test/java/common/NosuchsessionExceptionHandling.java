package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NosuchsessionExceptionHandling {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		
		  WebDriver d= new ChromeDriver(); d.manage().window().maximize();
		  d.get("https://www.google.com"); 
		  Thread.sleep(4000);
		 
		System.out.println("Browse opened");
		
		WebElement element=d.findElement(By.xpath("//*[@name='q']"));
		
		Thread.sleep(4000);
		System.out.println("Closing the broswer");
		d.close();


		try {
		element.click();
		}catch (Exception e)  // NoSuchSessionException
		{
		//	System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
	

	}

}
