package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindFrame {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\gunas\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to the web page
		driver.get("https://www.leafground.com/frame.xhtml");
		
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		int size = findElements.size();
		System.out.println("default frames count : "+size);
		
		driver.switchTo().frame(0);
		WebElement iframeElement = driver.findElement(By.id("Click"));
		iframeElement.click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);		
		
		driver.switchTo().frame(0);
		WebElement iframeElement2 = driver.findElement(By.id("Click"));
		iframeElement2.click();
        
		driver.switchTo().parentFrame();
		List<WebElement> findElements2 = driver.findElements(By.tagName("iframe"));
		int size1 = findElements2.size();
		System.out.println("frames2 count : "+size1);


		


	}

	
}