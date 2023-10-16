package common;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.text.NumberFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsUtils {

	public static void drawBorder(WebElement e, WebDriver d)
	{
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].style.border='3px solid red'", e);	
	}
	
	public static String getTitleByJS(WebDriver d)
	{
		JavascriptExecutor js = (JavascriptExecutor)d;
		String title= js.executeScript("return document.title;").toString();
		return title;	
	}
	
	public static void clickElementByJS(WebElement e, WebDriver d)
	{
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("argumets[0].click();", e);	
	}
	
	public static void generateAlert(String msg, WebDriver d)
	{
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("alert('" + msg + "')");	
	}
	
	public static void refreshBrowserByJS(WebDriver d)
	{
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("history.go(0)");	
	}
	
	public static void zoomPageByJS(WebDriver d)
	{
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("document.body.style.zoom='150%'");
	}
	
	public static void flash(WebDriver d, WebElement e)
	{
		JavascriptExecutor js = (JavascriptExecutor)d;
		String bgcolor=e.getCssValue("backgroundColor");
		for(int i=0;i<10;i++) {
			changeColor("#000000",e,d);
			changeColor(bgcolor,e,d);
		}		
		
	}
	
	public static void changeColor(String color, WebElement e, WebDriver d)
	{
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].style.backgroundColor='" + color + "'",e);
		
		try {
			Thread.sleep(200);
		}catch(Exception ex) {
			
		}
	}

}
