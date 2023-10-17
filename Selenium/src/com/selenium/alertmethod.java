package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertmethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gunas\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement simple = driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[1]"));
		simple.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(2000);
		WebElement confirm = driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[2]"));
		confirm.click();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		Thread.sleep(2000);
		WebElement promt = driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[6]"));
		promt.click();
		Thread.sleep(2000);
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("hi!!!");
		Thread.sleep(5000);
		alert3.accept();
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
