package common;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.text.NumberFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JsexecTesting {
	

	@Test
	public static void jsTesting() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver(); d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/web-table-element.php"); 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		
		
	    System.out.println("TC completed");

		d.close();
	

	}

}
