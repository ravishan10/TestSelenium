package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		
	
		
		
		int i= driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		
		System.out.println(i);
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
