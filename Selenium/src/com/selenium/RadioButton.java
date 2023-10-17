package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gunas\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		Thread.sleep(2000);

		WebElement selectanyone = driver.findElement(By.id("yes"));
		selectanyone.click();
		
		WebElement confirm1 = driver.findElement(By.id("one"));
		boolean selectedyes = confirm1.isSelected();

		WebElement confirm2 = driver.findElement(By.id("two"));
		confirm2.click();
		boolean selectedno = confirm2.isSelected();
		if(selectedyes!=selectedno) {
		System.out.println("only one is selected");
		}

		WebElement findbug = driver.findElement(By.id("nobug"));
		findbug.click();
		
		WebElement bug = driver.findElement(By.id("bug"));
		bug.click();

		if (findbug.isSelected() == bug.isSelected()) {
			System.out.println("bug in this radio button");
		} else {
			System.out.println("no bug in this radio button");
		}

		WebElement findselected1 = driver.findElement(By.id("foo"));

		if (findselected1.isSelected()) {
			WebElement fsfoo = driver.findElement(By.xpath(
					"/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[4]/div/label[1]"));
			String foo = fsfoo.getText();
			System.out.println(foo);
		}

		WebElement findselected2 = driver.findElement(By.id("notfoo"));

		if (findselected2.isSelected()) {
			WebElement fsbar = driver.findElement(By.xpath(
					"/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[4]/div/label[2]"));
			String bar = fsbar.getText();
			System.out.println(bar);

		}

		WebElement maybe = driver.findElement(By.id("maybe"));
		if (maybe.isEnabled()) {
			System.out.println("is enabled");
		} else {
			System.out.println("is disabled");
		}

		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		if (checkbox.isSelected()) {
			System.out.println("chechbox is selected");
		} else {
			System.out.println("checkbox is not selected");
		}

		WebElement acceptTC = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		acceptTC.click();
		
		Thread.sleep(5000);
		driver.quit();

	}
}