package common;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sizemethods {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tutorialspoint.com/index.htm");
        
        System.out.println(driver.manage().window().getPosition());
        
        System.out.println("===============================");
        
        System.out.println(driver.manage().window().getSize());
        
        System.out.println("===============================");
        
        System.out.println(driver.manage().window().getSize().getHeight());
        
        System.out.println("===============================");
        
        System.out.println(driver.manage().window().getSize().getWidth());
        
        System.out.println("===============================");
        
        driver.manage().window().maximize();
        
System.out.println(driver.manage().window().getPosition());
        
        System.out.println("===============================");
        
        System.out.println(driver.manage().window().getSize());
        
        System.out.println("===============================");
        
        System.out.println(driver.manage().window().getSize().getHeight());
        
        System.out.println("===============================");
        
        System.out.println(driver.manage().window().getSize().getWidth());
        
        System.out.println("===============================");
               
        Dimension dim=new Dimension(5,9);
        
        dim.getHeight();
        System.out.println( dim.getHeight());
        
        System.out.println("===============================");
        
        driver.quit(); 

	}

}
