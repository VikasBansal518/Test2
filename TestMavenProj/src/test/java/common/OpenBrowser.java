package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OpenBrowser {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		
		  WebDriver d= new ChromeDriver(); d.manage().window().maximize();
		  d.get("https://www.google.com"); Thread.sleep(10000);
		 
		System.out.println("Browse opened");
		Assert.assertEquals(1, 1);
		Assert.assertTrue(1<2, "1 is not greater than 2");
		Assert.assertFalse(false);
		String actual = d.getTitle();
		System.out.println(actual);
		d.quit();
	

	}

}
