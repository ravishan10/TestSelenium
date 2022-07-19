package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class ScrollDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		//js.executeAsyncScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> data = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		
		for(int i=0; i<data.size();i++)
		{
			
			System.out.println(data.get(i).getText());
			
			
			sum = sum + Integer.parseInt(data.get(i).getText());
			
		}
		
		System.out.println("Total=" +sum);
		System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText());
		
		
		driver.findElement(By.cssSelector(".totalAmount")).getText();;
		
		System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText());
		
		driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		
	int total =	Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum,total);
		
		
		
		
	}

}
