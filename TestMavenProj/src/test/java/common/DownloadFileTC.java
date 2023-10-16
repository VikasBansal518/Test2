package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileTC {

	public static void main(String[] args) throws Exception {
		
		String location=System.getProperty("user.dir")+"\\Downloads\\";
		
		HashMap pref=new HashMap();
		pref.put("download.default_directory", location);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", pref);
		
		
		WebDriverManager.chromedriver().setup();
		  WebDriver d= new ChromeDriver(options); 
		  d.manage().window().maximize();
		  d.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/"); 
		  Thread.sleep(10000);
		  d.findElement(By.xpath("//*[@id=\"table-files\"]/tbody/tr[1]/td[5]/a")).click();
		  Thread.sleep(20000);
		d.close();
	

	}

}
