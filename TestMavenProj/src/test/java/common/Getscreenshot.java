package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getscreenshot {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tutorialspoint.com/index.htm");
        
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        
        File DestFile=new File("C:\\Users\\VikasKumarBansal\\eclipse-workspace\\TestMavenProj\\Screenshots\\test.png");

        FileUtils.copyFile(SrcFile, DestFile);
        
        driver.quit();
	

	}

}
