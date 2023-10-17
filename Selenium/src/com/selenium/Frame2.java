package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gunas\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
	    //driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement fname = driver.findElement(By.xpath("//input[@name='fname']"));
		Thread.sleep(1000);
		fname.sendKeys("guna");
		
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		int size = findElements.size();
		System.out.println("default frames count : "+size);
		
		WebElement lname = driver.findElement(By.xpath("//input[@name='lname']"));
		Thread.sleep(1000);
		lname.sendKeys("seelan");
		
		List<WebElement> findElements2 = driver.findElements(By.tagName("iframe"));
		int size1 = findElements2.size();
		System.out.println("frames2 count : "+size1);
		
		driver.switchTo().frame(1);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		Thread.sleep(1000);
		email.sendKeys("guna@mail.com");
		
		driver.switchTo().parentFrame();
		WebElement lname2 = driver.findElement(By.xpath("//input[@name='lname']"));
		Thread.sleep(1000);
		lname2.sendKeys(" T");		
		
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		WebElement log_in = driver.findElement(By.linkText("Log in"));
		log_in.click();
		
		Thread.sleep(1000);
		driver.quit();



	}

}
