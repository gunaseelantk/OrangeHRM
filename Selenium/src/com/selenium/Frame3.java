package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gunas\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
	    driver.manage().window().maximize();
	    
	    //driver.switchTo().frame(0);  // INDEX
	    //driver.switchTo().frame("firstFr");  // ID OR NAME
	    driver.switchTo().frame("firstFr");
	    WebElement fname = driver.findElement(By.name("fname"));
	    fname.sendKeys("guna");
	    
	    WebElement lname = driver.findElement(By.name("lname"));
	    lname.sendKeys("T");
	    
	    //=====================================================================
	    
	    driver.switchTo().frame(1);
	    WebElement email = driver.findElement(By.xpath("/html/body/app-root/app-innerframe/div/div/div/div/div/input"));
	    email.sendKeys("123@mail.com");
	    
	    Thread.sleep(3000);
	    
	    //======================================================================
	    
	    driver.switchTo().parentFrame();
	    
	    WebElement lname2 = driver.findElement(By.name("lname"));
	    lname2.sendKeys("Thiyagarajan");
	    
	    //=====================================================================
	    
	    driver.switchTo().defaultContent();
	    
	    WebElement click = driver.findElement(By.xpath("//a[text()='Watch tutorial']"));
	    click.click();
}
}