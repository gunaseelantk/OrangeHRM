package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gunas\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
    System.out.println(currentUrl);
    Thread.sleep(5000);
    driver.navigate().to("https://www.flipkart.com/");
    Thread.sleep(5000);
    driver.navigate().back();
    Thread.sleep(5000);
    driver.navigate().forward();
    Thread.sleep(5000);
    driver.navigate().refresh();
    Thread.sleep(5000);
    driver.close();
    
}
}
