package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TimeoutExceptionHandling {

	public static void main(String[] args) throws Exception {
		
		final String name = "xyz";
		WebDriverManager.chromedriver().setup();
		
		
		  WebDriver d= new ChromeDriver(); d.manage().window().maximize();
		  d.get("https://www.google.com"); 
		  Thread.sleep(4000);
		 
		System.out.println("Browse opened");
		
			
		try {
			throw new TimeoutException(); 
			
		}catch (Exception e)  // TimeoutException
		{
			System.out.println(e);
		//	e.printStackTrace();
			
			try {
				throw new TimeoutException();
			}catch (Exception e1)  // TimeoutException
			{
				System.out.println(e1);
			//	e.printStackTrace();
				try {
					throw new TimeoutException();
				}catch (Exception e2)  // TimeoutException
				{
					System.out.println(e2);
				//	e.printStackTrace();
					
				}
				
			}
			
		}
		finally {
			d.close();
		}
		
		Thread.sleep(4000);
		System.out.println("Closing the broswer");
		d.close();
	

	}

}
