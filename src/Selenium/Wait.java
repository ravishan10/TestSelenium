package Selenium;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://login.yahoo.com/");
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("ravishankar4ever");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		

	}

}
