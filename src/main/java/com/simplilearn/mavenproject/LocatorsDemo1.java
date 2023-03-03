package com.simplilearn.mavenproject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		int sliders=driver.findElements(By.className("n2-ss-slide-background")).size();
		System.out.println(sliders);
		
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		
		int arrivals=driver.findElements(By.className("woocommerce")).size();
		System.out.println(arrivals);
		
		driver.findElement(By.className("woocommerce-LoopProduct-link")).click();
//		driver.findElement(By.)
//		driver.findElement(By.linkText("Thinking in HTML")).click();
/*		var elements = driver.findElements(By.className("woocommerce-LoopProduct-link"));
		for (var i = 0; i < elements.size(); i++) {
			elements.get(i).click();
			var url = driver.getCurrentUrl();
			System.out.println(url); */
			
		}
	}


