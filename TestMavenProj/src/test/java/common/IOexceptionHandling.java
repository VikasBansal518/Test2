package common;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IOexceptionHandling {

	public static void main(String[] args) throws IOException
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader("Data"));
		    } catch(IOException ie)
		    {
		         ie.printStackTrace();
		    }
	}

      }


