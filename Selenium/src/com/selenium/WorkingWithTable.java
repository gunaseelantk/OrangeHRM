package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gunas\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		int size = alldata.size();
		System.out.println(size);
		for (WebElement all : alldata) {
			String text = all.getText();
			System.out.println("Alldata : " + text);
		}

		List<WebElement> headerdata = driver.findElements(By.xpath("//table/thead/tr/th"));
		int size1 = headerdata.size();
		System.out.println(size1);
		for (WebElement head : headerdata) {
			String text1 = head.getText();
			System.out.println("Header data : " + text1);
		}

		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		int size2 = headerdata.size();
		System.out.println(size2);
		for (WebElement row : rowdata) {
			String text2 = row.getText();
			System.out.println("Row data : " + text2);
		}
		
		List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		int size3 = columndata.size();
		System.out.println(size3);
		for (WebElement column : columndata) {
			String text3 = column.getText();
			System.out.println("Column data : " + text3);
		}
		
		List<WebElement> particulardata = driver.findElements(By.xpath("//table/tbody/tr[1]/td[1]"));
		int size4 = particulardata.size();
		System.out.println(size4);
		for (WebElement pd : particulardata) {
			String text4 = pd.getText();
			System.out.println("Particular data : "+text4);
		}

		Thread.sleep(3000);
		driver.quit();
	}
}
