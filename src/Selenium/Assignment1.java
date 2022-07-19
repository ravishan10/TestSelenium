package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Ravi Shankar");
		
		driver.findElement(By.name("email")).sendKeys("ravishan1992@gmail.com");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		driver.findElement(By.id("exampleFormControlSelect1")).click();
	
		WebElement dropdown = driver.findElement(By.cssSelector("#exampleFormControlSelect1"));
		
		Select dropdown1 = new Select(dropdown);
		
		
		dropdown1.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("10/01/1992");
		
		driver.findElement(By.cssSelector(".btn-success")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		

		Thread.sleep(2000);
		
	}

}
