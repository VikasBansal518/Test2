package common;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.text.NumberFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotTesting {

	@Test
	public static void screenshotTesting() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver(); 
		d.manage().window().maximize();
		d.get("https://www.google.com"); 
		Thread.sleep(4000);
		
		TakesScreenshot ts=(TakesScreenshot)d;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\homepage1.png");
		FileUtils.copyFile(src, trg);
		
		WebElement e=d.findElement(By.xpath("//*[@name='q']"));
		e.sendKeys("Screenshot testing");
		File src1=e.getScreenshotAs(OutputType.FILE);
		File trg1=new File(".\\Screenshots\\homepage2.png");
		FileUtils.copyFile(src1, trg1);
		
	    System.out.println("TC completed");

		d.close();
	

	}

}
