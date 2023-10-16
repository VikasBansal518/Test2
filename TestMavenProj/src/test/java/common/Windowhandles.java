package common;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tutorialspoint.com/index.htm");
        String currentwindow = driver.getWindowHandle();
        
        System.out.println(currentwindow);
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> i = allWindows.iterator();
        while(i.hasNext()){
           String childwindow = i.next();
           if(!childwindow.equalsIgnoreCase(currentwindow)){
              driver.switchTo().window(childwindow);
              System.out.println("The child window is "+childwindow);
           } else {
              System.out.println("There are no children");
           }
        }
        driver.quit();
	

	}

}
