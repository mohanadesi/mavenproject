package com.simplilearn.mavenproject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan\\Downloads\\Downloaded program files\\BrowserDrivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();  
	    String appurl="https://adactinhotelapp.com/";
	    driver.get(appurl);
	    //full link text
	    /* driver.findElement(By.linkText("Forgot Password?")).click();;
	    System.out.println(driver.getTitle());  */
	    //partial link text
	    driver.findElement(By.partialLinkText("Forgot")).click();;
	    System.out.println(driver.getTitle());
	    
	}

}