package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterswithOptionalExample { 
	@Parameters("Param One")
	@Test
	public void testOptionOne(String firstParam){
       	System.out.println("The first parameter is : " +firstParam);
	}

	@Parameters("Param Two")
	@Test
	public void testOptionTwo(@Optional("OptionalParameter")String secondParam){
       	System.out.println("The second parameter is : " +secondParam);
	}	
}

