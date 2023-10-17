package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafGround {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gunas\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/input.xhtml");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.id("j_idt88:name")).sendKeys("gunaseelan");
	Thread.sleep(2000);
	
	driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(",India");
	Thread.sleep(2000);
	
	WebElement disabled = driver.findElement(By.id("j_idt88:j_idt93"));
	boolean enabled = disabled.isEnabled();
	System.out.println(enabled);
	Thread.sleep(2000);
	
	driver.findElement(By.id("j_idt88:j_idt95")).clear();
	Thread.sleep(2000);
	
	WebElement retrieve = driver.findElement(By.id("j_idt88:j_idt97"));
	String gettext = retrieve.getAttribute("value");
	System.out.println(gettext);
	Thread.sleep(2000);
	
	WebElement tab = driver.findElement(By.id("j_idt88:j_idt99"));
	tab.sendKeys("guna@gmail.com",Keys.TAB);
	Thread.sleep(2000);
	
	WebElement about = driver.findElement(By.id("j_idt88:j_idt101"));
	about.sendKeys("I am guna, I am living in chennai, I am learning software testing in TCF");
	Thread.sleep(2000);
	
	WebElement press_enter = driver.findElement(By.id("j_idt106:thisform:age"));
	press_enter.sendKeys(Keys.ENTER);
	WebElement click = driver.findElement(By.id("j_idt106:float-input"));
	click.click();
	Thread.sleep(5000);
	driver.close();
	
	

}
}
