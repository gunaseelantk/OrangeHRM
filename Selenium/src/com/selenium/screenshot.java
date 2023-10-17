package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gunas\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/input.xhtml");
	driver.manage().window().maximize();
	TakesScreenshot t=(TakesScreenshot)driver;
	File screenshotAs = t.getScreenshotAs(OutputType.FILE);
	File screen = new File(".//screen//image1.png");
	FileUtils.copyFile(screenshotAs, screen);
	WebElement t1 = driver.findElement(By.xpath("//h5[@class='first']"));
	File screenshotAs2 = t1.getScreenshotAs(OutputType.FILE);
	File t2=new File(".//screen//image2.png");
	FileUtils.copyFile(screenshotAs2, t2);
	Thread.sleep(3000);
	driver.close();
	
}
}
