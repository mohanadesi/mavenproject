package com.simplilearn.mavenproject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LoginAdactin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan\\Downloads\\Downloaded program files\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement login=driver.findElement(By.name("login"));
		username.sendKeys("mohanadesi");
		password.sendKeys("password");
		login.click();
		String actualUrl="https://adactinhotelapp.com/SearchHotel.php";
		String expectedUrl= driver.getCurrentUrl();
		System.out.println(expectedUrl);
		if(actualUrl.equals(expectedUrl))
	    {
	    	System.out.println("Verification successful correct url is opened ");
	    }
	    else
	    {
	    	System.out.print("Verification failed  incorret url");
	    }
		WebElement location=driver.findElement(By.xpath("//select[@id='location']"));
		WebElement hotel=driver.findElement(By.xpath("//select[@id='hotels']"));
		WebElement roomtype=driver.findElement(By.xpath("//select[@id='room_type']"));
		WebElement numberofrooms=driver.findElement(By.xpath("//select[@id='room_nos']"));
		WebElement ci=driver.findElement(By.xpath("//input[@id='datepick_in']"));
		
		WebElement co=driver.findElement(By.xpath("//input[@id='datepick_out']"));
		WebElement Adult=driver.findElement(By.xpath("//select[@id='adult_room']"));
		WebElement Child=driver.findElement(By.xpath("//select[@id='child_room']"));
		WebElement Search=driver.findElement(By.name("Submit"));
		WebElement Checkinmsg=driver.findElement(By.xpath("//span[@id='checkin_span']"));
		WebElement Checkoutmsg=driver.findElement(By.xpath("//span[@id='checkout_span']"));
		location.sendKeys("Sydney");
		hotel.sendKeys("Hotel Creek");
		roomtype.sendKeys("Standard");
		numberofrooms.sendKeys("1 - One");
		ci.clear();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar checkin = Calendar.getInstance();
		checkin.add(Calendar.DATE, 7);
		Calendar checkout = Calendar.getInstance();
		checkout.add(Calendar.DATE, 5);
		String checkin_string = dateFormat.format(checkin.getTime());
		String checkout_string = dateFormat.format(checkout.getTime());
		ci.sendKeys(checkin_string);
		co.clear();
		co.sendKeys(checkout_string);
		
		Adult.sendKeys("2 - Two");
		Child.sendKeys("0 - None");
		Search.click();
		String errmsg1=Checkinmsg.getText();
		System.out.println(errmsg1);
		String errmsg2=Checkoutmsg.getText();
		System.out.println(errmsg2);
		/*
		//setting check in and checkout date
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar checkin = Calendar.getInstance();
		checkin.add(Calendar.DATE, 7);
		Calendar checkout = Calendar.getInstance();
		checkout.add(Calendar.DATE, 5);
		String checkin_string = dateFormat.format(checkin);
		String checkout_string = dateFormat.format(checkout);
	
		//System.out.println(dateFormat.format(checkin.getTime()));
		//System.out.println(dateFormat.format(checkout.getTime()));
		System.out.println("checkin_string");
		System.out.println(checkout_string);
		WebElement ci=driver.findElement(By.xpath("//input[@id='datepick_in']"));
		ci.clear();
		WebElement co=driver.findElement(By.xpath("//input[@id='datepick_out']"));
		co.clear();
		ci.sendKeys("(checkin.getTime())");
		co.sendKeys("(checkout.getTime())");
		
		//Date date = Calendar.getInstance().getTime();
	       
        // specify the format yyyy-mm-dd to print current
        // date to as an argument
        //DateFormat date_format = new SimpleDateFormat("yyyy-mm-dd");
       
        // print date in the specified format
       // String date_string = date_format.format(date);
		
		
		//driver.close()*/
	}

}
