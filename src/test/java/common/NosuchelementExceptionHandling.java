package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NosuchelementExceptionHandling {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
        WebDriver d= new ChromeDriver(); d.manage().window().maximize();
		d.get("https://www.google.com"); 
		Thread.sleep(4000);
		System.out.println("Browse opened");

		try {
			System.out.println("Statement 1");
			d.findElement(By.xpath("//*[@name='u']")).sendKeys("Selenium");

			System.out.println("Statement 2");

		}catch (Exception e)
		{
			System.out.println(e.getMessage());
			//	System.out.println(e.toString());
			//	e.printStackTrace();

		}

		Thread.sleep(4000);
		System.out.println("Closing the broswer");
		d.close();


	}

}
