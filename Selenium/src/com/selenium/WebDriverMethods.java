package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gunas\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("guna@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("1234567890");
        WebElement click = driver.findElement(By.name("login"));
        click.click();     
        Thread.sleep(5000);
        driver.close();
	}

}
