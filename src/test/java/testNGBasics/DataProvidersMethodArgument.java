package testNGBasics;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidersMethodArgument { 

	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		//Initializing Driver
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		//Opening search engine
		driver.get("https://google.com");
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	@Test(dataProvider="destinations")
	public void domesticMonuments(String monument,String city) throws InterruptedException{
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys(monument +" "+city);
		System.out.println("You are trying to search " +monument+ " which is in " +city); 
		WebElement srchBtn = driver.findElement(By.name("btnK"));
		srchBtn.submit();
		Thread.sleep(3000);
		System.out.println("The page title is: " +driver.getTitle());
	}
	@Test(dataProvider="destinations")
	public void intlDestinations(String location) throws InterruptedException{
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys(location);
		System.out.println("You are trying to search : " +location);
		WebElement srchBtn = driver.findElement(By.name("btnK"));
		srchBtn.submit();
		Thread.sleep(3000);
		System.out.println("The page title is: " +driver.getTitle());	 
	}
	@DataProvider(name="destinations")
	public Object[][] getDataProviderData(Method m){
		if(m.getName().equalsIgnoreCase("domesticMonuments")){
			return new Object[][]{
				{ "India Gate", "Delhi" },
				{ "Taj Mahal", "Agra" },
				{ "Char Minar", "Hyderabad" }
			};
		}
		else{
			return new Object[][]{
				{"Paris"},
				{"Cairo"},
				{"Washington"}
			};
		}	 
	}
}
