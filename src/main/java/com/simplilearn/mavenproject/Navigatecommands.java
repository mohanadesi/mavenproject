package com.simplilearn.mavenproject;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class Navigatecommands {

	public static void main(String[] args) throws InterruptedException,IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan\\Downloads\\Downloaded program files\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 String appurl="https://www.google.com/";
		 driver.get(appurl);
		 TakesScreenshot scrShot =((TakesScreenshot)driver);
		 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(SrcFile, new File("C:\\Users\\mohan\\Documents\\images\\image.png"));
		 Thread.sleep(2000);
		 appurl="https://www.amazon.com/";
		 driver.get(appurl);
		 driver.navigate().back();
		 Thread.sleep(2000);
		driver.navigate().forward();
		driver.close();
		
	}

}
