package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("identifierId")).sendKeys("ravineelamshankar");
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
		String at = driver.getTitle();
		String et = "gmail";
		
		driver.close();
		
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Sucsessful");
		}
		else{
			System.out.println("Test Failure");
			
			
		}
		
	}

}
