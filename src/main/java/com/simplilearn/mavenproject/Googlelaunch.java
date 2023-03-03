package com.simplilearn.mavenproject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Googlelaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan\\Downloads\\Downloaded program files\\BrowserDrivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		try 
		{
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		System.out.println("Tile of page "+driver.getTitle());
		
		String actualTitle=driver.getTitle();
	    String expectedTitle="Selenium";
	    if(actualTitle.equals(expectedTitle))
	    {
	    	System.out.println("Verification successful correct url is opened ");
	    }
	    else
	    {
	    	System.out.print("Verification failed  incorret url");
	    }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			driver.quit();
		}
	     }
		
	     

	}


