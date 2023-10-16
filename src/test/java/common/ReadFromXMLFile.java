package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;			
import java.io.IOException;		
import java.util.Properties;		
import org.openqa.selenium.By;		

import java.io.*;		
import java.util.*;
import org.dom4j.*;		
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class ReadFromXMLFile {				

public static void main(String[] args) throws InterruptedException, DocumentException {										
// Creating WebDriver Instance		
	WebDriverManager.chromedriver().setup();
	WebDriver d= new ChromeDriver(); 
    d.manage().window().maximize();					
    d.get("https://practicetestautomation.com/practice-test-login/");					
			
// Reading XML File    		
    File inputFile = new File(System.getProperty("user.dir") +"\\properties.xml");									
    SAXReader saxReader = new SAXReader();					
    Document document = saxReader.read(inputFile);	
    
    
    String username = document.selectSingleNode("//menu/username").getText();							
    String password = document.selectSingleNode("//menu/password").getText();	
    
    
    WebElement uname = d.findElement(By.xpath("//*[@id='username']"));
    uname.sendKeys(username);
	Thread.sleep(2000);
	WebElement pswd = d.findElement(By.xpath("//*[@id='password']"));
	pswd.sendKeys(password);
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
