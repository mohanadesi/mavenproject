package com.simplilearn.mavenproject;

import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeUnit.SECONDS;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan\\Downloads\\Downloaded program files\\BrowserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//@SuppressWarnings("deprecation")
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[3]/td[3]/input[1]")).sendKeys("Mohana");
		driver.findElement(By.xpath("//input[@id='Register']")).click();
		
		String txt= driver.switchTo().alert().getText();
		System.out.println(txt);
		
		driver.switchTo().alert().accept();
	
		driver.close();

	}

}
