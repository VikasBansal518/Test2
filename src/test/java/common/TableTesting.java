package common;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableTesting {

	@Test
	public static void tableData() throws Exception {
		
		/* Total rows, colms,
		 * retrieve specific cell data
		 * all data
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver(); d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/web-table-element.php"); 
		Thread.sleep(10000);
		
	//    List<WebElement> row=d.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		int rows=d.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println(rows);
		
		int colmns=d.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		System.out.println(colmns);
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=colmns;j++)
			{
				String cellValue=d.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println("The value of the cell is "+cellValue);
			}
		}
			

		d.quit();
	

	}

}
