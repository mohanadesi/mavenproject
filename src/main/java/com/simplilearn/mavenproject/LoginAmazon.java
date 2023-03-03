package com.simplilearn.mavenproject;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAmazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan\\Downloads\\Downloaded program files\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
    
	driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    driver.findElement(By.cssSelector("#nav-signin-tooltip .nav-action-inner")).click();
    driver.findElement(By.id("ap_email")).sendKeys("mohanadesi@gmail.com");
    
    driver.findElement(By.cssSelector("input#continue")).click();
    driver.findElement(By.id("ap_password")).sendKeys("s@thy@1840");
    driver.findElement(By.id("signInSubmit")).click();

	}

}
